package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final enum b1 extends l3 {
    public b1() {
        super("ScriptDataLessthanSign", 16);
    }

    @Override // org.jsoup.parser.l3
    public final void f(t0 t0Var, a aVar) {
        char cW = aVar.w();
        if (cW == '!') {
            t0Var.g("<!");
            t0Var.o(l3.Q);
            return;
        }
        if (cW == '/') {
            t0Var.e();
            t0Var.o(l3.O);
        } else if (cW != 65535) {
            t0Var.f('<');
            aVar.o0();
            t0Var.o(l3.C);
        } else {
            t0Var.f('<');
            t0Var.l(this);
            t0Var.o(l3.e);
        }
    }
}
