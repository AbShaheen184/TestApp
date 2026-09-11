package kotlinx.coroutines.flow;

import kotlin.coroutines.i;
import kotlin.jvm.functions.l;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;
import kotlinx.coroutines.internal.Symbol;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class StateFlowKt {
    private static final Symbol NONE = new Symbol("NONE");
    private static final Symbol PENDING = new Symbol("PENDING");

    public static final <T> MutableStateFlow<T> MutableStateFlow(T t) {
        if (t == null) {
            t = (T) NullSurrogateKt.NULL;
        }
        return new StateFlowImpl(t);
    }

    public static final <T> Flow<T> fuseStateFlow(StateFlow<? extends T> stateFlow, i iVar, int i, BufferOverflow bufferOverflow) {
        return (((i < 0 || i >= 2) && i != -2) || bufferOverflow != BufferOverflow.DROP_OLDEST) ? SharedFlowKt.fuseSharedFlow(stateFlow, iVar, i, bufferOverflow) : stateFlow;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> T getAndUpdate(MutableStateFlow<T> mutableStateFlow, l lVar) {
        T t;
        do {
            t = (T) mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(t, lVar.invoke(t)));
        return t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> void update(MutableStateFlow<T> mutableStateFlow, l lVar) {
        Object value;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.compareAndSet(value, lVar.invoke(value)));
    }

    public static final <T> T updateAndGet(MutableStateFlow<T> mutableStateFlow, l lVar) {
        T value;
        T t;
        do {
            value = mutableStateFlow.getValue();
            t = (T) lVar.invoke(value);
        } while (!mutableStateFlow.compareAndSet(value, t));
        return t;
    }
}
