package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class r8 extends i1 {
    private static final r8 zzg;
    private static volatile h2 zzh;
    private int zzb;
    private int zze;
    private long zzf;

    static {
        r8 r8Var = new r8();
        zzg = r8Var;
        i1.p(r8.class, r8Var);
    }

    public static q8 y() {
        return (q8) zzg.k();
    }

    public final /* synthetic */ void A(long j) {
        this.zzb |= 2;
        this.zzf = j;
    }

    @Override // com.google.android.gms.internal.measurement.i1
    public final Object t(int i) {
        h2 h1Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new l2(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဂ\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new r8();
        }
        if (i2 == 4) {
            return new q8(zzg);
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
        synchronized (r8.class) {
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

    public final boolean u() {
        return (this.zzb & 1) != 0;
    }

    public final int v() {
        return this.zze;
    }

    public final boolean w() {
        return (this.zzb & 2) != 0;
    }

    public final long x() {
        return this.zzf;
    }

    public final /* synthetic */ void z(int i) {
        this.zzb |= 1;
        this.zze = i;
    }
}
