package com.app.mlounge.data.iptv;

import com.app.mlounge.data.remote.model.IptvChannel;
import java.util.List;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
@kotlin.coroutines.jvm.internal.e(c = "com.app.mlounge.data.iptv.EarthCamProvider$fetchAllCams$2$channels$1", f = "EarthCamProvider.kt", l = {}, m = "invokeSuspend", v = 2)
public final class EarthCamProvider$fetchAllCams$2$channels$1 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    final /* synthetic */ String $url;
    int label;
    final /* synthetic */ EarthCamProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EarthCamProvider$fetchAllCams$2$channels$1(EarthCamProvider earthCamProvider, String str, kotlin.coroutines.d<? super EarthCamProvider$fetchAllCams$2$channels$1> dVar) {
        super(2, dVar);
        this.this$0 = earthCamProvider;
        this.$url = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<kotlin.y> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new EarthCamProvider$fetchAllCams$2$channels$1(this.this$0, this.$url, dVar);
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(CoroutineScope coroutineScope, kotlin.coroutines.d<? super List<IptvChannel>> dVar) {
        return ((EarthCamProvider$fetchAllCams$2$channels$1) create(coroutineScope, dVar)).invokeSuspend(kotlin.y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            kotlin.a.e(obj);
            return this.this$0.fetchSource(this.$url);
        }
        net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
