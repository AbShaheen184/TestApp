package androidx.compose.material3;

import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ float A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ androidx.compose.foundation.interaction.j C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ int e = 1;
    public int y;
    public final /* synthetic */ androidx.compose.animation.core.d z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(androidx.compose.animation.core.d dVar, float f, boolean z, androidx.compose.foundation.interaction.j jVar, androidx.compose.runtime.y0 y0Var, kotlin.coroutines.d dVar2) {
        super(2, dVar2);
        this.z = dVar;
        this.A = f;
        this.B = z;
        this.C = jVar;
        this.D = y0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                return new u(this.z, this.A, this.B, (v) this.D, this.C, dVar);
            default:
                return new u(this.z, this.A, this.B, this.C, (androidx.compose.runtime.y0) this.D, dVar);
        }
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) obj2;
        switch (this.e) {
            case 0:
                break;
        }
        return ((u) create(coroutineScope, dVar)).invokeSuspend(kotlin.y.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:
    
        if (r9.e(r1, r8) == r6) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
    
        if (androidx.compose.material3.internal.i.a(r9, r5, r1, r2, r8) == r6) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a6, code lost:
    
        if (r9.e(r0, r8) == r5) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00e8, code lost:
    
        if (androidx.compose.material3.internal.i.a(r9, r4, r0, r8.C, r8) == r5) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:?, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:?, code lost:
    
        return r5;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.u.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(androidx.compose.animation.core.d dVar, float f, boolean z, v vVar, androidx.compose.foundation.interaction.j jVar, kotlin.coroutines.d dVar2) {
        super(2, dVar2);
        this.z = dVar;
        this.A = f;
        this.B = z;
        this.D = vVar;
        this.C = jVar;
    }
}
