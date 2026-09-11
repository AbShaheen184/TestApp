package androidx.compose.ui.semantics;

import androidx.collection.o0;
import androidx.compose.ui.node.d1;
import androidx.compose.ui.node.f0;
import androidx.compose.ui.node.u1;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class p {
    public final androidx.compose.ui.q a;
    public final boolean b;
    public final f0 c;
    public final l d;
    public boolean e;
    public p f;
    public final int g;

    public p(androidx.compose.ui.q qVar, boolean z, f0 f0Var, l lVar) {
        this.a = qVar;
        this.b = z;
        this.c = f0Var;
        this.d = lVar;
        this.g = f0Var.y;
    }

    public static /* synthetic */ List j(int i, p pVar) {
        return pVar.i((i & 1) != 0 ? !pVar.b : false, (i & 2) == 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [androidx.compose.ui.q] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [androidx.compose.ui.q] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [androidx.compose.runtime.collection.b] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [androidx.compose.runtime.collection.b] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v7 */
    public final androidx.compose.ui.geometry.c a(d1 d1Var) {
        ?? E;
        p pVarL = l();
        if (pVarL == null) {
            return androidx.compose.ui.geometry.c.e;
        }
        androidx.compose.ui.q qVar = (androidx.compose.ui.q) pVarL.c.d0.g;
        if ((qVar.A & 8) == 0) {
            E = 0;
            break;
        }
        loop0: while (true) {
            if (qVar != null) {
                if ((qVar.z & 8) != 0) {
                    E = qVar;
                    ?? bVar = 0;
                    while (E != 0) {
                        if (E instanceof u1) {
                            if (((u1) E).f()) {
                                break loop0;
                            }
                        } else if ((E.z & 8) != 0 && (E instanceof androidx.compose.ui.node.j)) {
                            androidx.compose.ui.q qVar2 = ((androidx.compose.ui.node.j) E).M;
                            int i = 0;
                            while (qVar2 != null) {
                                if ((qVar2.z & 8) != 0) {
                                    i++;
                                    if (i == 1) {
                                        E = E;
                                        bVar = bVar;
                                        bVar = bVar;
                                        E = qVar2;
                                    } else {
                                        if (bVar == 0) {
                                            bVar = new androidx.compose.runtime.collection.b(new androidx.compose.ui.q[16]);
                                        }
                                        if (E != 0) {
                                            bVar.b(E);
                                            E = 0;
                                        }
                                        bVar.b(qVar2);
                                    }
                                } else {
                                    E = E;
                                    bVar = bVar;
                                }
                                qVar2 = qVar2.C;
                                E = E;
                                bVar = bVar;
                            }
                            if (i == 1) {
                                E = E;
                                bVar = bVar;
                            } else {
                                E = E;
                                bVar = bVar;
                            }
                        }
                        E = androidx.compose.ui.node.k.e(bVar);
                    }
                }
                if ((qVar.A & 8) != 0) {
                    qVar = qVar.C;
                }
            }
            E = 0;
            break;
        }
        u1 u1Var = (u1) E;
        d1 d1VarR = u1Var != null ? androidx.compose.ui.node.k.r(u1Var, 8) : null;
        return d1VarR == null ? pVarL.a(d1Var) : d1VarR.s(d1Var, true);
    }

    public final p b(h hVar, kotlin.jvm.functions.l lVar) {
        l lVar2 = new l();
        lVar2.z = false;
        lVar2.A = false;
        lVar.invoke(lVar2);
        p pVar = new p(new o(lVar), false, new f0(this.g + (hVar != null ? 1000000000 : 2000000000), true), lVar2);
        pVar.e = true;
        pVar.f = this;
        return pVar;
    }

    public final void c(f0 f0Var, ArrayList arrayList) {
        androidx.compose.runtime.collection.b bVarY = f0Var.y();
        Object[] objArr = bVarY.e;
        int i = bVarY.z;
        for (int i2 = 0; i2 < i; i2++) {
            f0 f0Var2 = (f0) objArr[i2];
            if (f0Var2.H() && !f0Var2.o0) {
                if (f0Var2.d0.f(8)) {
                    arrayList.add(s.a(f0Var2, this.b));
                } else {
                    c(f0Var2, arrayList);
                }
            }
        }
    }

    public final d1 d() {
        if (!this.e) {
            u1 u1VarF = f();
            return u1VarF != null ? androidx.compose.ui.node.k.r(u1VarF, 8) : (androidx.compose.ui.node.r) this.c.d0.d;
        }
        p pVarL = l();
        if (pVarL != null) {
            return pVarL.d();
        }
        return null;
    }

    public final void e(ArrayList arrayList, ArrayList arrayList2) {
        p(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            p pVar = (p) arrayList.get(size2);
            if (pVar.m()) {
                arrayList2.add(pVar);
            } else if (!pVar.d.A) {
                pVar.e(arrayList, arrayList2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r5v10, types: [androidx.compose.ui.q] */
    /* JADX WARN: Type inference failed for: r5v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v24 */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r5v28 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [androidx.compose.ui.q] */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13, types: [androidx.compose.ui.q] */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16, types: [androidx.compose.ui.q] */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v20 */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r6v3, types: [androidx.compose.runtime.collection.b] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [androidx.compose.runtime.collection.b] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15, types: [androidx.compose.runtime.collection.b] */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18, types: [androidx.compose.runtime.collection.b] */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v22 */
    /* JADX WARN: Type inference failed for: r7v23 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r8v10 */
    public final u1 f() {
        ?? E;
        boolean z = this.d.z;
        ?? r4 = 0;
        r4 = 0;
        r4 = 0;
        r4 = 0;
        f0 f0Var = this.c;
        if (!z) {
            androidx.compose.ui.q qVar = (androidx.compose.ui.q) f0Var.d0.g;
            if ((qVar.A & 8) != 0) {
                loop3: while (qVar != null) {
                    if ((qVar.z & 8) != 0) {
                        E = qVar;
                        ?? bVar = 0;
                        while (true) {
                            if (E != 0) {
                                if (E instanceof u1) {
                                    if (((u1) E).f()) {
                                        r4 = E;
                                    }
                                } else if ((E.z & 8) != 0 && (E instanceof androidx.compose.ui.node.j)) {
                                    androidx.compose.ui.q qVar2 = ((androidx.compose.ui.node.j) E).M;
                                    int i = 0;
                                    while (qVar2 != null) {
                                        if ((qVar2.z & 8) != 0) {
                                            i++;
                                            if (i == 1) {
                                                E = E;
                                                bVar = bVar;
                                                bVar = bVar;
                                                E = qVar2;
                                            } else {
                                                if (bVar == 0) {
                                                    bVar = new androidx.compose.runtime.collection.b(new androidx.compose.ui.q[16]);
                                                }
                                                if (E != 0) {
                                                    bVar.b(E);
                                                    E = 0;
                                                }
                                                bVar.b(qVar2);
                                            }
                                        } else {
                                            E = E;
                                            bVar = bVar;
                                        }
                                        qVar2 = qVar2.C;
                                        E = E;
                                        bVar = bVar;
                                    }
                                    if (i == 1) {
                                        E = E;
                                        bVar = bVar;
                                    } else {
                                        E = E;
                                        bVar = bVar;
                                    }
                                }
                                E = androidx.compose.ui.node.k.e(bVar);
                            }
                        }
                    }
                    if ((qVar.A & 8) == 0) {
                        break;
                    }
                    qVar = qVar.C;
                }
            }
        } else {
            androidx.compose.ui.q qVar3 = (androidx.compose.ui.q) f0Var.d0.g;
            if ((qVar3.A & 8) != 0) {
                E = 0;
                while (qVar3 != null) {
                    if ((qVar3.z & 8) != 0) {
                        ?? E2 = qVar3;
                        ?? bVar2 = 0;
                        while (E2 != 0) {
                            if (E2 instanceof u1) {
                                u1 u1Var = (u1) E2;
                                if (u1Var.f()) {
                                    if (u1Var.t0()) {
                                        return u1Var;
                                    }
                                    if (E == 0) {
                                        E = u1Var;
                                    }
                                }
                            } else if ((E2.z & 8) != 0 && (E2 instanceof androidx.compose.ui.node.j)) {
                                androidx.compose.ui.q qVar4 = ((androidx.compose.ui.node.j) E2).M;
                                int i2 = 0;
                                while (qVar4 != null) {
                                    if ((qVar4.z & 8) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            E2 = E2;
                                            bVar2 = bVar2;
                                            bVar2 = bVar2;
                                            E2 = qVar4;
                                        } else {
                                            if (bVar2 == 0) {
                                                bVar2 = new androidx.compose.runtime.collection.b(new androidx.compose.ui.q[16]);
                                            }
                                            if (E2 != 0) {
                                                bVar2.b(E2);
                                                E2 = 0;
                                            }
                                            bVar2.b(qVar4);
                                        }
                                    } else {
                                        E2 = E2;
                                        bVar2 = bVar2;
                                    }
                                    qVar4 = qVar4.C;
                                    E2 = E2;
                                    bVar2 = bVar2;
                                }
                                if (i2 == 1) {
                                    E2 = E2;
                                    bVar2 = bVar2;
                                } else {
                                    E2 = E2;
                                    bVar2 = bVar2;
                                }
                            }
                            E2 = androidx.compose.ui.node.k.e(bVar2);
                        }
                    }
                    if ((qVar3.A & 8) == 0) {
                        break;
                    }
                    qVar3 = qVar3.C;
                    E = E;
                }
                r4 = E;
            }
        }
        return (u1) r4;
    }

    public final androidx.compose.ui.geometry.c g() {
        d1 d1VarD = d();
        if (d1VarD != null) {
            if (!d1VarD.T0().K) {
                d1VarD = null;
            }
            if (d1VarD != null) {
                return androidx.compose.ui.layout.a0.g(d1VarD).s(d1VarD, true);
            }
        }
        return androidx.compose.ui.geometry.c.e;
    }

    public final androidx.compose.ui.geometry.c h() {
        d1 d1VarD = d();
        if (d1VarD != null) {
            if (!d1VarD.T0().K) {
                d1VarD = null;
            }
            if (d1VarD != null) {
                return androidx.compose.ui.layout.a0.e(d1VarD, true);
            }
        }
        return androidx.compose.ui.geometry.c.e;
    }

    public final List i(boolean z, boolean z2) {
        if (!z && this.d.A) {
            return kotlin.collections.u.e;
        }
        ArrayList arrayList = new ArrayList();
        if (!m()) {
            return p(arrayList, z2);
        }
        ArrayList arrayList2 = new ArrayList();
        e(arrayList, arrayList2);
        return arrayList2;
    }

    public final l k() {
        boolean zM = m();
        l lVar = this.d;
        if (!zM) {
            return lVar;
        }
        l lVarC = lVar.c();
        o(new ArrayList(), lVarC);
        return lVarC;
    }

    public final p l() {
        f0 f0VarV;
        p pVar = this.f;
        if (pVar != null) {
            return pVar;
        }
        f0 f0Var = this.c;
        boolean z = this.b;
        if (!z) {
            f0VarV = null;
            break;
        }
        f0VarV = f0Var.v();
        while (true) {
            if (f0VarV == null) {
                f0VarV = null;
                break;
            }
            l lVarX = f0VarV.x();
            if (lVarX != null && lVarX.z) {
                break;
            }
            f0VarV = f0VarV.v();
        }
        if (f0VarV == null) {
            for (f0 f0VarV2 = f0Var.v(); f0VarV2 != null; f0VarV2 = f0VarV2.v()) {
                if (f0VarV2.d0.f(8)) {
                    f0VarV = f0VarV2;
                }
            }
            f0VarV = null;
        }
        if (f0VarV == null) {
            return null;
        }
        return s.a(f0VarV, z);
    }

    public final boolean m() {
        return this.b && this.d.z;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x002b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:? A[RETURN, SYNTHETIC] */
    public final boolean n() {
        if (this.e || !j(4, this).isEmpty()) {
            return false;
        }
        f0 f0VarV = this.c.v();
        while (f0VarV != null) {
            l lVarX = f0VarV.x();
            if (lVarX != null && lVarX.z) {
                if (f0VarV == null) {
                    return true;
                }
                return false;
            }
            f0VarV = f0VarV.v();
        }
        f0VarV = null;
        if (f0VarV == null) {
            return true;
        }
        return false;
    }

    public final void o(ArrayList arrayList, l lVar) {
        if (this.d.A) {
            return;
        }
        p(arrayList, false);
        int size = arrayList.size();
        for (int size2 = arrayList.size(); size2 < size; size2++) {
            p pVar = (p) arrayList.get(size2);
            if (!pVar.m()) {
                lVar.e(pVar.d);
                pVar.o(arrayList, lVar);
            }
        }
    }

    public final List p(ArrayList arrayList, boolean z) {
        if (this.e) {
            return kotlin.collections.u.e;
        }
        c(this.c, arrayList);
        if (z) {
            l lVar = this.d;
            o0 o0Var = lVar.e;
            Object objG = o0Var.g(t.y);
            if (objG == null) {
                objG = null;
            }
            h hVar = (h) objG;
            if (hVar != null && lVar.z && !arrayList.isEmpty()) {
                arrayList.add(b(hVar, new androidx.compose.animation.e(hVar, 21)));
            }
            w wVar = t.a;
            if (o0Var.c(wVar) && !arrayList.isEmpty() && lVar.z) {
                Object objG2 = o0Var.g(wVar);
                if (objG2 == null) {
                    objG2 = null;
                }
                List list = (List) objG2;
                String str = list != null ? (String) kotlin.collections.o.M(list) : null;
                if (str != null) {
                    arrayList.add(0, b(null, new androidx.compose.animation.e(str, 22)));
                }
            }
        }
        return arrayList;
    }
}
