package com.appsalt.internal;

import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class i1 extends kotlin.coroutines.jvm.internal.c {
    public /* synthetic */ Object A;
    public final /* synthetic */ e3 B;
    public int C;
    public e3 e;
    public String y;
    public Mutex z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(e3 e3Var, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.B = e3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return e3.b(this.B, null, this);
    }
}
