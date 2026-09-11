package kotlinx.coroutines;

import kotlin.coroutines.d;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
final class ResumeOnCompletion extends JobNode {
    private final d<y> continuation;

    /* JADX WARN: Multi-variable type inference failed */
    public ResumeOnCompletion(d<? super y> dVar) {
        this.continuation = dVar;
    }

    @Override // kotlinx.coroutines.JobNode
    public boolean getOnCancelling() {
        return false;
    }

    @Override // kotlinx.coroutines.JobNode
    public void invoke(Throwable th) {
        this.continuation.resumeWith(y.a);
    }
}
