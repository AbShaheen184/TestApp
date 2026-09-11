package androidx.compose.foundation.layout;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 extends androidx.compose.ui.node.w0 {
    public final float b;
    public final boolean c;

    public h0(float f, boolean z) {
        this.b = f;
        this.c = z;
    }

    @Override // androidx.compose.ui.node.w0
    public final androidx.compose.ui.q e() {
        i0 i0Var = new i0();
        i0Var.L = this.b;
        i0Var.M = this.c;
        return i0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        h0 h0Var = obj instanceof h0 ? (h0) obj : null;
        return h0Var != null && this.b == h0Var.b && this.c == h0Var.c;
    }

    @Override // androidx.compose.ui.node.w0
    public final void f(androidx.compose.ui.q qVar) {
        i0 i0Var = (i0) qVar;
        i0Var.L = this.b;
        i0Var.M = this.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + (Float.hashCode(this.b) * 31);
    }
}
