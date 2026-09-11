package androidx.compose.runtime.changelist;

import androidx.compose.runtime.a2;
import androidx.compose.runtime.i2;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends j0 {
    public static final e c = new e(0, 2, 1);

    @Override // androidx.compose.runtime.changelist.j0
    public final void a(androidx.compose.foundation.text.selection.w wVar, androidx.compose.runtime.c cVar, i2 i2Var, androidx.compose.runtime.internal.l lVar, k0 k0Var) {
        androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) wVar.e(0);
        Object objE = wVar.e(1);
        if (objE instanceof a2) {
            a2 a2Var = (a2) objE;
            lVar.e.b(a2Var);
            lVar.d.a(a2Var);
        }
        if (i2Var.n != 0) {
            androidx.compose.runtime.t.a("Can only append a slot if not current inserting");
        }
        int i = i2Var.i;
        int i2 = i2Var.j;
        int iC = i2Var.c(aVar);
        int iG = i2Var.g(i2Var.r(iC + 1), i2Var.b);
        i2Var.i = iG;
        i2Var.j = iG;
        i2Var.x(1, iC);
        if (i >= iG) {
            i++;
            i2++;
        }
        i2Var.c[iG] = objE;
        i2Var.i = i;
        i2Var.j = i2;
    }
}
