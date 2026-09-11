package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final enum j3 extends l3 {
    public j3() {
        super("TagOpen", 7);
    }

    @Override // org.jsoup.parser.l3
    public final void f(t0 t0Var, a aVar) {
        char cB0 = aVar.b0();
        if (cB0 == '!') {
            t0Var.a(l3.o0);
            return;
        }
        if (cB0 == '/') {
            t0Var.a(l3.F);
            return;
        }
        if (cB0 == '?') {
            if (t0Var.g == 2) {
                t0Var.a(l3.p0);
                return;
            } else {
                t0Var.m.f();
                t0Var.o(l3.n0);
                return;
            }
        }
        if (aVar.i0()) {
            t0Var.d(true);
            t0Var.o(l3.G);
        } else {
            t0Var.m(this);
            t0Var.f('<');
            t0Var.o(l3.e);
        }
    }
}
