package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class tc extends i1 {
    private static final tc zzl;
    private static volatile h2 zzm;
    private int zzb;
    private boolean zzf;
    private int zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private String zze = "";
    private r1 zzg = k2.B;

    static {
        tc tcVar = new tc();
        zzl = tcVar;
        i1.p(tc.class, tcVar);
    }

    public static tc w(InputStream inputStream, a1 a1Var) throws t1 {
        tc tcVar = zzl;
        w0 w0VarH = w0.h(inputStream, 4096);
        i1 i1VarI = tcVar.i();
        try {
            m2 m2VarA = j2.c.a(i1VarI.getClass());
            androidx.compose.foundation.text.selection.w wVar = w0VarH.c;
            if (wVar == null) {
                wVar = new androidx.compose.foundation.text.selection.w(w0VarH);
            }
            m2VarA.d(i1VarI, wVar, a1Var);
            m2VarA.f(i1VarI);
            i1.s(i1VarI);
            return (tc) i1VarI;
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

    @Override // com.google.android.gms.internal.measurement.i1
    public final Object t(int i) {
        h2 h1Var;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new l2(zzl, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003\u001a\u0004᠌\u0002\u0005ဇ\u0003\u0006ဇ\u0005\u0007ဇ\u0004", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", j0.b, "zzi", "zzk", "zzj"});
        }
        if (i2 == 3) {
            return new tc();
        }
        if (i2 == 4) {
            return new k7(zzl);
        }
        if (i2 == 5) {
            return zzl;
        }
        if (i2 != 6) {
            throw null;
        }
        h2 h2Var = zzm;
        if (h2Var != null) {
            return h2Var;
        }
        synchronized (tc.class) {
            try {
                h1Var = zzm;
                if (h1Var == null) {
                    h1Var = new h1(zzl);
                    zzm = h1Var;
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

    public final boolean v() {
        return this.zzf;
    }
}
