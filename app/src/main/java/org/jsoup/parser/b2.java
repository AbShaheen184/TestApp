package org.jsoup.parser;

import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final enum b2 extends l3 {
    public b2() {
        super("AttributeValue_unquoted", 39);
    }

    @Override // org.jsoup.parser.l3
    public final void f(t0 t0Var, a aVar) {
        aVar.l0();
        String strZ = aVar.Z(l3.P0);
        if (strZ.length() > 0) {
            t0Var.j.i.k(strZ);
        }
        int iL0 = aVar.l0();
        char cW = aVar.w();
        if (cW == 0) {
            t0Var.m(this);
            t0Var.j.g((char) 65533, iL0, aVar.l0());
            return;
        }
        if (cW != ' ') {
            if (cW != '\"' && cW != '`') {
                e1 e1Var = l3.e;
                if (cW == 65535) {
                    t0Var.l(this);
                    t0Var.o(e1Var);
                    return;
                }
                if (cW != '\t' && cW != '\n' && cW != '\f' && cW != '\r') {
                    if (cW == '&') {
                        int[] iArrC = t0Var.c('>', true);
                        o0 o0Var = t0Var.j;
                        if (iArrC != null) {
                            o0Var.h(iArrC, iL0, aVar.l0());
                            return;
                        } else {
                            o0Var.g('&', iL0, aVar.l0());
                            return;
                        }
                    }
                    if (cW != '\'') {
                        switch (cW) {
                            case '<':
                            case '=':
                                break;
                            case Token.CATCH_SCOPE /* 62 */:
                                t0Var.k();
                                t0Var.o(e1Var);
                                break;
                            default:
                                t0Var.j.g(cW, iL0, aVar.l0());
                                break;
                        }
                        return;
                    }
                }
            }
            t0Var.m(this);
            t0Var.j.g(cW, iL0, aVar.l0());
            return;
        }
        t0Var.o(l3.e0);
    }
}
