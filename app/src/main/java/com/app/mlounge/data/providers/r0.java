package com.app.mlounge.data.providers;

import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    final /* synthetic */ String $base;
    final /* synthetic */ Integer $episode;
    final /* synthetic */ boolean $isTv;
    final /* synthetic */ String $key;
    final /* synthetic */ Integer $season;
    final /* synthetic */ String $tmdbId;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ u0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(boolean z, String str, String str2, Integer num, Integer num2, String str3, u0 u0Var, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.$isTv = z;
        this.$base = str;
        this.$tmdbId = str2;
        this.$season = num;
        this.$episode = num2;
        this.$key = str3;
        this.this$0 = u0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new r0(this.$isTv, this.$base, this.$tmdbId, this.$season, this.$episode, this.$key, this.this$0, dVar);
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((r0) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        int i = this.label;
        if (i == 0) {
            kotlin.a.e(obj);
            boolean z = this.$isTv;
            String str3 = this.$base;
            String str4 = this.$tmdbId;
            if (z) {
                str = str3 + "/tv?id=" + str4 + "&season=" + this.$season + "&episode=" + this.$episode + "&mode=json&sources=" + this.$key;
            } else {
                str = str3 + "/movie?id=" + str4 + "&mode=json&sources=" + this.$key;
            }
            str2 = this.$key;
            u0 u0Var = this.this$0;
            this.L$0 = null;
            this.L$1 = str2;
            this.label = 1;
            o0 o0Var = u0.Companion;
            obj = u0Var.i(str);
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str2 = (String) this.L$1;
            kotlin.a.e(obj);
        }
        return new kotlin.k(str2, obj);
    }
}
