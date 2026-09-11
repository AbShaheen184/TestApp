package kotlinx.coroutines;

import kotlin.coroutines.d;
import kotlin.coroutines.e;
import kotlin.coroutines.i;
import kotlin.k;
import kotlinx.coroutines.internal.ScopeCoroutine;
import kotlinx.coroutines.internal.ThreadContextKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class UndispatchedCoroutine<T> extends ScopeCoroutine<T> {
    private volatile boolean threadLocalIsSet;
    private final ThreadLocal<k> threadStateToRecover;

    /* JADX WARN: Illegal instructions before constructor call */
    public UndispatchedCoroutine(i iVar, d<? super T> dVar) {
        UndispatchedMarker undispatchedMarker = UndispatchedMarker.INSTANCE;
        super(iVar.get(undispatchedMarker) == null ? iVar.plus(undispatchedMarker) : iVar, dVar);
        this.threadStateToRecover = new ThreadLocal<>();
        if (dVar.getContext().get(e.e) instanceof CoroutineDispatcher) {
            return;
        }
        Object objUpdateThreadContext = ThreadContextKt.updateThreadContext(iVar, null);
        ThreadContextKt.restoreThreadContext(iVar, objUpdateThreadContext);
        saveThreadContext(iVar, objUpdateThreadContext);
    }

    private final void clearThreadLocal() {
        if (this.threadLocalIsSet) {
            k kVar = this.threadStateToRecover.get();
            if (kVar != null) {
                ThreadContextKt.restoreThreadContext((i) kVar.e, kVar.y);
            }
            this.threadStateToRecover.remove();
        }
    }

    @Override // kotlinx.coroutines.internal.ScopeCoroutine
    public void afterCompletionUndispatched() {
        clearThreadLocal();
    }

    @Override // kotlinx.coroutines.internal.ScopeCoroutine, kotlinx.coroutines.AbstractCoroutine
    public void afterResume(Object obj) {
        clearThreadLocal();
        Object objRecoverResult = CompletionStateKt.recoverResult(obj, this.uCont);
        d<T> dVar = this.uCont;
        i context = dVar.getContext();
        Object objUpdateThreadContext = ThreadContextKt.updateThreadContext(context, null);
        UndispatchedCoroutine<?> undispatchedCoroutineUpdateUndispatchedCompletion = objUpdateThreadContext != ThreadContextKt.NO_THREAD_ELEMENTS ? CoroutineContextKt.updateUndispatchedCompletion(dVar, context, objUpdateThreadContext) : null;
        try {
            this.uCont.resumeWith(objRecoverResult);
        } finally {
            if (undispatchedCoroutineUpdateUndispatchedCompletion == null || undispatchedCoroutineUpdateUndispatchedCompletion.clearThreadContext()) {
                ThreadContextKt.restoreThreadContext(context, objUpdateThreadContext);
            }
        }
    }

    public final boolean clearThreadContext() {
        boolean z = this.threadLocalIsSet && this.threadStateToRecover.get() == null;
        this.threadStateToRecover.remove();
        return !z;
    }

    public final void saveThreadContext(i iVar, Object obj) {
        this.threadLocalIsSet = true;
        this.threadStateToRecover.set(new k(iVar, obj));
    }
}
