package com.app.mlounge.ui.screens.movies;

import androidx.compose.foundation.layout.m0;
import androidx.compose.foundation.layout.v;
import androidx.compose.foundation.layout.w0;
import androidx.compose.foundation.lazy.grid.x;
import androidx.compose.foundation.lazy.grid.z;
import androidx.compose.foundation.r0;
import androidx.compose.foundation.s;
import androidx.compose.material3.f3;
import androidx.compose.material3.j2;
import androidx.compose.material3.n0;
import androidx.compose.material3.o0;
import androidx.compose.material3.p3;
import androidx.compose.material3.t3;
import androidx.compose.material3.u3;
import androidx.compose.runtime.j0;
import androidx.compose.runtime.m;
import androidx.compose.runtime.q1;
import androidx.compose.runtime.r;
import androidx.compose.runtime.u2;
import androidx.compose.runtime.y0;
import androidx.compose.ui.graphics.t;
import androidx.compose.ui.node.y;
import androidx.compose.ui.o;
import androidx.datastore.preferences.protobuf.h1;
import com.app.mlounge.data.remote.model.TmdbGenre;
import com.app.mlounge.emulator.LibretroCore;
import com.app.mlounge.ui.components.b0;
import com.app.mlounge.ui.components.u;
import com.app.mlounge.ui.screens.anime.n;
import com.app.mlounge.ui.viewmodel.e0;
import java.util.List;
import kotlin.jvm.functions.l;
import kotlin.jvm.functions.p;
import kotlin.jvm.internal.a0;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final androidx.compose.runtime.internal.f a = new androidx.compose.runtime.internal.f(-203279274, false, new n(20));
    public static final androidx.compose.runtime.internal.f b = new androidx.compose.runtime.internal.f(899537153, false, new androidx.compose.foundation.contextmenu.b(15));

    public static final void a(String str, String str2, String str3, kotlin.jvm.functions.a aVar, r rVar, int i) {
        r rVar2;
        r rVar3 = rVar;
        rVar3.c0(-1340861145);
        int i2 = i | (rVar3.f(str) ? 4 : 2) | (rVar3.f(str2) ? 32 : 16) | (rVar3.f(str3) ? LibretroCore.SCREEN_WIDTH : 128) | (rVar3.h(aVar) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
        if (rVar3.T(i2 & 1, (i2 & 1171) != 1170)) {
            Object objQ = rVar3.Q();
            androidx.compose.runtime.f fVar = m.a;
            if (objQ == fVar) {
                objQ = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar3);
            }
            androidx.compose.foundation.interaction.k kVar = (androidx.compose.foundation.interaction.k) objQ;
            y0 y0VarG = android.support.v4.media.session.b.g(kVar, rVar3, 6);
            androidx.compose.ui.h hVar = androidx.compose.ui.c.K;
            o oVar = o.b;
            androidx.compose.ui.r rVarP = w0.p(oVar, 80);
            float f = 2;
            long j = ((Boolean) y0VarG.getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : t.h;
            float f2 = 8;
            androidx.compose.ui.r rVarA = androidx.compose.ui.draw.h.a(s.g(rVarP, f, j, androidx.compose.foundation.shape.e.a(f2)), androidx.compose.foundation.shape.e.a(f2));
            boolean z = (i2 & 7168) == 2048;
            Object objQ2 = rVar.Q();
            if (z || objQ2 == fVar) {
                objQ2 = new j2(9, aVar);
                rVar2 = rVar;
                rVar2.l0(objQ2);
            } else {
                rVar2 = rVar;
            }
            androidx.compose.ui.r rVarM = s.m(s.i(rVarA, kVar, null, false, null, (kotlin.jvm.functions.a) objQ2, 28), kVar, 1);
            float f3 = 4;
            androidx.compose.ui.r rVarO = androidx.compose.foundation.layout.b.o(rVarM, f3);
            v vVarA = androidx.compose.foundation.layout.t.a(androidx.compose.foundation.layout.h.c, hVar, rVar2, 48);
            int iHashCode = Long.hashCode(rVar2.T);
            androidx.compose.runtime.internal.j jVarL = rVar2.l();
            androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(rVar2, rVarO);
            androidx.compose.ui.node.g.b.getClass();
            y yVar = androidx.compose.ui.node.f.b;
            rVar2.e0();
            if (rVar2.S) {
                rVar2.k(yVar);
            } else {
                rVar2.o0();
            }
            androidx.compose.runtime.s.x(rVar2, vVarA, androidx.compose.ui.node.f.e);
            androidx.compose.runtime.s.x(rVar2, jVarL, androidx.compose.ui.node.f.d);
            androidx.compose.runtime.s.p(rVar2, Integer.valueOf(iHashCode), androidx.compose.ui.node.f.f);
            androidx.compose.runtime.s.t(rVar2, androidx.compose.ui.node.f.g);
            androidx.compose.runtime.s.x(rVar2, rVarC, androidx.compose.ui.node.f.c);
            coil3.compose.k.a(str3, str, androidx.compose.ui.draw.h.a(w0.l(oVar, 60), androidx.compose.foundation.shape.e.a), null, androidx.compose.ui.layout.i.a, rVar2, ((i2 >> 6) & 14) | 1572864 | ((i2 << 3) & Token.ASSIGN_MOD), 1976);
            androidx.compose.foundation.layout.b.d(rVar2, w0.f(oVar, f3));
            u2 u2Var = u3.a;
            p3.b(str, null, com.app.mlounge.ui.theme.b.l, 0L, null, 0L, null, 0L, 2, false, 1, 0, ((t3) rVar2.j(u2Var)).o, rVar, (i2 & 14) | 384, 24960, 110586);
            p3.b(str2, null, com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 2, false, 1, 0, ((t3) rVar.j(u2Var)).o, rVar, ((i2 >> 3) & 14) | 384, 24960, 110586);
            rVar3 = rVar;
            rVar3.p(true);
        } else {
            rVar3.W();
        }
        q1 q1VarT = rVar3.t();
        if (q1VarT != null) {
            q1VarT.d = new androidx.compose.foundation.text.contextmenu.provider.d(str, str2, str3, aVar, i, 4);
        }
    }

    public static final void b(String str, androidx.compose.ui.graphics.vector.f fVar, kotlin.jvm.functions.a aVar, androidx.compose.ui.r rVar, boolean z, r rVar2, int i, int i2) {
        int i3;
        boolean z2;
        int i4;
        aVar.getClass();
        rVar2.c0(-434454158);
        if ((i & 6) == 0) {
            i3 = (rVar2.f(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i3 | (rVar2.f(fVar) ? 32 : 16) | (rVar2.h(aVar) ? LibretroCore.SCREEN_WIDTH : 128);
        if ((i & 3072) == 0) {
            i5 |= rVar2.f(rVar) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        int i6 = i5 | 24576;
        int i7 = i2 & 32;
        if (i7 != 0) {
            i4 = i5 | 221184;
            z2 = z;
        } else {
            z2 = z;
            i4 = i6 | (rVar2.g(z2) ? 131072 : Parser.ARGC_LIMIT);
        }
        if (rVar2.T(i4 & 1, (74899 & i4) != 74898)) {
            if (i7 != 0) {
                z2 = false;
            }
            Object objQ = rVar2.Q();
            androidx.compose.runtime.f fVar2 = m.a;
            if (objQ == fVar2) {
                objQ = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar2);
            }
            androidx.compose.foundation.interaction.k kVar = (androidx.compose.foundation.interaction.k) objQ;
            float f = 8;
            androidx.compose.ui.r rVarG = s.g(androidx.compose.ui.draw.h.a(rVar, androidx.compose.foundation.shape.e.a(f)), 2, ((Boolean) android.support.v4.media.session.b.g(kVar, rVar2, 6).getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : t.h, androidx.compose.foundation.shape.e.a(f));
            boolean z3 = ((458752 & i4) == 131072) | ((i4 & 896) == 256);
            Object objQ2 = rVar2.Q();
            if (z3 || objQ2 == fVar2) {
                objQ2 = new androidx.compose.foundation.contextmenu.k(z2, aVar, 1);
                rVar2.l0(objQ2);
            }
            f3.a(s.m(s.i(rVarG, kVar, null, false, null, (kotlin.jvm.functions.a) objQ2, 28), kVar, 1), androidx.compose.foundation.shape.e.a(f), com.app.mlounge.ui.theme.b.c, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(-1028328649, new c(z2, fVar, str), rVar2), rVar2, 12582912, 120);
            z2 = z2;
        } else {
            rVar2.W();
        }
        q1 q1VarT = rVar2.t();
        if (q1VarT != null) {
            q1VarT.d = new u(str, fVar, aVar, rVar, z2, i, i2);
        }
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 31831. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public static final void c(int r54, kotlin.jvm.functions.a r55, kotlin.jvm.functions.l r56, kotlin.jvm.functions.l r57, kotlin.jvm.functions.q r58, kotlin.jvm.functions.q r59, kotlin.jvm.functions.q r60, kotlin.jvm.functions.p r61, com.app.mlounge.ui.viewmodel.e0 r62, androidx.compose.runtime.r r63, int r64) {
        /*
            Method dump skipped, instruction units count: 3183
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.mlounge.ui.screens.movies.a.c(int, kotlin.jvm.functions.a, kotlin.jvm.functions.l, kotlin.jvm.functions.l, kotlin.jvm.functions.q, kotlin.jvm.functions.q, kotlin.jvm.functions.q, kotlin.jvm.functions.p, com.app.mlounge.ui.viewmodel.e0, androidx.compose.runtime.r, int):void");
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0211  */
    /* JADX WARN: Code duplicated, block: B:50:0x0236  */
    /* JADX WARN: Code duplicated, block: B:54:0x025b  */
    /* JADX WARN: Code duplicated, block: B:60:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:62:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:69:0x031b  */
    /* JADX WARN: Code duplicated, block: B:71:0x0361  */
    /* JADX WARN: Code duplicated, block: B:72:0x0364  */
    /* JADX WARN: Code duplicated, block: B:75:0x0373 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:78:0x0381  */
    public static final void d(l lVar, e0 e0Var, r rVar, int i) {
        r rVar2;
        e0 e0Var2;
        int i2;
        e0 e0Var3;
        Object eVar;
        androidx.compose.runtime.f fVar;
        androidx.compose.runtime.f fVar2;
        e0 e0Var4;
        androidx.compose.runtime.f fVar3;
        boolean zH;
        Object objQ;
        boolean zH2;
        Object objQ2;
        boolean zH3;
        Object objQ3;
        e0 e0Var5;
        boolean z;
        boolean zF;
        Object rVar3;
        r rVar4;
        e0 e0Var6;
        boolean z2;
        lVar.getClass();
        rVar.c0(-149693047);
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
                    e0Var3 = (e0) h1.B(a0.a(e0.class), w0VarA, androidx.room.r.i(w0VarA, rVar), w0VarA instanceof androidx.lifecycle.j ? ((androidx.lifecycle.j) w0VarA).getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.a.b, rVar);
                }
            } else {
                rVar.W();
                i2 = i3 & (-113);
                e0Var3 = e0Var;
            }
            rVar.q();
            y0 y0VarG = androidx.compose.runtime.s.g(e0Var3.h, rVar);
            y0 y0VarG2 = androidx.compose.runtime.s.g(e0Var3.j, rVar);
            y0 y0VarG3 = androidx.compose.runtime.s.g(e0Var3.l, rVar);
            y0 y0VarG4 = androidx.compose.runtime.s.g(e0Var3.n, rVar);
            y0 y0VarG5 = androidx.compose.runtime.s.g(e0Var3.p, rVar);
            y0 y0VarG6 = androidx.compose.runtime.s.g(e0Var3.r, rVar);
            y0 y0VarG7 = androidx.compose.runtime.s.g(e0Var3.t, rVar);
            y0 y0VarG8 = androidx.compose.runtime.s.g(e0Var3.v, rVar);
            y0 y0VarG9 = androidx.compose.runtime.s.g(e0Var3.x, rVar);
            y0 y0VarG10 = androidx.compose.runtime.s.g(e0Var3.y, rVar);
            y0 y0VarG11 = androidx.compose.runtime.s.g(e0Var3.e, rVar);
            y0 y0VarG12 = androidx.compose.runtime.s.g(e0Var3.f, rVar);
            x xVarA = z.a(0, 0, rVar, 3);
            boolean zF2 = rVar.f(xVarA) | rVar.f(y0VarG) | rVar.h(e0Var3);
            Object objQ4 = rVar.Q();
            androidx.compose.runtime.f fVar4 = m.a;
            if (zF2 || objQ4 == fVar4) {
                fVar = fVar4;
                eVar = new com.app.mlounge.ui.screens.adult.e(xVarA, e0Var3, y0VarG, null, 3);
                rVar.l0(eVar);
            } else {
                eVar = objQ4;
                fVar = fVar4;
            }
            j0.c(rVar, xVarA, (p) eVar);
            androidx.compose.foundation.layout.a0 a0Var = w0.c;
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
            e0 e0Var7 = e0Var3;
            int i4 = i2;
            p3.b("Movies", androidx.compose.foundation.layout.b.s(o.b, f, f, 0.0f, 4, 4), ((n0) rVar.j(o0.a)).o, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar.j(u3.a)).e, rVar, 54, 0, 131064);
            List list = (List) y0VarG2.getValue();
            TmdbGenre tmdbGenre = (TmdbGenre) y0VarG6.getValue();
            String str = (String) y0VarG7.getValue();
            Integer num = (Integer) y0VarG8.getValue();
            boolean zBooleanValue = ((Boolean) y0VarG9.getValue()).booleanValue();
            boolean zH4 = rVar.h(e0Var7);
            Object objQ5 = rVar.Q();
            if (zH4) {
                fVar2 = fVar;
            } else {
                androidx.compose.runtime.f fVar5 = fVar;
                if (objQ5 == fVar5) {
                    fVar2 = fVar5;
                } else {
                    e0Var4 = e0Var7;
                    fVar3 = fVar5;
                }
                l lVar2 = (l) ((kotlin.reflect.e) objQ5);
                zH = rVar.h(e0Var4);
                objQ = rVar.Q();
                if (zH || objQ == fVar3) {
                    androidx.compose.foundation.c cVar = new androidx.compose.foundation.c(1, e0Var4, e0.class, "setSortBy", "setSortBy(Ljava/lang/String;)V", 0, 8);
                    rVar.l0(cVar);
                    objQ = cVar;
                }
                l lVar3 = (l) ((kotlin.reflect.e) objQ);
                zH2 = rVar.h(e0Var4);
                objQ2 = rVar.Q();
                if (zH2 || objQ2 == fVar3) {
                    androidx.compose.foundation.c cVar2 = new androidx.compose.foundation.c(1, e0Var4, e0.class, "setYear", "setYear(Ljava/lang/Integer;)V", 0, 9);
                    rVar.l0(cVar2);
                    objQ2 = cVar2;
                }
                l lVar4 = (l) ((kotlin.reflect.e) objQ2);
                zH3 = rVar.h(e0Var4);
                objQ3 = rVar.Q();
                if (zH3 || objQ3 == fVar3) {
                    androidx.compose.foundation.c cVar3 = new androidx.compose.foundation.c(1, e0Var4, e0.class, "setIncludeAdult", "setIncludeAdult(Z)V", 0, 10);
                    rVar.l0(cVar3);
                    objQ3 = cVar3;
                }
                e0Var5 = e0Var4;
                b0.j(list, tmdbGenre, str, num, zBooleanValue, lVar2, lVar3, lVar4, (l) ((kotlin.reflect.e) objQ3), null, ((Boolean) y0VarG10.getValue()).booleanValue(), rVar, 0);
                rVar2 = rVar;
                if (!((Boolean) y0VarG3.getValue()).booleanValue() && ((List) y0VarG.getValue()).isEmpty()) {
                    rVar2.b0(1373090245);
                    b0.n(null, rVar2, 0);
                    rVar2.p(false);
                    i = i;
                    z2 = true;
                    e0Var6 = e0Var5;
                } else if (((String) y0VarG5.getValue()) == null && ((List) y0VarG.getValue()).isEmpty()) {
                    rVar2.b0(1373092513);
                    String str2 = (String) y0VarG5.getValue();
                    str2.getClass();
                    boolean zH5 = rVar2.h(e0Var5);
                    Object objQ6 = rVar2.Q();
                    if (zH5 || objQ6 == fVar3) {
                        r0 r0Var = new r0(0, e0Var5, e0.class, "loadMovies", "loadMovies()V", 0, 9);
                        rVar2.l0(r0Var);
                        objQ6 = r0Var;
                    }
                    b0.i(str2, null, (kotlin.jvm.functions.a) ((kotlin.reflect.e) objQ6), rVar2, 0);
                    rVar2.p(false);
                    i = i;
                    e0Var6 = e0Var5;
                    z2 = true;
                } else {
                    rVar2.b0(-383598502);
                    androidx.compose.foundation.lazy.grid.a aVar = new androidx.compose.foundation.lazy.grid.a(((com.app.mlounge.ui.theme.a) rVar2.j(com.app.mlounge.ui.theme.f.a)).y);
                    float f2 = 12;
                    m0 m0Var = new m0(f2, f2, f2, f2);
                    float f3 = 8;
                    androidx.compose.foundation.layout.f fVarG = androidx.compose.foundation.layout.h.g(f3);
                    androidx.compose.foundation.layout.f fVarG2 = androidx.compose.foundation.layout.h.g(f3);
                    boolean zF3 = rVar2.f(y0VarG) | rVar2.h(e0Var5) | rVar2.f(y0VarG11) | rVar2.f(y0VarG12);
                    if ((i4 & 14) == 4) {
                        z = true;
                    } else {
                        z = false;
                    }
                    zF = zF3 | z | rVar2.f(y0VarG4);
                    Object objQ7 = rVar2.Q();
                    if (!zF || objQ7 == fVar3) {
                        rVar4 = rVar2;
                        rVar3 = new androidx.compose.foundation.layout.r(y0VarG, e0Var5, lVar, y0VarG11, y0VarG12, y0VarG4, 1);
                        e0Var6 = e0Var5;
                        rVar4.l0(rVar3);
                    } else {
                        rVar4 = rVar2;
                        e0Var6 = e0Var5;
                        rVar3 = objQ7;
                    }
                    r rVar5 = rVar4;
                    com.google.android.gms.dynamite.g.a(aVar, a0Var, xVarA, m0Var, fVarG2, fVarG, null, false, null, (l) rVar3, rVar5, 1772592, 912);
                    rVar2 = rVar5;
                    rVar2.p(false);
                    z2 = true;
                }
                rVar2.p(z2);
                e0Var2 = e0Var6;
            }
            e0Var4 = e0Var7;
            fVar3 = fVar2;
            androidx.compose.foundation.c cVar4 = new androidx.compose.foundation.c(1, e0Var4, e0.class, "setGenre", "setGenre(Lcom/app/mlounge/data/remote/model/TmdbGenre;)V", 0, 7);
            rVar.l0(cVar4);
            objQ5 = cVar4;
            l lVar5 = (l) ((kotlin.reflect.e) objQ5);
            zH = rVar.h(e0Var4);
            objQ = rVar.Q();
            if (zH) {
                androidx.compose.foundation.c cVar5 = new androidx.compose.foundation.c(1, e0Var4, e0.class, "setSortBy", "setSortBy(Ljava/lang/String;)V", 0, 8);
                rVar.l0(cVar5);
                objQ = cVar5;
            } else {
                androidx.compose.foundation.c cVar6 = new androidx.compose.foundation.c(1, e0Var4, e0.class, "setSortBy", "setSortBy(Ljava/lang/String;)V", 0, 8);
                rVar.l0(cVar6);
                objQ = cVar6;
            }
            l lVar6 = (l) ((kotlin.reflect.e) objQ);
            zH2 = rVar.h(e0Var4);
            objQ2 = rVar.Q();
            if (zH2) {
                androidx.compose.foundation.c cVar7 = new androidx.compose.foundation.c(1, e0Var4, e0.class, "setYear", "setYear(Ljava/lang/Integer;)V", 0, 9);
                rVar.l0(cVar7);
                objQ2 = cVar7;
            } else {
                androidx.compose.foundation.c cVar8 = new androidx.compose.foundation.c(1, e0Var4, e0.class, "setYear", "setYear(Ljava/lang/Integer;)V", 0, 9);
                rVar.l0(cVar8);
                objQ2 = cVar8;
            }
            l lVar7 = (l) ((kotlin.reflect.e) objQ2);
            zH3 = rVar.h(e0Var4);
            objQ3 = rVar.Q();
            if (zH3) {
                androidx.compose.foundation.c cVar9 = new androidx.compose.foundation.c(1, e0Var4, e0.class, "setIncludeAdult", "setIncludeAdult(Z)V", 0, 10);
                rVar.l0(cVar9);
                objQ3 = cVar9;
            } else {
                androidx.compose.foundation.c cVar10 = new androidx.compose.foundation.c(1, e0Var4, e0.class, "setIncludeAdult", "setIncludeAdult(Z)V", 0, 10);
                rVar.l0(cVar10);
                objQ3 = cVar10;
            }
            e0Var5 = e0Var4;
            b0.j(list, tmdbGenre, str, num, zBooleanValue, lVar5, lVar6, lVar7, (l) ((kotlin.reflect.e) objQ3), null, ((Boolean) y0VarG10.getValue()).booleanValue(), rVar, 0);
            rVar2 = rVar;
            if (!((Boolean) y0VarG3.getValue()).booleanValue()) {
                if (((String) y0VarG5.getValue()) == null) {
                    rVar2.b0(-383598502);
                    androidx.compose.foundation.lazy.grid.a aVar2 = new androidx.compose.foundation.lazy.grid.a(((com.app.mlounge.ui.theme.a) rVar2.j(com.app.mlounge.ui.theme.f.a)).y);
                    float f4 = 12;
                    m0 m0Var2 = new m0(f4, f4, f4, f4);
                    float f5 = 8;
                    androidx.compose.foundation.layout.f fVarG3 = androidx.compose.foundation.layout.h.g(f5);
                    androidx.compose.foundation.layout.f fVarG4 = androidx.compose.foundation.layout.h.g(f5);
                    boolean zF4 = rVar2.f(y0VarG) | rVar2.h(e0Var5) | rVar2.f(y0VarG11) | rVar2.f(y0VarG12);
                    if ((i4 & 14) == 4) {
                        z = true;
                    } else {
                        z = false;
                    }
                    zF = zF4 | z | rVar2.f(y0VarG4);
                    Object objQ8 = rVar2.Q();
                    if (zF) {
                        rVar4 = rVar2;
                        rVar3 = new androidx.compose.foundation.layout.r(y0VarG, e0Var5, lVar, y0VarG11, y0VarG12, y0VarG4, 1);
                        e0Var6 = e0Var5;
                        rVar4.l0(rVar3);
                    } else {
                        rVar4 = rVar2;
                        rVar3 = new androidx.compose.foundation.layout.r(y0VarG, e0Var5, lVar, y0VarG11, y0VarG12, y0VarG4, 1);
                        e0Var6 = e0Var5;
                        rVar4.l0(rVar3);
                    }
                    r rVar6 = rVar4;
                    com.google.android.gms.dynamite.g.a(aVar2, a0Var, xVarA, m0Var2, fVarG4, fVarG3, null, false, null, (l) rVar3, rVar6, 1772592, 912);
                    rVar2 = rVar6;
                    rVar2.p(false);
                    z2 = true;
                } else {
                    rVar2.b0(-383598502);
                    androidx.compose.foundation.lazy.grid.a aVar3 = new androidx.compose.foundation.lazy.grid.a(((com.app.mlounge.ui.theme.a) rVar2.j(com.app.mlounge.ui.theme.f.a)).y);
                    float f6 = 12;
                    m0 m0Var3 = new m0(f6, f6, f6, f6);
                    float f7 = 8;
                    androidx.compose.foundation.layout.f fVarG5 = androidx.compose.foundation.layout.h.g(f7);
                    androidx.compose.foundation.layout.f fVarG6 = androidx.compose.foundation.layout.h.g(f7);
                    boolean zF5 = rVar2.f(y0VarG) | rVar2.h(e0Var5) | rVar2.f(y0VarG11) | rVar2.f(y0VarG12);
                    if ((i4 & 14) == 4) {
                        z = true;
                    } else {
                        z = false;
                    }
                    zF = zF5 | z | rVar2.f(y0VarG4);
                    Object objQ9 = rVar2.Q();
                    if (zF) {
                        rVar4 = rVar2;
                        rVar3 = new androidx.compose.foundation.layout.r(y0VarG, e0Var5, lVar, y0VarG11, y0VarG12, y0VarG4, 1);
                        e0Var6 = e0Var5;
                        rVar4.l0(rVar3);
                    } else {
                        rVar4 = rVar2;
                        rVar3 = new androidx.compose.foundation.layout.r(y0VarG, e0Var5, lVar, y0VarG11, y0VarG12, y0VarG4, 1);
                        e0Var6 = e0Var5;
                        rVar4.l0(rVar3);
                    }
                    r rVar7 = rVar4;
                    com.google.android.gms.dynamite.g.a(aVar3, a0Var, xVarA, m0Var3, fVarG6, fVarG5, null, false, null, (l) rVar3, rVar7, 1772592, 912);
                    rVar2 = rVar7;
                    rVar2.p(false);
                    z2 = true;
                }
            } else if (((String) y0VarG5.getValue()) == null) {
                rVar2.b0(-383598502);
                androidx.compose.foundation.lazy.grid.a aVar4 = new androidx.compose.foundation.lazy.grid.a(((com.app.mlounge.ui.theme.a) rVar2.j(com.app.mlounge.ui.theme.f.a)).y);
                float f8 = 12;
                m0 m0Var4 = new m0(f8, f8, f8, f8);
                float f9 = 8;
                androidx.compose.foundation.layout.f fVarG7 = androidx.compose.foundation.layout.h.g(f9);
                androidx.compose.foundation.layout.f fVarG8 = androidx.compose.foundation.layout.h.g(f9);
                boolean zF6 = rVar2.f(y0VarG) | rVar2.h(e0Var5) | rVar2.f(y0VarG11) | rVar2.f(y0VarG12);
                if ((i4 & 14) == 4) {
                    z = true;
                } else {
                    z = false;
                }
                zF = zF6 | z | rVar2.f(y0VarG4);
                Object objQ10 = rVar2.Q();
                if (zF) {
                    rVar4 = rVar2;
                    rVar3 = new androidx.compose.foundation.layout.r(y0VarG, e0Var5, lVar, y0VarG11, y0VarG12, y0VarG4, 1);
                    e0Var6 = e0Var5;
                    rVar4.l0(rVar3);
                } else {
                    rVar4 = rVar2;
                    rVar3 = new androidx.compose.foundation.layout.r(y0VarG, e0Var5, lVar, y0VarG11, y0VarG12, y0VarG4, 1);
                    e0Var6 = e0Var5;
                    rVar4.l0(rVar3);
                }
                r rVar8 = rVar4;
                com.google.android.gms.dynamite.g.a(aVar4, a0Var, xVarA, m0Var4, fVarG8, fVarG7, null, false, null, (l) rVar3, rVar8, 1772592, 912);
                rVar2 = rVar8;
                rVar2.p(false);
                z2 = true;
            } else {
                rVar2.b0(-383598502);
                androidx.compose.foundation.lazy.grid.a aVar5 = new androidx.compose.foundation.lazy.grid.a(((com.app.mlounge.ui.theme.a) rVar2.j(com.app.mlounge.ui.theme.f.a)).y);
                float f10 = 12;
                m0 m0Var5 = new m0(f10, f10, f10, f10);
                float f11 = 8;
                androidx.compose.foundation.layout.f fVarG9 = androidx.compose.foundation.layout.h.g(f11);
                androidx.compose.foundation.layout.f fVarG10 = androidx.compose.foundation.layout.h.g(f11);
                boolean zF7 = rVar2.f(y0VarG) | rVar2.h(e0Var5) | rVar2.f(y0VarG11) | rVar2.f(y0VarG12);
                if ((i4 & 14) == 4) {
                    z = true;
                } else {
                    z = false;
                }
                zF = zF7 | z | rVar2.f(y0VarG4);
                Object objQ11 = rVar2.Q();
                if (zF) {
                    rVar4 = rVar2;
                    rVar3 = new androidx.compose.foundation.layout.r(y0VarG, e0Var5, lVar, y0VarG11, y0VarG12, y0VarG4, 1);
                    e0Var6 = e0Var5;
                    rVar4.l0(rVar3);
                } else {
                    rVar4 = rVar2;
                    rVar3 = new androidx.compose.foundation.layout.r(y0VarG, e0Var5, lVar, y0VarG11, y0VarG12, y0VarG4, 1);
                    e0Var6 = e0Var5;
                    rVar4.l0(rVar3);
                }
                r rVar9 = rVar4;
                com.google.android.gms.dynamite.g.a(aVar5, a0Var, xVarA, m0Var5, fVarG10, fVarG9, null, false, null, (l) rVar3, rVar9, 1772592, 912);
                rVar2 = rVar9;
                rVar2.p(false);
                z2 = true;
            }
            rVar2.p(z2);
            e0Var2 = e0Var6;
        } else {
            i = i;
            rVar2 = rVar;
            lVar = lVar;
            rVar2.W();
            e0Var2 = e0Var;
        }
        q1 q1VarT = rVar2.t();
        if (q1VarT != null) {
            q1VarT.d = new androidx.compose.foundation.contextmenu.f(lVar, e0Var2, i, 20);
        }
    }
}
