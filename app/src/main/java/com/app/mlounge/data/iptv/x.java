package com.app.mlounge.data.iptv;

import com.app.mlounge.data.remote.model.IptvChannel;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class x extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    final /* synthetic */ List<com.app.mlounge.data.local.entity.d> $batch;
    final /* synthetic */ kotlin.jvm.internal.x $total;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ c0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(List list, c0 c0Var, kotlin.jvm.internal.x xVar, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.$batch = list;
        this.this$0 = c0Var;
        this.$total = xVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        x xVar = new x(this.$batch, this.this$0, this.$total, dVar);
        xVar.L$0 = obj;
        return xVar;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((x) create((IptvChannel) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        IptvChannel iptvChannel = (IptvChannel) this.L$0;
        int i = this.label;
        if (i == 0) {
            kotlin.a.e(obj);
            this.$batch.add(c0.f(this.this$0, iptvChannel));
            this.$total.e++;
            if (this.$batch.size() >= 1000) {
                com.app.mlounge.data.local.dao.k kVar = this.this$0.channelDao;
                List<com.app.mlounge.data.local.entity.d> list = this.$batch;
                this.L$0 = null;
                this.label = 1;
                Object objB = ((com.app.mlounge.data.local.dao.l) kVar).b(list, this);
                kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
                if (objB == aVar) {
                    return aVar;
                }
            }
            return kotlin.y.a;
        }
        if (i != 1) {
            net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.a.e(obj);
        this.$batch.clear();
        return kotlin.y.a;
    }
}
