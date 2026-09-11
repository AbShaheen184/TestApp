package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class vb extends i1 {
    private static final vb zzg;
    private static volatile h2 zzh;
    private int zzb;
    private r1 zze = k2.B;
    private String zzf = "";

    static {
        vb vbVar = new vb();
        zzg = vbVar;
        i1.p(vb.class, vbVar);
    }

    public static vb v() {
        return zzg;
    }

    @Override // com.google.android.gms.internal.measurement.i1
    public final Object t(int i) {
        h2 h1Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new l2(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001a\u0002ဈ\u0000", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new vb();
        }
        if (i2 == 4) {
            return new ub(zzg);
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
        synchronized (vb.class) {
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

    public final List u() {
        return this.zze;
    }

    public final void w(String str) {
        r1 r1Var = this.zze;
        if (!((n0) r1Var).e) {
            this.zze = com.google.android.datatransport.runtime.backends.c.q(r1Var);
        }
        this.zze.add("");
    }

    public final /* synthetic */ void x(String str) {
        this.zzb |= 1;
        this.zzf = "";
    }
}
