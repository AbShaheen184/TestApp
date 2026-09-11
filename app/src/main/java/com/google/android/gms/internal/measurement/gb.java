package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class gb extends i1 {
    private static final gb zzj;
    private static volatile h2 zzk;
    private int zzb;
    private long zzh;
    private z1 zzi = z1.y;
    private String zze = "";
    private t0 zzf = t0.y;
    private String zzg = "";

    static {
        gb gbVar = new gb();
        zzj = gbVar;
        i1.p(gb.class, gbVar);
    }

    public static gb A(w0 w0Var, a1 a1Var) throws t1 {
        i1 i1VarI = zzj.i();
        try {
            m2 m2VarA = j2.c.a(i1VarI.getClass());
            androidx.compose.foundation.text.selection.w wVar = w0Var.c;
            if (wVar == null) {
                wVar = new androidx.compose.foundation.text.selection.w(w0Var);
            }
            m2VarA.d(i1VarI, wVar, a1Var);
            m2VarA.f(i1VarI);
            i1.s(i1VarI);
            return (gb) i1VarI;
        } catch (q2 e) {
            throw e.a();
        } catch (t1 e2) {
            if (e2.e) {
                throw new t1(e2.getMessage(), e2);
            }
            throw e2;
        } catch (IOException e3) {
            if (e3.getCause() instanceof t1) {
                throw ((t1) e3.getCause());
            }
            throw new t1(e3.getMessage(), e3);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof t1) {
                throw ((t1) e4.getCause());
            }
            throw e4;
        }
    }

    public static gb B() {
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
            return new l2(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0001\u0000\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u00052", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", fb.a});
        }
        if (i2 == 3) {
            return new gb();
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
        synchronized (gb.class) {
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

    public final String u() {
        return this.zze;
    }

    public final t0 v() {
        return this.zzf;
    }

    public final String w() {
        return this.zzg;
    }

    public final long x() {
        return this.zzh;
    }

    public final int y() {
        return this.zzi.size();
    }

    public final Map z() {
        return Collections.unmodifiableMap(this.zzi);
    }
}
