package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final enum x2 extends l3 {
    public x2() {
        super("AfterDoctypePublicIdentifier", 59);
    }

    @Override // org.jsoup.parser.l3
    public final void f(t0 t0Var, a aVar) {
        char cW = aVar.w();
        if (cW == '\t' || cW == '\n' || cW == '\f' || cW == '\r' || cW == ' ') {
            t0Var.o(l3.F0);
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
        } else if (cW != 65535) {
            t0Var.m(this);
            t0Var.l.j = true;
            t0Var.o(l3.L0);
        } else {
            t0Var.l(this);
            t0Var.l.j = true;
            t0Var.j();
            t0Var.o(e1Var);
        }
    }
}
