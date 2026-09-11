package androidx.compose.foundation;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
final class b1 extends androidx.compose.ui.node.w0 {
    public final androidx.compose.foundation.interaction.k b;
    public final d1 c;

    public b1(androidx.compose.foundation.interaction.k kVar, d1 d1Var) {
        this.b = kVar;
        this.c = d1Var;
    }

    @Override // androidx.compose.ui.node.w0
    public final androidx.compose.ui.q e() {
        androidx.compose.ui.node.i iVarA = this.c.a(this.b);
        c1 c1Var = new c1();
        c1Var.N = iVarA;
        c1Var.L0(iVarA);
        return c1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj;
        return kotlin.jvm.internal.l.a(this.b, b1Var.b) && kotlin.jvm.internal.l.a(this.c, b1Var.c);
    }

    @Override // androidx.compose.ui.node.w0
    public final void f(androidx.compose.ui.q qVar) {
        c1 c1Var = (c1) qVar;
        androidx.compose.ui.node.i iVarA = this.c.a(this.b);
        c1Var.M0(c1Var.N);
        c1Var.N = iVarA;
        c1Var.L0(iVarA);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }
}
