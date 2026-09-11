package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class l7 extends i1 {
    private static final l7 zzj;
    private static volatile h2 zzk;
    private int zzb;
    private int zze;
    private boolean zzf;
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";

    static {
        l7 l7Var = new l7();
        zzj = l7Var;
        i1.p(l7.class, l7Var);
    }

    public static l7 D() {
        return zzj;
    }

    public final String A() {
        return this.zzh;
    }

    public final boolean B() {
        return (this.zzb & 16) != 0;
    }

    public final String C() {
        return this.zzi;
    }

    public final int E() {
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
            return new l2(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"zzb", "zze", j0.c, "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new l7();
        }
        if (i2 == 4) {
            return new k7(zzj);
        }
        if (i2 == 5) {
            return zzj;
        }
        if (i2 != 6) {
            throw null;
        }
        h2 h2Var = zzk;
        if (h2Var != null) {
            return h2Var;
        }
        synchronized (l7.class) {
            try {
                h1Var = zzk;
                if (h1Var == null) {
                    h1Var = new h1(zzj);
                    zzk = h1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return h1Var;
    }

    public final boolean u() {
        return (this.zzb & 1) != 0;
    }

    public final boolean v() {
        return (this.zzb & 2) != 0;
    }

    public final boolean w() {
        return this.zzf;
    }

    public final boolean x() {
        return (this.zzb & 4) != 0;
    }

    public final String y() {
        return this.zzg;
    }

    public final boolean z() {
        return (this.zzb & 8) != 0;
    }
}
