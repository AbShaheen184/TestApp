package androidx.compose.foundation.gestures;

import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class u2 extends kotlin.coroutines.jvm.internal.h implements kotlin.jvm.functions.p {
    public int A;
    public /* synthetic */ Object B;
    public final /* synthetic */ CoroutineScope C;
    public final /* synthetic */ kotlin.jvm.functions.q D;
    public final /* synthetic */ kotlin.jvm.functions.l E;
    public final /* synthetic */ kotlin.jvm.functions.l F;
    public final /* synthetic */ kotlin.jvm.functions.l G;
    public final /* synthetic */ o1 H;
    public Object e;
    public Object y;
    public androidx.compose.ui.input.pointer.v z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(CoroutineScope coroutineScope, kotlin.jvm.functions.q qVar, kotlin.jvm.functions.l lVar, kotlin.jvm.functions.l lVar2, kotlin.jvm.functions.l lVar3, o1 o1Var, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.C = coroutineScope;
        this.D = qVar;
        this.E = lVar;
        this.F = lVar2;
        this.G = lVar3;
        this.H = o1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        u2 u2Var = new u2(this.C, this.D, this.E, this.F, this.G, this.H, dVar);
        u2Var.B = obj;
        return u2Var;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((u2) create((androidx.compose.ui.input.pointer.k0) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:20:0x0111  */
    /* JADX WARN: Code duplicated, block: B:22:0x011b  */
    /* JADX WARN: Code duplicated, block: B:25:0x0129  */
    /* JADX WARN: Code duplicated, block: B:27:0x0133  */
    /* JADX WARN: Code duplicated, block: B:30:0x0143  */
    /* JADX WARN: Code duplicated, block: B:33:0x0150  */
    /* JADX WARN: Code duplicated, block: B:38:0x0176  */
    /* JADX WARN: Code duplicated, block: B:40:0x017c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0181  */
    /* JADX WARN: Code duplicated, block: B:43:0x0185  */
    /* JADX WARN: Code duplicated, block: B:45:0x0188  */
    /* JADX WARN: Code duplicated, block: B:46:0x0192  */
    /* JADX WARN: Code duplicated, block: B:48:0x01a1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:51:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:54:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:57:0x01da  */
    /* JADX WARN: Code duplicated, block: B:59:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:61:0x0203  */
    /* JADX WARN: Code duplicated, block: B:62:0x0217  */
    /* JADX WARN: Code duplicated, block: B:64:0x021c  */
    /* JADX WARN: Code duplicated, block: B:67:0x022c  */
    /* JADX WARN: Code duplicated, block: B:69:0x0234  */
    /* JADX WARN: Code duplicated, block: B:72:0x0246  */
    /* JADX WARN: Code duplicated, block: B:75:0x0254  */
    /* JADX WARN: Code duplicated, block: B:78:0x0273  */
    /* JADX WARN: Code duplicated, block: B:81:0x027e  */
    /* JADX WARN: Code duplicated, block: B:83:0x0282  */
    /* JADX WARN: Code duplicated, block: B:85:0x0289  */
    /* JADX WARN: Code duplicated, block: B:87:0x028d  */
    /* JADX WARN: Code duplicated, block: B:89:0x0291  */
    /* JADX WARN: Code duplicated, block: B:91:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:93:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:95:0x02c0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:96:0x02c1  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0167, code lost:
    
        if (androidx.compose.foundation.gestures.x2.a(r4, r29) == r6) goto L77;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r17v2, types: [kotlin.coroutines.d] */
    /* JADX WARN: Type inference failed for: r2v24, types: [androidx.compose.ui.input.pointer.v] */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r3v11, types: [kotlin.coroutines.d] */
    /* JADX WARN: Type inference failed for: r3v17, types: [kotlin.coroutines.d] */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.lang.Object, kotlin.coroutines.d] */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24, types: [kotlin.coroutines.d] */
    /* JADX WARN: Type inference failed for: r3v27, types: [androidx.compose.ui.input.pointer.v, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29, types: [kotlin.coroutines.d] */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r3v39 */
    /* JADX WARN: Type inference failed for: r3v40 */
    /* JADX WARN: Type inference failed for: r3v41 */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r30) {
        /*
            Method dump skipped, instruction units count: 732
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.u2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
