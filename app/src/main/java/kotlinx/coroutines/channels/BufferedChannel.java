package kotlinx.coroutines.channels;

import androidx.transition.k;
import com.app.mlounge.ui.components.d0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.i;
import kotlin.jvm.functions.l;
import kotlin.jvm.functions.p;
import kotlin.jvm.functions.q;
import kotlin.jvm.functions.r;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.f;
import kotlin.jvm.internal.j;
import kotlin.y;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CancellableContinuationKt;
import kotlinx.coroutines.DebugStringsKt;
import kotlinx.coroutines.ExperimentalCoroutinesApi;
import kotlinx.coroutines.Waiter;
import kotlinx.coroutines.internal.ConcurrentLinkedListKt;
import kotlinx.coroutines.internal.ConcurrentLinkedListNode;
import kotlinx.coroutines.internal.InlineList;
import kotlinx.coroutines.internal.OnUndeliveredElementKt;
import kotlinx.coroutines.internal.Segment;
import kotlinx.coroutines.internal.SegmentOrClosed;
import kotlinx.coroutines.internal.StackTraceRecoveryKt;
import kotlinx.coroutines.internal.Symbol;
import kotlinx.coroutines.internal.UndeliveredElementException;
import kotlinx.coroutines.selects.SelectClause1;
import kotlinx.coroutines.selects.SelectClause1Impl;
import kotlinx.coroutines.selects.SelectClause2;
import kotlinx.coroutines.selects.SelectClause2Impl;
import kotlinx.coroutines.selects.SelectImplementation;
import kotlinx.coroutines.selects.SelectInstance;
import kotlinx.coroutines.selects.TrySelectDetailedResult;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class BufferedChannel<E> implements Channel<E> {
    private volatile /* synthetic */ Object _closeCause$volatile;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;
    private final int capacity;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    public final l onUndeliveredElement;
    private final q onUndeliveredElementReceiveCancellationConstructor;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;
    private static final /* synthetic */ AtomicLongFieldUpdater sendersAndCloseStatus$volatile$FU = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "sendersAndCloseStatus$volatile");
    private static final /* synthetic */ AtomicLongFieldUpdater receivers$volatile$FU = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "receivers$volatile");
    private static final /* synthetic */ AtomicLongFieldUpdater bufferEnd$volatile$FU = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "bufferEnd$volatile");
    private static final /* synthetic */ AtomicLongFieldUpdater completedExpandBuffersAndPauseFlag$volatile$FU = AtomicLongFieldUpdater.newUpdater(BufferedChannel.class, "completedExpandBuffersAndPauseFlag$volatile");
    private static final /* synthetic */ AtomicReferenceFieldUpdater sendSegment$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "sendSegment$volatile");
    private static final /* synthetic */ AtomicReferenceFieldUpdater receiveSegment$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "receiveSegment$volatile");
    private static final /* synthetic */ AtomicReferenceFieldUpdater bufferEndSegment$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "bufferEndSegment$volatile");
    private static final /* synthetic */ AtomicReferenceFieldUpdater _closeCause$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "_closeCause$volatile");
    private static final /* synthetic */ AtomicReferenceFieldUpdater closeHandler$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(BufferedChannel.class, Object.class, "closeHandler$volatile");

    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    public static final class SendBroadcast implements Waiter {
        private final /* synthetic */ CancellableContinuationImpl<Boolean> $$delegate_0;
        private final CancellableContinuation<Boolean> cont;

        /* JADX WARN: Multi-variable type inference failed */
        public SendBroadcast(CancellableContinuation<? super Boolean> cancellableContinuation) {
            cancellableContinuation.getClass();
            this.$$delegate_0 = (CancellableContinuationImpl) cancellableContinuation;
            this.cont = cancellableContinuation;
        }

        public final CancellableContinuation<Boolean> getCont() {
            return this.cont;
        }

        @Override // kotlinx.coroutines.Waiter
        public void invokeOnCancellation(Segment<?> segment, int i) {
            this.$$delegate_0.invokeOnCancellation(segment, i);
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.BufferedChannel$bindCancellationFunResult$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    public /* synthetic */ class AnonymousClass1 extends j implements q {
        public AnonymousClass1(Object obj) {
            super(3, 0, BufferedChannel.class, obj, "onCancellationChannelResultImplDoNotCall", "onCancellationChannelResultImplDoNotCall-5_sEAP8(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V");
        }

        @Override // kotlin.jvm.functions.q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            m37invoke5_sEAP8((Throwable) obj, ((ChannelResult) obj2).m54unboximpl(), (i) obj3);
            return y.a;
        }

        /* JADX INFO: renamed from: invoke-5_sEAP8, reason: not valid java name */
        public final void m37invoke5_sEAP8(Throwable th, Object obj, i iVar) {
            ((BufferedChannel) this.receiver).m31onCancellationChannelResultImplDoNotCall5_sEAP8(th, obj, iVar);
        }
    }

    public BufferedChannel(int i, l lVar) {
        this.capacity = i;
        this.onUndeliveredElement = lVar;
        if (i < 0) {
            net.luminis.tls.engine.impl.c.p(androidx.privacysandbox.ads.adservices.java.internal.a.p("Invalid channel capacity: ", i, ", should be >=0"));
            throw null;
        }
        this.bufferEnd$volatile = BufferedChannelKt.initialBufferEnd(i);
        this.completedExpandBuffersAndPauseFlag$volatile = getBufferEndCounter();
        ChannelSegment channelSegment = new ChannelSegment(0L, null, this, 3);
        this.sendSegment$volatile = channelSegment;
        this.receiveSegment$volatile = channelSegment;
        if (isRendezvousOrUnlimited()) {
            channelSegment = BufferedChannelKt.NULL_SEGMENT;
            channelSegment.getClass();
        }
        this.bufferEndSegment$volatile = channelSegment;
        this.onUndeliveredElementReceiveCancellationConstructor = lVar != null ? new q() { // from class: kotlinx.coroutines.channels.a
            @Override // kotlin.jvm.functions.q
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return BufferedChannel.onUndeliveredElementReceiveCancellationConstructor$lambda$57$lambda$56(this.e, (SelectInstance) obj, obj2, obj3);
            }
        } : null;
        this._closeCause$volatile = BufferedChannelKt.NO_CLOSE_CAUSE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final q bindCancellationFun(l lVar, E e) {
        return new androidx.compose.foundation.contextmenu.i(11, lVar, e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y bindCancellationFun$lambda$89(l lVar, Object obj, Throwable th, Object obj2, i iVar) {
        OnUndeliveredElementKt.callUndeliveredElement(lVar, obj, iVar);
        return y.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlin.reflect.e bindCancellationFunResult(l lVar) {
        return new AnonymousClass1(this);
    }

    private final boolean bufferOrRendezvousSend(long j) {
        return j < getBufferEndCounter() || j < getReceiversCounter$kotlinx_coroutines_core() + ((long) this.capacity);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void cancelSuspendedReceiveRequests(ChannelSegment<E> channelSegment, long j) {
        Object objM77constructorimpl$default = InlineList.m77constructorimpl$default(null, 1, null);
        loop0: while (channelSegment != null) {
            for (int i = BufferedChannelKt.SEGMENT_SIZE - 1; -1 < i; i--) {
                if ((channelSegment.id * ((long) BufferedChannelKt.SEGMENT_SIZE)) + ((long) i) < j) {
                    break loop0;
                }
                while (true) {
                    Object state$kotlinx_coroutines_core = channelSegment.getState$kotlinx_coroutines_core(i);
                    if (state$kotlinx_coroutines_core != null && state$kotlinx_coroutines_core != BufferedChannelKt.IN_BUFFER) {
                        if (!(state$kotlinx_coroutines_core instanceof WaiterEB)) {
                            if (!(state$kotlinx_coroutines_core instanceof Waiter)) {
                                break;
                            }
                            if (channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, BufferedChannelKt.getCHANNEL_CLOSED())) {
                                objM77constructorimpl$default = InlineList.m82plusFjFbRPM(objM77constructorimpl$default, state$kotlinx_coroutines_core);
                                channelSegment.onCancelledRequest(i, true);
                                break;
                            }
                        } else {
                            if (channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, BufferedChannelKt.getCHANNEL_CLOSED())) {
                                objM77constructorimpl$default = InlineList.m82plusFjFbRPM(objM77constructorimpl$default, ((WaiterEB) state$kotlinx_coroutines_core).waiter);
                                channelSegment.onCancelledRequest(i, true);
                                break;
                            }
                        }
                    } else {
                        if (channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, BufferedChannelKt.getCHANNEL_CLOSED())) {
                            channelSegment.onSlotCleaned();
                            break;
                        }
                    }
                }
            }
            channelSegment = (ChannelSegment) channelSegment.getPrev();
        }
        if (objM77constructorimpl$default != null) {
            if (!(objM77constructorimpl$default instanceof ArrayList)) {
                resumeReceiverOnClosedChannel((Waiter) objM77constructorimpl$default);
                return;
            }
            ArrayList arrayList = (ArrayList) objM77constructorimpl$default;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                resumeReceiverOnClosedChannel((Waiter) arrayList.get(size));
            }
        }
    }

    private final ChannelSegment<E> closeLinkedList() {
        Object obj = bufferEndSegment$volatile$FU.get(this);
        ChannelSegment channelSegment = (ChannelSegment) sendSegment$volatile$FU.get(this);
        if (channelSegment.id > ((ChannelSegment) obj).id) {
            obj = channelSegment;
        }
        ChannelSegment channelSegment2 = (ChannelSegment) receiveSegment$volatile$FU.get(this);
        if (channelSegment2.id > ((ChannelSegment) obj).id) {
            obj = channelSegment2;
        }
        return (ChannelSegment) ConcurrentLinkedListKt.close((ConcurrentLinkedListNode) obj);
    }

    private final void completeCancel(long j) {
        removeUnprocessedElements(completeClose(j));
    }

    private final ChannelSegment<E> completeClose(long j) {
        ChannelSegment<E> channelSegmentCloseLinkedList = closeLinkedList();
        if (isConflatedDropOldest()) {
            long jMarkAllEmptyCellsAsClosed = markAllEmptyCellsAsClosed(channelSegmentCloseLinkedList);
            if (jMarkAllEmptyCellsAsClosed != -1) {
                dropFirstElementUntilTheSpecifiedCellIsInTheBuffer(jMarkAllEmptyCellsAsClosed);
            }
        }
        cancelSuspendedReceiveRequests(channelSegmentCloseLinkedList, j);
        return channelSegmentCloseLinkedList;
    }

    private final void completeCloseOrCancel() {
        isClosedForSend();
    }

    private final void expandBuffer() {
        if (isRendezvousOrUnlimited()) {
            return;
        }
        ChannelSegment<E> channelSegment = (ChannelSegment) bufferEndSegment$volatile$FU.get(this);
        while (true) {
            long andIncrement = bufferEnd$volatile$FU.getAndIncrement(this);
            int i = BufferedChannelKt.SEGMENT_SIZE;
            long j = andIncrement / ((long) i);
            if (getSendersCounter$kotlinx_coroutines_core() <= andIncrement) {
                if (channelSegment.id < j && channelSegment.getNext() != 0) {
                    moveSegmentBufferEndToSpecifiedOrLast(j, channelSegment);
                }
                incCompletedExpandBufferAttempts$default(this, 0L, 1, null);
                return;
            }
            if (channelSegment.id != j) {
                ChannelSegment<E> channelSegmentFindSegmentBufferEnd = findSegmentBufferEnd(j, channelSegment, andIncrement);
                if (channelSegmentFindSegmentBufferEnd == null) {
                    continue;
                } else {
                    channelSegment = channelSegmentFindSegmentBufferEnd;
                }
            }
            if (updateCellExpandBuffer(channelSegment, (int) (andIncrement % ((long) i)), andIncrement)) {
                incCompletedExpandBufferAttempts$default(this, 0L, 1, null);
                return;
            }
            incCompletedExpandBufferAttempts$default(this, 0L, 1, null);
        }
    }

    private final ChannelSegment<E> findSegmentBufferEnd(long j, ChannelSegment<E> channelSegment, long j2) {
        Object objFindSegmentInternal;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = bufferEndSegment$volatile$FU;
        p pVar = (p) BufferedChannelKt.createSegmentFunction();
        loop0: while (true) {
            objFindSegmentInternal = ConcurrentLinkedListKt.findSegmentInternal(channelSegment, j, pVar);
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
        if (SegmentOrClosed.m94isClosedimpl(objFindSegmentInternal)) {
            completeCloseOrCancel();
            moveSegmentBufferEndToSpecifiedOrLast(j, channelSegment);
            incCompletedExpandBufferAttempts$default(this, 0L, 1, null);
            return null;
        }
        ChannelSegment<E> channelSegment2 = (ChannelSegment) SegmentOrClosed.m92getSegmentimpl(objFindSegmentInternal);
        if (channelSegment2.id <= j) {
            return channelSegment2;
        }
        long j3 = channelSegment2.id;
        int i = BufferedChannelKt.SEGMENT_SIZE;
        if (bufferEnd$volatile$FU.compareAndSet(this, j2 + 1, j3 * ((long) i))) {
            incCompletedExpandBufferAttempts((channelSegment2.id * ((long) i)) - j2);
        } else {
            incCompletedExpandBufferAttempts$default(this, 0L, 1, null);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ChannelSegment<E> findSegmentReceive(long j, ChannelSegment<E> channelSegment) {
        Object objFindSegmentInternal;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = receiveSegment$volatile$FU;
        p pVar = (p) BufferedChannelKt.createSegmentFunction();
        loop0: while (true) {
            objFindSegmentInternal = ConcurrentLinkedListKt.findSegmentInternal(channelSegment, j, pVar);
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
        if (SegmentOrClosed.m94isClosedimpl(objFindSegmentInternal)) {
            completeCloseOrCancel();
            if (channelSegment.id * ((long) BufferedChannelKt.SEGMENT_SIZE) < getSendersCounter$kotlinx_coroutines_core()) {
                channelSegment.cleanPrev();
            }
            return null;
        }
        ChannelSegment<E> channelSegment2 = (ChannelSegment) SegmentOrClosed.m92getSegmentimpl(objFindSegmentInternal);
        if (!isRendezvousOrUnlimited() && j <= getBufferEndCounter() / ((long) BufferedChannelKt.SEGMENT_SIZE)) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = bufferEndSegment$volatile$FU;
            loop3: while (true) {
                Segment segment2 = (Segment) atomicReferenceFieldUpdater2.get(this);
                if (segment2.id >= channelSegment2.id || !channelSegment2.tryIncPointers$kotlinx_coroutines_core()) {
                    break;
                }
                do {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, segment2, channelSegment2)) {
                        if (!segment2.decPointers$kotlinx_coroutines_core()) {
                            break loop3;
                        }
                        segment2.remove();
                        break loop3;
                    }
                } while (atomicReferenceFieldUpdater2.get(this) == segment2);
                if (channelSegment2.decPointers$kotlinx_coroutines_core()) {
                    channelSegment2.remove();
                }
            }
        }
        long j2 = channelSegment2.id;
        if (j2 <= j) {
            return channelSegment2;
        }
        int i = BufferedChannelKt.SEGMENT_SIZE;
        updateReceiversCounterIfLower(j2 * ((long) i));
        if (channelSegment2.id * ((long) i) < getSendersCounter$kotlinx_coroutines_core()) {
            channelSegment2.cleanPrev();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ChannelSegment<E> findSegmentSend(long j, ChannelSegment<E> channelSegment) {
        Object objFindSegmentInternal;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = sendSegment$volatile$FU;
        p pVar = (p) BufferedChannelKt.createSegmentFunction();
        loop0: while (true) {
            objFindSegmentInternal = ConcurrentLinkedListKt.findSegmentInternal(channelSegment, j, pVar);
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
        if (SegmentOrClosed.m94isClosedimpl(objFindSegmentInternal)) {
            completeCloseOrCancel();
            if (channelSegment.id * ((long) BufferedChannelKt.SEGMENT_SIZE) < getReceiversCounter$kotlinx_coroutines_core()) {
                channelSegment.cleanPrev();
            }
            return null;
        }
        ChannelSegment<E> channelSegment2 = (ChannelSegment) SegmentOrClosed.m92getSegmentimpl(objFindSegmentInternal);
        long j2 = channelSegment2.id;
        if (j2 <= j) {
            return channelSegment2;
        }
        int i = BufferedChannelKt.SEGMENT_SIZE;
        updateSendersCounterIfLower(j2 * ((long) i));
        if (channelSegment2.id * ((long) i) < getReceiversCounter$kotlinx_coroutines_core()) {
            channelSegment2.cleanPrev();
        }
        return null;
    }

    private final /* synthetic */ Object getAndUpdate$atomicfu$ATOMIC_FIELD_UPDATER$Any(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, l lVar) {
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(obj);
            Object objInvoke = lVar.invoke(obj2);
            while (!atomicReferenceFieldUpdater.compareAndSet(obj, obj2, objInvoke)) {
                if (atomicReferenceFieldUpdater.get(obj) != obj2) {
                }
            }
            return obj2;
        }
    }

    private final /* synthetic */ long getBufferEnd$volatile() {
        return this.bufferEnd$volatile;
    }

    private final long getBufferEndCounter() {
        return bufferEnd$volatile$FU.get(this);
    }

    private final /* synthetic */ Object getBufferEndSegment$volatile() {
        return this.bufferEndSegment$volatile;
    }

    private final /* synthetic */ Object getCloseHandler$volatile() {
        return this.closeHandler$volatile;
    }

    private final /* synthetic */ long getCompletedExpandBuffersAndPauseFlag$volatile() {
        return this.completedExpandBuffersAndPauseFlag$volatile;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Throwable getReceiveException() {
        Throwable closeCause = getCloseCause();
        return closeCause == null ? new ClosedReceiveChannelException(ChannelsKt.DEFAULT_CLOSE_MESSAGE) : closeCause;
    }

    private final /* synthetic */ Object getReceiveSegment$volatile() {
        return this.receiveSegment$volatile;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicReferenceFieldUpdater getReceiveSegment$volatile$FU() {
        return receiveSegment$volatile$FU;
    }

    private final /* synthetic */ long getReceivers$volatile() {
        return this.receivers$volatile;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicLongFieldUpdater getReceivers$volatile$FU() {
        return receivers$volatile$FU;
    }

    private final /* synthetic */ Object getSendSegment$volatile() {
        return this.sendSegment$volatile;
    }

    private final /* synthetic */ long getSendersAndCloseStatus$volatile() {
        return this.sendersAndCloseStatus$volatile;
    }

    private final /* synthetic */ Object get_closeCause$volatile() {
        return this._closeCause$volatile;
    }

    private final void incCompletedExpandBufferAttempts(long j) {
        if ((completedExpandBuffersAndPauseFlag$volatile$FU.addAndGet(this, j) & 4611686018427387904L) != 0) {
            while ((completedExpandBuffersAndPauseFlag$volatile$FU.get(this) & 4611686018427387904L) != 0) {
            }
        }
    }

    public static /* synthetic */ void incCompletedExpandBufferAttempts$default(BufferedChannel bufferedChannel, long j, int i, Object obj) {
        if (obj != null) {
            com.google.gson.b.r("Super calls with default arguments not supported in this target, function: incCompletedExpandBufferAttempts");
            return;
        }
        if ((i & 1) != 0) {
            j = 1;
        }
        bufferedChannel.incCompletedExpandBufferAttempts(j);
    }

    private final void invokeCloseHandler() {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = closeHandler$volatile$FU;
        loop0: while (true) {
            obj = atomicReferenceFieldUpdater.get(this);
            Symbol symbol = obj == null ? BufferedChannelKt.CLOSE_HANDLER_CLOSED : BufferedChannelKt.CLOSE_HANDLER_INVOKED;
            do {
                if (atomicReferenceFieldUpdater.compareAndSet(this, obj, symbol)) {
                    break loop0;
                }
            } while (atomicReferenceFieldUpdater.get(this) == obj);
        }
        if (obj == null) {
            return;
        }
        c0.c(1, obj);
        ((l) obj).invoke(getCloseCause());
    }

    private final boolean isCellNonEmpty(ChannelSegment<E> channelSegment, int i, long j) {
        Object state$kotlinx_coroutines_core;
        do {
            state$kotlinx_coroutines_core = channelSegment.getState$kotlinx_coroutines_core(i);
            if (state$kotlinx_coroutines_core != null && state$kotlinx_coroutines_core != BufferedChannelKt.IN_BUFFER) {
                if (state$kotlinx_coroutines_core == BufferedChannelKt.BUFFERED) {
                    return true;
                }
                if (state$kotlinx_coroutines_core == BufferedChannelKt.INTERRUPTED_SEND || state$kotlinx_coroutines_core == BufferedChannelKt.getCHANNEL_CLOSED() || state$kotlinx_coroutines_core == BufferedChannelKt.DONE_RCV || state$kotlinx_coroutines_core == BufferedChannelKt.POISONED) {
                    return false;
                }
                if (state$kotlinx_coroutines_core == BufferedChannelKt.RESUMING_BY_EB) {
                    return true;
                }
                return state$kotlinx_coroutines_core != BufferedChannelKt.RESUMING_BY_RCV && j == getReceiversCounter$kotlinx_coroutines_core();
            }
        } while (!channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, BufferedChannelKt.POISONED));
        expandBuffer();
        return false;
    }

    private final boolean isClosed(long j, boolean z) {
        int i = (int) (j >> 60);
        if (i == 0 || i == 1) {
            return false;
        }
        if (i == 2) {
            completeClose(j & 1152921504606846975L);
            return (z && hasElements$kotlinx_coroutines_core()) ? false : true;
        }
        if (i == 3) {
            completeCancel(j & 1152921504606846975L);
            return true;
        }
        net.luminis.tls.engine.impl.c.c(androidx.privacysandbox.ads.adservices.java.internal.a.l(i, "unexpected close status: "));
        return false;
    }

    private final boolean isClosedForReceive0(long j) {
        return isClosed(j, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isClosedForSend0(long j) {
        return isClosed(j, false);
    }

    private final boolean isRendezvousOrUnlimited() {
        long bufferEndCounter = getBufferEndCounter();
        return bufferEndCounter == 0 || bufferEndCounter == Long.MAX_VALUE;
    }

    private final /* synthetic */ void loop$atomicfu$ATOMIC_FIELD_UPDATER$Any(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, l lVar) {
        while (true) {
            lVar.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    private final /* synthetic */ void loop$atomicfu$ATOMIC_FIELD_UPDATER$Long(AtomicLongFieldUpdater atomicLongFieldUpdater, Object obj, l lVar) {
        while (true) {
            lVar.invoke(Long.valueOf(atomicLongFieldUpdater.get(obj)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final long markAllEmptyCellsAsClosed(ChannelSegment<E> channelSegment) {
        do {
            int i = BufferedChannelKt.SEGMENT_SIZE;
            while (true) {
                i--;
                if (-1 < i) {
                    long j = (channelSegment.id * ((long) BufferedChannelKt.SEGMENT_SIZE)) + ((long) i);
                    if (j >= getReceiversCounter$kotlinx_coroutines_core()) {
                        while (true) {
                            Object state$kotlinx_coroutines_core = channelSegment.getState$kotlinx_coroutines_core(i);
                            if (state$kotlinx_coroutines_core != null && state$kotlinx_coroutines_core != BufferedChannelKt.IN_BUFFER) {
                                if (state$kotlinx_coroutines_core != BufferedChannelKt.BUFFERED) {
                                    break;
                                }
                                return j;
                            }
                            if (channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, BufferedChannelKt.getCHANNEL_CLOSED())) {
                                channelSegment.onSlotCleaned();
                                break;
                            }
                        }
                    } else {
                        return -1L;
                    }
                }
            }
            channelSegment = (ChannelSegment) channelSegment.getPrev();
        } while (channelSegment != null);
        return -1L;
    }

    private final void markCancellationStarted() {
        long j;
        AtomicLongFieldUpdater atomicLongFieldUpdater = sendersAndCloseStatus$volatile$FU;
        do {
            j = atomicLongFieldUpdater.get(this);
            if (((int) (j >> 60)) != 0) {
                return;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, BufferedChannelKt.constructSendersAndCloseStatus(1152921504606846975L & j, 1)));
    }

    private final void markCancelled() {
        long j;
        AtomicLongFieldUpdater atomicLongFieldUpdater = sendersAndCloseStatus$volatile$FU;
        do {
            j = atomicLongFieldUpdater.get(this);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, BufferedChannelKt.constructSendersAndCloseStatus(1152921504606846975L & j, 3)));
    }

    private final void markClosed() {
        long j;
        long jConstructSendersAndCloseStatus;
        AtomicLongFieldUpdater atomicLongFieldUpdater = sendersAndCloseStatus$volatile$FU;
        do {
            j = atomicLongFieldUpdater.get(this);
            int i = (int) (j >> 60);
            if (i == 0) {
                jConstructSendersAndCloseStatus = BufferedChannelKt.constructSendersAndCloseStatus(1152921504606846975L & j, 2);
            } else if (i != 1) {
                return;
            } else {
                jConstructSendersAndCloseStatus = BufferedChannelKt.constructSendersAndCloseStatus(1152921504606846975L & j, 3);
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j, jConstructSendersAndCloseStatus));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void moveSegmentBufferEndToSpecifiedOrLast(long j, ChannelSegment<E> channelSegment) {
        ChannelSegment<E> channelSegment2;
        ChannelSegment<E> channelSegment3;
        while (channelSegment.id < j && (channelSegment3 = (ChannelSegment) channelSegment.getNext()) != null) {
            channelSegment = channelSegment3;
        }
        while (true) {
            if (!channelSegment.isRemoved() || (channelSegment2 = (ChannelSegment) channelSegment.getNext()) == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = bufferEndSegment$volatile$FU;
                while (true) {
                    Segment segment = (Segment) atomicReferenceFieldUpdater.get(this);
                    if (segment.id >= channelSegment.id) {
                        return;
                    }
                    if (!channelSegment.tryIncPointers$kotlinx_coroutines_core()) {
                        break;
                    }
                    do {
                        if (atomicReferenceFieldUpdater.compareAndSet(this, segment, channelSegment)) {
                            if (segment.decPointers$kotlinx_coroutines_core()) {
                                segment.remove();
                                return;
                            }
                            return;
                        }
                    } while (atomicReferenceFieldUpdater.get(this) == segment);
                    if (channelSegment.decPointers$kotlinx_coroutines_core()) {
                        channelSegment.remove();
                    }
                }
            } else {
                channelSegment = channelSegment2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: onCancellationChannelResultImplDoNotCall-5_sEAP8, reason: not valid java name */
    public final void m31onCancellationChannelResultImplDoNotCall5_sEAP8(Throwable th, Object obj, i iVar) {
        l lVar = this.onUndeliveredElement;
        lVar.getClass();
        Object objM47getOrNullimpl = ChannelResult.m47getOrNullimpl(obj);
        objM47getOrNullimpl.getClass();
        OnUndeliveredElementKt.callUndeliveredElement(lVar, objM47getOrNullimpl, iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCancellationImplDoNotCall(Throwable th, E e, i iVar) {
        l lVar = this.onUndeliveredElement;
        lVar.getClass();
        OnUndeliveredElementKt.callUndeliveredElement(lVar, e, iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onClosedReceiveCatchingOnNoWaiterSuspend(CancellableContinuation<? super ChannelResult<? extends E>> cancellableContinuation) {
        cancellableContinuation.resumeWith(ChannelResult.m42boximpl(ChannelResult.Companion.m55closedJP2dKIU(getCloseCause())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onClosedReceiveOnNoWaiterSuspend(CancellableContinuation<? super E> cancellableContinuation) {
        cancellableContinuation.resumeWith(kotlin.a.b(getReceiveException()));
    }

    private final void onClosedSelectOnReceive(SelectInstance<?> selectInstance) {
        selectInstance.selectInRegistrationPhase(BufferedChannelKt.getCHANNEL_CLOSED());
    }

    private final void onClosedSelectOnSend(E e, SelectInstance<?> selectInstance) {
        l lVar = this.onUndeliveredElement;
        if (lVar != null) {
            OnUndeliveredElementKt.callUndeliveredElement(lVar, e, selectInstance.getContext());
        }
        selectInstance.selectInRegistrationPhase(BufferedChannelKt.getCHANNEL_CLOSED());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object onClosedSend(E e, kotlin.coroutines.d<? super y> dVar) {
        UndeliveredElementException undeliveredElementExceptionCallUndeliveredElementCatchingException$default;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(com.google.android.material.shape.e.g(dVar), 1);
        cancellableContinuationImpl.initCancellability();
        l lVar = this.onUndeliveredElement;
        if (lVar == null || (undeliveredElementExceptionCallUndeliveredElementCatchingException$default = OnUndeliveredElementKt.callUndeliveredElementCatchingException$default(lVar, e, null, 2, null)) == null) {
            cancellableContinuationImpl.resumeWith(kotlin.a.b(getSendException()));
        } else {
            kotlin.a.a(undeliveredElementExceptionCallUndeliveredElementCatchingException$default, getSendException());
            cancellableContinuationImpl.resumeWith(new kotlin.l(undeliveredElementExceptionCallUndeliveredElementCatchingException$default));
        }
        Object result = cancellableContinuationImpl.getResult();
        return result == kotlin.coroutines.intrinsics.a.e ? result : y.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onClosedSendOnNoWaiterSuspend(E e, CancellableContinuation<? super y> cancellableContinuation) {
        l lVar = this.onUndeliveredElement;
        if (lVar != null) {
            OnUndeliveredElementKt.callUndeliveredElement(lVar, e, cancellableContinuation.getContext());
        }
        cancellableContinuation.resumeWith(kotlin.a.b(getSendException()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q onUndeliveredElementReceiveCancellationConstructor$lambda$57$lambda$56(BufferedChannel bufferedChannel, SelectInstance selectInstance, Object obj, Object obj2) {
        return new d0(9, obj2, bufferedChannel, selectInstance);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y onUndeliveredElementReceiveCancellationConstructor$lambda$57$lambda$56$lambda$55(Object obj, BufferedChannel bufferedChannel, SelectInstance selectInstance, Throwable th, Object obj2, i iVar) {
        if (obj != BufferedChannelKt.getCHANNEL_CLOSED()) {
            OnUndeliveredElementKt.callUndeliveredElement(bufferedChannel.onUndeliveredElement, obj, selectInstance.getContext());
        }
        return y.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void prepareReceiverForSuspension(Waiter waiter, ChannelSegment<E> channelSegment, int i) {
        onReceiveEnqueued();
        waiter.invokeOnCancellation(channelSegment, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void prepareSenderForSuspension(Waiter waiter, ChannelSegment<E> channelSegment, int i) {
        waiter.invokeOnCancellation(channelSegment, i + BufferedChannelKt.SEGMENT_SIZE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object processResultSelectReceive(Object obj, Object obj2) throws Throwable {
        if (obj2 != BufferedChannelKt.getCHANNEL_CLOSED()) {
            return obj2;
        }
        throw getReceiveException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object processResultSelectReceiveCatching(Object obj, Object obj2) {
        return ChannelResult.m42boximpl(obj2 == BufferedChannelKt.getCHANNEL_CLOSED() ? ChannelResult.Companion.m55closedJP2dKIU(getCloseCause()) : ChannelResult.Companion.m57successJP2dKIU(obj2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object processResultSelectReceiveOrNull(Object obj, Object obj2) throws Throwable {
        if (obj2 != BufferedChannelKt.getCHANNEL_CLOSED()) {
            return obj2;
        }
        if (getCloseCause() == null) {
            return null;
        }
        throw getReceiveException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object processResultSelectSend(Object obj, Object obj2) throws Throwable {
        if (obj2 != BufferedChannelKt.getCHANNEL_CLOSED()) {
            return this;
        }
        throw getSendException();
    }

    public static /* synthetic */ <E> Object receive$suspendImpl(BufferedChannel<E> bufferedChannel, kotlin.coroutines.d<? super E> dVar) throws Throwable {
        ChannelSegment<E> channelSegment;
        ChannelSegment<E> channelSegment2 = (ChannelSegment) getReceiveSegment$volatile$FU().get(bufferedChannel);
        while (!bufferedChannel.isClosedForReceive()) {
            long andIncrement = getReceivers$volatile$FU().getAndIncrement(bufferedChannel);
            int i = BufferedChannelKt.SEGMENT_SIZE;
            long j = andIncrement / ((long) i);
            int i2 = (int) (andIncrement % ((long) i));
            if (channelSegment2.id != j) {
                ChannelSegment<E> channelSegmentFindSegmentReceive = bufferedChannel.findSegmentReceive(j, channelSegment2);
                if (channelSegmentFindSegmentReceive == null) {
                    continue;
                } else {
                    channelSegment = channelSegmentFindSegmentReceive;
                }
            } else {
                channelSegment = channelSegment2;
            }
            BufferedChannel<E> bufferedChannel2 = bufferedChannel;
            Object objUpdateCellReceive = bufferedChannel2.updateCellReceive(channelSegment, i2, andIncrement, null);
            if (objUpdateCellReceive == BufferedChannelKt.SUSPEND) {
                net.luminis.tls.engine.impl.c.r("unexpected");
                return null;
            }
            if (objUpdateCellReceive != BufferedChannelKt.FAILED) {
                if (objUpdateCellReceive == BufferedChannelKt.SUSPEND_NO_WAITER) {
                    return bufferedChannel2.receiveOnNoWaiterSuspend(channelSegment, i2, andIncrement, dVar);
                }
                channelSegment.cleanPrev();
                return objUpdateCellReceive;
            }
            if (andIncrement < bufferedChannel2.getSendersCounter$kotlinx_coroutines_core()) {
                channelSegment.cleanPrev();
            }
            bufferedChannel = bufferedChannel2;
            channelSegment2 = channelSegment;
        }
        throw StackTraceRecoveryKt.recoverStackTrace(bufferedChannel.getReceiveException());
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: receiveCatching-JP2dKIU$suspendImpl, reason: not valid java name */
    public static <E> Object m32receiveCatchingJP2dKIU$suspendImpl(BufferedChannel<E> bufferedChannel, kotlin.coroutines.d<? super ChannelResult<? extends E>> dVar) throws Throwable {
        BufferedChannel$receiveCatching$1 bufferedChannel$receiveCatching$1;
        ChannelSegment<E> channelSegment;
        if (dVar instanceof BufferedChannel$receiveCatching$1) {
            bufferedChannel$receiveCatching$1 = (BufferedChannel$receiveCatching$1) dVar;
            int i = bufferedChannel$receiveCatching$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                bufferedChannel$receiveCatching$1.label = i - Integer.MIN_VALUE;
            } else {
                bufferedChannel$receiveCatching$1 = new BufferedChannel$receiveCatching$1(bufferedChannel, dVar);
            }
        } else {
            bufferedChannel$receiveCatching$1 = new BufferedChannel$receiveCatching$1(bufferedChannel, dVar);
        }
        BufferedChannel$receiveCatching$1 bufferedChannel$receiveCatching$2 = bufferedChannel$receiveCatching$1;
        Object obj = bufferedChannel$receiveCatching$2.result;
        int i2 = bufferedChannel$receiveCatching$2.label;
        if (i2 != 0) {
            if (i2 == 1) {
                kotlin.a.e(obj);
                return ((ChannelResult) obj).m54unboximpl();
            }
            net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.a.e(obj);
        ChannelSegment<E> channelSegment2 = (ChannelSegment) getReceiveSegment$volatile$FU().get(bufferedChannel);
        while (!bufferedChannel.isClosedForReceive()) {
            long andIncrement = getReceivers$volatile$FU().getAndIncrement(bufferedChannel);
            int i3 = BufferedChannelKt.SEGMENT_SIZE;
            long j = andIncrement / ((long) i3);
            int i4 = (int) (andIncrement % ((long) i3));
            if (channelSegment2.id != j) {
                ChannelSegment<E> channelSegmentFindSegmentReceive = bufferedChannel.findSegmentReceive(j, channelSegment2);
                if (channelSegmentFindSegmentReceive == null) {
                    continue;
                } else {
                    channelSegment = channelSegmentFindSegmentReceive;
                }
            } else {
                channelSegment = channelSegment2;
            }
            BufferedChannel<E> bufferedChannel2 = bufferedChannel;
            Object objUpdateCellReceive = bufferedChannel2.updateCellReceive(channelSegment, i4, andIncrement, null);
            if (objUpdateCellReceive == BufferedChannelKt.SUSPEND) {
                net.luminis.tls.engine.impl.c.r("unexpected");
                return null;
            }
            if (objUpdateCellReceive != BufferedChannelKt.FAILED) {
                if (objUpdateCellReceive != BufferedChannelKt.SUSPEND_NO_WAITER) {
                    channelSegment.cleanPrev();
                    return ChannelResult.Companion.m57successJP2dKIU(objUpdateCellReceive);
                }
                bufferedChannel$receiveCatching$2.label = 1;
                Object objM33receiveCatchingOnNoWaiterSuspendGKJJFZk = bufferedChannel2.m33receiveCatchingOnNoWaiterSuspendGKJJFZk(channelSegment, i4, andIncrement, bufferedChannel$receiveCatching$2);
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                return objM33receiveCatchingOnNoWaiterSuspendGKJJFZk == aVar ? aVar : objM33receiveCatchingOnNoWaiterSuspendGKJJFZk;
            }
            if (andIncrement < bufferedChannel2.getSendersCounter$kotlinx_coroutines_core()) {
                channelSegment.cleanPrev();
            }
            channelSegment2 = channelSegment;
            bufferedChannel = bufferedChannel2;
        }
        return ChannelResult.Companion.m55closedJP2dKIU(bufferedChannel.getCloseCause());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: receiveCatchingOnNoWaiterSuspend-GKJJFZk, reason: not valid java name */
    public final Object m33receiveCatchingOnNoWaiterSuspendGKJJFZk(ChannelSegment<E> channelSegment, int i, long j, kotlin.coroutines.d<? super ChannelResult<? extends E>> dVar) throws Throwable {
        BufferedChannel$receiveCatchingOnNoWaiterSuspend$1 bufferedChannel$receiveCatchingOnNoWaiterSuspend$1;
        ChannelResult channelResultM42boximpl;
        ChannelSegment channelSegment2;
        if (dVar instanceof BufferedChannel$receiveCatchingOnNoWaiterSuspend$1) {
            bufferedChannel$receiveCatchingOnNoWaiterSuspend$1 = (BufferedChannel$receiveCatchingOnNoWaiterSuspend$1) dVar;
            int i2 = bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.label = i2 - Integer.MIN_VALUE;
            } else {
                bufferedChannel$receiveCatchingOnNoWaiterSuspend$1 = new BufferedChannel$receiveCatchingOnNoWaiterSuspend$1(this, dVar);
            }
        } else {
            bufferedChannel$receiveCatchingOnNoWaiterSuspend$1 = new BufferedChannel$receiveCatchingOnNoWaiterSuspend$1(this, dVar);
        }
        Object result = bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.result;
        int i3 = bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.label;
        if (i3 == 0) {
            kotlin.a.e(result);
            bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.L$0 = this;
            bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.L$1 = channelSegment;
            bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.I$0 = i;
            bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.J$0 = j;
            bufferedChannel$receiveCatchingOnNoWaiterSuspend$1.label = 1;
            CancellableContinuationImpl orCreateCancellableContinuation = CancellableContinuationKt.getOrCreateCancellableContinuation(com.google.android.material.shape.e.g(bufferedChannel$receiveCatchingOnNoWaiterSuspend$1));
            try {
                orCreateCancellableContinuation.getClass();
                ReceiveCatching receiveCatching = new ReceiveCatching(orCreateCancellableContinuation);
                try {
                    Object objUpdateCellReceive = updateCellReceive(channelSegment, i, j, receiveCatching);
                    if (objUpdateCellReceive == BufferedChannelKt.SUSPEND) {
                        prepareReceiverForSuspension(receiveCatching, channelSegment, i);
                    } else {
                        kotlin.reflect.e eVarBindCancellationFunResult = null;
                        if (objUpdateCellReceive == BufferedChannelKt.FAILED) {
                            if (j < getSendersCounter$kotlinx_coroutines_core()) {
                                channelSegment.cleanPrev();
                            }
                            ChannelSegment channelSegment3 = (ChannelSegment) getReceiveSegment$volatile$FU().get(this);
                            while (true) {
                                if (isClosedForReceive()) {
                                    onClosedReceiveCatchingOnNoWaiterSuspend(orCreateCancellableContinuation);
                                } else {
                                    long andIncrement = getReceivers$volatile$FU().getAndIncrement(this);
                                    int i4 = BufferedChannelKt.SEGMENT_SIZE;
                                    long j2 = andIncrement / ((long) i4);
                                    int i5 = (int) (andIncrement % ((long) i4));
                                    if (channelSegment3.id != j2) {
                                        ChannelSegment channelSegmentFindSegmentReceive = findSegmentReceive(j2, channelSegment3);
                                        if (channelSegmentFindSegmentReceive != null) {
                                            channelSegment2 = channelSegmentFindSegmentReceive;
                                        }
                                    } else {
                                        channelSegment2 = channelSegment3;
                                    }
                                    Object objUpdateCellReceive2 = updateCellReceive(channelSegment2, i5, andIncrement, receiveCatching);
                                    ChannelSegment channelSegment4 = channelSegment2;
                                    if (objUpdateCellReceive2 == BufferedChannelKt.SUSPEND) {
                                        prepareReceiverForSuspension(receiveCatching, channelSegment4, i5);
                                    } else if (objUpdateCellReceive2 == BufferedChannelKt.FAILED) {
                                        if (andIncrement < getSendersCounter$kotlinx_coroutines_core()) {
                                            channelSegment4.cleanPrev();
                                        }
                                        channelSegment3 = channelSegment4;
                                    } else {
                                        if (objUpdateCellReceive2 == BufferedChannelKt.SUSPEND_NO_WAITER) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        channelSegment4.cleanPrev();
                                        channelResultM42boximpl = ChannelResult.m42boximpl(ChannelResult.Companion.m57successJP2dKIU(objUpdateCellReceive2));
                                        l lVar = this.onUndeliveredElement;
                                        if (lVar != null) {
                                            eVarBindCancellationFunResult = bindCancellationFunResult(lVar);
                                        }
                                    }
                                }
                            }
                        } else {
                            channelSegment.cleanPrev();
                            channelResultM42boximpl = ChannelResult.m42boximpl(ChannelResult.Companion.m57successJP2dKIU(objUpdateCellReceive));
                            l lVar2 = this.onUndeliveredElement;
                            if (lVar2 != null) {
                                eVarBindCancellationFunResult = bindCancellationFunResult(lVar2);
                            }
                        }
                        orCreateCancellableContinuation.resume(channelResultM42boximpl, (q) eVarBindCancellationFunResult);
                    }
                    result = orCreateCancellableContinuation.getResult();
                    kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                    if (result == aVar) {
                        return aVar;
                    }
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    orCreateCancellableContinuation.releaseClaimedReusableContinuation$kotlinx_coroutines_core();
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } else {
            if (i3 != 1) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.a.e(result);
        }
        return ((ChannelResult) result).m54unboximpl();
    }

    private final <R> R receiveImpl(Object obj, l lVar, q qVar, kotlin.jvm.functions.a aVar, q qVar2) {
        ChannelSegment channelSegment;
        ChannelSegment channelSegment2 = (ChannelSegment) getReceiveSegment$volatile$FU().get(this);
        while (!isClosedForReceive()) {
            long andIncrement = getReceivers$volatile$FU().getAndIncrement(this);
            int i = BufferedChannelKt.SEGMENT_SIZE;
            long j = andIncrement / ((long) i);
            int i2 = (int) (andIncrement % ((long) i));
            if (channelSegment2.id != j) {
                ChannelSegment channelSegmentFindSegmentReceive = findSegmentReceive(j, channelSegment2);
                if (channelSegmentFindSegmentReceive == null) {
                    continue;
                } else {
                    channelSegment = channelSegmentFindSegmentReceive;
                }
            } else {
                channelSegment = channelSegment2;
            }
            Object obj2 = obj;
            Object objUpdateCellReceive = updateCellReceive(channelSegment, i2, andIncrement, obj2);
            channelSegment2 = channelSegment;
            if (objUpdateCellReceive == BufferedChannelKt.SUSPEND) {
                Waiter waiter = obj2 instanceof Waiter ? (Waiter) obj2 : null;
                if (waiter != null) {
                    prepareReceiverForSuspension(waiter, channelSegment2, i2);
                }
                return (R) qVar.invoke(channelSegment2, Integer.valueOf(i2), Long.valueOf(andIncrement));
            }
            if (objUpdateCellReceive != BufferedChannelKt.FAILED) {
                if (objUpdateCellReceive == BufferedChannelKt.SUSPEND_NO_WAITER) {
                    return (R) qVar2.invoke(channelSegment2, Integer.valueOf(i2), Long.valueOf(andIncrement));
                }
                channelSegment2.cleanPrev();
                return (R) lVar.invoke(objUpdateCellReceive);
            }
            if (andIncrement < getSendersCounter$kotlinx_coroutines_core()) {
                channelSegment2.cleanPrev();
            }
            obj = obj2;
        }
        return (R) aVar.invoke();
    }

    public static /* synthetic */ Object receiveImpl$default(BufferedChannel bufferedChannel, Object obj, l lVar, q qVar, kotlin.jvm.functions.a aVar, q qVar2, int i, Object obj2) {
        ChannelSegment channelSegment;
        if (obj2 != null) {
            com.google.gson.b.r("Super calls with default arguments not supported in this target, function: receiveImpl");
            return null;
        }
        if ((i & 16) != 0) {
            qVar2 = new q() { // from class: kotlinx.coroutines.channels.BufferedChannel.receiveImpl.1
                @Override // kotlin.jvm.functions.q
                public /* bridge */ /* synthetic */ Object invoke(Object obj3, Object obj4, Object obj5) {
                    return invoke((ChannelSegment) obj3, ((Number) obj4).intValue(), ((Number) obj5).longValue());
                }

                public final Void invoke(ChannelSegment<E> channelSegment2, int i2, long j) {
                    throw new IllegalStateException("unexpected");
                }
            };
        }
        ChannelSegment channelSegment2 = (ChannelSegment) getReceiveSegment$volatile$FU().get(bufferedChannel);
        while (!bufferedChannel.isClosedForReceive()) {
            long andIncrement = getReceivers$volatile$FU().getAndIncrement(bufferedChannel);
            int i2 = BufferedChannelKt.SEGMENT_SIZE;
            long j = andIncrement / ((long) i2);
            int i3 = (int) (andIncrement % ((long) i2));
            if (channelSegment2.id != j) {
                ChannelSegment channelSegmentFindSegmentReceive = bufferedChannel.findSegmentReceive(j, channelSegment2);
                if (channelSegmentFindSegmentReceive == null) {
                    continue;
                } else {
                    channelSegment = channelSegmentFindSegmentReceive;
                }
            } else {
                channelSegment = channelSegment2;
            }
            BufferedChannel bufferedChannel2 = bufferedChannel;
            Object obj3 = obj;
            Object objUpdateCellReceive = bufferedChannel2.updateCellReceive(channelSegment, i3, andIncrement, obj3);
            channelSegment2 = channelSegment;
            if (objUpdateCellReceive == BufferedChannelKt.SUSPEND) {
                Waiter waiter = obj3 instanceof Waiter ? (Waiter) obj3 : null;
                if (waiter != null) {
                    bufferedChannel2.prepareReceiverForSuspension(waiter, channelSegment2, i3);
                }
                return qVar.invoke(channelSegment2, Integer.valueOf(i3), Long.valueOf(andIncrement));
            }
            if (objUpdateCellReceive != BufferedChannelKt.FAILED) {
                if (objUpdateCellReceive == BufferedChannelKt.SUSPEND_NO_WAITER) {
                    return qVar2.invoke(channelSegment2, Integer.valueOf(i3), Long.valueOf(andIncrement));
                }
                channelSegment2.cleanPrev();
                return lVar.invoke(objUpdateCellReceive);
            }
            if (andIncrement < bufferedChannel2.getSendersCounter$kotlinx_coroutines_core()) {
                channelSegment2.cleanPrev();
            }
            bufferedChannel = bufferedChannel2;
            obj = obj3;
        }
        return aVar.invoke();
    }

    private final void receiveImplOnNoWaiter(ChannelSegment<E> channelSegment, int i, long j, Waiter waiter, l lVar, kotlin.jvm.functions.a aVar) {
        ChannelSegment channelSegment2;
        Waiter waiter2;
        Object objUpdateCellReceive = updateCellReceive(channelSegment, i, j, waiter);
        BufferedChannel<E> bufferedChannel = this;
        if (objUpdateCellReceive == BufferedChannelKt.SUSPEND) {
            prepareReceiverForSuspension(waiter, channelSegment, i);
            return;
        }
        if (objUpdateCellReceive != BufferedChannelKt.FAILED) {
            channelSegment.cleanPrev();
            lVar.invoke(objUpdateCellReceive);
            return;
        }
        if (j < getSendersCounter$kotlinx_coroutines_core()) {
            channelSegment.cleanPrev();
        }
        ChannelSegment channelSegment3 = (ChannelSegment) getReceiveSegment$volatile$FU().get(this);
        while (!isClosedForReceive()) {
            long andIncrement = getReceivers$volatile$FU().getAndIncrement(this);
            int i2 = BufferedChannelKt.SEGMENT_SIZE;
            long j2 = andIncrement / ((long) i2);
            int i3 = (int) (andIncrement % ((long) i2));
            if (channelSegment3.id != j2) {
                ChannelSegment channelSegmentFindSegmentReceive = findSegmentReceive(j2, channelSegment3);
                if (channelSegmentFindSegmentReceive == null) {
                    continue;
                } else {
                    channelSegment2 = channelSegmentFindSegmentReceive;
                }
            } else {
                channelSegment2 = channelSegment3;
            }
            BufferedChannel<E> bufferedChannel2 = bufferedChannel;
            Object objUpdateCellReceive2 = bufferedChannel2.updateCellReceive(channelSegment2, i3, andIncrement, waiter);
            channelSegment3 = channelSegment2;
            if (objUpdateCellReceive2 == BufferedChannelKt.SUSPEND) {
                if (waiter == null) {
                    waiter2 = null;
                }
                if (waiter2 == null) {
                    waiter2 = waiter;
                    return;
                } else {
                    waiter2 = waiter;
                    prepareReceiverForSuspension(waiter2, channelSegment3, i3);
                    return;
                }
            }
            if (objUpdateCellReceive2 != BufferedChannelKt.FAILED) {
                if (objUpdateCellReceive2 == BufferedChannelKt.SUSPEND_NO_WAITER) {
                    net.luminis.tls.engine.impl.c.r("unexpected");
                    return;
                } else {
                    channelSegment3.cleanPrev();
                    lVar.invoke(objUpdateCellReceive2);
                    return;
                }
            }
            if (andIncrement < getSendersCounter$kotlinx_coroutines_core()) {
                channelSegment3.cleanPrev();
            }
            bufferedChannel = bufferedChannel2;
        }
        aVar.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object receiveOnNoWaiterSuspend(ChannelSegment<E> channelSegment, int i, long j, kotlin.coroutines.d<? super E> dVar) {
        ChannelSegment channelSegment2;
        CancellableContinuationImpl orCreateCancellableContinuation = CancellableContinuationKt.getOrCreateCancellableContinuation(com.google.android.material.shape.e.g(dVar));
        try {
            Object objUpdateCellReceive = updateCellReceive(channelSegment, i, j, orCreateCancellableContinuation);
            if (objUpdateCellReceive != BufferedChannelKt.SUSPEND) {
                kotlin.reflect.e eVarBindCancellationFun = null;
                eVarBindCancellationFun = null;
                if (objUpdateCellReceive == BufferedChannelKt.FAILED) {
                    if (j < getSendersCounter$kotlinx_coroutines_core()) {
                        channelSegment.cleanPrev();
                    }
                    ChannelSegment channelSegment3 = (ChannelSegment) getReceiveSegment$volatile$FU().get(this);
                    while (true) {
                        if (isClosedForReceive()) {
                            onClosedReceiveOnNoWaiterSuspend(orCreateCancellableContinuation);
                            break;
                        }
                        long andIncrement = getReceivers$volatile$FU().getAndIncrement(this);
                        int i2 = BufferedChannelKt.SEGMENT_SIZE;
                        long j2 = andIncrement / ((long) i2);
                        int i3 = (int) (andIncrement % ((long) i2));
                        if (channelSegment3.id != j2) {
                            ChannelSegment channelSegmentFindSegmentReceive = findSegmentReceive(j2, channelSegment3);
                            if (channelSegmentFindSegmentReceive != null) {
                                channelSegment2 = channelSegmentFindSegmentReceive;
                            }
                        } else {
                            channelSegment2 = channelSegment3;
                        }
                        objUpdateCellReceive = updateCellReceive(channelSegment2, i3, andIncrement, orCreateCancellableContinuation);
                        ChannelSegment channelSegment4 = channelSegment2;
                        if (objUpdateCellReceive == BufferedChannelKt.SUSPEND) {
                            CancellableContinuationImpl cancellableContinuationImpl = orCreateCancellableContinuation != null ? orCreateCancellableContinuation : null;
                            if (cancellableContinuationImpl == null) {
                                break;
                            }
                            prepareReceiverForSuspension(cancellableContinuationImpl, channelSegment4, i3);
                            break;
                        }
                        if (objUpdateCellReceive == BufferedChannelKt.FAILED) {
                            if (andIncrement < getSendersCounter$kotlinx_coroutines_core()) {
                                channelSegment4.cleanPrev();
                            }
                            channelSegment3 = channelSegment4;
                        } else {
                            if (objUpdateCellReceive == BufferedChannelKt.SUSPEND_NO_WAITER) {
                                throw new IllegalStateException("unexpected");
                            }
                            channelSegment4.cleanPrev();
                            l lVar = this.onUndeliveredElement;
                            if (lVar != null) {
                                eVarBindCancellationFun = bindCancellationFun(lVar);
                            }
                        }
                    }
                } else {
                    channelSegment.cleanPrev();
                    l lVar2 = this.onUndeliveredElement;
                    if (lVar2 != null) {
                        eVarBindCancellationFun = bindCancellationFun(lVar2);
                    }
                }
                orCreateCancellableContinuation.resume(objUpdateCellReceive, (q) eVarBindCancellationFun);
                break;
            }
            prepareReceiverForSuspension(orCreateCancellableContinuation, channelSegment, i);
            return orCreateCancellableContinuation.getResult();
        } catch (Throwable th) {
            orCreateCancellableContinuation.releaseClaimedReusableContinuation$kotlinx_coroutines_core();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void registerSelectForReceive(SelectInstance<?> selectInstance, Object obj) {
        ChannelSegment channelSegment;
        ChannelSegment channelSegment2 = (ChannelSegment) getReceiveSegment$volatile$FU().get(this);
        while (!isClosedForReceive()) {
            long andIncrement = getReceivers$volatile$FU().getAndIncrement(this);
            int i = BufferedChannelKt.SEGMENT_SIZE;
            long j = andIncrement / ((long) i);
            int i2 = (int) (andIncrement % ((long) i));
            if (channelSegment2.id != j) {
                ChannelSegment channelSegmentFindSegmentReceive = findSegmentReceive(j, channelSegment2);
                if (channelSegmentFindSegmentReceive == null) {
                    continue;
                } else {
                    channelSegment = channelSegmentFindSegmentReceive;
                }
            } else {
                channelSegment = channelSegment2;
            }
            SelectInstance<?> selectInstance2 = selectInstance;
            Object objUpdateCellReceive = updateCellReceive(channelSegment, i2, andIncrement, selectInstance2);
            channelSegment2 = channelSegment;
            if (objUpdateCellReceive == BufferedChannelKt.SUSPEND) {
                Waiter waiter = selectInstance2 instanceof Waiter ? (Waiter) selectInstance2 : null;
                if (waiter != null) {
                    prepareReceiverForSuspension(waiter, channelSegment2, i2);
                    return;
                }
                return;
            }
            if (objUpdateCellReceive != BufferedChannelKt.FAILED) {
                if (objUpdateCellReceive == BufferedChannelKt.SUSPEND_NO_WAITER) {
                    net.luminis.tls.engine.impl.c.r("unexpected");
                    return;
                } else {
                    channelSegment2.cleanPrev();
                    selectInstance2.selectInRegistrationPhase(objUpdateCellReceive);
                    return;
                }
            }
            if (andIncrement < getSendersCounter$kotlinx_coroutines_core()) {
                channelSegment2.cleanPrev();
            }
            selectInstance = selectInstance2;
        }
        onClosedSelectOnReceive(selectInstance);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void removeUnprocessedElements(ChannelSegment<E> channelSegment) {
        l lVar = this.onUndeliveredElement;
        UndeliveredElementException undeliveredElementExceptionCallUndeliveredElementCatchingException = null;
        Object objM77constructorimpl$default = InlineList.m77constructorimpl$default(null, 1, null);
        loop0: do {
            for (int i = BufferedChannelKt.SEGMENT_SIZE - 1; -1 < i; i--) {
                long j = (channelSegment.id * ((long) BufferedChannelKt.SEGMENT_SIZE)) + ((long) i);
                while (true) {
                    Object state$kotlinx_coroutines_core = channelSegment.getState$kotlinx_coroutines_core(i);
                    if (state$kotlinx_coroutines_core == BufferedChannelKt.DONE_RCV) {
                        break loop0;
                    }
                    if (state$kotlinx_coroutines_core != BufferedChannelKt.BUFFERED) {
                        if (state$kotlinx_coroutines_core != BufferedChannelKt.IN_BUFFER && state$kotlinx_coroutines_core != null) {
                            if (!(state$kotlinx_coroutines_core instanceof Waiter) && !(state$kotlinx_coroutines_core instanceof WaiterEB)) {
                                if (state$kotlinx_coroutines_core != BufferedChannelKt.RESUMING_BY_EB && state$kotlinx_coroutines_core != BufferedChannelKt.RESUMING_BY_RCV) {
                                    if (state$kotlinx_coroutines_core != BufferedChannelKt.RESUMING_BY_EB) {
                                        break;
                                    }
                                } else {
                                    break loop0;
                                }
                            } else {
                                if (j < getReceiversCounter$kotlinx_coroutines_core()) {
                                    break loop0;
                                }
                                Waiter waiter = state$kotlinx_coroutines_core instanceof WaiterEB ? ((WaiterEB) state$kotlinx_coroutines_core).waiter : (Waiter) state$kotlinx_coroutines_core;
                                if (channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, BufferedChannelKt.getCHANNEL_CLOSED())) {
                                    if (lVar != null) {
                                        undeliveredElementExceptionCallUndeliveredElementCatchingException = OnUndeliveredElementKt.callUndeliveredElementCatchingException(lVar, channelSegment.getElement$kotlinx_coroutines_core(i), undeliveredElementExceptionCallUndeliveredElementCatchingException);
                                    }
                                    objM77constructorimpl$default = InlineList.m82plusFjFbRPM(objM77constructorimpl$default, waiter);
                                    channelSegment.cleanElement$kotlinx_coroutines_core(i);
                                    channelSegment.onSlotCleaned();
                                    break;
                                }
                            }
                        } else {
                            if (channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, BufferedChannelKt.getCHANNEL_CLOSED())) {
                                channelSegment.onSlotCleaned();
                                break;
                            }
                        }
                    } else {
                        if (j < getReceiversCounter$kotlinx_coroutines_core()) {
                            break loop0;
                        }
                        if (channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, BufferedChannelKt.getCHANNEL_CLOSED())) {
                            if (lVar != null) {
                                undeliveredElementExceptionCallUndeliveredElementCatchingException = OnUndeliveredElementKt.callUndeliveredElementCatchingException(lVar, channelSegment.getElement$kotlinx_coroutines_core(i), undeliveredElementExceptionCallUndeliveredElementCatchingException);
                            }
                            channelSegment.cleanElement$kotlinx_coroutines_core(i);
                            channelSegment.onSlotCleaned();
                            break;
                        }
                    }
                }
            }
            channelSegment = (ChannelSegment) channelSegment.getPrev();
        } while (channelSegment != null);
        if (objM77constructorimpl$default != null) {
            if (objM77constructorimpl$default instanceof ArrayList) {
                ArrayList arrayList = (ArrayList) objM77constructorimpl$default;
                for (int size = arrayList.size() - 1; -1 < size; size--) {
                    resumeSenderOnCancelledChannel((Waiter) arrayList.get(size));
                }
            } else {
                resumeSenderOnCancelledChannel((Waiter) objM77constructorimpl$default);
            }
        }
        if (undeliveredElementExceptionCallUndeliveredElementCatchingException != null) {
            throw undeliveredElementExceptionCallUndeliveredElementCatchingException;
        }
    }

    private final void resumeReceiverOnClosedChannel(Waiter waiter) {
        resumeWaiterOnClosedChannel(waiter, true);
    }

    private final void resumeSenderOnCancelledChannel(Waiter waiter) {
        resumeWaiterOnClosedChannel(waiter, false);
    }

    private final void resumeWaiterOnClosedChannel(Waiter waiter, boolean z) {
        if (waiter instanceof SendBroadcast) {
            ((SendBroadcast) waiter).getCont().resumeWith(Boolean.FALSE);
            return;
        }
        if (waiter instanceof CancellableContinuation) {
            ((kotlin.coroutines.d) waiter).resumeWith(kotlin.a.b(z ? getReceiveException() : getSendException()));
            return;
        }
        if (waiter instanceof ReceiveCatching) {
            ((ReceiveCatching) waiter).cont.resumeWith(ChannelResult.m42boximpl(ChannelResult.Companion.m55closedJP2dKIU(getCloseCause())));
            return;
        }
        if (waiter instanceof BufferedChannelIterator) {
            ((BufferedChannelIterator) waiter).tryResumeHasNextOnClosedChannel();
        } else if (waiter instanceof SelectInstance) {
            ((SelectInstance) waiter).trySelect(this, BufferedChannelKt.getCHANNEL_CLOSED());
        } else {
            com.google.gson.b.u(waiter, "Unexpected waiter: ");
        }
    }

    public static <E> Object send$suspendImpl(BufferedChannel<E> bufferedChannel, E e, kotlin.coroutines.d<? super y> dVar) {
        ChannelSegment<E> channelSegment;
        ChannelSegment<E> channelSegment2 = (ChannelSegment) sendSegment$volatile$FU.get(bufferedChannel);
        while (true) {
            long andIncrement = sendersAndCloseStatus$volatile$FU.getAndIncrement(bufferedChannel);
            long j = andIncrement & 1152921504606846975L;
            boolean zIsClosedForSend0 = bufferedChannel.isClosedForSend0(andIncrement);
            int i = BufferedChannelKt.SEGMENT_SIZE;
            long j2 = j / ((long) i);
            int i2 = (int) (j % ((long) i));
            if (channelSegment2.id != j2) {
                ChannelSegment<E> channelSegmentFindSegmentSend = bufferedChannel.findSegmentSend(j2, channelSegment2);
                if (channelSegmentFindSegmentSend != null) {
                    channelSegment = channelSegmentFindSegmentSend;
                } else if (zIsClosedForSend0) {
                    Object objOnClosedSend = bufferedChannel.onClosedSend(e, dVar);
                    if (objOnClosedSend != kotlin.coroutines.intrinsics.a.e) {
                        break;
                    }
                    return objOnClosedSend;
                }
            } else {
                channelSegment = channelSegment2;
            }
            BufferedChannel<E> bufferedChannel2 = bufferedChannel;
            E e2 = e;
            int iUpdateCellSend = bufferedChannel2.updateCellSend(channelSegment, i2, e2, j, null, zIsClosedForSend0);
            if (iUpdateCellSend == 0) {
                channelSegment.cleanPrev();
                break;
            }
            if (iUpdateCellSend != 1) {
                if (iUpdateCellSend == 2) {
                    if (!zIsClosedForSend0) {
                        break;
                    }
                    channelSegment.onSlotCleaned();
                    Object objOnClosedSend2 = bufferedChannel2.onClosedSend(e2, dVar);
                    if (objOnClosedSend2 != kotlin.coroutines.intrinsics.a.e) {
                        break;
                    }
                    return objOnClosedSend2;
                }
                if (iUpdateCellSend == 3) {
                    Object objSendOnNoWaiterSuspend = bufferedChannel2.sendOnNoWaiterSuspend(channelSegment, i2, e2, j, dVar);
                    if (objSendOnNoWaiterSuspend != kotlin.coroutines.intrinsics.a.e) {
                        break;
                    }
                    return objSendOnNoWaiterSuspend;
                }
                if (iUpdateCellSend == 4) {
                    if (j < bufferedChannel2.getReceiversCounter$kotlinx_coroutines_core()) {
                        channelSegment.cleanPrev();
                    }
                    Object objOnClosedSend3 = bufferedChannel2.onClosedSend(e2, dVar);
                    if (objOnClosedSend3 != kotlin.coroutines.intrinsics.a.e) {
                        break;
                    }
                    return objOnClosedSend3;
                }
                if (iUpdateCellSend == 5) {
                    channelSegment.cleanPrev();
                }
                bufferedChannel = bufferedChannel2;
                channelSegment2 = channelSegment;
                e = e2;
            } else {
                break;
            }
        }
        return y.a;
    }

    public static <E> Object sendBroadcast$suspendImpl(BufferedChannel<E> bufferedChannel, E e, kotlin.coroutines.d<? super Boolean> dVar) {
        ChannelSegment channelSegmentFindSegmentSend;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(com.google.android.material.shape.e.g(dVar), 1);
        cancellableContinuationImpl.initCancellability();
        if (bufferedChannel.onUndeliveredElement != null) {
            net.luminis.tls.engine.impl.c.r("the `onUndeliveredElement` feature is unsupported for `sendBroadcast(e)`");
            return null;
        }
        SendBroadcast sendBroadcast = new SendBroadcast(cancellableContinuationImpl);
        ChannelSegment channelSegment = (ChannelSegment) sendSegment$volatile$FU.get(bufferedChannel);
        while (true) {
            long andIncrement = sendersAndCloseStatus$volatile$FU.getAndIncrement(bufferedChannel);
            long j = andIncrement & 1152921504606846975L;
            boolean zIsClosedForSend0 = bufferedChannel.isClosedForSend0(andIncrement);
            int i = BufferedChannelKt.SEGMENT_SIZE;
            long j2 = j / ((long) i);
            int i2 = (int) (j % ((long) i));
            if (channelSegment.id != j2) {
                channelSegmentFindSegmentSend = bufferedChannel.findSegmentSend(j2, channelSegment);
                if (channelSegmentFindSegmentSend == null) {
                    if (zIsClosedForSend0) {
                        cancellableContinuationImpl.resumeWith(Boolean.FALSE);
                        break;
                    }
                }
            } else {
                channelSegmentFindSegmentSend = channelSegment;
            }
            E e2 = e;
            BufferedChannel<E> bufferedChannel2 = bufferedChannel;
            int iUpdateCellSend = bufferedChannel2.updateCellSend(channelSegmentFindSegmentSend, i2, e2, j, sendBroadcast, zIsClosedForSend0);
            channelSegment = channelSegmentFindSegmentSend;
            if (iUpdateCellSend == 0) {
                channelSegment.cleanPrev();
            } else if (iUpdateCellSend != 1) {
                if (iUpdateCellSend == 2) {
                    if (!zIsClosedForSend0) {
                        bufferedChannel2.prepareSenderForSuspension(sendBroadcast, channelSegment, i2);
                        break;
                    }
                    channelSegment.onSlotCleaned();
                } else {
                    if (iUpdateCellSend == 3) {
                        net.luminis.tls.engine.impl.c.r("unexpected");
                        return null;
                    }
                    if (iUpdateCellSend != 4) {
                        if (iUpdateCellSend == 5) {
                            channelSegment.cleanPrev();
                        }
                        bufferedChannel = bufferedChannel2;
                        e = e2;
                    } else if (j < bufferedChannel2.getReceiversCounter$kotlinx_coroutines_core()) {
                        channelSegment.cleanPrev();
                    }
                }
                cancellableContinuationImpl.resumeWith(Boolean.FALSE);
                break;
            }
            cancellableContinuationImpl.resumeWith(Boolean.TRUE);
            break;
        }
        return cancellableContinuationImpl.getResult();
    }

    private final <R> R sendImpl(E e, Object obj, kotlin.jvm.functions.a aVar, p pVar, kotlin.jvm.functions.a aVar2, r rVar) {
        ChannelSegment channelSegment = (ChannelSegment) sendSegment$volatile$FU.get(this);
        while (true) {
            long andIncrement = sendersAndCloseStatus$volatile$FU.getAndIncrement(this);
            long j = 1152921504606846975L & andIncrement;
            boolean zIsClosedForSend0 = isClosedForSend0(andIncrement);
            int i = BufferedChannelKt.SEGMENT_SIZE;
            long j2 = j / ((long) i);
            int i2 = (int) (j % ((long) i));
            if (channelSegment.id != j2) {
                ChannelSegment channelSegmentFindSegmentSend = findSegmentSend(j2, channelSegment);
                if (channelSegmentFindSegmentSend != null) {
                    channelSegment = channelSegmentFindSegmentSend;
                } else if (zIsClosedForSend0) {
                    return (R) aVar2.invoke();
                }
            }
            int iUpdateCellSend = updateCellSend(channelSegment, i2, e, j, obj, zIsClosedForSend0);
            if (iUpdateCellSend == 0) {
                channelSegment.cleanPrev();
                return (R) aVar.invoke();
            }
            if (iUpdateCellSend == 1) {
                return (R) aVar.invoke();
            }
            if (iUpdateCellSend == 2) {
                if (zIsClosedForSend0) {
                    channelSegment.onSlotCleaned();
                    return (R) aVar2.invoke();
                }
                Waiter waiter = obj instanceof Waiter ? (Waiter) obj : null;
                if (waiter != null) {
                    prepareSenderForSuspension(waiter, channelSegment, i2);
                }
                return (R) pVar.invoke(channelSegment, Integer.valueOf(i2));
            }
            if (iUpdateCellSend == 3) {
                return (R) rVar.invoke(channelSegment, Integer.valueOf(i2), e, Long.valueOf(j));
            }
            if (iUpdateCellSend == 4) {
                if (j < getReceiversCounter$kotlinx_coroutines_core()) {
                    channelSegment.cleanPrev();
                }
                return (R) aVar2.invoke();
            }
            if (iUpdateCellSend == 5) {
                channelSegment.cleanPrev();
            }
        }
    }

    public static /* synthetic */ Object sendImpl$default(BufferedChannel bufferedChannel, Object obj, Object obj2, kotlin.jvm.functions.a aVar, p pVar, kotlin.jvm.functions.a aVar2, r rVar, int i, Object obj3) {
        if (obj3 != null) {
            com.google.gson.b.r("Super calls with default arguments not supported in this target, function: sendImpl");
            return null;
        }
        r rVar2 = (i & 32) != 0 ? new r() { // from class: kotlinx.coroutines.channels.BufferedChannel.sendImpl.1
            @Override // kotlin.jvm.functions.r
            public /* bridge */ /* synthetic */ Object invoke(Object obj4, Object obj5, Object obj6, Object obj7) {
                return invoke((ChannelSegment<Object>) obj4, ((Number) obj5).intValue(), obj6, ((Number) obj7).longValue());
            }

            public final Void invoke(ChannelSegment<E> channelSegment, int i2, E e, long j) {
                throw new IllegalStateException("unexpected");
            }
        } : rVar;
        ChannelSegment channelSegment = (ChannelSegment) sendSegment$volatile$FU.get(bufferedChannel);
        while (true) {
            long andIncrement = sendersAndCloseStatus$volatile$FU.getAndIncrement(bufferedChannel);
            long j = 1152921504606846975L & andIncrement;
            boolean zIsClosedForSend0 = bufferedChannel.isClosedForSend0(andIncrement);
            int i2 = BufferedChannelKt.SEGMENT_SIZE;
            long j2 = j / ((long) i2);
            int i3 = (int) (j % ((long) i2));
            if (channelSegment.id != j2) {
                ChannelSegment channelSegmentFindSegmentSend = bufferedChannel.findSegmentSend(j2, channelSegment);
                if (channelSegmentFindSegmentSend != null) {
                    channelSegment = channelSegmentFindSegmentSend;
                } else if (zIsClosedForSend0) {
                    return aVar2.invoke();
                }
            }
            int iUpdateCellSend = bufferedChannel.updateCellSend(channelSegment, i3, obj, j, obj2, zIsClosedForSend0);
            if (iUpdateCellSend == 0) {
                channelSegment.cleanPrev();
                return aVar.invoke();
            }
            if (iUpdateCellSend == 1) {
                return aVar.invoke();
            }
            if (iUpdateCellSend == 2) {
                if (zIsClosedForSend0) {
                    channelSegment.onSlotCleaned();
                    return aVar2.invoke();
                }
                Waiter waiter = obj2 instanceof Waiter ? (Waiter) obj2 : null;
                if (waiter != null) {
                    bufferedChannel.prepareSenderForSuspension(waiter, channelSegment, i3);
                }
                return pVar.invoke(channelSegment, Integer.valueOf(i3));
            }
            if (iUpdateCellSend == 3) {
                return rVar2.invoke(channelSegment, Integer.valueOf(i3), obj, Long.valueOf(j));
            }
            if (iUpdateCellSend == 4) {
                if (j < bufferedChannel.getReceiversCounter$kotlinx_coroutines_core()) {
                    channelSegment.cleanPrev();
                }
                return aVar2.invoke();
            }
            if (iUpdateCellSend == 5) {
                channelSegment.cleanPrev();
            }
        }
    }

    private final void sendImplOnNoWaiter(ChannelSegment<E> channelSegment, int i, E e, long j, Waiter waiter, kotlin.jvm.functions.a aVar, kotlin.jvm.functions.a aVar2) {
        Object objInvoke;
        int iUpdateCellSend = updateCellSend(channelSegment, i, e, j, waiter, false);
        if (iUpdateCellSend == 0) {
            channelSegment.cleanPrev();
            aVar.invoke();
            return;
        }
        if (iUpdateCellSend == 1) {
            aVar.invoke();
            return;
        }
        if (iUpdateCellSend == 2) {
            prepareSenderForSuspension(waiter, channelSegment, i);
            return;
        }
        if (iUpdateCellSend == 4) {
            if (j < getReceiversCounter$kotlinx_coroutines_core()) {
                channelSegment.cleanPrev();
            }
            aVar2.invoke();
            return;
        }
        String str = "unexpected";
        if (iUpdateCellSend != 5) {
            net.luminis.tls.engine.impl.c.r("unexpected");
            return;
        }
        channelSegment.cleanPrev();
        ChannelSegment channelSegment2 = (ChannelSegment) sendSegment$volatile$FU.get(this);
        while (true) {
            long andIncrement = sendersAndCloseStatus$volatile$FU.getAndIncrement(this);
            long j2 = 1152921504606846975L & andIncrement;
            boolean zIsClosedForSend0 = isClosedForSend0(andIncrement);
            int i2 = BufferedChannelKt.SEGMENT_SIZE;
            long j3 = j2 / ((long) i2);
            int i3 = (int) (j2 % ((long) i2));
            str = str;
            if (channelSegment2.id != j3) {
                ChannelSegment channelSegmentFindSegmentSend = findSegmentSend(j3, channelSegment2);
                if (channelSegmentFindSegmentSend != null) {
                    channelSegment2 = channelSegmentFindSegmentSend;
                } else if (zIsClosedForSend0) {
                    objInvoke = aVar2.invoke();
                    break;
                }
            }
            int iUpdateCellSend2 = updateCellSend(channelSegment2, i3, e, j2, waiter, zIsClosedForSend0);
            if (iUpdateCellSend2 == 0) {
                channelSegment2.cleanPrev();
                objInvoke = aVar.invoke();
                break;
            }
            if (iUpdateCellSend2 == 1) {
                objInvoke = aVar.invoke();
                break;
            }
            if (iUpdateCellSend2 == 2) {
                if (!zIsClosedForSend0) {
                    Waiter waiter2 = waiter != 0 ? waiter : null;
                    if (waiter2 != null) {
                        prepareSenderForSuspension(waiter2, channelSegment2, i3);
                    }
                    objInvoke = y.a;
                    break;
                }
                channelSegment2.onSlotCleaned();
                objInvoke = aVar2.invoke();
                break;
            }
            if (iUpdateCellSend2 == 3) {
                net.luminis.tls.engine.impl.c.r(str);
                return;
            } else if (iUpdateCellSend2 == 4) {
                if (j2 < getReceiversCounter$kotlinx_coroutines_core()) {
                    channelSegment2.cleanPrev();
                }
                objInvoke = aVar2.invoke();
                break;
            } else if (iUpdateCellSend2 == 5) {
                channelSegment2.cleanPrev();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:62:0x00e2 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:63:0x00e3 A[RETURN] */
    public final Object sendOnNoWaiterSuspend(ChannelSegment<E> channelSegment, int i, E e, long j, kotlin.coroutines.d<? super y> dVar) {
        Object result;
        ChannelSegment channelSegmentFindSegmentSend;
        CancellableContinuationImpl orCreateCancellableContinuation = CancellableContinuationKt.getOrCreateCancellableContinuation(com.google.android.material.shape.e.g(dVar));
        try {
            int iUpdateCellSend = updateCellSend(channelSegment, i, e, j, orCreateCancellableContinuation, false);
            y yVar = y.a;
            if (iUpdateCellSend != 0) {
                if (iUpdateCellSend != 1) {
                    if (iUpdateCellSend != 2) {
                        if (iUpdateCellSend != 4) {
                            String str = "unexpected";
                            if (iUpdateCellSend != 5) {
                                throw new IllegalStateException("unexpected");
                            }
                            channelSegment.cleanPrev();
                            ChannelSegment channelSegment2 = (ChannelSegment) sendSegment$volatile$FU.get(this);
                            while (true) {
                                long andIncrement = sendersAndCloseStatus$volatile$FU.getAndIncrement(this);
                                long j2 = 1152921504606846975L & andIncrement;
                                boolean zIsClosedForSend0 = isClosedForSend0(andIncrement);
                                int i2 = BufferedChannelKt.SEGMENT_SIZE;
                                long j3 = j2 / ((long) i2);
                                int i3 = (int) (j2 % ((long) i2));
                                str = str;
                                if (channelSegment2.id != j3) {
                                    channelSegmentFindSegmentSend = findSegmentSend(j3, channelSegment2);
                                    if (channelSegmentFindSegmentSend == null) {
                                        if (zIsClosedForSend0) {
                                        }
                                    }
                                } else {
                                    channelSegmentFindSegmentSend = channelSegment2;
                                }
                                int iUpdateCellSend2 = updateCellSend(channelSegmentFindSegmentSend, i3, e, j2, orCreateCancellableContinuation, zIsClosedForSend0);
                                if (iUpdateCellSend2 == 0) {
                                    channelSegmentFindSegmentSend.cleanPrev();
                                } else if (iUpdateCellSend2 != 1) {
                                    if (iUpdateCellSend2 == 2) {
                                        if (!zIsClosedForSend0) {
                                            CancellableContinuationImpl cancellableContinuationImpl = orCreateCancellableContinuation != null ? orCreateCancellableContinuation : null;
                                            if (cancellableContinuationImpl == null) {
                                                break;
                                            }
                                            prepareSenderForSuspension(cancellableContinuationImpl, channelSegmentFindSegmentSend, i3);
                                            break;
                                        }
                                        channelSegmentFindSegmentSend.onSlotCleaned();
                                    } else {
                                        if (iUpdateCellSend2 == 3) {
                                            throw new IllegalStateException(str);
                                        }
                                        if (iUpdateCellSend2 != 4) {
                                            if (iUpdateCellSend2 == 5) {
                                                channelSegmentFindSegmentSend.cleanPrev();
                                            }
                                            channelSegment2 = channelSegmentFindSegmentSend;
                                        } else if (j2 < getReceiversCounter$kotlinx_coroutines_core()) {
                                            channelSegmentFindSegmentSend.cleanPrev();
                                        }
                                    }
                                }
                            }
                        } else if (j < getReceiversCounter$kotlinx_coroutines_core()) {
                            channelSegment.cleanPrev();
                        }
                        onClosedSendOnNoWaiterSuspend(e, orCreateCancellableContinuation);
                        break;
                    } else {
                        prepareSenderForSuspension(orCreateCancellableContinuation, channelSegment, i);
                    }
                }
                result = orCreateCancellableContinuation.getResult();
                if (result == kotlin.coroutines.intrinsics.a.e) {
                    return result;
                }
                return yVar;
            }
            channelSegment.cleanPrev();
            orCreateCancellableContinuation.resumeWith(yVar);
            result = orCreateCancellableContinuation.getResult();
            if (result == kotlin.coroutines.intrinsics.a.e) {
                return result;
            }
            return yVar;
        } catch (Throwable th) {
            orCreateCancellableContinuation.releaseClaimedReusableContinuation$kotlinx_coroutines_core();
            throw th;
        }
    }

    private final /* synthetic */ void setBufferEnd$volatile(long j) {
        this.bufferEnd$volatile = j;
    }

    private final /* synthetic */ void setBufferEndSegment$volatile(Object obj) {
        this.bufferEndSegment$volatile = obj;
    }

    private final /* synthetic */ void setCloseHandler$volatile(Object obj) {
        this.closeHandler$volatile = obj;
    }

    private final /* synthetic */ void setCompletedExpandBuffersAndPauseFlag$volatile(long j) {
        this.completedExpandBuffersAndPauseFlag$volatile = j;
    }

    private final /* synthetic */ void setReceiveSegment$volatile(Object obj) {
        this.receiveSegment$volatile = obj;
    }

    private final /* synthetic */ void setReceivers$volatile(long j) {
        this.receivers$volatile = j;
    }

    private final /* synthetic */ void setSendSegment$volatile(Object obj) {
        this.sendSegment$volatile = obj;
    }

    private final /* synthetic */ void setSendersAndCloseStatus$volatile(long j) {
        this.sendersAndCloseStatus$volatile = j;
    }

    private final /* synthetic */ void set_closeCause$volatile(Object obj) {
        this._closeCause$volatile = obj;
    }

    private final boolean shouldSendSuspend(long j) {
        if (isClosedForSend0(j)) {
            return false;
        }
        return !bufferOrRendezvousSend(j & 1152921504606846975L);
    }

    private final boolean tryResumeReceiver(Object obj, E e) {
        if (obj instanceof SelectInstance) {
            return ((SelectInstance) obj).trySelect(this, e);
        }
        if (obj instanceof ReceiveCatching) {
            CancellableContinuationImpl<ChannelResult<? extends E>> cancellableContinuationImpl = ((ReceiveCatching) obj).cont;
            ChannelResult channelResultM42boximpl = ChannelResult.m42boximpl(ChannelResult.Companion.m57successJP2dKIU(e));
            l lVar = this.onUndeliveredElement;
            return BufferedChannelKt.tryResume0(cancellableContinuationImpl, channelResultM42boximpl, (q) (lVar != null ? bindCancellationFunResult(lVar) : null));
        }
        if (obj instanceof BufferedChannelIterator) {
            return ((BufferedChannelIterator) obj).tryResumeHasNext(e);
        }
        if (!(obj instanceof CancellableContinuation)) {
            com.google.gson.b.u(obj, "Unexpected receiver type: ");
            return false;
        }
        CancellableContinuation cancellableContinuation = (CancellableContinuation) obj;
        l lVar2 = this.onUndeliveredElement;
        return BufferedChannelKt.tryResume0(cancellableContinuation, e, (q) (lVar2 != null ? bindCancellationFun(lVar2) : null));
    }

    private final boolean tryResumeSender(Object obj, ChannelSegment<E> channelSegment, int i) {
        boolean z = obj instanceof CancellableContinuation;
        y yVar = y.a;
        if (z) {
            return BufferedChannelKt.tryResume0$default((CancellableContinuation) obj, yVar, null, 2, null);
        }
        if (obj instanceof SelectInstance) {
            TrySelectDetailedResult trySelectDetailedResultTrySelectDetailed = ((SelectImplementation) obj).trySelectDetailed(this, yVar);
            if (trySelectDetailedResultTrySelectDetailed == TrySelectDetailedResult.REREGISTER) {
                channelSegment.cleanElement$kotlinx_coroutines_core(i);
            }
            return trySelectDetailedResultTrySelectDetailed == TrySelectDetailedResult.SUCCESSFUL;
        }
        if (obj instanceof SendBroadcast) {
            return BufferedChannelKt.tryResume0$default(((SendBroadcast) obj).getCont(), Boolean.TRUE, null, 2, null);
        }
        com.google.gson.b.u(obj, "Unexpected waiter: ");
        return false;
    }

    private final /* synthetic */ void update$atomicfu$ATOMIC_FIELD_UPDATER$Long(AtomicLongFieldUpdater atomicLongFieldUpdater, Object obj, l lVar) {
        while (true) {
            long j = atomicLongFieldUpdater.get(obj);
            AtomicLongFieldUpdater atomicLongFieldUpdater2 = atomicLongFieldUpdater;
            Object obj2 = obj;
            if (atomicLongFieldUpdater2.compareAndSet(obj2, j, ((Number) lVar.invoke(Long.valueOf(j))).longValue())) {
                return;
            }
            atomicLongFieldUpdater = atomicLongFieldUpdater2;
            obj = obj2;
        }
    }

    private final boolean updateCellExpandBuffer(ChannelSegment<E> channelSegment, int i, long j) {
        Object state$kotlinx_coroutines_core = channelSegment.getState$kotlinx_coroutines_core(i);
        if (!(state$kotlinx_coroutines_core instanceof Waiter) || j < receivers$volatile$FU.get(this) || !channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, BufferedChannelKt.RESUMING_BY_EB)) {
            return updateCellExpandBufferSlow(channelSegment, i, j);
        }
        if (tryResumeSender(state$kotlinx_coroutines_core, channelSegment, i)) {
            channelSegment.setState$kotlinx_coroutines_core(i, BufferedChannelKt.BUFFERED);
            return true;
        }
        channelSegment.setState$kotlinx_coroutines_core(i, BufferedChannelKt.INTERRUPTED_SEND);
        channelSegment.onCancelledRequest(i, false);
        return false;
    }

    private final boolean updateCellExpandBufferSlow(ChannelSegment<E> channelSegment, int i, long j) {
        while (true) {
            Object state$kotlinx_coroutines_core = channelSegment.getState$kotlinx_coroutines_core(i);
            if (state$kotlinx_coroutines_core instanceof Waiter) {
                if (j < receivers$volatile$FU.get(this)) {
                    if (channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, new WaiterEB((Waiter) state$kotlinx_coroutines_core))) {
                        return true;
                    }
                } else if (channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, BufferedChannelKt.RESUMING_BY_EB)) {
                    if (tryResumeSender(state$kotlinx_coroutines_core, channelSegment, i)) {
                        channelSegment.setState$kotlinx_coroutines_core(i, BufferedChannelKt.BUFFERED);
                        return true;
                    }
                    channelSegment.setState$kotlinx_coroutines_core(i, BufferedChannelKt.INTERRUPTED_SEND);
                    channelSegment.onCancelledRequest(i, false);
                    return false;
                }
            } else {
                if (state$kotlinx_coroutines_core == BufferedChannelKt.INTERRUPTED_SEND) {
                    return false;
                }
                if (state$kotlinx_coroutines_core == null) {
                    if (channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, BufferedChannelKt.IN_BUFFER)) {
                        return true;
                    }
                } else {
                    if (state$kotlinx_coroutines_core == BufferedChannelKt.BUFFERED || state$kotlinx_coroutines_core == BufferedChannelKt.POISONED || state$kotlinx_coroutines_core == BufferedChannelKt.DONE_RCV || state$kotlinx_coroutines_core == BufferedChannelKt.INTERRUPTED_RCV || state$kotlinx_coroutines_core == BufferedChannelKt.getCHANNEL_CLOSED()) {
                        return true;
                    }
                    if (state$kotlinx_coroutines_core != BufferedChannelKt.RESUMING_BY_RCV) {
                        com.google.gson.b.u(state$kotlinx_coroutines_core, "Unexpected cell state: ");
                        return false;
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object updateCellReceive(ChannelSegment<E> channelSegment, int i, long j, Object obj) {
        Object state$kotlinx_coroutines_core = channelSegment.getState$kotlinx_coroutines_core(i);
        if (state$kotlinx_coroutines_core == null) {
            if (j >= (sendersAndCloseStatus$volatile$FU.get(this) & 1152921504606846975L)) {
                if (obj == null) {
                    return BufferedChannelKt.SUSPEND_NO_WAITER;
                }
                if (channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, obj)) {
                    expandBuffer();
                    return BufferedChannelKt.SUSPEND;
                }
            }
        } else if (state$kotlinx_coroutines_core == BufferedChannelKt.BUFFERED && channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, BufferedChannelKt.DONE_RCV)) {
            expandBuffer();
            return channelSegment.retrieveElement$kotlinx_coroutines_core(i);
        }
        return updateCellReceiveSlow(channelSegment, i, j, obj);
    }

    private final Object updateCellReceiveSlow(ChannelSegment<E> channelSegment, int i, long j, Object obj) {
        while (true) {
            Object state$kotlinx_coroutines_core = channelSegment.getState$kotlinx_coroutines_core(i);
            if (state$kotlinx_coroutines_core == null || state$kotlinx_coroutines_core == BufferedChannelKt.IN_BUFFER) {
                if (j < (sendersAndCloseStatus$volatile$FU.get(this) & 1152921504606846975L)) {
                    if (channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, BufferedChannelKt.POISONED)) {
                        expandBuffer();
                        return BufferedChannelKt.FAILED;
                    }
                } else {
                    if (obj == null) {
                        return BufferedChannelKt.SUSPEND_NO_WAITER;
                    }
                    if (channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, obj)) {
                        expandBuffer();
                        return BufferedChannelKt.SUSPEND;
                    }
                }
            } else {
                if (state$kotlinx_coroutines_core != BufferedChannelKt.BUFFERED) {
                    if (state$kotlinx_coroutines_core != BufferedChannelKt.INTERRUPTED_SEND && state$kotlinx_coroutines_core != BufferedChannelKt.POISONED) {
                        if (state$kotlinx_coroutines_core == BufferedChannelKt.getCHANNEL_CLOSED()) {
                            expandBuffer();
                            return BufferedChannelKt.FAILED;
                        }
                        if (state$kotlinx_coroutines_core != BufferedChannelKt.RESUMING_BY_EB && channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, BufferedChannelKt.RESUMING_BY_RCV)) {
                            boolean z = state$kotlinx_coroutines_core instanceof WaiterEB;
                            if (z) {
                                state$kotlinx_coroutines_core = ((WaiterEB) state$kotlinx_coroutines_core).waiter;
                            }
                            if (tryResumeSender(state$kotlinx_coroutines_core, channelSegment, i)) {
                                channelSegment.setState$kotlinx_coroutines_core(i, BufferedChannelKt.DONE_RCV);
                                expandBuffer();
                                return channelSegment.retrieveElement$kotlinx_coroutines_core(i);
                            }
                            channelSegment.setState$kotlinx_coroutines_core(i, BufferedChannelKt.INTERRUPTED_SEND);
                            channelSegment.onCancelledRequest(i, false);
                            if (z) {
                                expandBuffer();
                            }
                            return BufferedChannelKt.FAILED;
                        }
                    }
                    return BufferedChannelKt.FAILED;
                }
                if (channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, BufferedChannelKt.DONE_RCV)) {
                    expandBuffer();
                    return channelSegment.retrieveElement$kotlinx_coroutines_core(i);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int updateCellSend(ChannelSegment<E> channelSegment, int i, E e, long j, Object obj, boolean z) {
        channelSegment.storeElement$kotlinx_coroutines_core(i, e);
        if (z) {
            return updateCellSendSlow(channelSegment, i, e, j, obj, z);
        }
        Object state$kotlinx_coroutines_core = channelSegment.getState$kotlinx_coroutines_core(i);
        if (state$kotlinx_coroutines_core == null) {
            if (bufferOrRendezvousSend(j)) {
                if (channelSegment.casState$kotlinx_coroutines_core(i, null, BufferedChannelKt.BUFFERED)) {
                    return 1;
                }
            } else {
                if (obj == null) {
                    return 3;
                }
                if (channelSegment.casState$kotlinx_coroutines_core(i, null, obj)) {
                    return 2;
                }
            }
        } else if (state$kotlinx_coroutines_core instanceof Waiter) {
            channelSegment.cleanElement$kotlinx_coroutines_core(i);
            if (tryResumeReceiver(state$kotlinx_coroutines_core, e)) {
                channelSegment.setState$kotlinx_coroutines_core(i, BufferedChannelKt.DONE_RCV);
                onReceiveDequeued();
                return 0;
            }
            if (channelSegment.getAndSetState$kotlinx_coroutines_core(i, BufferedChannelKt.INTERRUPTED_RCV) == BufferedChannelKt.INTERRUPTED_RCV) {
                return 5;
            }
            channelSegment.onCancelledRequest(i, true);
            return 5;
        }
        return updateCellSendSlow(channelSegment, i, e, j, obj, z);
    }

    private final int updateCellSendSlow(ChannelSegment<E> channelSegment, int i, E e, long j, Object obj, boolean z) {
        while (true) {
            Object state$kotlinx_coroutines_core = channelSegment.getState$kotlinx_coroutines_core(i);
            if (state$kotlinx_coroutines_core == null) {
                if (!bufferOrRendezvousSend(j) || z) {
                    if (z) {
                        if (channelSegment.casState$kotlinx_coroutines_core(i, null, BufferedChannelKt.INTERRUPTED_SEND)) {
                            channelSegment.onCancelledRequest(i, false);
                            return 4;
                        }
                    } else {
                        if (obj == null) {
                            return 3;
                        }
                        if (channelSegment.casState$kotlinx_coroutines_core(i, null, obj)) {
                            return 2;
                        }
                    }
                } else if (channelSegment.casState$kotlinx_coroutines_core(i, null, BufferedChannelKt.BUFFERED)) {
                    return 1;
                }
            } else {
                if (state$kotlinx_coroutines_core != BufferedChannelKt.IN_BUFFER) {
                    if (state$kotlinx_coroutines_core == BufferedChannelKt.INTERRUPTED_RCV) {
                        channelSegment.cleanElement$kotlinx_coroutines_core(i);
                        return 5;
                    }
                    if (state$kotlinx_coroutines_core == BufferedChannelKt.POISONED) {
                        channelSegment.cleanElement$kotlinx_coroutines_core(i);
                        return 5;
                    }
                    if (state$kotlinx_coroutines_core == BufferedChannelKt.getCHANNEL_CLOSED()) {
                        channelSegment.cleanElement$kotlinx_coroutines_core(i);
                        completeCloseOrCancel();
                        return 4;
                    }
                    channelSegment.cleanElement$kotlinx_coroutines_core(i);
                    if (state$kotlinx_coroutines_core instanceof WaiterEB) {
                        state$kotlinx_coroutines_core = ((WaiterEB) state$kotlinx_coroutines_core).waiter;
                    }
                    if (tryResumeReceiver(state$kotlinx_coroutines_core, e)) {
                        channelSegment.setState$kotlinx_coroutines_core(i, BufferedChannelKt.DONE_RCV);
                        onReceiveDequeued();
                        return 0;
                    }
                    if (channelSegment.getAndSetState$kotlinx_coroutines_core(i, BufferedChannelKt.INTERRUPTED_RCV) != BufferedChannelKt.INTERRUPTED_RCV) {
                        channelSegment.onCancelledRequest(i, true);
                    }
                    return 5;
                }
                if (channelSegment.casState$kotlinx_coroutines_core(i, state$kotlinx_coroutines_core, BufferedChannelKt.BUFFERED)) {
                    return 1;
                }
            }
        }
    }

    private final void updateReceiversCounterIfLower(long j) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = receivers$volatile$FU;
        while (true) {
            long j2 = atomicLongFieldUpdater.get(this);
            if (j2 >= j) {
                return;
            }
            long j3 = j;
            if (receivers$volatile$FU.compareAndSet(this, j2, j3)) {
                return;
            } else {
                j = j3;
            }
        }
    }

    private final void updateSendersCounterIfLower(long j) {
        long j2;
        long j3;
        AtomicLongFieldUpdater atomicLongFieldUpdater = sendersAndCloseStatus$volatile$FU;
        do {
            j2 = atomicLongFieldUpdater.get(this);
            j3 = 1152921504606846975L & j2;
            if (j3 >= j) {
                return;
            }
        } while (!sendersAndCloseStatus$volatile$FU.compareAndSet(this, j2, BufferedChannelKt.constructSendersAndCloseStatus(j3, (int) (j2 >> 60))));
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final boolean cancel(Throwable th) {
        return cancelImpl$kotlinx_coroutines_core(th);
    }

    public boolean cancelImpl$kotlinx_coroutines_core(Throwable th) {
        if (th == null) {
            th = new CancellationException("Channel was cancelled");
        }
        return closeOrCancelImpl(th, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void checkSegmentStructureInvariants() {
        if (isRendezvousOrUnlimited()) {
            if (bufferEndSegment$volatile$FU.get(this) != BufferedChannelKt.NULL_SEGMENT) {
                net.luminis.tls.engine.impl.c.e(this, "bufferEndSegment must be NULL_SEGMENT for rendezvous and unlimited channels; they do not manipulate it.\nChannel state: ");
                return;
            }
        } else if (((ChannelSegment) receiveSegment$volatile$FU.get(this)).id > ((ChannelSegment) bufferEndSegment$volatile$FU.get(this)).id) {
            net.luminis.tls.engine.impl.c.e(this, "bufferEndSegment should not have lower id than receiveSegment.\nChannel state: ");
            return;
        }
        List listQ = com.google.common.base.c.q(receiveSegment$volatile$FU.get(this), sendSegment$volatile$FU.get(this), bufferEndSegment$volatile$FU.get(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listQ) {
            if (((ChannelSegment) obj) != BufferedChannelKt.NULL_SEGMENT) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            org.mozilla.javascript.typedarrays.c.a();
            return;
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j = ((ChannelSegment) next).id;
            do {
                Object next2 = it.next();
                long j2 = ((ChannelSegment) next2).id;
                if (j > j2) {
                    next = next2;
                    j = j2;
                }
            } while (it.hasNext());
        }
        ChannelSegment channelSegment = (ChannelSegment) next;
        if (channelSegment.getPrev() != 0) {
            net.luminis.tls.engine.impl.c.e(this, "All processed segments should be unreachable from the data structure, but the `prev` link of the leftmost segment is non-null.\nChannel state: ");
            return;
        }
        while (channelSegment.getNext() != 0) {
            S next3 = channelSegment.getNext();
            next3.getClass();
            if (((ChannelSegment) next3).getPrev() != 0) {
                S next4 = channelSegment.getNext();
                next4.getClass();
                if (((ChannelSegment) next4).getPrev() != channelSegment) {
                    net.luminis.tls.engine.impl.c.e(this, "The `segment.next.prev === segment` invariant is violated.\nChannel state: ");
                    return;
                }
            }
            int i = BufferedChannelKt.SEGMENT_SIZE;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object state$kotlinx_coroutines_core = channelSegment.getState$kotlinx_coroutines_core(i3);
                if (!kotlin.jvm.internal.l.a(state$kotlinx_coroutines_core, BufferedChannelKt.BUFFERED) && !(state$kotlinx_coroutines_core instanceof Waiter)) {
                    if (kotlin.jvm.internal.l.a(state$kotlinx_coroutines_core, BufferedChannelKt.INTERRUPTED_RCV) || kotlin.jvm.internal.l.a(state$kotlinx_coroutines_core, BufferedChannelKt.INTERRUPTED_SEND) || kotlin.jvm.internal.l.a(state$kotlinx_coroutines_core, BufferedChannelKt.getCHANNEL_CLOSED())) {
                        if (channelSegment.getElement$kotlinx_coroutines_core(i3) != null) {
                            net.luminis.tls.engine.impl.c.r("Check failed.");
                            return;
                        }
                        i2++;
                    } else {
                        if (!kotlin.jvm.internal.l.a(state$kotlinx_coroutines_core, BufferedChannelKt.POISONED) && !kotlin.jvm.internal.l.a(state$kotlinx_coroutines_core, BufferedChannelKt.DONE_RCV)) {
                            throw new IllegalStateException(("Unexpected segment cell state: " + state$kotlinx_coroutines_core + ".\nChannel state: " + this).toString());
                        }
                        if (channelSegment.getElement$kotlinx_coroutines_core(i3) != null) {
                            net.luminis.tls.engine.impl.c.r("Check failed.");
                            return;
                        }
                    }
                }
            }
            if (i2 == BufferedChannelKt.SEGMENT_SIZE && channelSegment != receiveSegment$volatile$FU.get(this) && channelSegment != sendSegment$volatile$FU.get(this) && channelSegment != bufferEndSegment$volatile$FU.get(this)) {
                net.luminis.tls.engine.impl.c.e(this, "Logically removed segment is reachable.\nChannel state: ");
                return;
            } else {
                S next5 = channelSegment.getNext();
                next5.getClass();
                channelSegment = (ChannelSegment) next5;
            }
        }
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean close(Throwable th) {
        return closeOrCancelImpl(th, false);
    }

    public boolean closeOrCancelImpl(Throwable th, boolean z) {
        boolean z2;
        if (z) {
            markCancellationStarted();
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _closeCause$volatile$FU;
        Symbol symbol = BufferedChannelKt.NO_CLOSE_CAUSE;
        while (true) {
            if (atomicReferenceFieldUpdater.compareAndSet(this, symbol, th)) {
                z2 = true;
                break;
            }
            if (atomicReferenceFieldUpdater.get(this) != symbol) {
                z2 = false;
                break;
            }
        }
        if (z) {
            markCancelled();
        } else {
            markClosed();
        }
        completeCloseOrCancel();
        onClosedIdempotent();
        if (z2) {
            invokeCloseHandler();
        }
        return z2;
    }

    public final void dropFirstElementUntilTheSpecifiedCellIsInTheBuffer(long j) {
        ChannelSegment<E> channelSegmentFindSegmentReceive;
        UndeliveredElementException undeliveredElementExceptionCallUndeliveredElementCatchingException$default;
        ChannelSegment<E> channelSegment = (ChannelSegment) receiveSegment$volatile$FU.get(this);
        while (true) {
            long j2 = receivers$volatile$FU.get(this);
            if (j < Math.max(((long) this.capacity) + j2, getBufferEndCounter())) {
                return;
            }
            if (receivers$volatile$FU.compareAndSet(this, j2, 1 + j2)) {
                int i = BufferedChannelKt.SEGMENT_SIZE;
                long j3 = j2 / ((long) i);
                int i2 = (int) (j2 % ((long) i));
                if (channelSegment.id != j3) {
                    channelSegmentFindSegmentReceive = findSegmentReceive(j3, channelSegment);
                    if (channelSegmentFindSegmentReceive == null) {
                        continue;
                    }
                } else {
                    channelSegmentFindSegmentReceive = channelSegment;
                }
                Object objUpdateCellReceive = updateCellReceive(channelSegmentFindSegmentReceive, i2, j2, null);
                if (objUpdateCellReceive != BufferedChannelKt.FAILED) {
                    channelSegmentFindSegmentReceive.cleanPrev();
                    l lVar = this.onUndeliveredElement;
                    if (lVar != null && (undeliveredElementExceptionCallUndeliveredElementCatchingException$default = OnUndeliveredElementKt.callUndeliveredElementCatchingException$default(lVar, objUpdateCellReceive, null, 2, null)) != null) {
                        throw undeliveredElementExceptionCallUndeliveredElementCatchingException$default;
                    }
                } else if (j2 < getSendersCounter$kotlinx_coroutines_core()) {
                    channelSegmentFindSegmentReceive.cleanPrev();
                }
                channelSegment = channelSegmentFindSegmentReceive;
            }
        }
    }

    public final Throwable getCloseCause() {
        return (Throwable) _closeCause$volatile$FU.get(this);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public SelectClause1<E> getOnReceive() {
        BufferedChannel$onReceive$1 bufferedChannel$onReceive$1 = BufferedChannel$onReceive$1.INSTANCE;
        bufferedChannel$onReceive$1.getClass();
        c0.c(3, bufferedChannel$onReceive$1);
        BufferedChannel$onReceive$2 bufferedChannel$onReceive$2 = BufferedChannel$onReceive$2.INSTANCE;
        bufferedChannel$onReceive$2.getClass();
        c0.c(3, bufferedChannel$onReceive$2);
        return new SelectClause1Impl(this, bufferedChannel$onReceive$1, bufferedChannel$onReceive$2, this.onUndeliveredElementReceiveCancellationConstructor);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public SelectClause1<ChannelResult<E>> getOnReceiveCatching() {
        BufferedChannel$onReceiveCatching$1 bufferedChannel$onReceiveCatching$1 = BufferedChannel$onReceiveCatching$1.INSTANCE;
        bufferedChannel$onReceiveCatching$1.getClass();
        c0.c(3, bufferedChannel$onReceiveCatching$1);
        BufferedChannel$onReceiveCatching$2 bufferedChannel$onReceiveCatching$2 = BufferedChannel$onReceiveCatching$2.INSTANCE;
        bufferedChannel$onReceiveCatching$2.getClass();
        c0.c(3, bufferedChannel$onReceiveCatching$2);
        return new SelectClause1Impl(this, bufferedChannel$onReceiveCatching$1, bufferedChannel$onReceiveCatching$2, this.onUndeliveredElementReceiveCancellationConstructor);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public SelectClause1<E> getOnReceiveOrNull() {
        BufferedChannel$onReceiveOrNull$1 bufferedChannel$onReceiveOrNull$1 = BufferedChannel$onReceiveOrNull$1.INSTANCE;
        bufferedChannel$onReceiveOrNull$1.getClass();
        c0.c(3, bufferedChannel$onReceiveOrNull$1);
        BufferedChannel$onReceiveOrNull$2 bufferedChannel$onReceiveOrNull$2 = BufferedChannel$onReceiveOrNull$2.INSTANCE;
        bufferedChannel$onReceiveOrNull$2.getClass();
        c0.c(3, bufferedChannel$onReceiveOrNull$2);
        return new SelectClause1Impl(this, bufferedChannel$onReceiveOrNull$1, bufferedChannel$onReceiveOrNull$2, this.onUndeliveredElementReceiveCancellationConstructor);
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public SelectClause2<E, BufferedChannel<E>> getOnSend() {
        BufferedChannel$onSend$1 bufferedChannel$onSend$1 = BufferedChannel$onSend$1.INSTANCE;
        bufferedChannel$onSend$1.getClass();
        c0.c(3, bufferedChannel$onSend$1);
        BufferedChannel$onSend$2 bufferedChannel$onSend$2 = BufferedChannel$onSend$2.INSTANCE;
        bufferedChannel$onSend$2.getClass();
        c0.c(3, bufferedChannel$onSend$2);
        return new SelectClause2Impl(this, bufferedChannel$onSend$1, bufferedChannel$onSend$2, null, 8, null);
    }

    public final long getReceiversCounter$kotlinx_coroutines_core() {
        return receivers$volatile$FU.get(this);
    }

    public final Throwable getSendException() {
        Throwable closeCause = getCloseCause();
        return closeCause == null ? new ClosedSendChannelException(ChannelsKt.DEFAULT_CLOSE_MESSAGE) : closeCause;
    }

    public final long getSendersCounter$kotlinx_coroutines_core() {
        return sendersAndCloseStatus$volatile$FU.get(this) & 1152921504606846975L;
    }

    public final boolean hasElements$kotlinx_coroutines_core() {
        while (true) {
            ChannelSegment<E> channelSegmentFindSegmentReceive = (ChannelSegment) receiveSegment$volatile$FU.get(this);
            long receiversCounter$kotlinx_coroutines_core = getReceiversCounter$kotlinx_coroutines_core();
            if (getSendersCounter$kotlinx_coroutines_core() <= receiversCounter$kotlinx_coroutines_core) {
                return false;
            }
            int i = BufferedChannelKt.SEGMENT_SIZE;
            long j = receiversCounter$kotlinx_coroutines_core / ((long) i);
            if (channelSegmentFindSegmentReceive.id == j || (channelSegmentFindSegmentReceive = findSegmentReceive(j, channelSegmentFindSegmentReceive)) != null) {
                channelSegmentFindSegmentReceive.cleanPrev();
                if (isCellNonEmpty(channelSegmentFindSegmentReceive, (int) (receiversCounter$kotlinx_coroutines_core % ((long) i)), receiversCounter$kotlinx_coroutines_core)) {
                    return true;
                }
                receivers$volatile$FU.compareAndSet(this, receiversCounter$kotlinx_coroutines_core, 1 + receiversCounter$kotlinx_coroutines_core);
            } else if (((ChannelSegment) receiveSegment$volatile$FU.get(this)).id < j) {
                return false;
            }
        }
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public void invokeOnClose(l lVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = closeHandler$volatile$FU;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, null, lVar)) {
            if (atomicReferenceFieldUpdater.get(this) != null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = closeHandler$volatile$FU;
                while (true) {
                    Object obj = atomicReferenceFieldUpdater2.get(this);
                    if (obj != BufferedChannelKt.CLOSE_HANDLER_CLOSED) {
                        if (obj == BufferedChannelKt.CLOSE_HANDLER_INVOKED) {
                            net.luminis.tls.engine.impl.c.r("Another handler was already registered and successfully invoked");
                            return;
                        } else {
                            com.google.gson.b.u(obj, "Another handler is already registered: ");
                            return;
                        }
                    }
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3 = closeHandler$volatile$FU;
                    Symbol symbol = BufferedChannelKt.CLOSE_HANDLER_CLOSED;
                    Symbol symbol2 = BufferedChannelKt.CLOSE_HANDLER_INVOKED;
                    do {
                        if (atomicReferenceFieldUpdater3.compareAndSet(this, symbol, symbol2)) {
                            lVar.invoke(getCloseCause());
                            return;
                        }
                    } while (atomicReferenceFieldUpdater3.get(this) == symbol);
                }
            }
        }
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public boolean isClosedForReceive() {
        return isClosedForReceive0(sendersAndCloseStatus$volatile$FU.get(this));
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public boolean isClosedForSend() {
        return isClosedForSend0(sendersAndCloseStatus$volatile$FU.get(this));
    }

    public boolean isConflatedDropOldest() {
        return false;
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public boolean isEmpty() {
        if (isClosedForReceive() || hasElements$kotlinx_coroutines_core()) {
            return false;
        }
        return !isClosedForReceive();
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public ChannelIterator<E> iterator() {
        return new BufferedChannelIterator();
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    @kotlin.c
    public boolean offer(E e) {
        return Channel.DefaultImpls.offer(this, e);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @kotlin.c
    public E poll() {
        return (E) Channel.DefaultImpls.poll(this);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public Object receive(kotlin.coroutines.d<? super E> dVar) {
        return receive$suspendImpl(this, dVar);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    /* JADX INFO: renamed from: receiveCatching-JP2dKIU, reason: not valid java name */
    public Object mo34receiveCatchingJP2dKIU(kotlin.coroutines.d<? super ChannelResult<? extends E>> dVar) {
        return m32receiveCatchingJP2dKIU$suspendImpl(this, dVar);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    @kotlin.c
    public Object receiveOrNull(kotlin.coroutines.d<? super E> dVar) {
        return Channel.DefaultImpls.receiveOrNull(this, dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void registerSelectForSend(SelectInstance<?> selectInstance, Object obj) {
        ChannelSegment channelSegment;
        ChannelSegment channelSegment2 = (ChannelSegment) sendSegment$volatile$FU.get(this);
        while (true) {
            long andIncrement = sendersAndCloseStatus$volatile$FU.getAndIncrement(this);
            long j = andIncrement & 1152921504606846975L;
            boolean zIsClosedForSend0 = isClosedForSend0(andIncrement);
            int i = BufferedChannelKt.SEGMENT_SIZE;
            long j2 = j / ((long) i);
            int i2 = (int) (j % ((long) i));
            if (channelSegment2.id != j2) {
                ChannelSegment channelSegmentFindSegmentSend = findSegmentSend(j2, channelSegment2);
                if (channelSegmentFindSegmentSend != null) {
                    channelSegment = channelSegmentFindSegmentSend;
                } else if (zIsClosedForSend0) {
                    onClosedSelectOnSend(obj, selectInstance);
                    return;
                }
            } else {
                channelSegment = channelSegment2;
            }
            SelectInstance<?> selectInstance2 = selectInstance;
            Object obj2 = obj;
            int iUpdateCellSend = updateCellSend(channelSegment, i2, obj2, j, selectInstance2, zIsClosedForSend0);
            channelSegment2 = channelSegment;
            y yVar = y.a;
            if (iUpdateCellSend == 0) {
                channelSegment2.cleanPrev();
                selectInstance2.selectInRegistrationPhase(yVar);
                return;
            }
            if (iUpdateCellSend == 1) {
                selectInstance2.selectInRegistrationPhase(yVar);
                return;
            }
            if (iUpdateCellSend == 2) {
                if (zIsClosedForSend0) {
                    channelSegment2.onSlotCleaned();
                    onClosedSelectOnSend(obj2, selectInstance2);
                    return;
                } else {
                    Waiter waiter = selectInstance2 instanceof Waiter ? (Waiter) selectInstance2 : null;
                    if (waiter != null) {
                        prepareSenderForSuspension(waiter, channelSegment2, i2);
                        return;
                    }
                    return;
                }
            }
            if (iUpdateCellSend == 3) {
                net.luminis.tls.engine.impl.c.r("unexpected");
                return;
            }
            if (iUpdateCellSend == 4) {
                if (j < getReceiversCounter$kotlinx_coroutines_core()) {
                    channelSegment2.cleanPrev();
                }
                onClosedSelectOnSend(obj2, selectInstance2);
                return;
            } else {
                if (iUpdateCellSend == 5) {
                    channelSegment2.cleanPrev();
                }
                obj = obj2;
                selectInstance = selectInstance2;
            }
        }
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    public Object send(E e, kotlin.coroutines.d<? super y> dVar) {
        return send$suspendImpl(this, e, dVar);
    }

    public Object sendBroadcast$kotlinx_coroutines_core(E e, kotlin.coroutines.d<? super Boolean> dVar) {
        return sendBroadcast$suspendImpl(this, e, dVar);
    }

    public boolean shouldSendSuspend$kotlinx_coroutines_core() {
        return shouldSendSuspend(sendersAndCloseStatus$volatile$FU.get(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String toString() {
        String string;
        StringBuilder sb = new StringBuilder();
        int i = (int) (sendersAndCloseStatus$volatile$FU.get(this) >> 60);
        if (i == 2) {
            sb.append("closed,");
        } else if (i == 3) {
            sb.append("cancelled,");
        }
        sb.append("capacity=" + this.capacity + ',');
        sb.append("data=[");
        int i2 = 0;
        boolean z = true;
        List listQ = com.google.common.base.c.q(receiveSegment$volatile$FU.get(this), sendSegment$volatile$FU.get(this), bufferEndSegment$volatile$FU.get(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listQ) {
            if (((ChannelSegment) obj) != BufferedChannelKt.NULL_SEGMENT) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            org.mozilla.javascript.typedarrays.c.a();
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j = ((ChannelSegment) next).id;
            do {
                Object next2 = it.next();
                long j2 = ((ChannelSegment) next2).id;
                if (j > j2) {
                    next = next2;
                    j = j2;
                }
            } while (it.hasNext());
        }
        ChannelSegment channelSegment = (ChannelSegment) next;
        long receiversCounter$kotlinx_coroutines_core = getReceiversCounter$kotlinx_coroutines_core();
        long sendersCounter$kotlinx_coroutines_core = getSendersCounter$kotlinx_coroutines_core();
        loop2: while (true) {
            int i3 = BufferedChannelKt.SEGMENT_SIZE;
            int i4 = i2;
            while (i4 < i3) {
                long j3 = (channelSegment.id * ((long) BufferedChannelKt.SEGMENT_SIZE)) + ((long) i4);
                if (j3 >= sendersCounter$kotlinx_coroutines_core && j3 >= receiversCounter$kotlinx_coroutines_core) {
                    break loop2;
                }
                Object state$kotlinx_coroutines_core = channelSegment.getState$kotlinx_coroutines_core(i4);
                Object element$kotlinx_coroutines_core = channelSegment.getElement$kotlinx_coroutines_core(i4);
                boolean z2 = z;
                if (state$kotlinx_coroutines_core instanceof CancellableContinuation) {
                    string = (j3 >= receiversCounter$kotlinx_coroutines_core || j3 < sendersCounter$kotlinx_coroutines_core) ? (j3 >= sendersCounter$kotlinx_coroutines_core || j3 < receiversCounter$kotlinx_coroutines_core) ? "cont" : "send" : "receive";
                } else if (state$kotlinx_coroutines_core instanceof SelectInstance) {
                    string = (j3 >= receiversCounter$kotlinx_coroutines_core || j3 < sendersCounter$kotlinx_coroutines_core) ? (j3 >= sendersCounter$kotlinx_coroutines_core || j3 < receiversCounter$kotlinx_coroutines_core) ? "select" : "onSend" : "onReceive";
                } else if (state$kotlinx_coroutines_core instanceof ReceiveCatching) {
                    string = "receiveCatching";
                } else if (state$kotlinx_coroutines_core instanceof SendBroadcast) {
                    string = "sendBroadcast";
                } else if (state$kotlinx_coroutines_core instanceof WaiterEB) {
                    string = "EB(" + state$kotlinx_coroutines_core + ')';
                } else if (kotlin.jvm.internal.l.a(state$kotlinx_coroutines_core, BufferedChannelKt.RESUMING_BY_RCV) || kotlin.jvm.internal.l.a(state$kotlinx_coroutines_core, BufferedChannelKt.RESUMING_BY_EB)) {
                    string = "resuming_sender";
                } else {
                    if (state$kotlinx_coroutines_core != null && !state$kotlinx_coroutines_core.equals(BufferedChannelKt.IN_BUFFER) && !state$kotlinx_coroutines_core.equals(BufferedChannelKt.DONE_RCV) && !state$kotlinx_coroutines_core.equals(BufferedChannelKt.POISONED) && !state$kotlinx_coroutines_core.equals(BufferedChannelKt.INTERRUPTED_RCV) && !state$kotlinx_coroutines_core.equals(BufferedChannelKt.INTERRUPTED_SEND) && !state$kotlinx_coroutines_core.equals(BufferedChannelKt.getCHANNEL_CLOSED())) {
                        string = state$kotlinx_coroutines_core.toString();
                    }
                    i4++;
                    z = z2;
                }
                if (element$kotlinx_coroutines_core != null) {
                    sb.append("(" + string + ',' + element$kotlinx_coroutines_core + "),");
                } else {
                    sb.append(string + ',');
                }
                i4++;
                z = z2;
            }
            boolean z3 = z;
            channelSegment = (ChannelSegment) channelSegment.getNext();
            if (channelSegment == null) {
                break;
            }
            z = z3;
            i2 = 0;
        }
        if (sb.length() == 0) {
            k.m("Char sequence is empty.");
            return null;
        }
        if (sb.charAt(sb.length() - 1) == ',') {
            sb.deleteCharAt(sb.length() - 1).getClass();
        }
        sb.append("]");
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String toStringDebug$kotlinx_coroutines_core() {
        String strValueOf;
        StringBuilder sb = new StringBuilder();
        sb.append("S=" + getSendersCounter$kotlinx_coroutines_core() + ",R=" + getReceiversCounter$kotlinx_coroutines_core() + ",B=" + getBufferEndCounter() + ",B'=" + completedExpandBuffersAndPauseFlag$volatile$FU.get(this) + ",C=" + ((int) (sendersAndCloseStatus$volatile$FU.get(this) >> 60)) + ',');
        int i = (int) (sendersAndCloseStatus$volatile$FU.get(this) >> 60);
        if (i == 1) {
            sb.append("CANCELLATION_STARTED,");
        } else if (i == 2) {
            sb.append("CLOSED,");
        } else if (i == 3) {
            sb.append("CANCELLED,");
        }
        sb.append("SEND_SEGM=" + DebugStringsKt.getHexAddress(sendSegment$volatile$FU.get(this)) + ",RCV_SEGM=" + DebugStringsKt.getHexAddress(receiveSegment$volatile$FU.get(this)));
        if (!isRendezvousOrUnlimited()) {
            sb.append(",EB_SEGM=" + DebugStringsKt.getHexAddress(bufferEndSegment$volatile$FU.get(this)));
        }
        sb.append("  ");
        List listQ = com.google.common.base.c.q(receiveSegment$volatile$FU.get(this), sendSegment$volatile$FU.get(this), bufferEndSegment$volatile$FU.get(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listQ) {
            if (((ChannelSegment) obj) != BufferedChannelKt.NULL_SEGMENT) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            org.mozilla.javascript.typedarrays.c.a();
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j = ((ChannelSegment) next).id;
            do {
                Object next2 = it.next();
                long j2 = ((ChannelSegment) next2).id;
                if (j > j2) {
                    next = next2;
                    j = j2;
                }
            } while (it.hasNext());
        }
        ChannelSegment channelSegment = (ChannelSegment) next;
        do {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(DebugStringsKt.getHexAddress(channelSegment));
            sb2.append("=[");
            sb2.append(channelSegment.isRemoved() ? "*" : "");
            sb2.append(channelSegment.id);
            sb2.append(",prev=");
            ChannelSegment channelSegment2 = (ChannelSegment) channelSegment.getPrev();
            sb2.append(channelSegment2 != null ? DebugStringsKt.getHexAddress(channelSegment2) : null);
            sb2.append(',');
            sb.append(sb2.toString());
            int i2 = BufferedChannelKt.SEGMENT_SIZE;
            for (int i3 = 0; i3 < i2; i3++) {
                Object state$kotlinx_coroutines_core = channelSegment.getState$kotlinx_coroutines_core(i3);
                Object element$kotlinx_coroutines_core = channelSegment.getElement$kotlinx_coroutines_core(i3);
                if (state$kotlinx_coroutines_core instanceof CancellableContinuation) {
                    strValueOf = "cont";
                } else if (state$kotlinx_coroutines_core instanceof SelectInstance) {
                    strValueOf = "select";
                } else if (state$kotlinx_coroutines_core instanceof ReceiveCatching) {
                    strValueOf = "receiveCatching";
                } else if (state$kotlinx_coroutines_core instanceof SendBroadcast) {
                    strValueOf = "send(broadcast)";
                } else if (state$kotlinx_coroutines_core instanceof WaiterEB) {
                    strValueOf = "EB(" + state$kotlinx_coroutines_core + ')';
                } else {
                    strValueOf = String.valueOf(state$kotlinx_coroutines_core);
                }
                sb.append("[" + i3 + "]=(" + strValueOf + ',' + element$kotlinx_coroutines_core + "),");
            }
            StringBuilder sb3 = new StringBuilder("next=");
            ChannelSegment channelSegment3 = (ChannelSegment) channelSegment.getNext();
            sb3.append(channelSegment3 != null ? DebugStringsKt.getHexAddress(channelSegment3) : null);
            sb3.append("]  ");
            sb.append(sb3.toString());
            channelSegment = (ChannelSegment) channelSegment.getNext();
        } while (channelSegment != null);
        return sb.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.channels.ReceiveChannel
    /* JADX INFO: renamed from: tryReceive-PtdJZtk, reason: not valid java name */
    public Object mo35tryReceivePtdJZtk() {
        ChannelSegment channelSegmentFindSegmentReceive;
        long j = receivers$volatile$FU.get(this);
        long j2 = sendersAndCloseStatus$volatile$FU.get(this);
        if (isClosedForReceive0(j2)) {
            return ChannelResult.Companion.m55closedJP2dKIU(getCloseCause());
        }
        if (j >= (j2 & 1152921504606846975L)) {
            return ChannelResult.Companion.m56failurePtdJZtk();
        }
        Object obj = BufferedChannelKt.INTERRUPTED_RCV;
        ChannelSegment channelSegment = (ChannelSegment) getReceiveSegment$volatile$FU().get(this);
        while (!isClosedForReceive()) {
            long andIncrement = getReceivers$volatile$FU().getAndIncrement(this);
            int i = BufferedChannelKt.SEGMENT_SIZE;
            long j3 = andIncrement / ((long) i);
            int i2 = (int) (andIncrement % ((long) i));
            if (channelSegment.id != j3) {
                channelSegmentFindSegmentReceive = findSegmentReceive(j3, channelSegment);
                if (channelSegmentFindSegmentReceive == null) {
                    continue;
                }
            } else {
                channelSegmentFindSegmentReceive = channelSegment;
            }
            Object objUpdateCellReceive = updateCellReceive(channelSegmentFindSegmentReceive, i2, andIncrement, obj);
            if (objUpdateCellReceive == BufferedChannelKt.SUSPEND) {
                Waiter waiter = obj instanceof Waiter ? (Waiter) obj : null;
                if (waiter != null) {
                    prepareReceiverForSuspension(waiter, channelSegmentFindSegmentReceive, i2);
                }
                waitExpandBufferCompletion$kotlinx_coroutines_core(andIncrement);
                channelSegmentFindSegmentReceive.onSlotCleaned();
                return ChannelResult.Companion.m56failurePtdJZtk();
            }
            if (objUpdateCellReceive != BufferedChannelKt.FAILED) {
                if (objUpdateCellReceive != BufferedChannelKt.SUSPEND_NO_WAITER) {
                    channelSegmentFindSegmentReceive.cleanPrev();
                    return ChannelResult.Companion.m57successJP2dKIU(objUpdateCellReceive);
                }
                net.luminis.tls.engine.impl.c.r("unexpected");
                return null;
            }
            if (andIncrement < getSendersCounter$kotlinx_coroutines_core()) {
                channelSegmentFindSegmentReceive.cleanPrev();
            }
            channelSegment = channelSegmentFindSegmentReceive;
        }
        return ChannelResult.Companion.m55closedJP2dKIU(getCloseCause());
    }

    @Override // kotlinx.coroutines.channels.SendChannel
    /* JADX INFO: renamed from: trySend-JP2dKIU */
    public Object mo28trySendJP2dKIU(E e) {
        ChannelSegment channelSegment;
        if (shouldSendSuspend(sendersAndCloseStatus$volatile$FU.get(this))) {
            return ChannelResult.Companion.m56failurePtdJZtk();
        }
        Object obj = BufferedChannelKt.INTERRUPTED_SEND;
        ChannelSegment channelSegment2 = (ChannelSegment) sendSegment$volatile$FU.get(this);
        while (true) {
            long andIncrement = sendersAndCloseStatus$volatile$FU.getAndIncrement(this);
            long j = andIncrement & 1152921504606846975L;
            boolean zIsClosedForSend0 = isClosedForSend0(andIncrement);
            int i = BufferedChannelKt.SEGMENT_SIZE;
            long j2 = j / ((long) i);
            int i2 = (int) (j % ((long) i));
            if (channelSegment2.id != j2) {
                ChannelSegment channelSegmentFindSegmentSend = findSegmentSend(j2, channelSegment2);
                if (channelSegmentFindSegmentSend != null) {
                    channelSegment = channelSegmentFindSegmentSend;
                } else if (zIsClosedForSend0) {
                    return ChannelResult.Companion.m55closedJP2dKIU(getSendException());
                }
            } else {
                channelSegment = channelSegment2;
            }
            int iUpdateCellSend = updateCellSend(channelSegment, i2, e, j, obj, zIsClosedForSend0);
            channelSegment2 = channelSegment;
            y yVar = y.a;
            if (iUpdateCellSend == 0) {
                channelSegment2.cleanPrev();
                return ChannelResult.Companion.m57successJP2dKIU(yVar);
            }
            if (iUpdateCellSend == 1) {
                return ChannelResult.Companion.m57successJP2dKIU(yVar);
            }
            if (iUpdateCellSend == 2) {
                if (zIsClosedForSend0) {
                    channelSegment2.onSlotCleaned();
                    return ChannelResult.Companion.m55closedJP2dKIU(getSendException());
                }
                Waiter waiter = obj instanceof Waiter ? (Waiter) obj : null;
                if (waiter != null) {
                    prepareSenderForSuspension(waiter, channelSegment2, i2);
                }
                channelSegment2.onSlotCleaned();
                return ChannelResult.Companion.m56failurePtdJZtk();
            }
            if (iUpdateCellSend == 3) {
                net.luminis.tls.engine.impl.c.r("unexpected");
                return null;
            }
            if (iUpdateCellSend == 4) {
                if (j < getReceiversCounter$kotlinx_coroutines_core()) {
                    channelSegment2.cleanPrev();
                }
                return ChannelResult.Companion.m55closedJP2dKIU(getSendException());
            }
            if (iUpdateCellSend == 5) {
                channelSegment2.cleanPrev();
            }
            e = e;
        }
    }

    /* JADX INFO: renamed from: trySendDropOldest-JP2dKIU, reason: not valid java name */
    public final Object m36trySendDropOldestJP2dKIU(E e) {
        ChannelSegment channelSegmentFindSegmentSend;
        Object obj = BufferedChannelKt.BUFFERED;
        ChannelSegment channelSegment = (ChannelSegment) sendSegment$volatile$FU.get(this);
        while (true) {
            long andIncrement = sendersAndCloseStatus$volatile$FU.getAndIncrement(this);
            long j = andIncrement & 1152921504606846975L;
            boolean zIsClosedForSend0 = isClosedForSend0(andIncrement);
            int i = BufferedChannelKt.SEGMENT_SIZE;
            long j2 = j / ((long) i);
            int i2 = (int) (j % ((long) i));
            if (channelSegment.id != j2) {
                channelSegmentFindSegmentSend = findSegmentSend(j2, channelSegment);
                if (channelSegmentFindSegmentSend == null) {
                    if (zIsClosedForSend0) {
                        return ChannelResult.Companion.m55closedJP2dKIU(getSendException());
                    }
                }
            } else {
                channelSegmentFindSegmentSend = channelSegment;
            }
            E e2 = e;
            int iUpdateCellSend = updateCellSend(channelSegmentFindSegmentSend, i2, e2, j, obj, zIsClosedForSend0);
            channelSegment = channelSegmentFindSegmentSend;
            y yVar = y.a;
            if (iUpdateCellSend == 0) {
                channelSegment.cleanPrev();
                return ChannelResult.Companion.m57successJP2dKIU(yVar);
            }
            if (iUpdateCellSend == 1) {
                return ChannelResult.Companion.m57successJP2dKIU(yVar);
            }
            if (iUpdateCellSend == 2) {
                if (zIsClosedForSend0) {
                    channelSegment.onSlotCleaned();
                    return ChannelResult.Companion.m55closedJP2dKIU(getSendException());
                }
                Waiter waiter = obj instanceof Waiter ? (Waiter) obj : null;
                if (waiter != null) {
                    prepareSenderForSuspension(waiter, channelSegment, i2);
                }
                dropFirstElementUntilTheSpecifiedCellIsInTheBuffer((channelSegment.id * ((long) i)) + ((long) i2));
                return ChannelResult.Companion.m57successJP2dKIU(yVar);
            }
            if (iUpdateCellSend == 3) {
                net.luminis.tls.engine.impl.c.r("unexpected");
                return null;
            }
            if (iUpdateCellSend == 4) {
                if (j < getReceiversCounter$kotlinx_coroutines_core()) {
                    channelSegment.cleanPrev();
                }
                return ChannelResult.Companion.m55closedJP2dKIU(getSendException());
            }
            if (iUpdateCellSend == 5) {
                channelSegment.cleanPrev();
            }
            e = e2;
        }
    }

    public final void waitExpandBufferCompletion$kotlinx_coroutines_core(long j) {
        BufferedChannel<E> bufferedChannel = this;
        if (bufferedChannel.isRendezvousOrUnlimited()) {
            return;
        }
        while (bufferedChannel.getBufferEndCounter() <= j) {
            bufferedChannel = this;
        }
        int i = BufferedChannelKt.EXPAND_BUFFER_COMPLETION_WAIT_ITERATIONS;
        for (int i2 = 0; i2 < i; i2++) {
            long bufferEndCounter = bufferedChannel.getBufferEndCounter();
            if (bufferEndCounter == (4611686018427387903L & completedExpandBuffersAndPauseFlag$volatile$FU.get(bufferedChannel)) && bufferEndCounter == bufferedChannel.getBufferEndCounter()) {
                return;
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = completedExpandBuffersAndPauseFlag$volatile$FU;
        while (true) {
            long j2 = atomicLongFieldUpdater.get(bufferedChannel);
            if (atomicLongFieldUpdater.compareAndSet(bufferedChannel, j2, BufferedChannelKt.constructEBCompletedAndPauseFlag(j2 & 4611686018427387903L, true))) {
                break;
            } else {
                bufferedChannel = this;
            }
        }
        while (true) {
            long bufferEndCounter2 = bufferedChannel.getBufferEndCounter();
            long j3 = completedExpandBuffersAndPauseFlag$volatile$FU.get(bufferedChannel);
            long j4 = j3 & 4611686018427387903L;
            boolean z = (4611686018427387904L & j3) != 0;
            if (bufferEndCounter2 == j4 && bufferEndCounter2 == bufferedChannel.getBufferEndCounter()) {
                break;
            }
            if (z) {
                bufferedChannel = this;
            } else {
                bufferedChannel = this;
                completedExpandBuffersAndPauseFlag$volatile$FU.compareAndSet(bufferedChannel, j3, BufferedChannelKt.constructEBCompletedAndPauseFlag(j4, true));
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = completedExpandBuffersAndPauseFlag$volatile$FU;
        while (true) {
            long j5 = atomicLongFieldUpdater2.get(bufferedChannel);
            boolean zCompareAndSet = atomicLongFieldUpdater2.compareAndSet(bufferedChannel, j5, BufferedChannelKt.constructEBCompletedAndPauseFlag(j5 & 4611686018427387903L, false));
            AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater2;
            if (zCompareAndSet) {
                return;
            }
            atomicLongFieldUpdater2 = atomicLongFieldUpdater3;
            bufferedChannel = this;
        }
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final void cancel() {
        cancelImpl$kotlinx_coroutines_core(null);
    }

    @Override // kotlinx.coroutines.channels.ReceiveChannel
    public final void cancel(CancellationException cancellationException) {
        cancelImpl$kotlinx_coroutines_core(cancellationException);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlin.reflect.e bindCancellationFun(l lVar) {
        return new AnonymousClass2(this);
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.channels.BufferedChannel$bindCancellationFun$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    public /* synthetic */ class AnonymousClass2 extends j implements q {
        public AnonymousClass2(Object obj) {
            super(3, 0, BufferedChannel.class, obj, "onCancellationImplDoNotCall", "onCancellationImplDoNotCall(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V");
        }

        @Override // kotlin.jvm.functions.q
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            invoke((Throwable) obj, obj2, (i) obj3);
            return y.a;
        }

        public final void invoke(Throwable th, E e, i iVar) {
            ((BufferedChannel) this.receiver).onCancellationImplDoNotCall(th, e, iVar);
        }
    }

    public static /* synthetic */ void getOnReceive$annotations() {
    }

    public static /* synthetic */ void getOnReceiveCatching$annotations() {
    }

    public static /* synthetic */ void getOnReceiveOrNull$annotations() {
    }

    public static /* synthetic */ void getOnSend$annotations() {
    }

    private static /* synthetic */ void getOnUndeliveredElementReceiveCancellationConstructor$annotations() {
    }

    @ExperimentalCoroutinesApi
    public static /* synthetic */ void isClosedForReceive$annotations() {
    }

    @ExperimentalCoroutinesApi
    public static /* synthetic */ void isClosedForSend$annotations() {
    }

    @ExperimentalCoroutinesApi
    public static /* synthetic */ void isEmpty$annotations() {
    }

    public void onClosedIdempotent() {
    }

    public void onReceiveDequeued() {
    }

    public void onReceiveEnqueued() {
    }

    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    public final class BufferedChannelIterator implements ChannelIterator<E>, Waiter {
        private CancellableContinuationImpl<? super Boolean> continuation;
        private Object receiveResult = BufferedChannelKt.NO_RECEIVE_RESULT;

        public BufferedChannelIterator() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Object hasNextOnNoWaiterSuspend(ChannelSegment<E> channelSegment, int i, long j, kotlin.coroutines.d<? super Boolean> dVar) throws Throwable {
            Boolean bool;
            l lVar;
            ChannelSegment channelSegment2;
            BufferedChannel<E> bufferedChannel = BufferedChannel.this;
            CancellableContinuationImpl orCreateCancellableContinuation = CancellableContinuationKt.getOrCreateCancellableContinuation(com.google.android.material.shape.e.g(dVar));
            try {
                this.continuation = orCreateCancellableContinuation;
                try {
                    Object objUpdateCellReceive = bufferedChannel.updateCellReceive(channelSegment, i, j, this);
                    if (objUpdateCellReceive == BufferedChannelKt.SUSPEND) {
                        bufferedChannel.prepareReceiverForSuspension(this, channelSegment, i);
                    } else {
                        q qVarBindCancellationFun = null;
                        if (objUpdateCellReceive == BufferedChannelKt.FAILED) {
                            if (j < bufferedChannel.getSendersCounter$kotlinx_coroutines_core()) {
                                channelSegment.cleanPrev();
                            }
                            ChannelSegment channelSegment3 = (ChannelSegment) BufferedChannel.getReceiveSegment$volatile$FU().get(bufferedChannel);
                            while (true) {
                                if (bufferedChannel.isClosedForReceive()) {
                                    onClosedHasNextNoWaiterSuspend();
                                } else {
                                    long andIncrement = BufferedChannel.getReceivers$volatile$FU().getAndIncrement(bufferedChannel);
                                    int i2 = BufferedChannelKt.SEGMENT_SIZE;
                                    long j2 = andIncrement / ((long) i2);
                                    int i3 = (int) (andIncrement % ((long) i2));
                                    if (channelSegment3.id != j2) {
                                        ChannelSegment channelSegmentFindSegmentReceive = bufferedChannel.findSegmentReceive(j2, channelSegment3);
                                        if (channelSegmentFindSegmentReceive != null) {
                                            channelSegment2 = channelSegmentFindSegmentReceive;
                                        }
                                    } else {
                                        channelSegment2 = channelSegment3;
                                    }
                                    objUpdateCellReceive = bufferedChannel.updateCellReceive(channelSegment2, i3, andIncrement, this);
                                    ChannelSegment channelSegment4 = channelSegment2;
                                    if (objUpdateCellReceive == BufferedChannelKt.SUSPEND) {
                                        bufferedChannel.prepareReceiverForSuspension(this, channelSegment4, i3);
                                    } else {
                                        if (objUpdateCellReceive != BufferedChannelKt.FAILED) {
                                            if (objUpdateCellReceive == BufferedChannelKt.SUSPEND_NO_WAITER) {
                                                throw new IllegalStateException("unexpected");
                                            }
                                            channelSegment4.cleanPrev();
                                            this.receiveResult = objUpdateCellReceive;
                                            this.continuation = null;
                                            bool = Boolean.TRUE;
                                            lVar = bufferedChannel.onUndeliveredElement;
                                            if (lVar == null) {
                                                break;
                                            }
                                            qVarBindCancellationFun = bufferedChannel.bindCancellationFun(lVar, objUpdateCellReceive);
                                            break;
                                        }
                                        if (andIncrement < bufferedChannel.getSendersCounter$kotlinx_coroutines_core()) {
                                            channelSegment4.cleanPrev();
                                        }
                                        channelSegment3 = channelSegment4;
                                    }
                                }
                            }
                            orCreateCancellableContinuation.resume(bool, qVarBindCancellationFun);
                        } else {
                            channelSegment.cleanPrev();
                            this.receiveResult = objUpdateCellReceive;
                            this.continuation = null;
                            bool = Boolean.TRUE;
                            lVar = bufferedChannel.onUndeliveredElement;
                            if (lVar != null) {
                                qVarBindCancellationFun = bufferedChannel.bindCancellationFun(lVar, objUpdateCellReceive);
                                break;
                            }
                            orCreateCancellableContinuation.resume(bool, qVarBindCancellationFun);
                        }
                    }
                    return orCreateCancellableContinuation.getResult();
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    orCreateCancellableContinuation.releaseClaimedReusableContinuation$kotlinx_coroutines_core();
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }

        private final boolean onClosedHasNext() throws Throwable {
            this.receiveResult = BufferedChannelKt.getCHANNEL_CLOSED();
            Throwable closeCause = BufferedChannel.this.getCloseCause();
            if (closeCause == null) {
                return false;
            }
            throw StackTraceRecoveryKt.recoverStackTrace(closeCause);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void onClosedHasNextNoWaiterSuspend() {
            CancellableContinuationImpl<? super Boolean> cancellableContinuationImpl = this.continuation;
            cancellableContinuationImpl.getClass();
            this.continuation = null;
            this.receiveResult = BufferedChannelKt.getCHANNEL_CLOSED();
            Throwable closeCause = BufferedChannel.this.getCloseCause();
            if (closeCause == null) {
                cancellableContinuationImpl.resumeWith(Boolean.FALSE);
            } else {
                cancellableContinuationImpl.resumeWith(new kotlin.l(closeCause));
            }
        }

        @Override // kotlinx.coroutines.channels.ChannelIterator
        public Object hasNext(kotlin.coroutines.d<? super Boolean> dVar) throws Throwable {
            ChannelSegment<E> channelSegmentFindSegmentReceive;
            boolean zOnClosedHasNext = true;
            if (this.receiveResult == BufferedChannelKt.NO_RECEIVE_RESULT || this.receiveResult == BufferedChannelKt.getCHANNEL_CLOSED()) {
                BufferedChannel<E> bufferedChannel = BufferedChannel.this;
                ChannelSegment<E> channelSegment = (ChannelSegment) BufferedChannel.getReceiveSegment$volatile$FU().get(bufferedChannel);
                while (!bufferedChannel.isClosedForReceive()) {
                    long andIncrement = BufferedChannel.getReceivers$volatile$FU().getAndIncrement(bufferedChannel);
                    int i = BufferedChannelKt.SEGMENT_SIZE;
                    long j = andIncrement / ((long) i);
                    int i2 = (int) (andIncrement % ((long) i));
                    if (channelSegment.id != j) {
                        channelSegmentFindSegmentReceive = bufferedChannel.findSegmentReceive(j, channelSegment);
                        if (channelSegmentFindSegmentReceive == null) {
                            continue;
                        }
                    } else {
                        channelSegmentFindSegmentReceive = channelSegment;
                    }
                    Object objUpdateCellReceive = bufferedChannel.updateCellReceive(channelSegmentFindSegmentReceive, i2, andIncrement, null);
                    if (objUpdateCellReceive == BufferedChannelKt.SUSPEND) {
                        net.luminis.tls.engine.impl.c.r("unreachable");
                        return null;
                    }
                    if (objUpdateCellReceive == BufferedChannelKt.FAILED) {
                        if (andIncrement < bufferedChannel.getSendersCounter$kotlinx_coroutines_core()) {
                            channelSegmentFindSegmentReceive.cleanPrev();
                        }
                        channelSegment = channelSegmentFindSegmentReceive;
                    } else {
                        if (objUpdateCellReceive == BufferedChannelKt.SUSPEND_NO_WAITER) {
                            return hasNextOnNoWaiterSuspend(channelSegmentFindSegmentReceive, i2, andIncrement, dVar);
                        }
                        channelSegmentFindSegmentReceive.cleanPrev();
                        this.receiveResult = objUpdateCellReceive;
                    }
                }
                zOnClosedHasNext = onClosedHasNext();
            }
            return Boolean.valueOf(zOnClosedHasNext);
        }

        @Override // kotlinx.coroutines.Waiter
        public void invokeOnCancellation(Segment<?> segment, int i) {
            CancellableContinuationImpl<? super Boolean> cancellableContinuationImpl = this.continuation;
            if (cancellableContinuationImpl != null) {
                cancellableContinuationImpl.invokeOnCancellation(segment, i);
            }
        }

        @Override // kotlinx.coroutines.channels.ChannelIterator
        public E next() throws Throwable {
            E e = (E) this.receiveResult;
            if (e == BufferedChannelKt.NO_RECEIVE_RESULT) {
                net.luminis.tls.engine.impl.c.r("`hasNext()` has not been invoked");
                return null;
            }
            this.receiveResult = BufferedChannelKt.NO_RECEIVE_RESULT;
            if (e != BufferedChannelKt.getCHANNEL_CLOSED()) {
                return e;
            }
            throw StackTraceRecoveryKt.recoverStackTrace(BufferedChannel.this.getReceiveException());
        }

        public final boolean tryResumeHasNext(E e) {
            CancellableContinuationImpl<? super Boolean> cancellableContinuationImpl = this.continuation;
            cancellableContinuationImpl.getClass();
            this.continuation = null;
            this.receiveResult = e;
            Boolean bool = Boolean.TRUE;
            BufferedChannel<E> bufferedChannel = BufferedChannel.this;
            l lVar = bufferedChannel.onUndeliveredElement;
            return BufferedChannelKt.tryResume0(cancellableContinuationImpl, bool, lVar != null ? bufferedChannel.bindCancellationFun(lVar, e) : null);
        }

        public final void tryResumeHasNextOnClosedChannel() {
            CancellableContinuationImpl<? super Boolean> cancellableContinuationImpl = this.continuation;
            cancellableContinuationImpl.getClass();
            this.continuation = null;
            this.receiveResult = BufferedChannelKt.getCHANNEL_CLOSED();
            Throwable closeCause = BufferedChannel.this.getCloseCause();
            if (closeCause == null) {
                cancellableContinuationImpl.resumeWith(Boolean.FALSE);
            } else {
                cancellableContinuationImpl.resumeWith(new kotlin.l(closeCause));
            }
        }

        @Override // kotlinx.coroutines.channels.ChannelIterator
        @kotlin.c
        public /* synthetic */ Object next(kotlin.coroutines.d dVar) {
            return ChannelIterator.DefaultImpls.next(this, dVar);
        }
    }

    public /* synthetic */ BufferedChannel(int i, l lVar, int i2, f fVar) {
        this(i, (i2 & 2) != 0 ? null : lVar);
    }
}
