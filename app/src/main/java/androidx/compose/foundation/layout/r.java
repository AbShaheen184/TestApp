package androidx.compose.foundation.layout;

import androidx.compose.foundation.layout.a0;
import androidx.compose.foundation.layout.h0;
import androidx.compose.foundation.layout.p;
import androidx.compose.foundation.layout.r0;
import androidx.compose.foundation.layout.t0;
import androidx.compose.foundation.layout.v;
import androidx.compose.foundation.layout.w0;
import androidx.compose.foundation.lazy.grid.j;
import androidx.compose.material3.p3;
import androidx.compose.material3.t3;
import androidx.compose.material3.u3;
import androidx.compose.runtime.m;
import androidx.compose.runtime.r;
import androidx.compose.runtime.s;
import androidx.compose.runtime.t2;
import androidx.compose.runtime.y0;
import androidx.compose.ui.graphics.t;
import androidx.compose.ui.layout.q0;
import androidx.compose.ui.node.y;
import androidx.compose.ui.o;
import androidx.compose.ui.text.m0;
import androidx.datastore.preferences.protobuf.h1;
import coil3.compose.k;
import com.app.mlounge.data.remote.model.MusicArtistDetail;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r implements kotlin.jvm.functions.l {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ r(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i) {
        this.e = i;
        this.y = obj;
        this.z = obj2;
        this.A = obj3;
        this.B = obj4;
        this.C = obj5;
        this.D = obj6;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        switch (this.e) {
            case 0:
                androidx.compose.ui.layout.c1[] c1VarArr = (androidx.compose.ui.layout.c1[]) this.y;
                List list = (List) this.z;
                androidx.compose.ui.layout.s0 s0Var = (androidx.compose.ui.layout.s0) this.A;
                kotlin.jvm.internal.x xVar = (kotlin.jvm.internal.x) this.B;
                kotlin.jvm.internal.x xVar2 = (kotlin.jvm.internal.x) this.C;
                s sVar = (s) this.D;
                androidx.compose.ui.layout.b1 b1Var = (androidx.compose.ui.layout.b1) obj;
                int length = c1VarArr.length;
                int i = 0;
                int i2 = 0;
                while (i2 < length) {
                    androidx.compose.ui.layout.c1 c1Var = c1VarArr[i2];
                    c1Var.getClass();
                    p.b(b1Var, c1Var, (androidx.compose.ui.layout.p0) list.get(i), s0Var.getLayoutDirection(), xVar.e, xVar2.e, sVar.a);
                    i2++;
                    i++;
                }
                break;
            case 1:
                t2 t2Var = (t2) this.y;
                com.app.mlounge.ui.viewmodel.e0 e0Var = (com.app.mlounge.ui.viewmodel.e0) this.z;
                kotlin.jvm.functions.l lVar = (kotlin.jvm.functions.l) this.A;
                t2 t2Var2 = (t2) this.B;
                t2 t2Var3 = (t2) this.C;
                t2 t2Var4 = (t2) this.D;
                androidx.compose.foundation.lazy.grid.h hVar = (androidx.compose.foundation.lazy.grid.h) obj;
                hVar.getClass();
                hVar.q(((List) t2Var.getValue()).size(), new androidx.compose.material3.internal.u(t2Var, 2), androidx.compose.foundation.lazy.grid.q.e, new androidx.compose.runtime.internal.f(-1706994611, true, new com.app.mlounge.ui.w(e0Var, lVar, t2Var, t2Var2, t2Var3, 1)));
                if (((Boolean) t2Var4.getValue()).booleanValue()) {
                    androidx.compose.foundation.lazy.grid.h.p(7, hVar, com.app.mlounge.ui.screens.movies.a.b, null);
                }
                break;
            default:
                final MusicArtistDetail musicArtistDetail = (MusicArtistDetail) this.y;
                final kotlin.jvm.functions.a aVar = (kotlin.jvm.functions.a) this.z;
                final com.app.mlounge.ui.viewmodel.h0 h0Var = (com.app.mlounge.ui.viewmodel.h0) this.A;
                final String str = (String) this.B;
                final t2 t2Var5 = (t2) this.C;
                kotlin.jvm.functions.l lVar2 = (kotlin.jvm.functions.l) this.D;
                androidx.compose.foundation.lazy.grid.h hVar2 = (androidx.compose.foundation.lazy.grid.h) obj;
                hVar2.getClass();
                androidx.compose.foundation.lazy.grid.h.p(5, hVar2, new androidx.compose.runtime.internal.f(-812363632, true, new kotlin.jvm.functions.q() { // from class: com.app.mlounge.ui.screens.music.g
                    @Override // kotlin.jvm.functions.q
                    public final Object invoke(Object obj2, Object obj3, Object obj4) {
                        r rVar = (r) obj3;
                        int iIntValue = ((Integer) obj4).intValue();
                        ((j) obj2).getClass();
                        if (rVar.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                            o oVar = o.b;
                            androidx.compose.ui.r rVarF = w0.f(w0.d(oVar, 1.0f), 300);
                            q0 q0VarD = p.d(androidx.compose.ui.c.e, false);
                            int iHashCode = Long.hashCode(rVar.T);
                            androidx.compose.runtime.internal.j jVarL = rVar.l();
                            androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(rVar, rVarF);
                            androidx.compose.ui.node.g.b.getClass();
                            y yVar = androidx.compose.ui.node.f.b;
                            rVar.e0();
                            if (rVar.S) {
                                rVar.k(yVar);
                            } else {
                                rVar.o0();
                            }
                            androidx.compose.ui.node.e eVar = androidx.compose.ui.node.f.e;
                            s.x(rVar, q0VarD, eVar);
                            androidx.compose.ui.node.e eVar2 = androidx.compose.ui.node.f.d;
                            s.x(rVar, jVarL, eVar2);
                            Integer numValueOf = Integer.valueOf(iHashCode);
                            androidx.compose.ui.node.e eVar3 = androidx.compose.ui.node.f.f;
                            s.p(rVar, numValueOf, eVar3);
                            androidx.compose.ui.node.d dVar = androidx.compose.ui.node.f.g;
                            s.t(rVar, dVar);
                            androidx.compose.ui.node.e eVar4 = androidx.compose.ui.node.f.c;
                            s.x(rVar, rVarC, eVar4);
                            MusicArtistDetail musicArtistDetail2 = musicArtistDetail;
                            String strC = musicArtistDetail2.c();
                            if (strC == null) {
                                strC = "";
                            }
                            String strD = musicArtistDetail2.d();
                            a0 a0Var = w0.c;
                            k.a(strC, strD, a0Var, null, androidx.compose.ui.layout.i.a, rVar, 1573248, 1976);
                            long j = t.h;
                            p.a(androidx.compose.foundation.s.e(a0Var, com.google.android.material.shape.g.l(com.google.common.base.c.q(new t(j), new t(com.app.mlounge.ui.theme.b.a)), 0.0f, 0.0f, 14)), rVar, 6);
                            Object objQ = rVar.Q();
                            androidx.compose.runtime.f fVar = m.a;
                            if (objQ == fVar) {
                                objQ = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar);
                            }
                            androidx.compose.foundation.interaction.k kVar = (androidx.compose.foundation.interaction.k) objQ;
                            y0 y0VarG = android.support.v4.media.session.b.g(kVar, rVar, 6);
                            float f = 16;
                            androidx.compose.ui.r rVarO = androidx.compose.foundation.layout.b.o(oVar, f);
                            androidx.compose.foundation.shape.d dVar2 = androidx.compose.foundation.shape.e.a;
                            androidx.compose.ui.r rVarA = androidx.compose.ui.draw.h.a(rVarO, dVar2);
                            float f2 = 2;
                            if (((Boolean) y0VarG.getValue()).booleanValue()) {
                                j = com.app.mlounge.ui.theme.b.q;
                            }
                            androidx.compose.material3.t2.e(aVar, androidx.compose.foundation.s.f(androidx.compose.foundation.s.g(rVarA, f2, j, dVar2), t.b(0.5f, t.b), androidx.compose.ui.graphics.a0.b), false, null, kVar, null, a.d, rVar, 1597440, 44);
                            androidx.compose.ui.r rVarO2 = androidx.compose.foundation.layout.b.o(androidx.compose.foundation.layout.b.e(oVar, androidx.compose.ui.c.D), f);
                            v vVarA = androidx.compose.foundation.layout.t.a(androidx.compose.foundation.layout.h.c, androidx.compose.ui.c.J, rVar, 0);
                            int iHashCode2 = Long.hashCode(rVar.T);
                            androidx.compose.runtime.internal.j jVarL2 = rVar.l();
                            androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(rVar, rVarO2);
                            rVar.e0();
                            if (rVar.S) {
                                rVar.k(yVar);
                            } else {
                                rVar.o0();
                            }
                            s.x(rVar, vVarA, eVar);
                            s.x(rVar, jVarL2, eVar2);
                            androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode2, rVar, eVar3, rVar, dVar);
                            s.x(rVar, rVarC2, eVar4);
                            t0 t0VarA = r0.a(androidx.compose.foundation.layout.h.a, androidx.compose.ui.c.H, rVar, 48);
                            int iHashCode3 = Long.hashCode(rVar.T);
                            androidx.compose.runtime.internal.j jVarL3 = rVar.l();
                            androidx.compose.ui.r rVarC3 = androidx.compose.ui.a.c(rVar, oVar);
                            rVar.e0();
                            if (rVar.S) {
                                rVar.k(yVar);
                            } else {
                                rVar.o0();
                            }
                            s.x(rVar, t0VarA, eVar);
                            s.x(rVar, jVarL3, eVar2);
                            androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode3, rVar, eVar3, rVar, dVar);
                            s.x(rVar, rVarC3, eVar4);
                            String strD2 = musicArtistDetail2.d();
                            m0 m0Var = ((t3) rVar.j(u3.a)).d;
                            long j2 = t.d;
                            if (1.0f <= 0.0d) {
                                androidx.compose.foundation.layout.internal.a.a("invalid weight; must be greater than zero");
                            }
                            p3.b(strD2, new h0(1.0f, true), j2, 0L, null, 0L, null, 0L, 0, false, 0, 0, m0Var, rVar, 384, 0, 131064);
                            androidx.compose.foundation.layout.b.d(rVar, w0.p(oVar, f));
                            t2 t2Var6 = t2Var5;
                            String str2 = ((Boolean) t2Var6.getValue()).booleanValue() ? "Favourited" : "Favourite";
                            androidx.compose.ui.graphics.vector.f fVarP = ((Boolean) t2Var6.getValue()).booleanValue() ? com.google.android.gms.dynamite.g.p() : h1.n();
                            com.app.mlounge.ui.viewmodel.h0 h0Var2 = h0Var;
                            boolean zH = rVar.h(h0Var2) | rVar.h(musicArtistDetail2);
                            String str3 = str;
                            boolean zF = zH | rVar.f(str3);
                            Object objQ2 = rVar.Q();
                            if (zF || objQ2 == fVar) {
                                objQ2 = new androidx.compose.foundation.gestures.g(13, h0Var2, musicArtistDetail2, str3);
                                rVar.l0(objQ2);
                            }
                            com.app.mlounge.ui.screens.movies.a.b(str2, fVarP, (kotlin.jvm.functions.a) objQ2, w0.p(oVar, 140), false, rVar, 3072, 48);
                            androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.u(rVar, true, true, true);
                        } else {
                            rVar.W();
                        }
                        return kotlin.y.a;
                    }
                }), new com.app.mlounge.ui.q(21));
                String strB = musicArtistDetail.b();
                if (strB != null) {
                    androidx.compose.foundation.lazy.grid.h.p(5, hVar2, new androidx.compose.runtime.internal.f(1726523718, true, new androidx.compose.foundation.gestures.y(strB, 8)), new com.app.mlounge.ui.q(22));
                }
                if (!musicArtistDetail.a().isEmpty()) {
                    androidx.compose.foundation.lazy.grid.h.p(5, hVar2, com.app.mlounge.ui.screens.music.a.e, new com.app.mlounge.ui.q(23));
                    List listA = musicArtistDetail.a();
                    hVar2.q(listA.size(), null, new com.app.mlounge.ui.screens.adult.g(10, listA), new androidx.compose.runtime.internal.f(-1117249557, true, new com.app.mlounge.ui.screens.adult.h(listA, lVar2, 2)));
                }
                break;
        }
        return kotlin.y.a;
    }
}
