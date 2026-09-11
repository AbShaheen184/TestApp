package androidx.compose.foundation.layout;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
final class l extends androidx.compose.ui.node.w0 {
    public final androidx.compose.ui.j b;

    public l(androidx.compose.ui.j jVar) {
        this.b = jVar;
    }

    @Override // androidx.compose.ui.node.w0
    public final androidx.compose.ui.q e() {
        m mVar = new m();
        mVar.L = this.b;
        return mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        l lVar = obj instanceof l ? (l) obj : null;
        return lVar != null && this.b.equals(lVar.b);
    }

    @Override // androidx.compose.ui.node.w0
    public final void f(androidx.compose.ui.q qVar) {
        ((m) qVar).L = this.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.b.hashCode() * 31);
    }
}
