package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class l8 extends i1 {
    private static final l8 zzi;
    private static volatile h2 zzj;
    private int zzb;
    private int zze;
    private e9 zzf;
    private e9 zzg;
    private boolean zzh;

    static {
        l8 l8Var = new l8();
        zzi = l8Var;
        i1.p(l8.class, l8Var);
    }

    public static k8 B() {
        return (k8) zzi.k();
    }

    public final boolean A() {
        return this.zzh;
    }

    public final /* synthetic */ void C(int i) {
        this.zzb |= 1;
        this.zze = i;
    }

    public final /* synthetic */ void D(e9 e9Var) {
        this.zzf = e9Var;
        this.zzb |= 2;
    }

    public final /* synthetic */ void E(e9 e9Var) {
        this.zzg = e9Var;
        this.zzb |= 4;
    }

    public final /* synthetic */ void F(boolean z) {
        this.zzb |= 8;
        this.zzh = z;
    }

    @Override // com.google.android.gms.internal.measurement.i1
    public final Object t(int i) {
        h2 h1Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new l2(zzi, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new l8();
        }
        if (i2 == 4) {
            return new k8(zzi);
        }
        if (i2 == 5) {
            return zzi;
        }
        if (i2 != 6) {
            throw null;
        }
        h2 h2Var = zzj;
        if (h2Var != null) {
            return h2Var;
        }
        synchronized (l8.class) {
            try {
                h1Var = zzj;
                if (h1Var == null) {
                    h1Var = new h1(zzi);
                    zzj = h1Var;
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

    public final e9 w() {
        e9 e9Var = this.zzf;
        return e9Var == null ? e9.D() : e9Var;
    }

    public final boolean x() {
        return (this.zzb & 4) != 0;
    }

    public final e9 y() {
        e9 e9Var = this.zzg;
        return e9Var == null ? e9.D() : e9Var;
    }

    public final boolean z() {
        return (this.zzb & 8) != 0;
    }
}
