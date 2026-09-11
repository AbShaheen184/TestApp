package com.app.mlounge.ui.screens.tvshows;

import androidx.compose.foundation.layout.t;
import androidx.compose.foundation.layout.v;
import androidx.compose.foundation.layout.w0;
import androidx.compose.foundation.s;
import androidx.compose.material3.p3;
import androidx.compose.material3.t3;
import androidx.compose.material3.u3;
import androidx.compose.ui.node.y;
import com.app.mlounge.data.remote.model.TmdbCastMember;
import com.app.mlounge.data.remote.model.TmdbTvShow;
import com.app.mlounge.data.repository.j0;
import com.app.mlounge.ui.components.b0;
import com.app.mlounge.ui.viewmodel.x1;
import java.util.List;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class p implements kotlin.jvm.functions.r {
    public final /* synthetic */ x1 A;
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ List y;
    public final /* synthetic */ kotlin.jvm.functions.l z;

    public p(List list, x1 x1Var, kotlin.jvm.functions.l lVar) {
        this.y = list;
        this.A = x1Var;
        this.z = lVar;
    }

    @Override // kotlin.jvm.functions.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        switch (this.e) {
            case 0:
                androidx.compose.foundation.lazy.d dVar = (androidx.compose.foundation.lazy.d) obj;
                int iIntValue = ((Number) obj2).intValue();
                androidx.compose.runtime.r rVar = (androidx.compose.runtime.r) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i = (rVar.f(dVar) ? 4 : 2) | iIntValue2;
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i |= rVar.d(iIntValue) ? 32 : 16;
                }
                if (rVar.T(i & 1, (i & Token.EXPR_VOID) != 146)) {
                    TmdbTvShow tmdbTvShow = (TmdbTvShow) this.y.get(iIntValue);
                    rVar.b0(1605327097);
                    String strC = tmdbTvShow.c();
                    if (strC == null) {
                        strC = "";
                    }
                    String strF = tmdbTvShow.f();
                    this.A.b.getClass();
                    String strB = j0.b(strF, "w500");
                    Double dG = tmdbTvShow.g();
                    androidx.compose.ui.r rVarP = w0.p(androidx.compose.ui.o.b, 130);
                    kotlin.jvm.functions.l lVar = this.z;
                    boolean zF = rVar.f(lVar) | rVar.h(tmdbTvShow);
                    Object objQ = rVar.Q();
                    if (zF || objQ == androidx.compose.runtime.m.a) {
                        objQ = new com.app.mlounge.ui.screens.search.g(lVar, tmdbTvShow, 1);
                        rVar.l0(objQ);
                    }
                    b0.h(strC, strB, (kotlin.jvm.functions.a) objQ, rVarP, dG, null, null, null, null, 0.0f, false, false, 0.0f, null, rVar, 3072, 0, 16352);
                    rVar.p(false);
                } else {
                    rVar.W();
                }
                break;
            default:
                androidx.compose.foundation.lazy.d dVar2 = (androidx.compose.foundation.lazy.d) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                androidx.compose.runtime.r rVar2 = (androidx.compose.runtime.r) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                if ((iIntValue4 & 6) == 0) {
                    i2 = (rVar2.f(dVar2) ? 4 : 2) | iIntValue4;
                } else {
                    i2 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i2 |= rVar2.d(iIntValue3) ? 32 : 16;
                }
                if (rVar2.T(i2 & 1, (i2 & Token.EXPR_VOID) != 146)) {
                    TmdbCastMember tmdbCastMember = (TmdbCastMember) this.y.get(iIntValue3);
                    rVar2.b0(264823552);
                    androidx.compose.ui.h hVar = androidx.compose.ui.c.K;
                    androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
                    androidx.compose.ui.r rVarP2 = w0.p(oVar, 80);
                    kotlin.jvm.functions.l lVar2 = this.z;
                    boolean zF2 = rVar2.f(lVar2) | rVar2.f(tmdbCastMember);
                    Object objQ2 = rVar2.Q();
                    if (zF2 || objQ2 == androidx.compose.runtime.m.a) {
                        objQ2 = new com.app.mlounge.ui.screens.movies.i(lVar2, tmdbCastMember, 1);
                        rVar2.l0(objQ2);
                    }
                    androidx.compose.ui.r rVarO = androidx.compose.foundation.layout.b.o(s.m(s.j(rVarP2, false, null, (kotlin.jvm.functions.a) objQ2, 15), null, 3), 4);
                    v vVarA = t.a(androidx.compose.foundation.layout.h.c, hVar, rVar2, 48);
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
                    androidx.compose.runtime.s.x(rVar2, vVarA, androidx.compose.ui.node.f.e);
                    androidx.compose.runtime.s.x(rVar2, jVarL, androidx.compose.ui.node.f.d);
                    androidx.compose.runtime.s.p(rVar2, Integer.valueOf(iHashCode), androidx.compose.ui.node.f.f);
                    androidx.compose.runtime.s.t(rVar2, androidx.compose.ui.node.f.g);
                    androidx.compose.runtime.s.x(rVar2, rVarC, androidx.compose.ui.node.f.c);
                    String strD = tmdbCastMember.d();
                    this.A.b.getClass();
                    coil3.compose.k.a(j0.b(strD, "w185"), tmdbCastMember.c(), androidx.compose.ui.draw.h.a(w0.l(oVar, 60), androidx.compose.foundation.shape.e.a), null, androidx.compose.ui.layout.i.a, rVar2, 1572864, 1976);
                    String strC2 = tmdbCastMember.c();
                    if (strC2 == null) {
                        strC2 = "";
                    }
                    p3.b(strC2, null, com.app.mlounge.ui.theme.b.l, 0L, null, 0L, null, 0L, 2, false, 1, 0, ((t3) rVar2.j(u3.a)).o, rVar2, 384, 24960, 110586);
                    rVar2.p(true);
                    rVar2.p(false);
                } else {
                    rVar2.W();
                }
                break;
        }
        return kotlin.y.a;
    }

    public p(List list, kotlin.jvm.functions.l lVar, x1 x1Var) {
        this.y = list;
        this.z = lVar;
        this.A = x1Var;
    }
}
