package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.functions.l;
import kotlin.jvm.functions.q;
import kotlin.y;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
@e(c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1", f = "Delay.kt", l = {215, 415}, m = "invokeSuspend")
public final class FlowKt__DelayKt$debounceInternal$1 extends i implements q {
    final /* synthetic */ Flow<T> $this_debounceInternal;
    final /* synthetic */ l $timeoutMillisSelector;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__DelayKt$debounceInternal$1(l lVar, Flow<? extends T> flow, kotlin.coroutines.d<? super FlowKt__DelayKt$debounceInternal$1> dVar) {
        super(3, dVar);
        this.$timeoutMillisSelector = lVar;
        this.$this_debounceInternal = flow;
    }

    @Override // kotlin.jvm.functions.q
    public final Object invoke(CoroutineScope coroutineScope, FlowCollector<? super T> flowCollector, kotlin.coroutines.d<? super y> dVar) {
        FlowKt__DelayKt$debounceInternal$1 flowKt__DelayKt$debounceInternal$1 = new FlowKt__DelayKt$debounceInternal$1(this.$timeoutMillisSelector, this.$this_debounceInternal, dVar);
        flowKt__DelayKt$debounceInternal$1.L$0 = coroutineScope;
        flowKt__DelayKt$debounceInternal$1.L$1 = flowCollector;
        return flowKt__DelayKt$debounceInternal$1.invokeSuspend(y.a);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0063  */
    /* JADX WARN: Code duplicated, block: B:17:0x006a  */
    /* JADX WARN: Code duplicated, block: B:19:0x0070  */
    /* JADX WARN: Code duplicated, block: B:22:0x0083  */
    /* JADX WARN: Code duplicated, block: B:23:0x0085  */
    /* JADX WARN: Code duplicated, block: B:25:0x0089  */
    /* JADX WARN: Code duplicated, block: B:30:0x009d A[PHI: r0 r5 r6 r7
  0x009d: PHI (r0v3 kotlin.jvm.internal.y) = (r0v5 kotlin.jvm.internal.y), (r0v7 kotlin.jvm.internal.y), (r0v7 kotlin.jvm.internal.y) binds: [B:29:0x009b, B:16:0x0068, B:22:0x0083] A[DONT_GENERATE, DONT_INLINE]
  0x009d: PHI (r5v3 kotlin.jvm.internal.z) = (r5v5 kotlin.jvm.internal.z), (r5v6 kotlin.jvm.internal.z), (r5v6 kotlin.jvm.internal.z) binds: [B:29:0x009b, B:16:0x0068, B:22:0x0083] A[DONT_GENERATE, DONT_INLINE]
  0x009d: PHI (r6v2 kotlinx.coroutines.channels.ReceiveChannel) = 
  (r6v4 kotlinx.coroutines.channels.ReceiveChannel)
  (r6v5 kotlinx.coroutines.channels.ReceiveChannel)
  (r6v5 kotlinx.coroutines.channels.ReceiveChannel)
 binds: [B:29:0x009b, B:16:0x0068, B:22:0x0083] A[DONT_GENERATE, DONT_INLINE]
  0x009d: PHI (r7v2 kotlinx.coroutines.flow.FlowCollector) = 
  (r7v4 kotlinx.coroutines.flow.FlowCollector)
  (r7v5 kotlinx.coroutines.flow.FlowCollector)
  (r7v5 kotlinx.coroutines.flow.FlowCollector)
 binds: [B:29:0x009b, B:16:0x0068, B:22:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:31:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:38:0x00dd  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0098, code lost:
    
        if (r7.emit(r15, r14) == r4) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00da, code lost:
    
        if (r7.doSelect(r14) == r4) goto L37;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00da -> B:7:0x001c). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
