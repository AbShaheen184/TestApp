package androidx.compose.ui.node;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class v0 extends androidx.compose.ui.layout.c1 implements androidx.compose.ui.layout.p0, a, x0 {
    public final j0 C;
    public boolean D;
    public boolean G;
    public boolean H;
    public kotlin.jvm.functions.l K;
    public float L;
    public Object N;
    public boolean O;
    public boolean P;
    public boolean Q;
    public boolean R;
    public boolean S;
    public boolean W;
    public float a0;
    public boolean b0;
    public kotlin.jvm.functions.l c0;
    public float e0;
    public boolean g0;
    public int E = Integer.MAX_VALUE;
    public int F = Integer.MAX_VALUE;
    public d0 I = d0.z;
    public long J = 0;
    public boolean M = true;
    public final g0 T = new g0(this, 0);
    public final androidx.compose.runtime.collection.b U = new androidx.compose.runtime.collection.b(new v0[16]);
    public boolean V = true;
    public long X = androidx.compose.ui.unit.b.b(0, 0, 15);
    public final u0 Y = new u0(this, 1);
    public final u0 Z = new u0(this, 0);
    public long d0 = 0;
    public final u0 f0 = new u0(this, 2);

    public v0(j0 j0Var) {
        this.C = j0Var;
    }

    @Override // androidx.compose.ui.layout.p0
    public final int B(int i) {
        j0 j0Var = this.C;
        if (!k.o(j0Var.a)) {
            u0();
            return j0Var.a().B(i);
        }
        r0 r0Var = j0Var.q;
        r0Var.getClass();
        return r0Var.B(i);
    }

    @Override // androidx.compose.ui.layout.p0
    public final androidx.compose.ui.layout.c1 F(long j) {
        d0 d0Var;
        j0 j0Var = this.C;
        f0 f0Var = j0Var.a;
        f0 f0Var2 = j0Var.a;
        d0 d0Var2 = f0Var.a0;
        d0 d0Var3 = d0.z;
        if (d0Var2 == d0Var3) {
            f0Var.e();
        }
        if (k.o(f0Var2)) {
            r0 r0Var = j0Var.q;
            r0Var.getClass();
            r0Var.G = d0Var3;
            r0Var.F(j);
        }
        f0 f0VarV = f0Var2.v();
        if (f0VarV != null) {
            j0 j0Var2 = f0VarV.e0;
            if (this.I != d0Var3 && !f0Var2.c0) {
                androidx.compose.ui.internal.a.b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int iOrdinal = j0Var2.d.ordinal();
            if (iOrdinal == 0) {
                d0Var = d0.e;
            } else {
                if (iOrdinal != 2) {
                    com.google.gson.b.s(j0Var2.d, "Measurable could be only measured from the parent's measure or layout block. Parents state is ");
                    return null;
                }
                d0Var = d0.y;
            }
            this.I = d0Var;
        } else {
            this.I = d0Var3;
        }
        z0(j);
        return this;
    }

    @Override // androidx.compose.ui.node.a
    public final void I(androidx.compose.animation.e eVar) {
        androidx.compose.runtime.collection.b bVarZ = this.C.a.z();
        Object[] objArr = bVarZ.e;
        int i = bVarZ.z;
        for (int i2 = 0; i2 < i; i2++) {
            eVar.invoke(((f0) objArr[i2]).e0.p);
        }
    }

    @Override // androidx.compose.ui.layout.c1, androidx.compose.ui.layout.p0
    public final Object K() {
        return this.N;
    }

    @Override // androidx.compose.ui.node.x0
    public final void N(boolean z) {
        j0 j0Var = this.C;
        if (z != j0Var.a().F) {
            j0Var.a().F = z;
            this.g0 = true;
        }
    }

    @Override // androidx.compose.ui.node.a
    public final void Q() {
        boolean zZ0;
        this.W = true;
        g0 g0Var = this.T;
        g0Var.h();
        boolean z = this.R;
        j0 j0Var = this.C;
        if (z) {
            androidx.compose.runtime.collection.b bVarZ = j0Var.a.z();
            Object[] objArr = bVarZ.e;
            int i = bVarZ.z;
            for (int i2 = 0; i2 < i; i2++) {
                f0 f0Var = (f0) objArr[i2];
                boolean zR = f0Var.r();
                j0 j0Var2 = f0Var.e0;
                if (zR && f0Var.s() == d0.e) {
                    v0 v0Var = j0Var2.p;
                    androidx.compose.ui.unit.a aVar = v0Var.G ? new androidx.compose.ui.unit.a(v0Var.A) : null;
                    if (aVar != null) {
                        if (f0Var.a0 == d0.z) {
                            f0Var.e();
                        }
                        zZ0 = j0Var2.p.z0(aVar.a);
                    } else {
                        zZ0 = false;
                    }
                    if (zZ0) {
                        f0.V(j0Var.a, false, 7);
                    }
                }
            }
        }
        if (this.S || (!g().H && this.R)) {
            this.R = false;
            b0 b0Var = j0Var.d;
            j0Var.d = b0.z;
            j0Var.g(false);
            f0 f0Var2 = j0Var.a;
            o1 snapshotObserver = ((androidx.compose.ui.platform.u) i0.a(f0Var2)).getSnapshotObserver();
            snapshotObserver.a.d(f0Var2, snapshotObserver.e, this.Z);
            j0Var.d = b0Var;
            this.S = false;
        }
        if (g0Var.b && g0Var.e()) {
            g0Var.g();
        }
        this.W = false;
    }

    @Override // androidx.compose.ui.node.a
    public final void X() {
        f0.V(this.C.a, false, 7);
    }

    @Override // androidx.compose.ui.layout.p0
    public final int Z(int i) {
        j0 j0Var = this.C;
        if (!k.o(j0Var.a)) {
            u0();
            return j0Var.a().Z(i);
        }
        r0 r0Var = j0Var.q;
        r0Var.getClass();
        return r0Var.Z(i);
    }

    @Override // androidx.compose.ui.layout.c1
    public final int a0() {
        return this.C.a().a0();
    }

    @Override // androidx.compose.ui.layout.p0
    public final int b(int i) {
        j0 j0Var = this.C;
        if (!k.o(j0Var.a)) {
            u0();
            return j0Var.a().b(i);
        }
        r0 r0Var = j0Var.q;
        r0Var.getClass();
        return r0Var.b(i);
    }

    @Override // androidx.compose.ui.node.a
    public final g0 c() {
        return this.T;
    }

    @Override // androidx.compose.ui.layout.c1
    public final int c0() {
        return this.C.a().c0();
    }

    @Override // androidx.compose.ui.node.a
    public final r g() {
        return (r) this.C.a.d0.d;
    }

    @Override // androidx.compose.ui.layout.c1
    public final void h0(long j, float f, kotlin.jvm.functions.l lVar) {
        androidx.compose.ui.layout.b1 placementScope;
        j0 j0Var = this.C;
        f0 f0Var = j0Var.a;
        f0 f0Var2 = j0Var.a;
        try {
            this.P = true;
            if (!androidx.compose.ui.unit.j.a(j, this.J) || this.g0) {
                if (j0Var.k || j0Var.j || this.g0) {
                    this.R = true;
                    this.g0 = false;
                }
                t0();
            }
            r0 r0Var = j0Var.q;
            if (r0Var != null) {
                j0 j0Var2 = r0Var.C;
                if (r0Var.M == p0.z && !k.o(j0Var2.a)) {
                    j0Var2.c = true;
                }
            }
            r0 r0Var2 = j0Var.q;
            if (r0Var2 != null && r0Var2.m0()) {
                d1 d1Var = j0Var.a().N;
                if (d1Var == null || (placementScope = d1Var.I) == null) {
                    placementScope = ((androidx.compose.ui.platform.u) i0.a(f0Var2)).getPlacementScope();
                }
                r0 r0Var3 = j0Var.q;
                r0Var3.getClass();
                f0 f0VarV = f0Var2.v();
                if (f0VarV != null) {
                    f0VarV.e0.h = 0;
                }
                r0Var3.F = Integer.MAX_VALUE;
                androidx.compose.ui.layout.b1.i(placementScope, r0Var3, (int) (j >> 32), (int) (4294967295L & j));
            }
            r0 r0Var4 = j0Var.q;
            if (r0Var4 != null && !r0Var4.H) {
                androidx.compose.ui.internal.a.b("Error: Placement happened before lookahead.");
            }
            w0(j, f, lVar);
        } catch (Throwable th) {
            f0Var.Y(th);
            throw null;
        }
    }

    @Override // androidx.compose.ui.node.a
    public final a k() {
        j0 j0Var;
        f0 f0VarV = this.C.a.v();
        if (f0VarV == null || (j0Var = f0VarV.e0) == null) {
            return null;
        }
        return j0Var.p;
    }

    public final List m0() {
        j0 j0Var = this.C;
        j0Var.a.f0();
        boolean z = this.V;
        androidx.compose.runtime.collection.b bVar = this.U;
        if (!z) {
            return bVar.f();
        }
        f0 f0Var = j0Var.a;
        androidx.compose.runtime.collection.b bVarZ = f0Var.z();
        Object[] objArr = bVarZ.e;
        int i = bVarZ.z;
        for (int i2 = 0; i2 < i; i2++) {
            f0 f0Var2 = (f0) objArr[i2];
            if (bVar.z <= i2) {
                bVar.b(f0Var2.e0.p);
            } else {
                v0 v0Var = f0Var2.e0.p;
                Object[] objArr2 = bVar.e;
                Object obj = objArr2[i2];
                objArr2[i2] = v0Var;
            }
        }
        bVar.l(((androidx.compose.runtime.collection.b) ((androidx.collection.h0) f0Var.n()).y).z, bVar.z);
        this.V = false;
        return bVar.f();
    }

    public final void n0() {
        boolean z = this.O;
        this.O = true;
        j0 j0Var = this.C;
        f0 f0Var = j0Var.a;
        a1 a1Var = f0Var.d0;
        if (!z) {
            ((r) a1Var.d).e1();
            ((androidx.compose.ui.platform.u) i0.a(f0Var)).getRectManager().f(j0Var.a, true);
            if (f0Var.r()) {
                f0.V(f0Var, true, 6);
            } else if (f0Var.e0.e) {
                f0.T(f0Var, true, 6);
            }
        }
        d1 d1Var = ((r) a1Var.d).M;
        for (d1 d1Var2 = (d1) a1Var.e; !kotlin.jvm.internal.l.a(d1Var2, d1Var) && d1Var2 != null; d1Var2 = d1Var2.M) {
            if (d1Var2.h0) {
                d1Var2.a1();
            }
        }
        androidx.compose.runtime.collection.b bVarZ = f0Var.z();
        Object[] objArr = bVarZ.e;
        int i = bVarZ.z;
        for (int i2 = 0; i2 < i; i2++) {
            f0 f0Var2 = (f0) objArr[i2];
            if (f0Var2.w() != Integer.MAX_VALUE) {
                f0Var2.e0.p.n0();
                f0.W(f0Var2);
            }
        }
    }

    public final void o0() {
        if (this.O) {
            this.O = false;
            j0 j0Var = this.C;
            f0 f0Var = j0Var.a;
            f0 f0Var2 = j0Var.a;
            ((androidx.compose.ui.platform.u) i0.a(f0Var)).getRectManager().h(f0Var2);
            a1 a1Var = f0Var2.d0;
            d1 d1Var = ((r) a1Var.d).M;
            for (d1 d1Var2 = (d1) a1Var.e; !kotlin.jvm.internal.l.a(d1Var2, d1Var) && d1Var2 != null; d1Var2 = d1Var2.M) {
                d1Var2.g1();
                d1Var2.l1();
            }
            androidx.compose.runtime.collection.b bVarZ = f0Var2.z();
            Object[] objArr = bVarZ.e;
            int i = bVarZ.z;
            for (int i2 = 0; i2 < i; i2++) {
                ((f0) objArr[i2]).e0.p.o0();
            }
        }
    }

    @Override // androidx.compose.ui.node.a
    public final void requestLayout() {
        this.C.a.U(false);
    }

    public final void t0() {
        j0 j0Var = this.C;
        if (j0Var.l > 0) {
            androidx.compose.runtime.collection.b bVarZ = j0Var.a.z();
            Object[] objArr = bVarZ.e;
            int i = bVarZ.z;
            for (int i2 = 0; i2 < i; i2++) {
                f0 f0Var = (f0) objArr[i2];
                j0 j0Var2 = f0Var.e0;
                boolean z = j0Var2.j;
                v0 v0Var = j0Var2.p;
                if ((z || j0Var2.k) && !v0Var.R) {
                    f0Var.U(false);
                }
                v0Var.t0();
            }
        }
    }

    public final void u0() {
        d0 d0Var;
        j0 j0Var = this.C;
        f0.V(j0Var.a, false, 7);
        f0 f0Var = j0Var.a;
        f0 f0VarV = f0Var.v();
        if (f0VarV == null || f0Var.a0 != d0.z) {
            return;
        }
        int iOrdinal = f0VarV.e0.d.ordinal();
        if (iOrdinal != 0) {
            d0Var = iOrdinal != 2 ? f0VarV.a0 : d0.y;
        } else {
            d0Var = d0.e;
        }
        f0Var.a0 = d0Var;
    }

    @Override // androidx.compose.ui.layout.p0
    public final int v(int i) {
        j0 j0Var = this.C;
        if (!k.o(j0Var.a)) {
            u0();
            return j0Var.a().v(i);
        }
        r0 r0Var = j0Var.q;
        r0Var.getClass();
        return r0Var.v(i);
    }

    public final void v0() {
        this.b0 = true;
        j0 j0Var = this.C;
        f0 f0VarV = j0Var.a.v();
        float f = g().X;
        f0 f0Var = j0Var.a;
        a1 a1Var = f0Var.d0;
        d1 d1Var = (d1) a1Var.e;
        r rVar = (r) a1Var.d;
        while (d1Var != rVar) {
            d1Var.getClass();
            x xVar = (x) d1Var;
            f += xVar.X;
            d1Var = xVar.M;
        }
        if (f != this.a0) {
            this.a0 = f;
            if (f0VarV != null) {
                f0VarV.O();
            }
            if (f0VarV != null) {
                f0VarV.C();
            }
        }
        if (!g().H) {
            boolean z = this.O;
            if (!z || this.T.d()) {
                n0();
            }
            if (z) {
                ((r) f0Var.d0.d).e1();
            } else {
                if (f0VarV != null) {
                    f0VarV.C();
                }
                if (this.D && f0VarV != null) {
                    f0VarV.U(false);
                }
            }
        }
        if (f0VarV != null) {
            j0 j0Var2 = f0VarV.e0;
            if (!this.D && j0Var2.d == b0.z) {
                if (this.F != Integer.MAX_VALUE) {
                    androidx.compose.ui.internal.a.b("Place was called on a node which was placed already");
                }
                int i = j0Var2.i;
                this.F = i;
                j0Var2.i = i + 1;
            }
        } else {
            this.F = 0;
        }
        Q();
    }

    public final void w0(long j, float f, kotlin.jvm.functions.l lVar) {
        j0 j0Var = this.C;
        f0 f0Var = j0Var.a;
        f0 f0Var2 = j0Var.a;
        if (f0Var.o0) {
            androidx.compose.ui.internal.a.a("place is called on a deactivated node");
        }
        j0Var.d = b0.z;
        this.J = j;
        this.L = f;
        this.K = lVar;
        this.b0 = false;
        m1 m1VarA = i0.a(f0Var2);
        if (this.R || !this.O) {
            this.T.e = false;
            j0Var.f(false);
            this.c0 = lVar;
            this.d0 = j;
            this.e0 = f;
            o1 snapshotObserver = ((androidx.compose.ui.platform.u) m1VarA).getSnapshotObserver();
            snapshotObserver.a.d(f0Var2, snapshotObserver.f, this.f0);
        } else {
            d1 d1VarA = j0Var.a();
            d1VarA.j1(androidx.compose.ui.unit.j.c(j, d1VarA.B), f, lVar);
            v0();
        }
        j0Var.d = b0.B;
        if (j0Var.a().H && (j0Var.k || j0Var.j)) {
            requestLayout();
        }
        this.H = true;
    }

    @Override // androidx.compose.ui.node.a
    public final int x() {
        return this.F;
    }

    public final boolean z0(long j) {
        j0 j0Var = this.C;
        f0 f0Var = j0Var.a;
        f0 f0Var2 = j0Var.a;
        try {
            if (f0Var.o0) {
                androidx.compose.ui.internal.a.a("measure is called on a deactivated node");
            }
            m1 m1VarA = i0.a(f0Var2);
            f0 f0VarV = f0Var2.v();
            boolean z = true;
            f0Var2.c0 = f0Var2.c0 || (f0VarV != null && f0VarV.c0);
            if (!f0Var2.r() && androidx.compose.ui.unit.a.b(this.A, j)) {
                ((androidx.compose.ui.platform.u) m1VarA).k(f0Var2, false);
                f0Var2.X();
                return false;
            }
            this.T.d = false;
            androidx.compose.runtime.collection.b bVarZ = f0Var2.z();
            Object[] objArr = bVarZ.e;
            int i = bVarZ.z;
            for (int i2 = 0; i2 < i; i2++) {
                ((f0) objArr[i2]).e0.p.T.getClass();
            }
            this.G = true;
            long j2 = j0Var.a().z;
            l0(j);
            b0 b0Var = j0Var.d;
            b0 b0Var2 = b0.B;
            if (b0Var != b0Var2) {
                androidx.compose.ui.internal.a.b("layout state is not idle before measure starts");
            }
            this.X = j;
            b0 b0Var3 = b0.e;
            j0Var.d = b0Var3;
            this.Q = false;
            o1 snapshotObserver = ((androidx.compose.ui.platform.u) i0.a(f0Var2)).getSnapshotObserver();
            snapshotObserver.a.d(f0Var2, snapshotObserver.c, this.Y);
            if (j0Var.d == b0Var3) {
                this.R = true;
                this.S = true;
                j0Var.d = b0Var2;
            }
            if (androidx.compose.ui.unit.l.a(j0Var.a().z, j2) && j0Var.a().e == this.e && j0Var.a().y == this.y) {
                z = false;
            }
            j0((((long) j0Var.a().y) & 4294967295L) | (((long) j0Var.a().e) << 32));
            return z;
        } catch (Throwable th) {
            f0Var.Y(th);
            throw null;
        }
    }
}
