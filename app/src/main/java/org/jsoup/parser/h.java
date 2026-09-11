package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final enum h extends b0 {
    public h() {
        super("InCell", 14);
    }

    @Override // org.jsoup.parser.b0
    public final boolean f(r0 r0Var, b bVar) {
        boolean zD = r0Var.d();
        x xVar = b0.D;
        if (!zD) {
            if (!r0Var.e() || !org.jsoup.internal.k.d(((n0) r0Var).l(), a0.x)) {
                return xVar.f(r0Var, bVar);
            }
            if (!bVar.H("td") && !bVar.H("th")) {
                bVar.z(this);
                return false;
            }
            if (bVar.H("td")) {
                bVar.n("td");
            } else {
                bVar.n("th");
            }
            return bVar.m(r0Var);
        }
        String strL = ((m0) r0Var).l();
        if (!org.jsoup.internal.k.d(strL, a0.u)) {
            if (org.jsoup.internal.k.d(strL, a0.v)) {
                bVar.z(this);
                return false;
            }
            if (!org.jsoup.internal.k.d(strL, a0.w)) {
                return xVar.f(r0Var, bVar);
            }
            if (!bVar.H(strL)) {
                bVar.z(this);
                return false;
            }
            if (bVar.H("td")) {
                bVar.n("td");
            } else {
                bVar.n("th");
            }
            return bVar.m(r0Var);
        }
        boolean zH = bVar.H(strL);
        g gVar = b0.K;
        if (!zH) {
            bVar.z(this);
            bVar.l = gVar;
            return false;
        }
        bVar.B(false);
        if (!bVar.c(strL)) {
            bVar.z(this);
        }
        bVar.T(strL);
        bVar.t();
        bVar.l = gVar;
        return true;
    }
}
