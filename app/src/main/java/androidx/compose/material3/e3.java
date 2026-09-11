package androidx.compose.material3;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e3 implements kotlin.jvm.functions.p {
    public final /* synthetic */ float A;
    public final /* synthetic */ androidx.compose.foundation.a0 B;
    public final /* synthetic */ boolean C;
    public final /* synthetic */ androidx.compose.foundation.interaction.k D;
    public final /* synthetic */ boolean E;
    public final /* synthetic */ kotlin.jvm.functions.a F;
    public final /* synthetic */ float G;
    public final /* synthetic */ androidx.compose.runtime.internal.f H;
    public final /* synthetic */ androidx.compose.ui.r e;
    public final /* synthetic */ androidx.compose.ui.graphics.n0 y;
    public final /* synthetic */ long z;

    public e3(androidx.compose.ui.r rVar, androidx.compose.ui.graphics.n0 n0Var, long j, float f, androidx.compose.foundation.a0 a0Var, boolean z, androidx.compose.foundation.interaction.k kVar, boolean z2, kotlin.jvm.functions.a aVar, float f2, androidx.compose.runtime.internal.f fVar) {
        this.e = rVar;
        this.y = n0Var;
        this.z = j;
        this.A = f;
        this.B = a0Var;
        this.C = z;
        this.D = kVar;
        this.E = z2;
        this.F = aVar;
        this.G = f2;
        this.H = fVar;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        androidx.compose.runtime.r rVar = (androidx.compose.runtime.r) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (rVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
            androidx.compose.ui.layout.n nVar = i1.a;
            androidx.compose.ui.r rVarB = androidx.compose.material3.internal.g.b(androidx.compose.foundation.selection.c.a(f3.c(this.e.d(r1.b), this.y, f3.d(this.z, this.A, rVar), this.B, ((androidx.compose.ui.unit.c) rVar.j(androidx.compose.ui.platform.l1.h)).V(this.G)), this.C, this.D, u2.a(false, 0.0f, 7), this.E, null, this.F));
            androidx.compose.ui.layout.q0 q0VarD = androidx.compose.foundation.layout.p.d(androidx.compose.ui.c.e, true);
            int iHashCode = Long.hashCode(rVar.T);
            androidx.compose.runtime.internal.j jVarL = rVar.l();
            androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(rVar, rVarB);
            androidx.compose.ui.node.g.b.getClass();
            androidx.compose.ui.node.y yVar = androidx.compose.ui.node.f.b;
            rVar.e0();
            if (rVar.S) {
                rVar.k(yVar);
            } else {
                rVar.o0();
            }
            androidx.compose.runtime.s.x(rVar, q0VarD, androidx.compose.ui.node.f.e);
            androidx.compose.runtime.s.x(rVar, jVarL, androidx.compose.ui.node.f.d);
            androidx.compose.ui.node.e eVar = androidx.compose.ui.node.f.f;
            if (rVar.S || !kotlin.jvm.internal.l.a(rVar.Q(), Integer.valueOf(iHashCode))) {
                androidx.privacysandbox.ads.adservices.java.internal.a.y(iHashCode, rVar, iHashCode, eVar);
            }
            androidx.compose.runtime.s.x(rVar, rVarC, androidx.compose.ui.node.f.c);
            this.H.invoke(rVar, 0);
            rVar.p(true);
        } else {
            rVar.W();
        }
        return kotlin.y.a;
    }
}
