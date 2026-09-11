package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final enum j extends b0 {
    public j() {
        super("InSelectInTable", 16);
    }

    @Override // org.jsoup.parser.b0
    public final boolean f(r0 r0Var, b bVar) {
        boolean zE = r0Var.e();
        String[] strArr = a0.F;
        if (zE && org.jsoup.internal.k.d(((n0) r0Var).l(), strArr)) {
            bVar.z(this);
            bVar.T("select");
            bVar.a0();
            return bVar.m(r0Var);
        }
        if (r0Var.d()) {
            m0 m0Var = (m0) r0Var;
            if (org.jsoup.internal.k.d(m0Var.l(), strArr)) {
                bVar.z(this);
                if (!bVar.H(m0Var.l())) {
                    return false;
                }
                bVar.T("select");
                bVar.a0();
                return bVar.m(r0Var);
            }
        }
        return b0.M.f(r0Var, bVar);
    }
}
