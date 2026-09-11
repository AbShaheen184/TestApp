package androidx.compose.ui.focus;

import android.os.Trace;
import androidx.compose.ui.node.a1;
import androidx.compose.ui.node.h1;
import androidx.compose.ui.node.w1;
import androidx.compose.ui.platform.l1;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends androidx.compose.ui.q implements androidx.compose.ui.node.h, androidx.compose.ui.node.u, h1, androidx.compose.ui.modifier.c, androidx.compose.ui.node.i {
    public final boolean L;
    public final kotlin.jvm.functions.p M;
    public boolean N;
    public boolean O;
    public final int P;

    public e0(int i, kotlin.jvm.functions.p pVar, int i2) {
        i = (i2 & 1) != 0 ? 1 : i;
        boolean z = (i2 & 2) == 0;
        pVar = (i2 & 4) != 0 ? null : pVar;
        this.L = z;
        this.M = pVar;
        this.P = i;
    }

    @Override // androidx.compose.ui.q
    public final boolean A0() {
        return false;
    }

    @Override // androidx.compose.ui.q
    public final void E0() {
        int iOrdinal = Q0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                l focusOwner = ((androidx.compose.ui.platform.u) androidx.compose.ui.node.k.u(this)).getFocusOwner();
                e0 e0VarF = d.f(this);
                if (e0VarF == null || !e0VarF.L) {
                    return;
                }
                p pVar = (p) focusOwner;
                pVar.a.G();
                pVar.d.a();
                return;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return;
                }
                coil3.g.a();
                return;
            }
        }
        p pVar2 = (p) ((androidx.compose.ui.platform.u) androidx.compose.ui.node.k.u(this)).getFocusOwner();
        pVar2.b(8, true, false);
        if (this.L) {
            pVar2.a.G();
        }
        pVar2.d.a();
    }

    @Override // androidx.compose.ui.q
    public final void F0() {
        if (Q0().a()) {
            ((p) ((androidx.compose.ui.platform.u) androidx.compose.ui.node.k.u(this)).getFocusOwner()).b(8, true, true);
        }
    }

    public final boolean L0(int i) {
        int iOrdinal = d.w(this, i).ordinal();
        if (iOrdinal == 0) {
            return d.x(this);
        }
        if (iOrdinal == 1) {
            return false;
        }
        if (iOrdinal == 2) {
            return true;
        }
        if (iOrdinal == 3) {
            return false;
        }
        coil3.g.a();
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11, types: [androidx.compose.ui.q] */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [androidx.compose.ui.q] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [androidx.compose.runtime.collection.b] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7, types: [androidx.compose.runtime.collection.b] */
    /* JADX WARN: Type inference failed for: r7v5 */
    public final void M0(c0 c0Var, c0 c0Var2) {
        a1 a1Var;
        kotlin.jvm.functions.p pVar;
        p pVar2 = (p) ((androidx.compose.ui.platform.u) androidx.compose.ui.node.k.u(this)).getFocusOwner();
        e0 e0VarF = pVar2.f();
        if (!c0Var.equals(c0Var2) && (pVar = this.M) != null) {
            pVar.invoke(c0Var, c0Var2);
        }
        androidx.compose.ui.q qVar = this.e;
        if (!qVar.K) {
            androidx.compose.ui.internal.a.b("visitAncestors called on an unattached node");
        }
        androidx.compose.ui.q qVar2 = this.e;
        androidx.compose.ui.node.f0 f0VarT = androidx.compose.ui.node.k.t(this);
        while (f0VarT != null) {
            if ((((androidx.compose.ui.q) f0VarT.d0.g).A & 5120) != 0) {
                while (qVar2 != null) {
                    int i = qVar2.z;
                    if ((i & 5120) != 0) {
                        if (qVar2 != qVar && (i & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                            return;
                        }
                        if ((i & 4096) != 0) {
                            ?? E = qVar2;
                            ?? bVar = 0;
                            while (E != 0) {
                                if (E instanceof g) {
                                    g gVar = (g) E;
                                    if (e0VarF == pVar2.f()) {
                                        gVar.X(c0Var2);
                                    }
                                } else if ((E.z & 4096) != 0 && (E instanceof androidx.compose.ui.node.j)) {
                                    androidx.compose.ui.q qVar3 = ((androidx.compose.ui.node.j) E).M;
                                    int i2 = 0;
                                    E = E;
                                    bVar = bVar;
                                    while (qVar3 != null) {
                                        if ((qVar3.z & 4096) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                bVar = bVar;
                                                E = qVar3;
                                            } else {
                                                if (bVar == 0) {
                                                    bVar = new androidx.compose.runtime.collection.b(new androidx.compose.ui.q[16]);
                                                }
                                                if (E != 0) {
                                                    bVar.b(E);
                                                    E = 0;
                                                }
                                                bVar.b(qVar3);
                                            }
                                        }
                                        qVar3 = qVar3.C;
                                        E = E;
                                        bVar = bVar;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                E = androidx.compose.ui.node.k.e(bVar);
                            }
                        }
                    }
                    qVar2 = qVar2.B;
                }
            }
            f0VarT = f0VarT.v();
            qVar2 = (f0VarT == null || (a1Var = f0VarT.d0) == null) ? null : (w1) a1Var.f;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [androidx.compose.ui.q] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [androidx.compose.ui.q] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [androidx.compose.runtime.collection.b] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [androidx.compose.runtime.collection.b] */
    /* JADX WARN: Type inference failed for: r9v4 */
    public final u N0() {
        boolean z;
        a1 a1Var;
        u uVar = new u();
        uVar.a = true;
        y yVar = y.b;
        uVar.b = yVar;
        uVar.c = yVar;
        uVar.d = yVar;
        uVar.e = yVar;
        uVar.f = yVar;
        uVar.g = yVar;
        uVar.h = yVar;
        uVar.i = yVar;
        uVar.j = t.z;
        uVar.k = t.A;
        uVar.l = q.a;
        int i = this.P;
        if (i == 1) {
            z = true;
        } else if (i == 0) {
            z = !(((androidx.compose.ui.input.a) ((androidx.compose.ui.input.c) ((androidx.compose.ui.input.b) androidx.compose.ui.node.k.h(this, l1.m))).a.getValue()).a == 1);
        } else {
            if (i != 2) {
                net.luminis.tls.engine.impl.c.r("Unknown Focusability");
                return null;
            }
            z = false;
        }
        uVar.a = z;
        androidx.compose.ui.q qVar = this.e;
        if (!qVar.K) {
            androidx.compose.ui.internal.a.b("visitAncestors called on an unattached node");
        }
        androidx.compose.ui.q qVar2 = this.e;
        androidx.compose.ui.node.f0 f0VarT = androidx.compose.ui.node.k.t(this);
        loop0: while (f0VarT != null) {
            if ((((androidx.compose.ui.q) f0VarT.d0.g).A & 3072) != 0) {
                while (qVar2 != null) {
                    int i2 = qVar2.z;
                    if ((i2 & 3072) != 0) {
                        if (qVar2 != qVar && (i2 & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                            break loop0;
                        }
                        if ((i2 & 2048) != 0) {
                            ?? E = qVar2;
                            ?? bVar = 0;
                            while (E != 0) {
                                if (E instanceof w) {
                                    ((w) E).u(uVar);
                                } else if ((E.z & 2048) != 0 && (E instanceof androidx.compose.ui.node.j)) {
                                    androidx.compose.ui.q qVar3 = ((androidx.compose.ui.node.j) E).M;
                                    int i3 = 0;
                                    while (qVar3 != null) {
                                        if ((qVar3.z & 2048) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                E = E;
                                                bVar = bVar;
                                                bVar = bVar;
                                                E = qVar3;
                                            } else {
                                                if (bVar == 0) {
                                                    bVar = new androidx.compose.runtime.collection.b(new androidx.compose.ui.q[16]);
                                                }
                                                if (E != 0) {
                                                    bVar.b(E);
                                                    E = 0;
                                                }
                                                bVar.b(qVar3);
                                            }
                                        } else {
                                            E = E;
                                            bVar = bVar;
                                        }
                                        qVar3 = qVar3.C;
                                        E = E;
                                        bVar = bVar;
                                    }
                                    if (i3 == 1) {
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
                    qVar2 = qVar2.B;
                }
            }
            f0VarT = f0VarT.v();
            qVar2 = (f0VarT == null || (a1Var = f0VarT.d0) == null) ? null : (w1) a1Var.f;
        }
        return uVar;
    }

    public final androidx.compose.ui.geometry.c O0(androidx.compose.ui.layout.x xVar) {
        androidx.compose.ui.geometry.c cVar = N0().l;
        if (cVar != q.a) {
            return xVar == null ? cVar : cVar.i(xVar.D(androidx.compose.ui.node.k.s(this), 0L));
        }
        return xVar != null ? xVar.s(androidx.compose.ui.node.k.s(this), false) : com.google.android.gms.dynamite.g.c(0L, coil3.network.g.x(androidx.compose.ui.node.k.s(this).z));
    }

    public final androidx.compose.foundation.lazy.layout.p P0() {
        a1 a1Var;
        Object obj;
        if (!this.e.K) {
            androidx.compose.ui.internal.a.b("visitAncestors called on an unattached node");
        }
        androidx.compose.ui.q qVar = this.e.B;
        androidx.compose.ui.node.f0 f0VarT = androidx.compose.ui.node.k.t(this);
        loop0: while (f0VarT != null) {
            if ((((androidx.compose.ui.q) f0VarT.d0.g).A & 8388640) != 0) {
                while (qVar != null) {
                    int i = qVar.z;
                    if ((i & 8388640) != 0) {
                        if ((8388608 & i) != 0) {
                            if (!(qVar instanceof androidx.compose.foundation.lazy.layout.p)) {
                                if (qVar instanceof androidx.compose.ui.node.j) {
                                    androidx.compose.ui.q qVar2 = null;
                                    for (androidx.compose.ui.q qVar3 = ((androidx.compose.ui.node.j) qVar).M; qVar3 != null; qVar3 = qVar3.C) {
                                        if (qVar3 instanceof androidx.compose.foundation.lazy.layout.p) {
                                            qVar2 = qVar3;
                                        }
                                    }
                                    qVar = qVar2;
                                } else {
                                    qVar = null;
                                }
                            }
                            androidx.compose.foundation.lazy.layout.p pVar = (androidx.compose.foundation.lazy.layout.p) qVar;
                            if (pVar != null) {
                                return pVar;
                            }
                        } else if ((i & 32) != 0) {
                            if (qVar instanceof androidx.compose.ui.modifier.c) {
                                obj = qVar;
                            } else if (qVar instanceof androidx.compose.ui.node.j) {
                                obj = null;
                                for (androidx.compose.ui.q qVar4 = ((androidx.compose.ui.node.j) qVar).M; qVar4 != null; qVar4 = qVar4.C) {
                                    if (qVar4 instanceof androidx.compose.ui.modifier.c) {
                                        obj = qVar4;
                                    }
                                }
                            } else {
                                obj = null;
                            }
                            androidx.compose.ui.modifier.c cVar = (androidx.compose.ui.modifier.c) obj;
                            if (cVar != null) {
                                cVar.S().getClass();
                            }
                        }
                    }
                    qVar = qVar.B;
                }
            }
            f0VarT = f0VarT.v();
            qVar = (f0VarT == null || (a1Var = f0VarT.d0) == null) ? null : (w1) a1Var.f;
        }
        return null;
    }

    public final c0 Q0() {
        e0 e0VarF;
        a1 a1Var;
        boolean z = this.K;
        c0 c0Var = c0.z;
        if (!z || (e0VarF = ((p) ((androidx.compose.ui.platform.u) androidx.compose.ui.node.k.u(this)).getFocusOwner()).f()) == null) {
            return c0Var;
        }
        if (this == e0VarF) {
            return c0.e;
        }
        if (e0VarF.K) {
            if (!e0VarF.e.K) {
                androidx.compose.ui.internal.a.b("visitAncestors called on an unattached node");
            }
            androidx.compose.ui.q qVar = e0VarF.e.B;
            androidx.compose.ui.node.f0 f0VarT = androidx.compose.ui.node.k.t(e0VarF);
            while (f0VarT != null) {
                if ((((androidx.compose.ui.q) f0VarT.d0.g).A & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                    while (qVar != null) {
                        if ((qVar.z & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                            androidx.compose.ui.q qVarE = qVar;
                            androidx.compose.runtime.collection.b bVar = null;
                            while (qVarE != null) {
                                if (qVarE instanceof e0) {
                                    if (this == ((e0) qVarE)) {
                                        return c0.y;
                                    }
                                } else if ((qVarE.z & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0 && (qVarE instanceof androidx.compose.ui.node.j)) {
                                    int i = 0;
                                    for (androidx.compose.ui.q qVar2 = ((androidx.compose.ui.node.j) qVarE).M; qVar2 != null; qVar2 = qVar2.C) {
                                        if ((qVar2.z & LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) != 0) {
                                            i++;
                                            if (i == 1) {
                                                qVarE = qVar2;
                                            } else {
                                                if (bVar == null) {
                                                    bVar = new androidx.compose.runtime.collection.b(new androidx.compose.ui.q[16]);
                                                }
                                                if (qVarE != null) {
                                                    bVar.b(qVarE);
                                                    qVarE = null;
                                                }
                                                bVar.b(qVar2);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                qVarE = androidx.compose.ui.node.k.e(bVar);
                            }
                        }
                        qVar = qVar.B;
                    }
                }
                f0VarT = f0VarT.v();
                qVar = (f0VarT == null || (a1Var = f0VarT.d0) == null) ? null : (w1) a1Var.f;
            }
        }
        return c0Var;
    }

    public final void R0() {
        int iOrdinal = Q0().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return;
                }
                coil3.g.a();
                return;
            }
        }
        kotlin.jvm.internal.z zVar = new kotlin.jvm.internal.z();
        androidx.compose.ui.node.k.p(this, new androidx.compose.ui.draw.b(1, zVar, this));
        Object obj = zVar.e;
        if (obj == null) {
            kotlin.jvm.internal.l.f("focusProperties");
            throw null;
        }
        if (((r) obj).b()) {
            return;
        }
        ((p) ((androidx.compose.ui.platform.u) androidx.compose.ui.node.k.u(this)).getFocusOwner()).b(8, true, true);
    }

    public final boolean S0(int i) {
        Trace.beginSection("FocusTransactions:requestFocus");
        try {
            return N0().a ? L0(i) : d.h(this, i, new o(i, 2));
        } finally {
            Trace.endSection();
        }
    }

    @Override // androidx.compose.ui.node.h1
    public final void e0() {
        R0();
    }

    @Override // androidx.compose.ui.node.u
    public final void s(androidx.compose.ui.layout.x xVar) {
    }
}
