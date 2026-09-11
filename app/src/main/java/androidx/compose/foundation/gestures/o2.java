package androidx.compose.foundation.gestures;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class o2 extends kotlin.coroutines.jvm.internal.h implements kotlin.jvm.functions.p {
    public long A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int e = 1;
    public int y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(long j, kotlin.jvm.internal.y yVar, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.A = j;
        this.B = yVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                o2 o2Var = new o2((androidx.compose.ui.input.pointer.v) this.B, dVar);
                o2Var.z = obj;
                return o2Var;
            default:
                o2 o2Var2 = new o2(this.A, (kotlin.jvm.internal.y) this.B, dVar);
                o2Var2.z = obj;
                return o2Var2;
        }
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        androidx.compose.ui.input.pointer.k0 k0Var = (androidx.compose.ui.input.pointer.k0) obj;
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) obj2;
        switch (this.e) {
            case 0:
                break;
        }
        return ((o2) create(k0Var, dVar)).invokeSuspend(kotlin.y.a);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r7v18, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00af -> B:31:0x00b3). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:22:0x0071
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.a
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.e
            switch(r0) {
                case 0: goto L71;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r6.B
            kotlin.jvm.internal.y r0 = (kotlin.jvm.internal.y) r0
            int r1 = r6.y
            r2 = 1
            if (r1 == 0) goto L1f
            if (r1 != r2) goto L18
            java.lang.Object r1 = r6.z
            androidx.compose.ui.input.pointer.k0 r1 = (androidx.compose.ui.input.pointer.k0) r1
            kotlin.a.e(r7)
            goto L3e
        L18:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            net.luminis.tls.engine.impl.c.r(r7)
            r7 = 0
            goto L70
        L1f:
            kotlin.a.e(r7)
            java.lang.Object r7 = r6.z
            r1 = r7
            androidx.compose.ui.input.pointer.k0 r1 = (androidx.compose.ui.input.pointer.k0) r1
            long r3 = r6.A
            androidx.compose.animation.core.g0 r7 = new androidx.compose.animation.core.g0
            r5 = 9
            r7.<init>(r0, r5)
            r6.z = r1
            r6.y = r2
            java.lang.Object r7 = androidx.compose.foundation.gestures.f0.c(r1, r3, r7, r6)
            kotlin.coroutines.intrinsics.a r2 = kotlin.coroutines.intrinsics.a.e
            if (r7 != r2) goto L3e
            r7 = r2
            goto L70
        L3e:
            androidx.compose.ui.input.pointer.v r7 = (androidx.compose.ui.input.pointer.v) r7
            if (r7 == 0) goto L56
            long r2 = r0.e
            r4 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            long r2 = r2 & r4
            r4 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 == 0) goto L56
            androidx.compose.foundation.text.selection.k r7 = androidx.compose.foundation.text.selection.k.y
            goto L70
        L56:
            androidx.compose.ui.input.pointer.l0 r7 = r1.C
            androidx.compose.ui.input.pointer.m r7 = r7.P
            java.lang.Object r7 = r7.a
            java.lang.Object r7 = kotlin.collections.o.K(r7)
            androidx.compose.ui.input.pointer.v r7 = (androidx.compose.ui.input.pointer.v) r7
            boolean r0 = androidx.compose.ui.input.pointer.u.d(r7)
            if (r0 == 0) goto L6e
            r7.a()
            androidx.compose.foundation.text.selection.k r7 = androidx.compose.foundation.text.selection.k.e
            goto L70
        L6e:
            androidx.compose.foundation.text.selection.k r7 = androidx.compose.foundation.text.selection.k.A
        L70:
            return r7
        L71:
            int r0 = r6.y
            r1 = 1
            if (r0 == 0) goto L89
            if (r0 != r1) goto L82
            long r2 = r6.A
            java.lang.Object r0 = r6.z
            androidx.compose.ui.input.pointer.k0 r0 = (androidx.compose.ui.input.pointer.k0) r0
            kotlin.a.e(r7)
            goto Lb3
        L82:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            net.luminis.tls.engine.impl.c.r(r7)
            r7 = 0
            goto Lbb
        L89:
            kotlin.a.e(r7)
            java.lang.Object r7 = r6.z
            androidx.compose.ui.input.pointer.k0 r7 = (androidx.compose.ui.input.pointer.k0) r7
            java.lang.Object r0 = r6.B
            androidx.compose.ui.input.pointer.v r0 = (androidx.compose.ui.input.pointer.v) r0
            long r2 = r0.b
            androidx.compose.ui.platform.p2 r0 = r7.f()
            r0.getClass()
            r4 = 40
            long r4 = r4 + r2
            r0 = r7
            r2 = r4
        La2:
            r6.z = r0
            r6.A = r2
            r6.y = r1
            r7 = 3
            java.lang.Object r7 = androidx.compose.foundation.gestures.x2.c(r0, r6, r7)
            kotlin.coroutines.intrinsics.a r4 = kotlin.coroutines.intrinsics.a.e
            if (r7 != r4) goto Lb3
            r7 = r4
            goto Lbb
        Lb3:
            androidx.compose.ui.input.pointer.v r7 = (androidx.compose.ui.input.pointer.v) r7
            long r4 = r7.b
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 < 0) goto La2
        Lbb:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.o2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(androidx.compose.ui.input.pointer.v vVar, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.B = vVar;
    }
}
