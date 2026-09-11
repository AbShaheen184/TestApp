package com.app.mlounge.ui.viewmodel;

import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b1 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public int A;
    public e1 B;
    public String C;
    public String D;
    public int E;
    public final /* synthetic */ e1 F;
    public final /* synthetic */ String G;
    public final /* synthetic */ String H;
    public int e;
    public int y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(e1 e1Var, String str, String str2, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.F = e1Var;
        this.G = str;
        this.H = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new b1(this.F, this.G, this.H, dVar);
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((b1) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0071  */
    /* JADX WARN: Code duplicated, block: B:22:0x008a  */
    /* JADX WARN: Code duplicated, block: B:25:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:26:0x00aa A[Catch: Exception -> 0x00db, PHI: r1 r9 r10 r11 r12 r13 r14 r15
  0x00aa: PHI (r1v4 int) = (r1v5 int), (r1v17 int) binds: [B:24:0x00a7, B:14:0x0041] A[DONT_GENERATE, DONT_INLINE]
  0x00aa: PHI (r9v2 int) = (r9v4 int), (r9v16 int) binds: [B:24:0x00a7, B:14:0x0041] A[DONT_GENERATE, DONT_INLINE]
  0x00aa: PHI (r10v2 int) = (r10v4 int), (r10v13 int) binds: [B:24:0x00a7, B:14:0x0041] A[DONT_GENERATE, DONT_INLINE]
  0x00aa: PHI (r11v4 int) = (r11v5 int), (r11v13 int) binds: [B:24:0x00a7, B:14:0x0041] A[DONT_GENERATE, DONT_INLINE]
  0x00aa: PHI (r12v4 java.lang.String) = (r12v6 java.lang.String), (r12v12 java.lang.String) binds: [B:24:0x00a7, B:14:0x0041] A[DONT_GENERATE, DONT_INLINE]
  0x00aa: PHI (r13v2 java.lang.String) = (r13v3 java.lang.String), (r13v9 java.lang.String) binds: [B:24:0x00a7, B:14:0x0041] A[DONT_GENERATE, DONT_INLINE]
  0x00aa: PHI (r14v2 com.app.mlounge.ui.viewmodel.e1) = (r14v3 com.app.mlounge.ui.viewmodel.e1), (r14v7 com.app.mlounge.ui.viewmodel.e1) binds: [B:24:0x00a7, B:14:0x0041] A[DONT_GENERATE, DONT_INLINE]
  0x00aa: PHI (r15v0 java.lang.Object) = (r15v4 java.lang.Object), (r15v7 java.lang.Object) binds: [B:24:0x00a7, B:14:0x0041] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {Exception -> 0x00db, blocks: (B:23:0x0091, B:26:0x00aa, B:28:0x00ae), top: B:43:0x0091 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x00ae A[Catch: Exception -> 0x00db, TRY_LEAVE, TryCatch #1 {Exception -> 0x00db, blocks: (B:23:0x0091, B:26:0x00aa, B:28:0x00ae), top: B:43:0x0091 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:35:0x00db A[PHI: r1 r11 r12 r13 r14
  0x00db: PHI (r1v3 int) = (r1v2 int), (r1v4 int), (r1v16 int) binds: [B:40:0x00db, B:27:0x00ac, B:15:0x0049] A[DONT_GENERATE, DONT_INLINE]
  0x00db: PHI (r11v2 int) = (r11v1 int), (r11v4 int), (r11v13 int) binds: [B:40:0x00db, B:27:0x00ac, B:15:0x0049] A[DONT_GENERATE, DONT_INLINE]
  0x00db: PHI (r12v2 java.lang.String) = (r12v1 java.lang.String), (r12v4 java.lang.String), (r12v12 java.lang.String) binds: [B:40:0x00db, B:27:0x00ac, B:15:0x0049] A[DONT_GENERATE, DONT_INLINE]
  0x00db: PHI (r13v1 java.lang.String) = (r13v0 java.lang.String), (r13v2 java.lang.String), (r13v9 java.lang.String) binds: [B:40:0x00db, B:27:0x00ac, B:15:0x0049] A[DONT_GENERATE, DONT_INLINE]
  0x00db: PHI (r14v1 com.app.mlounge.ui.viewmodel.e1) = 
  (r14v0 com.app.mlounge.ui.viewmodel.e1)
  (r14v2 com.app.mlounge.ui.viewmodel.e1)
  (r14v7 com.app.mlounge.ui.viewmodel.e1)
 binds: [B:40:0x00db, B:27:0x00ac, B:15:0x0049] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00c7 -> B:47:0x00c9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00db -> B:36:0x00df). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // kotlin.coroutines.jvm.internal.a
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.ui.viewmodel.b1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
