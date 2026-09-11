package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.c;
import kotlin.coroutines.d;
import kotlin.coroutines.i;
import kotlin.coroutines.j;
import kotlin.jvm.functions.l;
import kotlin.y;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineExceptionHandlerKt;
import kotlinx.coroutines.DefaultExecutorKt;
import kotlinx.coroutines.Delay;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.InternalCoroutinesApi;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class LimitedDispatcher extends CoroutineDispatcher implements Delay {
    private static final /* synthetic */ AtomicIntegerFieldUpdater runningWorkers$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(LimitedDispatcher.class, "runningWorkers$volatile");
    private final /* synthetic */ Delay $$delegate_0;
    private final CoroutineDispatcher dispatcher;
    private final String name;
    private final int parallelism;
    private final LockFreeTaskQueue<Runnable> queue;
    private volatile /* synthetic */ int runningWorkers$volatile;
    private final Object workerAllocationLock;

    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    public final class Worker implements Runnable {
        private Runnable currentTask;

        public Worker(Runnable runnable) {
            this.currentTask = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i = 0;
            while (true) {
                try {
                    this.currentTask.run();
                } catch (Throwable th) {
                    CoroutineExceptionHandlerKt.handleCoroutineException(j.e, th);
                }
                try {
                    Runnable runnableObtainTaskOrDeallocateWorker = LimitedDispatcher.this.obtainTaskOrDeallocateWorker();
                    if (runnableObtainTaskOrDeallocateWorker == null) {
                        return;
                    }
                    this.currentTask = runnableObtainTaskOrDeallocateWorker;
                    i++;
                    if (i >= 16 && DispatchedContinuationKt.safeIsDispatchNeeded(LimitedDispatcher.this.dispatcher, LimitedDispatcher.this)) {
                        DispatchedContinuationKt.safeDispatch(LimitedDispatcher.this.dispatcher, LimitedDispatcher.this, this);
                        return;
                    }
                } catch (Throwable th2) {
                    Object obj = LimitedDispatcher.this.workerAllocationLock;
                    LimitedDispatcher limitedDispatcher = LimitedDispatcher.this;
                    synchronized (obj) {
                        LimitedDispatcher.getRunningWorkers$volatile$FU().decrementAndGet(limitedDispatcher);
                        throw th2;
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LimitedDispatcher(CoroutineDispatcher coroutineDispatcher, int i, String str) {
        Delay delay = coroutineDispatcher instanceof Delay ? (Delay) coroutineDispatcher : null;
        this.$$delegate_0 = delay == null ? DefaultExecutorKt.getDefaultDelay() : delay;
        this.dispatcher = coroutineDispatcher;
        this.parallelism = i;
        this.name = str;
        this.queue = new LockFreeTaskQueue<>(false);
        this.workerAllocationLock = new Object();
    }

    private final void dispatchInternal(Runnable runnable, l lVar) {
        Runnable runnableObtainTaskOrDeallocateWorker;
        this.queue.addLast(runnable);
        if (runningWorkers$volatile$FU.get(this) < this.parallelism && tryAllocateWorker() && (runnableObtainTaskOrDeallocateWorker = obtainTaskOrDeallocateWorker()) != null) {
            try {
                lVar.invoke(new Worker(runnableObtainTaskOrDeallocateWorker));
            } catch (Throwable th) {
                runningWorkers$volatile$FU.decrementAndGet(this);
                throw th;
            }
        }
    }

    private final /* synthetic */ int getRunningWorkers$volatile() {
        return this.runningWorkers$volatile;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicIntegerFieldUpdater getRunningWorkers$volatile$FU() {
        return runningWorkers$volatile$FU;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Runnable obtainTaskOrDeallocateWorker() {
        while (true) {
            Runnable runnableRemoveFirstOrNull = this.queue.removeFirstOrNull();
            if (runnableRemoveFirstOrNull != null) {
                return runnableRemoveFirstOrNull;
            }
            synchronized (this.workerAllocationLock) {
                runningWorkers$volatile$FU.decrementAndGet(this);
                if (this.queue.getSize() == 0) {
                    return null;
                }
                runningWorkers$volatile$FU.incrementAndGet(this);
            }
        }
    }

    private final /* synthetic */ void setRunningWorkers$volatile(int i) {
        this.runningWorkers$volatile = i;
    }

    private final boolean tryAllocateWorker() {
        synchronized (this.workerAllocationLock) {
            if (runningWorkers$volatile$FU.get(this) >= this.parallelism) {
                return false;
            }
            runningWorkers$volatile$FU.incrementAndGet(this);
            return true;
        }
    }

    @Override // kotlinx.coroutines.Delay
    @c
    public Object delay(long j, d<? super y> dVar) {
        return this.$$delegate_0.delay(j, dVar);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    /* JADX INFO: renamed from: dispatch */
    public void mo86dispatch(i iVar, Runnable runnable) {
        Runnable runnableObtainTaskOrDeallocateWorker;
        this.queue.addLast(runnable);
        if (runningWorkers$volatile$FU.get(this) >= this.parallelism || !tryAllocateWorker() || (runnableObtainTaskOrDeallocateWorker = obtainTaskOrDeallocateWorker()) == null) {
            return;
        }
        try {
            DispatchedContinuationKt.safeDispatch(this.dispatcher, this, new Worker(runnableObtainTaskOrDeallocateWorker));
        } catch (Throwable th) {
            runningWorkers$volatile$FU.decrementAndGet(this);
            throw th;
        }
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    @InternalCoroutinesApi
    public void dispatchYield(i iVar, Runnable runnable) {
        Runnable runnableObtainTaskOrDeallocateWorker;
        this.queue.addLast(runnable);
        if (runningWorkers$volatile$FU.get(this) >= this.parallelism || !tryAllocateWorker() || (runnableObtainTaskOrDeallocateWorker = obtainTaskOrDeallocateWorker()) == null) {
            return;
        }
        try {
            this.dispatcher.dispatchYield(this, new Worker(runnableObtainTaskOrDeallocateWorker));
        } catch (Throwable th) {
            runningWorkers$volatile$FU.decrementAndGet(this);
            throw th;
        }
    }

    @Override // kotlinx.coroutines.Delay
    public DisposableHandle invokeOnTimeout(long j, Runnable runnable, i iVar) {
        return this.$$delegate_0.invokeOnTimeout(j, runnable, iVar);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public CoroutineDispatcher limitedParallelism(int i, String str) {
        LimitedDispatcherKt.checkParallelism(i);
        return i >= this.parallelism ? LimitedDispatcherKt.namedOrThis(this, str) : super.limitedParallelism(i, str);
    }

    @Override // kotlinx.coroutines.Delay
    /* JADX INFO: renamed from: scheduleResumeAfterDelay */
    public void mo87scheduleResumeAfterDelay(long j, CancellableContinuation<? super y> cancellableContinuation) {
        this.$$delegate_0.mo87scheduleResumeAfterDelay(j, cancellableContinuation);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public String toString() {
        String str = this.name;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.dispatcher);
        sb.append(".limitedParallelism(");
        return androidx.privacysandbox.ads.adservices.java.internal.a.s(sb, this.parallelism, ')');
    }
}
