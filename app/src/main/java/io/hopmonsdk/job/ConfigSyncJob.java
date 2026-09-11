package io.hopmonsdk.job;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.PowerManager;
import android.os.SystemClock;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c;
import io.hopmonsdk.Hopmn;
import io.hopmonsdk.HopmnSrv;
import io.hopmonsdk.seed.SeedDiscovery;
import io.hopmonsdk.service.HttpManager;
import io.hopmonsdk.support.ConfigManager;
import io.hopmonsdk.support.NetworkStateReceiver;
import io.hopmonsdk.task.ProxyAsyncTask;
import io.hopmonsdk.util.LogUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class ConfigSyncJob implements Runnable {
    private static final long DELAY_IN_CASE_NO_CONNECTIVITY = 300000;
    public static final String TAG = "ConfigSyncJob";
    private ConfigManager confManager;
    private NetworkStateReceiver connectivityChangedBroadcastReceiver;
    private Context context;
    private String country;
    private List<Throwable> errors;
    private HttpManager httpManager;
    private ProxyAsyncTask proxyTask;
    private String uid;
    private PowerManager.WakeLock wakeLock;
    private final Handler handler = new Handler();
    private final long retryDelay = 2000;
    private final int maxRetries = 10;
    private int requestsCounts = 0;
    private int failedAttempts = 0;
    private boolean scheduled = false;
    private boolean shutdown = false;

    public ConfigSyncJob(Context context, PowerManager.WakeLock wakeLock) {
        try {
            Hopmn hopmn = Hopmn.getInstance(context);
            this.context = context;
            this.wakeLock = wakeLock;
            this.confManager = hopmn.getConfigManager();
            this.httpManager = hopmn.getHttpManager();
            this.errors = new ArrayList(10);
        } catch (Exception e) {
            LogUtils.e(TAG, "create ConfigSyncJob failed! Error = %s ", e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isValidConfigResponse(String str) {
        if (str == null) {
            return false;
        }
        String strTrim = str.trim();
        if (!strTrim.startsWith("config:")) {
            return false;
        }
        String lowerCase = strTrim.toLowerCase();
        if (lowerCase.contains("<html") || lowerCase.contains("404 not found")) {
            return false;
        }
        return strTrim.matches("^config:[^,<>\"]+,\\d{1,5}.*$");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void releaseWakeLockIfHeld() {
        try {
            PowerManager.WakeLock wakeLock = this.wakeLock;
            if (wakeLock == null || !wakeLock.isHeld()) {
                return;
            }
            this.wakeLock.release();
        } catch (Exception unused) {
        }
    }

    private void runWithSeedMode(Hopmn hopmn) {
        String publisher = hopmn.getPublisher() == null ? "syncjobnullpub" : hopmn.getPublisher();
        String str = this.uid;
        if (str == null) {
            str = "syncjobnulluid";
        }
        String strValueOf = String.valueOf(hopmn.isForegroundRunning());
        String str2 = this.country;
        String str3 = (str2 == null || str2.isEmpty()) ? "CC" : this.country;
        StringBuilder sbO = c.o("/?domain=", hopmn.getDomain(), "&uid=", str, "&pub=");
        c.y(sbO, publisher, "&foreground=", strValueOf, "&ver=15.0.10&get=1&cc=");
        sbO.append(str3);
        String string = sbO.toString();
        LogUtils.d(TAG, "Seed-mode config sync, path: %s", string);
        hopmn.getSeedDiscovery().executeGet(string, new SeedDiscovery.StringCallback() { // from class: io.hopmonsdk.job.ConfigSyncJob.1
            @Override // io.hopmonsdk.seed.SeedDiscovery.StringCallback
            public void onFailure(String str4) {
                ConfigSyncJob.this.releaseWakeLockIfHeld();
                LogUtils.e(ConfigSyncJob.TAG, "Seed-mode config sync failed: %s", str4);
                ConfigSyncJob.this.scheduleRetryOrNextCycle("seed network error");
            }

            @Override // io.hopmonsdk.seed.SeedDiscovery.StringCallback
            public void onSuccess(String str4) {
                ConfigSyncJob.this.releaseWakeLockIfHeld();
                String str5 = ConfigSyncJob.TAG;
                LogUtils.i(str5, "Seed-mode config received: %s", str4);
                if (!ConfigSyncJob.this.isValidConfigResponse(str4)) {
                    LogUtils.e(str5, "Seed-mode: invalid config response, skipping write/reload", new Object[0]);
                    ConfigSyncJob.this.scheduleRetryOrNextCycle("invalid config");
                    return;
                }
                ConfigSyncJob.this.failedAttempts = 0;
                File fileWriteToFile = ConfigSyncJob.this.confManager.writeToFile(str4);
                if (ConfigSyncJob.this.proxyTask != null) {
                    LogUtils.d(str5, "Seed-mode: proxy running, reloading config", new Object[0]);
                    HopmnSrv.reload();
                } else {
                    ConfigSyncJob.this.proxyTask = new ProxyAsyncTask();
                    ConfigSyncJob.this.proxyTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, fileWriteToFile.getAbsolutePath());
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void scheduleRetryOrNextCycle(String str) {
        this.failedAttempts++;
        this.handler.removeCallbacks(this);
        int i = this.failedAttempts;
        if (i >= 10) {
            LogUtils.w(TAG, "Retry limit reached after %s. Waiting 5 minutes.", str);
            this.failedAttempts = 0;
            this.handler.postDelayed(this, DELAY_IN_CASE_NO_CONNECTIVITY);
        } else {
            long j = i > 1 ? 2000 * ((long) i) : 2000L;
            LogUtils.w(TAG, "Scheduling retry in %d ms due to %s", Long.valueOf(j), str);
            this.handler.postDelayed(this, j);
        }
    }

    public List<Throwable> getErrors() {
        return this.errors;
    }

    public int getRequestsCounts() {
        return this.requestsCounts;
    }

    public long getUpTime(TimeUnit timeUnit) {
        ProxyAsyncTask proxyAsyncTask = this.proxyTask;
        if (proxyAsyncTask != null) {
            return proxyAsyncTask.getUpTime(timeUnit);
        }
        return 0L;
    }

    public boolean hasErrors() {
        return !this.errors.isEmpty();
    }

    public boolean isRunning() {
        ProxyAsyncTask proxyAsyncTask = this.proxyTask;
        return proxyAsyncTask != null && proxyAsyncTask.isRunning();
    }

    public void reschedule() {
        ProxyAsyncTask proxyAsyncTask = this.proxyTask;
        if (proxyAsyncTask == null || !proxyAsyncTask.isRunning()) {
            schedule(this.uid, this.country);
            return;
        }
        LogUtils.d(TAG, "ReScheduled configuration synchronization job", new Object[0]);
        this.handler.removeCallbacks(this);
        this.handler.post(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z = this.shutdown;
        if (z || !this.scheduled) {
            LogUtils.d(TAG, "ConfigSyncJob run ignored. shutdown=%s scheduled=%s", String.valueOf(z), String.valueOf(this.scheduled));
            return;
        }
        try {
            Hopmn hopmn = Hopmn.getInstance(this.context);
            long delayMillis = hopmn.getDelayMillis() - (SystemClock.elapsedRealtime() % 1000);
            this.handler.postDelayed(this, delayMillis);
            this.requestsCounts++;
            this.wakeLock.acquire(delayMillis);
            runWithSeedMode(hopmn);
        } catch (Exception e) {
            LogUtils.e(TAG, "run ConfigSyncJob failed! Error = %s ", e.getMessage());
        }
    }

    public void schedule(String str, String str2) {
        this.uid = str;
        this.country = str2;
        if (this.shutdown) {
            LogUtils.w(TAG, "ConfigSyncJob is shutdown - ignoring schedule", new Object[0]);
            return;
        }
        if (this.scheduled) {
            LogUtils.d(TAG, "ConfigSyncJob already scheduled - skipping duplicate schedule", new Object[0]);
            return;
        }
        this.scheduled = true;
        this.handler.removeCallbacks(this);
        this.handler.post(this);
        LogUtils.d(TAG, "Scheduled configuration synchronization job", new Object[0]);
    }

    public void shutdown() {
        LogUtils.d(TAG, "Shutdown configuration synchronization job", new Object[0]);
        this.shutdown = true;
        this.scheduled = false;
        this.handler.removeCallbacks(this);
        NetworkStateReceiver networkStateReceiver = this.connectivityChangedBroadcastReceiver;
        if (networkStateReceiver != null) {
            try {
                this.context.unregisterReceiver(networkStateReceiver);
            } catch (Exception unused) {
            }
            this.connectivityChangedBroadcastReceiver = null;
        }
        PowerManager.WakeLock wakeLock = this.wakeLock;
        if (wakeLock != null && wakeLock.isHeld()) {
            this.wakeLock.release();
        }
        if (this.proxyTask != null) {
            HopmnSrv.stop();
            this.proxyTask.cancel(true);
            this.proxyTask = null;
        }
    }
}
