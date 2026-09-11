package androidx.compose.runtime.changelist;

import androidx.collection.o0;
import androidx.compose.runtime.i2;
import androidx.compose.runtime.q1;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends j0 {
    public static final o c = new o(0, 1, 1);

    @Override // androidx.compose.runtime.changelist.j0
    public final void a(androidx.compose.foundation.text.selection.w wVar, androidx.compose.runtime.c cVar, i2 i2Var, androidx.compose.runtime.internal.l lVar, k0 k0Var) {
        androidx.compose.runtime.collection.b bVar;
        q1 q1Var = (q1) wVar.e(0);
        o0 o0Var = lVar.i;
        if (o0Var == null || ((androidx.compose.runtime.internal.h) o0Var.g(q1Var)) == null) {
            return;
        }
        ArrayList arrayList = lVar.j;
        if (arrayList != null && (bVar = (androidx.compose.runtime.collection.b) arrayList.remove(arrayList.size() - 1)) != null) {
            lVar.e = bVar;
        }
        o0Var.k(q1Var);
    }
}
