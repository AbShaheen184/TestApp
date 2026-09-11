package androidx.compose.foundation.layout;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class o0 extends androidx.compose.ui.q implements androidx.compose.ui.node.v {
    public m0 L;

    @Override // androidx.compose.ui.node.v
    public final androidx.compose.ui.layout.r0 c(androidx.compose.ui.layout.s0 s0Var, androidx.compose.ui.layout.p0 p0Var, long j) {
        float fA = this.L.a(s0Var.getLayoutDirection());
        m0 m0Var = this.L;
        float f = m0Var.b;
        float fB = m0Var.b(s0Var.getLayoutDirection());
        float f2 = this.L.d;
        float f3 = 0;
        if (!((androidx.compose.ui.unit.f.a(f2, f3) >= 0) & (androidx.compose.ui.unit.f.a(fA, f3) >= 0) & (androidx.compose.ui.unit.f.a(f, f3) >= 0) & (androidx.compose.ui.unit.f.a(fB, f3) >= 0))) {
            androidx.compose.foundation.layout.internal.a.a("Padding must be non-negative");
        }
        int iG0 = s0Var.g0(fA);
        int iG1 = s0Var.g0(fB) + iG0;
        int iG2 = s0Var.g0(f);
        int iG3 = s0Var.g0(f2) + iG2;
        androidx.compose.ui.layout.c1 c1VarF = p0Var.F(androidx.compose.ui.unit.b.i(-iG1, -iG3, j));
        return s0Var.q(androidx.compose.ui.unit.b.g(c1VarF.e + iG1, j), androidx.compose.ui.unit.b.f(c1VarF.y + iG3, j), kotlin.collections.v.e, new n0(iG0, iG2, 0, c1VarF));
    }
}
