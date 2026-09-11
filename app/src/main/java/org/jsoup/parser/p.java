package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final enum p extends b0 {
    public p() {
        super("AfterAfterBody", 21);
    }

    @Override // org.jsoup.parser.b0
    public final boolean f(r0 r0Var, b bVar) {
        if (r0Var.a()) {
            bVar.K((j0) r0Var);
            return true;
        }
        if (r0Var.b() || (r0Var.e() && ((n0) r0Var).l().equals("html"))) {
            return b0.D.f(r0Var, bVar);
        }
        if (b0.a(r0Var)) {
            bVar.J((i0) r0Var, bVar.d);
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
