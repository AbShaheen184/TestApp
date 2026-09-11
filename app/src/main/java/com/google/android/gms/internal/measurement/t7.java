package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class t7 extends i1 {
    private static final t7 zzh;
    private static volatile h2 zzi;
    private int zzb;
    private String zze = "";
    private r1 zzf = k2.B;
    private boolean zzg;

    static {
        t7 t7Var = new t7();
        zzh = t7Var;
        i1.p(t7.class, t7Var);
    }

    @Override // com.google.android.gms.internal.measurement.i1
    public final Object t(int i) {
        h2 h1Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new l2(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"zzb", "zze", "zzf", a8.class, "zzg"});
        }
        if (i2 == 3) {
            return new t7();
        }
        if (i2 == 4) {
            return new k7(zzh);
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
        synchronized (t7.class) {
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

    public final String u() {
        return this.zze;
    }
}
