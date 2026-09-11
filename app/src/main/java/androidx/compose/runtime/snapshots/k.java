package androidx.compose.runtime.snapshots;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends kotlin.coroutines.jvm.internal.h implements kotlin.jvm.functions.p {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ l C;
    public long[] e;
    public int y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.C = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        k kVar = new k(this.C, dVar);
        kVar.B = obj;
        return kVar;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((k) create((kotlin.sequences.j) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0079  */
    /* JADX WARN: Code duplicated, block: B:24:0x0081  */
    /* JADX WARN: Code duplicated, block: B:27:0x0096  */
    /* JADX WARN: Code duplicated, block: B:30:0x009b  */
    /* JADX WARN: Code duplicated, block: B:32:0x009f  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:36:0x00bc  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x007f -> B:26:0x0094). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x00bc -> B:37:0x00be). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:27:0x0096
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.a
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            r22 = this;
            r0 = r22
            androidx.compose.runtime.snapshots.l r1 = r0.C
            long r2 = r1.e
            long r4 = r1.z
            long r6 = r1.y
            int r8 = r0.A
            r9 = 0
            r12 = 3
            r13 = 2
            r14 = 64
            r16 = 0
            r18 = 1
            r10 = 1
            kotlin.coroutines.intrinsics.a r11 = kotlin.coroutines.intrinsics.a.e
            if (r8 == 0) goto L4c
            if (r8 == r10) goto L3d
            if (r8 == r13) goto L33
            if (r8 != r12) goto L2c
            int r1 = r0.y
            java.lang.Object r6 = r0.B
            kotlin.sequences.j r6 = (kotlin.sequences.j) r6
            kotlin.a.e(r23)
            r7 = r12
            goto Lbe
        L2c:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            net.luminis.tls.engine.impl.c.r(r1)
            r1 = 0
            return r1
        L33:
            int r1 = r0.y
            java.lang.Object r8 = r0.B
            kotlin.sequences.j r8 = (kotlin.sequences.j) r8
            kotlin.a.e(r23)
            goto L94
        L3d:
            int r1 = r0.z
            int r8 = r0.y
            long[] r15 = r0.e
            java.lang.Object r12 = r0.B
            kotlin.sequences.j r12 = (kotlin.sequences.j) r12
            kotlin.a.e(r23)
            int r8 = r8 + r10
            goto L5a
        L4c:
            kotlin.a.e(r23)
            java.lang.Object r8 = r0.B
            r12 = r8
            kotlin.sequences.j r12 = (kotlin.sequences.j) r12
            long[] r15 = r1.A
            if (r15 == 0) goto L71
            int r1 = r15.length
            r8 = 0
        L5a:
            if (r8 >= r1) goto L71
            r2 = r15[r8]
            java.lang.Long r4 = new java.lang.Long
            r4.<init>(r2)
            r0.B = r12
            r0.e = r15
            r0.y = r8
            r0.z = r1
            r0.A = r10
            r12.b(r4, r0)
            return r11
        L71:
            int r1 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r1 == 0) goto L97
            r8 = r12
            r1 = 0
        L77:
            if (r1 >= r14) goto L96
            long r20 = r18 << r1
            long r20 = r6 & r20
            int r12 = (r20 > r16 ? 1 : (r20 == r16 ? 0 : -1))
            if (r12 == 0) goto L94
            long r2 = (long) r1
            long r4 = r4 + r2
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r4)
            r0.B = r8
            r0.e = r9
            r0.y = r1
            r0.A = r13
            r8.b(r2, r0)
            return r11
        L94:
            int r1 = r1 + r10
            goto L77
        L96:
            r12 = r8
        L97:
            int r1 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r1 == 0) goto Lc1
            r6 = r12
            r15 = 0
        L9d:
            if (r15 >= r14) goto Lc1
            long r7 = r18 << r15
            long r7 = r7 & r2
            int r1 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r1 == 0) goto Lbc
            long r1 = (long) r15
            long r4 = r4 + r1
            long r1 = (long) r14
            long r4 = r4 + r1
            java.lang.Long r1 = new java.lang.Long
            r1.<init>(r4)
            r0.B = r6
            r0.e = r9
            r0.y = r15
            r7 = 3
            r0.A = r7
            r6.b(r1, r0)
            return r11
        Lbc:
            r7 = 3
            r1 = r15
        Lbe:
            int r15 = r1 + 1
            goto L9d
        Lc1:
            kotlin.y r1 = kotlin.y.a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.snapshots.k.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
