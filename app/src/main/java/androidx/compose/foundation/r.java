package androidx.compose.foundation;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
final class r extends androidx.compose.ui.node.w0 {
    public final long b;
    public final androidx.compose.ui.graphics.p c;
    public final float d;
    public final androidx.compose.ui.graphics.n0 e;

    public r(long j, androidx.compose.ui.graphics.e0 e0Var, androidx.compose.ui.graphics.n0 n0Var, int i) {
        j = (i & 1) != 0 ? androidx.compose.ui.graphics.t.i : j;
        e0Var = (i & 2) != 0 ? null : e0Var;
        this.b = j;
        this.c = e0Var;
        this.d = 1.0f;
        this.e = n0Var;
    }

    @Override // androidx.compose.ui.node.w0
    public final androidx.compose.ui.q e() {
        t tVar = new t();
        tVar.L = this.b;
        tVar.M = this.c;
        tVar.N = this.d;
        tVar.O = this.e;
        tVar.P = 9205357640488583168L;
        return tVar;
    }

    public final boolean equals(Object obj) {
        r rVar = obj instanceof r ? (r) obj : null;
        return rVar != null && androidx.compose.ui.graphics.t.c(this.b, rVar.b) && kotlin.jvm.internal.l.a(this.c, rVar.c) && this.d == rVar.d && kotlin.jvm.internal.l.a(this.e, rVar.e);
    }

    @Override // androidx.compose.ui.node.w0
    public final void f(androidx.compose.ui.q qVar) {
        t tVar = (t) qVar;
        tVar.L = this.b;
        tVar.M = this.c;
        tVar.N = this.d;
        androidx.compose.ui.graphics.n0 n0Var = tVar.O;
        androidx.compose.ui.graphics.n0 n0Var2 = this.e;
        if (!kotlin.jvm.internal.l.a(n0Var, n0Var2)) {
            tVar.O = n0Var2;
            androidx.compose.ui.node.k.l(tVar);
        }
        androidx.compose.ui.node.k.j(tVar);
    }

    public final int hashCode() {
        int i = androidx.compose.ui.graphics.t.j;
        int iHashCode = Long.hashCode(this.b) * 31;
        androidx.compose.ui.graphics.p pVar = this.c;
        return this.e.hashCode() + androidx.privacysandbox.ads.adservices.java.internal.a.a(this.d, (iHashCode + (pVar != null ? pVar.hashCode() : 0)) * 31, 31);
    }
}
