package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.d;
import kotlin.coroutines.i;
import kotlin.coroutines.intrinsics.a;
import kotlin.coroutines.j;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.functions.p;
import kotlin.jvm.internal.f;
import kotlin.y;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.sync.Semaphore;
import kotlinx.coroutines.sync.SemaphoreKt;
import net.luminis.tls.engine.impl.c;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class ChannelFlowMerge<T> extends ChannelFlow<T> {
    private final int concurrency;
    private final Flow<Flow<T>> flow;

    public /* synthetic */ ChannelFlowMerge(Flow flow, int i, i iVar, int i2, BufferOverflow bufferOverflow, int i3, f fVar) {
        this(flow, i, (i3 & 4) != 0 ? j.e : iVar, (i3 & 8) != 0 ? -2 : i2, (i3 & 16) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public String additionalToStringProps() {
        return "concurrency=" + this.concurrency;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public Object collectTo(ProducerScope<? super T> producerScope, d<? super y> dVar) {
        Object objCollect = this.flow.collect(new AnonymousClass2((Job) dVar.getContext().get(Job.Key), SemaphoreKt.Semaphore$default(this.concurrency, 0, 2, null), producerScope, new SendingCollector(producerScope)), dVar);
        return objCollect == a.e ? objCollect : y.a;
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public ChannelFlow<T> create(i iVar, int i, BufferOverflow bufferOverflow) {
        return new ChannelFlowMerge(this.flow, this.concurrency, iVar, i, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public ReceiveChannel<T> produceImpl(CoroutineScope coroutineScope) {
        return ProduceKt.produce(coroutineScope, this.context, this.capacity, getCollectToFun$kotlinx_coroutines_core());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ChannelFlowMerge(Flow<? extends Flow<? extends T>> flow, int i, i iVar, int i2, BufferOverflow bufferOverflow) {
        super(iVar, i2, bufferOverflow);
        this.flow = flow;
        this.concurrency = i;
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    public static final class AnonymousClass2<T> implements FlowCollector {
        final /* synthetic */ SendingCollector<T> $collector;
        final /* synthetic */ Job $job;
        final /* synthetic */ ProducerScope<T> $scope;
        final /* synthetic */ Semaphore $semaphore;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
        @e(c = "kotlinx.coroutines.flow.internal.ChannelFlowMerge$collectTo$2$1", f = "Merge.kt", l = {Token.ENUM_INIT_ARRAY}, m = "invokeSuspend")
        public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.i implements p {
            final /* synthetic */ SendingCollector<T> $collector;
            final /* synthetic */ Flow<T> $inner;
            final /* synthetic */ Semaphore $semaphore;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(Flow<? extends T> flow, SendingCollector<T> sendingCollector, Semaphore semaphore, d<? super AnonymousClass1> dVar) {
                super(2, dVar);
                this.$inner = flow;
                this.$collector = sendingCollector;
                this.$semaphore = semaphore;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d<y> create(Object obj, d<?> dVar) {
                return new AnonymousClass1(this.$inner, this.$collector, this.$semaphore, dVar);
            }

            @Override // kotlin.jvm.functions.p
            public final Object invoke(CoroutineScope coroutineScope, d<? super y> dVar) {
                return ((AnonymousClass1) create(coroutineScope, dVar)).invokeSuspend(y.a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                int i = this.label;
                try {
                    if (i == 0) {
                        kotlin.a.e(obj);
                        Flow<T> flow = this.$inner;
                        SendingCollector<T> sendingCollector = this.$collector;
                        this.label = 1;
                        Object objCollect = flow.collect(sendingCollector, this);
                        a aVar = a.e;
                        if (objCollect == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i != 1) {
                            c.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.a.e(obj);
                    }
                    this.$semaphore.release();
                    return y.a;
                } catch (Throwable th) {
                    this.$semaphore.release();
                    throw th;
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Job job, Semaphore semaphore, ProducerScope<? super T> producerScope, SendingCollector<T> sendingCollector) {
            this.$job = job;
            this.$semaphore = semaphore;
            this.$scope = producerScope;
            this.$collector = sendingCollector;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        public final Object emit(Flow<? extends T> flow, d<? super y> dVar) {
            ChannelFlowMerge$collectTo$2$emit$1 channelFlowMerge$collectTo$2$emit$1;
            AnonymousClass2<T> anonymousClass2;
            if (dVar instanceof ChannelFlowMerge$collectTo$2$emit$1) {
                channelFlowMerge$collectTo$2$emit$1 = (ChannelFlowMerge$collectTo$2$emit$1) dVar;
                int i = channelFlowMerge$collectTo$2$emit$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    channelFlowMerge$collectTo$2$emit$1.label = i - Integer.MIN_VALUE;
                } else {
                    channelFlowMerge$collectTo$2$emit$1 = new ChannelFlowMerge$collectTo$2$emit$1(this, dVar);
                }
            } else {
                channelFlowMerge$collectTo$2$emit$1 = new ChannelFlowMerge$collectTo$2$emit$1(this, dVar);
            }
            Object obj = channelFlowMerge$collectTo$2$emit$1.result;
            int i2 = channelFlowMerge$collectTo$2$emit$1.label;
            if (i2 == 0) {
                kotlin.a.e(obj);
                Job job = this.$job;
                if (job != null) {
                    JobKt.ensureActive(job);
                }
                Semaphore semaphore = this.$semaphore;
                channelFlowMerge$collectTo$2$emit$1.L$0 = this;
                channelFlowMerge$collectTo$2$emit$1.L$1 = flow;
                channelFlowMerge$collectTo$2$emit$1.label = 1;
                Object objAcquire = semaphore.acquire(channelFlowMerge$collectTo$2$emit$1);
                a aVar = a.e;
                if (objAcquire == aVar) {
                    return aVar;
                }
                anonymousClass2 = this;
            } else {
                if (i2 != 1) {
                    c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                flow = (Flow) channelFlowMerge$collectTo$2$emit$1.L$1;
                anonymousClass2 = (AnonymousClass2) channelFlowMerge$collectTo$2$emit$1.L$0;
                kotlin.a.e(obj);
            }
            BuildersKt__Builders_commonKt.launch$default(anonymousClass2.$scope, null, null, new AnonymousClass1(flow, anonymousClass2.$collector, anonymousClass2.$semaphore, null), 3, null);
            return y.a;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public /* bridge */ /* synthetic */ Object emit(Object obj, d dVar) {
            return emit((Flow) obj, (d<? super y>) dVar);
        }
    }
}
