package com.app.mlounge.data.providers;

import com.app.mlounge.data.remote.model.ChqStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a0 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    final /* synthetic */ Integer $episode;
    final /* synthetic */ String $mediaType;
    final /* synthetic */ Integer $season;
    final /* synthetic */ String $tmdbId;
    int label;
    final /* synthetic */ b0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(b0 b0Var, String str, String str2, Integer num, Integer num2, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.this$0 = b0Var;
        this.$tmdbId = str;
        this.$mediaType = str2;
        this.$season = num;
        this.$episode = num2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new a0(this.this$0, this.$tmdbId, this.$mediaType, this.$season, this.$episode, dVar);
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((a0) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
    }

    /* JADX WARN: Code duplicated, block: B:89:0x0196  */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objD;
        okhttp3.j0 j0Var;
        String strZ;
        com.google.gson.k kVar;
        com.google.gson.g gVarN;
        ChqStream chqStream;
        String strH;
        String strH2;
        String strH3;
        String str;
        String str2;
        com.google.gson.k kVarO;
        String str3;
        Integer num;
        Integer num2;
        int i = this.label;
        if (i == 0) {
            kotlin.a.e(obj);
            l1 l1Var = this.this$0.tmdbHelper;
            String str4 = this.$tmdbId;
            String str5 = this.$mediaType;
            this.label = 1;
            objD = l1Var.d(str4, str5, this);
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
            if (objD == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.a.e(obj);
            objD = obj;
        }
        String str6 = (String) objD;
        kotlin.collections.u uVar = kotlin.collections.u.e;
        if (str6 != null) {
            String strQ = (!kotlin.jvm.internal.l.a(this.$mediaType, "tv") || (num = this.$season) == null || (num2 = this.$episode) == null) ? androidx.privacysandbox.ads.adservices.java.internal.a.q("https://hdhub.thevolecitor.qzz.io/eyJ0b3Jib3giOiJ1bnNldCIsInF1YWxpdGllcyI6IjIxNjBwLDEwODBwLDcyMHAsNDgwcCIsInNvcnQiOiJkZXNjIiwibXEiOjEwLCJtcCI6MTAsImNhdGFsb2dzIjoiIn0/stream/movie/", str6, ".json") : "https://hdhub.thevolecitor.qzz.io/eyJ0b3Jib3giOiJ1bnNldCIsInF1YWxpdGllcyI6IjIxNjBwLDEwODBwLDcyMHAsNDgwcCIsInNvcnQiOiJkZXNjIiwibXEiOjEwLCJtcCI6MTAsImNhdGFsb2dzIjoiIn0/stream/series/" + str6 + ":" + num + ":" + num2 + ".json";
            try {
                okhttp3.a0 a0Var = new okhttp3.a0();
                a0Var.d(strQ);
                a0Var.b("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 Chrome/120.0.0.0 Safari/537.36");
                a0Var.b("Accept", "application/json, */*");
                okhttp3.b0 b0Var = new okhttp3.b0(a0Var);
                okhttp3.y yVar = this.this$0.client;
                yVar.getClass();
                okhttp3.g0 g0VarE = new okhttp3.internal.connection.m(yVar, b0Var, false).e();
                if (g0VarE.N && (j0Var = g0VarE.D) != null && (strZ = j0Var.z()) != null && (kVar = (com.google.gson.k) this.this$0.gson.d(com.google.gson.k.class, strZ)) != null && (gVarN = kVar.n("streams")) != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = gVarN.e.iterator();
                    while (it.hasNext()) {
                        com.google.gson.k kVarE = ((com.google.gson.h) it.next()).e();
                        com.google.gson.h hVarL = kVarE.l("url");
                        if (hVarL == null || (strH = hVarL.h()) == null) {
                            chqStream = null;
                        } else {
                            com.google.gson.h hVarL2 = kVarE.l("name");
                            if (hVarL2 == null || (strH2 = hVarL2.h()) == null) {
                                strH2 = "HdHub";
                            }
                            com.google.gson.h hVarL3 = kVarE.l("description");
                            if (hVarL3 == null || (strH3 = hVarL3.h()) == null) {
                                strH3 = "";
                            }
                            String str7 = strH2 + " " + strH3;
                            if (kotlin.text.k.T(str7, "2160", false) || kotlin.text.k.T(str7, "4k", false)) {
                                str = "4K";
                            } else {
                                if (kotlin.text.k.T(str7, "1080", false)) {
                                    str3 = "1080p";
                                } else if (kotlin.text.k.T(str7, "720", false)) {
                                    str3 = "720p";
                                } else {
                                    str3 = kotlin.text.k.T(str7, "480", false) ? "480p" : "HD";
                                }
                                str = str3;
                            }
                            String str8 = "hls";
                            if (kotlin.text.k.T(strH, ".m3u8", false)) {
                                str2 = str8;
                            } else {
                                if (kotlin.text.k.T(strH, ".mpd", false)) {
                                    str8 = "dash";
                                } else {
                                    str2 = "mkv";
                                    if (!kotlin.text.k.T(strH, ".mkv", false)) {
                                        if (kotlin.text.k.T(strH, ".mp4", false)) {
                                            str2 = "mp4";
                                        } else if (kotlin.text.k.T(strH, "pixeldrain", false) || kotlin.text.k.T(strH, "qiwi.gg", false) || kotlin.text.k.T(strH, "gofile", false)) {
                                            if (!str.equals("4K")) {
                                                str2 = "mp4";
                                            }
                                        }
                                    }
                                }
                                str2 = str8;
                            }
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            com.google.gson.k kVarO2 = kVarE.o("behaviorHints");
                            com.google.gson.k kVarO3 = (kVarO2 == null || (kVarO = kVarO2.o("proxyHeaders")) == null) ? null : kVarO.o("request");
                            if (kVarO3 != null) {
                                for (Map.Entry entry : (com.google.gson.internal.l) kVarO3.e.entrySet()) {
                                    linkedHashMap.put(entry.getKey(), ((com.google.gson.h) entry.getValue()).h());
                                }
                            }
                            if (!linkedHashMap.containsKey("User-Agent")) {
                                linkedHashMap.put("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36");
                            }
                            if (!linkedHashMap.containsKey("Referer")) {
                                linkedHashMap.put("Referer", "https://hdhub.thevolecitor.qzz.io/");
                            }
                            chqStream = new ChqStream("HdHub - " + str, strH, str, str2, str2, null, linkedHashMap.isEmpty() ? null : linkedHashMap, null, null, null, null, null, null, 8064);
                        }
                        if (chqStream != null) {
                            arrayList.add(chqStream);
                        }
                    }
                    return arrayList;
                }
            } catch (Exception e) {
                kotlin.o oVar = com.app.mlounge.util.a.a;
                coil3.compose.internal.f.i("Error: ", e.getMessage(), "HDHub");
                return uVar;
            }
        }
        return uVar;
    }
}
