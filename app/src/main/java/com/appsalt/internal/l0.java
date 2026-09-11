package com.appsalt.internal;

import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.channels.Channel;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public final /* synthetic */ net.luminis.quic.stream.e A;
    public final /* synthetic */ int e;
    public int y;
    public final /* synthetic */ y0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l0(y0 y0Var, net.luminis.quic.stream.e eVar, kotlin.coroutines.d dVar, int i) {
        super(2, dVar);
        this.e = i;
        this.z = y0Var;
        this.A = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        switch (this.e) {
            case 0:
                return new l0(this.z, this.A, dVar, 0);
            default:
                return new l0(this.z, this.A, dVar, 1);
        }
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        kotlin.coroutines.d dVar = (kotlin.coroutines.d) obj2;
        switch (this.e) {
            case 0:
                return new l0(this.z, this.A, dVar, 0).invokeSuspend(kotlin.y.a);
            default:
                return new l0(this.z, this.A, dVar, 1).invokeSuspend(kotlin.y.a);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        switch (this.e) {
            case 0:
                int i = this.y;
                if (i == 0) {
                    kotlin.a.e(obj);
                    Channel channel = this.z.c;
                    androidx.media3.exoplayer.dash.manifest.t tVar = new androidx.media3.exoplayer.dash.manifest.t(this.A, 17);
                    this.y = 1;
                    Object objSend = channel.send(tVar, this);
                    kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                    if (objSend == aVar) {
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
                    y0 y0Var = this.z;
                    kotlin.coroutines.i iVar = y0Var.b;
                    l0 l0Var = new l0(y0Var, this.A, null, 0);
                    this.y = 1;
                    Object objWithContext = BuildersKt.withContext(iVar, l0Var, this);
                    kotlin.coroutines.intrinsics.a aVar2 = kotlin.coroutines.intrinsics.a.e;
                    if (objWithContext == aVar2) {
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
