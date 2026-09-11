package kotlinx.coroutines.flow;

import kotlin.jvm.functions.l;
import kotlin.jvm.functions.p;
import kotlin.jvm.internal.z;
import kotlin.y;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
final class DistinctFlowImpl<T> implements Flow<T> {
    public final p areEquivalent;
    public final l keySelector;
    private final Flow<T> upstream;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.DistinctFlowImpl$collect$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    public static final class AnonymousClass2<T> implements FlowCollector {
        final /* synthetic */ FlowCollector<T> $collector;
        final /* synthetic */ z $previousKey;
        final /* synthetic */ DistinctFlowImpl<T> this$0;

        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass2(DistinctFlowImpl<T> distinctFlowImpl, z zVar, FlowCollector<? super T> flowCollector) {
            this.this$0 = distinctFlowImpl;
            this.$previousKey = zVar;
            this.$collector = flowCollector;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(T t, kotlin.coroutines.d<? super y> dVar) {
            DistinctFlowImpl$collect$2$emit$1 distinctFlowImpl$collect$2$emit$1;
            if (dVar instanceof DistinctFlowImpl$collect$2$emit$1) {
                distinctFlowImpl$collect$2$emit$1 = (DistinctFlowImpl$collect$2$emit$1) dVar;
                int i = distinctFlowImpl$collect$2$emit$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    distinctFlowImpl$collect$2$emit$1.label = i - Integer.MIN_VALUE;
                } else {
                    distinctFlowImpl$collect$2$emit$1 = new DistinctFlowImpl$collect$2$emit$1(this, dVar);
                }
            } else {
                distinctFlowImpl$collect$2$emit$1 = new DistinctFlowImpl$collect$2$emit$1(this, dVar);
            }
            Object obj = distinctFlowImpl$collect$2$emit$1.result;
            int i2 = distinctFlowImpl$collect$2$emit$1.label;
            y yVar = y.a;
            if (i2 == 0) {
                kotlin.a.e(obj);
                Object objInvoke = this.this$0.keySelector.invoke(t);
                Object obj2 = this.$previousKey.e;
                if (obj2 != NullSurrogateKt.NULL && ((Boolean) this.this$0.areEquivalent.invoke(obj2, objInvoke)).booleanValue()) {
                    return yVar;
                }
                this.$previousKey.e = objInvoke;
                FlowCollector<T> flowCollector = this.$collector;
                distinctFlowImpl$collect$2$emit$1.label = 1;
                Object objEmit = flowCollector.emit(t, distinctFlowImpl$collect$2$emit$1);
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
            return yVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DistinctFlowImpl(Flow<? extends T> flow, l lVar, p pVar) {
        this.upstream = flow;
        this.keySelector = lVar;
        this.areEquivalent = pVar;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector<? super T> flowCollector, kotlin.coroutines.d<? super y> dVar) {
        z zVar = new z();
        zVar.e = NullSurrogateKt.NULL;
        Object objCollect = this.upstream.collect(new AnonymousClass2(this, zVar, flowCollector), dVar);
        return objCollect == kotlin.coroutines.intrinsics.a.e ? objCollect : y.a;
    }
}
