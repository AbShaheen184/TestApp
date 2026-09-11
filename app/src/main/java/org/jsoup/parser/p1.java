package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final enum p1 extends l3 {
    public p1() {
        super("CharacterReferenceInData", 1);
    }

    @Override // org.jsoup.parser.l3
    public final void f(t0 t0Var, a aVar) {
        int[] iArrC = t0Var.c(null, false);
        if (iArrC == null) {
            t0Var.f('&');
        } else {
            t0Var.g(new String(iArrC, 0, iArrC.length));
        }
        t0Var.o(l3.e);
    }
}
