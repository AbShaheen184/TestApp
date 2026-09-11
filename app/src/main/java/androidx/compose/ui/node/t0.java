package androidx.compose.ui.node;

import androidx.appcompat.widget.c2;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 {
    public final f0 a;
    public boolean c;
    public boolean d;
    public androidx.compose.ui.unit.a i;
    public final c2 b = new c2(6);
    public final androidx.compose.foundation.text.input.internal.o e = new androidx.compose.foundation.text.input.internal.o(17);
    public final androidx.compose.runtime.collection.b f = new androidx.compose.runtime.collection.b(new f0[16]);
    public final long g = 1;
    public final androidx.compose.runtime.collection.b h = new androidx.compose.runtime.collection.b(new s0[16]);

    public t0(f0 f0Var) {
        this.a = f0Var;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public static boolean b(f0 f0Var, androidx.compose.ui.unit.a aVar) {
        boolean zZ0;
        f0 f0Var2 = f0Var.F;
        j0 j0Var = f0Var.e0;
        if (f0Var2 == null) {
            return false;
        }
        if (aVar == null) {
            r0 r0Var = j0Var.q;
            androidx.compose.ui.unit.a aVar2 = r0Var != null ? r0Var.J : null;
            if (aVar2 == null || f0Var2 == null) {
                zZ0 = false;
            } else {
                r0Var.getClass();
                zZ0 = r0Var.z0(aVar2.a);
            }
        } else if (f0Var2 != null) {
            r0 r0Var2 = j0Var.q;
            r0Var2.getClass();
            zZ0 = r0Var2.z0(aVar.a);
        } else {
            zZ0 = false;
        }
        f0 f0VarV = f0Var.v();
        if (zZ0 && f0VarV != null) {
            if (f0VarV.F == null) {
                f0.V(f0VarV, false, 3);
                return zZ0;
            }
            if (f0Var.t() == d0.e) {
                f0.T(f0VarV, false, 3);
                return zZ0;
            }
            if (f0Var.t() == d0.y) {
                f0VarV.S(false);
            }
        }
        return zZ0;
    }

    public static boolean c(f0 f0Var, androidx.compose.ui.unit.a aVar) {
        boolean zZ0;
        if (aVar != null) {
            if (f0Var.a0 == d0.z) {
                f0Var.e();
            }
            zZ0 = f0Var.e0.p.z0(aVar.a);
        } else {
            v0 v0Var = f0Var.e0.p;
            androidx.compose.ui.unit.a aVar2 = v0Var.G ? new androidx.compose.ui.unit.a(v0Var.A) : null;
            if (aVar2 != null) {
                if (f0Var.a0 == d0.z) {
                    f0Var.e();
                }
                zZ0 = f0Var.e0.p.z0(aVar2.a);
            } else {
                f0Var.getClass();
                zZ0 = false;
            }
        }
        f0 f0VarV = f0Var.v();
        if (zZ0 && f0VarV != null) {
            if (f0Var.s() == d0.e) {
                f0.V(f0VarV, false, 3);
                return zZ0;
            }
            if (f0Var.s() == d0.y) {
                f0VarV.U(false);
            }
        }
        return zZ0;
    }

    public static boolean h(f0 f0Var) {
        r0 r0Var;
        g0 g0Var;
        if (f0Var.e0.e) {
            return (f0Var.t() == d0.z && ((r0Var = f0Var.e0.q) == null || (g0Var = r0Var.N) == null || !g0Var.e())) ? false : true;
        }
        return false;
    }

    public static boolean i(f0 f0Var) {
        if (!f0Var.r()) {
            return false;
        }
        do {
            if (f0Var.s() == d0.z && !f0Var.e0.p.T.e()) {
                f0 f0VarV = f0Var.v();
                if ((f0VarV != null ? f0VarV.e0.d : null) != b0.e) {
                    return false;
                }
            }
            f0Var = f0Var.v();
            if (f0Var == null) {
                return false;
            }
        } while (!f0Var.I());
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(boolean z) {
        Object[] objArr;
        androidx.compose.foundation.text.input.internal.o oVar = this.e;
        if (z) {
            androidx.compose.runtime.collection.b bVar = (androidx.compose.runtime.collection.b) oVar.y;
            f0 f0Var = this.a;
            if (f0Var.n0 > 0) {
                bVar.g();
                bVar.b(f0Var);
                f0Var.m0 = true;
            }
        }
        androidx.compose.runtime.collection.b bVar2 = (androidx.compose.runtime.collection.b) oVar.y;
        int i = bVar2.z;
        if (i != 0) {
            Arrays.sort(bVar2.e, 0, i, j1.y);
            int i2 = bVar2.z;
            f0[] f0VarArr = (f0[]) oVar.z;
            if (f0VarArr == null || f0VarArr.length < i2) {
                objArr = f0VarArr;
                objArr = new f0[Math.max(16, i2)];
            }
            objArr = f0VarArr;
            oVar.z = null;
            for (int i3 = 0; i3 < i2; i3++) {
                objArr[i3] = bVar2.e[i3];
            }
            bVar2.g();
            for (int i4 = i2 - 1; -1 < i4; i4--) {
                f0 f0Var2 = objArr[i4];
                f0Var2.getClass();
                if (f0Var2.m0) {
                    androidx.compose.foundation.text.input.internal.o.k(f0Var2);
                }
                objArr[i4] = 0;
            }
            oVar.z = objArr;
        }
    }

    public final void d() {
        androidx.compose.runtime.collection.b bVar = this.h;
        int i = bVar.z;
        if (i != 0) {
            Object[] objArr = bVar.e;
            for (int i2 = 0; i2 < i; i2++) {
                s0 s0Var = (s0) objArr[i2];
                if (s0Var.a.H()) {
                    boolean z = s0Var.b;
                    f0 f0Var = s0Var.a;
                    boolean z2 = s0Var.c;
                    if (z) {
                        f0.T(f0Var, z2, 2);
                    } else {
                        f0.V(f0Var, z2, 2);
                    }
                }
            }
            bVar.g();
        }
    }

    public final void e(f0 f0Var) {
        androidx.compose.runtime.collection.b bVarZ = f0Var.z();
        Object[] objArr = bVarZ.e;
        int i = bVarZ.z;
        for (int i2 = 0; i2 < i; i2++) {
            f0 f0Var2 = (f0) objArr[i2];
            if (kotlin.jvm.internal.l.a(f0Var2.J(), Boolean.TRUE) && !f0Var2.o0) {
                if (this.b.s(f0Var2)) {
                    f0Var2.K();
                }
                e(f0Var2);
            }
        }
    }

    public final void f(f0 f0Var, boolean z) {
        if (!this.c) {
            androidx.compose.ui.internal.a.b("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (z ? f0Var.e0.e : f0Var.r()) {
            androidx.compose.ui.internal.a.a("node not yet measured");
        }
        g(f0Var, z);
    }

    public final void g(f0 f0Var, boolean z) {
        r0 r0Var;
        g0 g0Var;
        androidx.compose.runtime.collection.b bVarZ = f0Var.z();
        Object[] objArr = bVarZ.e;
        int i = bVarZ.z;
        for (int i2 = 0; i2 < i; i2++) {
            f0 f0Var2 = (f0) objArr[i2];
            d0 d0Var = d0.e;
            if ((!z && (f0Var2.s() == d0Var || f0Var2.e0.p.T.e())) || (z && (f0Var2.t() == d0Var || ((r0Var = f0Var2.e0.q) != null && (g0Var = r0Var.N) != null && g0Var.e())))) {
                boolean zO = k.o(f0Var2);
                j0 j0Var = f0Var2.e0;
                if (zO && !z) {
                    if (j0Var.e && this.b.s(f0Var2)) {
                        m(f0Var2, true, false);
                    } else {
                        f(f0Var2, true);
                    }
                }
                if (z ? j0Var.e : f0Var2.r()) {
                    m(f0Var2, z, false);
                }
                if (!(z ? j0Var.e : f0Var2.r())) {
                    g(f0Var2, z);
                }
            }
        }
        if (z ? f0Var.e0.e : f0Var.r()) {
            m(f0Var, z, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v2, types: [androidx.compose.ui.q] */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9, types: [androidx.compose.ui.q] */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4, types: [androidx.compose.runtime.collection.b] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [androidx.compose.runtime.collection.b] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r15v4 */
    public final boolean j(androidx.compose.ui.platform.r rVar) {
        boolean z;
        androidx.compose.ui.q qVar;
        ?? bVar;
        ?? E;
        int i;
        boolean z2;
        f0 f0Var;
        boolean z3;
        c2 c2Var = this.b;
        f0 f0Var2 = this.a;
        if (!f0Var2.H()) {
            androidx.compose.ui.internal.a.a("performMeasureAndLayout called with unattached root");
        }
        if (!f0Var2.I()) {
            androidx.compose.ui.internal.a.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.c) {
            androidx.compose.ui.internal.a.a("performMeasureAndLayout called during measure layout");
        }
        int i2 = 0;
        if (this.i != null) {
            this.c = true;
            this.d = true;
            try {
                boolean zO = c2Var.O();
                com.app.mlounge.data.music.e eVar = (com.app.mlounge.data.music.e) c2Var.y;
                if (zO) {
                    z = false;
                    while (true) {
                        com.app.mlounge.data.music.e eVar2 = (com.app.mlounge.data.music.e) c2Var.A;
                        com.app.mlounge.data.music.e eVar3 = (com.app.mlounge.data.music.e) c2Var.z;
                        if (!((v1) eVar.y).isEmpty()) {
                            f0Var = (f0) ((v1) eVar.y).first();
                            eVar.z(f0Var);
                            z3 = f0Var.F != null;
                            z2 = false;
                        } else if (!((v1) eVar3.y).isEmpty()) {
                            f0Var = (f0) ((v1) eVar3.y).first();
                            eVar3.z(f0Var);
                            z3 = f0Var.F != null;
                            z2 = true;
                        } else {
                            if (((v1) eVar2.y).isEmpty()) {
                                break;
                            }
                            f0 f0Var3 = (f0) ((v1) eVar2.y).first();
                            eVar2.z(f0Var3);
                            z2 = true;
                            f0Var = f0Var3;
                            z3 = false;
                        }
                        boolean zM = m(f0Var, z3, z2);
                        if (!z2) {
                            if (f0Var.e0.f) {
                                c2Var.n(f0Var, s.y);
                            }
                            if (f0Var.q()) {
                                c2Var.n(f0Var, s.A);
                            }
                        }
                        if (f0Var == f0Var2 && zM) {
                            z = true;
                        }
                    }
                    if (rVar != null) {
                        rVar.invoke();
                    }
                } else {
                    z = false;
                }
                this.c = false;
                this.d = false;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    this.c = false;
                    this.d = false;
                    throw th2;
                }
            }
        } else {
            z = false;
        }
        androidx.compose.runtime.collection.b bVar2 = this.f;
        Object[] objArr = bVar2.e;
        int i3 = bVar2.z;
        int i4 = 0;
        while (i4 < i3) {
            a1 a1Var = ((f0) objArr[i4]).d0;
            r rVar2 = (r) a1Var.d;
            int i5 = 4194304;
            boolean zG = e1.g(4194304);
            if (zG) {
                qVar = rVar2.o0;
            } else {
                qVar = rVar2.o0.B;
                if (qVar == null) {
                }
                i4++;
                i2 = 0;
            }
            androidx.compose.ui.graphics.k0 k0Var = d1.j0;
            androidx.compose.ui.q qVarV0 = rVar2.V0(zG);
            while (qVarV0 != null && (qVarV0.A & i5) != 0) {
                if ((qVarV0.z & i5) != 0) {
                    ?? r13 = qVarV0;
                    ?? r14 = 0;
                    while (r13 != 0) {
                        if (r13 instanceof u) {
                            ((u) r13).s((r) a1Var.d);
                        } else {
                            if ((r13.z & i5) != 0 && (r13 instanceof j)) {
                                androidx.compose.ui.q qVar2 = ((j) r13).M;
                                while (qVar2 != null) {
                                    int i6 = i5;
                                    if ((qVar2.z & i6) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            E = r13;
                                            bVar = r14;
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
                                        E = r13;
                                        bVar = r14;
                                    }
                                    qVar2 = qVar2.C;
                                    i5 = i6;
                                    E = E;
                                    bVar = bVar;
                                }
                                E = r13;
                                bVar = r14;
                                i = i5;
                                bVar = bVar;
                                if (i2 == 1) {
                                }
                                i5 = i;
                                i2 = 0;
                                r13 = E;
                                r14 = bVar;
                            }
                            E = k.e(bVar);
                            i5 = i;
                            i2 = 0;
                            r13 = E;
                            r14 = bVar;
                        }
                        i = i5;
                        bVar = r14;
                        E = k.e(bVar);
                        i5 = i;
                        i2 = 0;
                        r13 = E;
                        r14 = bVar;
                    }
                }
                int i7 = i5;
                if (qVarV0 == qVar) {
                    break;
                }
                qVarV0 = qVarV0.C;
                i5 = i7;
                i2 = 0;
            }
            i4++;
            i2 = 0;
        }
        bVar2.g();
        return z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v12 */
    /* JADX WARN: Type inference failed for: r12v13 */
    /* JADX WARN: Type inference failed for: r12v2, types: [androidx.compose.ui.q] */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9, types: [androidx.compose.ui.q] */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [androidx.compose.runtime.collection.b] */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7, types: [androidx.compose.runtime.collection.b] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r17v0, types: [androidx.compose.ui.node.f0, java.lang.Object] */
    public final void k(f0 f0Var, long j) {
        androidx.compose.ui.q qVar;
        ?? E;
        boolean z = f0Var.o0;
        j0 j0Var = f0Var.e0;
        if (z) {
            return;
        }
        f0 f0Var2 = this.a;
        if (f0Var.equals(f0Var2)) {
            androidx.compose.ui.internal.a.a("measureAndLayout called on root");
        }
        if (!f0Var2.H()) {
            androidx.compose.ui.internal.a.a("performMeasureAndLayout called with unattached root");
        }
        if (!f0Var2.I()) {
            androidx.compose.ui.internal.a.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.c) {
            androidx.compose.ui.internal.a.a("performMeasureAndLayout called during measure layout");
        }
        int i = 0;
        if (this.i != null) {
            this.c = true;
            this.d = false;
            try {
                c2 c2Var = this.b;
                ((com.app.mlounge.data.music.e) c2Var.y).z(f0Var);
                ((com.app.mlounge.data.music.e) c2Var.z).z(f0Var);
                ((com.app.mlounge.data.music.e) c2Var.A).z(f0Var);
                if (b(f0Var, new androidx.compose.ui.unit.a(j)) || j0Var.f) {
                    if (kotlin.jvm.internal.l.a(f0Var.J(), Boolean.TRUE)) {
                        f0Var.K();
                    }
                }
                e(f0Var);
                if (f0Var.a0 == d0.z) {
                    f0Var.e();
                }
                boolean zZ0 = j0Var.p.z0(j);
                f0 f0VarV = f0Var.v();
                if (zZ0 && f0VarV != null) {
                    if (f0Var.s() == d0.e) {
                        f0.V(f0VarV, false, 3);
                    } else if (f0Var.s() == d0.y) {
                        f0VarV.U(false);
                    }
                }
                if (f0Var.q() && f0Var.I()) {
                    f0Var.R();
                    androidx.compose.foundation.text.input.internal.o oVar = this.e;
                    oVar.getClass();
                    if (f0Var.n0 > 0) {
                        ((androidx.compose.runtime.collection.b) oVar.y).b(f0Var);
                        f0Var.m0 = true;
                    }
                }
                d();
                this.c = false;
                this.d = false;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    this.c = false;
                    this.d = false;
                    throw th2;
                }
            }
        }
        androidx.compose.runtime.collection.b bVar = this.f;
        Object[] objArr = bVar.e;
        int i2 = bVar.z;
        int i3 = 0;
        while (i3 < i2) {
            a1 a1Var = ((f0) objArr[i3]).d0;
            r rVar = (r) a1Var.d;
            boolean zG = e1.g(4194304);
            if (zG) {
                qVar = rVar.o0;
            } else {
                qVar = rVar.o0.B;
                if (qVar == null) {
                }
                i3++;
                i = 0;
            }
            androidx.compose.ui.graphics.k0 k0Var = d1.j0;
            androidx.compose.ui.q qVarV0 = rVar.V0(zG);
            while (qVarV0 != null && (qVarV0.A & 4194304) != 0) {
                if ((qVarV0.z & 4194304) != 0) {
                    ?? r12 = qVarV0;
                    ?? bVar2 = 0;
                    while (r12 != 0) {
                        if (r12 instanceof u) {
                            ((u) r12).s((r) a1Var.d);
                        } else {
                            if ((r12.z & 4194304) != 0 && (r12 instanceof j)) {
                                androidx.compose.ui.q qVar2 = ((j) r12).M;
                                int i4 = i;
                                while (qVar2 != null) {
                                    if ((qVar2.z & 4194304) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            E = r12;
                                            bVar2 = bVar2;
                                            bVar2 = bVar2;
                                            E = qVar2;
                                        } else {
                                            if (bVar2 == 0) {
                                                bVar2 = new androidx.compose.runtime.collection.b(new androidx.compose.ui.q[16]);
                                            }
                                            if (E != 0) {
                                                bVar2.b(E);
                                                E = 0;
                                            }
                                            bVar2.b(qVar2);
                                        }
                                    } else {
                                        E = r12;
                                        bVar2 = bVar2;
                                    }
                                    qVar2 = qVar2.C;
                                    E = E;
                                    bVar2 = bVar2;
                                }
                                if (i4 == 1) {
                                    E = r12;
                                    bVar2 = bVar2;
                                }
                            }
                            i = 0;
                            r12 = E;
                            bVar2 = bVar2;
                        }
                        E = r12;
                        bVar2 = bVar2;
                        E = k.e(bVar2);
                        i = 0;
                        r12 = E;
                        bVar2 = bVar2;
                    }
                }
                if (qVarV0 == qVar) {
                    break;
                }
                qVarV0 = qVarV0.C;
                i = 0;
            }
            i3++;
            i = 0;
        }
        bVar.g();
    }

    public final void l() {
        c2 c2Var = this.b;
        if (c2Var.O()) {
            f0 f0Var = this.a;
            if (!f0Var.H()) {
                androidx.compose.ui.internal.a.a("performMeasureAndLayout called with unattached root");
            }
            if (!f0Var.I()) {
                androidx.compose.ui.internal.a.a("performMeasureAndLayout called with unplaced root");
            }
            if (this.c) {
                androidx.compose.ui.internal.a.a("performMeasureAndLayout called during measure layout");
            }
            if (this.i != null) {
                this.c = true;
                this.d = false;
                try {
                    if (!((v1) ((com.app.mlounge.data.music.e) c2Var.A).y).isEmpty() && !((v1) ((com.app.mlounge.data.music.e) c2Var.y).y).isEmpty()) {
                        if (f0Var.F != null) {
                            o(f0Var, true);
                        } else {
                            n(f0Var);
                        }
                    }
                    o(f0Var, false);
                    this.c = false;
                    this.d = false;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        this.c = false;
                        this.d = false;
                        throw th2;
                    }
                }
            }
        }
    }

    public final boolean m(f0 f0Var, boolean z, boolean z2) {
        androidx.compose.ui.unit.a aVar;
        boolean zB;
        androidx.compose.ui.layout.b1 placementScope;
        r rVar;
        f0 f0VarV;
        r0 r0Var;
        g0 g0Var;
        boolean z3 = f0Var.o0;
        j0 j0Var = f0Var.e0;
        if (z3 || (!f0Var.I() && !j0Var.p.P && !i(f0Var) && !kotlin.jvm.internal.l.a(f0Var.J(), Boolean.TRUE) && !h(f0Var) && !j0Var.p.T.e() && ((r0Var = j0Var.q) == null || (g0Var = r0Var.N) == null || !g0Var.e()))) {
            return false;
        }
        f0 f0Var2 = this.a;
        if (f0Var == f0Var2) {
            aVar = this.i;
            aVar.getClass();
        } else {
            aVar = null;
        }
        if (z) {
            zB = j0Var.e ? b(f0Var, aVar) : false;
            if (z2 && ((zB || j0Var.f) && kotlin.jvm.internal.l.a(f0Var.J(), Boolean.TRUE))) {
                f0Var.K();
            }
        } else {
            boolean zC = f0Var.r() ? c(f0Var, aVar) : false;
            if (z2 && f0Var.q() && (f0Var == f0Var2 || ((f0VarV = f0Var.v()) != null && f0VarV.I() && j0Var.p.P))) {
                if (f0Var == f0Var2) {
                    if (f0Var.a0 == d0.z) {
                        f0Var.f();
                    }
                    f0 f0VarV2 = f0Var.v();
                    if (f0VarV2 == null || (rVar = (r) f0VarV2.d0.d) == null || (placementScope = rVar.I) == null) {
                        placementScope = ((androidx.compose.ui.platform.u) i0.a(f0Var)).getPlacementScope();
                    }
                    androidx.compose.ui.layout.b1.l(placementScope, j0Var.p, 0, 0);
                } else {
                    f0Var.R();
                }
                androidx.compose.foundation.text.input.internal.o oVar = this.e;
                oVar.getClass();
                if (f0Var.n0 > 0) {
                    ((androidx.compose.runtime.collection.b) oVar.y).b(f0Var);
                    f0Var.m0 = true;
                }
            }
            zB = zC;
        }
        d();
        return zB;
    }

    public final void n(f0 f0Var) {
        androidx.compose.runtime.collection.b bVarZ = f0Var.z();
        Object[] objArr = bVarZ.e;
        int i = bVarZ.z;
        for (int i2 = 0; i2 < i; i2++) {
            f0 f0Var2 = (f0) objArr[i2];
            if (f0Var2.s() == d0.e || f0Var2.e0.p.T.e()) {
                if (k.o(f0Var2)) {
                    o(f0Var2, true);
                } else {
                    n(f0Var2);
                }
            }
        }
    }

    public final void o(f0 f0Var, boolean z) {
        androidx.compose.ui.unit.a aVar;
        if (f0Var.o0) {
            return;
        }
        if (f0Var == this.a) {
            aVar = this.i;
            aVar.getClass();
        } else {
            aVar = null;
        }
        if (z) {
            b(f0Var, aVar);
        } else {
            c(f0Var, aVar);
        }
    }

    public final boolean p(f0 f0Var, boolean z) {
        int iOrdinal = f0Var.e0.d.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2 || iOrdinal == 3) {
                this.h.b(new s0(f0Var, false, z));
            } else {
                if (iOrdinal != 4) {
                    coil3.g.a();
                    return false;
                }
                if (!f0Var.r() || z) {
                    f0Var.e0.p.Q = true;
                    if (!f0Var.o0 && (f0Var.I() || i(f0Var))) {
                        f0 f0VarV = f0Var.v();
                        if (f0VarV == null || !f0VarV.r()) {
                            this.b.n(f0Var, s.z);
                        }
                        if (!this.d) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void q(long j) {
        androidx.compose.ui.unit.a aVar = this.i;
        if (aVar == null ? false : androidx.compose.ui.unit.a.b(aVar.a, j)) {
            return;
        }
        if (this.c) {
            androidx.compose.ui.internal.a.a("updateRootConstraints called while measuring");
        }
        this.i = new androidx.compose.ui.unit.a(j);
        f0 f0Var = this.a;
        f0 f0Var2 = f0Var.F;
        j0 j0Var = f0Var.e0;
        if (f0Var2 != null) {
            j0Var.e = true;
        }
        j0Var.p.Q = true;
        this.b.n(f0Var, f0Var2 != null ? s.e : s.z);
    }
}
