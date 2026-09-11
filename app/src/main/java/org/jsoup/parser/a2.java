package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final enum a2 extends l3 {
    public a2() {
        super("Rcdata", 2);
    }

    @Override // org.jsoup.parser.l3
    public final void f(t0 t0Var, a aVar) {
        char cB0 = aVar.b0();
        if (cB0 == 0) {
            t0Var.m(this);
            aVar.a();
            t0Var.f((char) 65533);
        } else {
            if (cB0 == '&') {
                t0Var.a(l3.A);
                return;
            }
            if (cB0 == '<') {
                t0Var.a(l3.H);
            } else if (cB0 != 65535) {
                t0Var.g(aVar.z());
            } else {
                t0Var.h(new l0());
            }
        }
    }
}
