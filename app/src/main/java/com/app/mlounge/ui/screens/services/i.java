package com.app.mlounge.ui.screens.services;

import android.content.Context;
import androidx.compose.foundation.layout.h0;
import androidx.compose.foundation.layout.r0;
import androidx.compose.foundation.layout.t;
import androidx.compose.foundation.layout.t0;
import androidx.compose.foundation.layout.v;
import androidx.compose.foundation.layout.w0;
import androidx.compose.material3.o2;
import androidx.compose.material3.p3;
import androidx.compose.material3.t2;
import androidx.compose.material3.t3;
import androidx.compose.material3.u3;
import androidx.compose.runtime.r;
import androidx.compose.runtime.s;
import androidx.compose.runtime.u2;
import androidx.compose.ui.layout.q0;
import androidx.compose.ui.node.y;
import androidx.compose.ui.o;
import androidx.compose.ui.text.m0;
import com.app.mlounge.data.remote.debrid.AllDebridPinData;
import com.app.mlounge.data.remote.debrid.AllDebridUserInfo;
import kotlin.jvm.functions.p;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i implements p {
    public final /* synthetic */ kotlin.jvm.functions.a A;
    public final /* synthetic */ kotlin.jvm.functions.a B;
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ com.app.mlounge.ui.viewmodel.d y;
    public final /* synthetic */ kotlin.jvm.functions.a z;

    public /* synthetic */ i(com.app.mlounge.ui.viewmodel.d dVar, kotlin.jvm.functions.a aVar, kotlin.jvm.functions.a aVar2, kotlin.jvm.functions.a aVar3) {
        this.y = dVar;
        this.z = aVar;
        this.A = aVar2;
        this.B = aVar3;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        o oVar;
        i iVar;
        boolean z;
        boolean z2;
        boolean z3;
        long j;
        o oVar2;
        int i;
        switch (this.e) {
            case 0:
                r rVar = (r) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (rVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    float f = 16;
                    o oVar3 = o.b;
                    androidx.compose.ui.r rVarO = androidx.compose.foundation.layout.b.o(oVar3, f);
                    androidx.compose.foundation.layout.c cVar = androidx.compose.foundation.layout.h.c;
                    androidx.compose.ui.h hVar = androidx.compose.ui.c.J;
                    v vVarA = t.a(cVar, hVar, rVar, 0);
                    int iHashCode = Long.hashCode(rVar.T);
                    androidx.compose.runtime.internal.j jVarL = rVar.l();
                    androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(rVar, rVarO);
                    androidx.compose.ui.node.g.b.getClass();
                    y yVar = androidx.compose.ui.node.f.b;
                    rVar.e0();
                    if (rVar.S) {
                        rVar.k(yVar);
                    } else {
                        rVar.o0();
                    }
                    androidx.compose.ui.node.e eVar = androidx.compose.ui.node.f.e;
                    s.x(rVar, vVarA, eVar);
                    androidx.compose.ui.node.e eVar2 = androidx.compose.ui.node.f.d;
                    s.x(rVar, jVarL, eVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    androidx.compose.ui.node.e eVar3 = androidx.compose.ui.node.f.f;
                    s.p(rVar, numValueOf, eVar3);
                    androidx.compose.ui.node.d dVar = androidx.compose.ui.node.f.g;
                    s.t(rVar, dVar);
                    androidx.compose.ui.node.e eVar4 = androidx.compose.ui.node.f.c;
                    s.x(rVar, rVarC, eVar4);
                    t0 t0VarA = r0.a(androidx.compose.foundation.layout.h.a, androidx.compose.ui.c.H, rVar, 48);
                    int iHashCode2 = Long.hashCode(rVar.T);
                    androidx.compose.runtime.internal.j jVarL2 = rVar.l();
                    androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(rVar, oVar3);
                    rVar.e0();
                    if (rVar.S) {
                        rVar.k(yVar);
                    } else {
                        rVar.o0();
                    }
                    s.x(rVar, t0VarA, eVar);
                    s.x(rVar, jVarL2, eVar2);
                    androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode2, rVar, eVar3, rVar, dVar);
                    s.x(rVar, rVarC2, eVar4);
                    if (1.0f <= 0.0d) {
                        androidx.compose.foundation.layout.internal.a.a("invalid weight; must be greater than zero");
                    }
                    h0 h0Var = new h0(1.0f, true);
                    v vVarA2 = t.a(cVar, hVar, rVar, 0);
                    int iHashCode3 = Long.hashCode(rVar.T);
                    androidx.compose.runtime.internal.j jVarL3 = rVar.l();
                    androidx.compose.ui.r rVarC3 = androidx.compose.ui.a.c(rVar, h0Var);
                    rVar.e0();
                    if (rVar.S) {
                        rVar.k(yVar);
                    } else {
                        rVar.o0();
                    }
                    s.x(rVar, vVarA2, eVar);
                    s.x(rVar, jVarL3, eVar2);
                    androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode3, rVar, eVar3, rVar, dVar);
                    s.x(rVar, rVarC3, eVar4);
                    u2 u2Var = u3.a;
                    p3.b("AllDebrid", null, com.app.mlounge.ui.theme.b.l, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar.j(u2Var)).h, rVar, 390, 0, 131066);
                    m0 m0Var = ((t3) rVar.j(u2Var)).l;
                    long j2 = com.app.mlounge.ui.theme.b.m;
                    p3.b("Premium link host and torrent downloader", null, j2, 0L, null, 0L, null, 0L, 0, false, 0, 0, m0Var, rVar, 390, 0, 131066);
                    r rVar2 = rVar;
                    rVar2.p(true);
                    com.app.mlounge.ui.viewmodel.d dVar2 = this.y;
                    boolean z4 = dVar2.a;
                    boolean z5 = dVar2.b;
                    AllDebridPinData allDebridPinData = dVar2.d;
                    AllDebridUserInfo allDebridUserInfo = dVar2.c;
                    n.l(z4, rVar2, 0);
                    rVar2.p(true);
                    androidx.compose.foundation.layout.b.d(rVar2, w0.f(oVar3, 12));
                    if (dVar2.a) {
                        rVar2.b0(101751125);
                        if (z5) {
                            rVar2.b0(101735470);
                            androidx.compose.ui.r rVarO2 = androidx.compose.foundation.layout.b.o(w0.d(oVar3, 1.0f), f);
                            q0 q0VarD = androidx.compose.foundation.layout.p.d(androidx.compose.ui.c.B, false);
                            int iHashCode4 = Long.hashCode(rVar2.T);
                            androidx.compose.runtime.internal.j jVarL4 = rVar2.l();
                            androidx.compose.ui.r rVarC4 = androidx.compose.ui.a.c(rVar2, rVarO2);
                            rVar2.e0();
                            if (rVar2.S) {
                                rVar2.k(yVar);
                            } else {
                                rVar2.o0();
                            }
                            s.x(rVar2, q0VarD, eVar);
                            s.x(rVar2, jVarL4, eVar2);
                            androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode4, rVar2, eVar3, rVar2, dVar);
                            s.x(rVar2, rVarC4, eVar4);
                            j = j2;
                            i = 8;
                            oVar2 = oVar3;
                            z3 = false;
                            o2.a(w0.l(oVar3, 24), com.app.mlounge.ui.theme.b.f, 0.0f, 0L, 0, 0.0f, rVar2, 54, 60);
                            rVar2.p(true);
                            rVar2.p(false);
                        } else {
                            z3 = false;
                            j = j2;
                            oVar2 = oVar3;
                            i = 8;
                            if (allDebridUserInfo != null) {
                                rVar2.b0(102035643);
                                kotlin.collections.builders.b bVarH = com.google.common.base.c.h();
                                bVarH.add(new kotlin.k("Username", allDebridUserInfo.b()));
                                bVarH.add(new kotlin.k("Email", allDebridUserInfo.a()));
                                bVarH.add(new kotlin.k("Premium", allDebridUserInfo.c() ? "Yes" : "No"));
                                n.a(com.google.common.base.c.c(bVarH), rVar2, 0);
                                rVar2.p(false);
                            } else {
                                rVar2.b0(102430614);
                                rVar2.p(false);
                            }
                        }
                        androidx.compose.foundation.layout.b.d(rVar2, w0.f(oVar2, i));
                        Context context = (Context) rVar2.j(androidx.compose.ui.platform.m0.b);
                        float f2 = 4;
                        o oVar4 = oVar2;
                        p3.b("NOTE: Comet provider may require you to confirm access at alldebrid.com/apikeys/", androidx.compose.foundation.layout.b.q(w0.d(oVar2, 1.0f), 0.0f, f2, 1), j, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar2.j(u2Var)).l, rVar2, 438, 0, 131064);
                        rVar2 = rVar2;
                        androidx.compose.foundation.layout.b.d(rVar2, w0.f(oVar4, f2));
                        boolean zH = rVar2.h(context);
                        Object objQ = rVar2.Q();
                        if (zH || objQ == androidx.compose.runtime.m.a) {
                            objQ = new androidx.navigation.compose.p(context, 4);
                            rVar2.l0(objQ);
                        }
                        kotlin.jvm.functions.a aVar = (kotlin.jvm.functions.a) objQ;
                        float f3 = 0;
                        t2.h(aVar, androidx.compose.foundation.layout.b.o(oVar4, f3), false, null, null, new androidx.compose.foundation.layout.m0(f3, f3, f3, f3), null, a.a, rVar2, 817889328, 380);
                        androidx.compose.foundation.layout.b.d(rVar2, w0.f(oVar4, f2));
                        n.g(this.z, rVar2, 0);
                        rVar2.p(false);
                    } else if (!dVar2.e || allDebridPinData == null) {
                        rVar2.b0(104161096);
                        if (dVar2.f != null) {
                            rVar2.b0(104219903);
                            z = z5;
                            oVar = oVar3;
                            z2 = false;
                            iVar = this;
                            p3.b(dVar2.f, androidx.compose.foundation.layout.b.s(oVar3, 0.0f, 0.0f, 0.0f, 8, 7), com.app.mlounge.ui.theme.b.o, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar2.j(u2Var)).l, rVar2, 432, 0, 131064);
                            rVar2 = rVar2;
                            rVar2.p(false);
                        } else {
                            oVar = oVar3;
                            iVar = this;
                            z = z5;
                            z2 = false;
                            rVar2.b0(104386838);
                            rVar2.p(false);
                        }
                        n.k("Sign In with AllDebrid", z, iVar.B, rVar2, 6);
                        androidx.compose.foundation.layout.b.d(rVar2, w0.f(oVar, 8));
                        n.d("https://alldebrid.com/", rVar2, 6);
                        rVar2.p(z2);
                    } else {
                        rVar2.b0(103880639);
                        n.e(allDebridPinData.b(), allDebridPinData.c(), this.A, rVar2, 0);
                        rVar2.p(false);
                    }
                    rVar2.p(true);
                } else {
                    rVar.W();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                n.b(this.y, this.z, this.A, this.B, (r) obj, s.A(1));
                break;
        }
        return kotlin.y.a;
    }

    public /* synthetic */ i(com.app.mlounge.ui.viewmodel.d dVar, kotlin.jvm.functions.a aVar, kotlin.jvm.functions.a aVar2, kotlin.jvm.functions.a aVar3, int i) {
        this.y = dVar;
        this.z = aVar;
        this.A = aVar2;
        this.B = aVar3;
    }
}
