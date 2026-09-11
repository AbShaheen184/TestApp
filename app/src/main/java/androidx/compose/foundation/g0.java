package androidx.compose.foundation;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
final class g0 extends androidx.compose.ui.node.w0 {
    public final androidx.compose.foundation.interaction.k b;
    public final kotlin.jvm.functions.a c;
    public final kotlin.jvm.functions.a d;

    public g0(androidx.compose.foundation.interaction.k kVar, kotlin.jvm.functions.a aVar, kotlin.jvm.functions.a aVar2) {
        this.b = kVar;
        this.c = aVar;
        this.d = aVar2;
    }

    @Override // androidx.compose.ui.node.w0
    public final androidx.compose.ui.q e() {
        return new k0(this.b, this.c, this.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g0.class != obj.getClass()) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return kotlin.jvm.internal.l.a(this.b, g0Var.b) && this.c == g0Var.c && this.d == g0Var.d;
    }

    @Override // androidx.compose.ui.node.w0
    public final void f(androidx.compose.ui.q qVar) {
        androidx.compose.ui.input.pointer.l0 l0Var;
        k0 k0Var = (k0) qVar;
        k0Var.k0 = true;
        boolean z = false;
        boolean z2 = k0Var.j0 == null;
        kotlin.jvm.functions.a aVar = this.d;
        if (z2 != (aVar == null)) {
            k0Var.R0();
            androidx.compose.ui.node.k.l(k0Var);
            z = true;
        }
        k0Var.j0 = aVar;
        boolean z3 = k0Var.S ? z : true;
        k0Var.Z0(this.b, null, false, true, null, null, this.c);
        if (!z3 || (l0Var = k0Var.W) == null) {
            return;
        }
        l0Var.N0();
    }

    public final int hashCode() {
        androidx.compose.foundation.interaction.k kVar = this.b;
        int iHashCode = (this.c.hashCode() + androidx.privacysandbox.ads.adservices.java.internal.a.f(androidx.privacysandbox.ads.adservices.java.internal.a.f((kVar != null ? kVar.hashCode() : 0) * 961, 31, false), 29791, true)) * 961;
        kotlin.jvm.functions.a aVar = this.d;
        return Boolean.hashCode(true) + ((iHashCode + (aVar != null ? aVar.hashCode() : 0)) * 961);
    }
}
