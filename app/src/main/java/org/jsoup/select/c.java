package org.jsoup.select;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends d {
    public c(p... pVarArr) {
        List listAsList = Arrays.asList(pVarArr);
        int i = this.c;
        ArrayList arrayList = this.a;
        if (i > 1) {
            arrayList.add(new b(listAsList));
        } else {
            arrayList.addAll(listAsList);
        }
        g();
    }

    @Override // org.jsoup.select.p
    public final boolean b(org.jsoup.nodes.j jVar, org.jsoup.nodes.j jVar2) {
        for (int i = 0; i < this.c; i++) {
            if (((p) this.b.get(i)).b(jVar, jVar2)) {
                return true;
            }
        }
        return false;
    }

    @Override // org.jsoup.select.p
    public final boolean c(org.jsoup.nodes.j jVar, org.jsoup.nodes.n nVar) {
        for (int i = 0; i < this.c; i++) {
            if (((p) this.b.get(i)).c(jVar, nVar)) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return org.jsoup.internal.k.j(this.a, ", ");
    }
}
