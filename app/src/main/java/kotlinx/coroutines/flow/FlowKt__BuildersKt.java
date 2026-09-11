package kotlinx.coroutines.flow;

import java.util.Iterator;
import kotlin.jvm.functions.l;
import kotlin.jvm.functions.p;
import kotlin.ranges.f;
import kotlin.sequences.h;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class FlowKt__BuildersKt {
    public static final <T> Flow<T> asFlow(final kotlin.jvm.functions.a aVar) {
        return new Flow<T>() { // from class: kotlinx.coroutines.flow.FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$1
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super T> flowCollector, kotlin.coroutines.d<? super y> dVar) {
                Object objEmit = flowCollector.emit(aVar.invoke(), dVar);
                return objEmit == kotlin.coroutines.intrinsics.a.e ? objEmit : y.a;
            }
        };
    }

    public static final <T> Flow<T> callbackFlow(p pVar) {
        return new CallbackFlowBuilder(pVar, null, 0, null, 14, null);
    }

    public static final <T> Flow<T> channelFlow(p pVar) {
        return new ChannelFlowBuilder(pVar, null, 0, null, 14, null);
    }

    public static final <T> Flow<T> emptyFlow() {
        return EmptyFlow.INSTANCE;
    }

    public static final <T> Flow<T> flow(p pVar) {
        return new SafeFlow(pVar);
    }

    public static final <T> Flow<T> flowOf(T... tArr) {
        return new FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$1(tArr);
    }

    public static final <T> Flow<T> asFlow(l lVar) {
        return new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$2(lVar);
    }

    public static final <T> Flow<T> flowOf(final T t) {
        return new Flow<T>() { // from class: kotlinx.coroutines.flow.FlowKt__BuildersKt$flowOf$$inlined$unsafeFlow$2
            @Override // kotlinx.coroutines.flow.Flow
            public Object collect(FlowCollector<? super T> flowCollector, kotlin.coroutines.d<? super y> dVar) {
                Object objEmit = flowCollector.emit((Object) t, dVar);
                return objEmit == kotlin.coroutines.intrinsics.a.e ? objEmit : y.a;
            }
        };
    }

    public static final <T> Flow<T> asFlow(Iterable<? extends T> iterable) {
        return new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$3(iterable);
    }

    public static final <T> Flow<T> asFlow(Iterator<? extends T> it) {
        return new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$4(it);
    }

    public static final <T> Flow<T> asFlow(h hVar) {
        return new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$5(hVar);
    }

    public static final <T> Flow<T> asFlow(T[] tArr) {
        return new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$6(tArr);
    }

    public static final Flow<Integer> asFlow(int[] iArr) {
        return new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$7(iArr);
    }

    public static final Flow<Long> asFlow(long[] jArr) {
        return new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$8(jArr);
    }

    public static final Flow<Integer> asFlow(kotlin.ranges.d dVar) {
        return new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$9(dVar);
    }

    public static final Flow<Long> asFlow(f fVar) {
        return new FlowKt__BuildersKt$asFlow$$inlined$unsafeFlow$10(fVar);
    }
}
