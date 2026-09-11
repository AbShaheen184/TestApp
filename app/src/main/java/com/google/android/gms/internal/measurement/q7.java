package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class q7 extends i1 {
    private static final q7 zzg;
    private static volatile h2 zzh;
    private int zzb;
    private int zze;
    private int zzf;

    static {
        q7 q7Var = new q7();
        zzg = q7Var;
        i1.p(q7.class, q7Var);
    }

    @Override // com.google.android.gms.internal.measurement.i1
    public final Object t(int i) {
        h2 h1Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            j0 j0Var = j0.f;
            return new l2(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzb", "zze", j0Var, "zzf", j0Var});
        }
        if (i2 == 3) {
            return new q7();
        }
        if (i2 == 4) {
            return new k7(zzg);
        }
        if (i2 == 5) {
            return zzg;
        }
        if (i2 != 6) {
            throw null;
        }
        h2 h2Var = zzh;
        if (h2Var != null) {
            return h2Var;
        }
        synchronized (q7.class) {
            try {
                h1Var = zzh;
                if (h1Var == null) {
                    h1Var = new h1(zzg);
                    zzh = h1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return h1Var;
    }

    public final int u() {
        int iA = e1.a(this.zze);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }

    public final int v() {
        int iA = e1.a(this.zzf);
        if (iA == 0) {
            return 1;
        }
        return iA;
    }
}
