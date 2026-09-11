package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class o9 extends i1 {
    private static final o9 zzk;
    private static volatile h2 zzl;
    private int zzb;
    private int zze;
    private r1 zzf = k2.B;
    private String zzg = "";
    private String zzh = "";
    private boolean zzi;
    private double zzj;

    static {
        o9 o9Var = new o9();
        zzk = o9Var;
        i1.p(o9.class, o9Var);
    }

    public final boolean A() {
        return (this.zzb & 16) != 0;
    }

    public final double B() {
        return this.zzj;
    }

    public final int C() {
        int i;
        int i2 = this.zze;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                if (i2 != 2) {
                    i = 4;
                    if (i2 != 3) {
                        i = i2 != 4 ? 0 : 5;
                    }
                } else {
                    i = 3;
                }
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    @Override // com.google.android.gms.internal.measurement.i1
    public final Object t(int i) {
        h2 h1Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new l2(zzk, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဇ\u0003\u0006က\u0004", new Object[]{"zzb", "zze", j0.p, "zzf", o9.class, "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new o9();
        }
        if (i2 == 4) {
            return new k7(zzk);
        }
        if (i2 == 5) {
            return zzk;
        }
        if (i2 != 6) {
            throw null;
        }
        h2 h2Var = zzl;
        if (h2Var != null) {
            return h2Var;
        }
        synchronized (o9.class) {
            try {
                h1Var = zzl;
                if (h1Var == null) {
                    h1Var = new h1(zzk);
                    zzl = h1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return h1Var;
    }

    public final List u() {
        return this.zzf;
    }

    public final String v() {
        return this.zzg;
    }

    public final boolean w() {
        return (this.zzb & 4) != 0;
    }

    public final String x() {
        return this.zzh;
    }

    public final boolean y() {
        return (this.zzb & 8) != 0;
    }

    public final boolean z() {
        return this.zzi;
    }
}
