package io.hopmonsdk.service;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Binder;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.PowerManager;
import androidx.core.app.d;
import androidx.core.app.h;
import com.app.mlounge.R;
import io.hopmonsdk.Hopmn;
import io.hopmonsdk.data.DataStore;
import io.hopmonsdk.event.NetworkStateChanged;
import io.hopmonsdk.job.ConfigSyncJob;
import io.hopmonsdk.seed.SeedDiscovery;
import io.hopmonsdk.util.LogUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class MoneytiserService extends Service {
    public static final String CHANNEL_ID = "ForegroundServiceChannel";
    private static final int MAX_REGISTER_RETRIES = 20;
    private static final long RETRY_DELAY_MS = 3000;
    private static final String TAG = "MoneytiserService";
    private ConfigSyncJob configSyncJob;
    private HttpManager httpManager;
    private final IBinder binder = new ProxyServiceBinder();
    private final Handler retryHandler = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: io.hopmonsdk.service.MoneytiserService$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    public class AnonymousClass1 implements SeedDiscovery.StringCallback {
        final /* synthetic */ Hopmn val$acp;
        final /* synthetic */ int val$attempt;
        final /* synthetic */ String val$usr;

        public AnonymousClass1(String str, Hopmn hopmn, int i) {
            this.val$usr = str;
            this.val$acp = hopmn;
            this.val$attempt = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onFailure$0(String str, int i) {
            MoneytiserService.this.registerWithSeedMode(str, i + 1);
        }

        @Override // io.hopmonsdk.seed.SeedDiscovery.StringCallback
        public void onFailure(String str) {
            LogUtils.e(MoneytiserService.TAG, "Seed-mode registration failed on attempt %d: %s", Integer.valueOf(this.val$attempt + 1), str);
            int i = this.val$attempt;
            if (i >= 20) {
                LogUtils.e(MoneytiserService.TAG, "Seed-mode registration failed after max retries", new Object[0]);
                return;
            }
            long j = ((long) (i + 1)) * MoneytiserService.RETRY_DELAY_MS;
            Handler handler = MoneytiserService.this.retryHandler;
            final String str2 = this.val$usr;
            final int i2 = this.val$attempt;
            handler.postDelayed(new Runnable() { // from class: io.hopmonsdk.service.a
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.lambda$onFailure$0(str2, i2);
                }
            }, j);
        }

        @Override // io.hopmonsdk.seed.SeedDiscovery.StringCallback
        public void onSuccess(String str) {
            LogUtils.d(MoneytiserService.TAG, "Seed-mode device %s registered, response: %s", this.val$usr, str);
            if (str != null && str.matches("[a-zA-Z]*")) {
                this.val$acp.getDataStore().set(MoneytiserService.this.getString(R.string.hopmon_country_key), str);
                this.val$acp.setCountry(str);
            }
            this.val$acp.getDataStore().set(MoneytiserService.this.getString(R.string.hopmon_uid_key), this.val$usr);
            this.val$acp.setUid(this.val$usr);
            this.val$acp.getDataStore().set("hopmon.registered_at", System.currentTimeMillis());
            this.val$acp.getDataStore().set("hopmon.registered_version", "15.0.10");
            MoneytiserService.this.configSyncJob.schedule(this.val$usr, str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    public class ProxyServiceBinder extends Binder {
        public ProxyServiceBinder() {
        }

        public MoneytiserService getService() {
            return MoneytiserService.this;
        }
    }

    private String ensureChannel(String str, String str2) {
        NotificationManager notificationManager = (NotificationManager) getSystemService(NotificationManager.class);
        if (notificationManager.getNotificationChannel(str) == null) {
            NotificationChannel notificationChannel = new NotificationChannel(str, str2, 2);
            notificationChannel.setShowBadge(false);
            notificationChannel.enableLights(false);
            notificationChannel.enableVibration(false);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        return str;
    }

    private void register() {
        registerWithSeedMode(UUID.randomUUID().toString(), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void registerWithSeedMode(String str, int i) {
        try {
            Hopmn hopmn = Hopmn.getInstance(this);
            String publisher = hopmn.getPublisher();
            String category = hopmn.getCategory();
            String str2 = "/?domain=" + hopmn.getDomain() + "&uid=" + str + "&pub=" + publisher + "&foreground=" + String.valueOf(hopmn.isForegroundRunning()) + "&ver=15.0.10&regcc=1&cid=" + category;
            LogUtils.d(TAG, "Seed-mode registration attempt %d/%d, path: %s", Integer.valueOf(i + 1), 21, str2);
            hopmn.getSeedDiscovery().executePost(str2, new AnonymousClass1(str, hopmn, i));
        } catch (Exception e) {
            LogUtils.e(TAG, "registerWithSeedMode exception: ", e, new Object[0]);
        }
    }

    private int resolveSmallIcon(DataStore dataStore, int i) {
        int identifier;
        String str = dataStore.get("ICON_NAME", null);
        if (str != null && (identifier = getResources().getIdentifier(str, "drawable", getPackageName())) != 0) {
            return identifier;
        }
        int i2 = dataStore.getInt("ICON", i);
        try {
            getResources().getResourceName(i2);
            return i2;
        } catch (Resources.NotFoundException unused) {
            return i;
        }
    }

    private void showNotification() {
        DataStore dataStore = DataStore.getInstance(this);
        String str = dataStore.get("APPNAME", "Hopmn");
        String str2 = dataStore.get("MESSAGE", "Background service is running");
        String strEnsureChannel = ensureChannel("hopmn_service_chan", str);
        int iResolveSmallIcon = resolveSmallIcon(dataStore, R.drawable.ic_android_notify);
        PendingIntent service = PendingIntent.getService(this, 0, new Intent(this, (Class<?>) MoneytiserService.class).setAction("ACTION_NOTIFY_CLICKED"), 335544320);
        h hVar = new h(this, strEnsureChannel);
        hVar.e = h.b(str);
        hVar.f = h.b(str2);
        hVar.s.icon = iResolveSmallIcon;
        hVar.g = service;
        hVar.c(2, true);
        hVar.j = -1;
        hVar.b.add(new d(android.R.drawable.ic_menu_close_clear_cancel, service, "Close"));
        Notification notificationA = hVar.a();
        LogUtils.d(TAG, "foreground Service - REGULAR FOREGROUND", new Object[0]);
        if (Build.VERSION.SDK_INT >= 29) {
            startForeground(1, notificationA, 1);
        } else {
            startForeground(1, notificationA);
        }
    }

    public List<Throwable> getErrors() {
        ConfigSyncJob configSyncJob = this.configSyncJob;
        return configSyncJob != null ? configSyncJob.getErrors() : new ArrayList();
    }

    public long getProxyUpTime(TimeUnit timeUnit) {
        ConfigSyncJob configSyncJob = this.configSyncJob;
        if (configSyncJob != null) {
            return configSyncJob.getUpTime(timeUnit);
        }
        return 0L;
    }

    public int getRequestsCounts() {
        ConfigSyncJob configSyncJob = this.configSyncJob;
        if (configSyncJob != null) {
            return configSyncJob.getRequestsCounts();
        }
        return 1;
    }

    public boolean isRunning() {
        ConfigSyncJob configSyncJob = this.configSyncJob;
        return configSyncJob != null && configSyncJob.isRunning();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.binder;
    }

    @Override // android.app.Service
    public void onCreate() {
        PowerManager powerManager = (PowerManager) getSystemService("power");
        try {
            Hopmn hopmn = Hopmn.getInstance(this);
            if (hopmn != null) {
                this.httpManager = hopmn.getHttpManager();
                String str = TAG;
                this.configSyncJob = new ConfigSyncJob(this, powerManager.newWakeLock(1, str));
                LogUtils.d(str, "Service was created", new Object[0]);
            }
        } catch (Exception e) {
            LogUtils.e(TAG, "Failed to getInstance on MoneytiserService onCreate: ", e, new Object[0]);
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        HttpManager httpManager = this.httpManager;
        if (httpManager != null) {
            httpManager.stop();
        }
        ConfigSyncJob configSyncJob = this.configSyncJob;
        if (configSyncJob != null) {
            configSyncJob.shutdown();
        }
        LogUtils.w(TAG, "Service was stopped", new Object[0]);
    }

    @Override // android.app.Service, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        LogUtils.d(TAG, "Detected low memory", new Object[0]);
    }

    public void onNetworkStateChanged(NetworkStateChanged networkStateChanged) {
        if (networkStateChanged.isInternetConnected()) {
            return;
        }
        LogUtils.d(TAG, "Connected to network!", new Object[0]);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        long j;
        String str = TAG;
        LogUtils.d(str, "onStartCommand called", new Object[0]);
        super.onStartCommand(intent, i, i2);
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                LogUtils.d(str, "foreground Service - create notification", new Object[0]);
                showNotification();
            }
            Hopmn hopmn = Hopmn.getInstance(this);
            if (hopmn == null) {
                LogUtils.e(str, "Hopmn instance is null, cannot start service logic", new Object[0]);
                return 1;
            }
            if (this.configSyncJob == null) {
                this.configSyncJob = new ConfigSyncJob(this, ((PowerManager) getSystemService("power")).newWakeLock(1, str));
            }
            DataStore dataStore = hopmn.getDataStore();
            String str2 = dataStore.get(getString(R.string.hopmon_uid_key));
            String str3 = dataStore.get(getString(R.string.hopmon_country_key));
            try {
                j = getPackageManager().getPackageInfo(getPackageName(), 0).firstInstallTime;
            } catch (Exception unused) {
                j = 0;
            }
            long j2 = dataStore.getLong("hopmon.registered_at", 0L);
            String str4 = dataStore.get("hopmon.registered_version");
            boolean z = j > j2;
            boolean zEquals = "15.0.10".equals(str4);
            boolean z2 = !zEquals;
            if (str2 == null || str3 == null || z || !zEquals) {
                LogUtils.d(TAG, "Registering device — uid=%s freshInstall=%s versionChanged=%s", str2, Boolean.valueOf(z), Boolean.valueOf(z2));
                register();
            } else {
                LogUtils.d(TAG, "Device already registered, uid=%s cc=%s", str2, str3);
                this.configSyncJob.schedule(str2, str3);
            }
            return 1;
        } catch (Exception e) {
            LogUtils.e(TAG, "OnStartCommand failed! Error = %s ", e.getMessage());
        }
    }

    @Override // android.app.Service
    public void onTaskRemoved(Intent intent) {
        super.onTaskRemoved(intent);
        LogUtils.d(TAG, "Task removed", new Object[0]);
    }
}
