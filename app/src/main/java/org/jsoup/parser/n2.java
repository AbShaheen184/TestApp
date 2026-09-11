package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final enum n2 extends l3 {
    public n2() {
        super("CommentEndBang", 50);
    }

    @Override // org.jsoup.parser.l3
    public final void f(t0 t0Var, a aVar) {
        char cW = aVar.w();
        j2 j2Var = l3.s0;
        if (cW == 0) {
            t0Var.m(this);
            j0 j0Var = t0Var.m;
            j0Var.d.k("--!");
            j0Var.g((char) 65533);
            t0Var.o(j2Var);
            return;
        }
        if (cW == '-') {
            t0Var.m.d.k("--!");
            t0Var.o(l3.t0);
            return;
        }
        e1 e1Var = l3.e;
        if (cW == '>') {
            t0Var.i();
            t0Var.o(e1Var);
        } else if (cW == 65535) {
            t0Var.l(this);
            t0Var.i();
            t0Var.o(e1Var);
        } else {
            j0 j0Var2 = t0Var.m;
            j0Var2.d.k("--!");
            j0Var2.g(cW);
            t0Var.o(j2Var);
        }
    }
}
