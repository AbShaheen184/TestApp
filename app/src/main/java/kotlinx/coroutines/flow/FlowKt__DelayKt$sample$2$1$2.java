package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.functions.p;
import kotlin.jvm.internal.z;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
@e(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$2", f = "Delay.kt", l = {293}, m = "invokeSuspend")
public final class FlowKt__DelayKt$sample$2$1$2 extends i implements p {
    final /* synthetic */ FlowCollector<T> $downstream;
    final /* synthetic */ z $lastValue;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__DelayKt$sample$2$1$2(z zVar, FlowCollector<? super T> flowCollector, kotlin.coroutines.d<? super FlowKt__DelayKt$sample$2$1$2> dVar) {
        super(2, dVar);
        this.$lastValue = zVar;
        this.$downstream = flowCollector;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<y> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new FlowKt__DelayKt$sample$2$1$2(this.$lastValue, this.$downstream, dVar);
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(y yVar, kotlin.coroutines.d<? super y> dVar) {
        return ((FlowKt__DelayKt$sample$2$1$2) create(yVar, dVar)).invokeSuspend(y.a);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.d to kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$2 for r5v1 'this'  kotlin.coroutines.d
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // kotlin.coroutines.jvm.internal.a
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.label
            kotlin.y r1 = kotlin.y.a
            r2 = 1
            if (r0 == 0) goto L14
            if (r0 != r2) goto Ld
            kotlin.a.e(r6)
            goto L33
        Ld:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            net.luminis.tls.engine.impl.c.r(r6)
            r6 = 0
            return r6
        L14:
            kotlin.a.e(r6)
            kotlin.jvm.internal.z r6 = r5.$lastValue
            java.lang.Object r0 = r6.e
            if (r0 != 0) goto L1e
            return r1
        L1e:
            r3 = 0
            r6.e = r3
            kotlinx.coroutines.flow.FlowCollector<T> r6 = r5.$downstream
            kotlinx.coroutines.internal.Symbol r4 = kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL
            if (r0 != r4) goto L28
            r0 = r3
        L28:
            r5.label = r2
            java.lang.Object r6 = r6.emit(r0, r5)
            kotlin.coroutines.intrinsics.a r0 = kotlin.coroutines.intrinsics.a.e
            if (r6 != r0) goto L33
            return r0
        L33:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__DelayKt$sample$2$1$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
