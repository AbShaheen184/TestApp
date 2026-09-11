package androidx.compose.foundation;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
final class b0 extends androidx.compose.ui.node.w0 {
    public final androidx.compose.foundation.interaction.k b;
    public final d1 c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final androidx.compose.ui.semantics.h g;
    public final kotlin.jvm.functions.a h;

    public b0(androidx.compose.foundation.interaction.k kVar, d1 d1Var, boolean z, boolean z2, String str, androidx.compose.ui.semantics.h hVar, kotlin.jvm.functions.a aVar) {
        this.b = kVar;
        this.c = d1Var;
        this.d = z;
        this.e = z2;
        this.f = str;
        this.g = hVar;
        this.h = aVar;
    }

    @Override // androidx.compose.ui.node.w0
    public final androidx.compose.ui.q e() {
        return new d0(this.b, this.c, this.d, this.e, this.f, this.g, this.h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b0.class != obj.getClass()) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return kotlin.jvm.internal.l.a(this.b, b0Var.b) && kotlin.jvm.internal.l.a(this.c, b0Var.c) && this.d == b0Var.d && this.e == b0Var.e && kotlin.jvm.internal.l.a(this.f, b0Var.f) && kotlin.jvm.internal.l.a(this.g, b0Var.g) && this.h == b0Var.h;
    }

    @Override // androidx.compose.ui.node.w0
    public final void f(androidx.compose.ui.q qVar) {
        ((d0) qVar).Z0(this.b, this.c, this.d, this.e, this.f, this.g, this.h);
    }

    public final int hashCode() {
        androidx.compose.foundation.interaction.k kVar = this.b;
        int iHashCode = (kVar != null ? kVar.hashCode() : 0) * 31;
        d1 d1Var = this.c;
        int iF = androidx.privacysandbox.ads.adservices.java.internal.a.f(androidx.privacysandbox.ads.adservices.java.internal.a.f((iHashCode + (d1Var != null ? d1Var.hashCode() : 0)) * 31, 31, this.d), 31, this.e);
        String str = this.f;
        int iHashCode2 = (iF + (str != null ? str.hashCode() : 0)) * 31;
        androidx.compose.ui.semantics.h hVar = this.g;
        return this.h.hashCode() + ((iHashCode2 + (hVar != null ? Integer.hashCode(hVar.a) : 0)) * 31);
    }
}
