package com.app.mlounge.ui.screens.tvshows;

import androidx.compose.foundation.s;
import androidx.compose.material3.f3;
import androidx.compose.runtime.t2;
import androidx.compose.runtime.y0;
import androidx.compose.ui.focus.y;
import androidx.compose.ui.graphics.t;
import com.app.mlounge.data.remote.model.TmdbSeason;
import com.app.mlounge.ui.viewmodel.x1;
import java.util.List;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class q implements kotlin.jvm.functions.r {
    public final /* synthetic */ y A;
    public final /* synthetic */ t2 B;
    public final /* synthetic */ Object e;
    public final /* synthetic */ x1 y;
    public final /* synthetic */ int z;

    public q(List list, x1 x1Var, int i, y yVar, t2 t2Var) {
        this.e = list;
        this.y = x1Var;
        this.z = i;
        this.A = yVar;
        this.B = t2Var;
    }

    /* JADX WARN: Type inference failed for: r1v8, types: [java.lang.Object, java.util.List] */
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
            TmdbSeason tmdbSeason = (TmdbSeason) this.e.get(iIntValue);
            rVar.b0(849603997);
            TmdbSeason tmdbSeason2 = (TmdbSeason) this.B.getValue();
            boolean z = tmdbSeason2 != null && tmdbSeason2.e() == tmdbSeason.e();
            Object objQ = rVar.Q();
            androidx.compose.runtime.f fVar = androidx.compose.runtime.m.a;
            if (objQ == fVar) {
                objQ = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar);
            }
            androidx.compose.foundation.interaction.k kVar = (androidx.compose.foundation.interaction.k) objQ;
            y0 y0VarG = android.support.v4.media.session.b.g(kVar, rVar, 6);
            float f = 8;
            androidx.compose.foundation.shape.d dVarA = androidx.compose.foundation.shape.e.a(f);
            androidx.compose.ui.r rVarK = androidx.compose.ui.o.b;
            androidx.compose.ui.r rVarG = s.g(androidx.compose.ui.draw.h.a(rVarK, dVarA), 2, ((Boolean) y0VarG.getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : t.h, androidx.compose.foundation.shape.e.a(f));
            x1 x1Var = this.y;
            boolean zH = rVar.h(x1Var);
            int i2 = this.z;
            boolean zD = zH | rVar.d(i2) | rVar.h(tmdbSeason);
            Object objQ2 = rVar.Q();
            if (zD || objQ2 == fVar) {
                objQ2 = new m(x1Var, i2, tmdbSeason);
                rVar.l0(objQ2);
            }
            androidx.compose.ui.r rVarI = s.i(rVarG, kVar, null, false, null, (kotlin.jvm.functions.a) objQ2, 28);
            if (iIntValue == 0) {
                rVarK = androidx.compose.ui.focus.d.k(rVarK, this.A);
            }
            f3.a(s.m(rVarI.d(rVarK), kVar, 1), androidx.compose.foundation.shape.e.a(f), z ? t.b(0.3f, com.app.mlounge.ui.theme.b.f) : com.app.mlounge.ui.theme.b.c, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(-1933927475, new n(tmdbSeason, z), rVar), rVar, 12582912, 120);
            rVar.p(false);
        } else {
            rVar.W();
        }
        return kotlin.y.a;
    }
}
