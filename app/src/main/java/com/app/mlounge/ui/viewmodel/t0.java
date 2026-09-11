package com.app.mlounge.ui.viewmodel;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 extends kotlin.coroutines.jvm.internal.c {
    public final /* synthetic */ y0 A;
    public int B;
    public String e;
    public ArrayList y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(y0 y0Var, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.A = y0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.z = obj;
        this.B |= Integer.MIN_VALUE;
        return this.A.j(null, this);
    }
}
