package com.app.mlounge.ui.screens.tvshows;

import androidx.compose.runtime.j0;
import androidx.compose.runtime.t2;
import androidx.compose.runtime.y0;
import androidx.compose.ui.focus.y;
import com.app.mlounge.data.remote.model.TmdbEpisode;
import com.app.mlounge.ui.viewmodel.x1;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class o implements kotlin.jvm.functions.r {
    public final /* synthetic */ x1 A;
    public final /* synthetic */ t2 B;
    public final /* synthetic */ t2 C;
    public final /* synthetic */ y0 D;
    public final /* synthetic */ y0 E;
    public final /* synthetic */ List e;
    public final /* synthetic */ int y;
    public final /* synthetic */ Map z;

    public o(List list, int i, Map map, x1 x1Var, t2 t2Var, t2 t2Var2, y0 y0Var, y0 y0Var2) {
        this.e = list;
        this.y = i;
        this.z = map;
        this.A = x1Var;
        this.B = t2Var;
        this.C = t2Var2;
        this.D = y0Var;
        this.E = y0Var2;
    }

    @Override // kotlin.jvm.functions.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
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
            TmdbEpisode tmdbEpisode = (TmdbEpisode) this.e.get(iIntValue);
            rVar.b0(-147727579);
            int iF = tmdbEpisode.f();
            int iA = tmdbEpisode.a();
            StringBuilder sbW = androidx.privacysandbox.ads.adservices.java.internal.a.w("tv:", ":", this.y, ":", iF);
            sbW.append(iA);
            String string = sbW.toString();
            boolean zD = rVar.d(tmdbEpisode.a());
            Object objQ = rVar.Q();
            androidx.compose.runtime.f fVar = androidx.compose.runtime.m.a;
            if (zD || objQ == fVar) {
                objQ = new y();
                rVar.l0(objQ);
            }
            y yVar = (y) objQ;
            Map map = this.z;
            boolean zH = rVar.h(map) | rVar.f(tmdbEpisode) | rVar.f(yVar);
            Object objQ2 = rVar.Q();
            if (zH || objQ2 == fVar) {
                objQ2 = new com.app.mlounge.ui.screens.anime.g(map, tmdbEpisode, yVar, 4);
                rVar.l0(objQ2);
            }
            j0.e((kotlin.jvm.functions.a) objQ2, rVar);
            androidx.compose.ui.r rVarK = androidx.compose.ui.focus.d.k(androidx.compose.ui.o.b, yVar);
            String strG = tmdbEpisode.g();
            x1 x1Var = this.A;
            x1Var.b.getClass();
            String strB = com.app.mlounge.data.repository.j0.b(strG, "w300");
            Float f = (Float) ((Map) this.B.getValue()).get(string);
            float fFloatValue = f != null ? f.floatValue() : 0.0f;
            boolean zContains = ((Set) this.C.getValue()).contains(string);
            boolean zH2 = rVar.h(x1Var) | rVar.f(tmdbEpisode);
            Object objQ3 = rVar.Q();
            if (zH2 || objQ3 == fVar) {
                objQ3 = new com.app.mlounge.ui.screens.downloads.d(x1Var, tmdbEpisode, this.D, this.E);
                rVar.l0(objQ3);
            }
            a.b(rVarK, tmdbEpisode, strB, fFloatValue, zContains, (kotlin.jvm.functions.a) objQ3, rVar, 0);
            rVar.p(false);
        } else {
            rVar.W();
        }
        return kotlin.y.a;
    }
}
