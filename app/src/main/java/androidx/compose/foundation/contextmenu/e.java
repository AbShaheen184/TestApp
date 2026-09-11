package androidx.compose.foundation.contextmenu;

import androidx.compose.animation.core.c1;
import androidx.compose.foundation.gestures.w1;
import androidx.compose.foundation.layout.w;
import androidx.compose.foundation.text.r0;
import androidx.compose.runtime.j0;
import androidx.compose.runtime.m;
import androidx.compose.runtime.r;
import androidx.compose.runtime.s;
import androidx.compose.runtime.t2;
import androidx.compose.runtime.y0;
import androidx.compose.ui.graphics.p0;
import androidx.compose.ui.graphics.t;
import androidx.compose.ui.graphics.vector.h0;
import androidx.compose.ui.o;
import androidx.compose.ui.platform.l1;
import androidx.compose.ui.platform.r2;
import androidx.compose.ui.platform.x1;
import androidx.compose.ui.text.input.x;
import androidx.compose.ui.text.l0;
import com.app.mlounge.ui.screens.settings.e0;
import com.app.mlounge.ui.screens.settings.u;
import com.app.mlounge.ui.viewmodel.k1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.p;
import kotlin.jvm.functions.q;
import kotlin.y;
import org.jsoup.helper.n;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e implements q {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ e(p pVar, g gVar, q qVar, kotlin.jvm.functions.a aVar) {
        this.e = 0;
        this.y = pVar;
        this.z = gVar;
        this.A = qVar;
        this.B = aVar;
    }

    @Override // kotlin.jvm.functions.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        Object objE;
        int i = this.e;
        int i2 = 9;
        int i3 = 8;
        int i4 = 11;
        y yVar = y.a;
        androidx.compose.runtime.f fVar = m.a;
        Object obj4 = this.B;
        Object obj5 = this.A;
        Object obj6 = this.z;
        Object obj7 = this.y;
        switch (i) {
            case 0:
                p pVar = (p) obj7;
                g gVar = (g) obj6;
                q qVar = (q) obj5;
                kotlin.jvm.functions.a aVar = (kotlin.jvm.functions.a) obj4;
                d dVar = (d) obj;
                r rVar = (r) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= rVar.f(dVar) ? 4 : 2;
                }
                if (rVar.T(iIntValue & 1, (iIntValue & 19) != 18)) {
                    String str = (String) pVar.invoke(rVar, 0);
                    if (kotlin.text.k.d0(str)) {
                        androidx.compose.foundation.internal.b.c("Label must not be blank");
                    }
                    gVar.getClass();
                    c.a.a(str, Boolean.TRUE, dVar, qVar, aVar, rVar, Integer.valueOf((iIntValue << 9) & 7168));
                } else {
                    rVar.W();
                }
                return yVar;
            case 1:
                p0 p0Var = (p0) obj7;
                r0 r0Var = (r0) obj6;
                x xVar = (x) obj5;
                long j = xVar.b;
                androidx.compose.ui.text.input.q qVar2 = (androidx.compose.ui.text.input.q) obj4;
                androidx.compose.ui.r rVar2 = (androidx.compose.ui.r) obj;
                r rVar3 = (r) obj2;
                ((Integer) obj3).getClass();
                rVar3.b0(-84507373);
                boolean zBooleanValue = ((Boolean) rVar3.j(l1.w)).booleanValue();
                boolean zG = rVar3.g(zBooleanValue);
                Object objQ = rVar3.Q();
                if (zG || objQ == fVar) {
                    objQ = new androidx.compose.foundation.text.input.internal.l(zBooleanValue);
                    rVar3.l0(objQ);
                }
                androidx.compose.foundation.text.input.internal.l lVar = (androidx.compose.foundation.text.input.internal.l) objQ;
                boolean z2 = p0Var.a != 16;
                if (((Boolean) ((x1) ((r2) rVar3.j(l1.t))).a.getValue()).booleanValue() && r0Var.b() && l0.c(j) && z2) {
                    rVar3.b0(-707487962);
                    androidx.compose.ui.text.g gVar2 = xVar.a;
                    l0 l0Var = new l0(j);
                    boolean zH = rVar3.h(lVar);
                    Object objQ2 = rVar3.Q();
                    if (zH || objQ2 == fVar) {
                        objQ2 = new c1(lVar, null, i2);
                        rVar3.l0(objQ2);
                    }
                    j0.d(gVar2, l0Var, (p) objQ2, rVar3);
                    boolean zH2 = rVar3.h(lVar) | rVar3.h(qVar2) | rVar3.f(xVar) | rVar3.h(r0Var) | rVar3.f(p0Var);
                    Object objQ3 = rVar3.Q();
                    if (zH2 || objQ3 == fVar) {
                        objQ3 = new androidx.activity.compose.c(lVar, qVar2, xVar, r0Var, p0Var, 2);
                        rVar3.l0(objQ3);
                    }
                    objE = androidx.compose.ui.draw.h.e(rVar2, (kotlin.jvm.functions.l) objQ3);
                    z = false;
                    rVar3.p(false);
                } else {
                    z = false;
                    rVar3.b0(-705473241);
                    rVar3.p(false);
                    objE = o.b;
                }
                rVar3.p(z);
                return objE;
            case 2:
                ArrayList<kotlin.k> arrayList = (ArrayList) obj7;
                kotlin.jvm.functions.l lVar2 = (kotlin.jvm.functions.l) obj6;
                y0 y0Var = (y0) obj4;
                r rVar4 = (r) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((w) obj).getClass();
                if (rVar4.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    for (kotlin.k kVar : arrayList) {
                        Object obj8 = kVar.e;
                        androidx.compose.runtime.internal.f fVarC = androidx.compose.runtime.internal.k.c(-1096007537, new w1(6, (String) kVar.y, obj8, obj5), rVar4);
                        boolean zF = rVar4.f(lVar2) | rVar4.h(obj8);
                        Object objQ4 = rVar4.Q();
                        if (zF || objQ4 == fVar) {
                            objQ4 = new androidx.compose.foundation.gestures.g(i3, lVar2, obj8, y0Var);
                            rVar4.l0(objQ4);
                        }
                        androidx.compose.material3.p.b(fVarC, (kotlin.jvm.functions.a) objQ4, null, false, null, null, rVar4, 6);
                    }
                } else {
                    rVar4.W();
                }
                return yVar;
            case 3:
                ArrayList<kotlin.k> arrayList2 = (ArrayList) obj7;
                kotlin.jvm.functions.l lVar3 = (kotlin.jvm.functions.l) obj6;
                String str2 = (String) obj5;
                y0 y0Var2 = (y0) obj4;
                r rVar5 = (r) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((w) obj).getClass();
                if (rVar5.T(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    for (kotlin.k kVar2 : arrayList2) {
                        String str3 = (String) kVar2.e;
                        androidx.compose.runtime.internal.f fVarC2 = androidx.compose.runtime.internal.k.c(1666631618, new w1(i3, (String) kVar2.y, str3, str2), rVar5);
                        boolean zF2 = rVar5.f(lVar3) | rVar5.f(str3);
                        Object objQ5 = rVar5.Q();
                        if (zF2 || objQ5 == fVar) {
                            objQ5 = new androidx.compose.foundation.gestures.g(i4, lVar3, str3, y0Var2);
                            rVar5.l0(objQ5);
                        }
                        androidx.compose.material3.p.b(fVarC2, (kotlin.jvm.functions.a) objQ5, null, false, null, null, rVar5, 6);
                    }
                } else {
                    rVar5.W();
                }
                return yVar;
            default:
                k1 k1Var = (k1) obj7;
                String str4 = (String) obj6;
                t2 t2Var = (t2) obj5;
                y0 y0Var3 = (y0) obj4;
                r rVar6 = (r) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((w) obj).getClass();
                if (rVar6.T(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    String str5 = (String) t2Var.getValue();
                    if (str5 == null) {
                        str5 = "Built-in Player";
                    }
                    String str6 = str5;
                    androidx.compose.ui.graphics.vector.f fVarW = kotlin.math.a.w();
                    Object objQ6 = rVar6.Q();
                    if (objQ6 == fVar) {
                        objQ6 = new com.app.mlounge.ui.screens.settings.q(y0Var3, 11);
                        rVar6.l0(objQ6);
                    }
                    e0.o("External Player", str6, fVarW, null, (kotlin.jvm.functions.a) objQ6, rVar6, 24582, 8);
                    boolean zBooleanValue2 = ((Boolean) s.f(k1Var.h, Boolean.TRUE, null, rVar6, 48, 2).getValue()).booleanValue();
                    boolean zH3 = rVar6.h(k1Var);
                    Object objQ7 = rVar6.Q();
                    int i5 = 10;
                    if (zH3 || objQ7 == fVar) {
                        objQ7 = new u(k1Var, i5);
                        rVar6.l0(objQ7);
                    }
                    kotlin.jvm.functions.l lVar4 = (kotlin.jvm.functions.l) objQ7;
                    androidx.compose.ui.graphics.vector.f fVarB = kotlin.math.a.f;
                    if (fVarB == null) {
                        androidx.compose.ui.graphics.vector.e eVar = new androidx.compose.ui.graphics.vector.e("Filled.SkipNext", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i6 = h0.a;
                        p0 p0Var2 = new p0(t.b);
                        androidx.compose.ui.graphics.vector.g gVar3 = new androidx.compose.ui.graphics.vector.g(0);
                        gVar3.o(6.0f, 18.0f);
                        gVar3.n(8.5f, -6.0f);
                        gVar3.m(6.0f, 6.0f);
                        gVar3.s(12.0f);
                        gVar3.f();
                        gVar3.o(16.0f, 6.0f);
                        gVar3.s(12.0f);
                        gVar3.l(2.0f);
                        gVar3.r(6.0f);
                        gVar3.l(-2.0f);
                        gVar3.f();
                        androidx.compose.ui.graphics.vector.e.a(eVar, gVar3.a, 0, p0Var2);
                        fVarB = eVar.b();
                        kotlin.math.a.f = fVarB;
                    }
                    e0.r("Auto Play Next Episode", "Automatically find and play the next episode of a TV show", zBooleanValue2, lVar4, fVarB, false, rVar6, 54, 32);
                    y0 y0VarF = s.f(k1Var.i, Boolean.FALSE, null, rVar6, 48, 2);
                    String str7 = ((Boolean) y0VarF.getValue()).booleanValue() ? "Instantly play movies or episodes from the details screen.\nTo make this much faster, disable unused providers in Settings > Sources." : "Instantly play movies or episodes from the details screen";
                    boolean zBooleanValue3 = ((Boolean) y0VarF.getValue()).booleanValue();
                    boolean zH4 = rVar6.h(k1Var);
                    Object objQ8 = rVar6.Q();
                    if (zH4 || objQ8 == fVar) {
                        objQ8 = new u(k1Var, i4);
                        rVar6.l0(objQ8);
                    }
                    e0.r("One Click Play", str7, zBooleanValue3, (kotlin.jvm.functions.l) objQ8, com.google.firebase.b.u(), false, rVar6, 6, 32);
                    androidx.compose.ui.graphics.vector.f fVarV = n.v();
                    List list = e0.a;
                    ArrayList arrayList3 = new ArrayList(kotlin.collections.p.y(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList3.add((String) ((kotlin.k) it.next()).y);
                    }
                    boolean zH5 = rVar6.h(k1Var);
                    Object objQ9 = rVar6.Q();
                    if (zH5 || objQ9 == fVar) {
                        objQ9 = new u(k1Var, 12);
                        rVar6.l0(objQ9);
                    }
                    e0.n("Next Episode Button", "How soon before the end it appears in the player", fVarV, arrayList3, str4, (kotlin.jvm.functions.l) objQ9, rVar6, 54);
                } else {
                    rVar6.W();
                }
                return yVar;
        }
    }

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.e = i;
        this.y = obj;
        this.z = obj2;
        this.A = obj3;
        this.B = obj4;
    }
}
