package com.app.mlounge.data.providers;

import com.app.mlounge.data.remote.model.ChqStream;
import j$.net.URLEncoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    final /* synthetic */ Integer $episode;
    final /* synthetic */ String $mediaType;
    final /* synthetic */ Integer $season;
    final /* synthetic */ String $tmdbId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(String str, Integer num, Integer num2, c cVar, String str2, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.$mediaType = str;
        this.$season = num;
        this.$episode = num2;
        this.this$0 = cVar;
        this.$tmdbId = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        b bVar = new b(this.$mediaType, this.$season, this.$episode, this.this$0, this.$tmdbId, dVar);
        bVar.L$0 = obj;
        return bVar;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
    }

    /* JADX WARN: Code duplicated, block: B:63:0x0159 A[Catch: Exception -> 0x0028, PHI: r9
  0x0159: PHI (r9v14 java.lang.String) = (r9v13 java.lang.String), (r9v17 java.lang.String) binds: [B:45:0x00f3, B:61:0x0155] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x0028, blocks: (B:5:0x0022, B:22:0x005d, B:25:0x0063, B:28:0x00ac, B:30:0x00b6, B:32:0x00bc, B:35:0x00c6, B:37:0x00ce, B:39:0x00da, B:41:0x00e5, B:43:0x00ed, B:46:0x00f5, B:49:0x0129, B:51:0x0131, B:53:0x0137, B:56:0x0141, B:58:0x0149, B:60:0x0151, B:63:0x0159, B:66:0x01af, B:68:0x01b3, B:71:0x01bb, B:73:0x01d1, B:76:0x01e1, B:79:0x0220, B:81:0x0224, B:84:0x022c, B:86:0x0242, B:91:0x0271, B:88:0x024e, B:90:0x0264, B:40:0x00df, B:18:0x0048), top: B:95:0x001e }] */
    /* JADX WARN: Code duplicated, block: B:86:0x0242 A[Catch: Exception -> 0x0028, TryCatch #0 {Exception -> 0x0028, blocks: (B:5:0x0022, B:22:0x005d, B:25:0x0063, B:28:0x00ac, B:30:0x00b6, B:32:0x00bc, B:35:0x00c6, B:37:0x00ce, B:39:0x00da, B:41:0x00e5, B:43:0x00ed, B:46:0x00f5, B:49:0x0129, B:51:0x0131, B:53:0x0137, B:56:0x0141, B:58:0x0149, B:60:0x0151, B:63:0x0159, B:66:0x01af, B:68:0x01b3, B:71:0x01bb, B:73:0x01d1, B:76:0x01e1, B:79:0x0220, B:81:0x0224, B:84:0x022c, B:86:0x0242, B:91:0x0271, B:88:0x024e, B:90:0x0264, B:40:0x00df, B:18:0x0048), top: B:95:0x001e }] */
    /* JADX WARN: Code duplicated, block: B:88:0x024e A[Catch: Exception -> 0x0028, TryCatch #0 {Exception -> 0x0028, blocks: (B:5:0x0022, B:22:0x005d, B:25:0x0063, B:28:0x00ac, B:30:0x00b6, B:32:0x00bc, B:35:0x00c6, B:37:0x00ce, B:39:0x00da, B:41:0x00e5, B:43:0x00ed, B:46:0x00f5, B:49:0x0129, B:51:0x0131, B:53:0x0137, B:56:0x0141, B:58:0x0149, B:60:0x0151, B:63:0x0159, B:66:0x01af, B:68:0x01b3, B:71:0x01bb, B:73:0x01d1, B:76:0x01e1, B:79:0x0220, B:81:0x0224, B:84:0x022c, B:86:0x0242, B:91:0x0271, B:88:0x024e, B:90:0x0264, B:40:0x00df, B:18:0x0048), top: B:95:0x001e }] */
    /* JADX WARN: Code duplicated, block: B:90:0x0264 A[Catch: Exception -> 0x0028, TryCatch #0 {Exception -> 0x0028, blocks: (B:5:0x0022, B:22:0x005d, B:25:0x0063, B:28:0x00ac, B:30:0x00b6, B:32:0x00bc, B:35:0x00c6, B:37:0x00ce, B:39:0x00da, B:41:0x00e5, B:43:0x00ed, B:46:0x00f5, B:49:0x0129, B:51:0x0131, B:53:0x0137, B:56:0x0141, B:58:0x0149, B:60:0x0151, B:63:0x0159, B:66:0x01af, B:68:0x01b3, B:71:0x01bb, B:73:0x01d1, B:76:0x01e1, B:79:0x0220, B:81:0x0224, B:84:0x022c, B:86:0x0242, B:91:0x0271, B:88:0x024e, B:90:0x0264, B:40:0x00df, B:18:0x0048), top: B:95:0x001e }] */
    /* JADX WARN: Instruction removed from duplicated block: B:63:0x0159, please report this as an issue */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objD;
        com.google.gson.h hVarL;
        okhttp3.g0 g0VarE;
        okhttp3.j0 j0Var;
        String strZ;
        kotlin.text.g gVarC;
        String str;
        String str2;
        okhttp3.g0 g0VarE2;
        okhttp3.j0 j0Var2;
        String strZ2;
        kotlin.text.g gVarC2;
        kotlin.text.g gVarC3;
        String strGroup;
        com.google.gson.k kVarO;
        com.google.gson.h hVarL2;
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        int i = this.label;
        kotlin.collections.u uVar = kotlin.collections.u.e;
        try {
            if (i == 0) {
                kotlin.a.e(obj);
                if (kotlin.jvm.internal.l.a(this.$mediaType, "tv") && this.$season != null && this.$episode != null) {
                    l1 l1Var = this.this$0.tmdbHelper;
                    String str3 = this.$tmdbId;
                    this.L$0 = coroutineScope;
                    this.label = 1;
                    objD = l1Var.d(str3, "tv", this);
                    kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                    if (objD == aVar) {
                        return aVar;
                    }
                }
                return uVar;
            }
            if (i != 1) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.a.e(obj);
            objD = obj;
            String str4 = (String) objD;
            if (str4 != null) {
                String str5 = "https://id-mapping-api-malid.hf.space/api/resolve?id=" + str4 + "&s=" + this.$season + "&e=" + this.$episode;
                okhttp3.a0 a0Var = new okhttp3.a0();
                a0Var.d(str5);
                a0Var.b("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 Chrome/120.0.0.0 Safari/537.36");
                okhttp3.b0 b0Var = new okhttp3.b0(a0Var);
                okhttp3.y yVar = this.this$0.client;
                yVar.getClass();
                okhttp3.g0 g0VarE3 = new okhttp3.internal.connection.m(yVar, b0Var, false).e();
                if (g0VarE3.N) {
                    com.google.gson.f fVar = this.this$0.gson;
                    okhttp3.j0 j0Var3 = g0VarE3.D;
                    com.google.gson.k kVar = (com.google.gson.k) fVar.d(com.google.gson.k.class, j0Var3 != null ? j0Var3.z() : null);
                    if (kVar != null && (hVarL = kVar.l("mal_id")) != null) {
                        int iC = hVarL.c();
                        com.google.gson.h hVarL3 = kVar.l("mal_episode");
                        int iC2 = hVarL3 != null ? hVarL3.c() : this.$episode.intValue();
                        com.google.gson.h hVarL4 = kVar.l("anime_title");
                        String strH = hVarL4 != null ? hVarL4.h() : null;
                        if (strH == null) {
                            c cVar = this.this$0;
                            String str6 = "https://api.jikan.moe/v4/anime/" + iC;
                            okhttp3.a0 a0Var2 = new okhttp3.a0();
                            a0Var2.d(str6);
                            a0Var2.b("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 Chrome/120.0.0.0 Safari/537.36");
                            okhttp3.b0 b0Var2 = new okhttp3.b0(a0Var2);
                            okhttp3.y yVar2 = cVar.client;
                            yVar2.getClass();
                            okhttp3.g0 g0VarE4 = new okhttp3.internal.connection.m(yVar2, b0Var2, false).e();
                            if (g0VarE4.N) {
                                com.google.gson.f fVar2 = cVar.gson;
                                okhttp3.j0 j0Var4 = g0VarE4.D;
                                com.google.gson.k kVar2 = (com.google.gson.k) fVar2.d(com.google.gson.k.class, j0Var4 != null ? j0Var4.z() : null);
                                if (kVar2 != null && (kVarO = kVar2.o("data")) != null && (hVarL2 = kVarO.l("title")) != null && (strH = hVarL2.h()) != null) {
                                    String str7 = "https://anizone.to/anime?search=" + URLEncoder.encode(kotlin.text.k.A0((String) kotlin.text.k.p0(new String[]{":"}, strH, 6).get(0)).toString(), "UTF-8");
                                    okhttp3.a0 a0Var3 = new okhttp3.a0();
                                    a0Var3.d(str7);
                                    a0Var3.b("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 Chrome/120.0.0.0 Safari/537.36");
                                    a0Var3.b("Referer", "https://anizone.to/");
                                    okhttp3.b0 b0Var3 = new okhttp3.b0(a0Var3);
                                    okhttp3.y yVar3 = this.this$0.client;
                                    yVar3.getClass();
                                    g0VarE = new okhttp3.internal.connection.m(yVar3, b0Var3, false).e();
                                    if (g0VarE.N && (j0Var = g0VarE.D) != null && (strZ = j0Var.z()) != null) {
                                        Pattern patternCompile = Pattern.compile("/anime/([a-zA-Z0-9-]+)");
                                        patternCompile.getClass();
                                        Matcher matcher = patternCompile.matcher(strZ);
                                        matcher.getClass();
                                        gVarC = com.google.android.material.shape.k.C(matcher, 0, strZ);
                                        if (gVarC != null && (str = (String) ((kotlin.collections.b0) gVarC.a()).get(1)) != null) {
                                            str2 = "https://anizone.to/anime/" + str + "/" + iC2;
                                            okhttp3.a0 a0Var4 = new okhttp3.a0();
                                            a0Var4.d(str2);
                                            a0Var4.b("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 Chrome/120.0.0.0 Safari/537.36");
                                            a0Var4.b("Referer", "https://anizone.to/");
                                            okhttp3.b0 b0Var4 = new okhttp3.b0(a0Var4);
                                            okhttp3.y yVar4 = this.this$0.client;
                                            yVar4.getClass();
                                            g0VarE2 = new okhttp3.internal.connection.m(yVar4, b0Var4, false).e();
                                            if (g0VarE2.N && (j0Var2 = g0VarE2.D) != null && (strZ2 = j0Var2.z()) != null) {
                                                Pattern patternCompile2 = Pattern.compile("https://[^\"']+/master\\.m3u8");
                                                patternCompile2.getClass();
                                                Matcher matcher2 = patternCompile2.matcher(strZ2);
                                                matcher2.getClass();
                                                gVarC2 = com.google.android.material.shape.k.C(matcher2, 0, strZ2);
                                                if (gVarC2 != null) {
                                                    strGroup = gVarC2.a.group();
                                                    strGroup.getClass();
                                                } else {
                                                    Pattern patternCompile3 = Pattern.compile("<media-player[^>]*src=\"([^\"]+)\"");
                                                    patternCompile3.getClass();
                                                    Matcher matcher3 = patternCompile3.matcher(strZ2);
                                                    matcher3.getClass();
                                                    gVarC3 = com.google.android.material.shape.k.C(matcher3, 0, strZ2);
                                                    if (gVarC3 != null) {
                                                        strGroup = (String) ((kotlin.collections.b0) gVarC3.a()).get(1);
                                                    }
                                                }
                                                return com.google.common.base.c.p(new ChqStream("AniZone", strGroup, "Multi", "hls", "hls", null, kotlin.collections.a0.v(new kotlin.k("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 Chrome/120.0.0.0 Safari/537.36"), new kotlin.k("Referer", str2)), null, null, null, null, null, null, 8064));
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            String str8 = "https://anizone.to/anime?search=" + URLEncoder.encode(kotlin.text.k.A0((String) kotlin.text.k.p0(new String[]{":"}, strH, 6).get(0)).toString(), "UTF-8");
                            okhttp3.a0 a0Var5 = new okhttp3.a0();
                            a0Var5.d(str8);
                            a0Var5.b("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 Chrome/120.0.0.0 Safari/537.36");
                            a0Var5.b("Referer", "https://anizone.to/");
                            okhttp3.b0 b0Var5 = new okhttp3.b0(a0Var5);
                            okhttp3.y yVar5 = this.this$0.client;
                            yVar5.getClass();
                            g0VarE = new okhttp3.internal.connection.m(yVar5, b0Var5, false).e();
                            if (g0VarE.N) {
                                Pattern patternCompile4 = Pattern.compile("/anime/([a-zA-Z0-9-]+)");
                                patternCompile4.getClass();
                                Matcher matcher4 = patternCompile4.matcher(strZ);
                                matcher4.getClass();
                                gVarC = com.google.android.material.shape.k.C(matcher4, 0, strZ);
                                if (gVarC != null) {
                                    str2 = "https://anizone.to/anime/" + str + "/" + iC2;
                                    okhttp3.a0 a0Var6 = new okhttp3.a0();
                                    a0Var6.d(str2);
                                    a0Var6.b("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 Chrome/120.0.0.0 Safari/537.36");
                                    a0Var6.b("Referer", "https://anizone.to/");
                                    okhttp3.b0 b0Var6 = new okhttp3.b0(a0Var6);
                                    okhttp3.y yVar6 = this.this$0.client;
                                    yVar6.getClass();
                                    g0VarE2 = new okhttp3.internal.connection.m(yVar6, b0Var6, false).e();
                                    if (g0VarE2.N) {
                                        Pattern patternCompile5 = Pattern.compile("https://[^\"']+/master\\.m3u8");
                                        patternCompile5.getClass();
                                        Matcher matcher5 = patternCompile5.matcher(strZ2);
                                        matcher5.getClass();
                                        gVarC2 = com.google.android.material.shape.k.C(matcher5, 0, strZ2);
                                        if (gVarC2 != null) {
                                            strGroup = gVarC2.a.group();
                                            strGroup.getClass();
                                        } else {
                                            Pattern patternCompile6 = Pattern.compile("<media-player[^>]*src=\"([^\"]+)\"");
                                            patternCompile6.getClass();
                                            Matcher matcher6 = patternCompile6.matcher(strZ2);
                                            matcher6.getClass();
                                            gVarC3 = com.google.android.material.shape.k.C(matcher6, 0, strZ2);
                                            if (gVarC3 != null) {
                                                strGroup = (String) ((kotlin.collections.b0) gVarC3.a()).get(1);
                                            }
                                        }
                                        return com.google.common.base.c.p(new ChqStream("AniZone", strGroup, "Multi", "hls", "hls", null, kotlin.collections.a0.v(new kotlin.k("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 Chrome/120.0.0.0 Safari/537.36"), new kotlin.k("Referer", str2)), null, null, null, null, null, null, 8064));
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            kotlin.o oVar = com.app.mlounge.util.a.a;
            coil3.compose.internal.f.i("Error: ", e.getMessage(), "AniZone");
        }
        return uVar;
    }
}
