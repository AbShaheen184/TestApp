package kotlinx.coroutines.flow;

import kotlin.jvm.functions.q;
import kotlin.jvm.internal.z;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class FlowKt__TransformKt$runningFold$1$1<T> implements FlowCollector {
    final /* synthetic */ z $accumulator;
    final /* synthetic */ q $operation;
    final /* synthetic */ FlowCollector<R> $this_flow;

    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__TransformKt$runningFold$1$1(z zVar, q qVar, FlowCollector<? super R> flowCollector) {
        this.$accumulator = zVar;
        this.$operation = qVar;
        this.$this_flow = flowCollector;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006a, code lost:
    
        if (r7.emit((R) r8, r0) == r4) goto L22;
     */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // kotlinx.coroutines.flow.FlowCollector
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object emit(T r7, kotlin.coroutines.d<? super kotlin.y> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1$emit$1
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1$emit$1 r0 = (kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1$emit$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1$emit$1 r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1$emit$1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.result
            int r1 = r0.label
            r2 = 2
            r3 = 1
            kotlin.coroutines.intrinsics.a r4 = kotlin.coroutines.intrinsics.a.e
            if (r1 == 0) goto L3d
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2a
            kotlin.a.e(r8)
            goto L6d
        L2a:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            net.luminis.tls.engine.impl.c.r(r7)
            r7 = 0
            return r7
        L31:
            java.lang.Object r7 = r0.L$1
            kotlin.jvm.internal.z r7 = (kotlin.jvm.internal.z) r7
            java.lang.Object r1 = r0.L$0
            kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1 r1 = (kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1) r1
            kotlin.a.e(r8)
            goto L57
        L3d:
            kotlin.a.e(r8)
            kotlin.jvm.internal.z r8 = r6.$accumulator
            kotlin.jvm.functions.q r1 = r6.$operation
            java.lang.Object r5 = r8.e
            r0.L$0 = r6
            r0.L$1 = r8
            r0.label = r3
            java.lang.Object r7 = r1.invoke(r5, r7, r0)
            if (r7 != r4) goto L53
            goto L6c
        L53:
            r1 = r8
            r8 = r7
            r7 = r1
            r1 = r6
        L57:
            r7.e = r8
            kotlinx.coroutines.flow.FlowCollector<R> r7 = r1.$this_flow
            kotlin.jvm.internal.z r8 = r1.$accumulator
            java.lang.Object r8 = r8.e
            r1 = 0
            r0.L$0 = r1
            r0.L$1 = r1
            r0.label = r2
            java.lang.Object r7 = r7.emit(r8, r0)
            if (r7 != r4) goto L6d
        L6c:
            return r4
        L6d:
            kotlin.y r7 = kotlin.y.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
    }
}
