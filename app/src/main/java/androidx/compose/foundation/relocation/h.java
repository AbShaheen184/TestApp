package androidx.compose.foundation.relocation;

import androidx.compose.foundation.gestures.j;
import androidx.compose.ui.layout.x;
import androidx.compose.ui.node.d1;
import androidx.compose.ui.node.k;
import androidx.compose.ui.node.u;
import androidx.compose.ui.q;
import kotlin.y;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends q implements androidx.compose.ui.relocation.a, u {
    public j L;
    public boolean M;

    public static final androidx.compose.ui.geometry.c L0(h hVar, d1 d1Var, androidx.compose.ui.draw.b bVar) {
        androidx.compose.ui.geometry.c cVar;
        if (hVar.K && hVar.M) {
            d1 d1VarS = k.s(hVar);
            if (!d1Var.T0().K) {
                d1Var = null;
            }
            if (d1Var != null && (cVar = (androidx.compose.ui.geometry.c) bVar.invoke()) != null) {
                return cVar.i(d1VarS.s(d1Var, false).d());
            }
        }
        return null;
    }

    @Override // androidx.compose.ui.q
    public final boolean A0() {
        return false;
    }

    @Override // androidx.compose.ui.relocation.a
    public final Object H(d1 d1Var, androidx.compose.ui.draw.b bVar, kotlin.coroutines.jvm.internal.c cVar) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new g(this, d1Var, bVar, new androidx.compose.foundation.gestures.g(2, this, d1Var, bVar), null, 0), cVar);
        return objCoroutineScope == kotlin.coroutines.intrinsics.a.e ? objCoroutineScope : y.a;
    }

    @Override // androidx.compose.ui.node.u
    public final void s(x xVar) {
        this.M = true;
    }
}
