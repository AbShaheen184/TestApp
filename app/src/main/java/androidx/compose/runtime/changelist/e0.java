package androidx.compose.runtime.changelist;

import androidx.compose.runtime.a2;
import androidx.compose.runtime.i2;
import androidx.compose.runtime.q1;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e0 extends j0 {
    public static final e0 c = new e0(1, 0, 2);

    @Override // androidx.compose.runtime.changelist.j0
    public final void a(androidx.compose.foundation.text.selection.w wVar, androidx.compose.runtime.c cVar, i2 i2Var, androidx.compose.runtime.internal.l lVar, k0 k0Var) {
        int iD = wVar.d(0);
        int i = i2Var.v;
        int iN = i2Var.N(i2Var.r(i), i2Var.b);
        int iG = i2Var.g(i2Var.r(i + 1), i2Var.b);
        for (int iMax = Math.max(iN, iG - iD); iMax < iG; iMax++) {
            Object obj = i2Var.c[i2Var.h(iMax)];
            if (obj instanceof a2) {
                lVar.e((a2) obj);
            } else if (obj instanceof q1) {
                ((q1) obj).c();
            }
        }
        if (iD <= 0) {
            androidx.compose.runtime.t.a("Check failed");
        }
        int i2 = i2Var.v;
        int iN2 = i2Var.N(i2Var.r(i2), i2Var.b);
        int iG2 = i2Var.g(i2Var.r(i2 + 1), i2Var.b) - iD;
        if (iG2 < iN2) {
            androidx.compose.runtime.t.a("Check failed");
        }
        i2Var.J(iG2, iD, i2);
        int i3 = i2Var.i;
        if (i3 >= iN2) {
            i2Var.i = i3 - iD;
        }
    }
}
