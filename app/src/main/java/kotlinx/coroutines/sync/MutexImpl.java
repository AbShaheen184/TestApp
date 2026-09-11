package kotlinx.coroutines.sync;

import androidx.compose.foundation.gestures.y;
import com.google.android.material.shape.e;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.d;
import kotlin.coroutines.i;
import kotlin.jvm.functions.q;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.l;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CancellableContinuationKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.DebugStringsKt;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.InternalCoroutinesApi;
import kotlinx.coroutines.Waiter;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.selects.SelectClause2;
import kotlinx.coroutines.selects.SelectClause2Impl;
import kotlinx.coroutines.selects.SelectInstance;
import kotlinx.coroutines.selects.SelectInstanceInternal;
import net.luminis.tls.engine.impl.c;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class MutexImpl extends SemaphoreAndMutexImpl implements Mutex {
    private static final /* synthetic */ AtomicReferenceFieldUpdater owner$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(MutexImpl.class, Object.class, "owner$volatile");
    private final q onSelectCancellationUnlockConstructor;
    private volatile /* synthetic */ Object owner$volatile;

    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    public final class SelectInstanceWithOwner<Q> implements SelectInstanceInternal<Q> {
        public final Object owner;
        public final SelectInstanceInternal<Q> select;

        public SelectInstanceWithOwner(SelectInstanceInternal<Q> selectInstanceInternal, Object obj) {
            this.select = selectInstanceInternal;
            this.owner = obj;
        }

        @Override // kotlinx.coroutines.selects.SelectInstance
        public void disposeOnCompletion(DisposableHandle disposableHandle) {
            this.select.disposeOnCompletion(disposableHandle);
        }

        @Override // kotlinx.coroutines.selects.SelectInstance
        public i getContext() {
            return this.select.getContext();
        }

        @Override // kotlinx.coroutines.Waiter
        public void invokeOnCancellation(Segment<?> segment, int i) {
            this.select.invokeOnCancellation(segment, i);
        }

        @Override // kotlinx.coroutines.selects.SelectInstance
        public void selectInRegistrationPhase(Object obj) {
            MutexImpl.getOwner$volatile$FU().set(MutexImpl.this, this.owner);
            this.select.selectInRegistrationPhase(obj);
        }

        @Override // kotlinx.coroutines.selects.SelectInstance
        public boolean trySelect(Object obj, Object obj2) {
            boolean zTrySelect = this.select.trySelect(obj, obj2);
            MutexImpl mutexImpl = MutexImpl.this;
            if (zTrySelect) {
                MutexImpl.getOwner$volatile$FU().set(mutexImpl, this.owner);
            }
            return zTrySelect;
        }
    }

    public MutexImpl(boolean z) {
        super(1, z ? 1 : 0);
        this.owner$volatile = z ? null : MutexKt.NO_OWNER;
        this.onSelectCancellationUnlockConstructor = new y(this, 13);
    }

    private final /* synthetic */ Object getOwner$volatile() {
        return this.owner$volatile;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicReferenceFieldUpdater getOwner$volatile$FU() {
        return owner$volatile$FU;
    }

    private final int holdsLockImpl(Object obj) {
        while (isLocked()) {
            Object obj2 = owner$volatile$FU.get(this);
            if (obj2 != MutexKt.NO_OWNER) {
                return obj2 == obj ? 1 : 2;
            }
        }
        return 0;
    }

    public static Object lock$suspendImpl(MutexImpl mutexImpl, Object obj, d<? super kotlin.y> dVar) {
        Object objLockSuspend;
        boolean zTryLock = mutexImpl.tryLock(obj);
        kotlin.y yVar = kotlin.y.a;
        return (!zTryLock && (objLockSuspend = mutexImpl.lockSuspend(obj, dVar)) == kotlin.coroutines.intrinsics.a.e) ? objLockSuspend : yVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object lockSuspend(Object obj, d<? super kotlin.y> dVar) {
        CancellableContinuationImpl orCreateCancellableContinuation = CancellableContinuationKt.getOrCreateCancellableContinuation(e.g(dVar));
        try {
            acquire((CancellableContinuation<? super kotlin.y>) new CancellableContinuationWithOwner(orCreateCancellableContinuation, obj));
            Object result = orCreateCancellableContinuation.getResult();
            return result == kotlin.coroutines.intrinsics.a.e ? result : kotlin.y.a;
        } catch (Throwable th) {
            orCreateCancellableContinuation.releaseClaimedReusableContinuation$kotlinx_coroutines_core();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q onSelectCancellationUnlockConstructor$lambda$1(MutexImpl mutexImpl, SelectInstance selectInstance, Object obj, Object obj2) {
        return new a(mutexImpl, obj, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.y onSelectCancellationUnlockConstructor$lambda$1$lambda$0(MutexImpl mutexImpl, Object obj, Throwable th, Object obj2, i iVar) {
        mutexImpl.unlock(obj);
        return kotlin.y.a;
    }

    private final /* synthetic */ void setOwner$volatile(Object obj) {
        this.owner$volatile = obj;
    }

    private final int tryLockImpl(Object obj) {
        while (!tryAcquire()) {
            if (obj == null) {
                return 1;
            }
            int iHoldsLockImpl = holdsLockImpl(obj);
            if (iHoldsLockImpl == 1) {
                return 2;
            }
            if (iHoldsLockImpl == 2) {
                return 1;
            }
        }
        owner$volatile$FU.set(this, obj);
        return 0;
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public SelectClause2<Object, Mutex> getOnLock() {
        MutexImpl$onLock$1 mutexImpl$onLock$1 = MutexImpl$onLock$1.INSTANCE;
        mutexImpl$onLock$1.getClass();
        c0.c(3, mutexImpl$onLock$1);
        MutexImpl$onLock$2 mutexImpl$onLock$2 = MutexImpl$onLock$2.INSTANCE;
        mutexImpl$onLock$2.getClass();
        c0.c(3, mutexImpl$onLock$2);
        return new SelectClause2Impl(this, mutexImpl$onLock$1, mutexImpl$onLock$2, this.onSelectCancellationUnlockConstructor);
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public boolean holdsLock(Object obj) {
        return holdsLockImpl(obj) == 1;
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public boolean isLocked() {
        return getAvailablePermits() == 0;
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public Object lock(Object obj, d<? super kotlin.y> dVar) {
        return lock$suspendImpl(this, obj, dVar);
    }

    public Object onLockProcessResult(Object obj, Object obj2) {
        if (!l.a(obj2, MutexKt.ON_LOCK_ALREADY_LOCKED_BY_OWNER)) {
            return this;
        }
        com.google.gson.b.u(obj, "This mutex is already locked by the specified owner: ");
        return null;
    }

    public void onLockRegFunction(SelectInstance<?> selectInstance, Object obj) {
        if (obj != null && holdsLock(obj)) {
            selectInstance.selectInRegistrationPhase(MutexKt.ON_LOCK_ALREADY_LOCKED_BY_OWNER);
        } else {
            selectInstance.getClass();
            onAcquireRegFunction(new SelectInstanceWithOwner((SelectInstanceInternal) selectInstance, obj), obj);
        }
    }

    public String toString() {
        return "Mutex@" + DebugStringsKt.getHexAddress(this) + "[isLocked=" + isLocked() + ",owner=" + owner$volatile$FU.get(this) + ']';
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public boolean tryLock(Object obj) {
        int iTryLockImpl = tryLockImpl(obj);
        if (iTryLockImpl == 0) {
            return true;
        }
        if (iTryLockImpl == 1) {
            return false;
        }
        if (iTryLockImpl != 2) {
            c.r("unexpected");
            return false;
        }
        com.google.gson.b.u(obj, "This mutex is already locked by the specified owner: ");
        return false;
    }

    @Override // kotlinx.coroutines.sync.Mutex
    public void unlock(Object obj) {
        while (isLocked()) {
            Object obj2 = owner$volatile$FU.get(this);
            if (obj2 != MutexKt.NO_OWNER) {
                if (obj2 != obj && obj != null) {
                    com.google.gson.b.o("This mutex is locked by ", obj2, ", but ", obj, " is expected");
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = owner$volatile$FU;
                Symbol symbol = MutexKt.NO_OWNER;
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj2, symbol)) {
                        release();
                        return;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == obj2);
            }
        }
        c.r("This mutex is not locked");
    }

    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    public final class CancellableContinuationWithOwner implements CancellableContinuation<kotlin.y>, Waiter {
        public final CancellableContinuationImpl<kotlin.y> cont;
        public final Object owner;

        /* JADX WARN: Multi-variable type inference failed */
        public CancellableContinuationWithOwner(CancellableContinuationImpl<? super kotlin.y> cancellableContinuationImpl, Object obj) {
            this.cont = cancellableContinuationImpl;
            this.owner = obj;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final kotlin.y resume$lambda$6(MutexImpl mutexImpl, CancellableContinuationWithOwner cancellableContinuationWithOwner, Throwable th) {
            mutexImpl.unlock(cancellableContinuationWithOwner.owner);
            return kotlin.y.a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final kotlin.y tryResume$lambda$3(MutexImpl mutexImpl, CancellableContinuationWithOwner cancellableContinuationWithOwner, Throwable th, kotlin.y yVar, i iVar) {
            MutexImpl.getOwner$volatile$FU().set(mutexImpl, cancellableContinuationWithOwner.owner);
            mutexImpl.unlock(cancellableContinuationWithOwner.owner);
            return kotlin.y.a;
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public boolean cancel(Throwable th) {
            return this.cont.cancel(th);
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        @InternalCoroutinesApi
        public void completeResume(Object obj) {
            this.cont.completeResume(obj);
        }

        @Override // kotlinx.coroutines.CancellableContinuation, kotlin.coroutines.d
        public i getContext() {
            return this.cont.getContext();
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        @InternalCoroutinesApi
        public void initCancellability() {
            this.cont.initCancellability();
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public void invokeOnCancellation(kotlin.jvm.functions.l lVar) {
            this.cont.invokeOnCancellation(lVar);
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public boolean isActive() {
            return this.cont.isActive();
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public boolean isCancelled() {
            return this.cont.isCancelled();
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public boolean isCompleted() {
            return this.cont.isCompleted();
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public <R extends kotlin.y> void resume(R r, q qVar) {
            MutexImpl.getOwner$volatile$FU().set(MutexImpl.this, this.owner);
            CancellableContinuationImpl<kotlin.y> cancellableContinuationImpl = this.cont;
            final MutexImpl mutexImpl = MutexImpl.this;
            cancellableContinuationImpl.resume(r, new kotlin.jvm.functions.l() { // from class: kotlinx.coroutines.sync.b
                @Override // kotlin.jvm.functions.l
                public final Object invoke(Object obj) {
                    return MutexImpl.CancellableContinuationWithOwner.resume$lambda$6(mutexImpl, this, (Throwable) obj);
                }
            });
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        @ExperimentalCoroutinesApi
        public void resumeUndispatched(CoroutineDispatcher coroutineDispatcher, kotlin.y yVar) {
            this.cont.resumeUndispatched(coroutineDispatcher, yVar);
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        @ExperimentalCoroutinesApi
        public void resumeUndispatchedWithException(CoroutineDispatcher coroutineDispatcher, Throwable th) {
            this.cont.resumeUndispatchedWithException(coroutineDispatcher, th);
        }

        @Override // kotlinx.coroutines.CancellableContinuation, kotlin.coroutines.d
        public void resumeWith(Object obj) {
            this.cont.resumeWith(obj);
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        public <R extends kotlin.y> Object tryResume(R r, Object obj, q qVar) {
            Object objTryResume = this.cont.tryResume(r, obj, new a(MutexImpl.this, this, 0));
            if (objTryResume != null) {
                MutexImpl.getOwner$volatile$FU().set(MutexImpl.this, this.owner);
            }
            return objTryResume;
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        @InternalCoroutinesApi
        public Object tryResumeWithException(Throwable th) {
            return this.cont.tryResumeWithException(th);
        }

        @Override // kotlinx.coroutines.Waiter
        public void invokeOnCancellation(Segment<?> segment, int i) {
            this.cont.invokeOnCancellation(segment, i);
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        @kotlin.c
        public void resume(kotlin.y yVar, kotlin.jvm.functions.l lVar) {
            this.cont.resume(yVar, lVar);
        }

        @Override // kotlinx.coroutines.CancellableContinuation
        @InternalCoroutinesApi
        public Object tryResume(kotlin.y yVar, Object obj) {
            return this.cont.tryResume(yVar, obj);
        }
    }

    public static /* synthetic */ void getOnLock$annotations() {
    }
}
