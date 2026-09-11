package com.app.mlounge.ui.screens.music;

import androidx.compose.foundation.layout.h0;
import androidx.compose.foundation.layout.r0;
import androidx.compose.foundation.layout.t;
import androidx.compose.foundation.layout.t0;
import androidx.compose.foundation.layout.v;
import androidx.compose.foundation.layout.w0;
import androidx.compose.material3.f1;
import androidx.compose.material3.p3;
import androidx.compose.material3.t3;
import androidx.compose.material3.u3;
import androidx.compose.runtime.internal.j;
import androidx.compose.runtime.r;
import androidx.compose.runtime.s;
import androidx.compose.runtime.u2;
import androidx.compose.ui.node.y;
import androidx.compose.ui.o;
import androidx.compose.ui.text.m0;
import com.app.mlounge.data.remote.model.MusicTrack;
import com.app.mlounge.ui.components.b0;
import kotlin.jvm.functions.p;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d implements p {
    public final /* synthetic */ kotlin.jvm.functions.a A;
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ MusicTrack y;
    public final /* synthetic */ kotlin.jvm.functions.a z;

    public /* synthetic */ d(MusicTrack musicTrack, kotlin.jvm.functions.a aVar, kotlin.jvm.functions.a aVar2) {
        this.y = musicTrack;
        this.z = aVar;
        this.A = aVar2;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                r rVar = (r) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (rVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    float f = 12;
                    o oVar = o.b;
                    androidx.compose.ui.r rVarO = androidx.compose.foundation.layout.b.o(oVar, f);
                    t0 t0VarA = r0.a(androidx.compose.foundation.layout.h.a, androidx.compose.ui.c.H, rVar, 48);
                    int iHashCode = Long.hashCode(rVar.T);
                    j jVarL = rVar.l();
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
                    s.x(rVar, t0VarA, eVar);
                    androidx.compose.ui.node.e eVar2 = androidx.compose.ui.node.f.d;
                    s.x(rVar, jVarL, eVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    androidx.compose.ui.node.e eVar3 = androidx.compose.ui.node.f.f;
                    s.p(rVar, numValueOf, eVar3);
                    androidx.compose.ui.node.d dVar = androidx.compose.ui.node.f.g;
                    s.t(rVar, dVar);
                    androidx.compose.ui.node.e eVar4 = androidx.compose.ui.node.f.c;
                    s.x(rVar, rVarC, eVar4);
                    f1.b(_COROUTINE.b.s(), null, w0.l(oVar, 24), com.app.mlounge.ui.theme.b.f, rVar, 3504, 0);
                    androidx.compose.foundation.layout.b.d(rVar, w0.p(oVar, f));
                    if (1.0f <= 0.0d) {
                        androidx.compose.foundation.layout.internal.a.a("invalid weight; must be greater than zero");
                    }
                    h0 h0Var = new h0(1.0f, true);
                    v vVarA = t.a(androidx.compose.foundation.layout.h.c, androidx.compose.ui.c.J, rVar, 0);
                    int iHashCode2 = Long.hashCode(rVar.T);
                    j jVarL2 = rVar.l();
                    androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(rVar, h0Var);
                    rVar.e0();
                    if (rVar.S) {
                        rVar.k(yVar);
                    } else {
                        rVar.o0();
                    }
                    s.x(rVar, vVarA, eVar);
                    s.x(rVar, jVarL2, eVar2);
                    androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode2, rVar, eVar3, rVar, dVar);
                    s.x(rVar, rVarC2, eVar4);
                    MusicTrack musicTrack = this.y;
                    String strG = musicTrack.g();
                    u2 u2Var = u3.a;
                    p3.b(strG, null, androidx.compose.ui.graphics.t.d, 0L, null, 0L, null, 0L, 2, false, 1, 0, ((t3) rVar.j(u2Var)).k, rVar, 384, 24960, 110586);
                    String strB = musicTrack.b();
                    m0 m0Var = ((t3) rVar.j(u2Var)).l;
                    long j = com.app.mlounge.ui.theme.b.m;
                    p3.b(strB, null, j, 0L, null, 0L, null, 0L, 2, false, 1, 0, m0Var, rVar, 384, 24960, 110586);
                    r rVar2 = rVar;
                    rVar2.p(true);
                    String strC = musicTrack.c();
                    if (strC == null) {
                        rVar2.b0(872913045);
                        rVar2.p(false);
                    } else {
                        rVar2.b0(872913046);
                        p3.b(strC, androidx.compose.foundation.layout.b.q(oVar, 8, 0.0f, 2), j, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar2.j(u2Var)).l, rVar2, 432, 0, 131064);
                        rVar2 = rVar2;
                        rVar2.p(false);
                    }
                    t0 t0VarA2 = r0.a(androidx.compose.foundation.layout.h.g(16), androidx.compose.ui.c.G, rVar2, 6);
                    int iHashCode3 = Long.hashCode(rVar2.T);
                    j jVarL3 = rVar2.l();
                    androidx.compose.ui.r rVarC3 = androidx.compose.ui.a.c(rVar2, oVar);
                    rVar2.e0();
                    if (rVar2.S) {
                        rVar2.k(yVar);
                    } else {
                        rVar2.o0();
                    }
                    s.x(rVar2, t0VarA2, eVar);
                    s.x(rVar2, jVarL3, eVar2);
                    androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode3, rVar2, eVar3, rVar2, dVar);
                    s.x(rVar2, rVarC3, eVar4);
                    b0.m(this.z, null, false, a.b, rVar2, 3072);
                    b0.m(this.A, null, false, a.c, rVar2, 3072);
                    rVar2.p(true);
                    rVar2.p(true);
                } else {
                    rVar.W();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                a.d(this.y, this.z, this.A, (r) obj, s.A(1));
                break;
        }
        return kotlin.y.a;
    }

    public /* synthetic */ d(MusicTrack musicTrack, kotlin.jvm.functions.a aVar, kotlin.jvm.functions.a aVar2, int i) {
        this.y = musicTrack;
        this.z = aVar;
        this.A = aVar2;
    }
}
