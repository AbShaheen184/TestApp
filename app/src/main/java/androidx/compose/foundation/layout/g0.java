package androidx.compose.foundation.layout;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g0 extends androidx.compose.ui.q implements androidx.compose.ui.node.v {
    public e0 L;
    public boolean M;

    @Override // androidx.compose.ui.node.v
    public final int B(androidx.compose.ui.node.n0 n0Var, androidx.compose.ui.layout.p0 p0Var, int i) {
        return this.L == e0.e ? p0Var.v(i) : p0Var.B(i);
    }

    @Override // androidx.compose.ui.node.v
    public final int a0(androidx.compose.ui.node.n0 n0Var, androidx.compose.ui.layout.p0 p0Var, int i) {
        return p0Var.Z(i);
    }

    @Override // androidx.compose.ui.node.v
    public final androidx.compose.ui.layout.r0 c(androidx.compose.ui.layout.s0 s0Var, androidx.compose.ui.layout.p0 p0Var, long j) {
        int iV = this.L == e0.e ? p0Var.v(androidx.compose.ui.unit.a.g(j)) : p0Var.B(androidx.compose.ui.unit.a.g(j));
        if (iV < 0) {
            iV = 0;
        }
        if (iV < 0) {
            androidx.compose.ui.unit.i.a("width must be >= 0");
        }
        long jH = androidx.compose.ui.unit.b.h(iV, iV, 0, Integer.MAX_VALUE);
        if (this.M) {
            jH = androidx.compose.ui.unit.b.e(j, jH);
        }
        androidx.compose.ui.layout.c1 c1VarF = p0Var.F(jH);
        return s0Var.q(c1VarF.e, c1VarF.y, kotlin.collections.v.e, new j(c1VarF, 2));
    }

    @Override // androidx.compose.ui.node.v
    public final int v(androidx.compose.ui.node.n0 n0Var, androidx.compose.ui.layout.p0 p0Var, int i) {
        return this.L == e0.e ? p0Var.v(i) : p0Var.B(i);
    }

    @Override // androidx.compose.ui.node.v
    public final int v0(androidx.compose.ui.node.n0 n0Var, androidx.compose.ui.layout.p0 p0Var, int i) {
        return p0Var.b(i);
    }
}
