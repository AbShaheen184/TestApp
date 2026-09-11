package kotlinx.coroutines.flow;

import kotlin.jvm.internal.x;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class FlowKt__TransformKt$withIndex$1$1<T> implements FlowCollector {
    final /* synthetic */ x $index;
    final /* synthetic */ FlowCollector<kotlin.collections.x> $this_flow;

    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__TransformKt$withIndex$1$1(FlowCollector<? super kotlin.collections.x> flowCollector, x xVar) {
        this.$this_flow = flowCollector;
        this.$index = xVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(T t, kotlin.coroutines.d<? super y> dVar) {
        FlowKt__TransformKt$withIndex$1$1$emit$1 flowKt__TransformKt$withIndex$1$1$emit$1;
        if (dVar instanceof FlowKt__TransformKt$withIndex$1$1$emit$1) {
            flowKt__TransformKt$withIndex$1$1$emit$1 = (FlowKt__TransformKt$withIndex$1$1$emit$1) dVar;
            int i = flowKt__TransformKt$withIndex$1$1$emit$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                flowKt__TransformKt$withIndex$1$1$emit$1.label = i - Integer.MIN_VALUE;
            } else {
                flowKt__TransformKt$withIndex$1$1$emit$1 = new FlowKt__TransformKt$withIndex$1$1$emit$1(this, dVar);
            }
        } else {
            flowKt__TransformKt$withIndex$1$1$emit$1 = new FlowKt__TransformKt$withIndex$1$1$emit$1(this, dVar);
        }
        Object obj = flowKt__TransformKt$withIndex$1$1$emit$1.result;
        int i2 = flowKt__TransformKt$withIndex$1$1$emit$1.label;
        if (i2 == 0) {
            kotlin.a.e(obj);
            FlowCollector<kotlin.collections.x> flowCollector = this.$this_flow;
            x xVar = this.$index;
            int i3 = xVar.e;
            xVar.e = i3 + 1;
            if (i3 < 0) {
                throw new ArithmeticException("Index overflow has happened");
            }
            kotlin.collections.x xVar2 = new kotlin.collections.x(i3, t);
            flowKt__TransformKt$withIndex$1$1$emit$1.label = 1;
            Object objEmit = flowCollector.emit(xVar2, flowKt__TransformKt$withIndex$1$1$emit$1);
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
            if (objEmit == aVar) {
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
}
