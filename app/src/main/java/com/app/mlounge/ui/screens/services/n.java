package com.app.mlounge.ui.screens.services;

import android.content.Context;
import androidx.compose.foundation.a0;
import androidx.compose.foundation.gestures.h2;
import androidx.compose.foundation.layout.m0;
import androidx.compose.foundation.layout.u0;
import androidx.compose.foundation.layout.v;
import androidx.compose.foundation.layout.w0;
import androidx.compose.material3.c2;
import androidx.compose.material3.f3;
import androidx.compose.material3.k3;
import androidx.compose.material3.o0;
import androidx.compose.material3.o2;
import androidx.compose.material3.p3;
import androidx.compose.material3.q;
import androidx.compose.material3.t2;
import androidx.compose.material3.t3;
import androidx.compose.material3.u3;
import androidx.compose.material3.w1;
import androidx.compose.runtime.j0;
import androidx.compose.runtime.q1;
import androidx.compose.runtime.r;
import androidx.compose.runtime.s;
import androidx.compose.runtime.y0;
import androidx.compose.ui.graphics.t;
import androidx.compose.ui.o;
import androidx.compose.ui.platform.h1;
import androidx.compose.ui.platform.k2;
import androidx.compose.ui.platform.l1;
import androidx.compose.ui.text.input.f0;
import androidx.compose.ui.text.input.g0;
import androidx.lifecycle.l0;
import com.app.mlounge.emulator.LibretroCore;
import com.app.mlounge.ui.components.w;
import com.app.mlounge.ui.viewmodel.a1;
import com.app.mlounge.ui.viewmodel.e1;
import com.app.mlounge.ui.viewmodel.k0;
import com.app.mlounge.ui.viewmodel.n0;
import com.app.mlounge.ui.viewmodel.s1;
import com.app.mlounge.ui.viewmodel.t1;
import com.app.mlounge.ui.viewmodel.z0;
import j$.util.DesugarTimeZone;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.p;
import kotlin.y;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class n {
    public static final void a(List list, r rVar, int i) {
        r rVar2;
        rVar.c0(1391151646);
        int i2 = (rVar.h(list) ? 4 : 2) | i;
        if (rVar.T(i2 & 1, (i2 & 3) != 2)) {
            rVar2 = rVar;
            f3.a(w0.d(o.b, 1.0f), androidx.compose.foundation.shape.e.a(8), com.app.mlounge.ui.theme.b.b, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(2039517945, new k(list, 0, (byte) 0), rVar), rVar2, 12583302, 120);
        } else {
            rVar2 = rVar;
            rVar2.W();
        }
        q1 q1VarT = rVar2.t();
        if (q1VarT != null) {
            q1VarT.d = new k(i, list);
        }
    }

    public static final void b(com.app.mlounge.ui.viewmodel.d dVar, kotlin.jvm.functions.a aVar, kotlin.jvm.functions.a aVar2, kotlin.jvm.functions.a aVar3, r rVar, int i) {
        rVar.c0(1388535569);
        int i2 = i | (rVar.f(dVar) ? 4 : 2) | (rVar.h(aVar) ? 32 : 16) | (rVar.h(aVar2) ? LibretroCore.SCREEN_WIDTH : 128) | (rVar.h(aVar3) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
        if (rVar.T(i2 & 1, (i2 & 1171) != 1170)) {
            f3.a(androidx.compose.foundation.layout.b.p(w0.d(o.b, 1.0f), 16, 6), androidx.compose.foundation.shape.e.a(12), com.app.mlounge.ui.theme.b.d, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(-68267946, new i(dVar, aVar3, aVar2, aVar), rVar), rVar, 12583302, 120);
        } else {
            rVar.W();
        }
        q1 q1VarT = rVar.t();
        if (q1VarT != null) {
            q1VarT.d = new i(dVar, aVar, aVar2, aVar3, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(String str, boolean z, kotlin.jvm.functions.l lVar, r rVar, int i) {
        final boolean z2;
        kotlin.jvm.functions.l lVar2;
        y0 y0Var;
        int i2;
        y0 y0Var2;
        rVar.c0(-1619227453);
        int i3 = i | (rVar.g(z) ? 32 : 16) | (rVar.h(lVar) ? LibretroCore.SCREEN_WIDTH : 128);
        if (rVar.T(i3 & 1, (i3 & Token.EXPR_VOID) != 146)) {
            Object objQ = rVar.Q();
            Object obj = androidx.compose.runtime.m.a;
            if (objQ == obj) {
                objQ = s.r("");
                rVar.l0(objQ);
            }
            y0 y0Var3 = (y0) objQ;
            Object objQ2 = rVar.Q();
            if (objQ2 == obj) {
                objQ2 = s.r(Boolean.FALSE);
                rVar.l0(objQ2);
            }
            y0 y0Var4 = (y0) objQ2;
            k2 k2Var = (k2) rVar.j(l1.p);
            Object objQ3 = rVar.Q();
            if (objQ3 == obj) {
                objQ3 = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar);
            }
            androidx.compose.foundation.interaction.k kVar = (androidx.compose.foundation.interaction.k) objQ3;
            androidx.compose.ui.focus.l lVar3 = (androidx.compose.ui.focus.l) rVar.j(l1.i);
            Boolean boolValueOf = Boolean.valueOf(((Boolean) y0Var4.getValue()).booleanValue());
            boolean zF = rVar.f(k2Var);
            Object objQ4 = rVar.Q();
            kotlin.coroutines.d dVar = null;
            if (zF || objQ4 == obj) {
                objQ4 = new w(k2Var, y0Var4, null, 3);
                rVar.l0(objQ4);
            }
            j0.c(rVar, boolValueOf, (p) objQ4);
            Object objQ5 = rVar.Q();
            if (objQ5 == obj) {
                objQ5 = new androidx.compose.foundation.interaction.g(kVar, y0Var4, dVar, 4);
                rVar.l0(objQ5);
            }
            j0.c(rVar, kVar, (p) objQ5);
            String str2 = (String) y0Var3.getValue();
            boolean z3 = !((Boolean) y0Var4.getValue()).booleanValue();
            boolean z4 = !z;
            w1 w1Var = w1.a;
            long j = com.app.mlounge.ui.theme.b.f;
            long j2 = com.app.mlounge.ui.theme.b.e;
            long j3 = com.app.mlounge.ui.theme.b.l;
            k3 k3VarC = w1.c(j3, j3, j, j, j2, 0L, 0L, rVar, 2147477244);
            o oVar = o.b;
            androidx.compose.ui.r rVarD = w0.d(oVar, 1.0f);
            boolean zF2 = rVar.f(k2Var) | rVar.h(lVar3);
            Object objQ6 = rVar.Q();
            if (zF2 || objQ6 == obj) {
                y0Var = y0Var4;
                i2 = 1;
                objQ6 = new com.app.mlounge.ui.screens.search.h(k2Var, lVar3, y0Var, i2);
                rVar.l0(objQ6);
            } else {
                y0Var = y0Var4;
                i2 = 1;
            }
            androidx.compose.ui.r rVarE = androidx.compose.ui.input.key.c.e(rVarD, (kotlin.jvm.functions.l) objQ6);
            Object objQ7 = rVar.Q();
            if (objQ7 == obj) {
                objQ7 = new h2(y0Var, 12);
                rVar.l0(objQ7);
            }
            androidx.compose.ui.r rVarT = androidx.compose.ui.focus.d.t(rVarE, (kotlin.jvm.functions.l) objQ7);
            Object objQ8 = rVar.Q();
            if (objQ8 == obj) {
                y0Var2 = y0Var3;
                objQ8 = new h2(y0Var2, 13);
                rVar.l0(objQ8);
            } else {
                y0Var2 = y0Var3;
            }
            y0 y0Var5 = y0Var2;
            int i4 = i2;
            c2.a(str2, (kotlin.jvm.functions.l) objQ8, rVarT, z4, z3, null, androidx.compose.runtime.internal.k.c(571472477, new com.app.mlounge.ui.components.s(str, 9), rVar), null, null, null, null, null, null, true, 0, 0, kVar, null, k3VarC, rVar, 1572912, 12582912, 6, 3014560);
            androidx.compose.foundation.layout.b.d(rVar, w0.f(oVar, 8));
            Object objQ9 = rVar.Q();
            if (objQ9 == obj) {
                objQ9 = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar);
            }
            androidx.compose.foundation.interaction.k kVar2 = (androidx.compose.foundation.interaction.k) objQ9;
            y0 y0VarG = android.support.v4.media.session.b.g(kVar2, rVar, 6);
            boolean z5 = (kotlin.text.k.d0((String) y0Var5.getValue()) || z) ? 0 : i4;
            m0 m0Var = androidx.compose.material3.r.a;
            q qVarA = androidx.compose.material3.r.a(t.h, j3, rVar);
            a0 a0VarA = androidx.compose.foundation.s.a(2, ((Boolean) y0VarG.getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : j2);
            androidx.compose.ui.r rVarD2 = w0.d(oVar, 1.0f);
            if ((i3 & 896) != 256) {
                i4 = 0;
            }
            Object objQ10 = rVar.Q();
            if (i4 != 0 || objQ10 == obj) {
                lVar2 = lVar;
                objQ10 = new l(lVar2, y0Var5, 0);
                rVar.l0(objQ10);
            } else {
                lVar2 = lVar;
            }
            z2 = z;
            t2.g((kotlin.jvm.functions.a) objQ10, rVarD2, z5, null, qVarA, a0VarA, null, kVar2, androidx.compose.runtime.internal.k.c(-245442123, new kotlin.jvm.functions.q() { // from class: com.app.mlounge.ui.screens.services.m
                @Override // kotlin.jvm.functions.q
                public final Object invoke(Object obj2, Object obj3, Object obj4) {
                    r rVar2 = (r) obj3;
                    int iIntValue = ((Integer) obj4).intValue();
                    ((u0) obj2).getClass();
                    if (rVar2.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                        boolean z6 = z2;
                        if (z6) {
                            rVar2.b0(-1931916693);
                            long j4 = com.app.mlounge.ui.theme.b.f;
                            o oVar2 = o.b;
                            o2.a(w0.l(oVar2, 18), j4, 2, 0L, 0, 0.0f, rVar2, 438, 56);
                            androidx.compose.foundation.layout.b.d(rVar2, w0.p(oVar2, 8));
                            rVar2.p(false);
                        } else {
                            rVar2.b0(-1931699507);
                            rVar2.p(false);
                        }
                        p3.b(z6 ? "Validating..." : "Sign In", null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, rVar2, 0, 0, 262142);
                    } else {
                        rVar2.W();
                    }
                    return y.a;
                }
            }, rVar), rVar, 905969712);
        } else {
            z2 = z;
            lVar2 = lVar;
            rVar.W();
        }
        q1 q1VarT = rVar.t();
        if (q1VarT != null) {
            q1VarT.d = new com.app.mlounge.ui.screens.movies.c(str, z2, lVar2, i);
        }
    }

    public static final void d(String str, r rVar, int i) {
        rVar.c0(-259678260);
        if (rVar.T(i & 1, (i & 3) != 2)) {
            Context context = (Context) rVar.j(androidx.compose.ui.platform.m0.b);
            Object objQ = rVar.Q();
            Object obj = androidx.compose.runtime.m.a;
            if (objQ == obj) {
                objQ = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar);
            }
            androidx.compose.foundation.interaction.k kVar = (androidx.compose.foundation.interaction.k) objQ;
            androidx.compose.ui.r rVarG = androidx.compose.foundation.s.g(o.b, 2, ((Boolean) android.support.v4.media.session.b.g(kVar, rVar, 6).getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : t.h, androidx.compose.foundation.shape.e.a(4));
            boolean zH = rVar.h(context);
            Object objQ2 = rVar.Q();
            if (zH || objQ2 == obj) {
                objQ2 = new androidx.datastore.migrations.a(str, context);
                rVar.l0(objQ2);
            }
            t2.h((kotlin.jvm.functions.a) objQ2, rVarG, false, null, null, null, kVar, a.g, rVar, 905969664, 252);
        } else {
            rVar.W();
        }
        q1 q1VarT = rVar.t();
        if (q1VarT != null) {
            q1VarT.d = new com.app.mlounge.ui.components.s(str, i, 10);
        }
    }

    public static final void e(String str, String str2, kotlin.jvm.functions.a aVar, r rVar, int i) {
        rVar.c0(1585337812);
        int i2 = i | (rVar.f(str) ? 4 : 2) | (rVar.f(str2) ? 32 : 16) | (rVar.h(aVar) ? LibretroCore.SCREEN_WIDTH : 128);
        if (rVar.T(i2 & 1, (i2 & Token.EXPR_VOID) != 146)) {
            Context context = (Context) rVar.j(androidx.compose.ui.platform.m0.b);
            f3.a(w0.d(o.b, 1.0f), androidx.compose.foundation.shape.e.a(8), com.app.mlounge.ui.theme.b.b, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(-501006865, new androidx.compose.foundation.text.contextmenu.internal.q(str, str2, (h1) rVar.j(l1.e), context, aVar, 3), rVar), rVar, 12583302, 120);
        } else {
            rVar.W();
        }
        q1 q1VarT = rVar.t();
        if (q1VarT != null) {
            q1VarT.d = new androidx.compose.foundation.gestures.w1(str, str2, aVar, i, 13);
        }
    }

    public static final void f(com.app.mlounge.ui.viewmodel.q qVar, p pVar, kotlin.jvm.functions.a aVar, r rVar, int i) {
        rVar.c0(-329539759);
        int i2 = (rVar.f(qVar) ? 4 : 2) | i | (rVar.h(pVar) ? 32 : 16) | (rVar.h(aVar) ? LibretroCore.SCREEN_WIDTH : 128);
        if (rVar.T(i2 & 1, (i2 & Token.EXPR_VOID) != 146)) {
            f3.a(androidx.compose.foundation.layout.b.p(w0.d(o.b, 1.0f), 16, 6), androidx.compose.foundation.shape.e.a(12), com.app.mlounge.ui.theme.b.d, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(563777558, new g(qVar, aVar, pVar), rVar), rVar, 12583302, 120);
        } else {
            rVar.W();
        }
        q1 q1VarT = rVar.t();
        if (q1VarT != null) {
            q1VarT.d = new g(qVar, pVar, aVar, i);
        }
    }

    public static final void g(kotlin.jvm.functions.a aVar, r rVar, int i) {
        rVar.c0(-1214769174);
        int i2 = (rVar.h(aVar) ? 4 : 2) | i;
        if (rVar.T(i2 & 1, (i2 & 3) != 2)) {
            Object objQ = rVar.Q();
            if (objQ == androidx.compose.runtime.m.a) {
                objQ = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar);
            }
            androidx.compose.foundation.interaction.k kVar = (androidx.compose.foundation.interaction.k) objQ;
            t2.h(aVar, androidx.compose.foundation.s.g(o.b, 2, ((Boolean) android.support.v4.media.session.b.g(kVar, rVar, 6).getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : t.h, androidx.compose.foundation.shape.e.a(4)), false, null, null, null, kVar, a.f, rVar, (i2 & 14) | 905969664, 252);
        } else {
            rVar.W();
        }
        q1 q1VarT = rVar.t();
        if (q1VarT != null) {
            q1VarT.d = new com.app.mlounge.ui.components.h(aVar, i, 2);
        }
    }

    public static final void h(k0 k0Var, kotlin.jvm.functions.l lVar, kotlin.jvm.functions.a aVar, r rVar, int i) {
        rVar.c0(1607067600);
        int i2 = (rVar.f(k0Var) ? 4 : 2) | i | (rVar.h(lVar) ? 32 : 16) | (rVar.h(aVar) ? LibretroCore.SCREEN_WIDTH : 128);
        if (rVar.T(i2 & 1, (i2 & Token.EXPR_VOID) != 146)) {
            f3.a(androidx.compose.foundation.layout.b.p(w0.d(o.b, 1.0f), 16, 6), androidx.compose.foundation.shape.e.a(12), com.app.mlounge.ui.theme.b.d, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(115928597, new j(k0Var, aVar, lVar), rVar), rVar, 12583302, 120);
        } else {
            rVar.W();
        }
        q1 q1VarT = rVar.t();
        if (q1VarT != null) {
            q1VarT.d = new j(k0Var, lVar, aVar, i);
        }
    }

    public static final void i(n0 n0Var, kotlin.jvm.functions.a aVar, kotlin.jvm.functions.a aVar2, kotlin.jvm.functions.a aVar3, r rVar, int i) {
        rVar.c0(-1694104325);
        int i2 = i | (rVar.f(n0Var) ? 4 : 2) | (rVar.h(aVar) ? 32 : 16) | (rVar.h(aVar2) ? LibretroCore.SCREEN_WIDTH : 128) | (rVar.h(aVar3) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
        if (rVar.T(i2 & 1, (i2 & 1171) != 1170)) {
            f3.a(androidx.compose.foundation.layout.b.p(w0.d(o.b, 1.0f), 16, 6), androidx.compose.foundation.shape.e.a(12), com.app.mlounge.ui.theme.b.d, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(-1522943744, new e(n0Var, aVar3, aVar2, aVar), rVar), rVar, 12583302, 120);
        } else {
            rVar.W();
        }
        q1 q1VarT = rVar.t();
        if (q1VarT != null) {
            q1VarT.d = new e(n0Var, aVar, aVar2, aVar3, i);
        }
    }

    public static final void j(e1 e1Var, r rVar, int i) {
        final e1 e1Var2;
        e1 e1Var3;
        r rVar2 = rVar;
        rVar2.c0(-1256430746);
        int i2 = i | 2;
        if (rVar2.T(i2 & 1, (i2 & 3) != 2)) {
            rVar2.Y();
            if ((i & 1) == 0 || rVar2.C()) {
                androidx.lifecycle.w0 w0VarA = androidx.lifecycle.viewmodel.compose.a.a(rVar2);
                if (w0VarA == null) {
                    net.luminis.tls.engine.impl.c.r("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                }
                e1Var3 = (e1) androidx.datastore.preferences.protobuf.h1.B(kotlin.jvm.internal.a0.a(e1.class), w0VarA, androidx.room.r.i(w0VarA, rVar2), w0VarA instanceof androidx.lifecycle.j ? ((androidx.lifecycle.j) w0VarA).getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.a.b, rVar2);
            } else {
                rVar2.W();
                e1Var3 = e1Var;
            }
            rVar2.q();
            y0 y0VarG = s.g(e1Var3.j, rVar2);
            y0 y0VarG2 = s.g(e1Var3.l, rVar2);
            y0 y0VarG3 = s.g(e1Var3.n, rVar2);
            y0 y0VarG4 = s.g(e1Var3.p, rVar2);
            y0 y0VarG5 = s.g(e1Var3.r, rVar2);
            y0 y0VarG6 = s.g(e1Var3.t, rVar2);
            androidx.compose.ui.r rVarP = androidx.compose.foundation.s.p(w0.c, androidx.compose.foundation.s.o(rVar2), true);
            v vVarA = androidx.compose.foundation.layout.t.a(androidx.compose.foundation.layout.h.c, androidx.compose.ui.c.J, rVar2, 0);
            int iHashCode = Long.hashCode(rVar2.T);
            androidx.compose.runtime.internal.j jVarL = rVar2.l();
            androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(rVar2, rVarP);
            androidx.compose.ui.node.g.b.getClass();
            androidx.compose.ui.node.y yVar = androidx.compose.ui.node.f.b;
            rVar2.e0();
            if (rVar2.S) {
                rVar2.k(yVar);
            } else {
                rVar2.o0();
            }
            s.x(rVar2, vVarA, androidx.compose.ui.node.f.e);
            s.x(rVar2, jVarL, androidx.compose.ui.node.f.d);
            s.p(rVar2, Integer.valueOf(iHashCode), androidx.compose.ui.node.f.f);
            s.t(rVar2, androidx.compose.ui.node.f.g);
            s.x(rVar2, rVarC, androidx.compose.ui.node.f.c);
            androidx.compose.ui.text.m0 m0Var = ((t3) rVar2.j(u3.a)).e;
            long j = ((androidx.compose.material3.n0) rVar2.j(o0.a)).o;
            float f = 16;
            o oVar = o.b;
            androidx.compose.ui.r rVarS = androidx.compose.foundation.layout.b.s(oVar, f, f, 0.0f, f, 4);
            e1 e1Var4 = e1Var3;
            p3.b("Services", rVarS, j, 0L, null, 0L, null, 0L, 0, false, 0, 0, m0Var, rVar, 54, 0, 131064);
            rVar2 = rVar;
            k0 k0Var = (k0) y0VarG.getValue();
            e1Var2 = e1Var4;
            boolean zH = rVar2.h(e1Var2);
            Object objQ = rVar2.Q();
            androidx.compose.runtime.f fVar = androidx.compose.runtime.m.a;
            if (zH || objQ == fVar) {
                final int i3 = 0;
                objQ = new kotlin.jvm.functions.l() { // from class: com.app.mlounge.ui.screens.services.b
                    @Override // kotlin.jvm.functions.l
                    public final Object invoke(Object obj) {
                        String str = (String) obj;
                        switch (i3) {
                            case 0:
                                str.getClass();
                                e1 e1Var5 = e1Var2;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var5), null, null, new a1(0, e1Var5, str, null), 3, null);
                                break;
                            default:
                                str.getClass();
                                e1 e1Var6 = e1Var2;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var6), null, null, new a1(1, e1Var6, str, null), 3, null);
                                break;
                        }
                        return y.a;
                    }
                };
                rVar2.l0(objQ);
            }
            kotlin.jvm.functions.l lVar = (kotlin.jvm.functions.l) objQ;
            boolean zH2 = rVar2.h(e1Var2);
            Object objQ2 = rVar2.Q();
            if (zH2 || objQ2 == fVar) {
                final int i4 = 10;
                objQ2 = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.screens.services.c
                    @Override // kotlin.jvm.functions.a
                    public final Object invoke() {
                        switch (i4) {
                            case 0:
                                e1 e1Var5 = e1Var2;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var5), null, null, new z0(e1Var5, null, 12), 3, null);
                                break;
                            case 1:
                                e1 e1Var6 = e1Var2;
                                Job job = e1Var6.u;
                                if (job != null) {
                                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                                }
                                e1Var6.m.setValue(new com.app.mlounge.ui.viewmodel.d(null, 63));
                                break;
                            case 2:
                                e1 e1Var7 = e1Var2;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var7), null, null, new z0(e1Var7, null, 6), 3, null);
                                break;
                            case 3:
                                e1 e1Var8 = e1Var2;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var8), null, null, new z0(e1Var8, null, 13), 3, null);
                                break;
                            case 4:
                                e1 e1Var9 = e1Var2;
                                Job job2 = e1Var9.v;
                                if (job2 != null) {
                                    Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
                                }
                                e1Var9.o.setValue(new n0(null, 63));
                                break;
                            case 5:
                                e1 e1Var10 = e1Var2;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var10), null, null, new z0(e1Var10, null, 9), 3, null);
                                break;
                            case 6:
                                e1 e1Var11 = e1Var2;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var11), null, null, new z0(e1Var11, null, 7), 3, null);
                                break;
                            case 7:
                                e1 e1Var12 = e1Var2;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var12), null, null, new z0(e1Var12, null, 14), 3, null);
                                break;
                            case 8:
                                e1 e1Var13 = e1Var2;
                                Job job3 = e1Var13.w;
                                if (job3 != null) {
                                    Job.DefaultImpls.cancel$default(job3, (CancellationException) null, 1, (Object) null);
                                }
                                e1Var13.s.setValue(new t1(null, 63));
                                break;
                            case 9:
                                e1 e1Var14 = e1Var2;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var14), null, null, new z0(e1Var14, null, 11), 3, null);
                                break;
                            case 10:
                                e1 e1Var15 = e1Var2;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var15), null, null, new z0(e1Var15, null, 8), 3, null);
                                break;
                            default:
                                e1 e1Var16 = e1Var2;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var16), null, null, new z0(e1Var16, null, 10), 3, null);
                                break;
                        }
                        return y.a;
                    }
                };
                rVar2.l0(objQ2);
            }
            h(k0Var, lVar, (kotlin.jvm.functions.a) objQ2, rVar2, 0);
            s1 s1Var = (s1) y0VarG2.getValue();
            boolean zH3 = rVar2.h(e1Var2);
            Object objQ3 = rVar2.Q();
            if (zH3 || objQ3 == fVar) {
                final int i5 = 1;
                objQ3 = new kotlin.jvm.functions.l() { // from class: com.app.mlounge.ui.screens.services.b
                    @Override // kotlin.jvm.functions.l
                    public final Object invoke(Object obj) {
                        String str = (String) obj;
                        switch (i5) {
                            case 0:
                                str.getClass();
                                e1 e1Var5 = e1Var2;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var5), null, null, new a1(0, e1Var5, str, null), 3, null);
                                break;
                            default:
                                str.getClass();
                                e1 e1Var6 = e1Var2;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var6), null, null, new a1(1, e1Var6, str, null), 3, null);
                                break;
                        }
                        return y.a;
                    }
                };
                rVar2.l0(objQ3);
            }
            kotlin.jvm.functions.l lVar2 = (kotlin.jvm.functions.l) objQ3;
            boolean zH4 = rVar2.h(e1Var2);
            Object objQ4 = rVar2.Q();
            if (zH4 || objQ4 == fVar) {
                final int i6 = 11;
                objQ4 = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.screens.services.c
                    @Override // kotlin.jvm.functions.a
                    public final Object invoke() {
                        switch (i6) {
                            case 0:
                                e1 e1Var5 = e1Var2;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var5), null, null, new z0(e1Var5, null, 12), 3, null);
                                break;
                            case 1:
                                e1 e1Var6 = e1Var2;
                                Job job = e1Var6.u;
                                if (job != null) {
                                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                                }
                                e1Var6.m.setValue(new com.app.mlounge.ui.viewmodel.d(null, 63));
                                break;
                            case 2:
                                e1 e1Var7 = e1Var2;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var7), null, null, new z0(e1Var7, null, 6), 3, null);
                                break;
                            case 3:
                                e1 e1Var8 = e1Var2;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var8), null, null, new z0(e1Var8, null, 13), 3, null);
                                break;
                            case 4:
                                e1 e1Var9 = e1Var2;
                                Job job2 = e1Var9.v;
                                if (job2 != null) {
                                    Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
                                }
                                e1Var9.o.setValue(new n0(null, 63));
                                break;
                            case 5:
                                e1 e1Var10 = e1Var2;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var10), null, null, new z0(e1Var10, null, 9), 3, null);
                                break;
                            case 6:
                                e1 e1Var11 = e1Var2;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var11), null, null, new z0(e1Var11, null, 7), 3, null);
                                break;
                            case 7:
                                e1 e1Var12 = e1Var2;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var12), null, null, new z0(e1Var12, null, 14), 3, null);
                                break;
                            case 8:
                                e1 e1Var13 = e1Var2;
                                Job job3 = e1Var13.w;
                                if (job3 != null) {
                                    Job.DefaultImpls.cancel$default(job3, (CancellationException) null, 1, (Object) null);
                                }
                                e1Var13.s.setValue(new t1(null, 63));
                                break;
                            case 9:
                                e1 e1Var14 = e1Var2;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var14), null, null, new z0(e1Var14, null, 11), 3, null);
                                break;
                            case 10:
                                e1 e1Var15 = e1Var2;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var15), null, null, new z0(e1Var15, null, 8), 3, null);
                                break;
                            default:
                                e1 e1Var16 = e1Var2;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var16), null, null, new z0(e1Var16, null, 10), 3, null);
                                break;
                        }
                        return y.a;
                    }
                };
                rVar2.l0(objQ4);
            }
            m(s1Var, lVar2, (kotlin.jvm.functions.a) objQ4, rVar2, 0);
            com.app.mlounge.ui.viewmodel.d dVar = (com.app.mlounge.ui.viewmodel.d) y0VarG3.getValue();
            boolean zH5 = rVar2.h(e1Var2);
            Object objQ5 = rVar2.Q();
            if (zH5 || objQ5 == fVar) {
                final int i7 = 0;
                objQ5 = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.screens.services.c
                    @Override // kotlin.jvm.functions.a
                    public final Object invoke() {
                        switch (i7) {
                            case 0:
                                e1 e1Var5 = e1Var2;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var5), null, null, new z0(e1Var5, null, 12), 3, null);
                                break;
                            case 1:
                                e1 e1Var6 = e1Var2;
                                Job job = e1Var6.u;
                                if (job != null) {
                                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                                }
                                e1Var6.m.setValue(new com.app.mlounge.ui.viewmodel.d(null, 63));
                                break;
                            case 2:
                                e1 e1Var7 = e1Var2;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var7), null, null, new z0(e1Var7, null, 6), 3, null);
                                break;
                            case 3:
                                e1 e1Var8 = e1Var2;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var8), null, null, new z0(e1Var8, null, 13), 3, null);
                                break;
                            case 4:
                                e1 e1Var9 = e1Var2;
                                Job job2 = e1Var9.v;
                                if (job2 != null) {
                                    Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
                                }
                                e1Var9.o.setValue(new n0(null, 63));
                                break;
                            case 5:
                                e1 e1Var10 = e1Var2;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var10), null, null, new z0(e1Var10, null, 9), 3, null);
                                break;
                            case 6:
                                e1 e1Var11 = e1Var2;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var11), null, null, new z0(e1Var11, null, 7), 3, null);
                                break;
                            case 7:
                                e1 e1Var12 = e1Var2;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var12), null, null, new z0(e1Var12, null, 14), 3, null);
                                break;
                            case 8:
                                e1 e1Var13 = e1Var2;
                                Job job3 = e1Var13.w;
                                if (job3 != null) {
                                    Job.DefaultImpls.cancel$default(job3, (CancellationException) null, 1, (Object) null);
                                }
                                e1Var13.s.setValue(new t1(null, 63));
                                break;
                            case 9:
                                e1 e1Var14 = e1Var2;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var14), null, null, new z0(e1Var14, null, 11), 3, null);
                                break;
                            case 10:
                                e1 e1Var15 = e1Var2;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var15), null, null, new z0(e1Var15, null, 8), 3, null);
                                break;
                            default:
                                e1 e1Var16 = e1Var2;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var16), null, null, new z0(e1Var16, null, 10), 3, null);
                                break;
                        }
                        return y.a;
                    }
                };
                rVar2.l0(objQ5);
            }
            kotlin.jvm.functions.a aVar = (kotlin.jvm.functions.a) objQ5;
            boolean zH6 = rVar2.h(e1Var2);
            Object objQ6 = rVar2.Q();
            if (zH6 || objQ6 == fVar) {
                final int i8 = 1;
                objQ6 = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.screens.services.c
                    @Override // kotlin.jvm.functions.a
                    public final Object invoke() {
                        switch (i8) {
                            case 0:
                                e1 e1Var5 = e1Var2;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var5), null, null, new z0(e1Var5, null, 12), 3, null);
                                break;
                            case 1:
                                e1 e1Var6 = e1Var2;
                                Job job = e1Var6.u;
                                if (job != null) {
                                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                                }
                                e1Var6.m.setValue(new com.app.mlounge.ui.viewmodel.d(null, 63));
                                break;
                            case 2:
                                e1 e1Var7 = e1Var2;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var7), null, null, new z0(e1Var7, null, 6), 3, null);
                                break;
                            case 3:
                                e1 e1Var8 = e1Var2;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var8), null, null, new z0(e1Var8, null, 13), 3, null);
                                break;
                            case 4:
                                e1 e1Var9 = e1Var2;
                                Job job2 = e1Var9.v;
                                if (job2 != null) {
                                    Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
                                }
                                e1Var9.o.setValue(new n0(null, 63));
                                break;
                            case 5:
                                e1 e1Var10 = e1Var2;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var10), null, null, new z0(e1Var10, null, 9), 3, null);
                                break;
                            case 6:
                                e1 e1Var11 = e1Var2;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var11), null, null, new z0(e1Var11, null, 7), 3, null);
                                break;
                            case 7:
                                e1 e1Var12 = e1Var2;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var12), null, null, new z0(e1Var12, null, 14), 3, null);
                                break;
                            case 8:
                                e1 e1Var13 = e1Var2;
                                Job job3 = e1Var13.w;
                                if (job3 != null) {
                                    Job.DefaultImpls.cancel$default(job3, (CancellationException) null, 1, (Object) null);
                                }
                                e1Var13.s.setValue(new t1(null, 63));
                                break;
                            case 9:
                                e1 e1Var14 = e1Var2;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var14), null, null, new z0(e1Var14, null, 11), 3, null);
                                break;
                            case 10:
                                e1 e1Var15 = e1Var2;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var15), null, null, new z0(e1Var15, null, 8), 3, null);
                                break;
                            default:
                                e1 e1Var16 = e1Var2;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var16), null, null, new z0(e1Var16, null, 10), 3, null);
                                break;
                        }
                        return y.a;
                    }
                };
                rVar2.l0(objQ6);
            }
            kotlin.jvm.functions.a aVar2 = (kotlin.jvm.functions.a) objQ6;
            boolean zH7 = rVar2.h(e1Var2);
            Object objQ7 = rVar2.Q();
            if (zH7 || objQ7 == fVar) {
                final int i9 = 2;
                objQ7 = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.screens.services.c
                    @Override // kotlin.jvm.functions.a
                    public final Object invoke() {
                        switch (i9) {
                            case 0:
                                e1 e1Var5 = e1Var2;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var5), null, null, new z0(e1Var5, null, 12), 3, null);
                                break;
                            case 1:
                                e1 e1Var6 = e1Var2;
                                Job job = e1Var6.u;
                                if (job != null) {
                                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                                }
                                e1Var6.m.setValue(new com.app.mlounge.ui.viewmodel.d(null, 63));
                                break;
                            case 2:
                                e1 e1Var7 = e1Var2;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var7), null, null, new z0(e1Var7, null, 6), 3, null);
                                break;
                            case 3:
                                e1 e1Var8 = e1Var2;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var8), null, null, new z0(e1Var8, null, 13), 3, null);
                                break;
                            case 4:
                                e1 e1Var9 = e1Var2;
                                Job job2 = e1Var9.v;
                                if (job2 != null) {
                                    Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
                                }
                                e1Var9.o.setValue(new n0(null, 63));
                                break;
                            case 5:
                                e1 e1Var10 = e1Var2;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var10), null, null, new z0(e1Var10, null, 9), 3, null);
                                break;
                            case 6:
                                e1 e1Var11 = e1Var2;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var11), null, null, new z0(e1Var11, null, 7), 3, null);
                                break;
                            case 7:
                                e1 e1Var12 = e1Var2;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var12), null, null, new z0(e1Var12, null, 14), 3, null);
                                break;
                            case 8:
                                e1 e1Var13 = e1Var2;
                                Job job3 = e1Var13.w;
                                if (job3 != null) {
                                    Job.DefaultImpls.cancel$default(job3, (CancellationException) null, 1, (Object) null);
                                }
                                e1Var13.s.setValue(new t1(null, 63));
                                break;
                            case 9:
                                e1 e1Var14 = e1Var2;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var14), null, null, new z0(e1Var14, null, 11), 3, null);
                                break;
                            case 10:
                                e1 e1Var15 = e1Var2;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var15), null, null, new z0(e1Var15, null, 8), 3, null);
                                break;
                            default:
                                e1 e1Var16 = e1Var2;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var16), null, null, new z0(e1Var16, null, 10), 3, null);
                                break;
                        }
                        return y.a;
                    }
                };
                rVar2.l0(objQ7);
            }
            b(dVar, aVar, aVar2, (kotlin.jvm.functions.a) objQ7, rVar2, 0);
            n0 n0Var = (n0) y0VarG4.getValue();
            boolean zH8 = rVar2.h(e1Var2);
            Object objQ8 = rVar2.Q();
            if (zH8 || objQ8 == fVar) {
                final int i10 = 3;
                objQ8 = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.screens.services.c
                    @Override // kotlin.jvm.functions.a
                    public final Object invoke() {
                        switch (i10) {
                            case 0:
                                e1 e1Var5 = e1Var2;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var5), null, null, new z0(e1Var5, null, 12), 3, null);
                                break;
                            case 1:
                                e1 e1Var6 = e1Var2;
                                Job job = e1Var6.u;
                                if (job != null) {
                                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                                }
                                e1Var6.m.setValue(new com.app.mlounge.ui.viewmodel.d(null, 63));
                                break;
                            case 2:
                                e1 e1Var7 = e1Var2;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var7), null, null, new z0(e1Var7, null, 6), 3, null);
                                break;
                            case 3:
                                e1 e1Var8 = e1Var2;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var8), null, null, new z0(e1Var8, null, 13), 3, null);
                                break;
                            case 4:
                                e1 e1Var9 = e1Var2;
                                Job job2 = e1Var9.v;
                                if (job2 != null) {
                                    Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
                                }
                                e1Var9.o.setValue(new n0(null, 63));
                                break;
                            case 5:
                                e1 e1Var10 = e1Var2;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var10), null, null, new z0(e1Var10, null, 9), 3, null);
                                break;
                            case 6:
                                e1 e1Var11 = e1Var2;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var11), null, null, new z0(e1Var11, null, 7), 3, null);
                                break;
                            case 7:
                                e1 e1Var12 = e1Var2;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var12), null, null, new z0(e1Var12, null, 14), 3, null);
                                break;
                            case 8:
                                e1 e1Var13 = e1Var2;
                                Job job3 = e1Var13.w;
                                if (job3 != null) {
                                    Job.DefaultImpls.cancel$default(job3, (CancellationException) null, 1, (Object) null);
                                }
                                e1Var13.s.setValue(new t1(null, 63));
                                break;
                            case 9:
                                e1 e1Var14 = e1Var2;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var14), null, null, new z0(e1Var14, null, 11), 3, null);
                                break;
                            case 10:
                                e1 e1Var15 = e1Var2;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var15), null, null, new z0(e1Var15, null, 8), 3, null);
                                break;
                            default:
                                e1 e1Var16 = e1Var2;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var16), null, null, new z0(e1Var16, null, 10), 3, null);
                                break;
                        }
                        return y.a;
                    }
                };
                rVar2.l0(objQ8);
            }
            kotlin.jvm.functions.a aVar3 = (kotlin.jvm.functions.a) objQ8;
            boolean zH9 = rVar2.h(e1Var2);
            Object objQ9 = rVar2.Q();
            if (zH9 || objQ9 == fVar) {
                final int i11 = 4;
                objQ9 = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.screens.services.c
                    @Override // kotlin.jvm.functions.a
                    public final Object invoke() {
                        switch (i11) {
                            case 0:
                                e1 e1Var5 = e1Var2;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var5), null, null, new z0(e1Var5, null, 12), 3, null);
                                break;
                            case 1:
                                e1 e1Var6 = e1Var2;
                                Job job = e1Var6.u;
                                if (job != null) {
                                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                                }
                                e1Var6.m.setValue(new com.app.mlounge.ui.viewmodel.d(null, 63));
                                break;
                            case 2:
                                e1 e1Var7 = e1Var2;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var7), null, null, new z0(e1Var7, null, 6), 3, null);
                                break;
                            case 3:
                                e1 e1Var8 = e1Var2;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var8), null, null, new z0(e1Var8, null, 13), 3, null);
                                break;
                            case 4:
                                e1 e1Var9 = e1Var2;
                                Job job2 = e1Var9.v;
                                if (job2 != null) {
                                    Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
                                }
                                e1Var9.o.setValue(new n0(null, 63));
                                break;
                            case 5:
                                e1 e1Var10 = e1Var2;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var10), null, null, new z0(e1Var10, null, 9), 3, null);
                                break;
                            case 6:
                                e1 e1Var11 = e1Var2;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var11), null, null, new z0(e1Var11, null, 7), 3, null);
                                break;
                            case 7:
                                e1 e1Var12 = e1Var2;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var12), null, null, new z0(e1Var12, null, 14), 3, null);
                                break;
                            case 8:
                                e1 e1Var13 = e1Var2;
                                Job job3 = e1Var13.w;
                                if (job3 != null) {
                                    Job.DefaultImpls.cancel$default(job3, (CancellationException) null, 1, (Object) null);
                                }
                                e1Var13.s.setValue(new t1(null, 63));
                                break;
                            case 9:
                                e1 e1Var14 = e1Var2;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var14), null, null, new z0(e1Var14, null, 11), 3, null);
                                break;
                            case 10:
                                e1 e1Var15 = e1Var2;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var15), null, null, new z0(e1Var15, null, 8), 3, null);
                                break;
                            default:
                                e1 e1Var16 = e1Var2;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var16), null, null, new z0(e1Var16, null, 10), 3, null);
                                break;
                        }
                        return y.a;
                    }
                };
                rVar2.l0(objQ9);
            }
            kotlin.jvm.functions.a aVar4 = (kotlin.jvm.functions.a) objQ9;
            boolean zH10 = rVar2.h(e1Var2);
            Object objQ10 = rVar2.Q();
            if (zH10 || objQ10 == fVar) {
                final int i12 = 5;
                objQ10 = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.screens.services.c
                    @Override // kotlin.jvm.functions.a
                    public final Object invoke() {
                        switch (i12) {
                            case 0:
                                e1 e1Var5 = e1Var2;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var5), null, null, new z0(e1Var5, null, 12), 3, null);
                                break;
                            case 1:
                                e1 e1Var6 = e1Var2;
                                Job job = e1Var6.u;
                                if (job != null) {
                                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                                }
                                e1Var6.m.setValue(new com.app.mlounge.ui.viewmodel.d(null, 63));
                                break;
                            case 2:
                                e1 e1Var7 = e1Var2;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var7), null, null, new z0(e1Var7, null, 6), 3, null);
                                break;
                            case 3:
                                e1 e1Var8 = e1Var2;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var8), null, null, new z0(e1Var8, null, 13), 3, null);
                                break;
                            case 4:
                                e1 e1Var9 = e1Var2;
                                Job job2 = e1Var9.v;
                                if (job2 != null) {
                                    Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
                                }
                                e1Var9.o.setValue(new n0(null, 63));
                                break;
                            case 5:
                                e1 e1Var10 = e1Var2;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var10), null, null, new z0(e1Var10, null, 9), 3, null);
                                break;
                            case 6:
                                e1 e1Var11 = e1Var2;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var11), null, null, new z0(e1Var11, null, 7), 3, null);
                                break;
                            case 7:
                                e1 e1Var12 = e1Var2;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var12), null, null, new z0(e1Var12, null, 14), 3, null);
                                break;
                            case 8:
                                e1 e1Var13 = e1Var2;
                                Job job3 = e1Var13.w;
                                if (job3 != null) {
                                    Job.DefaultImpls.cancel$default(job3, (CancellationException) null, 1, (Object) null);
                                }
                                e1Var13.s.setValue(new t1(null, 63));
                                break;
                            case 9:
                                e1 e1Var14 = e1Var2;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var14), null, null, new z0(e1Var14, null, 11), 3, null);
                                break;
                            case 10:
                                e1 e1Var15 = e1Var2;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var15), null, null, new z0(e1Var15, null, 8), 3, null);
                                break;
                            default:
                                e1 e1Var16 = e1Var2;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var16), null, null, new z0(e1Var16, null, 10), 3, null);
                                break;
                        }
                        return y.a;
                    }
                };
                rVar2.l0(objQ10);
            }
            i(n0Var, aVar3, aVar4, (kotlin.jvm.functions.a) objQ10, rVar2, 0);
            com.app.mlounge.ui.viewmodel.q qVar = (com.app.mlounge.ui.viewmodel.q) y0VarG5.getValue();
            boolean zH11 = rVar2.h(e1Var2);
            Object objQ11 = rVar2.Q();
            if (zH11 || objQ11 == fVar) {
                objQ11 = new f(e1Var2);
                rVar2.l0(objQ11);
            }
            p pVar = (p) objQ11;
            boolean zH12 = rVar2.h(e1Var2);
            Object objQ12 = rVar2.Q();
            if (zH12 || objQ12 == fVar) {
                final int i13 = 6;
                objQ12 = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.screens.services.c
                    @Override // kotlin.jvm.functions.a
                    public final Object invoke() {
                        switch (i13) {
                            case 0:
                                e1 e1Var5 = e1Var2;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var5), null, null, new z0(e1Var5, null, 12), 3, null);
                                break;
                            case 1:
                                e1 e1Var6 = e1Var2;
                                Job job = e1Var6.u;
                                if (job != null) {
                                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                                }
                                e1Var6.m.setValue(new com.app.mlounge.ui.viewmodel.d(null, 63));
                                break;
                            case 2:
                                e1 e1Var7 = e1Var2;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var7), null, null, new z0(e1Var7, null, 6), 3, null);
                                break;
                            case 3:
                                e1 e1Var8 = e1Var2;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var8), null, null, new z0(e1Var8, null, 13), 3, null);
                                break;
                            case 4:
                                e1 e1Var9 = e1Var2;
                                Job job2 = e1Var9.v;
                                if (job2 != null) {
                                    Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
                                }
                                e1Var9.o.setValue(new n0(null, 63));
                                break;
                            case 5:
                                e1 e1Var10 = e1Var2;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var10), null, null, new z0(e1Var10, null, 9), 3, null);
                                break;
                            case 6:
                                e1 e1Var11 = e1Var2;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var11), null, null, new z0(e1Var11, null, 7), 3, null);
                                break;
                            case 7:
                                e1 e1Var12 = e1Var2;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var12), null, null, new z0(e1Var12, null, 14), 3, null);
                                break;
                            case 8:
                                e1 e1Var13 = e1Var2;
                                Job job3 = e1Var13.w;
                                if (job3 != null) {
                                    Job.DefaultImpls.cancel$default(job3, (CancellationException) null, 1, (Object) null);
                                }
                                e1Var13.s.setValue(new t1(null, 63));
                                break;
                            case 9:
                                e1 e1Var14 = e1Var2;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var14), null, null, new z0(e1Var14, null, 11), 3, null);
                                break;
                            case 10:
                                e1 e1Var15 = e1Var2;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var15), null, null, new z0(e1Var15, null, 8), 3, null);
                                break;
                            default:
                                e1 e1Var16 = e1Var2;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var16), null, null, new z0(e1Var16, null, 10), 3, null);
                                break;
                        }
                        return y.a;
                    }
                };
                rVar2.l0(objQ12);
            }
            f(qVar, pVar, (kotlin.jvm.functions.a) objQ12, rVar2, 0);
            t1 t1Var = (t1) y0VarG6.getValue();
            boolean zH13 = rVar2.h(e1Var2);
            Object objQ13 = rVar2.Q();
            if (zH13 || objQ13 == fVar) {
                final int i14 = 7;
                objQ13 = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.screens.services.c
                    @Override // kotlin.jvm.functions.a
                    public final Object invoke() {
                        switch (i14) {
                            case 0:
                                e1 e1Var5 = e1Var2;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var5), null, null, new z0(e1Var5, null, 12), 3, null);
                                break;
                            case 1:
                                e1 e1Var6 = e1Var2;
                                Job job = e1Var6.u;
                                if (job != null) {
                                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                                }
                                e1Var6.m.setValue(new com.app.mlounge.ui.viewmodel.d(null, 63));
                                break;
                            case 2:
                                e1 e1Var7 = e1Var2;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var7), null, null, new z0(e1Var7, null, 6), 3, null);
                                break;
                            case 3:
                                e1 e1Var8 = e1Var2;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var8), null, null, new z0(e1Var8, null, 13), 3, null);
                                break;
                            case 4:
                                e1 e1Var9 = e1Var2;
                                Job job2 = e1Var9.v;
                                if (job2 != null) {
                                    Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
                                }
                                e1Var9.o.setValue(new n0(null, 63));
                                break;
                            case 5:
                                e1 e1Var10 = e1Var2;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var10), null, null, new z0(e1Var10, null, 9), 3, null);
                                break;
                            case 6:
                                e1 e1Var11 = e1Var2;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var11), null, null, new z0(e1Var11, null, 7), 3, null);
                                break;
                            case 7:
                                e1 e1Var12 = e1Var2;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var12), null, null, new z0(e1Var12, null, 14), 3, null);
                                break;
                            case 8:
                                e1 e1Var13 = e1Var2;
                                Job job3 = e1Var13.w;
                                if (job3 != null) {
                                    Job.DefaultImpls.cancel$default(job3, (CancellationException) null, 1, (Object) null);
                                }
                                e1Var13.s.setValue(new t1(null, 63));
                                break;
                            case 9:
                                e1 e1Var14 = e1Var2;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var14), null, null, new z0(e1Var14, null, 11), 3, null);
                                break;
                            case 10:
                                e1 e1Var15 = e1Var2;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var15), null, null, new z0(e1Var15, null, 8), 3, null);
                                break;
                            default:
                                e1 e1Var16 = e1Var2;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var16), null, null, new z0(e1Var16, null, 10), 3, null);
                                break;
                        }
                        return y.a;
                    }
                };
                rVar2.l0(objQ13);
            }
            kotlin.jvm.functions.a aVar5 = (kotlin.jvm.functions.a) objQ13;
            boolean zH14 = rVar2.h(e1Var2);
            Object objQ14 = rVar2.Q();
            if (zH14 || objQ14 == fVar) {
                final int i15 = 8;
                objQ14 = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.screens.services.c
                    @Override // kotlin.jvm.functions.a
                    public final Object invoke() {
                        switch (i15) {
                            case 0:
                                e1 e1Var5 = e1Var2;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var5), null, null, new z0(e1Var5, null, 12), 3, null);
                                break;
                            case 1:
                                e1 e1Var6 = e1Var2;
                                Job job = e1Var6.u;
                                if (job != null) {
                                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                                }
                                e1Var6.m.setValue(new com.app.mlounge.ui.viewmodel.d(null, 63));
                                break;
                            case 2:
                                e1 e1Var7 = e1Var2;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var7), null, null, new z0(e1Var7, null, 6), 3, null);
                                break;
                            case 3:
                                e1 e1Var8 = e1Var2;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var8), null, null, new z0(e1Var8, null, 13), 3, null);
                                break;
                            case 4:
                                e1 e1Var9 = e1Var2;
                                Job job2 = e1Var9.v;
                                if (job2 != null) {
                                    Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
                                }
                                e1Var9.o.setValue(new n0(null, 63));
                                break;
                            case 5:
                                e1 e1Var10 = e1Var2;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var10), null, null, new z0(e1Var10, null, 9), 3, null);
                                break;
                            case 6:
                                e1 e1Var11 = e1Var2;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var11), null, null, new z0(e1Var11, null, 7), 3, null);
                                break;
                            case 7:
                                e1 e1Var12 = e1Var2;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var12), null, null, new z0(e1Var12, null, 14), 3, null);
                                break;
                            case 8:
                                e1 e1Var13 = e1Var2;
                                Job job3 = e1Var13.w;
                                if (job3 != null) {
                                    Job.DefaultImpls.cancel$default(job3, (CancellationException) null, 1, (Object) null);
                                }
                                e1Var13.s.setValue(new t1(null, 63));
                                break;
                            case 9:
                                e1 e1Var14 = e1Var2;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var14), null, null, new z0(e1Var14, null, 11), 3, null);
                                break;
                            case 10:
                                e1 e1Var15 = e1Var2;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var15), null, null, new z0(e1Var15, null, 8), 3, null);
                                break;
                            default:
                                e1 e1Var16 = e1Var2;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var16), null, null, new z0(e1Var16, null, 10), 3, null);
                                break;
                        }
                        return y.a;
                    }
                };
                rVar2.l0(objQ14);
            }
            kotlin.jvm.functions.a aVar6 = (kotlin.jvm.functions.a) objQ14;
            boolean zH15 = rVar2.h(e1Var2);
            Object objQ15 = rVar2.Q();
            if (zH15 || objQ15 == fVar) {
                final int i16 = 9;
                objQ15 = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.screens.services.c
                    @Override // kotlin.jvm.functions.a
                    public final Object invoke() {
                        switch (i16) {
                            case 0:
                                e1 e1Var5 = e1Var2;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var5), null, null, new z0(e1Var5, null, 12), 3, null);
                                break;
                            case 1:
                                e1 e1Var6 = e1Var2;
                                Job job = e1Var6.u;
                                if (job != null) {
                                    Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                                }
                                e1Var6.m.setValue(new com.app.mlounge.ui.viewmodel.d(null, 63));
                                break;
                            case 2:
                                e1 e1Var7 = e1Var2;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var7), null, null, new z0(e1Var7, null, 6), 3, null);
                                break;
                            case 3:
                                e1 e1Var8 = e1Var2;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var8), null, null, new z0(e1Var8, null, 13), 3, null);
                                break;
                            case 4:
                                e1 e1Var9 = e1Var2;
                                Job job2 = e1Var9.v;
                                if (job2 != null) {
                                    Job.DefaultImpls.cancel$default(job2, (CancellationException) null, 1, (Object) null);
                                }
                                e1Var9.o.setValue(new n0(null, 63));
                                break;
                            case 5:
                                e1 e1Var10 = e1Var2;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var10), null, null, new z0(e1Var10, null, 9), 3, null);
                                break;
                            case 6:
                                e1 e1Var11 = e1Var2;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var11), null, null, new z0(e1Var11, null, 7), 3, null);
                                break;
                            case 7:
                                e1 e1Var12 = e1Var2;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var12), null, null, new z0(e1Var12, null, 14), 3, null);
                                break;
                            case 8:
                                e1 e1Var13 = e1Var2;
                                Job job3 = e1Var13.w;
                                if (job3 != null) {
                                    Job.DefaultImpls.cancel$default(job3, (CancellationException) null, 1, (Object) null);
                                }
                                e1Var13.s.setValue(new t1(null, 63));
                                break;
                            case 9:
                                e1 e1Var14 = e1Var2;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var14), null, null, new z0(e1Var14, null, 11), 3, null);
                                break;
                            case 10:
                                e1 e1Var15 = e1Var2;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var15), null, null, new z0(e1Var15, null, 8), 3, null);
                                break;
                            default:
                                e1 e1Var16 = e1Var2;
                                BuildersKt__Builders_commonKt.launch$default(l0.g(e1Var16), null, null, new z0(e1Var16, null, 10), 3, null);
                                break;
                        }
                        return y.a;
                    }
                };
                rVar2.l0(objQ15);
            }
            n(t1Var, aVar5, aVar6, (kotlin.jvm.functions.a) objQ15, rVar2, 0);
            androidx.compose.foundation.layout.b.d(rVar2, w0.f(oVar, 32));
            rVar2.p(true);
        } else {
            rVar2.W();
            e1Var2 = e1Var;
        }
        q1 q1VarT = rVar2.t();
        if (q1VarT != null) {
            q1VarT.d = new f(e1Var2, i);
        }
    }

    public static final void k(String str, boolean z, kotlin.jvm.functions.a aVar, r rVar, int i) {
        rVar.c0(1064397775);
        int i2 = i | (rVar.g(z) ? 32 : 16) | (rVar.h(aVar) ? LibretroCore.SCREEN_WIDTH : 128);
        if (rVar.T(i2 & 1, (i2 & Token.EXPR_VOID) != 146)) {
            Object objQ = rVar.Q();
            if (objQ == androidx.compose.runtime.m.a) {
                objQ = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar);
            }
            androidx.compose.foundation.interaction.k kVar = (androidx.compose.foundation.interaction.k) objQ;
            y0 y0VarG = android.support.v4.media.session.b.g(kVar, rVar, 6);
            boolean z2 = !z;
            m0 m0Var = androidx.compose.material3.r.a;
            t2.g(aVar, w0.d(o.b, 1.0f), z2, null, androidx.compose.material3.r.a(t.h, com.app.mlounge.ui.theme.b.l, rVar), androidx.compose.foundation.s.a(2, ((Boolean) y0VarG.getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : com.app.mlounge.ui.theme.b.e), null, kVar, androidx.compose.runtime.internal.k.c(142923329, new androidx.compose.foundation.text.selection.h(str, z), rVar), rVar, ((i2 >> 6) & 14) | 905969712);
        } else {
            rVar.W();
        }
        q1 q1VarT = rVar.t();
        if (q1VarT != null) {
            q1VarT.d = new com.app.mlounge.ui.screens.adult.c(str, z, aVar, i, 1);
        }
    }

    public static final void l(boolean z, r rVar, int i) {
        rVar.c0(-484093933);
        int i2 = (rVar.g(z) ? 4 : 2) | i;
        if (rVar.T(i2 & 1, (i2 & 3) != 2)) {
            f3.a(null, androidx.compose.foundation.shape.e.a(4), z ? t.b(0.2f, com.app.mlounge.ui.theme.b.h) : com.app.mlounge.ui.theme.b.c, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(930037358, new com.app.mlounge.ui.components.p(z, 3, (byte) 0), rVar), rVar, 12582912, Token.DOT);
        } else {
            rVar.W();
        }
        q1 q1VarT = rVar.t();
        if (q1VarT != null) {
            q1VarT.d = new com.app.mlounge.ui.components.p(i, z);
        }
    }

    public static final void m(s1 s1Var, kotlin.jvm.functions.l lVar, kotlin.jvm.functions.a aVar, r rVar, int i) {
        rVar.c0(-1198567248);
        int i2 = (rVar.f(s1Var) ? 4 : 2) | i | (rVar.h(lVar) ? 32 : 16) | (rVar.h(aVar) ? LibretroCore.SCREEN_WIDTH : 128);
        if (rVar.T(i2 & 1, (i2 & Token.EXPR_VOID) != 146)) {
            f3.a(androidx.compose.foundation.layout.b.p(w0.d(o.b, 1.0f), 16, 6), androidx.compose.foundation.shape.e.a(12), com.app.mlounge.ui.theme.b.d, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(-1450742795, new d(s1Var, aVar, lVar), rVar), rVar, 12583302, 120);
        } else {
            rVar.W();
        }
        q1 q1VarT = rVar.t();
        if (q1VarT != null) {
            q1VarT.d = new d(s1Var, lVar, aVar, i);
        }
    }

    public static final void n(t1 t1Var, kotlin.jvm.functions.a aVar, kotlin.jvm.functions.a aVar2, kotlin.jvm.functions.a aVar3, r rVar, int i) {
        rVar.c0(-2015935533);
        int i2 = i | (rVar.f(t1Var) ? 4 : 2) | (rVar.h(aVar) ? 32 : 16) | (rVar.h(aVar2) ? LibretroCore.SCREEN_WIDTH : 128) | (rVar.h(aVar3) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY);
        if (rVar.T(i2 & 1, (i2 & 1171) != 1170)) {
            f3.a(androidx.compose.foundation.layout.b.p(w0.d(o.b, 1.0f), 16, 6), androidx.compose.foundation.shape.e.a(12), com.app.mlounge.ui.theme.b.d, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(787892760, new h(t1Var, aVar3, aVar2, aVar), rVar), rVar, 12583302, 120);
        } else {
            rVar.W();
        }
        q1 q1VarT = rVar.t();
        if (q1VarT != null) {
            q1VarT.d = new h(t1Var, aVar, aVar2, aVar3, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x036d  */
    /* JADX WARN: Code duplicated, block: B:103:0x0375 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:106:0x037b  */
    /* JADX WARN: Code duplicated, block: B:58:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:61:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:62:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:65:0x0244  */
    /* JADX WARN: Code duplicated, block: B:67:0x0249  */
    /* JADX WARN: Code duplicated, block: B:70:0x027f  */
    /* JADX WARN: Code duplicated, block: B:73:0x0284  */
    /* JADX WARN: Code duplicated, block: B:74:0x0287  */
    /* JADX WARN: Code duplicated, block: B:78:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:79:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:82:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:83:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:86:0x0314  */
    /* JADX WARN: Code duplicated, block: B:89:0x032c  */
    /* JADX WARN: Code duplicated, block: B:92:0x033b  */
    /* JADX WARN: Code duplicated, block: B:95:0x0355  */
    /* JADX WARN: Code duplicated, block: B:96:0x0358  */
    /* JADX WARN: Code duplicated, block: B:99:0x036a  */
    public static final void o(p pVar, r rVar, int i) {
        p pVar2;
        Object obj;
        y0 y0Var;
        int i2;
        Object objQ;
        Object objQ2;
        y0 y0Var2;
        Object obj2;
        y0 y0Var3;
        g0 rVar2;
        boolean zF;
        Object objQ3;
        Object obj3;
        y0 y0Var4;
        Object objQ4;
        int i3;
        Object objQ5;
        y0 y0Var5;
        y0 y0Var6;
        Object obj4;
        Object objQ6;
        y0 y0VarG;
        boolean z;
        long j;
        boolean z2;
        Object objQ7;
        rVar.c0(1041540505);
        int i4 = i | (rVar.g(false) ? 4 : 2) | (rVar.h(pVar) ? 32 : 16);
        if (rVar.T(i4 & 1, (i4 & 19) != 18)) {
            Object objQ8 = rVar.Q();
            Object obj5 = androidx.compose.runtime.m.a;
            if (objQ8 == obj5) {
                objQ8 = s.r("");
                rVar.l0(objQ8);
            }
            y0 y0Var7 = (y0) objQ8;
            Object objQ9 = rVar.Q();
            if (objQ9 == obj5) {
                objQ9 = s.r("");
                rVar.l0(objQ9);
            }
            y0 y0Var8 = (y0) objQ9;
            Object objQ10 = rVar.Q();
            if (objQ10 == obj5) {
                objQ10 = s.r(Boolean.FALSE);
                rVar.l0(objQ10);
            }
            y0 y0Var9 = (y0) objQ10;
            Object objQ11 = rVar.Q();
            if (objQ11 == obj5) {
                objQ11 = s.r(Boolean.FALSE);
                rVar.l0(objQ11);
            }
            y0 y0Var10 = (y0) objQ11;
            k2 k2Var = (k2) rVar.j(l1.p);
            androidx.compose.ui.focus.l lVar = (androidx.compose.ui.focus.l) rVar.j(l1.i);
            Object objQ12 = rVar.Q();
            if (objQ12 == obj5) {
                objQ12 = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar);
            }
            androidx.compose.foundation.interaction.k kVar = (androidx.compose.foundation.interaction.k) objQ12;
            Object objQ13 = rVar.Q();
            if (objQ13 == obj5) {
                objQ13 = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar);
            }
            androidx.compose.foundation.interaction.k kVar2 = (androidx.compose.foundation.interaction.k) objQ13;
            Boolean boolValueOf = Boolean.valueOf(((Boolean) y0Var9.getValue()).booleanValue());
            boolean zF2 = rVar.f(k2Var);
            Object objQ14 = rVar.Q();
            kotlin.coroutines.d dVar = null;
            if (zF2 || objQ14 == obj5) {
                objQ14 = new w(k2Var, y0Var9, null, 4);
                rVar.l0(objQ14);
            }
            j0.c(rVar, boolValueOf, (p) objQ14);
            Boolean boolValueOf2 = Boolean.valueOf(((Boolean) y0Var10.getValue()).booleanValue());
            boolean zF3 = rVar.f(k2Var);
            Object objQ15 = rVar.Q();
            int i5 = 5;
            if (zF3 || objQ15 == obj5) {
                objQ15 = new w(k2Var, y0Var10, null, 5);
                rVar.l0(objQ15);
            }
            j0.c(rVar, boolValueOf2, (p) objQ15);
            Object objQ16 = rVar.Q();
            if (objQ16 == obj5) {
                objQ16 = new androidx.compose.foundation.interaction.g(kVar, y0Var9, dVar, i5);
                rVar.l0(objQ16);
            }
            j0.c(rVar, kVar, (p) objQ16);
            Object objQ17 = rVar.Q();
            int i6 = 6;
            if (objQ17 == obj5) {
                objQ17 = new androidx.compose.foundation.interaction.g(kVar2, y0Var10, dVar, i6);
                rVar.l0(objQ17);
            }
            j0.c(rVar, kVar2, (p) objQ17);
            String str = (String) y0Var7.getValue();
            boolean z3 = !((Boolean) y0Var9.getValue()).booleanValue();
            w1 w1Var = w1.a;
            long j2 = com.app.mlounge.ui.theme.b.f;
            long j3 = com.app.mlounge.ui.theme.b.e;
            long j4 = com.app.mlounge.ui.theme.b.l;
            k3 k3VarC = w1.c(j4, j4, j2, j2, j3, 0L, 0L, rVar, 2147477244);
            o oVar = o.b;
            androidx.compose.ui.r rVarD = w0.d(oVar, 1.0f);
            boolean zF4 = rVar.f(k2Var) | rVar.h(lVar);
            Object objQ18 = rVar.Q();
            if (zF4) {
                obj = obj5;
            } else {
                obj = obj5;
                if (objQ18 != obj) {
                    y0Var = y0Var9;
                    i2 = 2;
                }
                androidx.compose.ui.r rVarE = androidx.compose.ui.input.key.c.e(rVarD, (kotlin.jvm.functions.l) objQ18);
                objQ = rVar.Q();
                if (objQ == obj) {
                    objQ = new h2(y0Var, 14);
                    rVar.l0(objQ);
                }
                androidx.compose.ui.r rVarT = androidx.compose.ui.focus.d.t(rVarE, (kotlin.jvm.functions.l) objQ);
                objQ2 = rVar.Q();
                if (objQ2 == obj) {
                    y0Var2 = y0Var7;
                    objQ2 = new h2(y0Var2, 15);
                    rVar.l0(objQ2);
                } else {
                    y0Var2 = y0Var7;
                }
                obj2 = obj;
                y0Var3 = y0Var2;
                c2.a(str, (kotlin.jvm.functions.l) objQ2, rVarT, true, z3, null, a.b, null, null, null, null, null, null, true, 0, 0, kVar, null, k3VarC, rVar, 1572912, 12582912, 6, 3014560);
                float f = 8;
                androidx.compose.foundation.layout.b.d(rVar, w0.f(oVar, f));
                String str2 = (String) y0Var8.getValue();
                boolean z4 = !((Boolean) y0Var10.getValue()).booleanValue();
                if (((Boolean) y0Var10.getValue()).booleanValue()) {
                    rVar2 = f0.e;
                } else {
                    rVar2 = new androidx.compose.ui.text.input.r();
                }
                g0 g0Var = rVar2;
                k3 k3VarC2 = w1.c(j4, j4, j2, j2, j3, 0L, 0L, rVar, 2147477244);
                androidx.compose.ui.r rVarD2 = w0.d(oVar, 1.0f);
                zF = rVar.f(k2Var) | rVar.h(lVar);
                objQ3 = rVar.Q();
                if (zF) {
                    obj3 = obj2;
                } else {
                    obj3 = obj2;
                    if (objQ3 == obj3) {
                        y0Var4 = y0Var10;
                    }
                    androidx.compose.ui.r rVarE2 = androidx.compose.ui.input.key.c.e(rVarD2, (kotlin.jvm.functions.l) objQ3);
                    objQ4 = rVar.Q();
                    if (objQ4 == obj3) {
                        i3 = 16;
                        objQ4 = new h2(y0Var4, i3);
                        rVar.l0(objQ4);
                    } else {
                        i3 = 16;
                    }
                    androidx.compose.ui.r rVarT2 = androidx.compose.ui.focus.d.t(rVarE2, (kotlin.jvm.functions.l) objQ4);
                    objQ5 = rVar.Q();
                    if (objQ5 == obj3) {
                        y0Var5 = y0Var8;
                        objQ5 = new h2(y0Var5, 17);
                        rVar.l0(objQ5);
                    } else {
                        y0Var5 = y0Var8;
                    }
                    y0Var6 = y0Var5;
                    obj4 = obj3;
                    c2.a(str2, (kotlin.jvm.functions.l) objQ5, rVarT2, true, z4, null, a.c, null, null, null, g0Var, null, null, true, 0, 0, kVar2, null, k3VarC2, rVar, 1572912, 12582912, 6, 2998176);
                    androidx.compose.foundation.layout.b.d(rVar, w0.f(oVar, f));
                    objQ6 = rVar.Q();
                    if (objQ6 == obj4) {
                        objQ6 = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar);
                    }
                    androidx.compose.foundation.interaction.k kVar3 = (androidx.compose.foundation.interaction.k) objQ6;
                    y0VarG = android.support.v4.media.session.b.g(kVar3, rVar, 6);
                    if (!kotlin.text.k.d0((String) y0Var3.getValue()) || kotlin.text.k.d0((String) y0Var6.getValue())) {
                        z = false;
                    } else {
                        z = true;
                    }
                    m0 m0Var = androidx.compose.material3.r.a;
                    q qVarA = androidx.compose.material3.r.a(t.h, j4, rVar);
                    float f2 = 2;
                    if (((Boolean) y0VarG.getValue()).booleanValue()) {
                        j = com.app.mlounge.ui.theme.b.q;
                    } else {
                        j = j3;
                    }
                    a0 a0VarA = androidx.compose.foundation.s.a(f2, j);
                    androidx.compose.ui.r rVarD3 = w0.d(oVar, 1.0f);
                    if ((i4 & Token.ASSIGN_MOD) == 32) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    objQ7 = rVar.Q();
                    if (!z2 || objQ7 == obj4) {
                        pVar2 = pVar;
                        objQ7 = new androidx.compose.foundation.gestures.g(16, pVar2, y0Var3, y0Var6);
                        rVar.l0(objQ7);
                    } else {
                        pVar2 = pVar;
                    }
                    t2.g((kotlin.jvm.functions.a) objQ7, rVarD3, z, null, qVarA, a0VarA, null, kVar3, androidx.compose.runtime.internal.k.c(736942951, new androidx.compose.foundation.contextmenu.b(25), rVar), rVar, 905969712);
                }
                y0Var4 = y0Var10;
                objQ3 = new com.app.mlounge.ui.screens.search.h(k2Var, lVar, y0Var4, 3);
                rVar.l0(objQ3);
                androidx.compose.ui.r rVarE3 = androidx.compose.ui.input.key.c.e(rVarD2, (kotlin.jvm.functions.l) objQ3);
                objQ4 = rVar.Q();
                if (objQ4 == obj3) {
                    i3 = 16;
                    objQ4 = new h2(y0Var4, i3);
                    rVar.l0(objQ4);
                } else {
                    i3 = 16;
                }
                androidx.compose.ui.r rVarT3 = androidx.compose.ui.focus.d.t(rVarE3, (kotlin.jvm.functions.l) objQ4);
                objQ5 = rVar.Q();
                if (objQ5 == obj3) {
                    y0Var5 = y0Var8;
                    objQ5 = new h2(y0Var5, 17);
                    rVar.l0(objQ5);
                } else {
                    y0Var5 = y0Var8;
                }
                y0Var6 = y0Var5;
                obj4 = obj3;
                c2.a(str2, (kotlin.jvm.functions.l) objQ5, rVarT3, true, z4, null, a.c, null, null, null, g0Var, null, null, true, 0, 0, kVar2, null, k3VarC2, rVar, 1572912, 12582912, 6, 2998176);
                androidx.compose.foundation.layout.b.d(rVar, w0.f(oVar, f));
                objQ6 = rVar.Q();
                if (objQ6 == obj4) {
                    objQ6 = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar);
                }
                androidx.compose.foundation.interaction.k kVar4 = (androidx.compose.foundation.interaction.k) objQ6;
                y0VarG = android.support.v4.media.session.b.g(kVar4, rVar, 6);
                if (kotlin.text.k.d0((String) y0Var3.getValue())) {
                    z = false;
                } else {
                    z = false;
                }
                m0 m0Var2 = androidx.compose.material3.r.a;
                q qVarA2 = androidx.compose.material3.r.a(t.h, j4, rVar);
                float f3 = 2;
                if (((Boolean) y0VarG.getValue()).booleanValue()) {
                    j = com.app.mlounge.ui.theme.b.q;
                } else {
                    j = j3;
                }
                a0 a0VarA2 = androidx.compose.foundation.s.a(f3, j);
                androidx.compose.ui.r rVarD4 = w0.d(oVar, 1.0f);
                if ((i4 & Token.ASSIGN_MOD) == 32) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objQ7 = rVar.Q();
                if (z2) {
                    pVar2 = pVar;
                    objQ7 = new androidx.compose.foundation.gestures.g(16, pVar2, y0Var3, y0Var6);
                    rVar.l0(objQ7);
                } else {
                    pVar2 = pVar;
                    objQ7 = new androidx.compose.foundation.gestures.g(16, pVar2, y0Var3, y0Var6);
                    rVar.l0(objQ7);
                }
                t2.g((kotlin.jvm.functions.a) objQ7, rVarD4, z, null, qVarA2, a0VarA2, null, kVar4, androidx.compose.runtime.internal.k.c(736942951, new androidx.compose.foundation.contextmenu.b(25), rVar), rVar, 905969712);
            }
            y0Var = y0Var9;
            i2 = 2;
            objQ18 = new com.app.mlounge.ui.screens.search.h(k2Var, lVar, y0Var, i2);
            rVar.l0(objQ18);
            androidx.compose.ui.r rVarE4 = androidx.compose.ui.input.key.c.e(rVarD, (kotlin.jvm.functions.l) objQ18);
            objQ = rVar.Q();
            if (objQ == obj) {
                objQ = new h2(y0Var, 14);
                rVar.l0(objQ);
            }
            androidx.compose.ui.r rVarT4 = androidx.compose.ui.focus.d.t(rVarE4, (kotlin.jvm.functions.l) objQ);
            objQ2 = rVar.Q();
            if (objQ2 == obj) {
                y0Var2 = y0Var7;
                objQ2 = new h2(y0Var2, 15);
                rVar.l0(objQ2);
            } else {
                y0Var2 = y0Var7;
            }
            obj2 = obj;
            y0Var3 = y0Var2;
            c2.a(str, (kotlin.jvm.functions.l) objQ2, rVarT4, true, z3, null, a.b, null, null, null, null, null, null, true, 0, 0, kVar, null, k3VarC, rVar, 1572912, 12582912, 6, 3014560);
            float f4 = 8;
            androidx.compose.foundation.layout.b.d(rVar, w0.f(oVar, f4));
            String str3 = (String) y0Var8.getValue();
            boolean z5 = !((Boolean) y0Var10.getValue()).booleanValue();
            if (((Boolean) y0Var10.getValue()).booleanValue()) {
                rVar2 = f0.e;
            } else {
                rVar2 = new androidx.compose.ui.text.input.r();
            }
            g0 g0Var2 = rVar2;
            k3 k3VarC3 = w1.c(j4, j4, j2, j2, j3, 0L, 0L, rVar, 2147477244);
            androidx.compose.ui.r rVarD5 = w0.d(oVar, 1.0f);
            zF = rVar.f(k2Var) | rVar.h(lVar);
            objQ3 = rVar.Q();
            if (zF) {
                obj3 = obj2;
                if (objQ3 == obj3) {
                    y0Var4 = y0Var10;
                }
                androidx.compose.ui.r rVarE5 = androidx.compose.ui.input.key.c.e(rVarD5, (kotlin.jvm.functions.l) objQ3);
                objQ4 = rVar.Q();
                if (objQ4 == obj3) {
                    i3 = 16;
                    objQ4 = new h2(y0Var4, i3);
                    rVar.l0(objQ4);
                } else {
                    i3 = 16;
                }
                androidx.compose.ui.r rVarT5 = androidx.compose.ui.focus.d.t(rVarE5, (kotlin.jvm.functions.l) objQ4);
                objQ5 = rVar.Q();
                if (objQ5 == obj3) {
                    y0Var5 = y0Var8;
                    objQ5 = new h2(y0Var5, 17);
                    rVar.l0(objQ5);
                } else {
                    y0Var5 = y0Var8;
                }
                y0Var6 = y0Var5;
                obj4 = obj3;
                c2.a(str3, (kotlin.jvm.functions.l) objQ5, rVarT5, true, z5, null, a.c, null, null, null, g0Var2, null, null, true, 0, 0, kVar2, null, k3VarC3, rVar, 1572912, 12582912, 6, 2998176);
                androidx.compose.foundation.layout.b.d(rVar, w0.f(oVar, f4));
                objQ6 = rVar.Q();
                if (objQ6 == obj4) {
                    objQ6 = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar);
                }
                androidx.compose.foundation.interaction.k kVar5 = (androidx.compose.foundation.interaction.k) objQ6;
                y0VarG = android.support.v4.media.session.b.g(kVar5, rVar, 6);
                if (kotlin.text.k.d0((String) y0Var3.getValue())) {
                    z = false;
                } else {
                    z = false;
                }
                m0 m0Var3 = androidx.compose.material3.r.a;
                q qVarA3 = androidx.compose.material3.r.a(t.h, j4, rVar);
                float f5 = 2;
                if (((Boolean) y0VarG.getValue()).booleanValue()) {
                    j = com.app.mlounge.ui.theme.b.q;
                } else {
                    j = j3;
                }
                a0 a0VarA3 = androidx.compose.foundation.s.a(f5, j);
                androidx.compose.ui.r rVarD6 = w0.d(oVar, 1.0f);
                if ((i4 & Token.ASSIGN_MOD) == 32) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                objQ7 = rVar.Q();
                if (z2) {
                    pVar2 = pVar;
                    objQ7 = new androidx.compose.foundation.gestures.g(16, pVar2, y0Var3, y0Var6);
                    rVar.l0(objQ7);
                } else {
                    pVar2 = pVar;
                    objQ7 = new androidx.compose.foundation.gestures.g(16, pVar2, y0Var3, y0Var6);
                    rVar.l0(objQ7);
                }
                t2.g((kotlin.jvm.functions.a) objQ7, rVarD6, z, null, qVarA3, a0VarA3, null, kVar5, androidx.compose.runtime.internal.k.c(736942951, new androidx.compose.foundation.contextmenu.b(25), rVar), rVar, 905969712);
            } else {
                obj3 = obj2;
            }
            y0Var4 = y0Var10;
            objQ3 = new com.app.mlounge.ui.screens.search.h(k2Var, lVar, y0Var4, 3);
            rVar.l0(objQ3);
            androidx.compose.ui.r rVarE6 = androidx.compose.ui.input.key.c.e(rVarD5, (kotlin.jvm.functions.l) objQ3);
            objQ4 = rVar.Q();
            if (objQ4 == obj3) {
                i3 = 16;
                objQ4 = new h2(y0Var4, i3);
                rVar.l0(objQ4);
            } else {
                i3 = 16;
            }
            androidx.compose.ui.r rVarT6 = androidx.compose.ui.focus.d.t(rVarE6, (kotlin.jvm.functions.l) objQ4);
            objQ5 = rVar.Q();
            if (objQ5 == obj3) {
                y0Var5 = y0Var8;
                objQ5 = new h2(y0Var5, 17);
                rVar.l0(objQ5);
            } else {
                y0Var5 = y0Var8;
            }
            y0Var6 = y0Var5;
            obj4 = obj3;
            c2.a(str3, (kotlin.jvm.functions.l) objQ5, rVarT6, true, z5, null, a.c, null, null, null, g0Var2, null, null, true, 0, 0, kVar2, null, k3VarC3, rVar, 1572912, 12582912, 6, 2998176);
            androidx.compose.foundation.layout.b.d(rVar, w0.f(oVar, f4));
            objQ6 = rVar.Q();
            if (objQ6 == obj4) {
                objQ6 = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar);
            }
            androidx.compose.foundation.interaction.k kVar6 = (androidx.compose.foundation.interaction.k) objQ6;
            y0VarG = android.support.v4.media.session.b.g(kVar6, rVar, 6);
            if (kotlin.text.k.d0((String) y0Var3.getValue())) {
                z = false;
            } else {
                z = false;
            }
            m0 m0Var4 = androidx.compose.material3.r.a;
            q qVarA4 = androidx.compose.material3.r.a(t.h, j4, rVar);
            float f6 = 2;
            if (((Boolean) y0VarG.getValue()).booleanValue()) {
                j = com.app.mlounge.ui.theme.b.q;
            } else {
                j = j3;
            }
            a0 a0VarA4 = androidx.compose.foundation.s.a(f6, j);
            androidx.compose.ui.r rVarD7 = w0.d(oVar, 1.0f);
            if ((i4 & Token.ASSIGN_MOD) == 32) {
                z2 = true;
            } else {
                z2 = false;
            }
            objQ7 = rVar.Q();
            if (z2) {
                pVar2 = pVar;
                objQ7 = new androidx.compose.foundation.gestures.g(16, pVar2, y0Var3, y0Var6);
                rVar.l0(objQ7);
            } else {
                pVar2 = pVar;
                objQ7 = new androidx.compose.foundation.gestures.g(16, pVar2, y0Var3, y0Var6);
                rVar.l0(objQ7);
            }
            t2.g((kotlin.jvm.functions.a) objQ7, rVarD7, z, null, qVarA4, a0VarA4, null, kVar6, androidx.compose.runtime.internal.k.c(736942951, new androidx.compose.foundation.contextmenu.b(25), rVar), rVar, 905969712);
        } else {
            pVar2 = pVar;
            rVar.W();
        }
        q1 q1VarT = rVar.t();
        if (q1VarT != null) {
            q1VarT.d = new androidx.compose.runtime.saveable.a(i, pVar2);
        }
    }

    public static final String p(String str) {
        try {
            Locale locale = Locale.US;
            for (SimpleDateFormat simpleDateFormat : com.google.common.base.c.q(new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", locale), new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", locale), new SimpleDateFormat("yyyy-MM-dd", locale))) {
                simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
                try {
                    Date date = simpleDateFormat.parse(str);
                    if (date != null) {
                        String str2 = new SimpleDateFormat("MMM dd, yyyy", Locale.US).format(date);
                        str2.getClass();
                        return str2;
                    }
                    continue;
                } catch (Exception unused) {
                }
            }
        } catch (Exception unused2) {
        }
        return str;
    }
}
