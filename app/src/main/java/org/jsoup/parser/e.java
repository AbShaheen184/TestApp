package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final enum e extends b0 {
    public e() {
        super("InColumnGroup", 11);
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
            return true;
        }
        u uVar = b0.A;
        if (iE != 1) {
            if (iE != 2) {
                if (iE == 3) {
                    bVar.K((j0) r0Var);
                    return true;
                }
                if (iE != 6) {
                    return g(r0Var, bVar);
                }
                if (bVar.c("html")) {
                    return true;
                }
                return g(r0Var, bVar);
            }
            String strL = ((m0) r0Var).l();
            strL.getClass();
            if (strL.equals("template")) {
                uVar.f(r0Var, bVar);
                return true;
            }
            if (!strL.equals("colgroup")) {
                return g(r0Var, bVar);
            }
            if (!bVar.c(strL)) {
                bVar.z(this);
                return false;
            }
            bVar.l();
            bVar.l = b0.F;
            return true;
        }
        n0 n0Var = (n0) r0Var;
        String strL2 = n0Var.l();
        strL2.getClass();
        switch (strL2) {
            case "template":
                uVar.f(r0Var, bVar);
                return true;
            case "col":
                bVar.M(n0Var);
                return true;
            case "html":
                return b0.D.f(r0Var, bVar);
            default:
                return g(r0Var, bVar);
        }
    }

    public final boolean g(r0 r0Var, b bVar) {
        if (!bVar.c("colgroup")) {
            bVar.z(this);
            return false;
        }
        bVar.l();
        bVar.l = b0.F;
        bVar.m(r0Var);
        return true;
    }
}
