package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final enum q extends b0 {
    public q() {
        super("AfterAfterFrameset", 22);
    }

    @Override // org.jsoup.parser.b0
    public final boolean f(r0 r0Var, b bVar) {
        if (r0Var.a()) {
            bVar.K((j0) r0Var);
            return true;
        }
        if (r0Var.b() || b0.a(r0Var) || (r0Var.e() && ((n0) r0Var).l().equals("html"))) {
            return b0.D.f(r0Var, bVar);
        }
        if (r0Var.c()) {
            return true;
        }
        if (r0Var.e() && ((n0) r0Var).l().equals("noframes")) {
            return b0.A.f(r0Var, bVar);
        }
        bVar.z(this);
        return false;
    }
}
