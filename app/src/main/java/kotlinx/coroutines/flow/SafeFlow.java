package kotlinx.coroutines.flow;

import kotlin.jvm.functions.p;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
final class SafeFlow<T> extends AbstractFlow<T> {
    private final p block;

    public SafeFlow(p pVar) {
        this.block = pVar;
    }

    @Override // kotlinx.coroutines.flow.AbstractFlow
    public Object collectSafely(FlowCollector<? super T> flowCollector, kotlin.coroutines.d<? super y> dVar) {
        Object objInvoke = this.block.invoke(flowCollector, dVar);
        return objInvoke == kotlin.coroutines.intrinsics.a.e ? objInvoke : y.a;
    }
}
