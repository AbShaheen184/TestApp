package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class qb extends i1 {
    private static final qb zzo;
    private static volatile h2 zzp;
    private int zzb;
    private boolean zzf;
    private r1 zzh;
    private r1 zzi;
    private m1 zzj;
    private rb zzk;
    private boolean zzl;
    private boolean zzm;
    private nb zzn;
    private t0 zze = t0.y;
    private String zzg = "";

    static {
        qb qbVar = new qb();
        zzo = qbVar;
        i1.p(qb.class, qbVar);
    }

    public qb() {
        k2 k2Var = k2.B;
        this.zzh = k2Var;
        this.zzi = k2Var;
        this.zzj = j1.B;
    }

    public static qb u() {
        return zzo;
    }

    @Override // com.google.android.gms.internal.measurement.i1
    public final Object t(int i) {
        h2 h1Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new l2(zzo, "\u0004\n\u0000\u0001\u0001\f\n\u0000\u0003\u0000\u0001ည\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004\u001a\u0005\u001a\u0007ࠬ\bဉ\u0003\nဇ\u0004\u000bဇ\u0005\fဉ\u0006", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", j0.b, "zzk", "zzl", "zzm", "zzn"});
        }
        if (i2 == 3) {
            return new qb();
        }
        if (i2 == 4) {
            return new k7(zzo);
        }
        if (i2 == 5) {
            return zzo;
        }
        if (i2 != 6) {
            throw null;
        }
        h2 h2Var = zzp;
        if (h2Var != null) {
            return h2Var;
        }
        synchronized (qb.class) {
            try {
                h1Var = zzp;
                if (h1Var == null) {
                    h1Var = new h1(zzo);
                    zzp = h1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return h1Var;
    }
}
