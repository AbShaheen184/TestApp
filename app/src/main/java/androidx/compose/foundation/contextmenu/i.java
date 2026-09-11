package androidx.compose.foundation.contextmenu;

import android.graphics.Typeface;
import android.text.Spannable;
import androidx.appcompat.widget.c2;
import androidx.compose.animation.b0;
import androidx.compose.animation.core.n;
import androidx.compose.foundation.layout.r0;
import androidx.compose.foundation.layout.t;
import androidx.compose.foundation.layout.v;
import androidx.compose.foundation.layout.w;
import androidx.compose.foundation.layout.w0;
import androidx.compose.foundation.text.e1;
import androidx.compose.foundation.text.selection.k0;
import androidx.compose.foundation.text.selection.m0;
import androidx.compose.material3.f3;
import androidx.compose.material3.j2;
import androidx.compose.material3.p3;
import androidx.compose.material3.t3;
import androidx.compose.material3.u3;
import androidx.compose.runtime.e0;
import androidx.compose.runtime.h1;
import androidx.compose.runtime.j0;
import androidx.compose.runtime.m;
import androidx.compose.runtime.r;
import androidx.compose.runtime.s;
import androidx.compose.runtime.t2;
import androidx.compose.runtime.u2;
import androidx.compose.runtime.y0;
import androidx.compose.ui.graphics.p0;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.h0;
import androidx.compose.ui.o;
import androidx.compose.ui.text.font.u;
import androidx.datastore.core.t0;
import com.app.mlounge.data.remote.model.HiAnimeDetailData;
import com.app.mlounge.data.remote.model.HiAnimeEpCount;
import com.app.mlounge.data.remote.model.HiAnimeInfo;
import com.app.mlounge.data.remote.model.HiAnimeMoreInfo;
import com.app.mlounge.data.remote.model.HiAnimeStats;
import com.app.mlounge.ui.screens.player.b1;
import com.app.mlounge.ui.screens.player.i0;
import com.app.mlounge.ui.viewmodel.k1;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.p;
import kotlin.jvm.functions.q;
import kotlin.y;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BufferedChannel;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements q {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ i(int i, Object obj, Object obj2) {
        this.e = i;
        this.y = obj;
        this.z = obj2;
    }

    @Override // kotlin.jvm.functions.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        Typeface typeface;
        boolean z2;
        String strR;
        HiAnimeEpCount hiAnimeEpCountB;
        int i = this.e;
        int i2 = 6;
        int i3 = 2;
        o oVar = o.b;
        androidx.compose.runtime.f fVar = m.a;
        kotlin.coroutines.d dVar = null;
        y yVar = y.a;
        Object obj4 = this.z;
        Object obj5 = this.y;
        int i4 = 1;
        switch (i) {
            case 0:
                kotlin.jvm.functions.l lVar = (kotlin.jvm.functions.l) obj5;
                d dVar2 = (d) obj4;
                r rVar = (r) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if (rVar.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    Object objQ = rVar.Q();
                    if (objQ == fVar) {
                        objQ = new g();
                        rVar.l0(objQ);
                    }
                    g gVar = (g) objQ;
                    gVar.a.clear();
                    lVar.invoke(gVar);
                    gVar.a(dVar2, rVar, 0);
                } else {
                    rVar.W();
                }
                return yVar;
            case 1:
                kotlin.jvm.functions.l lVar2 = (kotlin.jvm.functions.l) obj5;
                androidx.compose.foundation.interaction.k kVar = (androidx.compose.foundation.interaction.k) obj4;
                r rVar2 = (r) obj2;
                ((Integer) obj3).getClass();
                rVar2.b0(-102778667);
                Object objQ2 = rVar2.Q();
                Object obj6 = objQ2;
                if (objQ2 == fVar) {
                    CoroutineScope coroutineScopeF = j0.f(rVar2);
                    rVar2.l0(coroutineScopeF);
                    obj6 = coroutineScopeF;
                }
                CoroutineScope coroutineScope = (CoroutineScope) obj6;
                Object objQ3 = rVar2.Q();
                Object obj7 = objQ3;
                if (objQ3 == fVar) {
                    h1 h1VarR = s.r(null);
                    rVar2.l0(h1VarR);
                    obj7 = h1VarR;
                }
                y0 y0Var = (y0) obj7;
                y0 y0VarV = s.v(lVar2, rVar2);
                boolean zF = rVar2.f(kVar);
                Object objQ4 = rVar2.Q();
                Object obj8 = objQ4;
                if (zF || objQ4 == fVar) {
                    androidx.activity.compose.h hVar = new androidx.activity.compose.h(21, y0Var, kVar);
                    rVar2.l0(hVar);
                    obj8 = hVar;
                }
                j0.b(kVar, (kotlin.jvm.functions.l) obj8, rVar2);
                boolean zH = rVar2.h(coroutineScope) | rVar2.f(kVar) | rVar2.f(y0VarV);
                Object objQ5 = rVar2.Q();
                Object obj9 = objQ5;
                if (zH || objQ5 == fVar) {
                    e1 e1Var = new e1(coroutineScope, y0Var, kVar, y0VarV);
                    rVar2.l0(e1Var);
                    obj9 = e1Var;
                }
                androidx.compose.ui.r rVarA = h0.a(oVar, kVar, (PointerInputEventHandler) obj9);
                rVar2.p(false);
                return rVarA;
            case 2:
                kotlin.jvm.functions.a aVar = (kotlin.jvm.functions.a) obj4;
                kotlin.jvm.functions.l lVar3 = (kotlin.jvm.functions.l) obj5;
                r rVar3 = (r) obj2;
                ((Integer) obj3).getClass();
                rVar3.b0(759876635);
                Object objQ6 = rVar3.Q();
                Object obj10 = objQ6;
                if (objQ6 == fVar) {
                    e0 e0VarK = s.k(aVar);
                    rVar3.l0(e0VarK);
                    obj10 = e0VarK;
                }
                t2 t2Var = (t2) obj10;
                Object objQ7 = rVar3.Q();
                Object obj11 = objQ7;
                if (objQ7 == fVar) {
                    androidx.compose.animation.core.d dVar3 = new androidx.compose.animation.core.d(new androidx.compose.ui.geometry.b(((androidx.compose.ui.geometry.b) t2Var.getValue()).a), m0.b, new androidx.compose.ui.geometry.b(m0.c), 8);
                    rVar3.l0(dVar3);
                    obj11 = dVar3;
                }
                androidx.compose.animation.core.d dVar4 = (androidx.compose.animation.core.d) obj11;
                boolean zH2 = rVar3.h(dVar4);
                Object objQ8 = rVar3.Q();
                Object obj12 = objQ8;
                if (zH2 || objQ8 == fVar) {
                    b0 b0Var = new b0(t2Var, dVar4, dVar, 12);
                    rVar3.l0(b0Var);
                    obj12 = b0Var;
                }
                j0.c(rVar3, yVar, (p) obj12);
                n nVar = dVar4.c;
                boolean zF2 = rVar3.f(nVar);
                Object objQ9 = rVar3.Q();
                if (zF2 || objQ9 == fVar) {
                    z = false;
                    objQ9 = new k0(nVar, false ? 1 : 0);
                    rVar3.l0(objQ9);
                } else {
                    z = false;
                }
                androidx.compose.ui.r rVar4 = (androidx.compose.ui.r) lVar3.invoke((kotlin.jvm.functions.a) objQ9);
                rVar3.p(z);
                return rVar4;
            case 3:
                Spannable spannable = (Spannable) obj5;
                androidx.compose.ui.text.platform.c cVar = (androidx.compose.ui.text.platform.c) obj4;
                androidx.compose.ui.text.e0 e0Var = (androidx.compose.ui.text.e0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int iIntValue3 = ((Integer) obj3).intValue();
                androidx.compose.ui.text.font.s sVar = e0Var.f;
                androidx.compose.ui.text.font.l lVar4 = e0Var.c;
                if (lVar4 == null) {
                    lVar4 = androidx.compose.ui.text.font.l.z;
                }
                androidx.compose.ui.text.font.j jVar = e0Var.d;
                int i5 = jVar != null ? jVar.a : 0;
                androidx.compose.ui.text.font.k kVar2 = e0Var.e;
                int i6 = kVar2 != null ? kVar2.a : 65535;
                androidx.compose.ui.text.platform.d dVar5 = (androidx.compose.ui.text.platform.d) cVar.y;
                u uVarB = ((androidx.compose.ui.text.font.f) dVar5.B).b(sVar, lVar4, i5, i6);
                if (uVarB instanceof u) {
                    Object obj13 = uVarB.e;
                    obj13.getClass();
                    typeface = (Typeface) obj13;
                } else {
                    c2 c2Var = new c2(uVarB, dVar5.G);
                    dVar5.G = c2Var;
                    Object obj14 = c2Var.A;
                    obj14.getClass();
                    typeface = (Typeface) obj14;
                }
                spannable.setSpan(new androidx.compose.ui.text.android.style.b(typeface, 1), iIntValue2, iIntValue3, 33);
                return yVar;
            case 4:
                androidx.navigation.y yVar2 = (androidx.navigation.y) obj5;
                y0 y0Var2 = (y0) obj4;
                String str = (String) obj;
                String str2 = (String) obj2;
                String str3 = (String) obj3;
                str.getClass();
                str2.getClass();
                str3.getClass();
                if (!com.app.mlounge.ui.h0.b(y0Var2)) {
                    y0Var2.setValue(Boolean.TRUE);
                    androidx.navigation.y.b(yVar2, com.app.mlounge.ui.navigation.s.b(com.app.mlounge.ui.navigation.s.g, str, str2, str3, 0, 0, 24));
                }
                return yVar;
            case 5:
                HiAnimeDetailData hiAnimeDetailData = (HiAnimeDetailData) obj4;
                kotlin.jvm.functions.l lVar5 = (kotlin.jvm.functions.l) obj5;
                r rVar5 = (r) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((androidx.compose.foundation.lazy.d) obj).getClass();
                if (rVar5.T(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    List listC = hiAnimeDetailData.c();
                    List list = kotlin.collections.u.e;
                    if (listC == null) {
                        listC = list;
                    }
                    List listB = hiAnimeDetailData.b();
                    if (listB != null) {
                        list = listB;
                    }
                    ArrayList arrayListX = kotlin.collections.o.X(listC, list);
                    if (arrayListX.isEmpty()) {
                        rVar5.b0(-1229188770);
                        rVar5.p(false);
                    } else {
                        rVar5.b0(-1230135355);
                        v vVarA = t.a(androidx.compose.foundation.layout.h.c, androidx.compose.ui.c.J, rVar5, 0);
                        int iHashCode = Long.hashCode(rVar5.T);
                        androidx.compose.runtime.internal.j jVarL = rVar5.l();
                        androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(rVar5, oVar);
                        androidx.compose.ui.node.g.b.getClass();
                        androidx.compose.ui.node.y yVar3 = androidx.compose.ui.node.f.b;
                        rVar5.e0();
                        if (rVar5.S) {
                            rVar5.k(yVar3);
                        } else {
                            rVar5.o0();
                        }
                        s.x(rVar5, vVarA, androidx.compose.ui.node.f.e);
                        s.x(rVar5, jVarL, androidx.compose.ui.node.f.d);
                        s.p(rVar5, Integer.valueOf(iHashCode), androidx.compose.ui.node.f.f);
                        s.t(rVar5, androidx.compose.ui.node.f.g);
                        s.x(rVar5, rVarC, androidx.compose.ui.node.f.c);
                        float f = 16;
                        androidx.compose.foundation.layout.b.d(rVar5, w0.f(oVar, f));
                        p3.b("Related Anime", androidx.compose.foundation.layout.b.q(oVar, f, 0.0f, 2), com.app.mlounge.ui.theme.b.l, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar5.j(u3.a)).h, rVar5, 438, 0, 131064);
                        float f2 = 8;
                        androidx.compose.foundation.layout.b.d(rVar5, w0.f(oVar, f2));
                        androidx.compose.foundation.layout.m0 m0VarA = androidx.compose.foundation.layout.b.a(2, f);
                        androidx.compose.foundation.layout.f fVarG = androidx.compose.foundation.layout.h.g(f2);
                        boolean zH3 = rVar5.h(arrayListX) | rVar5.f(lVar5);
                        Object objQ10 = rVar5.Q();
                        Object obj15 = objQ10;
                        if (zH3 || objQ10 == fVar) {
                            t0 t0Var = new t0(12, arrayListX, lVar5);
                            rVar5.l0(t0Var);
                            obj15 = t0Var;
                        }
                        coil3.network.g.b(null, null, m0VarA, fVarG, null, null, false, null, (kotlin.jvm.functions.l) obj15, rVar5, 24960);
                        rVar5.p(true);
                        rVar5.p(false);
                    }
                } else {
                    rVar5.W();
                }
                return yVar;
            case 6:
                HiAnimeInfo hiAnimeInfo = (HiAnimeInfo) obj5;
                HiAnimeMoreInfo hiAnimeMoreInfo = (HiAnimeMoreInfo) obj4;
                r rVar6 = (r) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((androidx.compose.foundation.lazy.d) obj).getClass();
                if (!rVar6.T(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    rVar6.W();
                    return yVar;
                }
                float f3 = 16;
                androidx.compose.ui.r rVarQ = androidx.compose.foundation.layout.b.q(oVar, f3, 0.0f, 2);
                androidx.compose.foundation.layout.a aVar2 = androidx.compose.foundation.layout.h.a;
                androidx.compose.ui.i iVar = androidx.compose.ui.c.G;
                androidx.compose.foundation.layout.t0 t0VarA = r0.a(aVar2, iVar, rVar6, 0);
                int iHashCode2 = Long.hashCode(rVar6.T);
                androidx.compose.runtime.internal.j jVarL2 = rVar6.l();
                androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(rVar6, rVarQ);
                androidx.compose.ui.node.g.b.getClass();
                androidx.compose.ui.node.y yVar4 = androidx.compose.ui.node.f.b;
                rVar6.e0();
                if (rVar6.S) {
                    rVar6.k(yVar4);
                } else {
                    rVar6.o0();
                }
                androidx.compose.ui.node.e eVar = androidx.compose.ui.node.f.e;
                s.x(rVar6, t0VarA, eVar);
                androidx.compose.ui.node.e eVar2 = androidx.compose.ui.node.f.d;
                s.x(rVar6, jVarL2, eVar2);
                Integer numValueOf = Integer.valueOf(iHashCode2);
                androidx.compose.ui.node.e eVar3 = androidx.compose.ui.node.f.f;
                s.p(rVar6, numValueOf, eVar3);
                androidx.compose.ui.node.d dVar6 = androidx.compose.ui.node.f.g;
                s.t(rVar6, dVar6);
                androidx.compose.ui.node.e eVar4 = androidx.compose.ui.node.f.c;
                s.x(rVar6, rVarC2, eVar4);
                float f4 = 8;
                coil3.compose.k.a(hiAnimeInfo.d(), hiAnimeInfo.c(), androidx.compose.ui.draw.h.a(w0.f(w0.p(oVar, 120), 180), androidx.compose.foundation.shape.e.a(f4)), null, androidx.compose.ui.layout.i.a, rVar6, 1572864, 1976);
                androidx.compose.foundation.layout.b.d(rVar6, w0.p(oVar, f3));
                if (1.0f <= 0.0d) {
                    androidx.compose.foundation.layout.internal.a.a("invalid weight; must be greater than zero");
                }
                androidx.compose.ui.r rVarS = androidx.compose.foundation.layout.b.s(new androidx.compose.foundation.layout.h0(1.0f, true), 0.0f, f4, 0.0f, 0.0f, 13);
                v vVarA2 = t.a(androidx.compose.foundation.layout.h.c, androidx.compose.ui.c.J, rVar6, 0);
                int iHashCode3 = Long.hashCode(rVar6.T);
                androidx.compose.runtime.internal.j jVarL3 = rVar6.l();
                androidx.compose.ui.r rVarC3 = androidx.compose.ui.a.c(rVar6, rVarS);
                rVar6.e0();
                if (rVar6.S) {
                    rVar6.k(yVar4);
                } else {
                    rVar6.o0();
                }
                s.x(rVar6, vVarA2, eVar);
                s.x(rVar6, jVarL3, eVar2);
                androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode3, rVar6, eVar3, rVar6, dVar6);
                s.x(rVar6, rVarC3, eVar4);
                String strC = hiAnimeInfo.c();
                if (strC == null) {
                    strC = "";
                }
                String str4 = strC;
                u2 u2Var = u3.a;
                p3.b(str4, null, com.app.mlounge.ui.theme.b.l, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar6.j(u2Var)).f, rVar6, 384, 0, 131066);
                float f5 = 4;
                androidx.compose.foundation.layout.b.d(rVar6, w0.f(oVar, f5));
                androidx.compose.foundation.layout.t0 t0VarA2 = r0.a(androidx.compose.foundation.layout.h.g(f4), iVar, rVar6, 6);
                int iHashCode4 = Long.hashCode(rVar6.T);
                androidx.compose.runtime.internal.j jVarL4 = rVar6.l();
                androidx.compose.ui.r rVarC4 = androidx.compose.ui.a.c(rVar6, oVar);
                rVar6.e0();
                if (rVar6.S) {
                    rVar6.k(yVar4);
                } else {
                    rVar6.o0();
                }
                s.x(rVar6, t0VarA2, eVar);
                s.x(rVar6, jVarL4, eVar2);
                androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode4, rVar6, eVar3, rVar6, dVar6);
                s.x(rVar6, rVarC4, eVar4);
                HiAnimeStats hiAnimeStatsE = hiAnimeInfo.e();
                String strD = hiAnimeStatsE != null ? hiAnimeStatsE.d() : null;
                if (strD == null) {
                    rVar6.b0(1679240219);
                    z2 = false;
                    rVar6.p(false);
                } else {
                    rVar6.b0(1679240220);
                    f3.a(null, androidx.compose.foundation.shape.e.a(f5), androidx.compose.ui.graphics.t.b(0.2f, com.app.mlounge.ui.theme.b.f), 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(-1642406300, new com.app.mlounge.ui.components.s(strD, 2), rVar6), rVar6, 12583296, Token.DOT);
                    z2 = false;
                    rVar6.p(false);
                }
                HiAnimeStats hiAnimeStatsE2 = hiAnimeInfo.e();
                String strC2 = hiAnimeStatsE2 != null ? hiAnimeStatsE2.c() : null;
                if (strC2 == null) {
                    rVar6.b0(1679679799);
                    rVar6.p(z2);
                } else {
                    rVar6.b0(1679679800);
                    f3.a(null, androidx.compose.foundation.shape.e.a(f5), androidx.compose.ui.graphics.t.b(0.2f, com.app.mlounge.ui.theme.b.h), 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(1293871835, new com.app.mlounge.ui.components.s(strC2, 3), rVar6), rVar6, 12583296, Token.DOT);
                    z2 = false;
                    rVar6.p(false);
                }
                String strC3 = hiAnimeMoreInfo != null ? hiAnimeMoreInfo.c() : null;
                if (strC3 == null) {
                    rVar6.b0(1680114636);
                    rVar6.p(z2);
                } else {
                    rVar6.b0(1680114637);
                    p3.b("★ ".concat(strC3), null, com.app.mlounge.ui.theme.b.s, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar6.j(u2Var)).n, rVar6, 384, 0, 131066);
                    rVar6.p(false);
                }
                rVar6.p(true);
                androidx.compose.foundation.layout.b.d(rVar6, w0.f(oVar, f5));
                HiAnimeStats hiAnimeStatsE3 = hiAnimeInfo.e();
                String strE = hiAnimeStatsE3 != null ? hiAnimeStatsE3.e() : null;
                HiAnimeStats hiAnimeStatsE4 = hiAnimeInfo.e();
                String strA = hiAnimeStatsE4 != null ? hiAnimeStatsE4.a() : null;
                HiAnimeStats hiAnimeStatsE5 = hiAnimeInfo.e();
                if (hiAnimeStatsE5 == null || (hiAnimeEpCountB = hiAnimeStatsE5.b()) == null) {
                    strR = null;
                } else {
                    Integer numB = hiAnimeEpCountB.b();
                    String strD2 = numB != null ? androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.d(numB.intValue(), " sub") : null;
                    Integer numA = hiAnimeEpCountB.a();
                    strR = kotlin.collections.o.R(kotlin.collections.n.N(new String[]{strD2, numA != null ? androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.d(numA.intValue(), " dub") : null}), ", ", null, null, null, 62);
                }
                String strR2 = kotlin.collections.o.R(kotlin.collections.n.N(new String[]{strE, strA, strR}), " • ", null, null, null, 62);
                androidx.compose.ui.text.m0 m0Var = ((t3) rVar6.j(u2Var)).l;
                long j = com.app.mlounge.ui.theme.b.m;
                p3.b(strR2, null, j, 0L, null, 0L, null, 0L, 0, false, 0, 0, m0Var, rVar6, 384, 0, 131066);
                List listB2 = hiAnimeMoreInfo != null ? hiAnimeMoreInfo.b() : null;
                if (listB2 == null) {
                    rVar6.b0(272150209);
                    rVar6.p(false);
                } else {
                    rVar6.b0(272150210);
                    p3.b(kotlin.collections.o.R(listB2, ", ", null, null, null, 62), null, j, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar6.j(u2Var)).l, rVar6, 384, 0, 131066);
                    rVar6.p(false);
                }
                rVar6.p(true);
                rVar6.p(true);
                androidx.compose.foundation.layout.b.d(rVar6, w0.f(oVar, f3));
                return yVar;
            case 7:
                b1 b1Var = (b1) obj5;
                kotlin.jvm.functions.a aVar3 = (kotlin.jvm.functions.a) obj4;
                r rVar7 = (r) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((androidx.compose.foundation.lazy.d) obj).getClass();
                if (rVar7.T(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    androidx.compose.ui.graphics.vector.f fVarY = android.support.v4.media.session.b.y();
                    boolean z3 = b1Var == null;
                    boolean zF3 = rVar7.f(aVar3);
                    Object objQ11 = rVar7.Q();
                    if (zF3 || objQ11 == fVar) {
                        objQ11 = new j2(10, aVar3);
                        rVar7.l0(objQ11);
                    }
                    i0.i("Off", fVarY, z3, null, (kotlin.jvm.functions.a) objQ11, rVar7, 6, 8);
                } else {
                    rVar7.W();
                }
                return yVar;
            case 8:
                com.app.mlounge.ui.viewmodel.y0 y0Var3 = (com.app.mlounge.ui.viewmodel.y0) obj5;
                y0 y0Var4 = (y0) obj4;
                r rVar8 = (r) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((androidx.compose.foundation.lazy.grid.j) obj).getClass();
                if (rVar8.T(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    List listQ = com.google.common.base.c.q("SNES", "Sega Genesis", "NES", "PSP");
                    float f6 = 8;
                    androidx.compose.ui.r rVarS2 = androidx.compose.foundation.layout.b.s(androidx.compose.foundation.s.p(w0.d(oVar, 1.0f), androidx.compose.foundation.s.o(rVar8), false), 0.0f, 0.0f, 0.0f, f6, 7);
                    androidx.compose.foundation.layout.t0 t0VarA3 = r0.a(androidx.compose.foundation.layout.h.g(f6), androidx.compose.ui.c.G, rVar8, 6);
                    int iHashCode5 = Long.hashCode(rVar8.T);
                    androidx.compose.runtime.internal.j jVarL5 = rVar8.l();
                    androidx.compose.ui.r rVarC5 = androidx.compose.ui.a.c(rVar8, rVarS2);
                    androidx.compose.ui.node.g.b.getClass();
                    androidx.compose.ui.node.y yVar5 = androidx.compose.ui.node.f.b;
                    rVar8.e0();
                    if (rVar8.S) {
                        rVar8.k(yVar5);
                    } else {
                        rVar8.o0();
                    }
                    s.x(rVar8, t0VarA3, androidx.compose.ui.node.f.e);
                    s.x(rVar8, jVarL5, androidx.compose.ui.node.f.d);
                    s.p(rVar8, Integer.valueOf(iHashCode5), androidx.compose.ui.node.f.f);
                    s.t(rVar8, androidx.compose.ui.node.f.g);
                    s.x(rVar8, rVarC5, androidx.compose.ui.node.f.c);
                    rVar8.b0(-1327938921);
                    int i7 = 0;
                    for (Object obj16 : listQ) {
                        int i8 = i7 + 1;
                        if (i7 < 0) {
                            com.google.common.base.c.w();
                            throw null;
                        }
                        String str5 = (String) obj16;
                        Object objQ12 = rVar8.Q();
                        if (objQ12 == fVar) {
                            objQ12 = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar8);
                        }
                        androidx.compose.foundation.interaction.k kVar3 = (androidx.compose.foundation.interaction.k) objQ12;
                        androidx.compose.ui.r rVarG = androidx.compose.foundation.s.g(androidx.compose.ui.draw.h.a(oVar, androidx.compose.foundation.shape.e.a(f6)), i3, ((Boolean) android.support.v4.media.session.b.g(kVar3, rVar8, i2).getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : androidx.compose.ui.graphics.t.h, androidx.compose.foundation.shape.e.a(f6));
                        boolean zH4 = rVar8.h(y0Var3) | rVar8.d(i7);
                        Object objQ13 = rVar8.Q();
                        if (zH4 || objQ13 == fVar) {
                            objQ13 = new com.app.mlounge.ui.screens.search.d(y0Var3, i7, 0);
                            rVar8.l0(objQ13);
                        }
                        f3.a(androidx.compose.foundation.s.m(androidx.compose.foundation.s.i(rVarG, kVar3, null, false, null, (kotlin.jvm.functions.a) objQ13, 28), kVar3, i4), androidx.compose.foundation.shape.e.a(f6), ((Number) y0Var4.getValue()).intValue() == i7 ? androidx.compose.ui.graphics.t.b(0.2f, com.app.mlounge.ui.theme.b.f) : com.app.mlounge.ui.theme.b.d, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(1303824763, new com.app.mlounge.ui.screens.search.c(i7, str5, y0Var4, 1), rVar8), rVar8, 12582912, 120);
                        i7 = i8;
                        i2 = 6;
                        i3 = 2;
                        i4 = 1;
                    }
                    rVar8.p(false);
                    rVar8.p(true);
                } else {
                    rVar8.W();
                }
                return yVar;
            case 9:
                k1 k1Var = (k1) obj5;
                t2 t2Var2 = (t2) obj4;
                r rVar9 = (r) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((w) obj).getClass();
                if (rVar9.T(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    String str6 = ((Boolean) t2Var2.getValue()).booleanValue() ? "Orientation follows device rotation" : "Forced landscape mode";
                    boolean zBooleanValue = ((Boolean) t2Var2.getValue()).booleanValue();
                    boolean zH5 = rVar9.h(k1Var);
                    Object objQ14 = rVar9.Q();
                    if (zH5 || objQ14 == fVar) {
                        objQ14 = new com.app.mlounge.ui.screens.settings.u(k1Var, i2);
                        rVar9.l0(objQ14);
                    }
                    kotlin.jvm.functions.l lVar6 = (kotlin.jvm.functions.l) objQ14;
                    androidx.compose.ui.graphics.vector.f fVarB = androidx.datastore.preferences.protobuf.h1.g;
                    if (fVarB == null) {
                        androidx.compose.ui.graphics.vector.e eVar5 = new androidx.compose.ui.graphics.vector.e("Filled.ScreenRotation", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i9 = androidx.compose.ui.graphics.vector.h0.a;
                        p0 p0Var = new p0(androidx.compose.ui.graphics.t.b);
                        androidx.compose.ui.graphics.vector.g gVarH = androidx.privacysandbox.ads.adservices.java.internal.a.h(16.48f, 2.52f);
                        gVarH.h(3.27f, 1.55f, 5.61f, 4.72f, 5.97f, 8.48f);
                        gVarH.l(1.5f);
                        gVarH.g(23.44f, 4.84f, 18.29f, 0.0f, 12.0f, 0.0f);
                        gVarH.n(-0.66f, 0.03f);
                        gVarH.n(3.81f, 3.81f);
                        gVarH.n(1.33f, -1.32f);
                        gVarH.f();
                        gVarH.o(10.23f, 1.75f);
                        gVarH.h(-0.59f, -0.59f, -1.54f, -0.59f, -2.12f, 0.0f);
                        gVarH.m(1.75f, 8.11f);
                        gVarH.h(-0.59f, 0.59f, -0.59f, 1.54f, 0.0f, 2.12f);
                        gVarH.n(12.02f, 12.02f);
                        gVarH.h(0.59f, 0.59f, 1.54f, 0.59f, 2.12f, 0.0f);
                        gVarH.n(6.36f, -6.36f);
                        gVarH.h(0.59f, -0.59f, 0.59f, -1.54f, 0.0f, -2.12f);
                        gVarH.m(10.23f, 1.75f);
                        gVarH.f();
                        gVarH.o(14.83f, 21.19f);
                        gVarH.m(2.81f, 9.17f);
                        gVarH.n(6.36f, -6.36f);
                        gVarH.n(12.02f, 12.02f);
                        gVarH.n(-6.36f, 6.36f);
                        gVarH.f();
                        gVarH.o(7.52f, 21.48f);
                        gVarH.g(4.25f, 19.94f, 1.91f, 16.76f, 1.55f, 13.0f);
                        gVarH.m(0.05f, 13.0f);
                        gVarH.g(0.56f, 19.16f, 5.71f, 24.0f, 12.0f, 24.0f);
                        gVarH.n(0.66f, -0.03f);
                        gVarH.n(-3.81f, -3.81f);
                        gVarH.n(-1.33f, 1.32f);
                        gVarH.f();
                        androidx.compose.ui.graphics.vector.e.a(eVar5, gVarH.a, 0, p0Var);
                        fVarB = eVar5.b();
                        androidx.datastore.preferences.protobuf.h1.g = fVarB;
                    }
                    com.app.mlounge.ui.screens.settings.e0.r("Allow Portrait Orientation", str6, zBooleanValue, lVar6, fVarB, false, rVar9, 6, 32);
                } else {
                    rVar9.W();
                }
                return yVar;
            case 10:
                y0 y0Var5 = (y0) obj5;
                y0 y0Var6 = (y0) obj4;
                r rVar10 = (r) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ((w) obj).getClass();
                if (rVar10.T(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    androidx.compose.ui.graphics.vector.f fVarB2 = androidx.room.r.g;
                    if (fVarB2 == null) {
                        androidx.compose.ui.graphics.vector.e eVar6 = new androidx.compose.ui.graphics.vector.e("Filled.SystemUpdate", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i10 = androidx.compose.ui.graphics.vector.h0.a;
                        p0 p0Var2 = new p0(androidx.compose.ui.graphics.t.b);
                        androidx.compose.ui.graphics.vector.g gVar2 = new androidx.compose.ui.graphics.vector.g(0);
                        gVar2.o(17.0f, 1.01f);
                        gVar2.m(7.0f, 1.0f);
                        gVar2.h(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
                        gVar2.s(18.0f);
                        gVar2.h(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                        gVar2.l(10.0f);
                        gVar2.h(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                        gVar2.m(19.0f, 3.0f);
                        gVar2.h(0.0f, -1.1f, -0.9f, -1.99f, -2.0f, -1.99f);
                        gVar2.f();
                        gVar2.o(17.0f, 19.0f);
                        gVar2.m(7.0f, 19.0f);
                        gVar2.m(7.0f, 5.0f);
                        gVar2.l(10.0f);
                        gVar2.s(14.0f);
                        gVar2.f();
                        gVar2.o(16.0f, 13.0f);
                        gVar2.l(-3.0f);
                        gVar2.m(13.0f, 8.0f);
                        gVar2.l(-2.0f);
                        gVar2.s(5.0f);
                        gVar2.m(8.0f, 13.0f);
                        gVar2.n(4.0f, 4.0f);
                        gVar2.n(4.0f, -4.0f);
                        gVar2.f();
                        androidx.compose.ui.graphics.vector.e.a(eVar6, gVar2.a, 0, p0Var2);
                        fVarB2 = eVar6.b();
                        androidx.room.r.g = fVarB2;
                    }
                    androidx.compose.ui.graphics.vector.f fVar2 = fVarB2;
                    Object objQ15 = rVar10.Q();
                    if (objQ15 == fVar) {
                        objQ15 = new com.app.mlounge.ui.screens.settings.q(y0Var5, 9);
                        rVar10.l0(objQ15);
                    }
                    com.app.mlounge.ui.screens.settings.e0.o("Check for Updates", "Check for new versions of CinemaHQ", fVar2, null, (kotlin.jvm.functions.a) objQ15, rVar10, 24630, 8);
                    androidx.compose.ui.graphics.vector.f fVarB3 = android.support.v4.media.session.b.h;
                    if (fVarB3 == null) {
                        androidx.compose.ui.graphics.vector.e eVar7 = new androidx.compose.ui.graphics.vector.e("Filled.NewReleases", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i11 = androidx.compose.ui.graphics.vector.h0.a;
                        p0 p0Var3 = new p0(androidx.compose.ui.graphics.t.b);
                        androidx.compose.ui.graphics.vector.g gVar3 = new androidx.compose.ui.graphics.vector.g(0);
                        gVar3.o(23.0f, 12.0f);
                        gVar3.n(-2.44f, -2.78f);
                        gVar3.n(0.34f, -3.68f);
                        gVar3.n(-3.61f, -0.82f);
                        gVar3.n(-1.89f, -3.18f);
                        gVar3.m(12.0f, 3.0f);
                        gVar3.m(8.6f, 1.54f);
                        gVar3.m(6.71f, 4.72f);
                        gVar3.n(-3.61f, 0.81f);
                        gVar3.n(0.34f, 3.68f);
                        gVar3.m(1.0f, 12.0f);
                        gVar3.n(2.44f, 2.78f);
                        gVar3.n(-0.34f, 3.69f);
                        gVar3.n(3.61f, 0.82f);
                        gVar3.n(1.89f, 3.18f);
                        gVar3.m(12.0f, 21.0f);
                        gVar3.n(3.4f, 1.46f);
                        gVar3.n(1.89f, -3.18f);
                        gVar3.n(3.61f, -0.82f);
                        gVar3.n(-0.34f, -3.68f);
                        gVar3.m(23.0f, 12.0f);
                        gVar3.f();
                        gVar3.o(13.0f, 17.0f);
                        gVar3.l(-2.0f);
                        gVar3.s(-2.0f);
                        gVar3.l(2.0f);
                        gVar3.s(2.0f);
                        gVar3.f();
                        gVar3.o(13.0f, 13.0f);
                        gVar3.l(-2.0f);
                        gVar3.m(11.0f, 7.0f);
                        gVar3.l(2.0f);
                        gVar3.s(6.0f);
                        gVar3.f();
                        androidx.compose.ui.graphics.vector.e.a(eVar7, gVar3.a, 0, p0Var3);
                        fVarB3 = eVar7.b();
                        android.support.v4.media.session.b.h = fVarB3;
                    }
                    androidx.compose.ui.graphics.vector.f fVar3 = fVarB3;
                    Object objQ16 = rVar10.Q();
                    if (objQ16 == fVar) {
                        objQ16 = new com.app.mlounge.ui.screens.settings.q(y0Var6, 10);
                        rVar10.l0(objQ16);
                    }
                    com.app.mlounge.ui.screens.settings.e0.o("Changelog", "View latest changes", fVar3, null, (kotlin.jvm.functions.a) objQ16, rVar10, 24630, 8);
                    androidx.compose.ui.graphics.vector.f fVarB4 = coil3.network.g.d;
                    if (fVarB4 == null) {
                        androidx.compose.ui.graphics.vector.e eVar8 = new androidx.compose.ui.graphics.vector.e("Filled.Info", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i12 = androidx.compose.ui.graphics.vector.h0.a;
                        p0 p0Var4 = new p0(androidx.compose.ui.graphics.t.b);
                        androidx.compose.ui.graphics.vector.g gVarH2 = androidx.privacysandbox.ads.adservices.java.internal.a.h(12.0f, 2.0f);
                        gVarH2.g(6.48f, 2.0f, 2.0f, 6.48f, 2.0f, 12.0f);
                        gVarH2.q(4.48f, 10.0f, 10.0f, 10.0f);
                        gVarH2.q(10.0f, -4.48f, 10.0f, -10.0f);
                        gVarH2.p(17.52f, 2.0f, 12.0f, 2.0f);
                        gVarH2.f();
                        gVarH2.o(13.0f, 17.0f);
                        gVarH2.l(-2.0f);
                        gVarH2.s(-6.0f);
                        gVarH2.l(2.0f);
                        gVarH2.s(6.0f);
                        gVarH2.f();
                        gVarH2.o(13.0f, 9.0f);
                        gVarH2.l(-2.0f);
                        gVarH2.m(11.0f, 7.0f);
                        gVarH2.l(2.0f);
                        gVarH2.s(2.0f);
                        gVarH2.f();
                        androidx.compose.ui.graphics.vector.e.a(eVar8, gVarH2.a, 0, p0Var4);
                        fVarB4 = eVar8.b();
                        coil3.network.g.d = fVarB4;
                    }
                    com.app.mlounge.ui.screens.settings.e0.o("Version", "8.0", fVarB4, null, null, rVar10, 54, 24);
                } else {
                    rVar10.W();
                }
                return yVar;
            default:
                return BufferedChannel.bindCancellationFun$lambda$89((kotlin.jvm.functions.l) obj5, obj4, (Throwable) obj, obj2, (kotlin.coroutines.i) obj3);
        }
    }

    public /* synthetic */ i(Object obj, kotlin.jvm.functions.l lVar, int i) {
        this.e = i;
        this.z = obj;
        this.y = lVar;
    }
}
