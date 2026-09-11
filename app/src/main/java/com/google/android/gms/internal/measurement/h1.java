package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h1 implements h2 {
    public final i1 a;

    static {
        a1 a1Var = a1.a;
        int i = o0.a;
    }

    public h1(i1 i1Var) {
        this.a = i1Var;
    }

    public final i1 a(InputStream inputStream, a1 a1Var) throws t1 {
        w0 w0VarH = w0.h(inputStream, 4096);
        int i = i1.zzd;
        i1 i1VarI = this.a.i();
        try {
            m2 m2VarA = j2.c.a(i1VarI.getClass());
            androidx.compose.foundation.text.selection.w wVar = w0VarH.c;
            if (wVar == null) {
                wVar = new androidx.compose.foundation.text.selection.w(w0VarH);
            }
            m2VarA.d(i1VarI, wVar, a1Var);
            m2VarA.f(i1VarI);
            w0VarH.m(0);
            if (i1.r(i1VarI, true)) {
                return i1VarI;
            }
            throw new q2().a();
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
}
