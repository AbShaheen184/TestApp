package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final enum w extends b0 {
    public w() {
        super("AfterHead", 5);
    }

    @Override // org.jsoup.parser.b0
    public final boolean f(r0 r0Var, b bVar) {
        if (b0.a(r0Var)) {
            bVar.I((i0) r0Var, false);
        } else if (r0Var.a()) {
            bVar.K((j0) r0Var);
        } else if (r0Var.b()) {
            bVar.z(this);
        } else {
            boolean zE = r0Var.e();
            u uVar = b0.A;
            if (zE) {
                n0 n0Var = (n0) r0Var;
                String strL = n0Var.l();
                boolean zEquals = strL.equals("html");
                x xVar = b0.D;
                if (zEquals) {
                    return xVar.f(r0Var, bVar);
                }
                if (strL.equals("body")) {
                    bVar.L(n0Var);
                    bVar.v = false;
                    bVar.l = xVar;
                } else if (strL.equals("frameset")) {
                    bVar.L(n0Var);
                    bVar.l = b0.Q;
                } else if (org.jsoup.internal.k.d(strL, a0.g)) {
                    bVar.z(this);
                    org.jsoup.nodes.j jVar = bVar.o;
                    bVar.e.add(jVar);
                    uVar.f(r0Var, bVar);
                    bVar.Y(jVar);
                } else {
                    if (strL.equals("head")) {
                        bVar.z(this);
                        return false;
                    }
                    bVar.o("body");
                    bVar.v = true;
                    bVar.m(r0Var);
                }
            } else if (r0Var.d()) {
                String strL2 = ((m0) r0Var).l();
                if (org.jsoup.internal.k.d(strL2, a0.d)) {
                    bVar.o("body");
                    bVar.v = true;
                    bVar.m(r0Var);
                } else {
                    if (!strL2.equals("template")) {
                        bVar.z(this);
                        return false;
                    }
                    uVar.f(r0Var, bVar);
                }
            } else {
                bVar.o("body");
                bVar.v = true;
                bVar.m(r0Var);
            }
        }
        return true;
    }
}
