package androidx.compose.foundation;

import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class l1 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ n1 C;
    public final /* synthetic */ kotlin.coroutines.jvm.internal.i D;
    public Mutex e;
    public Object y;
    public n1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public l1(n1 n1Var, kotlin.jvm.functions.l lVar, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.C = n1Var;
        this.D = (kotlin.coroutines.jvm.internal.i) lVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.coroutines.jvm.internal.i, kotlin.jvm.functions.l] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        l1 l1Var = new l1(this.C, this.D, dVar);
        l1Var.B = obj;
        return l1Var;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((l1) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstInlineVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected instance arg in invoke
        	at jadx.core.dex.visitors.ConstInlineVisitor.addExplicitCast(ConstInlineVisitor.java:285)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceArg(ConstInlineVisitor.java:267)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceConst(ConstInlineVisitor.java:177)
        	at jadx.core.dex.visitors.ConstInlineVisitor.checkInsn(ConstInlineVisitor.java:110)
        	at jadx.core.dex.visitors.ConstInlineVisitor.process(ConstInlineVisitor.java:55)
        	at jadx.core.dex.visitors.ConstInlineVisitor.visit(ConstInlineVisitor.java:47)
        */
    @Override // kotlin.coroutines.jvm.internal.a
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.A
            r1 = 2
            r2 = 1
            r3 = 0
            kotlin.coroutines.intrinsics.a r4 = kotlin.coroutines.intrinsics.a.e
            if (r0 == 0) goto L35
            if (r0 == r2) goto L25
            if (r0 != r1) goto L1e
            java.lang.Object r0 = r7.y
            androidx.compose.foundation.n1 r0 = (androidx.compose.foundation.n1) r0
            kotlinx.coroutines.sync.Mutex r1 = r7.e
            java.lang.Object r2 = r7.B
            androidx.compose.foundation.k1 r2 = (androidx.compose.foundation.k1) r2
            kotlin.a.e(r8)     // Catch: java.lang.Throwable -> L1b
            goto L82
        L1b:
            r8 = move-exception
            goto L9a
        L1e:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            net.luminis.tls.engine.impl.c.r(r8)
            r8 = 0
            return r8
        L25:
            androidx.compose.foundation.n1 r0 = r7.z
            java.lang.Object r2 = r7.y
            kotlin.jvm.functions.l r2 = (kotlin.jvm.functions.l) r2
            kotlinx.coroutines.sync.Mutex r5 = r7.e
            java.lang.Object r6 = r7.B
            androidx.compose.foundation.k1 r6 = (androidx.compose.foundation.k1) r6
            kotlin.a.e(r8)
            goto L6f
        L35:
            kotlin.a.e(r8)
            java.lang.Object r8 = r7.B
            kotlinx.coroutines.CoroutineScope r8 = (kotlinx.coroutines.CoroutineScope) r8
            androidx.compose.foundation.k1 r0 = new androidx.compose.foundation.k1
            kotlin.coroutines.i r8 = r8.getCoroutineContext()
            kotlinx.coroutines.Job$Key r5 = kotlinx.coroutines.Job.Key
            kotlin.coroutines.g r8 = r8.get(r5)
            r8.getClass()
            kotlinx.coroutines.Job r8 = (kotlinx.coroutines.Job) r8
            androidx.compose.foundation.i1 r5 = androidx.compose.foundation.i1.e
            r0.<init>(r5, r8)
            androidx.compose.foundation.n1 r8 = r7.C
            androidx.compose.foundation.n1.a(r8, r0)
            kotlinx.coroutines.sync.Mutex r5 = r8.b
            r7.B = r0
            r7.e = r5
            kotlin.coroutines.jvm.internal.i r6 = r7.D
            r7.y = r6
            r7.z = r8
            r7.A = r2
            java.lang.Object r2 = r5.lock(r3, r7)
            if (r2 != r4) goto L6c
            goto L7f
        L6c:
            r2 = r6
            r6 = r0
            r0 = r8
        L6f:
            r7.B = r6     // Catch: java.lang.Throwable -> L97
            r7.e = r5     // Catch: java.lang.Throwable -> L97
            r7.y = r0     // Catch: java.lang.Throwable -> L97
            r7.z = r3     // Catch: java.lang.Throwable -> L97
            r7.A = r1     // Catch: java.lang.Throwable -> L97
            java.lang.Object r8 = r2.invoke(r7)     // Catch: java.lang.Throwable -> L97
            if (r8 != r4) goto L80
        L7f:
            return r4
        L80:
            r1 = r5
            r2 = r6
        L82:
            java.util.concurrent.atomic.AtomicReference r0 = r0.a     // Catch: java.lang.Throwable -> L95
        L84:
            boolean r4 = r0.compareAndSet(r2, r3)     // Catch: java.lang.Throwable -> L95
            if (r4 == 0) goto L8b
            goto L91
        L8b:
            java.lang.Object r4 = r0.get()     // Catch: java.lang.Throwable -> L95
            if (r4 == r2) goto L84
        L91:
            r1.unlock(r3)
            return r8
        L95:
            r8 = move-exception
            goto Laa
        L97:
            r8 = move-exception
            r1 = r5
            r2 = r6
        L9a:
            java.util.concurrent.atomic.AtomicReference r0 = r0.a     // Catch: java.lang.Throwable -> L95
        L9c:
            boolean r4 = r0.compareAndSet(r2, r3)     // Catch: java.lang.Throwable -> L95
            if (r4 != 0) goto La9
            java.lang.Object r4 = r0.get()     // Catch: java.lang.Throwable -> L95
            if (r4 != r2) goto La9
            goto L9c
        La9:
            throw r8     // Catch: java.lang.Throwable -> L95
        Laa:
            r1.unlock(r3)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.l1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
