package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.functions.p;
import kotlin.jvm.functions.q;
import kotlin.jvm.functions.r;
import kotlin.jvm.functions.s;
import kotlin.jvm.functions.t;
import kotlin.jvm.functions.u;
import kotlin.jvm.internal.l;
import kotlin.y;
import kotlinx.coroutines.flow.internal.CombineKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class FlowKt__ZipKt {
    public static final <T1, T2, T3, T4, T5, R> Flow<R> combine(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, Flow<? extends T4> flow4, Flow<? extends T5> flow5, final t tVar) {
        final Flow[] flowArr = {flow, flow2, flow3, flow4, flow5};
        return new Flow<R>() { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3

            /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
            @e(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3$2", f = "Zip.kt", l = {259, 258}, m = "invokeSuspend")
            public static final class AnonymousClass2 extends i implements q {
                final /* synthetic */ t $transform$inlined;
                private /* synthetic */ Object L$0;
                /* synthetic */ Object L$1;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(kotlin.coroutines.d dVar, t tVar) {
                    super(3, dVar);
                    this.$transform$inlined = tVar;
                }

                @Override // kotlin.jvm.functions.q
                public final Object invoke(FlowCollector<? super R> flowCollector, Object[] objArr, kotlin.coroutines.d<? super y> dVar) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(dVar, this.$transform$inlined);
                    anonymousClass2.L$0 = flowCollector;
                    anonymousClass2.L$1 = objArr;
                    return anonymousClass2.invokeSuspend(y.a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:14:0x005e, code lost:
                
                    if (r0.emit(r14, r13) == r3) goto L15;
                 */
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.coroutines.jvm.internal.a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r14) {
                    /*
                        r13 = this;
                        int r0 = r13.label
                        r1 = 2
                        r2 = 1
                        kotlin.coroutines.intrinsics.a r3 = kotlin.coroutines.intrinsics.a.e
                        if (r0 == 0) goto L1f
                        if (r0 == r2) goto L17
                        if (r0 != r1) goto L10
                        kotlin.a.e(r14)
                        goto L61
                    L10:
                        java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
                        net.luminis.tls.engine.impl.c.r(r14)
                        r14 = 0
                        return r14
                    L17:
                        java.lang.Object r0 = r13.L$0
                        kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
                        kotlin.a.e(r14)
                        goto L55
                    L1f:
                        kotlin.a.e(r14)
                        java.lang.Object r14 = r13.L$0
                        r0 = r14
                        kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
                        java.lang.Object r14 = r13.L$1
                        java.lang.Object[] r14 = (java.lang.Object[]) r14
                        kotlin.jvm.functions.t r4 = r13.$transform$inlined
                        r5 = 0
                        r7 = r14[r5]
                        r8 = r14[r2]
                        r9 = r14[r1]
                        r5 = 3
                        r10 = r14[r5]
                        r5 = 4
                        r14 = r14[r5]
                        r13.L$0 = r0
                        r13.label = r2
                        r6 = r4
                        androidx.compose.runtime.internal.f r6 = (androidx.compose.runtime.internal.f) r6
                        r6.getClass()
                        r11 = r14
                        androidx.compose.runtime.r r11 = (androidx.compose.runtime.r) r11
                        r14 = r13
                        java.lang.Number r14 = (java.lang.Number) r14
                        int r12 = r14.intValue()
                        java.lang.Object r14 = r6.i(r7, r8, r9, r10, r11, r12)
                        if (r14 != r3) goto L55
                        goto L60
                    L55:
                        r2 = 0
                        r13.L$0 = r2
                        r13.label = r1
                        java.lang.Object r14 = r0.emit(r14, r13)
                        if (r14 != r3) goto L61
                    L60:
                        return r3
                    L61:
                        kotlin.y r14 = kotlin.y.a
                        return r14
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$3.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, kotlin.coroutines.d dVar) {
                Object objCombineInternal = CombineKt.combineInternal(flowCollector, flowArr, new kotlin.jvm.functions.a() { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$nullArrayFactory$1
                    @Override // kotlin.jvm.functions.a
                    public final Void invoke() {
                        return null;
                    }
                }, new AnonymousClass2(null, tVar), dVar);
                return objCombineInternal == kotlin.coroutines.intrinsics.a.e ? objCombineInternal : y.a;
            }
        };
    }

    public static final <T1, T2, T3, T4, T5, R> Flow<R> combineTransform(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, Flow<? extends T4> flow4, Flow<? extends T5> flow5, u uVar) {
        return FlowKt.flow(new FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$5(new Flow[]{flow, flow2, flow3, flow4, flow5}, null, uVar));
    }

    private static final <T, R> Flow<R> combineTransformUnsafe$FlowKt__ZipKt(Flow<? extends T>[] flowArr, q qVar) {
        l.e();
        throw null;
    }

    private static final <T, R> Flow<R> combineUnsafe$FlowKt__ZipKt(Flow<? extends T>[] flowArr, p pVar) {
        l.e();
        throw null;
    }

    public static final <T1, T2, R> Flow<R> flowCombine(final Flow<? extends T1> flow, final Flow<? extends T2> flow2, final q qVar) {
        return new Flow<R>() { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super R> flowCollector, kotlin.coroutines.d<? super y> dVar) {
                Object objCombineInternal = CombineKt.combineInternal(flowCollector, new Flow[]{flow, flow2}, new kotlin.jvm.functions.a() { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$nullArrayFactory$1
                    @Override // kotlin.jvm.functions.a
                    public final Void invoke() {
                        return null;
                    }
                }, new FlowKt__ZipKt$combine$1$1(qVar, null), dVar);
                return objCombineInternal == kotlin.coroutines.intrinsics.a.e ? objCombineInternal : y.a;
            }
        };
    }

    public static final <T1, T2, R> Flow<R> flowCombineTransform(Flow<? extends T1> flow, Flow<? extends T2> flow2, r rVar) {
        return FlowKt.flow(new FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$1(new Flow[]{flow, flow2}, null, rVar));
    }

    public static final <T1, T2, R> Flow<R> zip(Flow<? extends T1> flow, Flow<? extends T2> flow2, q qVar) {
        return CombineKt.zipImpl(flow, flow2, qVar);
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @e(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6", f = "Zip.kt", l = {247}, m = "invokeSuspend")
    public static final class AnonymousClass6 extends i implements p {
        final /* synthetic */ Flow<T>[] $flows;
        final /* synthetic */ q $transform;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
        public static final class AnonymousClass1 implements kotlin.jvm.functions.a {
            final /* synthetic */ Flow<T>[] $flows;

            /* JADX WARN: Multi-variable type inference failed */
            public AnonymousClass1(Flow<? extends T>[] flowArr) {
                this.$flows = flowArr;
            }

            @Override // kotlin.jvm.functions.a
            public final T[] invoke() {
                int length = this.$flows.length;
                l.e();
                throw null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass6(Flow<? extends T>[] flowArr, q qVar, kotlin.coroutines.d<? super AnonymousClass6> dVar) {
            super(2, dVar);
            this.$flows = flowArr;
            this.$transform = qVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<y> create(Object obj, kotlin.coroutines.d<?> dVar) {
            AnonymousClass6 anonymousClass6 = new AnonymousClass6(this.$flows, this.$transform, dVar);
            anonymousClass6.L$0 = obj;
            return anonymousClass6;
        }

        @Override // kotlin.jvm.functions.p
        public final Object invoke(FlowCollector<? super R> flowCollector, kotlin.coroutines.d<? super y> dVar) {
            return ((AnonymousClass6) create(flowCollector, dVar)).invokeSuspend(y.a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                kotlin.a.e(obj);
                l.e();
                throw null;
            }
            if (i == 1) {
                kotlin.a.e(obj);
                return y.a;
            }
            net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }

        public final Object invokeSuspend$$forInline(Object obj) {
            l.e();
            throw null;
        }

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6$2, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
        @e(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$6$2", f = "Zip.kt", l = {247}, m = "invokeSuspend")
        public static final class AnonymousClass2 extends i implements q {
            final /* synthetic */ q $transform;
            private /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(q qVar, kotlin.coroutines.d<? super AnonymousClass2> dVar) {
                super(3, dVar);
                this.$transform = qVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                int i = this.label;
                if (i == 0) {
                    kotlin.a.e(obj);
                    FlowCollector flowCollector = (FlowCollector) this.L$0;
                    Object[] objArr = (Object[]) this.L$1;
                    q qVar = this.$transform;
                    this.L$0 = null;
                    this.label = 1;
                    Object objInvoke = qVar.invoke(flowCollector, objArr, this);
                    kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                    if (objInvoke == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj);
                }
                return y.a;
            }

            public final Object invokeSuspend$$forInline(Object obj) {
                this.$transform.invoke((FlowCollector) this.L$0, (Object[]) this.L$1, this);
                return y.a;
            }

            @Override // kotlin.jvm.functions.q
            public final Object invoke(FlowCollector<? super R> flowCollector, T[] tArr, kotlin.coroutines.d<? super y> dVar) {
                l.e();
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$7, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @e(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$7", f = "Zip.kt", l = {304}, m = "invokeSuspend")
    public static final class AnonymousClass7 extends i implements p {
        final /* synthetic */ Flow<T>[] $flowArray;
        final /* synthetic */ q $transform;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$7$1, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
        public static final class AnonymousClass1 implements kotlin.jvm.functions.a {
            final /* synthetic */ Flow<T>[] $flowArray;

            public AnonymousClass1(Flow<T>[] flowArr) {
                this.$flowArray = flowArr;
            }

            @Override // kotlin.jvm.functions.a
            public final T[] invoke() {
                int length = this.$flowArray.length;
                l.e();
                throw null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass7(Flow<T>[] flowArr, q qVar, kotlin.coroutines.d<? super AnonymousClass7> dVar) {
            super(2, dVar);
            this.$flowArray = flowArr;
            this.$transform = qVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<y> create(Object obj, kotlin.coroutines.d<?> dVar) {
            AnonymousClass7 anonymousClass7 = new AnonymousClass7(this.$flowArray, this.$transform, dVar);
            anonymousClass7.L$0 = obj;
            return anonymousClass7;
        }

        @Override // kotlin.jvm.functions.p
        public final Object invoke(FlowCollector<? super R> flowCollector, kotlin.coroutines.d<? super y> dVar) {
            return ((AnonymousClass7) create(flowCollector, dVar)).invokeSuspend(y.a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                kotlin.a.e(obj);
                l.e();
                throw null;
            }
            if (i == 1) {
                kotlin.a.e(obj);
                return y.a;
            }
            net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }

        public final Object invokeSuspend$$forInline(Object obj) {
            l.e();
            throw null;
        }

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$7$2, reason: invalid class name */
        /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
        @e(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combineTransform$7$2", f = "Zip.kt", l = {304}, m = "invokeSuspend")
        public static final class AnonymousClass2 extends i implements q {
            final /* synthetic */ q $transform;
            private /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(q qVar, kotlin.coroutines.d<? super AnonymousClass2> dVar) {
                super(3, dVar);
                this.$transform = qVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                int i = this.label;
                if (i == 0) {
                    kotlin.a.e(obj);
                    FlowCollector flowCollector = (FlowCollector) this.L$0;
                    Object[] objArr = (Object[]) this.L$1;
                    q qVar = this.$transform;
                    this.L$0 = null;
                    this.label = 1;
                    Object objInvoke = qVar.invoke(flowCollector, objArr, this);
                    kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                    if (objInvoke == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj);
                }
                return y.a;
            }

            public final Object invokeSuspend$$forInline(Object obj) {
                this.$transform.invoke((FlowCollector) this.L$0, (Object[]) this.L$1, this);
                return y.a;
            }

            @Override // kotlin.jvm.functions.q
            public final Object invoke(FlowCollector<? super R> flowCollector, T[] tArr, kotlin.coroutines.d<? super y> dVar) {
                l.e();
                throw null;
            }
        }
    }

    public static final <T1, T2, T3, R> Flow<R> combine(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, final r rVar) {
        final Flow[] flowArr = {flow, flow2, flow3};
        return new Flow<R>() { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1

            /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
            @e(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1$2", f = "Zip.kt", l = {259, 258}, m = "invokeSuspend")
            public static final class AnonymousClass2 extends i implements q {
                final /* synthetic */ r $transform$inlined;
                private /* synthetic */ Object L$0;
                /* synthetic */ Object L$1;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(kotlin.coroutines.d dVar, r rVar) {
                    super(3, dVar);
                    this.$transform$inlined = rVar;
                }

                @Override // kotlin.jvm.functions.q
                public final Object invoke(FlowCollector<? super R> flowCollector, Object[] objArr, kotlin.coroutines.d<? super y> dVar) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(dVar, this.$transform$inlined);
                    anonymousClass2.L$0 = flowCollector;
                    anonymousClass2.L$1 = objArr;
                    return anonymousClass2.invokeSuspend(y.a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
                
                    if (r0.emit(r8, r7) == r3) goto L15;
                 */
                @Override // kotlin.coroutines.jvm.internal.a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                    /*
                        r7 = this;
                        int r0 = r7.label
                        r1 = 2
                        r2 = 1
                        kotlin.coroutines.intrinsics.a r3 = kotlin.coroutines.intrinsics.a.e
                        if (r0 == 0) goto L1f
                        if (r0 == r2) goto L17
                        if (r0 != r1) goto L10
                        kotlin.a.e(r8)
                        goto L4b
                    L10:
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        net.luminis.tls.engine.impl.c.r(r8)
                        r8 = 0
                        return r8
                    L17:
                        java.lang.Object r0 = r7.L$0
                        kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
                        kotlin.a.e(r8)
                        goto L3f
                    L1f:
                        kotlin.a.e(r8)
                        java.lang.Object r8 = r7.L$0
                        r0 = r8
                        kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
                        java.lang.Object r8 = r7.L$1
                        java.lang.Object[] r8 = (java.lang.Object[]) r8
                        kotlin.jvm.functions.r r4 = r7.$transform$inlined
                        r5 = 0
                        r5 = r8[r5]
                        r6 = r8[r2]
                        r8 = r8[r1]
                        r7.L$0 = r0
                        r7.label = r2
                        java.lang.Object r8 = r4.invoke(r5, r6, r8, r7)
                        if (r8 != r3) goto L3f
                        goto L4a
                    L3f:
                        r2 = 0
                        r7.L$0 = r2
                        r7.label = r1
                        java.lang.Object r8 = r0.emit(r8, r7)
                        if (r8 != r3) goto L4b
                    L4a:
                        return r3
                    L4b:
                        kotlin.y r8 = kotlin.y.a
                        return r8
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$1.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, kotlin.coroutines.d dVar) {
                Object objCombineInternal = CombineKt.combineInternal(flowCollector, flowArr, new kotlin.jvm.functions.a() { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$nullArrayFactory$1
                    @Override // kotlin.jvm.functions.a
                    public final Void invoke() {
                        return null;
                    }
                }, new AnonymousClass2(null, rVar), dVar);
                return objCombineInternal == kotlin.coroutines.intrinsics.a.e ? objCombineInternal : y.a;
            }
        };
    }

    public static final <T1, T2, T3, T4, R> Flow<R> combine(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, Flow<? extends T4> flow4, final s sVar) {
        final Flow[] flowArr = {flow, flow2, flow3, flow4};
        return new Flow<R>() { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2

            /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2$2, reason: invalid class name */
            /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
            @e(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2$2", f = "Zip.kt", l = {259, 258}, m = "invokeSuspend")
            public static final class AnonymousClass2 extends i implements q {
                final /* synthetic */ s $transform$inlined;
                private /* synthetic */ Object L$0;
                /* synthetic */ Object L$1;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public AnonymousClass2(kotlin.coroutines.d dVar, s sVar) {
                    super(3, dVar);
                    this.$transform$inlined = sVar;
                }

                @Override // kotlin.jvm.functions.q
                public final Object invoke(FlowCollector<? super R> flowCollector, Object[] objArr, kotlin.coroutines.d<? super y> dVar) {
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2(dVar, this.$transform$inlined);
                    anonymousClass2.L$0 = flowCollector;
                    anonymousClass2.L$1 = objArr;
                    return anonymousClass2.invokeSuspend(y.a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
                
                    if (r0.emit(r11, r10) == r3) goto L15;
                 */
                @Override // kotlin.coroutines.jvm.internal.a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r11) {
                    /*
                        r10 = this;
                        int r0 = r10.label
                        r1 = 2
                        r2 = 1
                        kotlin.coroutines.intrinsics.a r3 = kotlin.coroutines.intrinsics.a.e
                        if (r0 == 0) goto L21
                        if (r0 == r2) goto L18
                        if (r0 != r1) goto L11
                        kotlin.a.e(r11)
                        r9 = r10
                        goto L51
                    L11:
                        java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                        net.luminis.tls.engine.impl.c.r(r11)
                        r11 = 0
                        return r11
                    L18:
                        java.lang.Object r0 = r10.L$0
                        kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
                        kotlin.a.e(r11)
                        r9 = r10
                        goto L45
                    L21:
                        kotlin.a.e(r11)
                        java.lang.Object r11 = r10.L$0
                        r0 = r11
                        kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
                        java.lang.Object r11 = r10.L$1
                        java.lang.Object[] r11 = (java.lang.Object[]) r11
                        kotlin.jvm.functions.s r4 = r10.$transform$inlined
                        r5 = 0
                        r5 = r11[r5]
                        r6 = r11[r2]
                        r7 = r11[r1]
                        r8 = 3
                        r8 = r11[r8]
                        r10.L$0 = r0
                        r10.label = r2
                        r9 = r10
                        java.lang.Object r11 = r4.c(r5, r6, r7, r8, r9)
                        if (r11 != r3) goto L45
                        goto L50
                    L45:
                        r2 = 0
                        r9.L$0 = r2
                        r9.label = r1
                        java.lang.Object r11 = r0.emit(r11, r10)
                        if (r11 != r3) goto L51
                    L50:
                        return r3
                    L51:
                        kotlin.y r11 = kotlin.y.a
                        return r11
                    */
                    throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$combineUnsafe$FlowKt__ZipKt$2.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector flowCollector, kotlin.coroutines.d dVar) {
                Object objCombineInternal = CombineKt.combineInternal(flowCollector, flowArr, new kotlin.jvm.functions.a() { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$nullArrayFactory$1
                    @Override // kotlin.jvm.functions.a
                    public final Void invoke() {
                        return null;
                    }
                }, new AnonymousClass2(null, sVar), dVar);
                return objCombineInternal == kotlin.coroutines.intrinsics.a.e ? objCombineInternal : y.a;
            }
        };
    }

    public static final <T1, T2, R> Flow<R> combine(Flow<? extends T1> flow, Flow<? extends T2> flow2, q qVar) {
        return FlowKt.flowCombine(flow, flow2, qVar);
    }

    public static final <T, R> Flow<R> combine(Flow<? extends T>[] flowArr, p pVar) {
        l.e();
        throw null;
    }

    public static final <T1, T2, T3, R> Flow<R> combineTransform(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, s sVar) {
        return FlowKt.flow(new FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$3(new Flow[]{flow, flow2, flow3}, null, sVar));
    }

    public static final <T, R> Flow<R> combine(Iterable<? extends Flow<? extends T>> iterable, p pVar) {
        l.e();
        throw null;
    }

    public static final <T1, T2, T3, T4, R> Flow<R> combineTransform(Flow<? extends T1> flow, Flow<? extends T2> flow2, Flow<? extends T3> flow3, Flow<? extends T4> flow4, t tVar) {
        return FlowKt.flow(new FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$4(new Flow[]{flow, flow2, flow3, flow4}, null, tVar));
    }

    public static final <T1, T2, R> Flow<R> combineTransform(Flow<? extends T1> flow, Flow<? extends T2> flow2, r rVar) {
        return FlowKt.flow(new FlowKt__ZipKt$combineTransform$$inlined$combineTransformUnsafe$FlowKt__ZipKt$2(new Flow[]{flow, flow2}, null, rVar));
    }

    public static final <T, R> Flow<R> combineTransform(Flow<? extends T>[] flowArr, q qVar) {
        l.e();
        throw null;
    }

    public static final <T, R> Flow<R> combineTransform(Iterable<? extends Flow<? extends T>> iterable, q qVar) {
        l.e();
        throw null;
    }
}
