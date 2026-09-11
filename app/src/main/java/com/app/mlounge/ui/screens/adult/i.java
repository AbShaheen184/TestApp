package com.app.mlounge.ui.screens.adult;

import androidx.compose.foundation.layout.c0;
import androidx.compose.foundation.layout.r0;
import androidx.compose.foundation.layout.t0;
import androidx.compose.foundation.layout.u0;
import androidx.compose.foundation.layout.v;
import androidx.compose.foundation.lazy.grid.z;
import androidx.compose.foundation.text.input.internal.k;
import androidx.compose.material3.f3;
import androidx.compose.material3.j2;
import androidx.compose.material3.n0;
import androidx.compose.material3.o0;
import androidx.compose.material3.p3;
import androidx.compose.material3.t2;
import androidx.compose.material3.t3;
import androidx.compose.material3.u3;
import androidx.compose.runtime.j0;
import androidx.compose.runtime.m;
import androidx.compose.runtime.q1;
import androidx.compose.runtime.r;
import androidx.compose.runtime.s;
import androidx.compose.runtime.u2;
import androidx.compose.runtime.y0;
import androidx.compose.ui.graphics.t;
import androidx.compose.ui.layout.q0;
import androidx.compose.ui.node.y;
import androidx.compose.ui.o;
import androidx.compose.ui.text.m0;
import androidx.compose.ui.text.x;
import androidx.datastore.preferences.protobuf.h1;
import androidx.lifecycle.j;
import androidx.lifecycle.w0;
import com.app.mlounge.data.remote.model.EpornerThumb;
import com.app.mlounge.data.remote.model.EpornerVideoDetail;
import com.app.mlounge.ui.components.b0;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.u;
import kotlin.jvm.functions.l;
import kotlin.jvm.functions.p;
import kotlin.jvm.functions.q;
import kotlin.jvm.internal.a0;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class i {
    public static final androidx.compose.runtime.internal.f a = new androidx.compose.runtime.internal.f(881045301, false, new x(27));
    public static final androidx.compose.runtime.internal.f b = new androidx.compose.runtime.internal.f(-730155723, false, new androidx.compose.foundation.contextmenu.b(8));

    public static final void a(final String str, final kotlin.jvm.functions.a aVar, final q qVar, final q qVar2, com.app.mlounge.ui.viewmodel.c cVar, r rVar, final int i) {
        com.app.mlounge.ui.viewmodel.c cVar2;
        int i2;
        com.app.mlounge.ui.viewmodel.c cVar3;
        int i3;
        float f;
        boolean z;
        float f2;
        y yVar;
        androidx.compose.ui.i iVar;
        androidx.compose.ui.node.e eVar;
        androidx.compose.ui.node.e eVar2;
        u2 u2Var;
        boolean z2;
        y yVar2;
        androidx.compose.ui.node.e eVar3;
        androidx.compose.ui.node.e eVar4;
        androidx.compose.ui.node.d dVar;
        o oVar;
        int i4;
        boolean z3;
        r rVar2;
        androidx.compose.ui.i iVar2;
        r rVar3 = rVar;
        androidx.compose.ui.h hVar = androidx.compose.ui.c.J;
        androidx.compose.ui.i iVar3 = androidx.compose.ui.c.G;
        aVar.getClass();
        qVar.getClass();
        qVar2.getClass();
        rVar3.c0(-2016688229);
        int i5 = i | (rVar3.f(str) ? 4 : 2) | (rVar3.h(aVar) ? 32 : 16) | (rVar3.h(qVar2) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) | 8192;
        if (rVar3.T(i5 & 1, (i5 & 9235) != 9234)) {
            rVar3.Y();
            if ((i & 1) == 0 || rVar3.C()) {
                w0 w0VarA = androidx.lifecycle.viewmodel.compose.a.a(rVar3);
                if (w0VarA == null) {
                    net.luminis.tls.engine.impl.c.r("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    com.app.mlounge.ui.viewmodel.c cVar4 = (com.app.mlounge.ui.viewmodel.c) h1.B(a0.a(com.app.mlounge.ui.viewmodel.c.class), w0VarA, androidx.room.r.i(w0VarA, rVar3), w0VarA instanceof j ? ((j) w0VarA).getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.a.b, rVar3);
                    i2 = i5 & (-57345);
                    cVar3 = cVar4;
                }
            } else {
                rVar3.W();
                i2 = i5 & (-57345);
                cVar3 = cVar;
            }
            rVar3.q();
            y0 y0VarG = s.g(cVar3.t, rVar3);
            y0 y0VarG2 = s.g(cVar3.v, rVar3);
            int i6 = i2;
            final com.app.mlounge.ui.viewmodel.c cVar5 = cVar3;
            y0 y0VarF = s.f(cVar3.c.c("adult_".concat(str)), Boolean.FALSE, null, rVar3, 48, 2);
            int i7 = i6 & 14;
            boolean zH = rVar3.h(cVar5) | (i7 == 4);
            Object objQ = rVar3.Q();
            androidx.compose.runtime.f fVar = m.a;
            kotlin.coroutines.d dVar2 = null;
            if (zH || objQ == fVar) {
                objQ = new k(cVar5, str, dVar2, 7);
                rVar3.l0(objQ);
            }
            j0.c(rVar3, str, (p) objQ);
            boolean zH2 = rVar3.h(cVar5);
            Object objQ2 = rVar3.Q();
            if (zH2 || objQ2 == fVar) {
                objQ2 = new androidx.compose.ui.text.font.e(cVar5, 9);
                rVar3.l0(objQ2);
            }
            j0.b(kotlin.y.a, (l) objQ2, rVar3);
            if (((Boolean) y0VarG2.getValue()).booleanValue() || ((EpornerVideoDetail) y0VarG.getValue()) == null) {
                rVar3.b0(-1155884663);
                b0.n(null, rVar3, 0);
                rVar3.p(false);
                q1 q1VarT = rVar3.t();
                if (q1VarT != null) {
                    final int i8 = 0;
                    q1VarT.d = new p(str, aVar, qVar, qVar2, cVar5, i, i8) { // from class: com.app.mlounge.ui.screens.adult.a
                        public final /* synthetic */ q A;
                        public final /* synthetic */ q B;
                        public final /* synthetic */ com.app.mlounge.ui.viewmodel.c C;
                        public final /* synthetic */ int e;
                        public final /* synthetic */ String y;
                        public final /* synthetic */ kotlin.jvm.functions.a z;

                        {
                            this.e = i8;
                        }

                        @Override // kotlin.jvm.functions.p
                        public final Object invoke(Object obj, Object obj2) {
                            switch (this.e) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int iA = s.A(1);
                                    i.a(this.y, this.z, this.A, this.B, this.C, (r) obj, iA);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int iA2 = s.A(1);
                                    i.a(this.y, this.z, this.A, this.B, this.C, (r) obj, iA2);
                                    break;
                            }
                            return kotlin.y.a;
                        }
                    };
                    return;
                }
                return;
            }
            rVar3.b0(-1155855833);
            rVar3.p(false);
            EpornerVideoDetail epornerVideoDetail = (EpornerVideoDetail) y0VarG.getValue();
            epornerVideoDetail.getClass();
            List listG = epornerVideoDetail.g();
            if (listG == null) {
                listG = u.e;
            }
            androidx.compose.foundation.layout.a0 a0Var = androidx.compose.foundation.layout.w0.c;
            q0 q0VarD = androidx.compose.foundation.layout.p.d(androidx.compose.ui.c.e, false);
            int iHashCode = Long.hashCode(rVar3.T);
            androidx.compose.runtime.internal.j jVarL = rVar3.l();
            androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(rVar3, a0Var);
            androidx.compose.ui.node.g.b.getClass();
            y yVar3 = androidx.compose.ui.node.f.b;
            rVar3.e0();
            if (rVar3.S) {
                rVar3.k(yVar3);
            } else {
                rVar3.o0();
            }
            androidx.compose.ui.node.e eVar5 = androidx.compose.ui.node.f.e;
            s.x(rVar3, q0VarD, eVar5);
            androidx.compose.ui.node.e eVar6 = androidx.compose.ui.node.f.d;
            s.x(rVar3, jVarL, eVar6);
            Integer numValueOf = Integer.valueOf(iHashCode);
            androidx.compose.ui.node.e eVar7 = androidx.compose.ui.node.f.f;
            s.p(rVar3, numValueOf, eVar7);
            androidx.compose.ui.node.d dVar3 = androidx.compose.ui.node.f.g;
            s.t(rVar3, dVar3);
            androidx.compose.ui.node.e eVar8 = androidx.compose.ui.node.f.c;
            s.x(rVar3, rVarC, eVar8);
            EpornerThumb epornerThumbB = epornerVideoDetail.b();
            String strA = epornerThumbB != null ? epornerThumbB.a() : null;
            o oVar2 = o.b;
            String str2 = strA;
            float f3 = 320;
            androidx.compose.ui.r rVarF = androidx.compose.foundation.layout.w0.f(androidx.compose.foundation.layout.w0.d(oVar2, 1.0f), f3);
            androidx.compose.ui.layout.h hVar2 = androidx.compose.ui.layout.i.a;
            List list = listG;
            androidx.compose.ui.i iVar4 = iVar3;
            coil3.compose.k.a(str2, null, rVarF, null, hVar2, rVar, 1573296, 1976);
            androidx.compose.ui.layout.h hVar3 = hVar2;
            androidx.compose.ui.r rVarF2 = androidx.compose.foundation.layout.w0.f(androidx.compose.foundation.layout.w0.d(oVar2, 1.0f), f3);
            long j = com.app.mlounge.ui.theme.b.a;
            androidx.compose.foundation.layout.p.a(androidx.compose.foundation.s.e(rVarF2, com.google.android.material.shape.g.l(com.google.common.base.c.q(new t(t.b(0.3f, j)), new t(t.b(0.5f, j)), new t(t.b(0.8f, j)), new t(j)), 0.0f, 0.0f, 14)), rVar, 6);
            androidx.compose.ui.r rVarP = androidx.compose.foundation.s.p(a0Var, androidx.compose.foundation.s.o(rVar), true);
            v vVarA = androidx.compose.foundation.layout.t.a(androidx.compose.foundation.layout.h.c, hVar, rVar, 0);
            int iHashCode2 = Long.hashCode(rVar.T);
            androidx.compose.runtime.internal.j jVarL2 = rVar.l();
            androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(rVar, rVarP);
            rVar.e0();
            if (rVar.S) {
                rVar.k(yVar3);
            } else {
                rVar.o0();
            }
            s.x(rVar, vVarA, eVar5);
            s.x(rVar, jVarL2, eVar6);
            androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode2, rVar, eVar7, rVar, dVar3);
            s.x(rVar, rVarC2, eVar8);
            Object objQ3 = rVar.Q();
            if (objQ3 == fVar) {
                objQ3 = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar);
            }
            androidx.compose.foundation.interaction.k kVar = (androidx.compose.foundation.interaction.k) objQ3;
            y0 y0VarG3 = android.support.v4.media.session.b.g(kVar, rVar, 6);
            float f4 = 8;
            androidx.compose.ui.r rVarO = androidx.compose.foundation.layout.b.o(oVar2, f4);
            androidx.compose.foundation.shape.d dVar4 = androidx.compose.foundation.shape.e.a;
            float f5 = f4;
            t2.e(aVar, androidx.compose.foundation.s.g(androidx.compose.ui.draw.h.a(rVarO, dVar4), 2, ((Boolean) y0VarG3.getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : t.h, dVar4), false, null, kVar, null, a, rVar, ((i6 >> 3) & 14) | 1597440, 44);
            r rVar4 = rVar;
            androidx.compose.foundation.layout.b.d(rVar4, androidx.compose.foundation.layout.w0.f(oVar2, f5));
            if (list.isEmpty()) {
                i3 = 0;
                f = 0.0f;
                z = true;
                f2 = 1.0f;
                rVar4.b0(-1023055092);
                androidx.compose.foundation.layout.b.d(rVar4, androidx.compose.foundation.layout.w0.f(oVar2, 140));
                rVar4.p(false);
            } else {
                rVar4.b0(-1024637115);
                List listG0 = kotlin.collections.o.g0(6, list);
                androidx.compose.ui.r rVarD = androidx.compose.foundation.layout.w0.d(oVar2, 0.65f);
                androidx.compose.ui.h hVar4 = androidx.compose.ui.c.K;
                float f6 = 16;
                f = 0.0f;
                androidx.compose.ui.r rVarQ = androidx.compose.foundation.layout.b.q(rVarD.d(new c0(hVar4)), f6, 0.0f, 2);
                v vVarA2 = androidx.compose.foundation.layout.t.a(androidx.compose.foundation.layout.h.g(f5), hVar4, rVar4, 54);
                int iHashCode3 = Long.hashCode(rVar4.T);
                androidx.compose.runtime.internal.j jVarL3 = rVar4.l();
                androidx.compose.ui.r rVarC3 = androidx.compose.ui.a.c(rVar4, rVarQ);
                rVar4.e0();
                if (rVar4.S) {
                    rVar4.k(yVar3);
                } else {
                    rVar4.o0();
                }
                s.x(rVar4, vVarA2, eVar5);
                s.x(rVar4, jVarL3, eVar6);
                androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode3, rVar4, eVar7, rVar4, dVar3);
                s.x(rVar4, rVarC3, eVar8);
                rVar4.b0(511282125);
                char c = 3;
                for (List list2 : kotlin.collections.o.F(3, listG0)) {
                    androidx.compose.foundation.layout.f fVarG = androidx.compose.foundation.layout.h.g(f5);
                    float f7 = 1.0f;
                    androidx.compose.ui.r rVarD2 = androidx.compose.foundation.layout.w0.d(oVar2, 1.0f);
                    androidx.compose.ui.i iVar5 = iVar4;
                    t0 t0VarA = r0.a(fVarG, iVar5, rVar4, 6);
                    int iHashCode4 = Long.hashCode(rVar4.T);
                    androidx.compose.runtime.internal.j jVarL4 = rVar4.l();
                    androidx.compose.ui.r rVarC4 = androidx.compose.ui.a.c(rVar4, rVarD2);
                    androidx.compose.ui.node.g.b.getClass();
                    y yVar4 = androidx.compose.ui.node.f.b;
                    rVar4.e0();
                    char c2 = c;
                    if (rVar4.S) {
                        rVar4.k(yVar4);
                    } else {
                        rVar4.o0();
                    }
                    s.x(rVar4, t0VarA, androidx.compose.ui.node.f.e);
                    s.x(rVar4, jVarL4, androidx.compose.ui.node.f.d);
                    s.p(rVar4, Integer.valueOf(iHashCode4), androidx.compose.ui.node.f.f);
                    s.t(rVar4, androidx.compose.ui.node.f.g);
                    s.x(rVar4, rVarC4, androidx.compose.ui.node.f.c);
                    rVar4.b0(-947263346);
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        coil3.compose.k.a(((EpornerThumb) it.next()).a(), null, androidx.compose.ui.draw.h.a(androidx.compose.foundation.layout.b.g(u0.a(f7), 1.7777778f), androidx.compose.foundation.shape.e.a(6)), null, hVar3, rVar, 1572912, 1976);
                        rVar4 = rVar;
                        iVar5 = iVar5;
                        f7 = f7;
                    }
                    float f8 = f7;
                    iVar4 = iVar5;
                    androidx.compose.ui.layout.h hVar5 = hVar3;
                    rVar4.p(false);
                    rVar4.b0(-947242814);
                    int size = 3 - list2.size();
                    for (int i9 = 0; i9 < size; i9++) {
                        androidx.compose.foundation.layout.b.d(rVar4, u0.a(f8));
                    }
                    rVar4.p(false);
                    rVar4.p(true);
                    hVar3 = hVar5;
                    c = c2;
                }
                i3 = 0;
                z = true;
                f2 = 1.0f;
                rVar4.p(false);
                rVar4.p(true);
                androidx.compose.foundation.layout.b.d(rVar4, androidx.compose.foundation.layout.w0.f(oVar2, f6));
                rVar4.p(false);
            }
            float f9 = 16;
            androidx.compose.ui.r rVarQ2 = androidx.compose.foundation.layout.b.q(oVar2, f9, f, 2);
            v vVarA3 = androidx.compose.foundation.layout.t.a(androidx.compose.foundation.layout.h.c, hVar, rVar4, i3);
            int iHashCode5 = Long.hashCode(rVar4.T);
            androidx.compose.runtime.internal.j jVarL5 = rVar4.l();
            androidx.compose.ui.r rVarC5 = androidx.compose.ui.a.c(rVar4, rVarQ2);
            androidx.compose.ui.node.g.b.getClass();
            y yVar5 = androidx.compose.ui.node.f.b;
            rVar4.e0();
            if (rVar4.S) {
                rVar4.k(yVar5);
            } else {
                rVar4.o0();
            }
            androidx.compose.ui.node.e eVar9 = androidx.compose.ui.node.f.e;
            s.x(rVar4, vVarA3, eVar9);
            androidx.compose.ui.node.e eVar10 = androidx.compose.ui.node.f.d;
            s.x(rVar4, jVarL5, eVar10);
            Integer numValueOf2 = Integer.valueOf(iHashCode5);
            androidx.compose.ui.node.e eVar11 = androidx.compose.ui.node.f.f;
            s.p(rVar4, numValueOf2, eVar11);
            androidx.compose.ui.node.d dVar5 = androidx.compose.ui.node.f.g;
            s.t(rVar4, dVar5);
            androidx.compose.ui.node.e eVar12 = androidx.compose.ui.node.f.c;
            s.x(rVar4, rVarC5, eVar12);
            String strH = epornerVideoDetail.h();
            if (strH == null) {
                strH = "";
            }
            u2 u2Var2 = u3.a;
            m0 m0Var = ((t3) rVar4.j(u2Var2)).f;
            long j2 = com.app.mlounge.ui.theme.b.l;
            p3.b(strH, null, j2, 0L, null, 0L, null, 0L, 0, false, 0, 0, m0Var, rVar, 384, 0, 131066);
            r rVar5 = rVar;
            androidx.compose.foundation.layout.b.d(rVar5, androidx.compose.foundation.layout.w0.f(oVar2, f5));
            androidx.compose.ui.i iVar6 = iVar4;
            t0 t0VarA2 = r0.a(androidx.compose.foundation.layout.h.g(f9), iVar6, rVar5, 6);
            int iHashCode6 = Long.hashCode(rVar5.T);
            androidx.compose.runtime.internal.j jVarL6 = rVar5.l();
            androidx.compose.ui.r rVarC6 = androidx.compose.ui.a.c(rVar5, oVar2);
            rVar5.e0();
            if (rVar5.S) {
                yVar = yVar5;
                rVar5.k(yVar);
            } else {
                yVar = yVar5;
                rVar5.o0();
            }
            s.x(rVar5, t0VarA2, eVar9);
            s.x(rVar5, jVarL6, eVar10);
            androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode6, rVar5, eVar11, rVar5, dVar5);
            s.x(rVar5, rVarC6, eVar12);
            Long lI = epornerVideoDetail.i();
            if (lI == null) {
                rVar5.b0(1530336671);
                rVar5.p(false);
                eVar3 = eVar10;
                iVar = iVar6;
                eVar2 = eVar12;
                eVar4 = eVar11;
                yVar2 = yVar;
                eVar = eVar9;
                dVar = dVar5;
                z2 = false;
                u2Var = u2Var2;
            } else {
                rVar5.b0(1530336672);
                iVar = iVar6;
                eVar = eVar9;
                eVar2 = eVar12;
                u2Var = u2Var2;
                z2 = false;
                yVar2 = yVar;
                eVar3 = eVar10;
                eVar4 = eVar11;
                dVar = dVar5;
                p3.b(lI.longValue() + " views", null, com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar5.j(u2Var2)).l, rVar, 384, 0, 131066);
                rVar5 = rVar;
                rVar5.p(false);
            }
            String strF = epornerVideoDetail.f();
            if (strF == null) {
                rVar5.b0(1530512937);
                rVar5.p(z2);
            } else {
                rVar5.b0(1530512938);
                p3.b("★ " + strF + "%", null, com.app.mlounge.ui.theme.b.s, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar5.j(u2Var)).l, rVar, 384, 0, 131066);
                rVar5 = rVar;
                rVar5.p(z2);
            }
            String strE = epornerVideoDetail.e();
            if (strE == null) {
                rVar5.b0(1530684739);
                rVar5.p(z2);
            } else {
                rVar5.b0(1530684740);
                p3.b(strE.concat(" min"), null, com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar5.j(u2Var)).l, rVar, 384, 0, 131066);
                rVar5 = rVar;
                rVar5.p(z2);
            }
            rVar5.p(true);
            String strA2 = epornerVideoDetail.a();
            if (strA2 == null) {
                rVar5.b0(-670452743);
                rVar5.p(z2);
            } else {
                rVar5.b0(-670452742);
                p3.b("Added: ".concat(kotlin.text.k.v0(strA2, "T")), null, com.app.mlounge.ui.theme.b.n, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar5.j(u2Var)).l, rVar, 384, 0, 131066);
                rVar5 = rVar;
                rVar5.p(z2);
            }
            String strD = epornerVideoDetail.d();
            if (strD == null) {
                rVar5.b0(-670243431);
                rVar5.p(z2);
                rVar2 = rVar5;
                oVar = oVar2;
                iVar2 = iVar;
                z3 = true;
                i4 = 6;
            } else {
                rVar5.b0(-670243430);
                androidx.compose.foundation.layout.b.d(rVar5, androidx.compose.foundation.layout.w0.f(
                /*  JADX ERROR: Method code generation error
                    jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0705: INVOKE 
                      (r5v21 'rVar5' androidx.compose.runtime.r)
                      (wrap androidx.compose.ui.r:0x0701: INVOKE (r1v10 androidx.compose.ui.o), (r0v6 'f5' float) STATIC call: androidx.compose.foundation.layout.w0.f(androidx.compose.ui.r, float):androidx.compose.ui.r A[MD:(androidx.compose.ui.r, float):androidx.compose.ui.r (m), WRAPPED] (LINE:261))
                     STATIC call: androidx.compose.foundation.layout.b.d(androidx.compose.runtime.r, androidx.compose.ui.r):void A[MD:(androidx.compose.runtime.r, androidx.compose.ui.r):void (m)] (LINE:261) in method: com.app.mlounge.ui.screens.adult.i.a(java.lang.String, kotlin.jvm.functions.a, kotlin.jvm.functions.q, kotlin.jvm.functions.q, com.app.mlounge.ui.viewmodel.c, androidx.compose.runtime.r, int):void, file: classes.dex
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                    	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                    	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                    	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:299)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                    	at java.base/java.util.ArrayList.forEach(Unknown Source)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                    	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(Unknown Source)
                    	at java.base/java.util.stream.AbstractPipeline.copyInto(Unknown Source)
                    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(Unknown Source)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(Unknown Source)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(Unknown Source)
                    	at java.base/java.util.stream.AbstractPipeline.evaluate(Unknown Source)
                    	at java.base/java.util.stream.ReferencePipeline.forEach(Unknown Source)
                    	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:295)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:284)
                    	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:268)
                    	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:160)
                    	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:104)
                    	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                    	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                    	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                    	at jadx.core.ProcessClass.process(ProcessClass.java:89)
                    	at jadx.core.ProcessClass.generateCode(ProcessClass.java:127)
                    	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
                    	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
                    	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
                    Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r1v10 androidx.compose.ui.o
                    	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                    */
                /*
                    Method dump skipped, instruction units count: 2404
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.ui.screens.adult.i.a(java.lang.String, kotlin.jvm.functions.a, kotlin.jvm.functions.q, kotlin.jvm.functions.q, com.app.mlounge.ui.viewmodel.c, androidx.compose.runtime.r, int):void");
            }

            public static final void b(l lVar, com.app.mlounge.ui.viewmodel.c cVar, r rVar, int i) {
                com.app.mlounge.ui.viewmodel.c cVar2;
                int i2;
                com.app.mlounge.ui.viewmodel.c cVar3;
                kotlin.coroutines.d dVar;
                boolean z;
                androidx.compose.runtime.f fVar;
                lVar = lVar;
                r rVar2 = rVar;
                androidx.compose.ui.i iVar = androidx.compose.ui.c.G;
                lVar.getClass();
                rVar2.c0(1484275133);
                int i3 = i | (rVar2.h(lVar) ? 4 : 2) | 16;
                if (rVar2.T(i3 & 1, (i3 & 19) != 18)) {
                    rVar2.Y();
                    if ((i & 1) == 0 || rVar2.C()) {
                        w0 w0VarA = androidx.lifecycle.viewmodel.compose.a.a(rVar2);
                        if (w0VarA == null) {
                            net.luminis.tls.engine.impl.c.r("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                            return;
                        } else {
                            i2 = i3 & (-113);
                            cVar3 = (com.app.mlounge.ui.viewmodel.c) h1.B(a0.a(com.app.mlounge.ui.viewmodel.c.class), w0VarA, androidx.room.r.i(w0VarA, rVar2), w0VarA instanceof j ? ((j) w0VarA).getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.a.b, rVar2);
                        }
                    } else {
                        rVar2.W();
                        i2 = i3 & (-113);
                        cVar3 = cVar;
                    }
                    int i4 = i2;
                    rVar2.q();
                    y0 y0VarG = s.g(cVar3.f, rVar2);
                    y0 y0VarG2 = s.g(cVar3.h, rVar2);
                    y0 y0VarG3 = s.g(cVar3.j, rVar2);
                    y0 y0VarG4 = s.g(cVar3.l, rVar2);
                    y0 y0VarG5 = s.g(cVar3.n, rVar2);
                    y0 y0VarG6 = s.g(cVar3.r, rVar2);
                    y0 y0VarG7 = s.g(cVar3.p, rVar2);
                    androidx.compose.foundation.lazy.grid.x xVarA = z.a(0, 0, rVar2, 3);
                    boolean zH = rVar2.h(cVar3);
                    Object objQ = rVar2.Q();
                    androidx.compose.runtime.f fVar2 = m.a;
                    if (zH || objQ == fVar2) {
                        objQ = new androidx.compose.foundation.text.selection.q(cVar3, null, 5);
                        rVar2.l0(objQ);
                    }
                    j0.c(rVar2, kotlin.y.a, (p) objQ);
                    String str = (String) y0VarG6.getValue();
                    boolean zF = rVar2.f(y0VarG6) | rVar2.f(y0VarG) | rVar2.h(cVar3);
                    Object objQ2 = rVar2.Q();
                    if (zF || objQ2 == fVar2) {
                        dVar = null;
                        androidx.compose.foundation.text.u0 u0Var = new androidx.compose.foundation.text.u0(cVar3, y0VarG6, y0VarG, null, 4);
                        rVar2.l0(u0Var);
                        objQ2 = u0Var;
                    } else {
                        dVar = null;
                    }
                    j0.c(rVar2, str, (p) objQ2);
                    boolean zF2 = rVar2.f(xVarA) | rVar2.f(y0VarG) | rVar2.h(cVar3);
                    Object objQ3 = rVar2.Q();
                    if (zF2 || objQ3 == fVar2) {
                        com.app.mlounge.ui.viewmodel.c cVar4 = cVar3;
                        e eVar = new e(xVarA, cVar4, y0VarG, dVar, 0);
                        cVar3 = cVar4;
                        rVar2.l0(eVar);
                        objQ3 = eVar;
                    }
                    j0.c(rVar2, xVarA, (p) objQ3);
                    androidx.compose.foundation.layout.a0 a0Var = androidx.compose.foundation.layout.w0.c;
                    v vVarA = androidx.compose.foundation.layout.t.a(androidx.compose.foundation.layout.h.c, androidx.compose.ui.c.J, rVar2, 0);
                    int iHashCode = Long.hashCode(rVar2.T);
                    androidx.compose.runtime.internal.j jVarL = rVar2.l();
                    androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(rVar2, a0Var);
                    androidx.compose.ui.node.g.b.getClass();
                    y yVar = androidx.compose.ui.node.f.b;
                    rVar2.e0();
                    if (rVar2.S) {
                        rVar2.k(yVar);
                    } else {
                        rVar2.o0();
                    }
                    androidx.compose.ui.node.e eVar2 = androidx.compose.ui.node.f.e;
                    s.x(rVar2, vVarA, eVar2);
                    androidx.compose.ui.node.e eVar3 = androidx.compose.ui.node.f.d;
                    s.x(rVar2, jVarL, eVar3);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    androidx.compose.ui.node.e eVar4 = androidx.compose.ui.node.f.f;
                    s.p(rVar2, numValueOf, eVar4);
                    androidx.compose.ui.node.d dVar2 = androidx.compose.ui.node.f.g;
                    s.t(rVar2, dVar2);
                    androidx.compose.ui.node.e eVar5 = androidx.compose.ui.node.f.c;
                    s.x(rVar2, rVarC, eVar5);
                    m0 m0Var = ((t3) rVar2.j(u3.a)).e;
                    long j = ((n0) rVar2.j(o0.a)).o;
                    float f = 16;
                    float f2 = 4;
                    o oVar = o.b;
                    androidx.compose.runtime.f fVar3 = fVar2;
                    com.app.mlounge.ui.viewmodel.c cVar5 = cVar3;
                    p3.b("Adult", androidx.compose.foundation.layout.b.s(oVar, f, f, 0.0f, f2, 4), j, 0L, null, 0L, null, 0L, 0, false, 0, 0, m0Var, rVar, 54, 0, 131064);
                    rVar2 = rVar;
                    float f3 = 12;
                    androidx.compose.ui.r rVarP = androidx.compose.foundation.layout.b.p(androidx.compose.foundation.s.p(androidx.compose.foundation.layout.w0.d(oVar, 1.0f), androidx.compose.foundation.s.o(rVar2), false), f3, f2);
                    float f4 = 6;
                    t0 t0VarA = r0.a(androidx.compose.foundation.layout.h.g(f4), iVar, rVar2, 6);
                    int iHashCode2 = Long.hashCode(rVar2.T);
                    androidx.compose.runtime.internal.j jVarL2 = rVar2.l();
                    androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(rVar2, rVarP);
                    rVar2.e0();
                    if (rVar2.S) {
                        rVar2.k(yVar);
                    } else {
                        rVar2.o0();
                    }
                    s.x(rVar2, t0VarA, eVar2);
                    s.x(rVar2, jVarL2, eVar3);
                    androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode2, rVar2, eVar4, rVar2, dVar2);
                    s.x(rVar2, rVarC2, eVar5);
                    rVar2.b0(-351604601);
                    for (kotlin.k kVar : com.app.mlounge.ui.viewmodel.c.G) {
                        com.app.mlounge.data.repository.a aVar = (com.app.mlounge.data.repository.a) kVar.e;
                        String str2 = (String) kVar.y;
                        boolean z2 = ((com.app.mlounge.data.repository.a) y0VarG7.getValue()) == aVar;
                        com.app.mlounge.ui.viewmodel.c cVar6 = cVar5;
                        boolean zH2 = rVar2.h(cVar6) | rVar2.d(aVar.ordinal());
                        Object objQ4 = rVar2.Q();
                        if (zH2) {
                            fVar = fVar3;
                        } else {
                            fVar = fVar3;
                            if (objQ4 == fVar) {
                            }
                            c(str2, z2, (kotlin.jvm.functions.a) objQ4, rVar2, 0);
                            fVar3 = fVar;
                            cVar5 = cVar6;
                        }
                        objQ4 = new androidx.activity.compose.f(24, cVar6, aVar);
                        rVar2.l0(objQ4);
                        c(str2, z2, (kotlin.jvm.functions.a) objQ4, rVar2, 0);
                        fVar3 = fVar;
                        cVar5 = cVar6;
                    }
                    cVar2 = cVar5;
                    androidx.compose.runtime.f fVar4 = fVar3;
                    rVar2.p(false);
                    rVar2.p(true);
                    androidx.compose.ui.r rVarP2 = androidx.compose.foundation.layout.b.p(androidx.compose.foundation.s.p(androidx.compose.foundation.layout.w0.d(oVar, 1.0f), androidx.compose.foundation.s.o(rVar2), false), f3, f2);
                    t0 t0VarA2 = r0.a(androidx.compose.foundation.layout.h.g(f4), iVar, rVar2, 6);
                    int iHashCode3 = Long.hashCode(rVar2.T);
                    androidx.compose.runtime.internal.j jVarL3 = rVar2.l();
                    androidx.compose.ui.r rVarC3 = androidx.compose.ui.a.c(rVar2, rVarP2);
                    androidx.compose.ui.node.g.b.getClass();
                    y yVar2 = androidx.compose.ui.node.f.b;
                    rVar2.e0();
                    if (rVar2.S) {
                        rVar2.k(yVar2);
                    } else {
                        rVar2.o0();
                    }
                    s.x(rVar2, t0VarA2, androidx.compose.ui.node.f.e);
                    s.x(rVar2, jVarL3, androidx.compose.ui.node.f.d);
                    s.p(rVar2, Integer.valueOf(iHashCode3), androidx.compose.ui.node.f.f);
                    s.t(rVar2, androidx.compose.ui.node.f.g);
                    s.x(rVar2, rVarC3, androidx.compose.ui.node.f.c);
                    rVar2.b0(-781389834);
                    for (String str3 : (List) y0VarG2.getValue()) {
                        boolean zA = kotlin.jvm.internal.l.a((String) y0VarG6.getValue(), str3);
                        boolean zH3 = rVar2.h(cVar2) | rVar2.f(str3);
                        Object objQ5 = rVar2.Q();
                        if (zH3 || objQ5 == fVar4) {
                            objQ5 = new androidx.activity.compose.f(25, cVar2, str3);
                            rVar2.l0(objQ5);
                        }
                        c(str3, zA, (kotlin.jvm.functions.a) objQ5, rVar2, 0);
                    }
                    rVar2.p(false);
                    rVar2.p(true);
                    if (((Boolean) y0VarG3.getValue()).booleanValue() && ((List) y0VarG.getValue()).isEmpty()) {
                        rVar2.b0(-2050234279);
                        b0.n(null, rVar2, 0);
                        rVar2.p(false);
                    } else {
                        if (((String) y0VarG5.getValue()) == null || !((List) y0VarG.getValue()).isEmpty()) {
                            rVar2.b0(867466056);
                            androidx.compose.foundation.lazy.grid.a aVar2 = new androidx.compose.foundation.lazy.grid.a(((com.app.mlounge.ui.theme.a) rVar2.j(com.app.mlounge.ui.theme.f.a)).y * 1.8f);
                            androidx.compose.foundation.layout.m0 m0Var2 = new androidx.compose.foundation.layout.m0(f3, f3, f3, f3);
                            float f5 = 8;
                            androidx.compose.foundation.layout.f fVarG = androidx.compose.foundation.layout.h.g(f5);
                            androidx.compose.foundation.layout.f fVarG2 = androidx.compose.foundation.layout.h.g(f5);
                            androidx.compose.foundation.layout.a0 a0Var2 = androidx.compose.foundation.layout.w0.c;
                            boolean zF3 = rVar2.f(y0VarG) | ((i4 & 14) == 4) | rVar2.f(y0VarG4);
                            Object objQ6 = rVar2.Q();
                            if (zF3 || objQ6 == fVar4) {
                                objQ6 = new androidx.compose.animation.core.a(16, y0VarG, lVar, y0VarG4);
                                rVar2.l0(objQ6);
                            }
                            com.google.android.gms.dynamite.g.a(aVar2, a0Var2, xVarA, m0Var2, fVarG2, fVarG, null, false, null, (l) objQ6, rVar2, 1772592, 912);
                            rVar2.p(false);
                            z = true;
                        } else {
                            rVar2.b0(-2050232052);
                            String str4 = (String) y0VarG5.getValue();
                            str4.getClass();
                            boolean zH4 = rVar2.h(cVar2);
                            Object objQ7 = rVar2.Q();
                            if (zH4 || objQ7 == fVar4) {
                                objQ7 = new androidx.room.coroutines.d(cVar2, 14);
                                rVar2.l0(objQ7);
                            }
                            b0.i(str4, null, (kotlin.jvm.functions.a) objQ7, rVar2, 0);
                            rVar2.p(false);
                        }
                        rVar2.p(z);
                    }
                    z = true;
                    rVar2.p(z);
                } else {
                    rVar2.W();
                    cVar2 = cVar;
                }
                q1 q1VarT = rVar2.t();
                if (q1VarT != null) {
                    q1VarT.d = new androidx.compose.foundation.contextmenu.f(lVar, cVar2, i, 15);
                }
            }

            public static final void c(String str, boolean z, kotlin.jvm.functions.a aVar, r rVar, int i) {
                rVar.c0(-2109039812);
                int i2 = i | (rVar.f(str) ? 4 : 2) | (rVar.g(z) ? 32 : 16) | (rVar.h(aVar) ? 256 : 128);
                if (rVar.T(i2 & 1, (i2 & Token.EXPR_VOID) != 146)) {
                    Object objQ = rVar.Q();
                    androidx.compose.runtime.f fVar = m.a;
                    if (objQ == fVar) {
                        objQ = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar);
                    }
                    androidx.compose.foundation.interaction.k kVar = (androidx.compose.foundation.interaction.k) objQ;
                    float f = 8;
                    androidx.compose.ui.r rVarG = androidx.compose.foundation.s.g(androidx.compose.ui.draw.h.a(o.b, androidx.compose.foundation.shape.e.a(f)), 2, ((Boolean) android.support.v4.media.session.b.g(kVar, rVar, 6).getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : t.h, androidx.compose.foundation.shape.e.a(f));
                    boolean z2 = (i2 & 896) == 256;
                    Object objQ2 = rVar.Q();
                    if (z2 || objQ2 == fVar) {
                        objQ2 = new j2(5, aVar);
                        rVar.l0(objQ2);
                    }
                    f3.a(androidx.compose.foundation.s.m(androidx.compose.foundation.s.i(rVarG, kVar, null, false, null, (kotlin.jvm.functions.a) objQ2, 28), kVar, 1), androidx.compose.foundation.shape.e.a(f), z ? t.b(0.3f, com.app.mlounge.ui.theme.b.f) : com.app.mlounge.ui.theme.b.c, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(1523487703, new b(0, str, z), rVar), rVar, 12582912, 120);
                } else {
                    rVar.W();
                }
                q1 q1VarT = rVar.t();
                if (q1VarT != null) {
                    q1VarT.d = new c(str, z, aVar, i, 0);
                }
            }
        }
