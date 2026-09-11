package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final enum u0 extends l3 {
    public u0() {
        super("TagName", 9);
    }

    @Override // org.jsoup.parser.l3
    public final void f(t0 t0Var, a aVar) {
        t0Var.j.i(aVar.N(new net.luminis.tls.engine.impl.c(25)));
        char cW = aVar.w();
        if (cW == 0) {
            t0Var.j.i(l3.Q0);
            return;
        }
        if (cW != ' ') {
            if (cW == '/') {
                t0Var.o(l3.m0);
                return;
            }
            e1 e1Var = l3.e;
            if (cW == '>') {
                t0Var.k();
                t0Var.o(e1Var);
                return;
            }
            if (cW == 65535) {
                t0Var.l(this);
                t0Var.o(e1Var);
                return;
            } else if (cW != '\t' && cW != '\n' && cW != '\f' && cW != '\r') {
                o0 o0Var = t0Var.j;
                o0Var.getClass();
                o0Var.i(String.valueOf(cW));
                return;
            }
        }
        t0Var.o(l3.e0);
    }
}
