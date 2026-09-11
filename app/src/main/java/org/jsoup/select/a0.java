package org.jsoup.select;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends c0 {
    @Override // org.jsoup.select.p
    public final int a() {
        return this.a.a() + 2;
    }

    @Override // org.jsoup.select.c0
    public final boolean g(org.jsoup.nodes.j jVar, org.jsoup.nodes.o oVar) {
        org.jsoup.nodes.o oVarE;
        if (jVar == oVar) {
            return false;
        }
        if (!this.b) {
            oVar.getClass();
            while (true) {
                oVar = oVar.E();
                if (oVar == null) {
                    oVarE = null;
                    break;
                }
                if (oVar instanceof org.jsoup.nodes.j) {
                    oVarE = (org.jsoup.nodes.j) oVar;
                    break;
                }
            }
        } else {
            oVarE = oVar.E();
        }
        return oVarE != null && h(jVar, oVarE);
    }

    public final String toString() {
        return String.format("%s + ", this.a);
    }
}
