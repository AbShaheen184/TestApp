package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class j7 extends i1 {
    private static final j7 zzi;
    private static volatile h2 zzj;
    private int zzb;
    private o7 zze;
    private l7 zzf;
    private boolean zzg;
    private String zzh = "";

    static {
        j7 j7Var = new j7();
        zzi = j7Var;
        i1.p(j7.class, j7Var);
    }

    public static j7 C() {
        return zzi;
    }

    public final boolean A() {
        return (this.zzb & 8) != 0;
    }

    public final String B() {
        return this.zzh;
    }

    public final /* synthetic */ void D(String str) {
        this.zzb |= 8;
        this.zzh = str;
    }

    @Override // com.google.android.gms.internal.measurement.i1
    public final Object t(int i) {
        h2 h1Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new l2(zzi, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဈ\u0003", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new j7();
        }
        if (i2 == 4) {
            return new i7(zzi);
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
        synchronized (j7.class) {
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

    public final o7 v() {
        o7 o7Var = this.zze;
        return o7Var == null ? o7.B() : o7Var;
    }

    public final boolean w() {
        return (this.zzb & 2) != 0;
    }

    public final l7 x() {
        l7 l7Var = this.zzf;
        return l7Var == null ? l7.D() : l7Var;
    }

    public final boolean y() {
        return (this.zzb & 4) != 0;
    }

    public final boolean z() {
        return this.zzg;
    }
}
