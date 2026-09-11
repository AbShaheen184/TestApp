package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d7 extends i1 {
    private static final d7 zzi;
    private static volatile h2 zzj;
    private int zzb;
    private boolean zzf;
    private long zzh;
    private String zze = "";
    private String zzg = "";

    static {
        d7 d7Var = new d7();
        zzi = d7Var;
        i1.p(d7.class, d7Var);
    }

    public static c7 u() {
        return (c7) zzi.k();
    }

    @Override // com.google.android.gms.internal.measurement.i1
    public final Object t(int i) {
        h2 h1Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new l2(zzi, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004ဂ\u0003", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new d7();
        }
        if (i2 == 4) {
            return new c7(zzi);
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
        synchronized (d7.class) {
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

    public final /* synthetic */ void v(String str) {
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void w() {
        this.zzb |= 2;
        this.zzf = true;
    }

    public final /* synthetic */ void x(String str) {
        this.zzb |= 4;
        this.zzg = str;
    }

    public final /* synthetic */ void y(long j) {
        this.zzb |= 8;
        this.zzh = j;
    }
}
