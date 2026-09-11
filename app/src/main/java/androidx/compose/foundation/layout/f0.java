package androidx.compose.foundation.layout;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
final class f0 extends androidx.compose.ui.node.w0 {
    @Override // androidx.compose.ui.node.w0
    public final androidx.compose.ui.q e() {
        g0 g0Var = new g0();
        g0Var.L = e0.y;
        g0Var.M = true;
        return g0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f0 ? (f0) obj : null) != null;
    }

    @Override // androidx.compose.ui.node.w0
    public final void f(androidx.compose.ui.q qVar) {
        g0 g0Var = (g0) qVar;
        g0Var.L = e0.y;
        g0Var.M = true;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (e0.y.hashCode() * 31);
    }
}
