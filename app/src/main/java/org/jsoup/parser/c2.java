package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final enum c2 extends l3 {
    public c2() {
        super("AfterAttributeValue_quoted", 40);
    }

    @Override // org.jsoup.parser.l3
    public final void f(t0 t0Var, a aVar) {
        char cW = aVar.w();
        u1 u1Var = l3.e0;
        if (cW == '\t' || cW == '\n' || cW == '\f' || cW == '\r' || cW == ' ') {
            t0Var.o(u1Var);
            return;
        }
        if (cW == '/') {
            t0Var.o(l3.m0);
            return;
        }
        e1 e1Var = l3.e;
        if (cW == 65535) {
            t0Var.l(this);
            t0Var.o(e1Var);
        } else if (cW == '>') {
            t0Var.k();
            t0Var.o(e1Var);
        } else {
            if (cW == '?' && (t0Var.j instanceof q0)) {
                return;
            }
            aVar.o0();
            t0Var.m(this);
            t0Var.o(u1Var);
        }
    }
}
