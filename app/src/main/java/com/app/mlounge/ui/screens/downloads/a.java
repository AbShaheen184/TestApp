package com.app.mlounge.ui.screens.downloads;

import androidx.compose.animation.core.g0;
import androidx.compose.animation.core.i0;
import androidx.compose.foundation.layout.t;
import androidx.compose.foundation.layout.v;
import androidx.compose.foundation.layout.w0;
import androidx.compose.material3.f1;
import androidx.compose.material3.f3;
import androidx.compose.material3.n0;
import androidx.compose.material3.o0;
import androidx.compose.material3.p3;
import androidx.compose.material3.t2;
import androidx.compose.material3.t3;
import androidx.compose.material3.u3;
import androidx.compose.runtime.internal.f;
import androidx.compose.runtime.internal.k;
import androidx.compose.runtime.m;
import androidx.compose.runtime.q1;
import androidx.compose.runtime.r;
import androidx.compose.runtime.s;
import androidx.compose.runtime.y0;
import androidx.compose.ui.draw.h;
import androidx.compose.ui.focus.y;
import androidx.compose.ui.graphics.p0;
import androidx.compose.ui.graphics.vector.h0;
import androidx.compose.ui.graphics.vector.u;
import androidx.compose.ui.layout.q0;
import androidx.compose.ui.node.g;
import androidx.compose.ui.o;
import androidx.compose.ui.text.m0;
import androidx.datastore.preferences.protobuf.h1;
import androidx.lifecycle.j;
import com.app.mlounge.emulator.LibretroCore;
import com.app.mlounge.ui.screens.anime.n;
import com.app.mlounge.ui.viewmodel.p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.l;
import kotlin.jvm.internal.a0;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.mozilla.javascript.Parser;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final f a = new f(1503810104, false, new androidx.compose.foundation.contextmenu.b(11));
    public static final f b = new f(1030574454, false, new androidx.compose.foundation.contextmenu.b(12));
    public static final f c = new f(-1920421103, false, new n(5));
    public static final f d = new f(-22044616, false, new n(6));
    public static final f e = new f(-2013179743, false, new n(7));
    public static final f f = new f(833508015, false, new n(8));
    public static final f g = new f(-77371728, false, new n(9));
    public static final f h = new f(1997185241, false, new n(10));
    public static final f i = new f(-988251471, false, new n(1));
    public static final f j = new f(1086305498, false, new n(2));
    public static final f k = new f(-1899131214, false, new n(3));
    public static final f l = new f(175425755, false, new n(4));

    public static final void a(com.app.mlounge.data.local.entity.a aVar, kotlin.jvm.functions.a aVar2, kotlin.jvm.functions.a aVar3, kotlin.jvm.functions.a aVar4, kotlin.jvm.functions.a aVar5, kotlin.jvm.functions.a aVar6, kotlin.jvm.functions.a aVar7, r rVar, int i2) {
        r rVar2;
        rVar.c0(-843875838);
        int i3 = i2 | (rVar.f(aVar) ? 4 : 2) | (rVar.h(aVar2) ? 32 : 16) | (rVar.h(aVar3) ? LibretroCore.SCREEN_WIDTH : 128) | (rVar.h(aVar4) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) | (rVar.h(aVar5) ? 16384 : 8192) | (rVar.h(aVar6) ? 131072 : Parser.ARGC_LIMIT) | (rVar.h(aVar7) ? 1048576 : 524288);
        if (rVar.T(i3 & 1, (599187 & i3) != 599186)) {
            Object objQ = rVar.Q();
            androidx.compose.runtime.f fVar = m.a;
            if (objQ == fVar) {
                objQ = s.r(Boolean.FALSE);
                rVar.l0(objQ);
            }
            y0 y0Var = (y0) objQ;
            if (((Boolean) y0Var.getValue()).booleanValue()) {
                rVar.b0(-1461177303);
                long j2 = com.app.mlounge.ui.theme.b.b;
                androidx.compose.foundation.shape.d dVarA = androidx.compose.foundation.shape.e.a(16);
                Object objQ2 = rVar.Q();
                if (objQ2 == fVar) {
                    objQ2 = new androidx.compose.foundation.lazy.n(y0Var, 14);
                    rVar.l0(objQ2);
                }
                t2.a((kotlin.jvm.functions.a) objQ2, k.c(-973949803, new com.app.mlounge.ui.components.f(aVar6, y0Var, 2), rVar), null, k.c(-1447185453, new androidx.compose.material3.m(y0Var, 5), rVar), c, k.c(2137928368, new g0(aVar, 19), rVar), dVarA, j2, 0L, 0L, 0L, 0.0f, null, rVar, 102435894, 0, 15892);
                rVar2 = rVar;
                rVar2.p(false);
            } else {
                rVar2 = rVar;
                rVar2.b0(-1460349696);
                rVar2.p(false);
            }
            float f2 = 8;
            f3.a(h.a(w0.d(o.b, 1.0f), androidx.compose.foundation.shape.e.a(f2)), androidx.compose.foundation.shape.e.a(f2), com.app.mlounge.ui.theme.b.d, 0L, 0.0f, 0.0f, k.c(-1603559395, new b(aVar, aVar3, aVar2, aVar4, aVar5, aVar7, y0Var), rVar2), rVar, 12583296, 120);
        } else {
            rVar.W();
        }
        q1 q1VarT = rVar.t();
        if (q1VarT != null) {
            q1VarT.d = new b(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, i2);
        }
    }

    public static final void b(kotlin.jvm.functions.s sVar, p pVar, r rVar, int i2) {
        kotlin.jvm.functions.s sVar2;
        p pVar2;
        int i3;
        p pVar3;
        boolean z;
        boolean z2;
        p pVar4;
        r rVar2 = rVar;
        rVar2.c0(1672307831);
        int i4 = i2 | (rVar2.h(sVar) ? 4 : 2) | 16;
        if (rVar2.T(i4 & 1, (i4 & 19) != 18)) {
            rVar2.Y();
            if ((i2 & 1) == 0 || rVar2.C()) {
                androidx.lifecycle.w0 w0VarA = androidx.lifecycle.viewmodel.compose.a.a(rVar2);
                if (w0VarA == null) {
                    net.luminis.tls.engine.impl.c.r("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    i3 = i4 & (-113);
                    pVar3 = (p) h1.B(a0.a(p.class), w0VarA, androidx.room.r.i(w0VarA, rVar2), w0VarA instanceof j ? ((j) w0VarA).getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.a.b, rVar2);
                }
            } else {
                rVar2.W();
                i3 = i4 & (-113);
                pVar3 = pVar;
            }
            rVar2.q();
            y0 y0VarG = s.g(pVar3.c, rVar2);
            Object objQ = rVar2.Q();
            androidx.compose.runtime.f fVar = m.a;
            if (objQ == fVar) {
                objQ = new y();
                rVar2.l0(objQ);
            }
            y yVar = (y) objQ;
            androidx.compose.foundation.layout.a0 a0Var = w0.c;
            androidx.compose.foundation.layout.c cVar = androidx.compose.foundation.layout.h.c;
            v vVarA = t.a(cVar, androidx.compose.ui.c.J, rVar2, 0);
            int iHashCode = Long.hashCode(rVar2.T);
            androidx.compose.runtime.internal.j jVarL = rVar2.l();
            androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(rVar2, a0Var);
            g.b.getClass();
            androidx.compose.ui.node.y yVar2 = androidx.compose.ui.node.f.b;
            rVar2.e0();
            if (rVar2.S) {
                rVar2.k(yVar2);
            } else {
                rVar2.o0();
            }
            androidx.compose.ui.node.e eVar = androidx.compose.ui.node.f.e;
            s.x(rVar2, vVarA, eVar);
            androidx.compose.ui.node.e eVar2 = androidx.compose.ui.node.f.d;
            s.x(rVar2, jVarL, eVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            androidx.compose.ui.node.e eVar3 = androidx.compose.ui.node.f.f;
            s.p(rVar2, numValueOf, eVar3);
            androidx.compose.ui.node.d dVar = androidx.compose.ui.node.f.g;
            s.t(rVar2, dVar);
            androidx.compose.ui.node.e eVar4 = androidx.compose.ui.node.f.c;
            s.x(rVar2, rVarC, eVar4);
            m0 m0Var = ((t3) rVar2.j(u3.a)).e;
            long j2 = ((n0) rVar2.j(o0.a)).o;
            float f2 = 16;
            o oVar = o.b;
            p3.b("Downloads", androidx.compose.foundation.layout.b.s(oVar, f2, f2, 0.0f, f2, 4), j2, 0L, null, 0L, null, 0L, 0, false, 0, 0, m0Var, rVar, 54, 0, 131064);
            rVar2 = rVar;
            if (((List) y0VarG.getValue()).isEmpty()) {
                rVar2.b0(1457324185);
                q0 q0VarD = androidx.compose.foundation.layout.p.d(androidx.compose.ui.c.B, false);
                int iHashCode2 = Long.hashCode(rVar2.T);
                androidx.compose.runtime.internal.j jVarL2 = rVar2.l();
                androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(rVar2, a0Var);
                rVar2.e0();
                if (rVar2.S) {
                    rVar2.k(yVar2);
                } else {
                    rVar2.o0();
                }
                s.x(rVar2, q0VarD, eVar);
                s.x(rVar2, jVarL2, eVar2);
                androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode2, rVar2, eVar3, rVar2, dVar);
                s.x(rVar2, rVarC2, eVar4);
                v vVarA2 = t.a(cVar, androidx.compose.ui.c.K, rVar2, 48);
                int iHashCode3 = Long.hashCode(rVar2.T);
                androidx.compose.runtime.internal.j jVarL3 = rVar2.l();
                androidx.compose.ui.r rVarC3 = androidx.compose.ui.a.c(rVar2, oVar);
                rVar2.e0();
                if (rVar2.S) {
                    rVar2.k(yVar2);
                } else {
                    rVar2.o0();
                }
                s.x(rVar2, vVarA2, eVar);
                s.x(rVar2, jVarL3, eVar2);
                androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode3, rVar2, eVar3, rVar2, dVar);
                s.x(rVar2, rVarC3, eVar4);
                androidx.compose.ui.graphics.vector.f fVarB = org.jsoup.helper.n.c;
                if (fVarB == null) {
                    androidx.compose.ui.graphics.vector.e eVar5 = new androidx.compose.ui.graphics.vector.e("Filled.DownloadDone", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                    int i5 = h0.a;
                    long j3 = androidx.compose.ui.graphics.t.b;
                    p0 p0Var = new p0(j3);
                    ArrayList arrayList = new ArrayList(32);
                    arrayList.add(new androidx.compose.ui.graphics.vector.o(20.13f, 5.41f));
                    arrayList.add(new androidx.compose.ui.graphics.vector.v(-1.41f, -1.41f));
                    arrayList.add(new androidx.compose.ui.graphics.vector.v(-9.19f, 9.19f));
                    arrayList.add(new androidx.compose.ui.graphics.vector.v(-4.25f, -4.24f));
                    arrayList.add(new androidx.compose.ui.graphics.vector.v(-1.41f, 1.41f));
                    arrayList.add(new androidx.compose.ui.graphics.vector.v(5.66f, 5.66f));
                    androidx.compose.ui.graphics.vector.k kVar = androidx.compose.ui.graphics.vector.k.c;
                    arrayList.add(kVar);
                    androidx.compose.ui.graphics.vector.e.a(eVar5, arrayList, 0, p0Var);
                    p0 p0Var2 = new p0(j3);
                    ArrayList arrayList2 = new ArrayList(32);
                    arrayList2.add(new androidx.compose.ui.graphics.vector.o(5.0f, 18.0f));
                    arrayList2.add(new u(14.0f));
                    arrayList2.add(new androidx.compose.ui.graphics.vector.a0(2.0f));
                    arrayList2.add(new u(-14.0f));
                    arrayList2.add(kVar);
                    androidx.compose.ui.graphics.vector.e.a(eVar5, arrayList2, 0, p0Var2);
                    fVarB = eVar5.b();
                    org.jsoup.helper.n.c = fVarB;
                }
                androidx.compose.ui.graphics.vector.f fVar2 = fVarB;
                long j4 = com.app.mlounge.ui.theme.b.m;
                f1.b(fVar2, null, w0.l(oVar, 48), j4, rVar2, 3504, 0);
                androidx.compose.foundation.layout.b.d(rVar2, w0.f(oVar, 8));
                p3.b("No downloads yet", null, j4, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, rVar, 390, 0, 262138);
                rVar2 = rVar;
                z = true;
                androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.u(rVar2, true, true, false);
                sVar2 = sVar;
                i2 = i2;
                pVar4 = pVar3;
            } else {
                z = true;
                rVar2.b0(1457817364);
                androidx.compose.ui.r rVarK = androidx.compose.ui.focus.d.k(a0Var, yVar);
                float f3 = 8;
                androidx.compose.foundation.layout.m0 m0Var2 = new androidx.compose.foundation.layout.m0(f2, f3, f2, f3);
                androidx.compose.foundation.layout.f fVarG = androidx.compose.foundation.layout.h.g(f3);
                boolean zF = rVar2.f(y0VarG) | rVar2.h(pVar3) | ((i3 & 14) == 4);
                Object objQ2 = rVar2.Q();
                if (zF || objQ2 == fVar) {
                    p pVar5 = pVar3;
                    z2 = false;
                    i0 i0Var = new i0(y0VarG, pVar5, sVar, yVar, 7);
                    pVar4 = pVar5;
                    sVar2 = sVar;
                    rVar2.l0(i0Var);
                    objQ2 = i0Var;
                } else {
                    sVar2 = sVar;
                    pVar4 = pVar3;
                    z2 = false;
                }
                coil3.network.g.a(rVarK, null, m0Var2, fVarG, null, null, false, null, (l) objQ2, rVar2, 24960, 490);
                rVar2.p(z2);
            }
            rVar2.p(z);
            pVar2 = pVar4;
        } else {
            i2 = i2;
            sVar2 = sVar;
            rVar2.W();
            pVar2 = pVar;
        }
        q1 q1VarT = rVar2.t();
        if (q1VarT != null) {
            q1VarT.d = new androidx.compose.foundation.contextmenu.f(sVar2, pVar2, i2, 17);
        }
    }

    public static final String c(long j2) {
        if (j2 < 1024) {
            return j2 + " B";
        }
        if (j2 >= 1048576) {
            return j2 < 1073741824 ? String.format(Locale.US, "%.1f MB", Arrays.copyOf(new Object[]{Double.valueOf(j2 / 1048576.0d)}, 1)) : String.format(Locale.US, "%.2f GB", Arrays.copyOf(new Object[]{Double.valueOf(j2 / 1.073741824E9d)}, 1));
        }
        return (j2 / ((long) LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY)) + " KB";
    }
}
