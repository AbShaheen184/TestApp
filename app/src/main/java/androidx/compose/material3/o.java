package androidx.compose.material3;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements kotlin.jvm.functions.p {
    public final /* synthetic */ androidx.compose.foundation.b2 A;
    public final /* synthetic */ androidx.compose.ui.graphics.n0 B;
    public final /* synthetic */ long C;
    public final /* synthetic */ float D;
    public final /* synthetic */ float E;
    public final /* synthetic */ androidx.compose.runtime.internal.f F;
    public final /* synthetic */ androidx.compose.ui.r e;
    public final /* synthetic */ androidx.compose.animation.core.p0 y;
    public final /* synthetic */ androidx.compose.runtime.y0 z;

    public o(androidx.compose.ui.r rVar, androidx.compose.animation.core.p0 p0Var, androidx.compose.runtime.y0 y0Var, androidx.compose.foundation.b2 b2Var, androidx.compose.ui.graphics.n0 n0Var, long j, float f, float f2, androidx.compose.runtime.internal.f fVar) {
        this.e = rVar;
        this.y = p0Var;
        this.z = y0Var;
        this.A = b2Var;
        this.B = n0Var;
        this.C = j;
        this.D = f;
        this.E = f2;
        this.F = fVar;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        androidx.compose.runtime.r rVar = (androidx.compose.runtime.r) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (rVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
            q1.a(this.e, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, rVar, 384);
        } else {
            rVar.W();
        }
        return kotlin.y.a;
    }
}
