package com.google.android.gms.internal.measurement;

import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xc implements com.google.common.util.concurrent.z {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public /* synthetic */ xc(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // com.google.common.util.concurrent.z
    public final ListenableFuture apply(Object obj) throws IOException {
        switch (this.a) {
            case 0:
                zc zcVar = (zc) this.b;
                return ((eb) zcVar.d.get()).a(new j5(zcVar, (dd) this.c));
            case 1:
                List list = (List) this.b;
                qe qeVar = (qe) obj;
                int size = list.size();
                ArrayList arrayList = new ArrayList(size);
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    throw androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.b(it);
                }
                ke keVar = new ke(this, arrayList, size);
                int i = rf.a;
                int i2 = 4;
                xc xcVar = new xc(i2, bf.a(), keVar);
                com.google.common.util.concurrent.d0 d0Var = com.google.common.util.concurrent.d0.e;
                return com.google.common.util.concurrent.n0.g(com.google.common.util.concurrent.n0.f(com.google.common.util.concurrent.n0.g(com.google.common.util.concurrent.n0.e(qeVar.a.e.x0()), new xc(i2, bf.a(), new xc(3, qeVar, xcVar)), d0Var), new com.google.common.base.g(), d0Var), new xc(i2, bf.a(), new ke(this, size, arrayList)), d0Var);
            case 2:
                androidx.compose.ui.node.a1 a1Var = (androidx.compose.ui.node.a1) this.b;
                com.google.common.util.concurrent.s sVar = (com.google.common.util.concurrent.s) this.c;
                a1Var.m((Uri) com.google.common.util.concurrent.n0.b((ListenableFuture) a1Var.c), obj);
                synchronized (a1Var.i) {
                    a1Var.k = sVar;
                    break;
                }
                return com.google.common.util.concurrent.n0.d(obj);
            case 3:
                return ((qe) this.b).a.c.k((xc) this.c, com.google.common.util.concurrent.d0.e);
            default:
                qf qfVar = (qf) this.b;
                pf pfVarC = bf.c();
                qf qfVarB = bf.b(pfVarC, qfVar);
                try {
                    ListenableFuture listenableFutureApply = ((com.google.common.util.concurrent.z) this.c).apply(obj);
                    if (listenableFutureApply == null) {
                        throw new IllegalStateException("AsyncFunction should return a ListenableFuture instead of null.");
                    }
                    bf.b(pfVarC, qfVarB);
                    return listenableFutureApply;
                } catch (Throwable th) {
                    try {
                        af.a(th);
                        throw th;
                    } catch (Throwable th2) {
                        bf.b(pfVarC, qfVarB);
                        throw th2;
                    }
                }
        }
    }

    public String toString() {
        switch (this.a) {
            case 4:
                com.google.common.util.concurrent.z zVar = (com.google.common.util.concurrent.z) this.c;
                StringBuilder sb = new StringBuilder(zVar.toString().length() + 14);
                sb.append("propagating=[");
                sb.append(zVar);
                sb.append("]");
                return sb.toString();
            default:
                return super.toString();
        }
    }
}
