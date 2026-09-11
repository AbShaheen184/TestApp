package com.app.mlounge.data.providers;

import com.app.mlounge.data.remote.model.ChqStream;
import j$.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    final /* synthetic */ Integer $episode;
    final /* synthetic */ String $mediaType;
    final /* synthetic */ Integer $season;
    final /* synthetic */ String $tmdbId;
    int label;
    final /* synthetic */ n0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0(n0 n0Var, String str, String str2, Integer num, Integer num2, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.this$0 = n0Var;
        this.$tmdbId = str;
        this.$mediaType = str2;
        this.$season = num;
        this.$episode = num2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new m0(this.this$0, this.$tmdbId, this.$mediaType, this.$season, this.$episode, dVar);
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((m0) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
    }

    /* JADX WARN: Code duplicated, block: B:130:0x02a8 A[Catch: Exception -> 0x00a6, TryCatch #0 {Exception -> 0x00a6, blocks: (B:14:0x0046, B:17:0x0097, B:19:0x00a1, B:23:0x00aa, B:26:0x00b4, B:29:0x00be, B:30:0x00d8, B:32:0x00de, B:34:0x00f0, B:37:0x00f9, B:39:0x0103, B:44:0x0110, B:48:0x012d, B:55:0x0141, B:57:0x0147, B:59:0x0151, B:61:0x0159, B:64:0x0161, B:66:0x016b, B:68:0x0173, B:70:0x0179, B:78:0x0197, B:81:0x01df, B:83:0x01e9, B:85:0x01ef, B:90:0x01fd, B:92:0x0201, B:95:0x0207, B:98:0x0211, B:99:0x021a, B:101:0x0220, B:103:0x0232, B:105:0x023e, B:108:0x0246, B:111:0x0250, B:112:0x0259, B:114:0x025f, B:116:0x0271, B:118:0x027d, B:121:0x0285, B:127:0x0295, B:128:0x02a2, B:130:0x02a8, B:132:0x02ba, B:135:0x02c3, B:137:0x02cc, B:138:0x02dd, B:140:0x02e9, B:142:0x02ef, B:154:0x031f, B:157:0x0382, B:146:0x0301, B:149:0x030c, B:151:0x0314, B:124:0x028d), top: B:163:0x0046 }] */
    /* JADX WARN: Code duplicated, block: B:134:0x02c0  */
    /* JADX WARN: Code duplicated, block: B:185:0x0382 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:187:0x02a2 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x018d  */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objC;
        com.google.gson.g gVarN;
        com.google.gson.g gVar;
        com.google.gson.k kVarE;
        com.google.gson.h hVarL;
        String strH;
        boolean z;
        com.google.gson.g gVarN2;
        ArrayList arrayList;
        Iterator it;
        com.google.gson.h hVarL2;
        ChqStream chqStream;
        String strH2;
        com.google.gson.g gVarN3;
        com.google.gson.k kVarE2;
        com.google.gson.g gVarN4;
        com.google.gson.k kVarE3;
        String strH3;
        String strH4;
        String strH5;
        int i = this.label;
        if (i == 0) {
            kotlin.a.e(obj);
            l1 l1Var = this.this$0.tmdbHelper;
            String str = this.$tmdbId;
            String str2 = this.$mediaType;
            this.label = 1;
            objC = l1Var.c(str, str2, this);
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
        kotlin.collections.u uVar = kotlin.collections.u.e;
        if (i1Var != null) {
            try {
                String str3 = "https://app.cloud-mb.xyz/api/search/" + URLEncoder.encode(i1Var.a(), "UTF-8") + "/jdvhhjv255vghhghdhvfch2565656jhdcghfdf";
                okhttp3.a0 a0Var = new okhttp3.a0();
                a0Var.d(str3);
                a0Var.b("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/147.0.0.0 Safari/537.36");
                a0Var.b("x-request-x", "com.movieblast");
                a0Var.b("hash256", "86dc03244adddb3cbedbf0ae36074a736ee293a64774b18e82a6244eafd0df30");
                a0Var.b("packagename", "com.movieblast");
                okhttp3.b0 b0Var = new okhttp3.b0(a0Var);
                okhttp3.y yVar = this.this$0.client;
                yVar.getClass();
                okhttp3.g0 g0VarE = new okhttp3.internal.connection.m(yVar, b0Var, false).e();
                if (g0VarE.N) {
                    com.google.gson.f fVar = this.this$0.gson;
                    okhttp3.j0 j0Var = g0VarE.D;
                    com.google.gson.k kVar = (com.google.gson.k) fVar.d(com.google.gson.k.class, j0Var != null ? j0Var.z() : null);
                    if (kVar != null && (gVarN = kVar.n("search")) != null) {
                        ArrayList arrayList2 = gVarN.e;
                        String lowerCase = i1Var.a().toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                        Integer numB = i1Var.b();
                        Iterator it2 = arrayList2.iterator();
                        it2.getClass();
                        while (true) {
                            if (!it2.hasNext()) {
                                gVar = gVarN;
                                kVarE = null;
                                break;
                            }
                            com.google.gson.k kVarE4 = ((com.google.gson.h) it2.next()).e();
                            com.google.gson.h hVarL3 = kVarE4.l("name");
                            if (hVarL3 != null && (strH4 = hVarL3.h()) != null) {
                                gVar = gVarN;
                                com.google.gson.h hVarL4 = kVarE4.l("release_date");
                                if (hVarL4 == null || (strH5 = hVarL4.h()) == null) {
                                    strH5 = "";
                                }
                                Integer numQ = kotlin.text.r.Q(kotlin.text.k.y0(4, strH5));
                                String lowerCase2 = strH4.toLowerCase(Locale.ROOT);
                                lowerCase2.getClass();
                                if (!kotlin.text.k.T(lowerCase2, lowerCase, false) || (numB != null && numQ != null && !numB.equals(numQ))) {
                                }
                                kVarE = kVarE4;
                                break;
                            }
                            gVar = gVarN;
                            gVarN = gVar;
                        }
                        if (kVarE == null && arrayList2.size() > 0) {
                            kVarE = gVar.i().e();
                        }
                        if (kVarE != null && (hVarL = kVarE.l("id")) != null && (strH = hVarL.h()) != null) {
                            if (kotlin.jvm.internal.l.a(this.$mediaType, "tv")) {
                                z = true;
                            } else {
                                com.google.gson.h hVarL5 = kVarE.l("type");
                                if (hVarL5 == null || (strH3 = hVarL5.h()) == null) {
                                    z = false;
                                } else {
                                    String lowerCase3 = strH3.toLowerCase(Locale.ROOT);
                                    lowerCase3.getClass();
                                    z = true;
                                    if (!kotlin.text.k.T(lowerCase3, "serie", false)) {
                                        z = false;
                                    }
                                }
                            }
                            String str4 = "https://app.cloud-mb.xyz/api/" + (z ? "series/show" : "media/detail") + "/" + strH + "/jdvhhjv255vghhghdhvfch2565656jhdcghfdf";
                            okhttp3.a0 a0Var2 = new okhttp3.a0();
                            a0Var2.d(str4);
                            a0Var2.b("user-agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/147.0.0.0 Safari/537.36");
                            a0Var2.b("x-request-x", "com.movieblast");
                            okhttp3.b0 b0Var2 = new okhttp3.b0(a0Var2);
                            okhttp3.y yVar2 = this.this$0.client;
                            yVar2.getClass();
                            okhttp3.g0 g0VarE2 = new okhttp3.internal.connection.m(yVar2, b0Var2, false).e();
                            if (g0VarE2.N) {
                                com.google.gson.f fVar2 = this.this$0.gson;
                                okhttp3.j0 j0Var2 = g0VarE2.D;
                                com.google.gson.k kVar2 = (com.google.gson.k) fVar2.d(com.google.gson.k.class, j0Var2 != null ? j0Var2.z() : null);
                                if (kVar2 != null) {
                                    if (!z) {
                                        gVarN2 = kVar2.n("videos");
                                        if (gVarN2 == null) {
                                        }
                                        n0 n0Var = this.this$0;
                                        arrayList = new ArrayList();
                                        it = gVarN2.e.iterator();
                                        while (it.hasNext()) {
                                            com.google.gson.k kVarE5 = ((com.google.gson.h) it.next()).e();
                                            hVarL2 = kVarE5.l("link");
                                            chqStream = hVarL2 == null ? null : null;
                                            if (chqStream != null) {
                                                arrayList.add(chqStream);
                                            }
                                        }
                                        return arrayList;
                                    }
                                    if (this.$season != null && this.$episode != null && (gVarN3 = kVar2.n("seasons")) != null) {
                                        Iterator it3 = gVarN3.e.iterator();
                                        it3.getClass();
                                        while (true) {
                                            if (!it3.hasNext()) {
                                                kVarE2 = null;
                                                break;
                                            }
                                            com.google.gson.h hVar = (com.google.gson.h) it3.next();
                                            com.google.gson.h hVarL6 = hVar.e().l("season_number");
                                            if (hVarL6 != null && hVarL6.c() == this.$season.intValue()) {
                                                kVarE2 = hVar.e();
                                                break;
                                            }
                                        }
                                        if (kVarE2 != null && (gVarN4 = kVarE2.n("episodes")) != null) {
                                            Iterator it4 = gVarN4.e.iterator();
                                            it4.getClass();
                                            while (true) {
                                                if (!it4.hasNext()) {
                                                    kVarE3 = null;
                                                    break;
                                                }
                                                com.google.gson.h hVar2 = (com.google.gson.h) it4.next();
                                                com.google.gson.h hVarL7 = hVar2.e().l("episode_number");
                                                if (hVarL7 != null && hVarL7.c() == this.$episode.intValue()) {
                                                    kVarE3 = hVar2.e();
                                                    break;
                                                }
                                            }
                                            if (kVarE3 != null) {
                                                gVarN2 = kVarE3.n("videos");
                                                if (gVarN2 == null) {
                                                }
                                                n0 n0Var2 = this.this$0;
                                                arrayList = new ArrayList();
                                                it = gVarN2.e.iterator();
                                                while (it.hasNext()) {
                                                    com.google.gson.k kVarE6 = ((com.google.gson.h) it.next()).e();
                                                    hVarL2 = kVarE6.l("link");
                                                    if (hVarL2 == null && (strH2 = hVarL2.h()) != null) {
                                                        if (!kotlin.text.r.O(strH2, "http", false)) {
                                                            strH2 = "https://" + strH2;
                                                        }
                                                        String strB = n0.b(n0Var2, strH2);
                                                        com.google.gson.h hVarL8 = kVarE6.l("server");
                                                        String strF = n0.f(n0Var2, hVarL8 != null ? hVarL8.h() : null);
                                                        String str5 = "hls";
                                                        if (!kotlin.text.k.T(strB, ".m3u8", false)) {
                                                            if (kotlin.text.k.T(strB, ".mpd", false)) {
                                                                str5 = "dash";
                                                            } else if (kotlin.text.k.T(strB, ".mp4", false) || kotlin.text.k.T(strB, ".mkv", false)) {
                                                                str5 = "mp4";
                                                            }
                                                        }
                                                        String str6 = str5;
                                                        chqStream = new ChqStream("MovieBlast", strB, strF, str6, str6, null, kotlin.collections.a0.v(new kotlin.k("Accept-Encoding", "identity"), new kotlin.k("Connection", "Keep-Alive"), new kotlin.k("Icy-MetaData", "1"), new kotlin.k("Referer", "MovieBlast"), new kotlin.k("User-Agent", "MovieBlast"), new kotlin.k("x-request-x", "com.movieblast")), null, null, null, null, null, null, 8064);
                                                    }
                                                    if (chqStream != null) {
                                                        arrayList.add(chqStream);
                                                    }
                                                }
                                                return arrayList;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } catch (Exception e) {
                kotlin.o oVar = com.app.mlounge.util.a.a;
                coil3.compose.internal.f.i("Error: ", e.getMessage(), "MovieBlast");
                return uVar;
            }
        }
        return uVar;
    }
}
