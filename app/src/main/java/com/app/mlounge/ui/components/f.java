package com.app.mlounge.ui.components;

import androidx.compose.foundation.layout.w0;
import androidx.compose.material3.f3;
import androidx.compose.material3.p3;
import androidx.compose.material3.t2;
import androidx.compose.material3.t3;
import androidx.compose.material3.u3;
import androidx.compose.runtime.u2;
import androidx.compose.runtime.y0;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements kotlin.jvm.functions.p {
    public final /* synthetic */ int e;
    public final /* synthetic */ kotlin.jvm.functions.a y;
    public final /* synthetic */ y0 z;

    public /* synthetic */ f(kotlin.jvm.functions.a aVar, y0 y0Var, int i) {
        this.e = i;
        this.y = aVar;
        this.z = y0Var;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                androidx.compose.runtime.r rVar = (androidx.compose.runtime.r) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (rVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    f3.a(null, androidx.compose.foundation.shape.e.a(16), com.app.mlounge.ui.theme.b.d, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(-165668554, new f(this.y, this.z, 1), rVar), rVar, 12582912, Token.DOT);
                } else {
                    rVar.W();
                }
                break;
            case 1:
                androidx.compose.runtime.r rVar2 = (androidx.compose.runtime.r) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (rVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
                    androidx.compose.ui.r rVarO = androidx.compose.foundation.layout.b.o(oVar, 24);
                    androidx.compose.foundation.layout.v vVarA = androidx.compose.foundation.layout.t.a(androidx.compose.foundation.layout.h.c, androidx.compose.ui.c.K, rVar2, 48);
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
                    androidx.compose.runtime.s.x(rVar2, vVarA, androidx.compose.ui.node.f.e);
                    androidx.compose.runtime.s.x(rVar2, jVarL, androidx.compose.ui.node.f.d);
                    androidx.compose.runtime.s.p(rVar2, Integer.valueOf(iHashCode), androidx.compose.ui.node.f.f);
                    androidx.compose.runtime.s.t(rVar2, androidx.compose.ui.node.f.g);
                    androidx.compose.runtime.s.x(rVar2, rVarC, androidx.compose.ui.node.f.c);
                    u2 u2Var = u3.a;
                    p3.b("You're Up To Date", null, com.app.mlounge.ui.theme.b.l, 0L, androidx.compose.ui.text.font.l.C, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar2.j(u2Var)).h, rVar2, 1572870, 0, 131002);
                    androidx.compose.foundation.layout.b.d(rVar2, w0.f(oVar, 8));
                    androidx.compose.ui.text.m0 m0Var = ((t3) rVar2.j(u2Var)).l;
                    long j = com.app.mlounge.ui.theme.b.m;
                    p3.b("CinemaHQ v8.0 is the latest version.", null, j, 0L, null, 0L, null, 0L, 0, false, 0, 0, m0Var, rVar2, 0, 0, 131066);
                    androidx.compose.foundation.layout.b.d(rVar2, w0.f(oVar, 16));
                    kotlin.jvm.functions.a aVar = this.y;
                    boolean zF = rVar2.f(aVar);
                    Object objQ = rVar2.Q();
                    if (zF || objQ == androidx.compose.runtime.m.a) {
                        objQ = new a(aVar, this.z, 3);
                        rVar2.l0(objQ);
                    }
                    b0.l("OK", j, (kotlin.jvm.functions.a) objQ, rVar2, 6);
                    rVar2.p(true);
                } else {
                    rVar2.W();
                }
                break;
            default:
                androidx.compose.runtime.r rVar3 = (androidx.compose.runtime.r) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (rVar3.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    kotlin.jvm.functions.a aVar2 = this.y;
                    boolean zF2 = rVar3.f(aVar2);
                    Object objQ2 = rVar3.Q();
                    if (zF2 || objQ2 == androidx.compose.runtime.m.a) {
                        objQ2 = new a(aVar2, this.z, 6);
                        rVar3.l0(objQ2);
                    }
                    t2.h((kotlin.jvm.functions.a) objQ2, null, false, null, null, null, null, com.app.mlounge.ui.screens.downloads.a.a, rVar3, 805306368, 510);
                } else {
                    rVar3.W();
                }
                break;
        }
        return kotlin.y.a;
    }
}
