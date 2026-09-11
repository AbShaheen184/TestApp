package kotlinx.coroutines.flow.internal;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.collections.x;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.functions.a;
import kotlin.jvm.functions.p;
import kotlin.jvm.functions.q;
import kotlin.y;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import net.luminis.tls.engine.impl.c;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class CombineKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @e(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2", f = "Combine.kt", l = {Token.SHEQ, Token.GET_REF, Token.REF_CALL}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends i implements p {
        final /* synthetic */ a $arrayFactory;
        final /* synthetic */ Flow<T>[] $flows;
        final /* synthetic */ FlowCollector<R> $this_combineInternal;
        final /* synthetic */ q $transform;
        int I$0;
        int I$1;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        int label;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
        @e(c = "kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1", f = "Combine.kt", l = {28}, m = "invokeSuspend")
        public static final class AnonymousClass1 extends i implements p {
            final /* synthetic */ Flow<T>[] $flows;
            final /* synthetic */ int $i;
            final /* synthetic */ AtomicInteger $nonClosed;
            final /* synthetic */ Channel<x> $resultChannel;
            int label;

            /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
            public static final class C00031<T> implements FlowCollector {
                final /* synthetic */ int $i;
                final /* synthetic */ Channel<x> $resultChannel;

                public C00031(Channel<x> channel, int i) {
                    this.$resultChannel = channel;
                    this.$i = i;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
                
                    if (kotlinx.coroutines.YieldKt.yield(r0) == r4) goto L21;
                 */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(T r7, kotlin.coroutines.d<? super kotlin.y> r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1
                        if (r0 == 0) goto L13
                        r0 = r8
                        kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1 r0 = (kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1 r0 = new kotlinx.coroutines.flow.internal.CombineKt$combineInternal$2$1$1$emit$1
                        r0.<init>(r6, r8)
                    L18:
                        java.lang.Object r8 = r0.result
                        int r1 = r0.label
                        r2 = 2
                        r3 = 1
                        kotlin.coroutines.intrinsics.a r4 = kotlin.coroutines.intrinsics.a.e
                        if (r1 == 0) goto L35
                        if (r1 == r3) goto L31
                        if (r1 != r2) goto L2a
                        kotlin.a.e(r8)
                        goto L53
                    L2a:
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        net.luminis.tls.engine.impl.c.r(r7)
                        r7 = 0
                        return r7
                    L31:
                        kotlin.a.e(r8)
                        goto L4a
                    L35:
                        kotlin.a.e(r8)
                        kotlinx.coroutines.channels.Channel<kotlin.collections.x> r8 = r6.$resultChannel
                        kotlin.collections.x r1 = new kotlin.collections.x
                        int r5 = r6.$i
                        r1.<init>(r5, r7)
                        r0.label = r3
                        java.lang.Object r7 = r8.send(r1, r0)
                        if (r7 != r4) goto L4a
                        goto L52
                    L4a:
                        r0.label = r2
                        java.lang.Object r7 = kotlinx.coroutines.YieldKt.yield(r0)
                        if (r7 != r4) goto L53
                    L52:
                        return r4
                    L53:
                        kotlin.y r7 = kotlin.y.a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.CombineKt.AnonymousClass2.AnonymousClass1.C00031.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(Flow<? extends T>[] flowArr, int i, AtomicInteger atomicInteger, Channel<x> channel, d<? super AnonymousClass1> dVar) {
                super(2, dVar);
                this.$flows = flowArr;
                this.$i = i;
                this.$nonClosed = atomicInteger;
                this.$resultChannel = channel;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d<y> create(Object obj, d<?> dVar) {
                return new AnonymousClass1(this.$flows, this.$i, this.$nonClosed, this.$resultChannel, dVar);
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
                        Flow[] flowArr = this.$flows;
                        int i2 = this.$i;
                        Flow flow = flowArr[i2];
                        C00031 c00031 = new C00031(this.$resultChannel, i2);
                        this.label = 1;
                        Object objCollect = flow.collect(c00031, this);
                        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
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
                    if (this.$nonClosed.decrementAndGet() == 0) {
                        SendChannel.DefaultImpls.close$default(this.$resultChannel, null, 1, null);
                    }
                    return y.a;
                } catch (Throwable th) {
                    if (this.$nonClosed.decrementAndGet() == 0) {
                        SendChannel.DefaultImpls.close$default(this.$resultChannel, null, 1, null);
                    }
                    throw th;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Flow<? extends T>[] flowArr, a aVar, q qVar, FlowCollector<? super R> flowCollector, d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.$flows = flowArr;
            this.$arrayFactory = aVar;
            this.$transform = qVar;
            this.$this_combineInternal = flowCollector;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<y> create(Object obj, d<?> dVar) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$flows, this.$arrayFactory, this.$transform, this.$this_combineInternal, dVar);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // kotlin.jvm.functions.p
        public final Object invoke(CoroutineScope coroutineScope, d<? super y> dVar) {
            return ((AnonymousClass2) create(coroutineScope, dVar)).invokeSuspend(y.a);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x00a9  */
        /* JADX WARN: Code duplicated, block: B:27:0x00bb A[LOOP:0: B:27:0x00bb->B:46:?, LOOP_START, PHI: r7 r10
  0x00bb: PHI (r7v4 int) = (r7v3 int), (r7v5 int) binds: [B:24:0x00b6, B:46:?] A[DONT_GENERATE, DONT_INLINE]
  0x00bb: PHI (r10v3 kotlin.collections.x) = (r10v2 kotlin.collections.x), (r10v16 kotlin.collections.x) binds: [B:24:0x00b6, B:46:?] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:29:0x00c7  */
        /* JADX WARN: Code duplicated, block: B:32:0x00cd  */
        /* JADX WARN: Code duplicated, block: B:35:0x00de  */
        /* JADX WARN: Code duplicated, block: B:37:0x00e8  */
        /* JADX WARN: Code duplicated, block: B:40:0x00ff  */
        /* JADX WARN: Code duplicated, block: B:45:0x00dc A[EDGE_INSN: B:45:0x00dc->B:34:0x00dc BREAK  A[LOOP:0: B:27:0x00bb->B:46:?], SYNTHETIC] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x011b -> B:19:0x0093). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r22) {
            /*
                Method dump skipped, instruction units count: 292
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.CombineKt.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final <R, T> Object combineInternal(FlowCollector<? super R> flowCollector, Flow<? extends T>[] flowArr, a aVar, q qVar, d<? super y> dVar) {
        Object objFlowScope = FlowCoroutineKt.flowScope(new AnonymousClass2(flowArr, aVar, qVar, flowCollector, null), dVar);
        return objFlowScope == kotlin.coroutines.intrinsics.a.e ? objFlowScope : y.a;
    }

    public static final <T1, T2, R> Flow<R> zipImpl(final Flow<? extends T1> flow, final Flow<? extends T2> flow2, final q qVar) {
        return new Flow<R>() { // from class: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$$inlined$unsafeFlow$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super R> flowCollector, d<? super y> dVar) {
                Object objCoroutineScope = CoroutineScopeKt.coroutineScope(new CombineKt$zipImpl$1$1(flow2, flow, flowCollector, qVar, null), dVar);
                return objCoroutineScope == kotlin.coroutines.intrinsics.a.e ? objCoroutineScope : y.a;
            }
        };
    }
}
