package kotlinx.coroutines.flow.internal;

import kotlin.a;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.functions.p;
import kotlin.jvm.functions.q;
import kotlin.y;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import net.luminis.tls.engine.impl.c;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
@e(c = "kotlinx.coroutines.flow.internal.FlowCoroutineKt$scopedFlow$1$1", f = "FlowCoroutine.kt", l = {Token.NULL}, m = "invokeSuspend")
public final class FlowCoroutineKt$scopedFlow$1$1 extends i implements p {
    final /* synthetic */ q $block;
    final /* synthetic */ FlowCollector<R> $this_flow;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowCoroutineKt$scopedFlow$1$1(q qVar, FlowCollector<? super R> flowCollector, d<? super FlowCoroutineKt$scopedFlow$1$1> dVar) {
        super(2, dVar);
        this.$block = qVar;
        this.$this_flow = flowCollector;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        FlowCoroutineKt$scopedFlow$1$1 flowCoroutineKt$scopedFlow$1$1 = new FlowCoroutineKt$scopedFlow$1$1(this.$block, this.$this_flow, dVar);
        flowCoroutineKt$scopedFlow$1$1.L$0 = obj;
        return flowCoroutineKt$scopedFlow$1$1;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super y> dVar) {
        return ((FlowCoroutineKt$scopedFlow$1$1) create(coroutineScope, dVar)).invokeSuspend(y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            a.e(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            q qVar = this.$block;
            Object obj2 = this.$this_flow;
            this.label = 1;
            Object objInvoke = qVar.invoke(coroutineScope, obj2, this);
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
            if (objInvoke == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            a.e(obj);
        }
        return y.a;
    }
}
