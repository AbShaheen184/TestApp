package com.app.mlounge.ui.screens.anime;

import androidx.compose.foundation.layout.a0;
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
import androidx.compose.runtime.r;
import androidx.compose.runtime.s;
import androidx.compose.runtime.u2;
import androidx.compose.ui.graphics.j0;
import androidx.compose.ui.layout.q0;
import androidx.compose.ui.node.y;
import androidx.compose.ui.text.m0;
import com.app.mlounge.R;
import com.app.mlounge.data.remote.model.HiAnimeEpisode;
import kotlin.jvm.functions.p;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class i implements p {
    public final /* synthetic */ float e;
    public final /* synthetic */ HiAnimeEpisode y;
    public final /* synthetic */ boolean z;

    public i(float f, HiAnimeEpisode hiAnimeEpisode, boolean z) {
        this.e = f;
        this.y = hiAnimeEpisode;
        this.z = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        androidx.compose.ui.o oVar;
        int i;
        y yVar;
        ?? r0;
        r rVar;
        r rVar2 = (r) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (rVar2.T(iIntValue & 1, (iIntValue & 3) != 2)) {
            androidx.compose.foundation.layout.c cVar = androidx.compose.foundation.layout.h.c;
            androidx.compose.ui.h hVar = androidx.compose.ui.c.J;
            v vVarA = t.a(cVar, hVar, rVar2, 0);
            int iHashCode = Long.hashCode(rVar2.T);
            androidx.compose.runtime.internal.j jVarL = rVar2.l();
            androidx.compose.ui.o oVar2 = androidx.compose.ui.o.b;
            androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(rVar2, oVar2);
            androidx.compose.ui.node.g.b.getClass();
            y yVar2 = androidx.compose.ui.node.f.b;
            rVar2.e0();
            if (rVar2.S) {
                rVar2.k(yVar2);
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
            androidx.compose.ui.r rVarO = androidx.compose.foundation.layout.b.o(oVar2, 12);
            t0 t0VarA = r0.a(androidx.compose.foundation.layout.h.a, androidx.compose.ui.c.H, rVar2, 48);
            int iHashCode2 = Long.hashCode(rVar2.T);
            androidx.compose.runtime.internal.j jVarL2 = rVar2.l();
            androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(rVar2, rVarO);
            rVar2.e0();
            if (rVar2.S) {
                rVar2.k(yVar2);
            } else {
                rVar2.o0();
            }
            s.x(rVar2, t0VarA, eVar);
            s.x(rVar2, jVarL2, eVar2);
            androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode2, rVar2, eVar3, rVar2, dVar);
            s.x(rVar2, rVarC2, eVar4);
            HiAnimeEpisode hiAnimeEpisode = this.y;
            String strValueOf = String.valueOf(hiAnimeEpisode.b());
            u2 u2Var = u3.a;
            m0 m0Var = ((t3) rVar2.j(u2Var)).h;
            long j = com.app.mlounge.ui.theme.b.f;
            p3.b(strValueOf, w0.p(oVar2, 32), j, 0L, null, 0L, null, 0L, 0, false, 0, 0, m0Var, rVar2, 432, 0, 131064);
            if (this.z) {
                rVar2.b0(-882619151);
                oVar = oVar2;
                f1.a(androidx.room.r.q(R.drawable.ic_check, rVar2), "Watched", androidx.compose.foundation.layout.b.s(w0.l(oVar, 20), 0.0f, 0.0f, 8, 0.0f, 11), com.app.mlounge.ui.theme.b.p, rVar2, 3512);
                i = 0;
                rVar2.p(false);
            } else {
                oVar = oVar2;
                i = 0;
                rVar2.b0(-882266495);
                rVar2.p(false);
            }
            if (1.0f <= 0.0d) {
                androidx.compose.foundation.layout.internal.a.a("invalid weight; must be greater than zero");
            }
            h0 h0Var = new h0(1.0f, true);
            v vVarA2 = t.a(cVar, hVar, rVar2, i);
            int iHashCode3 = Long.hashCode(rVar2.T);
            androidx.compose.runtime.internal.j jVarL3 = rVar2.l();
            androidx.compose.ui.r rVarC3 = androidx.compose.ui.a.c(rVar2, h0Var);
            rVar2.e0();
            if (rVar2.S) {
                yVar = yVar2;
                rVar2.k(yVar);
            } else {
                yVar = yVar2;
                rVar2.o0();
            }
            s.x(rVar2, vVarA2, eVar);
            s.x(rVar2, jVarL3, eVar2);
            androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode3, rVar2, eVar3, rVar2, dVar);
            s.x(rVar2, rVarC3, eVar4);
            String strC = hiAnimeEpisode.c();
            if (strC == null) {
                strC = "Episode " + hiAnimeEpisode.b();
            }
            androidx.compose.ui.o oVar3 = oVar;
            y yVar3 = yVar;
            p3.b(strC, null, com.app.mlounge.ui.theme.b.l, 0L, null, 0L, null, 0L, 2, false, 1, 0, ((t3) rVar2.j(u2Var)).k, rVar2, 384, 24960, 110586);
            r rVar3 = rVar2;
            if (kotlin.jvm.internal.l.a(hiAnimeEpisode.d(), Boolean.TRUE)) {
                rVar3.b0(1505401851);
                p3.b("Filler", null, com.app.mlounge.ui.theme.b.i, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar3.j(u2Var)).o, rVar3, 390, 0, 131066);
                rVar = rVar3;
                r0 = 0;
            } else {
                r0 = 0;
                rVar3.b0(1505478731);
                rVar = rVar3;
            }
            rVar.p(r0);
            rVar.p(true);
            f1.b(okhttp3.internal.platform.android.g.t(), "Play", w0.l(oVar3, 28), j, rVar, 3504, 0);
            rVar.p(true);
            float f = this.e;
            if (f > 0.0f) {
                rVar.b0(618770939);
                androidx.compose.ui.r rVarF = w0.f(w0.d(oVar3, 1.0f), 3);
                q0 q0VarD = androidx.compose.foundation.layout.p.d(androidx.compose.ui.c.e, r0);
                int iHashCode4 = Long.hashCode(rVar.T);
                androidx.compose.runtime.internal.j jVarL4 = rVar.l();
                androidx.compose.ui.r rVarC4 = androidx.compose.ui.a.c(rVar, rVarF);
                rVar.e0();
                if (rVar.S) {
                    rVar.k(yVar3);
                } else {
                    rVar.o0();
                }
                s.x(rVar, q0VarD, eVar);
                s.x(rVar, jVarL4, eVar2);
                androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode4, rVar, eVar3, rVar, dVar);
                s.x(rVar, rVarC4, eVar4);
                a0 a0Var = w0.c;
                long jB = androidx.compose.ui.graphics.t.b(0.25f, androidx.compose.ui.graphics.t.d);
                j0 j0Var = androidx.compose.ui.graphics.a0.b;
                androidx.compose.foundation.layout.p.a(androidx.compose.foundation.s.f(a0Var, jB, j0Var), rVar, 6);
                androidx.compose.foundation.layout.p.a(androidx.compose.foundation.s.f(w0.d(w0.c(oVar3, 1.0f), com.google.android.material.resources.c.b(f, 0.0f, 1.0f)), j, j0Var), rVar, r0);
                rVar.p(true);
                rVar.p(r0);
            } else {
                rVar.b0(619149573);
                rVar.p(r0);
            }
            rVar.p(true);
        } else {
            rVar2.W();
        }
        return kotlin.y.a;
    }
}
