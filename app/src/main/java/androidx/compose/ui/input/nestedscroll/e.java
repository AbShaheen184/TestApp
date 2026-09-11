package androidx.compose.ui.input.nestedscroll;

import androidx.compose.animation.z;
import androidx.compose.ui.node.w0;
import androidx.compose.ui.q;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
final class e extends w0 {
    public final d b;

    public e(d dVar) {
        this.b = dVar;
    }

    @Override // androidx.compose.ui.node.w0
    public final q e() {
        return new i(androidx.compose.ui.viewinterop.i.a, this.b);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        Object obj2 = androidx.compose.ui.viewinterop.i.a;
        return obj2.equals(obj2) && eVar.b.equals(this.b);
    }

    @Override // androidx.compose.ui.node.w0
    public final void f(q qVar) {
        i iVar = (i) qVar;
        iVar.L = androidx.compose.ui.viewinterop.i.a;
        d dVar = iVar.M;
        if (dVar.a == iVar) {
            dVar.a = null;
        }
        d dVar2 = this.b;
        if (!dVar2.equals(dVar)) {
            iVar.M = dVar2;
        }
        if (iVar.K) {
            d dVar3 = iVar.M;
            dVar3.a = iVar;
            dVar3.b = null;
            iVar.N = null;
            dVar3.c = new z(iVar, 4);
            dVar3.d = iVar.z0();
        }
    }

    public final int hashCode() {
        return this.b.hashCode() + (androidx.compose.ui.viewinterop.i.a.hashCode() * 31);
    }
}
