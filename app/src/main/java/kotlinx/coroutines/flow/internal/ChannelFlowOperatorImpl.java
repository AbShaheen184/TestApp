package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.d;
import kotlin.coroutines.i;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.j;
import kotlin.jvm.internal.f;
import kotlin.y;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class ChannelFlowOperatorImpl<T> extends ChannelFlowOperator<T, T> {
    public /* synthetic */ ChannelFlowOperatorImpl(Flow flow, i iVar, int i, BufferOverflow bufferOverflow, int i2, f fVar) {
        this(flow, (i2 & 2) != 0 ? j.e : iVar, (i2 & 4) != 0 ? -3 : i, (i2 & 8) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public ChannelFlow<T> create(i iVar, int i, BufferOverflow bufferOverflow) {
        return new ChannelFlowOperatorImpl(this.flow, iVar, i, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public Flow<T> dropChannelOperators() {
        return (Flow<T>) this.flow;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // kotlinx.coroutines.flow.internal.ChannelFlowOperator
    public Object flowCollect(FlowCollector<? super T> flowCollector, d<? super y> dVar) {
        Object objCollect = this.flow.collect((FlowCollector<? super S>) flowCollector, dVar);
        return objCollect == a.e ? objCollect : y.a;
    }

    public ChannelFlowOperatorImpl(Flow<? extends T> flow, i iVar, int i, BufferOverflow bufferOverflow) {
        super(flow, iVar, i, bufferOverflow);
    }
}
