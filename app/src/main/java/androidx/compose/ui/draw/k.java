package androidx.compose.ui.draw;

import androidx.compose.ui.node.w0;
import androidx.compose.ui.q;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
final class k extends w0 {
    public final kotlin.jvm.functions.l b;

    public k(kotlin.jvm.functions.l lVar) {
        this.b = lVar;
    }

    @Override // androidx.compose.ui.node.w0
    public final q e() {
        l lVar = new l();
        lVar.L = this.b;
        return lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof k) {
            return this.b == ((k) obj).b;
        }
        return false;
    }

    @Override // androidx.compose.ui.node.w0
    public final void f(q qVar) {
        ((l) qVar).L = this.b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
