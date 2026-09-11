package com.app.mlounge.ui.screens.history;

import android.content.Context;
import androidx.compose.animation.core.v1;
import androidx.compose.foundation.interaction.k;
import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.r0;
import androidx.compose.foundation.layout.t0;
import androidx.compose.foundation.layout.v;
import androidx.compose.foundation.text.selection.b0;
import androidx.compose.material3.f1;
import androidx.compose.material3.f3;
import androidx.compose.material3.p3;
import androidx.compose.material3.t2;
import androidx.compose.material3.t3;
import androidx.compose.material3.u3;
import androidx.compose.runtime.e1;
import androidx.compose.runtime.j0;
import androidx.compose.runtime.m;
import androidx.compose.runtime.q1;
import androidx.compose.runtime.s;
import androidx.compose.runtime.u2;
import androidx.compose.runtime.y0;
import androidx.compose.ui.i;
import androidx.compose.ui.layout.q0;
import androidx.compose.ui.node.g;
import androidx.compose.ui.node.y;
import androidx.compose.ui.o;
import androidx.compose.ui.platform.m0;
import androidx.datastore.preferences.protobuf.h1;
import androidx.lifecycle.j;
import androidx.lifecycle.w0;
import com.app.mlounge.emulator.LibretroCore;
import com.app.mlounge.ui.viewmodel.t;
import com.app.mlounge.ui.z;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.u;
import kotlin.jvm.functions.l;
import kotlin.jvm.functions.p;
import kotlin.jvm.functions.r;
import kotlin.jvm.internal.a0;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final androidx.compose.runtime.internal.f a = new androidx.compose.runtime.internal.f(-1934579980, false, new androidx.compose.foundation.contextmenu.b(14));

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r28v12 */
    /* JADX WARN: Type inference failed for: r28v13 */
    /* JADX WARN: Type inference failed for: r28v9, types: [java.util.Collection, java.util.List] */
    public static final void a(final l lVar, final l lVar2, final l lVar3, final r rVar, final l lVar4, final boolean z, final kotlin.jvm.functions.a aVar, t tVar, androidx.compose.runtime.r rVar2, final int i) {
        final t tVar2;
        int i2;
        t tVar3;
        List list;
        List list2;
        ArrayList arrayList;
        Object obj;
        ?? r28;
        int i3;
        o oVar;
        t tVar4;
        androidx.compose.runtime.f fVar;
        boolean z2;
        t tVar5;
        boolean z3;
        List list3;
        String str;
        String str2;
        e1 e1Var;
        androidx.compose.runtime.f fVar2;
        t tVar6;
        androidx.compose.runtime.r rVar3 = rVar2;
        lVar.getClass();
        lVar2.getClass();
        lVar3.getClass();
        rVar.getClass();
        rVar3.c0(-234454454);
        int i4 = i | (rVar3.h(lVar) ? 4 : 2) | (rVar3.h(lVar2) ? 32 : 16) | (rVar3.h(lVar3) ? LibretroCore.SCREEN_WIDTH : 128) | (rVar3.h(rVar) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) | (rVar3.h(lVar4) ? 16384 : 8192) | (rVar3.g(z) ? 131072 : Parser.ARGC_LIMIT) | 4194304;
        if (rVar3.T(i4 & 1, (4793491 & i4) != 4793490)) {
            rVar3.Y();
            if ((i & 1) == 0 || rVar3.C()) {
                w0 w0VarA = androidx.lifecycle.viewmodel.compose.a.a(rVar3);
                if (w0VarA == null) {
                    net.luminis.tls.engine.impl.c.r("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    i2 = i4 & (-29360129);
                    tVar3 = (t) h1.B(a0.a(t.class), w0VarA, androidx.room.r.i(w0VarA, rVar3), w0VarA instanceof j ? ((j) w0VarA).getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.a.b, rVar3);
                }
            } else {
                rVar3.W();
                i2 = i4 & (-29360129);
                tVar3 = tVar;
            }
            rVar3.q();
            int i5 = i2;
            y0 y0VarF = s.f(tVar3.e, u.e, null, rVar3, 48, 2);
            y0 y0VarG = s.g(tVar3.c, rVar3);
            if (z) {
                list = (List) y0VarF.getValue();
            } else {
                List list4 = (List) y0VarF.getValue();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list4) {
                    if (!kotlin.jvm.internal.l.a(((com.app.mlounge.data.local.entity.c) obj2).b, "adult")) {
                        arrayList2.add(obj2);
                    }
                }
                list = arrayList2;
            }
            Context context = (Context) rVar3.j(m0.b);
            Object objQ = rVar3.Q();
            androidx.compose.runtime.f fVar3 = m.a;
            if (objQ == fVar3) {
                objQ = new e1(0);
                rVar3.l0(objQ);
            }
            e1 e1Var2 = (e1) objQ;
            Object objQ2 = rVar3.Q();
            if (objQ2 == fVar3) {
                objQ2 = new LinkedHashMap();
                rVar3.l0(objQ2);
            }
            Map map = (Map) objQ2;
            Object objQ3 = rVar3.Q();
            t tVar7 = tVar3;
            if (objQ3 == fVar3) {
                objQ3 = s.r(null);
                rVar3.l0(objQ3);
            }
            y0 y0Var = (y0) objQ3;
            List listQ = z ? com.google.common.base.c.q("All", "Movies", "TV Shows", "Live TV", "Anime", "Adult") : com.google.common.base.c.q("All", "Movies", "TV Shows", "Live TV", "Anime");
            boolean zD = rVar3.d(e1Var2.g()) | rVar3.f(list) | ((458752 & i5) == 131072);
            Object objQ4 = rVar3.Q();
            if (zD || objQ4 == fVar3) {
                int iG = e1Var2.g();
                if (iG == 1) {
                    list2 = list;
                    arrayList = new ArrayList();
                    for (Object obj3 : list2) {
                        if (kotlin.jvm.internal.l.a(((com.app.mlounge.data.local.entity.c) obj3).b, "movie")) {
                            arrayList.add(obj3);
                        }
                    }
                } else if (iG != 2) {
                    if (iG == 3) {
                        list2 = list;
                        arrayList = new ArrayList();
                        for (Object obj4 : list2) {
                            if (kotlin.jvm.internal.l.a(((com.app.mlounge.data.local.entity.c) obj4).b, "live_tv")) {
                                arrayList.add(obj4);
                            }
                        }
                    } else if (iG == 4) {
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj5 : list) {
                            List list5 = list;
                            if (kotlin.text.r.O(((com.app.mlounge.data.local.entity.c) obj5).b, "anime", false)) {
                                arrayList3.add(obj5);
                            }
                            list = list5;
                        }
                        obj = list;
                        objQ4 = arrayList3;
                    } else if (iG == 5 && z) {
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj6 : list) {
                            if (kotlin.jvm.internal.l.a(((com.app.mlounge.data.local.entity.c) obj6).b, "adult")) {
                                arrayList4.add(obj6);
                            }
                        }
                        obj = list;
                        objQ4 = arrayList4;
                    } else {
                        objQ4 = list;
                        obj = objQ4;
                    }
                    rVar3.l0(objQ4);
                    r28 = obj;
                } else {
                    list2 = list;
                    arrayList = new ArrayList();
                    for (Object obj7 : list2) {
                        if (kotlin.jvm.internal.l.a(((com.app.mlounge.data.local.entity.c) obj7).b, "tv")) {
                            arrayList.add(obj7);
                        }
                    }
                }
                objQ4 = arrayList;
                obj = list2;
                rVar3.l0(objQ4);
                r28 = obj;
            } else {
                r28 = list;
            }
            List list6 = (List) objQ4;
            boolean zH = rVar3.h(map);
            Object objQ5 = rVar3.Q();
            if (zH || objQ5 == fVar3) {
                objQ5 = new c(map, y0Var, null, 0);
                rVar3.l0(objQ5);
            }
            j0.c(rVar3, list6, (p) objQ5);
            androidx.compose.foundation.layout.a0 a0Var = androidx.compose.foundation.layout.w0.c;
            v vVarA = androidx.compose.foundation.layout.t.a(h.c, androidx.compose.ui.c.J, rVar3, 0);
            int iHashCode = Long.hashCode(rVar3.T);
            androidx.compose.runtime.internal.j jVarL = rVar3.l();
            androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(rVar3, a0Var);
            g.b.getClass();
            y yVar = androidx.compose.ui.node.f.b;
            rVar3.e0();
            if (rVar3.S) {
                rVar3.k(yVar);
            } else {
                rVar3.o0();
            }
            androidx.compose.ui.node.e eVar = androidx.compose.ui.node.f.e;
            s.x(rVar3, vVarA, eVar);
            androidx.compose.ui.node.e eVar2 = androidx.compose.ui.node.f.d;
            s.x(rVar3, jVarL, eVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            androidx.compose.ui.node.e eVar3 = androidx.compose.ui.node.f.f;
            s.p(rVar3, numValueOf, eVar3);
            androidx.compose.ui.node.d dVar = androidx.compose.ui.node.f.g;
            s.t(rVar3, dVar);
            androidx.compose.ui.node.e eVar4 = androidx.compose.ui.node.f.c;
            s.x(rVar3, rVarC, eVar4);
            o oVar2 = o.b;
            float f = 16;
            androidx.compose.ui.r rVarR = androidx.compose.foundation.layout.b.r(androidx.compose.foundation.layout.w0.d(oVar2, 1.0f), f, f, f, 4);
            androidx.compose.foundation.layout.d dVar2 = h.e;
            i iVar = androidx.compose.ui.c.H;
            t0 t0VarA = r0.a(dVar2, iVar, rVar3, 54);
            int iHashCode2 = Long.hashCode(rVar3.T);
            androidx.compose.runtime.internal.j jVarL2 = rVar3.l();
            androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(rVar3, rVarR);
            rVar3.e0();
            if (rVar3.S) {
                rVar3.k(yVar);
            } else {
                rVar3.o0();
            }
            s.x(rVar3, t0VarA, eVar);
            s.x(rVar3, jVarL2, eVar2);
            androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode2, rVar3, eVar3, rVar3, dVar);
            s.x(rVar3, rVarC2, eVar4);
            u2 u2Var = u3.a;
            e1 e1Var3 = e1Var2;
            List list7 = listQ;
            p3.b("Watch History", null, com.app.mlounge.ui.theme.b.k, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar3.j(u2Var)).e, rVar3, 390, 0, 131066);
            androidx.compose.runtime.r rVar4 = rVar3;
            t0 t0VarA2 = r0.a(h.a, iVar, rVar4, 48);
            int iHashCode3 = Long.hashCode(rVar4.T);
            androidx.compose.runtime.internal.j jVarL3 = rVar4.l();
            androidx.compose.ui.r rVarC3 = androidx.compose.ui.a.c(rVar4, oVar2);
            rVar4.e0();
            if (rVar4.S) {
                rVar4.k(yVar);
            } else {
                rVar4.o0();
            }
            s.x(rVar4, t0VarA2, eVar);
            s.x(rVar4, jVarL3, eVar2);
            androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode3, rVar4, eVar3, rVar4, dVar);
            s.x(rVar4, rVarC3, eVar4);
            if (r28.isEmpty()) {
                i3 = 8;
                oVar = oVar2;
                tVar4 = tVar7;
                fVar = fVar3;
                z2 = false;
                rVar4.b0(733538486);
                rVar4.p(false);
            } else {
                rVar4.b0(733115646);
                oVar = oVar2;
                i3 = 8;
                p3.b(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.d(r28.size(), " items"), null, com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar4.j(u2Var)).k, rVar2, 384, 0, 131066);
                androidx.compose.foundation.layout.b.d(rVar2, androidx.compose.foundation.layout.w0.p(oVar, 8));
                boolean zH2 = rVar2.h(tVar7);
                Object objQ6 = rVar2.Q();
                if (zH2) {
                    fVar2 = fVar3;
                } else {
                    if (objQ6 != fVar2) {
                        fVar2 = fVar3;
                        tVar6 = tVar7;
                    }
                    tVar4 = tVar6;
                    fVar = fVar2;
                    t2.h((kotlin.jvm.functions.a) ((kotlin.reflect.e) objQ6), null, false, null, null, null, null, a, rVar2, 805306368, 510);
                    rVar4 = rVar2;
                    z2 = false;
                    rVar4.p(false);
                }
                fVar2 = fVar3;
                tVar6 = tVar7;
                objQ6 = new androidx.compose.foundation.r0(0, tVar6, t.class, "clearAll", "clearAll()V", 0, 7);
                rVar2.l0(objQ6);
                tVar4 = tVar6;
                fVar = fVar2;
                t2.h((kotlin.jvm.functions.a) ((kotlin.reflect.e) objQ6), null, false, null, null, null, null, a, rVar2, 805306368, 510);
                rVar4 = rVar2;
                z2 = false;
                rVar4.p(false);
            }
            rVar4.p(true);
            rVar4.p(true);
            float f2 = i3;
            androidx.compose.foundation.layout.b.d(rVar4, androidx.compose.foundation.layout.w0.f(oVar, f2));
            float f3 = 12;
            float f4 = f3;
            androidx.compose.ui.r rVarS = androidx.compose.foundation.layout.b.s(androidx.compose.foundation.s.p(androidx.compose.foundation.layout.w0.d(oVar, 1.0f), androidx.compose.foundation.s.o(rVar4), z2), f4, 0.0f, f3, f2, 2);
            t0 t0VarA3 = r0.a(h.g(f2), iVar, rVar4, 54);
            int iHashCode4 = Long.hashCode(rVar4.T);
            androidx.compose.runtime.internal.j jVarL4 = rVar4.l();
            androidx.compose.ui.r rVarC4 = androidx.compose.ui.a.c(rVar4, rVarS);
            rVar4.e0();
            if (rVar4.S) {
                rVar4.k(yVar);
            } else {
                rVar4.o0();
            }
            s.x(rVar4, t0VarA3, eVar);
            s.x(rVar4, jVarL4, eVar2);
            androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode4, rVar4, eVar3, rVar4, dVar);
            s.x(rVar4, rVarC4, eVar4);
            rVar4.b0(-1216276067);
            int i6 = 0;
            for (Object obj8 : list7) {
                int i7 = i6 + 1;
                if (i6 < 0) {
                    com.google.common.base.c.w();
                    throw null;
                }
                String str3 = (String) obj8;
                Object objQ7 = rVar4.Q();
                androidx.compose.runtime.f fVar4 = fVar;
                if (objQ7 == fVar4) {
                    objQ7 = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar4);
                }
                k kVar = (k) objQ7;
                androidx.compose.ui.r rVarG = androidx.compose.foundation.s.g(androidx.compose.ui.draw.h.a(oVar, androidx.compose.foundation.shape.e.a(f2)), 2, ((Boolean) android.support.v4.media.session.b.g(kVar, rVar4, 6).getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : androidx.compose.ui.graphics.t.h, androidx.compose.foundation.shape.e.a(f2));
                boolean zD2 = rVar4.d(i6);
                Object objQ8 = rVar4.Q();
                if (zD2 || objQ8 == fVar4) {
                    e1Var = e1Var3;
                    objQ8 = new b0(i6, e1Var);
                    rVar4.l0(objQ8);
                } else {
                    e1Var = e1Var3;
                }
                f3.a(androidx.compose.foundation.s.m(androidx.compose.foundation.s.i(rVarG, kVar, null, false, null, (kotlin.jvm.functions.a) objQ8, 28), kVar, 1), androidx.compose.foundation.shape.e.a(f2), e1Var.g() == i6 ? androidx.compose.ui.graphics.t.b(0.3f, com.app.mlounge.ui.theme.b.f) : com.app.mlounge.ui.theme.b.c, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(-1241326664, new v1(i6, str3, e1Var), rVar4), rVar2, 12582912, 120);
                i6 = i7;
                fVar = fVar4;
                e1Var3 = e1Var;
                rVar4 = rVar2;
                f4 = f4;
            }
            float f5 = f4;
            e1 e1Var4 = e1Var3;
            androidx.compose.runtime.f fVar5 = fVar;
            rVar4.p(false);
            rVar4.p(true);
            if (list6.isEmpty()) {
                rVar4.b0(-1679187041);
                androidx.compose.foundation.layout.a0 a0Var2 = androidx.compose.foundation.layout.w0.c;
                q0 q0VarD = androidx.compose.foundation.layout.p.d(androidx.compose.ui.c.B, false);
                int iHashCode5 = Long.hashCode(rVar4.T);
                androidx.compose.runtime.internal.j jVarL5 = rVar4.l();
                androidx.compose.ui.r rVarC5 = androidx.compose.ui.a.c(rVar4, a0Var2);
                g.b.getClass();
                y yVar2 = androidx.compose.ui.node.f.b;
                rVar4.e0();
                if (rVar4.S) {
                    rVar4.k(yVar2);
                } else {
                    rVar4.o0();
                }
                androidx.compose.ui.node.e eVar5 = androidx.compose.ui.node.f.e;
                s.x(rVar4, q0VarD, eVar5);
                androidx.compose.ui.node.e eVar6 = androidx.compose.ui.node.f.d;
                s.x(rVar4, jVarL5, eVar6);
                Integer numValueOf2 = Integer.valueOf(iHashCode5);
                androidx.compose.ui.node.e eVar7 = androidx.compose.ui.node.f.f;
                s.p(rVar4, numValueOf2, eVar7);
                androidx.compose.ui.node.d dVar3 = androidx.compose.ui.node.f.g;
                s.t(rVar4, dVar3);
                androidx.compose.ui.node.e eVar8 = androidx.compose.ui.node.f.c;
                s.x(rVar4, rVarC5, eVar8);
                v vVarA2 = androidx.compose.foundation.layout.t.a(h.c, androidx.compose.ui.c.K, rVar4, 48);
                int iHashCode6 = Long.hashCode(rVar4.T);
                androidx.compose.runtime.internal.j jVarL6 = rVar4.l();
                androidx.compose.ui.r rVarC6 = androidx.compose.ui.a.c(rVar4, oVar);
                rVar4.e0();
                if (rVar4.S) {
                    rVar4.k(yVar2);
                } else {
                    rVar4.o0();
                }
                s.x(rVar4, vVarA2, eVar5);
                s.x(rVar4, jVarL6, eVar6);
                androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode6, rVar4, eVar7, rVar4, dVar3);
                s.x(rVar4, rVarC6, eVar8);
                androidx.compose.ui.graphics.vector.f fVarV = android.support.v4.media.session.b.v();
                long j = com.app.mlounge.ui.theme.b.m;
                f1.b(fVarV, null, androidx.compose.foundation.layout.w0.l(oVar, 64), j, rVar4, 3504, 0);
                androidx.compose.foundation.layout.b.d(rVar4, androidx.compose.foundation.layout.w0.f(oVar, f));
                if (e1Var4.g() == 0) {
                    str = "No watch history yet";
                    list3 = list7;
                } else {
                    list3 = list7;
                    String lowerCase = ((String) list3.get(e1Var4.g())).toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    str = "No " + lowerCase + " in your history";
                }
                String str4 = str;
                u2 u2Var2 = u3.a;
                p3.b(str4, null, com.app.mlounge.ui.theme.b.k, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar4.j(u2Var2)).g, rVar2, 384, 0, 131066);
                androidx.compose.foundation.layout.b.d(rVar2, androidx.compose.foundation.layout.w0.f(oVar, f2));
                if (e1Var4.g() == 0) {
                    str2 = "Content you watch will appear here";
                } else {
                    String lowerCase2 = ((String) list3.get(e1Var4.g())).toLowerCase(Locale.ROOT);
                    lowerCase2.getClass();
                    str2 = "Watch some " + lowerCase2 + " and they'll appear here";
                }
                p3.b(str2, null, j, 0L, null, 0L, new androidx.compose.ui.text.style.k(3), 0L, 0, false, 0, 0, ((t3) rVar2.j(u2Var2)).k, rVar2, 384, 0, 130042);
                z3 = true;
                androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.u(rVar2, true, true, false);
                rVar3 = rVar2;
                tVar5 = tVar4;
            } else {
                androidx.compose.runtime.r rVar5 = rVar4;
                rVar5.b0(-1677657005);
                androidx.compose.foundation.lazy.grid.a aVar2 = new androidx.compose.foundation.lazy.grid.a(((com.app.mlounge.ui.theme.a) rVar5.j(com.app.mlounge.ui.theme.f.a)).y);
                androidx.compose.foundation.layout.f fVarG = h.g(f2);
                androidx.compose.foundation.layout.f fVarG2 = h.g(f2);
                androidx.compose.foundation.layout.m0 m0Var = new androidx.compose.foundation.layout.m0(f5, f5, f5, f5);
                androidx.compose.foundation.layout.a0 a0Var3 = androidx.compose.foundation.layout.w0.c;
                t tVar8 = tVar4;
                boolean zH3 = rVar5.h(list6) | rVar5.h(map) | rVar5.f(y0VarG) | ((i5 & 14) == 4) | ((i5 & Token.ASSIGN_MOD) == 32) | ((i5 & 7168) == 2048) | ((i5 & 896) == 256) | ((57344 & i5) == 16384) | rVar5.h(tVar8) | rVar5.h(context);
                Object objQ9 = rVar5.Q();
                if (zH3 || objQ9 == fVar5) {
                    z zVar = new z(list6, map, lVar, lVar2, rVar, lVar3, lVar4, aVar, tVar8, context, y0VarG, y0Var);
                    tVar5 = tVar8;
                    rVar5.l0(zVar);
                    objQ9 = zVar;
                } else {
                    tVar5 = tVar8;
                }
                com.google.android.gms.dynamite.g.a(aVar2, a0Var3, null, m0Var, fVarG2, fVarG, null, false, null, (l) objQ9, rVar5, 1772592, 916);
                rVar3 = rVar5;
                rVar3.p(false);
                z3 = true;
            }
            rVar3.p(z3);
            tVar2 = tVar5;
        } else {
            rVar3.W();
            tVar2 = tVar;
        }
        q1 q1VarT = rVar3.t();
        if (q1VarT != null) {
            q1VarT.d = new p(lVar2, lVar3, rVar, lVar4, z, aVar, tVar2, i) { // from class: com.app.mlounge.ui.screens.history.b
                public final /* synthetic */ r A;
                public final /* synthetic */ l B;
                public final /* synthetic */ boolean C;
                public final /* synthetic */ kotlin.jvm.functions.a D;
                public final /* synthetic */ t E;
                public final /* synthetic */ l y;
                public final /* synthetic */ l z;

                @Override // kotlin.jvm.functions.p
                public final Object invoke(Object obj9, Object obj10) {
                    ((Integer) obj10).getClass();
                    int iA = s.A(1572865);
                    a.a(this.e, this.y, this.z, this.A, this.B, this.C, this.D, this.E, (androidx.compose.runtime.r) obj9, iA);
                    return kotlin.y.a;
                }
            };
        }
    }
}
