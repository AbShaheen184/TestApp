package kotlinx.coroutines.flow;

import kotlin.jvm.functions.q;
import kotlin.jvm.internal.z;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class FlowKt__TransformKt$runningReduce$1$1<T> implements FlowCollector {
    final /* synthetic */ z $accumulator;
    final /* synthetic */ q $operation;
    final /* synthetic */ FlowCollector<T> $this_flow;

    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__TransformKt$runningReduce$1$1(z zVar, q qVar, FlowCollector<? super T> flowCollector) {
        this.$accumulator = zVar;
        this.$operation = qVar;
        this.$this_flow = flowCollector;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0073, code lost:
    
        if (r8.emit((T) r9, r0) == r4) goto L26;
     */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emit(T r8, kotlin.coroutines.d<? super kotlin.y> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof kotlinx.coroutines.flow.FlowKt__TransformKt$runningReduce$1$1$emit$1
            if (r0 == 0) goto L13
            r0 = r9
            kotlinx.coroutines.flow.FlowKt__TransformKt$runningReduce$1$1$emit$1 r0 = (kotlinx.coroutines.flow.FlowKt__TransformKt$runningReduce$1$1$emit$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__TransformKt$runningReduce$1$1$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$runningReduce$1$1$emit$1
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.result
            int r1 = r0.label
            r2 = 2
            r3 = 1
            kotlin.coroutines.intrinsics.a r4 = kotlin.coroutines.intrinsics.a.e
            if (r1 == 0) goto L3d
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2a
            kotlin.a.e(r9)
            goto L76
        L2a:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            net.luminis.tls.engine.impl.c.r(r8)
            r8 = 0
            return r8
        L31:
            java.lang.Object r8 = r0.L$1
            kotlin.jvm.internal.z r8 = (kotlin.jvm.internal.z) r8
            java.lang.Object r1 = r0.L$0
            kotlinx.coroutines.flow.FlowKt__TransformKt$runningReduce$1$1 r1 = (kotlinx.coroutines.flow.FlowKt__TransformKt$runningReduce$1$1) r1
            kotlin.a.e(r9)
            goto L5d
        L3d:
            kotlin.a.e(r9)
            kotlin.jvm.internal.z r9 = r7.$accumulator
            java.lang.Object r1 = r9.e
            kotlinx.coroutines.internal.Symbol r5 = kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL
            if (r1 != r5) goto L4a
            r1 = r7
            goto L60
        L4a:
            kotlin.jvm.functions.q r5 = r7.$operation
            r0.L$0 = r7
            r0.L$1 = r9
            r0.label = r3
            java.lang.Object r8 = r5.invoke(r1, r8, r0)
            if (r8 != r4) goto L59
            goto L75
        L59:
            r1 = r9
            r9 = r8
            r8 = r1
            r1 = r7
        L5d:
            r6 = r9
            r9 = r8
            r8 = r6
        L60:
            r9.e = r8
            kotlinx.coroutines.flow.FlowCollector<T> r8 = r1.$this_flow
            kotlin.jvm.internal.z r9 = r1.$accumulator
            java.lang.Object r9 = r9.e
            r1 = 0
            r0.L$0 = r1
            r0.L$1 = r1
            r0.label = r2
            java.lang.Object r8 = r8.emit(r9, r0)
            if (r8 != r4) goto L76
        L75:
            return r4
        L76:
            kotlin.y r8 = kotlin.y.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__TransformKt$runningReduce$1$1.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
    }
}
