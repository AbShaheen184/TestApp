package com.app.mlounge.ui.screens.services;

import androidx.compose.foundation.layout.h0;
import androidx.compose.foundation.layout.r0;
import androidx.compose.foundation.layout.t;
import androidx.compose.foundation.layout.t0;
import androidx.compose.foundation.layout.v;
import androidx.compose.foundation.layout.w0;
import androidx.compose.material3.o2;
import androidx.compose.material3.p3;
import androidx.compose.material3.t3;
import androidx.compose.material3.u3;
import androidx.compose.runtime.r;
import androidx.compose.runtime.s;
import androidx.compose.runtime.u2;
import androidx.compose.ui.layout.q0;
import androidx.compose.ui.node.y;
import androidx.compose.ui.o;
import com.app.mlounge.data.remote.debrid.RealDebridDeviceCodeResponse;
import com.app.mlounge.data.remote.debrid.RealDebridUserInfo;
import com.app.mlounge.ui.viewmodel.n0;
import kotlin.jvm.functions.p;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements p {
    public final /* synthetic */ kotlin.jvm.functions.a A;
    public final /* synthetic */ kotlin.jvm.functions.a B;
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ n0 y;
    public final /* synthetic */ kotlin.jvm.functions.a z;

    public /* synthetic */ e(n0 n0Var, kotlin.jvm.functions.a aVar, kotlin.jvm.functions.a aVar2, kotlin.jvm.functions.a aVar3) {
        this.y = n0Var;
        this.z = aVar;
        this.A = aVar2;
        this.B = aVar3;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        e eVar;
        boolean z2;
        o oVar;
        int i;
        switch (this.e) {
            case 0:
                r rVar = (r) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (rVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    float f = 16;
                    o oVar2 = o.b;
                    androidx.compose.ui.r rVarO = androidx.compose.foundation.layout.b.o(oVar2, f);
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
                    androidx.compose.ui.node.e eVar2 = androidx.compose.ui.node.f.e;
                    s.x(rVar, vVarA, eVar2);
                    androidx.compose.ui.node.e eVar3 = androidx.compose.ui.node.f.d;
                    s.x(rVar, jVarL, eVar3);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    androidx.compose.ui.node.e eVar4 = androidx.compose.ui.node.f.f;
                    s.p(rVar, numValueOf, eVar4);
                    androidx.compose.ui.node.d dVar = androidx.compose.ui.node.f.g;
                    s.t(rVar, dVar);
                    androidx.compose.ui.node.e eVar5 = androidx.compose.ui.node.f.c;
                    s.x(rVar, rVarC, eVar5);
                    t0 t0VarA = r0.a(androidx.compose.foundation.layout.h.a, androidx.compose.ui.c.H, rVar, 48);
                    int iHashCode2 = Long.hashCode(rVar.T);
                    androidx.compose.runtime.internal.j jVarL2 = rVar.l();
                    androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(rVar, oVar2);
                    rVar.e0();
                    if (rVar.S) {
                        rVar.k(yVar);
                    } else {
                        rVar.o0();
                    }
                    s.x(rVar, t0VarA, eVar2);
                    s.x(rVar, jVarL2, eVar3);
                    androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode2, rVar, eVar4, rVar, dVar);
                    s.x(rVar, rVarC2, eVar5);
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
                    s.x(rVar, vVarA2, eVar2);
                    s.x(rVar, jVarL3, eVar3);
                    androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode3, rVar, eVar4, rVar, dVar);
                    s.x(rVar, rVarC3, eVar5);
                    u2 u2Var = u3.a;
                    boolean z3 = true;
                    p3.b("Real-Debrid", null, com.app.mlounge.ui.theme.b.l, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar.j(u2Var)).h, rVar, 390, 0, 131066);
                    p3.b("Premium multi-host service with torrent caching", null, com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar.j(u2Var)).l, rVar, 390, 0, 131066);
                    r rVar2 = rVar;
                    rVar2.p(true);
                    n0 n0Var = this.y;
                    boolean z4 = n0Var.a;
                    boolean z5 = n0Var.b;
                    RealDebridDeviceCodeResponse realDebridDeviceCodeResponse = n0Var.d;
                    RealDebridUserInfo realDebridUserInfo = n0Var.c;
                    n.l(z4, rVar2, 0);
                    rVar2.p(true);
                    androidx.compose.foundation.layout.b.d(rVar2, w0.f(oVar2, 12));
                    if (n0Var.a) {
                        rVar2.b0(-1275647050);
                        if (z5) {
                            rVar2.b0(-1275628636);
                            androidx.compose.ui.r rVarO2 = androidx.compose.foundation.layout.b.o(w0.d(oVar2, 1.0f), f);
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
                            s.x(rVar2, q0VarD, eVar2);
                            s.x(rVar2, jVarL4, eVar3);
                            androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode4, rVar2, eVar4, rVar2, dVar);
                            s.x(rVar2, rVarC4, eVar5);
                            i = 8;
                            o2.a(w0.l(oVar2, 24), com.app.mlounge.ui.theme.b.f, 0.0f, 0L, 0, 0.0f, rVar2, 54, 60);
                            rVar2.p(true);
                            rVar2.p(false);
                        } else {
                            i = 8;
                            if (realDebridUserInfo != null) {
                                rVar2.b0(-1275323100);
                                kotlin.collections.builders.b bVarH = com.google.common.base.c.h();
                                bVarH.add(new kotlin.k("Username", realDebridUserInfo.d()));
                                bVarH.add(new kotlin.k("Email", realDebridUserInfo.a()));
                                bVarH.add(new kotlin.k("Premium", realDebridUserInfo.c() > 0 ? "Yes" : "No"));
                                String strB = realDebridUserInfo.b();
                                if (strB != null) {
                                    bVarH.add(new kotlin.k("Expires", n.p(strB)));
                                }
                                n.a(com.google.common.base.c.c(bVarH), rVar2, 0);
                                rVar2.p(false);
                            } else {
                                rVar2.b0(-1274761876);
                                rVar2.p(false);
                            }
                        }
                        androidx.compose.foundation.layout.b.d(rVar2, w0.f(oVar2, i));
                        n.g(this.z, rVar2, 0);
                        rVar2.p(false);
                    } else {
                        if (!n0Var.e || realDebridDeviceCodeResponse == null) {
                            rVar2.b0(-1274247462);
                            if (n0Var.f != null) {
                                rVar2.b0(-1274188779);
                                z = z5;
                                oVar = oVar2;
                                z2 = false;
                                eVar = this;
                                p3.b(n0Var.f, androidx.compose.foundation.layout.b.s(oVar2, 0.0f, 0.0f, 0.0f, 8, 7), com.app.mlounge.ui.theme.b.o, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar2.j(u2Var)).l, rVar2, 432, 0, 131064);
                                rVar2 = rVar2;
                                rVar2.p(false);
                            } else {
                                z = z5;
                                eVar = this;
                                z2 = false;
                                oVar = oVar2;
                                rVar2.b0(-1274021844);
                                rVar2.p(false);
                            }
                            n.k("Sign In with Real-Debrid", z, eVar.B, rVar2, 6);
                            androidx.compose.foundation.layout.b.d(rVar2, w0.f(oVar, 8));
                            n.d("https://real-debrid.com/", rVar2, 6);
                            rVar2.p(z2);
                            z3 = true;
                        } else {
                            rVar2.b0(-1274561678);
                            n.e(realDebridDeviceCodeResponse.c(), realDebridDeviceCodeResponse.d(), this.A, rVar2, 0);
                            rVar2.p(false);
                        }
                        rVar2.p(z3);
                    }
                    rVar2.p(z3);
                } else {
                    rVar.W();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                n.i(this.y, this.z, this.A, this.B, (r) obj, s.A(1));
                break;
        }
        return kotlin.y.a;
    }

    public /* synthetic */ e(n0 n0Var, kotlin.jvm.functions.a aVar, kotlin.jvm.functions.a aVar2, kotlin.jvm.functions.a aVar3, int i) {
        this.y = n0Var;
        this.z = aVar;
        this.A = aVar2;
        this.B = aVar3;
    }
}
