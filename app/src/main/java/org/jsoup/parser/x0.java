package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final enum x0 extends l3 {
    public x0() {
        super("RCDATAEndTagName", 12);
    }

    public static void g(t0 t0Var, a aVar) {
        t0Var.g("</");
        t0Var.g(t0Var.f.E());
        aVar.o0();
        t0Var.o(l3.z);
    }

    @Override // org.jsoup.parser.l3
    public final void f(t0 t0Var, a aVar) {
        if (aVar.i0()) {
            String strN = aVar.N(new net.luminis.tls.engine.impl.c(25));
            t0Var.j.i(strN);
            t0Var.f.k(strN);
            return;
        }
        char cW = aVar.w();
        if (cW == '\t' || cW == '\n' || cW == '\f' || cW == '\r' || cW == ' ') {
            if (t0Var.n()) {
                t0Var.o(l3.e0);
                return;
            } else {
                g(t0Var, aVar);
                return;
            }
        }
        if (cW == '/') {
            if (t0Var.n()) {
                t0Var.o(l3.m0);
                return;
            } else {
                g(t0Var, aVar);
                return;
            }
        }
        if (cW != '>') {
            g(t0Var, aVar);
        } else if (!t0Var.n()) {
            g(t0Var, aVar);
        } else {
            t0Var.k();
            t0Var.o(l3.e);
        }
    }
}
