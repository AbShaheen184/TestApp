package kotlinx.coroutines.flow;

import kotlin.jvm.functions.p;
import kotlin.jvm.internal.l;
import kotlin.y;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class FlowKt__ZipKt$combine$$inlined$unsafeFlow$2<R> implements Flow<R> {
    final /* synthetic */ Flow[] $flows$inlined;
    final /* synthetic */ p $transform$inlined;

    public FlowKt__ZipKt$combine$$inlined$unsafeFlow$2(Flow[] flowArr, p pVar) {
        this.$flows$inlined = flowArr;
        this.$transform$inlined = pVar;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector<? super R> flowCollector, kotlin.coroutines.d<? super y> dVar) {
        l.e();
        throw null;
    }

    public Object collect$$forInline(FlowCollector flowCollector, kotlin.coroutines.d dVar) {
        new kotlin.coroutines.jvm.internal.c(dVar) { // from class: kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$2.1
            int label;
            /* synthetic */ Object result;

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return FlowKt__ZipKt$combine$$inlined$unsafeFlow$2.this.collect(null, this);
            }
        };
        l.e();
        throw null;
    }
}
