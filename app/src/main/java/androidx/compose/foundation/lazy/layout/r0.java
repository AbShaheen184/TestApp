package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.gestures.k1;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
final class r0 extends androidx.compose.ui.node.w0 {
    public final kotlin.jvm.functions.a b;
    public final q0 c;
    public final k1 d;
    public final boolean e;

    public r0(kotlin.jvm.functions.a aVar, q0 q0Var, k1 k1Var, boolean z) {
        this.b = aVar;
        this.c = q0Var;
        this.d = k1Var;
        this.e = z;
    }

    @Override // androidx.compose.ui.node.w0
    public final androidx.compose.ui.q e() {
        return new v0(this.b, this.c, this.d, this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r0)) {
            return false;
        }
        r0 r0Var = (r0) obj;
        return this.b == r0Var.b && kotlin.jvm.internal.l.a(this.c, r0Var.c) && this.d == r0Var.d && this.e == r0Var.e;
    }

    @Override // androidx.compose.ui.node.w0
    public final void f(androidx.compose.ui.q qVar) {
        v0 v0Var = (v0) qVar;
        v0Var.L = this.b;
        v0Var.M = this.c;
        k1 k1Var = v0Var.N;
        k1 k1Var2 = this.d;
        if (k1Var != k1Var2) {
            v0Var.N = k1Var2;
            androidx.compose.ui.node.k.l(v0Var);
        }
        boolean z = v0Var.O;
        boolean z2 = this.e;
        if (z == z2) {
            return;
        }
        v0Var.O = z2;
        v0Var.L0();
        androidx.compose.ui.node.k.l(v0Var);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + androidx.privacysandbox.ads.adservices.java.internal.a.f((this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31)) * 31, 31, this.e);
    }
}
