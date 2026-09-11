package androidx.compose.ui.graphics;

import androidx.compose.ui.node.d1;
import androidx.compose.ui.node.w0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
final class z extends w0 {
    public final float b;
    public final float c;
    public final long d;
    public final n0 e;
    public final boolean f;
    public final long g;
    public final long h;

    public z(float f, float f2, long j, n0 n0Var, boolean z, long j2, long j3) {
        this.b = f;
        this.c = f2;
        this.d = j;
        this.e = n0Var;
        this.f = z;
        this.g = j2;
        this.h = j3;
    }

    @Override // androidx.compose.ui.node.w0
    public final androidx.compose.ui.q e() {
        o0 o0Var = new o0();
        o0Var.L = 1.0f;
        o0Var.M = 1.0f;
        o0Var.N = this.b;
        o0Var.O = this.c;
        o0Var.P = 8.0f;
        o0Var.Q = this.d;
        o0Var.R = this.e;
        o0Var.S = this.f;
        o0Var.T = this.g;
        o0Var.U = this.h;
        o0Var.V = 3;
        o0Var.W = new androidx.compose.animation.e(o0Var, 5);
        return o0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return Float.compare(1.0f, 1.0f) == 0 && Float.compare(1.0f, 1.0f) == 0 && Float.compare(this.b, zVar.b) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(this.c, zVar.c) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(0.0f, 0.0f) == 0 && Float.compare(8.0f, 8.0f) == 0 && q0.a(this.d, zVar.d) && kotlin.jvm.internal.l.a(this.e, zVar.e) && this.f == zVar.f && t.c(this.g, zVar.g) && t.c(this.h, zVar.h);
    }

    @Override // androidx.compose.ui.node.w0
    public final void f(androidx.compose.ui.q qVar) {
        d1 d1Var;
        o0 o0Var = (o0) qVar;
        o0Var.L = 1.0f;
        o0Var.M = 1.0f;
        o0Var.N = this.b;
        o0Var.O = this.c;
        o0Var.P = 8.0f;
        o0Var.Q = this.d;
        o0Var.R = this.e;
        o0Var.S = this.f;
        o0Var.T = this.g;
        o0Var.U = this.h;
        o0Var.V = 3;
        androidx.compose.animation.e eVar = o0Var.W;
        if (o0Var.e.K && (d1Var = androidx.compose.ui.node.k.r(o0Var, 2).M) != null) {
            d1Var.r1(eVar, true);
        }
    }

    public final int hashCode() {
        int iA = androidx.privacysandbox.ads.adservices.java.internal.a.a(8.0f, androidx.privacysandbox.ads.adservices.java.internal.a.a(0.0f, androidx.privacysandbox.ads.adservices.java.internal.a.a(0.0f, androidx.privacysandbox.ads.adservices.java.internal.a.a(0.0f, androidx.privacysandbox.ads.adservices.java.internal.a.a(this.c, androidx.privacysandbox.ads.adservices.java.internal.a.a(0.0f, androidx.privacysandbox.ads.adservices.java.internal.a.a(0.0f, androidx.privacysandbox.ads.adservices.java.internal.a.a(this.b, androidx.privacysandbox.ads.adservices.java.internal.a.a(1.0f, Float.hashCode(1.0f) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
        int i = q0.c;
        int iF = androidx.privacysandbox.ads.adservices.java.internal.a.f((this.e.hashCode() + androidx.privacysandbox.ads.adservices.java.internal.a.c(iA, 31, this.d)) * 31, 961, this.f);
        int i2 = t.j;
        return androidx.privacysandbox.ads.adservices.java.internal.a.b(3, androidx.privacysandbox.ads.adservices.java.internal.a.b(0, androidx.privacysandbox.ads.adservices.java.internal.a.c(androidx.privacysandbox.ads.adservices.java.internal.a.c(iF, 31, this.g), 31, this.h), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GraphicsLayerElement(scaleX=1.0, scaleY=1.0, alpha=");
        sb.append(this.b);
        sb.append(", translationX=0.0, translationY=0.0, shadowElevation=");
        sb.append(this.c);
        sb.append(", rotationX=0.0, rotationY=0.0, rotationZ=0.0, cameraDistance=8.0, transformOrigin=");
        sb.append((Object) q0.b(this.d));
        sb.append(", shape=");
        sb.append(this.e);
        sb.append(", clip=");
        sb.append(this.f);
        sb.append(", renderEffect=null, ambientShadowColor=");
        androidx.privacysandbox.ads.adservices.java.internal.a.A(this.g, ", spotShadowColor=", sb);
        sb.append((Object) t.i(this.h));
        sb.append(", compositingStrategy=CompositingStrategy(value=0), blendMode=");
        sb.append((Object) a0.B(3));
        sb.append(", colorFilter=null)");
        return sb.toString();
    }
}
