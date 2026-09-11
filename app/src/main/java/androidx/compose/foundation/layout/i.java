package androidx.compose.foundation.layout;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
final class i extends androidx.compose.ui.node.w0 {
    public final float b;

    public i(float f) {
        this.b = f;
        if (f > 0.0f) {
            return;
        }
        androidx.compose.foundation.layout.internal.a.a("aspectRatio " + f + " must be > 0");
    }

    @Override // androidx.compose.ui.node.w0
    public final androidx.compose.ui.q e() {
        k kVar = new k();
        kVar.L = this.b;
        return kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        i iVar = obj instanceof i ? (i) obj : null;
        if (iVar == null || this.b != iVar.b) {
            return false;
        }
        ((i) obj).getClass();
        return true;
    }

    @Override // androidx.compose.ui.node.w0
    public final void f(androidx.compose.ui.q qVar) {
        ((k) qVar).L = this.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (Float.hashCode(this.b) * 31);
    }
}
