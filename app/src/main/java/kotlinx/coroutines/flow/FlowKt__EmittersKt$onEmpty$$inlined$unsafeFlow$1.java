package kotlinx.coroutines.flow;

import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.functions.p;
import org.mozilla.javascript.Token;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1<T> implements Flow<T> {
    final /* synthetic */ p $action$inlined;
    final /* synthetic */ Flow $this_onEmpty$inlined;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1$1, reason: invalid class name */
    @e(c = "kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1", f = "Emitters.kt", l = {110, Token.AND}, m = "collect")
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
            return FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1.this.collect(null, this);
        }
    }

    public FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1(Flow flow, p pVar) {
        this.$this_onEmpty$inlined = flow;
        this.$action$inlined = pVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0086, code lost:
    
        if (r8 == r4) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [kotlinx.coroutines.flow.FlowCollector] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, kotlinx.coroutines.flow.FlowCollector, kotlinx.coroutines.flow.FlowCollector<? super T>] */
    /* JADX WARN: Type inference failed for: r7v1, types: [kotlinx.coroutines.flow.internal.SafeCollector] */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v7, types: [kotlinx.coroutines.flow.internal.SafeCollector] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // kotlinx.coroutines.flow.Flow
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector<? super T> r7, kotlin.coroutines.d<? super kotlin.y> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r8
            kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1$1 r0 = (kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1$1 r0 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            int r1 = r0.label
            r2 = 2
            r3 = 1
            kotlin.coroutines.intrinsics.a r4 = kotlin.coroutines.intrinsics.a.e
            if (r1 == 0) goto L47
            if (r1 == r3) goto L37
            if (r1 != r2) goto L30
            java.lang.Object r7 = r0.L$0
            kotlinx.coroutines.flow.internal.SafeCollector r7 = (kotlinx.coroutines.flow.internal.SafeCollector) r7
            kotlin.a.e(r8)     // Catch: java.lang.Throwable -> L2e
            goto L89
        L2e:
            r8 = move-exception
            goto L8d
        L30:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            net.luminis.tls.engine.impl.c.r(r7)
            r7 = 0
            return r7
        L37:
            java.lang.Object r7 = r0.L$2
            kotlin.jvm.internal.v r7 = (kotlin.jvm.internal.v) r7
            java.lang.Object r1 = r0.L$1
            kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
            java.lang.Object r3 = r0.L$0
            kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1 r3 = (kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1) r3
            kotlin.a.e(r8)
            goto L6a
        L47:
            kotlin.a.e(r8)
            kotlin.jvm.internal.v r8 = new kotlin.jvm.internal.v
            r8.<init>()
            r8.e = r3
            kotlinx.coroutines.flow.Flow r1 = r6.$this_onEmpty$inlined
            kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$1$1 r5 = new kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$1$1
            r5.<init>(r8, r7)
            r0.L$0 = r6
            r0.L$1 = r7
            r0.L$2 = r8
            r0.label = r3
            java.lang.Object r1 = r1.collect(r5, r0)
            if (r1 != r4) goto L67
            goto L88
        L67:
            r3 = r6
            r1 = r7
            r7 = r8
        L6a:
            boolean r7 = r7.e
            if (r7 == 0) goto L91
            kotlinx.coroutines.flow.internal.SafeCollector r7 = new kotlinx.coroutines.flow.internal.SafeCollector
            kotlin.coroutines.i r8 = r0.getContext()
            r7.<init>(r1, r8)
            kotlin.jvm.functions.p r8 = r3.$action$inlined     // Catch: java.lang.Throwable -> L2e
            r0.L$0 = r7     // Catch: java.lang.Throwable -> L2e
            r1 = 0
            r0.L$1 = r1     // Catch: java.lang.Throwable -> L2e
            r0.L$2 = r1     // Catch: java.lang.Throwable -> L2e
            r0.label = r2     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r8 = r8.invoke(r7, r0)     // Catch: java.lang.Throwable -> L2e
            if (r8 != r4) goto L89
        L88:
            return r4
        L89:
            r7.releaseIntercepted()
            goto L91
        L8d:
            r7.releaseIntercepted()
            throw r8
        L91:
            kotlin.y r7 = kotlin.y.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__EmittersKt$onEmpty$$inlined$unsafeFlow$1.collect(kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.d):java.lang.Object");
    }
}
