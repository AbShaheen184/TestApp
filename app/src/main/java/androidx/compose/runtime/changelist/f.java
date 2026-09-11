package androidx.compose.runtime.changelist;

import androidx.compose.animation.core.u2;
import androidx.compose.runtime.i2;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends j0 {
    public static final f c = new f(0, 2, 1);

    @Override // androidx.compose.runtime.changelist.j0
    public final void a(androidx.compose.foundation.text.selection.w wVar, androidx.compose.runtime.c cVar, i2 i2Var, androidx.compose.runtime.internal.l lVar, k0 k0Var) {
        androidx.compose.runtime.internal.g gVar = (androidx.compose.runtime.internal.g) wVar.e(1);
        int i = gVar != null ? gVar.a : 0;
        a aVar = (a) wVar.e(0);
        if (i > 0) {
            cVar = new u2(cVar, i);
        }
        aVar.F(cVar, i2Var, lVar, k0Var != null ? new androidx.compose.foundation.text.input.internal.o(12, k0Var, i2Var) : null);
    }
}
