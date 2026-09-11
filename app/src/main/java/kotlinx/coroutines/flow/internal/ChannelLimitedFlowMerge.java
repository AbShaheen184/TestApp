package kotlinx.coroutines.flow.internal;

import java.util.Iterator;
import kotlin.coroutines.d;
import kotlin.coroutines.i;
import kotlin.coroutines.j;
import kotlin.jvm.internal.f;
import kotlin.y;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class ChannelLimitedFlowMerge<T> extends ChannelFlow<T> {
    private final Iterable<Flow<T>> flows;

    public /* synthetic */ ChannelLimitedFlowMerge(Iterable iterable, i iVar, int i, BufferOverflow bufferOverflow, int i2, f fVar) {
        this(iterable, (i2 & 2) != 0 ? j.e : iVar, (i2 & 4) != 0 ? -2 : i, (i2 & 8) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public Object collectTo(ProducerScope<? super T> producerScope, d<? super y> dVar) {
        SendingCollector sendingCollector = new SendingCollector(producerScope);
        Iterator<Flow<T>> it = this.flows.iterator();
        while (it.hasNext()) {
            BuildersKt__Builders_commonKt.launch$default(producerScope, null, null, new ChannelLimitedFlowMerge$collectTo$2$1(it.next(), sendingCollector, null), 3, null);
        }
        return y.a;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public ChannelFlow<T> create(i iVar, int i, BufferOverflow bufferOverflow) {
        return new ChannelLimitedFlowMerge(this.flows, iVar, i, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public ReceiveChannel<T> produceImpl(CoroutineScope coroutineScope) {
        return ProduceKt.produce(coroutineScope, this.context, this.capacity, getCollectToFun$kotlinx_coroutines_core());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChannelLimitedFlowMerge(Iterable<? extends Flow<? extends T>> iterable, i iVar, int i, BufferOverflow bufferOverflow) {
        super(iVar, i, bufferOverflow);
        this.flows = iterable;
    }
}
