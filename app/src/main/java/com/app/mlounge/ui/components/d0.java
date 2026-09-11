package com.app.mlounge.ui.components;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.gestures.h2;
import androidx.compose.foundation.layout.a1;
import androidx.compose.foundation.layout.r0;
import androidx.compose.foundation.layout.t0;
import androidx.compose.foundation.layout.w0;
import androidx.compose.material3.f1;
import androidx.compose.material3.f3;
import androidx.compose.material3.p3;
import androidx.compose.material3.t2;
import androidx.compose.material3.t3;
import androidx.compose.material3.u3;
import androidx.compose.runtime.u2;
import androidx.compose.runtime.y0;
import androidx.datastore.preferences.protobuf.h1;
import com.app.mlounge.R;
import com.app.mlounge.data.remote.api.TmdbTvDetailResponse;
import com.app.mlounge.data.remote.model.TmdbPersonDetail;
import com.app.mlounge.ui.viewmodel.k1;
import com.app.mlounge.ui.viewmodel.x1;
import com.app.mlounge.ui.viewmodel.y1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.selects.SelectInstance;
import org.mozilla.javascript.Token;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d0 implements kotlin.jvm.functions.q {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ d0(x1 x1Var, TmdbTvDetailResponse tmdbTvDetailResponse, String str) {
        this.e = 6;
        this.z = x1Var;
        this.A = tmdbTvDetailResponse;
        this.y = str;
    }

    private final Object d(Object obj, Object obj2, Object obj3) {
        kotlin.jvm.functions.l lVar = (kotlin.jvm.functions.l) this.y;
        y1 y1Var = (y1) this.z;
        y0 y0Var = (y0) this.A;
        androidx.compose.runtime.r rVar = (androidx.compose.runtime.r) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((androidx.compose.foundation.layout.w) obj).getClass();
        if (rVar.T(iIntValue & 1, (iIntValue & 17) != 16)) {
            for (y1 y1Var2 : y1.A) {
                androidx.compose.runtime.internal.f fVarC = androidx.compose.runtime.internal.k.c(2120706805, new com.app.mlounge.ui.screens.watchlist.a(y1Var2, y1Var, 0), rVar);
                boolean zF = rVar.f(lVar) | rVar.d(y1Var2.ordinal());
                Object objQ = rVar.Q();
                if (zF || objQ == androidx.compose.runtime.m.a) {
                    objQ = new androidx.compose.foundation.gestures.g(18, lVar, y1Var2, y0Var);
                    rVar.l0(objQ);
                }
                androidx.compose.material3.p.b(fVarC, (kotlin.jvm.functions.a) objQ, null, false, null, null, rVar, 6);
            }
        } else {
            rVar.W();
        }
        return kotlin.y.a;
    }

    @Override // kotlin.jvm.functions.q
    public final Object invoke(Object obj, Object obj2, Object obj3) throws XmlPullParserException, IOException {
        boolean z;
        boolean z2;
        boolean z3;
        androidx.compose.ui.o oVar;
        Integer num;
        int i = this.e;
        androidx.compose.ui.o oVar2 = androidx.compose.ui.o.b;
        androidx.compose.runtime.f fVar = androidx.compose.runtime.m.a;
        kotlin.y yVar = kotlin.y.a;
        Object obj4 = this.y;
        int i2 = 16;
        Object obj5 = this.A;
        Object obj6 = this.z;
        switch (i) {
            case 0:
                String str = (String) obj4;
                String str2 = (String) obj6;
                String str3 = (String) obj5;
                androidx.compose.runtime.r rVar = (androidx.compose.runtime.r) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((androidx.compose.foundation.layout.w) obj).getClass();
                if (rVar.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    androidx.compose.ui.h hVar = androidx.compose.ui.c.K;
                    androidx.compose.foundation.layout.d dVar = androidx.compose.foundation.layout.h.d;
                    androidx.compose.ui.r rVarO = androidx.compose.foundation.layout.b.o(w0.f(w0.d(oVar2, 1.0f), 120), 8);
                    androidx.compose.foundation.layout.v vVarA = androidx.compose.foundation.layout.t.a(dVar, hVar, rVar, 54);
                    int iHashCode = Long.hashCode(rVar.T);
                    androidx.compose.runtime.internal.j jVarL = rVar.l();
                    androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(rVar, rVarO);
                    androidx.compose.ui.node.g.b.getClass();
                    androidx.compose.ui.node.y yVar2 = androidx.compose.ui.node.f.b;
                    rVar.e0();
                    if (rVar.S) {
                        rVar.k(yVar2);
                    } else {
                        rVar.o0();
                    }
                    androidx.compose.runtime.s.x(rVar, vVarA, androidx.compose.ui.node.f.e);
                    androidx.compose.runtime.s.x(rVar, jVarL, androidx.compose.ui.node.f.d);
                    androidx.compose.runtime.s.p(rVar, Integer.valueOf(iHashCode), androidx.compose.ui.node.f.f);
                    androidx.compose.runtime.s.t(rVar, androidx.compose.ui.node.f.g);
                    androidx.compose.runtime.s.x(rVar, rVarC, androidx.compose.ui.node.f.c);
                    Context context = (Context) rVar.j(androidx.compose.ui.platform.m0.b);
                    Resources resources = (Resources) rVar.j(androidx.compose.ui.platform.m0.c);
                    Resources.Theme theme = context.getTheme();
                    ThreadLocal threadLocal = androidx.core.content.res.j.a;
                    long jC = androidx.compose.ui.graphics.a0.c(resources.getColor(R.color.gray_medium, theme));
                    if (str == null || kotlin.text.k.d0(str)) {
                        rVar.b0(-1543719673);
                        f1.a(androidx.room.r.q(R.drawable.ic_menu_live_tv, rVar), str2, w0.l(oVar2, 42), jC, rVar, 392);
                        rVar.p(false);
                    } else {
                        rVar.b0(-1543436798);
                        Object objQ = rVar.Q();
                        if (objQ == fVar) {
                            objQ = androidx.compose.runtime.s.r(Boolean.FALSE);
                            rVar.l0(objQ);
                        }
                        y0 y0Var = (y0) objQ;
                        if (((Boolean) y0Var.getValue()).booleanValue()) {
                            rVar.b0(-1543332173);
                            f1.a(androidx.room.r.q(R.drawable.ic_menu_live_tv, rVar), str2, w0.l(oVar2, 42), jC, rVar, 392);
                            rVar.p(false);
                            z = false;
                        } else {
                            rVar.b0(-1543018794);
                            androidx.compose.ui.graphics.painter.b bVarQ = androidx.room.r.q(R.drawable.ic_menu_live_tv, rVar);
                            androidx.compose.ui.graphics.painter.b bVarQ2 = androidx.room.r.q(R.drawable.ic_menu_live_tv, rVar);
                            androidx.compose.ui.r rVarA = androidx.compose.ui.draw.h.a(w0.l(oVar2, 42), androidx.compose.foundation.shape.e.a(6));
                            Object objQ2 = rVar.Q();
                            if (objQ2 == fVar) {
                                objQ2 = new h2(y0Var, 7);
                                rVar.l0(objQ2);
                            }
                            coil3.compose.k.c(str, str2, rVarA, bVarQ, bVarQ2, (kotlin.jvm.functions.l) objQ2, androidx.compose.ui.layout.i.b, rVar, 100700160, 6, 31456);
                            str2 = str2;
                            z = false;
                            rVar.p(false);
                        }
                        rVar.p(z);
                    }
                    androidx.compose.foundation.layout.b.d(rVar, w0.f(oVar2, 6));
                    u2 u2Var = u3.a;
                    p3.b(str2, null, com.app.mlounge.ui.theme.b.l, 0L, null, 0L, new androidx.compose.ui.text.style.k(3), 0L, 2, false, 2, 0, ((t3) rVar.j(u2Var)).n, rVar, 384, 24960, 109562);
                    p3.b(str3 == null ? "" : str3, null, com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 2, false, 1, 0, ((t3) rVar.j(u2Var)).o, rVar, 384, 24960, 110586);
                    rVar.p(true);
                } else {
                    rVar.W();
                }
                return yVar;
            case 1:
                TmdbPersonDetail tmdbPersonDetail = (TmdbPersonDetail) obj4;
                kotlin.jvm.functions.a aVar = (kotlin.jvm.functions.a) obj6;
                y0 y0Var2 = (y0) obj5;
                androidx.compose.runtime.r rVar2 = (androidx.compose.runtime.r) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((androidx.compose.foundation.lazy.grid.j) obj).getClass();
                if (rVar2.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    androidx.compose.foundation.layout.c cVar = androidx.compose.foundation.layout.h.c;
                    androidx.compose.ui.h hVar2 = androidx.compose.ui.c.J;
                    androidx.compose.foundation.layout.v vVarA2 = androidx.compose.foundation.layout.t.a(cVar, hVar2, rVar2, 0);
                    int iHashCode2 = Long.hashCode(rVar2.T);
                    androidx.compose.runtime.internal.j jVarL2 = rVar2.l();
                    androidx.compose.ui.o oVar3 = androidx.compose.ui.o.b;
                    androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(rVar2, oVar3);
                    androidx.compose.ui.node.g.b.getClass();
                    androidx.compose.ui.node.y yVar3 = androidx.compose.ui.node.f.b;
                    rVar2.e0();
                    if (rVar2.S) {
                        rVar2.k(yVar3);
                    } else {
                        rVar2.o0();
                    }
                    androidx.compose.ui.node.e eVar = androidx.compose.ui.node.f.e;
                    androidx.compose.runtime.s.x(rVar2, vVarA2, eVar);
                    androidx.compose.ui.node.e eVar2 = androidx.compose.ui.node.f.d;
                    androidx.compose.runtime.s.x(rVar2, jVarL2, eVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode2);
                    androidx.compose.ui.node.e eVar3 = androidx.compose.ui.node.f.f;
                    androidx.compose.runtime.s.p(rVar2, numValueOf, eVar3);
                    androidx.compose.ui.node.d dVar2 = androidx.compose.ui.node.f.g;
                    androidx.compose.runtime.s.t(rVar2, dVar2);
                    androidx.compose.ui.node.e eVar4 = androidx.compose.ui.node.f.c;
                    androidx.compose.runtime.s.x(rVar2, rVarC2, eVar4);
                    androidx.compose.ui.r rVarE = androidx.compose.foundation.s.e(w0.f(w0.d(oVar3, 1.0f), org.mozilla.javascript.Context.VERSION_ES6), com.google.android.material.shape.g.l(com.google.common.base.c.q(new androidx.compose.ui.graphics.t(com.app.mlounge.ui.theme.b.b), new androidx.compose.ui.graphics.t(com.app.mlounge.ui.theme.b.a)), 0.0f, 0.0f, 14));
                    androidx.compose.ui.j jVar = androidx.compose.ui.c.e;
                    androidx.compose.ui.layout.q0 q0VarD = androidx.compose.foundation.layout.p.d(jVar, false);
                    int iHashCode3 = Long.hashCode(rVar2.T);
                    androidx.compose.runtime.internal.j jVarL3 = rVar2.l();
                    androidx.compose.ui.r rVarC3 = androidx.compose.ui.a.c(rVar2, rVarE);
                    rVar2.e0();
                    if (rVar2.S) {
                        rVar2.k(yVar3);
                    } else {
                        rVar2.o0();
                    }
                    androidx.compose.runtime.s.x(rVar2, q0VarD, eVar);
                    androidx.compose.runtime.s.x(rVar2, jVarL3, eVar2);
                    androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode3, rVar2, eVar3, rVar2, dVar2);
                    androidx.compose.runtime.s.x(rVar2, rVarC3, eVar4);
                    t2.e(aVar, androidx.compose.foundation.layout.b.o(androidx.compose.foundation.layout.b.e(oVar3, jVar), 8), false, null, null, null, com.app.mlounge.ui.screens.person.a.a, rVar2, 1572864, 60);
                    float f = 16;
                    androidx.compose.ui.r rVarO2 = androidx.compose.foundation.layout.b.o(androidx.compose.foundation.layout.b.e(oVar3, androidx.compose.ui.c.D), f);
                    t0 t0VarA = r0.a(androidx.compose.foundation.layout.h.a, androidx.compose.ui.c.G, rVar2, 0);
                    int iHashCode4 = Long.hashCode(rVar2.T);
                    androidx.compose.runtime.internal.j jVarL4 = rVar2.l();
                    androidx.compose.ui.r rVarC4 = androidx.compose.ui.a.c(rVar2, rVarO2);
                    rVar2.e0();
                    if (rVar2.S) {
                        rVar2.k(yVar3);
                    } else {
                        rVar2.o0();
                    }
                    androidx.compose.runtime.s.x(rVar2, t0VarA, eVar);
                    androidx.compose.runtime.s.x(rVar2, jVarL4, eVar2);
                    androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode4, rVar2, eVar3, rVar2, dVar2);
                    androidx.compose.runtime.s.x(rVar2, rVarC4, eVar4);
                    coil3.compose.k.a(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.h("https://image.tmdb.org/t/p/w500", tmdbPersonDetail.f()), tmdbPersonDetail.d(), androidx.compose.ui.draw.h.a(w0.l(oVar3, 100), androidx.compose.foundation.shape.e.a), null, androidx.compose.ui.layout.i.a, rVar2, 1572864, 1976);
                    androidx.compose.foundation.layout.b.d(rVar2, w0.p(oVar3, f));
                    a1 a1Var = new a1();
                    androidx.compose.foundation.layout.v vVarA3 = androidx.compose.foundation.layout.t.a(cVar, hVar2, rVar2, 0);
                    int iHashCode5 = Long.hashCode(rVar2.T);
                    androidx.compose.runtime.internal.j jVarL5 = rVar2.l();
                    androidx.compose.ui.r rVarC5 = androidx.compose.ui.a.c(rVar2, a1Var);
                    rVar2.e0();
                    if (rVar2.S) {
                        rVar2.k(yVar3);
                    } else {
                        rVar2.o0();
                    }
                    androidx.compose.runtime.s.x(rVar2, vVarA3, eVar);
                    androidx.compose.runtime.s.x(rVar2, jVarL5, eVar2);
                    androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode5, rVar2, eVar3, rVar2, dVar2);
                    androidx.compose.runtime.s.x(rVar2, rVarC5, eVar4);
                    String strD = tmdbPersonDetail.d();
                    String str4 = strD == null ? "" : strD;
                    u2 u2Var2 = u3.a;
                    androidx.compose.ui.text.m0 m0Var = ((t3) rVar2.j(u2Var2)).f;
                    long j = com.app.mlounge.ui.theme.b.l;
                    p3.b(str4, null, j, 0L, null, 0L, null, 0L, 0, false, 0, 0, m0Var, rVar2, 384, 0, 131066);
                    String strC = tmdbPersonDetail.c();
                    if (strC == null) {
                        rVar2.b0(1921364625);
                        rVar2.p(false);
                        z2 = false;
                    } else {
                        rVar2.b0(1921364626);
                        p3.b(strC, null, com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar2.j(u2Var2)).l, rVar2, 384, 0, 131066);
                        z2 = false;
                        rVar2.p(false);
                    }
                    String strB = tmdbPersonDetail.b();
                    if (strB == null) {
                        rVar2.b0(1921578060);
                        rVar2.p(z2);
                        z3 = false;
                    } else {
                        rVar2.b0(1921578061);
                        p3.b("Born: ".concat(strB), null, com.app.mlounge.ui.theme.b.n, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar2.j(u2Var2)).l, rVar2, 384, 0, 131066);
                        z3 = false;
                        rVar2.p(false);
                    }
                    String strE = tmdbPersonDetail.e();
                    if (strE == null) {
                        rVar2.b0(1921799989);
                        rVar2.p(z3);
                    } else {
                        rVar2.b0(1921799990);
                        p3.b(strE, null, com.app.mlounge.ui.theme.b.n, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar2.j(u2Var2)).l, rVar2, 384, 0, 131066);
                        rVar2.p(false);
                    }
                    rVar2.p(true);
                    rVar2.p(true);
                    rVar2.p(true);
                    String strA = tmdbPersonDetail.a();
                    if (strA == null || kotlin.text.k.d0(strA)) {
                        strA = null;
                    }
                    if (strA == null) {
                        rVar2.b0(-1112868100);
                        rVar2.p(false);
                        oVar = oVar3;
                    } else {
                        rVar2.b0(-1112868099);
                        oVar = oVar3;
                        p3.b("Biography", androidx.compose.foundation.layout.b.s(oVar3, 0.0f, 12, 0.0f, 0.0f, 13), j, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar2.j(u2Var2)).h, rVar2, 438, 0, 131064);
                        p3.b(strA, null, com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 2, false, 8, 0, ((t3) rVar2.j(u2Var2)).l, rVar2, 384, 24960, 110586);
                        rVar2.p(false);
                    }
                    if (((List) y0Var2.getValue()).isEmpty()) {
                        rVar2.b0(-1112171560);
                        rVar2.p(false);
                    } else {
                        rVar2.b0(-1112414693);
                        androidx.compose.foundation.layout.b.d(rVar2, w0.f(oVar, 12));
                        p3.b(androidx.privacysandbox.ads.adservices.java.internal.a.p("Filmography (", ((List) y0Var2.getValue()).size(), ")"), null, j, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar2.j(u2Var2)).h, rVar2, 384, 0, 131066);
                        rVar2.p(false);
                    }
                    rVar2.p(true);
                } else {
                    rVar2.W();
                }
                return yVar;
            case 2:
                kotlin.jvm.functions.a aVar2 = (kotlin.jvm.functions.a) obj4;
                List list = (List) obj6;
                kotlin.jvm.functions.l lVar = (kotlin.jvm.functions.l) obj5;
                androidx.compose.runtime.r rVar3 = (androidx.compose.runtime.r) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((androidx.compose.foundation.layout.w) obj).getClass();
                if (rVar3.T(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    androidx.compose.foundation.layout.v vVarA4 = androidx.compose.foundation.layout.t.a(androidx.compose.foundation.layout.h.c, androidx.compose.ui.c.J, rVar3, 0);
                    int iHashCode6 = Long.hashCode(rVar3.T);
                    androidx.compose.runtime.internal.j jVarL6 = rVar3.l();
                    androidx.compose.ui.r rVarC6 = androidx.compose.ui.a.c(rVar3, oVar2);
                    androidx.compose.ui.node.g.b.getClass();
                    androidx.compose.ui.node.y yVar4 = androidx.compose.ui.node.f.b;
                    rVar3.e0();
                    if (rVar3.S) {
                        rVar3.k(yVar4);
                    } else {
                        rVar3.o0();
                    }
                    androidx.compose.runtime.s.x(rVar3, vVarA4, androidx.compose.ui.node.f.e);
                    androidx.compose.runtime.s.x(rVar3, jVarL6, androidx.compose.ui.node.f.d);
                    androidx.compose.runtime.s.p(rVar3, Integer.valueOf(iHashCode6), androidx.compose.ui.node.f.f);
                    androidx.compose.runtime.s.t(rVar3, androidx.compose.ui.node.f.g);
                    androidx.compose.runtime.s.x(rVar3, rVarC6, androidx.compose.ui.node.f.c);
                    com.app.mlounge.ui.screens.player.i0.e("Audio Track", aVar2, rVar3, 6);
                    t2.d(null, 0.0f, androidx.compose.ui.graphics.t.b(0.1f, androidx.compose.ui.graphics.t.d), rVar3, 384, 3);
                    float f2 = 8;
                    androidx.compose.foundation.layout.m0 m0Var2 = new androidx.compose.foundation.layout.m0(f2, f2, f2, f2);
                    boolean zH = rVar3.h(list) | rVar3.f(lVar);
                    Object objQ3 = rVar3.Q();
                    if (zH || objQ3 == fVar) {
                        objQ3 = new androidx.datastore.core.t0(i2, list, lVar);
                        rVar3.l0(objQ3);
                    }
                    coil3.network.g.a(null, null, m0Var2, null, null, null, false, null, (kotlin.jvm.functions.l) objQ3, rVar3, 384, 507);
                    rVar3.p(true);
                } else {
                    rVar3.W();
                }
                return yVar;
            case 3:
                List list2 = (List) obj4;
                y0 y0Var3 = (y0) obj6;
                y0 y0Var4 = (y0) obj5;
                androidx.compose.runtime.r rVar4 = (androidx.compose.runtime.r) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((androidx.compose.foundation.layout.w) obj).getClass();
                if (rVar4.T(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    androidx.compose.runtime.internal.f fVarC = androidx.compose.runtime.internal.k.c(-1026691958, new androidx.compose.material3.m(y0Var3, 6), rVar4);
                    Object objQ4 = rVar4.Q();
                    if (objQ4 == fVar) {
                        objQ4 = new com.app.mlounge.ui.c0(y0Var3, y0Var4, 1);
                        rVar4.l0(objQ4);
                    }
                    androidx.compose.material3.p.b(fVarC, (kotlin.jvm.functions.a) objQ4, null, false, null, null, rVar4, 54);
                    ArrayList<String> arrayList = new ArrayList();
                    for (Object obj7 : list2) {
                        if (!kotlin.text.k.d0((String) obj7)) {
                            arrayList.add(obj7);
                        }
                    }
                    for (String str5 : arrayList) {
                        androidx.compose.runtime.internal.f fVarC2 = androidx.compose.runtime.internal.k.c(1791810362, new com.app.mlounge.ui.screens.player.h(str5, y0Var3, 0), rVar4);
                        boolean zF = rVar4.f(str5);
                        Object objQ5 = rVar4.Q();
                        if (zF || objQ5 == fVar) {
                            objQ5 = new androidx.compose.foundation.gestures.g(14, str5, y0Var3, y0Var4);
                            rVar4.l0(objQ5);
                        }
                        androidx.compose.material3.p.b(fVarC2, (kotlin.jvm.functions.a) objQ5, null, false, null, null, rVar4, 6);
                    }
                } else {
                    rVar4.W();
                }
                return yVar;
            case 4:
                com.app.mlounge.ui.theme.a aVar3 = (com.app.mlounge.ui.theme.a) obj4;
                k1 k1Var = (k1) obj6;
                com.app.mlounge.ui.theme.c cVar2 = (com.app.mlounge.ui.theme.c) obj5;
                androidx.compose.runtime.r rVar5 = (androidx.compose.runtime.r) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((androidx.compose.foundation.layout.w) obj).getClass();
                if (rVar5.T(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    androidx.compose.ui.graphics.vector.f fVarB = _COROUTINE.b.d;
                    if (fVarB == null) {
                        androidx.compose.ui.graphics.vector.e eVar5 = new androidx.compose.ui.graphics.vector.e("Filled.GridView", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        androidx.compose.ui.graphics.p0 p0Var = new androidx.compose.ui.graphics.p0(androidx.compose.ui.graphics.t.b);
                        androidx.compose.ui.graphics.vector.g gVar = new androidx.compose.ui.graphics.vector.g(0);
                        gVar.o(3.0f, 3.0f);
                        gVar.s(8.0f);
                        gVar.l(8.0f);
                        gVar.m(11.0f, 3.0f);
                        gVar.m(3.0f, 3.0f);
                        gVar.f();
                        gVar.o(9.0f, 9.0f);
                        gVar.m(5.0f, 9.0f);
                        gVar.m(5.0f, 5.0f);
                        gVar.l(4.0f);
                        gVar.s(4.0f);
                        gVar.f();
                        gVar.o(3.0f, 13.0f);
                        gVar.s(8.0f);
                        gVar.l(8.0f);
                        gVar.s(-8.0f);
                        gVar.m(3.0f, 13.0f);
                        gVar.f();
                        gVar.o(9.0f, 19.0f);
                        gVar.m(5.0f, 19.0f);
                        gVar.s(-4.0f);
                        gVar.l(4.0f);
                        gVar.s(4.0f);
                        gVar.f();
                        gVar.o(13.0f, 3.0f);
                        gVar.s(8.0f);
                        gVar.l(8.0f);
                        gVar.m(21.0f, 3.0f);
                        gVar.l(-8.0f);
                        gVar.f();
                        gVar.o(19.0f, 9.0f);
                        gVar.l(-4.0f);
                        gVar.m(15.0f, 5.0f);
                        gVar.l(4.0f);
                        gVar.s(4.0f);
                        gVar.f();
                        gVar.o(13.0f, 13.0f);
                        gVar.s(8.0f);
                        gVar.l(8.0f);
                        gVar.s(-8.0f);
                        gVar.l(-8.0f);
                        gVar.f();
                        gVar.o(19.0f, 19.0f);
                        gVar.l(-4.0f);
                        gVar.s(-4.0f);
                        gVar.l(4.0f);
                        gVar.s(4.0f);
                        gVar.f();
                        androidx.compose.ui.graphics.vector.e.a(eVar5, gVar.a, 1, p0Var);
                        fVarB = eVar5.b();
                        _COROUTINE.b.d = fVarB;
                    }
                    androidx.compose.ui.graphics.vector.f fVar2 = fVarB;
                    kotlin.enums.b bVar = com.app.mlounge.ui.theme.a.B;
                    ArrayList arrayList2 = new ArrayList(kotlin.collections.p.y(bVar, 10));
                    Iterator it = bVar.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((com.app.mlounge.ui.theme.a) it.next()).e);
                    }
                    String str6 = aVar3.e;
                    boolean zH2 = rVar5.h(k1Var);
                    Object objQ6 = rVar5.Q();
                    if (zH2 || objQ6 == fVar) {
                        objQ6 = new com.app.mlounge.ui.screens.settings.u(k1Var, 0);
                        rVar5.l0(objQ6);
                    }
                    com.app.mlounge.ui.screens.settings.e0.n("Card Size", "Size of content cards in grids", fVar2, arrayList2, str6, (kotlin.jvm.functions.l) objQ6, rVar5, 54);
                    androidx.compose.ui.graphics.vector.f fVarB2 = h1.h;
                    if (fVarB2 == null) {
                        androidx.compose.ui.graphics.vector.e eVar6 = new androidx.compose.ui.graphics.vector.e("Filled.TextFields", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i3 = androidx.compose.ui.graphics.vector.h0.a;
                        androidx.compose.ui.graphics.p0 p0Var2 = new androidx.compose.ui.graphics.p0(androidx.compose.ui.graphics.t.b);
                        androidx.compose.ui.graphics.vector.g gVar2 = new androidx.compose.ui.graphics.vector.g(0);
                        gVar2.o(2.5f, 4.0f);
                        gVar2.s(3.0f);
                        gVar2.l(5.0f);
                        gVar2.s(12.0f);
                        gVar2.l(3.0f);
                        gVar2.r(7.0f);
                        gVar2.l(5.0f);
                        gVar2.r(4.0f);
                        gVar2.k(2.5f);
                        gVar2.f();
                        gVar2.o(21.5f, 9.0f);
                        gVar2.l(-9.0f);
                        gVar2.s(3.0f);
                        gVar2.l(3.0f);
                        gVar2.s(7.0f);
                        gVar2.l(3.0f);
                        gVar2.s(-7.0f);
                        gVar2.l(3.0f);
                        gVar2.r(9.0f);
                        gVar2.f();
                        androidx.compose.ui.graphics.vector.e.a(eVar6, gVar2.a, 0, p0Var2);
                        fVarB2 = eVar6.b();
                        h1.h = fVarB2;
                    }
                    androidx.compose.ui.graphics.vector.f fVar3 = fVarB2;
                    kotlin.enums.b bVar2 = com.app.mlounge.ui.theme.c.B;
                    ArrayList arrayList3 = new ArrayList(kotlin.collections.p.y(bVar2, 10));
                    Iterator it2 = bVar2.iterator();
                    while (it2.hasNext()) {
                        arrayList3.add(((com.app.mlounge.ui.theme.c) it2.next()).e);
                    }
                    String str7 = cVar2.e;
                    boolean zH3 = rVar5.h(k1Var);
                    Object objQ7 = rVar5.Q();
                    if (zH3 || objQ7 == fVar) {
                        objQ7 = new com.app.mlounge.ui.screens.settings.u(k1Var, 1);
                        rVar5.l0(objQ7);
                    }
                    com.app.mlounge.ui.screens.settings.e0.n("Text Size", "Size of text throughout the app", fVar3, arrayList3, str7, (kotlin.jvm.functions.l) objQ7, rVar5, 54);
                } else {
                    rVar5.W();
                }
                return yVar;
            case 5:
                k1 k1Var2 = (k1) obj4;
                Context context2 = (Context) obj6;
                androidx.compose.runtime.t2 t2Var = (androidx.compose.runtime.t2) obj5;
                androidx.compose.runtime.r rVar6 = (androidx.compose.runtime.r) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((androidx.compose.foundation.layout.w) obj).getClass();
                if (rVar6.T(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    String str8 = ((Boolean) t2Var.getValue()).booleanValue() ? "Sharing spare resources to support CinemaHQ" : "Enable to help keep CinemaHQ free";
                    boolean zBooleanValue = ((Boolean) t2Var.getValue()).booleanValue();
                    boolean zH4 = rVar6.h(k1Var2) | rVar6.h(context2);
                    Object objQ8 = rVar6.Q();
                    if (zH4 || objQ8 == fVar) {
                        objQ8 = new androidx.datastore.core.t0(17, k1Var2, context2);
                        rVar6.l0(objQ8);
                    }
                    com.app.mlounge.ui.screens.settings.e0.r("Share Resources", str8, zBooleanValue, (kotlin.jvm.functions.l) objQ8, com.google.android.gms.dynamite.g.p(), false, rVar6, 6, 32);
                } else {
                    rVar6.W();
                }
                return yVar;
            case 6:
                x1 x1Var = (x1) obj6;
                TmdbTvDetailResponse tmdbTvDetailResponse = (TmdbTvDetailResponse) obj5;
                String str9 = (String) obj4;
                androidx.compose.runtime.r rVar7 = (androidx.compose.runtime.r) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((androidx.compose.foundation.lazy.d) obj).getClass();
                if (rVar7.T(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    float f3 = 16;
                    androidx.compose.ui.r rVarQ = androidx.compose.foundation.layout.b.q(oVar2, f3, 0.0f, 2);
                    androidx.compose.foundation.layout.a aVar4 = androidx.compose.foundation.layout.h.a;
                    androidx.compose.ui.i iVar = androidx.compose.ui.c.G;
                    t0 t0VarA2 = r0.a(aVar4, iVar, rVar7, 0);
                    int iHashCode7 = Long.hashCode(rVar7.T);
                    androidx.compose.runtime.internal.j jVarL7 = rVar7.l();
                    androidx.compose.ui.r rVarC7 = androidx.compose.ui.a.c(rVar7, rVarQ);
                    androidx.compose.ui.node.g.b.getClass();
                    androidx.compose.ui.node.y yVar5 = androidx.compose.ui.node.f.b;
                    rVar7.e0();
                    if (rVar7.S) {
                        rVar7.k(yVar5);
                    } else {
                        rVar7.o0();
                    }
                    androidx.compose.ui.node.e eVar7 = androidx.compose.ui.node.f.e;
                    androidx.compose.runtime.s.x(rVar7, t0VarA2, eVar7);
                    androidx.compose.ui.node.e eVar8 = androidx.compose.ui.node.f.d;
                    androidx.compose.runtime.s.x(rVar7, jVarL7, eVar8);
                    Integer numValueOf2 = Integer.valueOf(iHashCode7);
                    androidx.compose.ui.node.e eVar9 = androidx.compose.ui.node.f.f;
                    androidx.compose.runtime.s.p(rVar7, numValueOf2, eVar9);
                    androidx.compose.ui.node.d dVar3 = androidx.compose.ui.node.f.g;
                    androidx.compose.runtime.s.t(rVar7, dVar3);
                    androidx.compose.ui.node.e eVar10 = androidx.compose.ui.node.f.c;
                    androidx.compose.runtime.s.x(rVar7, rVarC7, eVar10);
                    String strM = tmdbTvDetailResponse.m();
                    x1Var.b.getClass();
                    String strB2 = com.app.mlounge.data.repository.j0.b(strM, "w500");
                    if (strB2 == null) {
                        strB2 = "";
                    }
                    float f4 = 8;
                    coil3.compose.k.a(strB2, tmdbTvDetailResponse.j(), androidx.compose.ui.draw.h.a(w0.f(w0.p(oVar2, 120), 180), androidx.compose.foundation.shape.e.a(f4)), null, androidx.compose.ui.layout.i.a, rVar7, 1572864, 1976);
                    androidx.compose.foundation.layout.b.d(rVar7, w0.p(oVar2, f3));
                    if (1.0f <= 0.0d) {
                        androidx.compose.foundation.layout.internal.a.a("invalid weight; must be greater than zero");
                    }
                    androidx.compose.ui.r rVarS = androidx.compose.foundation.layout.b.s(new androidx.compose.foundation.layout.h0(1.0f, true), 0.0f, f4, 0.0f, 0.0f, 13);
                    androidx.compose.foundation.layout.v vVarA5 = androidx.compose.foundation.layout.t.a(androidx.compose.foundation.layout.h.c, androidx.compose.ui.c.J, rVar7, 0);
                    int iHashCode8 = Long.hashCode(rVar7.T);
                    androidx.compose.runtime.internal.j jVarL8 = rVar7.l();
                    androidx.compose.ui.r rVarC8 = androidx.compose.ui.a.c(rVar7, rVarS);
                    rVar7.e0();
                    if (rVar7.S) {
                        rVar7.k(yVar5);
                    } else {
                        rVar7.o0();
                    }
                    androidx.compose.runtime.s.x(rVar7, vVarA5, eVar7);
                    androidx.compose.runtime.s.x(rVar7, jVarL8, eVar8);
                    androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode8, rVar7, eVar9, rVar7, dVar3);
                    androidx.compose.runtime.s.x(rVar7, rVarC8, eVar10);
                    String strJ = tmdbTvDetailResponse.j();
                    String str10 = strJ == null ? "" : strJ;
                    u2 u2Var3 = u3.a;
                    p3.b(str10, null, com.app.mlounge.ui.theme.b.l, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar7.j(u2Var3)).f, rVar7, 384, 0, 131066);
                    t0 t0VarA3 = r0.a(androidx.compose.foundation.layout.h.g(f4), iVar, rVar7, 6);
                    int iHashCode9 = Long.hashCode(rVar7.T);
                    androidx.compose.runtime.internal.j jVarL9 = rVar7.l();
                    androidx.compose.ui.r rVarC9 = androidx.compose.ui.a.c(rVar7, oVar2);
                    rVar7.e0();
                    if (rVar7.S) {
                        rVar7.k(yVar5);
                    } else {
                        rVar7.o0();
                    }
                    androidx.compose.runtime.s.x(rVar7, t0VarA3, eVar7);
                    androidx.compose.runtime.s.x(rVar7, jVarL9, eVar8);
                    androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode9, rVar7, eVar9, rVar7, dVar3);
                    androidx.compose.runtime.s.x(rVar7, rVarC9, eVar10);
                    f3.a(null, androidx.compose.foundation.shape.e.a(4), androidx.compose.ui.graphics.t.b(0.2f, com.app.mlounge.ui.theme.b.f), 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(-2071937597, new s(str9, 15), rVar7), rVar7, 12583296, Token.DOT);
                    Double dP = tmdbTvDetailResponse.p();
                    if (dP == null) {
                        rVar7.b0(43888797);
                        rVar7.p(false);
                    } else {
                        rVar7.b0(43888798);
                        p3.b("★ ".concat(String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(dP.doubleValue())}, 1))), null, com.app.mlounge.ui.theme.b.s, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar7.j(u2Var3)).n, rVar7, 384, 0, 131066);
                        rVar7.p(false);
                    }
                    rVar7.p(true);
                    String strF = tmdbTvDetailResponse.f();
                    String strY0 = strF != null ? kotlin.text.k.y0(4, strF) : null;
                    String strI = tmdbTvDetailResponse.i();
                    String strR = kotlin.collections.o.R(kotlin.collections.n.N(new String[]{strY0, strI != null ? kotlin.text.k.y0(4, strI) : null}), " - ", null, null, null, 62);
                    List listE = tmdbTvDetailResponse.e();
                    String strR2 = kotlin.collections.o.R(kotlin.collections.n.N(new String[]{strR, (listE == null || (num = (Integer) kotlin.collections.o.M(listE)) == null) ? "" : androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.d(num.intValue(), "min/ep")}), " • ", null, null, null, 62);
                    androidx.compose.ui.text.m0 m0Var3 = ((t3) rVar7.j(u2Var3)).l;
                    long j2 = com.app.mlounge.ui.theme.b.m;
                    p3.b(strR2, null, j2, 0L, null, 0L, null, 0L, 0, false, 0, 0, m0Var3, rVar7, 384, 0, 131066);
                    List listG = tmdbTvDetailResponse.g();
                    if (listG == null) {
                        rVar7.b0(-2106305978);
                        rVar7.p(false);
                    } else {
                        rVar7.b0(-2106305977);
                        Object objQ9 = rVar7.Q();
                        if (objQ9 == fVar) {
                            objQ9 = new com.app.mlounge.ui.screens.player.j0(6);
                            rVar7.l0(objQ9);
                        }
                        p3.b(kotlin.collections.o.R(listG, ", ", null, null, (kotlin.jvm.functions.l) objQ9, 30), null, j2, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar7.j(u2Var3)).l, rVar7, 384, 0, 131066);
                        rVar7.p(false);
                    }
                    rVar7.p(true);
                    rVar7.p(true);
                    androidx.compose.foundation.layout.b.d(rVar7, w0.f(oVar2, f3));
                } else {
                    rVar7.W();
                }
                return yVar;
            case 7:
                x1 x1Var2 = (x1) obj4;
                TmdbTvDetailResponse tmdbTvDetailResponse2 = (TmdbTvDetailResponse) obj6;
                androidx.compose.runtime.t2 t2Var2 = (androidx.compose.runtime.t2) obj5;
                androidx.compose.runtime.r rVar8 = (androidx.compose.runtime.r) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((androidx.compose.foundation.lazy.d) obj).getClass();
                if (rVar8.T(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    androidx.compose.ui.r rVarQ2 = androidx.compose.foundation.layout.b.q(w0.d(oVar2, 1.0f), 16, 0.0f, 2);
                    t0 t0VarA4 = r0.a(androidx.compose.foundation.layout.h.g(8), androidx.compose.ui.c.G, rVar8, 6);
                    int iHashCode10 = Long.hashCode(rVar8.T);
                    androidx.compose.runtime.internal.j jVarL10 = rVar8.l();
                    androidx.compose.ui.r rVarC10 = androidx.compose.ui.a.c(rVar8, rVarQ2);
                    androidx.compose.ui.node.g.b.getClass();
                    androidx.compose.ui.node.y yVar6 = androidx.compose.ui.node.f.b;
                    rVar8.e0();
                    if (rVar8.S) {
                        rVar8.k(yVar6);
                    } else {
                        rVar8.o0();
                    }
                    androidx.compose.runtime.s.x(rVar8, t0VarA4, androidx.compose.ui.node.f.e);
                    androidx.compose.runtime.s.x(rVar8, jVarL10, androidx.compose.ui.node.f.d);
                    androidx.compose.runtime.s.p(rVar8, Integer.valueOf(iHashCode10), androidx.compose.ui.node.f.f);
                    androidx.compose.runtime.s.t(rVar8, androidx.compose.ui.node.f.g);
                    androidx.compose.runtime.s.x(rVar8, rVarC10, androidx.compose.ui.node.f.c);
                    String str11 = ((Boolean) t2Var2.getValue()).booleanValue() ? "Favourited" : "Favourite";
                    androidx.compose.ui.graphics.vector.f fVarP = ((Boolean) t2Var2.getValue()).booleanValue() ? com.google.android.gms.dynamite.g.p() : h1.n();
                    boolean zH5 = rVar8.h(x1Var2) | rVar8.h(tmdbTvDetailResponse2);
                    Object objQ10 = rVar8.Q();
                    if (zH5 || objQ10 == fVar) {
                        objQ10 = new com.app.mlounge.ui.screens.movies.g(12, x1Var2, tmdbTvDetailResponse2);
                        rVar8.l0(objQ10);
                    }
                    kotlin.jvm.functions.a aVar5 = (kotlin.jvm.functions.a) objQ10;
                    if (1.0f <= 0.0d) {
                        androidx.compose.foundation.layout.internal.a.a("invalid weight; must be greater than zero");
                    }
                    com.app.mlounge.ui.screens.movies.a.b(str11, fVarP, aVar5, new androidx.compose.foundation.layout.h0(1.0f, true), false, rVar8, 0, 48);
                    rVar8.p(true);
                } else {
                    rVar8.W();
                }
                return yVar;
            case 8:
                return d(obj, obj2, obj3);
            default:
                return BufferedChannel.onUndeliveredElementReceiveCancellationConstructor$lambda$57$lambda$56$lambda$55(this.y, (BufferedChannel) obj6, (SelectInstance) obj5, (Throwable) obj, obj2, (kotlin.coroutines.i) obj3);
        }
    }

    public /* synthetic */ d0(int i, Object obj, Object obj2, Object obj3) {
        this.e = i;
        this.y = obj;
        this.z = obj2;
        this.A = obj3;
    }
}
