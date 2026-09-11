package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final enum g extends b0 {
    public g() {
        super("InRow", 13);
    }

    @Override // org.jsoup.parser.b0
    public final boolean f(r0 r0Var, b bVar) {
        boolean zE = r0Var.e();
        z zVar = b0.F;
        f fVar = b0.J;
        if (zE) {
            n0 n0Var = (n0) r0Var;
            String strL = n0Var.l();
            if (org.jsoup.internal.k.d(strL, a0.u)) {
                bVar.w();
                bVar.L(n0Var);
                bVar.l = b0.L;
                bVar.r.add(null);
                return true;
            }
            if (!org.jsoup.internal.k.d(strL, a0.C)) {
                return zVar.f(r0Var, bVar);
            }
            if (!bVar.H("tr")) {
                bVar.z(this);
                return false;
            }
            bVar.w();
            bVar.l();
            bVar.l = fVar;
            return bVar.m(r0Var);
        }
        if (!r0Var.d()) {
            return zVar.f(r0Var, bVar);
        }
        String strL2 = ((m0) r0Var).l();
        if (strL2.equals("tr")) {
            if (!bVar.H(strL2)) {
                bVar.z(this);
                return false;
            }
            bVar.w();
            bVar.l();
            bVar.l = fVar;
            return true;
        }
        if (strL2.equals("table")) {
            if (!bVar.H("tr")) {
                bVar.z(this);
                return false;
            }
            bVar.w();
            bVar.l();
            bVar.l = fVar;
            return bVar.m(r0Var);
        }
        if (!org.jsoup.internal.k.d(strL2, a0.r)) {
            if (!org.jsoup.internal.k.d(strL2, a0.D)) {
                return zVar.f(r0Var, bVar);
            }
            bVar.z(this);
            return false;
        }
        if (!bVar.H(strL2)) {
            bVar.z(this);
            return false;
        }
        if (!bVar.H("tr")) {
            return false;
        }
        bVar.w();
        bVar.l();
        bVar.l = fVar;
        return bVar.m(r0Var);
    }
}
