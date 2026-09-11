package androidx.compose.ui.node;

import android.view.View;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k {
    public static final j1 a = new j1(1);

    public static final long a(float f, boolean z, boolean z2) {
        return (((z ? 1L : 0L) | (z2 ? 2L : 0L)) & 4294967295L) | (((long) Float.floatToRawIntBits(f)) << 32);
    }

    public static final void b(androidx.compose.runtime.collection.b bVar, androidx.compose.ui.q qVar) {
        androidx.compose.runtime.collection.b bVarZ = t(qVar).z();
        int i = bVarZ.z - 1;
        Object[] objArr = bVarZ.e;
        if (i < objArr.length) {
            while (i >= 0) {
                bVar.b((androidx.compose.ui.q) ((f0) objArr[i]).d0.g);
                i--;
            }
        }
    }

    public static final int c(n0 n0Var, androidx.compose.ui.layout.a aVar) {
        n0 n0VarV0 = n0Var.v0();
        if (n0VarV0 == null) {
            androidx.compose.ui.internal.a.b("Child of " + n0Var + " cannot be null when calculating alignment line");
        }
        if (n0Var.B0().c().containsKey(aVar)) {
            Integer num = (Integer) n0Var.B0().c().get(aVar);
            if (num != null) {
                return num.intValue();
            }
        } else {
            int iU0 = n0VarV0.u0(aVar);
            if (iU0 != Integer.MIN_VALUE) {
                n0VarV0.G = true;
                n0Var.H = true;
                n0Var.H0();
                n0VarV0.G = false;
                n0Var.H = false;
                return iU0 + ((int) (aVar instanceof androidx.compose.ui.layout.n ? n0VarV0.D0() & 4294967295L : n0VarV0.D0() >> 32));
            }
        }
        return Integer.MIN_VALUE;
    }

    public static final androidx.compose.ui.q d(i iVar, int i) {
        androidx.compose.ui.q qVar = ((androidx.compose.ui.q) iVar).e.C;
        if (qVar == null || (qVar.A & i) == 0) {
            return null;
        }
        while (qVar != null) {
            int i2 = qVar.z;
            if ((i2 & 2) != 0) {
                return null;
            }
            if ((i2 & i) != 0) {
                return qVar;
            }
            qVar = qVar.C;
        }
        return null;
    }

    public static final androidx.compose.ui.q e(androidx.compose.runtime.collection.b bVar) {
        int i;
        if (bVar == null || (i = bVar.z) == 0) {
            return null;
        }
        return (androidx.compose.ui.q) bVar.k(i - 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final v f(androidx.compose.ui.q qVar) {
        if ((qVar.z & 2) != 0) {
            if (qVar instanceof v) {
                return (v) qVar;
            }
            if (qVar instanceof j) {
                androidx.compose.ui.q qVar2 = ((j) qVar).M;
                while (qVar2 != 0) {
                    if (qVar2 instanceof v) {
                        return (v) qVar2;
                    }
                    qVar2 = (!(qVar2 instanceof j) || (qVar2.z & 2) == 0) ? qVar2.C : ((j) qVar2).M;
                }
            }
        }
        return null;
    }

    public static final int g(long j, long j2) {
        boolean zN = n(j);
        if (zN != n(j2)) {
            return zN ? -1 : 1;
        }
        int iSignum = (int) Math.signum(i(j) - i(j2));
        if (Math.min(i(j), i(j2)) >= 0.0f && m(j) != m(j2)) {
            return m(j) ? -1 : 1;
        }
        return iSignum;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object h(h hVar, androidx.compose.runtime.p1 p1Var) {
        if (!((androidx.compose.ui.q) hVar).e.K) {
            androidx.compose.ui.internal.a.b("Cannot read CompositionLocal because the Modifier node is not currently attached.");
        }
        androidx.compose.runtime.internal.j jVar = (androidx.compose.runtime.internal.j) t(hVar).Z;
        jVar.getClass();
        return androidx.compose.runtime.s.s(jVar, p1Var);
    }

    public static final float i(long j) {
        return Float.intBitsToFloat((int) (j >> 32));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void j(m mVar) {
        if (((androidx.compose.ui.q) mVar).e.K) {
            r(mVar, 1).a1();
        }
    }

    public static final void k(v vVar) {
        t(vVar).E();
    }

    public static final void l(u1 u1Var) {
        t(u1Var).F();
    }

    public static final boolean m(long j) {
        return (j & 2) != 0;
    }

    public static final boolean n(long j) {
        return (j & 1) != 0;
    }

    public static final boolean o(f0 f0Var) {
        if (f0Var.F == null) {
            return false;
        }
        f0 f0VarV = f0Var.v();
        return (f0VarV != null ? f0VarV.F : null) == null || f0Var.e0.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void p(androidx.compose.ui.q qVar, kotlin.jvm.functions.a aVar) {
        i1 i1Var = qVar.D;
        if (i1Var == null) {
            i1Var = new i1((h1) qVar);
            qVar.D = i1Var;
        }
        o1 snapshotObserver = ((androidx.compose.ui.platform.u) u(qVar)).getSnapshotObserver();
        snapshotObserver.a.d(i1Var, d.D, aVar);
    }

    public static final void q(i iVar) {
        androidx.compose.ui.autofill.d dVar;
        f0 f0VarT = t(iVar);
        if (f0VarT.R) {
            return;
        }
        androidx.compose.ui.platform.u uVar = (androidx.compose.ui.platform.u) i0.a(f0VarT);
        if (!androidx.compose.ui.platform.u.f() || (dVar = uVar.l0) == null) {
            return;
        }
        dVar.A.a.u(f0VarT.y, new androidx.compose.ui.autofill.c(dVar, f0VarT));
    }

    public static final d1 r(i iVar, int i) {
        d1 d1Var = ((androidx.compose.ui.q) iVar).e.E;
        d1Var.getClass();
        if (d1Var.T0() != iVar || !e1.g(i)) {
            return d1Var;
        }
        d1 d1Var2 = d1Var.M;
        d1Var2.getClass();
        return d1Var2;
    }

    public static final d1 s(i iVar) {
        if (!((androidx.compose.ui.q) iVar).e.K) {
            androidx.compose.ui.internal.a.b("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        d1 d1VarR = r(iVar, 2);
        if (!d1VarR.T0().K) {
            androidx.compose.ui.internal.a.b("LayoutCoordinates is not attached.");
        }
        return d1VarR;
    }

    public static final f0 t(i iVar) {
        d1 d1Var = ((androidx.compose.ui.q) iVar).e.E;
        if (d1Var != null) {
            return d1Var.L;
        }
        throw androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.a("Cannot obtain node coordinator. Is the Modifier.Node attached?");
    }

    public static final m1 u(i iVar) {
        m1 m1Var = t(iVar).L;
        if (m1Var != null) {
            return m1Var;
        }
        throw androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.a("This node does not have an owner.");
    }

    public static final View v(i iVar) {
        if (!((androidx.compose.ui.q) iVar).e.K) {
            androidx.compose.ui.internal.a.b("Cannot get View because the Modifier node is not currently attached.");
        }
        return (View) i0.a(t(iVar));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [kotlin.jvm.functions.l] */
    /* JADX WARN: Type inference failed for: r1v10, types: [androidx.compose.ui.q] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15, types: [androidx.compose.ui.q] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [androidx.compose.runtime.collection.b] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [androidx.compose.runtime.collection.b] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v8 */
    public static final void w(i iVar, Object obj, kotlin.jvm.functions.l lVar) {
        a1 a1Var;
        androidx.compose.ui.q qVar = (androidx.compose.ui.q) iVar;
        if (!qVar.e.K) {
            androidx.compose.ui.internal.a.b("visitAncestors called on an unattached node");
        }
        androidx.compose.ui.q qVar2 = qVar.e.B;
        f0 f0VarT = t(iVar);
        while (f0VarT != null) {
            if ((((androidx.compose.ui.q) f0VarT.d0.g).A & 262144) != 0) {
                while (qVar2 != null) {
                    if ((qVar2.z & 262144) != 0) {
                        ?? E = qVar2;
                        ?? bVar = 0;
                        while (E != 0) {
                            if (E instanceof z1) {
                                z1 z1Var = (z1) E;
                                if (!(obj.equals(z1Var.i()) ? ((Boolean) lVar.invoke(z1Var)).booleanValue() : true)) {
                                    return;
                                }
                            } else {
                                if (((E.z & 262144) != 0) && (E instanceof j)) {
                                    androidx.compose.ui.q qVar3 = ((j) E).M;
                                    int i = 0;
                                    while (qVar3 != null) {
                                        if ((qVar3.z & 262144) != 0) {
                                            E = E;
                                            bVar = bVar;
                                            i++;
                                            if (i == 1) {
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
                                            E = E;
                                            bVar = bVar;
                                        }
                                        qVar3 = qVar3.C;
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
                            }
                            E = e(bVar);
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
    /* JADX WARN: Type inference failed for: r11v0, types: [androidx.compose.ui.node.i, androidx.compose.ui.node.z1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v0, types: [kotlin.jvm.functions.l] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [androidx.compose.ui.q] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [androidx.compose.ui.q] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [androidx.compose.runtime.collection.b] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [androidx.compose.runtime.collection.b] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public static final void x(z1 z1Var, kotlin.jvm.functions.l lVar) {
        a1 a1Var;
        androidx.compose.ui.q qVar = (androidx.compose.ui.q) z1Var;
        if (!qVar.e.K) {
            androidx.compose.ui.internal.a.b("visitAncestors called on an unattached node");
        }
        androidx.compose.ui.q qVar2 = qVar.e.B;
        f0 f0VarT = t(z1Var);
        while (f0VarT != null) {
            if ((((androidx.compose.ui.q) f0VarT.d0.g).A & 262144) != 0) {
                while (qVar2 != null) {
                    if ((qVar2.z & 262144) != 0) {
                        ?? E = qVar2;
                        ?? bVar = 0;
                        while (E != 0) {
                            boolean zBooleanValue = true;
                            if (E instanceof z1) {
                                z1 z1Var2 = (z1) E;
                                if (kotlin.jvm.internal.l.a(z1Var.i(), z1Var2.i()) && z1Var.getClass() == z1Var2.getClass()) {
                                    zBooleanValue = ((Boolean) lVar.invoke(z1Var2)).booleanValue();
                                }
                                if (!zBooleanValue) {
                                    return;
                                }
                            } else {
                                if (((E.z & 262144) != 0) && (E instanceof j)) {
                                    androidx.compose.ui.q qVar3 = ((j) E).M;
                                    int i = 0;
                                    while (qVar3 != null) {
                                        if ((qVar3.z & 262144) != 0) {
                                            E = E;
                                            bVar = bVar;
                                            i++;
                                            if (i == 1) {
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
                                            E = E;
                                            bVar = bVar;
                                        }
                                        qVar3 = qVar3.C;
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
                            }
                            E = e(bVar);
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
    /* JADX WARN: Type inference failed for: r12v0, types: [androidx.compose.ui.node.z1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v0, types: [kotlin.jvm.functions.l] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [androidx.compose.ui.q] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [androidx.compose.ui.q] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
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
    /* JADX WARN: Type inference failed for: r8v9 */
    public static final void y(z1 z1Var, kotlin.jvm.functions.l lVar) {
        androidx.compose.ui.q qVar = (androidx.compose.ui.q) z1Var;
        if (!qVar.e.K) {
            androidx.compose.ui.internal.a.b("visitSubtreeIf called on an unattached node");
        }
        androidx.compose.runtime.collection.b bVar = new androidx.compose.runtime.collection.b(new androidx.compose.ui.q[16]);
        androidx.compose.ui.q qVar2 = qVar.e;
        androidx.compose.ui.q qVar3 = qVar2.C;
        if (qVar3 == null) {
            b(bVar, qVar2);
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
                                    z1 z1Var2 = (z1) E;
                                    y1 y1Var = (kotlin.jvm.internal.l.a(z1Var.i(), z1Var2.i()) && z1Var.getClass() == z1Var2.getClass()) ? (y1) lVar.invoke(z1Var2) : y1.e;
                                    if (y1Var != y1.z) {
                                        if (y1Var == y1.y) {
                                            break;
                                        }
                                    } else {
                                        return;
                                    }
                                } else if ((E.z & 262144) != 0 && (E instanceof j)) {
                                    androidx.compose.ui.q qVar6 = ((j) E).M;
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
                                E = e(bVar2);
                            }
                        }
                        qVar5 = qVar5.C;
                    }
                }
            }
            b(bVar, qVar4);
        }
    }
}
