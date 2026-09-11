package com.app.mlounge.data.providers;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 extends kotlin.coroutines.jvm.internal.c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ u0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(u0 u0Var, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.this$0 = u0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return u0.d(this.this$0, null, this);
    }
}
