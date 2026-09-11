package androidx.compose.material3;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d0 implements kotlin.jvm.functions.p {
    public final /* synthetic */ int e;
    public final /* synthetic */ androidx.compose.runtime.internal.f y;

    public /* synthetic */ d0(androidx.compose.runtime.internal.f fVar, int i) {
        this.e = i;
        this.y = fVar;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                androidx.compose.runtime.r rVar = (androidx.compose.runtime.r) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (rVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    androidx.compose.foundation.layout.v vVarA = androidx.compose.foundation.layout.t.a(androidx.compose.foundation.layout.h.c, androidx.compose.ui.c.J, rVar, 0);
                    int iHashCode = Long.hashCode(rVar.T);
                    androidx.compose.runtime.internal.j jVarL = rVar.l();
                    androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(rVar, androidx.compose.ui.o.b);
                    androidx.compose.ui.node.g.b.getClass();
                    androidx.compose.ui.node.y yVar = androidx.compose.ui.node.f.b;
                    rVar.e0();
                    if (rVar.S) {
                        rVar.k(yVar);
                    } else {
                        rVar.o0();
                    }
                    androidx.compose.runtime.s.x(rVar, vVarA, androidx.compose.ui.node.f.e);
                    androidx.compose.runtime.s.x(rVar, jVarL, androidx.compose.ui.node.f.d);
                    androidx.compose.ui.node.e eVar = androidx.compose.ui.node.f.f;
                    if (rVar.S || !kotlin.jvm.internal.l.a(rVar.Q(), Integer.valueOf(iHashCode))) {
                        androidx.privacysandbox.ads.adservices.java.internal.a.y(iHashCode, rVar, iHashCode, eVar);
                    }
                    androidx.compose.runtime.s.x(rVar, rVarC, androidx.compose.ui.node.f.c);
                    this.y.invoke(androidx.compose.foundation.layout.w.a, rVar, 6);
                    rVar.p(true);
                } else {
                    rVar.W();
                }
                break;
            default:
                androidx.compose.runtime.r rVar2 = (androidx.compose.runtime.r) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (rVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    androidx.compose.ui.r rVarS = androidx.compose.foundation.layout.b.s(androidx.compose.foundation.layout.u0.a(1.0f), 0, 0.0f, 0, 0.0f, 10);
                    androidx.compose.ui.layout.q0 q0VarD = androidx.compose.foundation.layout.p.d(androidx.compose.ui.c.e, false);
                    int iHashCode2 = Long.hashCode(rVar2.T);
                    androidx.compose.runtime.internal.j jVarL2 = rVar2.l();
                    androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(rVar2, rVarS);
                    androidx.compose.ui.node.g.b.getClass();
                    androidx.compose.ui.node.y yVar2 = androidx.compose.ui.node.f.b;
                    rVar2.e0();
                    if (rVar2.S) {
                        rVar2.k(yVar2);
                    } else {
                        rVar2.o0();
                    }
                    androidx.compose.runtime.s.x(rVar2, q0VarD, androidx.compose.ui.node.f.e);
                    androidx.compose.runtime.s.x(rVar2, jVarL2, androidx.compose.ui.node.f.d);
                    androidx.compose.ui.node.e eVar2 = androidx.compose.ui.node.f.f;
                    if (rVar2.S || !kotlin.jvm.internal.l.a(rVar2.Q(), Integer.valueOf(iHashCode2))) {
                        androidx.privacysandbox.ads.adservices.java.internal.a.y(iHashCode2, rVar2, iHashCode2, eVar2);
                    }
                    androidx.compose.runtime.s.x(rVar2, rVarC2, androidx.compose.ui.node.f.c);
                    this.y.invoke(rVar2, 0);
                    rVar2.p(true);
                } else {
                    rVar2.W();
                }
                break;
        }
        return kotlin.y.a;
    }
}
