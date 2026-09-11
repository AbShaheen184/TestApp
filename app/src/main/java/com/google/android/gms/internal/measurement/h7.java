package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h7 extends i1 {
    private static final h7 zzm;
    private static volatile h2 zzn;
    private int zzb;
    private int zze;
    private String zzf = "";
    private r1 zzg = k2.B;
    private boolean zzh;
    private l7 zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;

    static {
        h7 h7Var = new h7();
        zzm = h7Var;
        i1.p(h7.class, h7Var);
    }

    public static g7 G() {
        return (g7) zzm.k();
    }

    public final boolean A() {
        return (this.zzb & 8) != 0;
    }

    public final l7 B() {
        l7 l7Var = this.zzi;
        return l7Var == null ? l7.D() : l7Var;
    }

    public final boolean C() {
        return this.zzj;
    }

    public final boolean D() {
        return this.zzk;
    }

    public final boolean E() {
        return (this.zzb & 64) != 0;
    }

    public final boolean F() {
        return this.zzl;
    }

    public final /* synthetic */ void H(String str) {
        this.zzb |= 2;
        this.zzf = str;
    }

    public final void I(int i, j7 j7Var) {
        r1 r1Var = this.zzg;
        if (!((n0) r1Var).e) {
            this.zzg = com.google.android.datatransport.runtime.backends.c.q(r1Var);
        }
        this.zzg.set(i, j7Var);
    }

    @Override // com.google.android.gms.internal.measurement.i1
    public final Object t(int i) {
        h2 h1Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new l2(zzm, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zzb", "zze", "zzf", "zzg", j7.class, "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i2 == 3) {
            return new h7();
        }
        if (i2 == 4) {
            return new g7(zzm);
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
        synchronized (h7.class) {
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

    public final boolean u() {
        return (this.zzb & 1) != 0;
    }

    public final int v() {
        return this.zze;
    }

    public final String w() {
        return this.zzf;
    }

    public final List x() {
        return this.zzg;
    }

    public final int y() {
        return this.zzg.size();
    }

    public final j7 z(int i) {
        return (j7) this.zzg.get(i);
    }
}
