package androidx.compose.foundation;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class y extends androidx.compose.ui.node.j implements androidx.compose.ui.node.u1 {
    public u N;
    public float O;
    public androidx.compose.ui.graphics.p0 P;
    public androidx.compose.ui.graphics.n0 Q;
    public final androidx.compose.ui.draw.c R;

    public y(float f, androidx.compose.ui.graphics.p0 p0Var, androidx.compose.ui.graphics.n0 n0Var) {
        this.O = f;
        this.P = p0Var;
        this.Q = n0Var;
        androidx.compose.ui.draw.c cVar = new androidx.compose.ui.draw.c(new androidx.compose.ui.draw.d(), new androidx.activity.compose.g(this, 2));
        L0(cVar);
        this.R = cVar;
    }

    @Override // androidx.compose.ui.q
    public final boolean A0() {
        return false;
    }

    @Override // androidx.compose.ui.node.u1
    public final boolean f() {
        return false;
    }

    @Override // androidx.compose.ui.node.u1
    public final void l0(androidx.compose.ui.semantics.x xVar) {
        androidx.compose.ui.semantics.v.d(xVar, this.Q);
    }
}
