package androidx.compose.foundation.text.selection;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 implements androidx.compose.ui.layout.q0 {
    public static final p0 a = new p0();

    @Override // androidx.compose.ui.layout.q0
    public final androidx.compose.ui.layout.r0 a(androidx.compose.ui.layout.s0 s0Var, List list, long j) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i = 0; i < size; i++) {
            androidx.compose.ui.layout.c1 c1VarF = ((androidx.compose.ui.layout.p0) list.get(i)).F(j);
            iMax = Math.max(iMax, c1VarF.e);
            iMax2 = Math.max(iMax2, c1VarF.y);
            arrayList.add(c1VarF);
        }
        return s0Var.q(iMax, iMax2, kotlin.collections.v.e, new o0(0, arrayList));
    }
}
