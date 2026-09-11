package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final enum u extends b0 {
    public u() {
        super("InHead", 3);
    }

    @Override // org.jsoup.parser.b0
    public final boolean f(r0 r0Var, b bVar) {
        if (b0.a(r0Var)) {
            bVar.I((i0) r0Var, false);
            return true;
        }
        int iE = androidx.constraintlayout.core.g.e(r0Var.a);
        if (iE == 0) {
            bVar.z(this);
            return false;
        }
        if (iE != 1) {
            if (iE != 2) {
                if (iE != 3) {
                    bVar.n("head");
                    return bVar.m(r0Var);
                }
                bVar.K((j0) r0Var);
                return true;
            }
            String strL = ((m0) r0Var).l();
            if (strL.equals("head")) {
                bVar.l();
                bVar.l = b0.C;
                return true;
            }
            if (org.jsoup.internal.k.d(strL, a0.c)) {
                bVar.n("head");
                return bVar.m(r0Var);
            }
            if (!strL.equals("template")) {
                bVar.z(this);
                return false;
            }
            if (!bVar.Q(strL)) {
                bVar.z(this);
                return true;
            }
            bVar.B(true);
            if (!bVar.c(strL)) {
                bVar.z(this);
            }
            bVar.T(strL);
            bVar.t();
            bVar.U();
            bVar.a0();
            return true;
        }
        n0 n0Var = (n0) r0Var;
        String strL2 = n0Var.l();
        if (strL2.equals("html")) {
            return b0.D.f(r0Var, bVar);
        }
        if (org.jsoup.internal.k.d(strL2, a0.a)) {
            org.jsoup.nodes.j jVarM = bVar.M(n0Var);
            if (strL2.equals("base") && jVarM.q("href") && !bVar.n) {
                String strB = jVarM.b("href");
                if (strB.length() != 0) {
                    bVar.f = strB;
                    bVar.n = true;
                    org.jsoup.nodes.g gVar = bVar.d;
                    gVar.getClass();
                    gVar.R(strB);
                }
            }
            return true;
        }
        if (strL2.equals("meta")) {
            bVar.M(n0Var);
            return true;
        }
        if (strL2.equals("title")) {
            b0.d(n0Var, bVar, bVar.q(n0Var).f());
            return true;
        }
        if (org.jsoup.internal.k.d(strL2, a0.b)) {
            b0.d(n0Var, bVar, bVar.q(n0Var).f());
            return true;
        }
        if (strL2.equals("noscript")) {
            bVar.L(n0Var);
            bVar.l = b0.B;
            return true;
        }
        if (strL2.equals("script")) {
            bVar.c.o(l3.C);
            bVar.m = bVar.l;
            bVar.l = b0.E;
            bVar.L(n0Var);
            return true;
        }
        if (strL2.equals("head")) {
            bVar.z(this);
            return false;
        }
        if (!strL2.equals("template")) {
            bVar.n("head");
            return bVar.m(r0Var);
        }
        bVar.L(n0Var);
        bVar.r.add(null);
        bVar.v = false;
        k kVar = b0.O;
        bVar.l = kVar;
        bVar.V(kVar);
        return true;
    }
}
