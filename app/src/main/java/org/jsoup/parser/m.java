package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final enum m extends b0 {
    public m() {
        super("Initial", 0);
    }

    @Override // org.jsoup.parser.b0
    public final boolean f(r0 r0Var, b bVar) {
        if (b0.a(r0Var)) {
            return true;
        }
        if (r0Var.a()) {
            bVar.K((j0) r0Var);
            return true;
        }
        boolean zB = r0Var.b();
        s sVar = b0.y;
        if (!zB) {
            bVar.d.I = 2;
            bVar.l = sVar;
            return bVar.m(r0Var);
        }
        k0 k0Var = (k0) r0Var;
        d0 d0Var = bVar.h;
        String strE = k0Var.d.E();
        d0Var.getClass();
        String strTrim = strE.trim();
        if (!d0Var.a) {
            strTrim = org.jsoup.internal.b.c(strTrim);
        }
        org.jsoup.nodes.h hVar = new org.jsoup.nodes.h(strTrim, k0Var.f.E(), k0Var.g.E());
        String str = k0Var.e;
        if (str != null) {
            hVar.e("pubSysKey", str);
        }
        bVar.d.J(hVar);
        if (k0Var.j || !hVar.d("name").equals("html") || hVar.d("publicId").equalsIgnoreCase("HTML")) {
            bVar.d.I = 2;
        }
        bVar.l = sVar;
        return true;
    }
}
