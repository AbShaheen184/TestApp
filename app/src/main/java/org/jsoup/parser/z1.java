package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final enum z1 extends l3 {
    public z1() {
        super("AttributeValue_singleQuoted", 38);
    }

    @Override // org.jsoup.parser.l3
    public final void f(t0 t0Var, a aVar) {
        char c;
        aVar.l0();
        aVar.g();
        int i = aVar.A;
        int i2 = aVar.B;
        char[] cArr = aVar.z;
        int i3 = i;
        while (i3 < i2 && (c = cArr[i3]) != 0 && c != '&' && c != '\'') {
            i3++;
        }
        aVar.A = i3;
        String strM = i3 > i ? a.m(aVar.z, aVar.e, i, i3 - i) : "";
        if (strM.length() > 0) {
            t0Var.j.i.k(strM);
        } else {
            t0Var.j.j = true;
        }
        int iL0 = aVar.l0();
        char cW = aVar.w();
        if (cW == 0) {
            t0Var.m(this);
            t0Var.j.g((char) 65533, iL0, aVar.l0());
            return;
        }
        if (cW == 65535) {
            t0Var.l(this);
            t0Var.o(l3.e);
            return;
        }
        if (cW != '&') {
            if (cW != '\'') {
                t0Var.j.g(cW, iL0, aVar.l0());
                return;
            } else {
                t0Var.o(l3.l0);
                return;
            }
        }
        int[] iArrC = t0Var.c('\'', true);
        o0 o0Var = t0Var.j;
        if (iArrC != null) {
            o0Var.h(iArrC, iL0, aVar.l0());
        } else {
            o0Var.g('&', iL0, aVar.l0());
        }
    }
}
