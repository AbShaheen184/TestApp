package com.app.mlounge.ui.viewmodel;

import com.app.mlounge.data.remote.model.ChqStream;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class q1 extends kotlin.coroutines.jvm.internal.c {
    public final /* synthetic */ r1 A;
    public int B;
    public ChqStream e;
    public l y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(r1 r1Var, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.A = r1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.z = obj;
        this.B |= Integer.MIN_VALUE;
        return r1.k(this.A, null, null, this);
    }
}
