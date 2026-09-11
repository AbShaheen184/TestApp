package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.d;
import kotlin.coroutines.i;
import kotlin.l;
import kotlinx.coroutines.internal.DispatchedContinuation;
import kotlinx.coroutines.internal.ThreadContextKt;
import kotlinx.coroutines.scheduling.Task;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class DispatchedTask<T> extends Task {
    public int resumeMode;

    public DispatchedTask(int i) {
        this.resumeMode = i;
    }

    public abstract d<T> getDelegate$kotlinx_coroutines_core();

    public Throwable getExceptionalResult$kotlinx_coroutines_core(Object obj) {
        CompletedExceptionally completedExceptionally = obj instanceof CompletedExceptionally ? (CompletedExceptionally) obj : null;
        if (completedExceptionally != null) {
            return completedExceptionally.cause;
        }
        return null;
    }

    public final void handleFatalException$kotlinx_coroutines_core(Throwable th) {
        CoroutineExceptionHandlerKt.handleCoroutineException(getDelegate$kotlinx_coroutines_core().getContext(), new CoroutinesInternalError("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            d<T> delegate$kotlinx_coroutines_core = getDelegate$kotlinx_coroutines_core();
            delegate$kotlinx_coroutines_core.getClass();
            DispatchedContinuation dispatchedContinuation = (DispatchedContinuation) delegate$kotlinx_coroutines_core;
            d<T> dVar = dispatchedContinuation.continuation;
            Object obj = dispatchedContinuation.countOrElement;
            i context = dVar.getContext();
            Object objUpdateThreadContext = ThreadContextKt.updateThreadContext(context, obj);
            Job job = null;
            UndispatchedCoroutine<?> undispatchedCoroutineUpdateUndispatchedCompletion = objUpdateThreadContext != ThreadContextKt.NO_THREAD_ELEMENTS ? CoroutineContextKt.updateUndispatchedCompletion(dVar, context, objUpdateThreadContext) : null;
            try {
                i context2 = dVar.getContext();
                Object objTakeState$kotlinx_coroutines_core = takeState$kotlinx_coroutines_core();
                Throwable exceptionalResult$kotlinx_coroutines_core = getExceptionalResult$kotlinx_coroutines_core(objTakeState$kotlinx_coroutines_core);
                if (exceptionalResult$kotlinx_coroutines_core == null && DispatchedTaskKt.isCancellableMode(this.resumeMode)) {
                    job = (Job) context2.get(Job.Key);
                }
                if (job != null && !job.isActive()) {
                    CancellationException cancellationException = job.getCancellationException();
                    cancelCompletedResult$kotlinx_coroutines_core(objTakeState$kotlinx_coroutines_core, cancellationException);
                    dVar.resumeWith(kotlin.a.b(cancellationException));
                } else if (exceptionalResult$kotlinx_coroutines_core != null) {
                    dVar.resumeWith(new l(exceptionalResult$kotlinx_coroutines_core));
                } else {
                    dVar.resumeWith(getSuccessfulResult$kotlinx_coroutines_core(objTakeState$kotlinx_coroutines_core));
                }
            } finally {
                if (undispatchedCoroutineUpdateUndispatchedCompletion == null || undispatchedCoroutineUpdateUndispatchedCompletion.clearThreadContext()) {
                    ThreadContextKt.restoreThreadContext(context, objUpdateThreadContext);
                }
            }
        } catch (DispatchException e) {
            CoroutineExceptionHandlerKt.handleCoroutineException(getDelegate$kotlinx_coroutines_core().getContext(), e.getCause());
        } catch (Throwable th) {
            handleFatalException$kotlinx_coroutines_core(th);
        }
    }

    public abstract Object takeState$kotlinx_coroutines_core();

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T getSuccessfulResult$kotlinx_coroutines_core(Object obj) {
        return obj;
    }

    public void cancelCompletedResult$kotlinx_coroutines_core(Object obj, Throwable th) {
    }
}
