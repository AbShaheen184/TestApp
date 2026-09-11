package androidx.compose.material3;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class z implements kotlin.jvm.functions.p {
    public final /* synthetic */ long e;
    public final /* synthetic */ androidx.compose.foundation.layout.m0 y;
    public final /* synthetic */ kotlin.jvm.functions.q z;

    public z(long j, androidx.compose.foundation.layout.m0 m0Var, kotlin.jvm.functions.q qVar) {
        this.e = j;
        this.y = m0Var;
        this.z = qVar;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        androidx.compose.runtime.r rVar = (androidx.compose.runtime.r) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (rVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
            androidx.compose.material3.internal.g.a(this.e, ((t3) rVar.j(u3.a)).m, androidx.compose.runtime.internal.k.c(417635459, new y(0, this.y, this.z), rVar), rVar, 384);
        } else {
            rVar.W();
        }
        return kotlin.y.a;
    }
}
