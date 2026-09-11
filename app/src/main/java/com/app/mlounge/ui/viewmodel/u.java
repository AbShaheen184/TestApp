package com.app.mlounge.ui.viewmodel;

import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ int e;
    public int y;
    public final /* synthetic */ a0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(a0 a0Var, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.z = a0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                return new u(this.z, dVar, 0);
            default:
                return new u(this.z, dVar, 1);
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

    /* JADX WARN: Code duplicated, block: B:30:0x008d A[Catch: all -> 0x0027, Exception -> 0x002a, LOOP:0: B:28:0x0087->B:30:0x008d, LOOP_END, Merged into TryCatch #1 {all -> 0x0027, Exception -> 0x002a, blocks: (B:11:0x0022, B:53:0x00f9, B:56:0x0101, B:18:0x0035, B:27:0x0076, B:28:0x0087, B:30:0x008d, B:31:0x00ac, B:21:0x0047, B:24:0x005f, B:32:0x00b0, B:34:0x00b8, B:37:0x00c1, B:39:0x00c9, B:42:0x00d2, B:44:0x00d8, B:47:0x00e1, B:49:0x00e9), top: B:77:0x0016 }] */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ef, code lost:
    
        if (com.app.mlounge.ui.viewmodel.a0.f(r2, r5, r18) == r13) goto L51;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.ui.viewmodel.u.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
