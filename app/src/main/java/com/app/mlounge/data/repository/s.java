package com.app.mlounge.data.repository;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends kotlin.coroutines.jvm.internal.c {
    public int A;
    public com.app.mlounge.data.local.entity.c e;
    public /* synthetic */ Object y;
    public final /* synthetic */ x z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(x xVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.z = xVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.y = obj;
        this.A |= Integer.MIN_VALUE;
        return this.z.a(null, this);
    }
}
