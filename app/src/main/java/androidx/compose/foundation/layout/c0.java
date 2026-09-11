package androidx.compose.foundation.layout;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 extends androidx.compose.ui.node.w0 {
    public final androidx.compose.ui.h b;

    public c0(androidx.compose.ui.h hVar) {
        this.b = hVar;
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
        c0 c0Var = obj instanceof c0 ? (c0) obj : null;
        if (c0Var == null) {
            return false;
        }
        return this.b.equals(c0Var.b);
    }

    @Override // androidx.compose.ui.node.w0
    public final void f(androidx.compose.ui.q qVar) {
        ((d0) qVar).L = this.b;
    }

    public final int hashCode() {
        return Float.hashCode(this.b.a);
    }
}
