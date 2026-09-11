package androidx.compose.foundation.contextmenu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.compose.foundation.layout.t0;
import androidx.compose.foundation.lazy.layout.c0;
import androidx.compose.foundation.lazy.layout.d0;
import androidx.compose.foundation.lazy.layout.w;
import androidx.compose.foundation.lazy.layout.w0;
import androidx.compose.foundation.lazy.layout.x;
import androidx.compose.foundation.r0;
import androidx.compose.foundation.text.contextmenu.internal.n;
import androidx.compose.foundation.text.contextmenu.internal.v;
import androidx.compose.foundation.text.selection.c1;
import androidx.compose.foundation.text.selection.t;
import androidx.compose.material3.f1;
import androidx.compose.material3.p3;
import androidx.compose.material3.s0;
import androidx.compose.material3.t3;
import androidx.compose.material3.u3;
import androidx.compose.runtime.a2;
import androidx.compose.runtime.d2;
import androidx.compose.runtime.i2;
import androidx.compose.runtime.j0;
import androidx.compose.runtime.m;
import androidx.compose.runtime.q1;
import androidx.compose.runtime.r;
import androidx.compose.runtime.s;
import androidx.compose.runtime.t2;
import androidx.compose.runtime.u2;
import androidx.compose.ui.graphics.p0;
import androidx.compose.ui.graphics.vector.h0;
import androidx.compose.ui.layout.m1;
import androidx.compose.ui.o;
import androidx.compose.ui.text.input.q;
import androidx.compose.ui.text.l0;
import com.app.mlounge.ui.screens.player.i0;
import com.app.mlounge.ui.viewmodel.a0;
import com.app.mlounge.ui.viewmodel.e0;
import com.app.mlounge.ui.viewmodel.k1;
import com.app.mlounge.ui.viewmodel.x1;
import com.app.mlounge.ui.viewmodel.y0;
import com.google.firebase.crashlytics.internal.model.t1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.p;
import kotlin.y;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f implements p {
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ f(int i, Object obj, Object obj2) {
        this.e = i;
        this.y = obj;
        this.z = obj2;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        boolean z;
        l0 l0Var;
        int i = this.e;
        int i2 = 6;
        int i3 = 8;
        o oVar = o.b;
        androidx.compose.runtime.f fVar = m.a;
        int i4 = 2;
        y yVar = y.a;
        Object obj3 = this.z;
        Object obj4 = this.y;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ((g) obj4).a((d) obj3, (r) obj, s.A(1));
                return yVar;
            case 1:
                androidx.compose.foundation.lazy.grid.a aVar = (androidx.compose.foundation.lazy.grid.a) obj4;
                androidx.compose.foundation.layout.e eVar = (androidx.compose.foundation.layout.e) obj3;
                androidx.compose.ui.unit.c cVar = (androidx.compose.ui.unit.c) obj;
                androidx.compose.ui.unit.a aVar2 = (androidx.compose.ui.unit.a) obj2;
                if (androidx.compose.ui.unit.a.h(aVar2.a) == Integer.MAX_VALUE) {
                    androidx.compose.foundation.internal.b.a("LazyVerticalGrid's width should be bound by parent.");
                }
                int iH = androidx.compose.ui.unit.a.h(aVar2.a);
                int iG0 = cVar.g0(eVar.a());
                int iMax = Math.max((iH + iG0) / (cVar.g0(aVar.a) + iG0), 1);
                int i5 = iH - ((iMax - 1) * iG0);
                int i6 = i5 / iMax;
                int i7 = i5 % iMax;
                ArrayList arrayList = new ArrayList(iMax);
                int i8 = 0;
                while (i8 < iMax) {
                    arrayList.add(Integer.valueOf((i8 < i7 ? 1 : 0) + i6));
                    i8++;
                }
                int[] iArrJ0 = kotlin.collections.o.j0(arrayList);
                int[] iArr = new int[iArrJ0.length];
                eVar.c(cVar, iH, iArrJ0, androidx.compose.ui.unit.m.e, iArr);
                return new androidx.compose.foundation.text.input.internal.o(5, iArrJ0, iArr);
            case 2:
                x xVar = (x) obj4;
                w wVar = (w) obj3;
                r rVar = (r) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (rVar.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    androidx.compose.foundation.lazy.layout.y yVar2 = (androidx.compose.foundation.lazy.layout.y) xVar.b.invoke();
                    int iE = wVar.c;
                    Object obj5 = wVar.a;
                    if ((iE >= yVar2.a() || !yVar2.b(iE).equals(obj5)) && (iE = yVar2.e(obj5)) != -1) {
                        wVar.c = iE;
                    }
                    int i9 = iE;
                    if (i9 != -1) {
                        rVar.b0(-1664741271);
                        androidx.compose.foundation.lazy.layout.m.d(yVar2, xVar.a, i9, wVar.a, rVar, 0);
                        z = false;
                    } else {
                        z = false;
                        rVar.b0(-1668376610);
                    }
                    rVar.p(z);
                    boolean zH = rVar.h(wVar);
                    Object objQ = rVar.Q();
                    if (zH || objQ == fVar) {
                        objQ = new androidx.activity.compose.g(wVar, 12);
                        rVar.l0(objQ);
                    }
                    j0.b(obj5, (kotlin.jvm.functions.l) objQ, rVar);
                } else {
                    rVar.W();
                }
                return yVar;
            case 3:
                return ((c0) obj3).a(new d0((x) obj4, (m1) obj), ((androidx.compose.ui.unit.a) obj2).a);
            case 4:
                androidx.compose.runtime.internal.f fVar2 = (androidx.compose.runtime.internal.f) obj4;
                w0 w0Var = (w0) obj3;
                r rVar2 = (r) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (rVar2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    fVar2.invoke(w0Var, rVar2, 0);
                } else {
                    rVar2.W();
                }
                return yVar;
            case 5:
                androidx.compose.foundation.text.contextmenu.provider.e eVar2 = (androidx.compose.foundation.text.contextmenu.provider.e) obj4;
                androidx.compose.foundation.text.contextmenu.data.g gVar = (androidx.compose.foundation.text.contextmenu.data.g) obj3;
                r rVar3 = (r) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (rVar3.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    boolean zF = rVar3.f(eVar2);
                    Object objQ2 = rVar3.Q();
                    if (zF || objQ2 == fVar) {
                        objQ2 = s.k(new r0(0, eVar2, androidx.compose.foundation.text.contextmenu.provider.e.class, "data", "data()Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuData;", 0, 1));
                        rVar3.l0(objQ2);
                    }
                    n.a(gVar, (androidx.compose.foundation.text.contextmenu.data.c) ((t2) objQ2).getValue(), rVar3, 0);
                } else {
                    rVar3.W();
                }
                return yVar;
            case 6:
                ((Integer) obj2).getClass();
                n.a((androidx.compose.foundation.text.contextmenu.data.g) obj4, (androidx.compose.foundation.text.contextmenu.data.c) obj3, (r) obj, s.A(1));
                return yVar;
            case 7:
                ((Integer) obj2).getClass();
                ((v) obj4).d((Drawable) obj3, (r) obj, s.A(49));
                return yVar;
            case 8:
                ((Integer) obj2).getClass();
                t1.c((androidx.compose.ui.r) obj4, (androidx.compose.runtime.internal.f) obj3, (r) obj, s.A(49));
                return yVar;
            case 9:
                c1 c1Var = (c1) obj4;
                CoroutineScope coroutineScope = (CoroutineScope) obj3;
                androidx.compose.foundation.text.contextmenu.builder.a aVar3 = (androidx.compose.foundation.text.contextmenu.builder.a) obj;
                Context context = (Context) obj2;
                boolean zJ = c1Var.j();
                androidx.compose.ui.text.g gVarM = c1Var.m();
                String str = gVarM != null ? gVarM.y : null;
                l0 l0Var2 = c1Var.w;
                if (l0Var2 != null) {
                    long j = l0Var2.a;
                    q qVar = c1Var.b;
                    l0Var = new l0(androidx.compose.ui.text.d0.b(qVar.v((int) (j >> 32)), qVar.v((int) (j & 4294967295L))));
                } else {
                    l0Var = null;
                }
                androidx.compose.foundation.text.selection.n nVar = c1Var.j;
                androidx.compose.animation.core.a aVar4 = new androidx.compose.animation.core.a(8, c1Var, coroutineScope, context);
                u2 u2Var = androidx.compose.foundation.text.selection.v.a;
                if (Build.VERSION.SDK_INT < 28 || str == null || l0Var == null || nVar == null || !(nVar instanceof t)) {
                    aVar4.invoke(aVar3);
                    if (str != null && l0Var != null) {
                        androidx.compose.foundation.text.contextmenu.b.a(aVar3, context, zJ, str, l0Var.a);
                    }
                } else {
                    String str2 = str;
                    ((t) nVar).b(aVar3, str2, l0Var.a, aVar4);
                    androidx.compose.foundation.text.contextmenu.b.a(aVar3, context, zJ, str2, l0Var.a);
                }
                return yVar;
            case 10:
                ((Integer) obj2).getClass();
                ((s0) obj4).a((com.google.firebase.messaging.o) obj3, (r) obj, s.A(1));
                return yVar;
            case 11:
                androidx.compose.runtime.internal.l lVar = (androidx.compose.runtime.internal.l) obj4;
                i2 i2Var = (i2) obj3;
                int iIntValue4 = ((Integer) obj).intValue();
                if (obj2 instanceof androidx.compose.runtime.i) {
                    lVar.f.b((androidx.compose.runtime.i) obj2);
                } else if (!(obj2 instanceof d2)) {
                    if (obj2 instanceof a2) {
                        s.w(i2Var, iIntValue4, obj2);
                        lVar.e((a2) obj2);
                    } else if (obj2 instanceof q1) {
                        s.w(i2Var, iIntValue4, obj2);
                        ((q1) obj2).c();
                    }
                }
                return yVar;
            case 12:
                ((Integer) obj2).getClass();
                _COROUTINE.b.d((List) obj4, (Collection) obj3, (r) obj, s.A(1));
                return yVar;
            case 13:
                ((Integer) obj2).getClass();
                android.support.v4.media.session.b.c((androidx.compose.runtime.saveable.d) obj4, (androidx.compose.runtime.internal.f) obj3, (r) obj, s.A(1));
                return yVar;
            case 14:
                String str3 = (String) obj3;
                r rVar4 = (r) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (rVar4.T(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    androidx.compose.ui.r rVarP = androidx.compose.foundation.layout.b.p(oVar, 12, 8);
                    t0 t0VarA = androidx.compose.foundation.layout.r0.a(androidx.compose.foundation.layout.h.g(4), androidx.compose.ui.c.H, rVar4, 54);
                    int iHashCode = Long.hashCode(rVar4.T);
                    androidx.compose.runtime.internal.j jVarL = rVar4.l();
                    androidx.compose.ui.r rVarC = androidx.compose.ui.a.c(rVar4, rVarP);
                    androidx.compose.ui.node.g.b.getClass();
                    androidx.compose.ui.node.y yVar3 = androidx.compose.ui.node.f.b;
                    rVar4.e0();
                    if (rVar4.S) {
                        rVar4.k(yVar3);
                    } else {
                        rVar4.o0();
                    }
                    s.x(rVar4, t0VarA, androidx.compose.ui.node.f.e);
                    s.x(rVar4, jVarL, androidx.compose.ui.node.f.d);
                    s.p(rVar4, Integer.valueOf(iHashCode), androidx.compose.ui.node.f.f);
                    s.t(rVar4, androidx.compose.ui.node.f.g);
                    s.x(rVar4, rVarC, androidx.compose.ui.node.f.c);
                    p3.b(str3, null, obj4 != null ? com.app.mlounge.ui.theme.b.f : com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar4.j(u3.a)).n, rVar4, 0, 0, 131066);
                    f1.b(coil3.network.g.n(), null, androidx.compose.foundation.layout.w0.l(oVar, 16), obj4 != null ? com.app.mlounge.ui.theme.b.f : com.app.mlounge.ui.theme.b.m, rVar4, 432, 0);
                    rVar4.p(true);
                } else {
                    rVar4.W();
                }
                return yVar;
            case 15:
                ((Integer) obj2).getClass();
                com.app.mlounge.ui.screens.adult.i.b((kotlin.jvm.functions.l) obj4, (com.app.mlounge.ui.viewmodel.c) obj3, (r) obj, s.A(1));
                return yVar;
            case 16:
                ((Integer) obj2).getClass();
                com.app.mlounge.ui.screens.anime.o.b((kotlin.jvm.functions.l) obj4, (com.app.mlounge.ui.viewmodel.g) obj3, (r) obj, s.A(1));
                return yVar;
            case 17:
                ((Integer) obj2).getClass();
                com.app.mlounge.ui.screens.downloads.a.b((kotlin.jvm.functions.s) obj4, (com.app.mlounge.ui.viewmodel.p) obj3, (r) obj, s.A(1));
                return yVar;
            case 18:
                ((Integer) obj2).getClass();
                com.app.mlounge.ui.screens.games.a.d((p) obj4, (com.app.mlounge.ui.viewmodel.s) obj3, (r) obj, s.A(1));
                return yVar;
            case 19:
                ((Integer) obj2).getClass();
                com.app.mlounge.ui.screens.livetv.a.c((kotlin.jvm.functions.r) obj4, (a0) obj3, (r) obj, s.A(1));
                return yVar;
            case 20:
                ((Integer) obj2).getClass();
                com.app.mlounge.ui.screens.movies.a.d((kotlin.jvm.functions.l) obj4, (e0) obj3, (r) obj, s.A(1));
                return yVar;
            case 21:
                androidx.compose.ui.graphics.vector.f fVar3 = (androidx.compose.ui.graphics.vector.f) obj4;
                String str4 = (String) obj3;
                r rVar5 = (r) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (rVar5.T(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    androidx.compose.ui.r rVarO = androidx.compose.foundation.layout.b.o(oVar, 12);
                    t0 t0VarA2 = androidx.compose.foundation.layout.r0.a(androidx.compose.foundation.layout.h.d, androidx.compose.ui.c.H, rVar5, 54);
                    int iHashCode2 = Long.hashCode(rVar5.T);
                    androidx.compose.runtime.internal.j jVarL2 = rVar5.l();
                    androidx.compose.ui.r rVarC2 = androidx.compose.ui.a.c(rVar5, rVarO);
                    androidx.compose.ui.node.g.b.getClass();
                    androidx.compose.ui.node.y yVar4 = androidx.compose.ui.node.f.b;
                    rVar5.e0();
                    if (rVar5.S) {
                        rVar5.k(yVar4);
                    } else {
                        rVar5.o0();
                    }
                    s.x(rVar5, t0VarA2, androidx.compose.ui.node.f.e);
                    s.x(rVar5, jVarL2, androidx.compose.ui.node.f.d);
                    s.p(rVar5, Integer.valueOf(iHashCode2), androidx.compose.ui.node.f.f);
                    s.t(rVar5, androidx.compose.ui.node.f.g);
                    s.x(rVar5, rVarC2, androidx.compose.ui.node.f.c);
                    androidx.compose.ui.r rVarL = androidx.compose.foundation.layout.w0.l(oVar, 16);
                    long j2 = com.app.mlounge.ui.theme.b.l;
                    f1.b(fVar3, null, rVarL, j2, rVar5, 3504, 0);
                    androidx.compose.foundation.layout.b.d(rVar5, androidx.compose.foundation.layout.w0.p(oVar, 6));
                    p3.b(str4, null, j2, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar5.j(u3.a)).o, rVar5, 384, 0, 131066);
                    rVar5.p(true);
                } else {
                    rVar5.W();
                }
                return yVar;
            case 22:
                ((Integer) obj2).getClass();
                i0.g((androidx.compose.ui.r) obj4, (kotlin.jvm.functions.a) obj3, (r) obj, s.A(1));
                return yVar;
            case 23:
                y0 y0Var = (y0) obj4;
                androidx.compose.runtime.y0 y0Var2 = (androidx.compose.runtime.y0) obj3;
                r rVar6 = (r) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (!rVar6.T(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    rVar6.W();
                } else if (((String) y0Var2.getValue()).length() > 0) {
                    rVar6.b0(725214986);
                    boolean zH2 = rVar6.h(y0Var);
                    Object objQ3 = rVar6.Q();
                    if (zH2 || objQ3 == fVar) {
                        objQ3 = new androidx.room.coroutines.d(y0Var, 17);
                        rVar6.l0(objQ3);
                    }
                    androidx.compose.material3.t2.e((kotlin.jvm.functions.a) objQ3, null, false, null, null, null, com.app.mlounge.ui.screens.search.b.c, rVar6, 1572864, 62);
                    rVar6.p(false);
                } else {
                    rVar6.b0(725407186);
                    rVar6.p(false);
                }
                return yVar;
            case 24:
                Context context2 = (Context) obj4;
                androidx.compose.runtime.y0 y0Var3 = (androidx.compose.runtime.y0) obj3;
                r rVar7 = (r) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                int i10 = 1;
                if (rVar7.T(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    boolean zH3 = rVar7.h(context2);
                    Object objQ4 = rVar7.Q();
                    if (zH3 || objQ4 == fVar) {
                        objQ4 = new com.app.mlounge.ui.screens.settings.x(context2, y0Var3, i10);
                        rVar7.l0(objQ4);
                    }
                    androidx.compose.material3.t2.h((kotlin.jvm.functions.a) objQ4, null, false, null, null, null, null, com.app.mlounge.ui.screens.settings.b.a, rVar7, 805306368, 510);
                } else {
                    rVar7.W();
                }
                return yVar;
            case 25:
                ((Integer) obj2).getClass();
                com.app.mlounge.ui.screens.settings.e0.p((k1) obj4, (com.app.mlounge.ui.viewmodel.k) obj3, (r) obj, s.A(1));
                return yVar;
            case 26:
                List list = (List) obj4;
                p pVar = (p) obj3;
                r rVar8 = (r) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                androidx.compose.ui.h hVar = androidx.compose.ui.c.J;
                if (!rVar8.T(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    rVar8.W();
                } else if (list.isEmpty()) {
                    rVar8.b0(971480235);
                    p3.b("No other video players found on this device.", androidx.compose.foundation.layout.b.q(oVar, 0.0f, 16, 1), com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar8.j(u3.a)).k, rVar8, 54, 0, 131064);
                    rVar8.p(false);
                } else {
                    r rVar9 = rVar8;
                    rVar9.b0(971810106);
                    androidx.compose.ui.r rVarP2 = androidx.compose.foundation.s.p(oVar, androidx.compose.foundation.s.o(rVar9), true);
                    androidx.compose.foundation.layout.v vVarA = androidx.compose.foundation.layout.t.a(androidx.compose.foundation.layout.h.c, hVar, rVar9, 0);
                    int iHashCode3 = Long.hashCode(rVar9.T);
                    androidx.compose.runtime.internal.j jVarL3 = rVar9.l();
                    androidx.compose.ui.r rVarC3 = androidx.compose.ui.a.c(rVar9, rVarP2);
                    androidx.compose.ui.node.g.b.getClass();
                    androidx.compose.ui.node.y yVar5 = androidx.compose.ui.node.f.b;
                    rVar9.e0();
                    if (rVar9.S) {
                        rVar9.k(yVar5);
                    } else {
                        rVar9.o0();
                    }
                    s.x(rVar9, vVarA, androidx.compose.ui.node.f.e);
                    s.x(rVar9, jVarL3, androidx.compose.ui.node.f.d);
                    s.p(rVar9, Integer.valueOf(iHashCode3), androidx.compose.ui.node.f.f);
                    s.t(rVar9, androidx.compose.ui.node.f.g);
                    s.x(rVar9, rVarC3, androidx.compose.ui.node.f.c);
                    rVar9.b0(-1461008085);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        kotlin.k kVar = (kotlin.k) it.next();
                        String str5 = (String) kVar.e;
                        String str6 = (String) kVar.y;
                        Object objQ5 = rVar9.Q();
                        if (objQ5 == fVar) {
                            objQ5 = androidx.privacysandbox.ads.adservices.java.internal.a.g(rVar9);
                        }
                        androidx.compose.foundation.interaction.k kVar2 = (androidx.compose.foundation.interaction.k) objQ5;
                        androidx.compose.ui.r rVarG = androidx.compose.foundation.s.g(androidx.compose.foundation.layout.w0.d(oVar, 1.0f), i4, ((Boolean) android.support.v4.media.session.b.g(kVar2, rVar9, i2).getValue()).booleanValue() ? com.app.mlounge.ui.theme.b.q : androidx.compose.ui.graphics.t.h, androidx.compose.foundation.shape.e.a(i3));
                        boolean zF2 = rVar9.f(pVar) | rVar9.f(str5) | rVar9.f(str6);
                        Object objQ6 = rVar9.Q();
                        if (zF2 || objQ6 == fVar) {
                            objQ6 = new androidx.compose.foundation.gestures.g(17, pVar, str5, str6);
                            rVar9.l0(objQ6);
                        }
                        float f = 12;
                        androidx.compose.ui.r rVarP3 = androidx.compose.foundation.layout.b.p(androidx.compose.foundation.s.m(androidx.compose.foundation.s.i(rVarG, kVar2, null, false, null, (kotlin.jvm.functions.a) objQ6, 28), kVar2, 1), 4, f);
                        t0 t0VarA3 = androidx.compose.foundation.layout.r0.a(androidx.compose.foundation.layout.h.a, androidx.compose.ui.c.H, rVar9, 48);
                        int iHashCode4 = Long.hashCode(rVar9.T);
                        androidx.compose.runtime.internal.j jVarL4 = rVar9.l();
                        androidx.compose.ui.r rVarC4 = androidx.compose.ui.a.c(rVar9, rVarP3);
                        androidx.compose.ui.node.g.b.getClass();
                        androidx.compose.ui.node.y yVar6 = androidx.compose.ui.node.f.b;
                        rVar9.e0();
                        if (rVar9.S) {
                            rVar9.k(yVar6);
                        } else {
                            rVar9.o0();
                        }
                        androidx.compose.ui.node.e eVar3 = androidx.compose.ui.node.f.e;
                        s.x(rVar9, t0VarA3, eVar3);
                        androidx.compose.ui.node.e eVar4 = androidx.compose.ui.node.f.d;
                        s.x(rVar9, jVarL4, eVar4);
                        Integer numValueOf = Integer.valueOf(iHashCode4);
                        androidx.compose.ui.node.e eVar5 = androidx.compose.ui.node.f.f;
                        s.p(rVar9, numValueOf, eVar5);
                        androidx.compose.ui.node.d dVar = androidx.compose.ui.node.f.g;
                        s.t(rVar9, dVar);
                        androidx.compose.ui.node.e eVar6 = androidx.compose.ui.node.f.c;
                        s.x(rVar9, rVarC4, eVar6);
                        androidx.compose.ui.graphics.vector.f fVarB = androidx.room.r.e;
                        if (fVarB == null) {
                            androidx.compose.ui.graphics.vector.e eVar7 = new androidx.compose.ui.graphics.vector.e("Filled.OndemandVideo", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                            int i11 = h0.a;
                            p0 p0Var = new p0(androidx.compose.ui.graphics.t.b);
                            androidx.compose.ui.graphics.vector.g gVar2 = new androidx.compose.ui.graphics.vector.g(0);
                            gVar2.o(21.0f, 3.0f);
                            gVar2.m(3.0f, 3.0f);
                            gVar2.h(-1.11f, 0.0f, -2.0f, 0.89f, -2.0f, 2.0f);
                            gVar2.s(12.0f);
                            gVar2.h(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
                            gVar2.l(5.0f);
                            gVar2.s(2.0f);
                            gVar2.l(8.0f);
                            gVar2.s(-2.0f);
                            gVar2.l(5.0f);
                            gVar2.h(1.1f, 0.0f, 1.99f, -0.9f, 1.99f, -2.0f);
                            gVar2.m(23.0f, 5.0f);
                            gVar2.h(0.0f, -1.11f, -0.9f, -2.0f, -2.0f, -2.0f);
                            gVar2.f();
                            gVar2.o(21.0f, 17.0f);
                            gVar2.m(3.0f, 17.0f);
                            gVar2.m(3.0f, 5.0f);
                            gVar2.l(18.0f);
                            gVar2.s(12.0f);
                            gVar2.f();
                            gVar2.o(16.0f, 11.0f);
                            gVar2.n(-7.0f, 4.0f);
                            gVar2.m(9.0f, 7.0f);
                            gVar2.f();
                            androidx.compose.ui.graphics.vector.e.a(eVar7, gVar2.a, 0, p0Var);
                            fVarB = eVar7.b();
                            androidx.room.r.e = fVarB;
                        }
                        androidx.compose.ui.graphics.vector.f fVar4 = fVarB;
                        long j3 = com.app.mlounge.ui.theme.b.m;
                        r rVar10 = rVar9;
                        f1.b(fVar4, null, androidx.compose.foundation.layout.w0.l(oVar, 24), j3, rVar10, 432, 0);
                        rVar9 = rVar10;
                        androidx.compose.foundation.layout.b.d(rVar9, androidx.compose.foundation.layout.w0.p(oVar, f));
                        androidx.compose.runtime.f fVar5 = fVar;
                        if (1.0f <= 0.0d) {
                            androidx.compose.foundation.layout.internal.a.a("invalid weight; must be greater than zero");
                        }
                        androidx.compose.foundation.layout.h0 h0Var = new androidx.compose.foundation.layout.h0(1.0f, true);
                        androidx.compose.foundation.layout.v vVarA2 = androidx.compose.foundation.layout.t.a(androidx.compose.foundation.layout.h.c, hVar, rVar9, 0);
                        int iHashCode5 = Long.hashCode(rVar9.T);
                        androidx.compose.runtime.internal.j jVarL5 = rVar9.l();
                        androidx.compose.ui.h hVar2 = hVar;
                        androidx.compose.ui.r rVarC5 = androidx.compose.ui.a.c(rVar9, h0Var);
                        rVar9.e0();
                        if (rVar9.S) {
                            rVar9.k(yVar6);
                        } else {
                            rVar9.o0();
                        }
                        s.x(rVar9, vVarA2, eVar3);
                        s.x(rVar9, jVarL5, eVar4);
                        androidx.privacysandbox.ads.adservices.java.internal.a.z(iHashCode5, rVar9, eVar5, rVar9, dVar);
                        s.x(rVar9, rVarC5, eVar6);
                        u2 u2Var2 = u3.a;
                        p3.b(str6, null, com.app.mlounge.ui.theme.b.l, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar9.j(u2Var2)).k, rVar9, 0, 0, 131066);
                        str5.getClass();
                        p3.b(str5, null, j3, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar9.j(u2Var2)).l, rVar9, 0, 0, 131066);
                        rVar9.p(true);
                        rVar9.p(true);
                        fVar = fVar5;
                        it = it;
                        hVar = hVar2;
                        i2 = 6;
                        i3 = 8;
                        i4 = 2;
                    }
                    androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.u(rVar9, false, true, false);
                }
                return yVar;
            case 27:
                ((Integer) obj2).getClass();
                com.app.mlounge.ui.screens.settings.e0.i((kotlin.jvm.functions.l) obj4, (kotlin.jvm.functions.a) obj3, (r) obj, s.A(49));
                return yVar;
            case 28:
                androidx.activity.compose.t tVar = (androidx.activity.compose.t) obj4;
                androidx.compose.runtime.y0 y0Var4 = (androidx.compose.runtime.y0) obj3;
                r rVar11 = (r) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (rVar11.T(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    boolean zH4 = rVar11.h(tVar);
                    Object objQ7 = rVar11.Q();
                    if (zH4 || objQ7 == fVar) {
                        objQ7 = new com.app.mlounge.ui.screens.movies.g(10, tVar, y0Var4);
                        rVar11.l0(objQ7);
                    }
                    androidx.compose.material3.t2.h((kotlin.jvm.functions.a) objQ7, null, false, null, null, null, null, com.app.mlounge.ui.screens.settings.b.t, rVar11, 805306368, 510);
                } else {
                    rVar11.W();
                }
                return yVar;
            default:
                ((Integer) obj2).getClass();
                com.app.mlounge.ui.screens.tvshows.a.d((kotlin.jvm.functions.l) obj4, (x1) obj3, (r) obj, s.A(1));
                return yVar;
        }
    }

    public /* synthetic */ f(Object obj, Object obj2, int i, int i2) {
        this.e = i2;
        this.y = obj;
        this.z = obj2;
    }
}
