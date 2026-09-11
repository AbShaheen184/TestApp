package com.app.mlounge.ui.viewmodel;

import com.app.mlounge.data.remote.model.SportsMatchResponse;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class y extends kotlin.coroutines.jvm.internal.c {
    public int A;
    public SportsMatchResponse e;
    public /* synthetic */ Object y;
    public final /* synthetic */ a0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(a0 a0Var, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.z = a0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.y = obj;
        this.A |= Integer.MIN_VALUE;
        return a0.h(this.z, this);
    }
}
