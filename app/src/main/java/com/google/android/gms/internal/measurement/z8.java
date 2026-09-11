package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class z8 extends i1 {
    private static final z8 zzi;
    private static volatile h2 zzj;
    private int zzb;
    private r1 zze = k2.B;
    private String zzf = "";
    private String zzg = "";
    private int zzh;

    static {
        z8 z8Var = new z8();
        zzi = z8Var;
        i1.p(z8.class, z8Var);
    }

    public static y8 B() {
        return (y8) zzi.k();
    }

    public static y8 C(z8 z8Var) {
        g1 g1VarK = zzi.k();
        g1VarK.e(z8Var);
        return (y8) g1VarK;
    }

    public final String A() {
        return this.zzg;
    }

    public final /* synthetic */ void D(int i, b9 b9Var) {
        J();
        this.zze.set(i, b9Var);
    }

    public final /* synthetic */ void E(b9 b9Var) {
        J();
        this.zze.add(b9Var);
    }

    public final /* synthetic */ void F(ArrayList arrayList) {
        J();
        m0.d(arrayList, this.zze);
    }

    public final void G() {
        this.zze = k2.B;
    }

    public final /* synthetic */ void H(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zzf = str;
    }

    public final /* synthetic */ void I(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zzg = str;
    }

    public final void J() {
        r1 r1Var = this.zze;
        if (((n0) r1Var).e) {
            return;
        }
        this.zze = com.google.android.datatransport.runtime.backends.c.q(r1Var);
    }

    @Override // com.google.android.gms.internal.measurement.i1
    public final Object t(int i) {
        h2 h1Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new l2(zzi, "\u0004\u0004\u0000\u0001\u0001\t\u0004\u0000\u0001\u0000\u0001\u001b\u0007ဈ\u0000\bဈ\u0001\t᠌\u0002", new Object[]{"zzb", "zze", b9.class, "zzf", "zzg", "zzh", j0.k});
        }
        if (i2 == 3) {
            return new z8();
        }
        if (i2 == 4) {
            return new y8(zzi);
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
        synchronized (z8.class) {
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

    public final List u() {
        return this.zze;
    }

    public final int v() {
        return this.zze.size();
    }

    public final b9 w(int i) {
        return (b9) this.zze.get(i);
    }

    public final boolean x() {
        return (this.zzb & 1) != 0;
    }

    public final String y() {
        return this.zzf;
    }

    public final boolean z() {
        return (this.zzb & 2) != 0;
    }
}
