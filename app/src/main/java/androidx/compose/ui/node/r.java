package androidx.compose.ui.node;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends d1 {
    public static final com.google.android.gms.cloudmessaging.n q0;
    public final w1 o0;
    public q p0;

    static {
        com.google.android.gms.cloudmessaging.n nVarG = androidx.compose.ui.graphics.a0.g();
        int i = androidx.compose.ui.graphics.t.j;
        nVarG.h(androidx.compose.ui.graphics.t.e);
        nVarG.n(1.0f);
        nVarG.o(1);
        q0 = nVarG;
    }

    public r(f0 f0Var) {
        super(f0Var);
        w1 w1Var = new w1();
        w1Var.A = 0;
        this.o0 = w1Var;
        w1Var.E = this;
        this.p0 = f0Var.F != null ? new q(this) : null;
    }

    @Override // androidx.compose.ui.layout.p0
    public final int B(int i) {
        androidx.compose.foundation.text.input.internal.o oVarU = this.L.u();
        androidx.compose.ui.layout.q0 q0VarN = oVarU.n();
        f0 f0Var = (f0) oVarU.y;
        return q0VarN.b((d1) f0Var.d0.e, f0Var.m(), i);
    }

    @Override // androidx.compose.ui.layout.p0
    public final androidx.compose.ui.layout.c1 F(long j) {
        l0(j);
        f0 f0Var = this.L;
        androidx.compose.runtime.collection.b bVarZ = f0Var.z();
        Object[] objArr = bVarZ.e;
        int i = bVarZ.z;
        for (int i2 = 0; i2 < i; i2++) {
            ((f0) objArr[i2]).e0.p.I = d0.z;
        }
        m1(f0Var.U.a(this, f0Var.m(), j));
        d1();
        return this;
    }

    @Override // androidx.compose.ui.node.d1
    public final void O0() {
        if (this.p0 == null) {
            this.p0 = new q(this);
        }
    }

    @Override // androidx.compose.ui.node.d1
    public final o0 R0() {
        return this.p0;
    }

    @Override // androidx.compose.ui.node.d1
    public final androidx.compose.ui.q T0() {
        return this.o0;
    }

    @Override // androidx.compose.ui.layout.p0
    public final int Z(int i) {
        androidx.compose.foundation.text.input.internal.o oVarU = this.L.u();
        androidx.compose.ui.layout.q0 q0VarN = oVarU.n();
        f0 f0Var = (f0) oVarU.y;
        return q0VarN.e((d1) f0Var.d0.e, f0Var.m(), i);
    }

    /* JADX WARN: Code duplicated, block: B:106:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:24:0x0051  */
    /* JADX WARN: Code duplicated, block: B:26:0x0060  */
    /* JADX WARN: Code duplicated, block: B:28:0x006a  */
    /* JADX WARN: Code duplicated, block: B:30:0x006f  */
    /* JADX WARN: Code duplicated, block: B:31:0x008c  */
    /* JADX WARN: Code duplicated, block: B:87:0x0136 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13, types: [androidx.compose.ui.q] */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [androidx.compose.ui.q] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [androidx.compose.runtime.collection.b] */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24 */
    /* JADX WARN: Type inference failed for: r6v25 */
    /* JADX WARN: Type inference failed for: r6v26 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [androidx.compose.runtime.collection.b] */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v5 */
    @Override // androidx.compose.ui.node.d1
    public final void Z0(b1 b1Var, long j, p pVar, int i, boolean z) {
        boolean z2;
        int i2;
        boolean z3;
        boolean z4;
        Object[] objArr;
        int i3;
        f0 f0Var;
        f0 f0Var2;
        long jB;
        long j2 = j;
        p pVar2 = pVar;
        int i4 = b1Var.a;
        f0 f0Var3 = this.L;
        switch (i4) {
            case 0:
                z2 = true;
                break;
            default:
                androidx.compose.ui.semantics.l lVarX = f0Var3.x();
                z2 = !(lVarX != null && lVarX.A);
                break;
        }
        if (z2) {
            if (t1(j2)) {
                i2 = i;
                z3 = z;
                z4 = true;
            } else {
                i2 = i;
                if (i2 == 1 && (Float.floatToRawIntBits(L0(j2, S0())) & Integer.MAX_VALUE) < 2139095040) {
                    z4 = true;
                    z3 = false;
                }
            }
            if (z4) {
                int i5 = pVar2.z;
                androidx.compose.runtime.collection.b bVarY = f0Var3.y();
                objArr = bVarY.e;
                i3 = bVarY.z - 1;
                while (i3 >= 0) {
                    f0Var = (f0) objArr[i3];
                    if (f0Var.I()) {
                        switch (b1Var.a) {
                            case 0:
                                f0Var.A(j2, pVar2, i2, z3);
                                f0Var2 = f0Var;
                                break;
                            default:
                                a1 a1Var = f0Var.d0;
                                ((d1) a1Var.e).Y0(d1.n0, ((d1) a1Var.e).Q0(j2), pVar2, 1, z3);
                                pVar2 = pVar;
                                f0Var2 = f0Var;
                                break;
                        }
                        jB = pVar2.b();
                        if (k.i(jB) < 0.0f && k.n(jB) && !k.m(jB)) {
                            d1 d1Var = (d1) f0Var2.d0.e;
                            d1Var.getClass();
                            androidx.compose.ui.q qVarV0 = d1Var.V0(e1.g(16));
                            if (qVarV0 != null && qVarV0.K) {
                                if (!qVarV0.e.K) {
                                    androidx.compose.ui.internal.a.b("visitLocalDescendants called on an unattached node");
                                }
                                androidx.compose.ui.q qVar = qVarV0.e;
                                if ((qVar.A & 16) != 0) {
                                    while (true) {
                                        if (qVar != null) {
                                            if ((qVar.z & 16) != 0) {
                                                ?? E = qVar;
                                                ?? bVar = 0;
                                                while (E != 0) {
                                                    if (E instanceof r1) {
                                                        if (((r1) E).j0()) {
                                                            pVar2.z = pVar2.e.b - 1;
                                                            break;
                                                        }
                                                    } else if ((E.z & 16) != 0 && (E instanceof j)) {
                                                        androidx.compose.ui.q qVar2 = ((j) E).M;
                                                        int i6 = 0;
                                                        while (qVar2 != null) {
                                                            if ((qVar2.z & 16) != 0) {
                                                                i6++;
                                                                if (i6 == 1) {
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
                                                        if (i6 == 1) {
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
                                            qVar = qVar.C;
                                        }
                                    }
                                }
                            }
                            pVar2.z = i5;
                        }
                    }
                    i3--;
                    j2 = j;
                    i2 = i;
                }
                pVar2.z = i5;
            }
        }
        i2 = i;
        z3 = z;
        z4 = false;
        if (z4) {
            int i7 = pVar2.z;
            androidx.compose.runtime.collection.b bVarY2 = f0Var3.y();
            objArr = bVarY2.e;
            i3 = bVarY2.z - 1;
            while (i3 >= 0) {
                f0Var = (f0) objArr[i3];
                if (f0Var.I()) {
                    switch (b1Var.a) {
                        case 0:
                            f0Var.A(j2, pVar2, i2, z3);
                            f0Var2 = f0Var;
                            break;
                        default:
                            a1 a1Var2 = f0Var.d0;
                            ((d1) a1Var2.e).Y0(d1.n0, ((d1) a1Var2.e).Q0(j2), pVar2, 1, z3);
                            pVar2 = pVar;
                            f0Var2 = f0Var;
                            break;
                    }
                    jB = pVar2.b();
                    if (k.i(jB) < 0.0f) {
                        continue;
                    }
                }
                i3--;
                j2 = j;
                i2 = i;
            }
            pVar2.z = i7;
        }
    }

    @Override // androidx.compose.ui.layout.p0
    public final int b(int i) {
        androidx.compose.foundation.text.input.internal.o oVarU = this.L.u();
        androidx.compose.ui.layout.q0 q0VarN = oVarU.n();
        f0 f0Var = (f0) oVarU.y;
        return q0VarN.h((d1) f0Var.d0.e, f0Var.m(), i);
    }

    @Override // androidx.compose.ui.layout.c1
    public final void h0(long j, float f, kotlin.jvm.functions.l lVar) {
        j1(j, f, lVar);
        if (this.G) {
            return;
        }
        this.L.e0.p.v0();
    }

    @Override // androidx.compose.ui.node.d1
    public final void i1(androidx.compose.ui.graphics.r rVar, androidx.compose.ui.graphics.layer.b bVar) {
        f0 f0Var = this.L;
        m1 m1VarA = i0.a(f0Var);
        androidx.compose.runtime.collection.b bVarY = f0Var.y();
        Object[] objArr = bVarY.e;
        int i = bVarY.z;
        for (int i2 = 0; i2 < i; i2++) {
            f0 f0Var2 = (f0) objArr[i2];
            if (f0Var2.I()) {
                f0Var2.i(rVar, bVar);
            }
        }
        if (((androidx.compose.ui.platform.u) m1VarA).getShowLayoutBounds()) {
            long j = this.z;
            rVar.m(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, q0);
        }
    }

    @Override // androidx.compose.ui.node.n0
    public final int n0(androidx.compose.ui.layout.a aVar) {
        q qVar = this.p0;
        if (qVar != null) {
            return qVar.n0(aVar);
        }
        v0 v0Var = this.L.e0.p;
        b0 b0Var = v0Var.C.d;
        g0 g0Var = v0Var.T;
        if (b0Var == b0.e) {
            g0Var.d = true;
            if (g0Var.b) {
                v0Var.R = true;
                v0Var.S = true;
            }
        } else {
            g0Var.e = true;
        }
        r rVarG = v0Var.g();
        boolean z = rVarG.H;
        rVarG.H = true;
        v0Var.Q();
        rVarG.H = z;
        Integer num = (Integer) g0Var.g.get(aVar);
        if (num != null) {
            return num.intValue();
        }
        return Integer.MIN_VALUE;
    }

    @Override // androidx.compose.ui.layout.p0
    public final int v(int i) {
        androidx.compose.foundation.text.input.internal.o oVarU = this.L.u();
        androidx.compose.ui.layout.q0 q0VarN = oVarU.n();
        f0 f0Var = (f0) oVarU.y;
        return q0VarN.g((d1) f0Var.d0.e, f0Var.m(), i);
    }
}
