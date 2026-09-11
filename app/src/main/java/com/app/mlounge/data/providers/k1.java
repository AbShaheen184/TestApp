package com.app.mlounge.data.providers;

import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k1 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    final /* synthetic */ String $mediaType;
    final /* synthetic */ String $tmdbId;
    int label;
    final /* synthetic */ l1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(String str, String str2, l1 l1Var, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.$mediaType = str;
        this.$tmdbId = str2;
        this.this$0 = l1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new k1(this.$mediaType, this.$tmdbId, this.this$0, dVar);
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((k1) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        String strH;
        com.google.gson.h hVarL;
        String str = "tv";
        if (this.label != 0) {
            net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.a.e(obj);
        try {
            if (!kotlin.jvm.internal.l.a(this.$mediaType, "tv")) {
                str = "movie";
            }
            String str2 = "https://api.themoviedb.org/3/" + str + "/" + this.$tmdbId + "/external_ids";
            okhttp3.y yVar = this.this$0.client;
            this.this$0.getClass();
            okhttp3.a0 a0Var = new okhttp3.a0();
            a0Var.d(str2);
            okhttp3.b0 b0Var = new okhttp3.b0(a0Var);
            yVar.getClass();
            okhttp3.g0 g0VarE = new okhttp3.internal.connection.m(yVar, b0Var, false).e();
            l1 l1Var = this.this$0;
            try {
                if (!g0VarE.N) {
                    g0VarE.close();
                    return null;
                }
                com.google.gson.f fVar = l1Var.gson;
                okhttp3.j0 j0Var = g0VarE.D;
                com.google.gson.k kVar = (com.google.gson.k) fVar.d(com.google.gson.k.class, j0Var != null ? j0Var.z() : null);
                if (kVar == null || (hVarL = kVar.l("imdb_id")) == null || (strH = hVarL.h()) == null || !kotlin.text.r.O(strH, "tt", false)) {
                    strH = null;
                }
                g0VarE.close();
                return strH;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    com.google.common.base.b.d(g0VarE, th);
                    throw th2;
                }
            }
        } catch (Exception unused) {
            return null;
        }
        return null;
    }
}
