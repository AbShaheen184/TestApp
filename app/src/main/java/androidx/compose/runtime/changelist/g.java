package androidx.compose.runtime.changelist;

import androidx.compose.runtime.i2;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g extends j0 {
    public static final g c = new g(0, 2, 1);

    @Override // androidx.compose.runtime.changelist.j0
    public final void a(androidx.compose.foundation.text.selection.w wVar, androidx.compose.runtime.c cVar, i2 i2Var, androidx.compose.runtime.internal.l lVar, k0 k0Var) {
        int i = ((androidx.compose.runtime.internal.g) wVar.e(0)).a;
        List list = (List) wVar.e(1);
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            int i3 = i + i2;
            cVar.c(i3, obj);
            cVar.m(i3, obj);
        }
    }
}
