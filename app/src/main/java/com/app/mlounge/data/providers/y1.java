package com.app.mlounge.data.providers;

import com.app.mlounge.data.remote.model.ChqStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.SupervisorKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class y1 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    final /* synthetic */ Integer $episode;
    final /* synthetic */ String $mediaType;
    final /* synthetic */ Integer $season;
    final /* synthetic */ String $tmdbId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ z1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y1(z1 z1Var, Integer num, Integer num2, String str, String str2, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.this$0 = z1Var;
        this.$mediaType = str;
        this.$season = num;
        this.$episode = num2;
        this.$tmdbId = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        y1 y1Var = new y1(this.this$0, this.$season, this.$episode, this.$mediaType, this.$tmdbId, dVar);
        y1Var.L$0 = obj;
        return y1Var;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((y1) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objSupervisorScope;
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.a.e(obj);
                x1 x1Var = new x1(this.this$0, this.$season, this.$episode, this.$mediaType, this.$tmdbId, null);
                this.L$0 = coroutineScope;
                this.label = 1;
                objSupervisorScope = SupervisorKt.supervisorScope(x1Var, this);
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                if (objSupervisorScope == aVar) {
                    return aVar;
                }
            } else {
                if (i != 1) {
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(obj);
                objSupervisorScope = obj;
            }
            ArrayList arrayList = new ArrayList();
            for (com.google.gson.k kVar : (List) objSupervisorScope) {
                if (kVar == null) {
                    kotlin.o oVar = com.app.mlounge.util.a.a;
                } else {
                    kotlin.o oVar2 = com.app.mlounge.util.a.a;
                    kVar.e.keySet().toString();
                    String strC = z1.c(this.this$0, kVar);
                    if (strC != null) {
                        String str = (!kotlin.text.k.T(strC, ".m3u8", false) && (kotlin.text.k.T(strC, ".mp4", false) || kotlin.text.k.T(strC, ".mkv", false))) ? "mp4" : "hls";
                        Map mapSingletonMap = Collections.singletonMap("Referer", "https://vidnest.fun/");
                        mapSingletonMap.getClass();
                        arrayList.add(new ChqStream("VidNest", strC, "Auto", str, str, null, mapSingletonMap, null, null, null, null, null, null, 8064));
                    }
                }
            }
            return arrayList;
        } catch (Exception e) {
            kotlin.o oVar3 = com.app.mlounge.util.a.a;
            coil3.compose.internal.f.i("Error: ", e.getMessage(), "VidNest");
            return kotlin.collections.u.e;
        }
    }
}
