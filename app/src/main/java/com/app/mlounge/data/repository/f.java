package com.app.mlounge.data.repository;

import com.app.mlounge.data.remote.api.ChqApi;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public int A;
    public final /* synthetic */ int e = 1;
    public final /* synthetic */ r y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(int i, r rVar, String str, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.y = rVar;
        this.z = str;
        this.A = i;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                return new f(this.y, this.z, dVar);
            default:
                return new f(this.A, this.y, this.z, dVar);
        }
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) obj2;
        switch (this.e) {
            case 0:
                break;
        }
        return ((f) create(coroutineScope, dVar)).invokeSuspend(kotlin.y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        switch (this.e) {
            case 0:
                int i = this.A;
                if (i != 0) {
                    if (i == 1) {
                        kotlin.a.e(obj);
                        return obj;
                    }
                    net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.a.e(obj);
                ChqApi chqApi = this.y.a;
                this.A = 1;
                Object gameStats = chqApi.getGameStats(this.z, this);
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                return gameStats == aVar ? aVar : gameStats;
            default:
                kotlin.a.e(obj);
                return this.y.k.searchAnime(this.z, this.A, null, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(r rVar, String str, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.y = rVar;
        this.z = str;
    }
}
