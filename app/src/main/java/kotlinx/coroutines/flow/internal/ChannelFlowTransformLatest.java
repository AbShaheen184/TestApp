package kotlinx.coroutines.flow.internal;

import java.util.concurrent.CancellationException;
import kotlin.a;
import kotlin.coroutines.d;
import kotlin.coroutines.j;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.functions.p;
import kotlin.jvm.functions.q;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.z;
import kotlin.y;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import net.luminis.tls.engine.impl.c;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class ChannelFlowTransformLatest<T, R> extends ChannelFlowOperator<T, R> {
    private final q transform;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @e(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3", f = "Merge.kt", l = {23}, m = "invokeSuspend")
    public static final class AnonymousClass3 extends i implements p {
        final /* synthetic */ FlowCollector<R> $collector;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ ChannelFlowTransformLatest<T, R> this$0;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
        public static final class AnonymousClass1<T> implements FlowCollector {
            final /* synthetic */ CoroutineScope $$this$coroutineScope;
            final /* synthetic */ FlowCollector<R> $collector;
            final /* synthetic */ z $previousFlow;
            final /* synthetic */ ChannelFlowTransformLatest<T, R> this$0;

            /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
            @e(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2", f = "Merge.kt", l = {30}, m = "invokeSuspend")
            public static final class AnonymousClass2 extends i implements p {
                final /* synthetic */ FlowCollector<R> $collector;
                final /* synthetic */ T $value;
                int label;
                final /* synthetic */ ChannelFlowTransformLatest<T, R> this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public AnonymousClass2(ChannelFlowTransformLatest<T, R> channelFlowTransformLatest, FlowCollector<? super R> flowCollector, T t, d<? super AnonymousClass2> dVar) {
                    super(2, dVar);
                    this.this$0 = channelFlowTransformLatest;
                    this.$collector = flowCollector;
                    this.$value = t;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final d<y> create(Object obj, d<?> dVar) {
                    return new AnonymousClass2(this.this$0, this.$collector, this.$value, dVar);
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
                        q qVar = ((ChannelFlowTransformLatest) this.this$0).transform;
                        FlowCollector<R> flowCollector = this.$collector;
                        T t = this.$value;
                        this.label = 1;
                        Object objInvoke = qVar.invoke(flowCollector, t, this);
                        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                        if (objInvoke == aVar) {
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

            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(z zVar, CoroutineScope coroutineScope, ChannelFlowTransformLatest<T, R> channelFlowTransformLatest, FlowCollector<? super R> flowCollector) {
                this.$previousFlow = zVar;
                this.$$this$coroutineScope = coroutineScope;
                this.this$0 = channelFlowTransformLatest;
                this.$collector = flowCollector;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(T t, d<? super y> dVar) {
                ChannelFlowTransformLatest$flowCollect$3$1$emit$1 channelFlowTransformLatest$flowCollect$3$1$emit$1;
                AnonymousClass1<T> anonymousClass1;
                if (dVar instanceof ChannelFlowTransformLatest$flowCollect$3$1$emit$1) {
                    channelFlowTransformLatest$flowCollect$3$1$emit$1 = (ChannelFlowTransformLatest$flowCollect$3$1$emit$1) dVar;
                    int i = channelFlowTransformLatest$flowCollect$3$1$emit$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        channelFlowTransformLatest$flowCollect$3$1$emit$1.label = i - Integer.MIN_VALUE;
                    } else {
                        channelFlowTransformLatest$flowCollect$3$1$emit$1 = new ChannelFlowTransformLatest$flowCollect$3$1$emit$1(this, dVar);
                    }
                } else {
                    channelFlowTransformLatest$flowCollect$3$1$emit$1 = new ChannelFlowTransformLatest$flowCollect$3$1$emit$1(this, dVar);
                }
                Object obj = channelFlowTransformLatest$flowCollect$3$1$emit$1.result;
                int i2 = channelFlowTransformLatest$flowCollect$3$1$emit$1.label;
                if (i2 == 0) {
                    a.e(obj);
                    Job job = (Job) this.$previousFlow.e;
                    if (job != null) {
                        job.cancel((CancellationException) new ChildCancelledException());
                        channelFlowTransformLatest$flowCollect$3$1$emit$1.L$0 = this;
                        channelFlowTransformLatest$flowCollect$3$1$emit$1.L$1 = t;
                        channelFlowTransformLatest$flowCollect$3$1$emit$1.L$2 = job;
                        channelFlowTransformLatest$flowCollect$3$1$emit$1.label = 1;
                        Object objJoin = job.join(channelFlowTransformLatest$flowCollect$3$1$emit$1);
                        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                        if (objJoin == aVar) {
                            return aVar;
                        }
                    }
                    anonymousClass1 = this;
                } else {
                    if (i2 != 1) {
                        c.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    t = (T) channelFlowTransformLatest$flowCollect$3$1$emit$1.L$1;
                    anonymousClass1 = (AnonymousClass1) channelFlowTransformLatest$flowCollect$3$1$emit$1.L$0;
                    a.e(obj);
                }
                anonymousClass1.$previousFlow.e = BuildersKt__Builders_commonKt.launch$default(anonymousClass1.$$this$coroutineScope, null, CoroutineStart.UNDISPATCHED, new AnonymousClass2(anonymousClass1.this$0, anonymousClass1.$collector, t, null), 1, null);
                return y.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass3(ChannelFlowTransformLatest<T, R> channelFlowTransformLatest, FlowCollector<? super R> flowCollector, d<? super AnonymousClass3> dVar) {
            super(2, dVar);
            this.this$0 = channelFlowTransformLatest;
            this.$collector = flowCollector;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<y> create(Object obj, d<?> dVar) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.this$0, this.$collector, dVar);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // kotlin.jvm.functions.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super y> dVar) {
            return ((AnonymousClass3) create(coroutineScope, dVar)).invokeSuspend(y.a);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.d to kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3 for r6v1 'this'  kotlin.coroutines.d
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                int r0 = r6.label
                r1 = 1
                if (r0 == 0) goto L12
                if (r0 != r1) goto Lb
                kotlin.a.e(r7)
                goto L34
            Lb:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                net.luminis.tls.engine.impl.c.r(r7)
                r7 = 0
                return r7
            L12:
                kotlin.a.e(r7)
                java.lang.Object r7 = r6.L$0
                kotlinx.coroutines.CoroutineScope r7 = (kotlinx.coroutines.CoroutineScope) r7
                kotlin.jvm.internal.z r0 = new kotlin.jvm.internal.z
                r0.<init>()
                kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest<T, R> r2 = r6.this$0
                kotlinx.coroutines.flow.Flow<S> r3 = r2.flow
                kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1 r4 = new kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1
                kotlinx.coroutines.flow.FlowCollector<R> r5 = r6.$collector
                r4.<init>(r0, r7, r2, r5)
                r6.label = r1
                java.lang.Object r7 = r3.collect(r4, r6)
                kotlin.coroutines.intrinsics.a r0 = kotlin.coroutines.intrinsics.a.e
                if (r7 != r0) goto L34
                return r0
            L34:
                kotlin.y r7 = kotlin.y.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest.AnonymousClass3.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public /* synthetic */ ChannelFlowTransformLatest(q qVar, Flow flow, kotlin.coroutines.i iVar, int i, BufferOverflow bufferOverflow, int i2, f fVar) {
        this(qVar, flow, (i2 & 4) != 0 ? j.e : iVar, (i2 & 8) != 0 ? -2 : i, (i2 & 16) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlow
    public ChannelFlow<R> create(kotlin.coroutines.i iVar, int i, BufferOverflow bufferOverflow) {
        return new ChannelFlowTransformLatest(this.transform, this.flow, iVar, i, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.internal.ChannelFlowOperator
    public Object flowCollect(FlowCollector<? super R> flowCollector, d<? super y> dVar) {
        Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new AnonymousClass3(this, flowCollector, null), dVar);
        return objCoroutineScope == kotlin.coroutines.intrinsics.a.e ? objCoroutineScope : y.a;
    }

    public ChannelFlowTransformLatest(q qVar, Flow<? extends T> flow, kotlin.coroutines.i iVar, int i, BufferOverflow bufferOverflow) {
        super(flow, iVar, i, bufferOverflow);
        this.transform = qVar;
    }
}
