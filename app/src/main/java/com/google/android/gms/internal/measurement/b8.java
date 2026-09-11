package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b8 extends i1 {
    private static final b8 zzg;
    private static volatile h2 zzh;
    private int zzb;
    private String zze = "";
    private String zzf = "";

    static {
        b8 b8Var = new b8();
        zzg = b8Var;
        i1.p(b8.class, b8Var);
    }

    @Override // com.google.android.gms.internal.measurement.i1
    public final Object t(int i) {
        h2 h1Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new l2(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new b8();
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
        synchronized (b8.class) {
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

    public final String u() {
        return this.zze;
    }

    public final String v() {
        return this.zzf;
    }
}
