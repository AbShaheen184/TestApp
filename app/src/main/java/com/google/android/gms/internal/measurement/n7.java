package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class n7 extends i1 {
    private static final n7 zzk;
    private static volatile h2 zzl;
    private int zzb;
    private int zze;
    private String zzf = "";
    private j7 zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;

    static {
        n7 n7Var = new n7();
        zzk = n7Var;
        i1.p(n7.class, n7Var);
    }

    public static m7 C() {
        return (m7) zzk.k();
    }

    public final boolean A() {
        return (this.zzb & 32) != 0;
    }

    public final boolean B() {
        return this.zzj;
    }

    public final /* synthetic */ void D(String str) {
        this.zzb |= 2;
        this.zzf = str;
    }

    @Override // com.google.android.gms.internal.measurement.i1
    public final Object t(int i) {
        h2 h1Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new l2(zzk, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new n7();
        }
        if (i2 == 4) {
            return new m7(zzk);
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
        synchronized (n7.class) {
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

    public final int v() {
        return this.zze;
    }

    public final String w() {
        return this.zzf;
    }

    public final j7 x() {
        j7 j7Var = this.zzg;
        return j7Var == null ? j7.C() : j7Var;
    }

    public final boolean y() {
        return this.zzh;
    }

    public final boolean z() {
        return this.zzi;
    }
}
