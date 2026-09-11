package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e9 extends i1 {
    private static final e9 zzh;
    private static volatile h2 zzi;
    private q1 zzb;
    private q1 zze;
    private r1 zzf;
    private r1 zzg;

    static {
        e9 e9Var = new e9();
        zzh = e9Var;
        i1.p(e9.class, e9Var);
    }

    public e9() {
        x1 x1Var = x1.B;
        this.zzb = x1Var;
        this.zze = x1Var;
        k2 k2Var = k2.B;
        this.zzf = k2Var;
        this.zzg = k2Var;
    }

    public static d9 C() {
        return (d9) zzh.k();
    }

    public static e9 D() {
        return zzh;
    }

    public final r1 A() {
        return this.zzg;
    }

    public final int B() {
        return this.zzg.size();
    }

    public final void E(Iterable iterable) {
        RandomAccess randomAccess = this.zzb;
        if (!((n0) randomAccess).e) {
            x1 x1Var = (x1) randomAccess;
            int i = x1Var.z;
            this.zzb = x1Var.L(i + i);
        }
        m0.d(iterable, this.zzb);
    }

    public final void F() {
        this.zzb = x1.B;
    }

    public final void G(List list) {
        RandomAccess randomAccess = this.zze;
        if (!((n0) randomAccess).e) {
            x1 x1Var = (x1) randomAccess;
            int i = x1Var.z;
            this.zze = x1Var.L(i + i);
        }
        m0.d(list, this.zze);
    }

    public final void H() {
        this.zze = x1.B;
    }

    public final void I(ArrayList arrayList) {
        r1 r1Var = this.zzf;
        if (!((n0) r1Var).e) {
            this.zzf = com.google.android.datatransport.runtime.backends.c.q(r1Var);
        }
        m0.d(arrayList, this.zzf);
    }

    public final void J() {
        this.zzf = k2.B;
    }

    public final void K(Iterable iterable) {
        r1 r1Var = this.zzg;
        if (!((n0) r1Var).e) {
            this.zzg = com.google.android.datatransport.runtime.backends.c.q(r1Var);
        }
        m0.d(iterable, this.zzg);
    }

    public final void L() {
        this.zzg = k2.B;
    }

    @Override // com.google.android.gms.internal.measurement.i1
    public final Object t(int i) {
        h2 h1Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new l2(zzh, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zzb", "zze", "zzf", r8.class, "zzg", g9.class});
        }
        if (i2 == 3) {
            return new e9();
        }
        if (i2 == 4) {
            return new d9(zzh);
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
        synchronized (e9.class) {
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

    public final List u() {
        return this.zzb;
    }

    public final int v() {
        return ((x1) this.zzb).size();
    }

    public final List w() {
        return this.zze;
    }

    public final int x() {
        return ((x1) this.zze).size();
    }

    public final r1 y() {
        return this.zzf;
    }

    public final int z() {
        return this.zzf.size();
    }
}
