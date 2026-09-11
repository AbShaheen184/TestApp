package androidx.compose.foundation;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
final class q0 extends androidx.compose.ui.node.w0 {
    public final androidx.compose.foundation.interaction.k b;

    public q0(androidx.compose.foundation.interaction.k kVar) {
        this.b = kVar;
    }

    @Override // androidx.compose.ui.node.w0
    public final androidx.compose.ui.q e() {
        return new t0(this.b, 1, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q0) {
            return kotlin.jvm.internal.l.a(this.b, ((q0) obj).b);
        }
        return false;
    }

    @Override // androidx.compose.ui.node.w0
    public final void f(androidx.compose.ui.q qVar) {
        ((t0) qVar).Q0(this.b);
    }

    public final int hashCode() {
        androidx.compose.foundation.interaction.k kVar = this.b;
        if (kVar != null) {
            return kVar.hashCode();
        }
        return 0;
    }
}
