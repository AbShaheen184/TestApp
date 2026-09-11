package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final enum o1 extends l3 {
    public o1() {
        super("ScriptDataDoubleEscaped", 28);
    }

    @Override // org.jsoup.parser.l3
    public final void f(t0 t0Var, a aVar) {
        char cB0 = aVar.b0();
        if (cB0 == 0) {
            t0Var.m(this);
            aVar.a();
            t0Var.f((char) 65533);
        } else if (cB0 == '-') {
            t0Var.f(cB0);
            t0Var.a(l3.a0);
        } else if (cB0 == '<') {
            t0Var.f(cB0);
            t0Var.a(l3.c0);
        } else if (cB0 != 65535) {
            t0Var.g(aVar.Y('-', '<', 0));
        } else {
            t0Var.l(this);
            t0Var.o(l3.e);
        }
    }
}
