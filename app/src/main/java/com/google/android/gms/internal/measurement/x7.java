package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class x7 extends i1 {
    private static final x7 zzw;
    private static volatile h2 zzx;
    private int zzb;
    private long zze;
    private String zzf = "";
    private int zzg;
    private r1 zzh;
    private r1 zzi;
    private r1 zzj;
    private String zzk;
    private boolean zzl;
    private r1 zzm;
    private r1 zzn;
    private String zzo;
    private String zzp;
    private s7 zzq;
    private z7 zzr;
    private c8 zzs;
    private a8 zzt;
    private y7 zzu;
    private m1 zzv;

    static {
        x7 x7Var = new x7();
        zzw = x7Var;
        i1.p(x7.class, x7Var);
    }

    public x7() {
        k2 k2Var = k2.B;
        this.zzh = k2Var;
        this.zzi = k2Var;
        this.zzj = k2Var;
        this.zzk = "";
        this.zzm = k2Var;
        this.zzn = k2Var;
        this.zzo = "";
        this.zzp = "";
        this.zzv = j1.B;
    }

    public static w7 L() {
        return (w7) zzw.k();
    }

    public static x7 M() {
        return zzw;
    }

    public final v7 A(int i) {
        return (v7) this.zzi.get(i);
    }

    public final List B() {
        return this.zzj;
    }

    public final r1 C() {
        return this.zzm;
    }

    public final int D() {
        return this.zzm.size();
    }

    public final r1 E() {
        return this.zzn;
    }

    public final String F() {
        return this.zzo;
    }

    public final boolean G() {
        return (this.zzb & 128) != 0;
    }

    public final s7 H() {
        s7 s7Var = this.zzq;
        return s7Var == null ? s7.A() : s7Var;
    }

    public final boolean I() {
        return (this.zzb & 512) != 0;
    }

    public final c8 J() {
        c8 c8Var = this.zzs;
        return c8Var == null ? c8.w() : c8Var;
    }

    public final m1 K() {
        return this.zzv;
    }

    public final void N(int i, v7 v7Var) {
        r1 r1Var = this.zzi;
        if (!((n0) r1Var).e) {
            this.zzi = com.google.android.datatransport.runtime.backends.c.q(r1Var);
        }
        this.zzi.set(i, v7Var);
    }

    public final void O() {
        this.zzj = k2.B;
    }

    public final void P() {
        this.zzm = k2.B;
    }

    @Override // com.google.android.gms.internal.measurement.i1
    public final Object t(int i) {
        h2 h1Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new l2(zzw, "\u0004\u0012\u0000\u0001\u0001\u0014\u0012\u0000\u0006\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005\u000eဈ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011ဉ\t\u0012ဉ\n\u0013ဉ\u000b\u0014+", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", b8.class, "zzi", v7.class, "zzj", f7.class, "zzk", "zzl", "zzm", n9.class, "zzn", t7.class, "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv"});
        }
        if (i2 == 3) {
            return new x7();
        }
        if (i2 == 4) {
            return new w7(zzw);
        }
        if (i2 == 5) {
            return zzw;
        }
        if (i2 != 6) {
            throw null;
        }
        h2 h2Var = zzx;
        if (h2Var != null) {
            return h2Var;
        }
        synchronized (x7.class) {
            try {
                h1Var = zzx;
                if (h1Var == null) {
                    h1Var = new h1(zzw);
                    zzx = h1Var;
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

    public final long v() {
        return this.zze;
    }

    public final boolean w() {
        return (this.zzb & 2) != 0;
    }

    public final String x() {
        return this.zzf;
    }

    public final r1 y() {
        return this.zzh;
    }

    public final int z() {
        return this.zzi.size();
    }
}
