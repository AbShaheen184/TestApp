package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final enum k3 extends l3 {
    public k3() {
        super("EndTagOpen", 8);
    }

    @Override // org.jsoup.parser.l3
    public final void f(t0 t0Var, a aVar) {
        boolean zC0 = aVar.c0();
        e1 e1Var = l3.e;
        if (zC0) {
            t0Var.l(this);
            t0Var.g("</");
            t0Var.o(e1Var);
        } else if (aVar.i0()) {
            t0Var.d(false);
            t0Var.o(l3.G);
        } else {
            if (aVar.g0('>')) {
                t0Var.m(this);
                t0Var.a(e1Var);
                return;
            }
            t0Var.m(this);
            j0 j0Var = t0Var.m;
            j0Var.f();
            j0Var.g('/');
            t0Var.o(l3.n0);
        }
    }
}
