package com.app.mlounge.ui.screens.tvshows;

import androidx.compose.foundation.layout.m0;
import androidx.compose.foundation.layout.t;
import androidx.compose.foundation.layout.v;
import androidx.compose.foundation.layout.w0;
import androidx.compose.material3.p3;
import androidx.compose.material3.t3;
import androidx.compose.material3.u3;
import androidx.compose.runtime.s;
import androidx.compose.ui.node.y;
import com.app.mlounge.data.remote.api.TmdbTvDetailResponse;
import com.app.mlounge.data.remote.model.TmdbCreditsResponse;
import com.app.mlounge.data.remote.model.TmdbPagedResponse;
import com.app.mlounge.ui.viewmodel.x1;
import java.util.List;
import kotlin.collections.u;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c implements kotlin.jvm.functions.q {
    public final /* synthetic */ kotlin.jvm.functions.l A;
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ TmdbTvDetailResponse y;
    public final /* synthetic */ x1 z;

    public /* synthetic */ c(TmdbTvDetailResponse tmdbTvDetailResponse, x1 x1Var, kotlin.jvm.functions.l lVar) {
        this.y = tmdbTvDetailResponse;
        this.z = x1Var;
        this.A = lVar;
    }

    @Override // kotlin.jvm.functions.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        List listA;
        List listB;
        switch (this.e) {
            case 0:
                androidx.compose.runtime.r rVar = (androidx.compose.runtime.r) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((androidx.compose.foundation.lazy.d) obj).getClass();
                if (rVar.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    TmdbCreditsResponse tmdbCreditsResponseD = this.y.d();
                    List listG0 = (tmdbCreditsResponseD == null || (listA = tmdbCreditsResponseD.a()) == null) ? u.e : kotlin.collections.o.g0(15, listA);
                    if (listG0.isEmpty()) {
                        rVar.b0(791174444);
                        rVar.p(false);
                    } else {
                        rVar.b0(789691621);
                        v vVarA = t.a(androidx.compose.foundation.layout.h.c, androidx.compose.ui.c.J, rVar, 0);
                        int iHashCode = Long.hashCode(rVar.T);
                        androidx.compose.runtime.internal.j jVarL = rVar.l();
                        androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
                        androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(rVar, oVar);
                        androidx.compose.ui.node.g.b.getClass();
                        y yVar = androidx.compose.ui.node.f.b;
                        rVar.e0();
                        if (rVar.S) {
                            rVar.k(yVar);
                        } else {
                            rVar.o0();
                        }
                        s.x(rVar, vVarA, androidx.compose.ui.node.f.e);
                        s.x(rVar, jVarL, androidx.compose.ui.node.f.d);
                        s.p(rVar, Integer.valueOf(iHashCode), androidx.compose.ui.node.f.f);
                        s.t(rVar, androidx.compose.ui.node.f.g);
                        s.x(rVar, rVarC, androidx.compose.ui.node.f.c);
                        float f = 16;
                        androidx.compose.foundation.layout.b.d(rVar, w0.f(oVar, f));
                        p3.b("Cast", androidx.compose.foundation.layout.b.q(oVar, f, 0.0f, 2), com.app.mlounge.ui.theme.b.l, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar.j(u3.a)).h, rVar, 438, 0, 131064);
                        m0 m0VarA = androidx.compose.foundation.layout.b.a(2, f);
                        androidx.compose.foundation.layout.f fVarG = androidx.compose.foundation.layout.h.g(12);
                        boolean zH = rVar.h(listG0);
                        kotlin.jvm.functions.l lVar = this.A;
                        boolean zF = zH | rVar.f(lVar);
                        x1 x1Var = this.z;
                        boolean zH2 = zF | rVar.h(x1Var);
                        Object objQ = rVar.Q();
                        if (zH2 || objQ == androidx.compose.runtime.m.a) {
                            objQ = new e(listG0, lVar, x1Var);
                            rVar.l0(objQ);
                        }
                        coil3.network.g.b(null, null, m0VarA, fVarG, null, null, false, null, (kotlin.jvm.functions.l) objQ, rVar, 24960);
                        rVar.p(true);
                        rVar.p(false);
                    }
                } else {
                    rVar.W();
                }
                break;
            default:
                androidx.compose.runtime.r rVar2 = (androidx.compose.runtime.r) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((androidx.compose.foundation.lazy.d) obj).getClass();
                if (rVar2.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    TmdbPagedResponse tmdbPagedResponseO = this.y.o();
                    List listG1 = (tmdbPagedResponseO == null || (listB = tmdbPagedResponseO.b()) == null) ? u.e : kotlin.collections.o.g0(15, listB);
                    if (listG1.isEmpty()) {
                        rVar2.b0(1834359277);
                        rVar2.p(false);
                    } else {
                        rVar2.b0(1833472274);
                        v vVarA2 = t.a(androidx.compose.foundation.layout.h.c, androidx.compose.ui.c.J, rVar2, 0);
                        int iHashCode2 = Long.hashCode(rVar2.T);
                        androidx.compose.runtime.internal.j jVarL2 = rVar2.l();
                        androidx.compose.ui.o oVar2 = androidx.compose.ui.o.b;
                        androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(rVar2, oVar2);
                        androidx.compose.ui.node.g.b.getClass();
                        y yVar2 = androidx.compose.ui.node.f.b;
                        rVar2.e0();
                        if (rVar2.S) {
                            rVar2.k(yVar2);
                        } else {
                            rVar2.o0();
                        }
                        s.x(rVar2, vVarA2, androidx.compose.ui.node.f.e);
                        s.x(rVar2, jVarL2, androidx.compose.ui.node.f.d);
                        s.p(rVar2, Integer.valueOf(iHashCode2), androidx.compose.ui.node.f.f);
                        s.t(rVar2, androidx.compose.ui.node.f.g);
                        s.x(rVar2, rVarC2, androidx.compose.ui.node.f.c);
                        float f2 = 16;
                        androidx.compose.foundation.layout.b.d(rVar2, w0.f(oVar2, f2));
                        List list = listG1;
                        p3.b("Similar Shows", androidx.compose.foundation.layout.b.q(oVar2, f2, 0.0f, 2), com.app.mlounge.ui.theme.b.l, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar2.j(u3.a)).h, rVar2, 438, 0, 131064);
                        m0 m0VarA2 = androidx.compose.foundation.layout.b.a(2, f2);
                        androidx.compose.foundation.layout.f fVarG2 = androidx.compose.foundation.layout.h.g(8);
                        boolean zH3 = rVar2.h(list);
                        x1 x1Var2 = this.z;
                        boolean zH4 = zH3 | rVar2.h(x1Var2);
                        kotlin.jvm.functions.l lVar2 = this.A;
                        boolean zF2 = zH4 | rVar2.f(lVar2);
                        Object objQ2 = rVar2.Q();
                        if (zF2 || objQ2 == androidx.compose.runtime.m.a) {
                            objQ2 = new e(list, x1Var2, lVar2);
                            rVar2.l0(objQ2);
                        }
                        coil3.network.g.b(null, null, m0VarA2, fVarG2, null, null, false, null, (kotlin.jvm.functions.l) objQ2, rVar2, 24960);
                        rVar2.p(true);
                        rVar2.p(false);
                    }
                } else {
                    rVar2.W();
                }
                break;
        }
        return kotlin.y.a;
    }

    public /* synthetic */ c(TmdbTvDetailResponse tmdbTvDetailResponse, kotlin.jvm.functions.l lVar, x1 x1Var) {
        this.y = tmdbTvDetailResponse;
        this.A = lVar;
        this.z = x1Var;
    }
}
