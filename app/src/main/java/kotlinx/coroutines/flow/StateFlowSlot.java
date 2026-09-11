package kotlinx.coroutines.flow;

import com.google.android.material.shape.e;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.y;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.flow.internal.AbstractSharedFlowKt;
import kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot;
import kotlinx.coroutines.internal.Concurrent_commonKt;
import kotlinx.coroutines.internal.Symbol;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
final class StateFlowSlot extends AbstractSharedFlowSlot<StateFlowImpl<?>> {
    private final AtomicReference<Object> _state = new AtomicReference<>(null);

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot
    public boolean allocateLocked(StateFlowImpl<?> stateFlowImpl) {
        if (Concurrent_commonKt.getValue(this._state) != null) {
            return false;
        }
        Concurrent_commonKt.setValue(this._state, StateFlowKt.NONE);
        return true;
    }

    public final Object awaitPending(kotlin.coroutines.d<? super y> dVar) {
        y yVar;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(e.g(dVar), 1);
        cancellableContinuationImpl.initCancellability();
        AtomicReference atomicReference = this._state;
        Symbol symbol = StateFlowKt.NONE;
        while (true) {
            boolean zCompareAndSet = atomicReference.compareAndSet(symbol, cancellableContinuationImpl);
            yVar = y.a;
            if (zCompareAndSet) {
                break;
            }
            if (atomicReference.get() != symbol) {
                cancellableContinuationImpl.resumeWith(yVar);
                break;
            }
        }
        Object result = cancellableContinuationImpl.getResult();
        return result == kotlin.coroutines.intrinsics.a.e ? result : yVar;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot
    public kotlin.coroutines.d<y>[] freeLocked(StateFlowImpl<?> stateFlowImpl) {
        Concurrent_commonKt.setValue(this._state, null);
        return AbstractSharedFlowKt.EMPTY_RESUMES;
    }

    public final void makePending() {
        AtomicReference<Object> atomicReference = this._state;
        while (true) {
            Object value = Concurrent_commonKt.getValue(atomicReference);
            if (value == null || value == StateFlowKt.PENDING) {
                return;
            }
            Symbol symbol = StateFlowKt.NONE;
            AtomicReference<Object> atomicReference2 = this._state;
            if (value == symbol) {
                Symbol symbol2 = StateFlowKt.PENDING;
                while (!atomicReference2.compareAndSet(value, symbol2)) {
                    if (atomicReference2.get() != value) {
                    }
                }
                return;
            } else {
                Symbol symbol3 = StateFlowKt.NONE;
                do {
                    if (atomicReference2.compareAndSet(value, symbol3)) {
                        ((CancellableContinuationImpl) value).resumeWith(y.a);
                        return;
                    }
                } while (atomicReference2.get() == value);
            }
        }
    }

    public final boolean takePending() {
        Object andSet = this._state.getAndSet(StateFlowKt.NONE);
        andSet.getClass();
        return andSet == StateFlowKt.PENDING;
    }
}
