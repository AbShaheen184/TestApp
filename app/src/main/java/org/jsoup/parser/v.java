package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final enum v extends b0 {
    public v() {
        super("InHeadNoscript", 4);
    }

    @Override // org.jsoup.parser.b0
    public final boolean f(r0 r0Var, b bVar) {
        if (r0Var.b()) {
            bVar.z(this);
            return true;
        }
        if (r0Var.e() && ((n0) r0Var).l().equals("html")) {
            return b0.D.f(r0Var, bVar);
        }
        boolean zD = r0Var.d();
        u uVar = b0.A;
        if (zD && ((m0) r0Var).l().equals("noscript")) {
            bVar.l();
            bVar.l = uVar;
            return true;
        }
        if (b0.a(r0Var) || r0Var.a() || (r0Var.e() && org.jsoup.internal.k.d(((n0) r0Var).l(), a0.f))) {
            return uVar.f(r0Var, bVar);
        }
        if (r0Var.d() && ((m0) r0Var).l().equals("br")) {
            bVar.z(this);
            i0 i0Var = new i0();
            String string = r0Var.toString();
            com.google.common.util.concurrent.g0 g0Var = i0Var.d;
            g0Var.B();
            g0Var.y = string;
            bVar.I(i0Var, false);
            return true;
        }
        if ((r0Var.e() && org.jsoup.internal.k.d(((n0) r0Var).l(), a0.H)) || r0Var.d()) {
            bVar.z(this);
            return false;
        }
        bVar.z(this);
        i0 i0Var2 = new i0();
        String string2 = r0Var.toString();
        com.google.common.util.concurrent.g0 g0Var2 = i0Var2.d;
        g0Var2.B();
        g0Var2.y = string2;
        bVar.I(i0Var2, false);
        return true;
    }
}
