package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final enum f extends b0 {
    public f() {
        super("InTableBody", 12);
    }

    @Override // org.jsoup.parser.b0
    public final boolean f(r0 r0Var, b bVar) {
        int iE = androidx.constraintlayout.core.g.e(r0Var.a);
        z zVar = b0.F;
        if (iE == 1) {
            n0 n0Var = (n0) r0Var;
            String strL = n0Var.l();
            if (strL.equals("tr")) {
                bVar.u("tbody", "tfoot", "thead", "template");
                bVar.L(n0Var);
                bVar.l = b0.K;
                return true;
            }
            if (!org.jsoup.internal.k.d(strL, a0.u)) {
                return org.jsoup.internal.k.d(strL, a0.A) ? g(r0Var, bVar) : zVar.f(r0Var, bVar);
            }
            bVar.z(this);
            bVar.o("tr");
            return bVar.m(n0Var);
        }
        if (iE != 2) {
            return zVar.f(r0Var, bVar);
        }
        String strL2 = ((m0) r0Var).l();
        if (!org.jsoup.internal.k.d(strL2, a0.G)) {
            if (strL2.equals("table")) {
                return g(r0Var, bVar);
            }
            if (!org.jsoup.internal.k.d(strL2, a0.B)) {
                return zVar.f(r0Var, bVar);
            }
            bVar.z(this);
            return false;
        }
        if (!bVar.H(strL2)) {
            bVar.z(this);
            return false;
        }
        bVar.u("tbody", "tfoot", "thead", "template");
        bVar.l();
        bVar.l = zVar;
        return true;
    }

    public final boolean g(r0 r0Var, b bVar) {
        if (!bVar.H("tbody") && !bVar.H("thead") && !bVar.E("tfoot")) {
            bVar.z(this);
            return false;
        }
        bVar.u("tbody", "tfoot", "thead", "template");
        bVar.n(bVar.b().A.z);
        return bVar.m(r0Var);
    }
}
