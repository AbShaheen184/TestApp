package androidx.compose.foundation.gestures;

import android.content.Context;
import android.content.pm.PackageManager;
import androidx.compose.material3.p3;
import androidx.compose.material3.t3;
import androidx.compose.material3.u3;
import com.app.mlounge.data.remote.model.IptvChannel;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w1 implements kotlin.jvm.functions.p {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ w1(int i, Object obj, Object obj2, Object obj3) {
        this.e = i;
        this.y = obj;
        this.z = obj2;
        this.A = obj3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        androidx.compose.ui.node.e eVar;
        androidx.compose.ui.node.d dVar;
        float f;
        androidx.compose.ui.node.y yVar;
        androidx.compose.ui.o oVar;
        androidx.compose.ui.node.e eVar2;
        androidx.compose.ui.h hVar;
        String str;
        androidx.compose.runtime.r rVar;
        androidx.compose.ui.o oVar2;
        androidx.compose.ui.node.e eVar3;
        androidx.compose.ui.node.d dVar2;
        androidx.compose.ui.node.e eVar4;
        boolean z;
        boolean z2;
        boolean z3;
        androidx.compose.ui.h hVar2;
        androidx.compose.ui.node.e eVar5;
        boolean z4;
        com.app.mlounge.ui.screens.settings.f0 f0Var;
        Object fVar;
        kotlin.jvm.functions.p pVar;
        androidx.compose.ui.h hVar3;
        int i;
        Context context;
        androidx.compose.ui.o oVar3;
        androidx.compose.ui.i iVar;
        int i2;
        int i3;
        androidx.compose.ui.h hVar4;
        PackageManager packageManager;
        androidx.compose.runtime.r rVar2;
        switch (this.e) {
            case 0:
                kotlin.jvm.internal.w wVar = (kotlin.jvm.internal.w) this.y;
                m2 m2Var = (m2) this.z;
                l2 l2Var = (l2) this.A;
                float fFloatValue = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                long jH = m2Var.h(m2Var.d(fFloatValue - wVar.e));
                m2 m2Var2 = l2Var.a;
                wVar.e += m2Var.d(m2Var.g(m2Var2.c(m2Var2.k, jH, 1)));
                break;
            case 1:
                ((Integer) obj2).getClass();
                androidx.compose.foundation.text.n0.e((androidx.compose.ui.r) this.y, (androidx.compose.foundation.text.selection.c1) this.z, (androidx.compose.runtime.internal.f) this.A, (androidx.compose.runtime.r) obj, androidx.compose.runtime.s.A(385));
                break;
            case 2:
                androidx.compose.ui.r rVar3 = (androidx.compose.ui.r) this.y;
                androidx.compose.runtime.y0 y0Var = (androidx.compose.runtime.y0) this.z;
                androidx.compose.runtime.internal.f fVar2 = (androidx.compose.runtime.internal.f) this.A;
                androidx.compose.runtime.r rVar4 = (androidx.compose.runtime.r) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (rVar4.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    Object objQ = rVar4.Q();
                    if (objQ == androidx.compose.runtime.m.a) {
                        objQ = new h2(y0Var, 2);
                        rVar4.l0(objQ);
                    }
                    androidx.compose.ui.r rVarL = androidx.compose.ui.layout.a0.l(rVar3, (kotlin.jvm.functions.l) objQ);
                    androidx.compose.ui.layout.q0 q0VarD = androidx.compose.foundation.layout.p.d(androidx.compose.ui.c.e, true);
                    int iHashCode = Long.hashCode(rVar4.T);
                    androidx.compose.runtime.internal.j jVarL = rVar4.l();
                    androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(rVar4, rVarL);
                    androidx.compose.ui.node.g.b.getClass();
                    androidx.compose.ui.node.y yVar2 = androidx.compose.ui.node.f.b;
                    rVar4.e0();
                    if (rVar4.S) {
                        rVar4.k(yVar2);
                    } else {
                        rVar4.o0();
                    }
                    androidx.compose.runtime.s.x(rVar4, q0VarD, androidx.compose.ui.node.f.e);
                    androidx.compose.runtime.s.x(rVar4, jVarL, androidx.compose.ui.node.f.d);
                    androidx.compose.runtime.s.p(rVar4, Integer.valueOf(iHashCode), androidx.compose.ui.node.f.f);
                    androidx.compose.runtime.s.t(rVar4, androidx.compose.ui.node.f.g);
                    androidx.compose.runtime.s.x(rVar4, rVarC, androidx.compose.ui.node.f.c);
                    fVar2.invoke(rVar4, 0);
                    rVar4.p(true);
                } else {
                    rVar4.W();
                }
                return kotlin.y.a;
            case 3:
                ((Integer) obj2).getClass();
                android.support.v4.media.session.b.b((androidx.navigation.i) this.y, (androidx.compose.runtime.saveable.d) this.z, (androidx.compose.runtime.internal.f) this.A, (androidx.compose.runtime.r) obj, androidx.compose.runtime.s.A(385));
                break;
            case 4:
                CoroutineScope coroutineScope = (CoroutineScope) this.y;
                androidx.compose.animation.core.h1 h1Var = (androidx.compose.animation.core.h1) this.z;
                androidx.navigation.i iVar2 = (androidx.navigation.i) this.A;
                float fFloatValue2 = ((Float) obj).floatValue();
                ((Float) obj2).getClass();
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new androidx.compose.animation.core.c2(fFloatValue2, h1Var, iVar2, (kotlin.coroutines.d) null), 3, null);
                break;
            case 5:
                ((Integer) obj2).getClass();
                com.app.mlounge.ui.components.b0.i((String) this.y, (androidx.compose.ui.r) this.z, (kotlin.jvm.functions.a) this.A, (androidx.compose.runtime.r) obj, androidx.compose.runtime.s.A(1));
                break;
            case 6:
                String str2 = (String) this.y;
                androidx.compose.runtime.r rVar5 = (androidx.compose.runtime.r) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (rVar5.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    p3.b(str2, null, kotlin.jvm.internal.l.a(this.z, this.A) ? com.app.mlounge.ui.theme.b.f : com.app.mlounge.ui.theme.b.l, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, rVar5, 0, 0, 262138);
                } else {
                    rVar5.W();
                }
                return kotlin.y.a;
            case 7:
                String str3 = (String) this.y;
                String str4 = (String) this.z;
                androidx.compose.runtime.y0 y0Var2 = (androidx.compose.runtime.y0) this.A;
                androidx.compose.runtime.r rVar6 = (androidx.compose.runtime.r) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (rVar6.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    p3.b(str4, androidx.compose.foundation.layout.b.p(androidx.compose.ui.o.b, 12, 8), kotlin.jvm.internal.l.a((String) y0Var2.getValue(), str3) ? com.app.mlounge.ui.theme.b.f : com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar6.j(u3.a)).n, rVar6, 48, 0, 131064);
                } else {
                    rVar6.W();
                }
                return kotlin.y.a;
            case 8:
                String str5 = (String) this.y;
                String str6 = (String) this.z;
                String str7 = (String) this.A;
                androidx.compose.runtime.r rVar7 = (androidx.compose.runtime.r) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (rVar7.T(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    p3.b(str5, null, kotlin.jvm.internal.l.a(str6, str7) ? com.app.mlounge.ui.theme.b.f : com.app.mlounge.ui.theme.b.l, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, rVar7, 0, 0, 262138);
                } else {
                    rVar7.W();
                }
                return kotlin.y.a;
            case 9:
                com.app.mlounge.data.iptv.n nVar = (com.app.mlounge.data.iptv.n) this.y;
                IptvChannel iptvChannel = (IptvChannel) this.z;
                com.app.mlounge.data.iptv.n nVar2 = (com.app.mlounge.data.iptv.n) this.A;
                androidx.compose.runtime.r rVar8 = (androidx.compose.runtime.r) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (rVar8.T(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    androidx.compose.foundation.layout.c cVar = androidx.compose.foundation.layout.h.c;
                    androidx.compose.ui.h hVar5 = androidx.compose.ui.c.J;
                    androidx.compose.foundation.layout.v vVarA = androidx.compose.foundation.layout.t.a(cVar, hVar5, rVar8, 0);
                    int iHashCode2 = Long.hashCode(rVar8.T);
                    androidx.compose.runtime.internal.j jVarL2 = rVar8.l();
                    androidx.compose.ui.o oVar4 = androidx.compose.ui.o.b;
                    androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(rVar8, oVar4);
                    androidx.compose.ui.node.g.b.getClass();
                    androidx.compose.ui.node.y yVar3 = androidx.compose.ui.node.f.b;
                    rVar8.e0();
                    if (rVar8.S) {
                        rVar8.k(yVar3);
                    } else {
                        rVar8.o0();
                    }
                    androidx.compose.ui.node.e eVar6 = androidx.compose.ui.node.f.e;
                    androidx.compose.runtime.s.x(rVar8, vVarA, eVar6);
                    androidx.compose.ui.node.e eVar7 = androidx.compose.ui.node.f.d;
                    androidx.compose.runtime.s.x(rVar8, jVarL2, eVar7);
                    Integer numValueOf = Integer.valueOf(iHashCode2);
                    androidx.compose.ui.node.e eVar8 = androidx.compose.ui.node.f.f;
                    androidx.compose.runtime.s.p(rVar8, numValueOf, eVar8);
                    androidx.compose.ui.node.d dVar3 = androidx.compose.ui.node.f.g;
                    androidx.compose.runtime.s.t(rVar8, dVar3);
                    androidx.compose.ui.node.e eVar9 = androidx.compose.ui.node.f.c;
                    androidx.compose.runtime.s.x(rVar8, rVarC2, eVar9);
                    float f2 = 12;
                    float f3 = 8;
                    androidx.compose.ui.r rVarP = androidx.compose.foundation.layout.b.p(oVar4, f2, f3);
                    androidx.compose.foundation.layout.t0 t0VarA = androidx.compose.foundation.layout.r0.a(androidx.compose.foundation.layout.h.a, androidx.compose.ui.c.H, rVar8, 48);
                    int iHashCode3 = Long.hashCode(rVar8.T);
                    androidx.compose.runtime.internal.j jVarL3 = rVar8.l();
                    androidx.compose.ui.r rVarC3 = androidx.compose.ui.a.c(rVar8, rVarP);
                    rVar8.e0();
                    if (rVar8.S) {
                        rVar8.k(yVar3);
                    } else {
                        rVar8.o0();
                    }
                    androidx.compose.runtime.s.x(rVar8, t0VarA, eVar6);
                    androidx.compose.runtime.s.x(rVar8, jVarL3, eVar7);
                    androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode3, rVar8, eVar8, rVar8, dVar3);
                    androidx.compose.runtime.s.x(rVar8, rVarC3, eVar9);
                    String strB = iptvChannel.b();
                    if (strB == null || kotlin.text.k.d0(strB)) {
                        eVar = eVar7;
                        dVar = dVar3;
                        f = f2;
                        yVar = yVar3;
                        oVar = oVar4;
                        rVar8.b0(652794435);
                        eVar2 = eVar8;
                        hVar = hVar5;
                        androidx.compose.material3.f1.b(okhttp3.internal.platform.android.g.p(), iptvChannel.c(), androidx.compose.foundation.layout.b.o(androidx.compose.foundation.layout.w0.l(oVar, 52), 4), com.app.mlounge.ui.theme.b.m, rVar8, 384, 0);
                        rVar8.p(false);
                    } else {
                        rVar8.b0(653091694);
                        Object objQ2 = rVar8.Q();
                        androidx.compose.runtime.f fVar3 = androidx.compose.runtime.m.a;
                        if (objQ2 == fVar3) {
                            objQ2 = androidx.compose.runtime.s.r(Boolean.FALSE);
                            rVar8.l0(objQ2);
                        }
                        androidx.compose.runtime.y0 y0Var3 = (androidx.compose.runtime.y0) objQ2;
                        if (((Boolean) y0Var3.getValue()).booleanValue()) {
                            rVar8.b0(653211695);
                            eVar = eVar7;
                            f = f2;
                            oVar = oVar4;
                            hVar2 = hVar5;
                            androidx.compose.material3.f1.b(okhttp3.internal.platform.android.g.p(), iptvChannel.c(), androidx.compose.foundation.layout.b.o(androidx.compose.foundation.layout.w0.l(oVar4, 52), 4), com.app.mlounge.ui.theme.b.m, rVar8, 384, 0);
                            z4 = false;
                            rVar8.p(false);
                            dVar = dVar3;
                            eVar5 = eVar8;
                            yVar = yVar3;
                        } else {
                            hVar2 = hVar5;
                            oVar = oVar4;
                            f = f2;
                            rVar8.b0(653542124);
                            String strB2 = iptvChannel.b();
                            String strC = iptvChannel.c();
                            androidx.compose.ui.r rVarA = androidx.compose.ui.draw.h.a(androidx.compose.foundation.layout.w0.l(oVar, 52), androidx.compose.foundation.shape.e.a(6));
                            Object objQ3 = rVar8.Q();
                            if (objQ3 == fVar3) {
                                objQ3 = new h2(y0Var3, 9);
                                rVar8.l0(objQ3);
                            }
                            eVar = eVar7;
                            dVar = dVar3;
                            eVar5 = eVar8;
                            yVar = yVar3;
                            coil3.compose.k.a(strB2, strC, rVarA, (kotlin.jvm.functions.l) objQ3, androidx.compose.ui.layout.i.b, rVar8, 1597440, 1960);
                            z4 = false;
                            rVar8.p(false);
                        }
                        rVar8.p(z4);
                        eVar2 = eVar5;
                        hVar = hVar2;
                    }
                    androidx.compose.foundation.layout.b.d(rVar8, androidx.compose.foundation.layout.w0.p(oVar, f));
                    if (1.0f <= 0.0d) {
                        androidx.compose.foundation.layout.internal.a.a("invalid weight; must be greater than zero");
                    }
                    androidx.compose.foundation.layout.h0 h0Var = new androidx.compose.foundation.layout.h0(1.0f, true);
                    androidx.compose.foundation.layout.v vVarA2 = androidx.compose.foundation.layout.t.a(cVar, hVar, rVar8, 0);
                    int iHashCode4 = Long.hashCode(rVar8.T);
                    androidx.compose.runtime.internal.j jVarL4 = rVar8.l();
                    androidx.compose.ui.r rVarC4 = androidx.compose.ui.a.c(rVar8, h0Var);
                    rVar8.e0();
                    if (rVar8.S) {
                        rVar8.k(yVar);
                    } else {
                        rVar8.o0();
                    }
                    androidx.compose.runtime.s.x(rVar8, vVarA2, eVar6);
                    androidx.compose.runtime.s.x(rVar8, jVarL4, eVar);
                    androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode4, rVar8, eVar2, rVar8, dVar);
                    androidx.compose.runtime.s.x(rVar8, rVarC4, eVar9);
                    String strC2 = iptvChannel.c();
                    androidx.compose.runtime.u2 u2Var = u3.a;
                    androidx.compose.ui.node.e eVar10 = eVar;
                    androidx.compose.ui.node.e eVar11 = eVar6;
                    androidx.compose.ui.node.d dVar4 = dVar;
                    androidx.compose.ui.o oVar5 = oVar;
                    p3.b(strC2, null, com.app.mlounge.ui.theme.b.l, 0L, null, 0L, null, 0L, 2, false, 1, 0, ((t3) rVar8.j(u2Var)).m, rVar8, 0, 24960, 110586);
                    if (nVar != null) {
                        rVar8.b0(1060735693);
                        str = "HH:mm";
                        p3.b(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.h("▶  ", nVar.d()), null, com.app.mlounge.ui.theme.b.f, 0L, null, 0L, null, 0L, 2, false, 1, 0, ((t3) rVar8.j(u2Var)).k, rVar8, 0, 24960, 110586);
                        if (nVar2 != null) {
                            rVar = rVar8;
                            rVar.b0(1061149357);
                            String str8 = new SimpleDateFormat(str, Locale.getDefault()).format(new Date(nVar2.c()));
                            str8.getClass();
                            p3.b(coil3.compose.internal.f.e("Next ", str8, ": ", nVar2.d()), null, com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 2, false, 1, 0, ((t3) rVar.j(u2Var)).l, rVar, 0, 24960, 110586);
                            rVar = rVar;
                            z3 = false;
                            rVar.p(false);
                        } else {
                            rVar = rVar8;
                            z3 = false;
                            rVar.b0(1061554744);
                            rVar.p(false);
                        }
                        rVar.p(z3);
                    } else {
                        str = "HH:mm";
                        rVar8.b0(1061616310);
                        String strA = iptvChannel.a();
                        if (strA == null) {
                            strA = "";
                        }
                        p3.b(strA, null, com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 0, false, 1, 0, ((t3) rVar8.j(u2Var)).l, rVar8, 0, 24576, 114682);
                        rVar = rVar8;
                        rVar.p(false);
                    }
                    rVar.p(true);
                    if (nVar != null) {
                        rVar.b0(655791608);
                        int iA = (int) ((nVar.a() - System.currentTimeMillis()) / 60000);
                        if (iA < 0) {
                            iA = 0;
                        }
                        androidx.compose.ui.h hVar6 = androidx.compose.ui.c.L;
                        androidx.compose.ui.r rVarS = androidx.compose.foundation.layout.b.s(oVar5, f3, 0.0f, 0.0f, 0.0f, 14);
                        androidx.compose.foundation.layout.v vVarA3 = androidx.compose.foundation.layout.t.a(cVar, hVar6, rVar, 48);
                        int iHashCode5 = Long.hashCode(rVar.T);
                        androidx.compose.runtime.internal.j jVarL5 = rVar.l();
                        androidx.compose.ui.r rVarC5 = androidx.compose.ui.a.c(rVar, rVarS);
                        rVar.e0();
                        if (rVar.S) {
                            rVar.k(yVar);
                        } else {
                            rVar.o0();
                        }
                        androidx.compose.runtime.s.x(rVar, vVarA3, eVar11);
                        androidx.compose.runtime.s.x(rVar, jVarL5, eVar10);
                        androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode5, rVar, eVar2, rVar, dVar4);
                        androidx.compose.runtime.s.x(rVar, rVarC5, eVar9);
                        String str9 = new SimpleDateFormat(str, Locale.getDefault()).format(new Date(nVar.c()));
                        str9.getClass();
                        eVar11 = eVar11;
                        androidx.compose.runtime.r rVar9 = rVar;
                        eVar3 = eVar10;
                        eVar4 = eVar9;
                        dVar2 = dVar4;
                        oVar2 = oVar5;
                        p3.b(str9, null, com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar.j(u2Var)).o, rVar9, 0, 0, 131066);
                        p3.b(androidx.privacysandbox.ads.adservices.java.internal.a.p("-", iA, "m"), null, com.app.mlounge.ui.theme.b.n, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar9.j(u2Var)).o, rVar9, 0, 0, 131066);
                        rVar = rVar9;
                        z = true;
                        rVar.p(true);
                        rVar.p(false);
                    } else {
                        oVar2 = oVar5;
                        eVar3 = eVar10;
                        dVar2 = dVar4;
                        eVar4 = eVar9;
                        z = true;
                        rVar.b0(656539266);
                        rVar.p(false);
                    }
                    rVar.p(z);
                    if (nVar != null) {
                        rVar.b0(-2092979325);
                        androidx.compose.ui.r rVarF = androidx.compose.foundation.layout.w0.f(androidx.compose.foundation.layout.w0.d(oVar2, 1.0f), 2);
                        long jB = androidx.compose.ui.graphics.t.b(0.12f, androidx.compose.ui.graphics.t.d);
                        androidx.compose.ui.graphics.j0 j0Var = androidx.compose.ui.graphics.a0.b;
                        androidx.compose.ui.r rVarF2 = androidx.compose.foundation.s.f(rVarF, jB, j0Var);
                        androidx.compose.ui.layout.q0 q0VarD2 = androidx.compose.foundation.layout.p.d(androidx.compose.ui.c.e, false);
                        int iHashCode6 = Long.hashCode(rVar.T);
                        androidx.compose.runtime.internal.j jVarL6 = rVar.l();
                        androidx.compose.ui.r rVarC6 = androidx.compose.ui.a.c(rVar, rVarF2);
                        rVar.e0();
                        if (rVar.S) {
                            rVar.k(yVar);
                        } else {
                            rVar.o0();
                        }
                        androidx.compose.runtime.s.x(rVar, q0VarD2, eVar11);
                        androidx.compose.runtime.s.x(rVar, jVarL6, eVar3);
                        androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode6, rVar, eVar2, rVar, dVar2);
                        androidx.compose.runtime.s.x(rVar, rVarC6, eVar4);
                        androidx.compose.foundation.layout.p.a(androidx.compose.foundation.s.f(androidx.compose.foundation.layout.w0.c(androidx.compose.foundation.layout.w0.d(oVar2, nVar.b()), 1.0f), com.app.mlounge.ui.theme.b.f, j0Var), rVar, 0);
                        z2 = true;
                        rVar.p(true);
                        rVar.p(false);
                    } else {
                        z2 = true;
                        rVar.b0(-2092522850);
                        rVar.p(false);
                    }
                    rVar.p(z2);
                } else {
                    rVar8.W();
                }
                return kotlin.y.a;
            case 10:
                ((Integer) obj2).getClass();
                com.app.mlounge.ui.screens.music.a.c((kotlin.jvm.functions.l) this.y, (kotlin.jvm.functions.l) this.z, (com.app.mlounge.ui.viewmodel.h0) this.A, (androidx.compose.runtime.r) obj, androidx.compose.runtime.s.A(1));
                break;
            case 11:
                ((Integer) obj2).getClass();
                com.app.mlounge.ui.screens.player.i0.p((kotlin.jvm.functions.a) this.y, (kotlin.jvm.functions.a) this.z, (kotlin.jvm.functions.a) this.A, (androidx.compose.runtime.r) obj, androidx.compose.runtime.s.A(1));
                break;
            case 12:
                com.app.mlounge.data.repository.a aVar = (com.app.mlounge.data.repository.a) this.y;
                String str10 = (String) this.z;
                androidx.compose.runtime.y0 y0Var4 = (androidx.compose.runtime.y0) this.A;
                androidx.compose.runtime.r rVar10 = (androidx.compose.runtime.r) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (rVar10.T(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    p3.b(str10, androidx.compose.foundation.layout.b.p(androidx.compose.ui.o.b, 10, 6), ((com.app.mlounge.data.repository.a) y0Var4.getValue()) == aVar ? com.app.mlounge.ui.theme.b.f : com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar10.j(u3.a)).o, rVar10, 48, 0, 131064);
                } else {
                    rVar10.W();
                }
                return kotlin.y.a;
            case 13:
                ((Integer) obj2).getClass();
                com.app.mlounge.ui.screens.services.n.e((String) this.y, (String) this.z, (kotlin.jvm.functions.a) this.A, (androidx.compose.runtime.r) obj, androidx.compose.runtime.s.A(1));
                break;
            case 14:
                List list = (List) this.y;
                kotlin.jvm.functions.l lVar = (kotlin.jvm.functions.l) this.z;
                String str11 = (String) this.A;
                androidx.compose.runtime.r rVar11 = (androidx.compose.runtime.r) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                boolean z5 = false;
                boolean z6 = true;
                if (rVar11.T(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    androidx.compose.foundation.layout.v vVarA4 = androidx.compose.foundation.layout.t.a(androidx.compose.foundation.layout.h.c, androidx.compose.ui.c.J, rVar11, 0);
                    int iHashCode7 = Long.hashCode(rVar11.T);
                    androidx.compose.runtime.internal.j jVarL7 = rVar11.l();
                    androidx.compose.ui.o oVar6 = androidx.compose.ui.o.b;
                    androidx.compose.ui.r rVarC7 = androidx.compose.ui.a.c(rVar11, oVar6);
                    androidx.compose.ui.node.g.b.getClass();
                    androidx.compose.ui.node.y yVar4 = androidx.compose.ui.node.f.b;
                    rVar11.e0();
                    if (rVar11.S) {
                        rVar11.k(yVar4);
                    } else {
                        rVar11.o0();
                    }
                    androidx.compose.runtime.s.x(rVar11, vVarA4, androidx.compose.ui.node.f.e);
                    androidx.compose.runtime.s.x(rVar11, jVarL7, androidx.compose.ui.node.f.d);
                    androidx.compose.runtime.s.p(rVar11, Integer.valueOf(iHashCode7), androidx.compose.ui.node.f.f);
                    androidx.compose.runtime.s.t(rVar11, androidx.compose.ui.node.f.g);
                    androidx.compose.runtime.s.x(rVar11, rVarC7, androidx.compose.ui.node.f.c);
                    rVar11.b0(-1222499274);
                    for (Iterator it = list.iterator(); it.hasNext(); it = it) {
                        kotlin.k kVar = (kotlin.k) it.next();
                        String str12 = (String) kVar.e;
                        String str13 = (String) kVar.y;
                        androidx.compose.ui.r rVarD = androidx.compose.foundation.layout.w0.d(oVar6, 1.0f);
                        boolean zF = rVar11.f(lVar) | rVar11.f(str12);
                        Object objQ4 = rVar11.Q();
                        androidx.compose.runtime.f fVar4 = androidx.compose.runtime.m.a;
                        if (zF || objQ4 == fVar4) {
                            objQ4 = new com.app.mlounge.ui.components.l0(lVar, str12, 2);
                            rVar11.l0(objQ4);
                        }
                        androidx.compose.ui.r rVarP2 = androidx.compose.foundation.layout.b.p(androidx.compose.foundation.s.j(rVarD, z5, null, (kotlin.jvm.functions.a) objQ4, 15), 4, 12);
                        androidx.compose.foundation.layout.t0 t0VarA2 = androidx.compose.foundation.layout.r0.a(androidx.compose.foundation.layout.h.a, androidx.compose.ui.c.H, rVar11, 48);
                        int iHashCode8 = Long.hashCode(rVar11.T);
                        androidx.compose.runtime.internal.j jVarL8 = rVar11.l();
                        androidx.compose.ui.r rVarC8 = androidx.compose.ui.a.c(rVar11, rVarP2);
                        androidx.compose.ui.node.g.b.getClass();
                        androidx.compose.ui.node.y yVar5 = androidx.compose.ui.node.f.b;
                        rVar11.e0();
                        if (rVar11.S) {
                            rVar11.k(yVar5);
                        } else {
                            rVar11.o0();
                        }
                        androidx.compose.runtime.s.x(rVar11, t0VarA2, androidx.compose.ui.node.f.e);
                        androidx.compose.runtime.s.x(rVar11, jVarL8, androidx.compose.ui.node.f.d);
                        androidx.compose.runtime.s.p(rVar11, Integer.valueOf(iHashCode8), androidx.compose.ui.node.f.f);
                        androidx.compose.runtime.s.t(rVar11, androidx.compose.ui.node.f.g);
                        androidx.compose.runtime.s.x(rVar11, rVarC8, androidx.compose.ui.node.f.c);
                        boolean zA = kotlin.jvm.internal.l.a(str11, str12);
                        boolean zF2 = rVar11.f(lVar) | rVar11.f(str12);
                        Object objQ5 = rVar11.Q();
                        if (zF2 || objQ5 == fVar4) {
                            objQ5 = new com.app.mlounge.ui.components.l0(lVar, str12, 3);
                            rVar11.l0(objQ5);
                        }
                        androidx.compose.material3.r2.a(zA, (kotlin.jvm.functions.a) objQ5, null, false, androidx.compose.material3.t2.l(com.app.mlounge.ui.theme.b.f, com.app.mlounge.ui.theme.b.m, rVar11), rVar11, 0);
                        androidx.compose.foundation.layout.b.d(rVar11, androidx.compose.foundation.layout.w0.p(oVar6, 8));
                        androidx.compose.runtime.r rVar12 = rVar11;
                        p3.b(str13, null, com.app.mlounge.ui.theme.b.l, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar11.j(u3.a)).k, rVar12, 0, 0, 131066);
                        rVar11 = rVar12;
                        rVar11.p(true);
                        z6 = true;
                        oVar6 = oVar6;
                        z5 = false;
                    }
                    rVar11.p(z5);
                    rVar11.p(z6);
                } else {
                    rVar11.W();
                }
                return kotlin.y.a;
            case 15:
                ((Integer) obj2).getClass();
                com.app.mlounge.ui.screens.settings.e0.d((String) this.y, (kotlin.jvm.functions.l) this.z, (kotlin.jvm.functions.a) this.A, (androidx.compose.runtime.r) obj, androidx.compose.runtime.s.A(385));
                break;
            case 16:
                ((Integer) obj2).getClass();
                com.app.mlounge.ui.screens.settings.e0.h((kotlin.jvm.functions.p) this.y, (kotlin.jvm.functions.a) this.z, (kotlin.jvm.functions.a) this.A, (androidx.compose.runtime.r) obj, androidx.compose.runtime.s.A(433));
                break;
            case 17:
                kotlin.jvm.functions.p pVar2 = (kotlin.jvm.functions.p) this.y;
                PackageManager packageManager2 = (PackageManager) this.z;
                Context context2 = (Context) this.A;
                androidx.compose.runtime.r rVar13 = (androidx.compose.runtime.r) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                androidx.compose.ui.i iVar3 = androidx.compose.ui.c.H;
                androidx.compose.ui.h hVar7 = androidx.compose.ui.c.J;
                int i4 = 1;
                int i5 = 2;
                if (rVar13.T(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    androidx.compose.foundation.b2 b2VarO = androidx.compose.foundation.s.o(rVar13);
                    androidx.compose.ui.o oVar7 = androidx.compose.ui.o.b;
                    androidx.compose.ui.r rVarP3 = androidx.compose.foundation.s.p(oVar7, b2VarO, true);
                    androidx.compose.foundation.layout.v vVarA5 = androidx.compose.foundation.layout.t.a(androidx.compose.foundation.layout.h.c, hVar7, rVar13, 0);
                    int iHashCode9 = Long.hashCode(rVar13.T);
                    androidx.compose.runtime.internal.j jVarL9 = rVar13.l();
                    androidx.compose.ui.r rVarC9 = androidx.compose.ui.a.c(rVar13, rVarP3);
                    androidx.compose.ui.node.g.b.getClass();
                    kotlin.jvm.functions.a aVar2 = androidx.compose.ui.node.f.b;
                    rVar13.e0();
                    if (rVar13.S) {
                        rVar13.k(aVar2);
                    } else {
                        rVar13.o0();
                    }
                    androidx.compose.runtime.s.x(rVar13, vVarA5, androidx.compose.ui.node.f.e);
                    androidx.compose.runtime.s.x(rVar13, jVarL9, androidx.compose.ui.node.f.d);
                    androidx.compose.runtime.s.p(rVar13, Integer.valueOf(iHashCode9), androidx.compose.ui.node.f.f);
                    androidx.compose.runtime.s.t(rVar13, androidx.compose.ui.node.f.g);
                    androidx.compose.runtime.s.x(rVar13, rVarC9, androidx.compose.ui.node.f.c);
                    rVar13.b0(74567917);
                    androidx.compose.runtime.r rVar14 = rVar13;
                    for (com.app.mlounge.ui.screens.settings.f0 f0Var2 : com.app.mlounge.ui.screens.settings.e0.c) {
                        boolean zEquals = f0Var2.a.equals("internal");
                        Object obj3 = androidx.compose.runtime.m.a;
                        if (zEquals) {
                            rVar14.b0(-336249221);
                            Object objQ6 = rVar14.Q();
                            if (objQ6 == obj3) {
                                objQ6 = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar14);
                            }
                            androidx.compose.foundation.interaction.k kVar2 = (androidx.compose.foundation.interaction.k) objQ6;
                            androidx.compose.ui.r rVarG = androidx.compose.foundation.s.g(androidx.compose.foundation.layout.w0.d(oVar7, 1.0f), i5, ((Boolean) android.support.v4.media.session.b.g(kVar2, rVar14, 6).getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : androidx.compose.ui.graphics.t.h, androidx.compose.foundation.shape.e.a(8));
                            boolean zF3 = rVar14.f(pVar2);
                            Object objQ7 = rVar14.Q();
                            if (zF3 || objQ7 == obj3) {
                                objQ7 = new com.app.mlounge.ui.screens.settings.e(1, pVar2);
                                rVar14.l0(objQ7);
                            }
                            float f4 = 12;
                            androidx.compose.ui.r rVarP4 = androidx.compose.foundation.layout.b.p(androidx.compose.foundation.s.m(androidx.compose.foundation.s.i(rVarG, kVar2, null, false, null, (kotlin.jvm.functions.a) objQ7, 28), kVar2, i4), 4, f4);
                            androidx.compose.foundation.layout.t0 t0VarA3 = androidx.compose.foundation.layout.r0.a(androidx.compose.foundation.layout.h.a, iVar3, rVar14, 48);
                            int iHashCode10 = Long.hashCode(rVar14.T);
                            androidx.compose.runtime.internal.j jVarL10 = rVar14.l();
                            androidx.compose.ui.r rVarC10 = androidx.compose.ui.a.c(rVar14, rVarP4);
                            androidx.compose.ui.node.g.b.getClass();
                            kotlin.jvm.functions.a aVar3 = androidx.compose.ui.node.f.b;
                            rVar14.e0();
                            if (rVar14.S) {
                                rVar14.k(aVar3);
                            } else {
                                rVar14.o0();
                            }
                            androidx.compose.ui.node.e eVar12 = androidx.compose.ui.node.f.e;
                            androidx.compose.runtime.s.x(rVar14, t0VarA3, eVar12);
                            androidx.compose.ui.node.e eVar13 = androidx.compose.ui.node.f.d;
                            androidx.compose.runtime.s.x(rVar14, jVarL10, eVar13);
                            Integer numValueOf2 = Integer.valueOf(iHashCode10);
                            androidx.compose.ui.node.e eVar14 = androidx.compose.ui.node.f.f;
                            androidx.compose.runtime.s.p(rVar14, numValueOf2, eVar14);
                            androidx.compose.ui.node.d dVar5 = androidx.compose.ui.node.f.g;
                            androidx.compose.runtime.s.t(rVar14, dVar5);
                            androidx.compose.ui.node.e eVar15 = androidx.compose.ui.node.f.c;
                            androidx.compose.runtime.s.x(rVar14, rVarC10, eVar15);
                            PackageManager packageManager3 = packageManager2;
                            iVar = iVar3;
                            pVar = pVar2;
                            context = context2;
                            androidx.compose.ui.o oVar8 = oVar7;
                            androidx.compose.material3.f1.b(_COROUTINE.a.w(), null, androidx.compose.foundation.layout.w0.l(oVar7, 24), com.app.mlounge.ui.theme.b.f, rVar14, 432, 0);
                            androidx.compose.foundation.layout.b.d(rVar14, androidx.compose.foundation.layout.w0.p(oVar8, f4));
                            if (1.0f <= 0.0d) {
                                androidx.compose.foundation.layout.internal.a.a("invalid weight; must be greater than zero");
                            }
                            androidx.compose.foundation.layout.h0 h0Var2 = new androidx.compose.foundation.layout.h0(1.0f, true);
                            androidx.compose.foundation.layout.v vVarA6 = androidx.compose.foundation.layout.t.a(androidx.compose.foundation.layout.h.c, hVar7, rVar14, 0);
                            int iHashCode11 = Long.hashCode(rVar14.T);
                            androidx.compose.runtime.internal.j jVarL11 = rVar14.l();
                            androidx.compose.ui.r rVarC11 = androidx.compose.ui.a.c(rVar14, h0Var2);
                            rVar14.e0();
                            if (rVar14.S) {
                                rVar14.k(aVar3);
                            } else {
                                rVar14.o0();
                            }
                            androidx.compose.runtime.s.x(rVar14, vVarA6, eVar12);
                            androidx.compose.runtime.s.x(rVar14, jVarL11, eVar13);
                            androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode11, rVar14, eVar14, rVar14, dVar5);
                            androidx.compose.runtime.s.x(rVar14, rVarC11, eVar15);
                            androidx.compose.runtime.p1 p1Var = u3.a;
                            androidx.compose.runtime.r rVar15 = rVar14;
                            p3.b("Built-in Downloader", null, com.app.mlounge.ui.theme.b.l, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar14.j(p1Var)).k, rVar15, 6, 0, 131066);
                            p3.b("Default CinemaHQ downloader", null, com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar15.j(p1Var)).l, rVar15, 6, 0, 131066);
                            rVar15.p(true);
                            rVar15.p(true);
                            androidx.compose.material3.t2.d(null, 0.0f, com.app.mlounge.ui.theme.b.e, rVar15, 0, 3);
                            rVar2 = rVar15;
                            rVar2.p(false);
                            oVar3 = oVar8;
                            i2 = 2;
                            hVar4 = hVar7;
                            i3 = 1;
                            packageManager = packageManager3;
                        } else {
                            PackageManager packageManager4 = packageManager2;
                            androidx.compose.ui.i iVar4 = iVar3;
                            kotlin.jvm.functions.p pVar3 = pVar2;
                            Context context3 = context2;
                            androidx.compose.ui.o oVar9 = oVar7;
                            boolean z7 = i4;
                            rVar14.b0(-334747457);
                            packageManager4.getClass();
                            try {
                                packageManager4.getPackageInfo(f0Var2.a, 0);
                            } catch (PackageManager.NameNotFoundException unused) {
                                z7 = 0;
                            }
                            Object objQ8 = rVar14.Q();
                            if (objQ8 == obj3) {
                                objQ8 = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar14);
                            }
                            androidx.compose.foundation.interaction.k kVar3 = (androidx.compose.foundation.interaction.k) objQ8;
                            androidx.compose.ui.r rVarG2 = androidx.compose.foundation.s.g(androidx.compose.foundation.layout.w0.d(oVar9, 1.0f), 2, ((Boolean) android.support.v4.media.session.b.g(kVar3, rVar14, 6).getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : androidx.compose.ui.graphics.t.h, androidx.compose.foundation.shape.e.a(8));
                            boolean zG = rVar14.g(z7) | rVar14.f(pVar3) | rVar14.f(f0Var2) | rVar14.h(context3);
                            Object objQ9 = rVar14.Q();
                            if (zG || objQ9 == obj3) {
                                androidx.compose.ui.h hVar8 = hVar7;
                                f0Var = f0Var2;
                                pVar = pVar3;
                                hVar3 = hVar8;
                                i = 1;
                                fVar = new com.app.mlounge.ui.screens.settings.f(z7, pVar, f0Var, context3, 1);
                                context = context3;
                                rVar14.l0(fVar);
                            } else {
                                pVar = pVar3;
                                context = context3;
                                i = 1;
                                hVar3 = hVar7;
                                f0Var = f0Var2;
                                fVar = objQ9;
                            }
                            androidx.compose.ui.r rVarM = androidx.compose.foundation.s.m(androidx.compose.foundation.s.i(rVarG2, kVar3, null, false, null, (kotlin.jvm.functions.a) fVar, 28), kVar3, i);
                            float f5 = 12;
                            androidx.compose.ui.r rVarP5 = androidx.compose.foundation.layout.b.p(rVarM, 4, f5);
                            androidx.compose.foundation.layout.t0 t0VarA4 = androidx.compose.foundation.layout.r0.a(androidx.compose.foundation.layout.h.a, iVar4, rVar14, 48);
                            int iHashCode12 = Long.hashCode(rVar14.T);
                            androidx.compose.runtime.internal.j jVarL12 = rVar14.l();
                            androidx.compose.ui.r rVarC12 = androidx.compose.ui.a.c(rVar14, rVarP5);
                            androidx.compose.ui.node.g.b.getClass();
                            kotlin.jvm.functions.a aVar4 = androidx.compose.ui.node.f.b;
                            rVar14.e0();
                            if (rVar14.S) {
                                rVar14.k(aVar4);
                            } else {
                                rVar14.o0();
                            }
                            androidx.compose.ui.node.e eVar16 = androidx.compose.ui.node.f.e;
                            androidx.compose.runtime.s.x(rVar14, t0VarA4, eVar16);
                            androidx.compose.ui.node.e eVar17 = androidx.compose.ui.node.f.d;
                            androidx.compose.runtime.s.x(rVar14, jVarL12, eVar17);
                            Integer numValueOf3 = Integer.valueOf(iHashCode12);
                            androidx.compose.ui.node.e eVar18 = androidx.compose.ui.node.f.f;
                            androidx.compose.runtime.s.p(rVar14, numValueOf3, eVar18);
                            androidx.compose.ui.node.d dVar6 = androidx.compose.ui.node.f.g;
                            androidx.compose.runtime.s.t(rVar14, dVar6);
                            androidx.compose.ui.node.e eVar19 = androidx.compose.ui.node.f.c;
                            androidx.compose.runtime.s.x(rVar14, rVarC12, eVar19);
                            androidx.compose.ui.h hVar9 = hVar3;
                            boolean z8 = z7;
                            oVar3 = oVar9;
                            iVar = iVar4;
                            i2 = 2;
                            com.app.mlounge.ui.screens.settings.f0 f0Var3 = f0Var;
                            i3 = 1;
                            androidx.compose.material3.f1.b(z7 != 0 ? org.jsoup.helper.n.q() : okhttp3.internal.platform.android.g.o(), null, androidx.compose.foundation.layout.w0.l(oVar9, 24), z7 != 0 ? androidx.compose.ui.graphics.a0.d(4283215696L) : androidx.compose.ui.graphics.a0.d(4293212469L), rVar14, 432, 0);
                            androidx.compose.foundation.layout.b.d(rVar14, androidx.compose.foundation.layout.w0.p(oVar3, f5));
                            if (1.0f <= 0.0d) {
                                androidx.compose.foundation.layout.internal.a.a("invalid weight; must be greater than zero");
                            }
                            androidx.compose.foundation.layout.h0 h0Var3 = new androidx.compose.foundation.layout.h0(1.0f, true);
                            androidx.compose.foundation.layout.v vVarA7 = androidx.compose.foundation.layout.t.a(androidx.compose.foundation.layout.h.c, hVar9, rVar14, 0);
                            int iHashCode13 = Long.hashCode(rVar14.T);
                            androidx.compose.runtime.internal.j jVarL13 = rVar14.l();
                            androidx.compose.ui.r rVarC13 = androidx.compose.ui.a.c(rVar14, h0Var3);
                            rVar14.e0();
                            if (rVar14.S) {
                                rVar14.k(aVar4);
                            } else {
                                rVar14.o0();
                            }
                            androidx.compose.runtime.s.x(rVar14, vVarA7, eVar16);
                            androidx.compose.runtime.s.x(rVar14, jVarL13, eVar17);
                            androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode13, rVar14, eVar18, rVar14, dVar6);
                            androidx.compose.runtime.s.x(rVar14, rVarC13, eVar19);
                            String str14 = f0Var3.b;
                            androidx.compose.runtime.p1 p1Var2 = u3.a;
                            androidx.compose.runtime.r rVar16 = rVar14;
                            hVar4 = hVar9;
                            packageManager = packageManager4;
                            p3.b(str14, null, com.app.mlounge.ui.theme.b.l, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar14.j(p1Var2)).k, rVar16, 0, 0, 131066);
                            p3.b(z8 ? "Installed" : "Not installed", null, z8 ? androidx.compose.ui.graphics.a0.d(4283215696L) : androidx.compose.ui.graphics.a0.d(4293212469L), 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar16.j(p1Var2)).l, rVar16, 0, 0, 131066);
                            rVar2 = rVar16;
                            androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.u(rVar2, true, true, false);
                        }
                        oVar7 = oVar3;
                        packageManager2 = packageManager;
                        i4 = i3;
                        hVar7 = hVar4;
                        context2 = context;
                        pVar2 = pVar;
                        i5 = i2;
                        iVar3 = iVar;
                        rVar14 = rVar2;
                    }
                    rVar14.p(false);
                    rVar14.p(i4);
                } else {
                    rVar13.W();
                }
                return kotlin.y.a;
            case 18:
                ((Integer) obj2).getClass();
                com.app.mlounge.ui.screens.sources.a.c((kotlin.jvm.functions.a) this.y, (kotlin.jvm.functions.w) this.z, (com.app.mlounge.ui.viewmodel.r1) this.A, (androidx.compose.runtime.r) obj, androidx.compose.runtime.s.A(1));
                break;
            default:
                ((Integer) obj2).getClass();
                com.app.mlounge.ui.theme.d.a((com.app.mlounge.ui.theme.c) this.y, (com.app.mlounge.ui.theme.a) this.z, (androidx.compose.runtime.internal.f) this.A, (androidx.compose.runtime.r) obj, androidx.compose.runtime.s.A(385));
                break;
        }
        return kotlin.y.a;
    }

    public /* synthetic */ w1(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.e = i2;
        this.y = obj;
        this.z = obj2;
        this.A = obj3;
    }
}
