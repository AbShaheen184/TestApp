package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final enum i extends b0 {
    public i() {
        super("InSelect", 15);
    }

    @Override // org.jsoup.parser.b0
    public final boolean f(r0 r0Var, b bVar) {
        int iE = androidx.constraintlayout.core.g.e(r0Var.a);
        if (iE == 0) {
            bVar.z(this);
            return false;
        }
        u uVar = b0.A;
        if (iE == 1) {
            n0 n0Var = (n0) r0Var;
            String strL = n0Var.l();
            if (strL.equals("html")) {
                return b0.D.f(n0Var, bVar);
            }
            if (strL.equals("option")) {
                if (bVar.c("option")) {
                    bVar.n("option");
                }
                bVar.L(n0Var);
                return true;
            }
            if (strL.equals("optgroup")) {
                if (bVar.c("option")) {
                    bVar.n("option");
                }
                if (bVar.c("optgroup")) {
                    bVar.n("optgroup");
                }
                bVar.L(n0Var);
                return true;
            }
            if (strL.equals("select")) {
                bVar.z(this);
                return bVar.n("select");
            }
            if (!org.jsoup.internal.k.d(strL, a0.E)) {
                if (strL.equals("script") || strL.equals("template")) {
                    return uVar.f(r0Var, bVar);
                }
                bVar.z(this);
                return false;
            }
            bVar.z(this);
            if (!bVar.F("select")) {
                return false;
            }
            do {
                bVar.T("select");
                bVar.a0();
            } while (bVar.F("select"));
            return bVar.m(n0Var);
        }
        if (iE != 2) {
            if (iE == 3) {
                bVar.K((j0) r0Var);
                return true;
            }
            if (iE == 4) {
                bVar.I((i0) r0Var, false);
                return true;
            }
            if (iE != 6) {
                bVar.z(this);
                return false;
            }
            if (!bVar.c("html")) {
                bVar.z(this);
            }
            return true;
        }
        String strL2 = ((m0) r0Var).l();
        strL2.getClass();
        switch (strL2) {
            case "template":
                return uVar.f(r0Var, bVar);
            case "option":
                if (bVar.c("option")) {
                    bVar.l();
                    return true;
                }
                bVar.z(this);
                return true;
            case "select":
                if (!bVar.F(strL2)) {
                    bVar.z(this);
                    return false;
                }
                bVar.T(strL2);
                bVar.a0();
                return true;
            case "optgroup":
                if (bVar.c("option") && bVar.r(bVar.b()) != null && bVar.r(bVar.b()).s("optgroup")) {
                    bVar.n("option");
                }
                if (bVar.c("optgroup")) {
                    bVar.l();
                    return true;
                }
                bVar.z(this);
                return true;
            default:
                bVar.z(this);
                return false;
        }
    }
}
