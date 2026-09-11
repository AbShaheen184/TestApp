package kotlinx.coroutines.flow;

import kotlin.coroutines.i;
import kotlin.coroutines.j;
import kotlin.jvm.functions.p;
import kotlin.jvm.internal.f;
import kotlin.y;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.internal.ChannelFlow;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
class ChannelFlowBuilder<T> extends ChannelFlow<T> {
    private final p block;

    public /* synthetic */ ChannelFlowBuilder(p pVar, i iVar, int i, BufferOverflow bufferOverflow, int i2, f fVar) {
        this(pVar, (i2 & 2) != 0 ? j.e : iVar, (i2 & 4) != 0 ? -2 : i, (i2 & 8) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    public static <T> Object collectTo$suspendImpl(ChannelFlowBuilder<T> channelFlowBuilder, ProducerScope<? super T> producerScope, kotlin.coroutines.d<? super y> dVar) {
        Object objInvoke = ((ChannelFlowBuilder) channelFlowBuilder).block.invoke(producerScope, dVar);
        return objInvoke == kotlin.coroutines.intrinsics.a.e ? objInvoke : y.a;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public Object collectTo(ProducerScope<? super T> producerScope, kotlin.coroutines.d<? super y> dVar) {
        return collectTo$suspendImpl(this, producerScope, dVar);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public ChannelFlow<T> create(i iVar, int i, BufferOverflow bufferOverflow) {
        return new ChannelFlowBuilder(this.block, iVar, i, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public String toString() {
        return "block[" + this.block + "] -> " + super.toString();
    }

    public ChannelFlowBuilder(p pVar, i iVar, int i, BufferOverflow bufferOverflow) {
        super(iVar, i, bufferOverflow);
        this.block = pVar;
    }
}
