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
import com.app.mlounge.data.remote.debrid.PremiumizeUserInfo;
import com.app.mlounge.ui.viewmodel.k0;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.functions.p;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements p {
    public final /* synthetic */ kotlin.jvm.functions.a A;
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ k0 y;
    public final /* synthetic */ kotlin.jvm.functions.l z;

    public /* synthetic */ j(k0 k0Var, kotlin.jvm.functions.a aVar, kotlin.jvm.functions.l lVar) {
        this.y = k0Var;
        this.A = aVar;
        this.z = lVar;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        j jVar;
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
                    androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(rVar, oVar2);
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
                    boolean z3 = true;
                    p3.b("Premiumize", null, com.app.mlounge.ui.theme.b.l, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar.j(u2Var)).h, rVar, 390, 0, 131066);
                    p3.b("Premium multi-host service with cloud storage", null, com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar.j(u2Var)).l, rVar, 390, 0, 131066);
                    r rVar2 = rVar;
                    rVar2.p(true);
                    k0 k0Var = this.y;
                    boolean z4 = k0Var.a;
                    boolean z5 = k0Var.b;
                    PremiumizeUserInfo premiumizeUserInfo = k0Var.c;
                    n.l(z4, rVar2, 0);
                    rVar2.p(true);
                    androidx.compose.foundation.layout.b.d(rVar2, w0.f(oVar2, 12));
                    if (k0Var.a) {
                        rVar2.b0(1641604234);
                        if (z5) {
                            rVar2.b0(1641615487);
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
                            s.x(rVar2, q0VarD, eVar);
                            s.x(rVar2, jVarL4, eVar2);
                            androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode4, rVar2, eVar3, rVar2, dVar);
                            s.x(rVar2, rVarC4, eVar4);
                            i = 8;
                            o2.a(w0.l(oVar2, 24), com.app.mlounge.ui.theme.b.f, 0.0f, 0L, 0, 0.0f, rVar2, 54, 60);
                            rVar2.p(true);
                            rVar2.p(false);
                        } else {
                            i = 8;
                            if (premiumizeUserInfo != null) {
                                rVar2.b0(1641909336);
                                kotlin.collections.builders.b bVarH = com.google.common.base.c.h();
                                String strA = premiumizeUserInfo.a();
                                String str = "Unknown";
                                if (strA == null) {
                                    strA = "Unknown";
                                }
                                bVarH.add(new kotlin.k("Customer ID", strA));
                                bVarH.add(new kotlin.k("Status", premiumizeUserInfo.d() ? "Premium" : "Free"));
                                Long lC = premiumizeUserInfo.c();
                                if (lC != null) {
                                    try {
                                        String str2 = new SimpleDateFormat("MMM dd, yyyy", Locale.US).format(new Date(lC.longValue() * ((long) 1000)));
                                        str2.getClass();
                                        str = str2;
                                    } catch (Exception unused) {
                                    }
                                    bVarH.add(new kotlin.k("Expires", str));
                                }
                                Double dB = premiumizeUserInfo.b();
                                if (dB != null) {
                                    bVarH.add(new kotlin.k("Fair Use", String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(dB.doubleValue() * ((double) 100))}, 1)).concat("%")));
                                }
                                n.a(com.google.common.base.c.c(bVarH), rVar2, 0);
                                rVar2.p(false);
                            } else {
                                rVar2.b0(1642584919);
                                rVar2.p(false);
                            }
                        }
                        androidx.compose.foundation.layout.b.d(rVar2, w0.f(oVar2, i));
                        n.g(this.A, rVar2, 0);
                        rVar2.p(false);
                    } else {
                        rVar2.b0(1642715925);
                        if (k0Var.d != null) {
                            rVar2.b0(1642768036);
                            z = z5;
                            oVar = oVar2;
                            z2 = false;
                            jVar = this;
                            p3.b(k0Var.d, androidx.compose.foundation.layout.b.s(oVar2, 0.0f, 0.0f, 0.0f, 8, 7), com.app.mlounge.ui.theme.b.o, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar2.j(u2Var)).l, rVar2, 432, 0, 131064);
                            rVar2 = rVar2;
                            rVar2.p(false);
                        } else {
                            z = z5;
                            jVar = this;
                            z2 = false;
                            oVar = oVar2;
                            rVar2.b0(1642927159);
                            rVar2.p(false);
                        }
                        n.c("Premiumize API Key", z, jVar.z, rVar2, 6);
                        androidx.compose.foundation.layout.b.d(rVar2, w0.f(oVar, 8));
                        n.d("https://www.premiumize.me/", rVar2, 6);
                        rVar2.p(z2);
                        z3 = true;
                    }
                    rVar2.p(z3);
                } else {
                    rVar.W();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                n.h(this.y, this.z, this.A, (r) obj, s.A(1));
                break;
        }
        return kotlin.y.a;
    }

    public /* synthetic */ j(k0 k0Var, kotlin.jvm.functions.l lVar, kotlin.jvm.functions.a aVar, int i) {
        this.y = k0Var;
        this.z = lVar;
        this.A = aVar;
    }
}
