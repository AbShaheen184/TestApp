package com.google.android.gms.measurement.internal;

import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class j4 {
    public final String a;
    public final long b;

    public j4(l4 l4Var, String str) {
        this.a = str;
        l4Var.c().getClass();
        this.b = SystemClock.elapsedRealtime();
    }
}
