package com.app.mlounge.data.iptv;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ c0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(c0 c0Var, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.this$0 = c0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        b0 b0Var = new b0(this.this$0, dVar);
        b0Var.L$0 = obj;
        return b0Var;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((b0) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        int i = this.label;
        if (i == 0) {
            kotlin.a.e(obj);
            kotlin.o oVar = com.app.mlounge.util.a.a;
            c0.Companion.getClass();
            Map map = c0.PROVIDER_SOURCES;
            c0 c0Var = this.this$0;
            ArrayList arrayList = new ArrayList(map.size());
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                arrayList.add(BuildersKt__Builders_commonKt.async$default(coroutineScope, Dispatchers.getIO(), null, new z(c0Var, (String) ((Map.Entry) it.next()).getKey(), null), 2, null));
            }
            Deferred deferredAsync$default = BuildersKt__Builders_commonKt.async$default(coroutineScope, Dispatchers.getIO(), null, new a0(this.this$0, null), 2, null);
            ArrayList arrayListW = kotlin.collections.o.W(kotlin.collections.o.W(arrayList, deferredAsync$default), BuildersKt__Builders_commonKt.async$default(coroutineScope, Dispatchers.getIO(), null, new y(this.this$0, null), 2, null));
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.label = 1;
            obj = AwaitKt.awaitAll(arrayListW, this);
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.a.e(obj);
        }
        List list = (List) obj;
        c0.e(this.this$0, kotlin.collections.a0.G(list));
        c0.a(this.this$0);
        kotlin.o oVar2 = com.app.mlounge.util.a.a;
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            ((Number) ((kotlin.k) it2.next()).y).intValue();
        }
        return kotlin.y.a;
    }
}
