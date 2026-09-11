package kotlinx.coroutines;

import java.util.concurrent.Future;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
final class PublicCancelFutureOnCancel implements CancelHandler {
    private final Future<?> future;

    public PublicCancelFutureOnCancel(Future<?> future) {
        this.future = future;
    }

    @Override // kotlinx.coroutines.CancelHandler
    public void invoke(Throwable th) {
        if (th != null) {
            this.future.cancel(false);
        }
    }

    public String toString() {
        return "CancelFutureOnCancel[" + this.future + ']';
    }
}
