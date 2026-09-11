package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class xa extends i1 {
    private static final xa zzh;
    private static volatile h2 zzi;
    private int zzb;
    private wa zzf;
    private String zze = "";
    private String zzg = "";

    static {
        xa xaVar = new xa();
        zzh = xaVar;
        i1.p(xa.class, xaVar);
    }

    public static ua v() {
        return (ua) zzh.k();
    }

    @Override // com.google.android.gms.internal.measurement.i1
    public final Object t(int i) {
        h2 h1Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new l2(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဈ\u0002", new Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new xa();
        }
        if (i2 == 4) {
            return new ua(zzh);
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
        synchronized (xa.class) {
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
        return this.zze;
    }

    public final /* synthetic */ void w(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void x(wa waVar) {
        this.zzf = waVar;
        this.zzb |= 2;
    }

    public final /* synthetic */ void y(String str) {
        str.getClass();
        this.zzb |= 4;
        this.zzg = str;
    }
}
