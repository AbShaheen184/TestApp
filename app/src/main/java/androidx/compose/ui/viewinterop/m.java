package androidx.compose.ui.viewinterop;

import androidx.compose.ui.input.pointer.b0;
import androidx.compose.ui.node.w0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
final class m extends w0 {
    public final b0 b;

    public m(b0 b0Var) {
        this.b = b0Var;
    }

    @Override // androidx.compose.ui.node.w0
    public final androidx.compose.ui.q e() {
        return new n(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m) {
            return this.b == ((m) obj).b;
        }
        return false;
    }

    @Override // androidx.compose.ui.node.w0
    public final void f(androidx.compose.ui.q qVar) {
        n nVar = (n) qVar;
        b0 b0Var = this.b;
        nVar.L = b0Var;
        if (nVar.K) {
            b0Var.invoke(nVar.M);
        }
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
