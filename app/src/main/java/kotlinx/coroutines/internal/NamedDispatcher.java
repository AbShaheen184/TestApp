package kotlinx.coroutines.internal;

import kotlin.c;
import kotlin.coroutines.d;
import kotlin.coroutines.i;
import kotlin.y;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.DefaultExecutorKt;
import kotlinx.coroutines.Delay;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.InternalCoroutinesApi;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class NamedDispatcher extends CoroutineDispatcher implements Delay {
    private final /* synthetic */ Delay $$delegate_0;
    private final CoroutineDispatcher dispatcher;
    private final String name;

    /* JADX WARN: Multi-variable type inference failed */
    public NamedDispatcher(CoroutineDispatcher coroutineDispatcher, String str) {
        Delay delay = coroutineDispatcher instanceof Delay ? (Delay) coroutineDispatcher : null;
        this.$$delegate_0 = delay == null ? DefaultExecutorKt.getDefaultDelay() : delay;
        this.dispatcher = coroutineDispatcher;
        this.name = str;
    }

    @Override // kotlinx.coroutines.Delay
    @c
    public Object delay(long j, d<? super y> dVar) {
        return this.$$delegate_0.delay(j, dVar);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* JADX INFO: renamed from: dispatch */
    public void mo86dispatch(i iVar, Runnable runnable) {
        this.dispatcher.mo86dispatch(iVar, runnable);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    @InternalCoroutinesApi
    public void dispatchYield(i iVar, Runnable runnable) {
        this.dispatcher.dispatchYield(iVar, runnable);
    }

    @Override // kotlinx.coroutines.Delay
    public DisposableHandle invokeOnTimeout(long j, Runnable runnable, i iVar) {
        return this.$$delegate_0.invokeOnTimeout(j, runnable, iVar);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public boolean isDispatchNeeded(i iVar) {
        return this.dispatcher.isDispatchNeeded(iVar);
    }

    @Override // kotlinx.coroutines.Delay
    /* JADX INFO: renamed from: scheduleResumeAfterDelay */
    public void mo87scheduleResumeAfterDelay(long j, CancellableContinuation<? super y> cancellableContinuation) {
        this.$$delegate_0.mo87scheduleResumeAfterDelay(j, cancellableContinuation);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public String toString() {
        return this.name;
    }
}
