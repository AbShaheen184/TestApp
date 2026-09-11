package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class t8 extends i1 {
    private static final t8 zzm;
    private static volatile h2 zzn;
    private int zzb;
    private r1 zze = k2.B;
    private String zzf = "";
    private long zzg;
    private long zzh;
    private int zzi;
    private long zzj;
    private long zzk;
    private long zzl;

    static {
        t8 t8Var = new t8();
        zzm = t8Var;
        i1.p(t8.class, t8Var);
    }

    public static s8 K() {
        return (s8) zzm.k();
    }

    public final boolean A() {
        return (this.zzb & 2) != 0;
    }

    public final long B() {
        return this.zzg;
    }

    public final boolean C() {
        return (this.zzb & 4) != 0;
    }

    public final long D() {
        return this.zzh;
    }

    public final boolean E() {
        return (this.zzb & 8) != 0;
    }

    public final int F() {
        return this.zzi;
    }

    public final boolean G() {
        return (this.zzb & 32) != 0;
    }

    public final long H() {
        return this.zzk;
    }

    public final boolean I() {
        return (this.zzb & 64) != 0;
    }

    public final long J() {
        return this.zzl;
    }

    public final /* synthetic */ void L(int i, w8 w8Var) {
        v();
        this.zze.set(i, w8Var);
    }

    public final /* synthetic */ void M(w8 w8Var) {
        w8Var.getClass();
        v();
        this.zze.add(w8Var);
    }

    public final /* synthetic */ void N(Iterable iterable) {
        v();
        m0.d(iterable, this.zze);
    }

    public final void O() {
        this.zze = k2.B;
    }

    public final /* synthetic */ void P(int i) {
        v();
        this.zze.remove(i);
    }

    public final /* synthetic */ void Q(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzf = str;
    }

    public final /* synthetic */ void R(long j) {
        this.zzb |= 2;
        this.zzg = j;
    }

    public final /* synthetic */ void S(long j) {
        this.zzb |= 4;
        this.zzh = j;
    }

    public final /* synthetic */ void T(long j) {
        this.zzb |= 16;
        this.zzj = j;
    }

    public final /* synthetic */ void U(long j) {
        this.zzb |= 32;
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
            return new l2(zzm, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005င\u0003\u0006ဂ\u0004\u0007ဂ\u0005\bဂ\u0006", new Object[]{"zzb", "zze", w8.class, "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i2 == 3) {
            return new t8();
        }
        if (i2 == 4) {
            return new s8(zzm);
        }
        if (i2 == 5) {
            return zzm;
        }
        if (i2 != 6) {
            throw null;
        }
        h2 h2Var = zzn;
        if (h2Var != null) {
            return h2Var;
        }
        synchronized (t8.class) {
            try {
                h1Var = zzn;
                if (h1Var == null) {
                    h1Var = new h1(zzm);
                    zzn = h1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return h1Var;
    }

    public final /* synthetic */ void u(long j) {
        this.zzb |= 64;
        this.zzl = j;
    }

    public final void v() {
        r1 r1Var = this.zze;
        if (((n0) r1Var).e) {
            return;
        }
        this.zze = com.google.android.datatransport.runtime.backends.c.q(r1Var);
    }

    public final List w() {
        return this.zze;
    }

    public final int x() {
        return this.zze.size();
    }

    public final w8 y(int i) {
        return (w8) this.zze.get(i);
    }

    public final String z() {
        return this.zzf;
    }
}
