package com.appsalt.internal;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class x5 extends kotlin.coroutines.jvm.internal.c {
    public final /* synthetic */ f A;
    public int B;
    public f e;
    public String y;
    public /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x5(f fVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.A = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.z = obj;
        this.B |= Integer.MIN_VALUE;
        return f.b(this.A, null, null, null, this);
    }
}
