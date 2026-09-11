package kotlinx.coroutines;

import com.google.gson.b;
import kotlin.c;
import kotlin.coroutines.d;
import kotlin.coroutines.i;
import kotlin.jvm.functions.l;
import kotlin.jvm.functions.q;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public interface CancellableContinuation<T> extends d<T> {

    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    public static final class DefaultImpls {
        public static /* synthetic */ boolean cancel$default(CancellableContinuation cancellableContinuation, Throwable th, int i, Object obj) {
            if (obj != null) {
                b.r("Super calls with default arguments not supported in this target, function: cancel");
                return false;
            }
            if ((i & 1) != 0) {
                th = null;
            }
            return cancellableContinuation.cancel(th);
        }

        public static /* synthetic */ Object tryResume$default(CancellableContinuation cancellableContinuation, Object obj, Object obj2, int i, Object obj3) {
            if (obj3 != null) {
                b.r("Super calls with default arguments not supported in this target, function: tryResume");
                return null;
            }
            if ((i & 2) != 0) {
                obj2 = null;
            }
            return cancellableContinuation.tryResume(obj, obj2);
        }
    }

    boolean cancel(Throwable th);

    @InternalCoroutinesApi
    void completeResume(Object obj);

    @Override // kotlin.coroutines.d
    /* synthetic */ i getContext();

    @InternalCoroutinesApi
    void initCancellability();

    void invokeOnCancellation(l lVar);

    boolean isActive();

    boolean isCancelled();

    boolean isCompleted();

    @c
    void resume(T t, l lVar);

    <R extends T> void resume(R r, q qVar);

    @ExperimentalCoroutinesApi
    void resumeUndispatched(CoroutineDispatcher coroutineDispatcher, T t);

    @ExperimentalCoroutinesApi
    void resumeUndispatchedWithException(CoroutineDispatcher coroutineDispatcher, Throwable th);

    @Override // kotlin.coroutines.d
    /* synthetic */ void resumeWith(Object obj);

    @InternalCoroutinesApi
    Object tryResume(T t, Object obj);

    @InternalCoroutinesApi
    <R extends T> Object tryResume(R r, Object obj, q qVar);

    @InternalCoroutinesApi
    Object tryResumeWithException(Throwable th);
}
