package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final enum g2 extends l3 {
    public g2() {
        super("MarkupProcessingOpen", 44);
    }

    @Override // org.jsoup.parser.l3
    public final void f(t0 t0Var, a aVar) {
        if (aVar.i0()) {
            q0 q0Var = t0Var.n;
            q0Var.f();
            q0Var.k = false;
            t0Var.j = q0Var;
            t0Var.o(l3.G);
            return;
        }
        t0Var.m(this);
        j0 j0Var = t0Var.m;
        j0Var.f();
        j0Var.g('?');
        t0Var.o(l3.n0);
    }
}
