package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.functions.q;
import org.mozilla.javascript.Token;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1<T> implements Flow<T> {
    final /* synthetic */ q $action$inlined;
    final /* synthetic */ Flow $this_catch$inlined;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1, reason: invalid class name */
    @e(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1", f = "Errors.kt", l = {Token.ASSIGN_SUB, 110}, m = "collect")
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
            return FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1.this.collect(null, this);
        }
    }

    public FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1(Flow flow, q qVar) {
        this.$this_catch$inlined = flow;
        this.$action$inlined = qVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0061, code lost:
    
        if (r1.invoke(r6, r7, r0) == r4) goto L24;
     */
    @Override // kotlinx.coroutines.flow.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super T> r6, kotlin.coroutines.d<? super kotlin.y> r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1 r0 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1 r0 = new kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            int r1 = r0.label
            r2 = 2
            r3 = 1
            kotlin.coroutines.intrinsics.a r4 = kotlin.coroutines.intrinsics.a.e
            if (r1 == 0) goto L3d
            if (r1 == r3) goto L31
            if (r1 != r2) goto L2a
            kotlin.a.e(r7)
            goto L64
        L2a:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            net.luminis.tls.engine.impl.c.r(r6)
            r6 = 0
            return r6
        L31:
            java.lang.Object r6 = r0.L$1
            kotlinx.coroutines.flow.FlowCollector r6 = (kotlinx.coroutines.flow.FlowCollector) r6
            java.lang.Object r1 = r0.L$0
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1 r1 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1) r1
            kotlin.a.e(r7)
            goto L50
        L3d:
            kotlin.a.e(r7)
            kotlinx.coroutines.flow.Flow r7 = r5.$this_catch$inlined
            r0.L$0 = r5
            r0.L$1 = r6
            r0.label = r3
            java.lang.Object r7 = kotlinx.coroutines.flow.FlowKt.catchImpl(r7, r6, r0)
            if (r7 != r4) goto L4f
            goto L63
        L4f:
            r1 = r5
        L50:
            java.lang.Throwable r7 = (java.lang.Throwable) r7
            if (r7 == 0) goto L64
            kotlin.jvm.functions.q r1 = r1.$action$inlined
            r3 = 0
            r0.L$0 = r3
            r0.L$1 = r3
            r0.label = r2
            java.lang.Object r6 = r1.invoke(r6, r7, r0)
            if (r6 != r4) goto L64
        L63:
            return r4
        L64:
            kotlin.y r6 = kotlin.y.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ErrorsKt$catch$$inlined$unsafeFlow$1.collect(kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.d):java.lang.Object");
    }
}
