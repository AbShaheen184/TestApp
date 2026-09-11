package com.google.android.gms.measurement;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.SparseArray;
import com.google.android.gms.measurement.internal.s1;
import com.google.android.gms.measurement.internal.x0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class AppMeasurementReceiver extends androidx.legacy.content.a {
    public androidx.media3.exoplayer.hls.c c;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.c == null) {
            this.c = new androidx.media3.exoplayer.hls.c(this);
        }
        androidx.media3.exoplayer.hls.c cVar = this.c;
        cVar.getClass();
        x0 x0Var = s1.s(context, null, null, null).C;
        s1.m(x0Var);
        if (intent == null) {
            x0Var.F.a("Receiver called with null intent");
            return;
        }
        String action = intent.getAction();
        x0Var.K.b(action, "Local receiver got");
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
                x0Var.F.a("Install Referrer Broadcasts are deprecated");
                return;
            }
            return;
        }
        Intent className = new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
        className.setAction("com.google.android.gms.measurement.UPLOAD");
        x0Var.K.a("Starting wakeful intent.");
        ((AppMeasurementReceiver) cVar.e).getClass();
        SparseArray sparseArray = androidx.legacy.content.a.a;
        synchronized (sparseArray) {
            try {
                int i = androidx.legacy.content.a.b;
                int i2 = i + 1;
                androidx.legacy.content.a.b = i2;
                if (i2 <= 0) {
                    androidx.legacy.content.a.b = 1;
                }
                className.putExtra("androidx.contentpager.content.wakelockid", i);
                ComponentName componentNameStartService = context.startService(className);
                if (componentNameStartService == null) {
                    return;
                }
                PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "androidx.core:wake:" + componentNameStartService.flattenToShortString());
                wakeLockNewWakeLock.setReferenceCounted(false);
                wakeLockNewWakeLock.acquire(60000L);
                sparseArray.put(i, wakeLockNewWakeLock);
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
