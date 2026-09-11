package androidx.compose.material3;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class p1 implements kotlin.jvm.functions.p {
    public final /* synthetic */ l1 e;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ androidx.compose.runtime.internal.f z;

    public p1(l1 l1Var, boolean z, androidx.compose.runtime.internal.f fVar) {
        this.e = l1Var;
        this.y = z;
        this.z = fVar;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        androidx.compose.runtime.r rVar = (androidx.compose.runtime.r) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (rVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
            rVar.b0(-864293207);
            rVar.p(false);
            androidx.compose.runtime.b0 b0Var = q0.a;
            boolean z = this.y;
            l1 l1Var = this.e;
            androidx.compose.runtime.s.a(b0Var.a(new androidx.compose.ui.graphics.t(z ? l1Var.a : l1Var.d)), androidx.compose.runtime.internal.k.c(-893579015, new d0(this.z, 1), rVar), rVar, 56);
            rVar.b0(-863072055);
            rVar.p(false);
        } else {
            rVar.W();
        }
        return kotlin.y.a;
    }
}
