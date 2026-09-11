package com.appsalt.internal;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class q3 extends kotlin.coroutines.jvm.internal.c {
    public final /* synthetic */ d4 A;
    public int B;
    public Object e;
    public Object y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q3(d4 d4Var, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.A = d4Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.z = obj;
        this.B |= Integer.MIN_VALUE;
        return this.A.e(null, this);
    }
}
