package com.google.android.gms.internal.measurement;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class le {
    public final String a;
    public final com.google.common.util.concurrent.s b;
    public final androidx.compose.ui.node.a1 c;
    public final com.google.common.util.concurrent.g0 d;
    public final com.caverock.androidsvg.y1 e;
    public final com.caverock.androidsvg.y1 f = new com.caverock.androidsvg.y1(new j5(this));
    public final Object g;
    public final f1 h;
    public List i;

    public le(androidx.compose.ui.node.a1 a1Var, com.google.common.util.concurrent.s sVar) {
        Object obj = new Object();
        this.g = obj;
        this.i = new ArrayList();
        this.c = a1Var;
        this.b = sVar;
        this.a = (String) a1Var.b;
        this.e = new com.caverock.androidsvg.y1(new oe(a1Var, 1));
        this.d = new com.google.common.util.concurrent.g0(0);
        this.h = new f1(19);
        kc kcVar = new kc(this, 4);
        synchronized (obj) {
            this.i.add(kcVar);
        }
    }

    public final com.google.common.util.concurrent.t a(nc ncVar, com.google.common.util.concurrent.w0 w0Var) throws Throwable {
        kc kcVar = new kc(ncVar, 3);
        int i = rf.a;
        xc xcVar = new xc(4, bf.a(), kcVar);
        com.google.android.material.resources.g gVar = tf.a;
        com.google.android.material.motion.a.m(gVar, "ticker");
        gVar.l();
        String strConcat = "Update ".concat(String.valueOf(this.a));
        this.h.getClass();
        jf jfVarE = f1.e(strConcat);
        try {
            com.google.common.util.concurrent.r rVarX0 = this.f.x0();
            com.google.common.util.concurrent.g0 g0Var = this.d;
            s5 s5Var = new s5(rVarX0, 17);
            com.google.common.util.concurrent.d0 d0Var = com.google.common.util.concurrent.d0.e;
            g0Var.C(s5Var, d0Var);
            try {
                ListenableFuture listenableFutureC = g0Var.C(rf.a(new b7(this, rVarX0, xcVar, w0Var, 3)), d0Var);
                com.google.common.util.concurrent.n0.propagateCancellation(listenableFutureC, rVarX0);
                com.google.common.util.concurrent.n0.e(this.b);
                com.google.common.util.concurrent.t tVarF = com.google.common.util.concurrent.n0.f(listenableFutureC, new com.google.common.base.g(), d0Var);
                jfVarE.a(tVarF);
                jfVarE.close();
                return tVarF;
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                try {
                    jfVarE.close();
                    throw th2;
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                    throw th2;
                }
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }
}
