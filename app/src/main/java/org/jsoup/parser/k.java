package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final enum k extends b0 {
    public k() {
        super("InTemplate", 17);
    }

    @Override // org.jsoup.parser.b0
    public final boolean f(r0 r0Var, b bVar) {
        int iE = androidx.constraintlayout.core.g.e(r0Var.a);
        x xVar = b0.D;
        if (iE != 0) {
            u uVar = b0.A;
            if (iE == 1) {
                String strL = ((n0) r0Var).l();
                if (org.jsoup.internal.k.d(strL, a0.J)) {
                    uVar.f(r0Var, bVar);
                    return true;
                }
                if (org.jsoup.internal.k.d(strL, a0.K)) {
                    bVar.U();
                    z zVar = b0.F;
                    bVar.V(zVar);
                    bVar.l = zVar;
                    return bVar.m(r0Var);
                }
                if (strL.equals("col")) {
                    bVar.U();
                    e eVar = b0.I;
                    bVar.V(eVar);
                    bVar.l = eVar;
                    return bVar.m(r0Var);
                }
                if (strL.equals("tr")) {
                    bVar.U();
                    f fVar = b0.J;
                    bVar.V(fVar);
                    bVar.l = fVar;
                    return bVar.m(r0Var);
                }
                if (!strL.equals("td") && !strL.equals("th")) {
                    bVar.U();
                    bVar.V(xVar);
                    bVar.l = xVar;
                    return bVar.m(r0Var);
                }
                bVar.U();
                g gVar = b0.K;
                bVar.V(gVar);
                bVar.l = gVar;
                return bVar.m(r0Var);
            }
            if (iE == 2) {
                if (((m0) r0Var).l().equals("template")) {
                    uVar.f(r0Var, bVar);
                    return true;
                }
                bVar.z(this);
                return false;
            }
            if (iE != 3 && iE != 4) {
                if (iE != 6) {
                    net.luminis.tls.engine.impl.c.r("Unexpected state: ".concat(p0.e(r0Var.a)));
                    return false;
                }
                if (bVar.Q("template")) {
                    bVar.z(this);
                    bVar.T("template");
                    bVar.t();
                    bVar.U();
                    bVar.a0();
                    if (bVar.l != b0.O && bVar.s.size() < 12) {
                        return bVar.m(r0Var);
                    }
                }
                return true;
            }
        }
        xVar.f(r0Var, bVar);
        return true;
    }
}
