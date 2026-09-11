package kotlinx.coroutines;

import kotlin.coroutines.d;
import kotlin.coroutines.i;
import kotlinx.coroutines.internal.ScopeCoroutine;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
final class SupervisorCoroutine<T> extends ScopeCoroutine<T> {
    public SupervisorCoroutine(i iVar, d<? super T> dVar) {
        super(iVar, dVar);
    }

    @Override // kotlinx.coroutines.JobSupport
    public boolean childCancelled(Throwable th) {
        return false;
    }
}
