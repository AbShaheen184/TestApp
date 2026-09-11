package androidx.compose.ui.layout;

import androidx.compose.ui.node.y1;
import androidx.compose.ui.node.z1;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 implements j1 {
    public final androidx.collection.a0 a;
    public final /* synthetic */ m0 b;
    public final /* synthetic */ Object c;

    public l0(m0 m0Var, Object obj) {
        this.b = m0Var;
        this.c = obj;
        int[] iArr = androidx.collection.p.a;
        this.a = new androidx.collection.a0();
    }

    @Override // androidx.compose.ui.layout.j1
    public final int a() {
        androidx.compose.ui.node.f0 f0Var = (androidx.compose.ui.node.f0) this.b.G.g(this.c);
        if (f0Var != null) {
            return ((androidx.compose.runtime.collection.b) ((androidx.collection.h0) f0Var.n()).y).z;
        }
        return 0;
    }

    @Override // androidx.compose.ui.layout.j1
    public final long b(int i) {
        androidx.compose.ui.node.f0 f0Var = (androidx.compose.ui.node.f0) this.b.G.g(this.c);
        if (f0Var == null || !f0Var.H()) {
            return 0L;
        }
        int i2 = ((androidx.compose.runtime.collection.b) ((androidx.collection.h0) f0Var.n()).y).z;
        if (i < 0 || i >= i2) {
            androidx.compose.ui.internal.a.d("Index (" + i + ") is out of bound of [0, " + i2 + ')');
        }
        if (!this.a.b(i)) {
            return 0L;
        }
        return (((long) ((androidx.compose.ui.node.f0) ((androidx.collection.h0) f0Var.n()).get(i)).e0.p.e) << 32) | (((long) ((androidx.compose.ui.node.f0) ((androidx.collection.h0) f0Var.n()).get(i)).e0.p.y) & 4294967295L);
    }

    @Override // androidx.compose.ui.layout.j1
    public final void c(int i, long j) {
        m0 m0Var = this.b;
        androidx.compose.ui.node.f0 f0Var = (androidx.compose.ui.node.f0) m0Var.G.g(this.c);
        if (f0Var == null || !f0Var.H()) {
            return;
        }
        int i2 = ((androidx.compose.runtime.collection.b) ((androidx.collection.h0) f0Var.n()).y).z;
        if (i < 0 || i >= i2) {
            androidx.compose.ui.internal.a.d("Index (" + i + ") is out of bound of [0, " + i2 + ')');
        }
        if (f0Var.I()) {
            androidx.compose.ui.internal.a.a("Pre-measure called on node that is not placed");
        }
        androidx.compose.ui.node.f0 f0Var2 = m0Var.e;
        f0Var2.O = true;
        ((androidx.compose.ui.platform.u) androidx.compose.ui.node.i0.a(f0Var)).v((androidx.compose.ui.node.f0) ((androidx.collection.h0) f0Var.n()).get(i), j);
        f0Var2.O = false;
        this.a.a(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [androidx.compose.foundation.lazy.layout.y0] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [androidx.compose.ui.q] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [androidx.compose.ui.q] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [androidx.compose.runtime.collection.b] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [androidx.compose.runtime.collection.b] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v7 */
    @Override // androidx.compose.ui.layout.j1
    public final void d(androidx.compose.foundation.lazy.layout.y0 y0Var) {
        androidx.compose.ui.node.a1 a1Var;
        androidx.compose.ui.q qVar;
        y1 y1Var;
        androidx.compose.ui.node.f0 f0Var = (androidx.compose.ui.node.f0) this.b.G.g(this.c);
        if (f0Var == null || (a1Var = f0Var.d0) == null || (qVar = (androidx.compose.ui.q) a1Var.g) == null) {
            return;
        }
        if (!qVar.e.K) {
            androidx.compose.ui.internal.a.b("visitSubtreeIf called on an unattached node");
        }
        androidx.compose.runtime.collection.b bVar = new androidx.compose.runtime.collection.b(new androidx.compose.ui.q[16]);
        androidx.compose.ui.q qVar2 = qVar.e;
        androidx.compose.ui.q qVar3 = qVar2.C;
        if (qVar3 == null) {
            androidx.compose.ui.node.k.b(bVar, qVar2);
        } else {
            bVar.b(qVar3);
        }
        while (true) {
            int i = bVar.z;
            if (i == 0) {
                return;
            }
            androidx.compose.ui.q qVar4 = (androidx.compose.ui.q) bVar.k(i - 1);
            if ((qVar4.A & 262144) != 0) {
                androidx.compose.ui.q qVar5 = qVar4;
                while (true) {
                    if (qVar5 != null && qVar5.K) {
                        if ((qVar5.z & 262144) != 0) {
                            ?? E = qVar5;
                            ?? bVar2 = 0;
                            while (E != 0) {
                                if (E instanceof z1) {
                                    z1 z1Var = (z1) E;
                                    boolean zEquals = "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode".equals(z1Var.i());
                                    y1 y1Var2 = y1.y;
                                    if (zEquals) {
                                        y0Var.invoke(z1Var);
                                        y1Var = y1Var2;
                                    } else {
                                        y1Var = y1.e;
                                    }
                                    if (y1Var != y1.z) {
                                        if (y1Var == y1Var2) {
                                            break;
                                        }
                                    } else {
                                        return;
                                    }
                                } else if ((E.z & 262144) != 0 && (E instanceof androidx.compose.ui.node.j)) {
                                    androidx.compose.ui.q qVar6 = ((androidx.compose.ui.node.j) E).M;
                                    int i2 = 0;
                                    E = E;
                                    bVar2 = bVar2;
                                    while (qVar6 != null) {
                                        if ((qVar6.z & 262144) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                bVar2 = bVar2;
                                                E = qVar6;
                                            } else {
                                                if (bVar2 == 0) {
                                                    bVar2 = new androidx.compose.runtime.collection.b(new androidx.compose.ui.q[16]);
                                                }
                                                if (E != 0) {
                                                    bVar2.b(E);
                                                    E = 0;
                                                }
                                                bVar2.b(qVar6);
                                            }
                                        }
                                        qVar6 = qVar6.C;
                                        E = E;
                                        bVar2 = bVar2;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                E = androidx.compose.ui.node.k.e(bVar2);
                            }
                        }
                        qVar5 = qVar5.C;
                    }
                }
            }
            androidx.compose.ui.node.k.b(bVar, qVar4);
        }
    }

    @Override // androidx.compose.ui.layout.j1
    public final void dispose() {
        m0 m0Var = this.b;
        androidx.compose.ui.node.f0 f0Var = m0Var.e;
        m0Var.g();
        androidx.collection.o0 o0Var = m0Var.G;
        Object obj = this.c;
        androidx.compose.ui.node.f0 f0Var2 = (androidx.compose.ui.node.f0) o0Var.k(obj);
        if (f0Var2 != null) {
            if (m0Var.L <= 0) {
                androidx.compose.ui.internal.a.b("No pre-composed items to dispose");
            }
            int i = ((androidx.compose.runtime.collection.b) ((androidx.collection.h0) f0Var.o()).y).i(f0Var2);
            if (i < ((androidx.compose.runtime.collection.b) ((androidx.collection.h0) f0Var.o()).y).z - m0Var.L) {
                androidx.compose.ui.internal.a.b("Item is not in pre-composed item range");
            }
            m0Var.K++;
            m0Var.L--;
            f0 f0Var3 = (f0) m0Var.C.g(f0Var2);
            if (f0Var3 != null) {
                m0.d(f0Var3);
            }
            int i2 = (((androidx.compose.runtime.collection.b) ((androidx.collection.h0) f0Var.o()).y).z - m0Var.L) - m0Var.K;
            m0Var.i(i, i2);
            m0Var.f(i2);
        }
        if (m0Var.J.h(obj)) {
            androidx.compose.ui.node.f0.V(f0Var, true, 6);
        }
    }
}
