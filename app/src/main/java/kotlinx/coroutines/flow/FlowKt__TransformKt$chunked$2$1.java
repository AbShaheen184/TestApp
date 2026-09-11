package kotlinx.coroutines.flow;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.z;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class FlowKt__TransformKt$chunked$2$1<T> implements FlowCollector {
    final /* synthetic */ z $result;
    final /* synthetic */ int $size;
    final /* synthetic */ FlowCollector<List<? extends T>> $this_flow;

    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__TransformKt$chunked$2$1(z zVar, int i, FlowCollector<? super List<? extends T>> flowCollector) {
        this.$result = zVar;
        this.$size = i;
        this.$this_flow = flowCollector;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(T t, kotlin.coroutines.d<? super y> dVar) {
        FlowKt__TransformKt$chunked$2$1$emit$1 flowKt__TransformKt$chunked$2$1$emit$1;
        FlowKt__TransformKt$chunked$2$1<T> flowKt__TransformKt$chunked$2$1;
        if (dVar instanceof FlowKt__TransformKt$chunked$2$1$emit$1) {
            flowKt__TransformKt$chunked$2$1$emit$1 = (FlowKt__TransformKt$chunked$2$1$emit$1) dVar;
            int i = flowKt__TransformKt$chunked$2$1$emit$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                flowKt__TransformKt$chunked$2$1$emit$1.label = i - Integer.MIN_VALUE;
            } else {
                flowKt__TransformKt$chunked$2$1$emit$1 = new FlowKt__TransformKt$chunked$2$1$emit$1(this, dVar);
            }
        } else {
            flowKt__TransformKt$chunked$2$1$emit$1 = new FlowKt__TransformKt$chunked$2$1$emit$1(this, dVar);
        }
        Object obj = flowKt__TransformKt$chunked$2$1$emit$1.result;
        int i2 = flowKt__TransformKt$chunked$2$1$emit$1.label;
        if (i2 == 0) {
            kotlin.a.e(obj);
            ArrayList arrayList = (ArrayList) this.$result.e;
            if (arrayList == null) {
                arrayList = new ArrayList(this.$size);
                this.$result.e = arrayList;
            }
            arrayList.add(t);
            if (arrayList.size() == this.$size) {
                FlowCollector<List<? extends T>> flowCollector = this.$this_flow;
                flowKt__TransformKt$chunked$2$1$emit$1.L$0 = this;
                flowKt__TransformKt$chunked$2$1$emit$1.label = 1;
                Object objEmit = flowCollector.emit(arrayList, flowKt__TransformKt$chunked$2$1$emit$1);
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                if (objEmit == aVar) {
                    return aVar;
                }
                flowKt__TransformKt$chunked$2$1 = this;
            }
            return y.a;
        }
        if (i2 != 1) {
            net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        flowKt__TransformKt$chunked$2$1 = (FlowKt__TransformKt$chunked$2$1) flowKt__TransformKt$chunked$2$1$emit$1.L$0;
        kotlin.a.e(obj);
        flowKt__TransformKt$chunked$2$1.$result.e = null;
        return y.a;
    }
}
