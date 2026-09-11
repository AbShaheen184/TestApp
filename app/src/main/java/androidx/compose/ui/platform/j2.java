package androidx.compose.ui.platform;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class j2 {
    public final androidx.compose.ui.semantics.l a;
    public final androidx.collection.a0 b;

    public j2(androidx.compose.ui.semantics.p pVar, androidx.collection.n nVar) {
        this.a = pVar.d;
        this.b = new androidx.collection.a0(androidx.compose.ui.semantics.p.j(4, pVar).size());
        List listJ = androidx.compose.ui.semantics.p.j(4, pVar);
        int size = listJ.size();
        for (int i = 0; i < size; i++) {
            androidx.compose.ui.semantics.p pVar2 = (androidx.compose.ui.semantics.p) listJ.get(i);
            if (nVar.a(pVar2.g)) {
                this.b.a(pVar2.g);
            }
        }
    }
}
