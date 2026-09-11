package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k4 {
    public final l4 a;
    public int b = 1;
    public long c = a();

    public k4(l4 l4Var) {
        this.a = l4Var;
    }

    public final long a() {
        l4 l4Var = this.a;
        com.google.android.gms.common.internal.x.g(l4Var);
        long jLongValue = ((Long) h0.v.a(null)).longValue();
        long jLongValue2 = ((Long) h0.w.a(null)).longValue();
        for (int i = 1; i < this.b; i++) {
            jLongValue += jLongValue;
            if (jLongValue >= jLongValue2) {
                break;
            }
        }
        l4Var.c().getClass();
        return Math.min(jLongValue, jLongValue2) + System.currentTimeMillis();
    }
}
