package kotlinx.coroutines.flow;

import kotlin.y;
import kotlinx.coroutines.JobKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
final class CancellableFlowImpl<T> implements CancellableFlow<T> {
    private final Flow<T> flow;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.CancellableFlowImpl$collect$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    public static final class AnonymousClass2<T> implements FlowCollector {
        final /* synthetic */ FlowCollector<T> $collector;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(FlowCollector<? super T> flowCollector) {
            this.$collector = flowCollector;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(T t, kotlin.coroutines.d<? super y> dVar) {
            CancellableFlowImpl$collect$2$emit$1 cancellableFlowImpl$collect$2$emit$1;
            if (dVar instanceof CancellableFlowImpl$collect$2$emit$1) {
                cancellableFlowImpl$collect$2$emit$1 = (CancellableFlowImpl$collect$2$emit$1) dVar;
                int i = cancellableFlowImpl$collect$2$emit$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    cancellableFlowImpl$collect$2$emit$1.label = i - Integer.MIN_VALUE;
                } else {
                    cancellableFlowImpl$collect$2$emit$1 = new CancellableFlowImpl$collect$2$emit$1(this, dVar);
                }
            } else {
                cancellableFlowImpl$collect$2$emit$1 = new CancellableFlowImpl$collect$2$emit$1(this, dVar);
            }
            Object obj = cancellableFlowImpl$collect$2$emit$1.result;
            int i2 = cancellableFlowImpl$collect$2$emit$1.label;
            if (i2 == 0) {
                kotlin.a.e(obj);
                JobKt.ensureActive(cancellableFlowImpl$collect$2$emit$1.getContext());
                FlowCollector<T> flowCollector = this.$collector;
                cancellableFlowImpl$collect$2$emit$1.label = 1;
                Object objEmit = flowCollector.emit(t, cancellableFlowImpl$collect$2$emit$1);
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

    /* JADX WARN: Multi-variable type inference failed */
    public CancellableFlowImpl(Flow<? extends T> flow) {
        this.flow = flow;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector<? super T> flowCollector, kotlin.coroutines.d<? super y> dVar) {
        Object objCollect = this.flow.collect(new AnonymousClass2(flowCollector), dVar);
        return objCollect == kotlin.coroutines.intrinsics.a.e ? objCollect : y.a;
    }
}
