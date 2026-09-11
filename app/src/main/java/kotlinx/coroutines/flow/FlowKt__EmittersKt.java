package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.functions.p;
import kotlin.jvm.functions.q;
import kotlin.y;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class FlowKt__EmittersKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @e(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1", f = "Emitters.kt", l = {Token.GETPROPNOWARN_SUPER}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends i implements p {
        final /* synthetic */ Flow<T> $this_transform;
        final /* synthetic */ q $transform;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1, reason: invalid class name and collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
        public static final class C00011<T> implements FlowCollector {
            final /* synthetic */ FlowCollector<R> $$this$flow;
            final /* synthetic */ q $transform;

            /* JADX WARN: Multi-variable type inference failed */
            public C00011(q qVar, FlowCollector<? super R> flowCollector) {
                this.$transform = qVar;
                this.$$this$flow = flowCollector;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(T t, kotlin.coroutines.d<? super y> dVar) {
                FlowKt__EmittersKt$transform$1$1$emit$1 flowKt__EmittersKt$transform$1$1$emit$1;
                if (dVar instanceof FlowKt__EmittersKt$transform$1$1$emit$1) {
                    flowKt__EmittersKt$transform$1$1$emit$1 = (FlowKt__EmittersKt$transform$1$1$emit$1) dVar;
                    int i = flowKt__EmittersKt$transform$1$1$emit$1.label;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        flowKt__EmittersKt$transform$1$1$emit$1.label = i - Integer.MIN_VALUE;
                    } else {
                        flowKt__EmittersKt$transform$1$1$emit$1 = new FlowKt__EmittersKt$transform$1$1$emit$1(this, dVar);
                    }
                } else {
                    flowKt__EmittersKt$transform$1$1$emit$1 = new FlowKt__EmittersKt$transform$1$1$emit$1(this, dVar);
                }
                Object obj = flowKt__EmittersKt$transform$1$1$emit$1.result;
                int i2 = flowKt__EmittersKt$transform$1$1$emit$1.label;
                if (i2 == 0) {
                    kotlin.a.e(obj);
                    q qVar = this.$transform;
                    Object obj2 = this.$$this$flow;
                    flowKt__EmittersKt$transform$1$1$emit$1.label = 1;
                    Object objInvoke = qVar.invoke(obj2, t, flowKt__EmittersKt$transform$1$1$emit$1);
                    kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                    if (objInvoke == aVar) {
                        return aVar;
                    }
                } else {
                    if (i2 != 1) {
                        net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj);
                }
                return y.a;
            }

            public final Object emit$$forInline(T t, kotlin.coroutines.d<? super y> dVar) {
                new FlowKt__EmittersKt$transform$1$1$emit$1(this, dVar);
                this.$transform.invoke(this.$$this$flow, t, dVar);
                return y.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Flow<? extends T> flow, q qVar, kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$this_transform = flow;
            this.$transform = qVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<y> create(Object obj, kotlin.coroutines.d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_transform, this.$transform, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.p
        public final Object invoke(FlowCollector<? super R> flowCollector, kotlin.coroutines.d<? super y> dVar) {
            return ((AnonymousClass1) create(flowCollector, dVar)).invokeSuspend(y.a);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.d to kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1 for r4v1 'this'  kotlin.coroutines.d
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
                if (r0 == 0) goto L12
                if (r0 != r1) goto Lb
                kotlin.a.e(r5)
                goto L2d
            Lb:
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                net.luminis.tls.engine.impl.c.r(r5)
                r5 = 0
                return r5
            L12:
                kotlin.a.e(r5)
                java.lang.Object r5 = r4.L$0
                kotlinx.coroutines.flow.FlowCollector r5 = (kotlinx.coroutines.flow.FlowCollector) r5
                kotlinx.coroutines.flow.Flow<T> r0 = r4.$this_transform
                kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1 r2 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1
                kotlin.jvm.functions.q r3 = r4.$transform
                r2.<init>(r3, r5)
                r4.label = r1
                java.lang.Object r5 = r0.collect(r2, r4)
                kotlin.coroutines.intrinsics.a r0 = kotlin.coroutines.intrinsics.a.e
                if (r5 != r0) goto L2d
                return r0
            L2d:
                kotlin.y r5 = kotlin.y.a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__EmittersKt.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.d to kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1 for r3v1 'this'  kotlin.coroutines.d
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        public final java.lang.Object invokeSuspend$$forInline(java.lang.Object r4) {
            /*
                r3 = this;
                java.lang.Object r4 = r3.L$0
                kotlinx.coroutines.flow.FlowCollector r4 = (kotlinx.coroutines.flow.FlowCollector) r4
                kotlinx.coroutines.flow.Flow<T> r0 = r3.$this_transform
                kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1 r1 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$transform$1$1
                kotlin.jvm.functions.q r2 = r3.$transform
                r1.<init>(r2, r4)
                r0.collect(r1, r3)
                kotlin.y r4 = kotlin.y.a
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__EmittersKt.AnonymousClass1.invokeSuspend$$forInline(java.lang.Object):java.lang.Object");
        }
    }

    public static final void ensureActive(FlowCollector<?> flowCollector) {
        if (flowCollector instanceof ThrowingCollector) {
            throw ((ThrowingCollector) flowCollector).e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <T> Object invokeSafely$FlowKt__EmittersKt(FlowCollector<? super T> flowCollector, q qVar, Throwable th, kotlin.coroutines.d<? super y> dVar) {
        FlowKt__EmittersKt$invokeSafely$1 flowKt__EmittersKt$invokeSafely$1;
        if (dVar instanceof FlowKt__EmittersKt$invokeSafely$1) {
            flowKt__EmittersKt$invokeSafely$1 = (FlowKt__EmittersKt$invokeSafely$1) dVar;
            int i = flowKt__EmittersKt$invokeSafely$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                flowKt__EmittersKt$invokeSafely$1.label = i - Integer.MIN_VALUE;
            } else {
                flowKt__EmittersKt$invokeSafely$1 = new FlowKt__EmittersKt$invokeSafely$1(dVar);
            }
        } else {
            flowKt__EmittersKt$invokeSafely$1 = new FlowKt__EmittersKt$invokeSafely$1(dVar);
        }
        Object obj = flowKt__EmittersKt$invokeSafely$1.result;
        int i2 = flowKt__EmittersKt$invokeSafely$1.label;
        try {
            if (i2 == 0) {
                kotlin.a.e(obj);
                flowKt__EmittersKt$invokeSafely$1.L$0 = th;
                flowKt__EmittersKt$invokeSafely$1.label = 1;
                Object objInvoke = qVar.invoke(flowCollector, th, flowKt__EmittersKt$invokeSafely$1);
                Object obj2 = kotlin.coroutines.intrinsics.a.e;
                if (objInvoke == obj2) {
                    return obj2;
                }
            } else {
                if (i2 != 1) {
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                th = (Throwable) flowKt__EmittersKt$invokeSafely$1.L$0;
                kotlin.a.e(obj);
            }
            return y.a;
        } catch (Throwable th2) {
            if (th != null && th != th2) {
                kotlin.a.a(th2, th);
            }
            throw th2;
        }
    }

    public static final <T> Flow<T> onCompletion(Flow<? extends T> flow, q qVar) {
        return new FlowKt__EmittersKt$onCompletion$$inlined$unsafeFlow$1(flow, qVar);
    }

    public static final <T> Flow<T> onEmpty(Flow<? extends T> flow, p pVar) {
        return new FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1(flow, pVar);
    }

    public static final <T> Flow<T> onStart(Flow<? extends T> flow, p pVar) {
        return new FlowKt__EmittersKt$onStart$$inlined$unsafeFlow$1(pVar, flow);
    }

    public static final <T, R> Flow<R> transform(Flow<? extends T> flow, q qVar) {
        return FlowKt.flow(new AnonymousClass1(flow, qVar, null));
    }

    public static final <T, R> Flow<R> unsafeTransform(Flow<? extends T> flow, q qVar) {
        return new FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1(flow, qVar);
    }
}
