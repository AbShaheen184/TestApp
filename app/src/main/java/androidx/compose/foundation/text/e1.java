package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.h2;
import androidx.compose.foundation.gestures.o1;
import androidx.compose.foundation.gestures.x2;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e1 implements PointerInputEventHandler {
    public final /* synthetic */ CoroutineScope a;
    public final /* synthetic */ androidx.compose.runtime.y0 b;
    public final /* synthetic */ androidx.compose.foundation.interaction.k c;
    public final /* synthetic */ androidx.compose.runtime.y0 d;

    public e1(CoroutineScope coroutineScope, androidx.compose.runtime.y0 y0Var, androidx.compose.foundation.interaction.k kVar, androidx.compose.runtime.y0 y0Var2) {
        this.a = coroutineScope;
        this.b = y0Var;
        this.c = kVar;
        this.d = y0Var2;
    }

    @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
    public final Object invoke(androidx.compose.ui.input.pointer.y yVar, kotlin.coroutines.d dVar) {
        d1 d1Var = new d1(this.a, this.b, this.c, null);
        h2 h2Var = new h2(this.d, 1);
        androidx.compose.foundation.gestures.l0 l0Var = x2.a;
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new androidx.compose.animation.core.z0(yVar, d1Var, h2Var, new o1(yVar), null), dVar);
        kotlin.y yVar2 = kotlin.y.a;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        if (objCoroutineScope != aVar) {
            objCoroutineScope = yVar2;
        }
        return objCoroutineScope == aVar ? objCoroutineScope : yVar2;
    }
}
