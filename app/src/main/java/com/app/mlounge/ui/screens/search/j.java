package com.app.mlounge.ui.screens.search;

import androidx.compose.runtime.m;
import com.app.mlounge.R;
import com.app.mlounge.data.remote.model.TmdbMovie;
import com.app.mlounge.data.remote.model.TmdbTvShow;
import com.app.mlounge.data.repository.j0;
import com.app.mlounge.ui.components.b0;
import com.app.mlounge.ui.viewmodel.y0;
import java.io.IOException;
import java.util.List;
import kotlin.jvm.functions.l;
import kotlin.jvm.functions.r;
import kotlin.y;
import org.mozilla.javascript.Token;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class j implements r {
    public final /* synthetic */ l A;
    public final /* synthetic */ int e;
    public final /* synthetic */ List y;
    public final /* synthetic */ y0 z;

    public /* synthetic */ j(List list, y0 y0Var, l lVar, int i) {
        this.e = i;
        this.y = list;
        this.z = y0Var;
        this.A = lVar;
    }

    @Override // kotlin.jvm.functions.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) throws XmlPullParserException, IOException {
        int i;
        int i2;
        switch (this.e) {
            case 0:
                androidx.compose.foundation.lazy.grid.j jVar = (androidx.compose.foundation.lazy.grid.j) obj;
                int iIntValue = ((Number) obj2).intValue();
                androidx.compose.runtime.r rVar = (androidx.compose.runtime.r) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                if ((iIntValue2 & 6) == 0) {
                    i = (rVar.f(jVar) ? 4 : 2) | iIntValue2;
                } else {
                    i = iIntValue2;
                }
                if ((iIntValue2 & 48) == 0) {
                    i |= rVar.d(iIntValue) ? 32 : 16;
                }
                if (rVar.T(i & 1, (i & Token.EXPR_VOID) != 146)) {
                    TmdbMovie tmdbMovie = (TmdbMovie) this.y.get(iIntValue);
                    rVar.b0(-1724350027);
                    String strE = tmdbMovie.e();
                    if (strE == null && (strE = tmdbMovie.b()) == null) {
                        strE = "Unknown";
                    }
                    String strC = j0.c(this.z.b, tmdbMovie.c());
                    if (strC == null) {
                        strC = "";
                    }
                    Double dF = tmdbMovie.f();
                    androidx.compose.ui.graphics.painter.b bVarQ = androidx.room.r.q(R.drawable.ic_movie_placeholder, rVar);
                    l lVar = this.A;
                    boolean zF = rVar.f(lVar) | rVar.h(tmdbMovie);
                    Object objQ = rVar.Q();
                    if (zF || objQ == m.a) {
                        objQ = new com.app.mlounge.ui.screens.movies.j(lVar, tmdbMovie, 1);
                        rVar.l0(objQ);
                    }
                    b0.h(strE, strC, (kotlin.jvm.functions.a) objQ, null, dF, "MOVIE", null, null, bVarQ, 0.0f, false, false, 0.0f, null, rVar, 134414336, 0, 16072);
                    rVar.p(false);
                } else {
                    rVar.W();
                }
                break;
            default:
                androidx.compose.foundation.lazy.grid.j jVar2 = (androidx.compose.foundation.lazy.grid.j) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                androidx.compose.runtime.r rVar2 = (androidx.compose.runtime.r) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                if ((iIntValue4 & 6) == 0) {
                    i2 = (rVar2.f(jVar2) ? 4 : 2) | iIntValue4;
                } else {
                    i2 = iIntValue4;
                }
                if ((iIntValue4 & 48) == 0) {
                    i2 |= rVar2.d(iIntValue3) ? 32 : 16;
                }
                if (rVar2.T(i2 & 1, (i2 & Token.EXPR_VOID) != 146)) {
                    TmdbTvShow tmdbTvShow = (TmdbTvShow) this.y.get(iIntValue3);
                    rVar2.b0(719989339);
                    String strC2 = tmdbTvShow.c();
                    if (strC2 == null && (strC2 = tmdbTvShow.e()) == null) {
                        strC2 = "Unknown";
                    }
                    String strC3 = j0.c(this.z.b, tmdbTvShow.f());
                    if (strC3 == null) {
                        strC3 = "";
                    }
                    Double dG = tmdbTvShow.g();
                    androidx.compose.ui.graphics.painter.b bVarQ2 = androidx.room.r.q(R.drawable.ic_tv_placeholder, rVar2);
                    l lVar2 = this.A;
                    boolean zF2 = rVar2.f(lVar2) | rVar2.h(tmdbTvShow);
                    Object objQ2 = rVar2.Q();
                    if (zF2 || objQ2 == m.a) {
                        objQ2 = new g(lVar2, tmdbTvShow, 0);
                        rVar2.l0(objQ2);
                    }
                    b0.h(strC2, strC3, (kotlin.jvm.functions.a) objQ2, null, dG, "TV", null, null, bVarQ2, 0.0f, false, false, 0.0f, null, rVar2, 134414336, 0, 16072);
                    rVar2.p(false);
                } else {
                    rVar2.W();
                }
                break;
        }
        return y.a;
    }
}
