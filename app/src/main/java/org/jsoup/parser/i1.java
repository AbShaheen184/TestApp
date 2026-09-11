package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final enum i1 extends l3 {
    public i1() {
        super("ScriptDataEscapedDash", 22);
    }

    @Override // org.jsoup.parser.l3
    public final void f(t0 t0Var, a aVar) {
        if (aVar.c0()) {
            t0Var.l(this);
            t0Var.o(l3.e);
            return;
        }
        char cW = aVar.w();
        h1 h1Var = l3.S;
        if (cW == 0) {
            t0Var.m(this);
            t0Var.f((char) 65533);
            t0Var.o(h1Var);
        } else if (cW == '-') {
            t0Var.f(cW);
            t0Var.o(l3.U);
        } else if (cW == '<') {
            t0Var.o(l3.V);
        } else {
            t0Var.f(cW);
            t0Var.o(h1Var);
        }
    }
}
