package androidx.compose.ui.draw;

import androidx.compose.ui.graphics.n0;
import androidx.compose.ui.graphics.t;
import androidx.compose.ui.node.d1;
import androidx.compose.ui.node.w0;
import androidx.compose.ui.q;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends w0 {
    public final n0 b;
    public final boolean c;
    public final long d;
    public final long e;

    public p(n0 n0Var, boolean z, long j, long j2) {
        float f = androidx.compose.foundation.contextmenu.h.a;
        this.b = n0Var;
        this.c = z;
        this.d = j;
        this.e = j2;
    }

    @Override // androidx.compose.ui.node.w0
    public final q e() {
        return new androidx.compose.ui.graphics.o(new androidx.compose.animation.e(this, 4));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        float f = androidx.compose.foundation.contextmenu.h.d;
        return androidx.compose.ui.unit.f.d(f, f) && kotlin.jvm.internal.l.a(this.b, pVar.b) && this.c == pVar.c && t.c(this.d, pVar.d) && t.c(this.e, pVar.e);
    }

    @Override // androidx.compose.ui.node.w0
    public final void f(q qVar) {
        d1 d1Var;
        androidx.compose.ui.graphics.o oVar = (androidx.compose.ui.graphics.o) qVar;
        androidx.compose.animation.e eVar = new androidx.compose.animation.e(this, 4);
        oVar.L = eVar;
        if (oVar.e.K && (d1Var = androidx.compose.ui.node.k.r(oVar, 2).M) != null) {
            d1Var.r1(eVar, true);
        }
    }

    public final int hashCode() {
        int iF = androidx.privacysandbox.ads.adservices.java.internal.a.f((this.b.hashCode() + (Float.hashCode(androidx.compose.foundation.contextmenu.h.d) * 31)) * 31, 31, this.c);
        int i = t.j;
        return Long.hashCode(this.e) + androidx.privacysandbox.ads.adservices.java.internal.a.c(iF, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShadowGraphicsLayerElement(elevation=");
        sb.append((Object) androidx.compose.ui.unit.f.e(androidx.compose.foundation.contextmenu.h.d));
        sb.append(", shape=");
        sb.append(this.b);
        sb.append(", clip=");
        sb.append(this.c);
        sb.append(", ambientColor=");
        androidx.privacysandbox.ads.adservices.java.internal.a.A(this.d, ", spotColor=", sb);
        sb.append((Object) t.i(this.e));
        sb.append(')');
        return sb.toString();
    }
}
