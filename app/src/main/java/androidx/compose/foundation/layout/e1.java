package androidx.compose.foundation.layout;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e1 extends androidx.compose.ui.q implements androidx.compose.ui.node.v {
    public z L;
    public kotlin.jvm.functions.p M;

    @Override // androidx.compose.ui.node.v
    public final androidx.compose.ui.layout.r0 c(final androidx.compose.ui.layout.s0 s0Var, androidx.compose.ui.layout.p0 p0Var, long j) {
        final androidx.compose.ui.layout.c1 c1VarF = p0Var.F(androidx.compose.ui.unit.b.a(this.L != z.e ? 0 : androidx.compose.ui.unit.a.j(j), androidx.compose.ui.unit.a.h(j), this.L == z.y ? androidx.compose.ui.unit.a.i(j) : 0, androidx.compose.ui.unit.a.g(j)));
        final int iC = com.google.android.material.resources.c.c(c1VarF.e, androidx.compose.ui.unit.a.j(j), androidx.compose.ui.unit.a.h(j));
        final int iC2 = com.google.android.material.resources.c.c(c1VarF.y, androidx.compose.ui.unit.a.i(j), androidx.compose.ui.unit.a.g(j));
        return s0Var.q(iC, iC2, kotlin.collections.v.e, new kotlin.jvm.functions.l() { // from class: androidx.compose.foundation.layout.d1
            @Override // kotlin.jvm.functions.l
            public final Object invoke(Object obj) {
                kotlin.jvm.functions.p pVar = this.e.M;
                androidx.compose.ui.layout.c1 c1Var = c1VarF;
                androidx.compose.ui.layout.b1.k((androidx.compose.ui.layout.b1) obj, c1Var, ((androidx.compose.ui.unit.j) pVar.invoke(new androidx.compose.ui.unit.l((((long) (iC - c1Var.e)) << 32) | (((long) (iC2 - c1Var.y)) & 4294967295L)), s0Var.getLayoutDirection())).a);
                return kotlin.y.a;
            }
        });
    }
}
