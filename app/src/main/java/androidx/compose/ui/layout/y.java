package androidx.compose.ui.layout;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
final class y extends androidx.compose.ui.node.w0 {
    public final kotlin.jvm.functions.q b;

    public y(kotlin.jvm.functions.q qVar) {
        this.b = qVar;
    }

    @Override // androidx.compose.ui.node.w0
    public final androidx.compose.ui.q e() {
        d0 d0Var = new d0();
        d0Var.L = this.b;
        return d0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y) {
            return this.b == ((y) obj).b;
        }
        return false;
    }

    @Override // androidx.compose.ui.node.w0
    public final void f(androidx.compose.ui.q qVar) {
        ((d0) qVar).L = this.b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
