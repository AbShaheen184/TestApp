package com.appsalt.internal;

import kotlinx.coroutines.TimeoutKt;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class t3 extends kotlin.coroutines.jvm.internal.i implements kotlin.jvm.functions.p {
    public int e;

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d create(Object obj, kotlin.coroutines.d dVar) {
        return new t3(2, dVar);
    }

    @Override // kotlin.jvm.functions.p
    public final Object invoke(Object obj, Object obj2) {
        return new t3(2, (kotlin.coroutines.d) obj2).invokeSuspend(kotlin.y.a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        int i = this.e;
        if (i == 0) {
            kotlin.a.e(obj);
            long j = w3.a;
            androidx.compose.foundation.gestures.d1 d1Var = new androidx.compose.foundation.gestures.d1(2, 3, null);
            this.e = 1;
            Object objM26withTimeoutKLykuaI = TimeoutKt.m26withTimeoutKLykuaI(j, d1Var, this);
            kotlin.coroutines.intrinsics.a aVar = kotlin.coroutines.intrinsics.a.e;
            if (objM26withTimeoutKLykuaI == aVar) {
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
    }
}
