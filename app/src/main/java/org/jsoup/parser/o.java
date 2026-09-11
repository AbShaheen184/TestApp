package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final enum o extends b0 {
    public o() {
        super("AfterFrameset", 20);
    }

    @Override // org.jsoup.parser.b0
    public final boolean f(r0 r0Var, b bVar) {
        if (b0.a(r0Var)) {
            bVar.I((i0) r0Var, false);
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
            return b0.D.f(r0Var, bVar);
        }
        if (r0Var.d() && ((m0) r0Var).l().equals("html")) {
            bVar.l = b0.T;
            return true;
        }
        if (r0Var.e() && ((n0) r0Var).l().equals("noframes")) {
            return b0.A.f(r0Var, bVar);
        }
        if (r0Var.c()) {
            return true;
        }
        bVar.z(this);
        return false;
    }
}
