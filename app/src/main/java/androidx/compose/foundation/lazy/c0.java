package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.k1;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c0 {
    public static final t a = new t(null, 0, false, 0.0f, new b0(), 0.0f, false, CoroutineScopeKt.CoroutineScope(kotlin.coroutines.j.e), _COROUTINE.a.b(), androidx.compose.ui.unit.b.b(0, 0, 15), kotlin.collections.u.e, 0, 0, 0, k1.e, 0, 0);

    public static final z a(int i, int i2, androidx.compose.runtime.r rVar, int i3) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        Object[] objArr = new Object[0];
        androidx.compose.foundation.text.input.internal.o oVar = z.x;
        boolean zD = rVar.d(i) | rVar.d(i2);
        Object objQ = rVar.Q();
        if (zD || objQ == androidx.compose.runtime.m.a) {
            objQ = new a0(i, i2, 0);
            rVar.l0(objQ);
        }
        return (z) androidx.compose.runtime.saveable.n.c(objArr, oVar, (kotlin.jvm.functions.a) objQ, rVar, 0);
    }
}
