package androidx.compose.foundation.text.contextmenu.modifier;

import androidx.compose.foundation.text.selection.u0;
import androidx.compose.ui.node.w0;
import androidx.compose.ui.q;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
final class e extends w0 {
    public final u0 b;

    public e(u0 u0Var) {
        this.b = u0Var;
    }

    @Override // androidx.compose.ui.node.w0
    public final q e() {
        return new g(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof e) {
            return this.b == ((e) obj).b;
        }
        return false;
    }

    @Override // androidx.compose.ui.node.w0
    public final void f(q qVar) {
        ((g) qVar).N = this.b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
