package com.app.mlounge.ui.screens.anime;

import androidx.compose.foundation.layout.r0;
import androidx.compose.foundation.layout.t0;
import androidx.compose.foundation.layout.u0;
import androidx.compose.foundation.layout.w;
import androidx.compose.foundation.layout.w0;
import androidx.compose.runtime.s;
import androidx.compose.runtime.t2;
import androidx.compose.runtime.y0;
import androidx.compose.ui.focus.y;
import androidx.compose.ui.graphics.p0;
import androidx.compose.ui.graphics.t;
import androidx.compose.ui.graphics.vector.h0;
import androidx.datastore.preferences.protobuf.h1;
import com.app.mlounge.data.remote.model.HiAnimeDetailData;
import com.app.mlounge.data.remote.model.HiAnimeInfo;
import com.app.mlounge.ui.c0;
import com.app.mlounge.ui.screens.settings.e0;
import com.app.mlounge.ui.screens.settings.u;
import com.app.mlounge.ui.viewmodel.k1;
import java.util.List;
import kotlin.jvm.functions.q;
import kotlin.jvm.functions.r;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements q {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ Object E;
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ y0 y;
    public final /* synthetic */ t2 z;

    public /* synthetic */ e(y0 y0Var, com.app.mlounge.ui.viewmodel.g gVar, HiAnimeDetailData hiAnimeDetailData, r rVar, HiAnimeInfo hiAnimeInfo, y yVar, t2 t2Var) {
        this.y = y0Var;
        this.A = gVar;
        this.B = hiAnimeDetailData;
        this.C = rVar;
        this.D = hiAnimeInfo;
        this.E = yVar;
        this.z = t2Var;
    }

    @Override // kotlin.jvm.functions.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        androidx.compose.runtime.r rVar;
        float f;
        int i = this.e;
        kotlin.y yVar = kotlin.y.a;
        androidx.compose.runtime.f fVar = androidx.compose.runtime.m.a;
        Object obj4 = this.E;
        Object obj5 = this.D;
        t2 t2Var = this.z;
        Object obj6 = this.C;
        Object obj7 = this.B;
        Object obj8 = this.A;
        switch (i) {
            case 0:
                com.app.mlounge.ui.viewmodel.g gVar = (com.app.mlounge.ui.viewmodel.g) obj8;
                HiAnimeDetailData hiAnimeDetailData = (HiAnimeDetailData) obj7;
                r rVar2 = (r) obj6;
                HiAnimeInfo hiAnimeInfo = (HiAnimeInfo) obj5;
                y yVar2 = (y) obj4;
                androidx.compose.runtime.r rVar3 = (androidx.compose.runtime.r) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((androidx.compose.foundation.lazy.d) obj).getClass();
                if (!rVar3.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    rVar3.W();
                } else {
                    androidx.compose.ui.r rVarQ = androidx.compose.foundation.layout.b.q(w0.d(androidx.compose.ui.o.b, 1.0f), 16, 0.0f, 2);
                    t0 t0VarA = r0.a(androidx.compose.foundation.layout.h.g(8), androidx.compose.ui.c.G, rVar3, 6);
                    int iHashCode = Long.hashCode(rVar3.T);
                    androidx.compose.runtime.internal.j jVarL = rVar3.l();
                    androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(rVar3, rVarQ);
                    androidx.compose.ui.node.g.b.getClass();
                    androidx.compose.ui.node.y yVar3 = androidx.compose.ui.node.f.b;
                    rVar3.e0();
                    if (rVar3.S) {
                        rVar3.k(yVar3);
                    } else {
                        rVar3.o0();
                    }
                    s.x(rVar3, t0VarA, androidx.compose.ui.node.f.e);
                    s.x(rVar3, jVarL, androidx.compose.ui.node.f.d);
                    s.p(rVar3, Integer.valueOf(iHashCode), androidx.compose.ui.node.f.f);
                    s.t(rVar3, androidx.compose.ui.node.f.g);
                    s.x(rVar3, rVarC, androidx.compose.ui.node.f.c);
                    y0 y0Var = this.y;
                    if (((List) y0Var.getValue()).isEmpty()) {
                        rVar = rVar3;
                        f = 1.0f;
                        rVar.b0(-915921186);
                        rVar.p(false);
                    } else {
                        rVar3.b0(-916811072);
                        androidx.compose.ui.graphics.vector.f fVarW = kotlin.math.a.w();
                        boolean zF = rVar3.f(y0Var) | rVar3.h(gVar) | rVar3.h(hiAnimeDetailData) | rVar3.f(rVar2) | rVar3.f(hiAnimeInfo);
                        Object objQ = rVar3.Q();
                        if (zF || objQ == fVar) {
                            f = 1.0f;
                            b bVar = new b(y0Var, gVar, hiAnimeDetailData, rVar2, hiAnimeInfo, 0);
                            rVar3.l0(bVar);
                            objQ = bVar;
                        } else {
                            f = 1.0f;
                        }
                        com.app.mlounge.ui.screens.movies.a.b("Watch", fVarW, (kotlin.jvm.functions.a) objQ, androidx.compose.ui.focus.d.k(u0.a(f), yVar2), false, rVar3, 6, 48);
                        rVar = rVar3;
                        rVar.p(false);
                    }
                    String str = ((Boolean) t2Var.getValue()).booleanValue() ? "Favourited" : "Favourite";
                    androidx.compose.ui.graphics.vector.f fVarP = ((Boolean) t2Var.getValue()).booleanValue() ? com.google.android.gms.dynamite.g.p() : h1.n();
                    boolean zH = rVar.h(gVar) | rVar.h(hiAnimeDetailData);
                    Object objQ2 = rVar.Q();
                    if (zH || objQ2 == fVar) {
                        objQ2 = new androidx.activity.compose.f(26, gVar, hiAnimeDetailData);
                        rVar.l0(objQ2);
                    }
                    com.app.mlounge.ui.screens.movies.a.b(str, fVarP, (kotlin.jvm.functions.a) objQ2, u0.a(f), false, rVar, 0, 48);
                    rVar.p(true);
                }
                break;
            default:
                String str2 = (String) obj8;
                k1 k1Var = (k1) obj7;
                y0 y0Var2 = (y0) obj6;
                y0 y0Var3 = (y0) obj5;
                t2 t2Var2 = (t2) obj4;
                androidx.compose.runtime.r rVar4 = (androidx.compose.runtime.r) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((w) obj).getClass();
                if (!rVar4.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    rVar4.W();
                } else {
                    androidx.compose.ui.graphics.vector.f fVarB = okhttp3.internal.platform.android.g.z;
                    if (fVarB == null) {
                        androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e("Filled.FolderOpen", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i2 = h0.a;
                        p0 p0Var = new p0(t.b);
                        androidx.compose.ui.graphics.vector.g gVar2 = new androidx.compose.ui.graphics.vector.g(0);
                        gVar2.o(20.0f, 6.0f);
                        gVar2.l(-8.0f);
                        gVar2.n(-2.0f, -2.0f);
                        gVar2.m(4.0f, 4.0f);
                        gVar2.h(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
                        gVar2.m(2.0f, 18.0f);
                        gVar2.h(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                        gVar2.l(16.0f);
                        gVar2.h(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                        gVar2.m(22.0f, 8.0f);
                        gVar2.h(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                        gVar2.f();
                        gVar2.o(20.0f, 18.0f);
                        gVar2.m(4.0f, 18.0f);
                        gVar2.m(4.0f, 8.0f);
                        gVar2.l(16.0f);
                        gVar2.s(10.0f);
                        gVar2.f();
                        androidx.compose.ui.graphics.vector.e.a(eVar, gVar2.a, 0, p0Var);
                        fVarB = eVar.b();
                        okhttp3.internal.platform.android.g.z = fVarB;
                    }
                    androidx.compose.ui.graphics.vector.f fVar2 = fVarB;
                    Object objQ3 = rVar4.Q();
                    if (objQ3 == fVar) {
                        objQ3 = new c0(this.y, y0Var2, 3);
                        rVar4.l0(objQ3);
                    }
                    e0.o("Download Location", str2, fVar2, null, (kotlin.jvm.functions.a) objQ3, rVar4, 24582, 8);
                    String str3 = (String) t2Var.getValue();
                    if (str3 == null) {
                        str3 = "Built-in Downloader";
                    }
                    String str4 = str3;
                    androidx.compose.ui.graphics.vector.f fVarW2 = _COROUTINE.a.w();
                    Object objQ4 = rVar4.Q();
                    if (objQ4 == fVar) {
                        objQ4 = new com.app.mlounge.ui.screens.settings.q(y0Var3, 7);
                        rVar4.l0(objQ4);
                    }
                    e0.o("Download Manager", str4, fVarW2, null, (kotlin.jvm.functions.a) objQ4, rVar4, 24582, 8);
                    androidx.compose.ui.graphics.vector.f fVarW3 = _COROUTINE.a.w();
                    List listQ = com.google.common.base.c.q("1", "2", "3", "5");
                    String strValueOf = String.valueOf(((Number) t2Var2.getValue()).intValue());
                    boolean zH2 = rVar4.h(k1Var);
                    Object objQ5 = rVar4.Q();
                    if (zH2 || objQ5 == fVar) {
                        objQ5 = new u(k1Var, 5);
                        rVar4.l0(objQ5);
                    }
                    e0.n("Simultaneous Downloads", "Maximum number of downloads at once", fVarW3, listQ, strValueOf, (kotlin.jvm.functions.l) objQ5, rVar4, 3126);
                }
                break;
        }
        return yVar;
    }

    public /* synthetic */ e(String str, k1 k1Var, y0 y0Var, y0 y0Var2, y0 y0Var3, y0 y0Var4, y0 y0Var5) {
        this.A = str;
        this.B = k1Var;
        this.y = y0Var;
        this.C = y0Var2;
        this.z = y0Var3;
        this.D = y0Var4;
        this.E = y0Var5;
    }
}
