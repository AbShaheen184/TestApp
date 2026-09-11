package com.app.mlounge.ui.viewmodel;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class q0 extends kotlin.coroutines.jvm.internal.c {
    public int A;
    public String e;
    public /* synthetic */ Object y;
    public final /* synthetic */ y0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(y0 y0Var, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.z = y0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.y = obj;
        this.A |= Integer.MIN_VALUE;
        return this.z.g(null, this);
    }
}
