package com.app.mlounge.data.providers;

import com.app.mlounge.data.remote.model.ChqStream;
import java.util.ArrayList;
import java.util.Iterator;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b2 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    final /* synthetic */ Integer $episode;
    final /* synthetic */ String $mediaType;
    final /* synthetic */ Integer $season;
    final /* synthetic */ String $tmdbId;
    int label;
    final /* synthetic */ c2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2(String str, Integer num, Integer num2, String str2, c2 c2Var, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.$mediaType = str;
        this.$season = num;
        this.$episode = num2;
        this.$tmdbId = str2;
        this.this$0 = c2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new b2(this.$mediaType, this.$season, this.$episode, this.$tmdbId, this.this$0, dVar);
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((b2) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
    }

    /* JADX WARN: Code duplicated, block: B:61:0x0164  */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        String str;
        okhttp3.j0 j0Var;
        String strZ;
        com.google.gson.k kVar;
        com.google.gson.k kVarE;
        com.google.gson.h hVarL;
        String strH;
        String str2;
        Integer num;
        Integer num2;
        kotlin.collections.u uVar = kotlin.collections.u.e;
        if (this.label != 0) {
            net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.a.e(obj);
        try {
            if (!kotlin.jvm.internal.l.a(this.$mediaType, "tv") || (num = this.$season) == null || (num2 = this.$episode) == null) {
                str = "movie/" + this.$tmdbId;
            } else {
                str = "tv/" + this.$tmdbId + "/" + num + "/" + num2;
            }
            String strConcat = "https://vidrock.ru/api/".concat(str);
            okhttp3.a0 a0Var = new okhttp3.a0();
            a0Var.d(strConcat);
            a0Var.b("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/124.0.0.0 Safari/537.36");
            a0Var.b("Accept", "application/json, */*");
            a0Var.b("Accept-Language", "en-US,en;q=0.9");
            a0Var.b("Origin", "https://vidrock.ru");
            a0Var.b("Referer", "https://vidrock.ru/");
            okhttp3.b0 b0Var = new okhttp3.b0(a0Var);
            okhttp3.y yVar = this.this$0.client;
            yVar.getClass();
            okhttp3.g0 g0VarE = new okhttp3.internal.connection.m(yVar, b0Var, false).e();
            if (g0VarE.N && (j0Var = g0VarE.D) != null && (strZ = j0Var.z()) != null) {
                kotlin.o oVar = com.app.mlounge.util.a.a;
                if (!strZ.equals("null") && kotlin.text.k.A0(strZ).toString().length() != 0 && (kVar = (com.google.gson.k) this.this$0.gson.d(com.google.gson.k.class, strZ)) != null) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = ((com.google.gson.internal.l) kVar.e.entrySet()).iterator();
                    while (((com.google.gson.internal.k) it).hasNext()) {
                        com.google.gson.internal.m mVarC = ((com.google.gson.internal.k) it).c();
                        String str3 = (String) mVarC.getKey();
                        Object value = mVarC.getValue();
                        com.google.gson.h hVar = (com.google.gson.h) value;
                        hVar.getClass();
                        if (!(hVar instanceof com.google.gson.k)) {
                            value = null;
                        }
                        com.google.gson.h hVar2 = (com.google.gson.h) value;
                        if (hVar2 != null && (hVarL = (kVarE = hVar2.e()).l("url")) != null && !(hVarL instanceof com.google.gson.j)) {
                            String strH2 = hVarL.h();
                            c2 c2Var = this.this$0;
                            strH2.getClass();
                            String strB = c2.b(c2Var, strH2);
                            if (strB != null && kotlin.text.r.O(strB, "http", false) && !kotlin.text.k.T(strB, "binge.vaporeen.workers.dev", false)) {
                                String strE = c2.e(this.this$0, strB);
                                com.google.gson.h hVarL2 = kVarE.l("type");
                                if (hVarL2 == null || (strH = hVarL2.h()) == null) {
                                    strH = "";
                                }
                                if (kotlin.text.k.T(strE, ".m3u8", false)) {
                                    str2 = "hls";
                                } else {
                                    if (kotlin.text.k.T(strE, ".mp4", false)) {
                                        strH = "mp4";
                                    } else if (strH.length() <= 0) {
                                        str2 = "hls";
                                    }
                                    str2 = strH;
                                }
                                arrayList.add(new ChqStream("Vidrock - " + str3, strE, "Auto", str2, str2, null, kotlin.collections.a0.v(new kotlin.k("Referer", "https://vidrock.ru"), new kotlin.k("Origin", "https://vidrock.ru")), null, null, null, null, null, null, 8064));
                            }
                        }
                    }
                    return arrayList;
                }
            }
            return uVar;
        } catch (Exception e) {
            kotlin.o oVar2 = com.app.mlounge.util.a.a;
            coil3.compose.internal.f.i("Error: ", e.getMessage(), "Vidrock");
            return uVar;
        }
    }
}
