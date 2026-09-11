package androidx.compose.foundation.layout;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
final class v0 extends androidx.compose.ui.node.w0 {
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final boolean f;

    public /* synthetic */ v0(float f, float f2, float f3, float f4, int i) {
        this((i & 1) != 0 ? Float.NaN : f, (i & 2) != 0 ? Float.NaN : f2, (i & 4) != 0 ? Float.NaN : f3, (i & 8) != 0 ? Float.NaN : f4, true);
    }

    @Override // androidx.compose.ui.node.w0
    public final androidx.compose.ui.q e() {
        x0 x0Var = new x0();
        x0Var.L = this.b;
        x0Var.M = this.c;
        x0Var.N = this.d;
        x0Var.O = this.e;
        x0Var.P = this.f;
        return x0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v0)) {
            return false;
        }
        v0 v0Var = (v0) obj;
        return androidx.compose.ui.unit.f.d(this.b, v0Var.b) && androidx.compose.ui.unit.f.d(this.c, v0Var.c) && androidx.compose.ui.unit.f.d(this.d, v0Var.d) && androidx.compose.ui.unit.f.d(this.e, v0Var.e) && this.f == v0Var.f;
    }

    @Override // androidx.compose.ui.node.w0
    public final void f(androidx.compose.ui.q qVar) {
        x0 x0Var = (x0) qVar;
        x0Var.L = this.b;
        x0Var.M = this.c;
        x0Var.N = this.d;
        x0Var.O = this.e;
        x0Var.P = this.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + androidx.privacysandbox.ads.adservices.java.internal.a.a(this.e, androidx.privacysandbox.ads.adservices.java.internal.a.a(this.d, androidx.privacysandbox.ads.adservices.java.internal.a.a(this.c, Float.hashCode(this.b) * 31, 31), 31), 31);
    }

    public v0(float f, float f2, float f3, float f4, boolean z) {
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = z;
    }
}
