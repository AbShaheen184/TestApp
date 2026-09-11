package androidx.compose.foundation.layout;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
final class j0 extends androidx.compose.ui.node.w0 {
    public final float b;
    public final float c;
    public final float d;
    public final float e;

    public j0(float f, float f2, float f3, float f4) {
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        boolean z = true;
        boolean z2 = (f >= 0.0f || Float.isNaN(f)) & (f2 >= 0.0f || Float.isNaN(f2)) & (f3 >= 0.0f || Float.isNaN(f3));
        if (f4 < 0.0f && !Float.isNaN(f4)) {
            z = false;
        }
        if (!z2 || !z) {
            androidx.compose.foundation.layout.internal.a.a("Padding must be non-negative");
        }
    }

    @Override // androidx.compose.ui.node.w0
    public final androidx.compose.ui.q e() {
        k0 k0Var = new k0();
        k0Var.L = this.b;
        k0Var.M = this.c;
        k0Var.N = this.d;
        k0Var.O = this.e;
        k0Var.P = true;
        return k0Var;
    }

    public final boolean equals(Object obj) {
        j0 j0Var = obj instanceof j0 ? (j0) obj : null;
        return j0Var != null && androidx.compose.ui.unit.f.d(this.b, j0Var.b) && androidx.compose.ui.unit.f.d(this.c, j0Var.c) && androidx.compose.ui.unit.f.d(this.d, j0Var.d) && androidx.compose.ui.unit.f.d(this.e, j0Var.e);
    }

    @Override // androidx.compose.ui.node.w0
    public final void f(androidx.compose.ui.q qVar) {
        k0 k0Var = (k0) qVar;
        k0Var.L = this.b;
        k0Var.M = this.c;
        k0Var.N = this.d;
        k0Var.O = this.e;
        k0Var.P = true;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + androidx.privacysandbox.ads.adservices.java.internal.a.a(this.e, androidx.privacysandbox.ads.adservices.java.internal.a.a(this.d, androidx.privacysandbox.ads.adservices.java.internal.a.a(this.c, Float.hashCode(this.b) * 31, 31), 31), 31);
    }
}
