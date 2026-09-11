package androidx.compose.foundation;

import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class m1 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public n1 A;
    public int B;
    public /* synthetic */ Object C;
    public final /* synthetic */ i1 D;
    public final /* synthetic */ n1 E;
    public final /* synthetic */ androidx.compose.animation.b0 F;
    public final /* synthetic */ androidx.compose.foundation.gestures.m G;
    public Mutex e;
    public Object y;
    public androidx.compose.foundation.gestures.m z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m1(i1 i1Var, n1 n1Var, androidx.compose.animation.b0 b0Var, androidx.compose.foundation.gestures.m mVar, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.D = i1Var;
        this.E = n1Var;
        this.F = b0Var;
        this.G = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        m1 m1Var = new m1(this.D, this.E, this.F, this.G, dVar);
        m1Var.C = obj;
        return m1Var;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((m1) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
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
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.B
            r1 = 2
            r2 = 1
            r3 = 0
            kotlin.coroutines.intrinsics.a r4 = kotlin.coroutines.intrinsics.a.e
            if (r0 == 0) goto L3b
            if (r0 == r2) goto L26
            if (r0 != r1) goto L1f
            java.lang.Object r0 = r9.y
            androidx.compose.foundation.n1 r0 = (androidx.compose.foundation.n1) r0
            kotlinx.coroutines.sync.Mutex r1 = r9.e
            java.lang.Object r2 = r9.C
            androidx.compose.foundation.k1 r2 = (androidx.compose.foundation.k1) r2
            kotlin.a.e(r10)     // Catch: java.lang.Throwable -> L1c
            goto L8e
        L1c:
            r10 = move-exception
            goto La6
        L1f:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            net.luminis.tls.engine.impl.c.r(r10)
            r10 = 0
            return r10
        L26:
            androidx.compose.foundation.n1 r0 = r9.A
            androidx.compose.foundation.gestures.m r2 = r9.z
            java.lang.Object r5 = r9.y
            kotlin.jvm.functions.p r5 = (kotlin.jvm.functions.p) r5
            kotlinx.coroutines.sync.Mutex r6 = r9.e
            java.lang.Object r7 = r9.C
            androidx.compose.foundation.k1 r7 = (androidx.compose.foundation.k1) r7
            kotlin.a.e(r10)
            r8 = r6
            r6 = r5
            r5 = r8
            goto L79
        L3b:
            kotlin.a.e(r10)
            java.lang.Object r10 = r9.C
            kotlinx.coroutines.CoroutineScope r10 = (kotlinx.coroutines.CoroutineScope) r10
            androidx.compose.foundation.k1 r0 = new androidx.compose.foundation.k1
            kotlin.coroutines.i r10 = r10.getCoroutineContext()
            kotlinx.coroutines.Job$Key r5 = kotlinx.coroutines.Job.Key
            kotlin.coroutines.g r10 = r10.get(r5)
            r10.getClass()
            kotlinx.coroutines.Job r10 = (kotlinx.coroutines.Job) r10
            androidx.compose.foundation.i1 r5 = r9.D
            r0.<init>(r5, r10)
            androidx.compose.foundation.n1 r10 = r9.E
            androidx.compose.foundation.n1.a(r10, r0)
            kotlinx.coroutines.sync.Mutex r5 = r10.b
            r9.C = r0
            r9.e = r5
            androidx.compose.animation.b0 r6 = r9.F
            r9.y = r6
            androidx.compose.foundation.gestures.m r7 = r9.G
            r9.z = r7
            r9.A = r10
            r9.B = r2
            java.lang.Object r2 = r5.lock(r3, r9)
            if (r2 != r4) goto L76
            goto L8b
        L76:
            r2 = r7
            r7 = r0
            r0 = r10
        L79:
            r9.C = r7     // Catch: java.lang.Throwable -> La3
            r9.e = r5     // Catch: java.lang.Throwable -> La3
            r9.y = r0     // Catch: java.lang.Throwable -> La3
            r9.z = r3     // Catch: java.lang.Throwable -> La3
            r9.A = r3     // Catch: java.lang.Throwable -> La3
            r9.B = r1     // Catch: java.lang.Throwable -> La3
            java.lang.Object r10 = r6.invoke(r2, r9)     // Catch: java.lang.Throwable -> La3
            if (r10 != r4) goto L8c
        L8b:
            return r4
        L8c:
            r1 = r5
            r2 = r7
        L8e:
            java.util.concurrent.atomic.AtomicReference r0 = r0.a     // Catch: java.lang.Throwable -> La1
        L90:
            boolean r4 = r0.compareAndSet(r2, r3)     // Catch: java.lang.Throwable -> La1
            if (r4 == 0) goto L97
            goto L9d
        L97:
            java.lang.Object r4 = r0.get()     // Catch: java.lang.Throwable -> La1
            if (r4 == r2) goto L90
        L9d:
            r1.unlock(r3)
            return r10
        La1:
            r10 = move-exception
            goto Lb6
        La3:
            r10 = move-exception
            r1 = r5
            r2 = r7
        La6:
            java.util.concurrent.atomic.AtomicReference r0 = r0.a     // Catch: java.lang.Throwable -> La1
        La8:
            boolean r4 = r0.compareAndSet(r2, r3)     // Catch: java.lang.Throwable -> La1
            if (r4 != 0) goto Lb5
            java.lang.Object r4 = r0.get()     // Catch: java.lang.Throwable -> La1
            if (r4 != r2) goto Lb5
            goto La8
        Lb5:
            throw r10     // Catch: java.lang.Throwable -> La1
        Lb6:
            r1.unlock(r3)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.m1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
