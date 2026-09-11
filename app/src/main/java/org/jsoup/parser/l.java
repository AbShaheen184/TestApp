package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final enum l extends b0 {
    public l() {
        super("AfterBody", 18);
    }

    @Override // org.jsoup.parser.b0
    public final boolean f(r0 r0Var, b bVar) {
        org.jsoup.nodes.j jVarC = bVar.C("html");
        boolean zA = b0.a(r0Var);
        x xVar = b0.D;
        if (zA) {
            if (jVarC != null) {
                bVar.J((i0) r0Var, jVarC);
                return true;
            }
            xVar.f(r0Var, bVar);
            return true;
        }
        if (r0Var.a()) {
            bVar.K((j0) r0Var);
            return true;
        }
        if (r0Var.b()) {
            bVar.z(this);
            return false;
        }
        if (r0Var.e() && ((n0) r0Var).l().equals("html")) {
            return xVar.f(r0Var, bVar);
        }
        if (r0Var.d() && ((m0) r0Var).l().equals("html")) {
            if (bVar.x) {
                bVar.z(this);
                return false;
            }
            bVar.l = b0.S;
            return true;
        }
        if (r0Var.c()) {
            return true;
        }
        bVar.z(this);
        bVar.Z();
        return bVar.m(r0Var);
    }
}
