package com.app.mlounge.data.iptv;

import com.app.mlounge.data.remote.model.IptvChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    final /* synthetic */ List<IptvChannel> $batch;
    final /* synthetic */ kotlin.jvm.functions.l $onProgress;
    final /* synthetic */ kotlin.jvm.internal.x $totalCount;
    /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ l this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(List list, kotlin.jvm.internal.x xVar, l lVar, kotlin.jvm.functions.l lVar2, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.$batch = list;
        this.$totalCount = xVar;
        this.this$0 = lVar;
        this.$onProgress = lVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        c cVar = new c(this.$batch, this.$totalCount, this.this$0, this.$onProgress, dVar);
        cVar.L$0 = obj;
        return cVar;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((IptvChannel) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        IptvChannel iptvChannel = (IptvChannel) this.L$0;
        int i = this.label;
        if (i == 0) {
            kotlin.a.e(obj);
            this.$batch.add(iptvChannel);
            this.$totalCount.e++;
            if (this.$batch.size() >= 1000) {
                List<IptvChannel> list = this.$batch;
                l lVar = this.this$0;
                ArrayList arrayList = new ArrayList(kotlin.collections.p.y(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(l.f(lVar, (IptvChannel) it.next()));
                }
                com.app.mlounge.data.local.dao.k kVar = this.this$0.channelDao;
                this.L$0 = null;
                this.L$1 = null;
                this.label = 1;
                Object objB = ((com.app.mlounge.data.local.dao.l) kVar).b(arrayList, this);
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
        this.$onProgress.invoke("Parsed " + this.$totalCount.e + " channels...");
        return kotlin.y.a;
    }
}
