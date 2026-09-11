package com.app.mlounge.data.iptv;

import java.io.BufferedReader;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class p extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    final /* synthetic */ BufferedReader $reader;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(BufferedReader bufferedReader, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.$reader = bufferedReader;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new p(this.$reader, dVar);
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return ((p) create((CoroutineScope) obj, (kotlin.coroutines.d) obj2)).invokeSuspend(kotlin.y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            kotlin.a.e(obj);
            return this.$reader.readLine();
        }
        net.luminis.tls.engine.impl.c.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
