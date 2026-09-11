package androidx.compose.runtime.changelist;

import androidx.collection.o0;
import androidx.compose.runtime.i2;
import androidx.compose.runtime.q1;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 extends j0 {
    public static final d0 c = new d0(0, 1, 1);

    @Override // androidx.compose.runtime.changelist.j0
    public final void a(androidx.compose.foundation.text.selection.w wVar, androidx.compose.runtime.c cVar, i2 i2Var, androidx.compose.runtime.internal.l lVar, k0 k0Var) {
        q1 q1Var = (q1) wVar.e(0);
        o0 o0Var = lVar.i;
        androidx.compose.runtime.internal.h hVar = o0Var != null ? (androidx.compose.runtime.internal.h) o0Var.g(q1Var) : null;
        if (hVar != null) {
            ArrayList arrayList = lVar.j;
            if (arrayList == null) {
                arrayList = new ArrayList();
                lVar.j = arrayList;
            }
            arrayList.add(lVar.e);
            lVar.e = hVar.y;
        }
    }
}
