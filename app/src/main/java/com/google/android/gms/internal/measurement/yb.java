package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class yb extends i1 {
    private static final yb zze;
    private static volatile h2 zzf;
    private z1 zzb = z1.y;

    static {
        yb ybVar = new yb();
        zze = ybVar;
        i1.p(yb.class, ybVar);
    }

    public static yb v() {
        return zze;
    }

    @Override // com.google.android.gms.internal.measurement.i1
    public final Object t(int i) {
        h2 h1Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new l2(zze, "\u0004\u0001\u0000\u0000\u0002\u0002\u0001\u0001\u0000\u0000\u00022", new Object[]{"zzb", wb.a});
        }
        if (i2 == 3) {
            return new yb();
        }
        if (i2 == 4) {
            return new xb(zze);
        }
        if (i2 == 5) {
            return zze;
        }
        if (i2 != 6) {
            throw null;
        }
        h2 h2Var = zzf;
        if (h2Var != null) {
            return h2Var;
        }
        synchronized (yb.class) {
            try {
                h1Var = zzf;
                if (h1Var == null) {
                    h1Var = new h1(zze);
                    zzf = h1Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return h1Var;
    }

    public final vb u(String str, vb vbVar) {
        str.getClass();
        vb vbVar2 = (vb) this.zzb.get(str);
        return vbVar2 != null ? vbVar2 : vbVar;
    }

    public final z1 w() {
        z1 z1Var = this.zzb;
        if (!z1Var.e) {
            this.zzb = z1Var.a();
        }
        return this.zzb;
    }
}
