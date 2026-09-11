package com.app.mlounge.ui.screens.tvshows;

import androidx.compose.foundation.layout.r0;
import androidx.compose.foundation.layout.t;
import androidx.compose.foundation.layout.t0;
import androidx.compose.foundation.layout.u0;
import androidx.compose.foundation.layout.v;
import androidx.compose.foundation.layout.w0;
import androidx.compose.material3.f3;
import androidx.compose.material3.p3;
import androidx.compose.material3.t3;
import androidx.compose.material3.u3;
import androidx.compose.runtime.s;
import androidx.compose.runtime.u2;
import androidx.compose.ui.node.y;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements kotlin.jvm.functions.p {
    public final /* synthetic */ kotlin.jvm.functions.a A;
    public final /* synthetic */ int e;
    public final /* synthetic */ String y;
    public final /* synthetic */ kotlin.jvm.functions.a z;

    public /* synthetic */ d(String str, kotlin.jvm.functions.a aVar, kotlin.jvm.functions.a aVar2, int i) {
        this.e = i;
        this.y = str;
        this.z = aVar;
        this.A = aVar2;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                androidx.compose.runtime.r rVar = (androidx.compose.runtime.r) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (rVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    f3.a(null, androidx.compose.foundation.shape.e.a(16), com.app.mlounge.ui.theme.b.d, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(-190413534, new d(this.y, this.z, this.A, 1), rVar), rVar, 12583296, Token.DOT);
                } else {
                    rVar.W();
                }
                break;
            default:
                androidx.compose.runtime.r rVar2 = (androidx.compose.runtime.r) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (rVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
                    androidx.compose.ui.r rVarO = androidx.compose.foundation.layout.b.o(oVar, 24);
                    v vVarA = t.a(androidx.compose.foundation.layout.h.c, androidx.compose.ui.c.K, rVar2, 48);
                    int iHashCode = Long.hashCode(rVar2.T);
                    androidx.compose.runtime.internal.j jVarL = rVar2.l();
                    androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(rVar2, rVarO);
                    androidx.compose.ui.node.g.b.getClass();
                    y yVar = androidx.compose.ui.node.f.b;
                    rVar2.e0();
                    if (rVar2.S) {
                        rVar2.k(yVar);
                    } else {
                        rVar2.o0();
                    }
                    androidx.compose.ui.node.e eVar = androidx.compose.ui.node.f.e;
                    s.x(rVar2, vVarA, eVar);
                    androidx.compose.ui.node.e eVar2 = androidx.compose.ui.node.f.d;
                    s.x(rVar2, jVarL, eVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    androidx.compose.ui.node.e eVar3 = androidx.compose.ui.node.f.f;
                    s.p(rVar2, numValueOf, eVar3);
                    androidx.compose.ui.node.d dVar = androidx.compose.ui.node.f.g;
                    s.t(rVar2, dVar);
                    androidx.compose.ui.node.e eVar4 = androidx.compose.ui.node.f.c;
                    s.x(rVar2, rVarC, eVar4);
                    u2 u2Var = u3.a;
                    p3.b(this.y, null, com.app.mlounge.ui.theme.b.l, 0L, androidx.compose.ui.text.font.l.C, 0L, null, 0L, 2, false, 2, 0, ((t3) rVar2.j(u2Var)).h, rVar2, 1573248, 24960, 110522);
                    androidx.compose.foundation.layout.b.d(rVar2, w0.f(oVar, 8));
                    p3.b("What would you like to do?", null, com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar2.j(u2Var)).l, rVar2, 390, 0, 131066);
                    androidx.compose.foundation.layout.b.d(rVar2, w0.f(oVar, 20));
                    androidx.compose.ui.r rVarD = w0.d(oVar, 1.0f);
                    t0 t0VarA = r0.a(androidx.compose.foundation.layout.h.g(12), androidx.compose.ui.c.G, rVar2, 6);
                    int iHashCode2 = Long.hashCode(rVar2.T);
                    androidx.compose.runtime.internal.j jVarL2 = rVar2.l();
                    androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(rVar2, rVarD);
                    rVar2.e0();
                    if (rVar2.S) {
                        rVar2.k(yVar);
                    } else {
                        rVar2.o0();
                    }
                    s.x(rVar2, t0VarA, eVar);
                    s.x(rVar2, jVarL2, eVar2);
                    androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode2, rVar2, eVar3, rVar2, dVar);
                    s.x(rVar2, rVarC2, eVar4);
                    com.app.mlounge.ui.screens.movies.a.b("Watch", kotlin.math.a.w(), this.z, u0.a(1.0f), false, rVar2, 6, 48);
                    com.app.mlounge.ui.screens.movies.a.b("Download", _COROUTINE.a.w(), this.A, u0.a(1.0f), false, rVar2, 6, 48);
                    rVar2.p(true);
                    rVar2.p(true);
                } else {
                    rVar2.W();
                }
                break;
        }
        return kotlin.y.a;
    }
}
