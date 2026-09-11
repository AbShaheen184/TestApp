package kotlinx.coroutines;

import java.util.concurrent.Executor;
import kotlin.coroutines.j;
import kotlinx.coroutines.internal.DispatchedContinuationKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
final class DispatcherExecutor implements Executor {
    public final CoroutineDispatcher dispatcher;

    public DispatcherExecutor(CoroutineDispatcher coroutineDispatcher) {
        this.dispatcher = coroutineDispatcher;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        CoroutineDispatcher coroutineDispatcher = this.dispatcher;
        j jVar = j.e;
        if (DispatchedContinuationKt.safeIsDispatchNeeded(coroutineDispatcher, jVar)) {
            DispatchedContinuationKt.safeDispatch(this.dispatcher, jVar, runnable);
        } else {
            runnable.run();
        }
    }

    public String toString() {
        return this.dispatcher.toString();
    }
}
