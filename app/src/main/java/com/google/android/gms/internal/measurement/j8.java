package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class j8 extends i1 {
    private static final j8 zzl;
    private static volatile h2 zzm;
    private int zzb;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    static {
        j8 j8Var = new j8();
        zzl = j8Var;
        i1.p(j8.class, j8Var);
    }

    public static i8 B() {
        return (i8) zzl.k();
    }

    public static j8 C() {
        return zzl;
    }

    public final boolean A() {
        return this.zzk;
    }

    public final /* synthetic */ void D(boolean z) {
        this.zzb |= 1;
        this.zze = z;
    }

    public final /* synthetic */ void E(boolean z) {
        this.zzb |= 2;
        this.zzf = z;
    }

    public final /* synthetic */ void F(boolean z) {
        this.zzb |= 4;
        this.zzg = z;
    }

    public final /* synthetic */ void G(boolean z) {
        this.zzb |= 8;
        this.zzh = z;
    }

    public final /* synthetic */ void H(boolean z) {
        this.zzb |= 16;
        this.zzi = z;
    }

    public final /* synthetic */ void I(boolean z) {
        this.zzb |= 32;
        this.zzj = z;
    }

    public final /* synthetic */ void J(boolean z) {
        this.zzb |= 64;
        this.zzk = z;
    }

    @Override // com.google.android.gms.internal.measurement.i1
    public final Object t(int i) {
        h2 h1Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new l2(zzl, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new j8();
        }
        if (i2 == 4) {
            return new i8(zzl);
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
        synchronized (j8.class) {
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

    public final boolean u() {
        return this.zze;
    }

    public final boolean v() {
        return this.zzf;
    }

    public final boolean w() {
        return this.zzg;
    }

    public final boolean x() {
        return this.zzh;
    }

    public final boolean y() {
        return this.zzi;
    }

    public final boolean z() {
        return this.zzj;
    }
}
