package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class kd extends i1 {
    private static final kd zzh;
    private static volatile h2 zzi;
    private int zzb;
    private Object zzf;
    private int zze = 0;
    private String zzg = "";

    static {
        kd kdVar = new kd();
        zzh = kdVar;
        i1.p(kd.class, kdVar);
    }

    public static jd A() {
        return (jd) zzh.k();
    }

    public final /* synthetic */ void B(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzg = str;
    }

    public final /* synthetic */ void C(long j) {
        this.zze = 2;
        this.zzf = Long.valueOf(j);
    }

    public final /* synthetic */ void D(boolean z) {
        this.zze = 3;
        this.zzf = Boolean.valueOf(z);
    }

    public final /* synthetic */ void E(double d) {
        this.zze = 4;
        this.zzf = Double.valueOf(d);
    }

    public final /* synthetic */ void F(String str) {
        str.getClass();
        this.zze = 5;
        this.zzf = str;
    }

    public final /* synthetic */ void G(t0 t0Var) {
        t0Var.getClass();
        this.zze = 6;
        this.zzf = t0Var;
    }

    public final int H() {
        int i = this.zze;
        if (i == 0) {
            return 6;
        }
        if (i == 2) {
            return 1;
        }
        if (i == 3) {
            return 2;
        }
        if (i == 4) {
            return 3;
        }
        if (i != 5) {
            return i != 6 ? 0 : 5;
        }
        return 4;
    }

    @Override // com.google.android.gms.internal.measurement.i1
    public final Object t(int i) {
        h2 h1Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new l2(zzh, "\u0004\u0006\u0001\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u00025\u0000\u0003:\u0000\u00043\u0000\u0005;\u0000\u0006=\u0000", new Object[]{"zzf", "zze", "zzb", "zzg"});
        }
        if (i2 == 3) {
            return new kd();
        }
        if (i2 == 4) {
            return new jd(zzh);
        }
        if (i2 == 5) {
            return zzh;
        }
        if (i2 != 6) {
            throw null;
        }
        h2 h2Var = zzi;
        if (h2Var != null) {
            return h2Var;
        }
        synchronized (kd.class) {
            try {
                h1Var = zzi;
                if (h1Var == null) {
                    h1Var = new h1(zzh);
                    zzi = h1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return h1Var;
    }

    public final String u() {
        return this.zzg;
    }

    public final long v() {
        if (this.zze == 2) {
            return ((Long) this.zzf).longValue();
        }
        return 0L;
    }

    public final boolean w() {
        if (this.zze == 3) {
            return ((Boolean) this.zzf).booleanValue();
        }
        return false;
    }

    public final double x() {
        if (this.zze == 4) {
            return ((Double) this.zzf).doubleValue();
        }
        return 0.0d;
    }

    public final String y() {
        return this.zze == 5 ? (String) this.zzf : "";
    }

    public final t0 z() {
        return this.zze == 6 ? (t0) this.zzf : t0.y;
    }
}
