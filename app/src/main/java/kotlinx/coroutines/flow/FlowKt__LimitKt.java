package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.functions.p;
import kotlin.jvm.functions.q;
import kotlin.jvm.internal.v;
import kotlin.jvm.internal.x;
import kotlin.y;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import kotlinx.coroutines.flow.internal.FlowExceptions_commonKt;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class FlowKt__LimitKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__LimitKt$collectWhile$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @e(c = "kotlinx.coroutines.flow.FlowKt__LimitKt", f = "Limit.kt", l = {Token.CONTINUE}, m = "collectWhile")
    public static final class AnonymousClass1<T> extends kotlin.coroutines.jvm.internal.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt__LimitKt.collectWhile(null, null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @e(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1", f = "Limit.kt", l = {Token.USE_STACK}, m = "invokeSuspend")
    public static final class C00491 extends i implements p {
        final /* synthetic */ Flow<T> $this_transformWhile;
        final /* synthetic */ q $transform;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C00491(Flow<? extends T> flow, q qVar, kotlin.coroutines.d<? super C00491> dVar) {
            super(2, dVar);
            this.$this_transformWhile = flow;
            this.$transform = qVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<y> create(Object obj, kotlin.coroutines.d<?> dVar) {
            C00491 c00491 = new C00491(this.$this_transformWhile, this.$transform, dVar);
            c00491.L$0 = obj;
            return c00491;
        }

        @Override // kotlin.jvm.functions.p
        public final Object invoke(FlowCollector<? super R> flowCollector, kotlin.coroutines.d<? super y> dVar) {
            return ((C00491) create(flowCollector, dVar)).invokeSuspend(y.a);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.d to kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1 for r4v1 'this'  kotlin.coroutines.d
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                int r0 = r4.label
                r1 = 1
                if (r0 == 0) goto L18
                if (r0 != r1) goto L11
                java.lang.Object r0 = r4.L$0
                kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1 r0 = (kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1) r0
                kotlin.a.e(r5)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> Lf
                goto L41
            Lf:
                r5 = move-exception
                goto L37
            L11:
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                net.luminis.tls.engine.impl.c.r(r5)
                r5 = 0
                return r5
            L18:
                kotlin.a.e(r5)
                java.lang.Object r5 = r4.L$0
                kotlinx.coroutines.flow.FlowCollector r5 = (kotlinx.coroutines.flow.FlowCollector) r5
                kotlinx.coroutines.flow.Flow<T> r0 = r4.$this_transformWhile
                kotlin.jvm.functions.q r2 = r4.$transform
                kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1 r3 = new kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1
                r3.<init>(r2, r5)
                r4.L$0 = r3     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L35
                r4.label = r1     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L35
                java.lang.Object r5 = r0.collect(r3, r4)     // Catch: kotlinx.coroutines.flow.internal.AbortFlowException -> L35
                kotlin.coroutines.intrinsics.a r0 = kotlin.coroutines.intrinsics.a.e
                if (r5 != r0) goto L41
                return r0
            L35:
                r5 = move-exception
                r0 = r3
            L37:
                kotlinx.coroutines.flow.internal.FlowExceptions_commonKt.checkOwnership(r5, r0)
                kotlin.coroutines.i r5 = r4.getContext()
                kotlinx.coroutines.JobKt.ensureActive(r5)
            L41:
                kotlin.y r5 = kotlin.y.a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__LimitKt.C00491.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <T> Object collectWhile(Flow<? extends T> flow, p pVar, kotlin.coroutines.d<? super y> dVar) {
        AnonymousClass1 anonymousClass1;
        FlowCollector<? super Object> flowCollector;
        if (dVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) dVar;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(dVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(dVar);
        }
        Object obj = anonymousClass1.result;
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            kotlin.a.e(obj);
            FlowCollector<? super Object> flowKt__LimitKt$collectWhile$collector$1 = new FlowKt__LimitKt$collectWhile$collector$1<>(pVar);
            try {
                anonymousClass1.L$0 = flowKt__LimitKt$collectWhile$collector$1;
                anonymousClass1.label = 1;
                Object objCollect = flow.collect(flowKt__LimitKt$collectWhile$collector$1, anonymousClass1);
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                if (objCollect == aVar) {
                    return aVar;
                }
            } catch (AbortFlowException e) {
                e = e;
                flowCollector = flowKt__LimitKt$collectWhile$collector$1;
                FlowExceptions_commonKt.checkOwnership(e, flowCollector);
                JobKt.ensureActive(anonymousClass1.getContext());
            }
        } else {
            if (i2 != 1) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            flowCollector = (FlowKt__LimitKt$collectWhile$collector$1) anonymousClass1.L$0;
            try {
                kotlin.a.e(obj);
            } catch (AbortFlowException e2) {
                e = e2;
                FlowExceptions_commonKt.checkOwnership(e, flowCollector);
                JobKt.ensureActive(anonymousClass1.getContext());
            }
        }
        return y.a;
    }

    private static final <T> Object collectWhile$$forInline(Flow<? extends T> flow, p pVar, kotlin.coroutines.d<? super y> dVar) {
        FlowKt__LimitKt$collectWhile$collector$1 flowKt__LimitKt$collectWhile$collector$1 = new FlowKt__LimitKt$collectWhile$collector$1(pVar);
        try {
            flow.collect(flowKt__LimitKt$collectWhile$collector$1, dVar);
            return y.a;
        } catch (AbortFlowException e) {
            FlowExceptions_commonKt.checkOwnership(e, flowKt__LimitKt$collectWhile$collector$1);
            throw null;
        }
    }

    public static final <T> Flow<T> drop(final Flow<? extends T> flow, final int i) {
        if (i >= 0) {
            return new Flow<T>() { // from class: kotlinx.coroutines.flow.FlowKt__LimitKt$drop$$inlined$unsafeFlow$1
                @Override // kotlinx.coroutines.flow.Flow
                public Object collect(FlowCollector<? super T> flowCollector, kotlin.coroutines.d<? super y> dVar) {
                    Object objCollect = flow.collect(new FlowKt__LimitKt$drop$2$1(new x(), i, flowCollector), dVar);
                    return objCollect == kotlin.coroutines.intrinsics.a.e ? objCollect : y.a;
                }
            };
        }
        net.luminis.tls.engine.impl.c.p(androidx.privacysandbox.ads.adservices.java.internal.a.l(i, "Drop count should be non-negative, but had "));
        return null;
    }

    public static final <T> Flow<T> dropWhile(final Flow<? extends T> flow, final p pVar) {
        return new Flow<T>() { // from class: kotlinx.coroutines.flow.FlowKt__LimitKt$dropWhile$$inlined$unsafeFlow$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super T> flowCollector, kotlin.coroutines.d<? super y> dVar) {
                Object objCollect = flow.collect(new FlowKt__LimitKt$dropWhile$1$1(new v(), flowCollector, pVar), dVar);
                return objCollect == kotlin.coroutines.intrinsics.a.e ? objCollect : y.a;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <T> Object emitAbort$FlowKt__LimitKt(FlowCollector<? super T> flowCollector, T t, Object obj, kotlin.coroutines.d<? super y> dVar) {
        FlowKt__LimitKt$emitAbort$1 flowKt__LimitKt$emitAbort$1;
        if (dVar instanceof FlowKt__LimitKt$emitAbort$1) {
            flowKt__LimitKt$emitAbort$1 = (FlowKt__LimitKt$emitAbort$1) dVar;
            int i = flowKt__LimitKt$emitAbort$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                flowKt__LimitKt$emitAbort$1.label = i - Integer.MIN_VALUE;
            } else {
                flowKt__LimitKt$emitAbort$1 = new FlowKt__LimitKt$emitAbort$1(dVar);
            }
        } else {
            flowKt__LimitKt$emitAbort$1 = new FlowKt__LimitKt$emitAbort$1(dVar);
        }
        Object obj2 = flowKt__LimitKt$emitAbort$1.result;
        int i2 = flowKt__LimitKt$emitAbort$1.label;
        if (i2 == 0) {
            kotlin.a.e(obj2);
            flowKt__LimitKt$emitAbort$1.L$0 = obj;
            flowKt__LimitKt$emitAbort$1.label = 1;
            Object objEmit = flowCollector.emit(t, flowKt__LimitKt$emitAbort$1);
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
            if (objEmit == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            obj = flowKt__LimitKt$emitAbort$1.L$0;
            kotlin.a.e(obj2);
        }
        throw new AbortFlowException(obj);
    }

    public static final <T> Flow<T> take(Flow<? extends T> flow, int i) {
        if (i > 0) {
            return new FlowKt__LimitKt$take$$inlined$unsafeFlow$1(flow, i);
        }
        net.luminis.tls.engine.impl.c.p(androidx.privacysandbox.ads.adservices.java.internal.a.p("Requested element count ", i, " should be positive"));
        return null;
    }

    public static final <T> Flow<T> takeWhile(Flow<? extends T> flow, p pVar) {
        return new FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1(flow, pVar);
    }

    public static final <T, R> Flow<R> transformWhile(Flow<? extends T> flow, q qVar) {
        return FlowKt.flow(new C00491(flow, qVar, null));
    }
}
