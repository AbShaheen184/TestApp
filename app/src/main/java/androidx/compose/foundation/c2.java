package androidx.compose.foundation;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
final class c2 extends androidx.compose.ui.node.w0 {
    public final androidx.compose.foundation.gestures.g2 b;
    public final androidx.compose.foundation.gestures.k1 c;
    public final boolean d;
    public final androidx.compose.foundation.gestures.l e;
    public final androidx.compose.foundation.interaction.k f;
    public final boolean g;
    public final n h;

    public c2(n nVar, androidx.compose.foundation.gestures.l lVar, androidx.compose.foundation.gestures.k1 k1Var, androidx.compose.foundation.gestures.g2 g2Var, androidx.compose.foundation.interaction.k kVar, boolean z, boolean z2) {
        this.b = g2Var;
        this.c = k1Var;
        this.d = z;
        this.e = lVar;
        this.f = kVar;
        this.g = z2;
        this.h = nVar;
    }

    @Override // androidx.compose.ui.node.w0
    public final androidx.compose.ui.q e() {
        d2 d2Var = new d2();
        d2Var.N = this.b;
        d2Var.O = this.c;
        d2Var.P = this.d;
        d2Var.Q = this.e;
        d2Var.R = this.f;
        d2Var.S = this.g;
        d2Var.T = this.h;
        return d2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c2.class != obj.getClass()) {
            return false;
        }
        c2 c2Var = (c2) obj;
        return kotlin.jvm.internal.l.a(this.b, c2Var.b) && this.c == c2Var.c && this.d == c2Var.d && kotlin.jvm.internal.l.a(this.e, c2Var.e) && kotlin.jvm.internal.l.a(this.f, c2Var.f) && this.g == c2Var.g && kotlin.jvm.internal.l.a(this.h, c2Var.h);
    }

    @Override // androidx.compose.ui.node.w0
    public final void f(androidx.compose.ui.q qVar) {
        ((d2) qVar).Q0(this.h, this.e, this.c, this.b, this.f, this.g, this.d);
    }

    public final int hashCode() {
        int iF = androidx.privacysandbox.ads.adservices.java.internal.a.f(androidx.privacysandbox.ads.adservices.java.internal.a.f((this.c.hashCode() + (this.b.hashCode() * 31)) * 31, 31, this.d), 31, false);
        androidx.compose.foundation.gestures.l lVar = this.e;
        int iHashCode = (iF + (lVar != null ? lVar.hashCode() : 0)) * 31;
        androidx.compose.foundation.interaction.k kVar = this.f;
        int iF2 = androidx.privacysandbox.ads.adservices.java.internal.a.f((iHashCode + (kVar != null ? kVar.hashCode() : 0)) * 961, 31, this.g);
        n nVar = this.h;
        return iF2 + (nVar != null ? nVar.hashCode() : 0);
    }
}
