package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.k1;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class z {
    public static final n a = new n(null, 0, false, 0.0f, new y(), 0.0f, false, CoroutineScopeKt.CoroutineScope(kotlin.coroutines.j.e), _COROUTINE.a.b(), 0, new androidx.compose.foundation.lazy.i(4), new androidx.compose.foundation.lazy.i(5), kotlin.collections.u.e, 0, 0, 0, k1.e, 0, 0);

    public static final x a(int i, int i2, androidx.compose.runtime.r rVar, int i3) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        Object[] objArr = new Object[0];
        androidx.compose.foundation.text.input.internal.o oVar = x.w;
        boolean zD = rVar.d(i) | rVar.d(i2);
        Object objQ = rVar.Q();
        if (zD || objQ == androidx.compose.runtime.m.a) {
            objQ = new androidx.compose.foundation.lazy.a0(i, i2, 1);
            rVar.l0(objQ);
        }
        return (x) androidx.compose.runtime.saveable.n.c(objArr, oVar, (kotlin.jvm.functions.a) objQ, rVar, 0);
    }
}
