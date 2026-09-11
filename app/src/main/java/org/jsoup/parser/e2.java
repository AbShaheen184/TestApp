package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final enum e2 extends l3 {
    public e2() {
        super("BogusComment", 42);
    }

    @Override // org.jsoup.parser.l3
    public final void f(t0 t0Var, a aVar) {
        j0 j0Var = t0Var.m;
        j0Var.d.k(aVar.X('>'));
        char cB0 = aVar.b0();
        if (cB0 == '>' || cB0 == 65535) {
            aVar.w();
            t0Var.i();
            t0Var.o(l3.e);
        }
    }
}
