package kotlinx.coroutines.stream;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.stream.Stream;
import kotlin.a;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.c;
import kotlin.coroutines.jvm.internal.e;
import kotlin.y;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
final class StreamFlow<T> implements Flow<T> {
    private static final /* synthetic */ AtomicIntegerFieldUpdater consumed$volatile$FU = AtomicIntegerFieldUpdater.newUpdater(StreamFlow.class, "consumed$volatile");
    private volatile /* synthetic */ int consumed$volatile;
    private final Stream<T> stream;

    /* JADX INFO: renamed from: kotlinx.coroutines.stream.StreamFlow$collect$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @e(c = "kotlinx.coroutines.stream.StreamFlow", f = "Stream.kt", l = {22}, m = "collect")
    public static final class AnonymousClass1 extends c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ StreamFlow<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(StreamFlow<T> streamFlow, d<? super AnonymousClass1> dVar) {
            super(dVar);
            this.this$0 = streamFlow;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.collect(null, this);
        }
    }

    public StreamFlow(Stream<T> stream) {
        this.stream = stream;
    }

    private final /* synthetic */ int getConsumed$volatile() {
        return this.consumed$volatile;
    }

    private final /* synthetic */ void setConsumed$volatile(int i) {
        this.consumed$volatile = i;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector<? super T> flowCollector, d<? super y> dVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
        StreamFlow<T> streamFlow;
        FlowCollector flowCollector2;
        Iterator<T> it;
        if (dVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) dVar;
            int i = anonymousClass1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(this, dVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(this, dVar);
        }
        Object obj = anonymousClass1.result;
        int i2 = anonymousClass1.label;
        if (i2 == 0) {
            a.e(obj);
            if (!consumed$volatile$FU.compareAndSet(this, 0, 1)) {
                net.luminis.tls.engine.impl.c.r("Stream.consumeAsFlow can be collected only once");
                return null;
            }
            try {
                flowCollector2 = flowCollector;
                it = this.stream.iterator();
                streamFlow = this;
            } catch (Throwable th) {
                th = th;
                streamFlow = this;
                streamFlow.stream.close();
                throw th;
            }
        } else {
            if (i2 != 1) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            it = (Iterator) anonymousClass1.L$2;
            FlowCollector flowCollector3 = (FlowCollector) anonymousClass1.L$1;
            streamFlow = (StreamFlow) anonymousClass1.L$0;
            try {
                a.e(obj);
                flowCollector2 = flowCollector3;
            } catch (Throwable th2) {
                th = th2;
                streamFlow.stream.close();
                throw th;
            }
        }
        while (it.hasNext()) {
            T next = it.next();
            anonymousClass1.L$0 = streamFlow;
            anonymousClass1.L$1 = flowCollector2;
            anonymousClass1.L$2 = it;
            anonymousClass1.label = 1;
            Object objEmit = flowCollector2.emit(next, anonymousClass1);
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
            if (objEmit == aVar) {
                return aVar;
            }
        }
        streamFlow.stream.close();
        return y.a;
    }
}
