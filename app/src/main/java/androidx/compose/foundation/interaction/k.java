package androidx.compose.foundation.interaction;

import kotlin.y;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k {
    public final MutableSharedFlow a = SharedFlowKt.MutableSharedFlow$default(0, 16, BufferOverflow.DROP_OLDEST, 1, null);

    public final Object a(j jVar, kotlin.coroutines.d dVar) {
        Object objEmit = this.a.emit(jVar, dVar);
        return objEmit == kotlin.coroutines.intrinsics.a.e ? objEmit : y.a;
    }

    public final void b(j jVar) {
        this.a.tryEmit(jVar);
    }
}
