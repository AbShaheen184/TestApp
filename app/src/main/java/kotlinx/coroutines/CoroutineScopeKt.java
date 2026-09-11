package kotlinx.coroutines;

import com.google.gson.b;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.d;
import kotlin.coroutines.i;
import kotlin.jvm.functions.p;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.internal.ScopeCoroutine;
import kotlinx.coroutines.intrinsics.UndispatchedKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class CoroutineScopeKt {
    public static final CoroutineScope CoroutineScope(i iVar) {
        if (iVar.get(Job.Key) == null) {
            iVar = iVar.plus(JobKt__JobKt.Job$default((Job) null, 1, (Object) null));
        }
        return new ContextScope(iVar);
    }

    public static final CoroutineScope MainScope() {
        return new ContextScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null).plus(Dispatchers.getMain()));
    }

    public static final void cancel(CoroutineScope coroutineScope, CancellationException cancellationException) {
        Job job = (Job) coroutineScope.getCoroutineContext().get(Job.Key);
        if (job != null) {
            job.cancel(cancellationException);
        } else {
            b.u(coroutineScope, "Scope cannot be cancelled because it does not have a job: ");
        }
    }

    public static /* synthetic */ void cancel$default(CoroutineScope coroutineScope, CancellationException cancellationException, int i, Object obj) {
        if ((i & 1) != 0) {
            cancellationException = null;
        }
        cancel(coroutineScope, cancellationException);
    }

    public static final <R> Object coroutineScope(p pVar, d<? super R> dVar) {
        ScopeCoroutine scopeCoroutine = new ScopeCoroutine(dVar.getContext(), dVar);
        return UndispatchedKt.startUndispatchedOrReturn(scopeCoroutine, scopeCoroutine, pVar);
    }

    public static final Object currentCoroutineContext(d<? super i> dVar) {
        return dVar.getContext();
    }

    private static final Object currentCoroutineContext$$forInline(d<? super i> dVar) {
        throw null;
    }

    public static final void ensureActive(CoroutineScope coroutineScope) {
        JobKt.ensureActive(coroutineScope.getCoroutineContext());
    }

    public static final boolean isActive(CoroutineScope coroutineScope) {
        Job job = (Job) coroutineScope.getCoroutineContext().get(Job.Key);
        if (job != null) {
            return job.isActive();
        }
        return true;
    }

    public static final CoroutineScope plus(CoroutineScope coroutineScope, i iVar) {
        return new ContextScope(coroutineScope.getCoroutineContext().plus(iVar));
    }

    public static /* synthetic */ void cancel$default(CoroutineScope coroutineScope, String str, Throwable th, int i, Object obj) {
        if ((i & 2) != 0) {
            th = null;
        }
        cancel(coroutineScope, str, th);
    }

    public static final void cancel(CoroutineScope coroutineScope, String str, Throwable th) {
        cancel(coroutineScope, ExceptionsKt.CancellationException(str, th));
    }

    public static /* synthetic */ void isActive$annotations(CoroutineScope coroutineScope) {
    }
}
