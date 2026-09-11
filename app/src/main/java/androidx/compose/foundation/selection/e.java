package androidx.compose.foundation.selection;

import androidx.compose.foundation.interaction.k;
import androidx.compose.ui.node.w0;
import androidx.compose.ui.q;
import androidx.compose.ui.semantics.h;
import kotlin.jvm.functions.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
final class e extends w0 {
    public final boolean b;
    public final k c;
    public final boolean d;
    public final h e;
    public final l f;

    public e(boolean z, k kVar, boolean z2, h hVar, l lVar) {
        this.b = z;
        this.c = kVar;
        this.d = z2;
        this.e = hVar;
        this.f = lVar;
    }

    @Override // androidx.compose.ui.node.w0
    public final q e() {
        return new g(this.b, this.c, this.d, this.e, this.f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        return this.b == eVar.b && kotlin.jvm.internal.l.a(this.c, eVar.c) && this.d == eVar.d && this.e.equals(eVar.e) && this.f == eVar.f;
    }

    @Override // androidx.compose.ui.node.w0
    public final void f(q qVar) {
        g gVar = (g) qVar;
        boolean z = gVar.k0;
        boolean z2 = this.b;
        if (z != z2) {
            gVar.k0 = z2;
            androidx.compose.ui.node.k.l(gVar);
        }
        gVar.l0 = this.f;
        gVar.Z0(this.c, null, false, this.d, null, this.e, gVar.m0);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.b) * 31;
        k kVar = this.c;
        return this.f.hashCode() + androidx.privacysandbox.ads.adservices.java.internal.a.b(this.e.a, androidx.privacysandbox.ads.adservices.java.internal.a.f(androidx.privacysandbox.ads.adservices.java.internal.a.f((iHashCode + (kVar != null ? kVar.hashCode() : 0)) * 961, 31, false), 31, this.d), 31);
    }
}
