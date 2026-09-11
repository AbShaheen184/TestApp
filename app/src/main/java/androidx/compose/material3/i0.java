package androidx.compose.material3;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 implements kotlin.jvm.functions.p {
    public final /* synthetic */ androidx.compose.runtime.internal.f A;
    public final /* synthetic */ long B;
    public final /* synthetic */ float e;
    public final /* synthetic */ androidx.compose.foundation.layout.m0 y;
    public final /* synthetic */ long z;

    public i0(float f, androidx.compose.foundation.layout.m0 m0Var, long j, androidx.compose.runtime.internal.f fVar, long j2) {
        this.e = f;
        this.y = m0Var;
        this.z = j;
        this.A = fVar;
        this.B = j2;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        androidx.compose.runtime.r rVar = (androidx.compose.runtime.r) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (rVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
            androidx.compose.animation.core.k1 k1VarO = t2.o(androidx.compose.material3.tokens.p.A, rVar);
            androidx.compose.animation.core.k1 k1VarO2 = t2.o(androidx.compose.material3.tokens.p.z, rVar);
            androidx.compose.animation.core.k1 k1VarO3 = t2.o(androidx.compose.material3.tokens.p.e, rVar);
            androidx.compose.animation.core.k1 k1VarO4 = t2.o(androidx.compose.material3.tokens.p.y, rVar);
            androidx.compose.ui.r rVarN = androidx.compose.foundation.layout.b.n(androidx.compose.foundation.layout.w0.b(0.0f, this.e, 1), this.y);
            Object objQ = rVar.Q();
            if (objQ == androidx.compose.runtime.m.a) {
                objQ = new m0();
                rVar.l0(objQ);
            }
            m0 m0Var = (m0) objQ;
            int iHashCode = Long.hashCode(rVar.T);
            androidx.compose.runtime.internal.j jVarL = rVar.l();
            androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(rVar, rVarN);
            androidx.compose.ui.node.g.b.getClass();
            androidx.compose.ui.node.y yVar = androidx.compose.ui.node.f.b;
            rVar.e0();
            if (rVar.S) {
                rVar.k(yVar);
            } else {
                rVar.o0();
            }
            androidx.compose.ui.node.e eVar = androidx.compose.ui.node.f.e;
            androidx.compose.runtime.s.x(rVar, m0Var, eVar);
            androidx.compose.ui.node.e eVar2 = androidx.compose.ui.node.f.d;
            androidx.compose.runtime.s.x(rVar, jVarL, eVar2);
            androidx.compose.ui.node.e eVar3 = androidx.compose.ui.node.f.f;
            if (rVar.S || !kotlin.jvm.internal.l.a(rVar.Q(), Integer.valueOf(iHashCode))) {
                androidx.privacysandbox.ads.adservices.java.internal.a.y(iHashCode, rVar, iHashCode, eVar3);
            }
            androidx.compose.ui.node.e eVar4 = androidx.compose.ui.node.f.c;
            androidx.compose.runtime.s.x(rVar, rVarC, eVar4);
            androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
            androidx.compose.ui.r rVarK = androidx.compose.ui.layout.a0.k(oVar, "leadingIcon");
            androidx.compose.ui.h hVar = androidx.compose.ui.c.J;
            androidx.compose.animation.g0.b(false, rVarK, androidx.compose.animation.s0.a(k1VarO3, hVar).a(androidx.compose.animation.s0.b(k1VarO, 2)), androidx.compose.animation.s0.d(k1VarO4, hVar).a(androidx.compose.animation.s0.c(k1VarO2, 2)), null, androidx.compose.runtime.internal.k.c(687705959, new h0(this.z, 0), rVar), rVar, 196656);
            androidx.compose.ui.r rVarQ = androidx.compose.foundation.layout.b.q(androidx.compose.ui.layout.a0.k(oVar, "label"), k0.a, 0.0f, 2);
            androidx.compose.foundation.layout.t0 t0VarA = androidx.compose.foundation.layout.r0.a(androidx.compose.foundation.layout.h.a, androidx.compose.ui.c.H, rVar, 54);
            int iHashCode2 = Long.hashCode(rVar.T);
            androidx.compose.runtime.internal.j jVarL2 = rVar.l();
            androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(rVar, rVarQ);
            rVar.e0();
            if (rVar.S) {
                rVar.k(yVar);
            } else {
                rVar.o0();
            }
            androidx.compose.runtime.s.x(rVar, t0VarA, eVar);
            androidx.compose.runtime.s.x(rVar, jVarL2, eVar2);
            if (rVar.S || !kotlin.jvm.internal.l.a(rVar.Q(), Integer.valueOf(iHashCode2))) {
                androidx.privacysandbox.ads.adservices.java.internal.a.y(iHashCode2, rVar, iHashCode2, eVar3);
            }
            androidx.compose.runtime.s.x(rVar, rVarC2, eVar4);
            this.A.invoke(rVar, 0);
            rVar.p(true);
            androidx.compose.ui.r rVarK2 = androidx.compose.ui.layout.a0.k(oVar, "trailingIcon");
            androidx.compose.ui.h hVar2 = androidx.compose.ui.c.L;
            androidx.compose.animation.g0.b(false, rVarK2, androidx.compose.animation.s0.a(k1VarO3, hVar2).a(androidx.compose.animation.s0.b(k1VarO, 2)), androidx.compose.animation.s0.d(k1VarO4, hVar2).a(androidx.compose.animation.s0.c(k1VarO2, 2)), null, androidx.compose.runtime.internal.k.c(1905252304, new h0(this.B, 1), rVar), rVar, 196656);
            rVar.p(true);
        } else {
            rVar.W();
        }
        return kotlin.y.a;
    }
}
