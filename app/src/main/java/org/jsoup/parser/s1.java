package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final enum s1 extends l3 {
    public s1() {
        super("ScriptDataDoubleEscapedLessthanSign", 31);
    }

    @Override // org.jsoup.parser.l3
    public final void f(t0 t0Var, a aVar) {
        if (!aVar.g0('/')) {
            t0Var.o(l3.Z);
            return;
        }
        t0Var.f('/');
        t0Var.e();
        t0Var.a(l3.d0);
    }
}
