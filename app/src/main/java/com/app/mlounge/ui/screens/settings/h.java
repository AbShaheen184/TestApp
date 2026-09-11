package com.app.mlounge.ui.screens.settings;

import androidx.compose.animation.core.i0;
import androidx.compose.foundation.layout.h0;
import androidx.compose.foundation.layout.r0;
import androidx.compose.foundation.layout.t0;
import androidx.compose.foundation.layout.w0;
import androidx.compose.material3.k0;
import androidx.compose.material3.n0;
import androidx.compose.material3.o0;
import androidx.compose.material3.p3;
import androidx.compose.material3.t3;
import androidx.compose.material3.u3;
import androidx.compose.material3.w2;
import androidx.compose.material3.z0;
import androidx.compose.runtime.t2;
import androidx.compose.runtime.y0;
import androidx.compose.ui.graphics.p0;
import androidx.compose.ui.text.m0;
import androidx.datastore.preferences.protobuf.h1;
import com.app.mlounge.ui.viewmodel.k1;
import java.io.File;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h implements kotlin.jvm.functions.q {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ t2 D;
    public final /* synthetic */ t2 E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ int e;
    public final /* synthetic */ y0 y;
    public final /* synthetic */ y0 z;

    public /* synthetic */ h(Object obj, Object obj2, Object obj3, y0 y0Var, y0 y0Var2, y0 y0Var3, y0 y0Var4, Object obj4, int i) {
        this.e = i;
        this.A = obj;
        this.B = obj2;
        this.C = obj3;
        this.y = y0Var;
        this.z = y0Var2;
        this.D = y0Var3;
        this.E = y0Var4;
        this.F = obj4;
    }

    @Override // kotlin.jvm.functions.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        androidx.compose.runtime.r rVar;
        int i;
        float f;
        androidx.compose.runtime.r rVar2;
        y0 y0Var;
        int i2;
        Object oVar;
        y0 y0Var2;
        String str;
        int i3;
        y0 y0Var3;
        int i4 = this.e;
        kotlin.y yVar = kotlin.y.a;
        int i5 = 8;
        androidx.compose.runtime.f fVar = androidx.compose.runtime.m.a;
        Object obj4 = this.F;
        t2 t2Var = this.E;
        t2 t2Var2 = this.D;
        Object obj5 = this.C;
        Object obj6 = this.B;
        Object obj7 = this.A;
        switch (i4) {
            case 0:
                String str2 = (String) obj7;
                List list = (List) obj6;
                kotlin.jvm.functions.a aVar = (kotlin.jvm.functions.a) obj5;
                y0 y0Var4 = (y0) t2Var2;
                y0 y0Var5 = (y0) t2Var;
                kotlin.jvm.functions.l lVar = (kotlin.jvm.functions.l) obj4;
                androidx.compose.runtime.r rVar3 = (androidx.compose.runtime.r) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                androidx.compose.ui.i iVar = androidx.compose.ui.c.H;
                ((androidx.compose.foundation.layout.w) obj).getClass();
                if (!rVar3.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    rVar3.W();
                    return yVar;
                }
                androidx.compose.foundation.layout.a0 a0Var = w0.c;
                androidx.compose.foundation.layout.v vVarA = androidx.compose.foundation.layout.t.a(androidx.compose.foundation.layout.h.c, androidx.compose.ui.c.J, rVar3, 0);
                int iHashCode = Long.hashCode(rVar3.T);
                androidx.compose.runtime.internal.j jVarL = rVar3.l();
                androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(rVar3, a0Var);
                androidx.compose.ui.node.g.b.getClass();
                androidx.compose.ui.node.y yVar2 = androidx.compose.ui.node.f.b;
                rVar3.e0();
                if (rVar3.S) {
                    rVar3.k(yVar2);
                } else {
                    rVar3.o0();
                }
                androidx.compose.ui.node.e eVar = androidx.compose.ui.node.f.e;
                androidx.compose.runtime.s.x(rVar3, vVarA, eVar);
                androidx.compose.ui.node.e eVar2 = androidx.compose.ui.node.f.d;
                androidx.compose.runtime.s.x(rVar3, jVarL, eVar2);
                Integer numValueOf = Integer.valueOf(iHashCode);
                androidx.compose.ui.node.e eVar3 = androidx.compose.ui.node.f.f;
                androidx.compose.runtime.s.p(rVar3, numValueOf, eVar3);
                androidx.compose.ui.node.d dVar = androidx.compose.ui.node.f.g;
                androidx.compose.runtime.s.t(rVar3, dVar);
                androidx.compose.ui.node.e eVar4 = androidx.compose.ui.node.f.c;
                androidx.compose.runtime.s.x(rVar3, rVarC, eVar4);
                androidx.compose.ui.o oVar2 = androidx.compose.ui.o.b;
                y0 y0Var6 = y0Var4;
                float f2 = 16;
                androidx.compose.ui.r rVarO = androidx.compose.foundation.layout.b.o(w0.d(oVar2, 1.0f), f2);
                t0 t0VarA = r0.a(androidx.compose.foundation.layout.h.e, iVar, rVar3, 54);
                int iHashCode2 = Long.hashCode(rVar3.T);
                androidx.compose.runtime.internal.j jVarL2 = rVar3.l();
                androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(rVar3, rVarO);
                rVar3.e0();
                if (rVar3.S) {
                    rVar3.k(yVar2);
                } else {
                    rVar3.o0();
                }
                androidx.compose.runtime.s.x(rVar3, t0VarA, eVar);
                androidx.compose.runtime.s.x(rVar3, jVarL2, eVar2);
                androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode2, rVar3, eVar3, rVar3, dVar);
                androidx.compose.runtime.s.x(rVar3, rVarC2, eVar4);
                m0 m0Var = ((t3) rVar3.j(u3.a)).g;
                long j = androidx.compose.ui.graphics.t.d;
                p3.b("Select Folder", null, j, 0L, null, 0L, null, 0L, 0, false, 0, 0, m0Var, rVar3, 390, 0, 131066);
                t0 t0VarA2 = r0.a(androidx.compose.foundation.layout.h.a, iVar, rVar3, 48);
                int iHashCode3 = Long.hashCode(rVar3.T);
                androidx.compose.runtime.internal.j jVarL3 = rVar3.l();
                androidx.compose.ui.r rVarC3 = androidx.compose.ui.a.c(rVar3, oVar2);
                rVar3.e0();
                if (rVar3.S) {
                    rVar3.k(yVar2);
                } else {
                    rVar3.o0();
                }
                androidx.compose.runtime.s.x(rVar3, t0VarA2, eVar);
                androidx.compose.runtime.s.x(rVar3, jVarL3, eVar2);
                androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode3, rVar3, eVar3, rVar3, dVar);
                androidx.compose.runtime.s.x(rVar3, rVarC3, eVar4);
                Object objQ = rVar3.Q();
                if (objQ == fVar) {
                    objQ = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar3);
                }
                androidx.compose.foundation.interaction.k kVar = (androidx.compose.foundation.interaction.k) objQ;
                y0 y0VarG = android.support.v4.media.session.b.g(kVar, rVar3, 6);
                Object objQ2 = rVar3.Q();
                if (objQ2 == fVar) {
                    objQ2 = new androidx.compose.foundation.lazy.n(this.y, 25);
                    rVar3.l0(objQ2);
                }
                kotlin.jvm.functions.a aVar2 = (kotlin.jvm.functions.a) objQ2;
                float f3 = 2;
                long j2 = ((Boolean) y0VarG.getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : androidx.compose.ui.graphics.t.h;
                androidx.compose.foundation.shape.d dVar2 = androidx.compose.foundation.shape.e.a;
                float f4 = 50;
                androidx.compose.foundation.shape.c cVar = new androidx.compose.foundation.shape.c(f4);
                androidx.compose.material3.t2.e(aVar2, androidx.compose.foundation.s.g(oVar2, f3, j2, new androidx.compose.foundation.shape.d(cVar, cVar, cVar, cVar)), false, null, kVar, null, b.o, rVar3, 1597446, 44);
                Object objQ3 = rVar3.Q();
                if (objQ3 == fVar) {
                    objQ3 = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar3);
                }
                androidx.compose.foundation.interaction.k kVar2 = (androidx.compose.foundation.interaction.k) objQ3;
                long j3 = ((Boolean) android.support.v4.media.session.b.g(kVar2, rVar3, 6).getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : androidx.compose.ui.graphics.t.h;
                androidx.compose.foundation.shape.c cVar2 = new androidx.compose.foundation.shape.c(f4);
                androidx.compose.material3.t2.e(aVar, androidx.compose.foundation.s.g(oVar2, f3, j3, new androidx.compose.foundation.shape.d(cVar2, cVar2, cVar2, cVar2)), false, null, kVar2, null, b.p, rVar3, 1597440, 44);
                rVar3.p(true);
                rVar3.p(true);
                y0 y0Var7 = this.z;
                String absolutePath = ((File) y0Var7.getValue()).getAbsolutePath();
                absolutePath.getClass();
                p3.b(absolutePath, androidx.compose.foundation.layout.b.q(oVar2, f2, 0.0f, 2), com.app.mlounge.ui.theme.b.f, h1.r(13), null, 0L, null, 0L, 0, false, 2, 0, null, rVar3, 24624, 24576, 245736);
                if (kotlin.text.k.d0(str2)) {
                    rVar = rVar3;
                    rVar.b0(-135732308);
                    rVar.p(false);
                } else {
                    rVar3.b0(-135996180);
                    p3.b(str2, androidx.compose.foundation.layout.b.p(oVar2, f2, f3), androidx.compose.ui.graphics.t.b(0.5f, j), h1.r(11), null, 0L, null, 0L, 0, false, 0, 0, null, rVar3, 25008, 0, 262120);
                    rVar = rVar3;
                    rVar.p(false);
                }
                if (list.size() > 1) {
                    rVar.b0(-135575324);
                    androidx.compose.ui.r rVarP = androidx.compose.foundation.layout.b.p(oVar2, f2, 4);
                    float f5 = 8;
                    t0 t0VarA3 = r0.a(androidx.compose.foundation.layout.h.g(f5), androidx.compose.ui.c.G, rVar, 6);
                    int iHashCode4 = Long.hashCode(rVar.T);
                    androidx.compose.runtime.internal.j jVarL4 = rVar.l();
                    androidx.compose.ui.r rVarC4 = androidx.compose.ui.a.c(rVar, rVarP);
                    rVar.e0();
                    y0 y0Var8 = y0Var7;
                    if (rVar.S) {
                        rVar.k(yVar2);
                    } else {
                        rVar.o0();
                    }
                    androidx.compose.runtime.s.x(rVar, t0VarA3, eVar);
                    androidx.compose.runtime.s.x(rVar, jVarL4, eVar2);
                    androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode4, rVar, eVar3, rVar, dVar);
                    androidx.compose.runtime.s.x(rVar, rVarC4, eVar4);
                    rVar.b0(1011322915);
                    Iterator it = list.iterator();
                    int i6 = 0;
                    while (it.hasNext()) {
                        Object next = it.next();
                        int i7 = i6 + 1;
                        if (i6 < 0) {
                            com.google.common.base.c.w();
                            throw null;
                        }
                        kotlin.k kVar3 = (kotlin.k) next;
                        File file = (File) kVar3.e;
                        String str3 = (String) kVar3.y;
                        Object objQ4 = rVar.Q();
                        if (objQ4 == fVar) {
                            objQ4 = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar);
                        }
                        androidx.compose.foundation.interaction.k kVar4 = (androidx.compose.foundation.interaction.k) objQ4;
                        y0 y0VarG2 = android.support.v4.media.session.b.g(kVar4, rVar, 6);
                        String absolutePath2 = ((File) y0Var8.getValue()).getAbsolutePath();
                        absolutePath2.getClass();
                        String absolutePath3 = file.getAbsolutePath();
                        absolutePath3.getClass();
                        boolean zO = kotlin.text.r.O(absolutePath2, absolutePath3, false);
                        androidx.compose.ui.r rVarG = androidx.compose.foundation.s.g(oVar2, f3, ((Boolean) y0VarG2.getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : androidx.compose.ui.graphics.t.h, androidx.compose.foundation.shape.e.a(f5));
                        float f6 = z0.a;
                        long j4 = androidx.compose.ui.graphics.t.h;
                        long j5 = com.app.mlounge.ui.theme.b.f;
                        long jB = androidx.compose.ui.graphics.t.b(0.2f, j5);
                        long j6 = androidx.compose.ui.graphics.t.d;
                        long j7 = androidx.compose.ui.graphics.t.i;
                        n0 n0Var = (n0) rVar.j(o0.a);
                        Iterator it2 = it;
                        w2 w2Var = n0Var.a0;
                        if (w2Var == null) {
                            long j8 = androidx.compose.ui.graphics.t.h;
                            w2Var = new w2(j8, o0.c(n0Var, androidx.compose.material3.tokens.l.t), o0.c(n0Var, androidx.compose.material3.tokens.l.x), o0.c(n0Var, androidx.compose.material3.tokens.l.B), j8, androidx.compose.ui.graphics.t.b(androidx.compose.material3.tokens.l.d, o0.c(n0Var, androidx.compose.material3.tokens.l.c)), androidx.compose.ui.graphics.t.b(androidx.compose.material3.tokens.l.v, o0.c(n0Var, androidx.compose.material3.tokens.l.u)), androidx.compose.ui.graphics.t.b(androidx.compose.material3.tokens.l.z, o0.c(n0Var, androidx.compose.material3.tokens.l.y)), o0.c(n0Var, androidx.compose.material3.tokens.l.k), androidx.compose.ui.graphics.t.b(androidx.compose.material3.tokens.l.h, o0.c(n0Var, androidx.compose.material3.tokens.l.g)), o0.c(n0Var, androidx.compose.material3.tokens.l.s), o0.c(n0Var, androidx.compose.material3.tokens.l.w), o0.c(n0Var, androidx.compose.material3.tokens.l.A));
                            n0Var.a0 = w2Var;
                        }
                        w2 w2Var2 = new w2(j4 != 16 ? j4 : w2Var.a, j6 != r3 ? j6 : w2Var.b, j7 != r3 ? j7 : w2Var.c, r3 != 0 ? j7 : w2Var.d, r3 != 0 ? j7 : w2Var.e, r3 != 0 ? j7 : w2Var.f, r3 != 0 ? j7 : w2Var.g, r3 != 0 ? j7 : w2Var.h, jB != r3 ? jB : w2Var.i, r3 != 0 ? j7 : w2Var.j, j5 != 16 ? j5 : w2Var.k, r3 != 0 ? j7 : w2Var.l, j7 != r3 ? j7 : w2Var.m);
                        boolean zD = rVar.d(i6) | rVar.h(file) | rVar.f(str3);
                        Object objQ5 = rVar.Q();
                        if (zD || objQ5 == fVar) {
                            y0Var2 = y0Var8;
                            y0 y0Var9 = y0Var6;
                            str = str3;
                            i3 = 13;
                            oVar = new o(i6, file, str, y0Var2, y0Var9);
                            y0Var3 = y0Var9;
                            rVar.l0(oVar);
                        } else {
                            oVar = objQ5;
                            y0Var2 = y0Var8;
                            y0Var3 = y0Var6;
                            str = str3;
                            i3 = 13;
                        }
                        androidx.compose.runtime.r rVar4 = rVar;
                        k0.b(zO, (kotlin.jvm.functions.a) oVar, androidx.compose.runtime.internal.k.c(1790140496, new com.app.mlounge.ui.components.s(str, i3), rVar), rVarG, false, null, w2Var2, null, null, kVar4, rVar4, 384);
                        f5 = f5;
                        y0Var8 = y0Var2;
                        i6 = i7;
                        rVar = rVar4;
                        y0Var6 = y0Var3;
                        it = it2;
                    }
                    rVar2 = rVar;
                    y0Var = y0Var8;
                    i = 4;
                    f = 0.0f;
                    i2 = 1;
                    androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.u(rVar2, false, true, false);
                } else {
                    i = 4;
                    f = 0.0f;
                    rVar2 = rVar;
                    y0Var = y0Var7;
                    i2 = 1;
                    rVar2.b0(-133691764);
                    rVar2.p(false);
                }
                long j9 = androidx.compose.ui.graphics.t.d;
                androidx.compose.runtime.r rVar5 = rVar2;
                androidx.compose.material3.t2.d(androidx.compose.foundation.layout.b.q(oVar2, f, i, i2), 0.0f, androidx.compose.ui.graphics.t.b(0.1f, j9), rVar5, 390, 2);
                if (1.0f <= 0.0d) {
                    androidx.compose.foundation.layout.internal.a.a("invalid weight; must be greater than zero");
                }
                androidx.compose.ui.r rVarD = w0.d(new h0(1.0f, true), 1.0f);
                float f7 = 8;
                androidx.compose.foundation.layout.m0 m0VarA = androidx.compose.foundation.layout.b.a(2, f7);
                boolean zH = rVar5.h(list);
                Object objQ6 = rVar5.Q();
                if (zH || objQ6 == fVar) {
                    objQ6 = new androidx.compose.animation.core.a(19, list, y0Var, y0Var5);
                    rVar5.l0(objQ6);
                }
                coil3.network.g.a(rVarD, null, m0VarA, null, null, null, false, null, (kotlin.jvm.functions.l) objQ6, rVar5, 384, 506);
                androidx.compose.material3.t2.d(null, 0.0f, androidx.compose.ui.graphics.t.b(0.1f, j9), rVar5, 384, 3);
                androidx.compose.ui.r rVarO2 = androidx.compose.foundation.layout.b.o(w0.d(oVar2, 1.0f), 12);
                t0 t0VarA4 = r0.a(androidx.compose.foundation.layout.h.b, iVar, rVar5, 54);
                int iHashCode5 = Long.hashCode(rVar5.T);
                androidx.compose.runtime.internal.j jVarL5 = rVar5.l();
                androidx.compose.ui.r rVarC5 = androidx.compose.ui.a.c(rVar5, rVarO2);
                androidx.compose.ui.node.g.b.getClass();
                androidx.compose.ui.node.y yVar3 = androidx.compose.ui.node.f.b;
                rVar5.e0();
                if (rVar5.S) {
                    rVar5.k(yVar3);
                } else {
                    rVar5.o0();
                }
                androidx.compose.runtime.s.x(rVar5, t0VarA4, androidx.compose.ui.node.f.e);
                androidx.compose.runtime.s.x(rVar5, jVarL5, androidx.compose.ui.node.f.d);
                androidx.compose.runtime.s.p(rVar5, Integer.valueOf(iHashCode5), androidx.compose.ui.node.f.f);
                androidx.compose.runtime.s.t(rVar5, androidx.compose.ui.node.f.g);
                androidx.compose.runtime.s.x(rVar5, rVarC5, androidx.compose.ui.node.f.c);
                Object objQ7 = rVar5.Q();
                if (objQ7 == fVar) {
                    objQ7 = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar5);
                }
                androidx.compose.foundation.interaction.k kVar5 = (androidx.compose.foundation.interaction.k) objQ7;
                androidx.compose.material3.t2.h(aVar, androidx.compose.foundation.s.g(oVar2, f3, ((Boolean) android.support.v4.media.session.b.g(kVar5, rVar5, 6).getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : androidx.compose.ui.graphics.t.h, androidx.compose.foundation.shape.e.a(f7)), false, null, null, null, kVar5, b.r, rVar5, 905969664, 252);
                androidx.compose.foundation.layout.b.d(rVar5, w0.p(oVar2, f7));
                Object objQ8 = rVar5.Q();
                if (objQ8 == fVar) {
                    objQ8 = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar5);
                }
                androidx.compose.foundation.interaction.k kVar6 = (androidx.compose.foundation.interaction.k) objQ8;
                y0 y0VarG3 = android.support.v4.media.session.b.g(kVar6, rVar5, 6);
                boolean zF = rVar5.f(lVar);
                Object objQ9 = rVar5.Q();
                if (zF || objQ9 == fVar) {
                    objQ9 = new com.app.mlounge.ui.screens.services.l(lVar, y0Var, 1);
                    rVar5.l0(objQ9);
                }
                androidx.compose.material3.t2.h((kotlin.jvm.functions.a) objQ9, androidx.compose.foundation.s.g(oVar2, f3, ((Boolean) y0VarG3.getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : androidx.compose.ui.graphics.t.h, androidx.compose.foundation.shape.e.a(f7)), false, null, null, null, kVar6, b.s, rVar5, 905969664, 252);
                rVar5.p(true);
                rVar5.p(true);
                return yVar;
            default:
                t2 t2Var3 = (t2) obj7;
                k1 k1Var = (k1) obj6;
                t2 t2Var4 = (t2) obj5;
                t2 t2Var5 = (t2) obj4;
                androidx.compose.runtime.r rVar6 = (androidx.compose.runtime.r) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((androidx.compose.foundation.layout.w) obj).getClass();
                if (rVar6.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    String str4 = ((Boolean) t2Var4.getValue()).booleanValue() ? "Adult content section is enabled" : "Enable adult content section";
                    boolean zBooleanValue = ((Boolean) t2Var4.getValue()).booleanValue();
                    boolean zF2 = rVar6.f(t2Var3) | rVar6.h(k1Var);
                    Object objQ10 = rVar6.Q();
                    if (zF2 || objQ10 == fVar) {
                        i0 i0Var = new i0((Object) k1Var, (Object) t2Var3, this.y, this.z, 12);
                        rVar6.l0(i0Var);
                        objQ10 = i0Var;
                    }
                    e0.r("Adult Section", str4, zBooleanValue, (kotlin.jvm.functions.l) objQ10, org.jsoup.helper.n.w(), false, rVar6, 6, 32);
                    boolean z = ((Boolean) t2Var2.getValue()).booleanValue() && ((Boolean) t2Var4.getValue()).booleanValue();
                    boolean zH2 = rVar6.h(k1Var);
                    Object objQ11 = rVar6.Q();
                    if (zH2 || objQ11 == fVar) {
                        objQ11 = new u(k1Var, 7);
                        rVar6.l0(objQ11);
                    }
                    e0.r("Include Adult in Search", "Show adult content in TMDB search results", z, (kotlin.jvm.functions.l) objQ11, com.google.android.gms.dynamite.g.r(), ((Boolean) t2Var4.getValue()).booleanValue(), rVar6, 54, 0);
                    boolean z2 = ((Boolean) t2Var.getValue()).booleanValue() && ((Boolean) t2Var4.getValue()).booleanValue();
                    boolean zH3 = rVar6.h(k1Var);
                    Object objQ12 = rVar6.Q();
                    if (zH3 || objQ12 == fVar) {
                        objQ12 = new u(k1Var, i5);
                        rVar6.l0(objQ12);
                    }
                    kotlin.jvm.functions.l lVar2 = (kotlin.jvm.functions.l) objQ12;
                    androidx.compose.ui.graphics.vector.f fVarB = kotlin.math.a.a;
                    if (fVarB == null) {
                        androidx.compose.ui.graphics.vector.e eVar5 = new androidx.compose.ui.graphics.vector.e("Filled.BookmarkBorder", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i8 = androidx.compose.ui.graphics.vector.h0.a;
                        p0 p0Var = new p0(androidx.compose.ui.graphics.t.b);
                        androidx.compose.ui.graphics.vector.g gVar = new androidx.compose.ui.graphics.vector.g(0);
                        gVar.o(17.0f, 3.0f);
                        gVar.m(7.0f, 3.0f);
                        gVar.h(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
                        gVar.m(5.0f, 21.0f);
                        gVar.n(7.0f, -3.0f);
                        gVar.n(7.0f, 3.0f);
                        gVar.m(19.0f, 5.0f);
                        gVar.h(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                        gVar.f();
                        gVar.o(17.0f, 18.0f);
                        gVar.n(-5.0f, -2.18f);
                        gVar.m(7.0f, 18.0f);
                        gVar.m(7.0f, 5.0f);
                        gVar.l(10.0f);
                        gVar.s(13.0f);
                        gVar.f();
                        androidx.compose.ui.graphics.vector.e.a(eVar5, gVar.a, 0, p0Var);
                        fVarB = eVar5.b();
                        kotlin.math.a.a = fVarB;
                    }
                    e0.r("Include Adult in Favourites", "Show adult items in your favourites", z2, lVar2, fVarB, ((Boolean) t2Var4.getValue()).booleanValue(), rVar6, 54, 0);
                    boolean z3 = ((Boolean) t2Var5.getValue()).booleanValue() && ((Boolean) t2Var4.getValue()).booleanValue();
                    boolean zH4 = rVar6.h(k1Var);
                    Object objQ13 = rVar6.Q();
                    if (zH4 || objQ13 == fVar) {
                        objQ13 = new u(k1Var, 9);
                        rVar6.l0(objQ13);
                    }
                    e0.r("Include Adult in History", "Show adult items in your history", z3, (kotlin.jvm.functions.l) objQ13, android.support.v4.media.session.b.v(), ((Boolean) t2Var4.getValue()).booleanValue(), rVar6, 54, 0);
                } else {
                    rVar6.W();
                }
                return yVar;
        }
    }
}
