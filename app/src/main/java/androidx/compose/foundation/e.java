package androidx.compose.foundation;

import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ androidx.compose.foundation.gestures.l1 A;
    public final /* synthetic */ long B;
    public final /* synthetic */ androidx.compose.foundation.interaction.k C;
    public final /* synthetic */ j D;
    public boolean e;
    public int y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(androidx.compose.foundation.gestures.l1 l1Var, long j, androidx.compose.foundation.interaction.k kVar, j jVar, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.A = l1Var;
        this.B = j;
        this.C = kVar;
        this.D = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        e eVar = new e(this.A, this.B, this.C, this.D, dVar);
        eVar.z = obj;
        return eVar;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0096  */
    /* JADX WARN: Code duplicated, block: B:28:0x00ad A[PHI: r1 r4
  0x00ad: PHI (r1v6 kotlin.coroutines.intrinsics.a) = (r1v4 kotlin.coroutines.intrinsics.a), (r1v15 kotlin.coroutines.intrinsics.a) binds: [B:26:0x00aa, B:13:0x0029] A[DONT_GENERATE, DONT_INLINE]
  0x00ad: PHI (r4v13 androidx.compose.foundation.interaction.n) = (r4v12 androidx.compose.foundation.interaction.n), (r4v17 androidx.compose.foundation.interaction.n) binds: [B:26:0x00aa, B:13:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b5, code lost:
    
        if (r14.a(r4, r22) == r1) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00d1, code lost:
    
        if (r14.a(r4, r22) == r1) goto L38;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
