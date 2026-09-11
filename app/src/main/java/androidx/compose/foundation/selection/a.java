package androidx.compose.foundation.selection;

import androidx.compose.foundation.d1;
import androidx.compose.foundation.interaction.k;
import androidx.compose.ui.node.w0;
import androidx.compose.ui.q;
import androidx.compose.ui.semantics.h;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
final class a extends w0 {
    public final boolean b;
    public final k c;
    public final d1 d;
    public final boolean e;
    public final h f;
    public final kotlin.jvm.functions.a g;

    public a(boolean z, k kVar, d1 d1Var, boolean z2, h hVar, kotlin.jvm.functions.a aVar) {
        this.b = z;
        this.c = kVar;
        this.d = d1Var;
        this.e = z2;
        this.f = hVar;
        this.g = aVar;
    }

    @Override // androidx.compose.ui.node.w0
    public final q e() {
        d dVar = new d(this.c, this.d, false, this.e, null, this.f, this.g);
        dVar.k0 = this.b;
        return dVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.b == aVar.b && l.a(this.c, aVar.c) && l.a(this.d, aVar.d) && this.e == aVar.e && l.a(this.f, aVar.f) && this.g == aVar.g;
    }

    @Override // androidx.compose.ui.node.w0
    public final void f(q qVar) {
        d dVar = (d) qVar;
        boolean z = dVar.k0;
        boolean z2 = this.b;
        if (z != z2) {
            dVar.k0 = z2;
            androidx.compose.ui.node.k.l(dVar);
        }
        dVar.Z0(this.c, this.d, false, this.e, null, this.f, this.g);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.b) * 31;
        k kVar = this.c;
        int iHashCode2 = (iHashCode + (kVar != null ? kVar.hashCode() : 0)) * 31;
        d1 d1Var = this.d;
        int iF = androidx.privacysandbox.ads.adservices.java.internal.a.f(androidx.privacysandbox.ads.adservices.java.internal.a.f((iHashCode2 + (d1Var != null ? d1Var.hashCode() : 0)) * 31, 31, false), 31, this.e);
        h hVar = this.f;
        return this.g.hashCode() + ((iF + (hVar != null ? Integer.hashCode(hVar.a) : 0)) * 31);
    }
}
