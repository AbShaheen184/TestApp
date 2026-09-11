package kotlinx.coroutines.flow;

import kotlin.coroutines.i;
import kotlin.coroutines.j;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.functions.p;
import kotlin.jvm.internal.f;
import kotlin.y;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.internal.ChannelFlow;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
final class CallbackFlowBuilder<T> extends ChannelFlowBuilder<T> {
    private final p block;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.CallbackFlowBuilder$collectTo$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    @e(c = "kotlinx.coroutines.flow.CallbackFlowBuilder", f = "Builders.kt", l = {330}, m = "collectTo")
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.c {
        Object L$0;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ CallbackFlowBuilder<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(CallbackFlowBuilder<T> callbackFlowBuilder, kotlin.coroutines.d<? super AnonymousClass1> dVar) {
            super(dVar);
            this.this$0 = callbackFlowBuilder;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.collectTo(null, this);
        }
    }

    public /* synthetic */ CallbackFlowBuilder(p pVar, i iVar, int i, BufferOverflow bufferOverflow, int i2, f fVar) {
        this(pVar, (i2 & 2) != 0 ? j.e : iVar, (i2 & 4) != 0 ? -2 : i, (i2 & 8) != 0 ? BufferOverflow.SUSPEND : bufferOverflow);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // kotlinx.coroutines.flow.ChannelFlowBuilder, kotlinx.coroutines.flow.internal.ChannelFlow
    public Object collectTo(ProducerScope<? super T> producerScope, kotlin.coroutines.d<? super y> dVar) {
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
            anonymousClass1.L$0 = producerScope;
            anonymousClass1.label = 1;
            Object objCollectTo = super.collectTo(producerScope, anonymousClass1);
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
            if (objCollectTo == aVar) {
                return aVar;
            }
        } else {
            if (i2 != 1) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            producerScope = (ProducerScope) anonymousClass1.L$0;
            kotlin.a.e(obj);
        }
        if (producerScope.isClosedForSend()) {
            return y.a;
        }
        net.luminis.tls.engine.impl.c.r("'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details.");
        return null;
    }

    @Override // kotlinx.coroutines.flow.ChannelFlowBuilder, kotlinx.coroutines.flow.internal.ChannelFlow
    public ChannelFlow<T> create(i iVar, int i, BufferOverflow bufferOverflow) {
        return new CallbackFlowBuilder(this.block, iVar, i, bufferOverflow);
    }

    public CallbackFlowBuilder(p pVar, i iVar, int i, BufferOverflow bufferOverflow) {
        super(pVar, iVar, i, bufferOverflow);
        this.block = pVar;
    }
}
