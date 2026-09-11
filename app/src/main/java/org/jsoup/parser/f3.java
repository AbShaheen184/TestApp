package org.jsoup.parser;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final enum f3 extends l3 {
    public f3() {
        super("DoctypeInternalSubset", 67);
    }

    @Override // org.jsoup.parser.l3
    public final void f(t0 t0Var, a aVar) {
        char c;
        com.google.common.util.concurrent.g0 g0Var = t0Var.l.h;
        while (true) {
            char c2 = 0;
            while (true) {
                char cW = aVar.w();
                if (cW == 0) {
                    t0Var.m(this);
                    g0Var.j((char) 65533);
                } else if (cW == '\"') {
                    g0Var.j(cW);
                    c = 2;
                    if (c2 == 0) {
                        c2 = c;
                    } else if (c2 == 2) {
                        break;
                    }
                } else if (cW == '\'') {
                    g0Var.j(cW);
                    c = 1;
                    if (c2 == 0) {
                        c2 = c;
                    } else if (c2 == 1) {
                        break;
                    }
                } else if (cW == '-') {
                    g0Var.j(cW);
                    if (c2 == 3 && aVar.e0("->")) {
                        g0Var.k("->");
                        break;
                    }
                } else if (cW == '<') {
                    g0Var.j(cW);
                    if (c2 == 0) {
                        if (aVar.e0("!--")) {
                            g0Var.k("!--");
                            c2 = 3;
                        } else if (aVar.e0("?")) {
                            g0Var.j('?');
                            c2 = 4;
                        }
                    }
                } else if (cW == '?') {
                    g0Var.j(cW);
                    if (c2 == 4 && aVar.g0('>')) {
                        aVar.a();
                        g0Var.j('>');
                        break;
                    }
                } else {
                    e1 e1Var = l3.e;
                    if (cW != ']') {
                        if (cW == 65535) {
                            t0Var.l(this);
                            t0Var.j();
                            t0Var.o(e1Var);
                            return;
                        }
                        g0Var.j(cW);
                    } else if (c2 == 0) {
                        aVar.g();
                        int i = aVar.A;
                        int i2 = aVar.B;
                        char[] cArr = aVar.z;
                        int i3 = i;
                        while (i3 < i2 && org.jsoup.internal.k.i(cArr[i3])) {
                            i3++;
                        }
                        aVar.A = i3;
                        String strM = i3 > i ? a.m(aVar.z, aVar.e, i, i3 - i) : "";
                        if (aVar.g0('>')) {
                            aVar.a();
                            t0Var.j();
                            t0Var.o(e1Var);
                            return;
                        }
                        g0Var.j(cW);
                        g0Var.k(strM);
                    } else {
                        g0Var.j(cW);
                    }
                }
            }
        }
    }
}
