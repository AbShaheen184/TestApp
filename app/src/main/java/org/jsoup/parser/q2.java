package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final enum q2 extends l3 {
    public q2() {
        super("DoctypeName", 53);
    }

    @Override // org.jsoup.parser.l3
    public final void f(t0 t0Var, a aVar) {
        if (aVar.i0()) {
            t0Var.l.d.k(aVar.L());
            return;
        }
        char cW = aVar.w();
        if (cW == 0) {
            t0Var.m(this);
            t0Var.l.d.j((char) 65533);
            return;
        }
        if (cW != ' ') {
            e1 e1Var = l3.e;
            if (cW == '>') {
                t0Var.j();
                t0Var.o(e1Var);
                return;
            }
            if (cW == 65535) {
                t0Var.l(this);
                t0Var.l.j = true;
                t0Var.j();
                t0Var.o(e1Var);
                return;
            }
            if (cW != '\t' && cW != '\n' && cW != '\f' && cW != '\r') {
                t0Var.l.d.j(cW);
                return;
            }
        }
        t0Var.o(l3.z0);
    }
}
