package kotlinx.coroutines;

import kotlin.coroutines.d;
import kotlin.m;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class CompletionStateKt {
    public static final <T> Object recoverResult(Object obj, d<? super T> dVar) {
        return obj instanceof CompletedExceptionally ? kotlin.a.b(((CompletedExceptionally) obj).cause) : obj;
    }

    public static final <T> Object toState(Object obj) {
        Throwable thA = m.a(obj);
        return thA == null ? obj : new CompletedExceptionally(thA, false, 2, null);
    }

    public static final <T> Object toState(Object obj, CancellableContinuation<?> cancellableContinuation) {
        Throwable thA = m.a(obj);
        return thA == null ? obj : new CompletedExceptionally(thA, false, 2, null);
    }
}
