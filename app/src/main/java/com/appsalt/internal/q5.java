package com.appsalt.internal;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class q5 extends kotlin.coroutines.jvm.internal.c {
    public /* synthetic */ Object e;
    public final /* synthetic */ f y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q5(f fVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.y = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.z |= Integer.MIN_VALUE;
        Object objF = f.f(this.y, null, this);
        return objF == kotlin.coroutines.intrinsics.a.e ? objF : new kotlin.m(objF);
    }
}
