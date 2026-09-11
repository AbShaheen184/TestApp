package kotlinx.coroutines.intrinsics;

import com.google.android.material.shape.e;
import com.google.gson.b;
import kotlin.coroutines.d;
import kotlin.coroutines.i;
import kotlin.coroutines.jvm.internal.a;
import kotlin.jvm.functions.p;
import kotlin.jvm.internal.c0;
import kotlinx.coroutines.CompletedExceptionally;
import kotlinx.coroutines.DispatchException;
import kotlinx.coroutines.JobSupportKt;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.internal.ScopeCoroutine;
import kotlinx.coroutines.internal.ThreadContextKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class UndispatchedKt {
    private static final Void dispatchExceptionAndMakeCompleting(ScopeCoroutine<?> scopeCoroutine, DispatchException dispatchException) throws Throwable {
        scopeCoroutine.makeCompleting$kotlinx_coroutines_core(new CompletedExceptionally(dispatchException.getCause(), false, 2, null));
        throw dispatchException.getCause();
    }

    private static final boolean notOwnTimeout(ScopeCoroutine<?> scopeCoroutine, Throwable th) {
        return ((th instanceof TimeoutCancellationException) && ((TimeoutCancellationException) th).coroutine == scopeCoroutine) ? false : true;
    }

    public static final <R, T> void startCoroutineUndispatched(p pVar, R r, d<? super T> dVar) {
        Object objInvoke;
        dVar.getClass();
        try {
            i context = dVar.getContext();
            Object objUpdateThreadContext = ThreadContextKt.updateThreadContext(context, null);
            try {
                if (pVar instanceof a) {
                    c0.c(2, pVar);
                    objInvoke = pVar.invoke(r, dVar);
                } else {
                    objInvoke = e.k(pVar, r, dVar);
                }
                ThreadContextKt.restoreThreadContext(context, objUpdateThreadContext);
                if (objInvoke != kotlin.coroutines.intrinsics.a.e) {
                    dVar.resumeWith(objInvoke);
                }
            } catch (Throwable th) {
                ThreadContextKt.restoreThreadContext(context, objUpdateThreadContext);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            if (th instanceof DispatchException) {
                th = ((DispatchException) th).getCause();
            }
            dVar.resumeWith(kotlin.a.b(th));
        }
    }

    public static final <T, R> Object startUndispatchedOrReturn(ScopeCoroutine<? super T> scopeCoroutine, R r, p pVar) {
        return startUndspatched(scopeCoroutine, true, r, pVar);
    }

    public static final <T, R> Object startUndispatchedOrReturnIgnoreTimeout(ScopeCoroutine<? super T> scopeCoroutine, R r, p pVar) {
        return startUndspatched(scopeCoroutine, false, r, pVar);
    }

    private static final <T, R> Object startUndspatched(ScopeCoroutine<? super T> scopeCoroutine, boolean z, R r, p pVar) throws Throwable {
        Object completedExceptionally;
        Object objMakeCompletingOnce$kotlinx_coroutines_core;
        try {
            if (pVar instanceof a) {
                c0.c(2, pVar);
                completedExceptionally = pVar.invoke(r, scopeCoroutine);
            } else {
                completedExceptionally = e.k(pVar, r, scopeCoroutine);
            }
        } catch (DispatchException e) {
            dispatchExceptionAndMakeCompleting(scopeCoroutine, e);
            b.b();
            return null;
        } catch (Throwable th) {
            completedExceptionally = new CompletedExceptionally(th, false, 2, null);
        }
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        if (completedExceptionally == aVar || (objMakeCompletingOnce$kotlinx_coroutines_core = scopeCoroutine.makeCompletingOnce$kotlinx_coroutines_core(completedExceptionally)) == JobSupportKt.COMPLETING_WAITING_CHILDREN) {
            return aVar;
        }
        scopeCoroutine.afterCompletionUndispatched();
        if (!(objMakeCompletingOnce$kotlinx_coroutines_core instanceof CompletedExceptionally)) {
            return JobSupportKt.unboxState(objMakeCompletingOnce$kotlinx_coroutines_core);
        }
        if (z || notOwnTimeout(scopeCoroutine, ((CompletedExceptionally) objMakeCompletingOnce$kotlinx_coroutines_core).cause)) {
            throw ((CompletedExceptionally) objMakeCompletingOnce$kotlinx_coroutines_core).cause;
        }
        if (completedExceptionally instanceof CompletedExceptionally) {
            throw ((CompletedExceptionally) completedExceptionally).cause;
        }
        return completedExceptionally;
    }
}
