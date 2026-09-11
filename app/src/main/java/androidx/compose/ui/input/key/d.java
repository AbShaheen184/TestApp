package androidx.compose.ui.input.key;

import androidx.compose.ui.node.w0;
import androidx.compose.ui.q;
import kotlin.jvm.functions.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
final class d extends w0 {
    public final l b;
    public final l c;

    public d(l lVar, l lVar2) {
        this.b = lVar;
        this.c = lVar2;
    }

    @Override // androidx.compose.ui.node.w0
    public final q e() {
        f fVar = new f();
        fVar.L = this.b;
        fVar.M = this.c;
        return fVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.b == dVar.b && this.c == dVar.c;
    }

    @Override // androidx.compose.ui.node.w0
    public final void f(q qVar) {
        f fVar = (f) qVar;
        fVar.L = this.b;
        fVar.M = this.c;
    }

    public final int hashCode() {
        l lVar = this.b;
        int iHashCode = (lVar != null ? lVar.hashCode() : 0) * 31;
        l lVar2 = this.c;
        return iHashCode + (lVar2 != null ? lVar2.hashCode() : 0);
    }
}
