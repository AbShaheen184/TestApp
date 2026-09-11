package kotlinx.coroutines.flow;

import kotlin.jvm.internal.x;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class FlowKt__LimitKt$take$2$1<T> implements FlowCollector {
    final /* synthetic */ x $consumed;
    final /* synthetic */ int $count;
    final /* synthetic */ Object $ownershipMarker;
    final /* synthetic */ FlowCollector<T> $this_flow;

    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__LimitKt$take$2$1(x xVar, int i, FlowCollector<? super T> flowCollector, Object obj) {
        this.$consumed = xVar;
        this.$count = i;
        this.$this_flow = flowCollector;
        this.$ownershipMarker = obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(T t, kotlin.coroutines.d<? super y> dVar) {
        FlowKt__LimitKt$take$2$1$emit$1 flowKt__LimitKt$take$2$1$emit$1;
        if (dVar instanceof FlowKt__LimitKt$take$2$1$emit$1) {
            flowKt__LimitKt$take$2$1$emit$1 = (FlowKt__LimitKt$take$2$1$emit$1) dVar;
            int i = flowKt__LimitKt$take$2$1$emit$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                flowKt__LimitKt$take$2$1$emit$1.label = i - Integer.MIN_VALUE;
            } else {
                flowKt__LimitKt$take$2$1$emit$1 = new FlowKt__LimitKt$take$2$1$emit$1(this, dVar);
            }
        } else {
            flowKt__LimitKt$take$2$1$emit$1 = new FlowKt__LimitKt$take$2$1$emit$1(this, dVar);
        }
        Object obj = flowKt__LimitKt$take$2$1$emit$1.result;
        int i2 = flowKt__LimitKt$take$2$1$emit$1.label;
        y yVar = y.a;
        if (i2 != 0) {
            if (i2 == 1) {
                kotlin.a.e(obj);
                return yVar;
            }
            if (i2 == 2) {
                kotlin.a.e(obj);
                return yVar;
            }
            net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.a.e(obj);
        x xVar = this.$consumed;
        int i3 = xVar.e + 1;
        xVar.e = i3;
        int i4 = this.$count;
        FlowCollector<T> flowCollector = this.$this_flow;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        if (i3 < i4) {
            flowKt__LimitKt$take$2$1$emit$1.label = 1;
            if (flowCollector.emit(t, flowKt__LimitKt$take$2$1$emit$1) != aVar) {
                return yVar;
            }
        } else {
            Object obj2 = this.$ownershipMarker;
            flowKt__LimitKt$take$2$1$emit$1.label = 2;
            if (FlowKt__LimitKt.emitAbort$FlowKt__LimitKt(flowCollector, t, obj2, flowKt__LimitKt$take$2$1$emit$1) != aVar) {
                return yVar;
            }
        }
        return aVar;
    }
}
