package kotlinx.coroutines;

import kotlin.jvm.functions.q;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
final class CompletedContinuation<R> {
    public final Throwable cancelCause;
    public final CancelHandler cancelHandler;
    public final Object idempotentResume;
    public final q onCancellation;
    public final R result;

    public /* synthetic */ CompletedContinuation(Object obj, CancelHandler cancelHandler, q qVar, Object obj2, Throwable th, int i, f fVar) {
        this(obj, (i & 2) != 0 ? null : cancelHandler, (i & 4) != 0 ? null : qVar, (i & 8) != 0 ? null : obj2, (i & 16) != 0 ? null : th);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CompletedContinuation copy$default(CompletedContinuation completedContinuation, Object obj, CancelHandler cancelHandler, q qVar, Object obj2, Throwable th, int i, Object obj3) {
        if ((i & 1) != 0) {
            obj = completedContinuation.result;
        }
        if ((i & 2) != 0) {
            cancelHandler = completedContinuation.cancelHandler;
        }
        if ((i & 4) != 0) {
            qVar = completedContinuation.onCancellation;
        }
        if ((i & 8) != 0) {
            obj2 = completedContinuation.idempotentResume;
        }
        if ((i & 16) != 0) {
            th = completedContinuation.cancelCause;
        }
        Throwable th2 = th;
        q qVar2 = qVar;
        return completedContinuation.copy(obj, cancelHandler, qVar2, obj2, th2);
    }

    public final R component1() {
        return this.result;
    }

    public final CancelHandler component2() {
        return this.cancelHandler;
    }

    public final q component3() {
        return this.onCancellation;
    }

    public final Object component4() {
        return this.idempotentResume;
    }

    public final Throwable component5() {
        return this.cancelCause;
    }

    public final CompletedContinuation<R> copy(R r, CancelHandler cancelHandler, q qVar, Object obj, Throwable th) {
        return new CompletedContinuation<>(r, cancelHandler, qVar, obj, th);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CompletedContinuation)) {
            return false;
        }
        CompletedContinuation completedContinuation = (CompletedContinuation) obj;
        return l.a(this.result, completedContinuation.result) && l.a(this.cancelHandler, completedContinuation.cancelHandler) && l.a(this.onCancellation, completedContinuation.onCancellation) && l.a(this.idempotentResume, completedContinuation.idempotentResume) && l.a(this.cancelCause, completedContinuation.cancelCause);
    }

    public final boolean getCancelled() {
        return this.cancelCause != null;
    }

    public int hashCode() {
        R r = this.result;
        int iHashCode = (r == null ? 0 : r.hashCode()) * 31;
        CancelHandler cancelHandler = this.cancelHandler;
        int iHashCode2 = (iHashCode + (cancelHandler == null ? 0 : cancelHandler.hashCode())) * 31;
        q qVar = this.onCancellation;
        int iHashCode3 = (iHashCode2 + (qVar == null ? 0 : qVar.hashCode())) * 31;
        Object obj = this.idempotentResume;
        int iHashCode4 = (iHashCode3 + (obj == null ? 0 : obj.hashCode())) * 31;
        Throwable th = this.cancelCause;
        return iHashCode4 + (th != null ? th.hashCode() : 0);
    }

    public final void invokeHandlers(CancellableContinuationImpl<?> cancellableContinuationImpl, Throwable th) {
        CancelHandler cancelHandler = this.cancelHandler;
        if (cancelHandler != null) {
            cancellableContinuationImpl.callCancelHandler(cancelHandler, th);
        }
        q qVar = this.onCancellation;
        if (qVar != null) {
            cancellableContinuationImpl.callOnCancellation(qVar, th, this.result);
        }
    }

    public String toString() {
        return "CompletedContinuation(result=" + this.result + ", cancelHandler=" + this.cancelHandler + ", onCancellation=" + this.onCancellation + ", idempotentResume=" + this.idempotentResume + ", cancelCause=" + this.cancelCause + ')';
    }

    public CompletedContinuation(R r, CancelHandler cancelHandler, q qVar, Object obj, Throwable th) {
        this.result = r;
        this.cancelHandler = cancelHandler;
        this.onCancellation = qVar;
        this.idempotentResume = obj;
        this.cancelCause = th;
    }
}
