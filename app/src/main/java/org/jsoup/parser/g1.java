package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final enum g1 extends l3 {
    public g1() {
        super("ScriptDataEscapeStartDash", 20);
    }

    @Override // org.jsoup.parser.l3
    public final void f(t0 t0Var, a aVar) {
        if (!aVar.g0('-')) {
            t0Var.o(l3.C);
        } else {
            t0Var.f('-');
            t0Var.a(l3.U);
        }
    }
}
