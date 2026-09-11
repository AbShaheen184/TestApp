package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.functions.l;
import kotlin.jvm.internal.z;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
@e(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$1", f = "Delay.kt", l = {226}, m = "invokeSuspend")
public final class FlowKt__DelayKt$debounceInternal$1$3$1 extends i implements l {
    final /* synthetic */ FlowCollector<T> $downstream;
    final /* synthetic */ z $lastValue;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__DelayKt$debounceInternal$1$3$1(FlowCollector<? super T> flowCollector, z zVar, kotlin.coroutines.d<? super FlowKt__DelayKt$debounceInternal$1$3$1> dVar) {
        super(1, dVar);
        this.$downstream = flowCollector;
        this.$lastValue = zVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<y> create(kotlin.coroutines.d<?> dVar) {
        return new FlowKt__DelayKt$debounceInternal$1$3$1(this.$downstream, this.$lastValue, dVar);
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(kotlin.coroutines.d<? super y> dVar) {
        return ((FlowKt__DelayKt$debounceInternal$1$3$1) create(dVar)).invokeSuspend(y.a);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.d to kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$1 for r4v1 'this'  kotlin.coroutines.d
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // kotlin.coroutines.jvm.internal.a
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.label
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L13
            if (r0 != r2) goto Lc
            kotlin.a.e(r5)
            goto L2c
        Lc:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            net.luminis.tls.engine.impl.c.r(r5)
            r5 = 0
            return r5
        L13:
            kotlin.a.e(r5)
            kotlinx.coroutines.flow.FlowCollector<T> r5 = r4.$downstream
            kotlinx.coroutines.internal.Symbol r0 = kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL
            kotlin.jvm.internal.z r3 = r4.$lastValue
            java.lang.Object r3 = r3.e
            if (r3 != r0) goto L21
            r3 = r1
        L21:
            r4.label = r2
            java.lang.Object r5 = r5.emit(r3, r4)
            kotlin.coroutines.intrinsics.a r0 = kotlin.coroutines.intrinsics.a.e
            if (r5 != r0) goto L2c
            return r0
        L2c:
            kotlin.jvm.internal.z r5 = r4.$lastValue
            r5.e = r1
            kotlin.y r5 = kotlin.y.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
