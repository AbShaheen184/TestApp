package androidx.compose.runtime.changelist;

import androidx.collection.o0;
import androidx.collection.w0;
import androidx.compose.runtime.a2;
import androidx.compose.runtime.i2;
import androidx.compose.runtime.q1;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class x extends j0 {
    public static final x c = new x(0, 1, 1);

    @Override // androidx.compose.runtime.changelist.j0
    public final void a(androidx.compose.foundation.text.selection.w wVar, androidx.compose.runtime.c cVar, i2 i2Var, androidx.compose.runtime.internal.l lVar, k0 k0Var) {
        q1 q1Var = (q1) wVar.e(0);
        Set set = lVar.a;
        if (set == null) {
            return;
        }
        androidx.compose.runtime.internal.h hVar = new androidx.compose.runtime.internal.h(set);
        o0 o0Var = lVar.i;
        if (o0Var == null) {
            long[] jArr = w0.a;
            o0Var = new o0();
            lVar.i = o0Var;
        }
        o0Var.m(q1Var, hVar);
        lVar.e.b(new a2(hVar, -1));
    }
}
