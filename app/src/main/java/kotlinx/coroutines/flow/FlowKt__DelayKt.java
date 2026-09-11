package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.functions.l;
import kotlin.jvm.functions.p;
import kotlin.jvm.functions.q;
import kotlin.jvm.internal.z;
import kotlin.y;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.FlowPreview;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.internal.FlowCoroutineKt;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;
import kotlinx.coroutines.selects.SelectImplementation;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class FlowKt__DelayKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__DelayKt$fixedPeriodTicker$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @e(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$fixedPeriodTicker$1", f = "Delay.kt", l = {307, 309, 310}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends i implements p {
        final /* synthetic */ long $delayMillis;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(long j, kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$delayMillis = j;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<y> create(Object obj, kotlin.coroutines.d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$delayMillis, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.p
        public final Object invoke(ProducerScope<? super y> producerScope, kotlin.coroutines.d<? super y> dVar) {
            return ((AnonymousClass1) create(producerScope, dVar)).invokeSuspend(y.a);
        }

        /* JADX WARN: Code duplicated, block: B:15:0x003c A[PHI: r0
  0x003c: PHI (r0v3 kotlinx.coroutines.channels.ProducerScope) = 
  (r0v2 kotlinx.coroutines.channels.ProducerScope)
  (r0v4 kotlinx.coroutines.channels.ProducerScope)
  (r0v6 kotlinx.coroutines.channels.ProducerScope)
 binds: [B:13:0x0039, B:19:0x0057, B:11:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:18:0x004d A[PHI: r0
  0x004d: PHI (r0v4 kotlinx.coroutines.channels.ProducerScope) = (r0v3 kotlinx.coroutines.channels.ProducerScope), (r0v8 kotlinx.coroutines.channels.ProducerScope) binds: [B:16:0x004a, B:10:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0057 -> B:15:0x003c). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                int r0 = r7.label
                r1 = 3
                r2 = 2
                r3 = 1
                kotlin.coroutines.intrinsics.a r4 = kotlin.coroutines.intrinsics.a.e
                if (r0 == 0) goto L27
                if (r0 == r3) goto L1f
                if (r0 == r2) goto L17
                if (r0 != r1) goto L10
                goto L1f
            L10:
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                net.luminis.tls.engine.impl.c.r(r8)
                r8 = 0
                return r8
            L17:
                java.lang.Object r0 = r7.L$0
                kotlinx.coroutines.channels.ProducerScope r0 = (kotlinx.coroutines.channels.ProducerScope) r0
                kotlin.a.e(r8)
                goto L4d
            L1f:
                java.lang.Object r0 = r7.L$0
                kotlinx.coroutines.channels.ProducerScope r0 = (kotlinx.coroutines.channels.ProducerScope) r0
                kotlin.a.e(r8)
                goto L3c
            L27:
                kotlin.a.e(r8)
                java.lang.Object r8 = r7.L$0
                r0 = r8
                kotlinx.coroutines.channels.ProducerScope r0 = (kotlinx.coroutines.channels.ProducerScope) r0
                long r5 = r7.$delayMillis
                r7.L$0 = r0
                r7.label = r3
                java.lang.Object r8 = kotlinx.coroutines.DelayKt.delay(r5, r7)
                if (r8 != r4) goto L3c
                goto L59
            L3c:
                kotlinx.coroutines.channels.SendChannel r8 = r0.getChannel()
                r7.L$0 = r0
                r7.label = r2
                kotlin.y r3 = kotlin.y.a
                java.lang.Object r8 = r8.send(r3, r7)
                if (r8 != r4) goto L4d
                goto L59
            L4d:
                long r5 = r7.$delayMillis
                r7.L$0 = r0
                r7.label = r1
                java.lang.Object r8 = kotlinx.coroutines.DelayKt.delay(r5, r7)
                if (r8 != r4) goto L3c
            L59:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__DelayKt.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @e(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2", f = "Delay.kt", l = {412}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends i implements q {
        final /* synthetic */ long $periodMillis;
        final /* synthetic */ Flow<T> $this_sample;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        Object L$2;
        Object L$3;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(long j, Flow<? extends T> flow, kotlin.coroutines.d<? super AnonymousClass2> dVar) {
            super(3, dVar);
            this.$periodMillis = j;
            this.$this_sample = flow;
        }

        @Override // kotlin.jvm.functions.q
        public final Object invoke(CoroutineScope coroutineScope, FlowCollector<? super T> flowCollector, kotlin.coroutines.d<? super y> dVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$periodMillis, this.$this_sample, dVar);
            anonymousClass2.L$0 = coroutineScope;
            anonymousClass2.L$1 = flowCollector;
            return anonymousClass2.invokeSuspend(y.a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ReceiveChannel receiveChannel;
            ReceiveChannel<y> receiveChannelFixedPeriodTicker;
            z zVar;
            FlowCollector flowCollector;
            int i = this.label;
            if (i == 0) {
                kotlin.a.e(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                FlowCollector flowCollector2 = (FlowCollector) this.L$1;
                ReceiveChannel receiveChannelProduce$default = ProduceKt.produce$default(coroutineScope, null, -1, new FlowKt__DelayKt$sample$2$values$1(this.$this_sample, null), 1, null);
                z zVar2 = new z();
                receiveChannel = receiveChannelProduce$default;
                receiveChannelFixedPeriodTicker = FlowKt.fixedPeriodTicker(coroutineScope, this.$periodMillis);
                zVar = zVar2;
                flowCollector = flowCollector2;
            } else {
                if (i != 1) {
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                receiveChannelFixedPeriodTicker = (ReceiveChannel) this.L$3;
                zVar = (z) this.L$2;
                receiveChannel = (ReceiveChannel) this.L$1;
                flowCollector = (FlowCollector) this.L$0;
                kotlin.a.e(obj);
            }
            while (zVar.e != NullSurrogateKt.DONE) {
                SelectImplementation selectImplementation = new SelectImplementation(getContext());
                selectImplementation.invoke(receiveChannel.getOnReceiveCatching(), new FlowKt__DelayKt$sample$2$1$1(zVar, receiveChannelFixedPeriodTicker, null));
                selectImplementation.invoke(receiveChannelFixedPeriodTicker.getOnReceive(), new FlowKt__DelayKt$sample$2$1$2(zVar, flowCollector, null));
                this.L$0 = flowCollector;
                this.L$1 = receiveChannel;
                this.L$2 = zVar;
                this.L$3 = receiveChannelFixedPeriodTicker;
                this.label = 1;
                Object objDoSelect = selectImplementation.doSelect(this);
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                if (objDoSelect == aVar) {
                    return aVar;
                }
            }
            return y.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @FlowPreview
    public static final <T> Flow<T> debounce(Flow<? extends T> flow, final long j) {
        if (j >= 0) {
            return j == 0 ? flow : debounceInternal$FlowKt__DelayKt(flow, new l() { // from class: kotlinx.coroutines.flow.b
                @Override // kotlin.jvm.functions.l
                public final Object invoke(Object obj) {
                    return Long.valueOf(FlowKt__DelayKt.debounce$lambda$1$FlowKt__DelayKt(j, obj));
                }
            });
        }
        net.luminis.tls.engine.impl.c.o("Debounce timeout should not be negative");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long debounce$lambda$2$FlowKt__DelayKt(l lVar, Object obj) {
        return DelayKt.m18toDelayMillisLRDsOJo(((kotlin.time.a) lVar.invoke(obj)).e);
    }

    @FlowPreview
    /* JADX INFO: renamed from: debounce-HG0u8IE, reason: not valid java name */
    public static final <T> Flow<T> m64debounceHG0u8IE(Flow<? extends T> flow, long j) {
        return FlowKt.debounce(flow, DelayKt.m18toDelayMillisLRDsOJo(j));
    }

    @FlowPreview
    public static final <T> Flow<T> debounceDuration(Flow<? extends T> flow, final l lVar) {
        return debounceInternal$FlowKt__DelayKt(flow, new l() { // from class: kotlinx.coroutines.flow.a
            @Override // kotlin.jvm.functions.l
            public final Object invoke(Object obj) {
                return Long.valueOf(FlowKt__DelayKt.debounce$lambda$2$FlowKt__DelayKt(lVar, obj));
            }
        });
    }

    private static final <T> Flow<T> debounceInternal$FlowKt__DelayKt(Flow<? extends T> flow, l lVar) {
        return FlowCoroutineKt.scopedFlow(new FlowKt__DelayKt$debounceInternal$1(lVar, flow, null));
    }

    public static final ReceiveChannel<y> fixedPeriodTicker(CoroutineScope coroutineScope, long j) {
        return ProduceKt.produce$default(coroutineScope, null, 0, new AnonymousClass1(j, null), 1, null);
    }

    @FlowPreview
    public static final <T> Flow<T> sample(Flow<? extends T> flow, long j) {
        if (j > 0) {
            return FlowCoroutineKt.scopedFlow(new AnonymousClass2(j, flow, null));
        }
        net.luminis.tls.engine.impl.c.o("Sample period should be positive");
        return null;
    }

    @FlowPreview
    /* JADX INFO: renamed from: sample-HG0u8IE, reason: not valid java name */
    public static final <T> Flow<T> m65sampleHG0u8IE(Flow<? extends T> flow, long j) {
        return FlowKt.sample(flow, DelayKt.m18toDelayMillisLRDsOJo(j));
    }

    @FlowPreview
    /* JADX INFO: renamed from: timeout-HG0u8IE, reason: not valid java name */
    public static final <T> Flow<T> m66timeoutHG0u8IE(Flow<? extends T> flow, long j) {
        return m67timeoutInternalHG0u8IE$FlowKt__DelayKt(flow, j);
    }

    /* JADX INFO: renamed from: timeoutInternal-HG0u8IE$FlowKt__DelayKt, reason: not valid java name */
    private static final <T> Flow<T> m67timeoutInternalHG0u8IE$FlowKt__DelayKt(Flow<? extends T> flow, long j) {
        return FlowCoroutineKt.scopedFlow(new FlowKt__DelayKt$timeoutInternal$1(j, flow, null));
    }

    @FlowPreview
    public static final <T> Flow<T> debounce(Flow<? extends T> flow, l lVar) {
        return debounceInternal$FlowKt__DelayKt(flow, lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long debounce$lambda$1$FlowKt__DelayKt(long j, Object obj) {
        return j;
    }
}
