package com.app.mlounge.ui.viewmodel;

import com.app.mlounge.data.remote.model.IptvChannel;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class v extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ IptvChannel A;
    public final /* synthetic */ int e;
    public int y;
    public final /* synthetic */ a0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v(a0 a0Var, IptvChannel iptvChannel, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.z = a0Var;
        this.A = iptvChannel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                return new v(this.z, this.A, dVar, 0);
            default:
                return new v(this.z, this.A, dVar, 1);
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
        return ((v) create(coroutineScope, dVar)).invokeSuspend(kotlin.y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        switch (this.e) {
            case 0:
                int i = this.y;
                if (i == 0) {
                    kotlin.a.e(obj);
                    com.app.mlounge.data.repository.x xVar = this.z.c;
                    IptvChannel iptvChannel = this.A;
                    String strE = coil3.compose.internal.f.e("livetv_", iptvChannel.c(), "_", iptvChannel.d());
                    String strC = iptvChannel.c();
                    String strB = iptvChannel.b();
                    String strA = iptvChannel.a();
                    if (strA == null) {
                        strA = "";
                    }
                    String strD = iptvChannel.d();
                    com.app.mlounge.data.local.entity.c cVar = new com.app.mlounge.data.local.entity.c(strE, "live_tv", strC, strB, null, null, null, androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.i(strA, " - ", strD != null ? strD : ""), 0L, iptvChannel.f(), null, null, null, 30576);
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
                a0 a0Var = this.z;
                IptvChannel iptvChannel2 = this.A;
                kotlin.coroutines.intrinsics.a aVar2 = kotlin.coroutines.intrinsics.a.e;
                if (i2 != 0) {
                    if (i2 == 1) {
                        kotlin.a.e(obj);
                    } else {
                        if (i2 != 2) {
                            net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.a.e(obj);
                    }
                    return kotlin.y.a;
                }
                kotlin.a.e(obj);
                com.app.mlounge.data.repository.x xVar2 = a0Var.c;
                String strE2 = coil3.compose.internal.f.e("livetv_", iptvChannel2.c(), "_", iptvChannel2.d());
                String strC2 = iptvChannel2.c();
                String strB2 = iptvChannel2.b();
                String strA2 = iptvChannel2.a();
                if (strA2 == null) {
                    strA2 = "";
                }
                String strD2 = iptvChannel2.d();
                com.app.mlounge.data.local.entity.f fVar = new com.app.mlounge.data.local.entity.f(strE2, "live_tv", strC2, strB2, null, null, null, androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.i(strA2, " - ", strD2 != null ? strD2 : ""), 0L, iptvChannel2.f(), iptvChannel2.f(), 368);
                this.y = 1;
                if (xVar2.b(fVar, this) == aVar2) {
                    return aVar2;
                }
                MutableSharedFlow mutableSharedFlow = a0Var.z;
                String strC3 = androidx.constraintlayout.core.g.c(iptvChannel2.c(), " added to favourites");
                this.y = 2;
                if (mutableSharedFlow.emit(strC3, this) == aVar2) {
                    return aVar2;
                }
                return kotlin.y.a;
        }
    }
}
