package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final enum y2 extends l3 {
    public y2() {
        super("BetweenDoctypePublicAndSystemIdentifiers", 60);
    }

    @Override // org.jsoup.parser.l3
    public final void f(t0 t0Var, a aVar) {
        char cW = aVar.w();
        if (cW == '\t' || cW == '\n' || cW == '\f' || cW == '\r' || cW == ' ') {
            return;
        }
        if (cW == '\"') {
            t0Var.m(this);
            t0Var.o(l3.I0);
            return;
        }
        if (cW == '\'') {
            t0Var.m(this);
            t0Var.o(l3.J0);
            return;
        }
        e1 e1Var = l3.e;
        if (cW == '>') {
            t0Var.j();
            t0Var.o(e1Var);
            return;
        }
        e3 e3Var = l3.L0;
        if (cW != '[') {
            if (cW != 65535) {
                t0Var.m(this);
                t0Var.l.j = true;
                t0Var.o(e3Var);
                return;
            } else {
                t0Var.l(this);
                t0Var.l.j = true;
                t0Var.j();
                t0Var.o(e1Var);
                return;
            }
        }
        int i = t0Var.g;
        k0 k0Var = t0Var.l;
        if (i == 2) {
            k0Var.i = true;
            t0Var.o(l3.M0);
        } else {
            t0Var.m(this);
            k0Var.j = true;
            t0Var.o(e3Var);
        }
    }
}
