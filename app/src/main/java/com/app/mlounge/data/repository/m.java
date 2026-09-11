package com.app.mlounge.data.repository;

import java.util.Set;
import kotlinx.coroutines.channels.ProducerScope;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ r A;
    public final /* synthetic */ Set B;
    public final /* synthetic */ String C;
    public final /* synthetic */ int D;
    public final /* synthetic */ int E;
    public boolean e;
    public int y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(r rVar, Set set, String str, int i, int i2, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.A = rVar;
        this.B = set;
        this.C = str;
        this.D = i;
        this.E = i2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        m mVar = new m(this.A, this.B, this.C, this.D, this.E, dVar);
        mVar.z = obj;
        return mVar;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((ProducerScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
    
        if (r10 == r5) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.z
            r1 = r0
            kotlinx.coroutines.channels.ProducerScope r1 = (kotlinx.coroutines.channels.ProducerScope) r1
            int r0 = r9.y
            r2 = 2
            com.app.mlounge.data.repository.r r3 = r9.A
            r4 = 1
            kotlin.coroutines.intrinsics.a r5 = kotlin.coroutines.intrinsics.a.e
            if (r0 == 0) goto L24
            if (r0 == r4) goto L20
            if (r0 != r2) goto L19
            boolean r0 = r9.e
            kotlin.a.e(r10)
            goto L49
        L19:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            net.luminis.tls.engine.impl.c.r(r10)
            r10 = 0
            return r10
        L20:
            kotlin.a.e(r10)
            goto L32
        L24:
            kotlin.a.e(r10)
            r9.z = r1
            r9.y = r4
            java.lang.Object r10 = r3.c(r9)
            if (r10 != r5) goto L32
            goto L48
        L32:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r0 = r10.booleanValue()
            com.app.mlounge.data.local.prefs.y1 r10 = r3.f
            kotlinx.coroutines.flow.Flow r10 = r10.p
            r9.z = r1
            r9.e = r0
            r9.y = r2
            java.lang.Object r10 = kotlinx.coroutines.flow.FlowKt.first(r10, r9)
            if (r10 != r5) goto L49
        L48:
            return r5
        L49:
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10
            if (r10 == 0) goto L56
            boolean r10 = kotlin.text.k.d0(r10)
            if (r10 == 0) goto L54
            goto L56
        L54:
            r10 = 0
            goto L57
        L56:
            r10 = r4
        L57:
            r10 = r10 ^ r4
            java.lang.String r2 = "tv"
            java.util.List r10 = com.app.mlounge.data.repository.r.a(r3, r2, r0, r10)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r10 = r10.iterator()
        L67:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L84
            java.lang.Object r2 = r10.next()
            r3 = r2
            com.app.mlounge.data.providers.k0 r3 = (com.app.mlounge.data.providers.k0) r3
            java.lang.String r3 = r3.getName()
            java.util.Set r4 = r9.B
            boolean r3 = r4.contains(r3)
            if (r3 == 0) goto L67
            r0.add(r2)
            goto L67
        L84:
            java.util.Iterator r10 = r0.iterator()
        L88:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto Laf
            java.lang.Object r0 = r10.next()
            r3 = r0
            com.app.mlounge.data.providers.k0 r3 = (com.app.mlounge.data.providers.k0) r3
            com.app.mlounge.data.repository.l r4 = new com.app.mlounge.data.repository.l
            r8 = 0
            com.app.mlounge.data.repository.r r2 = r9.A
            r7 = r1
            r1 = r4
            java.lang.String r4 = r9.C
            int r5 = r9.D
            int r6 = r9.E
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r5 = 3
            r6 = 0
            r2 = 0
            r3 = 0
            r4 = r1
            r1 = r7
            kotlinx.coroutines.BuildersKt.launch$default(r1, r2, r3, r4, r5, r6)
            goto L88
        Laf:
            kotlin.y r10 = kotlin.y.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.data.repository.m.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
