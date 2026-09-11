package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class tb extends i1 {
    private static final tb zzg;
    private static volatile h2 zzh;
    private int zzb;
    private pb zze;
    private qb zzf;

    static {
        tb tbVar = new tb();
        zzg = tbVar;
        i1.p(tb.class, tbVar);
    }

    public static tb w(byte[] bArr, a1 a1Var) {
        return (tb) i1.e(zzg, bArr, a1Var);
    }

    public static sb x() {
        return (sb) zzg.k();
    }

    @Override // com.google.android.gms.internal.measurement.i1
    public final Object t(int i) {
        h2 h1Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new l2(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new tb();
        }
        if (i2 == 4) {
            return new sb(zzg);
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
        synchronized (tb.class) {
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

    public final pb u() {
        pb pbVar = this.zze;
        return pbVar == null ? pb.I() : pbVar;
    }

    public final qb v() {
        qb qbVar = this.zzf;
        return qbVar == null ? qb.u() : qbVar;
    }

    public final /* synthetic */ void y(pb pbVar) {
        this.zze = pbVar;
        this.zzb |= 1;
    }
}
