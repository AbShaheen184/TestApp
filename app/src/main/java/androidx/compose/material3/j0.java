package androidx.compose.material3;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class j0 implements kotlin.jvm.functions.p {
    public final /* synthetic */ androidx.compose.runtime.internal.f A;
    public final /* synthetic */ androidx.compose.ui.text.m0 B;
    public final /* synthetic */ float C;
    public final /* synthetic */ androidx.compose.foundation.layout.m0 D;
    public final /* synthetic */ w2 e;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ boolean z;

    public j0(w2 w2Var, boolean z, boolean z2, androidx.compose.runtime.internal.f fVar, androidx.compose.ui.text.m0 m0Var, float f, androidx.compose.foundation.layout.m0 m0Var2) {
        this.e = w2Var;
        this.y = z;
        this.z = z2;
        this.A = fVar;
        this.B = m0Var;
        this.C = f;
        this.D = m0Var2;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        long j;
        long j2;
        long j3;
        androidx.compose.runtime.r rVar = (androidx.compose.runtime.r) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (rVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
            w2 w2Var = this.e;
            boolean z = this.y;
            boolean z2 = this.z;
            if (z) {
                j = !z2 ? w2Var.b : w2Var.k;
            } else {
                j = w2Var.f;
            }
            long j4 = j;
            if (z) {
                j2 = !z2 ? w2Var.c : w2Var.l;
            } else {
                j2 = w2Var.g;
            }
            if (z) {
                j3 = !z2 ? w2Var.d : w2Var.m;
            } else {
                j3 = w2Var.h;
            }
            k0.a(this.A, this.B, j4, j2, j3, this.C, this.D, rVar, 0);
        } else {
            rVar.W();
        }
        return kotlin.y.a;
    }
}
