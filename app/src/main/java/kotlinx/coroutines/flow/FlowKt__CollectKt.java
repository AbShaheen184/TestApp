package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.functions.p;
import kotlin.jvm.functions.q;
import kotlin.y;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.internal.NopCollector;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class FlowKt__CollectKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__CollectKt$collect$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    public static final class AnonymousClass3<T> implements FlowCollector<T> {
        final /* synthetic */ p $action;

        public AnonymousClass3(p pVar) {
            this.$action = pVar;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public Object emit(T t, kotlin.coroutines.d<? super y> dVar) {
            Object objInvoke = this.$action.invoke(t, dVar);
            return objInvoke == kotlin.coroutines.intrinsics.a.e ? objInvoke : y.a;
        }

        public Object emit$$forInline(T t, final kotlin.coroutines.d<? super y> dVar) {
            new kotlin.coroutines.jvm.internal.c(dVar) { // from class: kotlinx.coroutines.flow.FlowKt__CollectKt$collect$3$emit$1
                int label;
                /* synthetic */ Object result;

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.result = obj;
                    this.label |= Integer.MIN_VALUE;
                    return this.this$0.emit(null, this);
                }
            };
            this.$action.invoke(t, dVar);
            return y.a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__CollectKt$collectIndexed$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    public static final class AnonymousClass2<T> implements FlowCollector<T> {
        final /* synthetic */ q $action;
        private int index;

        public AnonymousClass2(q qVar) {
            this.$action = qVar;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public Object emit(T t, kotlin.coroutines.d<? super y> dVar) {
            q qVar = this.$action;
            int i = this.index;
            this.index = i + 1;
            if (i < 0) {
                throw new ArithmeticException("Index overflow has happened");
            }
            Object objInvoke = qVar.invoke(new Integer(i), t, dVar);
            return objInvoke == kotlin.coroutines.intrinsics.a.e ? objInvoke : y.a;
        }

        public Object emit$$forInline(T t, final kotlin.coroutines.d<? super y> dVar) {
            new kotlin.coroutines.jvm.internal.c(dVar) { // from class: kotlinx.coroutines.flow.FlowKt__CollectKt$collectIndexed$2$emit$1
                int label;
                /* synthetic */ Object result;

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.result = obj;
                    this.label |= Integer.MIN_VALUE;
                    return this.this$0.emit(null, this);
                }
            };
            q qVar = this.$action;
            int i = this.index;
            this.index = i + 1;
            if (i < 0) {
                throw new ArithmeticException("Index overflow has happened");
            }
            qVar.invoke(Integer.valueOf(i), t, dVar);
            return y.a;
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__CollectKt$launchIn$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @e(c = "kotlinx.coroutines.flow.FlowKt__CollectKt$launchIn$1", f = "Collect.kt", l = {Token.STRING}, m = "invokeSuspend")
    public static final class AnonymousClass1 extends i implements p {
        final /* synthetic */ Flow<T> $this_launchIn;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass1(Flow<? extends T> flow, kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.$this_launchIn = flow;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<y> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new AnonymousClass1(this.$this_launchIn, dVar);
        }

        @Override // kotlin.jvm.functions.p
        public final Object invoke(CoroutineScope coroutineScope, kotlin.coroutines.d<? super y> dVar) {
            return ((AnonymousClass1) create(coroutineScope, dVar)).invokeSuspend(y.a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            int i = this.label;
            if (i == 0) {
                kotlin.a.e(obj);
                Flow<T> flow = this.$this_launchIn;
                this.label = 1;
                Object objCollect = FlowKt.collect(flow, this);
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                if (objCollect == aVar) {
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
    }

    @kotlin.c
    public static final <T> Object collect(Flow<? extends T> flow, p pVar, kotlin.coroutines.d<? super y> dVar) {
        Object objCollect = flow.collect(new AnonymousClass3(pVar), dVar);
        return objCollect == kotlin.coroutines.intrinsics.a.e ? objCollect : y.a;
    }

    @kotlin.c
    private static final /* synthetic */ <T> Object collect$$forInline(Flow<? extends T> flow, p pVar, kotlin.coroutines.d<? super y> dVar) {
        flow.collect(new AnonymousClass3(pVar), dVar);
        return y.a;
    }

    public static final <T> Object collectIndexed(Flow<? extends T> flow, q qVar, kotlin.coroutines.d<? super y> dVar) {
        Object objCollect = flow.collect(new AnonymousClass2(qVar), dVar);
        return objCollect == kotlin.coroutines.intrinsics.a.e ? objCollect : y.a;
    }

    private static final <T> Object collectIndexed$$forInline(Flow<? extends T> flow, q qVar, kotlin.coroutines.d<? super y> dVar) {
        flow.collect(new AnonymousClass2(qVar), dVar);
        return y.a;
    }

    public static final <T> Object collectLatest(Flow<? extends T> flow, p pVar, kotlin.coroutines.d<? super y> dVar) {
        Object objCollect = FlowKt.collect(FlowKt__ContextKt.buffer$default(FlowKt.mapLatest(flow, pVar), 0, null, 2, null), dVar);
        return objCollect == kotlin.coroutines.intrinsics.a.e ? objCollect : y.a;
    }

    public static final <T> Object emitAll(FlowCollector<? super T> flowCollector, Flow<? extends T> flow, kotlin.coroutines.d<? super y> dVar) {
        FlowKt.ensureActive(flowCollector);
        Object objCollect = flow.collect(flowCollector, dVar);
        return objCollect == kotlin.coroutines.intrinsics.a.e ? objCollect : y.a;
    }

    public static final <T> Job launchIn(Flow<? extends T> flow, CoroutineScope coroutineScope) {
        return BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(flow, null), 3, null);
    }

    public static final Object collect(Flow<?> flow, kotlin.coroutines.d<? super y> dVar) {
        Object objCollect = flow.collect(NopCollector.INSTANCE, dVar);
        return objCollect == kotlin.coroutines.intrinsics.a.e ? objCollect : y.a;
    }
}
