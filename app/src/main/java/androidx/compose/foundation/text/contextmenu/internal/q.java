package androidx.compose.foundation.text.contextmenu.internal;

import android.content.Context;
import androidx.compose.animation.core.l0;
import androidx.compose.foundation.gestures.h2;
import androidx.compose.foundation.layout.w0;
import androidx.compose.material3.f3;
import androidx.compose.material3.o2;
import androidx.compose.material3.p3;
import androidx.compose.material3.t2;
import androidx.compose.material3.t3;
import androidx.compose.material3.u3;
import androidx.compose.runtime.u2;
import androidx.compose.runtime.y0;
import androidx.compose.ui.layout.a0;
import androidx.compose.ui.layout.q0;
import androidx.compose.ui.node.y;
import androidx.compose.ui.platform.h1;
import androidx.compose.ui.text.m0;
import com.app.mlounge.data.remote.model.IptvChannel;
import com.app.mlounge.data.remote.model.MatchSource;
import com.app.mlounge.data.remote.model.SportsMatch;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class q implements kotlin.jvm.functions.p {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ int e;
    public final /* synthetic */ kotlin.d y;
    public final /* synthetic */ Object z;

    public /* synthetic */ q(IptvChannel iptvChannel, com.app.mlounge.data.iptv.n nVar, com.app.mlounge.data.iptv.n nVar2, kotlin.jvm.functions.a aVar, kotlin.jvm.functions.a aVar2, int i) {
        this.e = 1;
        this.z = iptvChannel;
        this.A = nVar;
        this.B = nVar2;
        this.y = aVar;
        this.C = aVar2;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.e) {
            case 0:
                androidx.compose.ui.r rVar = (androidx.compose.ui.r) this.z;
                y0 y0Var = (y0) this.A;
                androidx.compose.runtime.internal.f fVar = (androidx.compose.runtime.internal.f) this.B;
                androidx.compose.foundation.text.contextmenu.provider.c cVar = (androidx.compose.foundation.text.contextmenu.provider.c) this.C;
                kotlin.jvm.functions.a aVar = (kotlin.jvm.functions.a) this.y;
                androidx.compose.runtime.r rVar2 = (androidx.compose.runtime.r) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (rVar2.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    Object objQ = rVar2.Q();
                    if (objQ == androidx.compose.runtime.m.a) {
                        objQ = new h2(y0Var, 3);
                        rVar2.l0(objQ);
                    }
                    androidx.compose.ui.r rVarL = a0.l(rVar, (kotlin.jvm.functions.l) objQ);
                    q0 q0VarD = androidx.compose.foundation.layout.p.d(androidx.compose.ui.c.e, true);
                    int iHashCode = Long.hashCode(rVar2.T);
                    androidx.compose.runtime.internal.j jVarL = rVar2.l();
                    androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(rVar2, rVarL);
                    androidx.compose.ui.node.g.b.getClass();
                    y yVar = androidx.compose.ui.node.f.b;
                    rVar2.e0();
                    if (rVar2.S) {
                        rVar2.k(yVar);
                    } else {
                        rVar2.o0();
                    }
                    androidx.compose.runtime.s.x(rVar2, q0VarD, androidx.compose.ui.node.f.e);
                    androidx.compose.runtime.s.x(rVar2, jVarL, androidx.compose.ui.node.f.d);
                    androidx.compose.runtime.s.p(rVar2, Integer.valueOf(iHashCode), androidx.compose.ui.node.f.f);
                    androidx.compose.runtime.s.t(rVar2, androidx.compose.ui.node.f.g);
                    androidx.compose.runtime.s.x(rVar2, rVarC, androidx.compose.ui.node.f.c);
                    fVar.invoke(rVar2, 0);
                    cVar.b(aVar, rVar2, 6);
                    rVar2.p(true);
                } else {
                    rVar2.W();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                com.app.mlounge.ui.screens.livetv.a.a((IptvChannel) this.z, (com.app.mlounge.data.iptv.n) this.A, (com.app.mlounge.data.iptv.n) this.B, (kotlin.jvm.functions.a) this.y, (kotlin.jvm.functions.a) this.C, (androidx.compose.runtime.r) obj, androidx.compose.runtime.s.A(1));
                break;
            case 2:
                List<MatchSource> list = (List) this.z;
                com.app.mlounge.ui.viewmodel.a0 a0Var = (com.app.mlounge.ui.viewmodel.a0) this.B;
                SportsMatch sportsMatch = (SportsMatch) this.C;
                kotlin.jvm.functions.r rVar3 = (kotlin.jvm.functions.r) this.y;
                y0 y0Var2 = (y0) this.A;
                androidx.compose.runtime.r rVar4 = (androidx.compose.runtime.r) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                boolean z = false;
                boolean z2 = true;
                if (rVar4.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    androidx.compose.foundation.layout.v vVarA = androidx.compose.foundation.layout.t.a(androidx.compose.foundation.layout.h.g(6), androidx.compose.ui.c.J, rVar4, 6);
                    int iHashCode2 = Long.hashCode(rVar4.T);
                    androidx.compose.runtime.internal.j jVarL2 = rVar4.l();
                    androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
                    androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(rVar4, oVar);
                    androidx.compose.ui.node.g.b.getClass();
                    y yVar2 = androidx.compose.ui.node.f.b;
                    rVar4.e0();
                    if (rVar4.S) {
                        rVar4.k(yVar2);
                    } else {
                        rVar4.o0();
                    }
                    androidx.compose.runtime.s.x(rVar4, vVarA, androidx.compose.ui.node.f.e);
                    androidx.compose.runtime.s.x(rVar4, jVarL2, androidx.compose.ui.node.f.d);
                    androidx.compose.runtime.s.p(rVar4, Integer.valueOf(iHashCode2), androidx.compose.ui.node.f.f);
                    androidx.compose.runtime.s.t(rVar4, androidx.compose.ui.node.f.g);
                    androidx.compose.runtime.s.x(rVar4, rVarC2, androidx.compose.ui.node.f.c);
                    rVar4.b0(1427408414);
                    for (MatchSource matchSource : list) {
                        String strB = matchSource.b();
                        if (strB == null && (strB = matchSource.a()) == null) {
                            strB = "Unknown";
                        }
                        String str = strB;
                        float f = 8;
                        androidx.compose.ui.r rVarA = androidx.compose.ui.draw.h.a(w0.d(oVar, 1.0f), androidx.compose.foundation.shape.e.a(f));
                        boolean zF = rVar4.f(matchSource) | rVar4.h(a0Var) | rVar4.h(sportsMatch) | rVar4.f(rVar3);
                        Object objQ2 = rVar4.Q();
                        if (zF || objQ2 == androidx.compose.runtime.m.a) {
                            com.app.mlounge.ui.screens.anime.b bVar = new com.app.mlounge.ui.screens.anime.b(matchSource, a0Var, sportsMatch, y0Var2, rVar3);
                            rVar4.l0(bVar);
                            objQ2 = bVar;
                        }
                        androidx.compose.runtime.r rVar5 = rVar4;
                        f3.a(androidx.compose.foundation.s.j(rVarA, z, null, (kotlin.jvm.functions.a) objQ2, 15), androidx.compose.foundation.shape.e.a(f), com.app.mlounge.ui.theme.b.d, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(694241596, new com.app.mlounge.ui.components.s(str, 4), rVar4), rVar5, 12582912, 120);
                        z = false;
                        z2 = z2;
                        oVar = oVar;
                        rVar4 = rVar5;
                    }
                    androidx.compose.runtime.r rVar6 = rVar4;
                    rVar6.p(z);
                    rVar6.p(z2);
                } else {
                    rVar4.W();
                }
                break;
            default:
                String str2 = (String) this.z;
                String str3 = (String) this.A;
                h1 h1Var = (h1) this.B;
                Context context = (Context) this.C;
                kotlin.jvm.functions.a aVar2 = (kotlin.jvm.functions.a) this.y;
                androidx.compose.runtime.r rVar7 = (androidx.compose.runtime.r) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (rVar7.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    float f2 = 16;
                    androidx.compose.ui.o oVar2 = androidx.compose.ui.o.b;
                    androidx.compose.ui.r rVarO = androidx.compose.foundation.layout.b.o(oVar2, f2);
                    androidx.compose.foundation.layout.v vVarA2 = androidx.compose.foundation.layout.t.a(androidx.compose.foundation.layout.h.c, androidx.compose.ui.c.K, rVar7, 48);
                    int iHashCode3 = Long.hashCode(rVar7.T);
                    androidx.compose.runtime.internal.j jVarL3 = rVar7.l();
                    androidx.compose.ui.r rVarC3 = androidx.compose.ui.a.c(rVar7, rVarO);
                    androidx.compose.ui.node.g.b.getClass();
                    y yVar3 = androidx.compose.ui.node.f.b;
                    rVar7.e0();
                    if (rVar7.S) {
                        rVar7.k(yVar3);
                    } else {
                        rVar7.o0();
                    }
                    androidx.compose.runtime.s.x(rVar7, vVarA2, androidx.compose.ui.node.f.e);
                    androidx.compose.runtime.s.x(rVar7, jVarL3, androidx.compose.ui.node.f.d);
                    androidx.compose.runtime.s.p(rVar7, Integer.valueOf(iHashCode3), androidx.compose.ui.node.f.f);
                    androidx.compose.runtime.s.t(rVar7, androidx.compose.ui.node.f.g);
                    androidx.compose.runtime.s.x(rVar7, rVarC3, androidx.compose.ui.node.f.c);
                    float f3 = 2;
                    o2.a(w0.l(oVar2, 20), com.app.mlounge.ui.theme.b.h, f3, 0L, 0, 0.0f, rVar7, 438, 56);
                    androidx.compose.foundation.layout.b.d(rVar7, w0.f(oVar2, 12));
                    u2 u2Var = u3.a;
                    m0 m0Var = ((t3) rVar7.j(u2Var)).k;
                    long j = com.app.mlounge.ui.theme.b.m;
                    p3.b("Waiting for authorization...", null, j, 0L, null, 0L, new androidx.compose.ui.text.style.k(3), 0L, 0, false, 0, 0, m0Var, rVar7, 390, 0, 130042);
                    androidx.compose.foundation.layout.b.d(rVar7, w0.f(oVar2, f2));
                    p3.b(str2, null, com.app.mlounge.ui.theme.b.l, 0L, androidx.compose.ui.text.font.l.C, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar7.j(u2Var)).d, rVar7, 1573248, 0, 131002);
                    androidx.compose.foundation.layout.b.d(rVar7, w0.f(oVar2, f2));
                    p3.b("Please visit the authorization page " + str3 + " and enter this code", null, j, 0L, null, 0L, new androidx.compose.ui.text.style.k(3), 0L, 0, false, 0, 0, ((t3) rVar7.j(u2Var)).l, rVar7, 384, 0, 130042);
                    androidx.compose.foundation.layout.b.d(rVar7, w0.f(oVar2, f2));
                    Object objQ3 = rVar7.Q();
                    androidx.compose.runtime.f fVar2 = androidx.compose.runtime.m.a;
                    if (objQ3 == fVar2) {
                        objQ3 = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar7);
                    }
                    androidx.compose.foundation.interaction.k kVar = (androidx.compose.foundation.interaction.k) objQ3;
                    float f4 = 4;
                    androidx.compose.ui.r rVarG = androidx.compose.foundation.s.g(oVar2, f3, ((Boolean) android.support.v4.media.session.b.g(kVar, rVar7, 6).getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : androidx.compose.ui.graphics.t.h, androidx.compose.foundation.shape.e.a(f4));
                    boolean zH = rVar7.h(h1Var) | rVar7.f(str2) | rVar7.f(str3) | rVar7.h(context);
                    Object objQ4 = rVar7.Q();
                    if (zH || objQ4 == fVar2) {
                        l0 l0Var = new l0(h1Var, str2, str3, context, 3);
                        rVar7.l0(l0Var);
                        objQ4 = l0Var;
                    }
                    t2.h((kotlin.jvm.functions.a) objQ4, rVarG, false, null, null, null, kVar, com.app.mlounge.ui.screens.services.a.d, rVar7, 905969664, 252);
                    androidx.compose.foundation.layout.b.d(rVar7, w0.f(oVar2, 8));
                    Object objQ5 = rVar7.Q();
                    if (objQ5 == fVar2) {
                        objQ5 = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar7);
                    }
                    androidx.compose.foundation.interaction.k kVar2 = (androidx.compose.foundation.interaction.k) objQ5;
                    t2.h(aVar2, androidx.compose.foundation.s.g(oVar2, f3, ((Boolean) android.support.v4.media.session.b.g(kVar2, rVar7, 6).getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : androidx.compose.ui.graphics.t.h, androidx.compose.foundation.shape.e.a(f4)), false, null, null, null, kVar2, com.app.mlounge.ui.screens.services.a.e, rVar7, 905969664, 252);
                    rVar7.p(true);
                } else {
                    rVar7.W();
                }
                break;
        }
        return kotlin.y.a;
    }

    public /* synthetic */ q(Object obj, Object obj2, Object obj3, Object obj4, kotlin.jvm.functions.a aVar, int i) {
        this.e = i;
        this.z = obj;
        this.A = obj2;
        this.B = obj3;
        this.C = obj4;
        this.y = aVar;
    }

    public /* synthetic */ q(List list, com.app.mlounge.ui.viewmodel.a0 a0Var, SportsMatch sportsMatch, kotlin.jvm.functions.r rVar, y0 y0Var) {
        this.e = 2;
        this.z = list;
        this.B = a0Var;
        this.C = sportsMatch;
        this.y = rVar;
        this.A = y0Var;
    }
}
