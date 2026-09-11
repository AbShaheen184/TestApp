package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class nb extends i1 {
    private static final nb zzf;
    private static volatile h2 zzg;
    private int zzb;
    private boolean zze;

    static {
        nb nbVar = new nb();
        zzf = nbVar;
        i1.p(nb.class, nbVar);
    }

    public static nb v() {
        return zzf;
    }

    @Override // com.google.android.gms.internal.measurement.i1
    public final Object t(int i) {
        h2 h1Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new l2(zzf, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"zzb", "zze"});
        }
        if (i2 == 3) {
            return new nb();
        }
        if (i2 == 4) {
            return new k7(zzf);
        }
        if (i2 == 5) {
            return zzf;
        }
        if (i2 != 6) {
            throw null;
        }
        h2 h2Var = zzg;
        if (h2Var != null) {
            return h2Var;
        }
        synchronized (nb.class) {
            try {
                h1Var = zzg;
                if (h1Var == null) {
                    h1Var = new h1(zzf);
                    zzg = h1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return h1Var;
    }

    public final boolean u() {
        return this.zze;
    }
}
