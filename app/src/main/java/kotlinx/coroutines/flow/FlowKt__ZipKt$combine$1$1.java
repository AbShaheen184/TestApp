package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.functions.q;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
@e(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$1$1", f = "Zip.kt", l = {29, 29}, m = "invokeSuspend")
public final class FlowKt__ZipKt$combine$1$1 extends i implements q {
    final /* synthetic */ q $transform;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__ZipKt$combine$1$1(q qVar, kotlin.coroutines.d<? super FlowKt__ZipKt$combine$1$1> dVar) {
        super(3, dVar);
        this.$transform = qVar;
    }

    @Override // kotlin.jvm.functions.q
    public final Object invoke(FlowCollector<? super R> flowCollector, Object[] objArr, kotlin.coroutines.d<? super y> dVar) {
        FlowKt__ZipKt$combine$1$1 flowKt__ZipKt$combine$1$1 = new FlowKt__ZipKt$combine$1$1(this.$transform, dVar);
        flowKt__ZipKt$combine$1$1.L$0 = flowCollector;
        flowKt__ZipKt$combine$1$1.L$1 = objArr;
        return flowKt__ZipKt$combine$1$1.invokeSuspend(y.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
    
        if (r0.emit(r7, r6) == r3) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.label
            r1 = 2
            r2 = 1
            kotlin.coroutines.intrinsics.a r3 = kotlin.coroutines.intrinsics.a.e
            if (r0 == 0) goto L1f
            if (r0 == r2) goto L17
            if (r0 != r1) goto L10
            kotlin.a.e(r7)
            goto L49
        L10:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            net.luminis.tls.engine.impl.c.r(r7)
            r7 = 0
            return r7
        L17:
            java.lang.Object r0 = r6.L$0
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
            kotlin.a.e(r7)
            goto L3d
        L1f:
            kotlin.a.e(r7)
            java.lang.Object r7 = r6.L$0
            r0 = r7
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
            java.lang.Object r7 = r6.L$1
            java.lang.Object[] r7 = (java.lang.Object[]) r7
            kotlin.jvm.functions.q r4 = r6.$transform
            r5 = 0
            r5 = r7[r5]
            r7 = r7[r2]
            r6.L$0 = r0
            r6.label = r2
            java.lang.Object r7 = r4.invoke(r5, r7, r6)
            if (r7 != r3) goto L3d
            goto L48
        L3d:
            r2 = 0
            r6.L$0 = r2
            r6.label = r1
            java.lang.Object r7 = r0.emit(r7, r6)
            if (r7 != r3) goto L49
        L48:
            return r3
        L49:
            kotlin.y r7 = kotlin.y.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
