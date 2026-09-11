package coil3.compose.internal;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.i;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends CoroutineDispatcher {
    public static final /* synthetic */ AtomicIntegerFieldUpdater z = AtomicIntegerFieldUpdater.newUpdater(e.class, "y");
    public final CoroutineDispatcher e;
    public volatile /* synthetic */ int y = 1;

    public e(CoroutineDispatcher coroutineDispatcher) {
        this.e = coroutineDispatcher;
    }

    public final CoroutineDispatcher a() {
        return z.get(this) == 1 ? Dispatchers.getUnconfined() : this.e;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* JADX INFO: renamed from: dispatch */
    public final void mo86dispatch(i iVar, Runnable runnable) {
        a().mo86dispatch(iVar, runnable);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final void dispatchYield(i iVar, Runnable runnable) {
        a().dispatchYield(iVar, runnable);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final boolean isDispatchNeeded(i iVar) {
        return a().isDispatchNeeded(iVar);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final CoroutineDispatcher limitedParallelism(int i, String str) {
        return a().limitedParallelism(i, str);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public final String toString() {
        return "DeferredDispatchCoroutineDispatcher(delegate=" + this.e + ")";
    }
}
