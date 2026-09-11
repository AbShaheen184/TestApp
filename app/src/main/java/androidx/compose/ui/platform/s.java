package androidx.compose.ui.platform;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends androidx.compose.ui.node.w0 {
    public final /* synthetic */ u b;

    public s(u uVar) {
        this.b = uVar;
    }

    @Override // androidx.compose.ui.node.w0
    public final androidx.compose.ui.q e() {
        return new k(this.b);
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    @Override // androidx.compose.ui.node.w0
    public final /* bridge */ /* synthetic */ void f(androidx.compose.ui.q qVar) {
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
