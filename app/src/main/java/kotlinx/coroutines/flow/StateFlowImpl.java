package kotlinx.coroutines.flow;

import java.util.List;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.coroutines.i;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.internal.l;
import kotlin.y;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.AbstractSharedFlow;
import kotlinx.coroutines.flow.internal.FusibleFlow;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;
import kotlinx.coroutines.internal.Symbol;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
final class StateFlowImpl<T> extends AbstractSharedFlow<StateFlowSlot> implements MutableStateFlow<T>, CancellableFlow<T>, FusibleFlow<T> {
    private static final /* synthetic */ AtomicReferenceFieldUpdater _state$volatile$FU = AtomicReferenceFieldUpdater.newUpdater(StateFlowImpl.class, Object.class, "_state$volatile");
    private volatile /* synthetic */ Object _state$volatile;
    private int sequence;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.StateFlowImpl$collect$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @e(c = "kotlinx.coroutines.flow.StateFlowImpl", f = "StateFlow.kt", l = {389, 401, 406}, m = "collect")
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ StateFlowImpl<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(StateFlowImpl<T> stateFlowImpl, kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(dVar);
            this.this$0 = stateFlowImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.collect(null, this);
        }
    }

    public StateFlowImpl(Object obj) {
        this._state$volatile = obj;
    }

    private final /* synthetic */ Object get_state$volatile() {
        return this._state$volatile;
    }

    private final /* synthetic */ void set_state$volatile(Object obj) {
        this._state$volatile = obj;
    }

    private final boolean updateState(Object obj, Object obj2) {
        int i;
        StateFlowSlot[] slots;
        synchronized (this) {
            Object obj3 = _state$volatile$FU.get(this);
            if (obj != null && !l.a(obj3, obj)) {
                return false;
            }
            if (l.a(obj3, obj2)) {
                return true;
            }
            _state$volatile$FU.set(this, obj2);
            int i2 = this.sequence;
            if ((i2 & 1) != 0) {
                this.sequence = i2 + 2;
                return true;
            }
            int i3 = i2 + 1;
            this.sequence = i3;
            StateFlowSlot[] slots2 = getSlots();
            while (true) {
                StateFlowSlot[] stateFlowSlotArr = slots2;
                if (stateFlowSlotArr != null) {
                    for (StateFlowSlot stateFlowSlot : stateFlowSlotArr) {
                        if (stateFlowSlot != null) {
                            stateFlowSlot.makePending();
                        }
                    }
                }
                synchronized (this) {
                    i = this.sequence;
                    if (i == i3) {
                        this.sequence = i3 + 1;
                        return true;
                    }
                    slots = getSlots();
                }
                slots2 = slots;
                i3 = i;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00a9 A[Catch: all -> 0x0041, PHI: r1 r5 r7 r8 r11
  0x00a9: PHI (r1v8 kotlinx.coroutines.Job) = 
  (r1v6 kotlinx.coroutines.Job)
  (r1v7 kotlinx.coroutines.Job)
  (r1v7 kotlinx.coroutines.Job)
  (r1v13 kotlinx.coroutines.Job)
 binds: [B:35:0x009a, B:51:0x00dd, B:53:0x00ef, B:14:0x003c] A[DONT_GENERATE, DONT_INLINE]
  0x00a9: PHI (r5v7 ??) = (r5v14 ??), (r5v15 ??), (r5v16 ??), (r5v17 ??) binds: [B:35:0x009a, B:51:0x00dd, B:53:0x00ef, B:14:0x003c] A[DONT_GENERATE, DONT_INLINE]
  0x00a9: PHI (r7v2 ??) = (r7v0 ??), (r7v7 ??), (r7v8 ??), (r7v9 ??) binds: [B:35:0x009a, B:51:0x00dd, B:53:0x00ef, B:14:0x003c] A[DONT_GENERATE, DONT_INLINE]
  0x00a9: PHI (r8v6 kotlinx.coroutines.flow.StateFlowImpl<T>) = 
  (r8v4 kotlinx.coroutines.flow.StateFlowImpl<T>)
  (r8v5 kotlinx.coroutines.flow.StateFlowImpl<T>)
  (r8v5 kotlinx.coroutines.flow.StateFlowImpl<T>)
  (r8v12 kotlinx.coroutines.flow.StateFlowImpl<T>)
 binds: [B:35:0x009a, B:51:0x00dd, B:53:0x00ef, B:14:0x003c] A[DONT_GENERATE, DONT_INLINE]
  0x00a9: PHI (r11v7 java.lang.Object) = (r11v5 java.lang.Object), (r11v6 java.lang.Object), (r11v6 java.lang.Object), (r11v20 java.lang.Object) binds: [B:35:0x009a, B:51:0x00dd, B:53:0x00ef, B:14:0x003c] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0041, blocks: (B:14:0x003c, B:36:0x00a9, B:38:0x00b3, B:40:0x00b8, B:50:0x00d9, B:52:0x00df, B:42:0x00be, B:46:0x00c5, B:21:0x005d, B:24:0x0070, B:35:0x009a), top: B:57:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00b3 A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:14:0x003c, B:36:0x00a9, B:38:0x00b3, B:40:0x00b8, B:50:0x00d9, B:52:0x00df, B:42:0x00be, B:46:0x00c5, B:21:0x005d, B:24:0x0070, B:35:0x009a), top: B:57:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00b8 A[Catch: all -> 0x0041, TryCatch #0 {all -> 0x0041, blocks: (B:14:0x003c, B:36:0x00a9, B:38:0x00b3, B:40:0x00b8, B:50:0x00d9, B:52:0x00df, B:42:0x00be, B:46:0x00c5, B:21:0x005d, B:24:0x0070, B:35:0x009a), top: B:57:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:44:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:45:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:48:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:49:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:52:0x00df A[Catch: all -> 0x0041, TRY_LEAVE, TryCatch #0 {all -> 0x0041, blocks: (B:14:0x003c, B:36:0x00a9, B:38:0x00b3, B:40:0x00b8, B:50:0x00d9, B:52:0x00df, B:42:0x00be, B:46:0x00c5, B:21:0x005d, B:24:0x0070, B:35:0x009a), top: B:57:0x0022 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v2, types: [kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot] */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object, kotlinx.coroutines.flow.StateFlowSlot] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, kotlinx.coroutines.flow.FlowCollector] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00dd -> B:36:0x00a9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x00ef -> B:36:0x00a9). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlinx.coroutines.flow.SharedFlow, kotlinx.coroutines.flow.Flow
    public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super T> r11, kotlin.coroutines.d<?> r12) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.StateFlowImpl.collect(kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.d):java.lang.Object");
    }

    @Override // kotlinx.coroutines.flow.MutableStateFlow
    public boolean compareAndSet(T t, T t2) {
        if (t == null) {
            t = (T) NullSurrogateKt.NULL;
        }
        if (t2 == null) {
            t2 = (T) NullSurrogateKt.NULL;
        }
        return updateState(t, t2);
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    public StateFlowSlot createSlot() {
        return new StateFlowSlot();
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow, kotlinx.coroutines.flow.FlowCollector
    public Object emit(T t, kotlin.coroutines.d<? super y> dVar) {
        setValue(t);
        return y.a;
    }

    @Override // kotlinx.coroutines.flow.internal.FusibleFlow
    public Flow<T> fuse(i iVar, int i, BufferOverflow bufferOverflow) {
        return StateFlowKt.fuseStateFlow(this, iVar, i, bufferOverflow);
    }

    @Override // kotlinx.coroutines.flow.SharedFlow
    public List<T> getReplayCache() {
        return com.google.common.base.c.p(getValue());
    }

    @Override // kotlinx.coroutines.flow.MutableStateFlow, kotlinx.coroutines.flow.StateFlow
    public T getValue() {
        Symbol symbol = NullSurrogateKt.NULL;
        T t = (T) _state$volatile$FU.get(this);
        if (t == symbol) {
            return null;
        }
        return t;
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    public void resetReplayCache() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    @Override // kotlinx.coroutines.flow.MutableStateFlow
    public void setValue(T t) {
        if (t == null) {
            t = (T) NullSurrogateKt.NULL;
        }
        updateState(null, t);
    }

    @Override // kotlinx.coroutines.flow.MutableSharedFlow
    public boolean tryEmit(T t) {
        setValue(t);
        return true;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractSharedFlow
    public StateFlowSlot[] createSlotArray(int i) {
        return new StateFlowSlot[i];
    }
}
