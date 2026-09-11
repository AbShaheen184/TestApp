package kotlinx.coroutines.flow;

import java.util.List;
import kotlin.coroutines.jvm.internal.e;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class FlowKt__TransformKt$chunked$$inlined$unsafeFlow$1<T> implements Flow<List<? extends T>> {
    final /* synthetic */ int $size$inlined;
    final /* synthetic */ Flow $this_chunked$inlined;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$chunked$$inlined$unsafeFlow$1$1, reason: invalid class name */
    @e(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$chunked$$inlined$unsafeFlow$1", f = "Transform.kt", l = {110, 120}, m = "collect")
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public AnonymousClass1(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return FlowKt__TransformKt$chunked$$inlined$unsafeFlow$1.this.collect(null, this);
        }
    }

    public FlowKt__TransformKt$chunked$$inlined$unsafeFlow$1(Flow flow, int i) {
        this.$this_chunked$inlined = flow;
        this.$size$inlined = i;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006e, code lost:
    
        if (r1.emit(r8, r0) == r4) goto L24;
     */
    @Override // kotlinx.coroutines.flow.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super java.util.List<? extends T>> r8, kotlin.coroutines.d<? super kotlin.y> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof kotlinx.coroutines.flow.FlowKt__TransformKt$chunked$$inlined$unsafeFlow$1.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r9
            kotlinx.coroutines.flow.FlowKt__TransformKt$chunked$$inlined$unsafeFlow$1$1 r0 = (kotlinx.coroutines.flow.FlowKt__TransformKt$chunked$$inlined$unsafeFlow$1.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__TransformKt$chunked$$inlined$unsafeFlow$1$1 r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$chunked$$inlined$unsafeFlow$1$1
            r0.<init>(r9)
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
            goto L71
        L2a:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            net.luminis.tls.engine.impl.c.r(r8)
            r8 = 0
            return r8
        L31:
            java.lang.Object r8 = r0.L$1
            kotlin.jvm.internal.z r8 = (kotlin.jvm.internal.z) r8
            java.lang.Object r1 = r0.L$0
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            kotlin.a.e(r9)
            goto L5d
        L3d:
            kotlin.a.e(r9)
            kotlin.jvm.internal.z r9 = new kotlin.jvm.internal.z
            r9.<init>()
            kotlinx.coroutines.flow.Flow r1 = r7.$this_chunked$inlined
            kotlinx.coroutines.flow.FlowKt__TransformKt$chunked$2$1 r5 = new kotlinx.coroutines.flow.FlowKt__TransformKt$chunked$2$1
            int r6 = r7.$size$inlined
            r5.<init>(r9, r6, r8)
            r0.L$0 = r8
            r0.L$1 = r9
            r0.label = r3
            java.lang.Object r1 = r1.collect(r5, r0)
            if (r1 != r4) goto L5b
            goto L70
        L5b:
            r1 = r8
            r8 = r9
        L5d:
            java.lang.Object r8 = r8.e
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            if (r8 == 0) goto L71
            r9 = 0
            r0.L$0 = r9
            r0.L$1 = r9
            r0.label = r2
            java.lang.Object r8 = r1.emit(r8, r0)
            if (r8 != r4) goto L71
        L70:
            return r4
        L71:
            kotlin.y r8 = kotlin.y.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__TransformKt$chunked$$inlined$unsafeFlow$1.collect(kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.d):java.lang.Object");
    }
}
