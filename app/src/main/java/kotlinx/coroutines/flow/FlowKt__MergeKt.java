package kotlinx.coroutines.flow;

import kotlin.collections.m;
import kotlin.collections.u;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.functions.p;
import kotlin.jvm.functions.q;
import kotlin.y;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.FlowPreview;
import kotlinx.coroutines.flow.internal.ChannelFlowMerge;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import kotlinx.coroutines.flow.internal.ChannelLimitedFlowMerge;
import kotlinx.coroutines.internal.SystemPropsKt;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class FlowKt__MergeKt {
    private static final int DEFAULT_CONCURRENCY = SystemPropsKt.systemProp(FlowKt.DEFAULT_CONCURRENCY_PROPERTY_NAME, 16, 1, Integer.MAX_VALUE);

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapLatest$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @e(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapLatest$1", f = "Merge.kt", l = {189, 189}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends i implements q {
        final /* synthetic */ p $transform;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(p pVar, kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(3, dVar);
            this.$transform = pVar;
        }

        @Override // kotlin.jvm.functions.q
        public final Object invoke(FlowCollector<? super R> flowCollector, T t, kotlin.coroutines.d<? super y> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$transform, dVar);
            anonymousClass1.L$0 = flowCollector;
            anonymousClass1.L$1 = t;
            return anonymousClass1.invokeSuspend(y.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
        
            if (kotlinx.coroutines.flow.FlowKt.emitAll(r0, (kotlinx.coroutines.flow.Flow) r6, r5) == r3) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                int r0 = r5.label
                r1 = 2
                r2 = 1
                kotlin.coroutines.intrinsics.a r3 = kotlin.coroutines.intrinsics.a.e
                if (r0 == 0) goto L1f
                if (r0 == r2) goto L17
                if (r0 != r1) goto L10
                kotlin.a.e(r6)
                goto L44
            L10:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                net.luminis.tls.engine.impl.c.r(r6)
                r6 = 0
                return r6
            L17:
                java.lang.Object r0 = r5.L$0
                kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
                kotlin.a.e(r6)
                goto L36
            L1f:
                kotlin.a.e(r6)
                java.lang.Object r6 = r5.L$0
                r0 = r6
                kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
                java.lang.Object r6 = r5.L$1
                kotlin.jvm.functions.p r4 = r5.$transform
                r5.L$0 = r0
                r5.label = r2
                java.lang.Object r6 = r4.invoke(r6, r5)
                if (r6 != r3) goto L36
                goto L43
            L36:
                kotlinx.coroutines.flow.Flow r6 = (kotlinx.coroutines.flow.Flow) r6
                r2 = 0
                r5.L$0 = r2
                r5.label = r1
                java.lang.Object r6 = kotlinx.coroutines.flow.FlowKt.emitAll(r0, r6, r5)
                if (r6 != r3) goto L44
            L43:
                return r3
            L44:
                kotlin.y r6 = kotlin.y.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__MergeKt.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public final Object invokeSuspend$$forInline(Object obj) {
            FlowKt.emitAll((FlowCollector) this.L$0, (Flow) this.$transform.invoke(this.L$1, this), this);
            return y.a;
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__MergeKt$mapLatest$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @e(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$mapLatest$1", f = "Merge.kt", l = {213, 213}, m = "invokeSuspend")
    public static final class C00521 extends i implements q {
        final /* synthetic */ p $transform;
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C00521(p pVar, kotlin.coroutines.d<? super C00521> dVar) {
            super(3, dVar);
            this.$transform = pVar;
        }

        @Override // kotlin.jvm.functions.q
        public final Object invoke(FlowCollector<? super R> flowCollector, T t, kotlin.coroutines.d<? super y> dVar) {
            C00521 c00521 = new C00521(this.$transform, dVar);
            c00521.L$0 = flowCollector;
            c00521.L$1 = t;
            return c00521.invokeSuspend(y.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x003f, code lost:
        
            if (r0.emit(r6, r5) == r3) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                int r0 = r5.label
                r1 = 2
                r2 = 1
                kotlin.coroutines.intrinsics.a r3 = kotlin.coroutines.intrinsics.a.e
                if (r0 == 0) goto L1f
                if (r0 == r2) goto L17
                if (r0 != r1) goto L10
                kotlin.a.e(r6)
                goto L42
            L10:
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                net.luminis.tls.engine.impl.c.r(r6)
                r6 = 0
                return r6
            L17:
                java.lang.Object r0 = r5.L$0
                kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
                kotlin.a.e(r6)
                goto L36
            L1f:
                kotlin.a.e(r6)
                java.lang.Object r6 = r5.L$0
                r0 = r6
                kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
                java.lang.Object r6 = r5.L$1
                kotlin.jvm.functions.p r4 = r5.$transform
                r5.L$0 = r0
                r5.label = r2
                java.lang.Object r6 = r4.invoke(r6, r5)
                if (r6 != r3) goto L36
                goto L41
            L36:
                r2 = 0
                r5.L$0 = r2
                r5.label = r1
                java.lang.Object r6 = r0.emit(r6, r5)
                if (r6 != r3) goto L42
            L41:
                return r3
            L42:
                kotlin.y r6 = kotlin.y.a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__MergeKt.C00521.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @ExperimentalCoroutinesApi
    public static final <T, R> Flow<R> flatMapConcat(final Flow<? extends T> flow, final p pVar) {
        return FlowKt.flattenConcat(new Flow<Flow<? extends R>>() { // from class: kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1

            /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ p $transform$inlined;

                /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1$2$1, reason: invalid class name */
                @e(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1$2", f = "Merge.kt", l = {Token.TRUE, Token.TRUE}, m = "emit")
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.c {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(kotlin.coroutines.d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, p pVar) {
                    this.$this_unsafeFlow = flowCollector;
                    this.$transform$inlined = pVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX WARN: Code restructure failed: missing block: B:21:0x0057, code lost:
                
                    if (r7.emit(r8, r0) == r4) goto L22;
                 */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r7, kotlin.coroutines.d r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r8
                        kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1$2$1 r0 = (kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1$2$1 r0 = new kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1$2$1
                        r0.<init>(r8)
                    L18:
                        java.lang.Object r8 = r0.result
                        int r1 = r0.label
                        r2 = 2
                        r3 = 1
                        kotlin.coroutines.intrinsics.a r4 = kotlin.coroutines.intrinsics.a.e
                        if (r1 == 0) goto L39
                        if (r1 == r3) goto L31
                        if (r1 != r2) goto L2a
                        kotlin.a.e(r8)
                        goto L5a
                    L2a:
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        net.luminis.tls.engine.impl.c.r(r7)
                        r7 = 0
                        return r7
                    L31:
                        java.lang.Object r7 = r0.L$0
                        kotlinx.coroutines.flow.FlowCollector r7 = (kotlinx.coroutines.flow.FlowCollector) r7
                        kotlin.a.e(r8)
                        goto L4e
                    L39:
                        kotlin.a.e(r8)
                        kotlinx.coroutines.flow.FlowCollector r8 = r6.$this_unsafeFlow
                        kotlin.jvm.functions.p r1 = r6.$transform$inlined
                        r0.L$0 = r8
                        r0.label = r3
                        java.lang.Object r7 = r1.invoke(r7, r0)
                        if (r7 != r4) goto L4b
                        goto L59
                    L4b:
                        r5 = r8
                        r8 = r7
                        r7 = r5
                    L4e:
                        r1 = 0
                        r0.L$0 = r1
                        r0.label = r2
                        java.lang.Object r7 = r7.emit(r8, r0)
                        if (r7 != r4) goto L5a
                    L59:
                        return r4
                    L5a:
                        kotlin.y r7 = kotlin.y.a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, kotlin.coroutines.d dVar) {
                Object objCollect = flow.collect(new AnonymousClass2(flowCollector, pVar), dVar);
                return objCollect == kotlin.coroutines.intrinsics.a.e ? objCollect : y.a;
            }
        });
    }

    @ExperimentalCoroutinesApi
    public static final <T, R> Flow<R> flatMapLatest(Flow<? extends T> flow, p pVar) {
        return FlowKt.transformLatest(flow, new AnonymousClass1(pVar, null));
    }

    @ExperimentalCoroutinesApi
    public static final <T, R> Flow<R> flatMapMerge(final Flow<? extends T> flow, int i, final p pVar) {
        return FlowKt.flattenMerge(new Flow<Flow<? extends R>>() { // from class: kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1

            /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ p $transform$inlined;

                /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1$2$1, reason: invalid class name */
                @e(c = "kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1$2", f = "Merge.kt", l = {Token.TRUE, Token.TRUE}, m = "emit")
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.c {
                    Object L$0;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(kotlin.coroutines.d dVar) {
                        super(dVar);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    public final Object invokeSuspend(Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, p pVar) {
                    this.$this_unsafeFlow = flowCollector;
                    this.$transform$inlined = pVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                /* JADX WARN: Code restructure failed: missing block: B:21:0x0057, code lost:
                
                    if (r7.emit(r8, r0) == r4) goto L22;
                 */
                @Override // kotlinx.coroutines.flow.FlowCollector
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r7, kotlin.coroutines.d r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r8
                        kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1$2$1 r0 = (kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1$2$1 r0 = new kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1$2$1
                        r0.<init>(r8)
                    L18:
                        java.lang.Object r8 = r0.result
                        int r1 = r0.label
                        r2 = 2
                        r3 = 1
                        kotlin.coroutines.intrinsics.a r4 = kotlin.coroutines.intrinsics.a.e
                        if (r1 == 0) goto L39
                        if (r1 == r3) goto L31
                        if (r1 != r2) goto L2a
                        kotlin.a.e(r8)
                        goto L5a
                    L2a:
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        net.luminis.tls.engine.impl.c.r(r7)
                        r7 = 0
                        return r7
                    L31:
                        java.lang.Object r7 = r0.L$0
                        kotlinx.coroutines.flow.FlowCollector r7 = (kotlinx.coroutines.flow.FlowCollector) r7
                        kotlin.a.e(r8)
                        goto L4e
                    L39:
                        kotlin.a.e(r8)
                        kotlinx.coroutines.flow.FlowCollector r8 = r6.$this_unsafeFlow
                        kotlin.jvm.functions.p r1 = r6.$transform$inlined
                        r0.L$0 = r8
                        r0.label = r3
                        java.lang.Object r7 = r1.invoke(r7, r0)
                        if (r7 != r4) goto L4b
                        goto L59
                    L4b:
                        r5 = r8
                        r8 = r7
                        r7 = r5
                    L4e:
                        r1 = 0
                        r0.L$0 = r1
                        r0.label = r2
                        java.lang.Object r7 = r7.emit(r8, r0)
                        if (r7 != r4) goto L5a
                    L59:
                        return r4
                    L5a:
                        kotlin.y r7 = kotlin.y.a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, kotlin.coroutines.d dVar) {
                Object objCollect = flow.collect(new AnonymousClass2(flowCollector, pVar), dVar);
                return objCollect == kotlin.coroutines.intrinsics.a.e ? objCollect : y.a;
            }
        }, i);
    }

    public static /* synthetic */ Flow flatMapMerge$default(Flow flow, int i, p pVar, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = DEFAULT_CONCURRENCY;
        }
        return FlowKt.flatMapMerge(flow, i, pVar);
    }

    @ExperimentalCoroutinesApi
    public static final <T> Flow<T> flattenConcat(final Flow<? extends Flow<? extends T>> flow) {
        return new Flow<T>() { // from class: kotlinx.coroutines.flow.FlowKt__MergeKt$flattenConcat$$inlined$unsafeFlow$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super T> flowCollector, kotlin.coroutines.d<? super y> dVar) {
                Object objCollect = flow.collect(new FlowKt__MergeKt$flattenConcat$1$1(flowCollector), dVar);
                return objCollect == kotlin.coroutines.intrinsics.a.e ? objCollect : y.a;
            }
        };
    }

    @ExperimentalCoroutinesApi
    public static final <T> Flow<T> flattenMerge(Flow<? extends Flow<? extends T>> flow, int i) {
        if (i <= 0) {
            net.luminis.tls.engine.impl.c.p(androidx.privacysandbox.ads.adservices.java.internal.a.l(i, "Expected positive concurrency level, but had "));
            return null;
        }
        if (i == 1) {
            return FlowKt.flattenConcat(flow);
        }
        return new ChannelFlowMerge(flow, i, null, 0, null, 28, null);
    }

    public static /* synthetic */ Flow flattenMerge$default(Flow flow, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = DEFAULT_CONCURRENCY;
        }
        return FlowKt.flattenMerge(flow, i);
    }

    public static final int getDEFAULT_CONCURRENCY() {
        return DEFAULT_CONCURRENCY;
    }

    @ExperimentalCoroutinesApi
    public static final <T, R> Flow<R> mapLatest(Flow<? extends T> flow, p pVar) {
        return FlowKt.transformLatest(flow, new C00521(pVar, null));
    }

    public static final <T> Flow<T> merge(Flow<? extends T>... flowArr) {
        flowArr.getClass();
        return FlowKt.merge(flowArr.length == 0 ? u.e : new m(flowArr, 0));
    }

    @ExperimentalCoroutinesApi
    public static final <T, R> Flow<R> transformLatest(Flow<? extends T> flow, q qVar) {
        return new ChannelFlowTransformLatest(qVar, flow, null, 0, null, 28, null);
    }

    @FlowPreview
    public static /* synthetic */ void getDEFAULT_CONCURRENCY$annotations() {
    }

    @FlowPreview
    public static /* synthetic */ void getDEFAULT_CONCURRENCY_PROPERTY_NAME$annotations() {
    }

    public static final <T> Flow<T> merge(Iterable<? extends Flow<? extends T>> iterable) {
        return new ChannelLimitedFlowMerge(iterable, null, 0, null, 14, null);
    }
}
