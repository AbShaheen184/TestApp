package com.app.mlounge.ui.screens.player;

import androidx.compose.material3.f3;
import androidx.compose.material3.p3;
import androidx.compose.material3.t2;
import androidx.compose.material3.t3;
import androidx.compose.material3.u3;
import androidx.compose.runtime.u2;
import java.util.List;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v implements kotlin.jvm.functions.p {
    public final /* synthetic */ kotlin.jvm.functions.a A;
    public final /* synthetic */ int e;
    public final /* synthetic */ List y;
    public final /* synthetic */ kotlin.jvm.functions.l z;

    public /* synthetic */ v(kotlin.jvm.functions.a aVar, List list, kotlin.jvm.functions.l lVar) {
        this.e = 0;
        this.A = aVar;
        this.y = list;
        this.z = lVar;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                androidx.compose.runtime.r rVar = (androidx.compose.runtime.r) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (rVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    t2.c(androidx.compose.foundation.layout.w0.c(androidx.compose.foundation.layout.w0.d(androidx.compose.ui.o.b, 0.85f), 0.5f), androidx.compose.foundation.shape.e.a(16), t2.i(com.app.mlounge.ui.theme.b.b, rVar, 6), null, androidx.compose.runtime.internal.k.c(-513088039, new com.app.mlounge.ui.components.d0(2, this.A, this.y, this.z), rVar), rVar, 196614, 24);
                } else {
                    rVar.W();
                }
                return kotlin.y.a;
            case 1:
                ((Integer) obj2).getClass();
                i0.b(this.y, this.z, this.A, (androidx.compose.runtime.r) obj, androidx.compose.runtime.s.A(1));
                break;
            case 2:
                androidx.compose.runtime.r rVar2 = (androidx.compose.runtime.r) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (rVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    f3.a(null, androidx.compose.foundation.shape.e.a(16), com.app.mlounge.ui.theme.b.d, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(1531277996, new v(this.y, this.A, this.z, 4), rVar2), rVar2, 12583296, Token.DOT);
                } else {
                    rVar2.W();
                }
                return kotlin.y.a;
            case 3:
                ((Integer) obj2).getClass();
                com.app.mlounge.ui.screens.sources.a.a(this.y, this.z, this.A, (androidx.compose.runtime.r) obj, androidx.compose.runtime.s.A(1));
                break;
            default:
                androidx.compose.runtime.r rVar3 = (androidx.compose.runtime.r) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (rVar3.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
                    androidx.compose.ui.r rVarO = androidx.compose.foundation.layout.b.o(oVar, 24);
                    androidx.compose.foundation.layout.v vVarA = androidx.compose.foundation.layout.t.a(androidx.compose.foundation.layout.h.c, androidx.compose.ui.c.K, rVar3, 48);
                    int iHashCode = Long.hashCode(rVar3.T);
                    androidx.compose.runtime.internal.j jVarL = rVar3.l();
                    androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(rVar3, rVarO);
                    androidx.compose.ui.node.g.b.getClass();
                    androidx.compose.ui.node.y yVar = androidx.compose.ui.node.f.b;
                    rVar3.e0();
                    if (rVar3.S) {
                        rVar3.k(yVar);
                    } else {
                        rVar3.o0();
                    }
                    androidx.compose.runtime.s.x(rVar3, vVarA, androidx.compose.ui.node.f.e);
                    androidx.compose.runtime.s.x(rVar3, jVarL, androidx.compose.ui.node.f.d);
                    androidx.compose.runtime.s.p(rVar3, Integer.valueOf(iHashCode), androidx.compose.ui.node.f.f);
                    androidx.compose.runtime.s.t(rVar3, androidx.compose.ui.node.f.g);
                    androidx.compose.runtime.s.x(rVar3, rVarC, androidx.compose.ui.node.f.c);
                    u2 u2Var = u3.a;
                    p3.b("Select Debrid Service", null, com.app.mlounge.ui.theme.b.l, 0L, androidx.compose.ui.text.font.l.C, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar3.j(u2Var)).h, rVar3, 1573254, 0, 131002);
                    androidx.compose.foundation.layout.b.d(rVar3, androidx.compose.foundation.layout.w0.f(oVar, 8));
                    p3.b("Choose which service to use for playback", null, com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar3.j(u2Var)).l, rVar3, 390, 0, 131066);
                    androidx.compose.runtime.r rVar4 = rVar3;
                    androidx.compose.foundation.layout.b.d(rVar4, androidx.compose.foundation.layout.w0.f(oVar, 20));
                    rVar4.b0(888282193);
                    for (com.app.mlounge.ui.viewmodel.l lVar : this.y) {
                        Object objQ = rVar4.Q();
                        androidx.compose.runtime.f fVar = androidx.compose.runtime.m.a;
                        if (objQ == fVar) {
                            objQ = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar4);
                        }
                        androidx.compose.foundation.interaction.k kVar = (androidx.compose.foundation.interaction.k) objQ;
                        float f = 12;
                        androidx.compose.ui.r rVarG = androidx.compose.foundation.s.g(androidx.compose.ui.draw.h.a(androidx.compose.foundation.layout.b.q(androidx.compose.foundation.layout.w0.d(oVar, 1.0f), 0.0f, 4, 1), androidx.compose.foundation.shape.e.a(f)), 2, ((Boolean) android.support.v4.media.session.b.g(kVar, rVar4, 6).getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : androidx.compose.ui.graphics.t.h, androidx.compose.foundation.shape.e.a(f));
                        kotlin.jvm.functions.l lVar2 = this.z;
                        boolean zF = rVar4.f(lVar2) | rVar4.d(lVar.ordinal());
                        Object objQ2 = rVar4.Q();
                        if (zF || objQ2 == fVar) {
                            objQ2 = new com.app.mlounge.ui.screens.movies.g(11, lVar2, lVar);
                            rVar4.l0(objQ2);
                        }
                        androidx.compose.runtime.r rVar5 = rVar4;
                        f3.a(androidx.compose.foundation.s.m(androidx.compose.foundation.s.i(rVarG, kVar, null, false, null, (kotlin.jvm.functions.a) objQ2, 28), kVar, 1), androidx.compose.foundation.shape.e.a(f), com.app.mlounge.ui.theme.b.b, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(-910138737, new androidx.compose.animation.core.g0(lVar, 23), rVar4), rVar5, 12583296, 120);
                        rVar4 = rVar5;
                    }
                    rVar4.p(false);
                    androidx.compose.foundation.layout.b.d(rVar4, androidx.compose.foundation.layout.w0.f(oVar, 12));
                    t2.h(this.A, null, false, null, null, null, null, com.app.mlounge.ui.screens.sources.a.d, rVar4, 805306368, 510);
                    rVar4.p(true);
                } else {
                    rVar3.W();
                }
                return kotlin.y.a;
        }
        return kotlin.y.a;
    }

    public /* synthetic */ v(List list, kotlin.jvm.functions.l lVar, kotlin.jvm.functions.a aVar, int i, int i2) {
        this.e = i2;
        this.y = list;
        this.z = lVar;
        this.A = aVar;
    }

    public /* synthetic */ v(List list, kotlin.jvm.functions.a aVar, kotlin.jvm.functions.l lVar, int i) {
        this.e = i;
        this.y = list;
        this.A = aVar;
        this.z = lVar;
    }
}
