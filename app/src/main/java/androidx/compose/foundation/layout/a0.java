package androidx.compose.foundation.layout;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends androidx.compose.ui.node.w0 {
    public final z b;
    public final float c;

    public a0(z zVar, float f) {
        this.b = zVar;
        this.c = f;
    }

    @Override // androidx.compose.ui.node.w0
    public final androidx.compose.ui.q e() {
        b0 b0Var = new b0();
        b0Var.L = this.b;
        b0Var.M = this.c;
        return b0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return this.b == a0Var.b && this.c == a0Var.c;
    }

    @Override // androidx.compose.ui.node.w0
    public final void f(androidx.compose.ui.q qVar) {
        b0 b0Var = (b0) qVar;
        b0Var.L = this.b;
        b0Var.M = this.c;
    }

    public final int hashCode() {
        return Float.hashCode(this.c) + (this.b.hashCode() * 31);
    }
}
