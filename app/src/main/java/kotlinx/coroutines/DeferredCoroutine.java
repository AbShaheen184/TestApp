package kotlinx.coroutines;

import kotlin.coroutines.d;
import kotlin.coroutines.i;
import kotlinx.coroutines.selects.SelectClause1;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
class DeferredCoroutine<T> extends AbstractCoroutine<T> implements Deferred<T> {
    public DeferredCoroutine(i iVar, boolean z) {
        super(iVar, true, z);
    }

    @Override // kotlinx.coroutines.Deferred
    public Object await(d<? super T> dVar) {
        return awaitInternal(dVar);
    }

    @Override // kotlinx.coroutines.Deferred
    public T getCompleted() {
        return (T) getCompletedInternal$kotlinx_coroutines_core();
    }

    @Override // kotlinx.coroutines.Deferred
    public SelectClause1<T> getOnAwait() {
        SelectClause1<T> selectClause1 = (SelectClause1<T>) getOnAwaitInternal();
        selectClause1.getClass();
        return selectClause1;
    }
}
