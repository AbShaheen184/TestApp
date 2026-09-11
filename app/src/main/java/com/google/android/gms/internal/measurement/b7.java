package com.google.android.gms.internal.measurement;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b7 implements com.google.common.util.concurrent.y {
    public final Object A;
    public final Object B;
    public final /* synthetic */ int e;
    public final Object y;
    public final Object z;

    public b7() {
        this.e = 0;
        j5 j5Var = new j5(0);
        this.z = j5Var;
        b7 b7Var = new b7(null, j5Var);
        this.A = b7Var;
        this.y = b7Var.d();
        s5 s5Var = new s5(5);
        this.B = s5Var;
        b7Var.f("require", new df(s5Var));
        ((HashMap) s5Var.y).put("internal.platform", u6.b);
        b7Var.f("runtime.counter", new j3(Double.valueOf(0.0d)));
    }

    public d5 a(d5 d5Var) {
        return ((j5) this.z).f(this, d5Var);
    }

    public d5 b(b7 b7Var, o9... o9VarArr) {
        d5 d5VarH = d5.m;
        for (o9 o9Var : o9VarArr) {
            d5VarH = ka.h(o9Var);
            ea.y((b7) this.A);
            if ((d5VarH instanceof e5) || (d5VarH instanceof c5)) {
                d5VarH = ((j5) this.z).f(b7Var, d5VarH);
            }
        }
        return d5VarH;
    }

    public d5 c(l1 l1Var) {
        d5 d5VarF = d5.m;
        Iterator itO = l1Var.o();
        while (itO.hasNext()) {
            d5VarF = ((j5) this.z).f(this, l1Var.q(((Integer) itO.next()).intValue()));
            if (d5VarF instanceof r2) {
                break;
            }
        }
        return d5VarF;
    }

    @Override // com.google.common.util.concurrent.y
    public ListenableFuture call() {
        int i = this.e;
        Object obj = this.y;
        com.google.common.util.concurrent.d0 d0Var = com.google.common.util.concurrent.d0.e;
        int i2 = 4;
        Object obj2 = this.B;
        Object obj3 = this.A;
        Object obj4 = this.z;
        switch (i) {
            case 2:
                final androidx.compose.ui.node.a1 a1Var = (androidx.compose.ui.node.a1) obj4;
                final int i3 = 0;
                final com.google.common.util.concurrent.s sVarG = com.google.common.util.concurrent.n0.g((ListenableFuture) obj, new ne(a1Var, i3), d0Var);
                final com.google.common.util.concurrent.s sVarG2 = com.google.common.util.concurrent.n0.g(sVarG, (xc) obj3, (Executor) obj2);
                com.google.common.util.concurrent.z zVar = new com.google.common.util.concurrent.z() { // from class: com.google.android.gms.internal.measurement.pe
                    @Override // com.google.common.util.concurrent.z
                    public final ListenableFuture apply(Object obj5) {
                        switch (i3) {
                            case 0:
                                androidx.compose.ui.node.a1 a1Var2 = (androidx.compose.ui.node.a1) a1Var;
                                com.google.common.util.concurrent.s sVar = (com.google.common.util.concurrent.s) sVarG;
                                com.google.common.util.concurrent.s sVar2 = (com.google.common.util.concurrent.s) sVarG2;
                                if (com.google.common.util.concurrent.n0.b(sVar).equals(com.google.common.util.concurrent.n0.b(sVar2))) {
                                    return com.google.common.util.concurrent.n0.d(obj5);
                                }
                                xc xcVar = new xc(2, a1Var2, sVar2);
                                int i4 = rf.a;
                                com.google.common.util.concurrent.s sVarG3 = com.google.common.util.concurrent.n0.g(sVar2, new xc(4, bf.a(), xcVar), (com.google.common.util.concurrent.x0) a1Var2.e);
                                synchronized (a1Var2.i) {
                                    break;
                                }
                                return sVarG3;
                            default:
                                le leVar = (le) a1Var;
                                return leVar.c.k((xc) sVarG, (Executor) sVarG2);
                        }
                    }
                };
                int i4 = rf.a;
                return com.google.common.util.concurrent.n0.g(sVarG2, new xc(i2, bf.a(), zVar), d0Var);
            default:
                final le leVar = (le) obj4;
                final xc xcVar = (xc) obj3;
                final Executor executor = (Executor) obj2;
                final int i5 = 1;
                com.google.common.util.concurrent.z zVar2 = new com.google.common.util.concurrent.z() { // from class: com.google.android.gms.internal.measurement.pe
                    @Override // com.google.common.util.concurrent.z
                    public final ListenableFuture apply(Object obj5) {
                        switch (i5) {
                            case 0:
                                androidx.compose.ui.node.a1 a1Var2 = (androidx.compose.ui.node.a1) leVar;
                                com.google.common.util.concurrent.s sVar = (com.google.common.util.concurrent.s) xcVar;
                                com.google.common.util.concurrent.s sVar2 = (com.google.common.util.concurrent.s) executor;
                                if (com.google.common.util.concurrent.n0.b(sVar).equals(com.google.common.util.concurrent.n0.b(sVar2))) {
                                    return com.google.common.util.concurrent.n0.d(obj5);
                                }
                                xc xcVar2 = new xc(2, a1Var2, sVar2);
                                int i6 = rf.a;
                                com.google.common.util.concurrent.s sVarG3 = com.google.common.util.concurrent.n0.g(sVar2, new xc(4, bf.a(), xcVar2), (com.google.common.util.concurrent.x0) a1Var2.e);
                                synchronized (a1Var2.i) {
                                    break;
                                }
                                return sVarG3;
                            default:
                                le leVar2 = (le) leVar;
                                return leVar2.c.k((xc) xcVar, (Executor) executor);
                        }
                    }
                };
                int i6 = rf.a;
                return com.google.common.util.concurrent.n0.g((com.google.common.util.concurrent.r) obj, new xc(i2, bf.a(), zVar2), d0Var);
        }
    }

    public b7 d() {
        return new b7(this, (j5) this.z);
    }

    public boolean e(String str) {
        if (((HashMap) this.A).containsKey(str)) {
            return true;
        }
        b7 b7Var = (b7) this.y;
        if (b7Var != null) {
            return b7Var.e(str);
        }
        return false;
    }

    public void f(String str, d5 d5Var) {
        b7 b7Var;
        HashMap map = (HashMap) this.A;
        if (!map.containsKey(str) && (b7Var = (b7) this.y) != null && b7Var.e(str)) {
            b7Var.f(str, d5Var);
        } else {
            if (((HashMap) this.B).containsKey(str)) {
                return;
            }
            if (d5Var == null) {
                map.remove(str);
            } else {
                map.put(str, d5Var);
            }
        }
    }

    public void g(String str, d5 d5Var) {
        if (((HashMap) this.B).containsKey(str)) {
            return;
        }
        HashMap map = (HashMap) this.A;
        if (d5Var == null) {
            map.remove(str);
        } else {
            map.put(str, d5Var);
        }
    }

    public d5 h(String str) {
        HashMap map = (HashMap) this.A;
        if (map.containsKey(str)) {
            return (d5) map.get(str);
        }
        b7 b7Var = (b7) this.y;
        if (b7Var != null) {
            return b7Var.h(str);
        }
        net.luminis.tls.engine.impl.c.o(androidx.constraintlayout.core.g.c(str, " is not defined"));
        return null;
    }

    public /* synthetic */ b7(Object obj, ListenableFuture listenableFuture, xc xcVar, Executor executor, int i) {
        this.e = i;
        this.z = obj;
        this.y = listenableFuture;
        this.A = xcVar;
        this.B = executor;
    }

    public b7(b7 b7Var, j5 j5Var) {
        this.e = 1;
        this.A = new HashMap();
        this.B = new HashMap();
        this.y = b7Var;
        this.z = j5Var;
    }
}
