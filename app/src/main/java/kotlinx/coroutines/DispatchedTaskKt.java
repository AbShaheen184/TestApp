package kotlinx.coroutines;

import kotlin.coroutines.d;
import kotlin.coroutines.i;
import kotlin.l;
import kotlinx.coroutines.internal.DispatchedContinuation;
import kotlinx.coroutines.internal.DispatchedContinuationKt;
import kotlinx.coroutines.internal.ThreadContextKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class DispatchedTaskKt {
    public static final int MODE_ATOMIC = 0;
    public static final int MODE_CANCELLABLE = 1;
    public static final int MODE_CANCELLABLE_REUSABLE = 2;
    public static final int MODE_UNDISPATCHED = 4;
    public static final int MODE_UNINITIALIZED = -1;

    public static final <T> void dispatch(DispatchedTask<? super T> dispatchedTask, int i) {
        d<? super T> delegate$kotlinx_coroutines_core = dispatchedTask.getDelegate$kotlinx_coroutines_core();
        boolean z = i == 4;
        if (z || !(delegate$kotlinx_coroutines_core instanceof DispatchedContinuation) || isCancellableMode(i) != isCancellableMode(dispatchedTask.resumeMode)) {
            resume(dispatchedTask, delegate$kotlinx_coroutines_core, z);
            return;
        }
        DispatchedContinuation dispatchedContinuation = (DispatchedContinuation) delegate$kotlinx_coroutines_core;
        CoroutineDispatcher coroutineDispatcher = dispatchedContinuation.dispatcher;
        i context = dispatchedContinuation.getContext();
        if (DispatchedContinuationKt.safeIsDispatchNeeded(coroutineDispatcher, context)) {
            DispatchedContinuationKt.safeDispatch(coroutineDispatcher, context, dispatchedTask);
        } else {
            resumeUnconfined(dispatchedTask);
        }
    }

    public static final boolean isCancellableMode(int i) {
        return i == 1 || i == 2;
    }

    public static final boolean isReusableMode(int i) {
        return i == 2;
    }

    public static final <T> void resume(DispatchedTask<? super T> dispatchedTask, d<? super T> dVar, boolean z) {
        Object objTakeState$kotlinx_coroutines_core = dispatchedTask.takeState$kotlinx_coroutines_core();
        Throwable exceptionalResult$kotlinx_coroutines_core = dispatchedTask.getExceptionalResult$kotlinx_coroutines_core(objTakeState$kotlinx_coroutines_core);
        Object lVar = exceptionalResult$kotlinx_coroutines_core != null ? new l(exceptionalResult$kotlinx_coroutines_core) : dispatchedTask.getSuccessfulResult$kotlinx_coroutines_core(objTakeState$kotlinx_coroutines_core);
        if (!z) {
            dVar.resumeWith(lVar);
            return;
        }
        dVar.getClass();
        DispatchedContinuation dispatchedContinuation = (DispatchedContinuation) dVar;
        d<T> dVar2 = dispatchedContinuation.continuation;
        Object obj = dispatchedContinuation.countOrElement;
        i context = dVar2.getContext();
        Object objUpdateThreadContext = ThreadContextKt.updateThreadContext(context, obj);
        UndispatchedCoroutine<?> undispatchedCoroutineUpdateUndispatchedCompletion = objUpdateThreadContext != ThreadContextKt.NO_THREAD_ELEMENTS ? CoroutineContextKt.updateUndispatchedCompletion(dVar2, context, objUpdateThreadContext) : null;
        try {
            dispatchedContinuation.continuation.resumeWith(lVar);
        } finally {
            if (undispatchedCoroutineUpdateUndispatchedCompletion == null || undispatchedCoroutineUpdateUndispatchedCompletion.clearThreadContext()) {
                ThreadContextKt.restoreThreadContext(context, objUpdateThreadContext);
            }
        }
    }

    private static final void resumeUnconfined(DispatchedTask<?> dispatchedTask) {
        EventLoop eventLoop$kotlinx_coroutines_core = ThreadLocalEventLoop.INSTANCE.getEventLoop$kotlinx_coroutines_core();
        if (eventLoop$kotlinx_coroutines_core.isUnconfinedLoopActive()) {
            eventLoop$kotlinx_coroutines_core.dispatchUnconfined(dispatchedTask);
            return;
        }
        eventLoop$kotlinx_coroutines_core.incrementUseCount(true);
        try {
            resume(dispatchedTask, dispatchedTask.getDelegate$kotlinx_coroutines_core(), true);
            do {
            } while (eventLoop$kotlinx_coroutines_core.processUnconfinedEvent());
        } catch (Throwable th) {
            try {
                dispatchedTask.handleFatalException$kotlinx_coroutines_core(th);
            } finally {
                eventLoop$kotlinx_coroutines_core.decrementUseCount(true);
            }
        }
    }

    public static final void resumeWithStackTrace(d<?> dVar, Throwable th) {
        dVar.resumeWith(kotlin.a.b(th));
    }

    public static final void runUnconfinedEventLoop(DispatchedTask<?> dispatchedTask, EventLoop eventLoop, kotlin.jvm.functions.a aVar) {
        eventLoop.incrementUseCount(true);
        try {
            aVar.invoke();
            do {
            } while (eventLoop.processUnconfinedEvent());
            eventLoop.decrementUseCount(true);
        } catch (Throwable th) {
            try {
                dispatchedTask.handleFatalException$kotlinx_coroutines_core(th);
            } finally {
                eventLoop.decrementUseCount(true);
            }
        }
    }

    public static /* synthetic */ void getMODE_CANCELLABLE$annotations() {
    }
}
