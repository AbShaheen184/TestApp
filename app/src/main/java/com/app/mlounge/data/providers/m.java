package com.app.mlounge.data.providers;

import android.util.Base64;
import com.app.mlounge.data.remote.model.ChqStream;
import j$.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class m extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    final /* synthetic */ Integer $episode;
    final /* synthetic */ String $mediaType;
    final /* synthetic */ Integer $season;
    final /* synthetic */ String $tmdbId;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ n this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String str, String str2, Integer num, Integer num2, n nVar, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.$tmdbId = str;
        this.$mediaType = str2;
        this.$season = num;
        this.$episode = num2;
        this.this$0 = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        m mVar = new m(this.$tmdbId, this.$mediaType, this.$season, this.$episode, this.this$0, dVar);
        mVar.L$0 = obj;
        return mVar;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
    }

    /* JADX WARN: Code duplicated, block: B:140:0x0346  */
    /* JADX WARN: Code duplicated, block: B:190:0x04cf  */
    /* JADX WARN: Code duplicated, block: B:199:0x04c9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x008b  */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objFirst;
        String str;
        Object objFirst2;
        String str2;
        Object objC;
        String str3;
        com.google.gson.k kVar;
        String str4;
        String upperCase;
        String strH;
        String strH2;
        String strH3;
        String strH4;
        String strH5;
        String lowerCase;
        String str5;
        String str6;
        String strH6;
        ArrayList arrayList;
        String strH7;
        String strH8;
        Integer num;
        String str7 = "[.\\-_]+";
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        int i = this.label;
        kotlin.collections.u uVar = kotlin.collections.u.e;
        String str8 = "";
        ChqStream chqStream = null;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        try {
            if (i == 0) {
                kotlin.a.e(obj);
                kotlin.o oVar = com.app.mlounge.util.a.a;
                Flow flow = this.this$0.prefs.p;
                this.L$0 = coroutineScope;
                this.label = 1;
                objFirst = FlowKt.first(flow, this);
                if (objFirst != aVar) {
                }
                return aVar;
            }
            if (i == 1) {
                kotlin.a.e(obj);
                objFirst = obj;
            } else {
                if (i == 2) {
                    str = (String) this.L$1;
                    kotlin.a.e(obj);
                    objFirst2 = obj;
                    str2 = (String) objFirst2;
                    if (str2 == null) {
                        str2 = "";
                    }
                    if (!kotlin.text.k.d0(str) || kotlin.text.k.d0(str2)) {
                        kotlin.o oVar2 = com.app.mlounge.util.a.a;
                        return uVar;
                    }
                    kotlin.o oVar3 = com.app.mlounge.util.a.a;
                    l1 l1Var = this.this$0.tmdbHelper;
                    String str9 = this.$tmdbId;
                    String str10 = this.$mediaType;
                    this.L$0 = coroutineScope;
                    this.L$1 = str;
                    this.L$2 = str2;
                    this.label = 3;
                    objC = l1Var.c(str9, str10, this);
                    if (objC != aVar) {
                        str3 = str2;
                    }
                    return aVar;
                }
                if (i != 3) {
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str3 = (String) this.L$2;
                str = (String) this.L$1;
                kotlin.a.e(obj);
                objC = obj;
            }
            i1 i1Var = (i1) objC;
            kotlin.o oVar4 = com.app.mlounge.util.a.a;
            if (i1Var != null) {
                String strA = i1Var.a();
                Integer numB = i1Var.b();
                if (kotlin.jvm.internal.l.a(this.$mediaType, "tv") && (num = this.$season) != null && this.$episode != null) {
                    strA = strA + " S" + kotlin.text.k.h0(2, String.valueOf(num.intValue())) + "E" + kotlin.text.k.h0(2, String.valueOf(this.$episode.intValue()));
                } else if (numB != null) {
                    strA = strA + " " + numB;
                }
                byte[] bytes = (str + ":" + str3).getBytes(kotlin.text.a.a);
                bytes.getClass();
                String str11 = "Basic " + Base64.encodeToString(bytes, 2);
                String str12 = "https://members.easynews.com/2.0/search/solr-search/advanced?st=adv&sb=1&fex=m4v,3gp,mov,divx,xvid,wmv,avi,mpg,mpeg,mp4,mkv,avc,flv,webm&fty[]=VIDEO&spamf=1&u=1&gx=1&pno=1&sS=3&s1=dsize&s1d=-&s2=relevance&s2d=-&s3=dtime&s3d=-&pby=50&safeO=0&gps=" + URLEncoder.encode(strA, "UTF-8");
                okhttp3.a0 a0Var = new okhttp3.a0();
                a0Var.d(str12);
                a0Var.b("Authorization", str11);
                a0Var.b("Accept", "application/json");
                a0Var.b("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 Chrome/120.0.0.0 Safari/537.36");
                okhttp3.b0 b0Var = new okhttp3.b0(a0Var);
                okhttp3.y yVar = this.this$0.client;
                yVar.getClass();
                okhttp3.g0 g0VarE = new okhttp3.internal.connection.m(yVar, b0Var, false).e();
                boolean z = g0VarE.N;
                okhttp3.j0 j0Var = g0VarE.D;
                if (!z) {
                    String strZ = j0Var != null ? j0Var.z() : null;
                    if (strZ != null) {
                        str8 = strZ;
                    }
                    kotlin.text.k.y0(500, str8);
                    return uVar;
                }
                String strZ2 = j0Var != null ? j0Var.z() : null;
                kotlin.text.k.y0(1000, strZ2 == null ? "" : strZ2);
                if (strZ2 != null && (kVar = (com.google.gson.k) this.this$0.gson.d(com.google.gson.k.class, strZ2)) != null) {
                    kotlin.collections.o.R((com.google.gson.internal.l) kVar.e.keySet(), null, null, null, null, 63);
                    com.google.gson.h hVarL = kVar.l("downURL");
                    String strB0 = (hVarL == null || (strH8 = hVarL.h()) == null) ? null : kotlin.text.k.B0(strH8, '/');
                    if (strB0 == null) {
                        com.google.gson.h hVarL2 = kVar.l("dlUrl");
                        if (hVarL2 != null && (strH7 = hVarL2.h()) != null) {
                            kotlin.text.k.B0(strH7, '/');
                            return uVar;
                        }
                    } else {
                        com.google.gson.h hVarL3 = kVar.l("dlFarm");
                        String strH9 = hVarL3 != null ? hVarL3.h() : null;
                        if (strH9 != null) {
                            com.google.gson.h hVarL4 = kVar.l("dlPort");
                            String strH10 = hVarL4 != null ? hVarL4.h() : null;
                            if (strH10 != null) {
                                com.google.gson.g gVarN = kVar.n("data");
                                (gVarN != null ? new Integer(gVarN.e.size()) : "null").toString();
                                if (gVarN != null) {
                                    String lowerCase2 = strA.toLowerCase(Locale.ROOT);
                                    lowerCase2.getClass();
                                    Pattern patternCompile = Pattern.compile("[.\\-_]+");
                                    patternCompile.getClass();
                                    String strReplaceAll = patternCompile.matcher(lowerCase2).replaceAll(" ");
                                    strReplaceAll.getClass();
                                    Pattern patternCompile2 = Pattern.compile(r0);
                                    patternCompile2.getClass();
                                    String strReplaceAll2 = patternCompile2.matcher(strReplaceAll).replaceAll("");
                                    strReplaceAll2.getClass();
                                    String string = kotlin.text.k.A0(strReplaceAll2).toString();
                                    ArrayList arrayList2 = new ArrayList();
                                    Iterator it = gVarN.e.iterator();
                                    while (it.hasNext()) {
                                        com.google.gson.k kVarE = ((com.google.gson.h) it.next()).e();
                                        com.google.gson.h hVarL5 = kVarE.l("passwd");
                                        if (hVarL5 != null) {
                                            str4 = str7;
                                            if (hVarL5.b()) {
                                            }
                                            kotlin.o oVar5 = com.app.mlounge.util.a.a;
                                            str11 = str11;
                                            it = it;
                                            arrayList2 = arrayList2;
                                            uVar = uVar;
                                            if (chqStream != null) {
                                                try {
                                                    arrayList = arrayList2;
                                                    arrayList.add(chqStream);
                                                } catch (Exception e) {
                                                    e = e;
                                                    kotlin.o oVar6 = com.app.mlounge.util.a.a;
                                                    coil3.compose.internal.f.i("Error: ", e.getMessage(), "EasyNews");
                                                    return uVar;
                                                }
                                            } else {
                                                arrayList = arrayList2;
                                            }
                                            str11 = str11;
                                            arrayList2 = arrayList;
                                            str7 = str4;
                                            it = it;
                                            uVar = uVar;
                                        } else {
                                            str4 = str7;
                                        }
                                        com.google.gson.h hVarL6 = kVarE.l("virus");
                                        if (hVarL6 == null || !hVarL6.b()) {
                                            com.google.gson.h hVarL7 = kVarE.l("type");
                                            if (hVarL7 == null || (strH6 = hVarL7.h()) == null) {
                                                upperCase = null;
                                            } else {
                                                upperCase = strH6.toUpperCase(Locale.ROOT);
                                                upperCase.getClass();
                                            }
                                            if (kotlin.jvm.internal.l.a(upperCase, "VIDEO")) {
                                                com.google.gson.h hVarL8 = kVarE.l("14");
                                                if (hVarL8 == null || (strH = hVarL8.h()) == null) {
                                                    strH = "";
                                                }
                                                Pattern patternCompile3 = Pattern.compile("^\\d+s$");
                                                patternCompile3.getClass();
                                                if (patternCompile3.matcher(strH).matches()) {
                                                    kotlin.o oVar7 = com.app.mlounge.util.a.a;
                                                    chqStream = null;
                                                } else {
                                                    Pattern patternCompile4 = Pattern.compile("^[0-5]m$");
                                                    patternCompile4.getClass();
                                                    if (patternCompile4.matcher(strH).matches()) {
                                                        kotlin.o oVar8 = com.app.mlounge.util.a.a;
                                                    } else {
                                                        com.google.gson.h hVarL9 = kVarE.l("0");
                                                        if (hVarL9 == null || (strH2 = hVarL9.h()) == null) {
                                                            kotlin.o oVar9 = com.app.mlounge.util.a.a;
                                                        } else {
                                                            com.google.gson.h hVarL10 = kVarE.l("10");
                                                            if (hVarL10 == null || (strH3 = hVarL10.h()) == null) {
                                                                kotlin.o oVar10 = com.app.mlounge.util.a.a;
                                                            } else {
                                                                it = it;
                                                                com.google.gson.h hVarL11 = kVarE.l("11");
                                                                if (hVarL11 == null || (strH4 = hVarL11.h()) == null) {
                                                                    strH4 = "";
                                                                }
                                                                uVar = uVar;
                                                                com.google.gson.h hVarL12 = kVarE.l("4");
                                                                String strH11 = hVarL12 != null ? hVarL12.h() : null;
                                                                com.google.gson.h hVarL13 = kVarE.l("fullres");
                                                                if (hVarL13 == null || (strH5 = hVarL13.h()) == null) {
                                                                    strH5 = "";
                                                                }
                                                                Locale locale = Locale.ROOT;
                                                                arrayList2 = arrayList2;
                                                                String lowerCase3 = strH3.toLowerCase(locale);
                                                                lowerCase3.getClass();
                                                                String str13 = str11;
                                                                Pattern patternCompile5 = Pattern.compile(str4);
                                                                patternCompile5.getClass();
                                                                String strReplaceAll3 = patternCompile5.matcher(lowerCase3).replaceAll(" ");
                                                                strReplaceAll3.getClass();
                                                                Pattern patternCompile6 = Pattern.compile("[^\\w\\s]");
                                                                patternCompile6.getClass();
                                                                String strReplaceAll4 = patternCompile6.matcher(strReplaceAll3).replaceAll("");
                                                                strReplaceAll4.getClass();
                                                                if (kotlin.text.k.T(kotlin.text.k.A0(strReplaceAll4).toString(), string, true)) {
                                                                    Pattern patternCompile7 = Pattern.compile("(4320p|2160p|1080p|1080i|720p|720i|576p|576i|480p|480i|360p)", 66);
                                                                    patternCompile7.getClass();
                                                                    String str14 = strH3 + " " + strH5;
                                                                    Matcher matcher = patternCompile7.matcher(str14);
                                                                    matcher.getClass();
                                                                    kotlin.text.g gVarC = com.google.android.material.shape.k.C(matcher, 0, str14);
                                                                    if (gVarC == null || (str6 = (String) ((kotlin.collections.b0) gVarC.a()).get(1)) == null) {
                                                                        lowerCase = null;
                                                                    } else {
                                                                        lowerCase = str6.toLowerCase(locale);
                                                                        lowerCase.getClass();
                                                                    }
                                                                    String str15 = strB0 + "/" + strH9 + "/" + strH10 + "/" + strH2 + strH4 + "/" + strH3 + strH4;
                                                                    kotlin.o oVar11 = com.app.mlounge.util.a.a;
                                                                    if (lowerCase != null) {
                                                                        str5 = " " + lowerCase;
                                                                    } else {
                                                                        str5 = "";
                                                                    }
                                                                    String str16 = "EasyNews" + str5;
                                                                    str11 = str13;
                                                                    Map mapSingletonMap = Collections.singletonMap("Authorization", str11);
                                                                    mapSingletonMap.getClass();
                                                                    chqStream = new ChqStream(str16, str15, lowerCase, "direct", "direct", strH11, mapSingletonMap, null, null, null, null, null, null, 8064);
                                                                } else {
                                                                    kotlin.o oVar12 = com.app.mlounge.util.a.a;
                                                                    str11 = str13;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    chqStream = null;
                                                }
                                            } else {
                                                kotlin.o oVar13 = com.app.mlounge.util.a.a;
                                            }
                                            if (chqStream != null) {
                                                arrayList = arrayList2;
                                                arrayList.add(chqStream);
                                            } else {
                                                arrayList = arrayList2;
                                            }
                                            str11 = str11;
                                            arrayList2 = arrayList;
                                            str7 = str4;
                                            it = it;
                                            uVar = uVar;
                                        } else {
                                            kotlin.o oVar14 = com.app.mlounge.util.a.a;
                                        }
                                        str11 = str11;
                                        it = it;
                                        arrayList2 = arrayList2;
                                        uVar = uVar;
                                        if (chqStream != null) {
                                            arrayList = arrayList2;
                                            arrayList.add(chqStream);
                                        } else {
                                            arrayList = arrayList2;
                                        }
                                        str11 = str11;
                                        arrayList2 = arrayList;
                                        str7 = str4;
                                        it = it;
                                        uVar = uVar;
                                    }
                                    uVar = uVar;
                                    List listG0 = kotlin.collections.o.g0(15, arrayList2);
                                    kotlin.o oVar15 = com.app.mlounge.util.a.a;
                                    listG0.size();
                                    return listG0;
                                }
                            }
                        }
                    }
                }
            }
            return uVar;
            str = (String) objFirst;
            if (str == null) {
                str = "";
            }
            Flow flow2 = this.this$0.prefs.q;
            this.L$0 = coroutineScope;
            this.L$1 = str;
            this.label = 2;
            objFirst2 = FlowKt.first(flow2, this);
            if (objFirst2 != aVar) {
                str2 = (String) objFirst2;
                if (str2 == null) {
                    str2 = "";
                }
                if (kotlin.text.k.d0(str)) {
                }
                kotlin.o oVar16 = com.app.mlounge.util.a.a;
                return uVar;
            }
            return aVar;
        } catch (Exception e2) {
            e = e2;
            uVar = uVar;
        }
    }
}
