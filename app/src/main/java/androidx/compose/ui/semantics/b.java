package androidx.compose.ui.semantics;

import androidx.compose.ui.node.w0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends w0 {
    public final boolean b;
    public final kotlin.jvm.functions.l c;

    public b(kotlin.jvm.functions.l lVar, boolean z) {
        this.b = z;
        this.c = lVar;
    }

    @Override // androidx.compose.ui.node.w0
    public final androidx.compose.ui.q e() {
        d dVar = new d();
        dVar.L = this.b;
        dVar.M = this.c;
        return dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.b == bVar.b && this.c == bVar.c;
    }

    @Override // androidx.compose.ui.node.w0
    public final void f(androidx.compose.ui.q qVar) {
        d dVar = (d) qVar;
        dVar.L = this.b;
        dVar.M = this.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + (Boolean.hashCode(this.b) * 31);
    }
}
