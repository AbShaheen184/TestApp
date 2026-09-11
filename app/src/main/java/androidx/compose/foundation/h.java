package androidx.compose.foundation;

import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ androidx.compose.foundation.interaction.m A;
    public final /* synthetic */ int e;
    public int y;
    public final /* synthetic */ j z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(j jVar, androidx.compose.foundation.interaction.m mVar, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.z = jVar;
        this.A = mVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                return new h(this.z, this.A, dVar, 0);
            case 1:
                return new h(this.z, this.A, dVar, 1);
            case 2:
                return new h(this.z, this.A, dVar, 2);
            default:
                return new h(this.z, this.A, dVar, 3);
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
            case 2:
                break;
        }
        return ((h) create(coroutineScope, dVar)).invokeSuspend(kotlin.y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        switch (this.e) {
            case 0:
                int i = this.y;
                if (i == 0) {
                    kotlin.a.e(obj);
                    androidx.compose.foundation.interaction.k kVar = this.z.N;
                    if (kVar != null) {
                        androidx.compose.foundation.interaction.l lVar = new androidx.compose.foundation.interaction.l(this.A);
                        this.y = 1;
                        Object objA = kVar.a(lVar, this);
                        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                        if (objA == aVar) {
                            return aVar;
                        }
                    }
                } else {
                    if (i != 1) {
                        net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj);
                }
                return kotlin.y.a;
            case 1:
                int i2 = this.y;
                if (i2 == 0) {
                    kotlin.a.e(obj);
                    androidx.compose.foundation.interaction.k kVar2 = this.z.N;
                    if (kVar2 != null) {
                        androidx.compose.foundation.interaction.l lVar2 = new androidx.compose.foundation.interaction.l(this.A);
                        this.y = 1;
                        Object objA2 = kVar2.a(lVar2, this);
                        kotlin.coroutines.intrinsics.a aVar2 = kotlin.coroutines.intrinsics.a.e;
                        if (objA2 == aVar2) {
                            return aVar2;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj);
                }
                return kotlin.y.a;
            case 2:
                int i3 = this.y;
                if (i3 == 0) {
                    kotlin.a.e(obj);
                    androidx.compose.foundation.interaction.k kVar3 = this.z.N;
                    if (kVar3 != null) {
                        this.y = 1;
                        Object objA3 = kVar3.a(this.A, this);
                        kotlin.coroutines.intrinsics.a aVar3 = kotlin.coroutines.intrinsics.a.e;
                        if (objA3 == aVar3) {
                            return aVar3;
                        }
                    }
                } else {
                    if (i3 != 1) {
                        net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.a.e(obj);
                }
                return kotlin.y.a;
            default:
                int i4 = this.y;
                if (i4 == 0) {
                    kotlin.a.e(obj);
                    androidx.compose.foundation.interaction.k kVar4 = this.z.N;
                    if (kVar4 != null) {
                        androidx.compose.foundation.interaction.n nVar = new androidx.compose.foundation.interaction.n(this.A);
                        this.y = 1;
                        Object objA4 = kVar4.a(nVar, this);
                        kotlin.coroutines.intrinsics.a aVar4 = kotlin.coroutines.intrinsics.a.e;
                        if (objA4 == aVar4) {
                            return aVar4;
                        }
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
}
