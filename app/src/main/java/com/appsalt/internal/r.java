package com.appsalt.internal;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends kotlin.coroutines.jvm.internal.c {
    public Object A;
    public Object B;
    public /* synthetic */ Object C;
    public final /* synthetic */ s0 D;
    public int E;
    public s0 e;
    public Object y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s0 s0Var, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.D = s0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return s0.d(this.D, this);
    }
}
