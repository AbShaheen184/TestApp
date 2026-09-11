package org.jsoup.select;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class x extends c0 {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x(p pVar, int i) {
        super(pVar);
        this.d = i;
    }

    @Override // org.jsoup.select.p
    public final int a() {
        switch (this.d) {
            case 0:
                return this.a.a() * 8;
            case 1:
                return this.a.a() + 2;
            default:
                return this.a.a() + 2;
        }
    }

    @Override // org.jsoup.select.c0
    public final boolean g(org.jsoup.nodes.j jVar, org.jsoup.nodes.o oVar) {
        switch (this.d) {
            case 0:
                if (jVar != oVar) {
                    for (org.jsoup.nodes.j jVarD = oVar.D(); jVarD != null; jVarD = jVarD.e) {
                        if (h(jVar, jVarD)) {
                            return true;
                        }
                        if (jVarD != jVar) {
                        }
                    }
                }
                return false;
            case 1:
                return this.a.d(jVar, oVar);
            default:
                return !h(jVar, oVar);
        }
    }

    public final String toString() {
        switch (this.d) {
            case 0:
                return String.format("%s ", this.a);
            case 1:
                return String.format(":is(%s)", this.a);
            default:
                return String.format(":not(%s)", this.a);
        }
    }
}
