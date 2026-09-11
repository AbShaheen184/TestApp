package org.jsoup.parser;

import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final enum w1 extends l3 {
    public w1() {
        super("AfterAttributeName", 35);
    }

    @Override // org.jsoup.parser.l3
    public final void f(t0 t0Var, a aVar) {
        char cW = aVar.w();
        v1 v1Var = l3.f0;
        if (cW == 0) {
            t0Var.m(this);
            t0Var.j.h.j((char) 65533);
            t0Var.o(v1Var);
            return;
        }
        if (cW != ' ') {
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
                if (cW == '\t' || cW == '\n' || cW == '\f' || cW == '\r') {
                    return;
                }
                switch (cW) {
                    case '<':
                        break;
                    case '=':
                        t0Var.o(l3.h0);
                        break;
                    case Token.CATCH_SCOPE /* 62 */:
                        t0Var.k();
                        t0Var.o(e1Var);
                        break;
                    default:
                        t0Var.j.k();
                        aVar.o0();
                        t0Var.o(v1Var);
                        break;
                }
                return;
            }
            t0Var.m(this);
            t0Var.j.k();
            t0Var.j.h.j(cW);
            t0Var.o(v1Var);
        }
    }
}
