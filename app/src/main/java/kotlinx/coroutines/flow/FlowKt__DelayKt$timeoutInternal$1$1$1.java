package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.functions.p;
import kotlin.y;
import kotlinx.coroutines.channels.ChannelResult;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
@e(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$1", f = "Delay.kt", l = {395}, m = "invokeSuspend")
public final class FlowKt__DelayKt$timeoutInternal$1$1$1 extends i implements p {
    final /* synthetic */ FlowCollector<T> $downStream;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__DelayKt$timeoutInternal$1$1$1(FlowCollector<? super T> flowCollector, kotlin.coroutines.d<? super FlowKt__DelayKt$timeoutInternal$1$1$1> dVar) {
        super(2, dVar);
        this.$downStream = flowCollector;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<y> create(Object obj, kotlin.coroutines.d<?> dVar) {
        FlowKt__DelayKt$timeoutInternal$1$1$1 flowKt__DelayKt$timeoutInternal$1$1$1 = new FlowKt__DelayKt$timeoutInternal$1$1$1(this.$downStream, dVar);
        flowKt__DelayKt$timeoutInternal$1$1$1.L$0 = obj;
        return flowKt__DelayKt$timeoutInternal$1$1$1;
    }

    @Override // kotlin.jvm.functions.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return m70invokeWpGqRn0(((ChannelResult) obj).m54unboximpl(), (kotlin.coroutines.d) obj2);
    }

    /* JADX INFO: renamed from: invoke-WpGqRn0, reason: not valid java name */
    public final Object m70invokeWpGqRn0(Object obj, kotlin.coroutines.d<? super Boolean> dVar) {
        return ((FlowKt__DelayKt$timeoutInternal$1$1$1) create(ChannelResult.m42boximpl(obj), dVar)).invokeSuspend(y.a);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.d to kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$1 for r3v1 'this'  kotlin.coroutines.d
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
            if (r0 == 0) goto L14
            if (r0 != r1) goto Ld
            java.lang.Object r0 = r3.L$0
            kotlin.a.e(r4)
            goto L32
        Ld:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            net.luminis.tls.engine.impl.c.r(r4)
            r4 = 0
            return r4
        L14:
            kotlin.a.e(r4)
            java.lang.Object r4 = r3.L$0
            kotlinx.coroutines.channels.ChannelResult r4 = (kotlinx.coroutines.channels.ChannelResult) r4
            java.lang.Object r0 = r4.m54unboximpl()
            kotlinx.coroutines.flow.FlowCollector<T> r4 = r3.$downStream
            boolean r2 = r0 instanceof kotlinx.coroutines.channels.ChannelResult.Failed
            if (r2 != 0) goto L32
            r3.L$0 = r0
            r3.label = r1
            java.lang.Object r4 = r4.emit(r0, r3)
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.e
            if (r4 != r1) goto L32
            return r1
        L32:
            boolean r4 = r0 instanceof kotlinx.coroutines.channels.ChannelResult.Closed
            if (r4 == 0) goto L40
            java.lang.Throwable r4 = kotlinx.coroutines.channels.ChannelResult.m46exceptionOrNullimpl(r0)
            if (r4 != 0) goto L3f
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            return r4
        L3f:
            throw r4
        L40:
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
