package com.app.mlounge.ui.viewmodel;

import com.app.mlounge.data.remote.model.EpornerThumb;
import com.app.mlounge.data.remote.model.EpornerVideoDetail;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ EpornerVideoDetail A;
    public final /* synthetic */ int e;
    public int y;
    public final /* synthetic */ c z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(c cVar, EpornerVideoDetail epornerVideoDetail, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.z = cVar;
        this.A = epornerVideoDetail;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                return new a(this.z, this.A, dVar, 0);
            default:
                return new a(this.z, this.A, dVar, 1);
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
        return ((a) create(coroutineScope, dVar)).invokeSuspend(kotlin.y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        switch (this.e) {
            case 0:
                int i = this.y;
                if (i == 0) {
                    kotlin.a.e(obj);
                    com.app.mlounge.data.repository.x xVar = this.z.c;
                    EpornerVideoDetail epornerVideoDetail = this.A;
                    String strH = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.h("adult_", epornerVideoDetail.c());
                    String strH2 = epornerVideoDetail.h();
                    if (strH2 == null) {
                        strH2 = "";
                    }
                    EpornerThumb epornerThumbB = epornerVideoDetail.b();
                    com.app.mlounge.data.local.entity.c cVar = new com.app.mlounge.data.local.entity.c(strH, "adult", strH2, epornerThumbB != null ? epornerThumbB.a() : null, null, null, null, null, 0L, epornerVideoDetail.c(), null, null, null, 30704);
                    this.y = 1;
                    Object objA = xVar.a(cVar, this);
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
                }
                return kotlin.y.a;
            default:
                int i2 = this.y;
                if (i2 == 0) {
                    kotlin.a.e(obj);
                    com.app.mlounge.data.repository.x xVar2 = this.z.c;
                    EpornerVideoDetail epornerVideoDetail2 = this.A;
                    String strH3 = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.h("adult_", epornerVideoDetail2.c());
                    String strH4 = epornerVideoDetail2.h();
                    if (strH4 == null) {
                        strH4 = "";
                    }
                    EpornerThumb epornerThumbB2 = epornerVideoDetail2.b();
                    com.app.mlounge.data.local.entity.f fVar = new com.app.mlounge.data.local.entity.f(strH3, "adult", strH4, epornerThumbB2 != null ? epornerThumbB2.a() : null, null, null, null, null, 0L, epornerVideoDetail2.c(), null, 1520);
                    this.y = 1;
                    Object objF = xVar2.f(fVar, this);
                    kotlin.coroutines.intrinsics.a aVar2 = kotlin.coroutines.intrinsics.a.e;
                    if (objF == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj);
                }
                return kotlin.y.a;
        }
    }
}
