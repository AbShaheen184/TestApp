package com.appsalt.internal;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class u4 extends kotlin.coroutines.jvm.internal.c {
    public int A;
    public Throwable e;
    public /* synthetic */ Object y;
    public final /* synthetic */ a z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u4(a aVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.z = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.y = obj;
        this.A |= Integer.MIN_VALUE;
        Serializable serializableA = this.z.a(null, this);
        return serializableA == kotlin.coroutines.intrinsics.a.e ? serializableA : new kotlin.m(serializableA);
    }
}
