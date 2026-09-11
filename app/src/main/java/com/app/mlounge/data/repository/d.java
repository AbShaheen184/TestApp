package com.app.mlounge.data.repository;

import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ int e;
    public final /* synthetic */ r y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(int i, r rVar, String str, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.e = i;
        this.y = rVar;
        this.z = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                return new d(0, this.y, this.z, dVar);
            case 1:
                return new d(1, this.y, this.z, dVar);
            default:
                return new d(2, this.y, this.z, dVar);
        }
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) obj2;
        switch (this.e) {
            case 0:
                break;
            case 1:
                break;
        }
        return ((d) create(coroutineScope, dVar)).invokeSuspend(kotlin.y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        String str = this.z;
        r rVar = this.y;
        switch (i) {
            case 0:
                kotlin.a.e(obj);
                return rVar.k.getAnimeDetail(str);
            case 1:
                kotlin.a.e(obj);
                return rVar.k.getAnimeEpisodeServers(str);
            default:
                kotlin.a.e(obj);
                return rVar.k.getAnimeEpisodes(str);
        }
    }
}
