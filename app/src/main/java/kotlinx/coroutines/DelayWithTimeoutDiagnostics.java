package kotlinx.coroutines;

import kotlin.c;
import kotlin.coroutines.d;
import kotlin.coroutines.i;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
@InternalCoroutinesApi
public interface DelayWithTimeoutDiagnostics extends Delay {

    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    public static final class DefaultImpls {
        @c
        public static Object delay(DelayWithTimeoutDiagnostics delayWithTimeoutDiagnostics, long j, d<? super y> dVar) {
            Object objDelay = Delay.DefaultImpls.delay(delayWithTimeoutDiagnostics, j, dVar);
            return objDelay == kotlin.coroutines.intrinsics.a.e ? objDelay : y.a;
        }

        public static DisposableHandle invokeOnTimeout(DelayWithTimeoutDiagnostics delayWithTimeoutDiagnostics, long j, Runnable runnable, i iVar) {
            return Delay.DefaultImpls.invokeOnTimeout(delayWithTimeoutDiagnostics, j, runnable, iVar);
        }
    }

    /* JADX INFO: renamed from: timeoutMessage-LRDsOJo, reason: not valid java name */
    String m19timeoutMessageLRDsOJo(long j);
}
