package com.appsalt.internal;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class t5 extends kotlin.coroutines.jvm.internal.c {
    public int A;
    public Object e;
    public /* synthetic */ Object y;
    public final /* synthetic */ f z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t5(f fVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.z = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.y = obj;
        this.A |= Integer.MIN_VALUE;
        Object objD = this.z.d(null, this);
        return objD == kotlin.coroutines.intrinsics.a.e ? objD : new kotlin.m(objD);
    }
}
