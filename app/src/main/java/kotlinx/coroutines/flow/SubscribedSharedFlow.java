package kotlinx.coroutines.flow;

import java.util.List;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.functions.p;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
final class SubscribedSharedFlow<T> implements SharedFlow<T> {
    private final p action;
    private final SharedFlow<T> sharedFlow;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.SubscribedSharedFlow$collect$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @e(c = "kotlinx.coroutines.flow.SubscribedSharedFlow", f = "Share.kt", l = {412}, m = "collect")
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.c {
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ SubscribedSharedFlow<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(SubscribedSharedFlow<T> subscribedSharedFlow, kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(dVar);
            this.this$0 = subscribedSharedFlow;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.collect(null, this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SubscribedSharedFlow(SharedFlow<? extends T> sharedFlow, p pVar) {
        this.sharedFlow = sharedFlow;
        this.action = pVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.SharedFlow, kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector<? super T> flowCollector, kotlin.coroutines.d<?> dVar) {
        AnonymousClass1 anonymousClass1;
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
            kotlin.a.e(obj);
            SharedFlow<T> sharedFlow = this.sharedFlow;
            SubscribedFlowCollector subscribedFlowCollector = new SubscribedFlowCollector(flowCollector, this.action);
            anonymousClass1.label = 1;
            Object objCollect = sharedFlow.collect(subscribedFlowCollector, anonymousClass1);
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
            if (objCollect == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.a.e(obj);
        }
        com.google.gson.b.b();
        return null;
    }

    @Override // kotlinx.coroutines.flow.SharedFlow
    public List<T> getReplayCache() {
        return this.sharedFlow.getReplayCache();
    }
}
