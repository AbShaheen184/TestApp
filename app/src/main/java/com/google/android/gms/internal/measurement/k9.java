package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k9 extends i1 {
    private static final k9 zzk;
    private static volatile h2 zzl;
    private int zzb;
    private long zze;
    private String zzf = "";
    private String zzg = "";
    private long zzh;
    private float zzi;
    private double zzj;

    static {
        k9 k9Var = new k9();
        zzk = k9Var;
        i1.p(k9.class, k9Var);
    }

    public static j9 F() {
        return (j9) zzk.k();
    }

    public final long A() {
        return this.zzh;
    }

    public final boolean B() {
        return (this.zzb & 16) != 0;
    }

    public final float C() {
        return this.zzi;
    }

    public final boolean D() {
        return (this.zzb & 32) != 0;
    }

    public final double E() {
        return this.zzj;
    }

    public final /* synthetic */ void G(long j) {
        this.zzb |= 1;
        this.zze = j;
    }

    public final /* synthetic */ void H(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zzf = str;
    }

    public final /* synthetic */ void I(String str) {
        str.getClass();
        this.zzb |= 4;
        this.zzg = str;
    }

    public final /* synthetic */ void J() {
        this.zzb &= -5;
        this.zzg = zzk.zzg;
    }

    public final /* synthetic */ void K(long j) {
        this.zzb |= 8;
        this.zzh = j;
    }

    public final /* synthetic */ void L() {
        this.zzb &= -9;
        this.zzh = 0L;
    }

    public final /* synthetic */ void M(double d) {
        this.zzb |= 32;
        this.zzj = d;
    }

    public final /* synthetic */ void N() {
        this.zzb &= -33;
        this.zzj = 0.0d;
    }

    @Override // com.google.android.gms.internal.measurement.i1
    public final Object t(int i) {
        h2 h1Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new l2(zzk, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ခ\u0004\u0006က\u0005", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new k9();
        }
        if (i2 == 4) {
            return new j9(zzk);
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
        synchronized (k9.class) {
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

    public final long v() {
        return this.zze;
    }

    public final String w() {
        return this.zzf;
    }

    public final boolean x() {
        return (this.zzb & 4) != 0;
    }

    public final String y() {
        return this.zzg;
    }

    public final boolean z() {
        return (this.zzb & 8) != 0;
    }
}
