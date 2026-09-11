package com.app.mlounge;

import androidx.compose.animation.core.c1;
import kotlin.y;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ int e;
    public final /* synthetic */ CinemaHQApp y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(CinemaHQApp cinemaHQApp, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.y = cinemaHQApp;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                return new b(this.y, dVar, 0);
            default:
                return new b(this.y, dVar, 1);
        }
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) obj2;
        switch (this.e) {
            case 0:
                b bVar = (b) create(coroutineScope, dVar);
                y yVar = y.a;
                bVar.invokeSuspend(yVar);
                return yVar;
            default:
                b bVar2 = (b) create(coroutineScope, dVar);
                y yVar2 = y.a;
                bVar2.invokeSuspend(yVar2);
                return yVar2;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        switch (this.e) {
            case 0:
                kotlin.a.e(obj);
                CinemaHQApp cinemaHQApp = this.y;
                BuildersKt__Builders_commonKt.launch$default(cinemaHQApp.C, null, null, new c1(cinemaHQApp, null, 15), 3, null);
                return y.a;
            default:
                CinemaHQApp cinemaHQApp2 = this.y;
                kotlin.a.e(obj);
                try {
                    okhttp3.y yVar = cinemaHQApp2.A;
                    if (yVar == null) {
                        kotlin.jvm.internal.l.f("okHttpClient");
                        throw null;
                    }
                    yVar.F.h();
                    okhttp3.y yVar2 = cinemaHQApp2.A;
                    if (yVar2 == null) {
                        kotlin.jvm.internal.l.f("okHttpClient");
                        throw null;
                    }
                    okhttp3.f fVar = yVar2.k;
                    if (fVar != null) {
                        fVar.a();
                    }
                    return y.a;
                } catch (Exception e) {
                    com.app.mlounge.util.a.b("CinemaHQApp", "Connection pool eviction failed", e);
                }
                break;
        }
    }
}
