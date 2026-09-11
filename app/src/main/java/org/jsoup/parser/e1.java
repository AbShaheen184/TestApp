package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final enum e1 extends l3 {
    public e1() {
        super("Data", 0);
    }

    @Override // org.jsoup.parser.l3
    public final void f(t0 t0Var, a aVar) {
        char cB0 = aVar.b0();
        if (cB0 == 0) {
            t0Var.m(this);
            t0Var.f(aVar.w());
        } else {
            if (cB0 == '&') {
                t0Var.a(l3.y);
                return;
            }
            if (cB0 == '<') {
                t0Var.a(l3.E);
            } else if (cB0 != 65535) {
                t0Var.g(aVar.z());
            } else {
                t0Var.h(new l0());
            }
        }
    }
}
