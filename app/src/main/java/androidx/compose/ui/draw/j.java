package androidx.compose.ui.draw;

import androidx.compose.ui.node.w0;
import androidx.compose.ui.q;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
final class j extends w0 {
    public final kotlin.jvm.functions.l b;

    public j(kotlin.jvm.functions.l lVar) {
        this.b = lVar;
    }

    @Override // androidx.compose.ui.node.w0
    public final q e() {
        return new c(new d(), this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof j) {
            return this.b == ((j) obj).b;
        }
        return false;
    }

    @Override // androidx.compose.ui.node.w0
    public final void f(q qVar) {
        c cVar = (c) qVar;
        cVar.N = this.b;
        cVar.L0();
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
