package com.google.android.gms.internal.measurement;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class w8 extends i1 {
    private static final w8 zzk;
    private static volatile h2 zzl;
    private int zzb;
    private long zzg;
    private float zzh;
    private double zzi;
    private String zze = "";
    private String zzf = "";
    private r1 zzj = k2.B;

    static {
        w8 w8Var = new w8();
        zzk = w8Var;
        i1.p(w8.class, w8Var);
    }

    public static v8 G() {
        return (v8) zzk.k();
    }

    public final boolean A() {
        return (this.zzb & 8) != 0;
    }

    public final float B() {
        return this.zzh;
    }

    public final boolean C() {
        return (this.zzb & 16) != 0;
    }

    public final double D() {
        return this.zzi;
    }

    public final r1 E() {
        return this.zzj;
    }

    public final int F() {
        return this.zzj.size();
    }

    public final /* synthetic */ void H(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void I(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zzf = str;
    }

    public final /* synthetic */ void J() {
        this.zzb &= -3;
        this.zzf = zzk.zzf;
    }

    public final /* synthetic */ void K(long j) {
        this.zzb |= 4;
        this.zzg = j;
    }

    public final /* synthetic */ void L() {
        this.zzb &= -5;
        this.zzg = 0L;
    }

    public final /* synthetic */ void M(double d) {
        this.zzb |= 16;
        this.zzi = d;
    }

    public final /* synthetic */ void N() {
        this.zzb &= -17;
        this.zzi = 0.0d;
    }

    public final void O(w8 w8Var) {
        r1 r1Var = this.zzj;
        if (!((n0) r1Var).e) {
            this.zzj = com.google.android.datatransport.runtime.backends.c.q(r1Var);
        }
        this.zzj.add(w8Var);
    }

    public final void P(ArrayList arrayList) {
        r1 r1Var = this.zzj;
        if (!((n0) r1Var).e) {
            this.zzj = com.google.android.datatransport.runtime.backends.c.q(r1Var);
        }
        m0.d(arrayList, this.zzj);
    }

    public final void Q() {
        this.zzj = k2.B;
    }

    @Override // com.google.android.gms.internal.measurement.i1
    public final Object t(int i) {
        h2 h1Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new l2(zzk, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", w8.class});
        }
        if (i2 == 3) {
            return new w8();
        }
        if (i2 == 4) {
            return new v8(zzk);
        }
        if (i2 == 5) {
            return zzk;
        }
        if (i2 != 6) {
            throw null;
        }
        h2 h2Var = zzl;
        if (h2Var != null) {
            return h2Var;
        }
        synchronized (w8.class) {
            try {
                h1Var = zzl;
                if (h1Var == null) {
                    h1Var = new h1(zzk);
                    zzl = h1Var;
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

    public final String v() {
        return this.zze;
    }

    public final boolean w() {
        return (this.zzb & 2) != 0;
    }

    public final String x() {
        return this.zzf;
    }

    public final boolean y() {
        return (this.zzb & 4) != 0;
    }

    public final long z() {
        return this.zzg;
    }
}
