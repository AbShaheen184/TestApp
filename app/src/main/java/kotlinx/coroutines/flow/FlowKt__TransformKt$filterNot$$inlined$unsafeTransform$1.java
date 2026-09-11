package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.functions.p;
import kotlin.y;
import org.mozilla.javascript.Token;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1<T> implements Flow<T> {
    final /* synthetic */ p $predicate$inlined;
    final /* synthetic */ Flow $this_unsafeTransform$inlined;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
    public static final class AnonymousClass2<T> implements FlowCollector {
        final /* synthetic */ p $predicate$inlined;
        final /* synthetic */ FlowCollector $this_unsafeFlow;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1$2$1, reason: invalid class name */
        @e(c = "kotlinx.coroutines.flow.FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1$2", f = "Transform.kt", l = {Token.TRUE, Token.TRUE}, m = "emit")
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
                return AnonymousClass2.this.emit(null, this);
            }
        }

        public AnonymousClass2(FlowCollector flowCollector, p pVar) {
            this.$this_unsafeFlow = flowCollector;
            this.$predicate$inlined = pVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0066, code lost:
        
            if (r7.emit(r1, r0) == r4) goto L24;
         */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(T r7, kotlin.coroutines.d<? super kotlin.y> r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof kotlinx.coroutines.flow.FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1.AnonymousClass2.AnonymousClass1
                if (r0 == 0) goto L13
                r0 = r8
                kotlinx.coroutines.flow.FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1$2$1 r0 = (kotlinx.coroutines.flow.FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1.AnonymousClass2.AnonymousClass1) r0
                int r1 = r0.label
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.label = r1
                goto L18
            L13:
                kotlinx.coroutines.flow.FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1$2$1 r0 = new kotlinx.coroutines.flow.FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1$2$1
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.result
                int r1 = r0.label
                r2 = 2
                r3 = 1
                kotlin.coroutines.intrinsics.a r4 = kotlin.coroutines.intrinsics.a.e
                if (r1 == 0) goto L3b
                if (r1 == r3) goto L31
                if (r1 != r2) goto L2a
                kotlin.a.e(r8)
                goto L69
            L2a:
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                net.luminis.tls.engine.impl.c.r(r7)
                r7 = 0
                return r7
            L31:
                java.lang.Object r7 = r0.L$1
                kotlinx.coroutines.flow.FlowCollector r7 = (kotlinx.coroutines.flow.FlowCollector) r7
                java.lang.Object r1 = r0.L$0
                kotlin.a.e(r8)
                goto L53
            L3b:
                kotlin.a.e(r8)
                kotlinx.coroutines.flow.FlowCollector r8 = r6.$this_unsafeFlow
                kotlin.jvm.functions.p r1 = r6.$predicate$inlined
                r0.L$0 = r7
                r0.L$1 = r8
                r0.label = r3
                java.lang.Object r1 = r1.invoke(r7, r0)
                if (r1 != r4) goto L4f
                goto L68
            L4f:
                r5 = r1
                r1 = r7
                r7 = r8
                r8 = r5
            L53:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 != 0) goto L69
                r8 = 0
                r0.L$0 = r8
                r0.L$1 = r8
                r0.label = r2
                java.lang.Object r7 = r7.emit(r1, r0)
                if (r7 != r4) goto L69
            L68:
                return r4
            L69:
                kotlin.y r7 = kotlin.y.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.d):java.lang.Object");
        }

        public final Object emit$$forInline(Object obj, kotlin.coroutines.d dVar) {
            new AnonymousClass1(dVar);
            FlowCollector flowCollector = this.$this_unsafeFlow;
            if (!((Boolean) this.$predicate$inlined.invoke(obj, dVar)).booleanValue()) {
                flowCollector.emit(obj, dVar);
            }
            return y.a;
        }
    }

    public FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1(Flow flow, p pVar) {
        this.$this_unsafeTransform$inlined = flow;
        this.$predicate$inlined = pVar;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector flowCollector, kotlin.coroutines.d dVar) {
        Object objCollect = this.$this_unsafeTransform$inlined.collect(new AnonymousClass2(flowCollector, this.$predicate$inlined), dVar);
        return objCollect == kotlin.coroutines.intrinsics.a.e ? objCollect : y.a;
    }

    public Object collect$$forInline(FlowCollector flowCollector, kotlin.coroutines.d dVar) {
        new kotlin.coroutines.jvm.internal.c(dVar) { // from class: kotlinx.coroutines.flow.FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1.1
            int label;
            /* synthetic */ Object result;

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.result = obj;
                this.label |= Integer.MIN_VALUE;
                return FlowKt__TransformKt$filterNot$$inlined$unsafeTransform$1.this.collect(null, this);
            }
        };
        this.$this_unsafeTransform$inlined.collect(new AnonymousClass2(flowCollector, this.$predicate$inlined), dVar);
        return y.a;
    }
}
