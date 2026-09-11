package androidx.compose.ui.layout;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
final class z extends androidx.compose.ui.node.w0 {
    public final String b;

    public z(String str) {
        this.b = str;
    }

    @Override // androidx.compose.ui.node.w0
    public final androidx.compose.ui.q e() {
        b0 b0Var = new b0();
        b0Var.L = this.b;
        return b0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && this.b.equals(((z) obj).b);
    }

    @Override // androidx.compose.ui.node.w0
    public final void f(androidx.compose.ui.q qVar) {
        ((b0) qVar).L = this.b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "LayoutIdElement(layoutId=" + ((Object) this.b) + ')';
    }
}
