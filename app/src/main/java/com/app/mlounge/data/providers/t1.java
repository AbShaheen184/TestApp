package com.app.mlounge.data.providers;

import com.app.mlounge.data.remote.model.ChqStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class t1 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    final /* synthetic */ Integer $episode;
    final /* synthetic */ String $mediaType;
    final /* synthetic */ Integer $season;
    final /* synthetic */ String $tmdbId;
    int label;
    final /* synthetic */ u1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(String str, String str2, Integer num, Integer num2, u1 u1Var, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.$tmdbId = str;
        this.$mediaType = str2;
        this.$season = num;
        this.$episode = num2;
        this.this$0 = u1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new t1(this.$tmdbId, this.$mediaType, this.$season, this.$episode, this.this$0, dVar);
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((t1) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        okhttp3.j0 j0Var;
        String strZ;
        com.google.gson.k kVar;
        com.google.gson.k kVarO;
        com.google.gson.g gVarN;
        String strH;
        ChqStream chqStream;
        String str;
        Integer num;
        kotlin.collections.u uVar = kotlin.collections.u.e;
        if (this.label != 0) {
            net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.a.e(obj);
        try {
            ArrayList arrayListS = com.google.common.base.c.s("tmdb=" + this.$tmdbId, "type=" + this.$mediaType);
            if (kotlin.jvm.internal.l.a(this.$mediaType, "tv") && (num = this.$season) != null && this.$episode != null) {
                arrayListS.add("season=" + num);
                arrayListS.add("episode=" + this.$episode);
            }
            String strConcat = "https://streamdata.vaplayer.ru/api.php?".concat(kotlin.collections.o.R(arrayListS, "&", null, null, null, 62));
            okhttp3.a0 a0Var = new okhttp3.a0();
            a0Var.d(strConcat);
            a0Var.b("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 Chrome/121.0.0.0 Safari/537.36");
            a0Var.b("Referer", "https://nextgencloudfabric.com/");
            a0Var.b("Origin", "https://nextgencloudfabric.com");
            a0Var.b("Accept", "*/*");
            okhttp3.b0 b0Var = new okhttp3.b0(a0Var);
            okhttp3.y yVar = this.this$0.client;
            yVar.getClass();
            okhttp3.g0 g0VarE = new okhttp3.internal.connection.m(yVar, b0Var, false).e();
            if (g0VarE.N && (j0Var = g0VarE.D) != null && (strZ = j0Var.z()) != null && (kVar = (com.google.gson.k) this.this$0.gson.d(com.google.gson.k.class, strZ)) != null) {
                com.google.gson.h hVarL = kVar.l("status_code");
                if (kotlin.jvm.internal.l.a(hVarL != null ? hVarL.h() : null, "200") && (kVarO = kVar.o("data")) != null && (gVarN = kVarO.n("stream_urls")) != null) {
                    com.google.gson.h hVarL2 = kVarO.l("file_name");
                    if (hVarL2 == null || (strH = hVarL2.h()) == null) {
                        strH = "";
                    }
                    Pattern patternCompile = Pattern.compile("(\\d+)p");
                    patternCompile.getClass();
                    Matcher matcher = patternCompile.matcher(strH);
                    matcher.getClass();
                    kotlin.text.g gVarC = com.google.android.material.shape.k.C(matcher, 0, strH);
                    String strConcat2 = (gVarC == null || (str = (String) ((kotlin.collections.b0) gVarC.a()).get(1)) == null) ? "Auto" : str.concat("p");
                    ArrayList arrayList = new ArrayList();
                    Iterator it = gVarN.e.iterator();
                    while (it.hasNext()) {
                        String strH2 = ((com.google.gson.h) it.next()).h();
                        if (strH2 == null) {
                            chqStream = null;
                        } else {
                            String str2 = "hls";
                            if (!kotlin.text.k.T(strH2, ".m3u8", false)) {
                                if (kotlin.text.k.T(strH2, ".mpd", false)) {
                                    str2 = "dash";
                                } else if (kotlin.text.k.T(strH2, ".mp4", false) || kotlin.text.k.T(strH2, ".mkv", false)) {
                                    str2 = "mp4";
                                }
                            }
                            String str3 = str2;
                            chqStream = new ChqStream("VidApi", strH2, strConcat2, str3, str3, null, null, null, null, null, null, null, null, 8064);
                        }
                        if (chqStream != null) {
                            arrayList.add(chqStream);
                        }
                    }
                    return arrayList;
                }
            }
            return uVar;
        } catch (Exception e) {
            kotlin.o oVar = com.app.mlounge.util.a.a;
            coil3.compose.internal.f.i("Error: ", e.getMessage(), "VidApi");
            return uVar;
        }
    }
}
