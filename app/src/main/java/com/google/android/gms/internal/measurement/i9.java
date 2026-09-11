package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class i9 extends i1 {
    private static final i9 zzh;
    private static volatile h2 zzi;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;

    static {
        i9 i9Var = new i9();
        zzh = i9Var;
        i1.p(i9.class, i9Var);
    }

    public static h9 v() {
        return (h9) zzh.k();
    }

    public static i9 w() {
        return zzh;
    }

    public final /* synthetic */ void A(int i) {
        this.zze = i - 1;
        this.zzb |= 1;
    }

    public final /* synthetic */ void B(int i) {
        this.zzg = i - 1;
        this.zzb |= 4;
    }

    @Override // com.google.android.gms.internal.measurement.i1
    public final Object t(int i) {
        h2 h1Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new l2(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzb", "zze", j0.o, "zzf", j0.m, "zzg", j0.n});
        }
        if (i2 == 3) {
            return new i9();
        }
        if (i2 == 4) {
            return new h9(zzh);
        }
        if (i2 == 5) {
            return zzh;
        }
        if (i2 != 6) {
            throw null;
        }
        h2 h2Var = zzi;
        if (h2Var != null) {
            return h2Var;
        }
        synchronized (i9.class) {
            try {
                h1Var = zzi;
                if (h1Var == null) {
                    h1Var = new h1(zzh);
                    zzi = h1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return h1Var;
    }

    public final int u() {
        int i = com.google.android.datatransport.runtime.backends.c.i(this.zzf);
        if (i == 0) {
            return 1;
        }
        return i;
    }

    public final void x(int i) {
        this.zzf = com.google.android.datatransport.runtime.backends.c.l(i);
        this.zzb |= 2;
    }

    public final int y() {
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

    /* JADX WARN: Code duplicated, block: B:15:0x0017 A[PHI: r3
  0x0017: PHI (r3v1 int) = (r3v0 int), (r3v2 int) binds: [B:7:0x0009, B:11:0x000f] A[DONT_GENERATE, DONT_INLINE]] */
    public final int z() {
        int i;
        int i2 = this.zzg;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                int i3 = 3;
                if (i2 != 2) {
                    i = 4;
                    if (i2 != 3) {
                        i3 = 5;
                        if (i2 != 4) {
                            i = i2 != 5 ? 0 : 6;
                        } else {
                            i = i3;
                        }
                    }
                } else {
                    i = i3;
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
}
