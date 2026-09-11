package androidx.compose.ui.draw;

import androidx.compose.ui.node.w0;
import androidx.compose.ui.q;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
final class n extends w0 {
    public final androidx.compose.ui.graphics.painter.b b;
    public final androidx.compose.ui.e c;
    public final float d;
    public final androidx.compose.ui.graphics.m e;

    public n(androidx.compose.ui.graphics.painter.b bVar, androidx.compose.ui.e eVar, float f, androidx.compose.ui.graphics.m mVar) {
        this.b = bVar;
        this.c = eVar;
        this.d = f;
        this.e = mVar;
    }

    @Override // androidx.compose.ui.node.w0
    public final q e() {
        o oVar = new o();
        oVar.L = this.b;
        oVar.M = true;
        oVar.N = this.c;
        oVar.O = androidx.compose.ui.layout.i.b;
        oVar.P = this.d;
        oVar.Q = this.e;
        return oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (!kotlin.jvm.internal.l.a(this.b, nVar.b) || !kotlin.jvm.internal.l.a(this.c, nVar.c)) {
            return false;
        }
        Object obj2 = androidx.compose.ui.layout.i.b;
        return obj2.equals(obj2) && Float.compare(this.d, nVar.d) == 0 && kotlin.jvm.internal.l.a(this.e, nVar.e);
    }

    @Override // androidx.compose.ui.node.w0
    public final void f(q qVar) {
        o oVar = (o) qVar;
        boolean z = oVar.M;
        androidx.compose.ui.graphics.painter.b bVar = this.b;
        boolean z2 = (z && androidx.compose.ui.geometry.e.a(oVar.L.h(), bVar.h())) ? false : true;
        oVar.L = bVar;
        oVar.M = true;
        oVar.N = this.c;
        oVar.O = androidx.compose.ui.layout.i.b;
        oVar.P = this.d;
        oVar.Q = this.e;
        if (z2) {
            androidx.compose.ui.node.k.k(oVar);
        }
        androidx.compose.ui.node.k.j(oVar);
    }

    public final int hashCode() {
        int iA = androidx.privacysandbox.ads.adservices.java.internal.a.a(this.d, (androidx.compose.ui.layout.i.b.hashCode() + ((this.c.hashCode() + androidx.privacysandbox.ads.adservices.java.internal.a.f(this.b.hashCode() * 31, 31, true)) * 31)) * 31, 31);
        androidx.compose.ui.graphics.m mVar = this.e;
        return iA + (mVar == null ? 0 : mVar.hashCode());
    }

    public final String toString() {
        return "PainterElement(painter=" + this.b + ", sizeToIntrinsics=true, alignment=" + this.c + ", contentScale=" + androidx.compose.ui.layout.i.b + ", alpha=" + this.d + ", colorFilter=" + this.e + ')';
    }
}
