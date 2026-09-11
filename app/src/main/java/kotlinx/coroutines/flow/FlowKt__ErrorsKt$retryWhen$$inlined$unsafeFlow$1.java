package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.functions.r;
import org.mozilla.javascript.Token;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1<T> implements Flow<T> {
    final /* synthetic */ r $predicate$inlined;
    final /* synthetic */ Flow $this_retryWhen$inlined;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1, reason: invalid class name */
    @e(c = "kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1", f = "Errors.kt", l = {Token.ASSIGN_EXP, Token.HOOK}, m = "collect")
    public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.c {
        int I$0;
        long J$0;
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
            return FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1.this.collect(null, this);
        }
    }

    public FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1(Flow flow, r rVar) {
        this.$this_retryWhen$inlined = flow;
        this.$predicate$inlined = rVar;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x006c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0075  */
    /* JADX WARN: Code duplicated, block: B:26:0x008d  */
    /* JADX WARN: Code duplicated, block: B:30:0x009c A[PHI: r1 r5 r7 r11
  0x009c: PHI (r1v5 kotlinx.coroutines.flow.FlowCollector<? super T>) = (r1v1 kotlinx.coroutines.flow.FlowCollector<? super T>), (r1v6 kotlinx.coroutines.flow.FlowCollector<? super T>) binds: [B:22:0x0073, B:29:0x0098] A[DONT_GENERATE, DONT_INLINE]
  0x009c: PHI (r5v3 long) = (r5v1 long), (r5v5 long) binds: [B:22:0x0073, B:29:0x0098] A[DONT_GENERATE, DONT_INLINE]
  0x009c: PHI (r7v4 kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1<T>) = 
  (r7v0 kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1<T>)
  (r7v5 kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1<T>)
 binds: [B:22:0x0073, B:29:0x0098] A[DONT_GENERATE, DONT_INLINE]
  0x009c: PHI (r11v7 int) = (r11v1 int), (r11v12 int) binds: [B:22:0x0073, B:29:0x0098] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:33:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0073 -> B:30:0x009c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x008d -> B:27:0x0090). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    @Override // kotlinx.coroutines.flow.Flow
    public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super T> r11, kotlin.coroutines.d<? super kotlin.y> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r12
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1 r0 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1 r0 = new kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1$1
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.result
            int r1 = r0.label
            r2 = 2
            r3 = 1
            kotlin.coroutines.intrinsics.a r4 = kotlin.coroutines.intrinsics.a.e
            if (r1 == 0) goto L4f
            if (r1 == r3) goto L3f
            if (r1 != r2) goto L38
            long r5 = r0.J$0
            java.lang.Object r11 = r0.L$2
            java.lang.Throwable r11 = (java.lang.Throwable) r11
            java.lang.Object r1 = r0.L$1
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            java.lang.Object r7 = r0.L$0
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1 r7 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1) r7
            kotlin.a.e(r12)
            goto L90
        L38:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            net.luminis.tls.engine.impl.c.r(r11)
            r11 = 0
            return r11
        L3f:
            int r11 = r0.I$0
            long r5 = r0.J$0
            java.lang.Object r1 = r0.L$1
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            java.lang.Object r7 = r0.L$0
            kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1 r7 = (kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1) r7
            kotlin.a.e(r12)
            goto L71
        L4f:
            kotlin.a.e(r12)
            r5 = 0
            r12 = r10
        L55:
            kotlinx.coroutines.flow.Flow r1 = r12.$this_retryWhen$inlined
            r0.L$0 = r12
            r0.L$1 = r11
            r7 = 0
            r0.L$2 = r7
            r0.J$0 = r5
            r7 = 0
            r0.I$0 = r7
            r0.label = r3
            java.lang.Object r1 = kotlinx.coroutines.flow.FlowKt.catchImpl(r1, r11, r0)
            if (r1 != r4) goto L6c
            goto L8c
        L6c:
            r9 = r1
            r1 = r11
            r11 = r7
            r7 = r12
            r12 = r9
        L71:
            java.lang.Throwable r12 = (java.lang.Throwable) r12
            if (r12 == 0) goto L9c
            kotlin.jvm.functions.r r11 = r7.$predicate$inlined
            java.lang.Long r8 = new java.lang.Long
            r8.<init>(r5)
            r0.L$0 = r7
            r0.L$1 = r1
            r0.L$2 = r12
            r0.J$0 = r5
            r0.label = r2
            java.lang.Object r11 = r11.invoke(r1, r12, r8, r0)
            if (r11 != r4) goto L8d
        L8c:
            return r4
        L8d:
            r9 = r12
            r12 = r11
            r11 = r9
        L90:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L9e
            r11 = 1
            long r5 = r5 + r11
            r11 = r3
        L9c:
            r12 = r7
            goto L9f
        L9e:
            throw r11
        L9f:
            if (r11 != 0) goto La4
            kotlin.y r11 = kotlin.y.a
            return r11
        La4:
            r11 = r1
            goto L55
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ErrorsKt$retryWhen$$inlined$unsafeFlow$1.collect(kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.d):java.lang.Object");
    }
}
