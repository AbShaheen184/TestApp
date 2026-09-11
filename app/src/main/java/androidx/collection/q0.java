package androidx.collection;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 extends kotlin.coroutines.jvm.internal.h implements kotlin.jvm.functions.p {
    public int A;
    public int B;
    public int C;
    public int D;
    public long E;
    public int F;
    public /* synthetic */ Object G;
    public final /* synthetic */ r0 H;
    public final /* synthetic */ m0 I;
    public m0 e;
    public r0 y;
    public long[] z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(r0 r0Var, m0 m0Var, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.H = r0Var;
        this.I = m0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        q0 q0Var = new q0(this.H, this.I, dVar);
        q0Var.G = obj;
        return q0Var;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((q0) create((kotlin.sequences.j) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0051  */
    /* JADX WARN: Code duplicated, block: B:20:0x0097 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0099  */
    /* JADX WARN: Code duplicated, block: B:23:0x00a1  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x004f -> B:22:0x009f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0051 -> B:14:0x0064). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006d -> B:19:0x0094). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    @Override // kotlin.coroutines.jvm.internal.a
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            int r1 = r0.F
            r2 = 0
            r3 = 8
            r4 = 1
            if (r1 == 0) goto L2c
            if (r1 != r4) goto L25
            int r1 = r0.D
            int r5 = r0.C
            long r6 = r0.E
            int r8 = r0.B
            int r9 = r0.A
            long[] r10 = r0.z
            androidx.collection.r0 r11 = r0.y
            androidx.collection.m0 r12 = r0.e
            java.lang.Object r13 = r0.G
            kotlin.sequences.j r13 = (kotlin.sequences.j) r13
            kotlin.a.e(r21)
            goto L94
        L25:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            net.luminis.tls.engine.impl.c.r(r1)
            r1 = 0
            return r1
        L2c:
            kotlin.a.e(r21)
            java.lang.Object r1 = r0.G
            kotlin.sequences.j r1 = (kotlin.sequences.j) r1
            androidx.collection.r0 r5 = r0.H
            androidx.collection.p0 r6 = r5.y
            long[] r6 = r6.a
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto La4
            androidx.collection.m0 r8 = r0.I
            r9 = r2
        L41:
            r10 = r6[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L9f
            int r12 = r9 - r7
            int r12 = ~r12
            int r12 = r12 >>> 31
            int r12 = 8 - r12
            r13 = r1
            r1 = r2
            r18 = r10
            r11 = r5
            r10 = r6
            r5 = r12
            r12 = r8
            r8 = r9
            r9 = r7
            r6 = r18
        L64:
            if (r1 >= r5) goto L97
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r6
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L94
            int r2 = r8 << 3
            int r2 = r2 + r1
            r12.y = r2
            androidx.collection.p0 r3 = r11.y
            java.lang.Object[] r3 = r3.b
            r2 = r3[r2]
            r0.G = r13
            r0.e = r12
            r0.y = r11
            r0.z = r10
            r0.A = r9
            r0.B = r8
            r0.E = r6
            r0.C = r5
            r0.D = r1
            r0.F = r4
            r13.b(r2, r0)
            kotlin.coroutines.intrinsics.a r1 = kotlin.coroutines.intrinsics.a.e
            return r1
        L94:
            long r6 = r6 >> r3
            int r1 = r1 + r4
            goto L64
        L97:
            if (r5 != r3) goto La4
            r7 = r9
            r6 = r10
            r5 = r11
            r1 = r13
            r9 = r8
            r8 = r12
        L9f:
            if (r9 == r7) goto La4
            int r9 = r9 + 1
            goto L41
        La4:
            kotlin.y r1 = kotlin.y.a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.q0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
