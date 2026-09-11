package com.app.mlounge.data.providers;

import j$.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Objects;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    final /* synthetic */ Integer $episode;
    final /* synthetic */ String $mediaType;
    final /* synthetic */ Integer $season;
    final /* synthetic */ String $tmdbId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, String str, String str2, Integer num, Integer num2, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.this$0 = fVar;
        this.$tmdbId = str;
        this.$mediaType = str2;
        this.$season = num;
        this.$episode = num2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        e eVar = new e(this.this$0, this.$tmdbId, this.$mediaType, this.$season, this.$episode, dVar);
        eVar.L$0 = obj;
        return eVar;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
    }

    /* JADX WARN: Code duplicated, block: B:166:0x0303 A[PHI: r11
  0x0303: PHI (r11v15 com.google.gson.g) = (r11v14 com.google.gson.g), (r11v14 com.google.gson.g), (r11v14 com.google.gson.g), (r11v22 com.google.gson.g) binds: [B:128:0x0258, B:130:0x025c, B:135:0x026c, B:276:0x0303] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:79:0x0196 A[PHI: r13
  0x0196: PHI (r13v27 java.lang.String) = (r13v25 java.lang.String), (r13v28 java.lang.String) binds: [B:84:0x01a5, B:77:0x0193] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objC;
        kotlin.collections.u uVar;
        String strA;
        com.google.gson.g gVar;
        ArrayList arrayList;
        String strH;
        com.google.gson.k kVarO;
        com.google.gson.g gVarN;
        com.google.gson.g gVar2;
        String str;
        com.google.gson.g gVar3;
        com.google.gson.h hVarL;
        String strH2;
        ArrayList arrayList2;
        String str2;
        Class<com.google.gson.k> cls;
        String str3;
        String strH3;
        String str4;
        String str5;
        ArrayList arrayList3;
        String str6;
        String str7;
        String str8;
        com.google.gson.k kVarO2;
        com.google.gson.g gVarN2;
        String strH4;
        String strH5;
        String strH6;
        com.google.gson.k kVarO3;
        Class<com.google.gson.k> cls2 = com.google.gson.k.class;
        String str9 = "data";
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        int i = this.label;
        if (i == 0) {
            kotlin.a.e(obj);
            l1 l1Var = this.this$0.tmdbHelper;
            String str10 = this.$tmdbId;
            String str11 = this.$mediaType;
            this.L$0 = coroutineScope;
            this.label = 1;
            objC = l1Var.c(str10, str11, this);
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
            if (objC == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.a.e(obj);
            objC = obj;
        }
        i1 i1Var = (i1) objC;
        kotlin.collections.u uVar2 = kotlin.collections.u.e;
        if (i1Var != null) {
            try {
                com.google.gson.k kVarG = f.g(this.this$0);
                kotlin.o oVar = com.app.mlounge.util.a.a;
                Objects.toString(kVarG);
                if (kVarG != null) {
                    com.google.gson.h hVarL2 = kVarG.l("data");
                    String strH7 = hVarL2 != null ? hVarL2.h() : null;
                    if (strH7 != null) {
                        com.google.gson.h hVarL3 = kVarG.l("code");
                        try {
                            if (hVarL3 == null || hVarL3.c() != 200) {
                                Objects.toString(kVarG.l("code"));
                                return uVar2;
                            }
                            if (i1Var.b() != null) {
                                strA = i1Var.a() + " " + i1Var.b();
                            } else {
                                strA = i1Var.a();
                            }
                            String strF = this.this$0.f("https://api.hlowb.com/film-api/v1.1.0/movie/searchByKeyword?channel=IndiaA&clientType=1&keyword=" + URLEncoder.encode(strA, "UTF-8") + "&lang=en-US&mode=1&packageName=com.external.castle&page=1&size=30", null);
                            if (strF != null) {
                                kotlin.text.k.y0(30, strF);
                            }
                            if (strF != null) {
                                String strB = f.b(this.this$0, strF, strH7);
                                kotlin.text.k.y0(50, strB);
                                com.google.gson.k kVar = (com.google.gson.k) this.this$0.gson.d(cls2, strB);
                                Objects.toString(kVar);
                                com.google.gson.g gVarN3 = (kVar == null || (kVarO3 = kVar.o("data")) == null) ? null : kVarO3.n("rows");
                                if (gVarN3 != null) {
                                    kotlin.coroutines.jvm.internal.f.b(gVarN3.e.size());
                                }
                                if (gVarN3 != null) {
                                    ArrayList arrayList4 = gVarN3.e;
                                    String lowerCase = i1Var.a().toLowerCase(Locale.ROOT);
                                    lowerCase.getClass();
                                    Iterator it = arrayList4.iterator();
                                    it.getClass();
                                    String strH8 = null;
                                    while (true) {
                                        gVar = gVarN3;
                                        if (!it.hasNext()) {
                                            uVar = uVar2;
                                            arrayList = arrayList4;
                                            break;
                                        }
                                        uVar = uVar2;
                                        com.google.gson.k kVarE = ((com.google.gson.h) it.next()).e();
                                        arrayList = arrayList4;
                                        com.google.gson.h hVarL4 = kVarE.l("title");
                                        if (hVarL4 == null || (strH5 = hVarL4.h()) == null) {
                                            com.google.gson.h hVarL5 = kVarE.l("name");
                                            strH5 = hVarL5 != null ? hVarL5.h() : null;
                                            if (strH5 == null) {
                                                strH5 = "";
                                            }
                                        }
                                        Iterator it2 = it;
                                        String lowerCase2 = strH5.toLowerCase(Locale.ROOT);
                                        lowerCase2.getClass();
                                        if (kotlin.text.k.T(lowerCase2, lowerCase, false) || kotlin.text.k.T(lowerCase, lowerCase2, false)) {
                                            com.google.gson.h hVarL6 = kVarE.l("id");
                                            if (hVarL6 == null || (strH6 = hVarL6.h()) == null) {
                                                com.google.gson.h hVarL7 = kVarE.l("redirectId");
                                                strH6 = hVarL7 != null ? hVarL7.h() : null;
                                                if (strH6 == null) {
                                                    com.google.gson.h hVarL8 = kVarE.l("redirectIdStr");
                                                    strH8 = hVarL8 != null ? hVarL8.h() : null;
                                                } else {
                                                    strH8 = strH6;
                                                }
                                            } else {
                                                strH8 = strH6;
                                            }
                                            if (strH8 != null) {
                                                break;
                                            }
                                        }
                                        arrayList4 = arrayList;
                                        gVarN3 = gVar;
                                        uVar2 = uVar;
                                        it = it2;
                                    }
                                    if (strH8 != null || arrayList.size() <= 0) {
                                        strH = strH8;
                                    } else {
                                        com.google.gson.k kVarE2 = gVar.i().e();
                                        com.google.gson.h hVarL9 = kVarE2.l("id");
                                        if (hVarL9 == null || (strH4 = hVarL9.h()) == null) {
                                            com.google.gson.h hVarL10 = kVarE2.l("redirectId");
                                            strH = hVarL10 != null ? hVarL10.h() : null;
                                            if (strH == null) {
                                                com.google.gson.h hVarL11 = kVarE2.l("redirectIdStr");
                                                strH = hVarL11 != null ? hVarL11.h() : null;
                                            }
                                        } else {
                                            strH = strH4;
                                        }
                                    }
                                    if (strH == null) {
                                        kotlin.o oVar2 = com.app.mlounge.util.a.a;
                                        return uVar;
                                    }
                                    String strF2 = this.this$0.f("https://api.hlowb.com/film-api/v1.9.9/movie?channel=IndiaA&clientType=1&lang=en-US&movieId=" + strH + "&packageName=com.external.castle", null);
                                    kotlin.o oVar3 = com.app.mlounge.util.a.a;
                                    if (strF2 != null) {
                                        kotlin.text.k.y0(30, strF2);
                                    }
                                    if (strF2 == null) {
                                        return uVar;
                                    }
                                    String strB2 = f.b(this.this$0, strF2, strH7);
                                    kotlin.text.k.y0(50, strB2);
                                    com.google.gson.k kVar2 = (com.google.gson.k) this.this$0.gson.d(cls2, strB2);
                                    Objects.toString(kVar2);
                                    if (kVar2 != null && (kVarO = kVar2.o("data")) != null && (gVarN = kVarO.n("episodes")) != null) {
                                        String str12 = "movieId";
                                        if (!kotlin.jvm.internal.l.a(this.$mediaType, "tv") || this.$season == null) {
                                            gVar2 = gVarN;
                                            str = null;
                                            gVar3 = gVar2;
                                        } else {
                                            com.google.gson.k kVarO4 = kVar2.o("data");
                                            com.google.gson.g gVarN4 = kVarO4 != null ? kVarO4.n("seasons") : null;
                                            if (gVarN4 != null) {
                                                Iterator it3 = gVarN4.e.iterator();
                                                it3.getClass();
                                                while (true) {
                                                    if (it3.hasNext()) {
                                                        com.google.gson.h hVar = (com.google.gson.h) it3.next();
                                                        Iterator it4 = it3;
                                                        com.google.gson.h hVarL12 = hVar.e().l("number");
                                                        if (hVarL12 != null) {
                                                            gVar2 = gVarN;
                                                            if (hVarL12.c() == this.$season.intValue()) {
                                                                com.google.gson.h hVarL13 = hVar.e().l("movieId");
                                                                String strH9 = hVarL13 != null ? hVarL13.h() : null;
                                                                if (strH9 == null || strH9.equals(strH)) {
                                                                    str = null;
                                                                } else {
                                                                    str = null;
                                                                    String strF3 = this.this$0.f("https://api.hlowb.com/film-api/v1.9.9/movie?channel=IndiaA&clientType=1&lang=en-US&movieId=" + strH9 + "&packageName=com.external.castle", null);
                                                                    if (strF3 != null) {
                                                                        com.google.gson.k kVar3 = (com.google.gson.k) this.this$0.gson.d(cls2, f.b(this.this$0, strF3, strH7));
                                                                        if (kVar3 != null) {
                                                                            com.google.gson.k kVarO5 = kVar3.o("data");
                                                                            gVar3 = (kVarO5 == null || (gVarN2 = kVarO5.n("episodes")) == null) ? gVar2 : gVarN2;
                                                                            strH = strH9;
                                                                        }
                                                                    }
                                                                }
                                                                gVar3 = gVar2;
                                                            }
                                                        } else {
                                                            gVar2 = gVarN;
                                                        }
                                                        it3 = it4;
                                                        gVarN = gVar2;
                                                    } else {
                                                        gVar2 = gVarN;
                                                        str = null;
                                                        gVar3 = gVar2;
                                                    }
                                                }
                                            } else {
                                                gVar2 = gVarN;
                                                str = null;
                                                gVar3 = gVar2;
                                            }
                                        }
                                        ArrayList arrayList5 = gVar3.e;
                                        if (kotlin.jvm.internal.l.a(this.$mediaType, "tv") && this.$episode != null) {
                                            Iterator it5 = arrayList5.iterator();
                                            it5.getClass();
                                            while (true) {
                                                if (it5.hasNext()) {
                                                    com.google.gson.h hVar2 = (com.google.gson.h) it5.next();
                                                    com.google.gson.h hVarL14 = hVar2.e().l("number");
                                                    if (hVarL14 != null && hVarL14.c() == this.$episode.intValue()) {
                                                        com.google.gson.h hVarL15 = hVar2.e().l("id");
                                                        if (hVarL15 != null) {
                                                            strH2 = hVarL15.h();
                                                            break;
                                                        }
                                                    }
                                                }
                                                strH2 = str;
                                                break;
                                            }
                                        }
                                        if (arrayList5.size() <= 0 || (hVarL = gVar3.i().e().l("id")) == null) {
                                            strH2 = str;
                                            break;
                                        }
                                        strH2 = hVarL.h();
                                        if (strH2 == null) {
                                            return uVar;
                                        }
                                        ArrayList arrayList6 = new ArrayList();
                                        Iterator it6 = arrayList5.iterator();
                                        it6.getClass();
                                        while (it6.hasNext()) {
                                            com.google.gson.h hVar3 = (com.google.gson.h) it6.next();
                                            com.google.gson.h hVarL16 = hVar3.e().l("id");
                                            if (kotlin.jvm.internal.l.a(hVarL16 != null ? hVarL16.h() : str, strH2)) {
                                                com.google.gson.g gVarN5 = hVar3.e().n("tracks");
                                                if (gVarN5 == null) {
                                                    break;
                                                }
                                                Iterator it7 = gVarN5.e.iterator();
                                                it7.getClass();
                                                while (it7.hasNext()) {
                                                    arrayList6.add(((com.google.gson.h) it7.next()).e());
                                                }
                                                break;
                                            }
                                        }
                                        ArrayList arrayList7 = new ArrayList();
                                        Iterator it8 = arrayList6.iterator();
                                        while (true) {
                                            it8 = it8;
                                            arrayList2 = arrayList7;
                                            str2 = str9;
                                            cls = cls2;
                                            str3 = strH7;
                                            if (!it8.hasNext()) {
                                                break;
                                            }
                                            String str13 = strH2;
                                            com.google.gson.k kVar4 = (com.google.gson.k) it8.next();
                                            String str14 = strH;
                                            com.google.gson.h hVarL17 = kVar4.l("languageName");
                                            if (hVarL17 == null || (strH3 = hVarL17.h()) == null) {
                                                com.google.gson.h hVarL18 = kVar4.l("abbreviate");
                                                strH3 = hVarL18 != null ? hVarL18.h() : null;
                                                if (strH3 == null) {
                                                    strH3 = "Unknown";
                                                }
                                            }
                                            String str15 = strH3;
                                            com.google.gson.h hVarL19 = kVar4.l("existIndividualVideo");
                                            if (hVarL19 != null) {
                                                String str16 = str12;
                                                if (!hVarL19.b()) {
                                                    str4 = str16;
                                                } else if (kVar4.l("languageId") != null) {
                                                    String strH10 = kVar4.l("languageId").h();
                                                    com.google.gson.f fVar = this.this$0.gson;
                                                    com.google.gson.k kVar5 = new com.google.gson.k();
                                                    kVar5.k("mode", "1");
                                                    kVar5.k("appMarket", "GuanWang");
                                                    kVar5.k("clientType", "1");
                                                    kVar5.k("woolUser", "false");
                                                    kVar5.k("apkSignKey", "ED0955EB04E67A1D9F3305B95454FED485261475");
                                                    kVar5.k("androidVersion", "13");
                                                    str5 = str14;
                                                    str4 = str16;
                                                    kVar5.k(str4, str5);
                                                    str8 = str13;
                                                    kVar5.k("episodeId", str8);
                                                    kVar5.k("languageId", strH10);
                                                    kVar5.k("isNewUser", "true");
                                                    kVar5.k("resolution", String.valueOf(2));
                                                    kVar5.k("packageName", "com.external.castle");
                                                    String strF4 = this.this$0.f("https://api.hlowb.com/film-api/v2.0.1/movie/getVideo2?clientType=1&packageName=com.external.castle&channel=IndiaA&lang=en-US", fVar.g(kVar5));
                                                    if (strF4 == null) {
                                                        strH = str5;
                                                        str12 = str4;
                                                        strH2 = str8;
                                                        arrayList7 = arrayList2;
                                                        str9 = str2;
                                                        cls2 = cls;
                                                        strH7 = str3;
                                                    } else {
                                                        str7 = str3;
                                                        cls2 = cls;
                                                        com.google.gson.k kVar6 = (com.google.gson.k) this.this$0.gson.d(cls2, f.b(this.this$0, strF4, str7));
                                                        if (kVar6 != null) {
                                                            str6 = str2;
                                                            kVarO2 = kVar6.o(str6);
                                                        } else {
                                                            str6 = str2;
                                                            kVarO2 = null;
                                                        }
                                                        if (kVarO2 != null) {
                                                            arrayList3 = arrayList2;
                                                            arrayList3.addAll(f.e(this.this$0, kVarO2, str15));
                                                            strH = str5;
                                                            strH2 = str8;
                                                            strH7 = str7;
                                                            str12 = str4;
                                                            arrayList7 = arrayList3;
                                                            str9 = str6;
                                                        } else {
                                                            strH = str5;
                                                            strH2 = str8;
                                                            str9 = str6;
                                                            strH7 = str7;
                                                            str12 = str4;
                                                            arrayList7 = arrayList2;
                                                        }
                                                    }
                                                } else {
                                                    strH = str14;
                                                    arrayList7 = arrayList2;
                                                    str9 = str2;
                                                    cls2 = cls;
                                                    strH7 = str3;
                                                    strH2 = str13;
                                                    str12 = str16;
                                                }
                                            } else {
                                                str4 = str12;
                                            }
                                            str5 = str14;
                                            arrayList3 = arrayList2;
                                            str6 = str2;
                                            cls2 = cls;
                                            str7 = str3;
                                            str8 = str13;
                                            strH = str5;
                                            strH2 = str8;
                                            strH7 = str7;
                                            str12 = str4;
                                            arrayList7 = arrayList3;
                                            str9 = str6;
                                        }
                                        String str17 = str12;
                                        String str18 = strH2;
                                        String str19 = strH;
                                        if (arrayList2.isEmpty()) {
                                            com.google.gson.f fVar2 = this.this$0.gson;
                                            try {
                                                com.google.gson.k kVar7 = new com.google.gson.k();
                                                kVar7.k("mode", "1");
                                                kVar7.k("appMarket", "GuanWang");
                                                kVar7.k("clientType", "1");
                                                kVar7.k("woolUser", "false");
                                                kVar7.k("apkSignKey", "ED0955EB04E67A1D9F3305B95454FED485261475");
                                                kVar7.k("androidVersion", "13");
                                                kVar7.k(str17, str19);
                                                kVar7.k("episodeId", str18);
                                                kVar7.k("isNewUser", "true");
                                                kVar7.k("resolution", String.valueOf(2));
                                                kVar7.k("packageName", "com.external.castle");
                                                String strF5 = this.this$0.f("https://api.hlowb.com/film-api/v2.0.1/movie/getVideo2?clientType=1&packageName=com.external.castle&channel=IndiaA&lang=en-US", fVar2.g(kVar7));
                                                if (strF5 == null) {
                                                    return uVar;
                                                }
                                                com.google.gson.k kVar8 = (com.google.gson.k) this.this$0.gson.d(cls, f.b(this.this$0, strF5, str3));
                                                com.google.gson.k kVarO6 = kVar8 != null ? kVar8.o(str2) : null;
                                                if (kVarO6 != null) {
                                                    arrayList2.addAll(f.e(this.this$0, kVarO6, "Shared"));
                                                    return arrayList2;
                                                }
                                            } catch (Exception e) {
                                                e = e;
                                            }
                                        }
                                        return arrayList2;
                                    }
                                    return uVar;
                                }
                            }
                        } catch (Exception e2) {
                            e = e2;
                        }
                        kotlin.o oVar4 = com.app.mlounge.util.a.a;
                        coil3.compose.internal.f.i("Error: ", e.getMessage(), "Castle");
                        return uVar;
                    }
                }
            } catch (Exception e3) {
                e = e3;
                uVar = uVar2;
            }
        }
        return uVar2;
    }
}
