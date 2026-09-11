package com.app.mlounge.data.providers;

import android.util.Base64;
import com.app.mlounge.data.remote.model.ChqStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    final /* synthetic */ Integer $episode;
    final /* synthetic */ String $mediaType;
    final /* synthetic */ Integer $season;
    final /* synthetic */ String $tmdbId;
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;
    final /* synthetic */ k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, String str, String str2, Integer num, Integer num2, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.this$0 = kVar;
        this.$tmdbId = str;
        this.$mediaType = str2;
        this.$season = num;
        this.$episode = num2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new j(this.this$0, this.$tmdbId, this.$mediaType, this.$season, this.$episode, dVar);
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x03b8  */
    /* JADX WARN: Code duplicated, block: B:142:0x0468 A[Catch: Exception -> 0x0046, TryCatch #0 {Exception -> 0x0046, blocks: (B:10:0x003c, B:49:0x015c, B:52:0x0164, B:55:0x016f, B:57:0x018c, B:60:0x0193, B:62:0x01ac, B:65:0x01b3, B:67:0x01cc, B:70:0x01d3, B:71:0x01ea, B:74:0x02f1, B:76:0x02f5, B:78:0x02f9, B:80:0x0324, B:83:0x0367, B:85:0x036b, B:88:0x0373, B:91:0x0385, B:94:0x038f, B:95:0x039a, B:97:0x03a0, B:99:0x03b2, B:102:0x03bc, B:104:0x03c4, B:107:0x03cb, B:109:0x03d3, B:112:0x03da, B:152:0x04b6, B:115:0x03e8, B:117:0x03ff, B:119:0x040e, B:121:0x0414, B:123:0x041b, B:125:0x0424, B:128:0x042d, B:140:0x0456, B:142:0x0468, B:144:0x047f, B:149:0x0490, B:132:0x043a, B:135:0x0445, B:153:0x04bb, B:79:0x0315, B:17:0x0069, B:45:0x013a, B:20:0x008a, B:41:0x0112, B:24:0x00a5, B:37:0x00f2, B:33:0x00ce), top: B:158:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:143:0x047d  */
    /* JADX WARN: Code duplicated, block: B:146:0x0488  */
    /* JADX WARN: Code duplicated, block: B:148:0x048d  */
    /* JADX WARN: Code duplicated, block: B:160:0x04b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:163:0x039a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x010e  */
    /* JADX WARN: Code duplicated, block: B:40:0x010f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0133  */
    /* JADX WARN: Code duplicated, block: B:44:0x0134  */
    /* JADX WARN: Code duplicated, block: B:48:0x015a  */
    /* JADX WARN: Code duplicated, block: B:54:0x016a  */
    /* JADX WARN: Code duplicated, block: B:79:0x0315 A[Catch: Exception -> 0x0046, TryCatch #0 {Exception -> 0x0046, blocks: (B:10:0x003c, B:49:0x015c, B:52:0x0164, B:55:0x016f, B:57:0x018c, B:60:0x0193, B:62:0x01ac, B:65:0x01b3, B:67:0x01cc, B:70:0x01d3, B:71:0x01ea, B:74:0x02f1, B:76:0x02f5, B:78:0x02f9, B:80:0x0324, B:83:0x0367, B:85:0x036b, B:88:0x0373, B:91:0x0385, B:94:0x038f, B:95:0x039a, B:97:0x03a0, B:99:0x03b2, B:102:0x03bc, B:104:0x03c4, B:107:0x03cb, B:109:0x03d3, B:112:0x03da, B:152:0x04b6, B:115:0x03e8, B:117:0x03ff, B:119:0x040e, B:121:0x0414, B:123:0x041b, B:125:0x0424, B:128:0x042d, B:140:0x0456, B:142:0x0468, B:144:0x047f, B:149:0x0490, B:132:0x043a, B:135:0x0445, B:153:0x04bb, B:79:0x0315, B:17:0x0069, B:45:0x013a, B:20:0x008a, B:41:0x0112, B:24:0x00a5, B:37:0x00f2, B:33:0x00ce), top: B:158:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:97:0x03a0 A[Catch: Exception -> 0x0046, TryCatch #0 {Exception -> 0x0046, blocks: (B:10:0x003c, B:49:0x015c, B:52:0x0164, B:55:0x016f, B:57:0x018c, B:60:0x0193, B:62:0x01ac, B:65:0x01b3, B:67:0x01cc, B:70:0x01d3, B:71:0x01ea, B:74:0x02f1, B:76:0x02f5, B:78:0x02f9, B:80:0x0324, B:83:0x0367, B:85:0x036b, B:88:0x0373, B:91:0x0385, B:94:0x038f, B:95:0x039a, B:97:0x03a0, B:99:0x03b2, B:102:0x03bc, B:104:0x03c4, B:107:0x03cb, B:109:0x03d3, B:112:0x03da, B:152:0x04b6, B:115:0x03e8, B:117:0x03ff, B:119:0x040e, B:121:0x0414, B:123:0x041b, B:125:0x0424, B:128:0x042d, B:140:0x0456, B:142:0x0468, B:144:0x047f, B:149:0x0490, B:132:0x043a, B:135:0x0445, B:153:0x04bb, B:79:0x0315, B:17:0x0069, B:45:0x013a, B:20:0x008a, B:41:0x0112, B:24:0x00a5, B:37:0x00f2, B:33:0x00ce), top: B:158:0x0018 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:79:0x0315, please report this as an issue */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objD;
        k kVar;
        List listH;
        Object objFirst;
        String str;
        List list;
        int i;
        String str2;
        Object objFirst2;
        List list2;
        k kVar2;
        String str3;
        int i2;
        Object objFirst3;
        List list3;
        List list4;
        String str4;
        k kVar3;
        int i3;
        String str5;
        Object objFirst4;
        String str6;
        String str7;
        String str8;
        String str9;
        okhttp3.g0 g0VarE;
        okhttp3.j0 j0Var;
        String strZ;
        com.google.gson.k kVar4;
        com.google.gson.g gVarN;
        ArrayList arrayList;
        Iterator it;
        com.google.gson.h hVarL;
        ChqStream chqStream;
        String strH;
        String strH2;
        String strH3;
        String str10;
        String str11;
        List listP0;
        String strR;
        String str12;
        String str13;
        Integer numQ;
        Integer num;
        Integer num2;
        int i4 = this.label;
        kotlin.collections.u uVar = kotlin.collections.u.e;
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        try {
            if (i4 == 0) {
                kotlin.a.e(obj);
                l1 l1Var = this.this$0.tmdbHelper;
                String str14 = this.$tmdbId;
                String str15 = this.$mediaType;
                this.label = 1;
                objD = l1Var.d(str14, str15, this);
                if (objD != aVar) {
                }
                return aVar;
            }
            if (i4 == 1) {
                kotlin.a.e(obj);
                objD = obj;
            } else {
                if (i4 == 2) {
                    i = this.I$0;
                    listH = (List) this.L$3;
                    list = (List) this.L$2;
                    kVar = (k) this.L$1;
                    str = (String) this.L$0;
                    kotlin.a.e(obj);
                    objFirst = obj;
                    str2 = (String) objFirst;
                    Flow flow = kVar.prefs.i;
                    this.L$0 = str;
                    this.L$1 = kVar;
                    this.L$2 = list;
                    this.L$3 = listH;
                    this.L$4 = str2;
                    this.I$0 = i;
                    this.label = 3;
                    objFirst2 = FlowKt.first(flow, this);
                    if (objFirst2 == aVar) {
                        list2 = listH;
                        kVar2 = kVar;
                        str3 = (String) objFirst2;
                        Flow flow2 = kVar2.prefs.j;
                        this.L$0 = str;
                        this.L$1 = kVar2;
                        this.L$2 = list;
                        this.L$3 = list2;
                        this.L$4 = str2;
                        this.L$5 = str3;
                        this.I$0 = i;
                        i2 = i;
                        this.label = 4;
                        objFirst3 = FlowKt.first(flow2, this);
                        if (objFirst3 != aVar) {
                            list3 = list;
                            list4 = list2;
                            str4 = str3;
                            kVar3 = kVar2;
                            i3 = i2;
                            str5 = (String) objFirst3;
                            Flow flow3 = kVar3.prefs.k;
                            this.L$0 = str;
                            this.L$1 = list3;
                            this.L$2 = list4;
                            this.L$3 = str2;
                            this.L$4 = str4;
                            this.L$5 = str5;
                            this.I$0 = i3;
                            this.label = 5;
                            objFirst4 = FlowKt.first(flow3, this);
                            if (objFirst4 != aVar) {
                                str6 = str2;
                                str7 = str;
                            }
                        }
                    }
                    return aVar;
                }
                if (i4 == 3) {
                    i = this.I$0;
                    String str16 = (String) this.L$4;
                    list2 = (List) this.L$3;
                    list = (List) this.L$2;
                    kVar = (k) this.L$1;
                    str = (String) this.L$0;
                    kotlin.a.e(obj);
                    objFirst2 = obj;
                    str2 = str16;
                    kVar2 = kVar;
                    str3 = (String) objFirst2;
                    Flow flow4 = kVar2.prefs.j;
                    this.L$0 = str;
                    this.L$1 = kVar2;
                    this.L$2 = list;
                    this.L$3 = list2;
                    this.L$4 = str2;
                    this.L$5 = str3;
                    this.I$0 = i;
                    i2 = i;
                    this.label = 4;
                    objFirst3 = FlowKt.first(flow4, this);
                    if (objFirst3 != aVar) {
                        list3 = list;
                        list4 = list2;
                        str4 = str3;
                        kVar3 = kVar2;
                        i3 = i2;
                        str5 = (String) objFirst3;
                        Flow flow5 = kVar3.prefs.k;
                        this.L$0 = str;
                        this.L$1 = list3;
                        this.L$2 = list4;
                        this.L$3 = str2;
                        this.L$4 = str4;
                        this.L$5 = str5;
                        this.I$0 = i3;
                        this.label = 5;
                        objFirst4 = FlowKt.first(flow5, this);
                        if (objFirst4 != aVar) {
                            str6 = str2;
                            str7 = str;
                        }
                    }
                    return aVar;
                }
                if (i4 == 4) {
                    int i5 = this.I$0;
                    String str17 = (String) this.L$5;
                    String str18 = (String) this.L$4;
                    list4 = (List) this.L$3;
                    list3 = (List) this.L$2;
                    k kVar5 = (k) this.L$1;
                    str = (String) this.L$0;
                    kotlin.a.e(obj);
                    str2 = str18;
                    str4 = str17;
                    kVar3 = kVar5;
                    i3 = i5;
                    objFirst3 = obj;
                    str5 = (String) objFirst3;
                    Flow flow6 = kVar3.prefs.k;
                    this.L$0 = str;
                    this.L$1 = list3;
                    this.L$2 = list4;
                    this.L$3 = str2;
                    this.L$4 = str4;
                    this.L$5 = str5;
                    this.I$0 = i3;
                    this.label = 5;
                    objFirst4 = FlowKt.first(flow6, this);
                    if (objFirst4 != aVar) {
                        str6 = str2;
                        str7 = str;
                    }
                    return aVar;
                }
                if (i4 != 5) {
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str5 = (String) this.L$5;
                String str19 = (String) this.L$4;
                str6 = (String) this.L$3;
                List list5 = (List) this.L$2;
                List list6 = (List) this.L$1;
                str7 = (String) this.L$0;
                kotlin.a.e(obj);
                list3 = list6;
                list4 = list5;
                str4 = str19;
                objFirst4 = obj;
            }
            str8 = (String) objFirst4;
            if (str6 == null && str6.length() != 0) {
                list4.add(kotlin.collections.a0.v(new kotlin.k("service", "premiumize"), new kotlin.k("apiKey", str6)));
            }
            if (str4 != null && str4.length() != 0) {
                list4.add(kotlin.collections.a0.v(new kotlin.k("service", "torbox"), new kotlin.k("apiKey", str4)));
            }
            if (str5 != null && str5.length() != 0) {
                list4.add(kotlin.collections.a0.v(new kotlin.k("service", "alldebrid"), new kotlin.k("apiKey", str5)));
            }
            if (str8 != null && str8.length() != 0) {
                list4.add(kotlin.collections.a0.v(new kotlin.k("service", "realdebrid"), new kotlin.k("apiKey", str8)));
            }
            kotlin.collections.builders.b bVarC = com.google.common.base.c.c(list3);
            com.google.gson.k kVar6 = new com.google.gson.k();
            k kVar7 = this.this$0;
            kVar6.i("maxResultsPerResolution", new com.google.gson.l(new Integer(0)));
            kVar6.i("maxSize", new com.google.gson.l(new Integer(0)));
            Boolean bool = Boolean.FALSE;
            kVar6.j("cachedOnly", bool);
            kVar6.j("sortCachedUncachedTogether", bool);
            kVar6.j("removeTrash", Boolean.TRUE);
            kVar6.i("resultFormat", kVar7.gson.j(com.google.common.base.c.p("all")));
            kVar6.i("debridServices", kVar7.gson.j(bVarC));
            kVar6.j("enableTorrent", bool);
            kVar6.j("deduplicateStreams", bool);
            kVar6.j("scrapeDebridAccountTorrents", bool);
            kVar6.k("debridStreamProxyPassword", "");
            com.google.gson.k kVar8 = new com.google.gson.k();
            kVar8.i("required", kVar7.gson.j(uVar));
            kVar8.i("allowed", kVar7.gson.j(uVar));
            kVar8.i("exclude", kVar7.gson.j(uVar));
            kVar8.i("preferred", kVar7.gson.j(uVar));
            kVar6.i("languages", kVar8);
            kVar6.i("resolutions", new com.google.gson.k());
            com.google.gson.k kVar9 = new com.google.gson.k();
            kVar9.i("remove_ranks_under", new com.google.gson.l(new Long(-10000000000L)));
            kVar9.j("allow_english_in_languages", bool);
            kVar9.j("remove_unknown_languages", bool);
            kVar6.i("options", kVar9);
            byte[] bytes = this.this$0.gson.g(kVar6).getBytes(kotlin.text.a.a);
            bytes.getClass();
            String strEncodeToString = Base64.encodeToString(bytes, 10);
            if (kotlin.jvm.internal.l.a(this.$mediaType, "tv") || (num = this.$season) == null || (num2 = this.$episode) == null) {
                str9 = "stream/movie/" + str7 + ".json";
            } else {
                str9 = "stream/series/" + str7 + ":" + num + ":" + num2 + ".json";
            }
            String str20 = "https://comet.elfhosted.com/" + strEncodeToString + "/" + str9;
            okhttp3.a0 a0Var = new okhttp3.a0();
            a0Var.d(str20);
            a0Var.b("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 Chrome/120.0.0.0 Safari/537.36");
            okhttp3.b0 b0Var = new okhttp3.b0(a0Var);
            okhttp3.y yVar = this.this$0.client;
            yVar.getClass();
            g0VarE = new okhttp3.internal.connection.m(yVar, b0Var, false).e();
            if (g0VarE.N && (j0Var = g0VarE.D) != null && (strZ = j0Var.z()) != null && (kVar4 = (com.google.gson.k) this.this$0.gson.d(com.google.gson.k.class, strZ)) != null && (gVarN = kVar4.n("streams")) != null) {
                arrayList = new ArrayList();
                it = gVarN.e.iterator();
                while (it.hasNext()) {
                    com.google.gson.k kVarE = ((com.google.gson.h) it.next()).e();
                    hVarL = kVarE.l("url");
                    if (hVarL == null && (strH = hVarL.h()) != null) {
                        com.google.gson.h hVarL2 = kVarE.l("name");
                        if (hVarL2 == null || (strH2 = hVarL2.h()) == null) {
                            strH2 = "";
                        }
                        com.google.gson.h hVarL3 = kVarE.l("description");
                        if (hVarL3 == null || (strH3 = hVarL3.h()) == null) {
                            strH3 = "";
                        }
                        if (kotlin.text.k.T(strH2, "[🔄]", false)) {
                            chqStream = null;
                        } else {
                            Pattern patternCompile = Pattern.compile("[\\uD83D\\uDC64]\\s*(\\d+)");
                            patternCompile.getClass();
                            Matcher matcher = patternCompile.matcher(strH3);
                            matcher.getClass();
                            kotlin.text.g gVarC = com.google.android.material.shape.k.C(matcher, 0, strH3);
                            int iIntValue = (gVarC == null || (str13 = (String) ((kotlin.collections.b0) gVarC.a()).get(1)) == null || (numQ = kotlin.text.r.Q(str13)) == null) ? 0 : numQ.intValue();
                            if (kotlin.text.k.T(strH2, "2160", false) || kotlin.text.k.T(strH2, "4K", false)) {
                                str10 = "2160p";
                            } else if (kotlin.text.k.T(strH2, "1080", false)) {
                                str10 = "1080p";
                            } else if (kotlin.text.k.T(strH2, "720", false)) {
                                str10 = "720p";
                            } else {
                                if (kotlin.text.k.T(strH2, "480", false)) {
                                    str10 = "480p";
                                } else {
                                    str11 = null;
                                }
                                listP0 = kotlin.text.k.p0(new String[]{"\n"}, strH3, 6);
                                if (listP0.size() > 1) {
                                    strR = kotlin.collections.o.R(kotlin.collections.o.H(listP0), " | ", null, null, null, 62);
                                } else {
                                    strR = null;
                                }
                                if (kotlin.text.k.T(strH, ".m3u8", false)) {
                                    str12 = "hls";
                                } else {
                                    str12 = "direct";
                                }
                                String str21 = str12;
                                chqStream = new ChqStream(strH2, strH, str11, str21, str21, null, null, new Integer(iIntValue), null, null, Boolean.FALSE, strR, null, 4864);
                            }
                            str11 = str10;
                            listP0 = kotlin.text.k.p0(new String[]{"\n"}, strH3, 6);
                            if (listP0.size() > 1) {
                                strR = kotlin.collections.o.R(kotlin.collections.o.H(listP0), " | ", null, null, null, 62);
                            } else {
                                strR = null;
                            }
                            if (kotlin.text.k.T(strH, ".m3u8", false)) {
                                str12 = "hls";
                            } else {
                                str12 = "direct";
                            }
                            String str22 = str12;
                            chqStream = new ChqStream(strH2, strH, str11, str22, str22, null, null, new Integer(iIntValue), null, null, Boolean.FALSE, strR, null, 4864);
                        }
                    }
                    if (chqStream != null) {
                        arrayList.add(chqStream);
                    }
                }
                return kotlin.collections.o.g0(15, kotlin.collections.o.f0(arrayList, new androidx.constraintlayout.core.e(12)));
            }
            return uVar;
            String str23 = (String) objD;
            if (str23 != null) {
                kVar = this.this$0;
                listH = com.google.common.base.c.h();
                Flow flow7 = kVar.prefs.h;
                this.L$0 = str23;
                this.L$1 = kVar;
                this.L$2 = listH;
                this.L$3 = listH;
                this.I$0 = 0;
                this.label = 2;
                objFirst = FlowKt.first(flow7, this);
                if (objFirst != aVar) {
                    str = str23;
                    list = listH;
                    i = 0;
                    str2 = (String) objFirst;
                    Flow flow8 = kVar.prefs.i;
                    this.L$0 = str;
                    this.L$1 = kVar;
                    this.L$2 = list;
                    this.L$3 = listH;
                    this.L$4 = str2;
                    this.I$0 = i;
                    this.label = 3;
                    objFirst2 = FlowKt.first(flow8, this);
                    if (objFirst2 == aVar) {
                        list2 = listH;
                        kVar2 = kVar;
                        str3 = (String) objFirst2;
                        Flow flow9 = kVar2.prefs.j;
                        this.L$0 = str;
                        this.L$1 = kVar2;
                        this.L$2 = list;
                        this.L$3 = list2;
                        this.L$4 = str2;
                        this.L$5 = str3;
                        this.I$0 = i;
                        i2 = i;
                        this.label = 4;
                        objFirst3 = FlowKt.first(flow9, this);
                        if (objFirst3 != aVar) {
                            list3 = list;
                            list4 = list2;
                            str4 = str3;
                            kVar3 = kVar2;
                            i3 = i2;
                            str5 = (String) objFirst3;
                            Flow flow10 = kVar3.prefs.k;
                            this.L$0 = str;
                            this.L$1 = list3;
                            this.L$2 = list4;
                            this.L$3 = str2;
                            this.L$4 = str4;
                            this.L$5 = str5;
                            this.I$0 = i3;
                            this.label = 5;
                            objFirst4 = FlowKt.first(flow10, this);
                            if (objFirst4 != aVar) {
                                str6 = str2;
                                str7 = str;
                                str8 = (String) objFirst4;
                                if (str6 == null) {
                                }
                                if (str4 != null) {
                                    list4.add(kotlin.collections.a0.v(new kotlin.k("service", "torbox"), new kotlin.k("apiKey", str4)));
                                }
                                if (str5 != null) {
                                    list4.add(kotlin.collections.a0.v(new kotlin.k("service", "alldebrid"), new kotlin.k("apiKey", str5)));
                                }
                                if (str8 != null) {
                                    list4.add(kotlin.collections.a0.v(new kotlin.k("service", "realdebrid"), new kotlin.k("apiKey", str8)));
                                }
                                kotlin.collections.builders.b bVarC2 = com.google.common.base.c.c(list3);
                                com.google.gson.k kVar10 = new com.google.gson.k();
                                k kVar11 = this.this$0;
                                kVar10.i("maxResultsPerResolution", new com.google.gson.l(new Integer(0)));
                                kVar10.i("maxSize", new com.google.gson.l(new Integer(0)));
                                Boolean bool2 = Boolean.FALSE;
                                kVar10.j("cachedOnly", bool2);
                                kVar10.j("sortCachedUncachedTogether", bool2);
                                kVar10.j("removeTrash", Boolean.TRUE);
                                kVar10.i("resultFormat", kVar11.gson.j(com.google.common.base.c.p("all")));
                                kVar10.i("debridServices", kVar11.gson.j(bVarC2));
                                kVar10.j("enableTorrent", bool2);
                                kVar10.j("deduplicateStreams", bool2);
                                kVar10.j("scrapeDebridAccountTorrents", bool2);
                                kVar10.k("debridStreamProxyPassword", "");
                                com.google.gson.k kVar12 = new com.google.gson.k();
                                kVar12.i("required", kVar11.gson.j(uVar));
                                kVar12.i("allowed", kVar11.gson.j(uVar));
                                kVar12.i("exclude", kVar11.gson.j(uVar));
                                kVar12.i("preferred", kVar11.gson.j(uVar));
                                kVar10.i("languages", kVar12);
                                kVar10.i("resolutions", new com.google.gson.k());
                                com.google.gson.k kVar13 = new com.google.gson.k();
                                kVar13.i("remove_ranks_under", new com.google.gson.l(new Long(-10000000000L)));
                                kVar13.j("allow_english_in_languages", bool2);
                                kVar13.j("remove_unknown_languages", bool2);
                                kVar10.i("options", kVar13);
                                byte[] bytes2 = this.this$0.gson.g(kVar10).getBytes(kotlin.text.a.a);
                                bytes2.getClass();
                                String strEncodeToString2 = Base64.encodeToString(bytes2, 10);
                                if (kotlin.jvm.internal.l.a(this.$mediaType, "tv")) {
                                    str9 = "stream/movie/" + str7 + ".json";
                                } else {
                                    str9 = "stream/movie/" + str7 + ".json";
                                }
                                String str24 = "https://comet.elfhosted.com/" + strEncodeToString2 + "/" + str9;
                                okhttp3.a0 a0Var2 = new okhttp3.a0();
                                a0Var2.d(str24);
                                a0Var2.b("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 Chrome/120.0.0.0 Safari/537.36");
                                okhttp3.b0 b0Var2 = new okhttp3.b0(a0Var2);
                                okhttp3.y yVar2 = this.this$0.client;
                                yVar2.getClass();
                                g0VarE = new okhttp3.internal.connection.m(yVar2, b0Var2, false).e();
                                if (g0VarE.N) {
                                    arrayList = new ArrayList();
                                    it = gVarN.e.iterator();
                                    while (it.hasNext()) {
                                        com.google.gson.k kVarE2 = ((com.google.gson.h) it.next()).e();
                                        hVarL = kVarE2.l("url");
                                        chqStream = hVarL == null ? null : null;
                                        if (chqStream != null) {
                                            arrayList.add(chqStream);
                                        }
                                    }
                                    return kotlin.collections.o.g0(15, kotlin.collections.o.f0(arrayList, new androidx.constraintlayout.core.e(12)));
                                }
                            }
                        }
                    }
                }
                return aVar;
            }
            return uVar;
        } catch (Exception e) {
            kotlin.o oVar = com.app.mlounge.util.a.a;
            coil3.compose.internal.f.i("Error: ", e.getMessage(), "Comet");
            return uVar;
        }
    }
}
