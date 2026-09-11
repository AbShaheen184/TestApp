package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final enum o2 extends l3 {
    public o2() {
        super("Doctype", 51);
    }

    @Override // org.jsoup.parser.l3
    public final void f(t0 t0Var, a aVar) {
        char cW = aVar.w();
        p2 p2Var = l3.x0;
        if (cW == '\t' || cW == '\n' || cW == '\f' || cW == '\r' || cW == ' ') {
            t0Var.o(p2Var);
            return;
        }
        if (cW != '>') {
            if (cW != 65535) {
                t0Var.m(this);
                t0Var.o(p2Var);
                return;
            }
            t0Var.l(this);
        }
        t0Var.m(this);
        k0 k0Var = t0Var.l;
        k0Var.f();
        k0Var.j = true;
        t0Var.j();
        t0Var.o(l3.e);
    }
}
