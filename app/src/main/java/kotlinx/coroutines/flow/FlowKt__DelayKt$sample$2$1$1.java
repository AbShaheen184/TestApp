package kotlinx.coroutines.flow;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.functions.p;
import kotlin.jvm.internal.z;
import kotlin.y;
import kotlinx.coroutines.channels.ChannelResult;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.internal.ChildCancelledException;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
@e(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$1", f = "Delay.kt", l = {}, m = "invokeSuspend")
public final class FlowKt__DelayKt$sample$2$1$1 extends i implements p {
    final /* synthetic */ z $lastValue;
    final /* synthetic */ ReceiveChannel<y> $ticker;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$sample$2$1$1(z zVar, ReceiveChannel<y> receiveChannel, kotlin.coroutines.d<? super FlowKt__DelayKt$sample$2$1$1> dVar) {
        super(2, dVar);
        this.$lastValue = zVar;
        this.$ticker = receiveChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<y> create(Object obj, kotlin.coroutines.d<?> dVar) {
        FlowKt__DelayKt$sample$2$1$1 flowKt__DelayKt$sample$2$1$1 = new FlowKt__DelayKt$sample$2$1$1(this.$lastValue, this.$ticker, dVar);
        flowKt__DelayKt$sample$2$1$1.L$0 = obj;
        return flowKt__DelayKt$sample$2$1$1;
    }

    @Override // kotlin.jvm.functions.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m69invokeWpGqRn0(((ChannelResult) obj).m54unboximpl(), (kotlin.coroutines.d) obj2);
    }

    /* JADX INFO: renamed from: invoke-WpGqRn0, reason: not valid java name */
    public final Object m69invokeWpGqRn0(Object obj, kotlin.coroutines.d<? super y> dVar) {
        return ((FlowKt__DelayKt$sample$2$1$1) create(ChannelResult.m42boximpl(obj), dVar)).invokeSuspend(y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        if (this.label != 0) {
            net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.a.e(obj);
        Object objM54unboximpl = ((ChannelResult) this.L$0).m54unboximpl();
        z zVar = this.$lastValue;
        boolean z = objM54unboximpl instanceof ChannelResult.Failed;
        if (!z) {
            zVar.e = objM54unboximpl;
        }
        ReceiveChannel<y> receiveChannel = this.$ticker;
        if (z) {
            Throwable thM46exceptionOrNullimpl = ChannelResult.m46exceptionOrNullimpl(objM54unboximpl);
            if (thM46exceptionOrNullimpl != null) {
                throw thM46exceptionOrNullimpl;
            }
            receiveChannel.cancel((CancellationException) new ChildCancelledException());
            zVar.e = NullSurrogateKt.DONE;
        }
        return y.a;
    }
}
