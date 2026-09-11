package androidx.compose.foundation.layout;

import androidx.compose.runtime.t2;
import com.app.mlounge.ui.viewmodel.x1;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class u implements kotlin.jvm.functions.l {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ int e;
    public final /* synthetic */ int y;
    public final /* synthetic */ Object z;

    public /* synthetic */ u(Object obj, Object obj2, int i, Object obj3, Object obj4, int i2) {
        this.e = i2;
        this.z = obj;
        this.A = obj2;
        this.y = i;
        this.B = obj3;
        this.C = obj4;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.List] */
    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        switch (this.e) {
            case 0:
                androidx.compose.ui.layout.c1[] c1VarArr = (androidx.compose.ui.layout.c1[]) this.z;
                v vVar = (v) this.A;
                androidx.compose.ui.layout.s0 s0Var = (androidx.compose.ui.layout.s0) this.B;
                int[] iArr = (int[]) this.C;
                androidx.compose.ui.layout.b1 b1Var = (androidx.compose.ui.layout.b1) obj;
                int length = c1VarArr.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    androidx.compose.ui.layout.c1 c1Var = c1VarArr[i];
                    int i3 = i2 + 1;
                    c1Var.getClass();
                    Object objK = c1Var.K();
                    q0 q0Var = objK instanceof q0 ? (q0) objK : null;
                    androidx.compose.ui.unit.m layoutDirection = s0Var.getLayoutDirection();
                    b bVar = q0Var != null ? q0Var.c : null;
                    int i4 = this.y;
                    androidx.compose.ui.layout.b1.i(b1Var, c1Var, bVar != null ? bVar.f(i4, c1Var.e, layoutDirection) : vVar.b.a(c1Var.e, i4, layoutDirection), iArr[i2]);
                    i++;
                    i2 = i3;
                }
                break;
            default:
                x1 x1Var = (x1) this.A;
                androidx.compose.ui.focus.y yVar = (androidx.compose.ui.focus.y) this.B;
                t2 t2Var = (t2) this.C;
                androidx.compose.foundation.lazy.k kVar = (androidx.compose.foundation.lazy.k) obj;
                kVar.getClass();
                com.app.mlounge.ui.screens.search.a aVar = new com.app.mlounge.ui.screens.search.a(27);
                ?? r2 = this.z;
                kVar.q(r2.size(), new androidx.compose.foundation.text.c0(29, aVar, r2), new androidx.compose.foundation.text.z0(r2, 4), new androidx.compose.runtime.internal.f(2039820996, true, new com.app.mlounge.ui.screens.tvshows.q(r2, x1Var, this.y, yVar, t2Var)));
                break;
        }
        return kotlin.y.a;
    }
}
