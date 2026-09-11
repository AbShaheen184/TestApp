package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.functions.p;
import kotlin.jvm.internal.x;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class FlowKt__CountKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__CountKt$count$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @e(c = "kotlinx.coroutines.flow.FlowKt__CountKt", f = "Count.kt", l = {13}, m = "count")
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
            return FlowKt.count(null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__CountKt$count$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @e(c = "kotlinx.coroutines.flow.FlowKt__CountKt", f = "Count.kt", l = {25}, m = "count")
    public static final class AnonymousClass3<T> extends kotlin.coroutines.jvm.internal.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass3(kotlin.coroutines.d<? super AnonymousClass3> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt.count(null, null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__CountKt$count$4, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    public static final class AnonymousClass4<T> implements FlowCollector {
        final /* synthetic */ x $i;
        final /* synthetic */ p $predicate;

        public AnonymousClass4(p pVar, x xVar) {
            this.$predicate = pVar;
            this.$i = xVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(T t, kotlin.coroutines.d<? super y> dVar) {
            FlowKt__CountKt$count$4$emit$1 flowKt__CountKt$count$4$emit$1;
            AnonymousClass4<T> anonymousClass4;
            if (dVar instanceof FlowKt__CountKt$count$4$emit$1) {
                flowKt__CountKt$count$4$emit$1 = (FlowKt__CountKt$count$4$emit$1) dVar;
                int i = flowKt__CountKt$count$4$emit$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    flowKt__CountKt$count$4$emit$1.label = i - Integer.MIN_VALUE;
                } else {
                    flowKt__CountKt$count$4$emit$1 = new FlowKt__CountKt$count$4$emit$1(this, dVar);
                }
            } else {
                flowKt__CountKt$count$4$emit$1 = new FlowKt__CountKt$count$4$emit$1(this, dVar);
            }
            Object objInvoke = flowKt__CountKt$count$4$emit$1.result;
            int i2 = flowKt__CountKt$count$4$emit$1.label;
            if (i2 == 0) {
                kotlin.a.e(objInvoke);
                p pVar = this.$predicate;
                flowKt__CountKt$count$4$emit$1.L$0 = this;
                flowKt__CountKt$count$4$emit$1.label = 1;
                objInvoke = pVar.invoke(t, flowKt__CountKt$count$4$emit$1);
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                if (objInvoke == aVar) {
                    return aVar;
                }
                anonymousClass4 = this;
            } else {
                if (i2 != 1) {
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                anonymousClass4 = (AnonymousClass4) flowKt__CountKt$count$4$emit$1.L$0;
                kotlin.a.e(objInvoke);
            }
            if (((Boolean) objInvoke).booleanValue()) {
                anonymousClass4.$i.e++;
            }
            return y.a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <T> Object count(Flow<? extends T> flow, kotlin.coroutines.d<? super Integer> dVar) {
        AnonymousClass1 anonymousClass1;
        x xVar;
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
            final x xVar2 = new x();
            FlowCollector<? super Object> flowCollector = new FlowCollector() { // from class: kotlinx.coroutines.flow.FlowKt__CountKt.count.2
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(T t, kotlin.coroutines.d<? super y> dVar2) {
                    xVar2.e++;
                    return y.a;
                }
            };
            anonymousClass1.L$0 = xVar2;
            anonymousClass1.label = 1;
            Object objCollect = flow.collect(flowCollector, anonymousClass1);
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
            if (objCollect == aVar) {
                return aVar;
            }
            xVar = xVar2;
        } else {
            if (i2 != 1) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            xVar = (x) anonymousClass1.L$0;
            kotlin.a.e(obj);
        }
        return new Integer(xVar.e);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <T> Object count(Flow<? extends T> flow, p pVar, kotlin.coroutines.d<? super Integer> dVar) {
        AnonymousClass3 anonymousClass3;
        x xVar;
        if (dVar instanceof AnonymousClass3) {
            anonymousClass3 = (AnonymousClass3) dVar;
            int i = anonymousClass3.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass3.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass3 = new AnonymousClass3(dVar);
            }
        } else {
            anonymousClass3 = new AnonymousClass3(dVar);
        }
        Object obj = anonymousClass3.result;
        int i2 = anonymousClass3.label;
        if (i2 == 0) {
            kotlin.a.e(obj);
            x xVar2 = new x();
            FlowCollector<? super Object> anonymousClass4 = new AnonymousClass4<>(pVar, xVar2);
            anonymousClass3.L$0 = xVar2;
            anonymousClass3.label = 1;
            Object objCollect = flow.collect(anonymousClass4, anonymousClass3);
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
            if (objCollect == aVar) {
                return aVar;
            }
            xVar = xVar2;
        } else {
            if (i2 != 1) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            xVar = (x) anonymousClass3.L$0;
            kotlin.a.e(obj);
        }
        return new Integer(xVar.e);
    }
}
