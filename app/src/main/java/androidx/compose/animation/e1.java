package androidx.compose.animation;

import androidx.compose.animation.core.k1;
import androidx.compose.animation.core.l2;
import androidx.compose.runtime.t2;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class e1 {
    static {
        androidx.compose.animation.core.e.m(0.0f, 0.0f, null, 7);
    }

    public static final t2 a(long j, k1 k1Var, androidx.compose.runtime.r rVar) {
        boolean zF = rVar.f(androidx.compose.ui.graphics.t.f(j));
        Object objQ = rVar.Q();
        if (zF || objQ == androidx.compose.runtime.m.a) {
            l2 l2Var = new l2(c0.A, new e(androidx.compose.ui.graphics.t.f(j), 1));
            rVar.l0(l2Var);
            objQ = l2Var;
        }
        return androidx.compose.animation.core.h.b(new androidx.compose.ui.graphics.t(j), (l2) objQ, k1Var, null, "ColorAnimation", rVar, 0, 8);
    }
}
