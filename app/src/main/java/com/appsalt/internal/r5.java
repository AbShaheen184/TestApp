package com.appsalt.internal;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class r5 extends kotlin.coroutines.jvm.internal.c {
    public int A;
    public androidx.compose.runtime.internal.c e;
    public /* synthetic */ Object y;
    public final /* synthetic */ androidx.compose.runtime.internal.c z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r5(androidx.compose.runtime.internal.c cVar, kotlin.coroutines.jvm.internal.c cVar2) {
        super(cVar2);
        this.z = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.y = obj;
        this.A |= Integer.MIN_VALUE;
        Object objG = this.z.g(0, this);
        return objG == kotlin.coroutines.intrinsics.a.e ? objG : new kotlin.m(objG);
    }
}
