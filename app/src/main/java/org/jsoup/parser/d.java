package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final enum d extends b0 {
    public d() {
        super("InCaption", 10);
    }

    @Override // org.jsoup.parser.b0
    public final boolean f(r0 r0Var, b bVar) {
        boolean zD = r0Var.d();
        z zVar = b0.F;
        if (zD && ((m0) r0Var).l().equals("caption")) {
            if (!bVar.H("caption")) {
                bVar.z(this);
                return false;
            }
            bVar.B(false);
            if (!bVar.c("caption")) {
                bVar.z(this);
            }
            bVar.T("caption");
            bVar.t();
            bVar.l = zVar;
            return true;
        }
        if ((!r0Var.e() || !org.jsoup.internal.k.d(((n0) r0Var).l(), a0.x)) && (!r0Var.d() || !((m0) r0Var).l().equals("table"))) {
            if (!r0Var.d() || !org.jsoup.internal.k.d(((m0) r0Var).l(), a0.I)) {
                return b0.D.f(r0Var, bVar);
            }
            bVar.z(this);
            return false;
        }
        if (!bVar.H("caption")) {
            bVar.z(this);
            return false;
        }
        bVar.B(false);
        if (!bVar.c("caption")) {
            bVar.z(this);
        }
        bVar.T("caption");
        bVar.t();
        bVar.l = zVar;
        zVar.f(r0Var, bVar);
        return true;
    }
}
