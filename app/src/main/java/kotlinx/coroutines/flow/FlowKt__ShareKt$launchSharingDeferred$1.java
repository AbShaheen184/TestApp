package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.functions.p;
import kotlin.m;
import kotlin.y;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
@e(c = "kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1", f = "Share.kt", l = {337}, m = "invokeSuspend")
public final class FlowKt__ShareKt$launchSharingDeferred$1 extends i implements p {
    final /* synthetic */ CompletableDeferred<m> $result;
    final /* synthetic */ Flow<T> $upstream;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__ShareKt$launchSharingDeferred$1(Flow<? extends T> flow, CompletableDeferred<m> completableDeferred, kotlin.coroutines.d<? super FlowKt__ShareKt$launchSharingDeferred$1> dVar) {
        super(2, dVar);
        this.$upstream = flow;
        this.$result = completableDeferred;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<y> create(Object obj, kotlin.coroutines.d<?> dVar) {
        FlowKt__ShareKt$launchSharingDeferred$1 flowKt__ShareKt$launchSharingDeferred$1 = new FlowKt__ShareKt$launchSharingDeferred$1(this.$upstream, this.$result, dVar);
        flowKt__ShareKt$launchSharingDeferred$1.L$0 = obj;
        return flowKt__ShareKt$launchSharingDeferred$1;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(CoroutineScope coroutineScope, kotlin.coroutines.d<? super y> dVar) {
        return ((FlowKt__ShareKt$launchSharingDeferred$1) create(coroutineScope, dVar)).invokeSuspend(y.a);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.d to kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1 for r5v1 'this'  kotlin.coroutines.d
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
            if (r0 == 0) goto L18
            if (r0 != r1) goto L11
            java.lang.Object r0 = r5.L$0
            kotlin.jvm.internal.z r0 = (kotlin.jvm.internal.z) r0
            kotlin.a.e(r6)     // Catch: java.lang.Throwable -> Lf
            goto L3a
        Lf:
            r6 = move-exception
            goto L57
        L11:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            net.luminis.tls.engine.impl.c.r(r6)
            r6 = 0
            return r6
        L18:
            kotlin.a.e(r6)
            java.lang.Object r6 = r5.L$0
            kotlinx.coroutines.CoroutineScope r6 = (kotlinx.coroutines.CoroutineScope) r6
            kotlin.jvm.internal.z r0 = new kotlin.jvm.internal.z     // Catch: java.lang.Throwable -> Lf
            r0.<init>()     // Catch: java.lang.Throwable -> Lf
            kotlinx.coroutines.flow.Flow<T> r2 = r5.$upstream     // Catch: java.lang.Throwable -> Lf
            kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1$1 r3 = new kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1$1     // Catch: java.lang.Throwable -> Lf
            kotlinx.coroutines.CompletableDeferred<kotlin.m> r4 = r5.$result     // Catch: java.lang.Throwable -> Lf
            r3.<init>()     // Catch: java.lang.Throwable -> Lf
            r5.L$0 = r0     // Catch: java.lang.Throwable -> Lf
            r5.label = r1     // Catch: java.lang.Throwable -> Lf
            java.lang.Object r6 = r2.collect(r3, r5)     // Catch: java.lang.Throwable -> Lf
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.e
            if (r6 != r1) goto L3a
            return r1
        L3a:
            java.lang.Object r6 = r0.e     // Catch: java.lang.Throwable -> Lf
            if (r6 != 0) goto L54
            kotlinx.coroutines.CompletableDeferred<kotlin.m> r6 = r5.$result     // Catch: java.lang.Throwable -> Lf
            java.util.NoSuchElementException r0 = new java.util.NoSuchElementException     // Catch: java.lang.Throwable -> Lf
            java.lang.String r1 = "Flow is empty"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lf
            kotlin.l r1 = new kotlin.l     // Catch: java.lang.Throwable -> Lf
            r1.<init>(r0)     // Catch: java.lang.Throwable -> Lf
            kotlin.m r0 = new kotlin.m     // Catch: java.lang.Throwable -> Lf
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lf
            r6.complete(r0)     // Catch: java.lang.Throwable -> Lf
        L54:
            kotlin.y r6 = kotlin.y.a
            return r6
        L57:
            kotlinx.coroutines.CompletableDeferred<kotlin.m> r0 = r5.$result
            r0.completeExceptionally(r6)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ShareKt$launchSharingDeferred$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
