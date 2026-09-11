package com.app.mlounge.ui.screens.tvshows;

import androidx.compose.foundation.layout.a0;
import androidx.compose.foundation.layout.h0;
import androidx.compose.foundation.layout.m0;
import androidx.compose.foundation.layout.r0;
import androidx.compose.foundation.layout.t0;
import androidx.compose.foundation.layout.v;
import androidx.compose.foundation.layout.w0;
import androidx.compose.foundation.lazy.grid.x;
import androidx.compose.foundation.lazy.grid.z;
import androidx.compose.foundation.s;
import androidx.compose.material3.f1;
import androidx.compose.material3.f3;
import androidx.compose.material3.j2;
import androidx.compose.material3.n0;
import androidx.compose.material3.o0;
import androidx.compose.material3.p3;
import androidx.compose.material3.t3;
import androidx.compose.material3.u3;
import androidx.compose.runtime.q1;
import androidx.compose.runtime.u2;
import androidx.compose.runtime.y0;
import androidx.compose.ui.graphics.j0;
import androidx.compose.ui.graphics.t;
import androidx.compose.ui.layout.q0;
import androidx.compose.ui.node.y;
import androidx.datastore.preferences.protobuf.h1;
import com.app.mlounge.R;
import com.app.mlounge.data.remote.model.TmdbEpisode;
import com.app.mlounge.data.remote.model.TmdbGenre;
import com.app.mlounge.emulator.LibretroCore;
import com.app.mlounge.ui.components.b0;
import com.app.mlounge.ui.viewmodel.x1;
import com.google.firebase.crashlytics.internal.model.t1;
import java.util.List;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.mozilla.javascript.Parser;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final androidx.compose.runtime.internal.f a = new androidx.compose.runtime.internal.f(1437921525, false, new com.app.mlounge.ui.screens.search.a(26));
    public static final androidx.compose.runtime.internal.f b = new androidx.compose.runtime.internal.f(72181556, false, new com.app.mlounge.ui.screens.settings.a(12));
    public static final androidx.compose.runtime.internal.f c = new androidx.compose.runtime.internal.f(1051597153, false, new com.app.mlounge.ui.screens.settings.a(13));

    public static final void a(String str, kotlin.jvm.functions.a aVar, kotlin.jvm.functions.a aVar2, kotlin.jvm.functions.a aVar3, androidx.compose.runtime.r rVar, int i) {
        rVar.c0(2005859184);
        int i2 = (rVar.f(str) ? 4 : 2) | i | (rVar.h(aVar) ? 32 : 16) | (rVar.h(aVar2) ? LibretroCore.SCREEN_WIDTH : 128);
        if (rVar.T(i2 & 1, (i2 & 1171) != 1170)) {
            t1.a(aVar3, null, androidx.compose.runtime.internal.k.c(-2126052153, new d(str, aVar, aVar2, 0), rVar), rVar, 390, 2);
        } else {
            rVar.W();
        }
        q1 q1VarT = rVar.t();
        if (q1VarT != null) {
            q1VarT.d = new androidx.compose.foundation.text.contextmenu.provider.d(str, aVar, aVar2, aVar3, i, 7);
        }
    }

    public static final void b(final androidx.compose.ui.r rVar, final TmdbEpisode tmdbEpisode, final String str, final float f, final boolean z, final kotlin.jvm.functions.a aVar, androidx.compose.runtime.r rVar2, final int i) {
        rVar2.c0(-197155420);
        int i2 = i | (rVar2.f(rVar) ? 4 : 2) | (rVar2.f(tmdbEpisode) ? 32 : 16) | (rVar2.f(str) ? LibretroCore.SCREEN_WIDTH : 128) | (rVar2.c(f) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) | (rVar2.g(z) ? 16384 : 8192) | (rVar2.h(aVar) ? 131072 : Parser.ARGC_LIMIT);
        if (rVar2.T(i2 & 1, (74899 & i2) != 74898)) {
            Object objQ = rVar2.Q();
            androidx.compose.runtime.f fVar = androidx.compose.runtime.m.a;
            if (objQ == fVar) {
                objQ = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar2);
            }
            androidx.compose.foundation.interaction.k kVar = (androidx.compose.foundation.interaction.k) objQ;
            y0 y0VarG = android.support.v4.media.session.b.g(kVar, rVar2, 6);
            float f2 = 16;
            float f3 = 4;
            androidx.compose.ui.r rVarR = androidx.compose.foundation.layout.b.r(w0.d(rVar, 1.0f), f2, f3, f2, f > 0.0f ? 2 : f3);
            float f4 = 8;
            androidx.compose.ui.r rVarG = s.g(androidx.compose.ui.draw.h.a(rVarR, androidx.compose.foundation.shape.e.a(f4)), 2, ((Boolean) y0VarG.getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : t.h, androidx.compose.foundation.shape.e.a(f4));
            boolean z2 = (i2 & 458752) == 131072;
            Object objQ2 = rVar2.Q();
            if (z2 || objQ2 == fVar) {
                objQ2 = new j2(20, aVar);
                rVar2.l0(objQ2);
            }
            f3.a(s.m(s.i(rVarG, kVar, null, false, null, (kotlin.jvm.functions.a) objQ2, 28), kVar, 1), androidx.compose.foundation.shape.e.a(f4), com.app.mlounge.ui.theme.b.d, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(911966697, new kotlin.jvm.functions.p() { // from class: com.app.mlounge.ui.screens.tvshows.f
                @Override // kotlin.jvm.functions.p
                public final Object invoke(Object obj, Object obj2) {
                    androidx.compose.runtime.r rVar3 = (androidx.compose.runtime.r) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (rVar3.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                        androidx.compose.foundation.layout.c cVar = androidx.compose.foundation.layout.h.c;
                        androidx.compose.ui.h hVar = androidx.compose.ui.c.J;
                        v vVarA = androidx.compose.foundation.layout.t.a(cVar, hVar, rVar3, 0);
                        int iHashCode = Long.hashCode(rVar3.T);
                        androidx.compose.runtime.internal.j jVarL = rVar3.l();
                        androidx.compose.ui.o oVar = androidx.compose.ui.o.b;
                        androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(rVar3, oVar);
                        androidx.compose.ui.node.g.b.getClass();
                        y yVar = androidx.compose.ui.node.f.b;
                        rVar3.e0();
                        if (rVar3.S) {
                            rVar3.k(yVar);
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
                        androidx.compose.ui.r rVarO = androidx.compose.foundation.layout.b.o(w0.d(oVar, 1.0f), 8);
                        t0 t0VarA = r0.a(androidx.compose.foundation.layout.h.a, androidx.compose.ui.c.H, rVar3, 48);
                        int iHashCode2 = Long.hashCode(rVar3.T);
                        androidx.compose.runtime.internal.j jVarL2 = rVar3.l();
                        androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(rVar3, rVarO);
                        rVar3.e0();
                        if (rVar3.S) {
                            rVar3.k(yVar);
                        } else {
                            rVar3.o0();
                        }
                        androidx.compose.runtime.s.x(rVar3, t0VarA, eVar);
                        androidx.compose.runtime.s.x(rVar3, jVarL2, eVar2);
                        androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode2, rVar3, eVar3, rVar3, dVar);
                        androidx.compose.runtime.s.x(rVar3, rVarC2, eVar4);
                        TmdbEpisode tmdbEpisode2 = tmdbEpisode;
                        float f5 = 4;
                        coil3.compose.k.a(str, tmdbEpisode2.c(), androidx.compose.ui.draw.h.a(w0.f(w0.p(oVar, 120), 68), androidx.compose.foundation.shape.e.a(f5)), null, androidx.compose.ui.layout.i.a, rVar3, 1572864, 1976);
                        androidx.compose.foundation.layout.b.d(rVar3, w0.p(oVar, 12));
                        if (z) {
                            rVar3.b0(626549675);
                            f1.a(androidx.room.r.q(R.drawable.ic_check, rVar3), "Watched", androidx.compose.foundation.layout.b.s(w0.l(oVar, 20), 0.0f, 0.0f, f5, 0.0f, 11), com.app.mlounge.ui.theme.b.p, rVar3, 3512);
                            rVar3.p(false);
                        } else {
                            rVar3.b0(626832767);
                            rVar3.p(false);
                        }
                        if (1.0f <= 0.0d) {
                            androidx.compose.foundation.layout.internal.a.a("invalid weight; must be greater than zero");
                        }
                        h0 h0Var = new h0(1.0f, true);
                        v vVarA2 = androidx.compose.foundation.layout.t.a(cVar, hVar, rVar3, 0);
                        int iHashCode3 = Long.hashCode(rVar3.T);
                        androidx.compose.runtime.internal.j jVarL3 = rVar3.l();
                        androidx.compose.ui.r rVarC3 = androidx.compose.ui.a.c(rVar3, h0Var);
                        rVar3.e0();
                        if (rVar3.S) {
                            rVar3.k(yVar);
                        } else {
                            rVar3.o0();
                        }
                        androidx.compose.runtime.s.x(rVar3, vVarA2, eVar);
                        androidx.compose.runtime.s.x(rVar3, jVarL3, eVar2);
                        androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode3, rVar3, eVar3, rVar3, dVar);
                        androidx.compose.runtime.s.x(rVar3, rVarC3, eVar4);
                        int iA = tmdbEpisode2.a();
                        String strC = tmdbEpisode2.c();
                        if (strC == null) {
                            strC = "";
                        }
                        String str2 = "E" + iA + ": " + strC;
                        u2 u2Var = u3.a;
                        p3.b(str2, null, com.app.mlounge.ui.theme.b.l, 0L, null, 0L, null, 0L, 2, false, 1, 0, ((t3) rVar3.j(u2Var)).i, rVar3, 384, 24960, 110586);
                        androidx.compose.runtime.r rVar4 = rVar3;
                        String strD = tmdbEpisode2.d();
                        if (strD == null) {
                            rVar4.b0(-464645642);
                            rVar4.p(false);
                        } else {
                            rVar4.b0(-464645641);
                            p3.b(strD, null, com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 2, false, 2, 0, ((t3) rVar4.j(u2Var)).l, rVar4, 384, 24960, 110586);
                            rVar4 = rVar4;
                            rVar4.p(false);
                        }
                        Integer numE = tmdbEpisode2.e();
                        if (numE == null) {
                            rVar4.b0(-464401827);
                            rVar4.p(false);
                        } else {
                            rVar4.b0(-464401826);
                            androidx.compose.runtime.r rVar5 = rVar4;
                            p3.b(androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.d(numE.intValue(), "min"), null, com.app.mlounge.ui.theme.b.n, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar4.j(u2Var)).o, rVar5, 384, 0, 131066);
                            rVar4 = rVar5;
                            rVar4.p(false);
                        }
                        rVar4.p(true);
                        androidx.compose.ui.graphics.vector.f fVarT = okhttp3.internal.platform.android.g.t();
                        long j = com.app.mlounge.ui.theme.b.f;
                        f1.b(fVarT, "Play", w0.l(oVar, 32), j, rVar4, 3504, 0);
                        rVar4.p(true);
                        float f6 = f;
                        if (f6 > 0.0f) {
                            rVar4.b0(-2057914606);
                            androidx.compose.ui.r rVarF = w0.f(w0.d(oVar, 1.0f), 3);
                            q0 q0VarD = androidx.compose.foundation.layout.p.d(androidx.compose.ui.c.e, false);
                            int iHashCode4 = Long.hashCode(rVar4.T);
                            androidx.compose.runtime.internal.j jVarL4 = rVar4.l();
                            androidx.compose.ui.r rVarC4 = androidx.compose.ui.a.c(rVar4, rVarF);
                            rVar4.e0();
                            if (rVar4.S) {
                                rVar4.k(yVar);
                            } else {
                                rVar4.o0();
                            }
                            androidx.compose.runtime.s.x(rVar4, q0VarD, eVar);
                            androidx.compose.runtime.s.x(rVar4, jVarL4, eVar2);
                            androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode4, rVar4, eVar3, rVar4, dVar);
                            androidx.compose.runtime.s.x(rVar4, rVarC4, eVar4);
                            a0 a0Var = w0.c;
                            long jB = t.b(0.25f, t.d);
                            j0 j0Var = androidx.compose.ui.graphics.a0.b;
                            androidx.compose.foundation.layout.p.a(s.f(a0Var, jB, j0Var), rVar4, 6);
                            androidx.compose.foundation.layout.p.a(s.f(w0.d(w0.c(oVar, 1.0f), com.google.android.material.resources.c.b(f6, 0.0f, 1.0f)), j, j0Var), rVar4, 0);
                            rVar4.p(true);
                            rVar4.p(false);
                        } else {
                            rVar4.b0(-2057590749);
                            rVar4.p(false);
                        }
                        rVar4.p(true);
                    } else {
                        rVar3.W();
                    }
                    return kotlin.y.a;
                }
            }, rVar2), rVar2, 12583296, 120);
        } else {
            rVar2.W();
        }
        q1 q1VarT = rVar2.t();
        if (q1VarT != null) {
            q1VarT.d = new kotlin.jvm.functions.p(tmdbEpisode, str, f, z, aVar, i) { // from class: com.app.mlounge.ui.screens.tvshows.g
                public final /* synthetic */ float A;
                public final /* synthetic */ boolean B;
                public final /* synthetic */ kotlin.jvm.functions.a C;
                public final /* synthetic */ TmdbEpisode y;
                public final /* synthetic */ String z;

                @Override // kotlin.jvm.functions.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = androidx.compose.runtime.s.A(1);
                    a.b(this.e, this.y, this.z, this.A, this.B, this.C, (androidx.compose.runtime.r) obj, iA);
                    return kotlin.y.a;
                }
            };
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r19v6 com.app.mlounge.ui.viewmodel.x1
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.visitors.ModVisitor.anonymousCallArgMod(ModVisitor.java:535)
        	at java.base/java.util.ArrayList.forEach(Unknown Source)
        	at jadx.core.dex.visitors.ModVisitor.processAnonymousConstructor(ModVisitor.java:528)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:111)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    public static final void c(int r39, final kotlin.jvm.functions.a r40, kotlin.jvm.functions.l r41, kotlin.jvm.functions.l r42, kotlin.jvm.functions.q r43, kotlin.jvm.functions.s r44, kotlin.jvm.functions.s r45, com.app.mlounge.ui.viewmodel.x1 r46, androidx.compose.runtime.r r47, int r48) {
        /*
            Method dump skipped, instruction units count: 1571
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.ui.screens.tvshows.a.c(int, kotlin.jvm.functions.a, kotlin.jvm.functions.l, kotlin.jvm.functions.l, kotlin.jvm.functions.q, kotlin.jvm.functions.s, kotlin.jvm.functions.s, com.app.mlounge.ui.viewmodel.x1, androidx.compose.runtime.r, int):void");
    }

    public static final void d(kotlin.jvm.functions.l lVar, x1 x1Var, androidx.compose.runtime.r rVar, int i) {
        androidx.compose.runtime.r rVar2;
        x1 x1Var2;
        int i2;
        x1 x1Var3;
        y0 y0Var;
        x1 x1Var4;
        Object rVar3;
        androidx.compose.runtime.r rVar4;
        x1 x1Var5;
        boolean z;
        x1 x1Var6;
        lVar.getClass();
        rVar.c0(-1795253783);
        int i3 = i | (rVar.h(lVar) ? 4 : 2) | 16;
        if (rVar.T(i3 & 1, (i3 & 19) != 18)) {
            rVar.Y();
            if ((i & 1) == 0 || rVar.C()) {
                androidx.lifecycle.w0 w0VarA = androidx.lifecycle.viewmodel.compose.a.a(rVar);
                if (w0VarA == null) {
                    net.luminis.tls.engine.impl.c.r("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    i2 = i3 & (-113);
                    x1Var3 = (x1) h1.B(kotlin.jvm.internal.a0.a(x1.class), w0VarA, androidx.room.r.i(w0VarA, rVar), w0VarA instanceof androidx.lifecycle.j ? ((androidx.lifecycle.j) w0VarA).getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.a.b, rVar);
                }
            } else {
                rVar.W();
                i2 = i3 & (-113);
                x1Var3 = x1Var;
            }
            rVar.q();
            y0 y0VarG = androidx.compose.runtime.s.g(x1Var3.n, rVar);
            y0 y0VarG2 = androidx.compose.runtime.s.g(x1Var3.p, rVar);
            y0 y0VarG3 = androidx.compose.runtime.s.g(x1Var3.r, rVar);
            y0 y0VarG4 = androidx.compose.runtime.s.g(x1Var3.t, rVar);
            y0 y0VarG5 = androidx.compose.runtime.s.g(x1Var3.v, rVar);
            y0 y0VarG6 = androidx.compose.runtime.s.g(x1Var3.x, rVar);
            y0 y0VarG7 = androidx.compose.runtime.s.g(x1Var3.z, rVar);
            y0 y0VarG8 = androidx.compose.runtime.s.g(x1Var3.B, rVar);
            y0 y0VarG9 = androidx.compose.runtime.s.g(x1Var3.D, rVar);
            y0 y0VarG10 = androidx.compose.runtime.s.g(x1Var3.E, rVar);
            y0 y0VarG11 = androidx.compose.runtime.s.g(x1Var3.d, rVar);
            y0 y0VarG12 = androidx.compose.runtime.s.g(x1Var3.g, rVar);
            y0 y0VarG13 = androidx.compose.runtime.s.g(x1Var3.i, rVar);
            x xVarA = z.a(0, 0, rVar, 3);
            boolean zF = rVar.f(xVarA) | rVar.f(y0VarG) | rVar.h(x1Var3);
            Object objQ = rVar.Q();
            androidx.compose.runtime.f fVar = androidx.compose.runtime.m.a;
            if (zF || objQ == fVar) {
                y0Var = y0VarG13;
                com.app.mlounge.ui.screens.adult.e eVar = new com.app.mlounge.ui.screens.adult.e(xVarA, x1Var3, y0VarG, null, 6);
                rVar.l0(eVar);
                objQ = eVar;
            } else {
                y0Var = y0VarG13;
            }
            androidx.compose.runtime.j0.c(rVar, xVarA, (kotlin.jvm.functions.p) objQ);
            a0 a0Var = w0.c;
            v vVarA = androidx.compose.foundation.layout.t.a(androidx.compose.foundation.layout.h.c, androidx.compose.ui.c.J, rVar, 0);
            int iHashCode = Long.hashCode(rVar.T);
            androidx.compose.runtime.internal.j jVarL = rVar.l();
            androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(rVar, a0Var);
            androidx.compose.ui.node.g.b.getClass();
            y yVar = androidx.compose.ui.node.f.b;
            rVar.e0();
            if (rVar.S) {
                rVar.k(yVar);
            } else {
                rVar.o0();
            }
            androidx.compose.runtime.s.x(rVar, vVarA, androidx.compose.ui.node.f.e);
            androidx.compose.runtime.s.x(rVar, jVarL, androidx.compose.ui.node.f.d);
            androidx.compose.runtime.s.p(rVar, Integer.valueOf(iHashCode), androidx.compose.ui.node.f.f);
            androidx.compose.runtime.s.t(rVar, androidx.compose.ui.node.f.g);
            androidx.compose.runtime.s.x(rVar, rVarC, androidx.compose.ui.node.f.c);
            float f = 16;
            x1 x1Var7 = x1Var3;
            int i4 = i2;
            p3.b("TV Shows", androidx.compose.foundation.layout.b.s(androidx.compose.ui.o.b, f, f, 0.0f, 4, 4), ((n0) rVar.j(o0.a)).o, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar.j(u3.a)).e, rVar, 54, 0, 131064);
            List list = (List) y0VarG2.getValue();
            TmdbGenre tmdbGenre = (TmdbGenre) y0VarG6.getValue();
            String str = (String) y0VarG7.getValue();
            Integer num = (Integer) y0VarG8.getValue();
            boolean zBooleanValue = ((Boolean) y0VarG9.getValue()).booleanValue();
            boolean zH = rVar.h(x1Var7);
            Object objQ2 = rVar.Q();
            if (zH || objQ2 == fVar) {
                x1Var4 = x1Var7;
                androidx.compose.foundation.c cVar = new androidx.compose.foundation.c(1, x1Var4, x1.class, "setGenre", "setGenre(Lcom/app/mlounge/data/remote/model/TmdbGenre;)V", 0, 22);
                rVar.l0(cVar);
                objQ2 = cVar;
            } else {
                x1Var4 = x1Var7;
            }
            kotlin.jvm.functions.l lVar2 = (kotlin.jvm.functions.l) ((kotlin.reflect.e) objQ2);
            boolean zH2 = rVar.h(x1Var4);
            Object objQ3 = rVar.Q();
            if (zH2 || objQ3 == fVar) {
                androidx.compose.foundation.c cVar2 = new androidx.compose.foundation.c(1, x1Var4, x1.class, "setSortBy", "setSortBy(Ljava/lang/String;)V", 0, 23);
                rVar.l0(cVar2);
                objQ3 = cVar2;
            }
            kotlin.jvm.functions.l lVar3 = (kotlin.jvm.functions.l) ((kotlin.reflect.e) objQ3);
            boolean zH3 = rVar.h(x1Var4);
            Object objQ4 = rVar.Q();
            if (zH3 || objQ4 == fVar) {
                androidx.compose.foundation.c cVar3 = new androidx.compose.foundation.c(1, x1Var4, x1.class, "setYear", "setYear(Ljava/lang/Integer;)V", 0, 24);
                rVar.l0(cVar3);
                objQ4 = cVar3;
            }
            kotlin.jvm.functions.l lVar4 = (kotlin.jvm.functions.l) ((kotlin.reflect.e) objQ4);
            boolean zH4 = rVar.h(x1Var4);
            Object objQ5 = rVar.Q();
            if (zH4 || objQ5 == fVar) {
                androidx.compose.foundation.c cVar4 = new androidx.compose.foundation.c(1, x1Var4, x1.class, "setIncludeAdult", "setIncludeAdult(Z)V", 0, 25);
                rVar.l0(cVar4);
                objQ5 = cVar4;
            }
            x1 x1Var8 = x1Var4;
            b0.j(list, tmdbGenre, str, num, zBooleanValue, lVar2, lVar3, lVar4, (kotlin.jvm.functions.l) ((kotlin.reflect.e) objQ5), null, ((Boolean) y0VarG10.getValue()).booleanValue(), rVar, 0);
            rVar2 = rVar;
            if (((Boolean) y0VarG3.getValue()).booleanValue() && ((List) y0VarG.getValue()).isEmpty()) {
                rVar2.b0(-1939842427);
                b0.n(null, rVar2, 0);
                rVar2.p(false);
                x1Var5 = x1Var8;
            } else {
                if (((String) y0VarG5.getValue()) == null || !((List) y0VarG.getValue()).isEmpty()) {
                    rVar2.b0(-5333709);
                    androidx.compose.foundation.lazy.grid.a aVar = new androidx.compose.foundation.lazy.grid.a(((com.app.mlounge.ui.theme.a) rVar2.j(com.app.mlounge.ui.theme.f.a)).y);
                    float f2 = 12;
                    m0 m0Var = new m0(f2, f2, f2, f2);
                    float f3 = 8;
                    androidx.compose.foundation.layout.f fVarG = androidx.compose.foundation.layout.h.g(f3);
                    androidx.compose.foundation.layout.f fVarG2 = androidx.compose.foundation.layout.h.g(f3);
                    y0 y0Var2 = y0Var;
                    boolean zF2 = rVar2.f(y0VarG) | rVar2.f(y0VarG12) | rVar2.f(y0Var2) | rVar2.h(x1Var8) | rVar2.f(y0VarG11) | ((i4 & 14) == 4) | rVar2.f(y0VarG4);
                    Object objQ6 = rVar2.Q();
                    if (zF2 || objQ6 == fVar) {
                        rVar4 = rVar2;
                        rVar3 = new androidx.navigation.compose.r(y0VarG, x1Var8, lVar, y0VarG12, y0Var2, y0VarG11, y0VarG4);
                        x1Var5 = x1Var8;
                        rVar4.l0(rVar3);
                    } else {
                        rVar4 = rVar2;
                        x1Var5 = x1Var8;
                        rVar3 = objQ6;
                    }
                    androidx.compose.runtime.r rVar5 = rVar4;
                    lVar = lVar;
                    com.google.android.gms.dynamite.g.a(aVar, a0Var, xVarA, m0Var, fVarG2, fVarG, null, false, null, (kotlin.jvm.functions.l) rVar3, rVar5, 1772592, 912);
                    rVar2 = rVar5;
                    rVar2.p(false);
                    z = true;
                } else {
                    rVar2.b0(-1939840172);
                    String str2 = (String) y0VarG5.getValue();
                    str2.getClass();
                    boolean zH5 = rVar2.h(x1Var8);
                    Object objQ7 = rVar2.Q();
                    if (zH5 || objQ7 == fVar) {
                        x1Var6 = x1Var8;
                        androidx.compose.foundation.r0 r0Var = new androidx.compose.foundation.r0(0, x1Var6, x1.class, "loadTvShows", "loadTvShows()V", 0, 11);
                        rVar2.l0(r0Var);
                        objQ7 = r0Var;
                    } else {
                        x1Var6 = x1Var8;
                    }
                    b0.i(str2, null, (kotlin.jvm.functions.a) ((kotlin.reflect.e) objQ7), rVar2, 0);
                    rVar2.p(false);
                    x1Var5 = x1Var6;
                }
                rVar2.p(z);
                x1Var2 = x1Var5;
            }
            z = true;
            rVar2.p(z);
            x1Var2 = x1Var5;
        } else {
            i = i;
            rVar2 = rVar;
            lVar = lVar;
            rVar2.W();
            x1Var2 = x1Var;
        }
        q1 q1VarT = rVar2.t();
        if (q1VarT != null) {
            q1VarT.d = new androidx.compose.foundation.contextmenu.f(lVar, x1Var2, i, 29);
        }
    }
}
