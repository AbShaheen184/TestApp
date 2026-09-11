package com.app.mlounge.data.providers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class s0 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    final /* synthetic */ String $base;
    final /* synthetic */ Integer $episode;
    final /* synthetic */ boolean $isTv;
    final /* synthetic */ List<String> $order;
    final /* synthetic */ Integer $season;
    final /* synthetic */ String $tmdbId;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ u0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(List list, boolean z, String str, String str2, Integer num, Integer num2, u0 u0Var, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.$order = list;
        this.$isTv = z;
        this.$base = str;
        this.$tmdbId = str2;
        this.$season = num;
        this.$episode = num2;
        this.this$0 = u0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        s0 s0Var = new s0(this.$order, this.$isTv, this.$base, this.$tmdbId, this.$season, this.$episode, this.this$0, dVar);
        s0Var.L$0 = obj;
        return s0Var;
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((s0) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.a.e(obj);
                return obj;
            }
            net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.a.e(obj);
        List<String> list = this.$order;
        boolean z = this.$isTv;
        String str = this.$base;
        String str2 = this.$tmdbId;
        Integer num = this.$season;
        Integer num2 = this.$episode;
        u0 u0Var = this.this$0;
        ArrayList arrayList = new ArrayList(kotlin.collections.p.y(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            u0 u0Var2 = u0Var;
            ArrayList arrayList2 = arrayList;
            arrayList2.add(BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new r0(z, str, str2, num, num2, (String) it.next(), u0Var2, null), 3, null));
            arrayList = arrayList2;
            u0Var = u0Var2;
        }
        this.L$0 = null;
        this.label = 1;
        Object objAwaitAll = AwaitKt.awaitAll(arrayList, this);
        kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
        return objAwaitAll == aVar ? aVar : objAwaitAll;
    }
}
