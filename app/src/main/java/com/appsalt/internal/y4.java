package com.appsalt.internal;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class y4 extends kotlin.coroutines.jvm.internal.c {
    public int A;
    public Throwable e;
    public /* synthetic */ Object y;
    public final /* synthetic */ a z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4(a aVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.z = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.y = obj;
        this.A |= Integer.MIN_VALUE;
        Object objF = this.z.f(null, this);
        return objF == kotlin.coroutines.intrinsics.a.e ? objF : new kotlin.m(objF);
    }
}
