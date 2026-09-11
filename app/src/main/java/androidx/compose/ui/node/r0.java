package androidx.compose.ui.node;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 extends androidx.compose.ui.layout.c1 implements androidx.compose.ui.layout.p0, a, x0 {
    public final j0 C;
    public boolean D;
    public boolean H;
    public boolean I;
    public androidx.compose.ui.unit.a J;
    public kotlin.jvm.functions.l L;
    public boolean Q;
    public Object T;
    public boolean X;
    public int E = Integer.MAX_VALUE;
    public int F = Integer.MAX_VALUE;
    public d0 G = d0.z;
    public long K = 0;
    public p0 M = p0.z;
    public final g0 N = new g0(this, 1);
    public final androidx.compose.runtime.collection.b O = new androidx.compose.runtime.collection.b(new r0[16]);
    public boolean P = true;
    public final q0 R = new q0(this, 0);
    public boolean S = true;
    public long U = androidx.compose.ui.unit.b.b(0, 0, 15);
    public final q0 V = new q0(this, 2);
    public final q0 W = new q0(this, 1);

    public r0(j0 j0Var) {
        this.C = j0Var;
        this.T = j0Var.p.N;
    }

    @Override // androidx.compose.ui.layout.p0
    public final int B(int i) {
        u0();
        o0 o0VarR0 = this.C.a().R0();
        o0VarR0.getClass();
        return o0VarR0.B(i);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0025  */
    @Override // androidx.compose.ui.layout.p0
    public final androidx.compose.ui.layout.c1 F(long j) {
        d0 d0Var;
        j0 j0Var = this.C;
        f0 f0Var = j0Var.a;
        f0 f0Var2 = j0Var.a;
        f0 f0VarV = f0Var.v();
        if ((f0VarV != null ? f0VarV.e0.d : null) == b0.y) {
            j0Var.b = false;
        } else {
            f0 f0VarV2 = f0Var2.v();
            if ((f0VarV2 != null ? f0VarV2.e0.d : null) == b0.A) {
                j0Var.b = false;
            }
        }
        f0 f0VarV3 = f0Var2.v();
        d0 d0Var2 = d0.z;
        if (f0VarV3 != null) {
            j0 j0Var2 = f0VarV3.e0;
            if (this.G != d0Var2 && !f0Var2.c0) {
                androidx.compose.ui.internal.a.b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int iOrdinal = j0Var2.d.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                d0Var = d0.e;
            } else {
                if (iOrdinal != 2 && iOrdinal != 3) {
                    com.google.gson.b.s(j0Var2.d, "Measurable could be only measured from the parent's measure or layout block. Parents state is ");
                    return null;
                }
                d0Var = d0.y;
            }
            this.G = d0Var;
        } else {
            this.G = d0Var2;
        }
        if (f0Var2.a0 == d0Var2) {
            f0Var2.e();
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
            r0 r0Var = ((f0) objArr[i2]).e0.q;
            r0Var.getClass();
            eVar.invoke(r0Var);
        }
    }

    @Override // androidx.compose.ui.layout.c1, androidx.compose.ui.layout.p0
    public final Object K() {
        return this.T;
    }

    @Override // androidx.compose.ui.node.x0
    public final void N(boolean z) {
        o0 o0VarR0;
        j0 j0Var = this.C;
        o0 o0VarR1 = j0Var.a().R0();
        if (Boolean.valueOf(z).equals(o0VarR1 != null ? Boolean.valueOf(o0VarR1.F) : null) || (o0VarR0 = j0Var.a().R0()) == null) {
            return;
        }
        o0VarR0.F = z;
    }

    @Override // androidx.compose.ui.node.a
    public final void Q() {
        this.Q = true;
        g0 g0Var = this.N;
        g0Var.h();
        j0 j0Var = this.C;
        boolean z = j0Var.f;
        f0 f0Var = j0Var.a;
        if (z) {
            androidx.compose.runtime.collection.b bVarZ = f0Var.z();
            Object[] objArr = bVarZ.e;
            int i = bVarZ.z;
            for (int i2 = 0; i2 < i; i2++) {
                f0 f0Var2 = (f0) objArr[i2];
                j0 j0Var2 = f0Var2.e0;
                if (j0Var2.e && f0Var2.t() == d0.e) {
                    r0 r0Var = j0Var2.q;
                    r0Var.getClass();
                    r0 r0Var2 = j0Var2.q;
                    androidx.compose.ui.unit.a aVar = r0Var2 != null ? r0Var2.J : null;
                    aVar.getClass();
                    if (r0Var.z0(aVar.a)) {
                        f0.T(f0Var, false, 7);
                    }
                }
            }
        }
        q qVar = g().p0;
        qVar.getClass();
        if (j0Var.g || (!qVar.H && j0Var.f)) {
            j0Var.f = false;
            b0 b0Var = j0Var.d;
            j0Var.d = b0.A;
            j0Var.i(false);
            o1 snapshotObserver = ((androidx.compose.ui.platform.u) i0.a(f0Var)).getSnapshotObserver();
            snapshotObserver.a.d(f0Var, snapshotObserver.h, this.R);
            j0Var.d = b0Var;
            if (j0Var.m && qVar.H) {
                requestLayout();
            }
            j0Var.g = false;
        }
        if (g0Var.b && g0Var.e()) {
            g0Var.g();
        }
        this.Q = false;
    }

    @Override // androidx.compose.ui.node.a
    public final void X() {
        f0.T(this.C.a, false, 7);
    }

    @Override // androidx.compose.ui.layout.p0
    public final int Z(int i) {
        u0();
        o0 o0VarR0 = this.C.a().R0();
        o0VarR0.getClass();
        return o0VarR0.Z(i);
    }

    @Override // androidx.compose.ui.layout.p0
    public final int b(int i) {
        u0();
        o0 o0VarR0 = this.C.a().R0();
        o0VarR0.getClass();
        return o0VarR0.b(i);
    }

    @Override // androidx.compose.ui.node.a
    public final g0 c() {
        return this.N;
    }

    @Override // androidx.compose.ui.node.a
    public final r g() {
        return (r) this.C.a.d0.d;
    }

    @Override // androidx.compose.ui.layout.c1
    public final void h0(long j, float f, kotlin.jvm.functions.l lVar) {
        w0(j, lVar);
    }

    @Override // androidx.compose.ui.node.a
    public final a k() {
        j0 j0Var;
        f0 f0VarV = this.C.a.v();
        if (f0VarV == null || (j0Var = f0VarV.e0) == null) {
            return null;
        }
        return j0Var.q;
    }

    public final boolean m0() {
        j0 j0Var = this.C;
        return k.o(j0Var.a) || j0Var.c;
    }

    public final void n0(boolean z) {
        if (z && m0()) {
            return;
        }
        if (z || m0()) {
            this.M = p0.z;
            androidx.compose.runtime.collection.b bVarZ = this.C.a.z();
            Object[] objArr = bVarZ.e;
            int i = bVarZ.z;
            for (int i2 = 0; i2 < i; i2++) {
                r0 r0Var = ((f0) objArr[i2]).e0.q;
                r0Var.getClass();
                r0Var.n0(true);
            }
        }
    }

    public final void o0() {
        p0 p0Var = this.M;
        j0 j0Var = this.C;
        boolean z = j0Var.c;
        f0 f0Var = j0Var.a;
        p0 p0Var2 = p0.e;
        if (z) {
            this.M = p0.y;
        } else {
            this.M = p0Var2;
        }
        if (p0Var != p0Var2 && j0Var.e) {
            f0.T(f0Var, true, 6);
        }
        androidx.compose.runtime.collection.b bVarZ = f0Var.z();
        Object[] objArr = bVarZ.e;
        int i = bVarZ.z;
        for (int i2 = 0; i2 < i; i2++) {
            f0 f0Var2 = (f0) objArr[i2];
            r0 r0Var = f0Var2.e0.q;
            if (r0Var == null) {
                net.luminis.tls.engine.impl.c.o("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
                return;
            }
            if (r0Var.F != Integer.MAX_VALUE) {
                r0Var.o0();
                f0.W(f0Var2);
            }
        }
    }

    @Override // androidx.compose.ui.node.a
    public final void requestLayout() {
        this.C.a.S(false);
    }

    public final void t0() {
        j0 j0Var = this.C;
        if (j0Var.o > 0) {
            androidx.compose.runtime.collection.b bVarZ = j0Var.a.z();
            Object[] objArr = bVarZ.e;
            int i = bVarZ.z;
            for (int i2 = 0; i2 < i; i2++) {
                f0 f0Var = (f0) objArr[i2];
                j0 j0Var2 = f0Var.e0;
                if ((j0Var2.m || j0Var2.n) && !j0Var2.f) {
                    f0Var.S(false);
                }
                r0 r0Var = j0Var2.q;
                if (r0Var != null) {
                    r0Var.t0();
                }
            }
        }
    }

    public final void u0() {
        d0 d0Var;
        j0 j0Var = this.C;
        f0.T(j0Var.a, false, 7);
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
        u0();
        o0 o0VarR0 = this.C.a().R0();
        o0VarR0.getClass();
        return o0VarR0.v(i);
    }

    public final void v0() {
        b0 b0Var;
        this.X = true;
        j0 j0Var = this.C;
        f0 f0VarV = j0Var.a.v();
        p0 p0Var = this.M;
        if ((p0Var != p0.e && !j0Var.c) || (p0Var != p0.y && j0Var.c)) {
            o0();
            if (this.D && f0VarV != null) {
                f0VarV.S(false);
            }
        }
        if (f0VarV != null) {
            j0 j0Var2 = f0VarV.e0;
            if (!this.D && ((b0Var = j0Var2.d) == b0.z || b0Var == b0.A)) {
                if (this.F != Integer.MAX_VALUE) {
                    androidx.compose.ui.internal.a.b("Place was called on a node which was placed already");
                }
                int i = j0Var2.h;
                this.F = i;
                j0Var2.h = i + 1;
            }
        } else {
            this.F = 0;
        }
        Q();
    }

    /* JADX WARN: Code duplicated, block: B:31:0x006e A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:3:0x0007, B:5:0x000d, B:7:0x0013, B:9:0x0018, B:12:0x001d, B:14:0x0021, B:15:0x0026, B:17:0x0035, B:19:0x0039, B:22:0x003f, B:21:0x003d, B:23:0x0042, B:25:0x004c, B:30:0x0056, B:32:0x0084, B:31:0x006e), top: B:36:0x0007 }] */
    public final void w0(long j, kotlin.jvm.functions.l lVar) {
        j0 j0Var = this.C;
        f0 f0Var = j0Var.a;
        f0 f0Var2 = j0Var.a;
        try {
            f0 f0VarV = f0Var.v();
            b0 b0Var = f0VarV != null ? f0VarV.e0.d : null;
            b0 b0Var2 = b0.A;
            if (b0Var == b0Var2) {
                j0Var.c = false;
            }
            if (f0Var2.o0) {
                androidx.compose.ui.internal.a.a("place is called on a deactivated node");
            }
            j0Var.d = b0Var2;
            boolean z = true;
            this.H = true;
            this.X = false;
            if (!androidx.compose.ui.unit.j.a(j, this.K)) {
                if (j0Var.n || j0Var.m) {
                    j0Var.f = true;
                }
                t0();
            }
            m1 m1VarA = i0.a(f0Var2);
            this.K = j;
            if (j0Var.f) {
                j0Var.h(false);
                this.N.e = false;
                o1 snapshotObserver = ((androidx.compose.ui.platform.u) m1VarA).getSnapshotObserver();
                snapshotObserver.a.d(f0Var2, snapshotObserver.g, this.W);
            } else {
                if (this.M == p0.z) {
                    z = false;
                }
                if (z) {
                    o0 o0VarR0 = j0Var.a().R0();
                    o0VarR0.getClass();
                    o0VarR0.K0(androidx.compose.ui.unit.j.c(j, o0VarR0.B));
                    v0();
                } else {
                    j0Var.h(false);
                    this.N.e = false;
                    o1 snapshotObserver2 = ((androidx.compose.ui.platform.u) m1VarA).getSnapshotObserver();
                    snapshotObserver2.a.d(f0Var2, snapshotObserver2.g, this.W);
                }
            }
            this.L = lVar;
            j0Var.d = b0.B;
        } catch (Throwable th) {
            f0Var.Y(th);
            throw null;
        }
    }

    @Override // androidx.compose.ui.node.a
    public final int x() {
        return this.F;
    }

    public final boolean z0(long j) {
        long j2;
        j0 j0Var = this.C;
        f0 f0Var = j0Var.a;
        f0 f0Var2 = j0Var.a;
        try {
            if (f0Var.o0) {
                androidx.compose.ui.internal.a.a("measure is called on a deactivated node");
            }
            f0 f0VarV = f0Var2.v();
            f0Var2.c0 = f0Var2.c0 || (f0VarV != null && f0VarV.c0);
            if (!f0Var2.e0.e) {
                androidx.compose.ui.unit.a aVar = this.J;
                if (aVar == null ? false : androidx.compose.ui.unit.a.b(aVar.a, j)) {
                    m1 m1Var = f0Var2.L;
                    if (m1Var != null) {
                        ((androidx.compose.ui.platform.u) m1Var).k(f0Var2, true);
                    }
                    f0Var2.X();
                    return false;
                }
            }
            this.J = new androidx.compose.ui.unit.a(j);
            l0(j);
            this.N.d = false;
            androidx.compose.runtime.collection.b bVarZ = f0Var2.z();
            Object[] objArr = bVarZ.e;
            int i = bVarZ.z;
            for (int i2 = 0; i2 < i; i2++) {
                r0 r0Var = ((f0) objArr[i2]).e0.q;
                r0Var.getClass();
                r0Var.N.getClass();
            }
            if (this.I) {
                j2 = this.z;
            } else {
                long j3 = Integer.MIN_VALUE;
                j2 = (j3 & 4294967295L) | (j3 << 32);
            }
            this.I = true;
            o0 o0VarR0 = j0Var.a().R0();
            if (!(o0VarR0 != null)) {
                androidx.compose.ui.internal.a.b("Lookahead result from lookaheadRemeasure cannot be null");
            }
            j0Var.c(j);
            j0((((long) o0VarR0.y) & 4294967295L) | (((long) o0VarR0.e) << 32));
            return (((int) (j2 >> 32)) == o0VarR0.e && ((int) (j2 & 4294967295L)) == o0VarR0.y) ? false : true;
        } catch (Throwable th) {
            f0Var.Y(th);
            throw null;
        }
    }
}
