package androidx.compose.foundation.gestures;

import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class s2 extends kotlin.coroutines.jvm.internal.h implements kotlin.jvm.functions.p {
    public final /* synthetic */ CoroutineScope A;
    public final /* synthetic */ kotlin.coroutines.jvm.internal.i B;
    public final /* synthetic */ kotlin.jvm.functions.l C;
    public final /* synthetic */ o1 D;
    public Job e;
    public int y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public s2(CoroutineScope coroutineScope, kotlin.jvm.functions.q qVar, kotlin.jvm.functions.l lVar, o1 o1Var, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.A = coroutineScope;
        this.B = (kotlin.coroutines.jvm.internal.i) qVar;
        this.C = lVar;
        this.D = o1Var;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.coroutines.jvm.internal.i, kotlin.jvm.functions.q] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        s2 s2Var = new s2(this.A, this.B, this.C, this.D, dVar);
        s2Var.z = obj;
        return s2Var;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((s2) create((androidx.compose.ui.input.pointer.k0) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0077, code lost:
    
        if (r4 == r8) goto L18;
     */
    /* JADX WARN: Type inference failed for: r12v1, types: [kotlin.coroutines.jvm.internal.i, kotlin.jvm.functions.q] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            r16 = this;
            r0 = r16
            int r1 = r0.y
            r2 = 0
            kotlinx.coroutines.CoroutineScope r3 = r0.A
            r4 = 2
            r5 = 1
            androidx.compose.foundation.gestures.o1 r6 = r0.D
            r7 = 0
            kotlin.coroutines.intrinsics.a r8 = kotlin.coroutines.intrinsics.a.e
            if (r1 == 0) goto L30
            if (r1 == r5) goto L24
            if (r1 != r4) goto L1e
            java.lang.Object r1 = r0.z
            kotlinx.coroutines.Job r1 = (kotlinx.coroutines.Job) r1
            kotlin.a.e(r17)
            r4 = r17
            goto L7a
        L1e:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            net.luminis.tls.engine.impl.c.r(r1)
            return r7
        L24:
            kotlinx.coroutines.Job r1 = r0.e
            java.lang.Object r9 = r0.z
            androidx.compose.ui.input.pointer.k0 r9 = (androidx.compose.ui.input.pointer.k0) r9
            kotlin.a.e(r17)
            r10 = r17
            goto L58
        L30:
            kotlin.a.e(r17)
            java.lang.Object r1 = r0.z
            r9 = r1
            androidx.compose.ui.input.pointer.k0 r9 = (androidx.compose.ui.input.pointer.k0) r9
            androidx.compose.foundation.gestures.l0 r1 = androidx.compose.foundation.gestures.x2.a
            kotlinx.coroutines.CoroutineStart r12 = kotlinx.coroutines.CoroutineStart.UNDISPATCHED
            androidx.compose.foundation.gestures.r2 r13 = new androidx.compose.foundation.gestures.r2
            r13.<init>(r6, r7, r2)
            r14 = 1
            r15 = 0
            kotlinx.coroutines.CoroutineScope r10 = r0.A
            r11 = 0
            kotlinx.coroutines.Job r1 = kotlinx.coroutines.BuildersKt.launch$default(r10, r11, r12, r13, r14, r15)
            r0.z = r9
            r0.e = r1
            r0.y = r5
            r10 = 3
            java.lang.Object r10 = androidx.compose.foundation.gestures.x2.c(r9, r0, r10)
            if (r10 != r8) goto L58
            goto L79
        L58:
            androidx.compose.ui.input.pointer.v r10 = (androidx.compose.ui.input.pointer.v) r10
            r10.a()
            androidx.compose.foundation.gestures.l0 r11 = androidx.compose.foundation.gestures.x2.a
            kotlin.coroutines.jvm.internal.i r12 = r0.B
            if (r12 == r11) goto L6b
            androidx.compose.animation.b0 r11 = new androidx.compose.animation.b0
            r11.<init>(r12, r6, r10, r7)
            androidx.compose.foundation.gestures.x2.f(r3, r1, r11)
        L6b:
            r0.z = r1
            r0.e = r7
            r0.y = r4
            androidx.compose.ui.input.pointer.n r4 = androidx.compose.ui.input.pointer.n.y
            java.lang.Object r4 = androidx.compose.foundation.gestures.x2.h(r9, r4, r0)
            if (r4 != r8) goto L7a
        L79:
            return r8
        L7a:
            androidx.compose.ui.input.pointer.v r4 = (androidx.compose.ui.input.pointer.v) r4
            if (r4 != 0) goto L87
            androidx.compose.foundation.gestures.q2 r4 = new androidx.compose.foundation.gestures.q2
            r4.<init>(r6, r7, r2)
            androidx.compose.foundation.gestures.x2.f(r3, r1, r4)
            goto L9e
        L87:
            r4.a()
            androidx.compose.foundation.gestures.q2 r2 = new androidx.compose.foundation.gestures.q2
            r2.<init>(r6, r7, r5)
            androidx.compose.foundation.gestures.x2.f(r3, r1, r2)
            long r1 = r4.c
            androidx.compose.ui.geometry.b r3 = new androidx.compose.ui.geometry.b
            r3.<init>(r1)
            kotlin.jvm.functions.l r1 = r0.C
            r1.invoke(r3)
        L9e:
            kotlin.y r1 = kotlin.y.a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.s2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
