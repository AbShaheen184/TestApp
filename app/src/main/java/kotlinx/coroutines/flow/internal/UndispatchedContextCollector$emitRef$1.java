package kotlinx.coroutines.flow.internal;

import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.functions.p;
import kotlin.y;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
@e(c = "kotlinx.coroutines.flow.internal.UndispatchedContextCollector$emitRef$1", f = "ChannelFlow.kt", l = {208}, m = "invokeSuspend")
public final class UndispatchedContextCollector$emitRef$1 extends i implements p {
    final /* synthetic */ FlowCollector<T> $downstream;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public UndispatchedContextCollector$emitRef$1(FlowCollector<? super T> flowCollector, d<? super UndispatchedContextCollector$emitRef$1> dVar) {
        super(2, dVar);
        this.$downstream = flowCollector;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<y> create(Object obj, d<?> dVar) {
        UndispatchedContextCollector$emitRef$1 undispatchedContextCollector$emitRef$1 = new UndispatchedContextCollector$emitRef$1(this.$downstream, dVar);
        undispatchedContextCollector$emitRef$1.L$0 = obj;
        return undispatchedContextCollector$emitRef$1;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(T t, d<? super y> dVar) {
        return ((UndispatchedContextCollector$emitRef$1) create(t, dVar)).invokeSuspend(y.a);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.d to kotlinx.coroutines.flow.internal.UndispatchedContextCollector$emitRef$1 for r2v1 'this'  kotlin.coroutines.d
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // kotlin.coroutines.jvm.internal.a
    public final java.lang.Object invokeSuspend(java.lang.Object r3) {
        /*
            r2 = this;
            int r0 = r2.label
            r1 = 1
            if (r0 == 0) goto L12
            if (r0 != r1) goto Lb
            kotlin.a.e(r3)
            goto L24
        Lb:
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            net.luminis.tls.engine.impl.c.r(r3)
            r3 = 0
            return r3
        L12:
            kotlin.a.e(r3)
            java.lang.Object r3 = r2.L$0
            kotlinx.coroutines.flow.FlowCollector<T> r0 = r2.$downstream
            r2.label = r1
            java.lang.Object r3 = r0.emit(r3, r2)
            kotlin.coroutines.intrinsics.a r0 = kotlin.coroutines.intrinsics.a.e
            if (r3 != r0) goto L24
            return r0
        L24:
            kotlin.y r3 = kotlin.y.a
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.UndispatchedContextCollector$emitRef$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
