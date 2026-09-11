package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final enum p2 extends l3 {
    public p2() {
        super("BeforeDoctypeName", 52);
    }

    @Override // org.jsoup.parser.l3
    public final void f(t0 t0Var, a aVar) {
        boolean zI0 = aVar.i0();
        q2 q2Var = l3.y0;
        if (zI0) {
            t0Var.l.f();
            t0Var.o(q2Var);
            return;
        }
        char cW = aVar.w();
        if (cW == 0) {
            t0Var.m(this);
            k0 k0Var = t0Var.l;
            k0Var.f();
            k0Var.d.j((char) 65533);
            t0Var.o(q2Var);
            return;
        }
        if (cW != ' ') {
            if (cW == 65535) {
                t0Var.l(this);
                k0 k0Var2 = t0Var.l;
                k0Var2.f();
                k0Var2.j = true;
                t0Var.j();
                t0Var.o(l3.e);
                return;
            }
            if (cW == '\t' || cW == '\n' || cW == '\f' || cW == '\r') {
                return;
            }
            t0Var.l.f();
            t0Var.l.d.j(cW);
            t0Var.o(q2Var);
        }
    }
}
