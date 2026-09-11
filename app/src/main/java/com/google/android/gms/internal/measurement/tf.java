package com.google.android.gms.internal.measurement;

import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class tf {
    public static final com.google.android.material.resources.g a;

    static {
        sf sfVar;
        try {
            SystemClock.elapsedRealtimeNanos();
            sfVar = new sf(0);
        } catch (Throwable unused) {
            SystemClock.elapsedRealtime();
            sfVar = new sf(1);
        }
        a = sfVar;
    }
}
