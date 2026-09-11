package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g9 extends i1 {
    private static final g9 zzg;
    private static volatile h2 zzh;
    private int zzb;
    private int zze;
    private q1 zzf = x1.B;

    static {
        g9 g9Var = new g9();
        zzg = g9Var;
        i1.p(g9.class, g9Var);
    }

    public static f9 z() {
        return (f9) zzg.k();
    }

    public final /* synthetic */ void A(int i) {
        this.zzb |= 1;
        this.zze = i;
    }

    public final void B(List list) {
        RandomAccess randomAccess = this.zzf;
        if (!((n0) randomAccess).e) {
            x1 x1Var = (x1) randomAccess;
            int i = x1Var.z;
            this.zzf = x1Var.L(i + i);
        }
        m0.d(list, this.zzf);
    }

    @Override // com.google.android.gms.internal.measurement.i1
    public final Object t(int i) {
        h2 h1Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new l2(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new g9();
        }
        if (i2 == 4) {
            return new f9(zzg);
        }
        if (i2 == 5) {
            return zzg;
        }
        if (i2 != 6) {
            throw null;
        }
        h2 h2Var = zzh;
        if (h2Var != null) {
            return h2Var;
        }
        synchronized (g9.class) {
            try {
                h1Var = zzh;
                if (h1Var == null) {
                    h1Var = new h1(zzg);
                    zzh = h1Var;
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

    public final List w() {
        return this.zzf;
    }

    public final int x() {
        return ((x1) this.zzf).size();
    }

    public final long y(int i) {
        return ((x1) this.zzf).c(i);
    }
}
