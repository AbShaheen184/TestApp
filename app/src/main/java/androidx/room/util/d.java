package androidx.room.util;

import androidx.room.q;
import androidx.room.x;
import androidx.room.y;
import kotlin.jvm.functions.l;
import kotlin.jvm.functions.p;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends kotlin.coroutines.jvm.internal.i implements p {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ q C;
    public final /* synthetic */ l D;
    public x e;
    public int y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(q qVar, kotlin.coroutines.d dVar, l lVar, boolean z, boolean z2) {
        super(2, dVar);
        this.A = z;
        this.B = z2;
        this.C = qVar;
        this.D = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        d dVar2 = new d(this.C, dVar, this.D, this.A, this.B);
        dVar2.z = obj;
        return dVar2;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((y) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00aa A[DONT_INVERT, PHI: r1 r2
  0x00aa: PHI (r1v12 androidx.room.y) = (r1v9 androidx.room.y), (r1v23 androidx.room.y) binds: [B:36:0x00a7, B:11:0x002c] A[DONT_GENERATE, DONT_INLINE]
  0x00aa: PHI (r2v2 java.lang.Object) = (r2v1 java.lang.Object), (r2v5 java.lang.Object) binds: [B:36:0x00a7, B:11:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:39:0x00ac  */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00b4, code lost:
    
        if (r1 == r10) goto L41;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.util.d.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
