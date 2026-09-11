package coil3.compose.internal;

import androidx.compose.ui.layout.j;
import androidx.compose.ui.node.k;
import androidx.compose.ui.node.w0;
import coil3.compose.i;
import coil3.compose.m;
import coil3.compose.o;
import coil3.q;
import kotlin.jvm.functions.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends w0 {
    public final coil3.request.g b;
    public final q c;
    public final coil3.compose.b d;
    public final l e;
    public final l f;
    public final androidx.compose.ui.e g;
    public final j h;
    public final m i;
    public final String j;

    public b(coil3.request.g gVar, q qVar, coil3.compose.b bVar, l lVar, l lVar2, androidx.compose.ui.e eVar, j jVar, m mVar, String str) {
        this.b = gVar;
        this.c = qVar;
        this.d = bVar;
        this.e = lVar;
        this.f = lVar2;
        this.g = eVar;
        this.h = jVar;
        this.i = mVar;
        this.j = str;
    }

    @Override // androidx.compose.ui.node.w0
    public final androidx.compose.ui.q e() {
        coil3.compose.b bVar = this.d;
        q qVar = this.c;
        coil3.request.g gVar = this.b;
        coil3.compose.c cVar = new coil3.compose.c(qVar, gVar, bVar);
        i iVar = new i(cVar);
        iVar.J = this.e;
        iVar.K = this.f;
        iVar.L = this.h;
        iVar.M = 1;
        iVar.N = this.i;
        iVar.n(cVar);
        coil3.size.i iVar2 = gVar.o;
        return new c(iVar, this.g, this.h, this.j, iVar2 instanceof o ? (o) iVar2 : null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.b.equals(bVar.b) && this.c.equals(bVar.c) && kotlin.jvm.internal.l.a(this.d, bVar.d) && kotlin.jvm.internal.l.a(this.e, bVar.e) && kotlin.jvm.internal.l.a(this.f, bVar.f) && kotlin.jvm.internal.l.a(this.g, bVar.g) && kotlin.jvm.internal.l.a(this.h, bVar.h) && Float.compare(1.0f, 1.0f) == 0 && kotlin.jvm.internal.l.a(this.i, bVar.i) && kotlin.jvm.internal.l.a(this.j, bVar.j);
    }

    @Override // androidx.compose.ui.node.w0
    public final void f(androidx.compose.ui.q qVar) {
        c cVar = (c) qVar;
        long jH = cVar.R.h();
        o oVar = cVar.Q;
        coil3.compose.b bVar = this.d;
        q qVar2 = this.c;
        coil3.request.g gVar = this.b;
        coil3.compose.c cVar2 = new coil3.compose.c(qVar2, gVar, bVar);
        i iVar = cVar.R;
        iVar.J = this.e;
        iVar.K = this.f;
        j jVar = this.h;
        iVar.L = jVar;
        iVar.M = 1;
        iVar.N = this.i;
        iVar.n(cVar2);
        boolean zA = androidx.compose.ui.geometry.e.a(jH, iVar.h());
        cVar.L = this.g;
        coil3.size.i iVar2 = gVar.o;
        cVar.Q = iVar2 instanceof o ? (o) iVar2 : null;
        cVar.M = jVar;
        cVar.N = 1.0f;
        cVar.O = true;
        String str = cVar.P;
        String str2 = this.j;
        if (!kotlin.jvm.internal.l.a(str, str2)) {
            cVar.P = str2;
            k.l(cVar);
        }
        boolean zA2 = kotlin.jvm.internal.l.a(oVar, cVar.Q);
        if (!zA || !zA2) {
            k.k(cVar);
        }
        k.j(cVar);
    }

    public final int hashCode() {
        int iHashCode = (this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31)) * 31)) * 31;
        l lVar = this.f;
        int iF = androidx.privacysandbox.ads.adservices.java.internal.a.f(androidx.privacysandbox.ads.adservices.java.internal.a.a(1.0f, (this.h.hashCode() + ((this.g.hashCode() + androidx.privacysandbox.ads.adservices.java.internal.a.b(1, (iHashCode + (lVar == null ? 0 : lVar.hashCode())) * 31, 31)) * 31)) * 31, 961), 31, true);
        m mVar = this.i;
        int iHashCode2 = (iF + (mVar == null ? 0 : mVar.hashCode())) * 31;
        String str = this.j;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "ContentPainterElement(request=" + this.b + ", imageLoader=" + this.c + ", modelEqualityDelegate=" + this.d + ", transform=" + this.e + ", onState=" + this.f + ", filterQuality=Low, alignment=" + this.g + ", contentScale=" + this.h + ", alpha=1.0, colorFilter=null, clipToBounds=true, previewHandler=" + this.i + ", contentDescription=" + this.j + ")";
    }
}
