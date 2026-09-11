package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final enum f2 extends l3 {
    public f2() {
        super("MarkupDeclarationOpen", 43);
    }

    @Override // org.jsoup.parser.l3
    public final void f(t0 t0Var, a aVar) {
        if (aVar.e0("--")) {
            t0Var.m.f();
            t0Var.o(l3.q0);
            return;
        }
        if (aVar.f0("DOCTYPE")) {
            t0Var.o(l3.w0);
            return;
        }
        if (aVar.e0("[CDATA[")) {
            t0Var.e();
            t0Var.o(l3.N0);
            return;
        }
        if (t0Var.g != 2 || !aVar.i0()) {
            t0Var.m(this);
            t0Var.m.f();
            t0Var.o(l3.n0);
        } else {
            q0 q0Var = t0Var.n;
            q0Var.f();
            q0Var.k = true;
            t0Var.j = q0Var;
            t0Var.o(l3.G);
        }
    }
}
