package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class za extends i1 {
    private static final za zzl;
    private static volatile h2 zzm;
    private int zzb;
    private String zze = "";
    private t0 zzf = t0.y;
    private String zzg = "";
    private r1 zzh;
    private r1 zzi;
    private boolean zzj;
    private long zzk;

    static {
        za zaVar = new za();
        zzl = zaVar;
        i1.p(za.class, zaVar);
    }

    public za() {
        k2 k2Var = k2.B;
        this.zzh = k2Var;
        this.zzi = k2Var;
    }

    public static ya A() {
        return (ya) zzl.k();
    }

    public final /* synthetic */ void B(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void C(s0 s0Var) {
        s0Var.getClass();
        this.zzb |= 2;
        this.zzf = s0Var;
    }

    public final /* synthetic */ void D(String str) {
        str.getClass();
        this.zzb |= 4;
        this.zzg = str;
    }

    public final void E(bb bbVar) {
        r1 r1Var = this.zzh;
        if (!((n0) r1Var).e) {
            this.zzh = com.google.android.datatransport.runtime.backends.c.q(r1Var);
        }
        this.zzh.add(bbVar);
    }

    public final void F(String str) {
        str.getClass();
        r1 r1Var = this.zzi;
        if (!((n0) r1Var).e) {
            this.zzi = com.google.android.datatransport.runtime.backends.c.q(r1Var);
        }
        this.zzi.add(str);
    }

    public final /* synthetic */ void G(boolean z) {
        this.zzb |= 8;
        this.zzj = z;
    }

    public final /* synthetic */ void H(long j) {
        this.zzb |= 16;
        this.zzk = j;
    }

    @Override // com.google.android.gms.internal.measurement.i1
    public final Object t(int i) {
        h2 h1Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new l2(zzl, "\u0004\u0007\u0000\u0001\u0001\t\u0007\u0000\u0002\u0000\u0001ဈ\u0002\u0002ဈ\u0000\u0003ည\u0001\u0004\u001b\u0005\u001a\bဇ\u0003\tဂ\u0004", new Object[]{"zzb", "zzg", "zze", "zzf", "zzh", bb.class, "zzi", "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new za();
        }
        if (i2 == 4) {
            return new ya(zzl);
        }
        if (i2 == 5) {
            return zzl;
        }
        if (i2 != 6) {
            throw null;
        }
        h2 h2Var = zzm;
        if (h2Var != null) {
            return h2Var;
        }
        synchronized (za.class) {
            try {
                h1Var = zzm;
                if (h1Var == null) {
                    h1Var = new h1(zzl);
                    zzm = h1Var;
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

    public final boolean v() {
        return (this.zzb & 2) != 0;
    }

    public final t0 w() {
        return this.zzf;
    }

    public final String x() {
        return this.zzg;
    }

    public final r1 y() {
        return this.zzh;
    }

    public final long z() {
        return this.zzk;
    }
}
