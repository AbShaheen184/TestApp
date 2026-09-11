package kotlinx.coroutines.flow;

import coil3.g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.u;
import kotlin.coroutines.i;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.internal.l;
import kotlin.y;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CancellableContinuationKt;
import kotlinx.coroutines.DisposableHandle;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.AbstractSharedFlow;
import kotlinx.coroutines.flow.internal.AbstractSharedFlowKt;
import kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot;
import kotlinx.coroutines.flow.internal.FusibleFlow;
import kotlinx.coroutines.internal.Symbol;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class SharedFlowImpl<T> extends AbstractSharedFlow<SharedFlowSlot> implements MutableSharedFlow<T>, CancellableFlow<T>, FusibleFlow<T> {
    private Object[] buffer;
    private final int bufferCapacity;
    private int bufferSize;
    private long minCollectorIndex;
    private final BufferOverflow onBufferOverflow;
    private int queueSize;
    private final int replay;
    private long replayIndex;

    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    public static final class Emitter implements DisposableHandle {
        public final kotlin.coroutines.d<y> cont;
        public final SharedFlowImpl<?> flow;
        public long index;
        public final Object value;

        /* JADX WARN: Multi-variable type inference failed */
        public Emitter(SharedFlowImpl<?> sharedFlowImpl, long j, Object obj, kotlin.coroutines.d<? super y> dVar) {
            this.flow = sharedFlowImpl;
            this.index = j;
            this.value = obj;
            this.cont = dVar;
        }

        @Override // kotlinx.coroutines.DisposableHandle
        public void dispose() {
            this.flow.cancelEmitter(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BufferOverflow.values().length];
            try {
                iArr[BufferOverflow.SUSPEND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BufferOverflow.DROP_LATEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BufferOverflow.DROP_OLDEST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.SharedFlowImpl$collect$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @e(c = "kotlinx.coroutines.flow.SharedFlowImpl", f = "SharedFlow.kt", l = {387, 394, 397}, m = "collect$suspendImpl")
    public static final class AnonymousClass1<T> extends kotlin.coroutines.jvm.internal.c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SharedFlowImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SharedFlowImpl<T> sharedFlowImpl, kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(dVar);
            this.this$0 = sharedFlowImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SharedFlowImpl.collect$suspendImpl(this.this$0, null, this);
        }
    }

    public SharedFlowImpl(int i, int i2, BufferOverflow bufferOverflow) {
        this.replay = i;
        this.bufferCapacity = i2;
        this.onBufferOverflow = bufferOverflow;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object awaitValue(SharedFlowSlot sharedFlowSlot, kotlin.coroutines.d<? super y> dVar) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(com.google.android.material.shape.e.g(dVar), 1);
        cancellableContinuationImpl.initCancellability();
        synchronized (this) {
            try {
                if (tryPeekLocked(sharedFlowSlot) < 0) {
                    sharedFlowSlot.cont = cancellableContinuationImpl;
                } else {
                    cancellableContinuationImpl.resumeWith(y.a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        Object result = cancellableContinuationImpl.getResult();
        return result == kotlin.coroutines.intrinsics.a.e ? result : y.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void cancelEmitter(Emitter emitter) {
        synchronized (this) {
            if (emitter.index < getHead()) {
                return;
            }
            Object[] objArr = this.buffer;
            objArr.getClass();
            if (SharedFlowKt.getBufferAt(objArr, emitter.index) != emitter) {
                return;
            }
            SharedFlowKt.setBufferAt(objArr, emitter.index, SharedFlowKt.NO_VALUE);
            cleanupTailLocked();
        }
    }

    private final void cleanupTailLocked() {
        if (this.bufferCapacity != 0 || this.queueSize > 1) {
            Object[] objArr = this.buffer;
            objArr.getClass();
            while (this.queueSize > 0 && SharedFlowKt.getBufferAt(objArr, (getHead() + ((long) getTotalSize())) - 1) == SharedFlowKt.NO_VALUE) {
                this.queueSize--;
                SharedFlowKt.setBufferAt(objArr, getHead() + ((long) getTotalSize()), null);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008f, code lost:
    
        if (((kotlinx.coroutines.flow.SubscribedFlowCollector) r9).onSubscription(r0) == r5) goto L48;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <T> java.lang.Object collect$suspendImpl(kotlinx.coroutines.flow.SharedFlowImpl<T> r8, kotlinx.coroutines.flow.FlowCollector<? super T> r9, kotlin.coroutines.d<?> r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.SharedFlowImpl.collect$suspendImpl(kotlinx.coroutines.flow.SharedFlowImpl, kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.d):java.lang.Object");
    }

    private final void correctCollectorIndexesOnDropOldest(long j) {
        AbstractSharedFlowSlot[] abstractSharedFlowSlotArr;
        if (((AbstractSharedFlow) this).nCollectors != 0 && (abstractSharedFlowSlotArr = ((AbstractSharedFlow) this).slots) != null) {
            for (AbstractSharedFlowSlot abstractSharedFlowSlot : abstractSharedFlowSlotArr) {
                if (abstractSharedFlowSlot != null) {
                    SharedFlowSlot sharedFlowSlot = (SharedFlowSlot) abstractSharedFlowSlot;
                    long j2 = sharedFlowSlot.index;
                    if (j2 >= 0 && j2 < j) {
                        sharedFlowSlot.index = j;
                    }
                }
            }
        }
        this.minCollectorIndex = j;
    }

    private final void dropOldestLocked() {
        Object[] objArr = this.buffer;
        objArr.getClass();
        SharedFlowKt.setBufferAt(objArr, getHead(), null);
        this.bufferSize--;
        long head = getHead() + 1;
        if (this.replayIndex < head) {
            this.replayIndex = head;
        }
        if (this.minCollectorIndex < head) {
            correctCollectorIndexesOnDropOldest(head);
        }
    }

    public static <T> Object emit$suspendImpl(SharedFlowImpl<T> sharedFlowImpl, T t, kotlin.coroutines.d<? super y> dVar) {
        Object objEmitSuspend;
        boolean zTryEmit = sharedFlowImpl.tryEmit(t);
        y yVar = y.a;
        return (!zTryEmit && (objEmitSuspend = sharedFlowImpl.emitSuspend(t, dVar)) == kotlin.coroutines.intrinsics.a.e) ? objEmitSuspend : yVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object emitSuspend(T t, kotlin.coroutines.d<? super y> dVar) throws Throwable {
        Throwable th;
        kotlin.coroutines.d<y>[] dVarArrFindSlotsToResumeLocked;
        Emitter emitter;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(com.google.android.material.shape.e.g(dVar), 1);
        cancellableContinuationImpl.initCancellability();
        kotlin.coroutines.d<y>[] dVarArrFindSlotsToResumeLocked2 = AbstractSharedFlowKt.EMPTY_RESUMES;
        synchronized (this) {
            try {
                if (tryEmitLocked(t)) {
                    try {
                        cancellableContinuationImpl.resumeWith(y.a);
                        dVarArrFindSlotsToResumeLocked = findSlotsToResumeLocked(dVarArrFindSlotsToResumeLocked2);
                        emitter = null;
                    } catch (Throwable th2) {
                        th = th2;
                        throw th;
                    }
                } else {
                    try {
                        Emitter emitter2 = new Emitter(this, getHead() + ((long) getTotalSize()), t, cancellableContinuationImpl);
                        enqueueLocked(emitter2);
                        this.queueSize++;
                        if (this.bufferCapacity == 0) {
                            dVarArrFindSlotsToResumeLocked2 = findSlotsToResumeLocked(dVarArrFindSlotsToResumeLocked2);
                        }
                        dVarArrFindSlotsToResumeLocked = dVarArrFindSlotsToResumeLocked2;
                        emitter = emitter2;
                    } catch (Throwable th3) {
                        th = th3;
                        th = th;
                        throw th;
                    }
                }
                if (emitter != null) {
                    CancellableContinuationKt.disposeOnCancellation(cancellableContinuationImpl, emitter);
                }
                for (kotlin.coroutines.d<y> dVar2 : dVarArrFindSlotsToResumeLocked) {
                    if (dVar2 != null) {
                        dVar2.resumeWith(y.a);
                    }
                }
                Object result = cancellableContinuationImpl.getResult();
                return result == kotlin.coroutines.intrinsics.a.e ? result : y.a;
            } catch (Throwable th4) {
                th = th4;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void enqueueLocked(Object obj) {
        int totalSize = getTotalSize();
        Object[] objArrGrowBuffer = this.buffer;
        if (objArrGrowBuffer == null) {
            objArrGrowBuffer = growBuffer(null, 0, 2);
        } else if (totalSize >= objArrGrowBuffer.length) {
            objArrGrowBuffer = growBuffer(objArrGrowBuffer, totalSize, objArrGrowBuffer.length * 2);
        }
        SharedFlowKt.setBufferAt(objArrGrowBuffer, getHead() + ((long) totalSize), obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [kotlin.coroutines.d<kotlin.y>[]] */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v3, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r6v3 */
    public final kotlin.coroutines.d<y>[] findSlotsToResumeLocked(kotlin.coroutines.d<y>[] dVarArr) {
        AbstractSharedFlowSlot[] abstractSharedFlowSlotArr;
        SharedFlowSlot sharedFlowSlot;
        kotlin.coroutines.d<? super y> dVar;
        int length = dVarArr.length;
        if (((AbstractSharedFlow) this).nCollectors != 0 && (abstractSharedFlowSlotArr = ((AbstractSharedFlow) this).slots) != null) {
            int length2 = abstractSharedFlowSlotArr.length;
            int i = 0;
            while (i < length2) {
                AbstractSharedFlowSlot abstractSharedFlowSlot = abstractSharedFlowSlotArr[i];
                if (abstractSharedFlowSlot == null || (dVar = (sharedFlowSlot = (SharedFlowSlot) abstractSharedFlowSlot).cont) == null || tryPeekLocked(sharedFlowSlot) < 0) {
                    dVarArr = dVarArr;
                } else {
                    if (length >= dVarArr.length) {
                        dVarArr = dVarArr;
                        dVarArr = dVarArr;
                        dVarArr = Arrays.copyOf((Object[]) dVarArr, Math.max(2, dVarArr.length * 2));
                    }
                    dVarArr = dVarArr;
                    dVarArr = dVarArr;
                    ((kotlin.coroutines.d[]) dVarArr)[length] = dVar;
                    sharedFlowSlot.cont = null;
                    length++;
                }
                i++;
                dVarArr = dVarArr;
            }
            dVarArr = dVarArr;
        }
        return (kotlin.coroutines.d[]) dVarArr;
    }

    private final long getBufferEndIndex() {
        return getHead() + ((long) this.bufferSize);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long getHead() {
        return Math.min(this.minCollectorIndex, this.replayIndex);
    }

    private final Object getPeekedValueLockedAt(long j) {
        Object[] objArr = this.buffer;
        objArr.getClass();
        Object bufferAt = SharedFlowKt.getBufferAt(objArr, j);
        return bufferAt instanceof Emitter ? ((Emitter) bufferAt).value : bufferAt;
    }

    private final long getQueueEndIndex() {
        return getHead() + ((long) this.bufferSize) + ((long) this.queueSize);
    }

    private final int getReplaySize() {
        return (int) ((getHead() + ((long) this.bufferSize)) - this.replayIndex);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getTotalSize() {
        return this.bufferSize + this.queueSize;
    }

    private final Object[] growBuffer(Object[] objArr, int i, int i2) {
        if (i2 <= 0) {
            net.luminis.tls.engine.impl.c.r("Buffer size overflow");
            return null;
        }
        Object[] objArr2 = new Object[i2];
        this.buffer = objArr2;
        if (objArr != null) {
            long head = getHead();
            for (int i3 = 0; i3 < i; i3++) {
                long j = ((long) i3) + head;
                SharedFlowKt.setBufferAt(objArr2, j, SharedFlowKt.getBufferAt(objArr, j));
            }
        }
        return objArr2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean tryEmitLocked(T t) {
        if (getNCollectors() == 0) {
            return tryEmitNoCollectorsLocked(t);
        }
        if (this.bufferSize >= this.bufferCapacity && this.minCollectorIndex <= this.replayIndex) {
            int i = WhenMappings.$EnumSwitchMapping$0[this.onBufferOverflow.ordinal()];
            if (i == 1) {
                return false;
            }
            if (i == 2) {
                return true;
            }
            if (i != 3) {
                g.a();
                return false;
            }
        }
        enqueueLocked(t);
        int i2 = this.bufferSize + 1;
        this.bufferSize = i2;
        if (i2 > this.bufferCapacity) {
            dropOldestLocked();
        }
        if (getReplaySize() > this.replay) {
            updateBufferLocked(this.replayIndex + 1, this.minCollectorIndex, getBufferEndIndex(), getQueueEndIndex());
        }
        return true;
    }

    private final boolean tryEmitNoCollectorsLocked(T t) {
        if (this.replay == 0) {
            return true;
        }
        enqueueLocked(t);
        int i = this.bufferSize + 1;
        this.bufferSize = i;
        if (i > this.replay) {
            dropOldestLocked();
        }
        this.minCollectorIndex = getHead() + ((long) this.bufferSize);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long tryPeekLocked(SharedFlowSlot sharedFlowSlot) {
        long j = sharedFlowSlot.index;
        if (j >= getBufferEndIndex() && (this.bufferCapacity > 0 || j > getHead() || this.queueSize == 0)) {
            return -1L;
        }
        return j;
    }

    private final Object tryTakeValue(SharedFlowSlot sharedFlowSlot) {
        Object obj;
        kotlin.coroutines.d<y>[] dVarArrUpdateCollectorIndexLocked$kotlinx_coroutines_core = AbstractSharedFlowKt.EMPTY_RESUMES;
        synchronized (this) {
            try {
                long jTryPeekLocked = tryPeekLocked(sharedFlowSlot);
                if (jTryPeekLocked < 0) {
                    obj = SharedFlowKt.NO_VALUE;
                } else {
                    long j = sharedFlowSlot.index;
                    Object peekedValueLockedAt = getPeekedValueLockedAt(jTryPeekLocked);
                    sharedFlowSlot.index = jTryPeekLocked + 1;
                    dVarArrUpdateCollectorIndexLocked$kotlinx_coroutines_core = updateCollectorIndexLocked$kotlinx_coroutines_core(j);
                    obj = peekedValueLockedAt;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        for (kotlin.coroutines.d<y> dVar : dVarArrUpdateCollectorIndexLocked$kotlinx_coroutines_core) {
            if (dVar != null) {
                dVar.resumeWith(y.a);
            }
        }
        return obj;
    }

    private final void updateBufferLocked(long j, long j2, long j3, long j4) {
        long jMin = Math.min(j2, j);
        for (long head = getHead(); head < jMin; head++) {
            Object[] objArr = this.buffer;
            objArr.getClass();
            SharedFlowKt.setBufferAt(objArr, head, null);
        }
        this.replayIndex = j;
        this.minCollectorIndex = j2;
        this.bufferSize = (int) (j3 - jMin);
        this.queueSize = (int) (j4 - j3);
    }

    @Override // kotlinx.coroutines.flow.SharedFlow, kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector<? super T> flowCollector, kotlin.coroutines.d<?> dVar) {
        return collect$suspendImpl(this, flowCollector, dVar);
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    public SharedFlowSlot createSlot() {
        return new SharedFlowSlot();
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow, kotlinx.coroutines.flow.FlowCollector
    public Object emit(T t, kotlin.coroutines.d<? super y> dVar) {
        return emit$suspendImpl(this, t, dVar);
    }

    @Override // kotlinx.coroutines.flow.internal.FusibleFlow
    public Flow<T> fuse(i iVar, int i, BufferOverflow bufferOverflow) {
        return SharedFlowKt.fuseSharedFlow(this, iVar, i, bufferOverflow);
    }

    public final T getLastReplayedLocked() {
        Object[] objArr = this.buffer;
        objArr.getClass();
        return (T) SharedFlowKt.getBufferAt(objArr, (this.replayIndex + ((long) getReplaySize())) - 1);
    }

    @Override // kotlinx.coroutines.flow.SharedFlow
    public List<T> getReplayCache() {
        synchronized (this) {
            int replaySize = getReplaySize();
            if (replaySize == 0) {
                return u.e;
            }
            ArrayList arrayList = new ArrayList(replaySize);
            Object[] objArr = this.buffer;
            objArr.getClass();
            for (int i = 0; i < replaySize; i++) {
                arrayList.add(SharedFlowKt.getBufferAt(objArr, this.replayIndex + ((long) i)));
            }
            return arrayList;
        }
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    public void resetReplayCache() throws Throwable {
        synchronized (this) {
            try {
                try {
                    updateBufferLocked(getBufferEndIndex(), this.minCollectorIndex, getBufferEndIndex(), getQueueEndIndex());
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    public boolean tryEmit(T t) {
        int i;
        boolean z;
        kotlin.coroutines.d<y>[] dVarArrFindSlotsToResumeLocked = AbstractSharedFlowKt.EMPTY_RESUMES;
        synchronized (this) {
            if (tryEmitLocked(t)) {
                dVarArrFindSlotsToResumeLocked = findSlotsToResumeLocked(dVarArrFindSlotsToResumeLocked);
                z = true;
            } else {
                z = false;
            }
        }
        for (kotlin.coroutines.d<y> dVar : dVarArrFindSlotsToResumeLocked) {
            if (dVar != null) {
                dVar.resumeWith(y.a);
            }
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:56:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:59:0x00fe A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:60:0x00ff  */
    public final kotlin.coroutines.d<y>[] updateCollectorIndexLocked$kotlinx_coroutines_core(long j) {
        long j2;
        long j3;
        long j4;
        long j5;
        kotlin.coroutines.d<y>[] dVarArr;
        long jMax;
        Object[] objArr;
        AbstractSharedFlowSlot[] abstractSharedFlowSlotArr;
        if (j > this.minCollectorIndex) {
            return AbstractSharedFlowKt.EMPTY_RESUMES;
        }
        long head = getHead();
        long j6 = ((long) this.bufferSize) + head;
        if (this.bufferCapacity == 0 && this.queueSize > 0) {
            j6++;
        }
        int i = 0;
        if (((AbstractSharedFlow) this).nCollectors != 0 && (abstractSharedFlowSlotArr = ((AbstractSharedFlow) this).slots) != null) {
            for (AbstractSharedFlowSlot abstractSharedFlowSlot : abstractSharedFlowSlotArr) {
                if (abstractSharedFlowSlot != null) {
                    long j7 = ((SharedFlowSlot) abstractSharedFlowSlot).index;
                    if (j7 >= 0 && j7 < j6) {
                        j6 = j7;
                    }
                }
            }
        }
        if (j6 <= this.minCollectorIndex) {
            return AbstractSharedFlowKt.EMPTY_RESUMES;
        }
        long bufferEndIndex = getBufferEndIndex();
        int nCollectors = getNCollectors();
        int iMin = this.queueSize;
        if (nCollectors > 0) {
            iMin = Math.min(iMin, this.bufferCapacity - ((int) (bufferEndIndex - j6)));
        }
        kotlin.coroutines.d<y>[] dVarArr2 = AbstractSharedFlowKt.EMPTY_RESUMES;
        long j8 = ((long) this.queueSize) + bufferEndIndex;
        if (iMin > 0) {
            dVarArr2 = new kotlin.coroutines.d[iMin];
            Object[] objArr2 = this.buffer;
            objArr2.getClass();
            j4 = 1;
            long j9 = bufferEndIndex;
            while (true) {
                if (bufferEndIndex >= j8) {
                    j2 = head;
                    j3 = j6;
                    dVarArr = dVarArr2;
                    j5 = j9;
                    break;
                }
                Object bufferAt = SharedFlowKt.getBufferAt(objArr2, bufferEndIndex);
                j2 = head;
                Symbol symbol = SharedFlowKt.NO_VALUE;
                if (bufferAt != symbol) {
                    bufferAt.getClass();
                    Emitter emitter = (Emitter) bufferAt;
                    int i2 = i + 1;
                    j3 = j6;
                    dVarArr2[i] = emitter.cont;
                    SharedFlowKt.setBufferAt(objArr2, bufferEndIndex, symbol);
                    SharedFlowKt.setBufferAt(objArr2, j9, emitter.value);
                    j5 = j9 + 1;
                    if (i2 < iMin) {
                        i = i2;
                        j9 = j5;
                    }
                } else {
                    j3 = j6;
                }
                bufferEndIndex++;
                head = j2;
                j6 = j3;
            }
            int i3 = (int) (j5 - j2);
            if (getNCollectors() == 0) {
                j3 = j5;
            }
            jMax = Math.max(this.replayIndex, j5 - ((long) Math.min(this.replay, i3)));
            if (this.bufferCapacity == 0 && jMax < j8) {
                objArr = this.buffer;
                objArr.getClass();
                if (l.a(SharedFlowKt.getBufferAt(objArr, jMax), SharedFlowKt.NO_VALUE)) {
                    j5 += j4;
                    jMax += j4;
                }
            }
            updateBufferLocked(jMax, j3, j5, j8);
            cleanupTailLocked();
            if (dVarArr.length == 0) {
                return dVarArr;
            }
            return findSlotsToResumeLocked(dVarArr);
        }
        j2 = head;
        j3 = j6;
        j4 = 1;
        j5 = bufferEndIndex;
        dVarArr = dVarArr2;
        int i4 = (int) (j5 - j2);
        if (getNCollectors() == 0) {
            j3 = j5;
        }
        jMax = Math.max(this.replayIndex, j5 - ((long) Math.min(this.replay, i4)));
        if (this.bufferCapacity == 0) {
            objArr = this.buffer;
            objArr.getClass();
            if (l.a(SharedFlowKt.getBufferAt(objArr, jMax), SharedFlowKt.NO_VALUE)) {
                j5 += j4;
                jMax += j4;
            }
        }
        updateBufferLocked(jMax, j3, j5, j8);
        cleanupTailLocked();
        if (dVarArr.length == 0) {
            return dVarArr;
        }
        return findSlotsToResumeLocked(dVarArr);
    }

    public final long updateNewCollectorIndexLocked$kotlinx_coroutines_core() {
        long j = this.replayIndex;
        if (j < this.minCollectorIndex) {
            this.minCollectorIndex = j;
        }
        return j;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    public SharedFlowSlot[] createSlotArray(int i) {
        return new SharedFlowSlot[i];
    }

    public static /* synthetic */ void getLastReplayedLocked$annotations() {
    }
}
