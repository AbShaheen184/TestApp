package org.jsoup.select;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public interface u {
    void f(org.jsoup.nodes.o oVar, int i);

    default void j(org.jsoup.nodes.o oVar) {
        org.jsoup.helper.n.H(oVar);
        org.jsoup.nodes.o oVarU = oVar.u();
        char c = 0;
        int i = 0;
        while (true) {
            if (c == 0) {
                org.jsoup.nodes.j jVar = oVar.e;
                org.jsoup.nodes.o oVarU2 = oVar.u();
                int I = jVar != null ? oVar.I() : 0;
                f(oVar, i);
                if (jVar != null && oVar.e != jVar) {
                    oVar = I < jVar.B.size() ? jVar.i(I) : null;
                    org.jsoup.nodes.o oVar2 = i == 0 ? oVarU : oVarU2;
                    if (oVar == null || oVar == oVar2) {
                        if (i == 0) {
                            return;
                        }
                        if (oVarU2 == null || oVarU2.e != jVar) {
                            i--;
                            c = 2;
                            oVar = jVar;
                        } else {
                            oVar = oVarU2;
                        }
                    }
                }
                c = 1;
            } else {
                if (c != 1 || oVar.j() <= 0) {
                    i(oVar, i);
                    org.jsoup.nodes.o oVarU3 = oVar.u();
                    if (i == 0) {
                        if (oVarU3 == null || oVarU3 == oVarU) {
                            return;
                        }
                    } else if (oVarU3 == null) {
                        oVar = oVar.e;
                        i--;
                        c = 2;
                    }
                    oVar = oVarU3;
                } else {
                    oVar = oVar.i(0);
                    i++;
                }
                c = 0;
            }
        }
    }

    default void i(org.jsoup.nodes.o oVar, int i) {
    }
}
