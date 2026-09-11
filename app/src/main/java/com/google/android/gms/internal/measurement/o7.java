package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class o7 extends i1 {
    private static final o7 zzi;
    private static volatile h2 zzj;
    private int zzb;
    private int zze;
    private boolean zzg;
    private String zzf = "";
    private r1 zzh = k2.B;

    static {
        o7 o7Var = new o7();
        zzi = o7Var;
        i1.p(o7.class, o7Var);
    }

    public static o7 B() {
        return zzi;
    }

    public final int A() {
        return this.zzh.size();
    }

    public final int C() {
        int i;
        switch (this.zze) {
            case 0:
                i = 1;
                break;
            case 1:
                i = 2;
                break;
            case 2:
                i = 3;
                break;
            case 3:
                i = 4;
                break;
            case 4:
                i = 5;
                break;
            case 5:
                i = 6;
                break;
            case 6:
                i = 7;
                break;
            default:
                i = 0;
                break;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    @Override // com.google.android.gms.internal.measurement.i1
    public final Object t(int i) {
        h2 h1Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new l2(zzi, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဇ\u0002\u0004\u001a", new Object[]{"zzb", "zze", j0.d, "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new o7();
        }
        if (i2 == 4) {
            return new k7(zzi);
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
        synchronized (o7.class) {
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

    public final boolean v() {
        return (this.zzb & 2) != 0;
    }

    public final String w() {
        return this.zzf;
    }

    public final boolean x() {
        return (this.zzb & 4) != 0;
    }

    public final boolean y() {
        return this.zzg;
    }

    public final r1 z() {
        return this.zzh;
    }
}
