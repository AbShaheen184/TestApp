package com.app.mlounge.data.repository;

import com.app.mlounge.data.remote.api.TmdbTvDetailResponse;
import com.app.mlounge.ui.viewmodel.x1;
import java.util.List;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ int A;
    public final /* synthetic */ String B;
    public /* synthetic */ Object C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ int e = 0;
    public int y;
    public final /* synthetic */ int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(x1 x1Var, TmdbTvDetailResponse tmdbTvDetailResponse, int i, int i2, String str, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.C = x1Var;
        this.D = tmdbTvDetailResponse;
        this.z = i;
        this.A = i2;
        this.B = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                j jVar = new j((com.app.mlounge.data.providers.k0) this.D, this.B, this.z, this.A, dVar);
                jVar.C = obj;
                return jVar;
            default:
                return new j((x1) this.C, (TmdbTvDetailResponse) this.D, this.z, this.A, this.B, dVar);
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
        return ((j) create(coroutineScope, dVar)).invokeSuspend(kotlin.y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object lVar;
        Object objA;
        switch (this.e) {
            case 0:
                int i = this.y;
                try {
                    if (i == 0) {
                        kotlin.a.e(obj);
                        com.app.mlounge.data.providers.k0 k0Var = (com.app.mlounge.data.providers.k0) this.D;
                        String str = this.B;
                        int i2 = this.z;
                        int i3 = this.A;
                        Integer num = new Integer(i2);
                        Integer num2 = new Integer(i3);
                        this.C = null;
                        this.y = 1;
                        objA = k0Var.a(str, "tv", num, num2, this);
                        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                        if (objA == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i != 1) {
                            net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.a.e(obj);
                        objA = obj;
                    }
                    lVar = (List) objA;
                    break;
                } catch (Throwable th) {
                    lVar = new kotlin.l(th);
                }
                return lVar instanceof kotlin.l ? null : lVar;
            default:
                x1 x1Var = (x1) this.C;
                j0 j0Var = x1Var.b;
                TmdbTvDetailResponse tmdbTvDetailResponse = (TmdbTvDetailResponse) this.D;
                int i4 = this.y;
                if (i4 == 0) {
                    kotlin.a.e(obj);
                    x xVar = x1Var.c;
                    int iH = tmdbTvDetailResponse.h();
                    int i5 = this.z;
                    StringBuilder sbW = androidx.privacysandbox.ads.adservices.java.internal.a.w("tv_", "_s", iH, "_e", i5);
                    int i6 = this.A;
                    sbW.append(i6);
                    String string = sbW.toString();
                    String strJ = tmdbTvDetailResponse.j();
                    if (strJ == null) {
                        strJ = "";
                    }
                    com.app.mlounge.data.local.entity.c cVar = new com.app.mlounge.data.local.entity.c(string, "tv", strJ, j0.c(j0Var, tmdbTvDetailResponse.m()), j0.a(j0Var, tmdbTvDetailResponse.a()), tmdbTvDetailResponse.p(), tmdbTvDetailResponse.f(), tmdbTvDetailResponse.l(), 0L, String.valueOf(tmdbTvDetailResponse.h()), new Integer(i5), new Integer(i6), this.B, 1792);
                    this.y = 1;
                    Object objA2 = xVar.a(cVar, this);
                    kotlin.coroutines.intrinsics.a aVar2 = kotlin.coroutines.intrinsics.a.e;
                    if (objA2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i4 != 1) {
                        net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj);
                }
                return kotlin.y.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.app.mlounge.data.providers.k0 k0Var, String str, int i, int i2, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.D = k0Var;
        this.B = str;
        this.z = i;
        this.A = i2;
    }
}
