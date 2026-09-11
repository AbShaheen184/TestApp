package kotlinx.coroutines.intrinsics;

import com.google.android.material.shape.e;
import kotlin.a;
import kotlin.coroutines.d;
import kotlin.coroutines.i;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.intrinsics.c;
import kotlin.coroutines.j;
import kotlin.jvm.functions.l;
import kotlin.jvm.functions.p;
import kotlin.y;
import kotlinx.coroutines.DispatchException;
import kotlinx.coroutines.InternalCoroutinesApi;
import kotlinx.coroutines.internal.DispatchedContinuationKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class CancellableKt {
    private static final void dispatcherFailure(d<?> dVar, Throwable th) throws Throwable {
        if (th instanceof DispatchException) {
            th = ((DispatchException) th).getCause();
        }
        dVar.resumeWith(a.b(th));
        throw th;
    }

    private static final void runSafely(d<?> dVar, kotlin.jvm.functions.a aVar) throws Throwable {
        try {
            aVar.invoke();
        } catch (Throwable th) {
            dispatcherFailure(dVar, th);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InternalCoroutinesApi
    public static final <T> void startCoroutineCancellable(l lVar, d<? super T> dVar) throws Throwable {
        d<y> bVar;
        try {
            lVar.getClass();
            dVar.getClass();
            if (lVar instanceof kotlin.coroutines.jvm.internal.a) {
                bVar = ((kotlin.coroutines.jvm.internal.a) lVar).create(dVar);
            } else {
                i context = dVar.getContext();
                bVar = context == j.e ? new b(dVar, lVar) : new c(dVar, context, lVar);
            }
            DispatchedContinuationKt.resumeCancellableWith(e.g(bVar), y.a);
        } catch (Throwable th) {
            dispatcherFailure(dVar, th);
        }
    }

    public static final <R, T> void startCoroutineCancellable(p pVar, R r, d<? super T> dVar) {
        try {
            DispatchedContinuationKt.resumeCancellableWith(e.g(e.b(pVar, r, dVar)), y.a);
        } catch (Throwable th) {
            dispatcherFailure(dVar, th);
        }
    }

    public static final void startCoroutineCancellable(d<? super y> dVar, d<?> dVar2) throws Throwable {
        try {
            DispatchedContinuationKt.resumeCancellableWith(e.g(dVar), y.a);
        } catch (Throwable th) {
            dispatcherFailure(dVar2, th);
        }
    }
}
