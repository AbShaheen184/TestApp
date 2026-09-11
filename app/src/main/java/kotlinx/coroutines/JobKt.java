package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;
import kotlin.c;
import kotlin.coroutines.d;
import kotlin.coroutines.i;
import kotlin.y;

/* JADX INFO: loaded from: classes.dex */
public final class JobKt {
    public static final CompletableJob Job(Job job) {
        return JobKt__JobKt.Job(job);
    }

    public static final Object cancelAndJoin(Job job, d<? super y> dVar) {
        return JobKt__JobKt.cancelAndJoin(job, dVar);
    }

    @c
    public static final void cancelFutureOnCancellation(CancellableContinuation<?> cancellableContinuation, Future<?> future) {
        JobKt__FutureKt.cancelFutureOnCancellation(cancellableContinuation, future);
    }

    public static final DisposableHandle disposeOnCompletion(Job job, DisposableHandle disposableHandle) {
        return JobKt__JobKt.disposeOnCompletion(job, disposableHandle);
    }

    public static final void ensureActive(i iVar) {
        JobKt__JobKt.ensureActive(iVar);
    }

    public static final Job getJob(i iVar) {
        return JobKt__JobKt.getJob(iVar);
    }

    public static final DisposableHandle invokeOnCompletion(Job job, boolean z, JobNode jobNode) {
        return JobKt__JobKt.invokeOnCompletion(job, z, jobNode);
    }

    public static final boolean isActive(i iVar) {
        return JobKt__JobKt.isActive(iVar);
    }

    public static final void ensureActive(Job job) {
        JobKt__JobKt.ensureActive(job);
    }

    public static final void cancel(i iVar, CancellationException cancellationException) {
        JobKt__JobKt.cancel(iVar, cancellationException);
    }

    public static final void cancelChildren(i iVar, CancellationException cancellationException) {
        JobKt__JobKt.cancelChildren(iVar, cancellationException);
    }

    public static final void cancel(Job job, String str, Throwable th) {
        JobKt__JobKt.cancel(job, str, th);
    }

    public static final void cancelChildren(Job job, CancellationException cancellationException) {
        JobKt__JobKt.cancelChildren(job, cancellationException);
    }
}
