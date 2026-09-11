package org.jsoup.parser;

import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final enum v1 extends l3 {
    public v1() {
        super("AttributeName", 34);
    }

    @Override // org.jsoup.parser.l3
    public final void f(t0 t0Var, a aVar) {
        aVar.l0();
        String strZ = aVar.Z(l3.O0);
        o0 o0Var = t0Var.j;
        o0Var.getClass();
        o0Var.h.k(strZ.replace((char) 0, (char) 65533));
        char cW = aVar.w();
        w1 w1Var = l3.g0;
        if (cW == '\t' || cW == '\n' || cW == '\f' || cW == '\r' || cW == ' ') {
            t0Var.o(w1Var);
            return;
        }
        if (cW != '\"' && cW != '\'') {
            if (cW == '/') {
                t0Var.o(l3.m0);
                return;
            }
            e1 e1Var = l3.e;
            if (cW == 65535) {
                t0Var.l(this);
                t0Var.o(e1Var);
                return;
            }
            switch (cW) {
                case '=':
                    t0Var.o(l3.h0);
                    return;
                case Token.CATCH_SCOPE /* 62 */:
                    t0Var.k();
                    t0Var.o(e1Var);
                    return;
                case Token.ENUM_INIT_KEYS /* 63 */:
                    if (t0Var.g == 2 && (t0Var.j instanceof q0)) {
                        t0Var.o(w1Var);
                        return;
                    }
                    break;
            }
            t0Var.j.h.j(cW);
            return;
        }
        t0Var.m(this);
        t0Var.j.h.j(cW);
    }
}
