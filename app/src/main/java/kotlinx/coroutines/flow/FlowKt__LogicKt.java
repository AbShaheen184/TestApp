package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.functions.p;
import kotlin.jvm.internal.v;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import kotlinx.coroutines.flow.internal.FlowExceptions_commonKt;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class FlowKt__LogicKt {

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__LogicKt$all$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @e(c = "kotlinx.coroutines.flow.FlowKt__LogicKt", f = "Logic.kt", l = {Token.INC}, m = "all")
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
            return FlowKt.all(null, null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__LogicKt$any$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @e(c = "kotlinx.coroutines.flow.FlowKt__LogicKt", f = "Logic.kt", l = {Token.INC}, m = "any")
    public static final class C00501<T> extends kotlin.coroutines.jvm.internal.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C00501(kotlin.coroutines.d<? super C00501> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt.any(null, null, this);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__LogicKt$none$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @e(c = "kotlinx.coroutines.flow.FlowKt__LogicKt", f = "Logic.kt", l = {Token.ASSIGN_URSH}, m = "none")
    public static final class C00511<T> extends kotlin.coroutines.jvm.internal.c {
        int label;
        /* synthetic */ Object result;

        public C00511(kotlin.coroutines.d<? super C00511> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt.none(null, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <T> Object all(Flow<? extends T> flow, p pVar, kotlin.coroutines.d<? super Boolean> dVar) {
        AnonymousClass1 anonymousClass1;
        v vVar;
        AbortFlowException e;
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
            v vVar2 = new v();
            FlowCollector<? super Object> flowKt__LogicKt$all$$inlined$collectWhile$1 = new FlowKt__LogicKt$all$$inlined$collectWhile$1<>(pVar, vVar2);
            try {
                anonymousClass1.L$0 = vVar2;
                anonymousClass1.L$1 = flowKt__LogicKt$all$$inlined$collectWhile$1;
                anonymousClass1.label = 1;
                Object objCollect = flow.collect(flowKt__LogicKt$all$$inlined$collectWhile$1, anonymousClass1);
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                if (objCollect == aVar) {
                    return aVar;
                }
                vVar = vVar2;
            } catch (AbortFlowException e2) {
                vVar = vVar2;
                e = e2;
                flowCollector = flowKt__LogicKt$all$$inlined$collectWhile$1;
                FlowExceptions_commonKt.checkOwnership(e, flowCollector);
                JobKt.ensureActive(anonymousClass1.getContext());
            }
        } else {
            if (i2 != 1) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            flowCollector = (FlowKt__LogicKt$all$$inlined$collectWhile$1) anonymousClass1.L$1;
            vVar = (v) anonymousClass1.L$0;
            try {
                kotlin.a.e(obj);
            } catch (AbortFlowException e3) {
                e = e3;
                FlowExceptions_commonKt.checkOwnership(e, flowCollector);
                JobKt.ensureActive(anonymousClass1.getContext());
            }
        }
        return Boolean.valueOf(!vVar.e);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <T> Object any(Flow<? extends T> flow, p pVar, kotlin.coroutines.d<? super Boolean> dVar) {
        C00501 c00501;
        v vVar;
        AbortFlowException e;
        FlowCollector<? super Object> flowCollector;
        if (dVar instanceof C00501) {
            c00501 = (C00501) dVar;
            int i = c00501.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c00501.label = i - Integer.MIN_VALUE;
            } else {
                c00501 = new C00501(dVar);
            }
        } else {
            c00501 = new C00501(dVar);
        }
        Object obj = c00501.result;
        int i2 = c00501.label;
        if (i2 == 0) {
            kotlin.a.e(obj);
            v vVar2 = new v();
            FlowCollector<? super Object> flowKt__LogicKt$any$$inlined$collectWhile$1 = new FlowKt__LogicKt$any$$inlined$collectWhile$1<>(pVar, vVar2);
            try {
                c00501.L$0 = vVar2;
                c00501.L$1 = flowKt__LogicKt$any$$inlined$collectWhile$1;
                c00501.label = 1;
                Object objCollect = flow.collect(flowKt__LogicKt$any$$inlined$collectWhile$1, c00501);
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                if (objCollect == aVar) {
                    return aVar;
                }
                vVar = vVar2;
            } catch (AbortFlowException e2) {
                vVar = vVar2;
                e = e2;
                flowCollector = flowKt__LogicKt$any$$inlined$collectWhile$1;
                FlowExceptions_commonKt.checkOwnership(e, flowCollector);
                JobKt.ensureActive(c00501.getContext());
            }
        } else {
            if (i2 != 1) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            flowCollector = (FlowKt__LogicKt$any$$inlined$collectWhile$1) c00501.L$1;
            vVar = (v) c00501.L$0;
            try {
                kotlin.a.e(obj);
            } catch (AbortFlowException e3) {
                e = e3;
                FlowExceptions_commonKt.checkOwnership(e, flowCollector);
                JobKt.ensureActive(c00501.getContext());
            }
        }
        return Boolean.valueOf(vVar.e);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final <T> Object none(Flow<? extends T> flow, p pVar, kotlin.coroutines.d<? super Boolean> dVar) {
        C00511 c00511;
        if (dVar instanceof C00511) {
            c00511 = (C00511) dVar;
            int i = c00511.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c00511.label = i - Integer.MIN_VALUE;
            } else {
                c00511 = new C00511(dVar);
            }
        } else {
            c00511 = new C00511(dVar);
        }
        Object objAny = c00511.result;
        int i2 = c00511.label;
        if (i2 == 0) {
            kotlin.a.e(objAny);
            c00511.label = 1;
            objAny = FlowKt.any(flow, pVar, c00511);
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
            if (objAny == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.a.e(objAny);
        }
        return Boolean.valueOf(!((Boolean) objAny).booleanValue());
    }
}
