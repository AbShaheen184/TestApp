package com.app.mlounge.ui.screens.player;

import androidx.compose.material3.f3;
import androidx.compose.material3.p3;
import androidx.compose.material3.t3;
import androidx.compose.material3.u3;
import androidx.compose.runtime.u2;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class t implements kotlin.jvm.functions.p {
    public final /* synthetic */ int e;
    public final /* synthetic */ long y;
    public final /* synthetic */ kotlin.jvm.functions.l z;

    public /* synthetic */ t(int i, long j, kotlin.jvm.functions.l lVar) {
        this.e = 1;
        this.y = j;
        this.z = lVar;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                androidx.compose.runtime.r rVar = (androidx.compose.runtime.r) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (rVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    f3.a(null, androidx.compose.foundation.shape.e.a(16), com.app.mlounge.ui.theme.b.d, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(212433706, new t(this.y, this.z, 2, (byte) 0), rVar), rVar, 12583296, Token.DOT);
                } else {
                    rVar.W();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                i0.o(this.y, this.z, (androidx.compose.runtime.r) obj, androidx.compose.runtime.s.A(1));
                break;
            default:
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
                    androidx.compose.ui.node.e eVar = androidx.compose.ui.node.f.e;
                    androidx.compose.runtime.s.x(rVar2, vVarA, eVar);
                    androidx.compose.ui.node.e eVar2 = androidx.compose.ui.node.f.d;
                    androidx.compose.runtime.s.x(rVar2, jVarL, eVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    androidx.compose.ui.node.e eVar3 = androidx.compose.ui.node.f.f;
                    androidx.compose.runtime.s.p(rVar2, numValueOf, eVar3);
                    androidx.compose.ui.node.d dVar = androidx.compose.ui.node.f.g;
                    androidx.compose.runtime.s.t(rVar2, dVar);
                    androidx.compose.ui.node.e eVar4 = androidx.compose.ui.node.f.c;
                    androidx.compose.runtime.s.x(rVar2, rVarC, eVar4);
                    u2 u2Var = u3.a;
                    androidx.compose.ui.text.m0 m0Var = ((t3) rVar2.j(u2Var)).h;
                    long j = androidx.compose.ui.graphics.t.d;
                    p3.b("Resume Playback?", null, j, 0L, androidx.compose.ui.text.font.l.C, 0L, null, 0L, 0, false, 0, 0, m0Var, rVar2, 1573254, 0, 131002);
                    androidx.compose.foundation.layout.b.d(rVar2, androidx.compose.foundation.layout.w0.f(oVar, 8));
                    p3.b("You stopped at ".concat(i0.r(this.y)), null, androidx.compose.ui.graphics.t.b(0.7f, j), 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar2.j(u2Var)).l, rVar2, 384, 0, 131066);
                    androidx.compose.foundation.layout.b.d(rVar2, androidx.compose.foundation.layout.w0.f(oVar, 20));
                    androidx.compose.ui.r rVarD = androidx.compose.foundation.layout.w0.d(oVar, 1.0f);
                    androidx.compose.foundation.layout.t0 t0VarA = androidx.compose.foundation.layout.r0.a(androidx.compose.foundation.layout.h.g(12), androidx.compose.ui.c.G, rVar2, 6);
                    int iHashCode2 = Long.hashCode(rVar2.T);
                    androidx.compose.runtime.internal.j jVarL2 = rVar2.l();
                    androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(rVar2, rVarD);
                    rVar2.e0();
                    if (rVar2.S) {
                        rVar2.k(yVar);
                    } else {
                        rVar2.o0();
                    }
                    androidx.compose.runtime.s.x(rVar2, t0VarA, eVar);
                    androidx.compose.runtime.s.x(rVar2, jVarL2, eVar2);
                    androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode2, rVar2, eVar3, rVar2, dVar);
                    androidx.compose.runtime.s.x(rVar2, rVarC2, eVar4);
                    androidx.compose.ui.graphics.vector.f fVarX = android.support.v4.media.session.b.x();
                    androidx.compose.ui.r rVarA = androidx.compose.foundation.layout.u0.a(1.0f);
                    kotlin.jvm.functions.l lVar = this.z;
                    boolean zF = rVar2.f(lVar);
                    Object objQ = rVar2.Q();
                    androidx.compose.runtime.f fVar = androidx.compose.runtime.m.a;
                    if (zF || objQ == fVar) {
                        objQ = new d(0, lVar);
                        rVar2.l0(objQ);
                    }
                    i0.d("Restart", fVarX, rVarA, (kotlin.jvm.functions.a) objQ, rVar2, 6);
                    androidx.compose.ui.graphics.vector.f fVarW = kotlin.math.a.w();
                    androidx.compose.ui.r rVarA2 = androidx.compose.foundation.layout.u0.a(1.0f);
                    boolean zF2 = rVar2.f(lVar);
                    Object objQ2 = rVar2.Q();
                    if (zF2 || objQ2 == fVar) {
                        objQ2 = new d(1, lVar);
                        rVar2.l0(objQ2);
                    }
                    i0.d("Resume", fVarW, rVarA2, (kotlin.jvm.functions.a) objQ2, rVar2, 6);
                    rVar2.p(true);
                    rVar2.p(true);
                } else {
                    rVar2.W();
                }
                break;
        }
        return kotlin.y.a;
    }

    public /* synthetic */ t(long j, kotlin.jvm.functions.l lVar, int i, byte b) {
        this.e = i;
        this.y = j;
        this.z = lVar;
    }
}
