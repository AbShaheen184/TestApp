package kotlinx.coroutines;

import kotlin.coroutines.i;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class DispatchException extends Exception {
    private final Throwable cause;

    public DispatchException(Throwable th, CoroutineDispatcher coroutineDispatcher, i iVar) {
        super("Coroutine dispatcher " + coroutineDispatcher + " threw an exception, context = " + iVar, th);
        this.cause = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.cause;
    }
}
