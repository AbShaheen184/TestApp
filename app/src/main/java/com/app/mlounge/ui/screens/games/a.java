package com.app.mlounge.ui.screens.games;

import android.content.Context;
import androidx.compose.animation.core.i0;
import androidx.compose.animation.core.l0;
import androidx.compose.foundation.layout.r0;
import androidx.compose.foundation.layout.t0;
import androidx.compose.foundation.layout.u0;
import androidx.compose.foundation.layout.v;
import androidx.compose.foundation.lazy.grid.x;
import androidx.compose.foundation.lazy.grid.z;
import androidx.compose.foundation.text.selection.k0;
import androidx.compose.material3.f1;
import androidx.compose.material3.f3;
import androidx.compose.material3.j2;
import androidx.compose.material3.n0;
import androidx.compose.material3.o0;
import androidx.compose.material3.o2;
import androidx.compose.material3.p3;
import androidx.compose.material3.t2;
import androidx.compose.material3.t3;
import androidx.compose.material3.u3;
import androidx.compose.runtime.internal.f;
import androidx.compose.runtime.j0;
import androidx.compose.runtime.m;
import androidx.compose.runtime.q1;
import androidx.compose.runtime.r;
import androidx.compose.runtime.u2;
import androidx.compose.runtime.y0;
import androidx.compose.ui.graphics.t;
import androidx.compose.ui.h;
import androidx.compose.ui.i;
import androidx.compose.ui.layout.q0;
import androidx.compose.ui.node.g;
import androidx.compose.ui.node.y;
import androidx.compose.ui.o;
import androidx.compose.ui.platform.m0;
import androidx.datastore.preferences.protobuf.h1;
import androidx.lifecycle.j;
import androidx.lifecycle.w0;
import com.app.mlounge.data.remote.model.GameDetailResponse;
import com.app.mlounge.data.remote.model.GamePlatform;
import com.app.mlounge.emulator.LibretroCore;
import com.app.mlounge.ui.components.b0;
import com.app.mlounge.ui.screens.anime.n;
import com.app.mlounge.ui.viewmodel.s;
import com.google.firebase.crashlytics.internal.model.t1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.functions.l;
import kotlin.jvm.functions.p;
import kotlin.jvm.internal.a0;
import kotlin.k;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final f a = new f(-2014384698, false, new n(11));
    public static final f b = new f(-1695273306, false, new androidx.compose.foundation.contextmenu.b(13));

    /* JADX WARN: Code duplicated, block: B:110:0x05ea  */
    /* JADX WARN: Code duplicated, block: B:111:0x0602  */
    /* JADX WARN: Code duplicated, block: B:113:0x060e  */
    /* JADX WARN: Code duplicated, block: B:114:0x0611  */
    /* JADX WARN: Code duplicated, block: B:117:0x061f  */
    /* JADX WARN: Code duplicated, block: B:119:0x0626  */
    /* JADX WARN: Code duplicated, block: B:122:0x063d  */
    /* JADX WARN: Code duplicated, block: B:123:0x063f  */
    /* JADX WARN: Code duplicated, block: B:129:0x0660  */
    /* JADX WARN: Code duplicated, block: B:132:0x06ab  */
    /* JADX WARN: Code duplicated, block: B:133:0x06ae  */
    /* JADX WARN: Code duplicated, block: B:136:0x06bc  */
    /* JADX WARN: Code duplicated, block: B:137:0x06c1  */
    /* JADX WARN: Code duplicated, block: B:141:0x06dd  */
    /* JADX WARN: Code duplicated, block: B:144:0x0705  */
    /* JADX WARN: Code duplicated, block: B:147:0x0719  */
    /* JADX WARN: Code duplicated, block: B:149:0x074c  */
    /* JADX WARN: Code duplicated, block: B:152:0x0767  */
    /* JADX WARN: Code duplicated, block: B:153:0x0782  */
    /* JADX WARN: Code duplicated, block: B:155:0x07a9  */
    /* JADX WARN: Code duplicated, block: B:157:0x07b1  */
    /* JADX WARN: Code duplicated, block: B:161:0x084a  */
    /* JADX WARN: Code duplicated, block: B:162:0x0853  */
    /* JADX WARN: Code duplicated, block: B:165:0x085a  */
    /* JADX WARN: Code duplicated, block: B:166:0x0863  */
    /* JADX WARN: Code duplicated, block: B:169:0x086a  */
    /* JADX WARN: Code duplicated, block: B:170:0x0874  */
    /* JADX WARN: Code duplicated, block: B:173:0x087c  */
    /* JADX WARN: Code duplicated, block: B:174:0x0886  */
    /* JADX WARN: Code duplicated, block: B:177:0x088e  */
    /* JADX WARN: Code duplicated, block: B:178:0x0898  */
    /* JADX WARN: Code duplicated, block: B:181:0x08a0  */
    /* JADX WARN: Code duplicated, block: B:182:0x08aa  */
    /* JADX WARN: Code duplicated, block: B:185:0x08ba  */
    /* JADX WARN: Code duplicated, block: B:187:0x08e0  */
    /* JADX WARN: Code duplicated, block: B:188:0x08e6  */
    /* JADX WARN: Code duplicated, block: B:192:0x090d  */
    /* JADX WARN: Code duplicated, block: B:194:0x0950  */
    /* JADX WARN: Code duplicated, block: B:195:0x0954  */
    /* JADX WARN: Code duplicated, block: B:198:0x0a0d  */
    /* JADX WARN: Code duplicated, block: B:201:0x0a48  */
    /* JADX WARN: Code duplicated, block: B:202:0x0a4c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12, types: [int] */
    /* JADX WARN: Type inference failed for: r13v21 */
    public static final void a(final String str, final String str2, final kotlin.jvm.functions.a aVar, s sVar, r rVar, final int i) {
        r rVar2;
        s sVar2;
        int i2;
        s sVar3;
        y yVar;
        boolean z;
        androidx.compose.runtime.f fVar;
        androidx.compose.runtime.f fVar2;
        float f;
        int i3;
        GameDetailResponse gameDetailResponse;
        Context context;
        i iVar;
        int i4;
        String strP;
        androidx.compose.ui.graphics.vector.f fVarW;
        boolean z2;
        boolean z3;
        Object bVar;
        GameDetailResponse gameDetailResponse2;
        y0 y0Var;
        float f2;
        h hVar;
        float f3;
        float f4;
        String str3;
        androidx.compose.ui.graphics.vector.f fVarN;
        boolean zH;
        Object objQ;
        String strA;
        y yVar2;
        androidx.compose.ui.node.e eVar;
        androidx.compose.foundation.layout.c cVar;
        androidx.compose.ui.node.e eVar2;
        y yVar3;
        androidx.compose.ui.node.e eVar3;
        float f5;
        int i5;
        String strB;
        k kVar;
        String strG;
        k kVar2;
        String strC;
        k kVar3;
        String strK;
        k kVar4;
        String strE;
        k kVar5;
        String strH;
        k kVar6;
        ArrayList<k> arrayListN;
        float f6;
        int i6;
        h hVar2;
        float f7;
        float f8;
        ?? r13;
        r rVar3;
        y yVarB;
        boolean z4;
        y yVar4;
        boolean zF;
        Object objQ2;
        i iVar2 = androidx.compose.ui.c.G;
        h hVar3 = androidx.compose.ui.c.J;
        aVar.getClass();
        rVar.c0(885118496);
        int i7 = i | (rVar.f(str) ? 4 : 2) | (rVar.f(str2) ? 32 : 16) | (rVar.h(aVar) ? LibretroCore.SCREEN_WIDTH : 128) | LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        if (rVar.T(i7 & 1, (i7 & 1171) != 1170)) {
            rVar.Y();
            if ((i & 1) == 0 || rVar.C()) {
                w0 w0VarA = androidx.lifecycle.viewmodel.compose.a.a(rVar);
                if (w0VarA == null) {
                    net.luminis.tls.engine.impl.c.r("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    i2 = i7 & (-7169);
                    sVar3 = (s) h1.B(a0.a(s.class), w0VarA, androidx.room.r.i(w0VarA, rVar), w0VarA instanceof j ? ((j) w0VarA).getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.a.b, rVar);
                }
            } else {
                rVar.W();
                i2 = i7 & (-7169);
                sVar3 = sVar;
            }
            rVar.q();
            y0 y0VarG = androidx.compose.runtime.s.g(sVar3.n, rVar);
            y0 y0VarG2 = androidx.compose.runtime.s.g(sVar3.p, rVar);
            y0 y0VarG3 = androidx.compose.runtime.s.g(sVar3.r, rVar);
            y0 y0VarG4 = androidx.compose.runtime.s.g(sVar3.t, rVar);
            y0 y0VarG5 = androidx.compose.runtime.s.g(sVar3.v, rVar);
            y0 y0VarG6 = androidx.compose.runtime.s.g(sVar3.K, rVar);
            Context context2 = (Context) rVar.j(m0.b);
            int i8 = i2 & 14;
            boolean zH2 = rVar.h(sVar3) | ((i2 & Token.ASSIGN_MOD) == 32) | (i8 == 4);
            Object objQ3 = rVar.Q();
            androidx.compose.runtime.f fVar3 = m.a;
            if (zH2 || objQ3 == fVar3) {
                objQ3 = new d(sVar3, str2, str, null);
                rVar.l0(objQ3);
            }
            j0.d(str, str2, (p) objQ3, rVar);
            boolean zH3 = rVar.h(sVar3);
            Object objQ4 = rVar.Q();
            if (zH3 || objQ4 == fVar3) {
                objQ4 = new b(sVar3, 0);
                rVar.l0(objQ4);
            }
            j0.b(kotlin.y.a, (l) objQ4, rVar);
            if (((Boolean) y0VarG2.getValue()).booleanValue() || ((GameDetailResponse) y0VarG.getValue()) == null) {
                final s sVar4 = sVar3;
                rVar.b0(1761786449);
                b0.n(null, rVar, 0);
                rVar.s();
                q1 q1VarT = rVar.t();
                if (q1VarT != null) {
                    final int i9 = 0;
                    q1VarT.e(new p(str, str2, aVar, sVar4, i, i9) { // from class: com.app.mlounge.ui.screens.games.c
                        public final /* synthetic */ kotlin.jvm.functions.a A;
                        public final /* synthetic */ s B;
                        public final /* synthetic */ int e;
                        public final /* synthetic */ String y;
                        public final /* synthetic */ String z;

                        {
                            this.e = i9;
                        }

                        @Override // kotlin.jvm.functions.p
                        public final Object invoke(Object obj, Object obj2) {
                            switch (this.e) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int iA = androidx.compose.runtime.s.A(1);
                                    a.a(this.y, this.z, this.A, this.B, (r) obj, iA);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int iA2 = androidx.compose.runtime.s.A(1);
                                    a.a(this.y, this.z, this.A, this.B, (r) obj, iA2);
                                    break;
                            }
                            return kotlin.y.a;
                        }
                    });
                    return;
                }
                return;
            }
            rVar.b0(1761833538);
            rVar.p(false);
            GameDetailResponse gameDetailResponse3 = (GameDetailResponse) y0VarG.getValue();
            gameDetailResponse3.getClass();
            boolean zF2 = rVar.f(gameDetailResponse3.j());
            Object objQ5 = rVar.Q();
            if (zF2 || objQ5 == fVar3) {
                String strJ = gameDetailResponse3.j();
                if (strJ == null) {
                    strJ = str;
                }
                objQ5 = androidx.compose.runtime.s.r(Boolean.valueOf(sVar3.e(strJ)));
                rVar.l0(objQ5);
            }
            y0 y0Var2 = (y0) objQ5;
            androidx.compose.foundation.layout.a0 a0Var = androidx.compose.foundation.layout.w0.c;
            q0 q0VarD = androidx.compose.foundation.layout.p.d(androidx.compose.ui.c.e, false);
            int iHashCode = Long.hashCode(rVar.T);
            androidx.compose.runtime.internal.j jVarL = rVar.l();
            androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(rVar, a0Var);
            g.b.getClass();
            y yVar5 = androidx.compose.ui.node.f.b;
            rVar.e0();
            if (rVar.S) {
                rVar.k(yVar5);
            } else {
                rVar.o0();
            }
            androidx.compose.ui.node.e eVar4 = androidx.compose.ui.node.f.e;
            androidx.compose.runtime.s.x(rVar, q0VarD, eVar4);
            androidx.compose.ui.node.e eVar5 = androidx.compose.ui.node.f.d;
            androidx.compose.runtime.s.x(rVar, jVarL, eVar5);
            Integer numValueOf = Integer.valueOf(iHashCode);
            androidx.compose.ui.node.e eVar6 = androidx.compose.ui.node.f.f;
            androidx.compose.runtime.s.p(rVar, numValueOf, eVar6);
            androidx.compose.ui.node.d dVar = androidx.compose.ui.node.f.g;
            androidx.compose.runtime.s.t(rVar, dVar);
            androidx.compose.ui.node.e eVar7 = androidx.compose.ui.node.f.c;
            androidx.compose.runtime.s.x(rVar, rVarC, eVar7);
            String strF = gameDetailResponse3.f();
            o oVar = o.b;
            float f9 = 300;
            s sVar5 = sVar3;
            coil3.compose.k.a(strF, null, androidx.compose.foundation.layout.w0.f(androidx.compose.foundation.layout.w0.d(oVar, 1.0f), f9), null, androidx.compose.ui.layout.i.a, rVar, 1573296, 1976);
            androidx.compose.ui.r rVarF = androidx.compose.foundation.layout.w0.f(androidx.compose.foundation.layout.w0.d(oVar, 1.0f), f9);
            long j = com.app.mlounge.ui.theme.b.a;
            androidx.compose.foundation.layout.p.a(androidx.compose.foundation.s.e(rVarF, com.google.android.material.shape.g.l(com.google.common.base.c.q(new t(t.b(0.3f, j)), new t(t.b(0.5f, j)), new t(t.b(0.8f, j)), new t(j)), 0.0f, 0.0f, 14)), rVar, 6);
            androidx.compose.ui.r rVarP = androidx.compose.foundation.s.p(a0Var, androidx.compose.foundation.s.o(rVar), true);
            androidx.compose.foundation.layout.c cVar2 = androidx.compose.foundation.layout.h.c;
            v vVarA = androidx.compose.foundation.layout.t.a(cVar2, hVar3, rVar, 0);
            int iHashCode2 = Long.hashCode(rVar.T);
            androidx.compose.runtime.internal.j jVarL2 = rVar.l();
            androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(rVar, rVarP);
            rVar.e0();
            if (rVar.S) {
                yVar = yVar5;
                rVar.k(yVar);
            } else {
                yVar = yVar5;
                rVar.o0();
            }
            androidx.compose.runtime.s.x(rVar, vVarA, eVar4);
            androidx.compose.runtime.s.x(rVar, jVarL2, eVar5);
            androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode2, rVar, eVar6, rVar, dVar);
            androidx.compose.runtime.s.x(rVar, rVarC2, eVar7);
            Object objQ6 = rVar.Q();
            if (objQ6 == fVar3) {
                objQ6 = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar);
            }
            androidx.compose.foundation.interaction.k kVar7 = (androidx.compose.foundation.interaction.k) objQ6;
            y0 y0VarG7 = android.support.v4.media.session.b.g(kVar7, rVar, 6);
            float f10 = 8;
            androidx.compose.ui.r rVarO = androidx.compose.foundation.layout.b.o(oVar, f10);
            androidx.compose.foundation.shape.d dVar2 = androidx.compose.foundation.shape.e.a;
            float f11 = 2;
            y yVar6 = yVar;
            t2.e(aVar, androidx.compose.foundation.s.g(androidx.compose.ui.draw.h.a(rVarO, dVar2), f11, ((Boolean) y0VarG7.getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : t.h, dVar2), false, null, kVar7, null, a, rVar, ((i2 >> 6) & 14) | 1597440, 44);
            androidx.compose.foundation.layout.b.d(rVar, androidx.compose.foundation.layout.w0.f(oVar, f10));
            float f12 = 16;
            androidx.compose.ui.r rVarQ = androidx.compose.foundation.layout.b.q(oVar, f12, 0.0f, 2);
            t0 t0VarA = r0.a(androidx.compose.foundation.layout.h.a, iVar2, rVar, 0);
            int iHashCode3 = Long.hashCode(rVar.T);
            androidx.compose.runtime.internal.j jVarL3 = rVar.l();
            androidx.compose.ui.r rVarC3 = androidx.compose.ui.a.c(rVar, rVarQ);
            rVar.e0();
            if (rVar.S) {
                rVar.k(yVar6);
            } else {
                rVar.o0();
            }
            androidx.compose.runtime.s.x(rVar, t0VarA, eVar4);
            androidx.compose.runtime.s.x(rVar, jVarL3, eVar5);
            androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode3, rVar, eVar6, rVar, dVar);
            androidx.compose.runtime.s.x(rVar, rVarC3, eVar7);
            t2.c(null, androidx.compose.foundation.shape.e.a(f10), null, t2.j(62, f10), androidx.compose.runtime.internal.k.c(-554153330, new androidx.compose.foundation.gestures.y(gameDetailResponse3, 7), rVar), rVar, 196608, 21);
            androidx.compose.foundation.layout.b.d(rVar, androidx.compose.foundation.layout.w0.p(oVar, f12));
            androidx.compose.ui.r rVarA = u0.a(1.0f);
            v vVarA2 = androidx.compose.foundation.layout.t.a(cVar2, hVar3, rVar, 0);
            int iHashCode4 = Long.hashCode(rVar.T);
            androidx.compose.runtime.internal.j jVarL4 = rVar.l();
            androidx.compose.ui.r rVarC4 = androidx.compose.ui.a.c(rVar, rVarA);
            rVar.e0();
            if (rVar.S) {
                rVar.k(yVar6);
            } else {
                rVar.o0();
            }
            androidx.compose.runtime.s.x(rVar, vVarA2, eVar4);
            androidx.compose.runtime.s.x(rVar, jVarL4, eVar5);
            androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode4, rVar, eVar6, rVar, dVar);
            androidx.compose.runtime.s.x(rVar, rVarC4, eVar7);
            String strD = gameDetailResponse3.d();
            if (strD == null) {
                strD = "";
            }
            u2 u2Var = u3.a;
            androidx.compose.ui.text.m0 m0Var = ((t3) rVar.j(u2Var)).f;
            long j2 = com.app.mlounge.ui.theme.b.l;
            p3.b(strD, null, j2, 0L, null, 0L, null, 0L, 0, false, 0, 0, m0Var, rVar, 384, 0, 131066);
            androidx.compose.foundation.layout.b.d(rVar, androidx.compose.foundation.layout.w0.f(oVar, f10));
            e("Platform:", ((GamePlatform) y0VarG5.getValue()).e(), rVar, 6);
            Double dI = gameDetailResponse3.i();
            if (dI == null) {
                rVar.b0(1786575307);
                rVar.p(false);
                z = false;
            } else {
                rVar.b0(1786575308);
                e("Size:", String.format(Locale.US, "%.1f", Arrays.copyOf(new Object[]{Double.valueOf(dI.doubleValue())}, 1)).concat(" MB"), rVar, 6);
                z = false;
                rVar.p(false);
            }
            androidx.compose.foundation.layout.b.d(rVar, androidx.compose.foundation.layout.w0.f(oVar, 12));
            boolean z5 = z;
            p3.b("Hint!", null, j2, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar.j(u2Var)).h, rVar, 390, 0, 131066);
            float f13 = 4;
            androidx.compose.foundation.layout.b.d(rVar, androidx.compose.foundation.layout.w0.f(oVar, f13));
            androidx.compose.ui.text.m0 m0Var2 = ((t3) rVar.j(u2Var)).l;
            long j3 = com.app.mlounge.ui.theme.b.m;
            float f14 = f13;
            p3.b("First download the game and then press Play. Enjoy!", null, j3, 0L, null, 0L, null, ((t3) rVar.j(u2Var)).l.b.c, 0, false, 0, 0, m0Var2, rVar, 390, 0, 129018);
            r rVar4 = rVar;
            rVar4.p(true);
            rVar4.p(true);
            androidx.compose.foundation.layout.b.d(rVar4, androidx.compose.foundation.layout.w0.f(oVar, 24));
            androidx.compose.ui.r rVarQ2 = androidx.compose.foundation.layout.b.q(androidx.compose.foundation.layout.w0.d(oVar, 1.0f), f12, 0.0f, 2);
            t0 t0VarA2 = r0.a(androidx.compose.foundation.layout.h.g(f10), iVar2, rVar4, 6);
            int iHashCode5 = Long.hashCode(rVar4.T);
            androidx.compose.runtime.internal.j jVarL5 = rVar4.l();
            androidx.compose.ui.r rVarC5 = androidx.compose.ui.a.c(rVar4, rVarQ2);
            rVar4.e0();
            if (rVar4.S) {
                rVar4.k(yVar6);
            } else {
                rVar4.o0();
            }
            androidx.compose.runtime.s.x(rVar4, t0VarA2, eVar4);
            androidx.compose.runtime.s.x(rVar4, jVarL5, eVar5);
            androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode5, rVar4, eVar6, rVar4, dVar);
            androidx.compose.runtime.s.x(rVar4, rVarC5, eVar7);
            androidx.compose.ui.graphics.vector.f fVarW2 = kotlin.math.a.w();
            boolean z6 = (((rVar4.f(gameDetailResponse3) ? 1 : 0) | (i8 == 4 ? true : z5 ? 1 : 0)) | (rVar4.h(sVar5) ? 1 : 0) ? 1 : 0) | (rVar4.h(context2) ? 1 : 0);
            Object objQ7 = rVar4.Q();
            if (z6 == 0) {
                fVar = fVar3;
                if (objQ7 != fVar) {
                    fVar2 = fVar;
                    sVar2 = sVar5;
                    context = context2;
                    f = 1.0f;
                    i3 = 4;
                    gameDetailResponse = gameDetailResponse3;
                }
                iVar = iVar2;
                i4 = i3;
                androidx.compose.runtime.f fVar4 = fVar2;
                com.app.mlounge.ui.screens.movies.a.b("Play", fVarW2, (kotlin.jvm.functions.a) objQ7, u0.a(f), false, rVar4, 6, 48);
                if (((Boolean) y0VarG3.getValue()).booleanValue()) {
                    strP = androidx.privacysandbox.ads.adservices.java.internal.a.p("Downloading... ", (int) (((Number) y0VarG4.getValue()).floatValue() * 100), "%");
                } else if (((Boolean) y0Var2.getValue()).booleanValue()) {
                    strP = "Downloaded";
                } else {
                    strP = "Download";
                }
                if (((Boolean) y0Var2.getValue()).booleanValue()) {
                    fVarW = org.jsoup.helper.n.q();
                } else {
                    fVarW = _COROUTINE.a.w();
                }
                boolean z7 = (rVar4.f(y0VarG3) ? 1 : 0) | (rVar4.f(y0Var2) ? 1 : 0) | (rVar4.f(gameDetailResponse) ? 1 : 0);
                if (i8 == i4) {
                    z2 = true;
                } else {
                    z2 = z5 ? 1 : 0;
                }
                z3 = ((z2 | (z7 ? 1 : 0)) | (rVar4.h(sVar2) ? 1 : 0) ? 1 : 0) | (rVar4.h(context) ? 1 : 0);
                Object objQ8 = rVar4.Q();
                if (z3 == 0 || objQ8 == fVar4) {
                    gameDetailResponse2 = gameDetailResponse;
                    bVar = new androidx.compose.runtime.saveable.b(y0Var2, gameDetailResponse2, str, sVar2, y0VarG3, context);
                    y0Var = y0VarG3;
                    rVar4.l0(bVar);
                } else {
                    bVar = objQ8;
                    y0Var = y0VarG3;
                    gameDetailResponse2 = gameDetailResponse;
                }
                f2 = f12;
                hVar = hVar3;
                f3 = f10;
                f4 = f;
                com.app.mlounge.ui.screens.movies.a.b(strP, fVarW, (kotlin.jvm.functions.a) bVar, u0.a(f), false, rVar4, 0, 48);
                if (((Boolean) y0VarG6.getValue()).booleanValue()) {
                    str3 = "Unfavourite";
                } else {
                    str3 = "Favourite";
                }
                if (((Boolean) y0VarG6.getValue()).booleanValue()) {
                    fVarN = com.google.android.gms.dynamite.g.p();
                } else {
                    fVarN = h1.n();
                }
                zH = rVar4.h(sVar2) | rVar4.f(gameDetailResponse2) | rVar4.f(y0VarG5);
                objQ = rVar4.Q();
                if (zH || objQ == fVar4) {
                    objQ = new androidx.compose.foundation.gestures.g(9, sVar2, gameDetailResponse2, y0VarG5);
                    rVar4.l0(objQ);
                }
                com.app.mlounge.ui.screens.movies.a.b(str3, fVarN, (kotlin.jvm.functions.a) objQ, u0.a(f4), false, rVar4, 0, 48);
                rVar4.p(true);
                if (((Boolean) y0Var.getValue()).booleanValue()) {
                    rVar4.b0(-2146845651);
                    zF = rVar4.f(y0VarG4);
                    objQ2 = rVar4.Q();
                    if (zF || objQ2 == fVar4) {
                        objQ2 = new k0(y0VarG4, 5);
                        rVar4.l0(objQ2);
                    }
                    o2.b((kotlin.jvm.functions.a) objQ2, androidx.compose.foundation.layout.b.p(androidx.compose.foundation.layout.w0.d(oVar, f4), f2, f3), com.app.mlounge.ui.theme.b.q, 0L, 0, 0.0f, null, rVar, 432, 120);
                    rVar4 = rVar;
                    rVar4.p(z5);
                } else {
                    rVar4.b0(-2146583298);
                    rVar4.p(z5);
                }
                androidx.compose.foundation.layout.b.d(rVar4, androidx.compose.foundation.layout.w0.f(oVar, f2));
                strA = gameDetailResponse2.a();
                if (strA == null) {
                    rVar4.b0(-2146464228);
                    rVar4.p(z5);
                    eVar = eVar4;
                    yVar3 = yVar6;
                    eVar3 = eVar5;
                    cVar = cVar2;
                    eVar2 = eVar7;
                    f5 = 0.0f;
                    i5 = 2;
                } else {
                    rVar4.b0(-2146464227);
                    androidx.compose.ui.r rVarQ3 = androidx.compose.foundation.layout.b.q(oVar, f2, 0.0f, 2);
                    v vVarA3 = androidx.compose.foundation.layout.t.a(cVar2, hVar, rVar4, z5 ? 1 : 0);
                    int iHashCode6 = Long.hashCode(rVar4.T);
                    androidx.compose.runtime.internal.j jVarL6 = rVar4.l();
                    androidx.compose.ui.r rVarC6 = androidx.compose.ui.a.c(rVar4, rVarQ3);
                    rVar4.e0();
                    if (rVar4.S) {
                        yVar2 = yVar6;
                        rVar4.k(yVar2);
                    } else {
                        yVar2 = yVar6;
                        rVar4.o0();
                    }
                    eVar = eVar4;
                    androidx.compose.runtime.s.x(rVar4, vVarA3, eVar);
                    androidx.compose.runtime.s.x(rVar4, jVarL6, eVar5);
                    androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode6, rVar4, eVar6, rVar4, dVar);
                    androidx.compose.runtime.s.x(rVar4, rVarC6, eVar7);
                    cVar = cVar2;
                    eVar2 = eVar7;
                    yVar3 = yVar2;
                    eVar3 = eVar5;
                    f5 = 0.0f;
                    i5 = 2;
                    p3.b("Details", null, j2, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar4.j(u2Var)).h, rVar, 390, 0, 131066);
                    androidx.compose.foundation.layout.b.d(rVar, androidx.compose.foundation.layout.w0.f(oVar, f3));
                    p3.b(strA, null, j3, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar.j(u2Var)).k, rVar, 384, 0, 131066);
                    rVar4 = rVar;
                    rVar4.p(true);
                    androidx.compose.foundation.layout.b.d(rVar4, androidx.compose.foundation.layout.w0.f(oVar, f2));
                    rVar4.p(false);
                }
                strB = gameDetailResponse2.b();
                if (strB != null) {
                    kVar = new k("Developer", strB);
                } else {
                    kVar = null;
                }
                strG = gameDetailResponse2.g();
                if (strG != null) {
                    kVar2 = new k("Publisher", strG);
                } else {
                    kVar2 = null;
                }
                strC = gameDetailResponse2.c();
                if (strC != null) {
                    kVar3 = new k("Genre", strC);
                } else {
                    kVar3 = null;
                }
                strK = gameDetailResponse2.k();
                if (strK != null) {
                    kVar4 = new k("Year", strK);
                } else {
                    kVar4 = null;
                }
                strE = gameDetailResponse2.e();
                if (strE != null) {
                    kVar5 = new k("Players", strE);
                } else {
                    kVar5 = null;
                }
                strH = gameDetailResponse2.h();
                if (strH != null) {
                    kVar6 = new k("Region", strH);
                } else {
                    kVar6 = null;
                }
                arrayListN = kotlin.collections.n.N(new k[]{kVar, kVar2, kVar3, kVar4, kVar5, kVar6});
                if (arrayListN.isEmpty()) {
                    f6 = f5;
                    i6 = i5;
                    hVar2 = hVar;
                    f7 = f2;
                    f8 = f3;
                    r rVar5 = rVar4;
                    r13 = 0;
                    rVar5.b0(-2144803650);
                    rVar5.p(false);
                    rVar3 = rVar5;
                } else {
                    rVar4.b0(-2145585904);
                    androidx.compose.ui.r rVarQ4 = androidx.compose.foundation.layout.b.q(oVar, f2, f5, i5);
                    z4 = false;
                    v vVarA4 = androidx.compose.foundation.layout.t.a(cVar, hVar, rVar4, 0);
                    int iHashCode7 = Long.hashCode(rVar4.T);
                    androidx.compose.runtime.internal.j jVarL7 = rVar4.l();
                    androidx.compose.ui.r rVarC7 = androidx.compose.ui.a.c(rVar4, rVarQ4);
                    rVar4.e0();
                    if (rVar4.S) {
                        rVar4.k(yVar3);
                    } else {
                        rVar4.o0();
                    }
                    androidx.compose.runtime.s.x(rVar4, vVarA4, eVar);
                    androidx.compose.runtime.s.x(rVar4, jVarL7, eVar3);
                    androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode7, rVar4, eVar6, rVar4, dVar);
                    androidx.compose.runtime.s.x(rVar4, rVarC7, eVar2);
                    rVar4.b0(-1567513391);
                    for (k kVar8 : arrayListN) {
                        String str4 = (String) kVar8.e;
                        String str5 = (String) kVar8.y;
                        float f15 = f14;
                        androidx.compose.ui.r rVarQ5 = androidx.compose.foundation.layout.b.q(androidx.compose.foundation.layout.w0.d(oVar, 1.0f), f5, f15, 1);
                        i iVar3 = iVar;
                        t0 t0VarA3 = r0.a(androidx.compose.foundation.layout.h.e, iVar3, rVar4, 6);
                        h hVar4 = hVar;
                        int iHashCode8 = Long.hashCode(rVar4.T);
                        androidx.compose.runtime.internal.j jVarL8 = rVar4.l();
                        androidx.compose.ui.r rVarC8 = androidx.compose.ui.a.c(rVar4, rVarQ5);
                        g.b.getClass();
                        yVar4 = androidx.compose.ui.node.f.b;
                        rVar4.e0();
                        if (rVar4.S) {
                            rVar4.k(yVar4);
                        } else {
                            rVar4.o0();
                        }
                        androidx.compose.runtime.s.x(rVar4, t0VarA3, androidx.compose.ui.node.f.e);
                        androidx.compose.runtime.s.x(rVar4, jVarL8, androidx.compose.ui.node.f.d);
                        androidx.compose.runtime.s.p(rVar4, Integer.valueOf(iHashCode8), androidx.compose.ui.node.f.f);
                        androidx.compose.runtime.s.t(rVar4, androidx.compose.ui.node.f.g);
                        androidx.compose.runtime.s.x(rVar4, rVarC8, androidx.compose.ui.node.f.c);
                        u2 u2Var2 = u3.a;
                        iVar = iVar3;
                        f14 = f15;
                        p3.b(str4, null, com.app.mlounge.ui.theme.b.n, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar4.j(u2Var2)).k, rVar, 384, 0, 131066);
                        p3.b(str5, null, com.app.mlounge.ui.theme.b.l, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar.j(u2Var2)).k, rVar, 384, 0, 131066);
                        rVar.p(true);
                        float f16 = f5;
                        t2.d(androidx.compose.foundation.layout.b.q(oVar, f16, f11, 1), 0.0f, com.app.mlounge.ui.theme.b.e, rVar, 390, 2);
                        hVar = hVar4;
                        i5 = 2;
                        f5 = f16;
                        z4 = false;
                        f3 = f3;
                        rVar4 = rVar;
                        f2 = f2;
                    }
                    f6 = f5;
                    i6 = i5;
                    f7 = f2;
                    f8 = f3;
                    r rVar6 = rVar4;
                    boolean z8 = z4;
                    hVar2 = hVar;
                    rVar6.p(z8);
                    rVar6.p(true);
                    androidx.compose.foundation.layout.b.d(rVar6, androidx.compose.foundation.layout.w0.f(oVar, f7));
                    rVar6.p(z8);
                    rVar3 = rVar6;
                    r13 = z8;
                }
                androidx.compose.ui.r rVarQ6 = androidx.compose.foundation.layout.b.q(oVar, f7, f6, i6);
                v vVarA5 = androidx.compose.foundation.layout.t.a(androidx.compose.foundation.layout.h.c, hVar2, rVar3, r13);
                int iHashCode9 = Long.hashCode(rVar3.T);
                androidx.compose.runtime.internal.j jVarA = rVar3.A();
                androidx.compose.ui.r rVarC9 = androidx.compose.ui.a.c(rVar3, rVarQ6);
                g.b.getClass();
                yVarB = androidx.compose.ui.node.f.b();
                rVar3.e0();
                if (rVar3.E()) {
                    rVar3.k(yVarB);
                } else {
                    rVar3.o0();
                }
                androidx.compose.runtime.s.x(rVar3, vVarA5, androidx.compose.ui.node.f.d());
                androidx.compose.runtime.s.x(rVar3, jVarA, androidx.compose.ui.node.f.f());
                androidx.compose.runtime.s.p(rVar3, Integer.valueOf(iHashCode9), androidx.compose.ui.node.f.c());
                androidx.compose.runtime.s.t(rVar3, androidx.compose.ui.node.f.a());
                androidx.compose.runtime.s.x(rVar3, rVarC9, androidx.compose.ui.node.f.e());
                u2 u2Var3 = u3.a;
                r rVar7 = rVar3;
                p3.b("Controls", null, com.app.mlounge.ui.theme.b.b(), 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar3.j(u2Var3)).c(), rVar7, 390, 0, 131066);
                androidx.compose.foundation.layout.b.d(rVar7, androidx.compose.foundation.layout.w0.f(oVar, f8));
                p3.b("🎮 Use on-screen controls or connect a Bluetooth/USB gamepad.\n\n📱 Touch: Menu button bottom center opens in-game menu.(save/load states)\n🎮 Gamepad: Select + Start buttons: Opens in-game menu (save/load states).", null, com.app.mlounge.ui.theme.b.d(), 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar7.j(u2Var3)).a(), rVar, 384, 0, 131066);
                rVar2 = rVar;
                rVar2.r();
                androidx.compose.foundation.layout.b.d(rVar2, androidx.compose.foundation.layout.w0.f(oVar, 32));
                rVar2.r();
                rVar2.r();
            } else {
                fVar = fVar3;
            }
            fVar2 = fVar;
            f = 1.0f;
            i3 = 4;
            gameDetailResponse = gameDetailResponse3;
            objQ7 = new l0(gameDetailResponse, str, sVar5, context2, 2);
            context = context2;
            sVar2 = sVar5;
            rVar4.l0(objQ7);
            iVar = iVar2;
            i4 = i3;
            androidx.compose.runtime.f fVar5 = fVar2;
            com.app.mlounge.ui.screens.movies.a.b("Play", fVarW2, (kotlin.jvm.functions.a) objQ7, u0.a(f), false, rVar4, 6, 48);
            if (((Boolean) y0VarG3.getValue()).booleanValue()) {
                strP = androidx.privacysandbox.ads.adservices.java.internal.a.p("Downloading... ", (int) (((Number) y0VarG4.getValue()).floatValue() * 100), "%");
            } else if (((Boolean) y0Var2.getValue()).booleanValue()) {
                strP = "Downloaded";
            } else {
                strP = "Download";
            }
            if (((Boolean) y0Var2.getValue()).booleanValue()) {
                fVarW = org.jsoup.helper.n.q();
            } else {
                fVarW = _COROUTINE.a.w();
            }
            boolean z9 = (rVar4.f(y0VarG3) ? 1 : 0) | (rVar4.f(y0Var2) ? 1 : 0) | (rVar4.f(gameDetailResponse) ? 1 : 0);
            if (i8 == i4) {
                z2 = true;
            } else {
                z2 = z5 ? 1 : 0;
            }
            z3 = ((z2 | (z9 ? 1 : 0)) | (rVar4.h(sVar2) ? 1 : 0) ? 1 : 0) | (rVar4.h(context) ? 1 : 0);
            Object objQ9 = rVar4.Q();
            if (z3 == 0) {
                gameDetailResponse2 = gameDetailResponse;
                bVar = new androidx.compose.runtime.saveable.b(y0Var2, gameDetailResponse2, str, sVar2, y0VarG3, context);
                y0Var = y0VarG3;
                rVar4.l0(bVar);
            } else {
                gameDetailResponse2 = gameDetailResponse;
                bVar = new androidx.compose.runtime.saveable.b(y0Var2, gameDetailResponse2, str, sVar2, y0VarG3, context);
                y0Var = y0VarG3;
                rVar4.l0(bVar);
            }
            f2 = f12;
            hVar = hVar3;
            f3 = f10;
            f4 = f;
            com.app.mlounge.ui.screens.movies.a.b(strP, fVarW, (kotlin.jvm.functions.a) bVar, u0.a(f), false, rVar4, 0, 48);
            if (((Boolean) y0VarG6.getValue()).booleanValue()) {
                str3 = "Unfavourite";
            } else {
                str3 = "Favourite";
            }
            if (((Boolean) y0VarG6.getValue()).booleanValue()) {
                fVarN = com.google.android.gms.dynamite.g.p();
            } else {
                fVarN = h1.n();
            }
            zH = rVar4.h(sVar2) | rVar4.f(gameDetailResponse2) | rVar4.f(y0VarG5);
            objQ = rVar4.Q();
            if (zH) {
                objQ = new androidx.compose.foundation.gestures.g(9, sVar2, gameDetailResponse2, y0VarG5);
                rVar4.l0(objQ);
            } else {
                objQ = new androidx.compose.foundation.gestures.g(9, sVar2, gameDetailResponse2, y0VarG5);
                rVar4.l0(objQ);
            }
            com.app.mlounge.ui.screens.movies.a.b(str3, fVarN, (kotlin.jvm.functions.a) objQ, u0.a(f4), false, rVar4, 0, 48);
            rVar4.p(true);
            if (((Boolean) y0Var.getValue()).booleanValue()) {
                rVar4.b0(-2146845651);
                zF = rVar4.f(y0VarG4);
                objQ2 = rVar4.Q();
                if (zF) {
                    objQ2 = new k0(y0VarG4, 5);
                    rVar4.l0(objQ2);
                } else {
                    objQ2 = new k0(y0VarG4, 5);
                    rVar4.l0(objQ2);
                }
                o2.b((kotlin.jvm.functions.a) objQ2, androidx.compose.foundation.layout.b.p(androidx.compose.foundation.layout.w0.d(oVar, f4), f2, f3), com.app.mlounge.ui.theme.b.q, 0L, 0, 0.0f, null, rVar, 432, 120);
                rVar4 = rVar;
                rVar4.p(z5);
            } else {
                rVar4.b0(-2146583298);
                rVar4.p(z5);
            }
            androidx.compose.foundation.layout.b.d(rVar4, androidx.compose.foundation.layout.w0.f(oVar, f2));
            strA = gameDetailResponse2.a();
            if (strA == null) {
                rVar4.b0(-2146464228);
                rVar4.p(z5);
                eVar = eVar4;
                yVar3 = yVar6;
                eVar3 = eVar5;
                cVar = cVar2;
                eVar2 = eVar7;
                f5 = 0.0f;
                i5 = 2;
            } else {
                rVar4.b0(-2146464227);
                androidx.compose.ui.r rVarQ7 = androidx.compose.foundation.layout.b.q(oVar, f2, 0.0f, 2);
                v vVarA6 = androidx.compose.foundation.layout.t.a(cVar2, hVar, rVar4, z5 ? 1 : 0);
                int iHashCode10 = Long.hashCode(rVar4.T);
                androidx.compose.runtime.internal.j jVarL9 = rVar4.l();
                androidx.compose.ui.r rVarC10 = androidx.compose.ui.a.c(rVar4, rVarQ7);
                rVar4.e0();
                if (rVar4.S) {
                    yVar2 = yVar6;
                    rVar4.k(yVar2);
                } else {
                    yVar2 = yVar6;
                    rVar4.o0();
                }
                eVar = eVar4;
                androidx.compose.runtime.s.x(rVar4, vVarA6, eVar);
                androidx.compose.runtime.s.x(rVar4, jVarL9, eVar5);
                androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode10, rVar4, eVar6, rVar4, dVar);
                androidx.compose.runtime.s.x(rVar4, rVarC10, eVar7);
                cVar = cVar2;
                eVar2 = eVar7;
                yVar3 = yVar2;
                eVar3 = eVar5;
                f5 = 0.0f;
                i5 = 2;
                p3.b("Details", null, j2, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar4.j(u2Var)).h, rVar, 390, 0, 131066);
                androidx.compose.foundation.layout.b.d(rVar, androidx.compose.foundation.layout.w0.f(oVar, f3));
                p3.b(strA, null, j3, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar.j(u2Var)).k, rVar, 384, 0, 131066);
                rVar4 = rVar;
                rVar4.p(true);
                androidx.compose.foundation.layout.b.d(rVar4, androidx.compose.foundation.layout.w0.f(oVar, f2));
                rVar4.p(false);
            }
            strB = gameDetailResponse2.b();
            if (strB != null) {
                kVar = new k("Developer", strB);
            } else {
                kVar = null;
            }
            strG = gameDetailResponse2.g();
            if (strG != null) {
                kVar2 = new k("Publisher", strG);
            } else {
                kVar2 = null;
            }
            strC = gameDetailResponse2.c();
            if (strC != null) {
                kVar3 = new k("Genre", strC);
            } else {
                kVar3 = null;
            }
            strK = gameDetailResponse2.k();
            if (strK != null) {
                kVar4 = new k("Year", strK);
            } else {
                kVar4 = null;
            }
            strE = gameDetailResponse2.e();
            if (strE != null) {
                kVar5 = new k("Players", strE);
            } else {
                kVar5 = null;
            }
            strH = gameDetailResponse2.h();
            if (strH != null) {
                kVar6 = new k("Region", strH);
            } else {
                kVar6 = null;
            }
            arrayListN = kotlin.collections.n.N(new k[]{kVar, kVar2, kVar3, kVar4, kVar5, kVar6});
            if (arrayListN.isEmpty()) {
                rVar4.b0(-2145585904);
                androidx.compose.ui.r rVarQ8 = androidx.compose.foundation.layout.b.q(oVar, f2, f5, i5);
                z4 = false;
                v vVarA7 = androidx.compose.foundation.layout.t.a(cVar, hVar, rVar4, 0);
                int iHashCode11 = Long.hashCode(rVar4.T);
                androidx.compose.runtime.internal.j jVarL10 = rVar4.l();
                androidx.compose.ui.r rVarC11 = androidx.compose.ui.a.c(rVar4, rVarQ8);
                rVar4.e0();
                if (rVar4.S) {
                    rVar4.k(yVar3);
                } else {
                    rVar4.o0();
                }
                androidx.compose.runtime.s.x(rVar4, vVarA7, eVar);
                androidx.compose.runtime.s.x(rVar4, jVarL10, eVar3);
                androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode11, rVar4, eVar6, rVar4, dVar);
                androidx.compose.runtime.s.x(rVar4, rVarC11, eVar2);
                rVar4.b0(-1567513391);
                while (r29.hasNext()) {
                    String str6 = (String) kVar8.e;
                    String str7 = (String) kVar8.y;
                    float f17 = f14;
                    androidx.compose.ui.r rVarQ9 = androidx.compose.foundation.layout.b.q(androidx.compose.foundation.layout.w0.d(oVar, 1.0f), f5, f17, 1);
                    i iVar4 = iVar;
                    t0 t0VarA4 = r0.a(androidx.compose.foundation.layout.h.e, iVar4, rVar4, 6);
                    h hVar5 = hVar;
                    int iHashCode12 = Long.hashCode(rVar4.T);
                    androidx.compose.runtime.internal.j jVarL11 = rVar4.l();
                    androidx.compose.ui.r rVarC12 = androidx.compose.ui.a.c(rVar4, rVarQ9);
                    g.b.getClass();
                    yVar4 = androidx.compose.ui.node.f.b;
                    rVar4.e0();
                    if (rVar4.S) {
                        rVar4.k(yVar4);
                    } else {
                        rVar4.o0();
                    }
                    androidx.compose.runtime.s.x(rVar4, t0VarA4, androidx.compose.ui.node.f.e);
                    androidx.compose.runtime.s.x(rVar4, jVarL11, androidx.compose.ui.node.f.d);
                    androidx.compose.runtime.s.p(rVar4, Integer.valueOf(iHashCode12), androidx.compose.ui.node.f.f);
                    androidx.compose.runtime.s.t(rVar4, androidx.compose.ui.node.f.g);
                    androidx.compose.runtime.s.x(rVar4, rVarC12, androidx.compose.ui.node.f.c);
                    u2 u2Var4 = u3.a;
                    iVar = iVar4;
                    f14 = f17;
                    p3.b(str6, null, com.app.mlounge.ui.theme.b.n, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar4.j(u2Var4)).k, rVar, 384, 0, 131066);
                    p3.b(str7, null, com.app.mlounge.ui.theme.b.l, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar.j(u2Var4)).k, rVar, 384, 0, 131066);
                    rVar.p(true);
                    float f18 = f5;
                    t2.d(androidx.compose.foundation.layout.b.q(oVar, f18, f11, 1), 0.0f, com.app.mlounge.ui.theme.b.e, rVar, 390, 2);
                    hVar = hVar5;
                    i5 = 2;
                    f5 = f18;
                    z4 = false;
                    f3 = f3;
                    rVar4 = rVar;
                    f2 = f2;
                }
                f6 = f5;
                i6 = i5;
                f7 = f2;
                f8 = f3;
                r rVar8 = rVar4;
                boolean z10 = z4;
                hVar2 = hVar;
                rVar8.p(z10);
                rVar8.p(true);
                androidx.compose.foundation.layout.b.d(rVar8, androidx.compose.foundation.layout.w0.f(oVar, f7));
                rVar8.p(z10);
                rVar3 = rVar8;
                r13 = z10;
            } else {
                f6 = f5;
                i6 = i5;
                hVar2 = hVar;
                f7 = f2;
                f8 = f3;
                r rVar9 = rVar4;
                r13 = 0;
                rVar9.b0(-2144803650);
                rVar9.p(false);
                rVar3 = rVar9;
            }
            androidx.compose.ui.r rVarQ10 = androidx.compose.foundation.layout.b.q(oVar, f7, f6, i6);
            v vVarA8 = androidx.compose.foundation.layout.t.a(androidx.compose.foundation.layout.h.c, hVar2, rVar3, r13);
            int iHashCode13 = Long.hashCode(rVar3.T);
            androidx.compose.runtime.internal.j jVarA2 = rVar3.A();
            androidx.compose.ui.r rVarC13 = androidx.compose.ui.a.c(rVar3, rVarQ10);
            g.b.getClass();
            yVarB = androidx.compose.ui.node.f.b();
            rVar3.e0();
            if (rVar3.E()) {
                rVar3.k(yVarB);
            } else {
                rVar3.o0();
            }
            androidx.compose.runtime.s.x(rVar3, vVarA8, androidx.compose.ui.node.f.d());
            androidx.compose.runtime.s.x(rVar3, jVarA2, androidx.compose.ui.node.f.f());
            androidx.compose.runtime.s.p(rVar3, Integer.valueOf(iHashCode13), androidx.compose.ui.node.f.c());
            androidx.compose.runtime.s.t(rVar3, androidx.compose.ui.node.f.a());
            androidx.compose.runtime.s.x(rVar3, rVarC13, androidx.compose.ui.node.f.e());
            u2 u2Var5 = u3.a;
            r rVar10 = rVar3;
            p3.b("Controls", null, com.app.mlounge.ui.theme.b.b(), 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar3.j(u2Var5)).c(), rVar10, 390, 0, 131066);
            androidx.compose.foundation.layout.b.d(rVar10, androidx.compose.foundation.layout.w0.f(oVar, f8));
            p3.b("🎮 Use on-screen controls or connect a Bluetooth/USB gamepad.\n\n📱 Touch: Menu button bottom center opens in-game menu.(save/load states)\n🎮 Gamepad: Select + Start buttons: Opens in-game menu (save/load states).", null, com.app.mlounge.ui.theme.b.d(), 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar10.j(u2Var5)).a(), rVar, 384, 0, 131066);
            rVar2 = rVar;
            rVar2.r();
            androidx.compose.foundation.layout.b.d(rVar2, androidx.compose.foundation.layout.w0.f(oVar, 32));
            rVar2.r();
            rVar2.r();
        } else {
            rVar2 = rVar;
            rVar2.W();
            sVar2 = sVar;
        }
        q1 q1VarT2 = rVar2.t();
        if (q1VarT2 != null) {
            final int i10 = 1;
            final s sVar6 = sVar2;
            q1VarT2.e(new p(str, str2, aVar, sVar6, i, i10) { // from class: com.app.mlounge.ui.screens.games.c
                public final /* synthetic */ kotlin.jvm.functions.a A;
                public final /* synthetic */ s B;
                public final /* synthetic */ int e;
                public final /* synthetic */ String y;
                public final /* synthetic */ String z;

                {
                    this.e = i10;
                }

                @Override // kotlin.jvm.functions.p
                public final Object invoke(Object obj, Object obj2) {
                    switch (this.e) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int iA = androidx.compose.runtime.s.A(1);
                            a.a(this.y, this.z, this.A, this.B, (r) obj, iA);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int iA2 = androidx.compose.runtime.s.A(1);
                            a.a(this.y, this.z, this.A, this.B, (r) obj, iA2);
                            break;
                    }
                    return kotlin.y.a;
                }
            });
        }
    }

    public static final void b(String str, ArrayList arrayList, String str2, l lVar, r rVar, int i) {
        int i2;
        r rVar2 = rVar;
        rVar2.c0(1936390144);
        if ((i & 6) == 0) {
            i2 = (rVar2.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= rVar2.h(arrayList) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= rVar2.f(str2) ? LibretroCore.SCREEN_WIDTH : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= rVar2.h(lVar) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY;
        }
        if (rVar2.T(i2 & 1, (i2 & 1171) != 1170)) {
            Object objQ = rVar2.Q();
            androidx.compose.runtime.f fVar = m.a;
            if (objQ == fVar) {
                objQ = androidx.compose.runtime.s.r(Boolean.FALSE);
                rVar2.l0(objQ);
            }
            y0 y0Var = (y0) objQ;
            Object objQ2 = rVar2.Q();
            if (objQ2 == fVar) {
                objQ2 = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar2);
            }
            androidx.compose.foundation.interaction.k kVar = (androidx.compose.foundation.interaction.k) objQ2;
            y0 y0VarG = android.support.v4.media.session.b.g(kVar, rVar2, 6);
            q0 q0VarD = androidx.compose.foundation.layout.p.d(androidx.compose.ui.c.e, false);
            int iHashCode = Long.hashCode(rVar2.T);
            androidx.compose.runtime.internal.j jVarL = rVar2.l();
            o oVar = o.b;
            androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(rVar2, oVar);
            g.b.getClass();
            y yVar = androidx.compose.ui.node.f.b;
            rVar2.e0();
            if (rVar2.S) {
                rVar2.k(yVar);
            } else {
                rVar2.o0();
            }
            androidx.compose.runtime.s.x(rVar2, q0VarD, androidx.compose.ui.node.f.e);
            androidx.compose.runtime.s.x(rVar2, jVarL, androidx.compose.ui.node.f.d);
            androidx.compose.runtime.s.p(rVar2, Integer.valueOf(iHashCode), androidx.compose.ui.node.f.f);
            androidx.compose.runtime.s.t(rVar2, androidx.compose.ui.node.f.g);
            androidx.compose.runtime.s.x(rVar2, rVarC, androidx.compose.ui.node.f.c);
            float f = 8;
            androidx.compose.ui.r rVarG = androidx.compose.foundation.s.g(androidx.compose.ui.draw.h.a(oVar, androidx.compose.foundation.shape.e.a(f)), 2, ((Boolean) y0VarG.getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : t.h, androidx.compose.foundation.shape.e.a(f));
            Object objQ3 = rVar2.Q();
            if (objQ3 == fVar) {
                objQ3 = new androidx.compose.foundation.lazy.n(y0Var, 15);
                rVar2.l0(objQ3);
            }
            f3.a(androidx.compose.foundation.s.m(androidx.compose.foundation.s.i(rVarG, kVar, null, false, null, (kotlin.jvm.functions.a) objQ3, 28), kVar, 1), androidx.compose.foundation.shape.e.a(f), str2 != null ? t.b(0.2f, com.app.mlounge.ui.theme.b.f) : com.app.mlounge.ui.theme.b.c, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(364196833, new com.app.mlounge.ui.components.m0(str2, str, 2, (byte) 0), rVar2), rVar2, 12582912, 120);
            boolean zBooleanValue = ((Boolean) y0Var.getValue()).booleanValue();
            Object objQ4 = rVar2.Q();
            if (objQ4 == fVar) {
                objQ4 = new androidx.compose.foundation.lazy.n(y0Var, 16);
                rVar2.l0(objQ4);
            }
            androidx.compose.material3.p.a(zBooleanValue, (kotlin.jvm.functions.a) objQ4, androidx.compose.foundation.layout.w0.h(androidx.compose.foundation.s.f(oVar, com.app.mlounge.ui.theme.b.b, androidx.compose.ui.graphics.a0.b), 0.0f, 300, 1), 0L, null, null, null, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(1720302187, new androidx.compose.foundation.contextmenu.e(arrayList, lVar, str2, y0Var, 3), rVar2), rVar, 432, 2040);
            rVar2 = rVar;
            rVar2.p(true);
        } else {
            rVar2.W();
        }
        q1 q1VarT = rVar2.t();
        if (q1VarT != null) {
            q1VarT.d = new androidx.compose.material3.d(str, arrayList, str2, lVar, i, 4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v37 */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r40v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v19 */
    /* JADX WARN: Type inference failed for: r6v20, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r8v0, types: [androidx.compose.runtime.r] */
    /* JADX WARN: Type inference failed for: r8v1, types: [androidx.compose.runtime.r] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    public static final void c(final GamePlatform gamePlatform, final List list, final List list2, final String str, final String str2, boolean z, final l lVar, final l lVar2, final l lVar3, final kotlin.jvm.functions.a aVar, androidx.compose.ui.r rVar, r rVar2, final int i) {
        boolean z2;
        androidx.compose.ui.r rVar3;
        ?? r8;
        androidx.compose.runtime.f fVar;
        ?? string;
        String string2;
        ?? r9 = rVar2;
        r9.c0(-1763075841);
        int i2 = i | (r9.d(gamePlatform.ordinal()) ? 4 : 2) | (r9.h(list) ? 32 : 16) | (r9.h(list2) ? LibretroCore.SCREEN_WIDTH : 128) | (r9.f(str) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) | (r9.f(str2) ? 16384 : 8192) | (r9.g(z) ? 131072 : Parser.ARGC_LIMIT) | (r9.h(lVar) ? 1048576 : 524288) | (r9.h(lVar2) ? 8388608 : 4194304) | (r9.h(lVar3) ? 67108864 : 33554432) | (r9.h(aVar) ? 536870912 : 268435456);
        if (r9.T(i2 & 1, (i2 & 306783379) != 306783378)) {
            o oVar = o.b;
            float f = 8;
            androidx.compose.ui.r rVarP = androidx.compose.foundation.layout.b.p(androidx.compose.foundation.s.p(androidx.compose.foundation.layout.w0.d(oVar, 1.0f), androidx.compose.foundation.s.o(r9), false), 12, f);
            t0 t0VarA = r0.a(androidx.compose.foundation.layout.h.g(f), androidx.compose.ui.c.H, r9, 54);
            int iHashCode = Long.hashCode(r9.T);
            androidx.compose.runtime.internal.j jVarL = r9.l();
            androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(r9, rVarP);
            g.b.getClass();
            y yVar = androidx.compose.ui.node.f.b;
            r9.e0();
            if (r9.S) {
                r9.k(yVar);
            } else {
                r9.o0();
            }
            androidx.compose.runtime.s.x(r9, t0VarA, androidx.compose.ui.node.f.e);
            androidx.compose.runtime.s.x(r9, jVarL, androidx.compose.ui.node.f.d);
            androidx.compose.runtime.s.p(r9, Integer.valueOf(iHashCode), androidx.compose.ui.node.f.f);
            androidx.compose.runtime.s.t(r9, androidx.compose.ui.node.f.g);
            androidx.compose.runtime.s.x(r9, rVarC, androidx.compose.ui.node.f.c);
            o oVar2 = oVar;
            ?? r0 = 0;
            f1.b(t1.o(), "Filters", androidx.compose.foundation.layout.w0.l(oVar, 20), com.app.mlounge.ui.theme.b.m, r9, 3504, 0);
            r9.b0(1922654338);
            Iterator it = GamePlatform.f().iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                fVar = m.a;
                if (!zHasNext) {
                    break;
                }
                GamePlatform gamePlatform2 = (GamePlatform) it.next();
                ?? r6 = gamePlatform == gamePlatform2 ? 1 : r0;
                Object objQ = r9.Q();
                if (objQ == fVar) {
                    objQ = androidx.privacysandbox.ads.adservices.java.internal.a.g(r9);
                }
                androidx.compose.foundation.interaction.k kVar = (androidx.compose.foundation.interaction.k) objQ;
                o oVar3 = oVar2;
                androidx.compose.ui.r rVarG = androidx.compose.foundation.s.g(androidx.compose.ui.draw.h.a(oVar2, androidx.compose.foundation.shape.e.a(f)), 2, ((Boolean) android.support.v4.media.session.b.g(kVar, r9, 6).getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : t.h, androidx.compose.foundation.shape.e.a(f));
                boolean zD = ((i2 & 3670016) == 1048576) | r9.d(gamePlatform2.ordinal());
                Object objQ2 = r9.Q();
                if (zD || objQ2 == fVar) {
                    objQ2 = new androidx.activity.compose.f(29, lVar, gamePlatform2);
                    r9.l0(objQ2);
                }
                f3.a(androidx.compose.foundation.s.m(androidx.compose.foundation.s.i(rVarG, kVar, null, false, null, (kotlin.jvm.functions.a) objQ2, 28), kVar, 1), androidx.compose.foundation.shape.e.a(f), r6 != 0 ? t.b(0.3f, com.app.mlounge.ui.theme.b.f) : com.app.mlounge.ui.theme.b.c, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(-301515982, new androidx.activity.compose.i(gamePlatform2, (boolean) r6, 3), r9), r9, 12582912, 120);
                oVar2 = oVar3;
                r0 = 0;
            }
            o oVar4 = oVar2;
            r9.p(r0);
            if (str == 0) {
                string = "Genre";
            } else if (str.length() > 0) {
                StringBuilder sb = new StringBuilder();
                String strValueOf = String.valueOf(str.charAt(r0));
                strValueOf.getClass();
                String upperCase = strValueOf.toUpperCase(Locale.ROOT);
                upperCase.getClass();
                sb.append((Object) upperCase);
                sb.append(str.substring(1));
                string = sb.toString();
            } else {
                string = str;
            }
            List listP = com.google.common.base.c.p(new k(null, "All Genres"));
            ArrayList arrayList = new ArrayList(kotlin.collections.p.y(list, 10));
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                String str3 = (String) it2.next();
                if (str3.length() > 0) {
                    StringBuilder sb2 = new StringBuilder();
                    String strValueOf2 = String.valueOf(str3.charAt(0));
                    strValueOf2.getClass();
                    String upperCase2 = strValueOf2.toUpperCase(Locale.ROOT);
                    upperCase2.getClass();
                    sb2.append((Object) upperCase2);
                    sb2.append(str3.substring(1));
                    string2 = sb2.toString();
                } else {
                    string2 = str3;
                }
                arrayList.add(new k(str3, string2));
            }
            ?? r4 = string;
            rVar3 = oVar4;
            b(r4, kotlin.collections.o.X(listP, arrayList), str, lVar2, r9, ((i2 >> 3) & 896) | ((i2 >> 12) & 7168));
            String str4 = str2 == null ? "Decade" : str2;
            List listP2 = com.google.common.base.c.p(new k(null, "All Decades"));
            ArrayList arrayList2 = new ArrayList(kotlin.collections.p.y(list2, 10));
            Iterator it3 = list2.iterator();
            while (it3.hasNext()) {
                String str5 = (String) it3.next();
                arrayList2.add(new k(str5, str5));
            }
            r rVar4 = rVar2;
            b(str4, kotlin.collections.o.X(listP2, arrayList2), str2, lVar3, rVar4, ((i2 >> 6) & 896) | ((i2 >> 15) & 7168));
            Object objQ3 = rVar4.Q();
            if (objQ3 == fVar) {
                objQ3 = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar4);
            }
            androidx.compose.foundation.interaction.k kVar2 = (androidx.compose.foundation.interaction.k) objQ3;
            androidx.compose.ui.r rVarG2 = androidx.compose.foundation.s.g(androidx.compose.ui.draw.h.a(rVar3, androidx.compose.foundation.shape.e.a(f)), 2, ((Boolean) android.support.v4.media.session.b.g(kVar2, rVar4, 6).getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : t.h, androidx.compose.foundation.shape.e.a(f));
            boolean z3 = (i2 & 1879048192) == 536870912;
            Object objQ4 = rVar4.Q();
            if (z3 || objQ4 == fVar) {
                objQ4 = new j2(6, aVar);
                rVar4.l0(objQ4);
            }
            z2 = z;
            f3.a(androidx.compose.foundation.s.m(androidx.compose.foundation.s.i(rVarG2, kVar2, null, false, null, (kotlin.jvm.functions.a) objQ4, 28), kVar2, 1), androidx.compose.foundation.shape.e.a(f), z ? t.b(0.3f, androidx.compose.ui.graphics.a0.d(4293467747L)) : com.app.mlounge.ui.theme.b.c, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(1841374240, new com.app.mlounge.ui.components.p(z2, 2, (byte) 0), rVar4), rVar4, 12582912, 120);
            rVar4.p(true);
            r8 = rVar4;
        } else {
            z2 = z;
            r9.W();
            rVar3 = rVar;
            r8 = r9;
        }
        q1 q1VarT = r8.t();
        if (q1VarT != null) {
            final androidx.compose.ui.r rVar5 = rVar3;
            final boolean z4 = z2;
            q1VarT.d = new p(list, list2, str, str2, z4, lVar, lVar2, lVar3, aVar, rVar5, i) { // from class: com.app.mlounge.ui.screens.games.e
                public final /* synthetic */ String A;
                public final /* synthetic */ String B;
                public final /* synthetic */ boolean C;
                public final /* synthetic */ l D;
                public final /* synthetic */ l E;
                public final /* synthetic */ l F;
                public final /* synthetic */ kotlin.jvm.functions.a G;
                public final /* synthetic */ androidx.compose.ui.r H;
                public final /* synthetic */ List y;
                public final /* synthetic */ List z;

                @Override // kotlin.jvm.functions.p
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = androidx.compose.runtime.s.A(1);
                    a.c(this.e, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H, (r) obj, iA);
                    return kotlin.y.a;
                }
            };
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0468  */
    /* JADX WARN: Code duplicated, block: B:45:0x0248  */
    /* JADX WARN: Code duplicated, block: B:49:0x025f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0277  */
    /* JADX WARN: Code duplicated, block: B:56:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:58:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:60:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:62:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:64:0x0337  */
    /* JADX WARN: Code duplicated, block: B:66:0x0369  */
    /* JADX WARN: Code duplicated, block: B:67:0x036b  */
    /* JADX WARN: Code duplicated, block: B:73:0x0379  */
    /* JADX WARN: Code duplicated, block: B:77:0x03a2  */
    /* JADX WARN: Code duplicated, block: B:82:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:84:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:95:0x044e  */
    /* JADX WARN: Code duplicated, block: B:96:0x0450  */
    /* JADX WARN: Code duplicated, block: B:99:0x0466 A[ADDED_TO_REGION] */
    public static final void d(p pVar, s sVar, r rVar, int i) {
        r rVar2;
        s sVar2;
        int i2;
        s sVar3;
        y0 y0Var;
        s sVar4;
        y0 y0Var2;
        androidx.compose.runtime.f fVar;
        boolean zH;
        Object objQ;
        boolean zH2;
        Object objQ2;
        boolean zH3;
        Object objQ3;
        boolean z;
        boolean z2;
        boolean zF;
        Object objQ4;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        Object objQ5;
        pVar.getClass();
        rVar.c0(519157550);
        int i3 = i | (rVar.h(pVar) ? 4 : 2) | 16;
        if (rVar.T(i3 & 1, (i3 & 19) != 18)) {
            rVar.Y();
            if ((i & 1) == 0 || rVar.C()) {
                w0 w0VarA = androidx.lifecycle.viewmodel.compose.a.a(rVar);
                if (w0VarA == null) {
                    net.luminis.tls.engine.impl.c.r("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    i2 = i3 & (-113);
                    sVar3 = (s) h1.B(a0.a(s.class), w0VarA, androidx.room.r.i(w0VarA, rVar), w0VarA instanceof j ? ((j) w0VarA).getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.a.b, rVar);
                }
            } else {
                rVar.W();
                i2 = i3 & (-113);
                sVar3 = sVar;
            }
            rVar.q();
            y0 y0VarG = androidx.compose.runtime.s.g(sVar3.f, rVar);
            y0 y0VarG2 = androidx.compose.runtime.s.g(sVar3.h, rVar);
            y0 y0VarG3 = androidx.compose.runtime.s.g(sVar3.j, rVar);
            y0 y0VarG4 = androidx.compose.runtime.s.g(sVar3.l, rVar);
            y0 y0VarG5 = androidx.compose.runtime.s.g(sVar3.v, rVar);
            y0 y0VarG6 = androidx.compose.runtime.s.g(sVar3.z, rVar);
            y0 y0VarG7 = androidx.compose.runtime.s.g(sVar3.B, rVar);
            y0 y0VarG8 = androidx.compose.runtime.s.g(sVar3.D, rVar);
            y0 y0VarG9 = androidx.compose.runtime.s.g(sVar3.F, rVar);
            y0 y0VarG10 = androidx.compose.runtime.s.g(sVar3.H, rVar);
            y0 y0VarG11 = androidx.compose.runtime.s.g(sVar3.I, rVar);
            x xVarA = z.a(0, 0, rVar, 3);
            boolean zF2 = rVar.f(xVarA) | rVar.f(y0VarG10) | rVar.f(y0VarG) | rVar.h(sVar3);
            Object objQ6 = rVar.Q();
            androidx.compose.runtime.f fVar2 = m.a;
            if (zF2 || objQ6 == fVar2) {
                y0Var = y0VarG;
                sVar4 = sVar3;
                objQ6 = new androidx.compose.animation.core.f(xVarA, sVar4, y0VarG10, y0Var, null, 13);
                y0Var2 = y0VarG10;
                rVar.l0(objQ6);
            } else {
                y0Var = y0VarG;
                y0Var2 = y0VarG10;
                sVar4 = sVar3;
            }
            j0.c(rVar, xVarA, (p) objQ6);
            androidx.compose.foundation.layout.a0 a0Var = androidx.compose.foundation.layout.w0.c;
            v vVarA = androidx.compose.foundation.layout.t.a(androidx.compose.foundation.layout.h.c, androidx.compose.ui.c.J, rVar, 0);
            int iHashCode = Long.hashCode(rVar.T);
            androidx.compose.runtime.internal.j jVarL = rVar.l();
            androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(rVar, a0Var);
            g.b.getClass();
            y yVar = androidx.compose.ui.node.f.b;
            rVar.e0();
            if (rVar.S) {
                rVar.k(yVar);
            } else {
                rVar.o0();
            }
            androidx.compose.ui.node.e eVar = androidx.compose.ui.node.f.e;
            androidx.compose.runtime.s.x(rVar, vVarA, eVar);
            androidx.compose.ui.node.e eVar2 = androidx.compose.ui.node.f.d;
            androidx.compose.runtime.s.x(rVar, jVarL, eVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            androidx.compose.ui.node.e eVar3 = androidx.compose.ui.node.f.f;
            androidx.compose.runtime.s.p(rVar, numValueOf, eVar3);
            androidx.compose.ui.node.d dVar = androidx.compose.ui.node.f.g;
            androidx.compose.runtime.s.t(rVar, dVar);
            androidx.compose.ui.node.e eVar4 = androidx.compose.ui.node.f.c;
            androidx.compose.runtime.s.x(rVar, rVarC, eVar4);
            u2 u2Var = u3.a;
            androidx.compose.ui.text.m0 m0Var = ((t3) rVar.j(u2Var)).e;
            u2 u2Var2 = o0.a;
            int i4 = i2;
            long j = ((n0) rVar.j(u2Var2)).o;
            float f = 16;
            o oVar = o.b;
            s sVar5 = sVar4;
            y0 y0Var3 = y0Var;
            p3.b("Games", androidx.compose.foundation.layout.b.s(oVar, f, f, 0.0f, 4, 4), j, 0L, null, 0L, null, 0L, 0, false, 0, 0, m0Var, rVar, 54, 0, 131064);
            float f2 = 8;
            p3.b("Retro Game Library - To change emulator settings go to Settings > Emulator Settings", androidx.compose.foundation.layout.b.s(oVar, f, 0.0f, 0.0f, f2, 6), ((n0) rVar.j(u2Var2)).s, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar.j(u2Var)).l, rVar, 54, 0, 131064);
            GamePlatform gamePlatform = (GamePlatform) y0VarG5.getValue();
            List list = (List) y0VarG6.getValue();
            List list2 = (List) y0VarG7.getValue();
            String str = (String) y0VarG8.getValue();
            String str2 = (String) y0VarG9.getValue();
            boolean zBooleanValue = ((Boolean) y0Var2.getValue()).booleanValue();
            boolean zH4 = rVar.h(sVar5);
            Object objQ7 = rVar.Q();
            if (zH4) {
                fVar = fVar2;
            } else {
                fVar = fVar2;
                if (objQ7 == fVar) {
                }
                l lVar = (l) objQ7;
                zH = rVar.h(sVar5);
                objQ = rVar.Q();
                if (zH || objQ == fVar) {
                    objQ = new b(sVar5, 2);
                    rVar.l0(objQ);
                }
                l lVar2 = (l) objQ;
                zH2 = rVar.h(sVar5);
                objQ2 = rVar.Q();
                if (zH2 || objQ2 == fVar) {
                    objQ2 = new b(sVar5, 3);
                    rVar.l0(objQ2);
                }
                l lVar3 = (l) objQ2;
                zH3 = rVar.h(sVar5);
                objQ3 = rVar.Q();
                if (zH3 || objQ3 == fVar) {
                    objQ3 = new androidx.room.coroutines.d(sVar5, 16);
                    rVar.l0(objQ3);
                }
                androidx.compose.runtime.f fVar3 = fVar;
                s sVar6 = sVar5;
                c(gamePlatform, list, list2, str, str2, zBooleanValue, lVar, lVar2, lVar3, (kotlin.jvm.functions.a) objQ3, null, rVar, 0);
                if (((Boolean) y0Var2.getValue()).booleanValue()) {
                    rVar.b0(-439408175);
                    if (((List) y0VarG11.getValue()).isEmpty()) {
                        rVar.b0(-439397139);
                        q0 q0VarD = androidx.compose.foundation.layout.p.d(androidx.compose.ui.c.B, false);
                        int iHashCode2 = Long.hashCode(rVar.T);
                        androidx.compose.runtime.internal.j jVarL2 = rVar.l();
                        androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(rVar, a0Var);
                        rVar.e0();
                        if (rVar.S) {
                            rVar.k(yVar);
                        } else {
                            rVar.o0();
                        }
                        androidx.compose.runtime.s.x(rVar, q0VarD, eVar);
                        androidx.compose.runtime.s.x(rVar, jVarL2, eVar2);
                        androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode2, rVar, eVar3, rVar, dVar);
                        androidx.compose.runtime.s.x(rVar, rVarC2, eVar4);
                        z4 = false;
                        p3.b("No favourites yet. Add games from their detail page!", null, ((n0) rVar.j(u2Var2)).s, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar.j(u2Var)).k, rVar, 6, 0, 131066);
                        z = true;
                        rVar.p(true);
                        rVar.p(false);
                        rVar2 = rVar;
                    } else {
                        z4 = false;
                        z = true;
                        rVar.b0(-438816230);
                        androidx.compose.foundation.lazy.grid.a aVar = new androidx.compose.foundation.lazy.grid.a(((com.app.mlounge.ui.theme.a) rVar.j(com.app.mlounge.ui.theme.f.a)).y);
                        float f3 = 12;
                        androidx.compose.foundation.layout.m0 m0Var2 = new androidx.compose.foundation.layout.m0(f3, f3, f3, f3);
                        androidx.compose.foundation.layout.f fVarG = androidx.compose.foundation.layout.h.g(f2);
                        androidx.compose.foundation.layout.f fVarG2 = androidx.compose.foundation.layout.h.g(f2);
                        boolean zF3 = rVar.f(y0VarG11);
                        if ((i4 & 14) == 4) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        z6 = zF3 | z5;
                        objQ5 = rVar.Q();
                        if (z6 || objQ5 == fVar3) {
                            objQ5 = new androidx.datastore.core.t0(13, y0VarG11, pVar);
                            rVar.l0(objQ5);
                        }
                        com.google.android.gms.dynamite.g.a(aVar, a0Var, null, m0Var2, fVarG2, fVarG, null, false, null, (l) objQ5, rVar, 1772592, 916);
                        rVar2 = rVar;
                        rVar2.p(false);
                    }
                    rVar2.p(z4);
                } else {
                    rVar2 = rVar;
                    z = true;
                    if (((Boolean) y0VarG2.getValue()).booleanValue() || !((List) y0Var3.getValue()).isEmpty()) {
                        if (((String) y0VarG4.getValue()) == null && ((List) y0Var3.getValue()).isEmpty()) {
                            rVar2.b0(-1815232731);
                            String str3 = (String) y0VarG4.getValue();
                            str3.getClass();
                            sVar6 = sVar6;
                            boolean zH5 = rVar2.h(sVar6);
                            Object objQ8 = rVar2.Q();
                            if (zH5 || objQ8 == fVar3) {
                                androidx.compose.foundation.r0 r0Var = new androidx.compose.foundation.r0(0, sVar6, s.class, "loadGames", "loadGames()V", 0, 6);
                                rVar2.l0(r0Var);
                                objQ8 = r0Var;
                            }
                            b0.i(str3, null, (kotlin.jvm.functions.a) ((kotlin.reflect.e) objQ8), rVar2, 0);
                            rVar2.p(false);
                        } else {
                            rVar2.b0(-437443240);
                            androidx.compose.foundation.lazy.grid.a aVar2 = new androidx.compose.foundation.lazy.grid.a(((com.app.mlounge.ui.theme.a) rVar2.j(com.app.mlounge.ui.theme.f.a)).y);
                            float f4 = 12;
                            androidx.compose.foundation.layout.m0 m0Var3 = new androidx.compose.foundation.layout.m0(f4, f4, f4, f4);
                            androidx.compose.foundation.layout.f fVarG3 = androidx.compose.foundation.layout.h.g(f2);
                            androidx.compose.foundation.layout.f fVarG4 = androidx.compose.foundation.layout.h.g(f2);
                            boolean zF4 = rVar2.f(y0Var3);
                            if ((i4 & 14) == 4) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            zF = zF4 | z2 | rVar2.f(y0VarG5) | rVar2.f(y0VarG3);
                            objQ4 = rVar2.Q();
                            if (!zF || objQ4 == fVar3) {
                                z3 = false;
                                i0 i0Var = new i0((Object) y0Var3, (Object) pVar, y0VarG5, y0VarG3, 8);
                                rVar2.l0(i0Var);
                                objQ4 = i0Var;
                            } else {
                                z3 = false;
                            }
                            com.google.android.gms.dynamite.g.a(aVar2, a0Var, xVarA, m0Var3, fVarG4, fVarG3, null, false, null, (l) objQ4, rVar, 1772592, 912);
                            rVar2 = rVar;
                            rVar2.p(z3);
                        }
                        rVar2.p(z);
                        sVar2 = sVar6;
                    } else {
                        rVar2.b0(-1815234966);
                        b0.n(null, rVar2, 0);
                        rVar2.p(false);
                    }
                }
                i = i;
                z = z;
                rVar2.p(z);
                sVar2 = sVar6;
            }
            objQ7 = new b(sVar5, 1);
            rVar.l0(objQ7);
            l lVar4 = (l) objQ7;
            zH = rVar.h(sVar5);
            objQ = rVar.Q();
            if (zH) {
                objQ = new b(sVar5, 2);
                rVar.l0(objQ);
            } else {
                objQ = new b(sVar5, 2);
                rVar.l0(objQ);
            }
            l lVar5 = (l) objQ;
            zH2 = rVar.h(sVar5);
            objQ2 = rVar.Q();
            if (zH2) {
                objQ2 = new b(sVar5, 3);
                rVar.l0(objQ2);
            } else {
                objQ2 = new b(sVar5, 3);
                rVar.l0(objQ2);
            }
            l lVar6 = (l) objQ2;
            zH3 = rVar.h(sVar5);
            objQ3 = rVar.Q();
            if (zH3) {
                objQ3 = new androidx.room.coroutines.d(sVar5, 16);
                rVar.l0(objQ3);
            } else {
                objQ3 = new androidx.room.coroutines.d(sVar5, 16);
                rVar.l0(objQ3);
            }
            androidx.compose.runtime.f fVar4 = fVar;
            s sVar7 = sVar5;
            c(gamePlatform, list, list2, str, str2, zBooleanValue, lVar4, lVar5, lVar6, (kotlin.jvm.functions.a) objQ3, null, rVar, 0);
            if (((Boolean) y0Var2.getValue()).booleanValue()) {
                rVar.b0(-439408175);
                if (((List) y0VarG11.getValue()).isEmpty()) {
                    rVar.b0(-439397139);
                    q0 q0VarD2 = androidx.compose.foundation.layout.p.d(androidx.compose.ui.c.B, false);
                    int iHashCode3 = Long.hashCode(rVar.T);
                    androidx.compose.runtime.internal.j jVarL3 = rVar.l();
                    androidx.compose.ui.r rVarC3 = androidx.compose.ui.a.c(rVar, a0Var);
                    rVar.e0();
                    if (rVar.S) {
                        rVar.k(yVar);
                    } else {
                        rVar.o0();
                    }
                    androidx.compose.runtime.s.x(rVar, q0VarD2, eVar);
                    androidx.compose.runtime.s.x(rVar, jVarL3, eVar2);
                    androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode3, rVar, eVar3, rVar, dVar);
                    androidx.compose.runtime.s.x(rVar, rVarC3, eVar4);
                    z4 = false;
                    p3.b("No favourites yet. Add games from their detail page!", null, ((n0) rVar.j(u2Var2)).s, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar.j(u2Var)).k, rVar, 6, 0, 131066);
                    z = true;
                    rVar.p(true);
                    rVar.p(false);
                    rVar2 = rVar;
                } else {
                    z4 = false;
                    z = true;
                    rVar.b0(-438816230);
                    androidx.compose.foundation.lazy.grid.a aVar3 = new androidx.compose.foundation.lazy.grid.a(((com.app.mlounge.ui.theme.a) rVar.j(com.app.mlounge.ui.theme.f.a)).y);
                    float f5 = 12;
                    androidx.compose.foundation.layout.m0 m0Var4 = new androidx.compose.foundation.layout.m0(f5, f5, f5, f5);
                    androidx.compose.foundation.layout.f fVarG5 = androidx.compose.foundation.layout.h.g(f2);
                    androidx.compose.foundation.layout.f fVarG6 = androidx.compose.foundation.layout.h.g(f2);
                    boolean zF5 = rVar.f(y0VarG11);
                    if ((i4 & 14) == 4) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    z6 = zF5 | z5;
                    objQ5 = rVar.Q();
                    if (z6) {
                        objQ5 = new androidx.datastore.core.t0(13, y0VarG11, pVar);
                        rVar.l0(objQ5);
                    } else {
                        objQ5 = new androidx.datastore.core.t0(13, y0VarG11, pVar);
                        rVar.l0(objQ5);
                    }
                    com.google.android.gms.dynamite.g.a(aVar3, a0Var, null, m0Var4, fVarG6, fVarG5, null, false, null, (l) objQ5, rVar, 1772592, 916);
                    rVar2 = rVar;
                    rVar2.p(false);
                }
                rVar2.p(z4);
            } else {
                rVar2 = rVar;
                z = true;
                if (((Boolean) y0VarG2.getValue()).booleanValue()) {
                    if (((String) y0VarG4.getValue()) == null) {
                    }
                    rVar2.b0(-437443240);
                    androidx.compose.foundation.lazy.grid.a aVar4 = new androidx.compose.foundation.lazy.grid.a(((com.app.mlounge.ui.theme.a) rVar2.j(com.app.mlounge.ui.theme.f.a)).y);
                    float f6 = 12;
                    androidx.compose.foundation.layout.m0 m0Var5 = new androidx.compose.foundation.layout.m0(f6, f6, f6, f6);
                    androidx.compose.foundation.layout.f fVarG7 = androidx.compose.foundation.layout.h.g(f2);
                    androidx.compose.foundation.layout.f fVarG8 = androidx.compose.foundation.layout.h.g(f2);
                    boolean zF6 = rVar2.f(y0Var3);
                    if ((i4 & 14) == 4) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    zF = zF6 | z2 | rVar2.f(y0VarG5) | rVar2.f(y0VarG3);
                    objQ4 = rVar2.Q();
                    if (zF) {
                        z3 = false;
                        i0 i0Var2 = new i0((Object) y0Var3, (Object) pVar, y0VarG5, y0VarG3, 8);
                        rVar2.l0(i0Var2);
                        objQ4 = i0Var2;
                    } else {
                        z3 = false;
                        i0 i0Var3 = new i0((Object) y0Var3, (Object) pVar, y0VarG5, y0VarG3, 8);
                        rVar2.l0(i0Var3);
                        objQ4 = i0Var3;
                    }
                    com.google.android.gms.dynamite.g.a(aVar4, a0Var, xVarA, m0Var5, fVarG8, fVarG7, null, false, null, (l) objQ4, rVar, 1772592, 912);
                    rVar2 = rVar;
                    rVar2.p(z3);
                } else {
                    if (((String) y0VarG4.getValue()) == null) {
                    }
                    rVar2.b0(-437443240);
                    androidx.compose.foundation.lazy.grid.a aVar5 = new androidx.compose.foundation.lazy.grid.a(((com.app.mlounge.ui.theme.a) rVar2.j(com.app.mlounge.ui.theme.f.a)).y);
                    float f7 = 12;
                    androidx.compose.foundation.layout.m0 m0Var6 = new androidx.compose.foundation.layout.m0(f7, f7, f7, f7);
                    androidx.compose.foundation.layout.f fVarG9 = androidx.compose.foundation.layout.h.g(f2);
                    androidx.compose.foundation.layout.f fVarG10 = androidx.compose.foundation.layout.h.g(f2);
                    boolean zF7 = rVar2.f(y0Var3);
                    if ((i4 & 14) == 4) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    zF = zF7 | z2 | rVar2.f(y0VarG5) | rVar2.f(y0VarG3);
                    objQ4 = rVar2.Q();
                    if (zF) {
                        z3 = false;
                        i0 i0Var4 = new i0((Object) y0Var3, (Object) pVar, y0VarG5, y0VarG3, 8);
                        rVar2.l0(i0Var4);
                        objQ4 = i0Var4;
                    } else {
                        z3 = false;
                        i0 i0Var5 = new i0((Object) y0Var3, (Object) pVar, y0VarG5, y0VarG3, 8);
                        rVar2.l0(i0Var5);
                        objQ4 = i0Var5;
                    }
                    com.google.android.gms.dynamite.g.a(aVar5, a0Var, xVarA, m0Var6, fVarG10, fVarG9, null, false, null, (l) objQ4, rVar, 1772592, 912);
                    rVar2 = rVar;
                    rVar2.p(z3);
                }
                rVar2.p(z);
                sVar2 = sVar7;
            }
            i = i;
            z = z;
            rVar2.p(z);
            sVar2 = sVar7;
        } else {
            rVar2 = rVar;
            i = i;
            rVar2.W();
            sVar2 = sVar;
        }
        q1 q1VarT = rVar2.t();
        if (q1VarT != null) {
            q1VarT.d = new androidx.compose.foundation.contextmenu.f(pVar, sVar2, i, 18);
        }
    }

    public static final void e(String str, String str2, r rVar, int i) {
        String str3 = str2;
        r rVar2 = rVar;
        rVar2.c0(-366913024);
        int i2 = i | (rVar2.f(str3) ? 32 : 16);
        if (rVar2.T(i2 & 1, (i2 & 19) != 18)) {
            androidx.compose.ui.r rVarQ = androidx.compose.foundation.layout.b.q(o.b, 0.0f, 2, 1);
            t0 t0VarA = r0.a(androidx.compose.foundation.layout.h.g(4), androidx.compose.ui.c.G, rVar2, 6);
            int iHashCode = Long.hashCode(rVar2.T);
            androidx.compose.runtime.internal.j jVarL = rVar2.l();
            androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(rVar2, rVarQ);
            g.b.getClass();
            y yVar = androidx.compose.ui.node.f.b;
            rVar2.e0();
            if (rVar2.S) {
                rVar2.k(yVar);
            } else {
                rVar2.o0();
            }
            androidx.compose.runtime.s.x(rVar2, t0VarA, androidx.compose.ui.node.f.e);
            androidx.compose.runtime.s.x(rVar2, jVarL, androidx.compose.ui.node.f.d);
            androidx.compose.runtime.s.p(rVar2, Integer.valueOf(iHashCode), androidx.compose.ui.node.f.f);
            androidx.compose.runtime.s.t(rVar2, androidx.compose.ui.node.f.g);
            androidx.compose.runtime.s.x(rVar2, rVarC, androidx.compose.ui.node.f.c);
            u2 u2Var = u3.a;
            p3.b(str, null, com.app.mlounge.ui.theme.b.n, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar2.j(u2Var)).l, rVar2, 390, 0, 131066);
            str3 = str2;
            p3.b(str3, null, com.app.mlounge.ui.theme.b.l, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar2.j(u2Var)).l, rVar, ((i2 >> 3) & 14) | 384, 0, 131066);
            rVar2 = rVar;
            rVar2.p(true);
        } else {
            rVar2.W();
        }
        q1 q1VarT = rVar2.t();
        if (q1VarT != null) {
            q1VarT.d = new com.app.mlounge.ui.components.m0(str, str3, i);
        }
    }
}
