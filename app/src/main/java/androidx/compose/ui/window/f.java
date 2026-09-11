package androidx.compose.ui.window;

import androidx.compose.ui.layout.c1;
import androidx.compose.ui.layout.p0;
import androidx.compose.ui.layout.q0;
import androidx.compose.ui.layout.r0;
import androidx.compose.ui.layout.s0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements q0 {
    public static final f b = new f(0);
    public static final f c = new f(1);
    public final /* synthetic */ int a;

    public /* synthetic */ f(int i) {
        this.a = i;
    }

    @Override // androidx.compose.ui.layout.q0
    public final r0 a(s0 s0Var, List list, long j) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                int iJ = 0;
                int i = 0;
                for (int i2 = 0; i2 < size; i2++) {
                    c1 c1VarF = ((p0) list.get(i2)).F(j);
                    iJ = Math.max(iJ, c1VarF.e);
                    i = Math.max(i, c1VarF.y);
                    arrayList.add(c1VarF);
                }
                if (list.isEmpty()) {
                    iJ = androidx.compose.ui.unit.a.j(j);
                    i = androidx.compose.ui.unit.a.i(j);
                }
                return s0Var.q(iJ, i, kotlin.collections.v.e, new androidx.compose.animation.w(2, arrayList));
            default:
                int size2 = list.size();
                kotlin.collections.v vVar = kotlin.collections.v.e;
                if (size2 == 0) {
                    return s0Var.q(0, 0, vVar, d.D);
                }
                if (size2 == 1) {
                    c1 c1VarF2 = ((p0) list.get(0)).F(j);
                    return s0Var.q(c1VarF2.e, c1VarF2.y, vVar, new androidx.compose.animation.e0(c1VarF2, 6));
                }
                ArrayList arrayList2 = new ArrayList(list.size());
                int size3 = list.size();
                int iMax = 0;
                int iMax2 = 0;
                for (int i3 = 0; i3 < size3; i3++) {
                    c1 c1VarF3 = ((p0) list.get(i3)).F(j);
                    iMax = Math.max(iMax, c1VarF3.e);
                    iMax2 = Math.max(iMax2, c1VarF3.y);
                    arrayList2.add(c1VarF3);
                }
                return s0Var.q(iMax, iMax2, vVar, new androidx.compose.animation.w(3, arrayList2));
        }
    }
}
