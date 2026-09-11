package androidx.compose.ui.layout;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f1 extends androidx.compose.ui.node.c0 {
    public static final f1 b = new f1("Undefined intrinsics block and it is required");

    @Override // androidx.compose.ui.layout.q0
    public final r0 a(s0 s0Var, List list, long j) {
        int size = list.size();
        kotlin.collections.v vVar = kotlin.collections.v.e;
        if (size == 0) {
            return s0Var.q(androidx.compose.ui.unit.a.j(j), androidx.compose.ui.unit.a.i(j), vVar, d1.A);
        }
        if (size == 1) {
            c1 c1VarF = ((p0) list.get(0)).F(j);
            return s0Var.q(androidx.compose.ui.unit.b.g(c1VarF.e, j), androidx.compose.ui.unit.b.f(c1VarF.y, j), vVar, new androidx.compose.animation.e0(c1VarF, 4));
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i = 0; i < size2; i++) {
            c1 c1VarF2 = ((p0) list.get(i)).F(j);
            iMax = Math.max(c1VarF2.e, iMax);
            iMax2 = Math.max(c1VarF2.y, iMax2);
            arrayList.add(c1VarF2);
        }
        return s0Var.q(androidx.compose.ui.unit.b.g(iMax, j), androidx.compose.ui.unit.b.f(iMax2, j), vVar, new androidx.compose.animation.w(1, arrayList));
    }
}
