package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.functions.q;
import kotlin.y;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
@e(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1", f = "Delay.kt", l = {413}, m = "invokeSuspend")
public final class FlowKt__DelayKt$timeoutInternal$1 extends i implements q {
    final /* synthetic */ Flow<T> $this_timeoutInternal;
    final /* synthetic */ long $timeout;
    long J$0;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__DelayKt$timeoutInternal$1(long j, Flow<? extends T> flow, kotlin.coroutines.d<? super FlowKt__DelayKt$timeoutInternal$1> dVar) {
        super(3, dVar);
        this.$timeout = j;
        this.$this_timeoutInternal = flow;
    }

    @Override // kotlin.jvm.functions.q
    public final Object invoke(CoroutineScope coroutineScope, FlowCollector<? super T> flowCollector, kotlin.coroutines.d<? super y> dVar) {
        FlowKt__DelayKt$timeoutInternal$1 flowKt__DelayKt$timeoutInternal$1 = new FlowKt__DelayKt$timeoutInternal$1(this.$timeout, this.$this_timeoutInternal, dVar);
        flowKt__DelayKt$timeoutInternal$1.L$0 = coroutineScope;
        flowKt__DelayKt$timeoutInternal$1.L$1 = flowCollector;
        return flowKt__DelayKt$timeoutInternal$1.invokeSuspend(y.a);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x006f A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:16:0x0078  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x006d -> B:14:0x0070). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.a
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.label
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L1d
            if (r0 != r1) goto L16
            long r3 = r8.J$0
            java.lang.Object r0 = r8.L$1
            kotlinx.coroutines.channels.ReceiveChannel r0 = (kotlinx.coroutines.channels.ReceiveChannel) r0
            java.lang.Object r5 = r8.L$0
            kotlinx.coroutines.flow.FlowCollector r5 = (kotlinx.coroutines.flow.FlowCollector) r5
            kotlin.a.e(r9)
            goto L70
        L16:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            net.luminis.tls.engine.impl.c.r(r9)
            r9 = 0
            return r9
        L1d:
            kotlin.a.e(r9)
            java.lang.Object r9 = r8.L$0
            kotlinx.coroutines.CoroutineScope r9 = (kotlinx.coroutines.CoroutineScope) r9
            java.lang.Object r0 = r8.L$1
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
            long r3 = r8.$timeout
            r5 = 0
            int r3 = kotlin.time.a.e(r3, r5)
            if (r3 <= 0) goto L7b
            kotlinx.coroutines.flow.Flow<T> r3 = r8.$this_timeoutInternal
            r4 = 0
            r5 = 2
            kotlinx.coroutines.flow.Flow r3 = kotlinx.coroutines.flow.FlowKt.buffer$default(r3, r4, r2, r5, r2)
            kotlinx.coroutines.channels.ReceiveChannel r9 = kotlinx.coroutines.flow.FlowKt.produceIn(r3, r9)
            long r3 = r8.$timeout
            r5 = r0
            r0 = r9
        L42:
            kotlinx.coroutines.selects.SelectImplementation r9 = new kotlinx.coroutines.selects.SelectImplementation
            kotlin.coroutines.i r6 = r8.getContext()
            r9.<init>(r6)
            kotlinx.coroutines.selects.SelectClause1 r6 = r0.getOnReceiveCatching()
            kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$1 r7 = new kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$1
            r7.<init>(r5, r2)
            r9.invoke(r6, r7)
            kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$2 r6 = new kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$2
            r6.<init>(r3, r2)
            kotlinx.coroutines.selects.OnTimeoutKt.m98onTimeout8Mi8wO0(r9, r3, r6)
            r8.L$0 = r5
            r8.L$1 = r0
            r8.J$0 = r3
            r8.label = r1
            java.lang.Object r9 = r9.doSelect(r8)
            kotlin.coroutines.intrinsics.a r6 = kotlin.coroutines.intrinsics.a.e
            if (r9 != r6) goto L70
            return r6
        L70:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 != 0) goto L42
            kotlin.y r9 = kotlin.y.a
            return r9
        L7b:
            kotlinx.coroutines.TimeoutCancellationException r9 = new kotlinx.coroutines.TimeoutCancellationException
            java.lang.String r0 = "Timed out immediately"
            r9.<init>(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
