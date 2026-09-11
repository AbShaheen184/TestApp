package com.app.mlounge.data.providers;

import com.app.mlounge.data.remote.model.ChqStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlinx.coroutines.CoroutineScope;
import org.mozilla.javascript.Context;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class x extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    final /* synthetic */ String $mediaType;
    final /* synthetic */ String $tmdbId;
    int label;
    final /* synthetic */ y this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(y yVar, String str, String str2, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.this$0 = yVar;
        this.$tmdbId = str;
        this.$mediaType = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new x(this.this$0, this.$tmdbId, this.$mediaType, dVar);
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((x) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objD;
        okhttp3.j0 j0Var;
        String strZ;
        okhttp3.j0 j0Var2;
        String strZ2;
        okhttp3.j0 j0Var3;
        String strZ3;
        com.google.gson.k kVarO;
        com.google.gson.k kVarO2;
        ChqStream chqStream;
        String strH;
        String strH2;
        String str;
        String str2;
        Object next;
        int i = this.label;
        if (i == 0) {
            kotlin.a.e(obj);
            l1 l1Var = this.this$0.tmdbHelper;
            String str3 = this.$tmdbId;
            String str4 = this.$mediaType;
            this.label = 1;
            objD = l1Var.d(str3, str4, this);
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
        String str5 = (String) objD;
        kotlin.o oVar = com.app.mlounge.util.a.a;
        kotlin.collections.u uVar = kotlin.collections.u.e;
        if (str5 != null) {
            try {
                String strConcat = "https://fsharetv.cc/movie/".concat(str5);
                okhttp3.a0 a0Var = new okhttp3.a0();
                a0Var.d(strConcat);
                a0Var.b("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 Chrome/148.0.0.0 Safari/537.36");
                a0Var.b("Accept", "text/html,application/xhtml+xml");
                a0Var.b("Accept-Language", "en-US,en;q=0.9");
                a0Var.b("Referer", "https://fsharetv.cc");
                okhttp3.b0 b0Var = new okhttp3.b0(a0Var);
                okhttp3.y yVar = this.this$0.client;
                yVar.getClass();
                okhttp3.g0 g0VarE = new okhttp3.internal.connection.m(yVar, b0Var, false).e();
                if (g0VarE.N && (j0Var = g0VarE.D) != null && (strZ = j0Var.z()) != null) {
                    Pattern patternCompile = Pattern.compile("href=\"(/w/[^\"]+)\"");
                    patternCompile.getClass();
                    Matcher matcher = patternCompile.matcher(strZ);
                    matcher.getClass();
                    kotlin.text.g gVarC = com.google.android.material.shape.k.C(matcher, 0, strZ);
                    String str6 = gVarC != null ? (String) ((kotlin.collections.b0) gVarC.a()).get(1) : null;
                    if (str6 != null) {
                        String string = new URL(new URL("https://fsharetv.cc"), str6).toString();
                        string.getClass();
                        okhttp3.a0 a0Var2 = new okhttp3.a0();
                        a0Var2.d(string);
                        a0Var2.b("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 Chrome/148.0.0.0 Safari/537.36");
                        a0Var2.b("Accept", "text/html,application/xhtml+xml");
                        a0Var2.b("Accept-Language", "en-US,en;q=0.9");
                        a0Var2.b("Referer", "https://fsharetv.cc");
                        okhttp3.b0 b0Var2 = new okhttp3.b0(a0Var2);
                        okhttp3.y yVar2 = this.this$0.client;
                        yVar2.getClass();
                        okhttp3.g0 g0VarE2 = new okhttp3.internal.connection.m(yVar2, b0Var2, false).e();
                        if (g0VarE2.N && (j0Var2 = g0VarE2.D) != null && (strZ2 = j0Var2.z()) != null) {
                            Iterator it = com.google.common.base.c.p(new kotlin.text.i("Movie\\.setSource\\(\"([^\"]+)\"|setSource\\(\"([^\"]+)\"|setSource\\('([^']+)'|\"source_id\"\\s*:\\s*\"([^\"]+)\"|source_id\\s*=\\s*\"([^\"]+)\"|\"file_id\"\\s*:\\s*\"([^\"]+)\"|file_id\\s*=\\s*\"([^\"]+)\"")).iterator();
                            String str7 = null;
                            while (it.hasNext()) {
                                kotlin.text.g gVarA = ((kotlin.text.i) it.next()).a(strZ2);
                                if (gVarA != null) {
                                    Iterator it2 = kotlin.collections.o.H(gVarA.a()).iterator();
                                    do {
                                        if (!it2.hasNext()) {
                                            next = null;
                                            break;
                                        }
                                        next = it2.next();
                                    } while (((String) next).length() <= 0);
                                    str7 = (String) next;
                                    if (str7 != null) {
                                        break;
                                    }
                                }
                            }
                            kotlin.o oVar2 = com.app.mlounge.util.a.a;
                            if (str7 != null) {
                                okhttp3.a0 a0Var3 = new okhttp3.a0();
                                a0Var3.d("https://fsharetv.cc/api/file/" + str7 + "/source?trailer=Png81APqcxU&type=watch");
                                a0Var3.b("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 Chrome/148.0.0.0 Safari/537.36");
                                a0Var3.b("Accept", "application/json, */*; q=0.01");
                                a0Var3.b("Accept-Language", "en-US,en;q=0.9");
                                a0Var3.b("X-Requested-With", "XMLHttpRequest");
                                a0Var3.b("Referer", "https://fsharetv.cc/");
                                okhttp3.b0 b0Var3 = new okhttp3.b0(a0Var3);
                                okhttp3.y yVar3 = this.this$0.client;
                                yVar3.getClass();
                                okhttp3.g0 g0VarE3 = new okhttp3.internal.connection.m(yVar3, b0Var3, false).e();
                                if (g0VarE3.N && (j0Var3 = g0VarE3.D) != null && (strZ3 = j0Var3.z()) != null) {
                                    kotlin.text.k.y0(Context.VERSION_ES6, strZ3);
                                    com.google.gson.k kVar = (com.google.gson.k) this.this$0.gson.d(com.google.gson.k.class, strZ3);
                                    if (kVar != null) {
                                        Objects.toString(kVar.l("status"));
                                        com.google.gson.h hVarL = kVar.l("status");
                                        if (kotlin.jvm.internal.l.a(hVarL != null ? hVarL.h() : null, "ok") && (kVarO = kVar.o("data")) != null && (kVarO2 = kVarO.o("file")) != null) {
                                            ArrayList<com.google.gson.k> arrayList = new ArrayList();
                                            com.google.gson.g gVarN = kVarO2.n("sources");
                                            if (gVarN != null) {
                                                Iterator it3 = gVarN.e.iterator();
                                                while (it3.hasNext()) {
                                                    arrayList.add(((com.google.gson.h) it3.next()).e());
                                                }
                                            }
                                            com.google.gson.g gVarN2 = kVarO2.n("backups");
                                            if (gVarN2 != null) {
                                                Iterator it4 = gVarN2.e.iterator();
                                                while (it4.hasNext()) {
                                                    arrayList.add(((com.google.gson.h) it4.next()).e());
                                                }
                                            }
                                            com.google.gson.g gVarN3 = kVarO2.n("alternatives");
                                            if (gVarN3 != null) {
                                                for (com.google.gson.h hVar : gVarN3.e) {
                                                    hVar.getClass();
                                                    if (hVar instanceof com.google.gson.g) {
                                                        Iterator it5 = hVar.d().e.iterator();
                                                        while (it5.hasNext()) {
                                                            arrayList.add(((com.google.gson.h) it5.next()).e());
                                                        }
                                                    }
                                                }
                                            }
                                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                                            ArrayList arrayList2 = new ArrayList();
                                            for (com.google.gson.k kVar2 : arrayList) {
                                                com.google.gson.h hVarL2 = kVar2.l("src");
                                                if (hVarL2 == null || (strH = hVarL2.h()) == null || !linkedHashSet.add(strH)) {
                                                    chqStream = null;
                                                } else {
                                                    if (!kotlin.text.r.O(strH, "http", false)) {
                                                        strH = new URL(new URL("https://fsharetv.cc"), strH).toString();
                                                        strH.getClass();
                                                    }
                                                    com.google.gson.h hVarL3 = kVar2.l("label");
                                                    if (hVarL3 == null || (strH2 = hVarL3.h()) == null) {
                                                        strH2 = "Auto";
                                                    }
                                                    Pattern patternCompile2 = Pattern.compile("(\\d+)p");
                                                    patternCompile2.getClass();
                                                    Matcher matcher2 = patternCompile2.matcher(strH2);
                                                    matcher2.getClass();
                                                    kotlin.text.g gVarC2 = com.google.android.material.shape.k.C(matcher2, 0, strH2);
                                                    if (gVarC2 != null) {
                                                        strH2 = ((kotlin.collections.b0) gVarC2.a()).get(1) + "p";
                                                    }
                                                    String str8 = strH2;
                                                    if (kotlin.text.k.T(strH, ".m3u8", false)) {
                                                        str2 = "hls";
                                                    } else {
                                                        if (kotlin.text.k.T(strH, ".mpd", false)) {
                                                            str2 = "dash";
                                                        } else {
                                                            if (!kotlin.text.k.T(strH, ".mp4", false)) {
                                                                kotlin.text.k.T(strH, ".mkv", false);
                                                            }
                                                            str = "mp4";
                                                        }
                                                        Map mapSingletonMap = Collections.singletonMap("Referer", "https://fsharetv.cc");
                                                        mapSingletonMap.getClass();
                                                        chqStream = new ChqStream("FshareTV", strH, str8, str, str, null, mapSingletonMap, null, null, null, null, null, null, 8064);
                                                    }
                                                    str = str2;
                                                    Map mapSingletonMap2 = Collections.singletonMap("Referer", "https://fsharetv.cc");
                                                    mapSingletonMap2.getClass();
                                                    chqStream = new ChqStream("FshareTV", strH, str8, str, str, null, mapSingletonMap2, null, null, null, null, null, null, 8064);
                                                }
                                                if (chqStream != null) {
                                                    arrayList2.add(chqStream);
                                                }
                                            }
                                            return arrayList2;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } catch (Exception e) {
                kotlin.o oVar3 = com.app.mlounge.util.a.a;
                coil3.compose.internal.f.i("Error: ", e.getMessage(), "FshareTV");
                return uVar;
            }
        }
        return uVar;
    }
}
