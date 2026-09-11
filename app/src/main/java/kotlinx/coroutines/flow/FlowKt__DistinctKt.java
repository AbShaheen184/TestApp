package kotlinx.coroutines.flow;

import kotlin.jvm.functions.l;
import kotlin.jvm.functions.p;
import kotlin.jvm.internal.c0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class FlowKt__DistinctKt {
    private static final l defaultKeySelector = new c(0);
    private static final p defaultAreEquivalent = new d();

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> Flow<T> distinctUntilChanged(Flow<? extends T> flow) {
        return flow instanceof StateFlow ? flow : distinctUntilChangedBy$FlowKt__DistinctKt(flow, defaultKeySelector, defaultAreEquivalent);
    }

    public static final <T, K> Flow<T> distinctUntilChangedBy(Flow<? extends T> flow, l lVar) {
        return distinctUntilChangedBy$FlowKt__DistinctKt(flow, lVar, defaultAreEquivalent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> Flow<T> distinctUntilChangedBy$FlowKt__DistinctKt(Flow<? extends T> flow, l lVar, p pVar) {
        if (flow instanceof DistinctFlowImpl) {
            DistinctFlowImpl distinctFlowImpl = (DistinctFlowImpl) flow;
            if (distinctFlowImpl.keySelector == lVar && distinctFlowImpl.areEquivalent == pVar) {
                return flow;
            }
        }
        return new DistinctFlowImpl(flow, lVar, pVar);
    }

    public static final <T> Flow<T> distinctUntilChanged(Flow<? extends T> flow, p pVar) {
        l lVar = defaultKeySelector;
        pVar.getClass();
        c0.c(2, pVar);
        return distinctUntilChangedBy$FlowKt__DistinctKt(flow, lVar, pVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object defaultKeySelector$lambda$0$FlowKt__DistinctKt(Object obj) {
        return obj;
    }
}
