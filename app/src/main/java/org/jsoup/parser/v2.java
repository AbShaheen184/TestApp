package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final enum v2 extends l3 {
    public v2() {
        super("DoctypePublicIdentifier_singleQuoted", 58);
    }

    @Override // org.jsoup.parser.l3
    public final void f(t0 t0Var, a aVar) {
        char cW = aVar.w();
        if (cW == 0) {
            t0Var.m(this);
            t0Var.l.f.j((char) 65533);
            return;
        }
        if (cW == '\'') {
            t0Var.o(l3.E0);
            return;
        }
        e1 e1Var = l3.e;
        if (cW == '>') {
            t0Var.m(this);
            t0Var.l.j = true;
            t0Var.j();
            t0Var.o(e1Var);
            return;
        }
        if (cW != 65535) {
            t0Var.l.f.j(cW);
            return;
        }
        t0Var.l(this);
        t0Var.l.j = true;
        t0Var.j();
        t0Var.o(e1Var);
    }
}
