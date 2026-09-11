package com.app.mlounge.ui.screens.anime;

import androidx.compose.foundation.layout.w0;
import androidx.compose.foundation.s;
import androidx.compose.material3.f3;
import androidx.compose.runtime.j0;
import androidx.compose.runtime.t2;
import androidx.compose.ui.focus.y;
import androidx.compose.ui.graphics.t;
import com.app.mlounge.data.remote.model.HiAnimeDetailData;
import com.app.mlounge.data.remote.model.HiAnimeEpisode;
import com.app.mlounge.data.remote.model.HiAnimeInfo;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.r;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k implements r {
    public final /* synthetic */ HiAnimeDetailData A;
    public final /* synthetic */ r B;
    public final /* synthetic */ HiAnimeInfo C;
    public final /* synthetic */ t2 D;
    public final /* synthetic */ t2 E;
    public final /* synthetic */ List e;
    public final /* synthetic */ Map y;
    public final /* synthetic */ com.app.mlounge.ui.viewmodel.g z;

    public k(List list, Map map, com.app.mlounge.ui.viewmodel.g gVar, HiAnimeDetailData hiAnimeDetailData, r rVar, HiAnimeInfo hiAnimeInfo, t2 t2Var, t2 t2Var2) {
        this.e = list;
        this.y = map;
        this.z = gVar;
        this.A = hiAnimeDetailData;
        this.B = rVar;
        this.C = hiAnimeInfo;
        this.D = t2Var;
        this.E = t2Var2;
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
            HiAnimeEpisode hiAnimeEpisode = (HiAnimeEpisode) this.e.get(iIntValue);
            rVar.b0(-569877326);
            String strA = hiAnimeEpisode.a();
            if (strA == null) {
                strA = "";
            }
            String strConcat = "anime:".concat(strA);
            Float f = (Float) ((Map) this.D.getValue()).get(strConcat);
            float fFloatValue = f != null ? f.floatValue() : 0.0f;
            boolean zContains = ((Set) this.E.getValue()).contains(strConcat);
            boolean zF = rVar.f(hiAnimeEpisode.b());
            Object objQ = rVar.Q();
            androidx.compose.runtime.f fVar = androidx.compose.runtime.m.a;
            if (zF || objQ == fVar) {
                objQ = new y();
                rVar.l0(objQ);
            }
            y yVar = (y) objQ;
            boolean zF2 = rVar.f(hiAnimeEpisode);
            Map map = this.y;
            boolean zH = zF2 | rVar.h(map) | rVar.f(yVar);
            Object objQ2 = rVar.Q();
            if (zH || objQ2 == fVar) {
                objQ2 = new g(0, hiAnimeEpisode, map, yVar);
                rVar.l0(objQ2);
            }
            j0.e((kotlin.jvm.functions.a) objQ2, rVar);
            Object objQ3 = rVar.Q();
            if (objQ3 == fVar) {
                objQ3 = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar);
            }
            androidx.compose.foundation.interaction.k kVar = (androidx.compose.foundation.interaction.k) objQ3;
            float f2 = 2;
            float f3 = 8;
            androidx.compose.ui.r rVarG = s.g(androidx.compose.foundation.layout.b.p(w0.d(androidx.compose.ui.o.b, 1.0f), 16, f2), f2, ((Boolean) android.support.v4.media.session.b.g(kVar, rVar, 6).getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : t.h, androidx.compose.foundation.shape.e.a(f3));
            boolean zF3 = rVar.f(hiAnimeEpisode);
            com.app.mlounge.ui.viewmodel.g gVar = this.z;
            boolean zH2 = zF3 | rVar.h(gVar);
            HiAnimeDetailData hiAnimeDetailData = this.A;
            boolean zH3 = zH2 | rVar.h(hiAnimeDetailData) | rVar.f(this.B);
            HiAnimeInfo hiAnimeInfo = this.C;
            boolean zF4 = zH3 | rVar.f(hiAnimeInfo);
            Object objQ4 = rVar.Q();
            if (zF4 || objQ4 == fVar) {
                objQ4 = new h(hiAnimeEpisode, gVar, hiAnimeDetailData, this.B, hiAnimeInfo);
                rVar.l0(objQ4);
            }
            f3.a(s.m(androidx.compose.ui.focus.d.k(s.i(rVarG, kVar, null, false, null, (kotlin.jvm.functions.a) objQ4, 28), yVar), kVar, 1), androidx.compose.foundation.shape.e.a(f3), com.app.mlounge.ui.theme.b.d, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(1651769991, new i(fFloatValue, hiAnimeEpisode, zContains), rVar), rVar, 12583296, 120);
            rVar.p(false);
        } else {
            rVar.W();
        }
        return kotlin.y.a;
    }
}
