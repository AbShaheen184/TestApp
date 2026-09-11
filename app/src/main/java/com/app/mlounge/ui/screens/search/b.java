package com.app.mlounge.ui.screens.search;

import androidx.compose.foundation.gestures.h2;
import androidx.compose.foundation.interaction.k;
import androidx.compose.foundation.layout.r0;
import androidx.compose.foundation.layout.t;
import androidx.compose.foundation.layout.t0;
import androidx.compose.foundation.layout.v;
import androidx.compose.foundation.lazy.grid.x;
import androidx.compose.foundation.lazy.grid.z;
import androidx.compose.foundation.text.c0;
import androidx.compose.foundation.text.p0;
import androidx.compose.foundation.text.q0;
import androidx.compose.material3.c2;
import androidx.compose.material3.f3;
import androidx.compose.material3.k3;
import androidx.compose.material3.n0;
import androidx.compose.material3.o0;
import androidx.compose.material3.p3;
import androidx.compose.material3.t3;
import androidx.compose.material3.u3;
import androidx.compose.material3.w1;
import androidx.compose.runtime.j0;
import androidx.compose.runtime.m;
import androidx.compose.runtime.q1;
import androidx.compose.runtime.r;
import androidx.compose.runtime.s;
import androidx.compose.ui.o;
import androidx.compose.ui.platform.k2;
import androidx.compose.ui.platform.l1;
import androidx.compose.ui.text.m0;
import androidx.datastore.preferences.protobuf.h1;
import androidx.lifecycle.w0;
import com.app.mlounge.emulator.LibretroCore;
import com.app.mlounge.ui.components.b0;
import com.app.mlounge.ui.components.w;
import com.app.mlounge.ui.screens.anime.n;
import com.app.mlounge.ui.viewmodel.y0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.l;
import kotlin.jvm.functions.p;
import kotlin.jvm.functions.q;
import kotlin.jvm.internal.a0;
import kotlin.y;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import org.mozilla.javascript.Parser;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static final androidx.compose.runtime.internal.f a = new androidx.compose.runtime.internal.f(1777120365, false, new n(29));
    public static final androidx.compose.runtime.internal.f b = new androidx.compose.runtime.internal.f(1933362543, false, new a(0));
    public static final androidx.compose.runtime.internal.f c = new androidx.compose.runtime.internal.f(42387881, false, new a(1));
    public static final androidx.compose.runtime.internal.f d = new androidx.compose.runtime.internal.f(2060991508, false, new androidx.compose.foundation.contextmenu.b(19));

    /* JADX WARN: Code duplicated, block: B:100:0x03f0  */
    /* JADX WARN: Code duplicated, block: B:103:0x047b  */
    /* JADX WARN: Code duplicated, block: B:106:0x04bd  */
    /* JADX WARN: Code duplicated, block: B:108:0x04c5  */
    /* JADX WARN: Code duplicated, block: B:112:0x04ef  */
    /* JADX WARN: Code duplicated, block: B:114:0x04f7  */
    /* JADX WARN: Code duplicated, block: B:116:0x0501  */
    /* JADX WARN: Code duplicated, block: B:119:0x0521  */
    /* JADX WARN: Code duplicated, block: B:121:0x0528  */
    /* JADX WARN: Code duplicated, block: B:127:0x0549  */
    /* JADX WARN: Code duplicated, block: B:130:0x056e  */
    /* JADX WARN: Code duplicated, block: B:131:0x0578  */
    /* JADX WARN: Code duplicated, block: B:165:0x0782  */
    /* JADX WARN: Code duplicated, block: B:168:0x07a1  */
    /* JADX WARN: Code duplicated, block: B:170:0x07ec  */
    /* JADX WARN: Code duplicated, block: B:171:0x07f0  */
    /* JADX WARN: Code duplicated, block: B:175:0x0820  */
    /* JADX WARN: Code duplicated, block: B:177:0x082e  */
    /* JADX WARN: Code duplicated, block: B:180:0x084f  */
    /* JADX WARN: Code duplicated, block: B:181:0x0852  */
    /* JADX WARN: Code duplicated, block: B:187:0x0873  */
    /* JADX WARN: Code duplicated, block: B:190:0x08a2  */
    /* JADX WARN: Code duplicated, block: B:192:0x08ad  */
    /* JADX WARN: Code duplicated, block: B:195:0x08fe  */
    /* JADX WARN: Code duplicated, block: B:198:0x091b  */
    /* JADX WARN: Code duplicated, block: B:200:0x0949  */
    /* JADX WARN: Code duplicated, block: B:201:0x094d  */
    /* JADX WARN: Code duplicated, block: B:204:0x09a8  */
    /* JADX WARN: Code duplicated, block: B:206:0x09c7  */
    /* JADX WARN: Code duplicated, block: B:208:0x09df  */
    /* JADX WARN: Code duplicated, block: B:210:0x09f3  */
    /* JADX WARN: Code duplicated, block: B:212:0x0a12  */
    /* JADX WARN: Code duplicated, block: B:214:0x0a24  */
    /* JADX WARN: Code duplicated, block: B:215:0x0a26  */
    /* JADX WARN: Code duplicated, block: B:218:0x0a2e  */
    /* JADX WARN: Code duplicated, block: B:219:0x0a30  */
    /* JADX WARN: Code duplicated, block: B:222:0x0a38  */
    /* JADX WARN: Code duplicated, block: B:223:0x0a3a  */
    /* JADX WARN: Code duplicated, block: B:226:0x0a42  */
    /* JADX WARN: Code duplicated, block: B:227:0x0a44  */
    /* JADX WARN: Code duplicated, block: B:230:0x0a51  */
    /* JADX WARN: Code duplicated, block: B:232:0x0a54  */
    /* JADX WARN: Code duplicated, block: B:234:0x0a57  */
    /* JADX WARN: Code duplicated, block: B:235:0x0a5e  */
    /* JADX WARN: Code duplicated, block: B:236:0x0a65  */
    /* JADX WARN: Code duplicated, block: B:237:0x0a6c  */
    /* JADX WARN: Code duplicated, block: B:240:0x0a7a  */
    /* JADX WARN: Code duplicated, block: B:241:0x0a7c  */
    /* JADX WARN: Code duplicated, block: B:244:0x0a84  */
    /* JADX WARN: Code duplicated, block: B:245:0x0a86  */
    /* JADX WARN: Code duplicated, block: B:251:0x0a9c  */
    /* JADX WARN: Code duplicated, block: B:254:0x0aef  */
    /* JADX WARN: Code duplicated, block: B:255:0x0af1  */
    /* JADX WARN: Code duplicated, block: B:258:0x0b08  */
    /* JADX WARN: Code duplicated, block: B:259:0x0b0a  */
    /* JADX WARN: Code duplicated, block: B:262:0x0b24  */
    /* JADX WARN: Code duplicated, block: B:263:0x0b26  */
    /* JADX WARN: Code duplicated, block: B:266:0x0b36  */
    /* JADX WARN: Code duplicated, block: B:267:0x0b38  */
    /* JADX WARN: Code duplicated, block: B:270:0x0b51  */
    /* JADX WARN: Code duplicated, block: B:271:0x0b53  */
    /* JADX WARN: Code duplicated, block: B:274:0x0b6f  */
    /* JADX WARN: Code duplicated, block: B:275:0x0b71  */
    /* JADX WARN: Code duplicated, block: B:278:0x0b8b  */
    /* JADX WARN: Code duplicated, block: B:279:0x0b8d  */
    /* JADX WARN: Code duplicated, block: B:282:0x0b97  */
    /* JADX WARN: Code duplicated, block: B:283:0x0b9a  */
    /* JADX WARN: Code duplicated, block: B:287:0x0bad  */
    /* JADX WARN: Code duplicated, block: B:298:0x05d0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:299:0x05ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:304:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:305:? A[RETURN, SYNTHETIC] */
    public static final void a(final l lVar, final l lVar2, final l lVar3, final p pVar, final q qVar, final l lVar4, final l lVar5, final l lVar6, y0 y0Var, r rVar, int i) {
        y0 y0Var2;
        int i2;
        y0 y0Var3;
        int i3;
        kotlin.coroutines.d dVar;
        char c2;
        Object obj;
        androidx.compose.runtime.y0 y0Var4;
        boolean z;
        Object objQ;
        Object obj2;
        y0 y0Var5;
        Collection collectionQ;
        o oVar;
        float f;
        float f2;
        androidx.compose.ui.i iVar;
        Iterator it;
        int i4;
        androidx.compose.runtime.y0 y0Var6;
        float f3;
        float f4;
        androidx.compose.ui.i iVar2;
        y0 y0Var7;
        Object obj3;
        o oVar2;
        y0 y0Var8;
        float f5;
        androidx.compose.ui.i iVar3;
        float f6;
        Object obj4;
        int i5;
        char c3;
        o oVar3;
        y0 y0Var9;
        Object obj5;
        boolean z2;
        final y0 y0Var10;
        final boolean z3;
        final boolean z4;
        final boolean z5;
        final boolean z6;
        int iIntValue;
        boolean z7;
        List list;
        boolean z8;
        boolean z9;
        final boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        final List list2;
        boolean z14;
        boolean z15;
        final boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean zF;
        Object objQ2;
        y0 y0Var11;
        q1 q1VarT;
        kotlin.jvm.functions.a aVarB;
        q1 q1VarT2;
        o oVar4;
        kotlin.jvm.functions.a aVar;
        Iterator it2;
        String str;
        Object objQ3;
        Object obj6;
        androidx.compose.runtime.y0 y0VarG;
        long j;
        y0 y0Var12;
        boolean zH;
        Object objQ4;
        char c4;
        char c5;
        long jB;
        char c6;
        long jB2;
        Object next;
        int i6;
        Object objQ5;
        Object obj7;
        androidx.compose.runtime.y0 y0VarG2;
        long j2;
        y0 y0Var13;
        boolean zH2;
        Object objQ6;
        int i7;
        long jB3;
        androidx.compose.ui.i iVar4 = androidx.compose.ui.c.H;
        lVar.getClass();
        lVar2.getClass();
        lVar3.getClass();
        pVar.getClass();
        qVar.getClass();
        rVar.c0(134865149);
        int i8 = rVar.S ? -rVar.I.v : rVar.G.i;
        int i9 = i | (rVar.h(lVar) ? 4 : 2) | (rVar.h(lVar2) ? 32 : 16) | (rVar.h(lVar3) ? LibretroCore.SCREEN_WIDTH : 128) | (rVar.h(pVar) ? 2048 : LockFreeTaskQueueCore.MIN_ADD_SPIN_CAPACITY) | (rVar.h(qVar) ? 16384 : 8192) | (rVar.h(lVar4) ? 131072 : Parser.ARGC_LIMIT) | (rVar.h(lVar5) ? 1048576 : 524288) | (rVar.h(lVar6) ? 8388608 : 4194304) | 33554432;
        if (rVar.T(i9 & 1, (i9 & 38347923) != 38347922)) {
            rVar.Y();
            if ((i & 1) == 0 || rVar.C()) {
                w0 w0VarA = androidx.lifecycle.viewmodel.compose.a.a(rVar);
                if (w0VarA == null) {
                    net.luminis.tls.engine.impl.c.r("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    i2 = i9 & (-234881025);
                    y0Var3 = (y0) h1.B(a0.a(y0.class), w0VarA, androidx.room.r.i(w0VarA, rVar), w0VarA instanceof androidx.lifecycle.j ? ((androidx.lifecycle.j) w0VarA).getDefaultViewModelCreationExtras() : androidx.lifecycle.viewmodel.a.b, rVar);
                }
            } else {
                rVar.W();
                i2 = i9 & (-234881025);
                y0Var3 = y0Var;
            }
            int i10 = i2;
            rVar.q();
            androidx.compose.runtime.y0 y0VarG3 = s.g(y0Var3.i, rVar);
            final androidx.compose.runtime.y0 y0VarG4 = s.g(y0Var3.k, rVar);
            final androidx.compose.runtime.y0 y0VarG5 = s.g(y0Var3.m, rVar);
            final androidx.compose.runtime.y0 y0VarG6 = s.g(y0Var3.o, rVar);
            final androidx.compose.runtime.y0 y0VarG7 = s.g(y0Var3.q, rVar);
            final androidx.compose.runtime.y0 y0VarG8 = s.g(y0Var3.s, rVar);
            final androidx.compose.runtime.y0 y0VarG9 = s.g(y0Var3.u, rVar);
            androidx.compose.runtime.y0 y0VarG10 = s.g(y0Var3.w, rVar);
            androidx.compose.runtime.y0 y0VarG11 = s.g(y0Var3.y, rVar);
            androidx.compose.runtime.y0 y0VarG12 = s.g(y0Var3.A, rVar);
            androidx.compose.runtime.y0 y0VarG13 = s.g(y0Var3.E, rVar);
            final androidx.compose.runtime.y0 y0VarG14 = s.g(y0Var3.G, rVar);
            androidx.compose.runtime.y0 y0VarG15 = s.g(y0Var3.I, rVar);
            final androidx.compose.runtime.y0 y0VarG16 = s.g(y0Var3.K, rVar);
            androidx.compose.runtime.y0 y0VarG17 = s.g(y0Var3.M, rVar);
            androidx.compose.runtime.y0 y0VarG18 = s.g(y0Var3.O, rVar);
            androidx.compose.runtime.y0 y0VarG19 = s.g(y0Var3.C, rVar);
            Flow flow = y0Var3.P;
            Boolean bool = Boolean.FALSE;
            androidx.compose.runtime.y0 y0Var14 = y0VarG18;
            androidx.compose.runtime.y0 y0Var15 = y0VarG15;
            androidx.compose.runtime.y0 y0VarF = s.f(flow, bool, null, rVar, 48, 2);
            x xVarA = z.a(0, 0, rVar, 3);
            boolean zF2 = rVar.f(xVarA) | rVar.h(y0Var3);
            Object objQ7 = rVar.Q();
            Object obj8 = m.a;
            if (zF2 || objQ7 == obj8) {
                objQ7 = new androidx.room.coroutines.f(xVarA, y0Var3, null, 15);
                rVar.l0(objQ7);
            }
            j0.c(rVar, xVarA, (p) objQ7);
            androidx.compose.foundation.layout.a0 a0Var = androidx.compose.foundation.layout.w0.c;
            v vVarA = t.a(androidx.compose.foundation.layout.h.c, androidx.compose.ui.c.J, rVar, 0);
            int iHashCode = Long.hashCode(rVar.T);
            androidx.compose.runtime.internal.j jVarL = rVar.l();
            androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(rVar, a0Var);
            androidx.compose.ui.node.g.b.getClass();
            kotlin.jvm.functions.a aVar2 = androidx.compose.ui.node.f.b;
            rVar.e0();
            if (rVar.S) {
                rVar.k(aVar2);
            } else {
                rVar.o0();
            }
            androidx.compose.ui.node.e eVar = androidx.compose.ui.node.f.e;
            s.x(rVar, vVarA, eVar);
            androidx.compose.ui.node.e eVar2 = androidx.compose.ui.node.f.d;
            s.x(rVar, jVarL, eVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            androidx.compose.ui.node.e eVar3 = androidx.compose.ui.node.f.f;
            s.p(rVar, numValueOf, eVar3);
            androidx.compose.ui.node.d dVar2 = androidx.compose.ui.node.f.g;
            s.t(rVar, dVar2);
            androidx.compose.ui.node.e eVar4 = androidx.compose.ui.node.f.c;
            s.x(rVar, rVarC, eVar4);
            rVar.b0(-249685460);
            m0 m0Var = ((t3) rVar.j(u3.a)).e;
            long j3 = ((n0) rVar.j(o0.a)).o;
            float f7 = 16;
            float f8 = 4;
            o oVar5 = o.b;
            y0 y0Var16 = y0Var3;
            p3.b("Search", androidx.compose.foundation.layout.b.s(oVar5, f7, f7, 0.0f, f8, 4), j3, 0L, null, 0L, null, 0L, 0, false, 0, 0, m0Var, rVar, 54, 0, 131064);
            Object objQ8 = rVar.Q();
            if (objQ8 == obj8) {
                objQ8 = s.r(bool);
                rVar.l0(objQ8);
            }
            androidx.compose.runtime.y0 y0Var17 = (androidx.compose.runtime.y0) objQ8;
            k2 k2Var = (k2) rVar.j(l1.p);
            Object objQ9 = rVar.Q();
            if (objQ9 == obj8) {
                objQ9 = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar);
            }
            k kVar = (k) objQ9;
            androidx.compose.ui.focus.l lVar7 = (androidx.compose.ui.focus.l) rVar.j(l1.i);
            Boolean boolValueOf = Boolean.valueOf(((Boolean) y0Var17.getValue()).booleanValue());
            boolean zF3 = rVar.f(k2Var);
            Object objQ10 = rVar.Q();
            if (zF3 || objQ10 == obj8) {
                i3 = 2;
                dVar = null;
                objQ10 = new w(k2Var, y0Var17, null, 2);
                rVar.l0(objQ10);
            } else {
                i3 = 2;
                dVar = null;
            }
            j0.c(rVar, boolValueOf, (p) objQ10);
            Object objQ11 = rVar.Q();
            if (objQ11 == obj8) {
                c2 = 3;
                objQ11 = new androidx.compose.foundation.interaction.g(kVar, y0Var17, dVar, 3);
                rVar.l0(objQ11);
            } else {
                c2 = 3;
            }
            j0.c(rVar, kVar, (p) objQ11);
            String str2 = (String) y0VarG3.getValue();
            boolean zH3 = rVar.h(y0Var16);
            Object objQ12 = rVar.Q();
            if (zH3 || objQ12 == obj8) {
                objQ12 = new androidx.compose.foundation.c(1, y0Var16, y0.class, "setQuery", "setQuery(Ljava/lang/String;)V", 0, 14);
                rVar.l0(objQ12);
            }
            kotlin.reflect.e eVar5 = (kotlin.reflect.e) objQ12;
            boolean z20 = !((Boolean) y0Var17.getValue()).booleanValue();
            q0 q0Var = new q0(0, Token.INC);
            Object objQ13 = rVar.Q();
            if (objQ13 == obj8) {
                objQ13 = new com.app.mlounge.ui.screens.player.j0(i3);
                rVar.l0(objQ13);
            }
            p0 p0Var = new p0(47, (l) objQ13);
            w1 w1Var = w1.a;
            long j4 = com.app.mlounge.ui.theme.b.f;
            long j5 = com.app.mlounge.ui.theme.b.e;
            long j6 = com.app.mlounge.ui.theme.b.l;
            k3 k3VarC = w1.c(j6, j6, j4, j4, j5, 0L, 0L, rVar, 2147477244);
            androidx.compose.ui.r rVarP = androidx.compose.foundation.layout.b.p(androidx.compose.foundation.layout.w0.d(oVar5, 1.0f), f7, f8);
            boolean zF4 = rVar.f(k2Var) | rVar.h(lVar7);
            Object objQ14 = rVar.Q();
            if (!zF4) {
                if (objQ14 != obj) {
                    obj = obj8;
                    y0Var4 = y0Var17;
                    z = false;
                }
                androidx.compose.ui.r rVarE = androidx.compose.ui.input.key.c.e(rVarP, (l) objQ14);
                objQ = rVar.Q();
                if (objQ == obj) {
                    objQ = new h2(y0Var4, 11);
                    rVar.l0(objQ);
                }
                obj2 = obj;
                y0Var5 = y0Var16;
                c2.a(str2, (l) eVar5, androidx.compose.ui.focus.d.t(rVarE, (l) objQ), false, z20, null, a, null, b, androidx.compose.runtime.internal.k.c(2011483632, new androidx.compose.foundation.contextmenu.f(23, y0Var16, y0VarG3), rVar), null, q0Var, p0Var, true, 0, 0, kVar, null, k3VarC, rVar, 907542528, 12779520, 6, 2915496);
                collectionQ = com.google.common.base.c.q("Movies", "TV Shows", "Anime", "Games", "Live TV", "Music");
                if (((Boolean) y0VarF.getValue()).booleanValue()) {
                    collectionQ = kotlin.collections.o.W(collectionQ, "Adult");
                }
                oVar = oVar5;
                f = 12;
                f2 = 8;
                androidx.compose.ui.r rVarP2 = androidx.compose.foundation.layout.b.p(androidx.compose.foundation.s.p(androidx.compose.foundation.layout.w0.d(oVar, 1.0f), androidx.compose.foundation.s.o(rVar), false), f, f2);
                iVar = iVar4;
                t0 t0VarA = r0.a(androidx.compose.foundation.layout.h.g(f2), iVar, rVar, 54);
                int iHashCode2 = Long.hashCode(rVar.T);
                androidx.compose.runtime.internal.j jVarL2 = rVar.l();
                androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(rVar, rVarP2);
                rVar.e0();
                if (rVar.S) {
                    rVar.k(aVar2);
                } else {
                    rVar.o0();
                }
                s.x(rVar, t0VarA, eVar);
                s.x(rVar, jVarL2, eVar2);
                androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode2, rVar, eVar3, rVar, dVar2);
                s.x(rVar, rVarC2, eVar4);
                rVar.b0(1881746978);
                it = collectionQ.iterator();
                i4 = 0;
                while (true) {
                    int i11 = 6;
                    if (it.hasNext()) {
                        y0Var6 = y0Var15;
                        f3 = f;
                        f4 = f2;
                        iVar2 = iVar;
                        y0Var7 = y0Var5;
                        obj3 = obj2;
                        boolean z21 = true;
                        rVar.p(false);
                        rVar.p(true);
                        if (((Boolean) y0VarF.getValue()).booleanValue() || b(y0Var6) != 6) {
                            oVar2 = oVar;
                            y0Var8 = y0Var7;
                            f5 = f8;
                            iVar3 = iVar2;
                            f6 = f3;
                            obj4 = obj3;
                            i5 = 54;
                            rVar.b0(-242489989);
                            rVar.p(false);
                        } else {
                            rVar.b0(-244315889);
                            List listQ = com.google.common.base.c.q(new kotlin.k(com.app.mlounge.data.repository.a.e, "XVideos"), new kotlin.k(com.app.mlounge.data.repository.a.y, "EPorner"));
                            float f9 = f8;
                            float f10 = f3;
                            androidx.compose.ui.r rVarP3 = androidx.compose.foundation.layout.b.p(androidx.compose.foundation.s.p(androidx.compose.foundation.layout.w0.d(oVar, 1.0f), androidx.compose.foundation.s.o(rVar), false), f10, f9);
                            androidx.compose.ui.i iVar5 = iVar2;
                            t0 t0VarA2 = r0.a(androidx.compose.foundation.layout.h.g(f4), iVar5, rVar, 54);
                            int iHashCode3 = Long.hashCode(rVar.T);
                            androidx.compose.runtime.internal.j jVarL3 = rVar.l();
                            androidx.compose.ui.r rVarC3 = androidx.compose.ui.a.c(rVar, rVarP3);
                            androidx.compose.ui.node.g.b.getClass();
                            kotlin.jvm.functions.a aVar3 = androidx.compose.ui.node.f.b;
                            rVar.e0();
                            if (rVar.S) {
                                rVar.k(aVar3);
                            } else {
                                rVar.o0();
                            }
                            s.x(rVar, t0VarA2, androidx.compose.ui.node.f.e);
                            s.x(rVar, jVarL3, androidx.compose.ui.node.f.d);
                            s.p(rVar, Integer.valueOf(iHashCode3), androidx.compose.ui.node.f.f);
                            s.t(rVar, androidx.compose.ui.node.f.g);
                            s.x(rVar, rVarC3, androidx.compose.ui.node.f.c);
                            rVar.b0(-579403207);
                            for (Iterator it3 = listQ.iterator(); it3.hasNext(); it3 = it3) {
                                kotlin.k kVar2 = (kotlin.k) it3.next();
                                com.app.mlounge.data.repository.a aVar4 = (com.app.mlounge.data.repository.a) kVar2.e;
                                String str3 = (String) kVar2.y;
                                Object objQ15 = rVar.Q();
                                Object obj9 = obj3;
                                if (objQ15 == obj9) {
                                    objQ15 = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar);
                                }
                                k kVar3 = (k) objQ15;
                                o oVar6 = oVar;
                                androidx.compose.ui.r rVarG = androidx.compose.foundation.s.g(androidx.compose.ui.draw.h.a(oVar, androidx.compose.foundation.shape.e.a(f4)), 2, ((Boolean) android.support.v4.media.session.b.g(kVar3, rVar, i11).getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : androidx.compose.ui.graphics.t.h, androidx.compose.foundation.shape.e.a(f4));
                                boolean zH4 = rVar.h(y0Var7) | rVar.d(aVar4.ordinal());
                                Object objQ16 = rVar.Q();
                                if (zH4 || objQ16 == obj9) {
                                    objQ16 = new com.app.mlounge.ui.screens.movies.g(9, y0Var7, aVar4);
                                    rVar.l0(objQ16);
                                }
                                androidx.compose.ui.r rVarM = androidx.compose.foundation.s.m(androidx.compose.foundation.s.i(rVarG, kVar3, null, false, null, (kotlin.jvm.functions.a) objQ16, 28), kVar3, 1);
                                if (((com.app.mlounge.data.repository.a) y0Var14.getValue()) == aVar4) {
                                    c6 = 52429;
                                    jB2 = androidx.compose.ui.graphics.t.b(0.2f, com.app.mlounge.ui.theme.b.f);
                                } else {
                                    c6 = 52429;
                                    jB2 = com.app.mlounge.ui.theme.b.d;
                                }
                                androidx.compose.runtime.y0 y0Var18 = y0Var14;
                                f3.a(rVarM, androidx.compose.foundation.shape.e.a(f4), jB2, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(1474502154, new androidx.compose.foundation.gestures.w1(12, aVar4, str3, y0Var18), rVar), rVar, 12582912, 120);
                                iVar5 = iVar5;
                                f9 = f9;
                                f10 = f10;
                                y0Var14 = y0Var18;
                                oVar = oVar6;
                                y0Var7 = y0Var7;
                                obj3 = obj9;
                                i11 = 6;
                                z21 = true;
                            }
                            f6 = f10;
                            boolean z22 = z21;
                            oVar2 = oVar;
                            y0Var8 = y0Var7;
                            obj4 = obj3;
                            i5 = 54;
                            f5 = f9;
                            iVar3 = iVar5;
                            androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.u(rVar, false, z22, false);
                        }
                        c3 = 5;
                        if (b(y0Var6) == 5) {
                            rVar.b0(-242368438);
                            List listQ2 = com.google.common.base.c.q("MusicMp3", "YouTube Music");
                            oVar4 = oVar2;
                            androidx.compose.ui.r rVarP4 = androidx.compose.foundation.layout.b.p(androidx.compose.foundation.s.p(androidx.compose.foundation.layout.w0.d(oVar4, 1.0f), androidx.compose.foundation.s.o(rVar), false), f6, f5);
                            t0 t0VarA3 = r0.a(androidx.compose.foundation.layout.h.g(f4), iVar3, rVar, i5);
                            int iHashCode4 = Long.hashCode(rVar.T);
                            androidx.compose.runtime.internal.j jVarL4 = rVar.l();
                            androidx.compose.ui.r rVarC4 = androidx.compose.ui.a.c(rVar, rVarP4);
                            androidx.compose.ui.node.g.b.getClass();
                            aVar = androidx.compose.ui.node.f.b;
                            rVar.e0();
                            if (rVar.S) {
                                rVar.k(aVar);
                            } else {
                                rVar.o0();
                            }
                            s.x(rVar, t0VarA3, androidx.compose.ui.node.f.e);
                            s.x(rVar, jVarL4, androidx.compose.ui.node.f.d);
                            s.p(rVar, Integer.valueOf(iHashCode4), androidx.compose.ui.node.f.f);
                            s.t(rVar, androidx.compose.ui.node.f.g);
                            s.x(rVar, rVarC4, androidx.compose.ui.node.f.c);
                            rVar.b0(-1900970340);
                            it2 = listQ2.iterator();
                            while (it2.hasNext()) {
                                str = (String) it2.next();
                                objQ3 = rVar.Q();
                                obj6 = obj4;
                                if (objQ3 == obj6) {
                                    objQ3 = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar);
                                }
                                k kVar4 = (k) objQ3;
                                y0VarG = android.support.v4.media.session.b.g(kVar4, rVar, 6);
                                androidx.compose.ui.r rVarA = androidx.compose.ui.draw.h.a(oVar4, androidx.compose.foundation.shape.e.a(f4));
                                float f11 = 2;
                                if (((Boolean) y0VarG.getValue()).booleanValue()) {
                                    j = com.app.mlounge.ui.theme.b.q;
                                } else {
                                    j = androidx.compose.ui.graphics.t.h;
                                }
                                androidx.compose.ui.r rVarG2 = androidx.compose.foundation.s.g(rVarA, f11, j, androidx.compose.foundation.shape.e.a(f4));
                                y0Var12 = y0Var8;
                                zH = rVar.h(y0Var12) | rVar.f(str);
                                objQ4 = rVar.Q();
                                if (!zH || objQ4 == obj6) {
                                    c4 = '\b';
                                    objQ4 = new com.app.mlounge.ui.screens.movies.g(8, y0Var12, str);
                                    rVar.l0(objQ4);
                                } else {
                                    c4 = '\b';
                                }
                                androidx.compose.ui.r rVarM2 = androidx.compose.foundation.s.m(androidx.compose.foundation.s.i(rVarG2, kVar4, null, false, null, (kotlin.jvm.functions.a) objQ4, 28), kVar4, 1);
                                if (kotlin.jvm.internal.l.a((String) y0VarG17.getValue(), str)) {
                                    c5 = 52429;
                                    jB = androidx.compose.ui.graphics.t.b(0.2f, com.app.mlounge.ui.theme.b.f);
                                } else {
                                    c5 = 52429;
                                    jB = com.app.mlounge.ui.theme.b.d;
                                }
                                y0Var8 = y0Var12;
                                f3.a(rVarM2, androidx.compose.foundation.shape.e.a(f4), jB, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(490656028, new com.app.mlounge.ui.screens.player.h(str, y0VarG17, 1), rVar), rVar, 12582912, 120);
                                obj4 = obj6;
                                it2 = it2;
                                oVar4 = oVar4;
                                c3 = 5;
                            }
                            oVar3 = oVar4;
                            y0Var9 = y0Var8;
                            obj5 = obj4;
                            z2 = false;
                            androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.u(rVar, false, true, false);
                        } else {
                            oVar3 = oVar2;
                            y0Var9 = y0Var8;
                            obj5 = obj4;
                            z2 = false;
                            rVar.b0(-240629989);
                            rVar.p(false);
                        }
                        if (((String) y0VarG3.getValue()).length() < 2) {
                            rVar.b0(-240379013);
                            rVar.s();
                            if (((Boolean) y0VarG13.getValue()).booleanValue()) {
                                y0Var10 = y0Var9;
                                rVar.b0(-240324453);
                                rVar.s();
                                if (b(y0Var6) == 0) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if (b(y0Var6) == 1) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                if (b(y0Var6) == 2) {
                                    z5 = true;
                                } else {
                                    z5 = false;
                                }
                                if (b(y0Var6) == 3) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                iIntValue = ((Number) y0VarG16.getValue()).intValue();
                                if (iIntValue != 0) {
                                    z7 = true;
                                    if (iIntValue != 1) {
                                        list = (List) y0VarG11.getValue();
                                    } else if (iIntValue != 2) {
                                        list = (List) y0VarG19.getValue();
                                    } else {
                                        list = (List) y0VarG12.getValue();
                                    }
                                } else {
                                    z7 = true;
                                    list = (List) y0VarG10.getValue();
                                }
                                if (b(y0Var6) == 4) {
                                    z8 = z7;
                                } else {
                                    z8 = false;
                                }
                                if (b(y0Var6) == 5) {
                                    z9 = z7;
                                } else {
                                    z9 = false;
                                }
                                if (((Boolean) y0VarF.getValue()).booleanValue() || b(y0Var6) != 6) {
                                    z10 = false;
                                } else {
                                    z10 = z7;
                                }
                                androidx.compose.foundation.lazy.grid.a aVar5 = new androidx.compose.foundation.lazy.grid.a(((com.app.mlounge.ui.theme.a) rVar.j(com.app.mlounge.ui.theme.f.a)).y);
                                androidx.compose.foundation.layout.m0 m0Var2 = new androidx.compose.foundation.layout.m0(f6, f6, f6, f6);
                                androidx.compose.foundation.layout.f fVarG = androidx.compose.foundation.layout.h.g(f4);
                                androidx.compose.foundation.layout.f fVarG2 = androidx.compose.foundation.layout.h.g(f4);
                                androidx.compose.foundation.layout.a0 a0Var2 = androidx.compose.foundation.layout.w0.c;
                                oVar3.d(a0Var2);
                                boolean zG = rVar.g(z6) | rVar.h(y0Var10) | rVar.f(y0VarG16) | rVar.g(z3) | rVar.f(y0VarG4);
                                if ((i10 & 14) == 4) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                boolean zG2 = zG | z11 | rVar.g(z4) | rVar.f(y0VarG5);
                                if ((i10 & Token.ASSIGN_MOD) == 32) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                boolean zG3 = zG2 | z12 | rVar.g(z5) | rVar.f(y0VarG6);
                                if ((i10 & 896) == 256) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                boolean zH5 = zG3 | z13 | rVar.h(list);
                                list2 = list;
                                if ((i10 & 7168) == 2048) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                boolean zG4 = zH5 | z14 | rVar.g(z8) | rVar.f(y0VarG7);
                                if ((57344 & i10) == 16384) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                boolean zG5 = zG4 | z15 | rVar.g(z10) | rVar.f(y0VarG9);
                                z16 = z8;
                                if ((i10 & 29360128) == 8388608) {
                                    z17 = true;
                                } else {
                                    z17 = false;
                                }
                                boolean zG6 = zG5 | z17 | rVar.g(z9) | rVar.f(y0VarG8);
                                if ((i10 & 458752) == 131072) {
                                    z18 = true;
                                } else {
                                    z18 = false;
                                }
                                boolean z23 = zG6 | z18;
                                if ((3670016 & i10) == 1048576) {
                                    z19 = true;
                                } else {
                                    z19 = false;
                                }
                                zF = z23 | z19 | rVar.f(y0VarG14);
                                objQ2 = rVar.Q();
                                if (!zF || objQ2 == obj5) {
                                    final boolean z24 = z9;
                                    Object obj10 = new l() { // from class: com.app.mlounge.ui.screens.search.f
                                        @Override // kotlin.jvm.functions.l
                                        public final Object invoke(Object obj11) {
                                            androidx.compose.foundation.lazy.grid.h hVar = (androidx.compose.foundation.lazy.grid.h) obj11;
                                            hVar.getClass();
                                            boolean z25 = z6;
                                            y0 y0Var19 = y0Var10;
                                            androidx.compose.runtime.y0 y0Var20 = y0VarG16;
                                            if (z25) {
                                                androidx.compose.foundation.lazy.grid.h.p(5, hVar, new androidx.compose.runtime.internal.f(-1972710186, true, new androidx.compose.foundation.contextmenu.i(8, y0Var19, y0Var20)), new com.app.mlounge.ui.screens.player.j0(1));
                                            }
                                            if (z3) {
                                                List list3 = (List) y0VarG4.getValue();
                                                hVar.q(list3.size(), new c0(20, new a(2), list3), new com.app.mlounge.ui.screens.adult.g(18, list3), new androidx.compose.runtime.internal.f(-1942245546, true, new j(list3, y0Var19, lVar, 0)));
                                            }
                                            if (z4) {
                                                List list4 = (List) y0VarG5.getValue();
                                                hVar.q(list4.size(), new c0(23, new a(3), list4), new com.app.mlounge.ui.screens.adult.g(19, list4), new androidx.compose.runtime.internal.f(-1942245546, true, new j(list4, y0Var19, lVar2, 1)));
                                            }
                                            if (z5) {
                                                List list5 = (List) y0VarG6.getValue();
                                                hVar.q(list5.size(), new c0(24, new a(4), list5), new com.app.mlounge.ui.screens.adult.g(13, list5), new androidx.compose.runtime.internal.f(-1942245546, true, new com.app.mlounge.ui.screens.adult.h(list5, lVar3, 4)));
                                            }
                                            if (z25) {
                                                a aVar6 = new a(5);
                                                List list6 = list2;
                                                hVar.q(list6.size(), new c0(18, aVar6, list6), new com.app.mlounge.ui.screens.adult.g(14, list6), new androidx.compose.runtime.internal.f(-1942245546, true, new com.app.mlounge.ui.screens.anime.m(list6, y0Var20, pVar, 3)));
                                            }
                                            if (z16) {
                                                List list7 = (List) y0VarG7.getValue();
                                                hVar.q(list7.size(), new c0(19, new a(6), list7), new com.app.mlounge.ui.screens.adult.g(15, list7), new androidx.compose.runtime.internal.f(-1942245546, true, new i(list7, qVar, 0)));
                                            }
                                            if (z10) {
                                                List list8 = (List) y0VarG9.getValue();
                                                hVar.q(list8.size(), new c0(21, new a(7), list8), new com.app.mlounge.ui.screens.adult.g(16, list8), new androidx.compose.runtime.internal.f(-1942245546, true, new com.app.mlounge.ui.screens.adult.h(list8, lVar6, 5)));
                                            }
                                            if (z24) {
                                                List list9 = (List) y0VarG8.getValue();
                                                hVar.q(list9.size(), new c0(22, new a(8), list9), new com.app.mlounge.ui.screens.adult.g(17, list9), new androidx.compose.runtime.internal.f(-1942245546, true, new com.app.mlounge.ui.screens.anime.m(list9, lVar4, lVar5, 4)));
                                            }
                                            if (((Boolean) y0VarG14.getValue()).booleanValue()) {
                                                androidx.compose.foundation.lazy.grid.h.p(7, hVar, b.d, null);
                                            }
                                            return y.a;
                                        }
                                    };
                                    y0Var11 = y0Var10;
                                    rVar.l0(obj10);
                                    objQ2 = obj10;
                                } else {
                                    y0Var11 = y0Var10;
                                }
                                com.google.android.gms.dynamite.g.a(aVar5, a0Var2, xVarA, m0Var2, fVarG2, fVarG, null, false, null, (l) objQ2, rVar, 1772592, 912);
                                rVar.s();
                                rVar.r();
                                y0Var2 = y0Var11;
                                break;
                            }
                            rVar.b0(-240353283);
                            b0.n(null, rVar, 0);
                            rVar.w(i8);
                            q1VarT = rVar.t();
                            if (q1VarT != null) {
                                q1VarT.e(new e(lVar, lVar2, lVar3, pVar, qVar, lVar4, lVar5, lVar6, y0Var9, i, 1));
                                return;
                            }
                            return;
                        }
                        rVar.b0(-240591394);
                        androidx.compose.foundation.layout.a0 a0Var3 = androidx.compose.foundation.layout.w0.c;
                        androidx.compose.ui.layout.q0 q0VarD = androidx.compose.foundation.layout.p.d(androidx.compose.ui.c.B, z2);
                        int iHashCode5 = Long.hashCode(rVar.T);
                        androidx.compose.runtime.internal.j jVarL5 = rVar.l();
                        androidx.compose.ui.r rVarC5 = androidx.compose.ui.a.c(rVar, a0Var3);
                        androidx.compose.ui.node.g.b.getClass();
                        aVarB = androidx.compose.ui.node.f.b();
                        rVar.e0();
                        if (rVar.E()) {
                            rVar.k(aVarB);
                        } else {
                            rVar.o0();
                        }
                        s.x(rVar, q0VarD, androidx.compose.ui.node.f.d());
                        s.x(rVar, jVarL5, androidx.compose.ui.node.f.f());
                        s.p(rVar, Integer.valueOf(iHashCode5), androidx.compose.ui.node.f.c());
                        s.t(rVar, androidx.compose.ui.node.f.a());
                        s.x(rVar, rVarC5, androidx.compose.ui.node.f.e());
                        p3.b("Type at least 2 characters to search", null, com.app.mlounge.ui.theme.b.c(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, rVar, 390, 0, 262138);
                        rVar.r();
                        rVar.w(i8);
                        q1VarT2 = rVar.t();
                        if (q1VarT2 != null) {
                            q1VarT2.e(new e(lVar, lVar2, lVar3, pVar, qVar, lVar4, lVar5, lVar6, y0Var9, i, 0));
                            return;
                        }
                        return;
                    }
                    next = it.next();
                    i6 = i4 + 1;
                    if (i4 >= 0) {
                        com.google.common.base.c.w();
                        throw null;
                    }
                    String str4 = (String) next;
                    objQ5 = rVar.Q();
                    obj7 = obj2;
                    if (objQ5 == obj7) {
                        objQ5 = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar);
                    }
                    k kVar5 = (k) objQ5;
                    y0VarG2 = android.support.v4.media.session.b.g(kVar5, rVar, 6);
                    androidx.compose.ui.r rVarA2 = androidx.compose.ui.draw.h.a(oVar, androidx.compose.foundation.shape.e.a(f2));
                    float f12 = 2;
                    if (((Boolean) y0VarG2.getValue()).booleanValue()) {
                        j2 = com.app.mlounge.ui.theme.b.q;
                    } else {
                        j2 = androidx.compose.ui.graphics.t.h;
                    }
                    androidx.compose.ui.i iVar6 = iVar;
                    androidx.compose.ui.r rVarG3 = androidx.compose.foundation.s.g(rVarA2, f12, j2, androidx.compose.foundation.shape.e.a(f2));
                    y0Var13 = y0Var5;
                    zH2 = rVar.h(y0Var13) | rVar.d(i4);
                    objQ6 = rVar.Q();
                    if (!zH2 || objQ6 == obj7) {
                        i7 = 1;
                        objQ6 = new d(y0Var13, i4, 1);
                        rVar.l0(objQ6);
                    } else {
                        i7 = 1;
                    }
                    androidx.compose.ui.r rVarM3 = androidx.compose.foundation.s.m(androidx.compose.foundation.s.i(rVarG3, kVar5, null, false, null, (kotlin.jvm.functions.a) objQ6, 28), kVar5, i7);
                    if (b(y0Var15) == i4) {
                        jB3 = androidx.compose.ui.graphics.t.b(0.3f, com.app.mlounge.ui.theme.b.f);
                    } else {
                        jB3 = com.app.mlounge.ui.theme.b.c;
                    }
                    androidx.compose.runtime.y0 y0Var19 = y0Var15;
                    f3.a(rVarM3, androidx.compose.foundation.shape.e.a(f2), jB3, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(1906919490, new c(i4, str4, y0Var19, 0), rVar), rVar, 12582912, 120);
                    y0Var5 = y0Var13;
                    i4 = i6;
                    f2 = f2;
                    y0Var15 = y0Var19;
                    iVar = iVar6;
                    f = f;
                    obj2 = obj7;
                }
            } else {
                obj = obj8;
            }
            obj = obj8;
            y0Var4 = y0Var17;
            z = false;
            objQ14 = new h(k2Var, lVar7, y0Var4, 0);
            rVar.l0(objQ14);
            androidx.compose.ui.r rVarE2 = androidx.compose.ui.input.key.c.e(rVarP, (l) objQ14);
            objQ = rVar.Q();
            if (objQ == obj) {
                objQ = new h2(y0Var4, 11);
                rVar.l0(objQ);
            }
            obj2 = obj;
            y0Var5 = y0Var16;
            c2.a(str2, (l) eVar5, androidx.compose.ui.focus.d.t(rVarE2, (l) objQ), false, z20, null, a, null, b, androidx.compose.runtime.internal.k.c(2011483632, new androidx.compose.foundation.contextmenu.f(23, y0Var16, y0VarG3), rVar), null, q0Var, p0Var, true, 0, 0, kVar, null, k3VarC, rVar, 907542528, 12779520, 6, 2915496);
            collectionQ = com.google.common.base.c.q("Movies", "TV Shows", "Anime", "Games", "Live TV", "Music");
            if (((Boolean) y0VarF.getValue()).booleanValue()) {
                collectionQ = kotlin.collections.o.W(collectionQ, "Adult");
            }
            oVar = oVar5;
            f = 12;
            f2 = 8;
            androidx.compose.ui.r rVarP5 = androidx.compose.foundation.layout.b.p(androidx.compose.foundation.s.p(androidx.compose.foundation.layout.w0.d(oVar, 1.0f), androidx.compose.foundation.s.o(rVar), false), f, f2);
            iVar = iVar4;
            t0 t0VarA4 = r0.a(androidx.compose.foundation.layout.h.g(f2), iVar, rVar, 54);
            int iHashCode6 = Long.hashCode(rVar.T);
            androidx.compose.runtime.internal.j jVarL6 = rVar.l();
            androidx.compose.ui.r rVarC6 = androidx.compose.ui.a.c(rVar, rVarP5);
            rVar.e0();
            if (rVar.S) {
                rVar.k(aVar2);
            } else {
                rVar.o0();
            }
            s.x(rVar, t0VarA4, eVar);
            s.x(rVar, jVarL6, eVar2);
            androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode6, rVar, eVar3, rVar, dVar2);
            s.x(rVar, rVarC6, eVar4);
            rVar.b0(1881746978);
            it = collectionQ.iterator();
            i4 = 0;
            while (true) {
                int i12 = 6;
                if (it.hasNext()) {
                    y0Var6 = y0Var15;
                    f3 = f;
                    f4 = f2;
                    iVar2 = iVar;
                    y0Var7 = y0Var5;
                    obj3 = obj2;
                    boolean z25 = true;
                    rVar.p(false);
                    rVar.p(true);
                    if (((Boolean) y0VarF.getValue()).booleanValue()) {
                        oVar2 = oVar;
                        y0Var8 = y0Var7;
                        f5 = f8;
                        iVar3 = iVar2;
                        f6 = f3;
                        obj4 = obj3;
                        i5 = 54;
                        rVar.b0(-242489989);
                        rVar.p(false);
                    } else {
                        oVar2 = oVar;
                        y0Var8 = y0Var7;
                        f5 = f8;
                        iVar3 = iVar2;
                        f6 = f3;
                        obj4 = obj3;
                        i5 = 54;
                        rVar.b0(-242489989);
                        rVar.p(false);
                    }
                    c3 = 5;
                    if (b(y0Var6) == 5) {
                        rVar.b0(-242368438);
                        List listQ3 = com.google.common.base.c.q("MusicMp3", "YouTube Music");
                        oVar4 = oVar2;
                        androidx.compose.ui.r rVarP6 = androidx.compose.foundation.layout.b.p(androidx.compose.foundation.s.p(androidx.compose.foundation.layout.w0.d(oVar4, 1.0f), androidx.compose.foundation.s.o(rVar), false), f6, f5);
                        t0 t0VarA5 = r0.a(androidx.compose.foundation.layout.h.g(f4), iVar3, rVar, i5);
                        int iHashCode7 = Long.hashCode(rVar.T);
                        androidx.compose.runtime.internal.j jVarL7 = rVar.l();
                        androidx.compose.ui.r rVarC7 = androidx.compose.ui.a.c(rVar, rVarP6);
                        androidx.compose.ui.node.g.b.getClass();
                        aVar = androidx.compose.ui.node.f.b;
                        rVar.e0();
                        if (rVar.S) {
                            rVar.k(aVar);
                        } else {
                            rVar.o0();
                        }
                        s.x(rVar, t0VarA5, androidx.compose.ui.node.f.e);
                        s.x(rVar, jVarL7, androidx.compose.ui.node.f.d);
                        s.p(rVar, Integer.valueOf(iHashCode7), androidx.compose.ui.node.f.f);
                        s.t(rVar, androidx.compose.ui.node.f.g);
                        s.x(rVar, rVarC7, androidx.compose.ui.node.f.c);
                        rVar.b0(-1900970340);
                        it2 = listQ3.iterator();
                        while (it2.hasNext()) {
                            str = (String) it2.next();
                            objQ3 = rVar.Q();
                            obj6 = obj4;
                            if (objQ3 == obj6) {
                                objQ3 = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar);
                            }
                            k kVar6 = (k) objQ3;
                            y0VarG = android.support.v4.media.session.b.g(kVar6, rVar, 6);
                            androidx.compose.ui.r rVarA3 = androidx.compose.ui.draw.h.a(oVar4, androidx.compose.foundation.shape.e.a(f4));
                            float f13 = 2;
                            if (((Boolean) y0VarG.getValue()).booleanValue()) {
                                j = com.app.mlounge.ui.theme.b.q;
                            } else {
                                j = androidx.compose.ui.graphics.t.h;
                            }
                            androidx.compose.ui.r rVarG4 = androidx.compose.foundation.s.g(rVarA3, f13, j, androidx.compose.foundation.shape.e.a(f4));
                            y0Var12 = y0Var8;
                            zH = rVar.h(y0Var12) | rVar.f(str);
                            objQ4 = rVar.Q();
                            if (zH) {
                                c4 = '\b';
                                objQ4 = new com.app.mlounge.ui.screens.movies.g(8, y0Var12, str);
                                rVar.l0(objQ4);
                            } else {
                                c4 = '\b';
                                objQ4 = new com.app.mlounge.ui.screens.movies.g(8, y0Var12, str);
                                rVar.l0(objQ4);
                            }
                            androidx.compose.ui.r rVarM4 = androidx.compose.foundation.s.m(androidx.compose.foundation.s.i(rVarG4, kVar6, null, false, null, (kotlin.jvm.functions.a) objQ4, 28), kVar6, 1);
                            if (kotlin.jvm.internal.l.a((String) y0VarG17.getValue(), str)) {
                                c5 = 52429;
                                jB = androidx.compose.ui.graphics.t.b(0.2f, com.app.mlounge.ui.theme.b.f);
                            } else {
                                c5 = 52429;
                                jB = com.app.mlounge.ui.theme.b.d;
                            }
                            y0Var8 = y0Var12;
                            f3.a(rVarM4, androidx.compose.foundation.shape.e.a(f4), jB, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(490656028, new com.app.mlounge.ui.screens.player.h(str, y0VarG17, 1), rVar), rVar, 12582912, 120);
                            obj4 = obj6;
                            it2 = it2;
                            oVar4 = oVar4;
                            c3 = 5;
                        }
                        oVar3 = oVar4;
                        y0Var9 = y0Var8;
                        obj5 = obj4;
                        z2 = false;
                        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.u(rVar, false, true, false);
                    } else {
                        oVar3 = oVar2;
                        y0Var9 = y0Var8;
                        obj5 = obj4;
                        z2 = false;
                        rVar.b0(-240629989);
                        rVar.p(false);
                    }
                    if (((String) y0VarG3.getValue()).length() < 2) {
                        rVar.b0(-240379013);
                        rVar.s();
                        if (((Boolean) y0VarG13.getValue()).booleanValue()) {
                            y0Var10 = y0Var9;
                            rVar.b0(-240324453);
                            rVar.s();
                            if (b(y0Var6) == 0) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (b(y0Var6) == 1) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                            if (b(y0Var6) == 2) {
                                z5 = true;
                            } else {
                                z5 = false;
                            }
                            if (b(y0Var6) == 3) {
                                z6 = true;
                            } else {
                                z6 = false;
                            }
                            iIntValue = ((Number) y0VarG16.getValue()).intValue();
                            if (iIntValue != 0) {
                                z7 = true;
                                if (iIntValue != 1) {
                                    list = (List) y0VarG11.getValue();
                                } else if (iIntValue != 2) {
                                    list = (List) y0VarG19.getValue();
                                } else {
                                    list = (List) y0VarG12.getValue();
                                }
                            } else {
                                z7 = true;
                                list = (List) y0VarG10.getValue();
                            }
                            if (b(y0Var6) == 4) {
                                z8 = z7;
                            } else {
                                z8 = false;
                            }
                            if (b(y0Var6) == 5) {
                                z9 = z7;
                            } else {
                                z9 = false;
                            }
                            if (((Boolean) y0VarF.getValue()).booleanValue()) {
                                z10 = false;
                            } else {
                                z10 = false;
                            }
                            androidx.compose.foundation.lazy.grid.a aVar6 = new androidx.compose.foundation.lazy.grid.a(((com.app.mlounge.ui.theme.a) rVar.j(com.app.mlounge.ui.theme.f.a)).y);
                            androidx.compose.foundation.layout.m0 m0Var3 = new androidx.compose.foundation.layout.m0(f6, f6, f6, f6);
                            androidx.compose.foundation.layout.f fVarG3 = androidx.compose.foundation.layout.h.g(f4);
                            androidx.compose.foundation.layout.f fVarG4 = androidx.compose.foundation.layout.h.g(f4);
                            androidx.compose.foundation.layout.a0 a0Var4 = androidx.compose.foundation.layout.w0.c;
                            oVar3.d(a0Var4);
                            boolean zG7 = rVar.g(z6) | rVar.h(y0Var10) | rVar.f(y0VarG16) | rVar.g(z3) | rVar.f(y0VarG4);
                            if ((i10 & 14) == 4) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            boolean zG8 = zG7 | z11 | rVar.g(z4) | rVar.f(y0VarG5);
                            if ((i10 & Token.ASSIGN_MOD) == 32) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            boolean zG9 = zG8 | z12 | rVar.g(z5) | rVar.f(y0VarG6);
                            if ((i10 & 896) == 256) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            boolean zH6 = zG9 | z13 | rVar.h(list);
                            list2 = list;
                            if ((i10 & 7168) == 2048) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            boolean zG10 = zH6 | z14 | rVar.g(z8) | rVar.f(y0VarG7);
                            if ((57344 & i10) == 16384) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            boolean zG11 = zG10 | z15 | rVar.g(z10) | rVar.f(y0VarG9);
                            z16 = z8;
                            if ((i10 & 29360128) == 8388608) {
                                z17 = true;
                            } else {
                                z17 = false;
                            }
                            boolean zG12 = zG11 | z17 | rVar.g(z9) | rVar.f(y0VarG8);
                            if ((i10 & 458752) == 131072) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            boolean z26 = zG12 | z18;
                            if ((3670016 & i10) == 1048576) {
                                z19 = true;
                            } else {
                                z19 = false;
                            }
                            zF = z26 | z19 | rVar.f(y0VarG14);
                            objQ2 = rVar.Q();
                            if (zF) {
                                final boolean z27 = z9;
                                Object obj11 = new l() { // from class: com.app.mlounge.ui.screens.search.f
                                    @Override // kotlin.jvm.functions.l
                                    public final Object invoke(Object obj12) {
                                        androidx.compose.foundation.lazy.grid.h hVar = (androidx.compose.foundation.lazy.grid.h) obj12;
                                        hVar.getClass();
                                        boolean z28 = z6;
                                        y0 y0Var110 = y0Var10;
                                        androidx.compose.runtime.y0 y0Var20 = y0VarG16;
                                        if (z28) {
                                            androidx.compose.foundation.lazy.grid.h.p(5, hVar, new androidx.compose.runtime.internal.f(-1972710186, true, new androidx.compose.foundation.contextmenu.i(8, y0Var110, y0Var20)), new com.app.mlounge.ui.screens.player.j0(1));
                                        }
                                        if (z3) {
                                            List list3 = (List) y0VarG4.getValue();
                                            hVar.q(list3.size(), new c0(20, new a(2), list3), new com.app.mlounge.ui.screens.adult.g(18, list3), new androidx.compose.runtime.internal.f(-1942245546, true, new j(list3, y0Var110, lVar, 0)));
                                        }
                                        if (z4) {
                                            List list4 = (List) y0VarG5.getValue();
                                            hVar.q(list4.size(), new c0(23, new a(3), list4), new com.app.mlounge.ui.screens.adult.g(19, list4), new androidx.compose.runtime.internal.f(-1942245546, true, new j(list4, y0Var110, lVar2, 1)));
                                        }
                                        if (z5) {
                                            List list5 = (List) y0VarG6.getValue();
                                            hVar.q(list5.size(), new c0(24, new a(4), list5), new com.app.mlounge.ui.screens.adult.g(13, list5), new androidx.compose.runtime.internal.f(-1942245546, true, new com.app.mlounge.ui.screens.adult.h(list5, lVar3, 4)));
                                        }
                                        if (z28) {
                                            a aVar7 = new a(5);
                                            List list6 = list2;
                                            hVar.q(list6.size(), new c0(18, aVar7, list6), new com.app.mlounge.ui.screens.adult.g(14, list6), new androidx.compose.runtime.internal.f(-1942245546, true, new com.app.mlounge.ui.screens.anime.m(list6, y0Var20, pVar, 3)));
                                        }
                                        if (z16) {
                                            List list7 = (List) y0VarG7.getValue();
                                            hVar.q(list7.size(), new c0(19, new a(6), list7), new com.app.mlounge.ui.screens.adult.g(15, list7), new androidx.compose.runtime.internal.f(-1942245546, true, new i(list7, qVar, 0)));
                                        }
                                        if (z10) {
                                            List list8 = (List) y0VarG9.getValue();
                                            hVar.q(list8.size(), new c0(21, new a(7), list8), new com.app.mlounge.ui.screens.adult.g(16, list8), new androidx.compose.runtime.internal.f(-1942245546, true, new com.app.mlounge.ui.screens.adult.h(list8, lVar6, 5)));
                                        }
                                        if (z27) {
                                            List list9 = (List) y0VarG8.getValue();
                                            hVar.q(list9.size(), new c0(22, new a(8), list9), new com.app.mlounge.ui.screens.adult.g(17, list9), new androidx.compose.runtime.internal.f(-1942245546, true, new com.app.mlounge.ui.screens.anime.m(list9, lVar4, lVar5, 4)));
                                        }
                                        if (((Boolean) y0VarG14.getValue()).booleanValue()) {
                                            androidx.compose.foundation.lazy.grid.h.p(7, hVar, b.d, null);
                                        }
                                        return y.a;
                                    }
                                };
                                y0Var11 = y0Var10;
                                rVar.l0(obj11);
                                objQ2 = obj11;
                            } else {
                                final boolean z28 = z9;
                                Object obj12 = new l() { // from class: com.app.mlounge.ui.screens.search.f
                                    @Override // kotlin.jvm.functions.l
                                    public final Object invoke(Object obj13) {
                                        androidx.compose.foundation.lazy.grid.h hVar = (androidx.compose.foundation.lazy.grid.h) obj13;
                                        hVar.getClass();
                                        boolean z29 = z6;
                                        y0 y0Var110 = y0Var10;
                                        androidx.compose.runtime.y0 y0Var20 = y0VarG16;
                                        if (z29) {
                                            androidx.compose.foundation.lazy.grid.h.p(5, hVar, new androidx.compose.runtime.internal.f(-1972710186, true, new androidx.compose.foundation.contextmenu.i(8, y0Var110, y0Var20)), new com.app.mlounge.ui.screens.player.j0(1));
                                        }
                                        if (z3) {
                                            List list3 = (List) y0VarG4.getValue();
                                            hVar.q(list3.size(), new c0(20, new a(2), list3), new com.app.mlounge.ui.screens.adult.g(18, list3), new androidx.compose.runtime.internal.f(-1942245546, true, new j(list3, y0Var110, lVar, 0)));
                                        }
                                        if (z4) {
                                            List list4 = (List) y0VarG5.getValue();
                                            hVar.q(list4.size(), new c0(23, new a(3), list4), new com.app.mlounge.ui.screens.adult.g(19, list4), new androidx.compose.runtime.internal.f(-1942245546, true, new j(list4, y0Var110, lVar2, 1)));
                                        }
                                        if (z5) {
                                            List list5 = (List) y0VarG6.getValue();
                                            hVar.q(list5.size(), new c0(24, new a(4), list5), new com.app.mlounge.ui.screens.adult.g(13, list5), new androidx.compose.runtime.internal.f(-1942245546, true, new com.app.mlounge.ui.screens.adult.h(list5, lVar3, 4)));
                                        }
                                        if (z29) {
                                            a aVar7 = new a(5);
                                            List list6 = list2;
                                            hVar.q(list6.size(), new c0(18, aVar7, list6), new com.app.mlounge.ui.screens.adult.g(14, list6), new androidx.compose.runtime.internal.f(-1942245546, true, new com.app.mlounge.ui.screens.anime.m(list6, y0Var20, pVar, 3)));
                                        }
                                        if (z16) {
                                            List list7 = (List) y0VarG7.getValue();
                                            hVar.q(list7.size(), new c0(19, new a(6), list7), new com.app.mlounge.ui.screens.adult.g(15, list7), new androidx.compose.runtime.internal.f(-1942245546, true, new i(list7, qVar, 0)));
                                        }
                                        if (z10) {
                                            List list8 = (List) y0VarG9.getValue();
                                            hVar.q(list8.size(), new c0(21, new a(7), list8), new com.app.mlounge.ui.screens.adult.g(16, list8), new androidx.compose.runtime.internal.f(-1942245546, true, new com.app.mlounge.ui.screens.adult.h(list8, lVar6, 5)));
                                        }
                                        if (z28) {
                                            List list9 = (List) y0VarG8.getValue();
                                            hVar.q(list9.size(), new c0(22, new a(8), list9), new com.app.mlounge.ui.screens.adult.g(17, list9), new androidx.compose.runtime.internal.f(-1942245546, true, new com.app.mlounge.ui.screens.anime.m(list9, lVar4, lVar5, 4)));
                                        }
                                        if (((Boolean) y0VarG14.getValue()).booleanValue()) {
                                            androidx.compose.foundation.lazy.grid.h.p(7, hVar, b.d, null);
                                        }
                                        return y.a;
                                    }
                                };
                                y0Var11 = y0Var10;
                                rVar.l0(obj12);
                                objQ2 = obj12;
                            }
                            com.google.android.gms.dynamite.g.a(aVar6, a0Var4, xVarA, m0Var3, fVarG4, fVarG3, null, false, null, (l) objQ2, rVar, 1772592, 912);
                            rVar.s();
                            rVar.r();
                            y0Var2 = y0Var11;
                            break;
                        }
                        rVar.b0(-240353283);
                        b0.n(null, rVar, 0);
                        rVar.w(i8);
                        q1VarT = rVar.t();
                        if (q1VarT != null) {
                            q1VarT.e(new e(lVar, lVar2, lVar3, pVar, qVar, lVar4, lVar5, lVar6, y0Var9, i, 1));
                            return;
                        }
                        return;
                    }
                    rVar.b0(-240591394);
                    androidx.compose.foundation.layout.a0 a0Var5 = androidx.compose.foundation.layout.w0.c;
                    androidx.compose.ui.layout.q0 q0VarD2 = androidx.compose.foundation.layout.p.d(androidx.compose.ui.c.B, z2);
                    int iHashCode8 = Long.hashCode(rVar.T);
                    androidx.compose.runtime.internal.j jVarL8 = rVar.l();
                    androidx.compose.ui.r rVarC8 = androidx.compose.ui.a.c(rVar, a0Var5);
                    androidx.compose.ui.node.g.b.getClass();
                    aVarB = androidx.compose.ui.node.f.b();
                    rVar.e0();
                    if (rVar.E()) {
                        rVar.k(aVarB);
                    } else {
                        rVar.o0();
                    }
                    s.x(rVar, q0VarD2, androidx.compose.ui.node.f.d());
                    s.x(rVar, jVarL8, androidx.compose.ui.node.f.f());
                    s.p(rVar, Integer.valueOf(iHashCode8), androidx.compose.ui.node.f.c());
                    s.t(rVar, androidx.compose.ui.node.f.a());
                    s.x(rVar, rVarC8, androidx.compose.ui.node.f.e());
                    p3.b("Type at least 2 characters to search", null, com.app.mlounge.ui.theme.b.c(), 0L, null, 0L, null, 0L, 0, false, 0, 0, null, rVar, 390, 0, 262138);
                    rVar.r();
                    rVar.w(i8);
                    q1VarT2 = rVar.t();
                    if (q1VarT2 != null) {
                        q1VarT2.e(new e(lVar, lVar2, lVar3, pVar, qVar, lVar4, lVar5, lVar6, y0Var9, i, 0));
                        return;
                    }
                    return;
                }
                next = it.next();
                i6 = i4 + 1;
                if (i4 >= 0) {
                    com.google.common.base.c.w();
                    throw null;
                }
                String str5 = (String) next;
                objQ5 = rVar.Q();
                obj7 = obj2;
                if (objQ5 == obj7) {
                    objQ5 = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar);
                }
                k kVar7 = (k) objQ5;
                y0VarG2 = android.support.v4.media.session.b.g(kVar7, rVar, 6);
                androidx.compose.ui.r rVarA4 = androidx.compose.ui.draw.h.a(oVar, androidx.compose.foundation.shape.e.a(f2));
                float f14 = 2;
                if (((Boolean) y0VarG2.getValue()).booleanValue()) {
                    j2 = com.app.mlounge.ui.theme.b.q;
                } else {
                    j2 = androidx.compose.ui.graphics.t.h;
                }
                androidx.compose.ui.i iVar7 = iVar;
                androidx.compose.ui.r rVarG5 = androidx.compose.foundation.s.g(rVarA4, f14, j2, androidx.compose.foundation.shape.e.a(f2));
                y0Var13 = y0Var5;
                zH2 = rVar.h(y0Var13) | rVar.d(i4);
                objQ6 = rVar.Q();
                if (zH2) {
                    i7 = 1;
                    objQ6 = new d(y0Var13, i4, 1);
                    rVar.l0(objQ6);
                } else {
                    i7 = 1;
                    objQ6 = new d(y0Var13, i4, 1);
                    rVar.l0(objQ6);
                }
                androidx.compose.ui.r rVarM5 = androidx.compose.foundation.s.m(androidx.compose.foundation.s.i(rVarG5, kVar7, null, false, null, (kotlin.jvm.functions.a) objQ6, 28), kVar7, i7);
                if (b(y0Var15) == i4) {
                    jB3 = androidx.compose.ui.graphics.t.b(0.3f, com.app.mlounge.ui.theme.b.f);
                } else {
                    jB3 = com.app.mlounge.ui.theme.b.c;
                }
                androidx.compose.runtime.y0 y0Var110 = y0Var15;
                f3.a(rVarM5, androidx.compose.foundation.shape.e.a(f2), jB3, 0L, 0.0f, 0.0f, androidx.compose.runtime.internal.k.c(1906919490, new c(i4, str5, y0Var110, 0), rVar), rVar, 12582912, 120);
                y0Var5 = y0Var13;
                i4 = i6;
                f2 = f2;
                y0Var15 = y0Var110;
                iVar = iVar7;
                f = f;
                obj2 = obj7;
            }
        } else {
            rVar.W();
            y0Var2 = y0Var;
        }
        q1 q1VarT3 = rVar.t();
        if (q1VarT3 != null) {
            q1VarT3.e(new e(lVar, lVar2, lVar3, pVar, qVar, lVar4, lVar5, lVar6, y0Var2, i, 2));
        }
    }

    public static final int b(androidx.compose.runtime.y0 y0Var) {
        return ((Number) y0Var.getValue()).intValue();
    }
}
