package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class wa extends i1 {
    private static final wa zzg;
    private static volatile h2 zzh;
    private int zzb;
    private int zze;
    private int zzf;

    static {
        wa waVar = new wa();
        zzg = waVar;
        i1.p(wa.class, waVar);
    }

    public static va u() {
        return (va) zzg.k();
    }

    @Override // com.google.android.gms.internal.measurement.i1
    public final Object t(int i) {
        h2 h1Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new l2(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new wa();
        }
        if (i2 == 4) {
            return new va(zzg);
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
        synchronized (wa.class) {
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

    public final /* synthetic */ void v(int i) {
        this.zze = i - 2;
        this.zzb |= 1;
    }

    public final /* synthetic */ void w(int i) {
        if (i == 1) {
            net.luminis.tls.engine.impl.c.o("Can't get the number of an unknown enum value.");
        } else {
            this.zzf = i - 2;
            this.zzb |= 2;
        }
    }
}
