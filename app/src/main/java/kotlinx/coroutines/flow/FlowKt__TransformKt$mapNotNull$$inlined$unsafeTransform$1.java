package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.functions.p;
import kotlin.y;
import org.mozilla.javascript.Token;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1<R> implements Flow<R> {
    final /* synthetic */ Flow $this_unsafeTransform$inlined;
    final /* synthetic */ p $transform$inlined$1;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    public static final class AnonymousClass2<T> implements FlowCollector {
        final /* synthetic */ FlowCollector $this_unsafeFlow;
        final /* synthetic */ p $transform$inlined;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1$2$1, reason: invalid class name */
        @e(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1$2", f = "Transform.kt", l = {Token.TRUE, Token.SHEQ}, m = "emit")
        public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.c {
            Object L$0;
            int label;
            /* synthetic */ Object result;

            public AnonymousClass1(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return AnonymousClass2.this.emit(null, this);
            }
        }

        public AnonymousClass2(FlowCollector flowCollector, p pVar) {
            this.$this_unsafeFlow = flowCollector;
            this.$transform$inlined = pVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x005a, code lost:
        
            if (r7.emit(r8, r0) == r4) goto L24;
         */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(T r7, kotlin.coroutines.d<? super kotlin.y> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof kotlinx.coroutines.flow.FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1.AnonymousClass2.AnonymousClass1
                if (r0 == 0) goto L13
                r0 = r8
                kotlinx.coroutines.flow.FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1$2$1 r0 = (kotlinx.coroutines.flow.FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1.AnonymousClass2.AnonymousClass1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1$2$1 r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1$2$1
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.result
                int r1 = r0.label
                r2 = 2
                r3 = 1
                kotlin.coroutines.intrinsics.a r4 = kotlin.coroutines.intrinsics.a.e
                if (r1 == 0) goto L39
                if (r1 == r3) goto L31
                if (r1 != r2) goto L2a
                kotlin.a.e(r8)
                goto L5d
            L2a:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                net.luminis.tls.engine.impl.c.r(r7)
                r7 = 0
                return r7
            L31:
                java.lang.Object r7 = r0.L$0
                kotlinx.coroutines.flow.FlowCollector r7 = (kotlinx.coroutines.flow.FlowCollector) r7
                kotlin.a.e(r8)
                goto L4e
            L39:
                kotlin.a.e(r8)
                kotlinx.coroutines.flow.FlowCollector r8 = r6.$this_unsafeFlow
                kotlin.jvm.functions.p r1 = r6.$transform$inlined
                r0.L$0 = r8
                r0.label = r3
                java.lang.Object r7 = r1.invoke(r7, r0)
                if (r7 != r4) goto L4b
                goto L5c
            L4b:
                r5 = r8
                r8 = r7
                r7 = r5
            L4e:
                if (r8 != 0) goto L51
                goto L5d
            L51:
                r1 = 0
                r0.L$0 = r1
                r0.label = r2
                java.lang.Object r7 = r7.emit(r8, r0)
                if (r7 != r4) goto L5d
            L5c:
                return r4
            L5d:
                kotlin.y r7 = kotlin.y.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final Object emit$$forInline(Object obj, kotlin.coroutines.d dVar) {
            new AnonymousClass1(dVar);
            FlowCollector flowCollector = this.$this_unsafeFlow;
            Object objInvoke = this.$transform$inlined.invoke(obj, dVar);
            if (objInvoke != null) {
                flowCollector.emit(objInvoke, dVar);
            }
            return y.a;
        }
    }

    public FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1(Flow flow, p pVar) {
        this.$this_unsafeTransform$inlined = flow;
        this.$transform$inlined$1 = pVar;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector flowCollector, kotlin.coroutines.d dVar) {
        Object objCollect = this.$this_unsafeTransform$inlined.collect(new AnonymousClass2(flowCollector, this.$transform$inlined$1), dVar);
        return objCollect == kotlin.coroutines.intrinsics.a.e ? objCollect : y.a;
    }

    public Object collect$$forInline(FlowCollector flowCollector, kotlin.coroutines.d dVar) {
        new kotlin.coroutines.jvm.internal.c(dVar) { // from class: kotlinx.coroutines.flow.FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1.1
            int label;
            /* synthetic */ Object result;

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return FlowKt__TransformKt$mapNotNull$$inlined$unsafeTransform$1.this.collect(null, this);
            }
        };
        this.$this_unsafeTransform$inlined.collect(new AnonymousClass2(flowCollector, this.$transform$inlined$1), dVar);
        return y.a;
    }
}
