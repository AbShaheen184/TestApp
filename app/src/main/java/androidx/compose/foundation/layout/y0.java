package androidx.compose.foundation.layout;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
final class y0 extends androidx.compose.ui.node.w0 {
    public final float b;
    public final float c;

    public y0(float f, float f2) {
        this.b = f;
        this.c = f2;
    }

    @Override // androidx.compose.ui.node.w0
    public final androidx.compose.ui.q e() {
        z0 z0Var = new z0();
        z0Var.L = this.b;
        z0Var.M = this.c;
        return z0Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return androidx.compose.ui.unit.f.d(this.b, y0Var.b) && androidx.compose.ui.unit.f.d(this.c, y0Var.c);
    }

    @Override // androidx.compose.ui.node.w0
    public final void f(androidx.compose.ui.q qVar) {
        z0 z0Var = (z0) qVar;
        z0Var.L = this.b;
        z0Var.M = this.c;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + (Float.hashCode(this.b) * 31);
    }
}
