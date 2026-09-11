package androidx.compose.runtime.changelist;

import androidx.compose.runtime.f2;
import androidx.compose.runtime.i2;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class t extends j0 {
    public static final t c = new t(0, 3, 1);

    @Override // androidx.compose.runtime.changelist.j0
    public final void a(androidx.compose.foundation.text.selection.w wVar, androidx.compose.runtime.c cVar, i2 i2Var, androidx.compose.runtime.internal.l lVar, k0 k0Var) {
        androidx.compose.foundation.text.input.internal.o oVar;
        f2 f2Var = (f2) wVar.e(1);
        androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) wVar.e(0);
        c cVar2 = (c) wVar.e(2);
        i2 i2VarE = f2Var.e();
        if (k0Var != null) {
            try {
                oVar = new androidx.compose.foundation.text.input.internal.o(12, k0Var, i2Var);
            } catch (Throwable th) {
                i2VarE.e(false);
                throw th;
            }
        } else {
            oVar = null;
        }
        if (!cVar2.m.H()) {
            androidx.compose.runtime.t.a("FixupList has pending fixup operations that were not realized. Were there mismatched insertNode() and endNodeInsert() calls?");
        }
        cVar2.l.G(cVar, i2VarE, lVar, oVar);
        i2VarE.e(true);
        i2Var.d();
        aVar.getClass();
        i2Var.A(f2Var, f2Var.b(aVar));
        i2Var.k();
    }
}
