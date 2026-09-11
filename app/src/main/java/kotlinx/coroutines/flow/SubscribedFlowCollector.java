package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.functions.p;
import kotlin.y;
import kotlinx.coroutines.flow.internal.SafeCollector;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class SubscribedFlowCollector<T> implements FlowCollector<T> {
    private final p action;
    private final FlowCollector<T> collector;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.SubscribedFlowCollector$onSubscription$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @e(c = "kotlinx.coroutines.flow.SubscribedFlowCollector", f = "Share.kt", l = {422, 426}, m = "onSubscription")
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SubscribedFlowCollector<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SubscribedFlowCollector<T> subscribedFlowCollector, kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(dVar);
            this.this$0 = subscribedFlowCollector;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.onSubscription(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SubscribedFlowCollector(FlowCollector<? super T> flowCollector, p pVar) {
        this.collector = flowCollector;
        this.action = pVar;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public Object emit(T t, kotlin.coroutines.d<? super y> dVar) {
        return this.collector.emit(t, dVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [kotlinx.coroutines.flow.internal.SafeCollector] */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean] */
    public final Object onSubscription(kotlin.coroutines.d<? super y> dVar) {
        AnonymousClass1 anonymousClass1;
        SafeCollector safeCollector;
        SubscribedFlowCollector<T> subscribedFlowCollector;
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
        ?? r1 = anonymousClass1.label;
        y yVar = y.a;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        try {
            if (r1 == 0) {
                kotlin.a.e(obj);
                safeCollector = new SafeCollector(this.collector, anonymousClass1.getContext());
                p pVar = this.action;
                anonymousClass1.L$0 = this;
                anonymousClass1.L$1 = safeCollector;
                anonymousClass1.label = 1;
                if (pVar.invoke(safeCollector, anonymousClass1) != aVar) {
                    subscribedFlowCollector = this;
                }
                return aVar;
            }
            if (r1 != 1) {
                if (r1 == 2) {
                    kotlin.a.e(obj);
                    return yVar;
                }
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            safeCollector = (SafeCollector) anonymousClass1.L$1;
            subscribedFlowCollector = (SubscribedFlowCollector) anonymousClass1.L$0;
            kotlin.a.e(obj);
            safeCollector.releaseIntercepted();
            FlowCollector<T> flowCollector = subscribedFlowCollector.collector;
            r1 = flowCollector instanceof SubscribedFlowCollector;
            if (r1 != 0) {
                anonymousClass1.L$0 = null;
                anonymousClass1.L$1 = null;
                anonymousClass1.label = 2;
                if (((SubscribedFlowCollector) flowCollector).onSubscription(anonymousClass1) == aVar) {
                    return aVar;
                }
            }
            return yVar;
        } catch (Throwable th) {
            r1.releaseIntercepted();
            throw th;
        }
    }
}
