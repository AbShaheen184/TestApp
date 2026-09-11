package androidx.compose.ui.layout;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
final class x0 extends androidx.compose.ui.node.w0 {
    public final kotlin.jvm.functions.l b;

    public x0(kotlin.jvm.functions.l lVar) {
        this.b = lVar;
    }

    @Override // androidx.compose.ui.node.w0
    public final androidx.compose.ui.q e() {
        y0 y0Var = new y0();
        y0Var.L = this.b;
        long j = Integer.MIN_VALUE;
        y0Var.M = (j & 4294967295L) | (j << 32);
        return y0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x0) {
            return this.b == ((x0) obj).b;
        }
        return false;
    }

    @Override // androidx.compose.ui.node.w0
    public final void f(androidx.compose.ui.q qVar) {
        y0 y0Var = (y0) qVar;
        y0Var.L = this.b;
        long j = Integer.MIN_VALUE;
        y0Var.M = (j & 4294967295L) | (j << 32);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
