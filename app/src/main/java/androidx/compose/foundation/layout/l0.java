package androidx.compose.foundation.layout;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
final class l0 extends androidx.compose.ui.node.w0 {
    public final m0 b;

    public l0(m0 m0Var) {
        this.b = m0Var;
    }

    @Override // androidx.compose.ui.node.w0
    public final androidx.compose.ui.q e() {
        o0 o0Var = new o0();
        o0Var.L = this.b;
        return o0Var;
    }

    public final boolean equals(Object obj) {
        l0 l0Var = obj instanceof l0 ? (l0) obj : null;
        if (l0Var == null) {
            return false;
        }
        return kotlin.jvm.internal.l.a(this.b, l0Var.b);
    }

    @Override // androidx.compose.ui.node.w0
    public final void f(androidx.compose.ui.q qVar) {
        ((o0) qVar).L = this.b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
