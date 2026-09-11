package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends RuntimeException {
    public final int A;
    public final androidx.collection.j0 e;
    public final androidx.collection.j0 y;
    public final androidx.collection.y z;

    public k(androidx.collection.j0 j0Var, androidx.collection.j0 j0Var2, androidx.collection.y yVar, int i, Exception exc) {
        super(exc);
        this.e = j0Var;
        this.y = j0Var2;
        this.z = yVar;
        this.A = i;
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        List listP;
        List listK0;
        StringBuilder sb = new StringBuilder("\n            |Failed to execute op number ");
        sb.append(this.A);
        sb.append(":\n            |");
        kotlin.sequences.i iVarG = com.google.android.material.resources.g.g(new j(this, null));
        if (iVarG.hasNext()) {
            Object next = iVarG.next();
            if (iVarG.hasNext()) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(next);
                while (iVarG.hasNext()) {
                    arrayList.add(iVarG.next());
                }
                listP = arrayList;
            } else {
                listP = com.google.common.base.c.p(next);
            }
        } else {
            listP = kotlin.collections.u.e;
        }
        int size = listP.size();
        if (50 >= size) {
            listK0 = kotlin.collections.o.k0(listP);
        } else {
            ArrayList arrayList2 = new ArrayList(50);
            if (listP instanceof RandomAccess) {
                for (int i = size - 50; i < size; i++) {
                    arrayList2.add(listP.get(i));
                }
            } else {
                ListIterator listIterator = listP.listIterator(size - 50);
                while (listIterator.hasNext()) {
                    arrayList2.add(listIterator.next());
                }
            }
            listK0 = arrayList2;
        }
        sb.append(kotlin.collections.o.R(listK0, "\n", null, null, null, 62));
        sb.append("\n            ");
        return kotlin.text.l.E(sb.toString());
    }
}
