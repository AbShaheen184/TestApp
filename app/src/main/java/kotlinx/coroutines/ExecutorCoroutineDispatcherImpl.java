package kotlinx.coroutines;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.c;
import kotlin.coroutines.d;
import kotlin.coroutines.i;
import kotlin.y;
import kotlinx.coroutines.internal.ConcurrentKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class ExecutorCoroutineDispatcherImpl extends ExecutorCoroutineDispatcher implements Delay {
    private final Executor executor;

    public ExecutorCoroutineDispatcherImpl(Executor executor) {
        this.executor = executor;
        ConcurrentKt.removeFutureOnCancel(getExecutor());
    }

    private final void cancelJobOnRejection(i iVar, RejectedExecutionException rejectedExecutionException) {
        JobKt.cancel(iVar, ExceptionsKt.CancellationException("The task was rejected", rejectedExecutionException));
    }

    private final ScheduledFuture<?> scheduleBlock(ScheduledExecutorService scheduledExecutorService, Runnable runnable, i iVar, long j) {
        try {
            return scheduledExecutorService.schedule(runnable, j, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e) {
            cancelJobOnRejection(iVar, e);
            return null;
        }
    }

    @Override // kotlinx.coroutines.ExecutorCoroutineDispatcher, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Executor executor = getExecutor();
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    @Override // kotlinx.coroutines.Delay
    @c
    public Object delay(long j, d<? super y> dVar) {
        return Delay.DefaultImpls.delay(this, j, dVar);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* JADX INFO: renamed from: dispatch */
    public void mo86dispatch(i iVar, Runnable runnable) {
        Runnable runnableWrapTask;
        try {
            Executor executor = getExecutor();
            AbstractTimeSource abstractTimeSource = AbstractTimeSourceKt.timeSource;
            if (abstractTimeSource == null || (runnableWrapTask = abstractTimeSource.wrapTask(runnable)) == null) {
                runnableWrapTask = runnable;
            }
            executor.execute(runnableWrapTask);
        } catch (RejectedExecutionException e) {
            AbstractTimeSource abstractTimeSource2 = AbstractTimeSourceKt.timeSource;
            if (abstractTimeSource2 != null) {
                abstractTimeSource2.unTrackTask();
            }
            cancelJobOnRejection(iVar, e);
            Dispatchers.getIO().mo86dispatch(iVar, runnable);
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof ExecutorCoroutineDispatcherImpl) && ((ExecutorCoroutineDispatcherImpl) obj).getExecutor() == getExecutor();
    }

    @Override // kotlinx.coroutines.ExecutorCoroutineDispatcher
    public Executor getExecutor() {
        return this.executor;
    }

    public int hashCode() {
        return System.identityHashCode(getExecutor());
    }

    @Override // kotlinx.coroutines.Delay
    public DisposableHandle invokeOnTimeout(long j, Runnable runnable, i iVar) {
        long j2;
        Runnable runnable2;
        i iVar2;
        Executor executor = getExecutor();
        ScheduledFuture<?> scheduledFutureScheduleBlock = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            j2 = j;
            runnable2 = runnable;
            iVar2 = iVar;
            scheduledFutureScheduleBlock = scheduleBlock(scheduledExecutorService, runnable2, iVar2, j2);
        } else {
            j2 = j;
            runnable2 = runnable;
            iVar2 = iVar;
        }
        return scheduledFutureScheduleBlock != null ? new DisposableFutureHandle(scheduledFutureScheduleBlock) : DefaultExecutor.INSTANCE.invokeOnTimeout(j2, runnable2, iVar2);
    }

    @Override // kotlinx.coroutines.Delay
    /* JADX INFO: renamed from: scheduleResumeAfterDelay */
    public void mo87scheduleResumeAfterDelay(long j, CancellableContinuation<? super y> cancellableContinuation) {
        long j2;
        Executor executor = getExecutor();
        ScheduledFuture<?> scheduledFutureScheduleBlock = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            j2 = j;
            scheduledFutureScheduleBlock = scheduleBlock(scheduledExecutorService, new ResumeUndispatchedRunnable(this, cancellableContinuation), cancellableContinuation.getContext(), j2);
        } else {
            j2 = j;
        }
        if (scheduledFutureScheduleBlock != null) {
            CancellableContinuationKt.invokeOnCancellation(cancellableContinuation, new CancelFutureOnCancel(scheduledFutureScheduleBlock));
        } else {
            DefaultExecutor.INSTANCE.mo87scheduleResumeAfterDelay(j2, cancellableContinuation);
        }
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public String toString() {
        return getExecutor().toString();
    }
}
