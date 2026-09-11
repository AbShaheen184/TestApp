package kotlinx.coroutines.flow;

import kotlin.jvm.functions.p;
import kotlin.jvm.internal.v;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class FlowKt__LimitKt$dropWhile$1$1<T> implements FlowCollector {
    final /* synthetic */ v $matched;
    final /* synthetic */ p $predicate;
    final /* synthetic */ FlowCollector<T> $this_flow;

    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__LimitKt$dropWhile$1$1(v vVar, FlowCollector<? super T> flowCollector, p pVar) {
        this.$matched = vVar;
        this.$this_flow = flowCollector;
        this.$predicate = pVar;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0071  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
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
    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(T t, kotlin.coroutines.d<? super y> dVar) {
        FlowKt__LimitKt$dropWhile$1$1$emit$1 flowKt__LimitKt$dropWhile$1$1$emit$1;
        FlowKt__LimitKt$dropWhile$1$1<T> flowKt__LimitKt$dropWhile$1$1;
        FlowCollector<T> flowCollector;
        if (dVar instanceof FlowKt__LimitKt$dropWhile$1$1$emit$1) {
            flowKt__LimitKt$dropWhile$1$1$emit$1 = (FlowKt__LimitKt$dropWhile$1$1$emit$1) dVar;
            int i = flowKt__LimitKt$dropWhile$1$1$emit$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                flowKt__LimitKt$dropWhile$1$1$emit$1.label = i - Integer.MIN_VALUE;
            } else {
                flowKt__LimitKt$dropWhile$1$1$emit$1 = new FlowKt__LimitKt$dropWhile$1$1$emit$1(this, dVar);
            }
        } else {
            flowKt__LimitKt$dropWhile$1$1$emit$1 = new FlowKt__LimitKt$dropWhile$1$1$emit$1(this, dVar);
        }
        Object objInvoke = flowKt__LimitKt$dropWhile$1$1$emit$1.result;
        int i2 = flowKt__LimitKt$dropWhile$1$1$emit$1.label;
        y yVar = y.a;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        if (i2 != 0) {
            if (i2 == 1) {
                kotlin.a.e(objInvoke);
                return yVar;
            }
            if (i2 == 2) {
                t = (T) flowKt__LimitKt$dropWhile$1$1$emit$1.L$1;
                flowKt__LimitKt$dropWhile$1$1 = (FlowKt__LimitKt$dropWhile$1$1) flowKt__LimitKt$dropWhile$1$1$emit$1.L$0;
                kotlin.a.e(objInvoke);
                if (!((Boolean) objInvoke).booleanValue()) {
                    flowKt__LimitKt$dropWhile$1$1.$matched.e = true;
                    flowCollector = flowKt__LimitKt$dropWhile$1$1.$this_flow;
                    flowKt__LimitKt$dropWhile$1$1$emit$1.L$0 = null;
                    flowKt__LimitKt$dropWhile$1$1$emit$1.L$1 = null;
                    flowKt__LimitKt$dropWhile$1$1$emit$1.label = 3;
                    if (flowCollector.emit(t, flowKt__LimitKt$dropWhile$1$1$emit$1) == aVar) {
                        return aVar;
                    }
                }
            } else {
                if (i2 != 3) {
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(objInvoke);
            }
            return yVar;
        }
        kotlin.a.e(objInvoke);
        if (this.$matched.e) {
            FlowCollector<T> flowCollector2 = this.$this_flow;
            flowKt__LimitKt$dropWhile$1$1$emit$1.label = 1;
            if (flowCollector2.emit(t, flowKt__LimitKt$dropWhile$1$1$emit$1) != aVar) {
                return yVar;
            }
        } else {
            p pVar = this.$predicate;
            flowKt__LimitKt$dropWhile$1$1$emit$1.L$0 = this;
            flowKt__LimitKt$dropWhile$1$1$emit$1.L$1 = t;
            flowKt__LimitKt$dropWhile$1$1$emit$1.label = 2;
            objInvoke = pVar.invoke(t, flowKt__LimitKt$dropWhile$1$1$emit$1);
            if (objInvoke != aVar) {
                flowKt__LimitKt$dropWhile$1$1 = this;
                if (!((Boolean) objInvoke).booleanValue()) {
                    flowKt__LimitKt$dropWhile$1$1.$matched.e = true;
                    flowCollector = flowKt__LimitKt$dropWhile$1$1.$this_flow;
                    flowKt__LimitKt$dropWhile$1$1$emit$1.L$0 = null;
                    flowKt__LimitKt$dropWhile$1$1$emit$1.L$1 = null;
                    flowKt__LimitKt$dropWhile$1$1$emit$1.label = 3;
                    if (flowCollector.emit(t, flowKt__LimitKt$dropWhile$1$1$emit$1) == aVar) {
                    }
                }
                return yVar;
            }
        }
        return aVar;
    }
}
