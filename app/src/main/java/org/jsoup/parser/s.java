package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final enum s extends b0 {
    public s() {
        super("BeforeHtml", 1);
    }

    @Override // org.jsoup.parser.b0
    public final boolean f(r0 r0Var, b bVar) {
        if (r0Var.b()) {
            bVar.z(this);
            return false;
        }
        if (r0Var.a()) {
            bVar.K((j0) r0Var);
            return true;
        }
        if (b0.a(r0Var)) {
            bVar.I((i0) r0Var, false);
            return true;
        }
        boolean zE = r0Var.e();
        t tVar = b0.z;
        if (zE) {
            n0 n0Var = (n0) r0Var;
            if (n0Var.l().equals("html")) {
                bVar.L(n0Var);
                bVar.l = tVar;
                return true;
            }
        }
        if (r0Var.d() && org.jsoup.internal.k.d(((m0) r0Var).l(), a0.e)) {
            bVar.o("html");
            bVar.l = tVar;
            return bVar.m(r0Var);
        }
        if (r0Var.d()) {
            bVar.z(this);
            return false;
        }
        bVar.o("html");
        bVar.l = tVar;
        return bVar.m(r0Var);
    }
}
