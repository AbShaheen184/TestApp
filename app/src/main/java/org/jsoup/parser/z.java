package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final enum z extends b0 {
    public z() {
        super("InTable", 8);
    }

    @Override // org.jsoup.parser.b0
    public final boolean f(r0 r0Var, b bVar) {
        if (r0Var.a == 5 && org.jsoup.internal.k.d(bVar.b().A.z, a0.z)) {
            bVar.t.clear();
            bVar.m = bVar.l;
            bVar.l = b0.G;
            return bVar.m(r0Var);
        }
        if (r0Var.a()) {
            bVar.K((j0) r0Var);
            return true;
        }
        if (r0Var.b()) {
            bVar.z(this);
            return false;
        }
        boolean zE = r0Var.e();
        u uVar = b0.A;
        if (!zE) {
            if (!r0Var.d()) {
                if (!r0Var.c()) {
                    g(r0Var, bVar);
                    return true;
                }
                if (bVar.c("html")) {
                    bVar.z(this);
                }
                return true;
            }
            String strL = ((m0) r0Var).l();
            if (strL.equals("table")) {
                if (!bVar.H(strL)) {
                    bVar.z(this);
                    return false;
                }
                bVar.T("table");
                bVar.a0();
                return true;
            }
            if (org.jsoup.internal.k.d(strL, a0.y)) {
                bVar.z(this);
                return false;
            }
            if (strL.equals("template")) {
                uVar.f(r0Var, bVar);
                return true;
            }
            g(r0Var, bVar);
            return true;
        }
        n0 n0Var = (n0) r0Var;
        String strL2 = n0Var.l();
        if (strL2.equals("caption")) {
            bVar.v();
            bVar.r.add(null);
            bVar.L(n0Var);
            bVar.l = b0.H;
            return true;
        }
        if (strL2.equals("colgroup")) {
            bVar.v();
            bVar.L(n0Var);
            bVar.l = b0.I;
            return true;
        }
        if (strL2.equals("col")) {
            bVar.v();
            bVar.o("colgroup");
            return bVar.m(r0Var);
        }
        if (org.jsoup.internal.k.d(strL2, a0.r)) {
            bVar.v();
            bVar.L(n0Var);
            bVar.l = b0.J;
            return true;
        }
        if (org.jsoup.internal.k.d(strL2, a0.s)) {
            bVar.v();
            bVar.o("tbody");
            return bVar.m(r0Var);
        }
        if (strL2.equals("table")) {
            bVar.z(this);
            if (bVar.H(strL2)) {
                bVar.T(strL2);
                if (bVar.a0()) {
                    return bVar.m(r0Var);
                }
                bVar.L(n0Var);
                return true;
            }
        } else {
            if (org.jsoup.internal.k.d(strL2, a0.t)) {
                return uVar.f(r0Var, bVar);
            }
            if (strL2.equals("input")) {
                org.jsoup.nodes.b bVar2 = n0Var.g;
                if (bVar2 == null || !bVar2.h("type").equalsIgnoreCase("hidden")) {
                    g(r0Var, bVar);
                    return true;
                }
                bVar.M(n0Var);
                return true;
            }
            if (!strL2.equals("form")) {
                g(r0Var, bVar);
                return true;
            }
            bVar.z(this);
            if (bVar.p == null && !bVar.Q("template")) {
                bVar.O(n0Var, false, false);
                return true;
            }
        }
        return false;
    }

    public final void g(r0 r0Var, b bVar) {
        bVar.z(this);
        bVar.w = true;
        b0.D.f(r0Var, bVar);
        bVar.w = false;
    }
}
