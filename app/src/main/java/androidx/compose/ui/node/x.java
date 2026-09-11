package androidx.compose.ui.node;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class x extends d1 {
    public static final com.google.android.gms.cloudmessaging.n q0;
    public v o0;
    public w p0;

    static {
        com.google.android.gms.cloudmessaging.n nVarG = androidx.compose.ui.graphics.a0.g();
        int i = androidx.compose.ui.graphics.t.j;
        nVarG.h(androidx.compose.ui.graphics.t.f);
        nVarG.n(1.0f);
        nVarG.o(1);
        q0 = nVarG;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public x(f0 f0Var, v vVar) {
        super(f0Var);
        this.o0 = vVar;
        this.p0 = f0Var.F != null ? new w(this) : null;
        if ((((androidx.compose.ui.q) vVar).e.z & 512) == 0) {
            return;
        }
        androidx.transition.k.i();
        throw null;
    }

    @Override // androidx.compose.ui.layout.p0
    public final int B(int i) {
        v vVar = this.o0;
        d1 d1Var = this.M;
        d1Var.getClass();
        return vVar.v(this, d1Var, i);
    }

    @Override // androidx.compose.ui.layout.p0
    public final androidx.compose.ui.layout.c1 F(long j) {
        l0(j);
        v vVar = this.o0;
        d1 d1Var = this.M;
        d1Var.getClass();
        m1(vVar.c(this, d1Var, j));
        d1();
        return this;
    }

    @Override // androidx.compose.ui.node.d1
    public final void O0() {
        if (this.p0 == null) {
            this.p0 = new w(this);
        }
    }

    @Override // androidx.compose.ui.node.d1
    public final o0 R0() {
        return this.p0;
    }

    @Override // androidx.compose.ui.node.d1
    public final androidx.compose.ui.q T0() {
        return ((androidx.compose.ui.q) this.o0).e;
    }

    @Override // androidx.compose.ui.layout.p0
    public final int Z(int i) {
        v vVar = this.o0;
        d1 d1Var = this.M;
        d1Var.getClass();
        return vVar.a0(this, d1Var, i);
    }

    @Override // androidx.compose.ui.layout.p0
    public final int b(int i) {
        v vVar = this.o0;
        d1 d1Var = this.M;
        d1Var.getClass();
        return vVar.v0(this, d1Var, i);
    }

    @Override // androidx.compose.ui.layout.c1
    public final void h0(long j, float f, kotlin.jvm.functions.l lVar) {
        j1(j, f, lVar);
        if (this.G) {
            return;
        }
        e1();
        d1 d1Var = this.M;
        d1Var.getClass();
        d1Var.H = this.H;
        B0().d();
        d1Var.H = false;
    }

    @Override // androidx.compose.ui.node.d1
    public final void i1(androidx.compose.ui.graphics.r rVar, androidx.compose.ui.graphics.layer.b bVar) {
        d1 d1Var;
        d1 d1Var2 = this.M;
        d1Var2.getClass();
        d1Var2.M0(rVar, bVar);
        if (!((androidx.compose.ui.platform.u) i0.a(this.L)).getShowLayoutBounds() || (d1Var = this.M) == null) {
            return;
        }
        if (androidx.compose.ui.unit.l.a(this.z, d1Var.z) && androidx.compose.ui.unit.j.a(d1Var.W, 0L)) {
            return;
        }
        long j = this.z;
        rVar.m(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, q0);
    }

    @Override // androidx.compose.ui.node.n0
    public final int n0(androidx.compose.ui.layout.a aVar) {
        w wVar = this.p0;
        if (wVar == null) {
            return k.c(this, aVar);
        }
        androidx.collection.f0 f0Var = wVar.Q;
        int iD = f0Var.d(aVar);
        if (iD >= 0) {
            return f0Var.c[iD];
        }
        return Integer.MIN_VALUE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void u1(v vVar) {
        if (vVar.equals(this.o0) || (((androidx.compose.ui.q) vVar).e.z & 512) == 0) {
            this.o0 = vVar;
        } else {
            androidx.transition.k.i();
        }
    }

    @Override // androidx.compose.ui.layout.p0
    public final int v(int i) {
        v vVar = this.o0;
        d1 d1Var = this.M;
        d1Var.getClass();
        return vVar.B(this, d1Var, i);
    }
}
