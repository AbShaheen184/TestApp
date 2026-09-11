package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final enum n extends b0 {
    public n() {
        super("InFrameset", 19);
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
        if (!r0Var.e()) {
            if (r0Var.d() && ((m0) r0Var).l().equals("frameset")) {
                if (!bVar.c("frameset")) {
                    bVar.z(this);
                    return false;
                }
                bVar.l();
                if (!bVar.x && !bVar.c("frameset")) {
                    bVar.l = b0.R;
                    return true;
                }
            } else {
                if (!r0Var.c()) {
                    bVar.z(this);
                    return false;
                }
                if (!bVar.c("html")) {
                    bVar.z(this);
                }
            }
            return true;
        }
        n0 n0Var = (n0) r0Var;
        String strL = n0Var.l();
        strL.getClass();
        switch (strL) {
            case "frameset":
                bVar.L(n0Var);
                return true;
            case "html":
                return b0.D.f(n0Var, bVar);
            case "frame":
                bVar.M(n0Var);
                return true;
            case "noframes":
                return b0.A.f(n0Var, bVar);
            default:
                bVar.z(this);
                return false;
        }
    }
}
