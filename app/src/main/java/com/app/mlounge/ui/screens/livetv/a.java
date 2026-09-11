package com.app.mlounge.ui.screens.livetv;

import android.content.Context;
import androidx.compose.animation.core.g0;
import androidx.compose.animation.core.i0;
import androidx.compose.animation.core.v1;
import androidx.compose.foundation.gestures.w1;
import androidx.compose.foundation.interaction.k;
import androidx.compose.foundation.layout.a0;
import androidx.compose.foundation.layout.m0;
import androidx.compose.foundation.layout.r0;
import androidx.compose.foundation.layout.t0;
import androidx.compose.foundation.layout.v;
import androidx.compose.foundation.layout.w0;
import androidx.compose.foundation.s;
import androidx.compose.foundation.text.contextmenu.internal.q;
import androidx.compose.material3.f1;
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
import androidx.compose.runtime.u2;
import androidx.compose.runtime.y0;
import androidx.compose.ui.graphics.t;
import androidx.compose.ui.layout.q0;
import androidx.compose.ui.o;
import androidx.datastore.preferences.protobuf.h1;
import androidx.lifecycle.j;
import androidx.lifecycle.l0;
import com.app.mlounge.data.remote.model.IptvChannel;
import com.app.mlounge.data.remote.model.SportsMatch;
import com.app.mlounge.emulator.LibretroCore;
import com.app.mlounge.ui.components.b0;
import com.app.mlounge.ui.screens.anime.n;
import com.google.firebase.crashlytics.internal.model.t1;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.u;
import kotlin.jvm.functions.l;
import kotlin.jvm.functions.p;
import kotlin.y;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final androidx.compose.runtime.internal.f a = new androidx.compose.runtime.internal.f(-1547361859, false, new n(13));
    public static final androidx.compose.runtime.internal.f b = new androidx.compose.runtime.internal.f(767702721, false, new n(14));
    public static final androidx.compose.runtime.internal.f c = new androidx.compose.runtime.internal.f(-1959280253, false, new n(15));
    public static final androidx.compose.runtime.internal.f d = new androidx.compose.runtime.internal.f(838626951, false, new n(16));

    public static final void a(IptvChannel iptvChannel, com.app.mlounge.data.iptv.n nVar, com.app.mlounge.data.iptv.n nVar2, kotlin.jvm.functions.a aVar, kotlin.jvm.functions.a aVar2, r rVar, int i) {
        rVar.c0(436657823);
        int i2 = i | (rVar.f(iptvChannel) ? 4 : 2) | (rVar.f(nVar) ? 32 : 16) | (rVar.f(nVar2) ? LibretroCore.SCREEN_WIDTH : 128) | (rVar.h(aVar) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) | (rVar.h(aVar2) ? 16384 : 8192);
        if (rVar.T(i2 & 1, (i2 & 9363) != 9362)) {
            Object objQ = rVar.Q();
            if (objQ == m.a) {
                objQ = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar);
            }
            k kVar = (k) objQ;
            y0 y0VarG = android.support.v4.media.session.b.g(kVar, rVar, 6);
            float f = 8;
            f3.a(s.m(s.k(s.g(w0.d(o.b, 1.0f), 2, ((Boolean) y0VarG.getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : t.h, androidx.compose.foundation.shape.e.a(f)), kVar, aVar2, aVar), kVar, 1), androidx.compose.foundation.shape.e.a(f), ((Boolean) y0VarG.getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.c : com.app.mlounge.ui.theme.b.d, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(1355346042, new w1(9, nVar, iptvChannel, nVar2), rVar), rVar, 12582912, 120);
        } else {
            rVar.W();
        }
        q1 q1VarT = rVar.t();
        if (q1VarT != null) {
            q1VarT.d = new q(iptvChannel, nVar, nVar2, aVar, aVar2, i);
        }
    }

    public static final void b(List list, Map map, l lVar, l lVar2, r rVar, int i) {
        rVar.c0(-2010160921);
        int i2 = i | (rVar.h(list) ? 4 : 2) | (rVar.h(map) ? 32 : 16) | (rVar.h(lVar) ? 256 : 128) | (rVar.h(lVar2) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
        if (rVar.T(i2 & 1, (i2 & 1171) != 1170)) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            float f = 12;
            m0 m0Var = new m0(f, f, f, f);
            androidx.compose.foundation.layout.f fVarG = androidx.compose.foundation.layout.h.g(6);
            a0 a0Var = w0.c;
            boolean zH = ((i2 & 896) == 256) | rVar.h(list) | rVar.h(map) | rVar.e(jCurrentTimeMillis) | ((i2 & 7168) == 2048);
            Object objQ = rVar.Q();
            if (zH || objQ == m.a) {
                c cVar = new c(list, map, lVar, lVar2, jCurrentTimeMillis);
                rVar.l0(cVar);
                objQ = cVar;
            }
            coil3.network.g.a(a0Var, null, m0Var, fVarG, null, null, false, null, (l) objQ, rVar, 24966, 490);
        } else {
            rVar.W();
        }
        q1 q1VarT = rVar.t();
        if (q1VarT != null) {
            q1VarT.d = new androidx.compose.foundation.text.contextmenu.provider.d(list, map, lVar, lVar2, i, 3);
        }
    }

    public static final void c(kotlin.jvm.functions.r rVar, com.app.mlounge.ui.viewmodel.a0 a0Var, r rVar2, int i) {
        com.app.mlounge.ui.viewmodel.a0 a0Var2;
        r rVar3;
        int i2;
        com.app.mlounge.ui.viewmodel.a0 a0Var3;
        androidx.compose.runtime.f fVar;
        String str;
        androidx.compose.ui.i iVar;
        int i3;
        boolean z;
        y0 y0Var;
        kotlin.jvm.functions.r rVar4;
        boolean z2;
        r rVar5;
        r rVar6;
        List list;
        y0 y0Var2;
        Object obj;
        r rVar7;
        androidx.compose.runtime.f fVar2;
        boolean z3;
        r rVar8;
        r rVar9;
        Object obj2;
        androidx.compose.runtime.f fVar3;
        r rVar10 = rVar2;
        androidx.compose.ui.i iVar2 = androidx.compose.ui.c.H;
        rVar.getClass();
        rVar10.c0(-1123230026);
        int i4 = i | (rVar10.h(rVar) ? 4 : 2) | 16;
        if (rVar10.T(i4 & 1, (i4 & 19) != 18)) {
            rVar10.Y();
            if ((i & 1) == 0 || rVar10.C()) {
                androidx.lifecycle.w0 w0VarA = androidx.lifecycle.viewmodel.compose.a.a(rVar10);
                if (w0VarA == null) {
                    net.luminis.tls.engine.impl.c.r("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    i2 = i4 & (-113);
                    a0Var3 = (com.app.mlounge.ui.viewmodel.a0) h1.B(kotlin.jvm.internal.a0.a(com.app.mlounge.ui.viewmodel.a0.class), w0VarA, androidx.room.r.i(w0VarA, rVar10), w0VarA instanceof j ? ((j) w0VarA).getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.a.b, rVar10);
                }
            } else {
                rVar10.W();
                i2 = i4 & (-113);
                a0Var3 = a0Var;
            }
            rVar10.q();
            y0 y0VarG = androidx.compose.runtime.s.g(a0Var3.k, rVar10);
            y0 y0VarG2 = androidx.compose.runtime.s.g(a0Var3.r, rVar10);
            y0 y0VarG3 = androidx.compose.runtime.s.g(a0Var3.t, rVar10);
            y0 y0VarG4 = androidx.compose.runtime.s.g(a0Var3.v, rVar10);
            y0 y0VarG5 = androidx.compose.runtime.s.g(a0Var3.C, rVar10);
            y0 y0VarG6 = androidx.compose.runtime.s.g(a0Var3.n, rVar10);
            y0 y0VarG7 = androidx.compose.runtime.s.g(a0Var3.p, rVar10);
            y0 y0VarG8 = androidx.compose.runtime.s.g(a0Var3.E, rVar10);
            y0 y0VarG9 = androidx.compose.runtime.s.g(a0Var3.G, rVar10);
            y0 y0VarG10 = androidx.compose.runtime.s.g(a0Var3.I, rVar10);
            y0 y0VarG11 = androidx.compose.runtime.s.g(a0Var3.K, rVar10);
            y0 y0VarG12 = androidx.compose.runtime.s.g(a0Var3.M, rVar10);
            Object objQ = rVar10.Q();
            androidx.compose.runtime.f fVar4 = m.a;
            kotlin.coroutines.d dVar = null;
            Object obj3 = objQ;
            if (objQ == fVar4) {
                androidx.compose.runtime.h1 h1VarR = androidx.compose.runtime.s.r(null);
                rVar10.l0(h1VarR);
                obj3 = h1VarR;
            }
            y0 y0Var3 = (y0) obj3;
            Context context = (Context) rVar10.j(androidx.compose.ui.platform.m0.b);
            boolean zH = rVar10.h(a0Var3) | rVar10.h(context);
            Object objQ2 = rVar10.Q();
            Object obj4 = objQ2;
            if (zH || objQ2 == fVar4) {
                androidx.room.coroutines.f fVar5 = new androidx.room.coroutines.f(a0Var3, context, dVar, 9);
                rVar10.l0(fVar5);
                obj4 = fVar5;
            }
            j0.c(rVar10, y.a, (p) obj4);
            a0 a0Var4 = w0.c;
            v vVarA = androidx.compose.foundation.layout.t.a(androidx.compose.foundation.layout.h.c, androidx.compose.ui.c.J, rVar10, 0);
            int iHashCode = Long.hashCode(rVar10.T);
            androidx.compose.runtime.internal.j jVarL = rVar10.l();
            androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(rVar10, a0Var4);
            androidx.compose.ui.node.g.b.getClass();
            androidx.compose.ui.node.y yVar = androidx.compose.ui.node.f.b;
            rVar10.e0();
            if (rVar10.S) {
                rVar10.k(yVar);
            } else {
                rVar10.o0();
            }
            androidx.compose.ui.node.e eVar = androidx.compose.ui.node.f.e;
            androidx.compose.runtime.s.x(rVar10, vVarA, eVar);
            androidx.compose.ui.node.e eVar2 = androidx.compose.ui.node.f.d;
            androidx.compose.runtime.s.x(rVar10, jVarL, eVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            androidx.compose.ui.node.e eVar3 = androidx.compose.ui.node.f.f;
            androidx.compose.runtime.s.p(rVar10, numValueOf, eVar3);
            androidx.compose.ui.node.d dVar2 = androidx.compose.ui.node.f.g;
            androidx.compose.runtime.s.t(rVar10, dVar2);
            androidx.compose.ui.node.e eVar4 = androidx.compose.ui.node.f.c;
            androidx.compose.runtime.s.x(rVar10, rVarC, eVar4);
            androidx.compose.ui.text.m0 m0Var = ((t3) rVar10.j(u3.a)).e;
            long j = ((n0) rVar10.j(o0.a)).o;
            float f = 16;
            float f2 = 4;
            o oVar = o.b;
            androidx.compose.runtime.f fVar6 = fVar4;
            final com.app.mlounge.ui.viewmodel.a0 a0Var5 = a0Var3;
            p3.b("Live TV", androidx.compose.foundation.layout.b.s(oVar, f, f, 0.0f, f2, 4), j, 0L, null, 0L, null, 0L, 0, false, 0, 0, m0Var, rVar2, 54, 0, 131064);
            r rVar11 = rVar2;
            float f3 = 12;
            androidx.compose.ui.r rVarP = androidx.compose.foundation.layout.b.p(s.p(w0.d(oVar, 1.0f), s.o(rVar11), false), f3, f2);
            t0 t0VarA = r0.a(androidx.compose.foundation.layout.h.g(6), androidx.compose.ui.c.G, rVar11, 6);
            int iHashCode2 = Long.hashCode(rVar11.T);
            androidx.compose.runtime.internal.j jVarL2 = rVar11.l();
            androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(rVar11, rVarP);
            rVar11.e0();
            if (rVar11.S) {
                rVar11.k(yVar);
            } else {
                rVar11.o0();
            }
            androidx.compose.runtime.s.x(rVar11, t0VarA, eVar);
            androidx.compose.runtime.s.x(rVar11, jVarL2, eVar2);
            androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode2, rVar11, eVar3, rVar11, dVar2);
            androidx.compose.runtime.s.x(rVar11, rVarC2, eVar4);
            rVar11.b0(-271559712);
            for (kotlin.k kVar : a0Var5.O) {
                final String str2 = (String) kVar.e;
                String str3 = (String) kVar.y;
                boolean zA = kotlin.jvm.internal.l.a((String) y0VarG4.getValue(), str2);
                boolean zH2 = rVar11.h(a0Var5) | rVar11.f(str2);
                Object objQ3 = rVar11.Q();
                if (zH2) {
                    fVar3 = fVar6;
                } else {
                    fVar3 = fVar6;
                    if (objQ3 == fVar3) {
                    }
                    d(str3, zA, (kotlin.jvm.functions.a) objQ3, rVar11, 0);
                    fVar6 = fVar3;
                }
                final int i5 = 1;
                objQ3 = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.screens.livetv.b
                    @Override // kotlin.jvm.functions.a
                    public final Object invoke() {
                        switch (i5) {
                            case 0:
                                a0Var5.J.setValue(str2);
                                break;
                            case 1:
                                String str4 = str2;
                                str4.getClass();
                                com.app.mlounge.ui.viewmodel.a0 a0Var6 = a0Var5;
                                a0Var6.u.setValue(str4);
                                a0Var6.o.setValue(null);
                                a0Var6.J.setValue(null);
                                a0Var6.H.setValue(u.e);
                                if (!str4.equals(com.app.mlounge.data.iptv.l.SLUG)) {
                                    a0Var6.F.setValue(Boolean.FALSE);
                                    a0Var6.D.setValue(kotlin.collections.v.e);
                                }
                                BuildersKt__Builders_commonKt.launch$default(l0.g(a0Var6), null, null, new androidx.room.coroutines.f(a0Var6, str4, null, 25), 3, null);
                                a0Var6.k();
                                break;
                            default:
                                String str5 = str2;
                                com.app.mlounge.ui.viewmodel.a0 a0Var7 = a0Var5;
                                a0Var7.o.setValue(str5);
                                a0Var7.i();
                                break;
                        }
                        return y.a;
                    }
                };
                rVar11.l0(objQ3);
                d(str3, zA, (kotlin.jvm.functions.a) objQ3, rVar11, 0);
                fVar6 = fVar3;
            }
            androidx.compose.runtime.f fVar7 = fVar6;
            rVar11.p(false);
            rVar11.p(true);
            if (((List) y0VarG6.getValue()).isEmpty()) {
                fVar = fVar7;
                str = "All";
                iVar = iVar2;
                rVar11.b0(890876578);
                rVar11.p(false);
            } else {
                rVar11.b0(890034742);
                androidx.compose.ui.r rVarP2 = androidx.compose.foundation.layout.b.p(s.p(w0.d(oVar, 1.0f), s.o(rVar11), false), f3, f2);
                t0 t0VarA2 = r0.a(androidx.compose.foundation.layout.h.g(8), iVar2, rVar11, 54);
                int iHashCode3 = Long.hashCode(rVar11.T);
                androidx.compose.runtime.internal.j jVarL3 = rVar11.l();
                androidx.compose.ui.r rVarC3 = androidx.compose.ui.a.c(rVar11, rVarP2);
                androidx.compose.ui.node.g.b.getClass();
                androidx.compose.ui.node.y yVar2 = androidx.compose.ui.node.f.b;
                rVar11.e0();
                if (rVar11.S) {
                    rVar11.k(yVar2);
                } else {
                    rVar11.o0();
                }
                androidx.compose.runtime.s.x(rVar11, t0VarA2, androidx.compose.ui.node.f.e);
                androidx.compose.runtime.s.x(rVar11, jVarL3, androidx.compose.ui.node.f.d);
                androidx.compose.runtime.s.p(rVar11, Integer.valueOf(iHashCode3), androidx.compose.ui.node.f.f);
                androidx.compose.runtime.s.t(rVar11, androidx.compose.ui.node.f.g);
                androidx.compose.runtime.s.x(rVar11, rVarC3, androidx.compose.ui.node.f.c);
                fVar = fVar7;
                str = "All";
                iVar = iVar2;
                f1.b(t1.o(), "Filter groups", w0.l(oVar, 20), com.app.mlounge.ui.theme.b.m, rVar11, 432, 0);
                boolean z4 = ((String) y0VarG7.getValue()) == null;
                boolean zH3 = rVar11.h(a0Var5);
                Object objQ4 = rVar11.Q();
                Object obj5 = objQ4;
                if (zH3 || objQ4 == fVar) {
                    final int i6 = 0;
                    kotlin.jvm.functions.a aVar = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.screens.livetv.d
                        @Override // kotlin.jvm.functions.a
                        public final Object invoke() {
                            switch (i6) {
                                case 0:
                                    com.app.mlounge.ui.viewmodel.a0 a0Var6 = a0Var5;
                                    a0Var6.o.setValue(null);
                                    a0Var6.i();
                                    break;
                                default:
                                    a0Var5.J.setValue(null);
                                    break;
                            }
                            return y.a;
                        }
                    };
                    rVar11.l0(aVar);
                    obj5 = aVar;
                }
                d(str, z4, (kotlin.jvm.functions.a) obj5, rVar11, 6);
                rVar11.b0(-511566301);
                for (final String str4 : (List) y0VarG6.getValue()) {
                    boolean zA2 = kotlin.jvm.internal.l.a((String) y0VarG7.getValue(), str4);
                    boolean zH4 = rVar11.h(a0Var5) | rVar11.f(str4);
                    Object objQ5 = rVar11.Q();
                    if (zH4 || objQ5 == fVar) {
                        final int i7 = 2;
                        objQ5 = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.screens.livetv.b
                            @Override // kotlin.jvm.functions.a
                            public final Object invoke() {
                                switch (i7) {
                                    case 0:
                                        a0Var5.J.setValue(str4);
                                        break;
                                    case 1:
                                        String str5 = str4;
                                        str5.getClass();
                                        com.app.mlounge.ui.viewmodel.a0 a0Var6 = a0Var5;
                                        a0Var6.u.setValue(str5);
                                        a0Var6.o.setValue(null);
                                        a0Var6.J.setValue(null);
                                        a0Var6.H.setValue(u.e);
                                        if (!str5.equals(com.app.mlounge.data.iptv.l.SLUG)) {
                                            a0Var6.F.setValue(Boolean.FALSE);
                                            a0Var6.D.setValue(kotlin.collections.v.e);
                                        }
                                        BuildersKt__Builders_commonKt.launch$default(l0.g(a0Var6), null, null, new androidx.room.coroutines.f(a0Var6, str5, null, 25), 3, null);
                                        a0Var6.k();
                                        break;
                                    default:
                                        String str6 = str4;
                                        com.app.mlounge.ui.viewmodel.a0 a0Var7 = a0Var5;
                                        a0Var7.o.setValue(str6);
                                        a0Var7.i();
                                        break;
                                }
                                return y.a;
                            }
                        };
                        rVar11.l0(objQ5);
                    }
                    d(str4, zA2, (kotlin.jvm.functions.a) objQ5, rVar11, 0);
                }
                androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.u(rVar11, false, true, false);
            }
            if (!kotlin.jvm.internal.l.a((String) y0VarG4.getValue(), "sports") || ((List) y0VarG10.getValue()).isEmpty()) {
                i3 = 8;
                z = false;
                rVar11.b0(891905282);
                rVar11.p(false);
            } else {
                rVar11.b0(891016357);
                androidx.compose.ui.r rVarP3 = androidx.compose.foundation.layout.b.p(s.p(w0.d(oVar, 1.0f), s.o(rVar11), false), f3, f2);
                t0 t0VarA3 = r0.a(androidx.compose.foundation.layout.h.g(8), iVar, rVar11, 54);
                int iHashCode4 = Long.hashCode(rVar11.T);
                androidx.compose.runtime.internal.j jVarL4 = rVar11.l();
                androidx.compose.ui.r rVarC4 = androidx.compose.ui.a.c(rVar11, rVarP3);
                androidx.compose.ui.node.g.b.getClass();
                androidx.compose.ui.node.y yVar3 = androidx.compose.ui.node.f.b;
                rVar11.e0();
                if (rVar11.S) {
                    rVar11.k(yVar3);
                } else {
                    rVar11.o0();
                }
                androidx.compose.runtime.s.x(rVar11, t0VarA3, androidx.compose.ui.node.f.e);
                androidx.compose.runtime.s.x(rVar11, jVarL4, androidx.compose.ui.node.f.d);
                androidx.compose.runtime.s.p(rVar11, Integer.valueOf(iHashCode4), androidx.compose.ui.node.f.f);
                androidx.compose.runtime.s.t(rVar11, androidx.compose.ui.node.f.g);
                androidx.compose.runtime.s.x(rVar11, rVarC4, androidx.compose.ui.node.f.c);
                i3 = 8;
                f1.b(t1.o(), "Filter server", w0.l(oVar, 20), com.app.mlounge.ui.theme.b.m, rVar11, 432, 0);
                boolean z5 = ((String) y0VarG11.getValue()) == null;
                boolean zH5 = rVar11.h(a0Var5);
                Object objQ6 = rVar11.Q();
                Object obj6 = objQ6;
                if (zH5 || objQ6 == fVar) {
                    final int i8 = 1;
                    kotlin.jvm.functions.a aVar2 = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.screens.livetv.d
                        @Override // kotlin.jvm.functions.a
                        public final Object invoke() {
                            switch (i8) {
                                case 0:
                                    com.app.mlounge.ui.viewmodel.a0 a0Var6 = a0Var5;
                                    a0Var6.o.setValue(null);
                                    a0Var6.i();
                                    break;
                                default:
                                    a0Var5.J.setValue(null);
                                    break;
                            }
                            return y.a;
                        }
                    };
                    rVar11.l0(aVar2);
                    obj6 = aVar2;
                }
                d(str, z5, (kotlin.jvm.functions.a) obj6, rVar11, 6);
                rVar11.b0(769009982);
                for (final String str5 : a0Var5.N) {
                    boolean zA3 = kotlin.jvm.internal.l.a((String) y0VarG11.getValue(), str5);
                    boolean zH6 = rVar11.h(a0Var5) | rVar11.f(str5);
                    Object objQ7 = rVar11.Q();
                    if (zH6 || objQ7 == fVar) {
                        final int i9 = 0;
                        objQ7 = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.screens.livetv.b
                            @Override // kotlin.jvm.functions.a
                            public final Object invoke() {
                                switch (i9) {
                                    case 0:
                                        a0Var5.J.setValue(str5);
                                        break;
                                    case 1:
                                        String str6 = str5;
                                        str6.getClass();
                                        com.app.mlounge.ui.viewmodel.a0 a0Var6 = a0Var5;
                                        a0Var6.u.setValue(str6);
                                        a0Var6.o.setValue(null);
                                        a0Var6.J.setValue(null);
                                        a0Var6.H.setValue(u.e);
                                        if (!str6.equals(com.app.mlounge.data.iptv.l.SLUG)) {
                                            a0Var6.F.setValue(Boolean.FALSE);
                                            a0Var6.D.setValue(kotlin.collections.v.e);
                                        }
                                        BuildersKt__Builders_commonKt.launch$default(l0.g(a0Var6), null, null, new androidx.room.coroutines.f(a0Var6, str6, null, 25), 3, null);
                                        a0Var6.k();
                                        break;
                                    default:
                                        String str7 = str5;
                                        com.app.mlounge.ui.viewmodel.a0 a0Var7 = a0Var5;
                                        a0Var7.o.setValue(str7);
                                        a0Var7.i();
                                        break;
                                }
                                return y.a;
                            }
                        };
                        rVar11.l0(objQ7);
                    }
                    d(str5, zA3, (kotlin.jvm.functions.a) objQ7, rVar11, 0);
                }
                z = false;
                androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.u(rVar11, false, true, false);
            }
            if (((Boolean) y0VarG2.getValue()).booleanValue()) {
                rVar11.b0(2106982482);
                b0.n(null, rVar11, z ? 1 : 0);
                rVar11.p(z);
                z2 = true;
                rVar4 = rVar;
                y0Var = y0Var3;
                rVar7 = rVar11;
            } else {
                if (!kotlin.jvm.internal.l.a((String) y0VarG4.getValue(), "sports") || ((List) y0VarG10.getValue()).isEmpty()) {
                    r rVar12 = rVar11;
                    y0Var = y0Var3;
                    if (((String) y0VarG3.getValue()) != null && ((List) y0VarG.getValue()).isEmpty()) {
                        rVar12.b0(2107035364);
                        String str6 = (String) y0VarG3.getValue();
                        str6.getClass();
                        boolean zH7 = rVar12.h(a0Var5);
                        Object objQ8 = rVar12.Q();
                        if (zH7 || objQ8 == fVar) {
                            androidx.compose.foundation.r0 r0Var = new androidx.compose.foundation.r0(0, a0Var5, com.app.mlounge.ui.viewmodel.a0.class, "searchChannels", "searchChannels()V", 0, 8);
                            rVar12.l0(r0Var);
                            objQ8 = r0Var;
                        }
                        z = false;
                        b0.i(str6, null, (kotlin.jvm.functions.a) ((kotlin.reflect.e) objQ8), rVar12, 0);
                        rVar12.p(false);
                        rVar4 = rVar;
                        rVar6 = rVar12;
                    } else if (kotlin.jvm.internal.l.a((String) y0VarG4.getValue(), com.app.mlounge.data.iptv.l.SLUG) && ((Boolean) y0VarG9.getValue()).booleanValue()) {
                        rVar12.b0(893744574);
                        a0 a0Var6 = w0.c;
                        q0 q0VarD = androidx.compose.foundation.layout.p.d(androidx.compose.ui.c.B, false);
                        int iHashCode5 = Long.hashCode(rVar12.T);
                        androidx.compose.runtime.internal.j jVarL5 = rVar12.l();
                        androidx.compose.ui.r rVarC5 = androidx.compose.ui.a.c(rVar12, a0Var6);
                        androidx.compose.ui.node.g.b.getClass();
                        androidx.compose.ui.node.y yVar4 = androidx.compose.ui.node.f.b;
                        rVar12.e0();
                        if (rVar12.S) {
                            rVar12.k(yVar4);
                        } else {
                            rVar12.o0();
                        }
                        androidx.compose.ui.node.e eVar5 = androidx.compose.ui.node.f.e;
                        androidx.compose.runtime.s.x(rVar12, q0VarD, eVar5);
                        androidx.compose.ui.node.e eVar6 = androidx.compose.ui.node.f.d;
                        androidx.compose.runtime.s.x(rVar12, jVarL5, eVar6);
                        Integer numValueOf2 = Integer.valueOf(iHashCode5);
                        androidx.compose.ui.node.e eVar7 = androidx.compose.ui.node.f.f;
                        androidx.compose.runtime.s.p(rVar12, numValueOf2, eVar7);
                        androidx.compose.ui.node.d dVar3 = androidx.compose.ui.node.f.g;
                        androidx.compose.runtime.s.t(rVar12, dVar3);
                        androidx.compose.ui.node.e eVar8 = androidx.compose.ui.node.f.c;
                        androidx.compose.runtime.s.x(rVar12, rVarC5, eVar8);
                        v vVarA2 = androidx.compose.foundation.layout.t.a(androidx.compose.foundation.layout.h.g(f3), androidx.compose.ui.c.K, rVar12, 54);
                        int iHashCode6 = Long.hashCode(rVar12.T);
                        androidx.compose.runtime.internal.j jVarL6 = rVar12.l();
                        androidx.compose.ui.r rVarC6 = androidx.compose.ui.a.c(rVar12, oVar);
                        rVar12.e0();
                        if (rVar12.S) {
                            rVar12.k(yVar4);
                        } else {
                            rVar12.o0();
                        }
                        androidx.compose.runtime.s.x(rVar12, vVarA2, eVar5);
                        androidx.compose.runtime.s.x(rVar12, jVarL6, eVar6);
                        androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode6, rVar12, eVar7, rVar12, dVar3);
                        androidx.compose.runtime.s.x(rVar12, rVarC6, eVar8);
                        androidx.compose.ui.graphics.vector.f fVarP = okhttp3.internal.platform.android.g.p();
                        long j2 = com.app.mlounge.ui.theme.b.m;
                        rVar4 = rVar;
                        f1.b(fVarP, null, w0.l(oVar, 56), j2, rVar2, 432, 0);
                        u2 u2Var = u3.a;
                        p3.b("No custom provider configured", null, com.app.mlounge.ui.theme.b.l, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar2.j(u2Var)).h, rVar2, 6, 0, 131066);
                        p3.b("Go to Settings → Custom IPTV Provider to add your playlist", null, j2, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar2.j(u2Var)).k, rVar2, 6, 0, 131066);
                        r rVar13 = rVar2;
                        z2 = true;
                        z = false;
                        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.u(rVar13, true, true, false);
                        rVar7 = rVar13;
                    } else {
                        rVar4 = rVar;
                        if (!kotlin.jvm.internal.l.a((String) y0VarG4.getValue(), com.app.mlounge.data.iptv.l.SLUG) || ((Map) y0VarG8.getValue()).isEmpty() || ((List) y0VarG.getValue()).isEmpty()) {
                            rVar12.b0(895181703);
                            androidx.compose.foundation.lazy.grid.a aVar3 = new androidx.compose.foundation.lazy.grid.a(((com.app.mlounge.ui.theme.a) rVar12.j(com.app.mlounge.ui.theme.f.a)).y * 1.07f);
                            m0 m0Var2 = new m0(f3, f3, f3, f3);
                            float f4 = i3;
                            androidx.compose.foundation.layout.f fVarG = androidx.compose.foundation.layout.h.g(f4);
                            androidx.compose.foundation.layout.f fVarG2 = androidx.compose.foundation.layout.h.g(f4);
                            a0 a0Var7 = w0.c;
                            boolean zF = rVar12.f(y0VarG) | rVar12.h(a0Var5) | ((i2 & 14) == 4);
                            Object objQ9 = rVar12.Q();
                            Object obj7 = objQ9;
                            if (zF || objQ9 == fVar) {
                                androidx.compose.animation.core.a aVar4 = new androidx.compose.animation.core.a(18, y0VarG, a0Var5, rVar4);
                                rVar12.l0(aVar4);
                                obj7 = aVar4;
                            }
                            com.google.android.gms.dynamite.g.a(aVar3, a0Var7, null, m0Var2, fVarG2, fVarG, null, false, null, (l) obj7, rVar12, 1772592, 916);
                            r rVar14 = rVar12;
                            z = false;
                            rVar14.p(false);
                            rVar5 = rVar14;
                        } else {
                            rVar12.b0(894625253);
                            List list2 = (List) y0VarG.getValue();
                            Map map = (Map) y0VarG8.getValue();
                            boolean zH8 = rVar12.h(a0Var5) | ((i2 & 14) == 4);
                            Object objQ10 = rVar12.Q();
                            Object obj8 = objQ10;
                            if (zH8 || objQ10 == fVar) {
                                androidx.datastore.core.t0 t0Var = new androidx.datastore.core.t0(14, a0Var5, rVar4);
                                rVar12.l0(t0Var);
                                obj8 = t0Var;
                            }
                            l lVar = (l) obj8;
                            boolean zH9 = rVar12.h(a0Var5);
                            Object objQ11 = rVar12.Q();
                            Object obj9 = objQ11;
                            if (zH9 || objQ11 == fVar) {
                                androidx.compose.ui.text.font.e eVar9 = new androidx.compose.ui.text.font.e(a0Var5, 11);
                                rVar12.l0(eVar9);
                                obj9 = eVar9;
                            }
                            b(list2, map, lVar, (l) obj9, rVar2, 0);
                            r rVar15 = rVar2;
                            z = false;
                            rVar15.p(false);
                            rVar5 = rVar15;
                        }
                        z2 = true;
                        rVar7 = rVar5;
                    }
                } else {
                    rVar11.b0(892085888);
                    if (((String) y0VarG11.getValue()) == null) {
                        list = (List) y0VarG10.getValue();
                    } else {
                        List list3 = (List) y0VarG10.getValue();
                        ArrayList arrayList = new ArrayList();
                        for (Object obj10 : list3) {
                            if (kotlin.text.r.I(((SportsMatch) obj10).e(), (String) y0VarG11.getValue(), true)) {
                                arrayList.add(obj10);
                            }
                        }
                        list = arrayList;
                    }
                    m0 m0Var3 = new m0(f3, f3, f3, f3);
                    androidx.compose.foundation.layout.f fVarG3 = androidx.compose.foundation.layout.h.g(i3);
                    a0 a0Var8 = w0.c;
                    boolean zH10 = rVar11.h(list) | rVar11.h(a0Var5) | ((i2 & 14) == 4);
                    Object objQ12 = rVar11.Q();
                    if (zH10 || objQ12 == fVar) {
                        rVar4 = rVar;
                        y0Var2 = y0Var3;
                        i0 i0Var = new i0(list, a0Var5, rVar4, y0Var2);
                        rVar11.l0(i0Var);
                        obj = i0Var;
                    } else {
                        rVar4 = rVar;
                        y0Var2 = y0Var3;
                        obj = objQ12;
                    }
                    y0Var = y0Var2;
                    coil3.network.g.a(a0Var8, null, m0Var3, fVarG3, null, null, false, null, (l) obj, rVar2, 24966, 490);
                    r rVar16 = rVar2;
                    z = false;
                    rVar16.p(false);
                    rVar6 = rVar16;
                }
                rVar5 = rVar6;
                z2 = true;
                rVar7 = rVar5;
            }
            rVar7.p(z2);
            SportsMatch sportsMatch = (SportsMatch) y0Var.getValue();
            if (sportsMatch == null) {
                rVar7.b0(-46311262);
                rVar7.p(z);
                fVar2 = fVar;
                z3 = z;
                rVar8 = rVar7;
            } else {
                rVar7.b0(-46311261);
                List listF = sportsMatch.f();
                if (listF == null) {
                    listF = u.e;
                }
                long j3 = com.app.mlounge.ui.theme.b.b;
                u2 u2Var2 = o0.a;
                long j4 = ((n0) rVar7.j(u2Var2)).q;
                long j5 = ((n0) rVar7.j(u2Var2)).s;
                Object objQ13 = rVar7.Q();
                Object obj11 = objQ13;
                if (objQ13 == fVar) {
                    androidx.compose.foundation.lazy.n nVar = new androidx.compose.foundation.lazy.n(y0Var, 17);
                    rVar7.l0(nVar);
                    obj11 = nVar;
                }
                fVar2 = fVar;
                t2.a((kotlin.jvm.functions.a) obj11, a, null, null, b, androidx.compose.runtime.internal.k.c(1346468866, new q(listF, a0Var5, sportsMatch, rVar4, y0Var), rVar7), null, j3, 0L, j4, j5, 0.0f, null, rVar2, 1769526, 0, 12956);
                r rVar17 = rVar2;
                z3 = false;
                rVar17.p(false);
                rVar8 = rVar17;
            }
            String str7 = (String) y0VarG5.getValue();
            if (str7 == null) {
                str7 = (String) y0VarG12.getValue();
            }
            if (str7 != null) {
                rVar8.b0(-44406838);
                Object objQ14 = rVar8.Q();
                if (objQ14 == fVar2) {
                    obj2 = objQ14;
                    androidx.activity.compose.b bVar = new androidx.activity.compose.b(1);
                    rVar8.l0(bVar);
                    obj2 = bVar;
                }
                obj2 = objQ14;
                androidx.compose.runtime.internal.f fVarC = androidx.compose.runtime.internal.k.c(-609379896, new com.app.mlounge.ui.components.s(str7, 5), rVar8);
                long j6 = com.app.mlounge.ui.theme.b.b;
                u2 u2Var3 = o0.a;
                t2.a((kotlin.jvm.functions.a) obj2, c, null, null, d, fVarC, null, j6, 0L, ((n0) rVar8.j(u2Var3)).q, ((n0) rVar8.j(u2Var3)).s, 0.0f, null, rVar2, 1769526, 0, 12956);
                r rVar18 = rVar2;
                rVar18.p(false);
                rVar9 = rVar18;
            } else {
                rVar8.b0(-43728372);
                rVar8.p(z3);
                rVar9 = rVar8;
            }
            a0Var2 = a0Var5;
            rVar3 = rVar9;
        } else {
            rVar10.W();
            a0Var2 = a0Var;
            rVar3 = rVar10;
        }
        q1 q1VarT = rVar3.t();
        if (q1VarT != null) {
            q1VarT.d = new androidx.compose.foundation.contextmenu.f(rVar, a0Var2, i, 19);
        }
    }

    public static final void d(String str, boolean z, kotlin.jvm.functions.a aVar, r rVar, int i) {
        int i2;
        rVar.c0(375510118);
        if ((i & 6) == 0) {
            i2 = (rVar.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (rVar.g(z) ? 32 : 16) | (rVar.h(aVar) ? 256 : 128);
        if (rVar.T(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
            Object objQ = rVar.Q();
            androidx.compose.runtime.f fVar = m.a;
            if (objQ == fVar) {
                objQ = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar);
            }
            k kVar = (k) objQ;
            float f = 8;
            androidx.compose.ui.r rVarG = s.g(androidx.compose.ui.draw.h.a(o.b, androidx.compose.foundation.shape.e.a(f)), 2, ((Boolean) android.support.v4.media.session.b.g(kVar, rVar, 6).getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : t.h, androidx.compose.foundation.shape.e.a(f));
            boolean z2 = (i3 & 896) == 256;
            Object objQ2 = rVar.Q();
            if (z2 || objQ2 == fVar) {
                objQ2 = new j2(7, aVar);
                rVar.l0(objQ2);
            }
            f3.a(s.m(s.i(rVarG, kVar, null, false, null, (kotlin.jvm.functions.a) objQ2, 28), kVar, 1), androidx.compose.foundation.shape.e.a(f), z ? t.b(0.3f, com.app.mlounge.ui.theme.b.f) : com.app.mlounge.ui.theme.b.c, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(-1531836543, new com.app.mlounge.ui.screens.adult.b(1, str, z), rVar), rVar, 12582912, 120);
        } else {
            rVar.W();
        }
        q1 q1VarT = rVar.t();
        if (q1VarT != null) {
            q1VarT.d = new androidx.compose.foundation.text.selection.g(str, z, aVar, i);
        }
    }

    public static final void e(SportsMatch sportsMatch, kotlin.jvm.functions.a aVar, r rVar, int i) {
        int i2;
        rVar.c0(-1135449566);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? rVar.f(sportsMatch) : rVar.h(sportsMatch) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= rVar.h(aVar) ? 32 : 16;
        }
        if (rVar.T(i2 & 1, (i2 & 19) != 18)) {
            Object objQ = rVar.Q();
            androidx.compose.runtime.f fVar = m.a;
            if (objQ == fVar) {
                objQ = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar);
            }
            k kVar = (k) objQ;
            y0 y0VarG = android.support.v4.media.session.b.g(kVar, rVar, 6);
            float f = 8;
            androidx.compose.ui.r rVarG = s.g(w0.d(o.b, 1.0f), 2, ((Boolean) y0VarG.getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : t.h, androidx.compose.foundation.shape.e.a(f));
            boolean z = (i2 & Token.ASSIGN_MOD) == 32;
            Object objQ2 = rVar.Q();
            if (z || objQ2 == fVar) {
                objQ2 = new j2(8, aVar);
                rVar.l0(objQ2);
            }
            f3.a(s.m(s.i(rVarG, kVar, null, false, null, (kotlin.jvm.functions.a) objQ2, 28), kVar, 1), androidx.compose.foundation.shape.e.a(f), ((Boolean) y0VarG.getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.c : com.app.mlounge.ui.theme.b.d, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(1252171069, new g0(sportsMatch, 20), rVar), rVar, 12582912, 120);
        } else {
            rVar.W();
        }
        q1 q1VarT = rVar.t();
        if (q1VarT != null) {
            q1VarT.d = new v1(sportsMatch, aVar, i, 11);
        }
    }
}
