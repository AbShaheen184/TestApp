package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final enum g3 extends l3 {
    public g3() {
        super("CdataSection", 68);
    }

    @Override // org.jsoup.parser.l3
    public final void f(t0 t0Var, a aVar) {
        String strM;
        int iK0 = aVar.k0("]]>");
        if (iK0 != -1) {
            strM = a.m(aVar.z, aVar.e, aVar.A, iK0);
            aVar.A += iK0;
        } else {
            int i = aVar.B;
            int i2 = aVar.A;
            if (i - i2 < 3) {
                strM = aVar.a0();
            } else {
                int i3 = i - 2;
                strM = a.m(aVar.z, aVar.e, i2, i3 - i2);
                aVar.A = i3;
            }
        }
        t0Var.f.k(strM);
        if (aVar.e0("]]>") || aVar.c0()) {
            String strE = t0Var.f.E();
            h0 h0Var = new h0();
            com.google.common.util.concurrent.g0 g0Var = h0Var.d;
            g0Var.B();
            g0Var.y = strE;
            t0Var.h(h0Var);
            t0Var.o(l3.e);
        }
    }
}
