package com.appsalt.internal;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class u5 extends kotlin.coroutines.jvm.internal.c {
    public /* synthetic */ Object A;
    public final /* synthetic */ androidx.compose.runtime.internal.c B;
    public int C;
    public androidx.compose.runtime.internal.c e;
    public String y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u5(androidx.compose.runtime.internal.c cVar, kotlin.coroutines.jvm.internal.c cVar2) {
        super(cVar2);
        this.B = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        Object objD = this.B.d(0, null, this);
        return objD == kotlin.coroutines.intrinsics.a.e ? objD : new kotlin.m(objD);
    }
}
