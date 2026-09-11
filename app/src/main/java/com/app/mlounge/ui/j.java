package com.app.mlounge.ui;

import android.os.Bundle;
import androidx.compose.animation.core.v1;
import androidx.compose.runtime.t2;
import androidx.compose.runtime.y0;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j implements kotlin.jvm.functions.r {
    public final /* synthetic */ t2 A;
    public final /* synthetic */ y0 B;
    public final /* synthetic */ int e;
    public final /* synthetic */ androidx.navigation.y y;
    public final /* synthetic */ kotlin.jvm.functions.w z;

    public /* synthetic */ j(kotlin.jvm.functions.w wVar, androidx.navigation.y yVar, t2 t2Var, y0 y0Var) {
        this.e = 4;
        this.z = wVar;
        this.y = yVar;
        this.A = t2Var;
        this.B = y0Var;
    }

    @Override // kotlin.jvm.functions.r
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        final String string;
        final String string2;
        switch (this.e) {
            case 0:
                androidx.navigation.i iVar = (androidx.navigation.i) obj2;
                androidx.compose.runtime.r rVar = (androidx.compose.runtime.r) obj3;
                ((Integer) obj4).getClass();
                ((androidx.compose.animation.p) obj).getClass();
                iVar.getClass();
                Bundle bundleA = iVar.E.a();
                if (bundleA != null) {
                    final int i = bundleA.getInt("tvId");
                    final androidx.navigation.y yVar = this.y;
                    boolean zH = rVar.h(yVar);
                    Object objQ = rVar.Q();
                    androidx.compose.runtime.f fVar = androidx.compose.runtime.m.a;
                    if (zH || objQ == fVar) {
                        objQ = new androidx.navigation.k(yVar, 3);
                        rVar.l0(objQ);
                    }
                    kotlin.jvm.functions.a aVar = (kotlin.jvm.functions.a) objQ;
                    boolean zH2 = rVar.h(yVar);
                    Object objQ2 = rVar.Q();
                    final y0 y0Var = this.B;
                    if (zH2 || objQ2 == fVar) {
                        objQ2 = new d(yVar, y0Var, 7);
                        rVar.l0(objQ2);
                    }
                    kotlin.jvm.functions.l lVar = (kotlin.jvm.functions.l) objQ2;
                    boolean zH3 = rVar.h(yVar);
                    Object objQ3 = rVar.Q();
                    if (zH3 || objQ3 == fVar) {
                        objQ3 = new d(yVar, y0Var, 8);
                        rVar.l0(objQ3);
                    }
                    kotlin.jvm.functions.l lVar2 = (kotlin.jvm.functions.l) objQ3;
                    final kotlin.jvm.functions.w wVar = this.z;
                    boolean zF = rVar.f(wVar) | rVar.d(i);
                    Object objQ4 = rVar.Q();
                    if (zF || objQ4 == fVar) {
                        final int i2 = 1;
                        objQ4 = new kotlin.jvm.functions.q() { // from class: com.app.mlounge.ui.e
                            @Override // kotlin.jvm.functions.q
                            public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                switch (i2) {
                                    case 0:
                                        String str = (String) obj5;
                                        String str2 = (String) obj6;
                                        str.getClass();
                                        str2.getClass();
                                        Integer numValueOf = Integer.valueOf(i);
                                        wVar.b(str, str2, (Map) obj7, "movie", null, numValueOf, 0, 0, "");
                                        break;
                                    default:
                                        String str3 = (String) obj5;
                                        String str4 = (String) obj6;
                                        str3.getClass();
                                        str4.getClass();
                                        Integer numValueOf2 = Integer.valueOf(i);
                                        wVar.b(str3, str4, (Map) obj7, "tv", null, numValueOf2, 0, 0, "");
                                        break;
                                }
                                return kotlin.y.a;
                            }
                        };
                        rVar.l0(objQ4);
                    }
                    kotlin.jvm.functions.q qVar = (kotlin.jvm.functions.q) objQ4;
                    final t2 t2Var = this.A;
                    boolean zF2 = rVar.f(t2Var) | rVar.f(wVar) | rVar.h(yVar);
                    Object objQ5 = rVar.Q();
                    if (zF2 || objQ5 == fVar) {
                        objQ5 = new kotlin.jvm.functions.s() { // from class: com.app.mlounge.ui.h
                            @Override // kotlin.jvm.functions.s
                            public final Object c(Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
                                String str = (String) obj5;
                                String str2 = (String) obj6;
                                String str3 = (String) obj7;
                                Integer num = (Integer) obj8;
                                int iIntValue = num.intValue();
                                Integer num2 = (Integer) obj9;
                                int iIntValue2 = num2.intValue();
                                str.getClass();
                                str2.getClass();
                                str3.getClass();
                                if (((Boolean) t2Var.getValue()).booleanValue()) {
                                    Integer numQ = kotlin.text.r.Q(str2);
                                    wVar.b("", str3, null, "tv", null, Integer.valueOf(numQ != null ? numQ.intValue() : 0), num, num2, "");
                                } else {
                                    y0 y0Var2 = y0Var;
                                    if (!h0.b(y0Var2)) {
                                        y0Var2.setValue(Boolean.TRUE);
                                        androidx.navigation.y.b(yVar, com.app.mlounge.ui.navigation.s.b(com.app.mlounge.ui.navigation.s.g, str, str2, str3, iIntValue, iIntValue2, 32));
                                    }
                                }
                                return kotlin.y.a;
                            }
                        };
                        rVar.l0(objQ5);
                    }
                    kotlin.jvm.functions.s sVar = (kotlin.jvm.functions.s) objQ5;
                    boolean zH4 = rVar.h(yVar);
                    Object objQ6 = rVar.Q();
                    if (zH4 || objQ6 == fVar) {
                        objQ6 = new kotlin.jvm.functions.s() { // from class: com.app.mlounge.ui.i
                            @Override // kotlin.jvm.functions.s
                            public final Object c(Object obj5, Object obj6, Object obj7, Object obj8, Object obj9) {
                                String str = (String) obj5;
                                String str2 = (String) obj6;
                                String str3 = (String) obj7;
                                int iIntValue = ((Integer) obj8).intValue();
                                int iIntValue2 = ((Integer) obj9).intValue();
                                str.getClass();
                                str2.getClass();
                                str3.getClass();
                                y0 y0Var2 = y0Var;
                                if (!h0.b(y0Var2)) {
                                    y0Var2.setValue(Boolean.TRUE);
                                    com.app.mlounge.ui.navigation.s.g.getClass();
                                    androidx.navigation.y.b(yVar, com.app.mlounge.ui.navigation.s.a(str, str2, str3, iIntValue, "download", iIntValue2));
                                }
                                return kotlin.y.a;
                            }
                        };
                        rVar.l0(objQ6);
                    }
                    com.app.mlounge.ui.screens.tvshows.a.c(i, aVar, lVar, lVar2, qVar, sVar, (kotlin.jvm.functions.s) objQ6, null, rVar, 0);
                }
                break;
            case 1:
                androidx.navigation.i iVar2 = (androidx.navigation.i) obj2;
                androidx.compose.runtime.r rVar2 = (androidx.compose.runtime.r) obj3;
                ((Integer) obj4).getClass();
                ((androidx.compose.animation.p) obj).getClass();
                iVar2.getClass();
                Bundle bundleA2 = iVar2.E.a();
                if (bundleA2 != null && (string = bundleA2.getString("animeId")) != null) {
                    androidx.navigation.y yVar2 = this.y;
                    boolean zH5 = rVar2.h(yVar2);
                    Object objQ7 = rVar2.Q();
                    androidx.compose.runtime.f fVar2 = androidx.compose.runtime.m.a;
                    if (zH5 || objQ7 == fVar2) {
                        objQ7 = new androidx.navigation.k(yVar2, 8);
                        rVar2.l0(objQ7);
                    }
                    kotlin.jvm.functions.a aVar2 = (kotlin.jvm.functions.a) objQ7;
                    boolean zH6 = rVar2.h(yVar2);
                    Object objQ8 = rVar2.Q();
                    y0 y0Var2 = this.B;
                    if (zH6 || objQ8 == fVar2) {
                        objQ8 = new d(yVar2, y0Var2, 11);
                        rVar2.l0(objQ8);
                    }
                    kotlin.jvm.functions.l lVar3 = (kotlin.jvm.functions.l) objQ8;
                    final kotlin.jvm.functions.w wVar2 = this.z;
                    boolean zF3 = rVar2.f(wVar2) | rVar2.f(string);
                    Object objQ9 = rVar2.Q();
                    if (zF3 || objQ9 == fVar2) {
                        final int i3 = 1;
                        objQ9 = new kotlin.jvm.functions.q() { // from class: com.app.mlounge.ui.x
                            @Override // kotlin.jvm.functions.q
                            public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                switch (i3) {
                                    case 0:
                                        String str = (String) obj5;
                                        String str2 = (String) obj6;
                                        str.getClass();
                                        str2.getClass();
                                        wVar2.b(str, str2, (Map) obj7, "adult", null, 0, 0, 0, string);
                                        break;
                                    default:
                                        String str3 = (String) obj5;
                                        String str4 = (String) obj6;
                                        str3.getClass();
                                        str4.getClass();
                                        wVar2.b(str3, str4, (Map) obj7, "anime", null, 0, 0, 0, string);
                                        break;
                                }
                                return kotlin.y.a;
                            }
                        };
                        rVar2.l0(objQ9);
                    }
                    kotlin.jvm.functions.q qVar2 = (kotlin.jvm.functions.q) objQ9;
                    t2 t2Var2 = this.A;
                    boolean zF4 = rVar2.f(t2Var2) | rVar2.f(wVar2) | rVar2.h(yVar2);
                    Object objQ10 = rVar2.Q();
                    if (zF4 || objQ10 == fVar2) {
                        objQ10 = new j(wVar2, yVar2, t2Var2, y0Var2);
                        rVar2.l0(objQ10);
                    }
                    com.app.mlounge.ui.screens.anime.o.a(string, aVar2, lVar3, qVar2, (kotlin.jvm.functions.r) objQ10, null, rVar2, 0, 32);
                }
                break;
            case 2:
                androidx.navigation.i iVar3 = (androidx.navigation.i) obj2;
                androidx.compose.runtime.r rVar3 = (androidx.compose.runtime.r) obj3;
                ((Integer) obj4).getClass();
                ((androidx.compose.animation.p) obj).getClass();
                iVar3.getClass();
                Bundle bundleA3 = iVar3.E.a();
                if (bundleA3 != null && (string2 = bundleA3.getString("videoId")) != null) {
                    final androidx.navigation.y yVar3 = this.y;
                    boolean zH7 = rVar3.h(yVar3);
                    Object objQ11 = rVar3.Q();
                    androidx.compose.runtime.f fVar3 = androidx.compose.runtime.m.a;
                    if (zH7 || objQ11 == fVar3) {
                        objQ11 = new androidx.navigation.k(yVar3, 7);
                        rVar3.l0(objQ11);
                    }
                    kotlin.jvm.functions.a aVar3 = (kotlin.jvm.functions.a) objQ11;
                    final kotlin.jvm.functions.w wVar3 = this.z;
                    boolean zF5 = rVar3.f(wVar3) | rVar3.f(string2);
                    Object objQ12 = rVar3.Q();
                    if (zF5 || objQ12 == fVar3) {
                        final int i4 = 0;
                        objQ12 = new kotlin.jvm.functions.q() { // from class: com.app.mlounge.ui.x
                            @Override // kotlin.jvm.functions.q
                            public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                switch (i4) {
                                    case 0:
                                        String str = (String) obj5;
                                        String str2 = (String) obj6;
                                        str.getClass();
                                        str2.getClass();
                                        wVar3.b(str, str2, (Map) obj7, "adult", null, 0, 0, 0, string2);
                                        break;
                                    default:
                                        String str3 = (String) obj5;
                                        String str4 = (String) obj6;
                                        str3.getClass();
                                        str4.getClass();
                                        wVar3.b(str3, str4, (Map) obj7, "anime", null, 0, 0, 0, string2);
                                        break;
                                }
                                return kotlin.y.a;
                            }
                        };
                        rVar3.l0(objQ12);
                    }
                    kotlin.jvm.functions.q qVar3 = (kotlin.jvm.functions.q) objQ12;
                    final t2 t2Var3 = this.A;
                    boolean zF6 = rVar3.f(t2Var3) | rVar3.f(wVar3) | rVar3.h(yVar3);
                    Object objQ13 = rVar3.Q();
                    if (zF6 || objQ13 == fVar3) {
                        final int i5 = 1;
                        final y0 y0Var3 = this.B;
                        kotlin.jvm.functions.q qVar4 = new kotlin.jvm.functions.q() { // from class: com.app.mlounge.ui.g
                            @Override // kotlin.jvm.functions.q
                            public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                switch (i5) {
                                    case 0:
                                        String str = (String) obj5;
                                        String str2 = (String) obj6;
                                        String str3 = (String) obj7;
                                        str.getClass();
                                        str2.getClass();
                                        str3.getClass();
                                        if (((Boolean) t2Var3.getValue()).booleanValue()) {
                                            Integer numQ = kotlin.text.r.Q(str2);
                                            wVar3.b("", str3, null, "movie", null, Integer.valueOf(numQ != null ? numQ.intValue() : 0), 0, 0, "");
                                        } else {
                                            y0 y0Var4 = y0Var3;
                                            if (!h0.b(y0Var4)) {
                                                y0Var4.setValue(Boolean.TRUE);
                                                androidx.navigation.y.b(yVar3, com.app.mlounge.ui.navigation.s.b(com.app.mlounge.ui.navigation.s.g, str, str2, str3, 0, 0, 56));
                                            }
                                        }
                                        break;
                                    default:
                                        String str4 = (String) obj5;
                                        String str5 = (String) obj6;
                                        String str6 = (String) obj7;
                                        str4.getClass();
                                        str5.getClass();
                                        str6.getClass();
                                        if (((Boolean) t2Var3.getValue()).booleanValue()) {
                                            wVar3.b("", str6, null, "adult", null, 0, 0, 0, str5);
                                        } else {
                                            y0 y0Var5 = y0Var3;
                                            if (!h0.b(y0Var5)) {
                                                y0Var5.setValue(Boolean.TRUE);
                                                androidx.navigation.y.b(yVar3, com.app.mlounge.ui.navigation.s.b(com.app.mlounge.ui.navigation.s.g, str4, str5, str6, 0, 0, 56));
                                            }
                                        }
                                        break;
                                }
                                return kotlin.y.a;
                            }
                        };
                        rVar3.l0(qVar4);
                        objQ13 = qVar4;
                    }
                    com.app.mlounge.ui.screens.adult.i.a(string2, aVar3, qVar3, (kotlin.jvm.functions.q) objQ13, null, rVar3, 0);
                }
                break;
            case 3:
                androidx.navigation.i iVar4 = (androidx.navigation.i) obj2;
                androidx.compose.runtime.r rVar4 = (androidx.compose.runtime.r) obj3;
                ((Integer) obj4).getClass();
                ((androidx.compose.animation.p) obj).getClass();
                iVar4.getClass();
                Bundle bundleA4 = iVar4.E.a();
                if (bundleA4 != null) {
                    final int i6 = bundleA4.getInt("movieId");
                    final androidx.navigation.y yVar4 = this.y;
                    boolean zH8 = rVar4.h(yVar4);
                    Object objQ14 = rVar4.Q();
                    androidx.compose.runtime.f fVar4 = androidx.compose.runtime.m.a;
                    if (zH8 || objQ14 == fVar4) {
                        objQ14 = new androidx.navigation.k(yVar4, 2);
                        rVar4.l0(objQ14);
                    }
                    kotlin.jvm.functions.a aVar4 = (kotlin.jvm.functions.a) objQ14;
                    boolean zH9 = rVar4.h(yVar4);
                    Object objQ15 = rVar4.Q();
                    final y0 y0Var4 = this.B;
                    if (zH9 || objQ15 == fVar4) {
                        objQ15 = new d(yVar4, y0Var4, 4);
                        rVar4.l0(objQ15);
                    }
                    kotlin.jvm.functions.l lVar4 = (kotlin.jvm.functions.l) objQ15;
                    boolean zH10 = rVar4.h(yVar4);
                    Object objQ16 = rVar4.Q();
                    if (zH10 || objQ16 == fVar4) {
                        objQ16 = new d(yVar4, y0Var4, 5);
                        rVar4.l0(objQ16);
                    }
                    kotlin.jvm.functions.l lVar5 = (kotlin.jvm.functions.l) objQ16;
                    final kotlin.jvm.functions.w wVar4 = this.z;
                    boolean zF7 = rVar4.f(wVar4) | rVar4.d(i6);
                    Object objQ17 = rVar4.Q();
                    if (zF7 || objQ17 == fVar4) {
                        final int i7 = 0;
                        objQ17 = new kotlin.jvm.functions.q() { // from class: com.app.mlounge.ui.e
                            @Override // kotlin.jvm.functions.q
                            public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                switch (i7) {
                                    case 0:
                                        String str = (String) obj5;
                                        String str2 = (String) obj6;
                                        str.getClass();
                                        str2.getClass();
                                        Integer numValueOf = Integer.valueOf(i6);
                                        wVar4.b(str, str2, (Map) obj7, "movie", null, numValueOf, 0, 0, "");
                                        break;
                                    default:
                                        String str3 = (String) obj5;
                                        String str4 = (String) obj6;
                                        str3.getClass();
                                        str4.getClass();
                                        Integer numValueOf2 = Integer.valueOf(i6);
                                        wVar4.b(str3, str4, (Map) obj7, "tv", null, numValueOf2, 0, 0, "");
                                        break;
                                }
                                return kotlin.y.a;
                            }
                        };
                        rVar4.l0(objQ17);
                    }
                    kotlin.jvm.functions.q qVar5 = (kotlin.jvm.functions.q) objQ17;
                    final t2 t2Var4 = this.A;
                    boolean zF8 = rVar4.f(t2Var4) | rVar4.f(wVar4) | rVar4.h(yVar4);
                    Object objQ18 = rVar4.Q();
                    if (zF8 || objQ18 == fVar4) {
                        final int i8 = 0;
                        kotlin.jvm.functions.q qVar6 = new kotlin.jvm.functions.q() { // from class: com.app.mlounge.ui.g
                            @Override // kotlin.jvm.functions.q
                            public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                switch (i8) {
                                    case 0:
                                        String str = (String) obj5;
                                        String str2 = (String) obj6;
                                        String str3 = (String) obj7;
                                        str.getClass();
                                        str2.getClass();
                                        str3.getClass();
                                        if (((Boolean) t2Var4.getValue()).booleanValue()) {
                                            Integer numQ = kotlin.text.r.Q(str2);
                                            wVar4.b("", str3, null, "movie", null, Integer.valueOf(numQ != null ? numQ.intValue() : 0), 0, 0, "");
                                        } else {
                                            y0 y0Var5 = y0Var4;
                                            if (!h0.b(y0Var5)) {
                                                y0Var5.setValue(Boolean.TRUE);
                                                androidx.navigation.y.b(yVar4, com.app.mlounge.ui.navigation.s.b(com.app.mlounge.ui.navigation.s.g, str, str2, str3, 0, 0, 56));
                                            }
                                        }
                                        break;
                                    default:
                                        String str4 = (String) obj5;
                                        String str5 = (String) obj6;
                                        String str6 = (String) obj7;
                                        str4.getClass();
                                        str5.getClass();
                                        str6.getClass();
                                        if (((Boolean) t2Var4.getValue()).booleanValue()) {
                                            wVar4.b("", str6, null, "adult", null, 0, 0, 0, str5);
                                        } else {
                                            y0 y0Var6 = y0Var4;
                                            if (!h0.b(y0Var6)) {
                                                y0Var6.setValue(Boolean.TRUE);
                                                androidx.navigation.y.b(yVar4, com.app.mlounge.ui.navigation.s.b(com.app.mlounge.ui.navigation.s.g, str4, str5, str6, 0, 0, 56));
                                            }
                                        }
                                        break;
                                }
                                return kotlin.y.a;
                            }
                        };
                        rVar4.l0(qVar6);
                        objQ18 = qVar6;
                    }
                    kotlin.jvm.functions.q qVar7 = (kotlin.jvm.functions.q) objQ18;
                    boolean zH11 = rVar4.h(yVar4);
                    Object objQ19 = rVar4.Q();
                    if (zH11 || objQ19 == fVar4) {
                        objQ19 = new androidx.compose.foundation.contextmenu.i(4, yVar4, y0Var4);
                        rVar4.l0(objQ19);
                    }
                    kotlin.jvm.functions.q qVar8 = (kotlin.jvm.functions.q) objQ19;
                    boolean zH12 = rVar4.h(yVar4) | rVar4.d(i6);
                    Object objQ20 = rVar4.Q();
                    if (zH12 || objQ20 == fVar4) {
                        objQ20 = new v1(yVar4, i6, y0Var4, 9);
                        rVar4.l0(objQ20);
                    }
                    com.app.mlounge.ui.screens.movies.a.c(i6, aVar4, lVar4, lVar5, qVar5, qVar7, qVar8, (kotlin.jvm.functions.p) objQ20, null, rVar4, 0);
                }
                break;
            default:
                String str = (String) obj;
                String str2 = (String) obj2;
                String str3 = (String) obj3;
                Integer num = (Integer) obj4;
                int iIntValue = num.intValue();
                str.getClass();
                str2.getClass();
                str3.getClass();
                if (((Boolean) this.A.getValue()).booleanValue()) {
                    this.z.b("", str3, null, "anime", null, 0, 0, num, str2);
                } else {
                    y0 y0Var5 = this.B;
                    if (!h0.b(y0Var5)) {
                        y0Var5.setValue(Boolean.TRUE);
                        androidx.navigation.y.b(this.y, com.app.mlounge.ui.navigation.s.b(com.app.mlounge.ui.navigation.s.g, str, str2, str3, 0, iIntValue, 40));
                    }
                }
                break;
        }
        return kotlin.y.a;
    }

    public /* synthetic */ j(int i, y0 y0Var, t2 t2Var, androidx.navigation.y yVar, kotlin.jvm.functions.w wVar) {
        this.e = i;
        this.y = yVar;
        this.z = wVar;
        this.A = t2Var;
        this.B = y0Var;
    }
}
