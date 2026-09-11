package androidx.compose.material3;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f implements kotlin.jvm.functions.p {
    public final /* synthetic */ long A;
    public final /* synthetic */ long B;
    public final /* synthetic */ androidx.compose.runtime.internal.f C;
    public final /* synthetic */ kotlin.jvm.functions.p e;
    public final /* synthetic */ kotlin.jvm.functions.p y;
    public final /* synthetic */ long z;

    public f(kotlin.jvm.functions.p pVar, kotlin.jvm.functions.p pVar2, long j, long j2, long j3, long j4, androidx.compose.runtime.internal.f fVar) {
        this.e = pVar;
        this.y = pVar2;
        this.z = j2;
        this.A = j3;
        this.B = j4;
        this.C = fVar;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        androidx.compose.runtime.r rVar = (androidx.compose.runtime.r) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (rVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
            androidx.compose.ui.r rVarN = androidx.compose.foundation.layout.b.n(androidx.compose.ui.o.b, j.e);
            androidx.compose.foundation.layout.v vVarA = androidx.compose.foundation.layout.t.a(androidx.compose.foundation.layout.h.c, androidx.compose.ui.c.J, rVar, 0);
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
            androidx.compose.runtime.s.x(rVar, vVarA, eVar);
            androidx.compose.ui.node.e eVar2 = androidx.compose.ui.node.f.d;
            androidx.compose.runtime.s.x(rVar, jVarL, eVar2);
            androidx.compose.ui.node.e eVar3 = androidx.compose.ui.node.f.f;
            if (rVar.S || !kotlin.jvm.internal.l.a(rVar.Q(), Integer.valueOf(iHashCode))) {
                androidx.privacysandbox.ads.adservices.java.internal.a.y(iHashCode, rVar, iHashCode, eVar3);
            }
            androidx.compose.ui.node.e eVar4 = androidx.compose.ui.node.f.c;
            androidx.compose.runtime.s.x(rVar, rVarC, eVar4);
            rVar.b0(346092326);
            rVar.p(false);
            kotlin.jvm.functions.p pVar = this.e;
            if (pVar == null) {
                rVar.b0(346396529);
            } else {
                rVar.b0(346396530);
                androidx.compose.material3.internal.g.a(this.z, u3.a(androidx.compose.material3.tokens.g.e, rVar), androidx.compose.runtime.internal.k.c(71284337, new e(pVar, 0), rVar), rVar, 384);
            }
            rVar.p(false);
            kotlin.jvm.functions.p pVar2 = this.y;
            if (pVar2 == null) {
                rVar.b0(347174009);
            } else {
                rVar.b0(347174010);
                androidx.compose.material3.internal.g.a(this.A, u3.a(androidx.compose.material3.tokens.g.g, rVar), androidx.compose.runtime.internal.k.c(705583346, new e(pVar2, 1), rVar), rVar, 384);
            }
            rVar.p(false);
            androidx.compose.foundation.layout.c0 c0Var = new androidx.compose.foundation.layout.c0(androidx.compose.ui.c.L);
            androidx.compose.ui.layout.q0 q0VarD = androidx.compose.foundation.layout.p.d(androidx.compose.ui.c.e, false);
            int iHashCode2 = Long.hashCode(rVar.T);
            androidx.compose.runtime.internal.j jVarL2 = rVar.l();
            androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(rVar, c0Var);
            rVar.e0();
            if (rVar.S) {
                rVar.k(yVar);
            } else {
                rVar.o0();
            }
            androidx.compose.runtime.s.x(rVar, q0VarD, eVar);
            androidx.compose.runtime.s.x(rVar, jVarL2, eVar2);
            if (rVar.S || !kotlin.jvm.internal.l.a(rVar.Q(), Integer.valueOf(iHashCode2))) {
                androidx.privacysandbox.ads.adservices.java.internal.a.y(iHashCode2, rVar, iHashCode2, eVar3);
            }
            androidx.compose.runtime.s.x(rVar, rVarC2, eVar4);
            androidx.compose.material3.internal.g.a(this.B, u3.a(androidx.compose.material3.tokens.g.b, rVar), this.C, rVar, 0);
            rVar.p(true);
            rVar.p(true);
        } else {
            rVar.W();
        }
        return kotlin.y.a;
    }
}
