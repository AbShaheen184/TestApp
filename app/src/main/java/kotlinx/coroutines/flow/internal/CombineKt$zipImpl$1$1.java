package kotlinx.coroutines.flow.internal;

import java.util.concurrent.CancellationException;
import kotlin.a;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.functions.l;
import kotlin.jvm.functions.p;
import kotlin.jvm.functions.q;
import kotlin.y;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.channels.SendChannel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.internal.ThreadContextKt;
import net.luminis.tls.engine.impl.c;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
@e(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1", f = "Combine.kt", l = {Token.EXPORT}, m = "invokeSuspend")
public final class CombineKt$zipImpl$1$1 extends i implements p {
    final /* synthetic */ Flow<T1> $flow;
    final /* synthetic */ Flow<T2> $flow2;
    final /* synthetic */ FlowCollector<R> $this_unsafeFlow;
    final /* synthetic */ q $transform;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @e(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2", f = "Combine.kt", l = {Token.IMPORT}, m = "invokeSuspend")
    public static final class AnonymousClass2 extends i implements p {
        final /* synthetic */ Object $cnt;
        final /* synthetic */ CompletableJob $collectJob;
        final /* synthetic */ Flow<T1> $flow;
        final /* synthetic */ kotlin.coroutines.i $scopeContext;
        final /* synthetic */ ReceiveChannel<Object> $second;
        final /* synthetic */ FlowCollector<R> $this_unsafeFlow;
        final /* synthetic */ q $transform;
        int label;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
        public static final class AnonymousClass1<T> implements FlowCollector {
            final /* synthetic */ Object $cnt;
            final /* synthetic */ CompletableJob $collectJob;
            final /* synthetic */ kotlin.coroutines.i $scopeContext;
            final /* synthetic */ ReceiveChannel<Object> $second;
            final /* synthetic */ FlowCollector<R> $this_unsafeFlow;
            final /* synthetic */ q $transform;

            /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
            @e(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1", f = "Combine.kt", l = {Token.ELSE, Token.DEFAULT, Token.DEFAULT}, m = "invokeSuspend")
            public static final class C00041 extends i implements p {
                final /* synthetic */ CompletableJob $collectJob;
                final /* synthetic */ ReceiveChannel<Object> $second;
                final /* synthetic */ FlowCollector<R> $this_unsafeFlow;
                final /* synthetic */ q $transform;
                final /* synthetic */ T1 $value;
                Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C00041(ReceiveChannel<? extends Object> receiveChannel, FlowCollector<? super R> flowCollector, q qVar, T1 t1, CompletableJob completableJob, d<? super C00041> dVar) {
                    super(2, dVar);
                    this.$second = receiveChannel;
                    this.$this_unsafeFlow = flowCollector;
                    this.$transform = qVar;
                    this.$value = t1;
                    this.$collectJob = completableJob;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final d<y> create(Object obj, d<?> dVar) {
                    return new C00041(this.$second, this.$this_unsafeFlow, this.$transform, this.$value, this.$collectJob, dVar);
                }

                @Override // kotlin.jvm.functions.p
                public final Object invoke(y yVar, d<? super y> dVar) {
                    return ((C00041) create(yVar, dVar)).invokeSuspend(y.a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:28:0x006b, code lost:
                
                    if (r0.emit(r9, r8) == r5) goto L29;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r0v3, types: [kotlinx.coroutines.flow.FlowCollector] */
                /* JADX WARN: Type inference failed for: r0v6 */
                /* JADX WARN: Type inference failed for: r0v7 */
                @Override // kotlin.coroutines.jvm.internal.a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
                    /*
                        r8 = this;
                        int r0 = r8.label
                        r1 = 0
                        r2 = 3
                        r3 = 2
                        r4 = 1
                        kotlin.coroutines.intrinsics.a r5 = kotlin.coroutines.intrinsics.a.e
                        if (r0 == 0) goto L2d
                        if (r0 == r4) goto L23
                        if (r0 == r3) goto L1b
                        if (r0 != r2) goto L14
                        kotlin.a.e(r9)
                        goto L6e
                    L14:
                        java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                        net.luminis.tls.engine.impl.c.r(r9)
                        r9 = 0
                        return r9
                    L1b:
                        java.lang.Object r0 = r8.L$0
                        kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
                        kotlin.a.e(r9)
                        goto L63
                    L23:
                        kotlin.a.e(r9)
                        kotlinx.coroutines.channels.ChannelResult r9 = (kotlinx.coroutines.channels.ChannelResult) r9
                        java.lang.Object r9 = r9.m54unboximpl()
                        goto L3b
                    L2d:
                        kotlin.a.e(r9)
                        kotlinx.coroutines.channels.ReceiveChannel<java.lang.Object> r9 = r8.$second
                        r8.label = r4
                        java.lang.Object r9 = r9.mo34receiveCatchingJP2dKIU(r8)
                        if (r9 != r5) goto L3b
                        goto L6d
                    L3b:
                        kotlinx.coroutines.CompletableJob r0 = r8.$collectJob
                        boolean r4 = r9 instanceof kotlinx.coroutines.channels.ChannelResult.Failed
                        if (r4 == 0) goto L4d
                        java.lang.Throwable r9 = kotlinx.coroutines.channels.ChannelResult.m46exceptionOrNullimpl(r9)
                        if (r9 != 0) goto L4c
                        kotlinx.coroutines.flow.internal.AbortFlowException r9 = new kotlinx.coroutines.flow.internal.AbortFlowException
                        r9.<init>(r0)
                    L4c:
                        throw r9
                    L4d:
                        kotlinx.coroutines.flow.FlowCollector<R> r0 = r8.$this_unsafeFlow
                        kotlin.jvm.functions.q r4 = r8.$transform
                        T1 r6 = r8.$value
                        kotlinx.coroutines.internal.Symbol r7 = kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL
                        if (r9 != r7) goto L58
                        r9 = r1
                    L58:
                        r8.L$0 = r0
                        r8.label = r3
                        java.lang.Object r9 = r4.invoke(r6, r9, r8)
                        if (r9 != r5) goto L63
                        goto L6d
                    L63:
                        r8.L$0 = r1
                        r8.label = r2
                        java.lang.Object r9 = r0.emit(r9, r8)
                        if (r9 != r5) goto L6e
                    L6d:
                        return r5
                    L6e:
                        kotlin.y r9 = kotlin.y.a
                        return r9
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1.AnonymousClass2.AnonymousClass1.C00041.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(kotlin.coroutines.i iVar, Object obj, ReceiveChannel<? extends Object> receiveChannel, FlowCollector<? super R> flowCollector, q qVar, CompletableJob completableJob) {
                this.$scopeContext = iVar;
                this.$cnt = obj;
                this.$second = receiveChannel;
                this.$this_unsafeFlow = flowCollector;
                this.$transform = qVar;
                this.$collectJob = completableJob;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(T1 t1, d<? super y> dVar) {
                CombineKt$zipImpl$1$1$2$1$emit$1 combineKt$zipImpl$1$1$2$1$emit$1;
                if (dVar instanceof CombineKt$zipImpl$1$1$2$1$emit$1) {
                    combineKt$zipImpl$1$1$2$1$emit$1 = (CombineKt$zipImpl$1$1$2$1$emit$1) dVar;
                    int i = combineKt$zipImpl$1$1$2$1$emit$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        combineKt$zipImpl$1$1$2$1$emit$1.label = i - Integer.MIN_VALUE;
                    } else {
                        combineKt$zipImpl$1$1$2$1$emit$1 = new CombineKt$zipImpl$1$1$2$1$emit$1(this, dVar);
                    }
                } else {
                    combineKt$zipImpl$1$1$2$1$emit$1 = new CombineKt$zipImpl$1$1$2$1$emit$1(this, dVar);
                }
                Object obj = combineKt$zipImpl$1$1$2$1$emit$1.result;
                int i2 = combineKt$zipImpl$1$1$2$1$emit$1.label;
                y yVar = y.a;
                if (i2 == 0) {
                    a.e(obj);
                    kotlin.coroutines.i iVar = this.$scopeContext;
                    Object obj2 = this.$cnt;
                    C00041 c00041 = new C00041(this.$second, this.$this_unsafeFlow, this.$transform, t1, this.$collectJob, null);
                    combineKt$zipImpl$1$1$2$1$emit$1.label = 1;
                    Object objWithContextUndispatched = ChannelFlowKt.withContextUndispatched(iVar, yVar, obj2, c00041, combineKt$zipImpl$1$1$2$1$emit$1);
                    kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                    if (objWithContextUndispatched == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        c.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    a.e(obj);
                }
                return yVar;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(Flow<? extends T1> flow, kotlin.coroutines.i iVar, Object obj, ReceiveChannel<? extends Object> receiveChannel, FlowCollector<? super R> flowCollector, q qVar, CompletableJob completableJob, d<? super AnonymousClass2> dVar) {
            super(2, dVar);
            this.$flow = flow;
            this.$scopeContext = iVar;
            this.$cnt = obj;
            this.$second = receiveChannel;
            this.$this_unsafeFlow = flowCollector;
            this.$transform = qVar;
            this.$collectJob = completableJob;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<y> create(Object obj, d<?> dVar) {
            return new AnonymousClass2(this.$flow, this.$scopeContext, this.$cnt, this.$second, this.$this_unsafeFlow, this.$transform, this.$collectJob, dVar);
        }

        @Override // kotlin.jvm.functions.p
        public final Object invoke(y yVar, d<? super y> dVar) {
            return ((AnonymousClass2) create(yVar, dVar)).invokeSuspend(y.a);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.d to kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2 for r9v1 'this'  kotlin.coroutines.d
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                int r0 = r9.label
                r1 = 1
                if (r0 == 0) goto L12
                if (r0 != r1) goto Lb
                kotlin.a.e(r10)
                goto L33
            Lb:
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                net.luminis.tls.engine.impl.c.r(r10)
                r10 = 0
                return r10
            L12:
                kotlin.a.e(r10)
                kotlinx.coroutines.flow.Flow<T1> r10 = r9.$flow
                kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1 r2 = new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1
                kotlin.coroutines.i r3 = r9.$scopeContext
                java.lang.Object r4 = r9.$cnt
                kotlinx.coroutines.channels.ReceiveChannel<java.lang.Object> r5 = r9.$second
                kotlinx.coroutines.flow.FlowCollector<R> r6 = r9.$this_unsafeFlow
                kotlin.jvm.functions.q r7 = r9.$transform
                kotlinx.coroutines.CompletableJob r8 = r9.$collectJob
                r2.<init>(r3, r4, r5, r6, r7, r8)
                r9.label = r1
                java.lang.Object r10 = r10.collect(r2, r9)
                kotlin.coroutines.intrinsics.a r0 = kotlin.coroutines.intrinsics.a.e
                if (r10 != r0) goto L33
                return r0
            L33:
                kotlin.y r10 = kotlin.y.a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CombineKt$zipImpl$1$1(Flow<? extends T2> flow, Flow<? extends T1> flow2, FlowCollector<? super R> flowCollector, q qVar, d<? super CombineKt$zipImpl$1$1> dVar) {
        super(2, dVar);
        this.$flow2 = flow;
        this.$flow = flow2;
        this.$this_unsafeFlow = flowCollector;
        this.$transform = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        CombineKt$zipImpl$1$1 combineKt$zipImpl$1$1 = new CombineKt$zipImpl$1$1(this.$flow2, this.$flow, this.$this_unsafeFlow, this.$transform, dVar);
        combineKt$zipImpl$1$1.L$0 = obj;
        return combineKt$zipImpl$1$1;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super y> dVar) {
        return ((CombineKt$zipImpl$1$1) create(coroutineScope, dVar)).invokeSuspend(y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        final CompletableJob completableJobJob$default;
        ReceiveChannel receiveChannel;
        ReceiveChannel receiveChannel2;
        CompletableJob completableJob;
        int i = this.label;
        y yVar = y.a;
        if (i == 0) {
            a.e(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            ReceiveChannel receiveChannelProduce$default = ProduceKt.produce$default(coroutineScope, null, 0, new CombineKt$zipImpl$1$1$second$1(this.$flow2, null), 3, null);
            completableJobJob$default = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
            receiveChannelProduce$default.getClass();
            ((SendChannel) receiveChannelProduce$default).invokeOnClose(new l() { // from class: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1.1
                public final void invoke(Throwable th) {
                    if (completableJobJob$default.isActive()) {
                        CompletableJob completableJob2 = completableJobJob$default;
                        completableJob2.cancel((CancellationException) new AbortFlowException(completableJob2));
                    }
                }

                @Override // kotlin.jvm.functions.l
                public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                    invoke((Throwable) obj2);
                    return y.a;
                }
            });
            try {
                try {
                    kotlin.coroutines.i coroutineContext = coroutineScope.getCoroutineContext();
                    Object objThreadContextElements = ThreadContextKt.threadContextElements(coroutineContext);
                    kotlin.coroutines.i iVarPlus = coroutineScope.getCoroutineContext().plus(completableJobJob$default);
                    try {
                        AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$flow, coroutineContext, objThreadContextElements, receiveChannelProduce$default, this.$this_unsafeFlow, this.$transform, completableJobJob$default, null);
                        receiveChannel = receiveChannelProduce$default;
                        completableJob = completableJobJob$default;
                        try {
                            this.L$0 = receiveChannel;
                            this.L$1 = completableJob;
                            this.label = 1;
                            Object objWithContextUndispatched$default = ChannelFlowKt.withContextUndispatched$default(iVarPlus, yVar, null, anonymousClass2, this, 4, null);
                            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                            if (objWithContextUndispatched$default == aVar) {
                                return aVar;
                            }
                            receiveChannel2 = receiveChannel;
                        } catch (AbortFlowException e) {
                            e = e;
                            completableJobJob$default = completableJob;
                            receiveChannel2 = receiveChannel;
                            FlowExceptions_commonKt.checkOwnership(e, completableJobJob$default);
                        } catch (Throwable th) {
                            th = th;
                            receiveChannel2 = receiveChannel;
                            ReceiveChannel.DefaultImpls.cancel$default(receiveChannel2, (CancellationException) null, 1, (Object) null);
                            throw th;
                        }
                    } catch (AbortFlowException e2) {
                        e = e2;
                        receiveChannel = receiveChannelProduce$default;
                        completableJob = completableJobJob$default;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    receiveChannel = receiveChannelProduce$default;
                }
            } catch (AbortFlowException e3) {
                e = e3;
                receiveChannel = receiveChannelProduce$default;
            }
        } else {
            if (i != 1) {
                c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            completableJobJob$default = (CompletableJob) this.L$1;
            receiveChannel2 = (ReceiveChannel) this.L$0;
            try {
                try {
                    a.e(obj);
                } catch (Throwable th3) {
                    th = th3;
                    ReceiveChannel.DefaultImpls.cancel$default(receiveChannel2, (CancellationException) null, 1, (Object) null);
                    throw th;
                }
            } catch (AbortFlowException e4) {
                e = e4;
                FlowExceptions_commonKt.checkOwnership(e, completableJobJob$default);
            }
        }
        ReceiveChannel.DefaultImpls.cancel$default(receiveChannel2, (CancellationException) null, 1, (Object) null);
        return yVar;
    }
}
