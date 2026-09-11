package com.app.mlounge.ui.screens.settings;

import androidx.compose.material3.p3;
import androidx.compose.material3.t3;
import androidx.compose.material3.u3;
import androidx.compose.runtime.t2;
import androidx.compose.runtime.y0;
import androidx.lifecycle.l0;
import com.app.mlounge.ui.viewmodel.g1;
import com.app.mlounge.ui.viewmodel.k1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r implements kotlin.jvm.functions.q {
    public final /* synthetic */ t2 A;
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ t2 y;
    public final /* synthetic */ k1 z;

    public /* synthetic */ r(y0 y0Var, k1 k1Var, y0 y0Var2) {
        this.y = y0Var;
        this.z = k1Var;
        this.A = y0Var2;
    }

    @Override // kotlin.jvm.functions.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.e) {
            case 0:
                androidx.compose.runtime.r rVar = (androidx.compose.runtime.r) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((androidx.compose.foundation.layout.w) obj).getClass();
                if (rVar.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    rVar.b0(1997174172);
                    final k1 k1Var = this.z;
                    Iterator it = k1Var.H.iterator();
                    while (true) {
                        boolean zHasNext = it.hasNext();
                        t2 t2Var = this.y;
                        androidx.compose.runtime.f fVar = androidx.compose.runtime.m.a;
                        if (zHasNext) {
                            final String str = (String) it.next();
                            String str2 = !((Set) t2Var.getValue()).contains(str) ? "Enabled" : "Disabled";
                            boolean z = !((Set) t2Var.getValue()).contains(str);
                            boolean zH = rVar.h(k1Var) | rVar.f(str);
                            Object objQ = rVar.Q();
                            if (zH || objQ == fVar) {
                                final int i = 0;
                                objQ = new kotlin.jvm.functions.l() { // from class: com.app.mlounge.ui.screens.settings.t
                                    @Override // kotlin.jvm.functions.l
                                    public final Object invoke(Object obj4) {
                                        int i2 = i;
                                        ((Boolean) obj4).getClass();
                                        switch (i2) {
                                            case 0:
                                                String str3 = str;
                                                str3.getClass();
                                                k1 k1Var2 = k1Var;
                                                BuildersKt__Builders_commonKt.launch$default(l0.g(k1Var2), null, null, new g1(k1Var2, str3, null, 7), 3, null);
                                                break;
                                            default:
                                                String str4 = str;
                                                str4.getClass();
                                                k1 k1Var3 = k1Var;
                                                BuildersKt__Builders_commonKt.launch$default(l0.g(k1Var3), null, null, new g1(k1Var3, str4, null, 7), 3, null);
                                                break;
                                        }
                                        return kotlin.y.a;
                                    }
                                };
                                rVar.l0(objQ);
                            }
                            e0.r(str, str2, z, (kotlin.jvm.functions.l) objQ, coil3.network.g.o(), false, rVar, 0, 32);
                        } else {
                            rVar.p(false);
                            if (((Boolean) this.A.getValue()).booleanValue()) {
                                rVar.b0(1783383787);
                                for (final String str3 : k1Var.I) {
                                    String str4 = !((Set) t2Var.getValue()).contains(str3) ? "Enabled" : "Disabled";
                                    boolean z2 = !((Set) t2Var.getValue()).contains(str3);
                                    boolean zH2 = rVar.h(k1Var) | rVar.f(str3);
                                    Object objQ2 = rVar.Q();
                                    if (zH2 || objQ2 == fVar) {
                                        final int i2 = 1;
                                        objQ2 = new kotlin.jvm.functions.l() { // from class: com.app.mlounge.ui.screens.settings.t
                                            @Override // kotlin.jvm.functions.l
                                            public final Object invoke(Object obj4) {
                                                int i3 = i2;
                                                ((Boolean) obj4).getClass();
                                                switch (i3) {
                                                    case 0:
                                                        String str5 = str3;
                                                        str5.getClass();
                                                        k1 k1Var2 = k1Var;
                                                        BuildersKt__Builders_commonKt.launch$default(l0.g(k1Var2), null, null, new g1(k1Var2, str5, null, 7), 3, null);
                                                        break;
                                                    default:
                                                        String str6 = str3;
                                                        str6.getClass();
                                                        k1 k1Var3 = k1Var;
                                                        BuildersKt__Builders_commonKt.launch$default(l0.g(k1Var3), null, null, new g1(k1Var3, str6, null, 7), 3, null);
                                                        break;
                                                }
                                                return kotlin.y.a;
                                            }
                                        };
                                        rVar.l0(objQ2);
                                    }
                                    e0.r(str3, str4, z2, (kotlin.jvm.functions.l) objQ2, coil3.network.g.o(), false, rVar, 0, 32);
                                }
                                rVar.p(false);
                            } else {
                                rVar.b0(1783862365);
                                rVar.p(false);
                            }
                        }
                    }
                } else {
                    rVar.W();
                }
                return kotlin.y.a;
            default:
                androidx.compose.runtime.r rVar2 = (androidx.compose.runtime.r) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((androidx.compose.foundation.layout.w) obj).getClass();
                boolean z3 = true;
                if (rVar2.T(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    Set setW = kotlin.collections.n.W(new String[]{"Movies", "TV Shows", "Live TV", "Anime", "Music", "Games", "Favourites", "Downloads", "History", "Services"});
                    List list = com.app.mlounge.ui.navigation.w.f;
                    ArrayList arrayList = new ArrayList(kotlin.collections.p.y(list, 10));
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(((com.app.mlounge.ui.navigation.w) it2.next()).a);
                    }
                    t2 t2Var2 = this.y;
                    if (!((List) t2Var2.getValue()).isEmpty()) {
                        Set setO0 = kotlin.collections.o.o0((List) t2Var2.getValue());
                        List list2 = (List) t2Var2.getValue();
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj4 : arrayList) {
                            if (!setO0.contains((String) obj4)) {
                                arrayList2.add(obj4);
                            }
                        }
                        arrayList = kotlin.collections.o.X(list2, arrayList2);
                    }
                    List list3 = com.app.mlounge.ui.navigation.w.f;
                    int iU = kotlin.collections.a0.u(kotlin.collections.p.y(list3, 10));
                    if (iU < 16) {
                        iU = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iU);
                    for (Object obj5 : list3) {
                        linkedHashMap.put(((com.app.mlounge.ui.navigation.w) obj5).a, obj5);
                    }
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        com.app.mlounge.ui.navigation.w wVar = (com.app.mlounge.ui.navigation.w) linkedHashMap.get((String) it3.next());
                        if (wVar != null) {
                            arrayList3.add(wVar);
                        }
                    }
                    int size = arrayList3.size();
                    rVar2.b0(-1825435526);
                    int i3 = 0;
                    for (Object obj6 : arrayList3) {
                        int i4 = i3 + 1;
                        if (i3 < 0) {
                            com.google.common.base.c.w();
                            throw null;
                        }
                        final com.app.mlounge.ui.navigation.w wVar2 = (com.app.mlounge.ui.navigation.w) obj6;
                        String str5 = wVar2.a;
                        String str6 = wVar2.b;
                        rVar2.X(111434693, str5, null, 0);
                        boolean zContains = ((Set) this.A.getValue()).contains(str6) ^ z3;
                        boolean zContains2 = setW.contains(str6);
                        boolean z4 = i3 == 0 ? z3 : false;
                        boolean z5 = i3 == size + (-1) ? z3 : false;
                        final k1 k1Var2 = this.z;
                        boolean zH3 = rVar2.h(k1Var2) | rVar2.f(wVar2);
                        Object objQ3 = rVar2.Q();
                        androidx.compose.runtime.f fVar2 = androidx.compose.runtime.m.a;
                        if (zH3 || objQ3 == fVar2) {
                            final int i5 = 0;
                            objQ3 = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.screens.settings.b0
                                @Override // kotlin.jvm.functions.a
                                public final Object invoke() {
                                    switch (i5) {
                                        case 0:
                                            String str7 = wVar2.b;
                                            k1 k1Var3 = k1Var2;
                                            BuildersKt__Builders_commonKt.launch$default(l0.g(k1Var3), null, null, new g1(k1Var3, str7, null, 6), 3, null);
                                            break;
                                        case 1:
                                            String str8 = wVar2.a;
                                            k1 k1Var4 = k1Var2;
                                            BuildersKt__Builders_commonKt.launch$default(l0.g(k1Var4), null, null, new androidx.compose.foundation.g(k1Var4, str8, true, (kotlin.coroutines.d) null), 3, null);
                                            break;
                                        default:
                                            String str9 = wVar2.a;
                                            k1 k1Var5 = k1Var2;
                                            BuildersKt__Builders_commonKt.launch$default(l0.g(k1Var5), null, null, new androidx.compose.foundation.g(k1Var5, str9, false, (kotlin.coroutines.d) null), 3, null);
                                            break;
                                    }
                                    return kotlin.y.a;
                                }
                            };
                            rVar2.l0(objQ3);
                        }
                        kotlin.jvm.functions.a aVar = (kotlin.jvm.functions.a) objQ3;
                        boolean zH4 = rVar2.h(k1Var2) | rVar2.f(wVar2);
                        Object objQ4 = rVar2.Q();
                        if (zH4 || objQ4 == fVar2) {
                            final int i6 = 1;
                            objQ4 = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.screens.settings.b0
                                @Override // kotlin.jvm.functions.a
                                public final Object invoke() {
                                    switch (i6) {
                                        case 0:
                                            String str7 = wVar2.b;
                                            k1 k1Var3 = k1Var2;
                                            BuildersKt__Builders_commonKt.launch$default(l0.g(k1Var3), null, null, new g1(k1Var3, str7, null, 6), 3, null);
                                            break;
                                        case 1:
                                            String str8 = wVar2.a;
                                            k1 k1Var4 = k1Var2;
                                            BuildersKt__Builders_commonKt.launch$default(l0.g(k1Var4), null, null, new androidx.compose.foundation.g(k1Var4, str8, true, (kotlin.coroutines.d) null), 3, null);
                                            break;
                                        default:
                                            String str9 = wVar2.a;
                                            k1 k1Var5 = k1Var2;
                                            BuildersKt__Builders_commonKt.launch$default(l0.g(k1Var5), null, null, new androidx.compose.foundation.g(k1Var5, str9, false, (kotlin.coroutines.d) null), 3, null);
                                            break;
                                    }
                                    return kotlin.y.a;
                                }
                            };
                            rVar2.l0(objQ4);
                        }
                        kotlin.jvm.functions.a aVar2 = (kotlin.jvm.functions.a) objQ4;
                        boolean zH5 = rVar2.h(k1Var2) | rVar2.f(wVar2);
                        Object objQ5 = rVar2.Q();
                        if (zH5 || objQ5 == fVar2) {
                            final int i7 = 2;
                            objQ5 = new kotlin.jvm.functions.a() { // from class: com.app.mlounge.ui.screens.settings.b0
                                @Override // kotlin.jvm.functions.a
                                public final Object invoke() {
                                    switch (i7) {
                                        case 0:
                                            String str7 = wVar2.b;
                                            k1 k1Var3 = k1Var2;
                                            BuildersKt__Builders_commonKt.launch$default(l0.g(k1Var3), null, null, new g1(k1Var3, str7, null, 6), 3, null);
                                            break;
                                        case 1:
                                            String str8 = wVar2.a;
                                            k1 k1Var4 = k1Var2;
                                            BuildersKt__Builders_commonKt.launch$default(l0.g(k1Var4), null, null, new androidx.compose.foundation.g(k1Var4, str8, true, (kotlin.coroutines.d) null), 3, null);
                                            break;
                                        default:
                                            String str9 = wVar2.a;
                                            k1 k1Var5 = k1Var2;
                                            BuildersKt__Builders_commonKt.launch$default(l0.g(k1Var5), null, null, new androidx.compose.foundation.g(k1Var5, str9, false, (kotlin.coroutines.d) null), 3, null);
                                            break;
                                    }
                                    return kotlin.y.a;
                                }
                            };
                            rVar2.l0(objQ5);
                        }
                        e0.l(wVar2, zContains, zContains2, z4, z5, aVar, aVar2, (kotlin.jvm.functions.a) objQ5, rVar2, 0);
                        rVar2.p(false);
                        i3 = i4;
                        z3 = true;
                    }
                    rVar2.p(false);
                    p3.b("↑ First visible item is the default page on launch", androidx.compose.foundation.layout.b.p(androidx.compose.ui.o.b, 16, 8), com.app.mlounge.ui.theme.b.m, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((t3) rVar2.j(u3.a)).l, rVar2, 54, 0, 131064);
                } else {
                    rVar2.W();
                }
                return kotlin.y.a;
        }
    }

    public /* synthetic */ r(k1 k1Var, y0 y0Var, y0 y0Var2) {
        this.z = k1Var;
        this.y = y0Var;
        this.A = y0Var2;
    }
}
