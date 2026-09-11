package kotlinx.coroutines.flow;

import androidx.transition.k;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.functions.p;
import kotlin.jvm.functions.q;
import kotlin.jvm.internal.z;
import kotlin.y;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import kotlinx.coroutines.flow.internal.FlowExceptions_commonKt;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;
import kotlinx.coroutines.internal.Symbol;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class FlowKt__ReduceKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$first$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @e(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {Token.YIELD_STAR}, m = "first")
    public static final class AnonymousClass1<T> extends kotlin.coroutines.jvm.internal.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt.first(null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$first$3, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @e(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {Token.YIELD_STAR}, m = "first")
    public static final class AnonymousClass3<T> extends kotlin.coroutines.jvm.internal.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass3(kotlin.coroutines.d<? super AnonymousClass3> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt.first(null, null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @e(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {Token.YIELD_STAR}, m = "firstOrNull")
    public static final class C00541<T> extends kotlin.coroutines.jvm.internal.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C00541(kotlin.coroutines.d<? super C00541> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt.firstOrNull(null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$3, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @e(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {Token.YIELD_STAR}, m = "firstOrNull")
    public static final class C00553<T> extends kotlin.coroutines.jvm.internal.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C00553(kotlin.coroutines.d<? super C00553> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt.firstOrNull(null, null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @e(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {Token.GETELEM_SUPER}, m = "fold")
    public static final class C00561<T, R> extends kotlin.coroutines.jvm.internal.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C00561(kotlin.coroutines.d<? super C00561> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt__ReduceKt.fold(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$fold$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    public static final class AnonymousClass2<T> implements FlowCollector {
        final /* synthetic */ z $accumulator;
        final /* synthetic */ q $operation;

        public AnonymousClass2(z zVar, q qVar) {
            this.$accumulator = zVar;
            this.$operation = qVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(T t, kotlin.coroutines.d<? super y> dVar) {
            FlowKt__ReduceKt$fold$2$emit$1 flowKt__ReduceKt$fold$2$emit$1;
            z zVar;
            if (dVar instanceof FlowKt__ReduceKt$fold$2$emit$1) {
                flowKt__ReduceKt$fold$2$emit$1 = (FlowKt__ReduceKt$fold$2$emit$1) dVar;
                int i = flowKt__ReduceKt$fold$2$emit$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    flowKt__ReduceKt$fold$2$emit$1.label = i - Integer.MIN_VALUE;
                } else {
                    flowKt__ReduceKt$fold$2$emit$1 = new FlowKt__ReduceKt$fold$2$emit$1(this, dVar);
                }
            } else {
                flowKt__ReduceKt$fold$2$emit$1 = new FlowKt__ReduceKt$fold$2$emit$1(this, dVar);
            }
            Object obj = flowKt__ReduceKt$fold$2$emit$1.result;
            int i2 = flowKt__ReduceKt$fold$2$emit$1.label;
            if (i2 == 0) {
                kotlin.a.e(obj);
                z zVar2 = this.$accumulator;
                q qVar = this.$operation;
                Object obj2 = zVar2.e;
                flowKt__ReduceKt$fold$2$emit$1.L$0 = zVar2;
                flowKt__ReduceKt$fold$2$emit$1.label = 1;
                Object objInvoke = qVar.invoke(obj2, t, flowKt__ReduceKt$fold$2$emit$1);
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                if (objInvoke == aVar) {
                    return aVar;
                }
                obj = objInvoke;
                zVar = zVar2;
            } else {
                if (i2 != 1) {
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                zVar = (z) flowKt__ReduceKt$fold$2$emit$1.L$0;
                kotlin.a.e(obj);
            }
            zVar.e = obj;
            return y.a;
        }

        public final Object emit$$forInline(T t, kotlin.coroutines.d<? super y> dVar) {
            new FlowKt__ReduceKt$fold$2$emit$1(this, dVar);
            z zVar = this.$accumulator;
            zVar.e = this.$operation.invoke(zVar.e, t, dVar);
            return y.a;
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$last$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @e(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {Token.TYPEOFNAME}, m = "last")
    public static final class C00571<T> extends kotlin.coroutines.jvm.internal.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C00571(kotlin.coroutines.d<? super C00571> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt.last(null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$lastOrNull$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @e(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {Token.TO_OBJECT}, m = "lastOrNull")
    public static final class C00591<T> extends kotlin.coroutines.jvm.internal.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C00591(kotlin.coroutines.d<? super C00591> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt.lastOrNull(null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$reduce$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @e(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {18}, m = "reduce")
    public static final class C00611<S, T extends S> extends kotlin.coroutines.jvm.internal.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C00611(kotlin.coroutines.d<? super C00611> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt.reduce(null, null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$reduce$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    public static final class C00622<T> implements FlowCollector {
        final /* synthetic */ z $accumulator;
        final /* synthetic */ q $operation;

        public C00622(z zVar, q qVar) {
            this.$accumulator = zVar;
            this.$operation = qVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(T t, kotlin.coroutines.d<? super y> dVar) {
            FlowKt__ReduceKt$reduce$2$emit$1 flowKt__ReduceKt$reduce$2$emit$1;
            z zVar;
            z zVar2;
            if (dVar instanceof FlowKt__ReduceKt$reduce$2$emit$1) {
                flowKt__ReduceKt$reduce$2$emit$1 = (FlowKt__ReduceKt$reduce$2$emit$1) dVar;
                int i = flowKt__ReduceKt$reduce$2$emit$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    flowKt__ReduceKt$reduce$2$emit$1.label = i - Integer.MIN_VALUE;
                } else {
                    flowKt__ReduceKt$reduce$2$emit$1 = new FlowKt__ReduceKt$reduce$2$emit$1(this, dVar);
                }
            } else {
                flowKt__ReduceKt$reduce$2$emit$1 = new FlowKt__ReduceKt$reduce$2$emit$1(this, dVar);
            }
            Object obj = flowKt__ReduceKt$reduce$2$emit$1.result;
            int i2 = flowKt__ReduceKt$reduce$2$emit$1.label;
            if (i2 == 0) {
                kotlin.a.e(obj);
                zVar = this.$accumulator;
                Object obj2 = zVar.e;
                if (obj2 != NullSurrogateKt.NULL) {
                    q qVar = this.$operation;
                    flowKt__ReduceKt$reduce$2$emit$1.L$0 = zVar;
                    flowKt__ReduceKt$reduce$2$emit$1.label = 1;
                    Object objInvoke = qVar.invoke(obj2, t, flowKt__ReduceKt$reduce$2$emit$1);
                    kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                    if (objInvoke == aVar) {
                        return aVar;
                    }
                    obj = objInvoke;
                    zVar2 = zVar;
                }
                zVar.e = t;
                return y.a;
            }
            if (i2 != 1) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            zVar2 = (z) flowKt__ReduceKt$reduce$2$emit$1.L$0;
            kotlin.a.e(obj);
            Object obj3 = obj;
            zVar = zVar2;
            t = (T) obj3;
            zVar.e = t;
            return y.a;
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$single$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @e(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {Token.REGEXP}, m = "single")
    public static final class C00631<T> extends kotlin.coroutines.jvm.internal.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C00631(kotlin.coroutines.d<? super C00631> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt.single(null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$singleOrNull$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @e(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", f = "Reduce.kt", l = {Token.YIELD_STAR}, m = "singleOrNull")
    public static final class C00651<T> extends kotlin.coroutines.jvm.internal.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C00651(kotlin.coroutines.d<? super C00651> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt.singleOrNull(null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <T> Object first(Flow<? extends T> flow, p pVar, kotlin.coroutines.d<? super T> dVar) {
        AnonymousClass3 anonymousClass3;
        z zVar;
        AbortFlowException e;
        FlowCollector<? super Object> flowCollector;
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
            z zVar2 = new z();
            zVar2.e = NullSurrogateKt.NULL;
            FlowCollector<? super Object> flowKt__ReduceKt$first$$inlined$collectWhile$2 = new FlowKt__ReduceKt$first$$inlined$collectWhile$2<>(pVar, zVar2);
            try {
                anonymousClass3.L$0 = zVar2;
                anonymousClass3.L$1 = flowKt__ReduceKt$first$$inlined$collectWhile$2;
                anonymousClass3.label = 1;
                Object objCollect = flow.collect(flowKt__ReduceKt$first$$inlined$collectWhile$2, anonymousClass3);
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                if (objCollect == aVar) {
                    return aVar;
                }
                zVar = zVar2;
            } catch (AbortFlowException e2) {
                zVar = zVar2;
                e = e2;
                flowCollector = flowKt__ReduceKt$first$$inlined$collectWhile$2;
                FlowExceptions_commonKt.checkOwnership(e, flowCollector);
                JobKt.ensureActive(anonymousClass3.getContext());
            }
        } else {
            if (i2 != 1) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            flowCollector = (FlowKt__ReduceKt$first$$inlined$collectWhile$2) anonymousClass3.L$1;
            zVar = (z) anonymousClass3.L$0;
            try {
                kotlin.a.e(obj);
            } catch (AbortFlowException e3) {
                e = e3;
                FlowExceptions_commonKt.checkOwnership(e, flowCollector);
                JobKt.ensureActive(anonymousClass3.getContext());
            }
        }
        Object obj2 = zVar.e;
        if (obj2 != NullSurrogateKt.NULL) {
            return obj2;
        }
        k.m("Expected at least one element matching the predicate");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <T> Object firstOrNull(Flow<? extends T> flow, p pVar, kotlin.coroutines.d<? super T> dVar) {
        C00553 c00553;
        z zVar;
        AbortFlowException e;
        FlowCollector<? super Object> flowCollector;
        if (dVar instanceof C00553) {
            c00553 = (C00553) dVar;
            int i = c00553.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c00553.label = i - Integer.MIN_VALUE;
            } else {
                c00553 = new C00553(dVar);
            }
        } else {
            c00553 = new C00553(dVar);
        }
        Object obj = c00553.result;
        int i2 = c00553.label;
        if (i2 == 0) {
            kotlin.a.e(obj);
            z zVar2 = new z();
            FlowCollector<? super Object> flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2 = new FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2<>(pVar, zVar2);
            try {
                c00553.L$0 = zVar2;
                c00553.L$1 = flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2;
                c00553.label = 1;
                Object objCollect = flow.collect(flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2, c00553);
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                if (objCollect == aVar) {
                    return aVar;
                }
                zVar = zVar2;
            } catch (AbortFlowException e2) {
                zVar = zVar2;
                e = e2;
                flowCollector = flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2;
                FlowExceptions_commonKt.checkOwnership(e, flowCollector);
                JobKt.ensureActive(c00553.getContext());
            }
        } else {
            if (i2 != 1) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            flowCollector = (FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2) c00553.L$1;
            zVar = (z) c00553.L$0;
            try {
                kotlin.a.e(obj);
            } catch (AbortFlowException e3) {
                e = e3;
                FlowExceptions_commonKt.checkOwnership(e, flowCollector);
                JobKt.ensureActive(c00553.getContext());
            }
        }
        return zVar.e;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <T, R> Object fold(Flow<? extends T> flow, R r, q qVar, kotlin.coroutines.d<? super R> dVar) {
        C00561 c00561;
        z zVar;
        if (dVar instanceof C00561) {
            c00561 = (C00561) dVar;
            int i = c00561.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c00561.label = i - Integer.MIN_VALUE;
            } else {
                c00561 = new C00561(dVar);
            }
        } else {
            c00561 = new C00561(dVar);
        }
        Object obj = c00561.result;
        int i2 = c00561.label;
        if (i2 == 0) {
            kotlin.a.e(obj);
            z zVar2 = new z();
            zVar2.e = r;
            FlowCollector<? super Object> anonymousClass2 = new AnonymousClass2<>(zVar2, qVar);
            c00561.L$0 = zVar2;
            c00561.label = 1;
            Object objCollect = flow.collect(anonymousClass2, c00561);
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
            if (objCollect == aVar) {
                return aVar;
            }
            zVar = zVar2;
        } else {
            if (i2 != 1) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            zVar = (z) c00561.L$0;
            kotlin.a.e(obj);
        }
        return zVar.e;
    }

    private static final <T, R> Object fold$$forInline(Flow<? extends T> flow, R r, q qVar, kotlin.coroutines.d<? super R> dVar) {
        z zVar = new z();
        zVar.e = r;
        flow.collect(new AnonymousClass2(zVar, qVar), dVar);
        return zVar.e;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <T> Object last(Flow<? extends T> flow, kotlin.coroutines.d<? super T> dVar) {
        C00571 c00571;
        z zVar;
        if (dVar instanceof C00571) {
            c00571 = (C00571) dVar;
            int i = c00571.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c00571.label = i - Integer.MIN_VALUE;
            } else {
                c00571 = new C00571(dVar);
            }
        } else {
            c00571 = new C00571(dVar);
        }
        Object obj = c00571.result;
        int i2 = c00571.label;
        if (i2 == 0) {
            kotlin.a.e(obj);
            final z zVar2 = new z();
            zVar2.e = NullSurrogateKt.NULL;
            FlowCollector<? super Object> flowCollector = new FlowCollector() { // from class: kotlinx.coroutines.flow.FlowKt__ReduceKt.last.2
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(T t, kotlin.coroutines.d<? super y> dVar2) {
                    zVar2.e = t;
                    return y.a;
                }
            };
            c00571.L$0 = zVar2;
            c00571.label = 1;
            Object objCollect = flow.collect(flowCollector, c00571);
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
            if (objCollect == aVar) {
                return aVar;
            }
            zVar = zVar2;
        } else {
            if (i2 != 1) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            zVar = (z) c00571.L$0;
            kotlin.a.e(obj);
        }
        Object obj2 = zVar.e;
        if (obj2 != NullSurrogateKt.NULL) {
            return obj2;
        }
        k.m("Expected at least one element");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <T> Object lastOrNull(Flow<? extends T> flow, kotlin.coroutines.d<? super T> dVar) {
        C00591 c00591;
        z zVar;
        if (dVar instanceof C00591) {
            c00591 = (C00591) dVar;
            int i = c00591.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c00591.label = i - Integer.MIN_VALUE;
            } else {
                c00591 = new C00591(dVar);
            }
        } else {
            c00591 = new C00591(dVar);
        }
        Object obj = c00591.result;
        int i2 = c00591.label;
        if (i2 == 0) {
            kotlin.a.e(obj);
            final z zVar2 = new z();
            FlowCollector<? super Object> flowCollector = new FlowCollector() { // from class: kotlinx.coroutines.flow.FlowKt__ReduceKt.lastOrNull.2
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(T t, kotlin.coroutines.d<? super y> dVar2) {
                    zVar2.e = t;
                    return y.a;
                }
            };
            c00591.L$0 = zVar2;
            c00591.label = 1;
            Object objCollect = flow.collect(flowCollector, c00591);
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
            if (objCollect == aVar) {
                return aVar;
            }
            zVar = zVar2;
        } else {
            if (i2 != 1) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            zVar = (z) c00591.L$0;
            kotlin.a.e(obj);
        }
        return zVar.e;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <S, T extends S> Object reduce(Flow<? extends T> flow, q qVar, kotlin.coroutines.d<? super S> dVar) {
        C00611 c00611;
        z zVar;
        if (dVar instanceof C00611) {
            c00611 = (C00611) dVar;
            int i = c00611.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c00611.label = i - Integer.MIN_VALUE;
            } else {
                c00611 = new C00611(dVar);
            }
        } else {
            c00611 = new C00611(dVar);
        }
        Object obj = c00611.result;
        int i2 = c00611.label;
        if (i2 == 0) {
            kotlin.a.e(obj);
            z zVar2 = new z();
            zVar2.e = NullSurrogateKt.NULL;
            FlowCollector<? super Object> c00622 = new C00622<>(zVar2, qVar);
            c00611.L$0 = zVar2;
            c00611.label = 1;
            Object objCollect = flow.collect(c00622, c00611);
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
            if (objCollect == aVar) {
                return aVar;
            }
            zVar = zVar2;
        } else {
            if (i2 != 1) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            zVar = (z) c00611.L$0;
            kotlin.a.e(obj);
        }
        Object obj2 = zVar.e;
        if (obj2 != NullSurrogateKt.NULL) {
            return obj2;
        }
        k.m("Empty flow can't be reduced");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <T> Object single(Flow<? extends T> flow, kotlin.coroutines.d<? super T> dVar) {
        C00631 c00631;
        z zVar;
        if (dVar instanceof C00631) {
            c00631 = (C00631) dVar;
            int i = c00631.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c00631.label = i - Integer.MIN_VALUE;
            } else {
                c00631 = new C00631(dVar);
            }
        } else {
            c00631 = new C00631(dVar);
        }
        Object obj = c00631.result;
        int i2 = c00631.label;
        if (i2 == 0) {
            kotlin.a.e(obj);
            final z zVar2 = new z();
            zVar2.e = NullSurrogateKt.NULL;
            FlowCollector<? super Object> flowCollector = new FlowCollector() { // from class: kotlinx.coroutines.flow.FlowKt__ReduceKt.single.2
                @Override // kotlinx.coroutines.flow.FlowCollector
                public final Object emit(T t, kotlin.coroutines.d<? super y> dVar2) {
                    z zVar3 = zVar2;
                    if (zVar3.e == NullSurrogateKt.NULL) {
                        zVar3.e = t;
                        return y.a;
                    }
                    net.luminis.tls.engine.impl.c.o("Flow has more than one element");
                    return null;
                }
            };
            c00631.L$0 = zVar2;
            c00631.label = 1;
            Object objCollect = flow.collect(flowCollector, c00631);
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
            if (objCollect == aVar) {
                return aVar;
            }
            zVar = zVar2;
        } else {
            if (i2 != 1) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            zVar = (z) c00631.L$0;
            kotlin.a.e(obj);
        }
        Object obj2 = zVar.e;
        if (obj2 != NullSurrogateKt.NULL) {
            return obj2;
        }
        k.m("Flow is empty");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <T> Object singleOrNull(Flow<? extends T> flow, kotlin.coroutines.d<? super T> dVar) {
        C00651 c00651;
        final z zVar;
        AbortFlowException e;
        FlowCollector<T> flowCollector;
        if (dVar instanceof C00651) {
            c00651 = (C00651) dVar;
            int i = c00651.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c00651.label = i - Integer.MIN_VALUE;
            } else {
                c00651 = new C00651(dVar);
            }
        } else {
            c00651 = new C00651(dVar);
        }
        Object obj = c00651.result;
        int i2 = c00651.label;
        if (i2 == 0) {
            kotlin.a.e(obj);
            zVar = new z();
            zVar.e = NullSurrogateKt.NULL;
            FlowCollector<T> flowCollector2 = new FlowCollector<T>() { // from class: kotlinx.coroutines.flow.FlowKt__ReduceKt$singleOrNull$$inlined$collectWhile$1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public Object emit(T t, kotlin.coroutines.d<? super y> dVar2) {
                    z zVar2 = zVar;
                    Object obj2 = zVar2.e;
                    Symbol symbol = NullSurrogateKt.NULL;
                    if (obj2 == symbol) {
                        zVar2.e = t;
                        return y.a;
                    }
                    zVar2.e = symbol;
                    throw new AbortFlowException(this);
                }
            };
            try {
                c00651.L$0 = zVar;
                c00651.L$1 = flowCollector2;
                c00651.label = 1;
                Object objCollect = flow.collect(flowCollector2, c00651);
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                if (objCollect == aVar) {
                    return aVar;
                }
            } catch (AbortFlowException e2) {
                e = e2;
                flowCollector = flowCollector2;
                FlowExceptions_commonKt.checkOwnership(e, flowCollector);
                JobKt.ensureActive(c00651.getContext());
            }
        } else {
            if (i2 != 1) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            flowCollector = (FlowKt__ReduceKt$singleOrNull$$inlined$collectWhile$1) c00651.L$1;
            zVar = (z) c00651.L$0;
            try {
                kotlin.a.e(obj);
            } catch (AbortFlowException e3) {
                e = e3;
                FlowExceptions_commonKt.checkOwnership(e, flowCollector);
                JobKt.ensureActive(c00651.getContext());
            }
        }
        Object obj2 = zVar.e;
        if (obj2 == NullSurrogateKt.NULL) {
            return null;
        }
        return obj2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <T> Object firstOrNull(Flow<? extends T> flow, kotlin.coroutines.d<? super T> dVar) {
        C00541 c00541;
        final z zVar;
        AbortFlowException e;
        FlowCollector<T> flowCollector;
        if (dVar instanceof C00541) {
            c00541 = (C00541) dVar;
            int i = c00541.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c00541.label = i - Integer.MIN_VALUE;
            } else {
                c00541 = new C00541(dVar);
            }
        } else {
            c00541 = new C00541(dVar);
        }
        Object obj = c00541.result;
        int i2 = c00541.label;
        if (i2 == 0) {
            kotlin.a.e(obj);
            zVar = new z();
            FlowCollector<T> flowCollector2 = new FlowCollector<T>() { // from class: kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public Object emit(T t, kotlin.coroutines.d<? super y> dVar2) {
                    zVar.e = t;
                    throw new AbortFlowException(this);
                }
            };
            try {
                c00541.L$0 = zVar;
                c00541.L$1 = flowCollector2;
                c00541.label = 1;
                Object objCollect = flow.collect(flowCollector2, c00541);
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                if (objCollect == aVar) {
                    return aVar;
                }
            } catch (AbortFlowException e2) {
                e = e2;
                flowCollector = flowCollector2;
                FlowExceptions_commonKt.checkOwnership(e, flowCollector);
                JobKt.ensureActive(c00541.getContext());
            }
        } else {
            if (i2 != 1) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            flowCollector = (FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$1) c00541.L$1;
            zVar = (z) c00541.L$0;
            try {
                kotlin.a.e(obj);
            } catch (AbortFlowException e3) {
                e = e3;
                FlowExceptions_commonKt.checkOwnership(e, flowCollector);
                JobKt.ensureActive(c00541.getContext());
            }
        }
        return zVar.e;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <T> Object first(Flow<? extends T> flow, kotlin.coroutines.d<? super T> dVar) {
        AnonymousClass1 anonymousClass1;
        final z zVar;
        AbortFlowException e;
        FlowCollector<T> flowCollector;
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
            zVar = new z();
            zVar.e = NullSurrogateKt.NULL;
            FlowCollector<T> flowCollector2 = new FlowCollector<T>() { // from class: kotlinx.coroutines.flow.FlowKt__ReduceKt$first$$inlined$collectWhile$1
                @Override // kotlinx.coroutines.flow.FlowCollector
                public Object emit(T t, kotlin.coroutines.d<? super y> dVar2) {
                    zVar.e = t;
                    throw new AbortFlowException(this);
                }
            };
            try {
                anonymousClass1.L$0 = zVar;
                anonymousClass1.L$1 = flowCollector2;
                anonymousClass1.label = 1;
                Object objCollect = flow.collect(flowCollector2, anonymousClass1);
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                if (objCollect == aVar) {
                    return aVar;
                }
            } catch (AbortFlowException e2) {
                e = e2;
                flowCollector = flowCollector2;
                FlowExceptions_commonKt.checkOwnership(e, flowCollector);
                JobKt.ensureActive(anonymousClass1.getContext());
            }
        } else {
            if (i2 != 1) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            flowCollector = (FlowKt__ReduceKt$first$$inlined$collectWhile$1) anonymousClass1.L$1;
            zVar = (z) anonymousClass1.L$0;
            try {
                kotlin.a.e(obj);
            } catch (AbortFlowException e3) {
                e = e3;
                FlowExceptions_commonKt.checkOwnership(e, flowCollector);
                JobKt.ensureActive(anonymousClass1.getContext());
            }
        }
        Object obj2 = zVar.e;
        if (obj2 != NullSurrogateKt.NULL) {
            return obj2;
        }
        k.m("Expected at least one element");
        return null;
    }
}
