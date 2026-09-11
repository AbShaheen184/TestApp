package androidx.compose.foundation.layout;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 extends androidx.compose.ui.q implements androidx.compose.ui.node.v {
    public float L;
    public float M;
    public float N;
    public float O;
    public boolean P;

    @Override // androidx.compose.ui.node.v
    public final androidx.compose.ui.layout.r0 c(androidx.compose.ui.layout.s0 s0Var, androidx.compose.ui.layout.p0 p0Var, long j) {
        int iG0 = s0Var.g0(this.N) + s0Var.g0(this.L);
        int iG1 = s0Var.g0(this.O) + s0Var.g0(this.M);
        androidx.compose.ui.layout.c1 c1VarF = p0Var.F(androidx.compose.ui.unit.b.i(-iG0, -iG1, j));
        return s0Var.q(androidx.compose.ui.unit.b.g(c1VarF.e + iG0, j), androidx.compose.ui.unit.b.f(c1VarF.y + iG1, j), kotlin.collections.v.e, new androidx.activity.compose.h(14, this, c1VarF));
    }
}
