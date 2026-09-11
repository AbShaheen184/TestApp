package com.app.mlounge.ui;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.runtime.t2;
import androidx.compose.runtime.y0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class z implements kotlin.jvm.functions.l {
    public final /* synthetic */ y0 A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ kotlin.d D;
    public final /* synthetic */ kotlin.d E;
    public final /* synthetic */ Object F;
    public final /* synthetic */ Object G;
    public final /* synthetic */ Object H;
    public final /* synthetic */ Object I;
    public final /* synthetic */ Object J;
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ kotlin.jvm.functions.r y;
    public final /* synthetic */ t2 z;

    public /* synthetic */ z(androidx.navigation.y yVar, kotlin.jvm.functions.r rVar, y0 y0Var, kotlin.jvm.functions.w wVar, y0 y0Var2, kotlin.jvm.functions.r rVar2, CoroutineScope coroutineScope, kotlin.jvm.functions.w wVar2, y0 y0Var3, y0 y0Var4, androidx.compose.ui.focus.y yVar2, y0 y0Var5) {
        this.B = yVar;
        this.y = rVar;
        this.A = y0Var;
        this.D = wVar;
        this.z = y0Var2;
        this.C = rVar2;
        this.I = coroutineScope;
        this.E = wVar2;
        this.F = y0Var3;
        this.G = y0Var4;
        this.J = yVar2;
        this.H = y0Var5;
    }

    @Override // kotlin.jvm.functions.l
    public final Object invoke(Object obj) {
        switch (this.e) {
            case 0:
                final androidx.navigation.y yVar = (androidx.navigation.y) this.B;
                kotlin.jvm.functions.w wVar = (kotlin.jvm.functions.w) this.D;
                kotlin.jvm.functions.r rVar = (kotlin.jvm.functions.r) this.C;
                CoroutineScope coroutineScope = (CoroutineScope) this.I;
                kotlin.jvm.functions.w wVar2 = (kotlin.jvm.functions.w) this.E;
                t2 t2Var = (t2) this.F;
                t2 t2Var2 = (t2) this.G;
                androidx.compose.ui.focus.y yVar2 = (androidx.compose.ui.focus.y) this.J;
                t2 t2Var3 = (t2) this.H;
                androidx.navigation.w wVar3 = (androidx.navigation.w) obj;
                wVar3.getClass();
                String str = com.app.mlounge.ui.navigation.p.g.a;
                kotlin.jvm.functions.r rVar2 = this.y;
                final y0 y0Var = this.A;
                androidx.room.r.g(wVar3, str, null, new androidx.compose.runtime.internal.f(2102418527, true, new f(yVar, rVar2, y0Var, 0)), 254);
                final int i = 3;
                androidx.room.r.g(wVar3, com.app.mlounge.ui.navigation.k.g.a, null, new androidx.compose.runtime.internal.f(1307961928, true, new kotlin.jvm.functions.r() { // from class: com.app.mlounge.ui.m
                    @Override // kotlin.jvm.functions.r
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                        String string;
                        String string2;
                        String string3;
                        String string4;
                        LinkedHashMap linkedHashMap;
                        String string5;
                        String string6;
                        String string7;
                        switch (i) {
                            case 0:
                                androidx.compose.runtime.r rVar3 = (androidx.compose.runtime.r) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                ((androidx.navigation.i) obj3).getClass();
                                androidx.navigation.y yVar3 = yVar;
                                boolean zH = rVar3.h(yVar3);
                                Object objQ = rVar3.Q();
                                if (zH || objQ == androidx.compose.runtime.m.a) {
                                    objQ = new d(yVar3, y0Var, 25);
                                    rVar3.l0(objQ);
                                }
                                com.app.mlounge.ui.screens.anime.o.b((kotlin.jvm.functions.l) objQ, null, rVar3, 0);
                                break;
                            case 1:
                                androidx.compose.runtime.r rVar4 = (androidx.compose.runtime.r) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                ((androidx.navigation.i) obj3).getClass();
                                androidx.navigation.y yVar4 = yVar;
                                boolean zH2 = rVar4.h(yVar4);
                                Object objQ2 = rVar4.Q();
                                if (zH2 || objQ2 == androidx.compose.runtime.m.a) {
                                    objQ2 = new d(yVar4, y0Var, 3);
                                    rVar4.l0(objQ2);
                                }
                                com.app.mlounge.ui.screens.adult.i.b((kotlin.jvm.functions.l) objQ2, null, rVar4, 0);
                                break;
                            case 2:
                                androidx.compose.runtime.r rVar5 = (androidx.compose.runtime.r) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                ((androidx.navigation.i) obj3).getClass();
                                androidx.navigation.y yVar5 = yVar;
                                boolean zH3 = rVar5.h(yVar5);
                                Object objQ3 = rVar5.Q();
                                y0 y0Var2 = y0Var;
                                androidx.compose.runtime.f fVar = androidx.compose.runtime.m.a;
                                if (zH3 || objQ3 == fVar) {
                                    objQ3 = new d(yVar5, y0Var2, 13);
                                    rVar5.l0(objQ3);
                                }
                                kotlin.jvm.functions.l lVar = (kotlin.jvm.functions.l) objQ3;
                                boolean zH4 = rVar5.h(yVar5);
                                Object objQ4 = rVar5.Q();
                                if (zH4 || objQ4 == fVar) {
                                    objQ4 = new d(yVar5, y0Var2, 14);
                                    rVar5.l0(objQ4);
                                }
                                com.app.mlounge.ui.screens.music.a.c(lVar, (kotlin.jvm.functions.l) objQ4, null, rVar5, 0);
                                break;
                            case 3:
                                androidx.compose.runtime.r rVar6 = (androidx.compose.runtime.r) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                ((androidx.navigation.i) obj3).getClass();
                                androidx.navigation.y yVar6 = yVar;
                                boolean zH5 = rVar6.h(yVar6);
                                Object objQ5 = rVar6.Q();
                                if (zH5 || objQ5 == androidx.compose.runtime.m.a) {
                                    objQ5 = new d(yVar6, y0Var, 10);
                                    rVar6.l0(objQ5);
                                }
                                com.app.mlounge.ui.screens.movies.a.d((kotlin.jvm.functions.l) objQ5, null, rVar6, 0);
                                break;
                            case 4:
                                androidx.navigation.i iVar = (androidx.navigation.i) obj3;
                                androidx.compose.runtime.r rVar7 = (androidx.compose.runtime.r) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                iVar.getClass();
                                Bundle bundleA = iVar.E.a();
                                if (bundleA != null && (string = bundleA.getString("artistUrl")) != null) {
                                    androidx.navigation.y yVar7 = yVar;
                                    boolean zH6 = rVar7.h(yVar7);
                                    Object objQ6 = rVar7.Q();
                                    androidx.compose.runtime.f fVar2 = androidx.compose.runtime.m.a;
                                    if (zH6 || objQ6 == fVar2) {
                                        objQ6 = new androidx.navigation.k(yVar7, 6);
                                        rVar7.l0(objQ6);
                                    }
                                    kotlin.jvm.functions.a aVar = (kotlin.jvm.functions.a) objQ6;
                                    boolean zH7 = rVar7.h(yVar7);
                                    Object objQ7 = rVar7.Q();
                                    if (zH7 || objQ7 == fVar2) {
                                        objQ7 = new d(yVar7, y0Var, 9);
                                        rVar7.l0(objQ7);
                                    }
                                    com.app.mlounge.ui.screens.music.a.b(string, aVar, (kotlin.jvm.functions.l) objQ7, null, rVar7, 0);
                                }
                                return kotlin.y.a;
                            case 5:
                                androidx.navigation.i iVar2 = (androidx.navigation.i) obj3;
                                androidx.compose.runtime.r rVar8 = (androidx.compose.runtime.r) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                iVar2.getClass();
                                androidx.navigation.internal.c cVar = iVar2.E;
                                Bundle bundleA2 = cVar.a();
                                if (bundleA2 == null || (string2 = bundleA2.getString("url")) == null) {
                                    string2 = "";
                                }
                                Bundle bundleA3 = cVar.a();
                                if (bundleA3 == null || (string3 = bundleA3.getString("title")) == null) {
                                    string3 = "";
                                }
                                Bundle bundleA4 = cVar.a();
                                if (bundleA4 == null || (string4 = bundleA4.getString("headers")) == null) {
                                    string4 = "";
                                }
                                if (kotlin.text.k.d0(string4)) {
                                    linkedHashMap = null;
                                } else {
                                    List listP0 = kotlin.text.k.p0(new String[]{"\n"}, string4, 6);
                                    int iU = kotlin.collections.a0.u(kotlin.collections.p.y(listP0, 10));
                                    if (iU < 16) {
                                        iU = 16;
                                    }
                                    linkedHashMap = new LinkedHashMap(iU);
                                    Iterator it = listP0.iterator();
                                    while (it.hasNext()) {
                                        List listP1 = kotlin.text.k.p0(new String[]{"="}, (String) it.next(), 2);
                                        Object obj6 = listP1.get(0);
                                        String str2 = (String) kotlin.collections.o.N(1, listP1);
                                        if (str2 == null) {
                                            str2 = "";
                                        }
                                        linkedHashMap.put(obj6, str2);
                                    }
                                }
                                LinkedHashMap linkedHashMap2 = linkedHashMap;
                                Bundle bundleA5 = cVar.a();
                                if (bundleA5 == null || (string5 = bundleA5.getString("contentType")) == null) {
                                    string5 = "tv";
                                }
                                Bundle bundleA6 = cVar.a();
                                if (bundleA6 == null || (string6 = bundleA6.getString("streamType")) == null) {
                                    string6 = "";
                                }
                                Bundle bundleA7 = cVar.a();
                                int i2 = bundleA7 != null ? bundleA7.getInt("tmdbId") : 0;
                                Bundle bundleA8 = cVar.a();
                                int i3 = bundleA8 != null ? bundleA8.getInt("season") : 0;
                                Bundle bundleA9 = cVar.a();
                                int i4 = bundleA9 != null ? bundleA9.getInt("episode") : 0;
                                Bundle bundleA10 = cVar.a();
                                String str3 = (bundleA10 == null || (string7 = bundleA10.getString("contentKey")) == null) ? "" : string7;
                                androidx.navigation.y yVar8 = yVar;
                                boolean zH8 = rVar8.h(yVar8);
                                Object objQ8 = rVar8.Q();
                                androidx.compose.runtime.f fVar3 = androidx.compose.runtime.m.a;
                                if (zH8 || objQ8 == fVar3) {
                                    objQ8 = new androidx.navigation.k(yVar8, 11);
                                    rVar8.l0(objQ8);
                                }
                                kotlin.jvm.functions.a aVar2 = (kotlin.jvm.functions.a) objQ8;
                                boolean zF = rVar8.f(string5) | rVar8.h(yVar8) | rVar8.f(str3);
                                Object objQ9 = rVar8.Q();
                                if (zF || objQ9 == fVar3) {
                                    objQ9 = new u(string5, yVar8, str3, y0Var);
                                    rVar8.l0(objQ9);
                                }
                                com.app.mlounge.ui.screens.player.i0.l(string2, string3, linkedHashMap2, string5, string6, i2, i3, i4, str3, aVar2, (kotlin.jvm.functions.r) objQ9, null, rVar8, 0);
                                break;
                            case 6:
                                androidx.compose.runtime.r rVar9 = (androidx.compose.runtime.r) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                ((androidx.navigation.i) obj3).getClass();
                                androidx.navigation.y yVar9 = yVar;
                                boolean zH9 = rVar9.h(yVar9);
                                Object objQ10 = rVar9.Q();
                                if (zH9 || objQ10 == androidx.compose.runtime.m.a) {
                                    objQ10 = new d(yVar9, y0Var, 6);
                                    rVar9.l0(objQ10);
                                }
                                com.app.mlounge.ui.screens.tvshows.a.d((kotlin.jvm.functions.l) objQ10, null, rVar9, 0);
                                break;
                            default:
                                androidx.compose.runtime.r rVar10 = (androidx.compose.runtime.r) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                ((androidx.navigation.i) obj3).getClass();
                                androidx.navigation.y yVar10 = yVar;
                                boolean zH10 = rVar10.h(yVar10);
                                Object objQ11 = rVar10.Q();
                                if (zH10 || objQ11 == androidx.compose.runtime.m.a) {
                                    objQ11 = new b(yVar10, y0Var, 1);
                                    rVar10.l0(objQ11);
                                }
                                com.app.mlounge.ui.screens.games.a.d((kotlin.jvm.functions.p) objQ11, null, rVar10, 0);
                                break;
                        }
                        return kotlin.y.a;
                    }
                }), 254);
                String str2 = com.app.mlounge.ui.navigation.j.g.a;
                List listP = com.google.common.base.c.p(androidx.navigation.f.f("movieId", new androidx.room.z(28)));
                t2 t2Var4 = this.z;
                androidx.room.r.g(wVar3, str2, listP, new androidx.compose.runtime.internal.f(-1692586521, true, new j(3, y0Var, t2Var4, yVar, wVar)), 252);
                final int i2 = 6;
                androidx.room.r.g(wVar3, com.app.mlounge.ui.navigation.u.g.a, null, new androidx.compose.runtime.internal.f(-398167674, true, new kotlin.jvm.functions.r() { // from class: com.app.mlounge.ui.m
                    @Override // kotlin.jvm.functions.r
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                        String string;
                        String string2;
                        String string3;
                        String string4;
                        LinkedHashMap linkedHashMap;
                        String string5;
                        String string6;
                        String string7;
                        switch (i2) {
                            case 0:
                                androidx.compose.runtime.r rVar3 = (androidx.compose.runtime.r) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                ((androidx.navigation.i) obj3).getClass();
                                androidx.navigation.y yVar3 = yVar;
                                boolean zH = rVar3.h(yVar3);
                                Object objQ = rVar3.Q();
                                if (zH || objQ == androidx.compose.runtime.m.a) {
                                    objQ = new d(yVar3, y0Var, 25);
                                    rVar3.l0(objQ);
                                }
                                com.app.mlounge.ui.screens.anime.o.b((kotlin.jvm.functions.l) objQ, null, rVar3, 0);
                                break;
                            case 1:
                                androidx.compose.runtime.r rVar4 = (androidx.compose.runtime.r) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                ((androidx.navigation.i) obj3).getClass();
                                androidx.navigation.y yVar4 = yVar;
                                boolean zH2 = rVar4.h(yVar4);
                                Object objQ2 = rVar4.Q();
                                if (zH2 || objQ2 == androidx.compose.runtime.m.a) {
                                    objQ2 = new d(yVar4, y0Var, 3);
                                    rVar4.l0(objQ2);
                                }
                                com.app.mlounge.ui.screens.adult.i.b((kotlin.jvm.functions.l) objQ2, null, rVar4, 0);
                                break;
                            case 2:
                                androidx.compose.runtime.r rVar5 = (androidx.compose.runtime.r) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                ((androidx.navigation.i) obj3).getClass();
                                androidx.navigation.y yVar5 = yVar;
                                boolean zH3 = rVar5.h(yVar5);
                                Object objQ3 = rVar5.Q();
                                y0 y0Var2 = y0Var;
                                androidx.compose.runtime.f fVar = androidx.compose.runtime.m.a;
                                if (zH3 || objQ3 == fVar) {
                                    objQ3 = new d(yVar5, y0Var2, 13);
                                    rVar5.l0(objQ3);
                                }
                                kotlin.jvm.functions.l lVar = (kotlin.jvm.functions.l) objQ3;
                                boolean zH4 = rVar5.h(yVar5);
                                Object objQ4 = rVar5.Q();
                                if (zH4 || objQ4 == fVar) {
                                    objQ4 = new d(yVar5, y0Var2, 14);
                                    rVar5.l0(objQ4);
                                }
                                com.app.mlounge.ui.screens.music.a.c(lVar, (kotlin.jvm.functions.l) objQ4, null, rVar5, 0);
                                break;
                            case 3:
                                androidx.compose.runtime.r rVar6 = (androidx.compose.runtime.r) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                ((androidx.navigation.i) obj3).getClass();
                                androidx.navigation.y yVar6 = yVar;
                                boolean zH5 = rVar6.h(yVar6);
                                Object objQ5 = rVar6.Q();
                                if (zH5 || objQ5 == androidx.compose.runtime.m.a) {
                                    objQ5 = new d(yVar6, y0Var, 10);
                                    rVar6.l0(objQ5);
                                }
                                com.app.mlounge.ui.screens.movies.a.d((kotlin.jvm.functions.l) objQ5, null, rVar6, 0);
                                break;
                            case 4:
                                androidx.navigation.i iVar = (androidx.navigation.i) obj3;
                                androidx.compose.runtime.r rVar7 = (androidx.compose.runtime.r) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                iVar.getClass();
                                Bundle bundleA = iVar.E.a();
                                if (bundleA != null && (string = bundleA.getString("artistUrl")) != null) {
                                    androidx.navigation.y yVar7 = yVar;
                                    boolean zH6 = rVar7.h(yVar7);
                                    Object objQ6 = rVar7.Q();
                                    androidx.compose.runtime.f fVar2 = androidx.compose.runtime.m.a;
                                    if (zH6 || objQ6 == fVar2) {
                                        objQ6 = new androidx.navigation.k(yVar7, 6);
                                        rVar7.l0(objQ6);
                                    }
                                    kotlin.jvm.functions.a aVar = (kotlin.jvm.functions.a) objQ6;
                                    boolean zH7 = rVar7.h(yVar7);
                                    Object objQ7 = rVar7.Q();
                                    if (zH7 || objQ7 == fVar2) {
                                        objQ7 = new d(yVar7, y0Var, 9);
                                        rVar7.l0(objQ7);
                                    }
                                    com.app.mlounge.ui.screens.music.a.b(string, aVar, (kotlin.jvm.functions.l) objQ7, null, rVar7, 0);
                                }
                                return kotlin.y.a;
                            case 5:
                                androidx.navigation.i iVar2 = (androidx.navigation.i) obj3;
                                androidx.compose.runtime.r rVar8 = (androidx.compose.runtime.r) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                iVar2.getClass();
                                androidx.navigation.internal.c cVar = iVar2.E;
                                Bundle bundleA2 = cVar.a();
                                if (bundleA2 == null || (string2 = bundleA2.getString("url")) == null) {
                                    string2 = "";
                                }
                                Bundle bundleA3 = cVar.a();
                                if (bundleA3 == null || (string3 = bundleA3.getString("title")) == null) {
                                    string3 = "";
                                }
                                Bundle bundleA4 = cVar.a();
                                if (bundleA4 == null || (string4 = bundleA4.getString("headers")) == null) {
                                    string4 = "";
                                }
                                if (kotlin.text.k.d0(string4)) {
                                    linkedHashMap = null;
                                } else {
                                    List listP0 = kotlin.text.k.p0(new String[]{"\n"}, string4, 6);
                                    int iU = kotlin.collections.a0.u(kotlin.collections.p.y(listP0, 10));
                                    if (iU < 16) {
                                        iU = 16;
                                    }
                                    linkedHashMap = new LinkedHashMap(iU);
                                    Iterator it = listP0.iterator();
                                    while (it.hasNext()) {
                                        List listP1 = kotlin.text.k.p0(new String[]{"="}, (String) it.next(), 2);
                                        Object obj6 = listP1.get(0);
                                        String str3 = (String) kotlin.collections.o.N(1, listP1);
                                        if (str3 == null) {
                                            str3 = "";
                                        }
                                        linkedHashMap.put(obj6, str3);
                                    }
                                }
                                LinkedHashMap linkedHashMap2 = linkedHashMap;
                                Bundle bundleA5 = cVar.a();
                                if (bundleA5 == null || (string5 = bundleA5.getString("contentType")) == null) {
                                    string5 = "tv";
                                }
                                Bundle bundleA6 = cVar.a();
                                if (bundleA6 == null || (string6 = bundleA6.getString("streamType")) == null) {
                                    string6 = "";
                                }
                                Bundle bundleA7 = cVar.a();
                                int i3 = bundleA7 != null ? bundleA7.getInt("tmdbId") : 0;
                                Bundle bundleA8 = cVar.a();
                                int i4 = bundleA8 != null ? bundleA8.getInt("season") : 0;
                                Bundle bundleA9 = cVar.a();
                                int i5 = bundleA9 != null ? bundleA9.getInt("episode") : 0;
                                Bundle bundleA10 = cVar.a();
                                String str4 = (bundleA10 == null || (string7 = bundleA10.getString("contentKey")) == null) ? "" : string7;
                                androidx.navigation.y yVar8 = yVar;
                                boolean zH8 = rVar8.h(yVar8);
                                Object objQ8 = rVar8.Q();
                                androidx.compose.runtime.f fVar3 = androidx.compose.runtime.m.a;
                                if (zH8 || objQ8 == fVar3) {
                                    objQ8 = new androidx.navigation.k(yVar8, 11);
                                    rVar8.l0(objQ8);
                                }
                                kotlin.jvm.functions.a aVar2 = (kotlin.jvm.functions.a) objQ8;
                                boolean zF = rVar8.f(string5) | rVar8.h(yVar8) | rVar8.f(str4);
                                Object objQ9 = rVar8.Q();
                                if (zF || objQ9 == fVar3) {
                                    objQ9 = new u(string5, yVar8, str4, y0Var);
                                    rVar8.l0(objQ9);
                                }
                                com.app.mlounge.ui.screens.player.i0.l(string2, string3, linkedHashMap2, string5, string6, i3, i4, i5, str4, aVar2, (kotlin.jvm.functions.r) objQ9, null, rVar8, 0);
                                break;
                            case 6:
                                androidx.compose.runtime.r rVar9 = (androidx.compose.runtime.r) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                ((androidx.navigation.i) obj3).getClass();
                                androidx.navigation.y yVar9 = yVar;
                                boolean zH9 = rVar9.h(yVar9);
                                Object objQ10 = rVar9.Q();
                                if (zH9 || objQ10 == androidx.compose.runtime.m.a) {
                                    objQ10 = new d(yVar9, y0Var, 6);
                                    rVar9.l0(objQ10);
                                }
                                com.app.mlounge.ui.screens.tvshows.a.d((kotlin.jvm.functions.l) objQ10, null, rVar9, 0);
                                break;
                            default:
                                androidx.compose.runtime.r rVar10 = (androidx.compose.runtime.r) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                ((androidx.navigation.i) obj3).getClass();
                                androidx.navigation.y yVar10 = yVar;
                                boolean zH10 = rVar10.h(yVar10);
                                Object objQ11 = rVar10.Q();
                                if (zH10 || objQ11 == androidx.compose.runtime.m.a) {
                                    objQ11 = new b(yVar10, y0Var, 1);
                                    rVar10.l0(objQ11);
                                }
                                com.app.mlounge.ui.screens.games.a.d((kotlin.jvm.functions.p) objQ11, null, rVar10, 0);
                                break;
                        }
                        return kotlin.y.a;
                    }
                }), 254);
                final int i3 = 7;
                androidx.room.r.g(wVar3, com.app.mlounge.ui.navigation.g.g.a, null, new androidx.compose.runtime.internal.f(896251173, true, new kotlin.jvm.functions.r() { // from class: com.app.mlounge.ui.m
                    @Override // kotlin.jvm.functions.r
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                        String string;
                        String string2;
                        String string3;
                        String string4;
                        LinkedHashMap linkedHashMap;
                        String string5;
                        String string6;
                        String string7;
                        switch (i3) {
                            case 0:
                                androidx.compose.runtime.r rVar3 = (androidx.compose.runtime.r) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                ((androidx.navigation.i) obj3).getClass();
                                androidx.navigation.y yVar3 = yVar;
                                boolean zH = rVar3.h(yVar3);
                                Object objQ = rVar3.Q();
                                if (zH || objQ == androidx.compose.runtime.m.a) {
                                    objQ = new d(yVar3, y0Var, 25);
                                    rVar3.l0(objQ);
                                }
                                com.app.mlounge.ui.screens.anime.o.b((kotlin.jvm.functions.l) objQ, null, rVar3, 0);
                                break;
                            case 1:
                                androidx.compose.runtime.r rVar4 = (androidx.compose.runtime.r) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                ((androidx.navigation.i) obj3).getClass();
                                androidx.navigation.y yVar4 = yVar;
                                boolean zH2 = rVar4.h(yVar4);
                                Object objQ2 = rVar4.Q();
                                if (zH2 || objQ2 == androidx.compose.runtime.m.a) {
                                    objQ2 = new d(yVar4, y0Var, 3);
                                    rVar4.l0(objQ2);
                                }
                                com.app.mlounge.ui.screens.adult.i.b((kotlin.jvm.functions.l) objQ2, null, rVar4, 0);
                                break;
                            case 2:
                                androidx.compose.runtime.r rVar5 = (androidx.compose.runtime.r) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                ((androidx.navigation.i) obj3).getClass();
                                androidx.navigation.y yVar5 = yVar;
                                boolean zH3 = rVar5.h(yVar5);
                                Object objQ3 = rVar5.Q();
                                y0 y0Var2 = y0Var;
                                androidx.compose.runtime.f fVar = androidx.compose.runtime.m.a;
                                if (zH3 || objQ3 == fVar) {
                                    objQ3 = new d(yVar5, y0Var2, 13);
                                    rVar5.l0(objQ3);
                                }
                                kotlin.jvm.functions.l lVar = (kotlin.jvm.functions.l) objQ3;
                                boolean zH4 = rVar5.h(yVar5);
                                Object objQ4 = rVar5.Q();
                                if (zH4 || objQ4 == fVar) {
                                    objQ4 = new d(yVar5, y0Var2, 14);
                                    rVar5.l0(objQ4);
                                }
                                com.app.mlounge.ui.screens.music.a.c(lVar, (kotlin.jvm.functions.l) objQ4, null, rVar5, 0);
                                break;
                            case 3:
                                androidx.compose.runtime.r rVar6 = (androidx.compose.runtime.r) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                ((androidx.navigation.i) obj3).getClass();
                                androidx.navigation.y yVar6 = yVar;
                                boolean zH5 = rVar6.h(yVar6);
                                Object objQ5 = rVar6.Q();
                                if (zH5 || objQ5 == androidx.compose.runtime.m.a) {
                                    objQ5 = new d(yVar6, y0Var, 10);
                                    rVar6.l0(objQ5);
                                }
                                com.app.mlounge.ui.screens.movies.a.d((kotlin.jvm.functions.l) objQ5, null, rVar6, 0);
                                break;
                            case 4:
                                androidx.navigation.i iVar = (androidx.navigation.i) obj3;
                                androidx.compose.runtime.r rVar7 = (androidx.compose.runtime.r) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                iVar.getClass();
                                Bundle bundleA = iVar.E.a();
                                if (bundleA != null && (string = bundleA.getString("artistUrl")) != null) {
                                    androidx.navigation.y yVar7 = yVar;
                                    boolean zH6 = rVar7.h(yVar7);
                                    Object objQ6 = rVar7.Q();
                                    androidx.compose.runtime.f fVar2 = androidx.compose.runtime.m.a;
                                    if (zH6 || objQ6 == fVar2) {
                                        objQ6 = new androidx.navigation.k(yVar7, 6);
                                        rVar7.l0(objQ6);
                                    }
                                    kotlin.jvm.functions.a aVar = (kotlin.jvm.functions.a) objQ6;
                                    boolean zH7 = rVar7.h(yVar7);
                                    Object objQ7 = rVar7.Q();
                                    if (zH7 || objQ7 == fVar2) {
                                        objQ7 = new d(yVar7, y0Var, 9);
                                        rVar7.l0(objQ7);
                                    }
                                    com.app.mlounge.ui.screens.music.a.b(string, aVar, (kotlin.jvm.functions.l) objQ7, null, rVar7, 0);
                                }
                                return kotlin.y.a;
                            case 5:
                                androidx.navigation.i iVar2 = (androidx.navigation.i) obj3;
                                androidx.compose.runtime.r rVar8 = (androidx.compose.runtime.r) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                iVar2.getClass();
                                androidx.navigation.internal.c cVar = iVar2.E;
                                Bundle bundleA2 = cVar.a();
                                if (bundleA2 == null || (string2 = bundleA2.getString("url")) == null) {
                                    string2 = "";
                                }
                                Bundle bundleA3 = cVar.a();
                                if (bundleA3 == null || (string3 = bundleA3.getString("title")) == null) {
                                    string3 = "";
                                }
                                Bundle bundleA4 = cVar.a();
                                if (bundleA4 == null || (string4 = bundleA4.getString("headers")) == null) {
                                    string4 = "";
                                }
                                if (kotlin.text.k.d0(string4)) {
                                    linkedHashMap = null;
                                } else {
                                    List listP0 = kotlin.text.k.p0(new String[]{"\n"}, string4, 6);
                                    int iU = kotlin.collections.a0.u(kotlin.collections.p.y(listP0, 10));
                                    if (iU < 16) {
                                        iU = 16;
                                    }
                                    linkedHashMap = new LinkedHashMap(iU);
                                    Iterator it = listP0.iterator();
                                    while (it.hasNext()) {
                                        List listP1 = kotlin.text.k.p0(new String[]{"="}, (String) it.next(), 2);
                                        Object obj6 = listP1.get(0);
                                        String str3 = (String) kotlin.collections.o.N(1, listP1);
                                        if (str3 == null) {
                                            str3 = "";
                                        }
                                        linkedHashMap.put(obj6, str3);
                                    }
                                }
                                LinkedHashMap linkedHashMap2 = linkedHashMap;
                                Bundle bundleA5 = cVar.a();
                                if (bundleA5 == null || (string5 = bundleA5.getString("contentType")) == null) {
                                    string5 = "tv";
                                }
                                Bundle bundleA6 = cVar.a();
                                if (bundleA6 == null || (string6 = bundleA6.getString("streamType")) == null) {
                                    string6 = "";
                                }
                                Bundle bundleA7 = cVar.a();
                                int i4 = bundleA7 != null ? bundleA7.getInt("tmdbId") : 0;
                                Bundle bundleA8 = cVar.a();
                                int i5 = bundleA8 != null ? bundleA8.getInt("season") : 0;
                                Bundle bundleA9 = cVar.a();
                                int i6 = bundleA9 != null ? bundleA9.getInt("episode") : 0;
                                Bundle bundleA10 = cVar.a();
                                String str4 = (bundleA10 == null || (string7 = bundleA10.getString("contentKey")) == null) ? "" : string7;
                                androidx.navigation.y yVar8 = yVar;
                                boolean zH8 = rVar8.h(yVar8);
                                Object objQ8 = rVar8.Q();
                                androidx.compose.runtime.f fVar3 = androidx.compose.runtime.m.a;
                                if (zH8 || objQ8 == fVar3) {
                                    objQ8 = new androidx.navigation.k(yVar8, 11);
                                    rVar8.l0(objQ8);
                                }
                                kotlin.jvm.functions.a aVar2 = (kotlin.jvm.functions.a) objQ8;
                                boolean zF = rVar8.f(string5) | rVar8.h(yVar8) | rVar8.f(str4);
                                Object objQ9 = rVar8.Q();
                                if (zF || objQ9 == fVar3) {
                                    objQ9 = new u(string5, yVar8, str4, y0Var);
                                    rVar8.l0(objQ9);
                                }
                                com.app.mlounge.ui.screens.player.i0.l(string2, string3, linkedHashMap2, string5, string6, i4, i5, i6, str4, aVar2, (kotlin.jvm.functions.r) objQ9, null, rVar8, 0);
                                break;
                            case 6:
                                androidx.compose.runtime.r rVar9 = (androidx.compose.runtime.r) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                ((androidx.navigation.i) obj3).getClass();
                                androidx.navigation.y yVar9 = yVar;
                                boolean zH9 = rVar9.h(yVar9);
                                Object objQ10 = rVar9.Q();
                                if (zH9 || objQ10 == androidx.compose.runtime.m.a) {
                                    objQ10 = new d(yVar9, y0Var, 6);
                                    rVar9.l0(objQ10);
                                }
                                com.app.mlounge.ui.screens.tvshows.a.d((kotlin.jvm.functions.l) objQ10, null, rVar9, 0);
                                break;
                            default:
                                androidx.compose.runtime.r rVar10 = (androidx.compose.runtime.r) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                ((androidx.navigation.i) obj3).getClass();
                                androidx.navigation.y yVar10 = yVar;
                                boolean zH10 = rVar10.h(yVar10);
                                Object objQ11 = rVar10.Q();
                                if (zH10 || objQ11 == androidx.compose.runtime.m.a) {
                                    objQ11 = new b(yVar10, y0Var, 1);
                                    rVar10.l0(objQ11);
                                }
                                com.app.mlounge.ui.screens.games.a.d((kotlin.jvm.functions.p) objQ11, null, rVar10, 0);
                                break;
                        }
                        return kotlin.y.a;
                    }
                }), 254);
                final int i4 = 1;
                androidx.room.r.g(wVar3, com.app.mlounge.ui.navigation.f.g.a, com.google.common.base.c.q(androidx.navigation.f.f("platform", new q(11)), androidx.navigation.f.f("gameSlug", new q(12))), new androidx.compose.runtime.internal.f(-2104297276, true, new kotlin.jvm.functions.r() { // from class: com.app.mlounge.ui.t
                    @Override // kotlin.jvm.functions.r
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                        String string;
                        String string2;
                        androidx.compose.animation.p pVar = (androidx.compose.animation.p) obj2;
                        androidx.navigation.i iVar = (androidx.navigation.i) obj3;
                        switch (i4) {
                            case 0:
                                androidx.compose.runtime.r rVar3 = (androidx.compose.runtime.r) obj4;
                                ((Integer) obj5).getClass();
                                pVar.getClass();
                                iVar.getClass();
                                Bundle bundleA = iVar.E.a();
                                if (bundleA != null) {
                                    int i5 = bundleA.getInt("personId");
                                    androidx.navigation.y yVar3 = yVar;
                                    boolean zH = rVar3.h(yVar3);
                                    Object objQ = rVar3.Q();
                                    androidx.compose.runtime.f fVar = androidx.compose.runtime.m.a;
                                    if (zH || objQ == fVar) {
                                        objQ = new androidx.navigation.k(yVar3, 10);
                                        rVar3.l0(objQ);
                                    }
                                    kotlin.jvm.functions.a aVar = (kotlin.jvm.functions.a) objQ;
                                    boolean zH2 = rVar3.h(yVar3);
                                    Object objQ2 = rVar3.Q();
                                    if (zH2 || objQ2 == fVar) {
                                        objQ2 = new l(yVar3, 2);
                                        rVar3.l0(objQ2);
                                    }
                                    kotlin.jvm.functions.l lVar = (kotlin.jvm.functions.l) objQ2;
                                    boolean zH3 = rVar3.h(yVar3);
                                    Object objQ3 = rVar3.Q();
                                    if (zH3 || objQ3 == fVar) {
                                        objQ3 = new l(yVar3, 3);
                                        rVar3.l0(objQ3);
                                    }
                                    com.app.mlounge.ui.screens.person.a.a(i5, aVar, lVar, (kotlin.jvm.functions.l) objQ3, null, rVar3, 0);
                                }
                                break;
                            default:
                                androidx.compose.runtime.r rVar4 = (androidx.compose.runtime.r) obj4;
                                ((Integer) obj5).getClass();
                                pVar.getClass();
                                iVar.getClass();
                                androidx.navigation.internal.c cVar = iVar.E;
                                Bundle bundleA2 = cVar.a();
                                if (bundleA2 == null || (string = bundleA2.getString("platform")) == null) {
                                    string = "snes";
                                }
                                String str3 = string;
                                Bundle bundleA3 = cVar.a();
                                if (bundleA3 != null && (string2 = bundleA3.getString("gameSlug")) != null) {
                                    androidx.navigation.y yVar4 = yVar;
                                    boolean zH4 = rVar4.h(yVar4);
                                    Object objQ4 = rVar4.Q();
                                    if (zH4 || objQ4 == androidx.compose.runtime.m.a) {
                                        objQ4 = new androidx.navigation.k(yVar4, 4);
                                        rVar4.l0(objQ4);
                                    }
                                    com.app.mlounge.ui.screens.games.a.a(string2, str3, (kotlin.jvm.functions.a) objQ4, null, rVar4, 0);
                                }
                                break;
                        }
                        return kotlin.y.a;
                    }
                }), 252);
                androidx.room.r.g(wVar3, com.app.mlounge.ui.navigation.t.g.a, com.google.common.base.c.p(androidx.navigation.f.f("tvId", new q(13))), new androidx.compose.runtime.internal.f(-809878429, true, new j(0, y0Var, t2Var4, yVar, wVar)), 252);
                androidx.room.r.g(wVar3, com.app.mlounge.ui.navigation.i.g.a, null, new androidx.compose.runtime.internal.f(484540418, true, new k(1, rVar)), 254);
                final int i5 = 0;
                androidx.room.r.g(wVar3, com.app.mlounge.ui.navigation.c.g.a, null, new androidx.compose.runtime.internal.f(1778959265, true, new kotlin.jvm.functions.r() { // from class: com.app.mlounge.ui.m
                    @Override // kotlin.jvm.functions.r
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                        String string;
                        String string2;
                        String string3;
                        String string4;
                        LinkedHashMap linkedHashMap;
                        String string5;
                        String string6;
                        String string7;
                        switch (i5) {
                            case 0:
                                androidx.compose.runtime.r rVar3 = (androidx.compose.runtime.r) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                ((androidx.navigation.i) obj3).getClass();
                                androidx.navigation.y yVar3 = yVar;
                                boolean zH = rVar3.h(yVar3);
                                Object objQ = rVar3.Q();
                                if (zH || objQ == androidx.compose.runtime.m.a) {
                                    objQ = new d(yVar3, y0Var, 25);
                                    rVar3.l0(objQ);
                                }
                                com.app.mlounge.ui.screens.anime.o.b((kotlin.jvm.functions.l) objQ, null, rVar3, 0);
                                break;
                            case 1:
                                androidx.compose.runtime.r rVar4 = (androidx.compose.runtime.r) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                ((androidx.navigation.i) obj3).getClass();
                                androidx.navigation.y yVar4 = yVar;
                                boolean zH2 = rVar4.h(yVar4);
                                Object objQ2 = rVar4.Q();
                                if (zH2 || objQ2 == androidx.compose.runtime.m.a) {
                                    objQ2 = new d(yVar4, y0Var, 3);
                                    rVar4.l0(objQ2);
                                }
                                com.app.mlounge.ui.screens.adult.i.b((kotlin.jvm.functions.l) objQ2, null, rVar4, 0);
                                break;
                            case 2:
                                androidx.compose.runtime.r rVar5 = (androidx.compose.runtime.r) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                ((androidx.navigation.i) obj3).getClass();
                                androidx.navigation.y yVar5 = yVar;
                                boolean zH3 = rVar5.h(yVar5);
                                Object objQ3 = rVar5.Q();
                                y0 y0Var2 = y0Var;
                                androidx.compose.runtime.f fVar = androidx.compose.runtime.m.a;
                                if (zH3 || objQ3 == fVar) {
                                    objQ3 = new d(yVar5, y0Var2, 13);
                                    rVar5.l0(objQ3);
                                }
                                kotlin.jvm.functions.l lVar = (kotlin.jvm.functions.l) objQ3;
                                boolean zH4 = rVar5.h(yVar5);
                                Object objQ4 = rVar5.Q();
                                if (zH4 || objQ4 == fVar) {
                                    objQ4 = new d(yVar5, y0Var2, 14);
                                    rVar5.l0(objQ4);
                                }
                                com.app.mlounge.ui.screens.music.a.c(lVar, (kotlin.jvm.functions.l) objQ4, null, rVar5, 0);
                                break;
                            case 3:
                                androidx.compose.runtime.r rVar6 = (androidx.compose.runtime.r) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                ((androidx.navigation.i) obj3).getClass();
                                androidx.navigation.y yVar6 = yVar;
                                boolean zH5 = rVar6.h(yVar6);
                                Object objQ5 = rVar6.Q();
                                if (zH5 || objQ5 == androidx.compose.runtime.m.a) {
                                    objQ5 = new d(yVar6, y0Var, 10);
                                    rVar6.l0(objQ5);
                                }
                                com.app.mlounge.ui.screens.movies.a.d((kotlin.jvm.functions.l) objQ5, null, rVar6, 0);
                                break;
                            case 4:
                                androidx.navigation.i iVar = (androidx.navigation.i) obj3;
                                androidx.compose.runtime.r rVar7 = (androidx.compose.runtime.r) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                iVar.getClass();
                                Bundle bundleA = iVar.E.a();
                                if (bundleA != null && (string = bundleA.getString("artistUrl")) != null) {
                                    androidx.navigation.y yVar7 = yVar;
                                    boolean zH6 = rVar7.h(yVar7);
                                    Object objQ6 = rVar7.Q();
                                    androidx.compose.runtime.f fVar2 = androidx.compose.runtime.m.a;
                                    if (zH6 || objQ6 == fVar2) {
                                        objQ6 = new androidx.navigation.k(yVar7, 6);
                                        rVar7.l0(objQ6);
                                    }
                                    kotlin.jvm.functions.a aVar = (kotlin.jvm.functions.a) objQ6;
                                    boolean zH7 = rVar7.h(yVar7);
                                    Object objQ7 = rVar7.Q();
                                    if (zH7 || objQ7 == fVar2) {
                                        objQ7 = new d(yVar7, y0Var, 9);
                                        rVar7.l0(objQ7);
                                    }
                                    com.app.mlounge.ui.screens.music.a.b(string, aVar, (kotlin.jvm.functions.l) objQ7, null, rVar7, 0);
                                }
                                return kotlin.y.a;
                            case 5:
                                androidx.navigation.i iVar2 = (androidx.navigation.i) obj3;
                                androidx.compose.runtime.r rVar8 = (androidx.compose.runtime.r) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                iVar2.getClass();
                                androidx.navigation.internal.c cVar = iVar2.E;
                                Bundle bundleA2 = cVar.a();
                                if (bundleA2 == null || (string2 = bundleA2.getString("url")) == null) {
                                    string2 = "";
                                }
                                Bundle bundleA3 = cVar.a();
                                if (bundleA3 == null || (string3 = bundleA3.getString("title")) == null) {
                                    string3 = "";
                                }
                                Bundle bundleA4 = cVar.a();
                                if (bundleA4 == null || (string4 = bundleA4.getString("headers")) == null) {
                                    string4 = "";
                                }
                                if (kotlin.text.k.d0(string4)) {
                                    linkedHashMap = null;
                                } else {
                                    List listP0 = kotlin.text.k.p0(new String[]{"\n"}, string4, 6);
                                    int iU = kotlin.collections.a0.u(kotlin.collections.p.y(listP0, 10));
                                    if (iU < 16) {
                                        iU = 16;
                                    }
                                    linkedHashMap = new LinkedHashMap(iU);
                                    Iterator it = listP0.iterator();
                                    while (it.hasNext()) {
                                        List listP1 = kotlin.text.k.p0(new String[]{"="}, (String) it.next(), 2);
                                        Object obj6 = listP1.get(0);
                                        String str3 = (String) kotlin.collections.o.N(1, listP1);
                                        if (str3 == null) {
                                            str3 = "";
                                        }
                                        linkedHashMap.put(obj6, str3);
                                    }
                                }
                                LinkedHashMap linkedHashMap2 = linkedHashMap;
                                Bundle bundleA5 = cVar.a();
                                if (bundleA5 == null || (string5 = bundleA5.getString("contentType")) == null) {
                                    string5 = "tv";
                                }
                                Bundle bundleA6 = cVar.a();
                                if (bundleA6 == null || (string6 = bundleA6.getString("streamType")) == null) {
                                    string6 = "";
                                }
                                Bundle bundleA7 = cVar.a();
                                int i6 = bundleA7 != null ? bundleA7.getInt("tmdbId") : 0;
                                Bundle bundleA8 = cVar.a();
                                int i7 = bundleA8 != null ? bundleA8.getInt("season") : 0;
                                Bundle bundleA9 = cVar.a();
                                int i8 = bundleA9 != null ? bundleA9.getInt("episode") : 0;
                                Bundle bundleA10 = cVar.a();
                                String str4 = (bundleA10 == null || (string7 = bundleA10.getString("contentKey")) == null) ? "" : string7;
                                androidx.navigation.y yVar8 = yVar;
                                boolean zH8 = rVar8.h(yVar8);
                                Object objQ8 = rVar8.Q();
                                androidx.compose.runtime.f fVar3 = androidx.compose.runtime.m.a;
                                if (zH8 || objQ8 == fVar3) {
                                    objQ8 = new androidx.navigation.k(yVar8, 11);
                                    rVar8.l0(objQ8);
                                }
                                kotlin.jvm.functions.a aVar2 = (kotlin.jvm.functions.a) objQ8;
                                boolean zF = rVar8.f(string5) | rVar8.h(yVar8) | rVar8.f(str4);
                                Object objQ9 = rVar8.Q();
                                if (zF || objQ9 == fVar3) {
                                    objQ9 = new u(string5, yVar8, str4, y0Var);
                                    rVar8.l0(objQ9);
                                }
                                com.app.mlounge.ui.screens.player.i0.l(string2, string3, linkedHashMap2, string5, string6, i6, i7, i8, str4, aVar2, (kotlin.jvm.functions.r) objQ9, null, rVar8, 0);
                                break;
                            case 6:
                                androidx.compose.runtime.r rVar9 = (androidx.compose.runtime.r) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                ((androidx.navigation.i) obj3).getClass();
                                androidx.navigation.y yVar9 = yVar;
                                boolean zH9 = rVar9.h(yVar9);
                                Object objQ10 = rVar9.Q();
                                if (zH9 || objQ10 == androidx.compose.runtime.m.a) {
                                    objQ10 = new d(yVar9, y0Var, 6);
                                    rVar9.l0(objQ10);
                                }
                                com.app.mlounge.ui.screens.tvshows.a.d((kotlin.jvm.functions.l) objQ10, null, rVar9, 0);
                                break;
                            default:
                                androidx.compose.runtime.r rVar10 = (androidx.compose.runtime.r) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                ((androidx.navigation.i) obj3).getClass();
                                androidx.navigation.y yVar10 = yVar;
                                boolean zH10 = rVar10.h(yVar10);
                                Object objQ11 = rVar10.Q();
                                if (zH10 || objQ11 == androidx.compose.runtime.m.a) {
                                    objQ11 = new b(yVar10, y0Var, 1);
                                    rVar10.l0(objQ11);
                                }
                                com.app.mlounge.ui.screens.games.a.d((kotlin.jvm.functions.p) objQ11, null, rVar10, 0);
                                break;
                        }
                        return kotlin.y.a;
                    }
                }), 254);
                androidx.room.r.g(wVar3, com.app.mlounge.ui.navigation.d.g.a, com.google.common.base.c.p(androidx.navigation.f.f("animeId", new androidx.room.z(20))), new androidx.compose.runtime.internal.f(-1221589184, true, new j(1, y0Var, t2Var4, yVar, wVar)), 252);
                final int i6 = 1;
                androidx.room.r.g(wVar3, com.app.mlounge.ui.navigation.a.g.a, null, new androidx.compose.runtime.internal.f(-770957612, true, new kotlin.jvm.functions.r() { // from class: com.app.mlounge.ui.m
                    @Override // kotlin.jvm.functions.r
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                        String string;
                        String string2;
                        String string3;
                        String string4;
                        LinkedHashMap linkedHashMap;
                        String string5;
                        String string6;
                        String string7;
                        switch (i6) {
                            case 0:
                                androidx.compose.runtime.r rVar3 = (androidx.compose.runtime.r) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                ((androidx.navigation.i) obj3).getClass();
                                androidx.navigation.y yVar3 = yVar;
                                boolean zH = rVar3.h(yVar3);
                                Object objQ = rVar3.Q();
                                if (zH || objQ == androidx.compose.runtime.m.a) {
                                    objQ = new d(yVar3, y0Var, 25);
                                    rVar3.l0(objQ);
                                }
                                com.app.mlounge.ui.screens.anime.o.b((kotlin.jvm.functions.l) objQ, null, rVar3, 0);
                                break;
                            case 1:
                                androidx.compose.runtime.r rVar4 = (androidx.compose.runtime.r) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                ((androidx.navigation.i) obj3).getClass();
                                androidx.navigation.y yVar4 = yVar;
                                boolean zH2 = rVar4.h(yVar4);
                                Object objQ2 = rVar4.Q();
                                if (zH2 || objQ2 == androidx.compose.runtime.m.a) {
                                    objQ2 = new d(yVar4, y0Var, 3);
                                    rVar4.l0(objQ2);
                                }
                                com.app.mlounge.ui.screens.adult.i.b((kotlin.jvm.functions.l) objQ2, null, rVar4, 0);
                                break;
                            case 2:
                                androidx.compose.runtime.r rVar5 = (androidx.compose.runtime.r) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                ((androidx.navigation.i) obj3).getClass();
                                androidx.navigation.y yVar5 = yVar;
                                boolean zH3 = rVar5.h(yVar5);
                                Object objQ3 = rVar5.Q();
                                y0 y0Var2 = y0Var;
                                androidx.compose.runtime.f fVar = androidx.compose.runtime.m.a;
                                if (zH3 || objQ3 == fVar) {
                                    objQ3 = new d(yVar5, y0Var2, 13);
                                    rVar5.l0(objQ3);
                                }
                                kotlin.jvm.functions.l lVar = (kotlin.jvm.functions.l) objQ3;
                                boolean zH4 = rVar5.h(yVar5);
                                Object objQ4 = rVar5.Q();
                                if (zH4 || objQ4 == fVar) {
                                    objQ4 = new d(yVar5, y0Var2, 14);
                                    rVar5.l0(objQ4);
                                }
                                com.app.mlounge.ui.screens.music.a.c(lVar, (kotlin.jvm.functions.l) objQ4, null, rVar5, 0);
                                break;
                            case 3:
                                androidx.compose.runtime.r rVar6 = (androidx.compose.runtime.r) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                ((androidx.navigation.i) obj3).getClass();
                                androidx.navigation.y yVar6 = yVar;
                                boolean zH5 = rVar6.h(yVar6);
                                Object objQ5 = rVar6.Q();
                                if (zH5 || objQ5 == androidx.compose.runtime.m.a) {
                                    objQ5 = new d(yVar6, y0Var, 10);
                                    rVar6.l0(objQ5);
                                }
                                com.app.mlounge.ui.screens.movies.a.d((kotlin.jvm.functions.l) objQ5, null, rVar6, 0);
                                break;
                            case 4:
                                androidx.navigation.i iVar = (androidx.navigation.i) obj3;
                                androidx.compose.runtime.r rVar7 = (androidx.compose.runtime.r) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                iVar.getClass();
                                Bundle bundleA = iVar.E.a();
                                if (bundleA != null && (string = bundleA.getString("artistUrl")) != null) {
                                    androidx.navigation.y yVar7 = yVar;
                                    boolean zH6 = rVar7.h(yVar7);
                                    Object objQ6 = rVar7.Q();
                                    androidx.compose.runtime.f fVar2 = androidx.compose.runtime.m.a;
                                    if (zH6 || objQ6 == fVar2) {
                                        objQ6 = new androidx.navigation.k(yVar7, 6);
                                        rVar7.l0(objQ6);
                                    }
                                    kotlin.jvm.functions.a aVar = (kotlin.jvm.functions.a) objQ6;
                                    boolean zH7 = rVar7.h(yVar7);
                                    Object objQ7 = rVar7.Q();
                                    if (zH7 || objQ7 == fVar2) {
                                        objQ7 = new d(yVar7, y0Var, 9);
                                        rVar7.l0(objQ7);
                                    }
                                    com.app.mlounge.ui.screens.music.a.b(string, aVar, (kotlin.jvm.functions.l) objQ7, null, rVar7, 0);
                                }
                                return kotlin.y.a;
                            case 5:
                                androidx.navigation.i iVar2 = (androidx.navigation.i) obj3;
                                androidx.compose.runtime.r rVar8 = (androidx.compose.runtime.r) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                iVar2.getClass();
                                androidx.navigation.internal.c cVar = iVar2.E;
                                Bundle bundleA2 = cVar.a();
                                if (bundleA2 == null || (string2 = bundleA2.getString("url")) == null) {
                                    string2 = "";
                                }
                                Bundle bundleA3 = cVar.a();
                                if (bundleA3 == null || (string3 = bundleA3.getString("title")) == null) {
                                    string3 = "";
                                }
                                Bundle bundleA4 = cVar.a();
                                if (bundleA4 == null || (string4 = bundleA4.getString("headers")) == null) {
                                    string4 = "";
                                }
                                if (kotlin.text.k.d0(string4)) {
                                    linkedHashMap = null;
                                } else {
                                    List listP0 = kotlin.text.k.p0(new String[]{"\n"}, string4, 6);
                                    int iU = kotlin.collections.a0.u(kotlin.collections.p.y(listP0, 10));
                                    if (iU < 16) {
                                        iU = 16;
                                    }
                                    linkedHashMap = new LinkedHashMap(iU);
                                    Iterator it = listP0.iterator();
                                    while (it.hasNext()) {
                                        List listP1 = kotlin.text.k.p0(new String[]{"="}, (String) it.next(), 2);
                                        Object obj6 = listP1.get(0);
                                        String str3 = (String) kotlin.collections.o.N(1, listP1);
                                        if (str3 == null) {
                                            str3 = "";
                                        }
                                        linkedHashMap.put(obj6, str3);
                                    }
                                }
                                LinkedHashMap linkedHashMap2 = linkedHashMap;
                                Bundle bundleA5 = cVar.a();
                                if (bundleA5 == null || (string5 = bundleA5.getString("contentType")) == null) {
                                    string5 = "tv";
                                }
                                Bundle bundleA6 = cVar.a();
                                if (bundleA6 == null || (string6 = bundleA6.getString("streamType")) == null) {
                                    string6 = "";
                                }
                                Bundle bundleA7 = cVar.a();
                                int i7 = bundleA7 != null ? bundleA7.getInt("tmdbId") : 0;
                                Bundle bundleA8 = cVar.a();
                                int i8 = bundleA8 != null ? bundleA8.getInt("season") : 0;
                                Bundle bundleA9 = cVar.a();
                                int i9 = bundleA9 != null ? bundleA9.getInt("episode") : 0;
                                Bundle bundleA10 = cVar.a();
                                String str4 = (bundleA10 == null || (string7 = bundleA10.getString("contentKey")) == null) ? "" : string7;
                                androidx.navigation.y yVar8 = yVar;
                                boolean zH8 = rVar8.h(yVar8);
                                Object objQ8 = rVar8.Q();
                                androidx.compose.runtime.f fVar3 = androidx.compose.runtime.m.a;
                                if (zH8 || objQ8 == fVar3) {
                                    objQ8 = new androidx.navigation.k(yVar8, 11);
                                    rVar8.l0(objQ8);
                                }
                                kotlin.jvm.functions.a aVar2 = (kotlin.jvm.functions.a) objQ8;
                                boolean zF = rVar8.f(string5) | rVar8.h(yVar8) | rVar8.f(str4);
                                Object objQ9 = rVar8.Q();
                                if (zF || objQ9 == fVar3) {
                                    objQ9 = new u(string5, yVar8, str4, y0Var);
                                    rVar8.l0(objQ9);
                                }
                                com.app.mlounge.ui.screens.player.i0.l(string2, string3, linkedHashMap2, string5, string6, i7, i8, i9, str4, aVar2, (kotlin.jvm.functions.r) objQ9, null, rVar8, 0);
                                break;
                            case 6:
                                androidx.compose.runtime.r rVar9 = (androidx.compose.runtime.r) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                ((androidx.navigation.i) obj3).getClass();
                                androidx.navigation.y yVar9 = yVar;
                                boolean zH9 = rVar9.h(yVar9);
                                Object objQ10 = rVar9.Q();
                                if (zH9 || objQ10 == androidx.compose.runtime.m.a) {
                                    objQ10 = new d(yVar9, y0Var, 6);
                                    rVar9.l0(objQ10);
                                }
                                com.app.mlounge.ui.screens.tvshows.a.d((kotlin.jvm.functions.l) objQ10, null, rVar9, 0);
                                break;
                            default:
                                androidx.compose.runtime.r rVar10 = (androidx.compose.runtime.r) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                ((androidx.navigation.i) obj3).getClass();
                                androidx.navigation.y yVar10 = yVar;
                                boolean zH10 = rVar10.h(yVar10);
                                Object objQ11 = rVar10.Q();
                                if (zH10 || objQ11 == androidx.compose.runtime.m.a) {
                                    objQ11 = new b(yVar10, y0Var, 1);
                                    rVar10.l0(objQ11);
                                }
                                com.app.mlounge.ui.screens.games.a.d((kotlin.jvm.functions.p) objQ11, null, rVar10, 0);
                                break;
                        }
                        return kotlin.y.a;
                    }
                }), 254);
                androidx.room.r.g(wVar3, com.app.mlounge.ui.navigation.b.g.a, com.google.common.base.c.p(androidx.navigation.f.f("videoId", new androidx.room.z(21))), new androidx.compose.runtime.internal.f(523461235, true, new j(2, y0Var, t2Var4, yVar, wVar)), 252);
                final int i7 = 2;
                androidx.room.r.g(wVar3, com.app.mlounge.ui.navigation.l.g.a, null, new androidx.compose.runtime.internal.f(1817880082, true, new kotlin.jvm.functions.r() { // from class: com.app.mlounge.ui.m
                    @Override // kotlin.jvm.functions.r
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                        String string;
                        String string2;
                        String string3;
                        String string4;
                        LinkedHashMap linkedHashMap;
                        String string5;
                        String string6;
                        String string7;
                        switch (i7) {
                            case 0:
                                androidx.compose.runtime.r rVar3 = (androidx.compose.runtime.r) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                ((androidx.navigation.i) obj3).getClass();
                                androidx.navigation.y yVar3 = yVar;
                                boolean zH = rVar3.h(yVar3);
                                Object objQ = rVar3.Q();
                                if (zH || objQ == androidx.compose.runtime.m.a) {
                                    objQ = new d(yVar3, y0Var, 25);
                                    rVar3.l0(objQ);
                                }
                                com.app.mlounge.ui.screens.anime.o.b((kotlin.jvm.functions.l) objQ, null, rVar3, 0);
                                break;
                            case 1:
                                androidx.compose.runtime.r rVar4 = (androidx.compose.runtime.r) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                ((androidx.navigation.i) obj3).getClass();
                                androidx.navigation.y yVar4 = yVar;
                                boolean zH2 = rVar4.h(yVar4);
                                Object objQ2 = rVar4.Q();
                                if (zH2 || objQ2 == androidx.compose.runtime.m.a) {
                                    objQ2 = new d(yVar4, y0Var, 3);
                                    rVar4.l0(objQ2);
                                }
                                com.app.mlounge.ui.screens.adult.i.b((kotlin.jvm.functions.l) objQ2, null, rVar4, 0);
                                break;
                            case 2:
                                androidx.compose.runtime.r rVar5 = (androidx.compose.runtime.r) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                ((androidx.navigation.i) obj3).getClass();
                                androidx.navigation.y yVar5 = yVar;
                                boolean zH3 = rVar5.h(yVar5);
                                Object objQ3 = rVar5.Q();
                                y0 y0Var2 = y0Var;
                                androidx.compose.runtime.f fVar = androidx.compose.runtime.m.a;
                                if (zH3 || objQ3 == fVar) {
                                    objQ3 = new d(yVar5, y0Var2, 13);
                                    rVar5.l0(objQ3);
                                }
                                kotlin.jvm.functions.l lVar = (kotlin.jvm.functions.l) objQ3;
                                boolean zH4 = rVar5.h(yVar5);
                                Object objQ4 = rVar5.Q();
                                if (zH4 || objQ4 == fVar) {
                                    objQ4 = new d(yVar5, y0Var2, 14);
                                    rVar5.l0(objQ4);
                                }
                                com.app.mlounge.ui.screens.music.a.c(lVar, (kotlin.jvm.functions.l) objQ4, null, rVar5, 0);
                                break;
                            case 3:
                                androidx.compose.runtime.r rVar6 = (androidx.compose.runtime.r) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                ((androidx.navigation.i) obj3).getClass();
                                androidx.navigation.y yVar6 = yVar;
                                boolean zH5 = rVar6.h(yVar6);
                                Object objQ5 = rVar6.Q();
                                if (zH5 || objQ5 == androidx.compose.runtime.m.a) {
                                    objQ5 = new d(yVar6, y0Var, 10);
                                    rVar6.l0(objQ5);
                                }
                                com.app.mlounge.ui.screens.movies.a.d((kotlin.jvm.functions.l) objQ5, null, rVar6, 0);
                                break;
                            case 4:
                                androidx.navigation.i iVar = (androidx.navigation.i) obj3;
                                androidx.compose.runtime.r rVar7 = (androidx.compose.runtime.r) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                iVar.getClass();
                                Bundle bundleA = iVar.E.a();
                                if (bundleA != null && (string = bundleA.getString("artistUrl")) != null) {
                                    androidx.navigation.y yVar7 = yVar;
                                    boolean zH6 = rVar7.h(yVar7);
                                    Object objQ6 = rVar7.Q();
                                    androidx.compose.runtime.f fVar2 = androidx.compose.runtime.m.a;
                                    if (zH6 || objQ6 == fVar2) {
                                        objQ6 = new androidx.navigation.k(yVar7, 6);
                                        rVar7.l0(objQ6);
                                    }
                                    kotlin.jvm.functions.a aVar = (kotlin.jvm.functions.a) objQ6;
                                    boolean zH7 = rVar7.h(yVar7);
                                    Object objQ7 = rVar7.Q();
                                    if (zH7 || objQ7 == fVar2) {
                                        objQ7 = new d(yVar7, y0Var, 9);
                                        rVar7.l0(objQ7);
                                    }
                                    com.app.mlounge.ui.screens.music.a.b(string, aVar, (kotlin.jvm.functions.l) objQ7, null, rVar7, 0);
                                }
                                return kotlin.y.a;
                            case 5:
                                androidx.navigation.i iVar2 = (androidx.navigation.i) obj3;
                                androidx.compose.runtime.r rVar8 = (androidx.compose.runtime.r) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                iVar2.getClass();
                                androidx.navigation.internal.c cVar = iVar2.E;
                                Bundle bundleA2 = cVar.a();
                                if (bundleA2 == null || (string2 = bundleA2.getString("url")) == null) {
                                    string2 = "";
                                }
                                Bundle bundleA3 = cVar.a();
                                if (bundleA3 == null || (string3 = bundleA3.getString("title")) == null) {
                                    string3 = "";
                                }
                                Bundle bundleA4 = cVar.a();
                                if (bundleA4 == null || (string4 = bundleA4.getString("headers")) == null) {
                                    string4 = "";
                                }
                                if (kotlin.text.k.d0(string4)) {
                                    linkedHashMap = null;
                                } else {
                                    List listP0 = kotlin.text.k.p0(new String[]{"\n"}, string4, 6);
                                    int iU = kotlin.collections.a0.u(kotlin.collections.p.y(listP0, 10));
                                    if (iU < 16) {
                                        iU = 16;
                                    }
                                    linkedHashMap = new LinkedHashMap(iU);
                                    Iterator it = listP0.iterator();
                                    while (it.hasNext()) {
                                        List listP1 = kotlin.text.k.p0(new String[]{"="}, (String) it.next(), 2);
                                        Object obj6 = listP1.get(0);
                                        String str3 = (String) kotlin.collections.o.N(1, listP1);
                                        if (str3 == null) {
                                            str3 = "";
                                        }
                                        linkedHashMap.put(obj6, str3);
                                    }
                                }
                                LinkedHashMap linkedHashMap2 = linkedHashMap;
                                Bundle bundleA5 = cVar.a();
                                if (bundleA5 == null || (string5 = bundleA5.getString("contentType")) == null) {
                                    string5 = "tv";
                                }
                                Bundle bundleA6 = cVar.a();
                                if (bundleA6 == null || (string6 = bundleA6.getString("streamType")) == null) {
                                    string6 = "";
                                }
                                Bundle bundleA7 = cVar.a();
                                int i8 = bundleA7 != null ? bundleA7.getInt("tmdbId") : 0;
                                Bundle bundleA8 = cVar.a();
                                int i9 = bundleA8 != null ? bundleA8.getInt("season") : 0;
                                Bundle bundleA9 = cVar.a();
                                int i10 = bundleA9 != null ? bundleA9.getInt("episode") : 0;
                                Bundle bundleA10 = cVar.a();
                                String str4 = (bundleA10 == null || (string7 = bundleA10.getString("contentKey")) == null) ? "" : string7;
                                androidx.navigation.y yVar8 = yVar;
                                boolean zH8 = rVar8.h(yVar8);
                                Object objQ8 = rVar8.Q();
                                androidx.compose.runtime.f fVar3 = androidx.compose.runtime.m.a;
                                if (zH8 || objQ8 == fVar3) {
                                    objQ8 = new androidx.navigation.k(yVar8, 11);
                                    rVar8.l0(objQ8);
                                }
                                kotlin.jvm.functions.a aVar2 = (kotlin.jvm.functions.a) objQ8;
                                boolean zF = rVar8.f(string5) | rVar8.h(yVar8) | rVar8.f(str4);
                                Object objQ9 = rVar8.Q();
                                if (zF || objQ9 == fVar3) {
                                    objQ9 = new u(string5, yVar8, str4, y0Var);
                                    rVar8.l0(objQ9);
                                }
                                com.app.mlounge.ui.screens.player.i0.l(string2, string3, linkedHashMap2, string5, string6, i8, i9, i10, str4, aVar2, (kotlin.jvm.functions.r) objQ9, null, rVar8, 0);
                                break;
                            case 6:
                                androidx.compose.runtime.r rVar9 = (androidx.compose.runtime.r) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                ((androidx.navigation.i) obj3).getClass();
                                androidx.navigation.y yVar9 = yVar;
                                boolean zH9 = rVar9.h(yVar9);
                                Object objQ10 = rVar9.Q();
                                if (zH9 || objQ10 == androidx.compose.runtime.m.a) {
                                    objQ10 = new d(yVar9, y0Var, 6);
                                    rVar9.l0(objQ10);
                                }
                                com.app.mlounge.ui.screens.tvshows.a.d((kotlin.jvm.functions.l) objQ10, null, rVar9, 0);
                                break;
                            default:
                                androidx.compose.runtime.r rVar10 = (androidx.compose.runtime.r) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                ((androidx.navigation.i) obj3).getClass();
                                androidx.navigation.y yVar10 = yVar;
                                boolean zH10 = rVar10.h(yVar10);
                                Object objQ11 = rVar10.Q();
                                if (zH10 || objQ11 == androidx.compose.runtime.m.a) {
                                    objQ11 = new b(yVar10, y0Var, 1);
                                    rVar10.l0(objQ11);
                                }
                                com.app.mlounge.ui.screens.games.a.d((kotlin.jvm.functions.p) objQ11, null, rVar10, 0);
                                break;
                        }
                        return kotlin.y.a;
                    }
                }), 254);
                androidx.room.r.g(wVar3, com.app.mlounge.ui.navigation.m.g.a, com.google.common.base.c.p(androidx.navigation.f.f("albumUrl", new androidx.room.z(22))), new androidx.compose.runtime.internal.f(-1182668367, true, new f(yVar, coroutineScope, wVar2, 1)), 252);
                final int i8 = 4;
                androidx.room.r.g(wVar3, com.app.mlounge.ui.navigation.n.g.a, com.google.common.base.c.p(androidx.navigation.f.f("artistUrl", new androidx.room.z(23))), new androidx.compose.runtime.internal.f(111750480, true, new kotlin.jvm.functions.r() { // from class: com.app.mlounge.ui.m
                    @Override // kotlin.jvm.functions.r
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                        String string;
                        String string2;
                        String string3;
                        String string4;
                        LinkedHashMap linkedHashMap;
                        String string5;
                        String string6;
                        String string7;
                        switch (i8) {
                            case 0:
                                androidx.compose.runtime.r rVar3 = (androidx.compose.runtime.r) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                ((androidx.navigation.i) obj3).getClass();
                                androidx.navigation.y yVar3 = yVar;
                                boolean zH = rVar3.h(yVar3);
                                Object objQ = rVar3.Q();
                                if (zH || objQ == androidx.compose.runtime.m.a) {
                                    objQ = new d(yVar3, y0Var, 25);
                                    rVar3.l0(objQ);
                                }
                                com.app.mlounge.ui.screens.anime.o.b((kotlin.jvm.functions.l) objQ, null, rVar3, 0);
                                break;
                            case 1:
                                androidx.compose.runtime.r rVar4 = (androidx.compose.runtime.r) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                ((androidx.navigation.i) obj3).getClass();
                                androidx.navigation.y yVar4 = yVar;
                                boolean zH2 = rVar4.h(yVar4);
                                Object objQ2 = rVar4.Q();
                                if (zH2 || objQ2 == androidx.compose.runtime.m.a) {
                                    objQ2 = new d(yVar4, y0Var, 3);
                                    rVar4.l0(objQ2);
                                }
                                com.app.mlounge.ui.screens.adult.i.b((kotlin.jvm.functions.l) objQ2, null, rVar4, 0);
                                break;
                            case 2:
                                androidx.compose.runtime.r rVar5 = (androidx.compose.runtime.r) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                ((androidx.navigation.i) obj3).getClass();
                                androidx.navigation.y yVar5 = yVar;
                                boolean zH3 = rVar5.h(yVar5);
                                Object objQ3 = rVar5.Q();
                                y0 y0Var2 = y0Var;
                                androidx.compose.runtime.f fVar = androidx.compose.runtime.m.a;
                                if (zH3 || objQ3 == fVar) {
                                    objQ3 = new d(yVar5, y0Var2, 13);
                                    rVar5.l0(objQ3);
                                }
                                kotlin.jvm.functions.l lVar = (kotlin.jvm.functions.l) objQ3;
                                boolean zH4 = rVar5.h(yVar5);
                                Object objQ4 = rVar5.Q();
                                if (zH4 || objQ4 == fVar) {
                                    objQ4 = new d(yVar5, y0Var2, 14);
                                    rVar5.l0(objQ4);
                                }
                                com.app.mlounge.ui.screens.music.a.c(lVar, (kotlin.jvm.functions.l) objQ4, null, rVar5, 0);
                                break;
                            case 3:
                                androidx.compose.runtime.r rVar6 = (androidx.compose.runtime.r) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                ((androidx.navigation.i) obj3).getClass();
                                androidx.navigation.y yVar6 = yVar;
                                boolean zH5 = rVar6.h(yVar6);
                                Object objQ5 = rVar6.Q();
                                if (zH5 || objQ5 == androidx.compose.runtime.m.a) {
                                    objQ5 = new d(yVar6, y0Var, 10);
                                    rVar6.l0(objQ5);
                                }
                                com.app.mlounge.ui.screens.movies.a.d((kotlin.jvm.functions.l) objQ5, null, rVar6, 0);
                                break;
                            case 4:
                                androidx.navigation.i iVar = (androidx.navigation.i) obj3;
                                androidx.compose.runtime.r rVar7 = (androidx.compose.runtime.r) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                iVar.getClass();
                                Bundle bundleA = iVar.E.a();
                                if (bundleA != null && (string = bundleA.getString("artistUrl")) != null) {
                                    androidx.navigation.y yVar7 = yVar;
                                    boolean zH6 = rVar7.h(yVar7);
                                    Object objQ6 = rVar7.Q();
                                    androidx.compose.runtime.f fVar2 = androidx.compose.runtime.m.a;
                                    if (zH6 || objQ6 == fVar2) {
                                        objQ6 = new androidx.navigation.k(yVar7, 6);
                                        rVar7.l0(objQ6);
                                    }
                                    kotlin.jvm.functions.a aVar = (kotlin.jvm.functions.a) objQ6;
                                    boolean zH7 = rVar7.h(yVar7);
                                    Object objQ7 = rVar7.Q();
                                    if (zH7 || objQ7 == fVar2) {
                                        objQ7 = new d(yVar7, y0Var, 9);
                                        rVar7.l0(objQ7);
                                    }
                                    com.app.mlounge.ui.screens.music.a.b(string, aVar, (kotlin.jvm.functions.l) objQ7, null, rVar7, 0);
                                }
                                return kotlin.y.a;
                            case 5:
                                androidx.navigation.i iVar2 = (androidx.navigation.i) obj3;
                                androidx.compose.runtime.r rVar8 = (androidx.compose.runtime.r) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                iVar2.getClass();
                                androidx.navigation.internal.c cVar = iVar2.E;
                                Bundle bundleA2 = cVar.a();
                                if (bundleA2 == null || (string2 = bundleA2.getString("url")) == null) {
                                    string2 = "";
                                }
                                Bundle bundleA3 = cVar.a();
                                if (bundleA3 == null || (string3 = bundleA3.getString("title")) == null) {
                                    string3 = "";
                                }
                                Bundle bundleA4 = cVar.a();
                                if (bundleA4 == null || (string4 = bundleA4.getString("headers")) == null) {
                                    string4 = "";
                                }
                                if (kotlin.text.k.d0(string4)) {
                                    linkedHashMap = null;
                                } else {
                                    List listP0 = kotlin.text.k.p0(new String[]{"\n"}, string4, 6);
                                    int iU = kotlin.collections.a0.u(kotlin.collections.p.y(listP0, 10));
                                    if (iU < 16) {
                                        iU = 16;
                                    }
                                    linkedHashMap = new LinkedHashMap(iU);
                                    Iterator it = listP0.iterator();
                                    while (it.hasNext()) {
                                        List listP1 = kotlin.text.k.p0(new String[]{"="}, (String) it.next(), 2);
                                        Object obj6 = listP1.get(0);
                                        String str3 = (String) kotlin.collections.o.N(1, listP1);
                                        if (str3 == null) {
                                            str3 = "";
                                        }
                                        linkedHashMap.put(obj6, str3);
                                    }
                                }
                                LinkedHashMap linkedHashMap2 = linkedHashMap;
                                Bundle bundleA5 = cVar.a();
                                if (bundleA5 == null || (string5 = bundleA5.getString("contentType")) == null) {
                                    string5 = "tv";
                                }
                                Bundle bundleA6 = cVar.a();
                                if (bundleA6 == null || (string6 = bundleA6.getString("streamType")) == null) {
                                    string6 = "";
                                }
                                Bundle bundleA7 = cVar.a();
                                int i9 = bundleA7 != null ? bundleA7.getInt("tmdbId") : 0;
                                Bundle bundleA8 = cVar.a();
                                int i10 = bundleA8 != null ? bundleA8.getInt("season") : 0;
                                Bundle bundleA9 = cVar.a();
                                int i11 = bundleA9 != null ? bundleA9.getInt("episode") : 0;
                                Bundle bundleA10 = cVar.a();
                                String str4 = (bundleA10 == null || (string7 = bundleA10.getString("contentKey")) == null) ? "" : string7;
                                androidx.navigation.y yVar8 = yVar;
                                boolean zH8 = rVar8.h(yVar8);
                                Object objQ8 = rVar8.Q();
                                androidx.compose.runtime.f fVar3 = androidx.compose.runtime.m.a;
                                if (zH8 || objQ8 == fVar3) {
                                    objQ8 = new androidx.navigation.k(yVar8, 11);
                                    rVar8.l0(objQ8);
                                }
                                kotlin.jvm.functions.a aVar2 = (kotlin.jvm.functions.a) objQ8;
                                boolean zF = rVar8.f(string5) | rVar8.h(yVar8) | rVar8.f(str4);
                                Object objQ9 = rVar8.Q();
                                if (zF || objQ9 == fVar3) {
                                    objQ9 = new u(string5, yVar8, str4, y0Var);
                                    rVar8.l0(objQ9);
                                }
                                com.app.mlounge.ui.screens.player.i0.l(string2, string3, linkedHashMap2, string5, string6, i9, i10, i11, str4, aVar2, (kotlin.jvm.functions.r) objQ9, null, rVar8, 0);
                                break;
                            case 6:
                                androidx.compose.runtime.r rVar9 = (androidx.compose.runtime.r) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                ((androidx.navigation.i) obj3).getClass();
                                androidx.navigation.y yVar9 = yVar;
                                boolean zH9 = rVar9.h(yVar9);
                                Object objQ10 = rVar9.Q();
                                if (zH9 || objQ10 == androidx.compose.runtime.m.a) {
                                    objQ10 = new d(yVar9, y0Var, 6);
                                    rVar9.l0(objQ10);
                                }
                                com.app.mlounge.ui.screens.tvshows.a.d((kotlin.jvm.functions.l) objQ10, null, rVar9, 0);
                                break;
                            default:
                                androidx.compose.runtime.r rVar10 = (androidx.compose.runtime.r) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                ((androidx.navigation.i) obj3).getClass();
                                androidx.navigation.y yVar10 = yVar;
                                boolean zH10 = rVar10.h(yVar10);
                                Object objQ11 = rVar10.Q();
                                if (zH10 || objQ11 == androidx.compose.runtime.m.a) {
                                    objQ11 = new b(yVar10, y0Var, 1);
                                    rVar10.l0(objQ11);
                                }
                                com.app.mlounge.ui.screens.games.a.d((kotlin.jvm.functions.p) objQ11, null, rVar10, 0);
                                break;
                        }
                        return kotlin.y.a;
                    }
                }), 252);
                androidx.room.r.g(wVar3, com.app.mlounge.ui.navigation.v.g.a, null, new androidx.compose.runtime.internal.f(1406169327, true, new o(yVar, rVar2, y0Var, t2Var, t2Var2, yVar2, 0)), 254);
                androidx.room.r.g(wVar3, com.app.mlounge.ui.navigation.e.g.a, null, new androidx.compose.runtime.internal.f(-1594379122, true, new androidx.compose.ui.text.platform.c(wVar, 2)), 254);
                androidx.room.r.g(wVar3, com.app.mlounge.ui.navigation.h.g.a, null, new androidx.compose.runtime.internal.f(-299960275, true, new o(yVar, rVar2, y0Var, t2Var, t2Var3, yVar2, 1)), 254);
                androidx.room.r.g(wVar3, com.app.mlounge.ui.navigation.q.g.a, null, a.a, 254);
                androidx.room.r.g(wVar3, com.app.mlounge.ui.navigation.r.g.a, null, a.b, 254);
                final int i9 = 5;
                androidx.room.r.g(wVar3, "player?url={url}&title={title}&headers={headers}&contentType={contentType}&streamType={streamType}&tmdbId={tmdbId}&season={season}&episode={episode}&contentKey={contentKey}", com.google.common.base.c.q(androidx.navigation.f.f("url", new androidx.room.z(24)), androidx.navigation.f.f("title", new androidx.room.z(25)), androidx.navigation.f.f("headers", new androidx.room.z(26)), androidx.navigation.f.f("contentType", new androidx.room.z(27)), androidx.navigation.f.f("streamType", new androidx.room.z(29)), androidx.navigation.f.f("tmdbId", new q(0)), androidx.navigation.f.f("season", new q(1)), androidx.navigation.f.f("episode", new q(2)), androidx.navigation.f.f("contentKey", new q(3))), new androidx.compose.runtime.internal.f(701320981, true, new kotlin.jvm.functions.r() { // from class: com.app.mlounge.ui.m
                    @Override // kotlin.jvm.functions.r
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                        String string;
                        String string2;
                        String string3;
                        String string4;
                        LinkedHashMap linkedHashMap;
                        String string5;
                        String string6;
                        String string7;
                        switch (i9) {
                            case 0:
                                androidx.compose.runtime.r rVar3 = (androidx.compose.runtime.r) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                ((androidx.navigation.i) obj3).getClass();
                                androidx.navigation.y yVar3 = yVar;
                                boolean zH = rVar3.h(yVar3);
                                Object objQ = rVar3.Q();
                                if (zH || objQ == androidx.compose.runtime.m.a) {
                                    objQ = new d(yVar3, y0Var, 25);
                                    rVar3.l0(objQ);
                                }
                                com.app.mlounge.ui.screens.anime.o.b((kotlin.jvm.functions.l) objQ, null, rVar3, 0);
                                break;
                            case 1:
                                androidx.compose.runtime.r rVar4 = (androidx.compose.runtime.r) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                ((androidx.navigation.i) obj3).getClass();
                                androidx.navigation.y yVar4 = yVar;
                                boolean zH2 = rVar4.h(yVar4);
                                Object objQ2 = rVar4.Q();
                                if (zH2 || objQ2 == androidx.compose.runtime.m.a) {
                                    objQ2 = new d(yVar4, y0Var, 3);
                                    rVar4.l0(objQ2);
                                }
                                com.app.mlounge.ui.screens.adult.i.b((kotlin.jvm.functions.l) objQ2, null, rVar4, 0);
                                break;
                            case 2:
                                androidx.compose.runtime.r rVar5 = (androidx.compose.runtime.r) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                ((androidx.navigation.i) obj3).getClass();
                                androidx.navigation.y yVar5 = yVar;
                                boolean zH3 = rVar5.h(yVar5);
                                Object objQ3 = rVar5.Q();
                                y0 y0Var2 = y0Var;
                                androidx.compose.runtime.f fVar = androidx.compose.runtime.m.a;
                                if (zH3 || objQ3 == fVar) {
                                    objQ3 = new d(yVar5, y0Var2, 13);
                                    rVar5.l0(objQ3);
                                }
                                kotlin.jvm.functions.l lVar = (kotlin.jvm.functions.l) objQ3;
                                boolean zH4 = rVar5.h(yVar5);
                                Object objQ4 = rVar5.Q();
                                if (zH4 || objQ4 == fVar) {
                                    objQ4 = new d(yVar5, y0Var2, 14);
                                    rVar5.l0(objQ4);
                                }
                                com.app.mlounge.ui.screens.music.a.c(lVar, (kotlin.jvm.functions.l) objQ4, null, rVar5, 0);
                                break;
                            case 3:
                                androidx.compose.runtime.r rVar6 = (androidx.compose.runtime.r) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                ((androidx.navigation.i) obj3).getClass();
                                androidx.navigation.y yVar6 = yVar;
                                boolean zH5 = rVar6.h(yVar6);
                                Object objQ5 = rVar6.Q();
                                if (zH5 || objQ5 == androidx.compose.runtime.m.a) {
                                    objQ5 = new d(yVar6, y0Var, 10);
                                    rVar6.l0(objQ5);
                                }
                                com.app.mlounge.ui.screens.movies.a.d((kotlin.jvm.functions.l) objQ5, null, rVar6, 0);
                                break;
                            case 4:
                                androidx.navigation.i iVar = (androidx.navigation.i) obj3;
                                androidx.compose.runtime.r rVar7 = (androidx.compose.runtime.r) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                iVar.getClass();
                                Bundle bundleA = iVar.E.a();
                                if (bundleA != null && (string = bundleA.getString("artistUrl")) != null) {
                                    androidx.navigation.y yVar7 = yVar;
                                    boolean zH6 = rVar7.h(yVar7);
                                    Object objQ6 = rVar7.Q();
                                    androidx.compose.runtime.f fVar2 = androidx.compose.runtime.m.a;
                                    if (zH6 || objQ6 == fVar2) {
                                        objQ6 = new androidx.navigation.k(yVar7, 6);
                                        rVar7.l0(objQ6);
                                    }
                                    kotlin.jvm.functions.a aVar = (kotlin.jvm.functions.a) objQ6;
                                    boolean zH7 = rVar7.h(yVar7);
                                    Object objQ7 = rVar7.Q();
                                    if (zH7 || objQ7 == fVar2) {
                                        objQ7 = new d(yVar7, y0Var, 9);
                                        rVar7.l0(objQ7);
                                    }
                                    com.app.mlounge.ui.screens.music.a.b(string, aVar, (kotlin.jvm.functions.l) objQ7, null, rVar7, 0);
                                }
                                return kotlin.y.a;
                            case 5:
                                androidx.navigation.i iVar2 = (androidx.navigation.i) obj3;
                                androidx.compose.runtime.r rVar8 = (androidx.compose.runtime.r) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                iVar2.getClass();
                                androidx.navigation.internal.c cVar = iVar2.E;
                                Bundle bundleA2 = cVar.a();
                                if (bundleA2 == null || (string2 = bundleA2.getString("url")) == null) {
                                    string2 = "";
                                }
                                Bundle bundleA3 = cVar.a();
                                if (bundleA3 == null || (string3 = bundleA3.getString("title")) == null) {
                                    string3 = "";
                                }
                                Bundle bundleA4 = cVar.a();
                                if (bundleA4 == null || (string4 = bundleA4.getString("headers")) == null) {
                                    string4 = "";
                                }
                                if (kotlin.text.k.d0(string4)) {
                                    linkedHashMap = null;
                                } else {
                                    List listP0 = kotlin.text.k.p0(new String[]{"\n"}, string4, 6);
                                    int iU = kotlin.collections.a0.u(kotlin.collections.p.y(listP0, 10));
                                    if (iU < 16) {
                                        iU = 16;
                                    }
                                    linkedHashMap = new LinkedHashMap(iU);
                                    Iterator it = listP0.iterator();
                                    while (it.hasNext()) {
                                        List listP1 = kotlin.text.k.p0(new String[]{"="}, (String) it.next(), 2);
                                        Object obj6 = listP1.get(0);
                                        String str3 = (String) kotlin.collections.o.N(1, listP1);
                                        if (str3 == null) {
                                            str3 = "";
                                        }
                                        linkedHashMap.put(obj6, str3);
                                    }
                                }
                                LinkedHashMap linkedHashMap2 = linkedHashMap;
                                Bundle bundleA5 = cVar.a();
                                if (bundleA5 == null || (string5 = bundleA5.getString("contentType")) == null) {
                                    string5 = "tv";
                                }
                                Bundle bundleA6 = cVar.a();
                                if (bundleA6 == null || (string6 = bundleA6.getString("streamType")) == null) {
                                    string6 = "";
                                }
                                Bundle bundleA7 = cVar.a();
                                int i10 = bundleA7 != null ? bundleA7.getInt("tmdbId") : 0;
                                Bundle bundleA8 = cVar.a();
                                int i11 = bundleA8 != null ? bundleA8.getInt("season") : 0;
                                Bundle bundleA9 = cVar.a();
                                int i12 = bundleA9 != null ? bundleA9.getInt("episode") : 0;
                                Bundle bundleA10 = cVar.a();
                                String str4 = (bundleA10 == null || (string7 = bundleA10.getString("contentKey")) == null) ? "" : string7;
                                androidx.navigation.y yVar8 = yVar;
                                boolean zH8 = rVar8.h(yVar8);
                                Object objQ8 = rVar8.Q();
                                androidx.compose.runtime.f fVar3 = androidx.compose.runtime.m.a;
                                if (zH8 || objQ8 == fVar3) {
                                    objQ8 = new androidx.navigation.k(yVar8, 11);
                                    rVar8.l0(objQ8);
                                }
                                kotlin.jvm.functions.a aVar2 = (kotlin.jvm.functions.a) objQ8;
                                boolean zF = rVar8.f(string5) | rVar8.h(yVar8) | rVar8.f(str4);
                                Object objQ9 = rVar8.Q();
                                if (zF || objQ9 == fVar3) {
                                    objQ9 = new u(string5, yVar8, str4, y0Var);
                                    rVar8.l0(objQ9);
                                }
                                com.app.mlounge.ui.screens.player.i0.l(string2, string3, linkedHashMap2, string5, string6, i10, i11, i12, str4, aVar2, (kotlin.jvm.functions.r) objQ9, null, rVar8, 0);
                                break;
                            case 6:
                                androidx.compose.runtime.r rVar9 = (androidx.compose.runtime.r) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                ((androidx.navigation.i) obj3).getClass();
                                androidx.navigation.y yVar9 = yVar;
                                boolean zH9 = rVar9.h(yVar9);
                                Object objQ10 = rVar9.Q();
                                if (zH9 || objQ10 == androidx.compose.runtime.m.a) {
                                    objQ10 = new d(yVar9, y0Var, 6);
                                    rVar9.l0(objQ10);
                                }
                                com.app.mlounge.ui.screens.tvshows.a.d((kotlin.jvm.functions.l) objQ10, null, rVar9, 0);
                                break;
                            default:
                                androidx.compose.runtime.r rVar10 = (androidx.compose.runtime.r) obj4;
                                ((Integer) obj5).getClass();
                                ((androidx.compose.animation.p) obj2).getClass();
                                ((androidx.navigation.i) obj3).getClass();
                                androidx.navigation.y yVar10 = yVar;
                                boolean zH10 = rVar10.h(yVar10);
                                Object objQ11 = rVar10.Q();
                                if (zH10 || objQ11 == androidx.compose.runtime.m.a) {
                                    objQ11 = new b(yVar10, y0Var, 1);
                                    rVar10.l0(objQ11);
                                }
                                com.app.mlounge.ui.screens.games.a.d((kotlin.jvm.functions.p) objQ11, null, rVar10, 0);
                                break;
                        }
                        return kotlin.y.a;
                    }
                }), 252);
                androidx.room.r.g(wVar3, com.app.mlounge.ui.navigation.s.g.a, com.google.common.base.c.q(androidx.navigation.f.f("type", new q(4)), androidx.navigation.f.f("id", new q(5)), androidx.navigation.f.f("title", new q(6)), androidx.navigation.f.f("season", new q(7)), androidx.navigation.f.f("episode", new q(8)), androidx.navigation.f.f("mode", new q(9))), new androidx.compose.runtime.internal.f(1995739828, true, new s(0, yVar, wVar)), 252);
                final int i10 = 0;
                androidx.room.r.g(wVar3, com.app.mlounge.ui.navigation.o.g.a, com.google.common.base.c.p(androidx.navigation.f.f("personId", new q(10))), new androidx.compose.runtime.internal.f(-1004808621, true, new kotlin.jvm.functions.r() { // from class: com.app.mlounge.ui.t
                    @Override // kotlin.jvm.functions.r
                    public final Object invoke(Object obj2, Object obj3, Object obj4, Object obj5) {
                        String string;
                        String string2;
                        androidx.compose.animation.p pVar = (androidx.compose.animation.p) obj2;
                        androidx.navigation.i iVar = (androidx.navigation.i) obj3;
                        switch (i10) {
                            case 0:
                                androidx.compose.runtime.r rVar3 = (androidx.compose.runtime.r) obj4;
                                ((Integer) obj5).getClass();
                                pVar.getClass();
                                iVar.getClass();
                                Bundle bundleA = iVar.E.a();
                                if (bundleA != null) {
                                    int i11 = bundleA.getInt("personId");
                                    androidx.navigation.y yVar3 = yVar;
                                    boolean zH = rVar3.h(yVar3);
                                    Object objQ = rVar3.Q();
                                    androidx.compose.runtime.f fVar = androidx.compose.runtime.m.a;
                                    if (zH || objQ == fVar) {
                                        objQ = new androidx.navigation.k(yVar3, 10);
                                        rVar3.l0(objQ);
                                    }
                                    kotlin.jvm.functions.a aVar = (kotlin.jvm.functions.a) objQ;
                                    boolean zH2 = rVar3.h(yVar3);
                                    Object objQ2 = rVar3.Q();
                                    if (zH2 || objQ2 == fVar) {
                                        objQ2 = new l(yVar3, 2);
                                        rVar3.l0(objQ2);
                                    }
                                    kotlin.jvm.functions.l lVar = (kotlin.jvm.functions.l) objQ2;
                                    boolean zH3 = rVar3.h(yVar3);
                                    Object objQ3 = rVar3.Q();
                                    if (zH3 || objQ3 == fVar) {
                                        objQ3 = new l(yVar3, 3);
                                        rVar3.l0(objQ3);
                                    }
                                    com.app.mlounge.ui.screens.person.a.a(i11, aVar, lVar, (kotlin.jvm.functions.l) objQ3, null, rVar3, 0);
                                }
                                break;
                            default:
                                androidx.compose.runtime.r rVar4 = (androidx.compose.runtime.r) obj4;
                                ((Integer) obj5).getClass();
                                pVar.getClass();
                                iVar.getClass();
                                androidx.navigation.internal.c cVar = iVar.E;
                                Bundle bundleA2 = cVar.a();
                                if (bundleA2 == null || (string = bundleA2.getString("platform")) == null) {
                                    string = "snes";
                                }
                                String str3 = string;
                                Bundle bundleA3 = cVar.a();
                                if (bundleA3 != null && (string2 = bundleA3.getString("gameSlug")) != null) {
                                    androidx.navigation.y yVar4 = yVar;
                                    boolean zH4 = rVar4.h(yVar4);
                                    Object objQ4 = rVar4.Q();
                                    if (zH4 || objQ4 == androidx.compose.runtime.m.a) {
                                        objQ4 = new androidx.navigation.k(yVar4, 4);
                                        rVar4.l0(objQ4);
                                    }
                                    com.app.mlounge.ui.screens.games.a.a(string2, str3, (kotlin.jvm.functions.a) objQ4, null, rVar4, 0);
                                }
                                break;
                        }
                        return kotlin.y.a;
                    }
                }), 252);
                break;
            default:
                List list = (List) this.B;
                Map map = (Map) this.C;
                kotlin.jvm.functions.l lVar = (kotlin.jvm.functions.l) this.D;
                kotlin.jvm.functions.l lVar2 = (kotlin.jvm.functions.l) this.E;
                kotlin.jvm.functions.l lVar3 = (kotlin.jvm.functions.l) this.F;
                kotlin.jvm.functions.l lVar4 = (kotlin.jvm.functions.l) this.G;
                kotlin.jvm.functions.a aVar = (kotlin.jvm.functions.a) this.H;
                com.app.mlounge.ui.viewmodel.t tVar = (com.app.mlounge.ui.viewmodel.t) this.I;
                Context context = (Context) this.J;
                androidx.compose.foundation.lazy.grid.h hVar = (androidx.compose.foundation.lazy.grid.h) obj;
                hVar.getClass();
                hVar.q(list.size(), new androidx.compose.foundation.text.c0(9, new com.app.mlounge.ui.screens.anime.n(12), list), new com.app.mlounge.ui.screens.adult.g(4, list), new androidx.compose.runtime.internal.f(-1942245546, true, new com.app.mlounge.ui.screens.history.f(list, map, lVar, lVar2, this.y, lVar3, lVar4, list, aVar, tVar, context, this.z, this.A)));
                break;
        }
        return kotlin.y.a;
    }

    public /* synthetic */ z(List list, Map map, kotlin.jvm.functions.l lVar, kotlin.jvm.functions.l lVar2, kotlin.jvm.functions.r rVar, kotlin.jvm.functions.l lVar3, kotlin.jvm.functions.l lVar4, kotlin.jvm.functions.a aVar, com.app.mlounge.ui.viewmodel.t tVar, Context context, y0 y0Var, y0 y0Var2) {
        this.B = list;
        this.C = map;
        this.D = lVar;
        this.E = lVar2;
        this.y = rVar;
        this.F = lVar3;
        this.G = lVar4;
        this.H = aVar;
        this.I = tVar;
        this.J = context;
        this.z = y0Var;
        this.A = y0Var2;
    }
}
