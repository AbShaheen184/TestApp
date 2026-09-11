package kotlinx.coroutines.flow.internal;

import java.util.ArrayList;
import kotlin.a;
import kotlin.collections.o;
import kotlin.coroutines.d;
import kotlin.coroutines.i;
import kotlin.coroutines.j;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.functions.p;
import kotlin.jvm.internal.l;
import kotlin.y;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.DebugStringsKt;
import kotlinx.coroutines.InternalCoroutinesApi;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import net.luminis.tls.engine.impl.c;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
@InternalCoroutinesApi
public abstract class ChannelFlow<T> implements FusibleFlow<T> {
    public final int capacity;
    public final i context;
    public final BufferOverflow onBufferOverflow;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.ChannelFlow$collect$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @e(c = "kotlinx.coroutines.flow.internal.ChannelFlow$collect$2", f = "ChannelFlow.kt", l = {Token.INC}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends kotlin.coroutines.jvm.internal.i implements p {
        final /* synthetic */ FlowCollector<T> $collector;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ChannelFlow<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(FlowCollector<? super T> flowCollector, ChannelFlow<T> channelFlow, d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.$collector = flowCollector;
            this.this$0 = channelFlow;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<y> create(Object obj, d<?> dVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$collector, this.this$0, dVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super y> dVar) {
            return ((AnonymousClass2) create(coroutineScope, dVar)).invokeSuspend(y.a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                a.e(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                FlowCollector<T> flowCollector = this.$collector;
                ReceiveChannel<T> receiveChannelProduceImpl = this.this$0.produceImpl(coroutineScope);
                this.label = 1;
                Object objEmitAll = FlowKt.emitAll(flowCollector, receiveChannelProduceImpl, this);
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                if (objEmitAll == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                a.e(obj);
            }
            return y.a;
        }
    }

    public ChannelFlow(i iVar, int i, BufferOverflow bufferOverflow) {
        this.context = iVar;
        this.capacity = i;
        this.onBufferOverflow = bufferOverflow;
    }

    public static <T> Object collect$suspendImpl(ChannelFlow<T> channelFlow, FlowCollector<? super T> flowCollector, d<? super y> dVar) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new AnonymousClass2(flowCollector, channelFlow, null), dVar);
        return objCoroutineScope == kotlin.coroutines.intrinsics.a.e ? objCoroutineScope : y.a;
    }

    public String additionalToStringProps() {
        return null;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector<? super T> flowCollector, d<? super y> dVar) {
        return collect$suspendImpl(this, flowCollector, dVar);
    }

    public abstract Object collectTo(ProducerScope<? super T> producerScope, d<? super y> dVar);

    public abstract ChannelFlow<T> create(i iVar, int i, BufferOverflow bufferOverflow);

    public Flow<T> dropChannelOperators() {
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0013  */
    @Override // kotlinx.coroutines.flow.internal.FusibleFlow
    public Flow<T> fuse(i iVar, int i, BufferOverflow bufferOverflow) {
        i iVarPlus = iVar.plus(this.context);
        if (bufferOverflow == BufferOverflow.SUSPEND) {
            int i2 = this.capacity;
            if (i2 != -3) {
                if (i == -3) {
                    i = i2;
                } else if (i2 != -2) {
                    if (i == -2) {
                        i = i2;
                    } else {
                        i += i2;
                        if (i < 0) {
                            i = Integer.MAX_VALUE;
                        }
                    }
                }
            }
            bufferOverflow = this.onBufferOverflow;
        }
        return (l.a(iVarPlus, this.context) && i == this.capacity && bufferOverflow == this.onBufferOverflow) ? this : create(iVarPlus, i, bufferOverflow);
    }

    public final p getCollectToFun$kotlinx_coroutines_core() {
        return new ChannelFlow$collectToFun$1(this, null);
    }

    public final int getProduceCapacity$kotlinx_coroutines_core() {
        int i = this.capacity;
        if (i == -3) {
            return -2;
        }
        return i;
    }

    public ReceiveChannel<T> produceImpl(CoroutineScope coroutineScope) {
        return ProduceKt.produce$default(coroutineScope, this.context, getProduceCapacity$kotlinx_coroutines_core(), this.onBufferOverflow, CoroutineStart.ATOMIC, null, getCollectToFun$kotlinx_coroutines_core(), 16, null);
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String strAdditionalToStringProps = additionalToStringProps();
        if (strAdditionalToStringProps != null) {
            arrayList.add(strAdditionalToStringProps);
        }
        if (this.context != j.e) {
            arrayList.add("context=" + this.context);
        }
        if (this.capacity != -3) {
            arrayList.add("capacity=" + this.capacity);
        }
        if (this.onBufferOverflow != BufferOverflow.SUSPEND) {
            arrayList.add("onBufferOverflow=" + this.onBufferOverflow);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(DebugStringsKt.getClassSimpleName(this));
        sb.append('[');
        return androidx.privacysandbox.ads.adservices.java.internal.a.t(sb, o.R(arrayList, ", ", null, null, null, 62), ']');
    }
}
