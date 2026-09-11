package androidx.compose.material3;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class y implements kotlin.jvm.functions.p {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public y(kotlin.jvm.functions.q qVar, androidx.compose.material3.internal.w wVar) {
        this.e = 2;
        this.z = qVar;
        this.y = wVar;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                androidx.compose.runtime.r rVar = (androidx.compose.runtime.r) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (rVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    androidx.compose.ui.r rVarN = androidx.compose.foundation.layout.b.n(androidx.compose.foundation.layout.w0.a(androidx.compose.ui.o.b, r.c, r.d), (androidx.compose.foundation.layout.m0) this.y);
                    androidx.compose.foundation.layout.d dVar = androidx.compose.foundation.layout.h.d;
                    androidx.compose.ui.i iVar = androidx.compose.ui.c.H;
                    kotlin.jvm.functions.q qVar = (kotlin.jvm.functions.q) this.z;
                    androidx.compose.foundation.layout.t0 t0VarA = androidx.compose.foundation.layout.r0.a(dVar, iVar, rVar, 54);
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
                    androidx.compose.runtime.s.x(rVar, t0VarA, androidx.compose.ui.node.f.e);
                    androidx.compose.runtime.s.x(rVar, jVarL, androidx.compose.ui.node.f.d);
                    androidx.compose.ui.node.e eVar = androidx.compose.ui.node.f.f;
                    if (rVar.S || !kotlin.jvm.internal.l.a(rVar.Q(), Integer.valueOf(iHashCode))) {
                        androidx.privacysandbox.ads.adservices.java.internal.a.y(iHashCode, rVar, iHashCode, eVar);
                    }
                    androidx.compose.runtime.s.x(rVar, rVarC, androidx.compose.ui.node.f.c);
                    qVar.invoke(androidx.compose.foundation.layout.u0.a, rVar, 6);
                    rVar.p(true);
                } else {
                    rVar.W();
                }
                break;
            case 1:
                androidx.compose.runtime.r rVar2 = (androidx.compose.runtime.r) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (rVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    p3.a(((t3) this.y).j, (androidx.compose.runtime.internal.f) this.z, rVar2, 0);
                } else {
                    rVar2.W();
                }
                break;
            case 2:
                androidx.compose.runtime.r rVar3 = (androidx.compose.runtime.r) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                if (rVar3.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    ((kotlin.jvm.functions.q) this.z).invoke((androidx.compose.material3.internal.w) this.y, rVar3, 6);
                } else {
                    rVar3.W();
                }
                break;
            case 3:
                androidx.compose.runtime.r rVar4 = (androidx.compose.runtime.r) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && rVar4.F()) {
                    rVar4.W();
                } else {
                    ((androidx.navigation.compose.n) this.y).D.invoke((androidx.navigation.i) this.z, rVar4, 0);
                }
                break;
            case 4:
                androidx.compose.runtime.r rVar5 = (androidx.compose.runtime.r) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && rVar5.F()) {
                    rVar5.W();
                } else {
                    android.support.v4.media.session.b.c((androidx.compose.runtime.saveable.d) this.y, (androidx.compose.runtime.internal.f) this.z, rVar5, 0);
                }
                break;
            default:
                androidx.compose.runtime.r rVar6 = (androidx.compose.runtime.r) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                androidx.navigation.i iVar2 = (androidx.navigation.i) this.y;
                if ((iIntValue4 & 3) == 2 && rVar6.F()) {
                    rVar6.W();
                } else {
                    androidx.navigation.t tVar = iVar2.y;
                    tVar.getClass();
                    ((androidx.navigation.compose.h) tVar).C.invoke((androidx.compose.animation.p) this.z, iVar2, rVar6, 0);
                }
                break;
        }
        return kotlin.y.a;
    }

    public /* synthetic */ y(int i, Object obj, Object obj2) {
        this.e = i;
        this.y = obj;
        this.z = obj2;
    }
}
