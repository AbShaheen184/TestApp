package androidx.datastore.core;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class y extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ kotlin.jvm.internal.x A;
    public final /* synthetic */ z B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ boolean D;
    public kotlin.jvm.internal.x e;
    public int y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(kotlin.jvm.internal.x xVar, z zVar, Object obj, boolean z, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.A = xVar;
        this.B = zVar;
        this.C = obj;
        this.D = z;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        y yVar = new y(this.A, this.B, this.C, this.D, dVar);
        yVar.z = obj;
        return yVar;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((y) create((i0) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x006a, code lost:
    
        if (r9 == r7) goto L22;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.io.IOException {
        /*
            r8 = this;
            int r0 = r8.y
            kotlin.y r1 = kotlin.y.a
            java.lang.Object r2 = r8.C
            androidx.datastore.core.z r3 = r8.B
            kotlin.jvm.internal.x r4 = r8.A
            r5 = 2
            r6 = 1
            kotlin.coroutines.intrinsics.a r7 = kotlin.coroutines.intrinsics.a.e
            if (r0 == 0) goto L29
            if (r0 == r6) goto L1f
            if (r0 != r5) goto L18
            kotlin.a.e(r9)
            goto L6d
        L18:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            net.luminis.tls.engine.impl.c.r(r9)
        L1d:
            r9 = 0
            return r9
        L1f:
            kotlin.jvm.internal.x r0 = r8.e
            java.lang.Object r6 = r8.z
            androidx.datastore.core.i0 r6 = (androidx.datastore.core.i0) r6
            kotlin.a.e(r9)
            goto L44
        L29:
            kotlin.a.e(r9)
            java.lang.Object r9 = r8.z
            androidx.datastore.core.i0 r9 = (androidx.datastore.core.i0) r9
            androidx.datastore.core.k0 r0 = r3.i()
            r8.z = r9
            r8.e = r4
            r8.y = r6
            java.lang.Object r0 = r0.a(r8)
            if (r0 != r7) goto L41
            goto L6c
        L41:
            r6 = r9
            r9 = r0
            r0 = r4
        L44:
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            r0.e = r9
            r9 = 0
            r8.z = r9
            r8.e = r9
            r8.y = r5
            java.util.concurrent.atomic.AtomicBoolean r0 = r6.c
            boolean r0 = r0.get()
            if (r0 != 0) goto L86
            java.io.File r0 = r6.a
            androidx.datastore.core.w r5 = new androidx.datastore.core.w
            r5.<init>(r6, r2, r9)
            java.lang.Object r9 = _COROUTINE.a.g(r0, r5, r8)
            if (r9 != r7) goto L69
            goto L6a
        L69:
            r9 = r1
        L6a:
            if (r9 != r7) goto L6d
        L6c:
            return r7
        L6d:
            boolean r9 = r8.D
            if (r9 == 0) goto L85
            androidx.datastore.core.a0 r9 = r3.h
            androidx.datastore.core.c r0 = new androidx.datastore.core.c
            if (r2 == 0) goto L7c
            int r3 = r2.hashCode()
            goto L7d
        L7c:
            r3 = 0
        L7d:
            int r4 = r4.e
            r0.<init>(r2, r3, r4)
            r9.c(r0)
        L85:
            return r1
        L86:
            java.lang.String r9 = "This scope has already been closed."
            net.luminis.tls.engine.impl.c.r(r9)
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.datastore.core.y.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
