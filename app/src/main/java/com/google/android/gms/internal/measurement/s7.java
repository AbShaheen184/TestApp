package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class s7 extends i1 {
    private static final s7 zzj;
    private static volatile h2 zzk;
    private int zzb;
    private r1 zze;
    private r1 zzf;
    private r1 zzg;
    private boolean zzh;
    private r1 zzi;

    static {
        s7 s7Var = new s7();
        zzj = s7Var;
        i1.p(s7.class, s7Var);
    }

    public s7() {
        k2 k2Var = k2.B;
        this.zze = k2Var;
        this.zzf = k2Var;
        this.zzg = k2Var;
        this.zzi = k2Var;
    }

    public static s7 A() {
        return zzj;
    }

    @Override // com.google.android.gms.internal.measurement.i1
    public final Object t(int i) {
        h2 h1Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new l2(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004ဇ\u0000\u0005\u001b", new Object[]{"zzb", "zze", p7.class, "zzf", q7.class, "zzg", r7.class, "zzh", "zzi", p7.class});
        }
        if (i2 == 3) {
            return new s7();
        }
        if (i2 == 4) {
            return new k7(zzj);
        }
        if (i2 == 5) {
            return zzj;
        }
        if (i2 != 6) {
            throw null;
        }
        h2 h2Var = zzk;
        if (h2Var != null) {
            return h2Var;
        }
        synchronized (s7.class) {
            try {
                h1Var = zzk;
                if (h1Var == null) {
                    h1Var = new h1(zzj);
                    zzk = h1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return h1Var;
    }

    public final List u() {
        return this.zze;
    }

    public final List v() {
        return this.zzf;
    }

    public final List w() {
        return this.zzg;
    }

    public final boolean x() {
        return (this.zzb & 1) != 0;
    }

    public final boolean y() {
        return this.zzh;
    }

    public final r1 z() {
        return this.zzi;
    }
}
