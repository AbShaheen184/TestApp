package com.app.mlounge.data.download;

import kotlin.coroutines.jvm.internal.i;
import kotlin.jvm.functions.p;
import kotlin.y;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends i implements p {
    public final /* synthetic */ long A;
    public final /* synthetic */ int e;
    public int y;
    public final /* synthetic */ h z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(h hVar, long j, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.z = hVar;
        this.A = j;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                return new b(this.z, this.A, dVar, 0);
            case 1:
                return new b(this.z, this.A, dVar, 1);
            case 2:
                return new b(this.z, this.A, dVar, 2);
            case 3:
                return new b(this.z, this.A, dVar, 3);
            default:
                return new b(this.z, this.A, dVar, 4);
        }
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) obj2;
        switch (this.e) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return ((b) create(coroutineScope, dVar)).invokeSuspend(y.a);
    }

    /* JADX WARN: Code duplicated, block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:98:0x0192  */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
    
        if (r0.e(r12, r11) == r7) goto L19;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 424
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.data.download.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
