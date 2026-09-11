package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.functions.p;
import kotlin.jvm.internal.z;
import kotlin.y;
import kotlinx.coroutines.flow.internal.AbortFlowException;
import org.mozilla.javascript.Token;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2<T> implements FlowCollector<T> {
    final /* synthetic */ p $predicate$inlined;
    final /* synthetic */ z $result$inlined;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2$1, reason: invalid class name */
    @e(c = "kotlinx.coroutines.flow.FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2", f = "Reduce.kt", l = {Token.FOR}, m = "emit")
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2.this.emit(null, this);
        }
    }

    public FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2(p pVar, z zVar) {
        this.$predicate$inlined = pVar;
        this.$result$inlined = zVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    public Object emit(T t, kotlin.coroutines.d<? super y> dVar) {
        AnonymousClass1 anonymousClass1;
        FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2<T> flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2;
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
            p pVar = this.$predicate$inlined;
            anonymousClass1.L$0 = this;
            anonymousClass1.L$1 = t;
            anonymousClass1.label = 1;
            objInvoke = pVar.invoke(t, anonymousClass1);
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
            if (objInvoke == aVar) {
                return aVar;
            }
            flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2 = this;
        } else {
            if (i2 != 1) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            t = (T) anonymousClass1.L$1;
            flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2 = (FlowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2) anonymousClass1.L$0;
            kotlin.a.e(objInvoke);
        }
        if (!((Boolean) objInvoke).booleanValue()) {
            return y.a;
        }
        flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2.$result$inlined.e = t;
        throw new AbortFlowException(flowKt__ReduceKt$firstOrNull$$inlined$collectWhile$2);
    }
}
