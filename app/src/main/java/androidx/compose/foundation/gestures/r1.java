package androidx.compose.foundation.gestures;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
final class r1 extends androidx.compose.ui.node.w0 {
    public final g2 b;
    public final k1 c;
    public final boolean d;
    public final boolean e;
    public final androidx.compose.foundation.interaction.k f;

    public r1(g2 g2Var, k1 k1Var, boolean z, boolean z2, androidx.compose.foundation.interaction.k kVar) {
        this.b = g2Var;
        this.c = k1Var;
        this.d = z;
        this.e = z2;
        this.f = kVar;
    }

    @Override // androidx.compose.ui.node.w0
    public final androidx.compose.ui.q e() {
        boolean z = this.e;
        return new f2(null, null, this.c, this.b, this.f, this.d, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r1)) {
            return false;
        }
        r1 r1Var = (r1) obj;
        return kotlin.jvm.internal.l.a(this.b, r1Var.b) && this.c == r1Var.c && this.d == r1Var.d && this.e == r1Var.e && kotlin.jvm.internal.l.a(this.f, r1Var.f);
    }

    @Override // androidx.compose.ui.node.w0
    public final void f(androidx.compose.ui.q qVar) {
        ((f2) qVar).c1(null, null, this.c, this.b, this.f, this.d, this.e);
    }

    public final int hashCode() {
        int iF = androidx.privacysandbox.ads.adservices.java.internal.a.f(androidx.privacysandbox.ads.adservices.java.internal.a.f((this.c.hashCode() + (this.b.hashCode() * 31)) * 961, 31, this.d), 961, this.e);
        androidx.compose.foundation.interaction.k kVar = this.f;
        return (iF + (kVar != null ? kVar.hashCode() : 0)) * 31;
    }
}
