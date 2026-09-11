package kotlinx.coroutines.flow;

import kotlin.y;
import kotlinx.coroutines.ExperimentalCoroutinesApi;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public interface MutableSharedFlow<T> extends SharedFlow<T>, FlowCollector<T> {
    @Override // kotlinx.coroutines.flow.FlowCollector
    Object emit(T t, kotlin.coroutines.d<? super y> dVar);

    StateFlow<Integer> getSubscriptionCount();

    @ExperimentalCoroutinesApi
    void resetReplayCache();

    boolean tryEmit(T t);
}
