package kotlinx.coroutines;

import com.google.android.material.shape.e;
import kotlin.c;
import kotlin.coroutines.d;
import kotlin.coroutines.i;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
@InternalCoroutinesApi
public interface Delay {

    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    public static final class DefaultImpls {
        @c
        public static Object delay(Delay delay, long j, d<? super y> dVar) {
            y yVar = y.a;
            if (j <= 0) {
                return yVar;
            }
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(e.g(dVar), 1);
            cancellableContinuationImpl.initCancellability();
            delay.mo87scheduleResumeAfterDelay(j, cancellableContinuationImpl);
            Object result = cancellableContinuationImpl.getResult();
            return result == kotlin.coroutines.intrinsics.a.e ? result : yVar;
        }

        public static DisposableHandle invokeOnTimeout(Delay delay, long j, Runnable runnable, i iVar) {
            return DefaultExecutorKt.getDefaultDelay().invokeOnTimeout(j, runnable, iVar);
        }
    }

    @c
    Object delay(long j, d<? super y> dVar);

    DisposableHandle invokeOnTimeout(long j, Runnable runnable, i iVar);

    /* JADX INFO: renamed from: scheduleResumeAfterDelay */
    void mo87scheduleResumeAfterDelay(long j, CancellableContinuation<? super y> cancellableContinuation);
}
