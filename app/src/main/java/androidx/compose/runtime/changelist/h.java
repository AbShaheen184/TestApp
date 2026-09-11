package androidx.compose.runtime.changelist;

import androidx.compose.runtime.i2;
import androidx.compose.runtime.x0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends j0 {
    public static final h c = new h(0, 4, 1);

    @Override // androidx.compose.runtime.changelist.j0
    public final void a(androidx.compose.foundation.text.selection.w wVar, androidx.compose.runtime.c cVar, i2 i2Var, androidx.compose.runtime.internal.l lVar, k0 k0Var) {
        x0 x0Var = (x0) wVar.e(2);
        androidx.compose.runtime.v vVar = (androidx.compose.runtime.v) wVar.e(1);
        vVar.m(x0Var);
        androidx.compose.runtime.t.b("Could not resolve state for movable content");
        throw new androidx.compose.ui.res.e(10);
    }
}
