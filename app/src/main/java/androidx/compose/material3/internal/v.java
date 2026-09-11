package androidx.compose.material3.internal;

import androidx.compose.animation.core.a2;
import androidx.compose.runtime.t2;
import androidx.compose.ui.layout.q0;
import androidx.compose.ui.text.m0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class v implements kotlin.jvm.functions.q {
    public final /* synthetic */ kotlin.jvm.functions.p A;
    public final /* synthetic */ t2 e;
    public final /* synthetic */ long y;
    public final /* synthetic */ m0 z;

    public v(a2 a2Var, long j, m0 m0Var, kotlin.jvm.functions.p pVar) {
        this.e = a2Var;
        this.y = j;
        this.z = m0Var;
        this.A = pVar;
    }

    @Override // kotlin.jvm.functions.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        androidx.compose.ui.r rVar = (androidx.compose.ui.r) obj;
        androidx.compose.runtime.r rVar2 = (androidx.compose.runtime.r) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= rVar2.f(rVar) ? 4 : 2;
        }
        if (rVar2.T(iIntValue & 1, (iIntValue & 19) != 18)) {
            t2 t2Var = this.e;
            boolean zF = rVar2.f(t2Var);
            Object objQ = rVar2.Q();
            if (zF || objQ == androidx.compose.runtime.m.a) {
                objQ = new u(t2Var, 0);
                rVar2.l0(objQ);
            }
            androidx.compose.ui.r rVarO = androidx.compose.ui.graphics.a0.o(rVar, (kotlin.jvm.functions.l) objQ);
            q0 q0VarD = androidx.compose.foundation.layout.p.d(androidx.compose.ui.c.e, false);
            int iHashCode = Long.hashCode(rVar2.T);
            androidx.compose.runtime.internal.j jVarL = rVar2.l();
            androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(rVar2, rVarO);
            androidx.compose.ui.node.g.b.getClass();
            androidx.compose.ui.node.y yVar = androidx.compose.ui.node.f.b;
            rVar2.e0();
            if (rVar2.S) {
                rVar2.k(yVar);
            } else {
                rVar2.o0();
            }
            androidx.compose.runtime.s.x(rVar2, q0VarD, androidx.compose.ui.node.f.e);
            androidx.compose.runtime.s.x(rVar2, jVarL, androidx.compose.ui.node.f.d);
            androidx.compose.ui.node.e eVar = androidx.compose.ui.node.f.f;
            if (rVar2.S || !kotlin.jvm.internal.l.a(rVar2.Q(), Integer.valueOf(iHashCode))) {
                androidx.privacysandbox.ads.adservices.java.internal.a.y(iHashCode, rVar2, iHashCode, eVar);
            }
            androidx.compose.runtime.s.x(rVar2, rVarC, androidx.compose.ui.node.f.c);
            z.b(this.y, this.z, this.A, rVar2, 0);
            rVar2.p(true);
        } else {
            rVar2.W();
        }
        return kotlin.y.a;
    }
}
