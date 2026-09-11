package com.app.mlounge.ui.viewmodel;

import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d1 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public int A;
    public int B;
    public e1 C;
    public String D;
    public int E;
    public final /* synthetic */ int F;
    public final /* synthetic */ e1 G;
    public final /* synthetic */ String H;
    public long e;
    public int y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(int i, e1 e1Var, String str, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.F = i;
        this.G = e1Var;
        this.H = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new d1(this.F, this.G, this.H, dVar);
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((d1) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0081  */
    /* JADX WARN: Code duplicated, block: B:25:0x0098  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b7 A[Catch: Exception -> 0x00ec, PHI: r1 r3 r5 r9 r10 r11 r12 r13 r15
  0x00b7: PHI (r1v5 int) = (r1v6 int), (r1v19 int) binds: [B:27:0x00b4, B:14:0x003f] A[DONT_GENERATE, DONT_INLINE]
  0x00b7: PHI (r3v1 java.lang.Object) = (r3v6 java.lang.Object), (r3v16 java.lang.Object) binds: [B:27:0x00b4, B:14:0x003f] A[DONT_GENERATE, DONT_INLINE]
  0x00b7: PHI (r5v1 int) = (r5v2 int), (r5v0 int) binds: [B:27:0x00b4, B:14:0x003f] A[DONT_GENERATE, DONT_INLINE]
  0x00b7: PHI (r9v5 int) = (r9v7 int), (r9v19 int) binds: [B:27:0x00b4, B:14:0x003f] A[DONT_GENERATE, DONT_INLINE]
  0x00b7: PHI (r10v2 java.lang.String) = (r10v4 java.lang.String), (r10v14 java.lang.String) binds: [B:27:0x00b4, B:14:0x003f] A[DONT_GENERATE, DONT_INLINE]
  0x00b7: PHI (r11v4 int) = (r11v5 int), (r11v10 int) binds: [B:27:0x00b4, B:14:0x003f] A[DONT_GENERATE, DONT_INLINE]
  0x00b7: PHI (r12v2 int) = (r12v4 int), (r12v14 int) binds: [B:27:0x00b4, B:14:0x003f] A[DONT_GENERATE, DONT_INLINE]
  0x00b7: PHI (r13v3 long) = (r13v5 long), (r13v13 long) binds: [B:27:0x00b4, B:14:0x003f] A[DONT_GENERATE, DONT_INLINE]
  0x00b7: PHI (r15v1 com.app.mlounge.ui.viewmodel.e1) = (r15v2 com.app.mlounge.ui.viewmodel.e1), (r15v6 com.app.mlounge.ui.viewmodel.e1) binds: [B:27:0x00b4, B:14:0x003f] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {Exception -> 0x00ec, blocks: (B:26:0x009e, B:29:0x00b7, B:31:0x00bb), top: B:46:0x009e }] */
    /* JADX WARN: Code duplicated, block: B:31:0x00bb A[Catch: Exception -> 0x00ec, TRY_LEAVE, TryCatch #1 {Exception -> 0x00ec, blocks: (B:26:0x009e, B:29:0x00b7, B:31:0x00bb), top: B:46:0x009e }] */
    /* JADX WARN: Code duplicated, block: B:34:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:37:0x00ec A[PHI: r1 r10 r11 r13 r15
  0x00ec: PHI (r1v4 int) = (r1v5 int), (r1v6 int) binds: [B:30:0x00b9, B:43:0x00ec] A[DONT_GENERATE, DONT_INLINE]
  0x00ec: PHI (r10v0 java.lang.String) = (r10v2 java.lang.String), (r10v4 java.lang.String) binds: [B:30:0x00b9, B:43:0x00ec] A[DONT_GENERATE, DONT_INLINE]
  0x00ec: PHI (r11v3 int) = (r11v4 int), (r11v5 int) binds: [B:30:0x00b9, B:43:0x00ec] A[DONT_GENERATE, DONT_INLINE]
  0x00ec: PHI (r13v1 long) = (r13v3 long), (r13v5 long) binds: [B:30:0x00b9, B:43:0x00ec] A[DONT_GENERATE, DONT_INLINE]
  0x00ec: PHI (r15v0 com.app.mlounge.ui.viewmodel.e1) = (r15v1 com.app.mlounge.ui.viewmodel.e1), (r15v2 com.app.mlounge.ui.viewmodel.e1) binds: [B:30:0x00b9, B:43:0x00ec] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00d4 -> B:35:0x00d8). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.a
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.ui.viewmodel.d1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
