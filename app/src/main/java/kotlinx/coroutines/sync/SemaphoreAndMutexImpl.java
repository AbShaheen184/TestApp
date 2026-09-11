package kotlinx.coroutines.sync;

import androidx.compose.foundation.gestures.y;
import com.google.android.material.shape.e;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.d;
import kotlin.coroutines.i;
import kotlin.jvm.functions.l;
import kotlin.jvm.functions.q;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CancellableContinuationKt;
import kotlinx.coroutines.Waiter;
import kotlinx.coroutines.internal.ConcurrentLinkedListKt;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.SegmentOrClosed;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.selects.SelectInstance;
import net.luminis.tls.engine.impl.c;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class SemaphoreAndMutexImpl {
    private volatile /* synthetic */ int _availablePermits$volatile;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private final q onCancellationRelease;
    private final int permits;
    private volatile /* synthetic */ Object tail$volatile;
    private static final /* synthetic */ AtomicReferenceFieldUpdater head$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(SemaphoreAndMutexImpl.class, Object.class, "head$volatile");
    private static final /* synthetic */ AtomicLongFieldUpdater deqIdx$volatile$FU = AtomicLongFieldUpdater.newUpdater(SemaphoreAndMutexImpl.class, "deqIdx$volatile");
    private static final /* synthetic */ AtomicReferenceFieldUpdater tail$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(SemaphoreAndMutexImpl.class, Object.class, "tail$volatile");
    private static final /* synthetic */ AtomicLongFieldUpdater enqIdx$volatile$FU = AtomicLongFieldUpdater.newUpdater(SemaphoreAndMutexImpl.class, "enqIdx$volatile");
    private static final /* synthetic */ AtomicIntegerFieldUpdater _availablePermits$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(SemaphoreAndMutexImpl.class, "_availablePermits$volatile");

    public SemaphoreAndMutexImpl(int i, int i2) {
        this.permits = i;
        if (i <= 0) {
            c.p(androidx.privacysandbox.ads.adservices.java.internal.a.l(i, "Semaphore should have at least 1 permit, but had "));
            throw null;
        }
        if (i2 < 0 || i2 > i) {
            c.p(androidx.privacysandbox.ads.adservices.java.internal.a.l(i, "The number of acquired permits should be in 0.."));
            throw null;
        }
        SemaphoreSegment semaphoreSegment = new SemaphoreSegment(0L, null, 2);
        this.head$volatile = semaphoreSegment;
        this.tail$volatile = semaphoreSegment;
        this._availablePermits$volatile = i - i2;
        this.onCancellationRelease = new y(this, 14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object acquireSlowPath(d<? super kotlin.y> dVar) {
        CancellableContinuationImpl orCreateCancellableContinuation = CancellableContinuationKt.getOrCreateCancellableContinuation(e.g(dVar));
        try {
            if (!addAcquireToQueue(orCreateCancellableContinuation)) {
                acquire((CancellableContinuation<? super kotlin.y>) orCreateCancellableContinuation);
            }
            Object result = orCreateCancellableContinuation.getResult();
            return result == kotlin.coroutines.intrinsics.a.e ? result : kotlin.y.a;
        } catch (Throwable th) {
            orCreateCancellableContinuation.releaseClaimedReusableContinuation$kotlinx_coroutines_core();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean addAcquireToQueue(Waiter waiter) {
        Object objFindSegmentInternal;
        SemaphoreSegment semaphoreSegment = (SemaphoreSegment) tail$volatile$FU.get(this);
        long andIncrement = enqIdx$volatile$FU.getAndIncrement(this);
        SemaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1 semaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1 = SemaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1.INSTANCE;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = tail$volatile$FU;
        long j = andIncrement / ((long) SemaphoreKt.SEGMENT_SIZE);
        loop0: while (true) {
            objFindSegmentInternal = ConcurrentLinkedListKt.findSegmentInternal(semaphoreSegment, j, semaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1);
            if (!SegmentOrClosed.m94isClosedimpl(objFindSegmentInternal)) {
                Segment segmentM92getSegmentimpl = SegmentOrClosed.m92getSegmentimpl(objFindSegmentInternal);
                while (true) {
                    Segment segment = (Segment) atomicReferenceFieldUpdater.get(this);
                    if (segment.id >= segmentM92getSegmentimpl.id) {
                        break loop0;
                    }
                    if (!segmentM92getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, segment, segmentM92getSegmentimpl)) {
                            if (!segment.decPointers$kotlinx_coroutines_core()) {
                                break loop0;
                            }
                            segment.remove();
                            break loop0;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == segment);
                    if (segmentM92getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                        segmentM92getSegmentimpl.remove();
                    }
                }
            } else {
                break;
            }
        }
        SemaphoreSegment semaphoreSegment2 = (SemaphoreSegment) SegmentOrClosed.m92getSegmentimpl(objFindSegmentInternal);
        int i = (int) (andIncrement % ((long) SemaphoreKt.SEGMENT_SIZE));
        AtomicReferenceArray acquirers = semaphoreSegment2.getAcquirers();
        while (!acquirers.compareAndSet(i, null, waiter)) {
            if (acquirers.get(i) != null) {
                Symbol symbol = SemaphoreKt.PERMIT;
                Symbol symbol2 = SemaphoreKt.TAKEN;
                AtomicReferenceArray acquirers2 = semaphoreSegment2.getAcquirers();
                while (!acquirers2.compareAndSet(i, symbol, symbol2)) {
                    if (acquirers2.get(i) != symbol) {
                        return false;
                    }
                }
                boolean z = waiter instanceof CancellableContinuation;
                kotlin.y yVar = kotlin.y.a;
                if (z) {
                    waiter.getClass();
                    ((CancellableContinuation) waiter).resume(yVar, this.onCancellationRelease);
                } else {
                    if (!(waiter instanceof SelectInstance)) {
                        com.google.gson.b.u(waiter, "unexpected: ");
                        return false;
                    }
                    ((SelectInstance) waiter).selectInRegistrationPhase(yVar);
                }
                return true;
            }
        }
        waiter.invokeOnCancellation(semaphoreSegment2, i);
        return true;
    }

    private final void coerceAvailablePermitsAtMaximum() {
        int i;
        do {
            i = _availablePermits$volatile$FU.get(this);
            if (i <= this.permits) {
                return;
            }
        } while (!_availablePermits$volatile$FU.compareAndSet(this, i, this.permits));
    }

    private final int decPermits() {
        int andDecrement;
        do {
            andDecrement = _availablePermits$volatile$FU.getAndDecrement(this);
        } while (andDecrement > this.permits);
        return andDecrement;
    }

    private final /* synthetic */ long getDeqIdx$volatile() {
        return this.deqIdx$volatile;
    }

    private final /* synthetic */ long getEnqIdx$volatile() {
        return this.enqIdx$volatile;
    }

    private final /* synthetic */ Object getHead$volatile() {
        return this.head$volatile;
    }

    private final /* synthetic */ Object getTail$volatile() {
        return this.tail$volatile;
    }

    private final /* synthetic */ int get_availablePermits$volatile() {
        return this._availablePermits$volatile;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.y onCancellationRelease$lambda$2(SemaphoreAndMutexImpl semaphoreAndMutexImpl, Throwable th, kotlin.y yVar, i iVar) {
        semaphoreAndMutexImpl.release();
        return kotlin.y.a;
    }

    private final /* synthetic */ void setDeqIdx$volatile(long j) {
        this.deqIdx$volatile = j;
    }

    private final /* synthetic */ void setEnqIdx$volatile(long j) {
        this.enqIdx$volatile = j;
    }

    private final /* synthetic */ void setHead$volatile(Object obj) {
        this.head$volatile = obj;
    }

    private final /* synthetic */ void setTail$volatile(Object obj) {
        this.tail$volatile = obj;
    }

    private final /* synthetic */ void set_availablePermits$volatile(int i) {
        this._availablePermits$volatile = i;
    }

    private final boolean tryResumeAcquire(Object obj) {
        boolean z = obj instanceof CancellableContinuation;
        kotlin.y yVar = kotlin.y.a;
        if (!z) {
            if (obj instanceof SelectInstance) {
                return ((SelectInstance) obj).trySelect(this, yVar);
            }
            com.google.gson.b.u(obj, "unexpected: ");
            return false;
        }
        CancellableContinuation cancellableContinuation = (CancellableContinuation) obj;
        Object objTryResume = cancellableContinuation.tryResume(yVar, null, this.onCancellationRelease);
        if (objTryResume == null) {
            return false;
        }
        cancellableContinuation.completeResume(objTryResume);
        return true;
    }

    private final boolean tryResumeNextFromQueue() {
        Object objFindSegmentInternal;
        SemaphoreSegment semaphoreSegment = (SemaphoreSegment) head$volatile$FU.get(this);
        long andIncrement = deqIdx$volatile$FU.getAndIncrement(this);
        long j = andIncrement / ((long) SemaphoreKt.SEGMENT_SIZE);
        SemaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1 semaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1 = SemaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1.INSTANCE;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = head$volatile$FU;
        loop0: while (true) {
            objFindSegmentInternal = ConcurrentLinkedListKt.findSegmentInternal(semaphoreSegment, j, semaphoreAndMutexImpl$tryResumeNextFromQueue$createNewSegment$1);
            if (SegmentOrClosed.m94isClosedimpl(objFindSegmentInternal)) {
                break;
            }
            Segment segmentM92getSegmentimpl = SegmentOrClosed.m92getSegmentimpl(objFindSegmentInternal);
            while (true) {
                Segment segment = (Segment) atomicReferenceFieldUpdater.get(this);
                if (segment.id >= segmentM92getSegmentimpl.id) {
                    break loop0;
                }
                if (!segmentM92getSegmentimpl.tryIncPointers$kotlinx_coroutines_core()) {
                    break;
                }
                do {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, segment, segmentM92getSegmentimpl)) {
                        if (!segment.decPointers$kotlinx_coroutines_core()) {
                            break loop0;
                        }
                        segment.remove();
                        break loop0;
                    }
                } while (atomicReferenceFieldUpdater.get(this) == segment);
                if (segmentM92getSegmentimpl.decPointers$kotlinx_coroutines_core()) {
                    segmentM92getSegmentimpl.remove();
                }
            }
        }
        SemaphoreSegment semaphoreSegment2 = (SemaphoreSegment) SegmentOrClosed.m92getSegmentimpl(objFindSegmentInternal);
        semaphoreSegment2.cleanPrev();
        boolean z = false;
        if (semaphoreSegment2.id > j) {
            return false;
        }
        int i = (int) (andIncrement % ((long) SemaphoreKt.SEGMENT_SIZE));
        Object andSet = semaphoreSegment2.getAcquirers().getAndSet(i, SemaphoreKt.PERMIT);
        if (andSet != null) {
            if (andSet == SemaphoreKt.CANCELLED) {
                return false;
            }
            return tryResumeAcquire(andSet);
        }
        int i2 = SemaphoreKt.MAX_SPIN_CYCLES;
        for (int i3 = 0; i3 < i2; i3++) {
            if (semaphoreSegment2.getAcquirers().get(i) == SemaphoreKt.TAKEN) {
                return true;
            }
        }
        Symbol symbol = SemaphoreKt.PERMIT;
        Symbol symbol2 = SemaphoreKt.BROKEN;
        AtomicReferenceArray acquirers = semaphoreSegment2.getAcquirers();
        while (!acquirers.compareAndSet(i, symbol, symbol2)) {
            if (acquirers.get(i) != symbol) {
                return !z;
            }
        }
        z = true;
        return !z;
    }

    public final void acquire(CancellableContinuation<? super kotlin.y> cancellableContinuation) {
        while (decPermits() <= 0) {
            cancellableContinuation.getClass();
            if (addAcquireToQueue((Waiter) cancellableContinuation)) {
                return;
            }
        }
        cancellableContinuation.resume(kotlin.y.a, this.onCancellationRelease);
    }

    public final int getAvailablePermits() {
        return Math.max(_availablePermits$volatile$FU.get(this), 0);
    }

    public final void onAcquireRegFunction(SelectInstance<?> selectInstance, Object obj) {
        while (decPermits() <= 0) {
            selectInstance.getClass();
            if (addAcquireToQueue((Waiter) selectInstance)) {
                return;
            }
        }
        selectInstance.selectInRegistrationPhase(kotlin.y.a);
    }

    public final void release() {
        do {
            int andIncrement = _availablePermits$volatile$FU.getAndIncrement(this);
            if (andIncrement >= this.permits) {
                coerceAvailablePermitsAtMaximum();
                throw new IllegalStateException(("The number of released permits cannot be greater than " + this.permits).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
        } while (!tryResumeNextFromQueue());
    }

    public final boolean tryAcquire() {
        while (true) {
            int i = _availablePermits$volatile$FU.get(this);
            if (i > this.permits) {
                coerceAvailablePermitsAtMaximum();
            } else {
                if (i <= 0) {
                    return false;
                }
                if (_availablePermits$volatile$FU.compareAndSet(this, i, i - 1)) {
                    return true;
                }
            }
        }
    }

    private final <W> void acquire(W w, l lVar, l lVar2) {
        while (decPermits() <= 0) {
            if (((Boolean) lVar.invoke(w)).booleanValue()) {
                return;
            }
        }
        lVar2.invoke(w);
    }

    public final Object acquire(d<? super kotlin.y> dVar) {
        Object objAcquireSlowPath;
        int iDecPermits = decPermits();
        kotlin.y yVar = kotlin.y.a;
        return (iDecPermits <= 0 && (objAcquireSlowPath = acquireSlowPath(dVar)) == kotlin.coroutines.intrinsics.a.e) ? objAcquireSlowPath : yVar;
    }
}
