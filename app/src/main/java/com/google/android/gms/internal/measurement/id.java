package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class id extends i1 {
    private static final id zzj;
    private static volatile h2 zzk;
    private int zzb;
    private long zzh;
    private String zze = "";
    private t0 zzf = t0.y;
    private String zzg = "";
    private r1 zzi = k2.B;

    static {
        id idVar = new id();
        zzj = idVar;
        i1.p(id.class, idVar);
    }

    public static hd A() {
        return (hd) zzj.k();
    }

    public static id B() {
        return zzj;
    }

    public final /* synthetic */ void C(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void D(t0 t0Var) {
        t0Var.getClass();
        this.zzb |= 2;
        this.zzf = t0Var;
    }

    public final /* synthetic */ void E(String str) {
        str.getClass();
        this.zzb |= 4;
        this.zzg = str;
    }

    public final /* synthetic */ void F(long j) {
        this.zzb |= 8;
        this.zzh = j;
    }

    public final void G(kd kdVar) {
        r1 r1Var = this.zzi;
        if (!((n0) r1Var).e) {
            this.zzi = com.google.android.datatransport.runtime.backends.c.q(r1Var);
        }
        this.zzi.add(kdVar);
    }

    @Override // com.google.android.gms.internal.measurement.i1
    public final Object t(int i) {
        h2 h1Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new l2(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005\u001b", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", kd.class});
        }
        if (i2 == 3) {
            return new id();
        }
        if (i2 == 4) {
            return new hd(zzj);
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
        synchronized (id.class) {
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

    public final String u() {
        return this.zze;
    }

    public final t0 v() {
        return this.zzf;
    }

    public final String w() {
        return this.zzg;
    }

    public final long x() {
        return this.zzh;
    }

    public final r1 y() {
        return this.zzi;
    }

    public final int z() {
        return this.zzi.size();
    }
}
