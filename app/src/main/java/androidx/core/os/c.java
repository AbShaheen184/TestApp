package androidx.core.os;

import android.os.OutcomeReceiver;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.coroutines.CancellableContinuationImpl;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends AtomicBoolean implements OutcomeReceiver {
    public final CancellableContinuationImpl e;

    public c(CancellableContinuationImpl cancellableContinuationImpl) {
        super(false);
        this.e = cancellableContinuationImpl;
    }

    public final void onError(Throwable th) {
        if (compareAndSet(false, true)) {
            this.e.resumeWith(kotlin.a.b(th));
        }
    }

    public final void onResult(Object obj) {
        if (compareAndSet(false, true)) {
            this.e.resumeWith(obj);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    public final String toString() {
        return "ContinuationOutcomeReceiver(outcomeReceived = " + get() + ')';
    }
}
