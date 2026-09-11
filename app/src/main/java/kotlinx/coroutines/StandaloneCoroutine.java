package kotlinx.coroutines;

import kotlin.coroutines.i;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
class StandaloneCoroutine extends AbstractCoroutine<y> {
    public StandaloneCoroutine(i iVar, boolean z) {
        super(iVar, true, z);
    }

    @Override // kotlinx.coroutines.JobSupport
    public boolean handleJobException(Throwable th) {
        CoroutineExceptionHandlerKt.handleCoroutineException(getContext(), th);
        return true;
    }
}
