package org.jsoup.select;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends d {
    public b(List list) {
        this.a.addAll(list);
        g();
    }

    @Override // org.jsoup.select.p
    public final boolean b(org.jsoup.nodes.j jVar, org.jsoup.nodes.j jVar2) {
        for (int i = 0; i < this.c; i++) {
            if (!((p) this.b.get(i)).b(jVar, jVar2)) {
                return false;
            }
        }
        return true;
    }

    @Override // org.jsoup.select.p
    public final boolean c(org.jsoup.nodes.j jVar, org.jsoup.nodes.n nVar) {
        for (int i = 0; i < this.c; i++) {
            if (!((p) this.b.get(i)).c(jVar, nVar)) {
                return false;
            }
        }
        return true;
    }

    public final String toString() {
        return org.jsoup.internal.k.j(this.a, "");
    }
}
