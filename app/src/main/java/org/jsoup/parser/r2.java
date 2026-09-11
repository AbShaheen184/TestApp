package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final enum r2 extends l3 {
    public r2() {
        super("AfterDoctypeName", 54);
    }

    @Override // org.jsoup.parser.l3
    public final void f(t0 t0Var, a aVar) {
        boolean zC0 = aVar.c0();
        e1 e1Var = l3.e;
        if (zC0) {
            t0Var.l(this);
            t0Var.l.j = true;
            t0Var.j();
            t0Var.o(e1Var);
            return;
        }
        if (aVar.h0('\t', '\n', '\r', '\f', ' ')) {
            aVar.a();
            return;
        }
        if (aVar.g0('>')) {
            t0Var.j();
            t0Var.a(e1Var);
            return;
        }
        int i = t0Var.g;
        k0 k0Var = t0Var.l;
        if (i == 2 && aVar.g0('[')) {
            k0Var.i = true;
            t0Var.a(l3.M0);
            return;
        }
        if (aVar.f0("PUBLIC")) {
            k0Var.e = "PUBLIC";
            t0Var.o(l3.A0);
        } else if (aVar.f0("SYSTEM")) {
            k0Var.e = "SYSTEM";
            t0Var.o(l3.G0);
        } else {
            t0Var.m(this);
            k0Var.j = true;
            t0Var.a(l3.L0);
        }
    }
}
