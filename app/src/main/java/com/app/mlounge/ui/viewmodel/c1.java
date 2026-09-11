package com.app.mlounge.ui.viewmodel;

import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c1 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public int A;
    public final /* synthetic */ int B;
    public final /* synthetic */ e1 C;
    public final /* synthetic */ String D;
    public long e;
    public kotlin.k y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(int i, e1 e1Var, String str, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.B = i;
        this.C = e1Var;
        this.D = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new c1(this.B, this.C, this.D, dVar);
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((c1) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0062  */
    /* JADX WARN: Code duplicated, block: B:29:0x0084  */
    /* JADX WARN: Code duplicated, block: B:30:0x0085 A[Catch: Exception -> 0x0060, PHI: r3 r12 r14 r15
  0x0085: PHI (r3v8 int) = (r3v6 int), (r3v12 int) binds: [B:28:0x0082, B:14:0x0041] A[DONT_GENERATE, DONT_INLINE]
  0x0085: PHI (r12v7 long) = (r12v5 long), (r12v9 long) binds: [B:28:0x0082, B:14:0x0041] A[DONT_GENERATE, DONT_INLINE]
  0x0085: PHI (r14v6 kotlin.k) = (r14v4 kotlin.k), (r14v9 kotlin.k) binds: [B:28:0x0082, B:14:0x0041] A[DONT_GENERATE, DONT_INLINE]
  0x0085: PHI (r15v3 java.lang.Object) = (r15v0 java.lang.Object), (r15v5 java.lang.Object) binds: [B:28:0x0082, B:14:0x0041] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {Exception -> 0x0060, blocks: (B:13:0x003e, B:30:0x0085, B:27:0x0076), top: B:48:0x003e }] */
    /* JADX WARN: Code duplicated, block: B:32:0x0089 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x008b  */
    /* JADX WARN: Code duplicated, block: B:35:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:41:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:45:0x00d1  */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00c1, code lost:
    
        if (r1 == r11) goto L43;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0082 -> B:30:0x0085). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 231
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.ui.viewmodel.c1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
