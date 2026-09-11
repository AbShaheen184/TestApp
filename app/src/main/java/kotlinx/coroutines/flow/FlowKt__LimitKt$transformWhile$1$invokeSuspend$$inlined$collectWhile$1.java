package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.functions.q;
import kotlin.y;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import org.mozilla.javascript.Token;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1<T> implements FlowCollector<T> {
    final /* synthetic */ FlowCollector $$this$safeFlow$inlined;
    final /* synthetic */ q $transform$inlined;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1$1, reason: invalid class name */
    @e(c = "kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1", f = "Limit.kt", l = {Token.FOR}, m = "emit")
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
            return FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1.this.emit(null, this);
        }
    }

    public FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1(q qVar, FlowCollector flowCollector) {
        this.$transform$inlined = qVar;
        this.$$this$safeFlow$inlined = flowCollector;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    public Object emit(T t, kotlin.coroutines.d<? super y> dVar) {
        AnonymousClass1 anonymousClass1;
        FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1<T> flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1;
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
        Object objInvoke = anonymousClass1.result;
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            kotlin.a.e(objInvoke);
            q qVar = this.$transform$inlined;
            FlowCollector flowCollector = this.$$this$safeFlow$inlined;
            anonymousClass1.L$0 = this;
            anonymousClass1.label = 1;
            objInvoke = qVar.invoke(flowCollector, t, anonymousClass1);
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
            if (objInvoke == aVar) {
                return aVar;
            }
            flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1 = this;
        } else {
            if (i2 != 1) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1 = (FlowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1) anonymousClass1.L$0;
            kotlin.a.e(objInvoke);
        }
        if (((Boolean) objInvoke).booleanValue()) {
            return y.a;
        }
        throw new AbortFlowException(flowKt__LimitKt$transformWhile$1$invokeSuspend$$inlined$collectWhile$1);
    }
}
