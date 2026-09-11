package kotlinx.coroutines.android;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import com.google.android.material.shape.e;
import java.lang.reflect.InvocationTargetException;
import kotlin.c;
import kotlin.coroutines.d;
import kotlin.l;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class HandlerDispatcherKt {
    private static final long MAX_DELAY = 4611686018427387903L;
    public static final HandlerDispatcher Main;
    private static volatile Choreographer choreographer;

    static {
        Object lVar;
        try {
            lVar = new HandlerContext(asHandler(Looper.getMainLooper(), true), false ? 1 : 0, 2, false ? 1 : 0);
        } catch (Throwable th) {
            lVar = new l(th);
        }
        Main = (HandlerDispatcher) (lVar instanceof l ? null : lVar);
    }

    public static final Handler asHandler(Looper looper, boolean z) throws IllegalAccessException, InvocationTargetException {
        if (!z) {
            return new Handler(looper);
        }
        if (Build.VERSION.SDK_INT < 28) {
            try {
                return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
                return new Handler(looper);
            }
        }
        Object objInvoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
        objInvoke.getClass();
        return (Handler) objInvoke;
    }

    public static final Object awaitFrame(d<? super Long> dVar) {
        Choreographer choreographer2 = choreographer;
        if (choreographer2 == null) {
            return awaitFrameSlowPath(dVar);
        }
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(e.g(dVar), 1);
        cancellableContinuationImpl.initCancellability();
        postFrameCallback(choreographer2, cancellableContinuationImpl);
        return cancellableContinuationImpl.getResult();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object awaitFrameSlowPath(d<? super Long> dVar) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(e.g(dVar), 1);
        cancellableContinuationImpl.initCancellability();
        if (Looper.myLooper() == Looper.getMainLooper()) {
            updateChoreographerAndPostFrameCallback(cancellableContinuationImpl);
        } else {
            Dispatchers.getMain().mo86dispatch(cancellableContinuationImpl.getContext(), new Runnable() { // from class: kotlinx.coroutines.android.HandlerDispatcherKt$awaitFrameSlowPath$2$1
                @Override // java.lang.Runnable
                public final void run() {
                    HandlerDispatcherKt.updateChoreographerAndPostFrameCallback(cancellableContinuationImpl);
                }
            });
        }
        return cancellableContinuationImpl.getResult();
    }

    public static final HandlerDispatcher from(Handler handler) {
        return from$default(handler, null, 1, null);
    }

    public static /* synthetic */ HandlerDispatcher from$default(Handler handler, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        return from(handler, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void postFrameCallback(Choreographer choreographer2, CancellableContinuation<? super Long> cancellableContinuation) {
        choreographer2.postFrameCallback(new androidx.profileinstaller.d(cancellableContinuation));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void postFrameCallback$lambda$5(CancellableContinuation cancellableContinuation, long j) {
        cancellableContinuation.resumeUndispatched(Dispatchers.getMain(), Long.valueOf(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateChoreographerAndPostFrameCallback(CancellableContinuation<? super Long> cancellableContinuation) {
        Choreographer choreographer2 = choreographer;
        if (choreographer2 == null) {
            choreographer2 = Choreographer.getInstance();
            choreographer2.getClass();
            choreographer = choreographer2;
        }
        postFrameCallback(choreographer2, cancellableContinuation);
    }

    public static final HandlerDispatcher from(Handler handler, String str) {
        return new HandlerContext(handler, str);
    }

    @c
    public static /* synthetic */ void getMain$annotations() {
    }
}
