package androidx.compose.material3.internal;

import androidx.compose.ui.node.w0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends w0 {
    public final androidx.compose.foundation.lazy.i b;

    public f(androidx.compose.foundation.lazy.i iVar) {
        this.b = iVar;
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
        if (obj instanceof f) {
            return this.b == ((f) obj).b;
        }
        return false;
    }

    @Override // androidx.compose.ui.node.w0
    public final void f(androidx.compose.ui.q qVar) {
        e eVar = (e) qVar;
        eVar.L = this.b;
        androidx.compose.ui.node.k.l(eVar);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
