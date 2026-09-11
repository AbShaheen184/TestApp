package androidx.compose.ui.layout;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
final class v0 extends androidx.compose.ui.node.w0 {
    public final kotlin.jvm.functions.l b;

    public v0(kotlin.jvm.functions.l lVar) {
        this.b = lVar;
    }

    @Override // androidx.compose.ui.node.w0
    public final androidx.compose.ui.q e() {
        w0 w0Var = new w0();
        w0Var.L = this.b;
        return w0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v0) {
            return this.b == ((v0) obj).b;
        }
        return false;
    }

    @Override // androidx.compose.ui.node.w0
    public final void f(androidx.compose.ui.q qVar) {
        ((w0) qVar).L = this.b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
