package com.app.mlounge.ui.components;

import androidx.compose.foundation.layout.w0;
import androidx.compose.material3.f3;
import androidx.compose.material3.j2;
import androidx.compose.material3.p3;
import androidx.compose.material3.t3;
import androidx.compose.material3.u3;
import androidx.compose.runtime.u2;
import androidx.compose.runtime.y0;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements kotlin.jvm.functions.p {
    public final /* synthetic */ y0 A;
    public final /* synthetic */ int e;
    public final /* synthetic */ kotlin.jvm.functions.a y;
    public final /* synthetic */ y0 z;

    public /* synthetic */ g(kotlin.jvm.functions.a aVar, y0 y0Var, y0 y0Var2, int i) {
        this.e = i;
        this.y = aVar;
        this.z = y0Var;
        this.A = y0Var2;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        g gVar;
        androidx.compose.runtime.r rVar;
        switch (this.e) {
            case 0:
                androidx.compose.runtime.r rVar2 = (androidx.compose.runtime.r) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (rVar2.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    f3.a(null, androidx.compose.foundation.shape.e.a(16), com.app.mlounge.ui.theme.b.d, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(54060558, new g(this.y, this.z, this.A, 1), rVar2), rVar2, 12582912, Token.DOT);
                } else {
                    rVar2.W();
                }
                break;
            default:
                androidx.compose.runtime.r rVar3 = (androidx.compose.runtime.r) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (rVar3.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    float f = 24;
                    androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
                    androidx.compose.ui.r rVarO = androidx.compose.foundation.layout.b.o(oVar, f);
                    androidx.compose.foundation.layout.v vVarA = androidx.compose.foundation.layout.t.a(androidx.compose.foundation.layout.h.c, androidx.compose.ui.c.K, rVar3, 48);
                    int iHashCode = Long.hashCode(rVar3.T);
                    androidx.compose.runtime.internal.j jVarL = rVar3.l();
                    androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(rVar3, rVarO);
                    androidx.compose.ui.node.g.b.getClass();
                    androidx.compose.ui.node.y yVar = androidx.compose.ui.node.f.b;
                    rVar3.e0();
                    if (rVar3.S) {
                        rVar3.k(yVar);
                    } else {
                        rVar3.o0();
                    }
                    androidx.compose.runtime.s.x(rVar3, vVarA, androidx.compose.ui.node.f.e);
                    androidx.compose.runtime.s.x(rVar3, jVarL, androidx.compose.ui.node.f.d);
                    androidx.compose.runtime.s.p(rVar3, Integer.valueOf(iHashCode), androidx.compose.ui.node.f.f);
                    androidx.compose.runtime.s.t(rVar3, androidx.compose.ui.node.f.g);
                    androidx.compose.runtime.s.x(rVar3, rVarC, androidx.compose.ui.node.f.c);
                    u2 u2Var = u3.a;
                    p3.b("Changelog", null, com.app.mlounge.ui.theme.b.l, 0L, androidx.compose.ui.text.font.l.C, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar3.j(u2Var)).h, rVar3, 1572870, 0, 131002);
                    androidx.compose.foundation.layout.b.d(rVar3, w0.f(oVar, 4));
                    p3.b("v8.0", null, com.app.mlounge.ui.theme.b.f, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar3.j(u2Var)).l, rVar3, 0, 0, 131066);
                    androidx.compose.foundation.layout.b.d(rVar3, w0.f(oVar, 16));
                    if (((Boolean) this.z.getValue()).booleanValue()) {
                        rVar3.b0(877913545);
                        androidx.compose.ui.text.m0 m0Var = ((t3) rVar3.j(u2Var)).l;
                        long j = com.app.mlounge.ui.theme.b.m;
                        androidx.compose.ui.r rVarQ = androidx.compose.foundation.layout.b.q(oVar, 0.0f, f, 1);
                        gVar = this;
                        p3.b("Loading...", rVarQ, j, 0L, null, 0L, null, 0L, 0, false, 0, 0, m0Var, rVar3, 54, 0, 131064);
                        rVar = rVar3;
                        rVar.p(false);
                    } else {
                        gVar = this;
                        rVar3.b0(878231512);
                        f3.a(w0.f(w0.d(oVar, 1.0f), 280), androidx.compose.foundation.shape.e.a(12), com.app.mlounge.ui.theme.b.b, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(9369721, new androidx.compose.material3.m(gVar.A, 2), rVar3), rVar3, 12582918, 120);
                        rVar = rVar3;
                        rVar.p(false);
                    }
                    androidx.compose.foundation.layout.b.d(rVar, w0.f(oVar, 20));
                    long j2 = com.app.mlounge.ui.theme.b.m;
                    kotlin.jvm.functions.a aVar = gVar.y;
                    boolean zF = rVar.f(aVar);
                    Object objQ = rVar.Q();
                    if (zF || objQ == androidx.compose.runtime.m.a) {
                        objQ = new j2(2, aVar);
                        rVar.l0(objQ);
                    }
                    b0.l("Close", j2, (kotlin.jvm.functions.a) objQ, rVar, 6);
                    rVar.p(true);
                } else {
                    rVar3.W();
                }
                break;
        }
        return kotlin.y.a;
    }
}
