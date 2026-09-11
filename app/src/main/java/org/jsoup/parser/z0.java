package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final enum z0 extends l3 {
    public z0() {
        super("RawtextEndTagOpen", 14);
    }

    @Override // org.jsoup.parser.l3
    public final void f(t0 t0Var, a aVar) {
        if (aVar.i0()) {
            t0Var.d(false);
            t0Var.o(l3.M);
        } else {
            t0Var.g("</");
            t0Var.o(l3.B);
        }
    }
}
