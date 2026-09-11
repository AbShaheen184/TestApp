package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final enum e3 extends l3 {
    public e3() {
        super("BogusDoctype", 66);
    }

    @Override // org.jsoup.parser.l3
    public final void f(t0 t0Var, a aVar) {
        char cW = aVar.w();
        e1 e1Var = l3.e;
        if (cW == '>') {
            t0Var.j();
            t0Var.o(e1Var);
        } else {
            if (cW != 65535) {
                return;
            }
            t0Var.j();
            t0Var.o(e1Var);
        }
    }
}
