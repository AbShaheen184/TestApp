package io.hopmonsdk.task;

import android.os.AsyncTask;
import io.hopmonsdk.HopmnSrv;
import io.hopmonsdk.util.LogUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class ProxyAsyncTask extends AsyncTask<String, Void, Long> {
    private static final String TAG = "ProxyAsyncTask";
    private volatile long activityTimei;
    private volatile boolean running;
    private volatile long startTime;

    @Override // android.os.AsyncTask
    public Long doInBackground(String... strArr) {
        this.activityTimei = 0L;
        this.startTime = System.currentTimeMillis();
        this.running = true;
        ArrayList arrayList = new ArrayList(strArr.length);
        arrayList.addAll(Arrays.asList(strArr));
        LogUtils.i(TAG, "Starting hopmnserver server %s", arrayList);
        try {
            HopmnSrv.start((String[]) arrayList.toArray(new String[0]));
            this.running = false;
            LogUtils.i(TAG, "Released hopmn thread", new Object[0]);
            this.activityTimei = System.currentTimeMillis() - this.startTime;
            return Long.valueOf(this.activityTimei);
        } catch (Throwable th) {
            this.running = false;
            throw th;
        }
    }

    public long getUpTime(TimeUnit timeUnit) {
        if (!this.running) {
            return 0L;
        }
        return TimeUnit.MILLISECONDS.convert(System.currentTimeMillis() - this.startTime, timeUnit);
    }

    public boolean isRunning() {
        return this.running;
    }

    @Override // android.os.AsyncTask
    public void onPostExecute(Long l) {
        LogUtils.i(TAG, "Executed hopmn async task for %ss", Double.valueOf(l.longValue() / 1000.0d));
    }

    public long getUpTime() {
        return getUpTime(TimeUnit.MILLISECONDS);
    }
}
