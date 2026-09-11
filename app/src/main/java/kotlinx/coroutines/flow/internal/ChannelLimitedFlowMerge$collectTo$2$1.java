package kotlinx.coroutines.flow.internal;

import kotlin.a;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.functions.p;
import kotlin.y;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import net.luminis.tls.engine.impl.c;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
@e(c = "kotlinx.coroutines.flow.internal.ChannelLimitedFlowMerge$collectTo$2$1", f = "Merge.kt", l = {Token.LB}, m = "invokeSuspend")
public final class ChannelLimitedFlowMerge$collectTo$2$1 extends i implements p {
    final /* synthetic */ SendingCollector<T> $collector;
    final /* synthetic */ Flow<T> $flow;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ChannelLimitedFlowMerge$collectTo$2$1(Flow<? extends T> flow, SendingCollector<T> sendingCollector, d<? super ChannelLimitedFlowMerge$collectTo$2$1> dVar) {
        super(2, dVar);
        this.$flow = flow;
        this.$collector = sendingCollector;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        return new ChannelLimitedFlowMerge$collectTo$2$1(this.$flow, this.$collector, dVar);
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(CoroutineScope coroutineScope, d<? super y> dVar) {
        return ((ChannelLimitedFlowMerge$collectTo$2$1) create(coroutineScope, dVar)).invokeSuspend(y.a);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        int i = this.label;
        if (i == 0) {
            a.e(obj);
            Flow<T> flow = this.$flow;
            FlowCollector flowCollector = this.$collector;
            this.label = 1;
            Object objCollect = flow.collect(flowCollector, this);
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
            if (objCollect == aVar) {
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
