package androidx.compose.material3;

import android.content.Context;
import com.app.mlounge.R;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e implements kotlin.jvm.functions.p {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;

    public /* synthetic */ e(Object obj, int i) {
        this.e = i;
        this.y = obj;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                androidx.compose.runtime.r rVar = (androidx.compose.runtime.r) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (rVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    androidx.compose.ui.r rVarD = androidx.compose.foundation.layout.b.n(androidx.compose.ui.o.b, j.f).d(new androidx.compose.foundation.layout.c0(androidx.compose.ui.c.J));
                    kotlin.jvm.functions.p pVar = (kotlin.jvm.functions.p) this.y;
                    androidx.compose.ui.layout.q0 q0VarD = androidx.compose.foundation.layout.p.d(androidx.compose.ui.c.e, false);
                    int iHashCode = Long.hashCode(rVar.T);
                    androidx.compose.runtime.internal.j jVarL = rVar.l();
                    androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(rVar, rVarD);
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
                    pVar.invoke(rVar, 0);
                    rVar.p(true);
                } else {
                    rVar.W();
                }
                break;
            case 1:
                androidx.compose.runtime.r rVar2 = (androidx.compose.runtime.r) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (rVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    if (1.0f <= 0.0d) {
                        androidx.compose.foundation.layout.internal.a.a("invalid weight; must be greater than zero");
                    }
                    androidx.compose.ui.r rVarD2 = androidx.compose.foundation.layout.b.n(new androidx.compose.foundation.layout.h0(1.0f, false), j.g).d(new androidx.compose.foundation.layout.c0(androidx.compose.ui.c.J));
                    kotlin.jvm.functions.p pVar2 = (kotlin.jvm.functions.p) this.y;
                    androidx.compose.ui.layout.q0 q0VarD2 = androidx.compose.foundation.layout.p.d(androidx.compose.ui.c.e, false);
                    int iHashCode2 = Long.hashCode(rVar2.T);
                    androidx.compose.runtime.internal.j jVarL2 = rVar2.l();
                    androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(rVar2, rVarD2);
                    androidx.compose.ui.node.g.b.getClass();
                    androidx.compose.ui.node.y yVar2 = androidx.compose.ui.node.f.b;
                    rVar2.e0();
                    if (rVar2.S) {
                        rVar2.k(yVar2);
                    } else {
                        rVar2.o0();
                    }
                    androidx.compose.runtime.s.x(rVar2, q0VarD2, androidx.compose.ui.node.f.e);
                    androidx.compose.runtime.s.x(rVar2, jVarL2, androidx.compose.ui.node.f.d);
                    androidx.compose.ui.node.e eVar2 = androidx.compose.ui.node.f.f;
                    if (rVar2.S || !kotlin.jvm.internal.l.a(rVar2.Q(), Integer.valueOf(iHashCode2))) {
                        androidx.privacysandbox.ads.adservices.java.internal.a.y(iHashCode2, rVar2, iHashCode2, eVar2);
                    }
                    androidx.compose.runtime.s.x(rVar2, rVarC2, androidx.compose.ui.node.f.c);
                    pVar2.invoke(rVar2, 0);
                    rVar2.p(true);
                } else {
                    rVar2.W();
                }
                break;
            default:
                androidx.compose.runtime.r rVar3 = (androidx.compose.runtime.r) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                com.google.firebase.messaging.o oVar = (com.google.firebase.messaging.o) this.y;
                if (rVar3.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    rVar3.j(androidx.compose.ui.platform.m0.a);
                    String string = ((Context) rVar3.j(androidx.compose.ui.platform.m0.b)).getResources().getString(R.string.m3c_dialog);
                    androidx.compose.ui.r rVarO = androidx.compose.foundation.layout.w0.o((androidx.compose.ui.r) oVar.z, j.a, j.b, 10);
                    boolean zF = rVar3.f(string);
                    Object objQ = rVar3.Q();
                    if (zF || objQ == androidx.compose.runtime.m.a) {
                        objQ = new r0(string, 0);
                        rVar3.l0(objQ);
                    }
                    androidx.compose.ui.r rVarD3 = rVarO.d(androidx.compose.ui.semantics.n.a(androidx.compose.ui.o.b, false, (kotlin.jvm.functions.l) objQ));
                    androidx.compose.ui.layout.q0 q0VarD3 = androidx.compose.foundation.layout.p.d(androidx.compose.ui.c.e, true);
                    int iHashCode3 = Long.hashCode(rVar3.T);
                    androidx.compose.runtime.internal.j jVarL3 = rVar3.l();
                    androidx.compose.ui.r rVarC3 = androidx.compose.ui.a.c(rVar3, rVarD3);
                    androidx.compose.ui.node.g.b.getClass();
                    androidx.compose.ui.node.y yVar3 = androidx.compose.ui.node.f.b;
                    rVar3.e0();
                    if (rVar3.S) {
                        rVar3.k(yVar3);
                    } else {
                        rVar3.o0();
                    }
                    androidx.compose.runtime.s.x(rVar3, q0VarD3, androidx.compose.ui.node.f.e);
                    androidx.compose.runtime.s.x(rVar3, jVarL3, androidx.compose.ui.node.f.d);
                    androidx.compose.ui.node.e eVar3 = androidx.compose.ui.node.f.f;
                    if (rVar3.S || !kotlin.jvm.internal.l.a(rVar3.Q(), Integer.valueOf(iHashCode3))) {
                        androidx.privacysandbox.ads.adservices.java.internal.a.y(iHashCode3, rVar3, iHashCode3, eVar3);
                    }
                    androidx.compose.runtime.s.x(rVar3, rVarC3, androidx.compose.ui.node.f.c);
                    ((androidx.compose.runtime.internal.f) oVar.B).invoke(rVar3, 0);
                    rVar3.p(true);
                } else {
                    rVar3.W();
                }
                break;
        }
        return kotlin.y.a;
    }
}
