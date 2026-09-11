package io.hopmonsdk.support;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import io.hopmonsdk.job.ConfigSyncJob;
import io.hopmonsdk.util.LogUtils;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class NetworkStateReceiver extends BroadcastReceiver {
    public static final String TAG = "NetworkStateReceiver";
    ConfigSyncJob subscriber = null;

    public static IntentFilter getIntentFilter() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        return intentFilter;
    }

    public boolean isNetworkAvailable(Context context) {
        if (context == null) {
            return false;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (connectivityManager != null) {
            if (Build.VERSION.SDK_INT >= 29) {
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                if (networkCapabilities != null && (networkCapabilities.hasTransport(0) || networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(3))) {
                    return true;
                }
            } else {
                try {
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                        return true;
                    }
                } catch (Exception e) {
                    LogUtils.i(TAG, "" + e.getMessage(), new Object[0]);
                }
            }
        }
        LogUtils.i(TAG, "Network is available : FALSE ", new Object[0]);
        return false;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        if (action != null && action.equals("android.net.conn.CONNECTIVITY_CHANGE") && isNetworkAvailable(context)) {
            LogUtils.w(TAG, "reconnect to network", new Object[0]);
            ConfigSyncJob configSyncJob = this.subscriber;
            if (configSyncJob != null) {
                configSyncJob.reschedule();
            }
        }
    }

    public void setSubscriber(ConfigSyncJob configSyncJob) {
        this.subscriber = configSyncJob;
    }
}
