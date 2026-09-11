package kotlinx.coroutines.internal;

import com.google.android.material.shape.e;
import kotlin.coroutines.i;
import kotlin.coroutines.jvm.internal.d;
import kotlinx.coroutines.AbstractCoroutine;
import kotlinx.coroutines.CompletionStateKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class ScopeCoroutine<T> extends AbstractCoroutine<T> implements d {
    public final kotlin.coroutines.d<T> uCont;

    /* JADX WARN: Multi-variable type inference failed */
    public ScopeCoroutine(i iVar, kotlin.coroutines.d<? super T> dVar) {
        super(iVar, true, true);
        this.uCont = dVar;
    }

    @Override // kotlinx.coroutines.JobSupport
    public void afterCompletion(Object obj) {
        DispatchedContinuationKt.resumeCancellableWith(e.g(this.uCont), CompletionStateKt.recoverResult(obj, this.uCont));
    }

    @Override // kotlinx.coroutines.AbstractCoroutine
    public void afterResume(Object obj) {
        kotlin.coroutines.d<T> dVar = this.uCont;
        dVar.resumeWith(CompletionStateKt.recoverResult(obj, dVar));
    }

    @Override // kotlin.coroutines.jvm.internal.d
    public final d getCallerFrame() {
        kotlin.coroutines.d<T> dVar = this.uCont;
        if (dVar instanceof d) {
            return (d) dVar;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.d
    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlinx.coroutines.JobSupport
    public final boolean isScopedCoroutine() {
        return true;
    }

    public void afterCompletionUndispatched() {
    }
}
