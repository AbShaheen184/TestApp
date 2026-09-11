package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.functions.p;
import kotlin.jvm.internal.z;
import kotlin.y;
import kotlinx.coroutines.channels.ChannelResult;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
@e(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2", f = "Delay.kt", l = {236}, m = "invokeSuspend")
public final class FlowKt__DelayKt$debounceInternal$1$3$2 extends i implements p {
    final /* synthetic */ FlowCollector<T> $downstream;
    final /* synthetic */ z $lastValue;
    /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__DelayKt$debounceInternal$1$3$2(z zVar, FlowCollector<? super T> flowCollector, kotlin.coroutines.d<? super FlowKt__DelayKt$debounceInternal$1$3$2> dVar) {
        super(2, dVar);
        this.$lastValue = zVar;
        this.$downstream = flowCollector;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<y> create(Object obj, kotlin.coroutines.d<?> dVar) {
        FlowKt__DelayKt$debounceInternal$1$3$2 flowKt__DelayKt$debounceInternal$1$3$2 = new FlowKt__DelayKt$debounceInternal$1$3$2(this.$lastValue, this.$downstream, dVar);
        flowKt__DelayKt$debounceInternal$1$3$2.L$0 = obj;
        return flowKt__DelayKt$debounceInternal$1$3$2;
    }

    @Override // kotlin.jvm.functions.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m68invokeWpGqRn0(((ChannelResult) obj).m54unboximpl(), (kotlin.coroutines.d) obj2);
    }

    /* JADX INFO: renamed from: invoke-WpGqRn0, reason: not valid java name */
    public final Object m68invokeWpGqRn0(Object obj, kotlin.coroutines.d<? super y> dVar) {
        return ((FlowKt__DelayKt$debounceInternal$1$3$2) create(ChannelResult.m42boximpl(obj), dVar)).invokeSuspend(y.a);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.d to kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2 for r5v1 'this'  kotlin.coroutines.d
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
            r1 = 1
            if (r0 == 0) goto L16
            if (r0 != r1) goto Lf
            java.lang.Object r0 = r5.L$1
            kotlin.jvm.internal.z r0 = (kotlin.jvm.internal.z) r0
            kotlin.a.e(r6)
            goto L4b
        Lf:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            net.luminis.tls.engine.impl.c.r(r6)
            r6 = 0
            return r6
        L16:
            kotlin.a.e(r6)
            java.lang.Object r6 = r5.L$0
            kotlinx.coroutines.channels.ChannelResult r6 = (kotlinx.coroutines.channels.ChannelResult) r6
            java.lang.Object r6 = r6.m54unboximpl()
            kotlin.jvm.internal.z r0 = r5.$lastValue
            boolean r2 = r6 instanceof kotlinx.coroutines.channels.ChannelResult.Failed
            if (r2 != 0) goto L29
            r0.e = r6
        L29:
            kotlinx.coroutines.flow.FlowCollector<T> r3 = r5.$downstream
            if (r2 == 0) goto L51
            java.lang.Throwable r2 = kotlinx.coroutines.channels.ChannelResult.m46exceptionOrNullimpl(r6)
            if (r2 != 0) goto L50
            java.lang.Object r2 = r0.e
            if (r2 == 0) goto L4b
            kotlinx.coroutines.internal.Symbol r4 = kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL
            if (r2 != r4) goto L3c
            r2 = 0
        L3c:
            r5.L$0 = r6
            r5.L$1 = r0
            r5.label = r1
            java.lang.Object r6 = r3.emit(r2, r5)
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.e
            if (r6 != r1) goto L4b
            return r1
        L4b:
            kotlinx.coroutines.internal.Symbol r6 = kotlinx.coroutines.flow.internal.NullSurrogateKt.DONE
            r0.e = r6
            goto L51
        L50:
            throw r2
        L51:
            kotlin.y r6 = kotlin.y.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
