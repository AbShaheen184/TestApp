package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.functions.l;
import kotlin.y;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
@e(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$2", f = "Delay.kt", l = {}, m = "invokeSuspend")
public final class FlowKt__DelayKt$timeoutInternal$1$1$2 extends i implements l {
    final /* synthetic */ long $timeout;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__DelayKt$timeoutInternal$1$1$2(long j, kotlin.coroutines.d<? super FlowKt__DelayKt$timeoutInternal$1$1$2> dVar) {
        super(1, dVar);
        this.$timeout = j;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<y> create(kotlin.coroutines.d<?> dVar) {
        return new FlowKt__DelayKt$timeoutInternal$1$1$2(this.$timeout, dVar);
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(kotlin.coroutines.d<?> dVar) {
        return ((FlowKt__DelayKt$timeoutInternal$1$1$2) create(dVar)).invokeSuspend(y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.a.e(obj);
        throw new TimeoutCancellationException("Timed out waiting for " + ((Object) kotlin.time.a.k(this.$timeout)));
    }
}
