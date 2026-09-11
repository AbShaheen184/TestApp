package androidx.compose.ui.focus;

import androidx.compose.ui.node.w0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
final class z extends w0 {
    public final y b;

    public z(y yVar) {
        this.b = yVar;
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
        return (obj instanceof z) && kotlin.jvm.internal.l.a(this.b, ((z) obj).b);
    }

    @Override // androidx.compose.ui.node.w0
    public final void f(androidx.compose.ui.q qVar) {
        b0 b0Var = (b0) qVar;
        b0Var.L.a.j(b0Var);
        y yVar = this.b;
        b0Var.L = yVar;
        yVar.a.b(b0Var);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "FocusRequesterElement(focusRequester=" + this.b + ')';
    }
}
