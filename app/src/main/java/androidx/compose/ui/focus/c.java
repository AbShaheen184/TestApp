package androidx.compose.ui.focus;

import androidx.compose.ui.node.w0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
final class c extends w0 {
    public final kotlin.jvm.functions.l b;

    public c(kotlin.jvm.functions.l lVar) {
        this.b = lVar;
    }

    @Override // androidx.compose.ui.node.w0
    public final androidx.compose.ui.q e() {
        e eVar = new e();
        eVar.L = this.b;
        return eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            return this.b == ((c) obj).b;
        }
        return false;
    }

    @Override // androidx.compose.ui.node.w0
    public final void f(androidx.compose.ui.q qVar) {
        ((e) qVar).L = this.b;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
