package androidx.compose.material3;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements kotlin.jvm.functions.p {
    public final /* synthetic */ long A;
    public final /* synthetic */ float B;
    public final /* synthetic */ long C;
    public final /* synthetic */ long D;
    public final /* synthetic */ long E;
    public final /* synthetic */ kotlin.jvm.functions.p F;
    public final /* synthetic */ androidx.compose.runtime.internal.f G;
    public final /* synthetic */ kotlin.jvm.functions.p e;
    public final /* synthetic */ kotlin.jvm.functions.p y;
    public final /* synthetic */ androidx.compose.ui.graphics.n0 z;

    public i(kotlin.jvm.functions.p pVar, kotlin.jvm.functions.p pVar2, androidx.compose.ui.graphics.n0 n0Var, long j, float f, long j2, long j3, long j4, kotlin.jvm.functions.p pVar3, androidx.compose.runtime.internal.f fVar) {
        this.e = pVar;
        this.y = pVar2;
        this.z = n0Var;
        this.A = j;
        this.B = f;
        this.C = j2;
        this.D = j3;
        this.E = j4;
        this.F = pVar3;
        this.G = fVar;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        androidx.compose.runtime.r rVar = (androidx.compose.runtime.r) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (rVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
            j.a(androidx.compose.runtime.internal.k.c(1367541877, new h(this.F, this.G, 1), rVar), null, this.e, this.y, this.z, this.A, this.B, o0.d(androidx.compose.material3.tokens.g.a, rVar), this.C, this.D, this.E, rVar, 6);
        } else {
            rVar.W();
        }
        return kotlin.y.a;
    }
}
