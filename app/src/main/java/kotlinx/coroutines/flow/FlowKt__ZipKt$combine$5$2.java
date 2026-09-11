package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.functions.p;
import kotlin.jvm.functions.q;
import kotlin.jvm.internal.l;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
@e(c = "kotlinx.coroutines.flow.FlowKt__ZipKt$combine$5$2", f = "Zip.kt", l = {234, 234}, m = "invokeSuspend")
public final class FlowKt__ZipKt$combine$5$2 extends i implements q {
    final /* synthetic */ p $transform;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowKt__ZipKt$combine$5$2(p pVar, kotlin.coroutines.d<? super FlowKt__ZipKt$combine$5$2> dVar) {
        super(3, dVar);
        this.$transform = pVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
    
        if (r0.emit(r6, r5) == r3) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.label
            r1 = 2
            r2 = 1
            kotlin.coroutines.intrinsics.a r3 = kotlin.coroutines.intrinsics.a.e
            if (r0 == 0) goto L1f
            if (r0 == r2) goto L17
            if (r0 != r1) goto L10
            kotlin.a.e(r6)
            goto L44
        L10:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            net.luminis.tls.engine.impl.c.r(r6)
            r6 = 0
            return r6
        L17:
            java.lang.Object r0 = r5.L$0
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
            kotlin.a.e(r6)
            goto L38
        L1f:
            kotlin.a.e(r6)
            java.lang.Object r6 = r5.L$0
            r0 = r6
            kotlinx.coroutines.flow.FlowCollector r0 = (kotlinx.coroutines.flow.FlowCollector) r0
            java.lang.Object r6 = r5.L$1
            java.lang.Object[] r6 = (java.lang.Object[]) r6
            kotlin.jvm.functions.p r4 = r5.$transform
            r5.L$0 = r0
            r5.label = r2
            java.lang.Object r6 = r4.invoke(r6, r5)
            if (r6 != r3) goto L38
            goto L43
        L38:
            r2 = 0
            r5.L$0 = r2
            r5.label = r1
            java.lang.Object r6 = r0.emit(r6, r5)
            if (r6 != r3) goto L44
        L43:
            return r3
        L44:
            kotlin.y r6 = kotlin.y.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$5$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final Object invokeSuspend$$forInline(Object obj) {
        ((FlowCollector) this.L$0).emit(this.$transform.invoke((Object[]) this.L$1, this), this);
        return y.a;
    }

    @Override // kotlin.jvm.functions.q
    public final Object invoke(FlowCollector<? super R> flowCollector, T[] tArr, kotlin.coroutines.d<? super y> dVar) {
        l.e();
        throw null;
    }
}
