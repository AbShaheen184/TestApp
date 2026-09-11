package com.appsalt.internal;

import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class o2 extends kotlin.coroutines.jvm.internal.c {
    public Mutex A;
    public /* synthetic */ Object B;
    public final /* synthetic */ e3 C;
    public int D;
    public e3 e;
    public String y;
    public byte[] z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(e3 e3Var, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.C = e3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return e3.c(this.C, null, null, this);
    }
}
