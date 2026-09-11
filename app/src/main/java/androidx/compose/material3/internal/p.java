package androidx.compose.material3.internal;

import androidx.compose.foundation.layout.w0;
import androidx.compose.material3.t2;
import androidx.compose.runtime.y0;
import androidx.compose.ui.layout.c1;
import androidx.compose.ui.layout.p0;
import androidx.compose.ui.layout.s0;
import com.app.mlounge.ui.screens.player.i0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p implements kotlin.jvm.functions.q {
    public final /* synthetic */ int e;
    public final /* synthetic */ kotlin.jvm.functions.a y;

    public /* synthetic */ p(int i, kotlin.jvm.functions.a aVar) {
        this.e = i;
        this.y = aVar;
    }

    @Override // kotlin.jvm.functions.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.e) {
            case 0:
                s0 s0Var = (s0) obj;
                p0 p0Var = (p0) obj2;
                androidx.compose.ui.unit.a aVar = (androidx.compose.ui.unit.a) obj3;
                float f = ((androidx.compose.ui.unit.f) this.y.invoke()).e;
                c1 c1VarF = p0Var.F(androidx.compose.ui.unit.a.a(aVar.a, 0, 0, androidx.compose.ui.unit.b.f(!androidx.compose.ui.unit.f.d(f, Float.NaN) ? s0Var.g0(f) : 0, aVar.a), 0, 11));
                return s0Var.q(c1VarF.e, c1VarF.y, kotlin.collections.v.e, new androidx.compose.foundation.layout.j(c1VarF, 8));
            case 1:
                androidx.compose.runtime.r rVar = (androidx.compose.runtime.r) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((androidx.compose.foundation.lazy.d) obj).getClass();
                if (rVar.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    Object objQ = rVar.Q();
                    if (objQ == androidx.compose.runtime.m.a) {
                        objQ = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar);
                    }
                    androidx.compose.foundation.interaction.k kVar = (androidx.compose.foundation.interaction.k) objQ;
                    y0 y0VarG = android.support.v4.media.session.b.g(kVar, rVar, 6);
                    float f2 = 8;
                    androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
                    androidx.compose.ui.r rVarO = androidx.compose.foundation.layout.b.o(oVar, f2);
                    androidx.compose.foundation.shape.d dVar = androidx.compose.foundation.shape.e.a;
                    t2.e(this.y, androidx.compose.foundation.s.g(androidx.compose.ui.draw.h.a(rVarO, dVar), 2, ((Boolean) y0VarG.getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : androidx.compose.ui.graphics.t.h, dVar), false, null, kVar, null, com.app.mlounge.ui.screens.anime.o.a, rVar, 1597440, 44);
                    androidx.compose.foundation.layout.b.d(rVar, w0.f(oVar, f2));
                } else {
                    rVar.W();
                }
                return kotlin.y.a;
            case 2:
                androidx.compose.runtime.r rVar2 = (androidx.compose.runtime.r) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((androidx.compose.foundation.lazy.d) obj).getClass();
                if (rVar2.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    i0.e("Settings", this.y, rVar2, 6);
                    t2.d(androidx.compose.foundation.layout.b.q(androidx.compose.ui.o.b, 0.0f, 8, 1), 0.0f, androidx.compose.ui.graphics.t.b(0.1f, androidx.compose.ui.graphics.t.d), rVar2, 390, 2);
                } else {
                    rVar2.W();
                }
                return kotlin.y.a;
            default:
                androidx.compose.runtime.r rVar3 = (androidx.compose.runtime.r) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((androidx.compose.foundation.lazy.d) obj).getClass();
                if (rVar3.T(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    Object objQ2 = rVar3.Q();
                    if (objQ2 == androidx.compose.runtime.m.a) {
                        objQ2 = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar3);
                    }
                    androidx.compose.foundation.interaction.k kVar2 = (androidx.compose.foundation.interaction.k) objQ2;
                    y0 y0VarG2 = android.support.v4.media.session.b.g(kVar2, rVar3, 6);
                    float f3 = 8;
                    androidx.compose.ui.o oVar2 = androidx.compose.ui.o.b;
                    androidx.compose.ui.r rVarO2 = androidx.compose.foundation.layout.b.o(oVar2, f3);
                    androidx.compose.foundation.shape.d dVar2 = androidx.compose.foundation.shape.e.a;
                    t2.e(this.y, androidx.compose.foundation.s.g(androidx.compose.ui.draw.h.a(rVarO2, dVar2), 2, ((Boolean) y0VarG2.getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : androidx.compose.ui.graphics.t.h, dVar2), false, null, kVar2, null, com.app.mlounge.ui.screens.tvshows.a.a, rVar3, 1597440, 44);
                    androidx.compose.foundation.layout.b.d(rVar3, w0.f(oVar2, f3));
                } else {
                    rVar3.W();
                }
                return kotlin.y.a;
        }
    }
}
