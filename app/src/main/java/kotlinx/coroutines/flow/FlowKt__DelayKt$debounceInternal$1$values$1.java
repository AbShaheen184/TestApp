package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.functions.p;
import kotlin.y;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
@e(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1", f = "Delay.kt", l = {204}, m = "invokeSuspend")
public final class FlowKt__DelayKt$debounceInternal$1$values$1 extends i implements p {
    final /* synthetic */ Flow<T> $this_debounceInternal;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    public static final class AnonymousClass1<T> implements FlowCollector {
        final /* synthetic */ ProducerScope<Object> $$this$produce;

        public AnonymousClass1(ProducerScope<Object> producerScope) {
            this.$$this$produce = producerScope;
        }

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
            FlowKt__DelayKt$debounceInternal$1$values$1$1$emit$1 flowKt__DelayKt$debounceInternal$1$values$1$1$emit$1;
            if (dVar instanceof FlowKt__DelayKt$debounceInternal$1$values$1$1$emit$1) {
                flowKt__DelayKt$debounceInternal$1$values$1$1$emit$1 = (FlowKt__DelayKt$debounceInternal$1$values$1$1$emit$1) dVar;
                int i = flowKt__DelayKt$debounceInternal$1$values$1$1$emit$1.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    flowKt__DelayKt$debounceInternal$1$values$1$1$emit$1.label = i - Integer.MIN_VALUE;
                } else {
                    flowKt__DelayKt$debounceInternal$1$values$1$1$emit$1 = new FlowKt__DelayKt$debounceInternal$1$values$1$1$emit$1(this, dVar);
                }
            } else {
                flowKt__DelayKt$debounceInternal$1$values$1$1$emit$1 = new FlowKt__DelayKt$debounceInternal$1$values$1$1$emit$1(this, dVar);
            }
            Object obj = flowKt__DelayKt$debounceInternal$1$values$1$1$emit$1.result;
            int i2 = flowKt__DelayKt$debounceInternal$1$values$1$1$emit$1.label;
            if (i2 == 0) {
                kotlin.a.e(obj);
                ProducerScope<Object> producerScope = this.$$this$produce;
                if (t == null) {
                    t = (T) NullSurrogateKt.NULL;
                }
                flowKt__DelayKt$debounceInternal$1$values$1$1$emit$1.label = 1;
                Object objSend = producerScope.send(t, flowKt__DelayKt$debounceInternal$1$values$1$1$emit$1);
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                if (objSend == aVar) {
                    return aVar;
                }
            } else {
                if (i2 != 1) {
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(obj);
            }
            return y.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__DelayKt$debounceInternal$1$values$1(Flow<? extends T> flow, kotlin.coroutines.d<? super FlowKt__DelayKt$debounceInternal$1$values$1> dVar) {
        super(2, dVar);
        this.$this_debounceInternal = flow;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<y> create(Object obj, kotlin.coroutines.d<?> dVar) {
        FlowKt__DelayKt$debounceInternal$1$values$1 flowKt__DelayKt$debounceInternal$1$values$1 = new FlowKt__DelayKt$debounceInternal$1$values$1(this.$this_debounceInternal, dVar);
        flowKt__DelayKt$debounceInternal$1$values$1.L$0 = obj;
        return flowKt__DelayKt$debounceInternal$1$values$1;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(ProducerScope<Object> producerScope, kotlin.coroutines.d<? super y> dVar) {
        return ((FlowKt__DelayKt$debounceInternal$1$values$1) create(producerScope, dVar)).invokeSuspend(y.a);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.d to kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1 for r3v1 'this'  kotlin.coroutines.d
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // kotlin.coroutines.jvm.internal.a
    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
        /*
            r3 = this;
            int r0 = r3.label
            r1 = 1
            if (r0 == 0) goto L12
            if (r0 != r1) goto Lb
            kotlin.a.e(r4)
            goto L2b
        Lb:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            net.luminis.tls.engine.impl.c.r(r4)
            r4 = 0
            return r4
        L12:
            kotlin.a.e(r4)
            java.lang.Object r4 = r3.L$0
            kotlinx.coroutines.channels.ProducerScope r4 = (kotlinx.coroutines.channels.ProducerScope) r4
            kotlinx.coroutines.flow.Flow<T> r0 = r3.$this_debounceInternal
            kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1$1 r2 = new kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1$1
            r2.<init>(r4)
            r3.label = r1
            java.lang.Object r4 = r0.collect(r2, r3)
            kotlin.coroutines.intrinsics.a r0 = kotlin.coroutines.intrinsics.a.e
            if (r4 != r0) goto L2b
            return r0
        L2b:
            kotlin.y r4 = kotlin.y.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$values$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
