package androidx.compose.ui.input.nestedscroll;

import androidx.compose.animation.z;
import androidx.compose.ui.node.a1;
import androidx.compose.ui.node.f0;
import androidx.compose.ui.node.k;
import androidx.compose.ui.node.w1;
import androidx.compose.ui.node.z1;
import androidx.compose.ui.q;
import kotlin.jvm.internal.l;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class i extends q implements z1, a {
    public a L;
    public d M;
    public i N;
    public final String O = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";

    public i(a aVar, d dVar) {
        this.L = aVar;
        this.M = dVar;
    }

    @Override // androidx.compose.ui.q
    public final void D0() {
        d dVar = this.M;
        dVar.a = this;
        dVar.b = null;
        this.N = null;
        dVar.c = new z(this, 4);
        dVar.d = z0();
    }

    @Override // androidx.compose.ui.q
    public final void E0() {
        kotlin.jvm.internal.z zVar = new kotlin.jvm.internal.z();
        k.x(this, new j(0, zVar));
        i iVar = (i) ((z1) zVar.e);
        this.N = iVar;
        d dVar = this.M;
        dVar.b = iVar;
        if (dVar.a == this) {
            dVar.a = null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [androidx.compose.ui.q] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [androidx.compose.ui.q] */
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
    /* JADX WARN: Type inference failed for: r6v7 */
    @Override // androidx.compose.ui.input.nestedscroll.a
    public final long I(int i, long j) {
        a1 a1Var;
        boolean z = this.K;
        i iVar = null;
        z1 z1Var = null;
        iVar = null;
        if (z && z) {
            if (!this.e.K) {
                androidx.compose.ui.internal.a.b("visitAncestors called on an unattached node");
            }
            q qVar = this.e.B;
            f0 f0VarT = k.t(this);
            loop0: while (f0VarT != null) {
                if ((((q) f0VarT.d0.g).A & 262144) != 0) {
                    while (qVar != null) {
                        if ((qVar.z & 262144) != 0) {
                            ?? E = qVar;
                            ?? bVar = 0;
                            while (E != 0) {
                                if (E instanceof z1) {
                                    z1 z1Var2 = (z1) E;
                                    if (l.a(i(), z1Var2.i()) && i.class == z1Var2.getClass()) {
                                        z1Var = z1Var2;
                                        break loop0;
                                    }
                                } else if ((E.z & 262144) != 0 && (E instanceof androidx.compose.ui.node.j)) {
                                    q qVar2 = ((androidx.compose.ui.node.j) E).M;
                                    int i2 = 0;
                                    E = E;
                                    bVar = bVar;
                                    while (qVar2 != null) {
                                        if ((qVar2.z & 262144) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                bVar = bVar;
                                                E = qVar2;
                                            } else {
                                                if (bVar == 0) {
                                                    bVar = new androidx.compose.runtime.collection.b(new q[16]);
                                                }
                                                if (E != 0) {
                                                    bVar.b(E);
                                                    E = 0;
                                                }
                                                bVar.b(qVar2);
                                            }
                                        }
                                        qVar2 = qVar2.C;
                                        E = E;
                                        bVar = bVar;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                E = k.e(bVar);
                            }
                        }
                        qVar = qVar.B;
                    }
                }
                f0VarT = f0VarT.v();
                qVar = (f0VarT == null || (a1Var = f0VarT.d0) == null) ? null : (w1) a1Var.f;
            }
            iVar = (i) z1Var;
        }
        long jI = iVar != null ? iVar.I(i, j) : 0L;
        return androidx.compose.ui.geometry.b.e(jI, this.L.I(i, androidx.compose.ui.geometry.b.d(j, jI)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13, types: [androidx.compose.ui.q] */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v16, types: [androidx.compose.ui.q] */
    /* JADX WARN: Type inference failed for: r4v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
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
    /* JADX WARN: Type inference failed for: r7v7 */
    public final CoroutineScope L0() {
        i iVar;
        z1 z1Var;
        a1 a1Var;
        if (this.K) {
            if (!this.e.K) {
                androidx.compose.ui.internal.a.b("visitAncestors called on an unattached node");
            }
            q qVar = this.e.B;
            f0 f0VarT = k.t(this);
            loop0: while (true) {
                if (f0VarT == null) {
                    z1Var = null;
                    break;
                }
                if ((((q) f0VarT.d0.g).A & 262144) != 0) {
                    while (qVar != null) {
                        if ((qVar.z & 262144) != 0) {
                            ?? E = qVar;
                            ?? bVar = 0;
                            while (E != 0) {
                                if (E instanceof z1) {
                                    z1Var = (z1) E;
                                    if (l.a(i(), z1Var.i()) && i.class == z1Var.getClass()) {
                                        break loop0;
                                    }
                                } else if ((E.z & 262144) != 0 && (E instanceof androidx.compose.ui.node.j)) {
                                    q qVar2 = ((androidx.compose.ui.node.j) E).M;
                                    int i = 0;
                                    while (qVar2 != null) {
                                        if ((qVar2.z & 262144) != 0) {
                                            i++;
                                            if (i == 1) {
                                                E = E;
                                                bVar = bVar;
                                                bVar = bVar;
                                                E = qVar2;
                                            } else {
                                                if (bVar == 0) {
                                                    bVar = new androidx.compose.runtime.collection.b(new q[16]);
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
                                E = k.e(bVar);
                            }
                        }
                        qVar = qVar.B;
                    }
                }
                f0VarT = f0VarT.v();
                qVar = (f0VarT == null || (a1Var = f0VarT.d0) == null) ? null : (w1) a1Var.f;
            }
            iVar = (i) z1Var;
        } else {
            iVar = null;
        }
        CoroutineScope coroutineScopeL0 = iVar != null ? iVar.L0() : null;
        if (coroutineScopeL0 != null && CoroutineScopeKt.isActive(coroutineScopeL0)) {
            return coroutineScopeL0;
        }
        CoroutineScope coroutineScope = this.M.d;
        if (coroutineScope != null) {
            return coroutineScope;
        }
        net.luminis.tls.engine.impl.c.r("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:75:0x0110  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00f5, code lost:
    
        if (r3 == r8) goto L74;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11, types: [androidx.compose.ui.q] */
    /* JADX WARN: Type inference failed for: r10v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v15 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8, types: [androidx.compose.ui.q] */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [androidx.compose.runtime.collection.b] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6, types: [androidx.compose.runtime.collection.b] */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r13v7 */
    @Override // androidx.compose.ui.input.nestedscroll.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c0(long r17, kotlin.coroutines.d r19) {
        /*
            Method dump skipped, instruction units count: 287
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.nestedscroll.i.c0(long, kotlin.coroutines.d):java.lang.Object");
    }

    @Override // androidx.compose.ui.node.z1
    public final Object i() {
        return this.O;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v11 */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15, types: [androidx.compose.ui.q] */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v19 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8, types: [androidx.compose.ui.q] */
    /* JADX WARN: Type inference failed for: r14v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v2 */
    /* JADX WARN: Type inference failed for: r16v3 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v6, types: [androidx.compose.runtime.collection.b] */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r16v9 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7, types: [androidx.compose.runtime.collection.b] */
    /* JADX WARN: Type inference failed for: r9v9 */
    @Override // androidx.compose.ui.input.nestedscroll.a
    public final Object m(long j, long j2, kotlin.coroutines.d dVar) {
        g gVar;
        long j3;
        long j4;
        long j5;
        i iVar;
        long j6;
        long j7;
        z1 z1Var;
        a1 a1Var;
        int i;
        ?? r16;
        ?? E;
        int i2;
        if (dVar instanceof g) {
            gVar = (g) dVar;
            int i3 = gVar.B;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                gVar.B = i3 - Integer.MIN_VALUE;
            } else {
                gVar = new g(this, (kotlin.coroutines.jvm.internal.c) dVar);
            }
        } else {
            gVar = new g(this, (kotlin.coroutines.jvm.internal.c) dVar);
        }
        g gVar2 = gVar;
        Object objM = gVar2.z;
        int i4 = gVar2.B;
        int i5 = 1;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        if (i4 == 0) {
            kotlin.a.e(objM);
            a aVar2 = this.L;
            gVar2.e = j;
            gVar2.y = j2;
            gVar2.B = 1;
            objM = aVar2.m(j, j2, gVar2);
            if (objM != aVar) {
                j3 = j;
                j4 = j2;
            }
            return aVar;
        }
        if (i4 == 1) {
            j4 = gVar2.y;
            j3 = gVar2.e;
            kotlin.a.e(objM);
        } else {
            if (i4 != 2) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            j7 = gVar2.e;
            kotlin.a.e(objM);
        }
        j6 = ((androidx.compose.ui.unit.q) objM).a;
        j5 = j7;
        return new androidx.compose.ui.unit.q(androidx.compose.ui.unit.q.e(j5, j6));
        j5 = ((androidx.compose.ui.unit.q) objM).a;
        boolean z = this.K;
        if (!z) {
            iVar = this.N;
        } else if (z && z) {
            if (!this.e.K) {
                androidx.compose.ui.internal.a.b("visitAncestors called on an unattached node");
            }
            q qVar = this.e.B;
            f0 f0VarT = k.t(this);
            loop0: while (true) {
                if (f0VarT == null) {
                    z1Var = null;
                    break;
                }
                int i6 = 262144;
                if ((((q) f0VarT.d0.g).A & 262144) != 0) {
                    while (qVar != null) {
                        if ((qVar.z & i6) != 0) {
                            ?? r14 = qVar;
                            ?? r17 = 0;
                            while (r14 != 0) {
                                if (r14 instanceof z1) {
                                    z1 z1Var2 = (z1) r14;
                                    i = i6;
                                    if (l.a(i(), z1Var2.i()) && i.class == z1Var2.getClass()) {
                                        z1Var = z1Var2;
                                        break loop0;
                                    }
                                } else {
                                    i = i6;
                                    if ((r14.z & i) != 0 && (r14 instanceof androidx.compose.ui.node.j)) {
                                        q qVar2 = ((androidx.compose.ui.node.j) r14).M;
                                        int i7 = 0;
                                        while (qVar2 != null) {
                                            if ((qVar2.z & i) != 0) {
                                                i7++;
                                                if (i7 == i5) {
                                                    E = r14;
                                                    r16 = r17;
                                                    E = qVar2;
                                                } else {
                                                    ?? bVar = r16 == 0 ? new androidx.compose.runtime.collection.b(new q[16]) : r16;
                                                    if (E != 0) {
                                                        bVar.b(E);
                                                        E = 0;
                                                    }
                                                    bVar.b(qVar2);
                                                    r16 = bVar;
                                                }
                                            } else {
                                                E = r14;
                                                r16 = r17;
                                            }
                                            qVar2 = qVar2.C;
                                            i5 = 1;
                                            E = E;
                                            r16 = r16;
                                        }
                                        E = r14;
                                        r16 = r17;
                                        i2 = i5;
                                        r16 = r16;
                                        if (i7 == i2) {
                                        }
                                        i6 = i;
                                        i5 = i2;
                                        r14 = E;
                                        r17 = r16;
                                    }
                                    E = k.e(r16);
                                    i6 = i;
                                    i5 = i2;
                                    r14 = E;
                                    r17 = r16;
                                }
                                i2 = i5;
                                r16 = r17;
                                E = k.e(r16);
                                i6 = i;
                                i5 = i2;
                                r14 = E;
                                r17 = r16;
                            }
                        }
                        qVar = qVar.B;
                        i6 = i6;
                        i5 = i5;
                    }
                }
                int i8 = i5;
                f0VarT = f0VarT.v();
                qVar = (f0VarT == null || (a1Var = f0VarT.d0) == null) ? null : (w1) a1Var.f;
                i5 = i8;
            }
            iVar = (i) z1Var;
        } else {
            iVar = null;
        }
        if (iVar != null) {
            long jE = androidx.compose.ui.unit.q.e(j3, j5);
            long jD = androidx.compose.ui.unit.q.d(j4, j5);
            gVar2.e = j5;
            gVar2.B = 2;
            objM = iVar.m(jE, jD, gVar2);
            if (objM != aVar) {
                j7 = j5;
                j6 = ((androidx.compose.ui.unit.q) objM).a;
                j5 = j7;
            }
            return aVar;
        }
        j6 = 0;
        return new androidx.compose.ui.unit.q(androidx.compose.ui.unit.q.e(j5, j6));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.compose.ui.input.nestedscroll.i] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [androidx.compose.ui.q] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14, types: [androidx.compose.ui.q] */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [androidx.compose.runtime.collection.b] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [androidx.compose.runtime.collection.b] */
    /* JADX WARN: Type inference failed for: r8v7 */
    @Override // androidx.compose.ui.input.nestedscroll.a
    public final long n0(long j, long j2, int i) {
        a1 a1Var;
        long jN0 = this.L.n0(j, j2, i);
        boolean z = this.K;
        z1 z1Var = null;
        if (z && z) {
            if (!this.e.K) {
                androidx.compose.ui.internal.a.b("visitAncestors called on an unattached node");
            }
            q qVar = this.e.B;
            f0 f0VarT = k.t(this);
            loop0: while (f0VarT != null) {
                if ((((q) f0VarT.d0.g).A & 262144) != 0) {
                    while (qVar != null) {
                        if ((qVar.z & 262144) != 0) {
                            ?? E = qVar;
                            ?? bVar = 0;
                            while (E != 0) {
                                if (E instanceof z1) {
                                    z1 z1Var2 = (z1) E;
                                    if (l.a(i(), z1Var2.i()) && i.class == z1Var2.getClass()) {
                                        z1Var = z1Var2;
                                        break loop0;
                                    }
                                } else if ((E.z & 262144) != 0 && (E instanceof androidx.compose.ui.node.j)) {
                                    q qVar2 = ((androidx.compose.ui.node.j) E).M;
                                    int i2 = 0;
                                    E = E;
                                    bVar = bVar;
                                    while (qVar2 != null) {
                                        if ((qVar2.z & 262144) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                bVar = bVar;
                                                E = qVar2;
                                            } else {
                                                if (bVar == 0) {
                                                    bVar = new androidx.compose.runtime.collection.b(new q[16]);
                                                }
                                                if (E != 0) {
                                                    bVar.b(E);
                                                    E = 0;
                                                }
                                                bVar.b(qVar2);
                                            }
                                        }
                                        qVar2 = qVar2.C;
                                        E = E;
                                        bVar = bVar;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                E = k.e(bVar);
                            }
                        }
                        qVar = qVar.B;
                    }
                }
                f0VarT = f0VarT.v();
                qVar = (f0VarT == null || (a1Var = f0VarT.d0) == null) ? null : (w1) a1Var.f;
            }
            z1Var = (i) z1Var;
        }
        ?? r0 = z1Var;
        return androidx.compose.ui.geometry.b.e(jN0, r0 != 0 ? r0.n0(androidx.compose.ui.geometry.b.e(j, jN0), androidx.compose.ui.geometry.b.d(j2, jN0), i) : 0L);
    }
}
