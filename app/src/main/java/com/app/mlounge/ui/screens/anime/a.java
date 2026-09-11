package com.app.mlounge.ui.screens.anime;

import androidx.compose.foundation.layout.w0;
import androidx.compose.material3.p3;
import androidx.compose.material3.t3;
import androidx.compose.material3.u3;
import androidx.compose.runtime.r;
import androidx.compose.runtime.y0;
import androidx.datastore.preferences.protobuf.h1;
import com.app.mlounge.data.remote.model.TmdbSeason;
import com.app.mlounge.ui.screens.settings.e0;
import java.util.List;
import kotlin.collections.u;
import kotlin.jvm.functions.q;
import kotlin.y;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class a implements q {
    public final /* synthetic */ int e;
    public final /* synthetic */ y0 y;

    public /* synthetic */ a(y0 y0Var, int i) {
        this.e = i;
        this.y = y0Var;
    }

    @Override // kotlin.jvm.functions.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        List listB;
        switch (this.e) {
            case 0:
                r rVar = (r) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((androidx.compose.foundation.lazy.d) obj).getClass();
                if (rVar.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    y0 y0Var = this.y;
                    if (((List) y0Var.getValue()).isEmpty()) {
                        rVar.b0(1719262463);
                        rVar.p(false);
                    } else {
                        rVar.b0(1718956865);
                        float f = 16;
                        androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
                        androidx.compose.foundation.layout.b.d(rVar, w0.f(oVar, f));
                        p3.b(androidx.privacysandbox.ads.adservices.java.internal.a.p("Episodes (", ((List) y0Var.getValue()).size(), ")"), androidx.compose.foundation.layout.b.q(oVar, f, 0.0f, 2), com.app.mlounge.ui.theme.b.l, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar.j(u3.a)).h, rVar, 432, 0, 131064);
                        androidx.compose.foundation.layout.b.d(rVar, w0.f(oVar, 8));
                        rVar.p(false);
                    }
                } else {
                    rVar.W();
                }
                break;
            case 1:
                r rVar2 = (r) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((androidx.compose.foundation.lazy.d) obj).getClass();
                if (rVar2.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    androidx.compose.ui.graphics.vector.f fVarM = h1.m();
                    Object objQ = rVar2.Q();
                    if (objQ == androidx.compose.runtime.m.a) {
                        objQ = new com.app.mlounge.ui.screens.settings.q(this.y, 3);
                        rVar2.l0(objQ);
                    }
                    e0.j("..", fVarM, (kotlin.jvm.functions.a) objQ, rVar2, 390);
                } else {
                    rVar2.W();
                }
                break;
            default:
                r rVar3 = (r) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((androidx.compose.foundation.lazy.d) obj).getClass();
                if (rVar3.T(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    TmdbSeason tmdbSeason = (TmdbSeason) this.y.getValue();
                    if (tmdbSeason == null || (listB = tmdbSeason.b()) == null) {
                        listB = u.e;
                    }
                    if (listB.isEmpty()) {
                        rVar3.b0(-253832693);
                        rVar3.p(false);
                    } else {
                        rVar3.b0(-254120032);
                        float f2 = 16;
                        androidx.compose.ui.o oVar2 = androidx.compose.ui.o.b;
                        androidx.compose.foundation.layout.b.d(rVar3, w0.f(oVar2, f2));
                        p3.b("Episodes", androidx.compose.foundation.layout.b.q(oVar2, f2, 0.0f, 2), com.app.mlounge.ui.theme.b.l, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar3.j(u3.a)).h, rVar3, 438, 0, 131064);
                        androidx.compose.foundation.layout.b.d(rVar3, w0.f(oVar2, 8));
                        rVar3.p(false);
                    }
                } else {
                    rVar3.W();
                }
                break;
        }
        return y.a;
    }
}
