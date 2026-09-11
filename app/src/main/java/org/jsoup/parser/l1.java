package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final enum l1 extends l3 {
    public l1() {
        super("ScriptDataEscapedEndTagOpen", 25);
    }

    @Override // org.jsoup.parser.l3
    public final void f(t0 t0Var, a aVar) {
        if (!aVar.i0()) {
            t0Var.g("</");
            t0Var.o(l3.S);
            return;
        }
        t0Var.d(false);
        o0 o0Var = t0Var.j;
        char cB0 = aVar.b0();
        o0Var.getClass();
        o0Var.i(String.valueOf(cB0));
        t0Var.f.j(aVar.b0());
        t0Var.a(l3.X);
    }
}
