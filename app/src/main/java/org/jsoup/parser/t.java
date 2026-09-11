package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final enum t extends b0 {
    public t() {
        super("BeforeHead", 2);
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
        if (r0Var.e()) {
            n0 n0Var = (n0) r0Var;
            if (n0Var.l().equals("head")) {
                bVar.o = bVar.L(n0Var);
                bVar.l = b0.A;
                return true;
            }
        }
        if (r0Var.d() && org.jsoup.internal.k.d(((m0) r0Var).l(), a0.e)) {
            bVar.o("head");
            return bVar.m(r0Var);
        }
        if (r0Var.d()) {
            bVar.z(this);
            return false;
        }
        bVar.o("head");
        return bVar.m(r0Var);
    }
}
