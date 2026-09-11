package com.app.mlounge.data.repository;

import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ String B;
    public final /* synthetic */ int C;
    public final /* synthetic */ int D;
    public int e;
    public /* synthetic */ Object y;
    public final /* synthetic */ r z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(r rVar, boolean z, String str, int i, int i2, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.z = rVar;
        this.A = z;
        this.B = str;
        this.C = i;
        this.D = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        k kVar = new k(this.z, this.A, this.B, this.C, this.D, dVar);
        kVar.y = obj;
        return kVar;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0091, code lost:
    
        if (r1 == r9) goto L26;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            r0 = r17
            java.lang.Object r1 = r0.y
            r2 = r1
            kotlinx.coroutines.CoroutineScope r2 = (kotlinx.coroutines.CoroutineScope) r2
            int r1 = r0.e
            com.app.mlounge.data.repository.r r3 = r0.z
            r8 = 2
            r4 = 1
            kotlin.coroutines.intrinsics.a r9 = kotlin.coroutines.intrinsics.a.e
            if (r1 == 0) goto L29
            if (r1 == r4) goto L23
            if (r1 != r8) goto L1c
            kotlin.a.e(r18)
            r1 = r18
            goto L94
        L1c:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            net.luminis.tls.engine.impl.c.r(r1)
            r1 = 0
            return r1
        L23:
            kotlin.a.e(r18)
            r1 = r18
            goto L3b
        L29:
            kotlin.a.e(r18)
            com.app.mlounge.data.local.prefs.y1 r1 = r3.f
            kotlinx.coroutines.flow.Flow r1 = r1.p
            r0.y = r2
            r0.e = r4
            java.lang.Object r1 = kotlinx.coroutines.flow.FlowKt.first(r1, r0)
            if (r1 != r9) goto L3b
            goto L93
        L3b:
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            if (r1 == 0) goto L48
            boolean r1 = kotlin.text.k.d0(r1)
            if (r1 == 0) goto L46
            goto L48
        L46:
            r1 = 0
            goto L49
        L48:
            r1 = r4
        L49:
            r1 = r1 ^ r4
            java.lang.String r4 = "tv"
            boolean r5 = r0.A
            java.util.List r1 = com.app.mlounge.data.repository.r.a(r3, r4, r5, r1)
            java.util.ArrayList r10 = new java.util.ArrayList
            r3 = 10
            int r3 = kotlin.collections.p.y(r1, r3)
            r10.<init>(r3)
            java.util.Iterator r1 = r1.iterator()
        L61:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L88
            java.lang.Object r3 = r1.next()
            r12 = r3
            com.app.mlounge.data.providers.k0 r12 = (com.app.mlounge.data.providers.k0) r12
            com.app.mlounge.data.repository.j r5 = new com.app.mlounge.data.repository.j
            r16 = 0
            java.lang.String r13 = r0.B
            int r14 = r0.C
            int r15 = r0.D
            r11 = r5
            r11.<init>(r12, r13, r14, r15, r16)
            r6 = 3
            r7 = 0
            r3 = 0
            r4 = 0
            kotlinx.coroutines.Deferred r3 = kotlinx.coroutines.BuildersKt.async$default(r2, r3, r4, r5, r6, r7)
            r10.add(r3)
            goto L61
        L88:
            r1 = 0
            r0.y = r1
            r0.e = r8
            java.lang.Object r1 = kotlinx.coroutines.AwaitKt.awaitAll(r10, r0)
            if (r1 != r9) goto L94
        L93:
            return r9
        L94:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L9f:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto Lb3
            java.lang.Object r3 = r1.next()
            java.util.List r3 = (java.util.List) r3
            if (r3 != 0) goto Laf
            kotlin.collections.u r3 = kotlin.collections.u.e
        Laf:
            kotlin.collections.o.C(r2, r3)
            goto L9f
        Lb3:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.data.repository.k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
