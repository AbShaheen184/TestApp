package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final enum r1 extends l3 {
    public r1() {
        super("ScriptDataDoubleEscapedDashDash", 30);
    }

    @Override // org.jsoup.parser.l3
    public final void f(t0 t0Var, a aVar) {
        char cW = aVar.w();
        o1 o1Var = l3.Z;
        if (cW == 0) {
            t0Var.m(this);
            t0Var.f((char) 65533);
            t0Var.o(o1Var);
            return;
        }
        if (cW == '-') {
            t0Var.f(cW);
            return;
        }
        if (cW == '<') {
            t0Var.f(cW);
            t0Var.o(l3.c0);
        } else if (cW == '>') {
            t0Var.f(cW);
            t0Var.o(l3.C);
        } else if (cW != 65535) {
            t0Var.f(cW);
            t0Var.o(o1Var);
        } else {
            t0Var.l(this);
            t0Var.o(l3.e);
        }
    }
}
