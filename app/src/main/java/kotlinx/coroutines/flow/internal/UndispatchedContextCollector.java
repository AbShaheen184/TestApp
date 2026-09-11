package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.d;
import kotlin.coroutines.i;
import kotlin.coroutines.intrinsics.a;
import kotlin.jvm.functions.p;
import kotlin.y;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.internal.ThreadContextKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
final class UndispatchedContextCollector<T> implements FlowCollector<T> {
    private final Object countOrElement;
    private final i emitContext;
    private final p emitRef;

    public UndispatchedContextCollector(FlowCollector<? super T> flowCollector, i iVar) {
        this.emitContext = iVar;
        this.countOrElement = ThreadContextKt.threadContextElements(iVar);
        this.emitRef = new UndispatchedContextCollector$emitRef$1(flowCollector, null);
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public Object emit(T t, d<? super y> dVar) {
        Object objWithContextUndispatched = ChannelFlowKt.withContextUndispatched(this.emitContext, t, this.countOrElement, this.emitRef, dVar);
        return objWithContextUndispatched == a.e ? objWithContextUndispatched : y.a;
    }
}
