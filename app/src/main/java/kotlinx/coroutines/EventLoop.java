package kotlinx.coroutines;

import com.google.gson.b;
import kotlin.collections.k;
import kotlinx.coroutines.internal.LimitedDispatcherKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class EventLoop extends CoroutineDispatcher {
    private boolean shared;
    private k unconfinedQueue;
    private long useCount;

    public static /* synthetic */ void decrementUseCount$default(EventLoop eventLoop, boolean z, int i, Object obj) {
        if (obj != null) {
            b.r("Super calls with default arguments not supported in this target, function: decrementUseCount");
            return;
        }
        if ((i & 1) != 0) {
            z = false;
        }
        eventLoop.decrementUseCount(z);
    }

    private final long delta(boolean z) {
        return z ? 4294967296L : 1L;
    }

    public static /* synthetic */ void incrementUseCount$default(EventLoop eventLoop, boolean z, int i, Object obj) {
        if (obj != null) {
            b.r("Super calls with default arguments not supported in this target, function: incrementUseCount");
            return;
        }
        if ((i & 1) != 0) {
            z = false;
        }
        eventLoop.incrementUseCount(z);
    }

    public final void decrementUseCount(boolean z) {
        long jDelta = this.useCount - delta(z);
        this.useCount = jDelta;
        if (jDelta <= 0 && this.shared) {
            shutdown();
        }
    }

    public final void dispatchUnconfined(DispatchedTask<?> dispatchedTask) {
        k kVar = this.unconfinedQueue;
        if (kVar == null) {
            kVar = new k();
            this.unconfinedQueue = kVar;
        }
        kVar.addLast(dispatchedTask);
    }

    public long getNextTime() {
        k kVar = this.unconfinedQueue;
        return (kVar == null || kVar.isEmpty()) ? Long.MAX_VALUE : 0L;
    }

    public final void incrementUseCount(boolean z) {
        this.useCount += delta(z);
        if (z) {
            return;
        }
        this.shared = true;
    }

    public final boolean isActive() {
        return this.useCount > 0;
    }

    public boolean isEmpty() {
        return isUnconfinedQueueEmpty();
    }

    public final boolean isUnconfinedLoopActive() {
        return this.useCount >= delta(true);
    }

    public final boolean isUnconfinedQueueEmpty() {
        k kVar = this.unconfinedQueue;
        if (kVar != null) {
            return kVar.isEmpty();
        }
        return true;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final CoroutineDispatcher limitedParallelism(int i, String str) {
        LimitedDispatcherKt.checkParallelism(i);
        return LimitedDispatcherKt.namedOrThis(this, str);
    }

    public long processNextEvent() {
        return !processUnconfinedEvent() ? Long.MAX_VALUE : 0L;
    }

    public final boolean processUnconfinedEvent() {
        k kVar = this.unconfinedQueue;
        if (kVar == null) {
            return false;
        }
        DispatchedTask dispatchedTask = (DispatchedTask) (kVar.isEmpty() ? null : kVar.removeFirst());
        if (dispatchedTask == null) {
            return false;
        }
        dispatchedTask.run();
        return true;
    }

    public boolean shouldBeProcessedFromContext() {
        return false;
    }

    public void shutdown() {
    }
}
