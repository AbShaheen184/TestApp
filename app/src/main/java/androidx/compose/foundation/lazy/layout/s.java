package androidx.compose.foundation.lazy.layout;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
final class s extends androidx.compose.ui.node.w0 {
    public final v b;

    public s(v vVar) {
        this.b = vVar;
    }

    @Override // androidx.compose.ui.node.w0
    public final androidx.compose.ui.q e() {
        t tVar = new t();
        tVar.L = this.b;
        return tVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s) && this.b.equals(((s) obj).b);
    }

    @Override // androidx.compose.ui.node.w0
    public final void f(androidx.compose.ui.q qVar) {
        t tVar = (t) qVar;
        v vVar = tVar.L;
        v vVar2 = this.b;
        if (kotlin.jvm.internal.l.a(vVar, vVar2) || !tVar.e.K) {
            return;
        }
        v vVar3 = tVar.L;
        vVar3.d();
        vVar3.b = null;
        tVar.L = vVar2;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "DisplayingDisappearingItemsElement(animator=" + this.b + ')';
    }
}
