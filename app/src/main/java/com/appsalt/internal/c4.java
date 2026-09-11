package com.appsalt.internal;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c4 extends kotlin.coroutines.jvm.internal.c {
    public /* synthetic */ Object A;
    public final /* synthetic */ w4 B;
    public int C;
    public Object e;
    public c3 y;
    public y0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c4(w4 w4Var, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.B = w4Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        Object objA = this.B.a(0, this);
        return objA == kotlin.coroutines.intrinsics.a.e ? objA : new kotlin.m(objA);
    }
}
