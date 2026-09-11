package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final enum j2 extends l3 {
    public j2() {
        super("Comment", 47);
    }

    @Override // org.jsoup.parser.l3
    public final void f(t0 t0Var, a aVar) {
        char cB0 = aVar.b0();
        if (cB0 == 0) {
            t0Var.m(this);
            aVar.a();
            t0Var.m.g((char) 65533);
        } else {
            if (cB0 == '-') {
                t0Var.a(l3.t0);
                return;
            }
            if (cB0 != 65535) {
                j0 j0Var = t0Var.m;
                j0Var.d.k(aVar.Y('-', 0));
            } else {
                t0Var.l(this);
                t0Var.i();
                t0Var.o(l3.e);
            }
        }
    }
}
