package com.google.android.gms.internal.measurement;

import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oe implements com.google.common.util.concurrent.y {
    public final /* synthetic */ int e;
    public final /* synthetic */ androidx.compose.ui.node.a1 y;

    public /* synthetic */ oe(androidx.compose.ui.node.a1 a1Var, int i) {
        this.e = i;
        this.y = a1Var;
    }

    @Override // com.google.common.util.concurrent.y
    public final ListenableFuture call() {
        ListenableFuture listenableFutureA;
        int i = this.e;
        androidx.compose.ui.node.a1 a1Var = this.y;
        int i2 = 4;
        switch (i) {
            case 0:
                com.google.common.util.concurrent.x0 x0Var = (com.google.common.util.concurrent.x0) a1Var.e;
                try {
                    return com.google.common.util.concurrent.n0.d(a1Var.l((Uri) com.google.common.util.concurrent.n0.b((ListenableFuture) a1Var.c)));
                } catch (IOException e) {
                    com.google.common.base.p pVar = (com.google.common.base.p) a1Var.g;
                    pVar.getClass();
                    if ((e instanceof ae) || (e.getCause() instanceof ae)) {
                        return com.google.common.util.concurrent.n0.c(e);
                    }
                    re reVar = (re) pVar.e;
                    reVar.getClass();
                    if (e.getCause() instanceof t1) {
                        com.google.common.util.concurrent.q0 q0VarD = com.google.common.util.concurrent.n0.d(reVar.a);
                        ne neVar = new ne(a1Var, 2);
                        int i3 = rf.a;
                        listenableFutureA = com.google.common.util.concurrent.n0.a(com.google.common.util.concurrent.n0.g(q0VarD, new xc(i2, bf.a(), neVar), x0Var), IOException.class, new kc(e, 5), com.google.common.util.concurrent.d0.e);
                    } else {
                        listenableFutureA = com.google.common.util.concurrent.n0.c(e);
                    }
                    ne neVar2 = new ne(a1Var, 1);
                    int i4 = rf.a;
                    return com.google.common.util.concurrent.n0.g(listenableFutureA, new xc(i2, bf.a(), neVar2), x0Var);
                }
            default:
                ne neVar3 = new ne(a1Var, 3);
                int i5 = rf.a;
                return com.google.common.util.concurrent.n0.e(com.google.common.util.concurrent.n0.g((ListenableFuture) a1Var.c, new xc(i2, bf.a(), neVar3), (com.google.common.util.concurrent.x0) a1Var.e));
        }
    }
}
