package org.jsoup.parser;

import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final enum x1 extends l3 {
    public x1() {
        super("BeforeAttributeValue", 36);
    }

    @Override // org.jsoup.parser.l3
    public final void f(t0 t0Var, a aVar) {
        char cW = aVar.w();
        b2 b2Var = l3.k0;
        if (cW == 0) {
            t0Var.m(this);
            t0Var.j.g((char) 65533, aVar.l0() - 1, aVar.l0());
            t0Var.o(b2Var);
            return;
        }
        if (cW != ' ') {
            if (cW == '\"') {
                t0Var.o(l3.i0);
                return;
            }
            if (cW != '`') {
                e1 e1Var = l3.e;
                if (cW == 65535) {
                    t0Var.l(this);
                    t0Var.k();
                    t0Var.o(e1Var);
                    return;
                }
                if (cW == '\t' || cW == '\n' || cW == '\f' || cW == '\r') {
                    return;
                }
                if (cW == '&') {
                    aVar.o0();
                    t0Var.o(b2Var);
                    return;
                }
                if (cW == '\'') {
                    t0Var.o(l3.j0);
                    return;
                }
                switch (cW) {
                    case '<':
                    case '=':
                        break;
                    case Token.CATCH_SCOPE /* 62 */:
                        t0Var.m(this);
                        t0Var.k();
                        t0Var.o(e1Var);
                        break;
                    default:
                        aVar.o0();
                        t0Var.o(b2Var);
                        break;
                }
                return;
            }
            t0Var.m(this);
            t0Var.j.g(cW, aVar.l0() - 1, aVar.l0());
            t0Var.o(b2Var);
        }
    }
}
