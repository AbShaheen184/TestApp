package kotlinx.coroutines;

import com.google.android.material.shape.e;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.d;
import kotlin.jvm.internal.l;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
final class AwaitAll<T> {
    private static final /* synthetic */ AtomicIntegerFieldUpdater notCompletedCount$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(AwaitAll.class, "notCompletedCount$volatile");
    private final Deferred<T>[] deferreds;
    private volatile /* synthetic */ int notCompletedCount$volatile;

    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    public final class AwaitAllNode extends JobNode {
        private static final /* synthetic */ AtomicReferenceFieldUpdater _disposer$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(AwaitAllNode.class, Object.class, "_disposer$volatile");
        private volatile /* synthetic */ Object _disposer$volatile;
        private final CancellableContinuation<List<? extends T>> continuation;
        public DisposableHandle handle;

        /* JADX WARN: Multi-variable type inference failed */
        public AwaitAllNode(CancellableContinuation<? super List<? extends T>> cancellableContinuation) {
            this.continuation = cancellableContinuation;
        }

        private final /* synthetic */ Object get_disposer$volatile() {
            return this._disposer$volatile;
        }

        private final /* synthetic */ void set_disposer$volatile(Object obj) {
            this._disposer$volatile = obj;
        }

        public final AwaitAll<T>.DisposeHandlersOnCancel getDisposer() {
            return (DisposeHandlersOnCancel) _disposer$volatile$FU.get(this);
        }

        public final DisposableHandle getHandle() {
            DisposableHandle disposableHandle = this.handle;
            if (disposableHandle != null) {
                return disposableHandle;
            }
            l.f("handle");
            throw null;
        }

        @Override // kotlinx.coroutines.JobNode
        public boolean getOnCancelling() {
            return false;
        }

        @Override // kotlinx.coroutines.JobNode
        public void invoke(Throwable th) {
            if (th != null) {
                Object objTryResumeWithException = this.continuation.tryResumeWithException(th);
                if (objTryResumeWithException != null) {
                    this.continuation.completeResume(objTryResumeWithException);
                    AwaitAll<T>.DisposeHandlersOnCancel disposer = getDisposer();
                    if (disposer != null) {
                        disposer.disposeAll();
                        return;
                    }
                    return;
                }
                return;
            }
            if (AwaitAll.getNotCompletedCount$volatile$FU().decrementAndGet(AwaitAll.this) == 0) {
                CancellableContinuation<List<? extends T>> cancellableContinuation = this.continuation;
                Deferred[] deferredArr = ((AwaitAll) AwaitAll.this).deferreds;
                ArrayList arrayList = new ArrayList(deferredArr.length);
                for (Deferred deferred : deferredArr) {
                    arrayList.add(deferred.getCompleted());
                }
                cancellableContinuation.resumeWith(arrayList);
            }
        }

        public final void setDisposer(AwaitAll<T>.DisposeHandlersOnCancel disposeHandlersOnCancel) {
            _disposer$volatile$FU.set(this, disposeHandlersOnCancel);
        }

        public final void setHandle(DisposableHandle disposableHandle) {
            this.handle = disposableHandle;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    public final class DisposeHandlersOnCancel implements CancelHandler {
        private final AwaitAll<T>.AwaitAllNode[] nodes;

        public DisposeHandlersOnCancel(AwaitAll<T>.AwaitAllNode[] awaitAllNodeArr) {
            this.nodes = awaitAllNodeArr;
        }

        public final void disposeAll() {
            for (AwaitAll<T>.AwaitAllNode awaitAllNode : this.nodes) {
                awaitAllNode.getHandle().dispose();
            }
        }

        @Override // kotlinx.coroutines.CancelHandler
        public void invoke(Throwable th) {
            disposeAll();
        }

        public String toString() {
            return "DisposeHandlersOnCancel[" + this.nodes + ']';
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AwaitAll(Deferred<? extends T>[] deferredArr) {
        this.deferreds = deferredArr;
        this.notCompletedCount$volatile = deferredArr.length;
    }

    private final /* synthetic */ int getNotCompletedCount$volatile() {
        return this.notCompletedCount$volatile;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicIntegerFieldUpdater getNotCompletedCount$volatile$FU() {
        return notCompletedCount$volatile$FU;
    }

    private final /* synthetic */ void setNotCompletedCount$volatile(int i) {
        this.notCompletedCount$volatile = i;
    }

    public final Object await(d<? super List<? extends T>> dVar) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(e.g(dVar), 1);
        cancellableContinuationImpl.initCancellability();
        int length = this.deferreds.length;
        AwaitAllNode[] awaitAllNodeArr = new AwaitAllNode[length];
        for (int i = 0; i < length; i++) {
            Deferred deferred = this.deferreds[i];
            deferred.start();
            AwaitAllNode awaitAllNode = new AwaitAllNode(cancellableContinuationImpl);
            awaitAllNode.setHandle(JobKt__JobKt.invokeOnCompletion$default(deferred, false, awaitAllNode, 1, null));
            awaitAllNodeArr[i] = awaitAllNode;
        }
        AwaitAll<T>.DisposeHandlersOnCancel disposeHandlersOnCancel = new DisposeHandlersOnCancel(awaitAllNodeArr);
        for (int i2 = 0; i2 < length; i2++) {
            awaitAllNodeArr[i2].setDisposer(disposeHandlersOnCancel);
        }
        if (cancellableContinuationImpl.isCompleted()) {
            disposeHandlersOnCancel.disposeAll();
        } else {
            CancellableContinuationKt.invokeOnCancellation(cancellableContinuationImpl, disposeHandlersOnCancel);
        }
        return cancellableContinuationImpl.getResult();
    }
}
