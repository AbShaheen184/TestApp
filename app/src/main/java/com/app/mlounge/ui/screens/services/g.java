package com.app.mlounge.ui.screens.services;

import androidx.compose.foundation.layout.h0;
import androidx.compose.foundation.layout.r0;
import androidx.compose.foundation.layout.t;
import androidx.compose.foundation.layout.t0;
import androidx.compose.foundation.layout.v;
import androidx.compose.foundation.layout.w0;
import androidx.compose.material3.p3;
import androidx.compose.material3.t3;
import androidx.compose.material3.u3;
import androidx.compose.runtime.r;
import androidx.compose.runtime.s;
import androidx.compose.runtime.u2;
import androidx.compose.ui.node.y;
import androidx.compose.ui.o;
import com.app.mlounge.ui.viewmodel.q;
import kotlin.jvm.functions.p;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class g implements p {
    public final /* synthetic */ kotlin.jvm.functions.a A;
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ q y;
    public final /* synthetic */ p z;

    public /* synthetic */ g(q qVar, kotlin.jvm.functions.a aVar, p pVar) {
        this.y = qVar;
        this.A = aVar;
        this.z = pVar;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                r rVar = (r) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (rVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    o oVar = o.b;
                    androidx.compose.ui.r rVarO = androidx.compose.foundation.layout.b.o(oVar, 16);
                    androidx.compose.foundation.layout.c cVar = androidx.compose.foundation.layout.h.c;
                    androidx.compose.ui.h hVar = androidx.compose.ui.c.J;
                    v vVarA = t.a(cVar, hVar, rVar, 0);
                    int iHashCode = Long.hashCode(rVar.T);
                    androidx.compose.runtime.internal.j jVarL = rVar.l();
                    androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(rVar, rVarO);
                    androidx.compose.ui.node.g.b.getClass();
                    y yVar = androidx.compose.ui.node.f.b;
                    rVar.e0();
                    if (rVar.S) {
                        rVar.k(yVar);
                    } else {
                        rVar.o0();
                    }
                    androidx.compose.ui.node.e eVar = androidx.compose.ui.node.f.e;
                    s.x(rVar, vVarA, eVar);
                    androidx.compose.ui.node.e eVar2 = androidx.compose.ui.node.f.d;
                    s.x(rVar, jVarL, eVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    androidx.compose.ui.node.e eVar3 = androidx.compose.ui.node.f.f;
                    s.p(rVar, numValueOf, eVar3);
                    androidx.compose.ui.node.d dVar = androidx.compose.ui.node.f.g;
                    s.t(rVar, dVar);
                    androidx.compose.ui.node.e eVar4 = androidx.compose.ui.node.f.c;
                    s.x(rVar, rVarC, eVar4);
                    t0 t0VarA = r0.a(androidx.compose.foundation.layout.h.a, androidx.compose.ui.c.H, rVar, 48);
                    int iHashCode2 = Long.hashCode(rVar.T);
                    androidx.compose.runtime.internal.j jVarL2 = rVar.l();
                    androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(rVar, oVar);
                    rVar.e0();
                    if (rVar.S) {
                        rVar.k(yVar);
                    } else {
                        rVar.o0();
                    }
                    s.x(rVar, t0VarA, eVar);
                    s.x(rVar, jVarL2, eVar2);
                    androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode2, rVar, eVar3, rVar, dVar);
                    s.x(rVar, rVarC2, eVar4);
                    if (1.0f <= 0.0d) {
                        androidx.compose.foundation.layout.internal.a.a("invalid weight; must be greater than zero");
                    }
                    h0 h0Var = new h0(1.0f, true);
                    v vVarA2 = t.a(cVar, hVar, rVar, 0);
                    int iHashCode3 = Long.hashCode(rVar.T);
                    androidx.compose.runtime.internal.j jVarL3 = rVar.l();
                    androidx.compose.ui.r rVarC3 = androidx.compose.ui.a.c(rVar, h0Var);
                    rVar.e0();
                    if (rVar.S) {
                        rVar.k(yVar);
                    } else {
                        rVar.o0();
                    }
                    s.x(rVar, vVarA2, eVar);
                    s.x(rVar, jVarL3, eVar2);
                    androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode3, rVar, eVar3, rVar, dVar);
                    s.x(rVar, rVarC3, eVar4);
                    u2 u2Var = u3.a;
                    p3.b("EasyNews", null, com.app.mlounge.ui.theme.b.l, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar.j(u2Var)).h, rVar, 390, 0, 131066);
                    p3.b("Usenet indexer with direct video links", null, com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar.j(u2Var)).l, rVar, 390, 0, 131066);
                    rVar.p(true);
                    q qVar = this.y;
                    n.l(qVar.a, rVar, 0);
                    rVar.p(true);
                    androidx.compose.foundation.layout.b.d(rVar, w0.f(oVar, 12));
                    if (qVar.a) {
                        rVar.b0(1120312674);
                        String str = qVar.b;
                        if (str == null) {
                            str = "Unknown";
                        }
                        n.a(com.google.common.base.c.p(new kotlin.k("Username", str)), rVar, 0);
                        androidx.compose.foundation.layout.b.d(rVar, w0.f(oVar, 8));
                        n.g(this.A, rVar, 0);
                        rVar.p(false);
                    } else {
                        rVar.b0(1120571555);
                        rVar.b0(1120874518);
                        rVar.p(false);
                        n.o(this.z, rVar, 0);
                        androidx.compose.foundation.layout.b.d(rVar, w0.f(oVar, 8));
                        n.d("https://easynews.com/", rVar, 6);
                        rVar.p(false);
                    }
                    rVar.p(true);
                } else {
                    rVar.W();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                n.f(this.y, this.z, this.A, (r) obj, s.A(1));
                break;
        }
        return kotlin.y.a;
    }

    public /* synthetic */ g(q qVar, p pVar, kotlin.jvm.functions.a aVar, int i) {
        this.y = qVar;
        this.z = pVar;
        this.A = aVar;
    }
}
