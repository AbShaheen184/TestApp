package androidx.compose.material3;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class s1 extends androidx.compose.ui.q implements androidx.compose.ui.node.h, androidx.compose.ui.node.v {
    public LinkedHashMap L;

    @Override // androidx.compose.ui.node.v
    public final androidx.compose.ui.layout.r0 c(androidx.compose.ui.layout.s0 s0Var, androidx.compose.ui.layout.p0 p0Var, long j) {
        float f = ((androidx.compose.ui.unit.f) androidx.compose.ui.node.k.h(this, i1.c)).e;
        float f2 = 0;
        if (f < f2) {
            f = f2;
        }
        androidx.compose.ui.layout.c1 c1VarF = p0Var.F(j);
        boolean z = this.K && !Float.isNaN(f) && androidx.compose.ui.unit.f.a(f, f2) > 0;
        int iG0 = !Float.isNaN(f) ? s0Var.g0(f) : 0;
        int iMax = c1VarF.e;
        if (z) {
            iMax = Math.max(iMax, iG0);
        }
        int iMax2 = c1VarF.y;
        if (z) {
            iMax2 = Math.max(iMax2, iG0);
        }
        if (z) {
            LinkedHashMap linkedHashMap = this.L;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap(2);
                this.L = linkedHashMap;
            }
            androidx.compose.ui.layout.n1 n1Var = i1.b;
            int iRound = Math.round((iG0 - c1VarF.e) / 2.0f);
            if (iRound < 0) {
                iRound = 0;
            }
            linkedHashMap.put(n1Var, Integer.valueOf(iRound));
            androidx.compose.ui.layout.n nVar = i1.a;
            int iRound2 = Math.round((iG0 - c1VarF.y) / 2.0f);
            linkedHashMap.put(nVar, Integer.valueOf(iRound2 >= 0 ? iRound2 : 0));
        }
        Map map = this.L;
        if (map == null) {
            map = kotlin.collections.v.e;
        }
        return s0Var.q(iMax, iMax2, map, new androidx.compose.foundation.layout.n0(iMax, iMax2, c1VarF));
    }
}
