package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final enum k1 extends l3 {
    public k1() {
        super("ScriptDataEscapedLessthanSign", 24);
    }

    @Override // org.jsoup.parser.l3
    public final void f(t0 t0Var, a aVar) {
        if (aVar.i0()) {
            t0Var.e();
            t0Var.f.j(aVar.b0());
            t0Var.f('<');
            t0Var.f(aVar.b0());
            t0Var.a(l3.Y);
            return;
        }
        if (aVar.g0('/')) {
            t0Var.e();
            t0Var.a(l3.W);
        } else {
            t0Var.f('<');
            t0Var.o(l3.S);
        }
    }
}
