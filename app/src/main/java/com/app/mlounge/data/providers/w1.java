package com.app.mlounge.data.providers;

import java.util.Objects;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class w1 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    final /* synthetic */ String $backend;
    final /* synthetic */ Integer $episode;
    final /* synthetic */ String $mediaType;
    final /* synthetic */ Integer $season;
    final /* synthetic */ String $tmdbId;
    int label;
    final /* synthetic */ z1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(String str, Integer num, Integer num2, String str2, String str3, z1 z1Var, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.$mediaType = str;
        this.$season = num;
        this.$episode = num2;
        this.$backend = str2;
        this.$tmdbId = str3;
        this.this$0 = z1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new w1(this.$mediaType, this.$season, this.$episode, this.$backend, this.$tmdbId, this.this$0, dVar);
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((w1) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        String strE;
        String strZ;
        String strH;
        Integer num;
        Integer num2;
        if (this.label != 0) {
            net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.a.e(obj);
        if (!kotlin.jvm.internal.l.a(this.$mediaType, "tv") || (num = this.$season) == null || (num2 = this.$episode) == null) {
            strE = coil3.compose.internal.f.e("https://new.vidnest.fun/", this.$backend, "/movie/", this.$tmdbId);
        } else {
            StringBuilder sbO = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.o("https://new.vidnest.fun/", this.$backend, "/tv/", this.$tmdbId, "/");
            sbO.append(num);
            sbO.append("/");
            sbO.append(num2);
            strE = sbO.toString();
        }
        try {
            okhttp3.a0 a0Var = new okhttp3.a0();
            a0Var.d(strE);
            a0Var.b("User-Agent", "Mozilla/5.0 (X11; Linux x86_64; rv:109.0) Gecko/20100101 Firefox/121.0");
            a0Var.b("Accept", "application/json, */*");
            a0Var.b("Origin", "https://vidnest.fun");
            a0Var.b("Referer", "https://vidnest.fun/");
            okhttp3.b0 b0Var = new okhttp3.b0(a0Var);
            okhttp3.y yVar = this.this$0.client;
            yVar.getClass();
            okhttp3.g0 g0VarE = new okhttp3.internal.connection.m(yVar, b0Var, false).e();
            if (!g0VarE.N) {
                kotlin.o oVar = com.app.mlounge.util.a.a;
                return null;
            }
            okhttp3.j0 j0Var = g0VarE.D;
            if (j0Var != null && (strZ = j0Var.z()) != null) {
                kotlin.o oVar2 = com.app.mlounge.util.a.a;
                kotlin.text.k.y0(100, strZ);
                com.google.gson.k kVar = (com.google.gson.k) this.this$0.gson.d(com.google.gson.k.class, strZ);
                if (kVar != null) {
                    Objects.toString(kVar.l("encrypted"));
                    com.google.gson.h hVarL = kVar.l("encrypted");
                    if (hVarL == null || !hVarL.b()) {
                        return kVar;
                    }
                    com.google.gson.h hVarL2 = kVar.l("data");
                    if (hVarL2 != null && (strH = hVarL2.h()) != null) {
                        kotlin.text.k.y0(50, strH);
                        com.google.gson.k kVarB = z1.b(this.this$0, strH);
                        Objects.toString(kVarB);
                        return kVarB;
                    }
                }
            }
            return null;
        } catch (Exception e) {
            kotlin.o oVar3 = com.app.mlounge.util.a.a;
            e.getMessage();
            return null;
        }
    }
}
