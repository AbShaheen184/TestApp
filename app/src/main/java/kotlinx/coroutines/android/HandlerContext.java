package kotlinx.coroutines.android;

import android.os.Handler;
import android.os.Looper;
import androidx.constraintlayout.core.g;
import androidx.datastore.core.s0;
import androidx.datastore.core.t0;
import androidx.media3.ui.c0;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.i;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;
import kotlin.y;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.Delay;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.NonDisposableHandle;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class HandlerContext extends HandlerDispatcher implements Delay {
    private final Handler handler;
    private final HandlerContext immediate;
    private final boolean invokeImmediately;
    private final String name;

    private HandlerContext(Handler handler, String str, boolean z) {
        super(null);
        this.handler = handler;
        this.name = str;
        this.invokeImmediately = z;
        this.immediate = z ? this : new HandlerContext(handler, str, true);
    }

    private final void cancelOnRejection(i iVar, Runnable runnable) {
        JobKt.cancel(iVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        Dispatchers.getIO().mo86dispatch(iVar, runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeOnTimeout$lambda$3(HandlerContext handlerContext, Runnable runnable) {
        handlerContext.handler.removeCallbacks(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void scheduleResumeAfterDelay$lambda$1(CancellableContinuation cancellableContinuation, HandlerContext handlerContext) {
        cancellableContinuation.resumeUndispatched(handlerContext, y.a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y scheduleResumeAfterDelay$lambda$2(HandlerContext handlerContext, Runnable runnable, Throwable th) {
        handlerContext.handler.removeCallbacks(runnable);
        return y.a;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* JADX INFO: renamed from: dispatch */
    public void mo86dispatch(i iVar, Runnable runnable) {
        if (this.handler.post(runnable)) {
            return;
        }
        cancelOnRejection(iVar, runnable);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof HandlerContext)) {
            return false;
        }
        HandlerContext handlerContext = (HandlerContext) obj;
        return handlerContext.handler == this.handler && handlerContext.invokeImmediately == this.invokeImmediately;
    }

    public int hashCode() {
        return System.identityHashCode(this.handler) ^ (this.invokeImmediately ? 1231 : 1237);
    }

    @Override // kotlinx.coroutines.android.HandlerDispatcher, kotlinx.coroutines.Delay
    public DisposableHandle invokeOnTimeout(long j, Runnable runnable, i iVar) {
        Handler handler = this.handler;
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (handler.postDelayed(runnable, j)) {
            return new s0(1, this, runnable);
        }
        cancelOnRejection(iVar, runnable);
        return NonDisposableHandle.INSTANCE;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public boolean isDispatchNeeded(i iVar) {
        return (this.invokeImmediately && l.a(Looper.myLooper(), this.handler.getLooper())) ? false : true;
    }

    @Override // kotlinx.coroutines.Delay
    /* JADX INFO: renamed from: scheduleResumeAfterDelay */
    public void mo87scheduleResumeAfterDelay(long j, CancellableContinuation<? super y> cancellableContinuation) {
        c0 c0Var = new c0(15, cancellableContinuation, this);
        Handler handler = this.handler;
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (handler.postDelayed(c0Var, j)) {
            cancellableContinuation.invokeOnCancellation(new t0(21, this, c0Var));
        } else {
            cancelOnRejection(cancellableContinuation.getContext(), c0Var);
        }
    }

    @Override // kotlinx.coroutines.MainCoroutineDispatcher, kotlinx.coroutines.CoroutineDispatcher
    public String toString() {
        String stringInternalImpl = toStringInternalImpl();
        if (stringInternalImpl != null) {
            return stringInternalImpl;
        }
        String string = this.name;
        if (string == null) {
            string = this.handler.toString();
        }
        return this.invokeImmediately ? g.c(string, ".immediate") : string;
    }

    @Override // kotlinx.coroutines.android.HandlerDispatcher, kotlinx.coroutines.MainCoroutineDispatcher
    public HandlerContext getImmediate() {
        return this.immediate;
    }

    public /* synthetic */ HandlerContext(Handler handler, String str, int i, f fVar) {
        this(handler, (i & 2) != 0 ? null : str);
    }

    public HandlerContext(Handler handler, String str) {
        this(handler, str, false);
    }
}
