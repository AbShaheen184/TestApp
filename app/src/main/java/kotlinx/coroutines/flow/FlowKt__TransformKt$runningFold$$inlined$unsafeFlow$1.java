package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.functions.q;
import org.mozilla.javascript.Token;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1<R> implements Flow<R> {
    final /* synthetic */ Object $initial$inlined;
    final /* synthetic */ q $operation$inlined;
    final /* synthetic */ Flow $this_runningFold$inlined;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1, reason: invalid class name */
    @e(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1", f = "Transform.kt", l = {110, Token.ASSIGN_DIV}, m = "collect")
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.c {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1.this.collect(null, this);
        }
    }

    public FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1(Object obj, Flow flow, q qVar) {
        this.$initial$inlined = obj;
        this.$this_runningFold$inlined = flow;
        this.$operation$inlined = qVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0075, code lost:
    
        if (r8.collect(r5, r0) == r4) goto L22;
     */
    @Override // kotlinx.coroutines.flow.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super R> r7, kotlin.coroutines.d<? super kotlin.y> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1 r0 = (kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1 r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            int r1 = r0.label
            r2 = 2
            r3 = 1
            kotlin.coroutines.intrinsics.a r4 = kotlin.coroutines.intrinsics.a.e
            if (r1 == 0) goto L41
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2a
            kotlin.a.e(r8)
            goto L78
        L2a:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            net.luminis.tls.engine.impl.c.r(r7)
            r7 = 0
            return r7
        L31:
            java.lang.Object r7 = r0.L$2
            kotlin.jvm.internal.z r7 = (kotlin.jvm.internal.z) r7
            java.lang.Object r1 = r0.L$1
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            java.lang.Object r3 = r0.L$0
            kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1 r3 = (kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1) r3
            kotlin.a.e(r8)
            goto L5f
        L41:
            kotlin.a.e(r8)
            kotlin.jvm.internal.z r8 = new kotlin.jvm.internal.z
            r8.<init>()
            java.lang.Object r1 = r6.$initial$inlined
            r8.e = r1
            r0.L$0 = r6
            r0.L$1 = r7
            r0.L$2 = r8
            r0.label = r3
            java.lang.Object r1 = r7.emit(r1, r0)
            if (r1 != r4) goto L5c
            goto L77
        L5c:
            r3 = r6
            r1 = r7
            r7 = r8
        L5f:
            kotlinx.coroutines.flow.Flow r8 = r3.$this_runningFold$inlined
            kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1 r5 = new kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$1$1
            kotlin.jvm.functions.q r3 = r3.$operation$inlined
            r5.<init>(r7, r3, r1)
            r7 = 0
            r0.L$0 = r7
            r0.L$1 = r7
            r0.L$2 = r7
            r0.label = r2
            java.lang.Object r7 = r8.collect(r5, r0)
            if (r7 != r4) goto L78
        L77:
            return r4
        L78:
            kotlin.y r7 = kotlin.y.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__TransformKt$runningFold$$inlined$unsafeFlow$1.collect(kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.d):java.lang.Object");
    }
}
