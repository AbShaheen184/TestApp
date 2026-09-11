package com.appsalt.internal;

import kotlinx.coroutines.channels.ChannelIterator;
import kotlinx.coroutines.channels.ReceiveChannel;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class j5 extends kotlin.coroutines.jvm.internal.c {
    public /* synthetic */ Object A;
    public final /* synthetic */ com.google.firebase.messaging.o B;
    public int C;
    public com.google.firebase.messaging.o e;
    public ReceiveChannel y;
    public ChannelIterator z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j5(com.google.firebase.messaging.o oVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.B = oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        Object objF = this.B.f(this);
        return objF == kotlin.coroutines.intrinsics.a.e ? objF : new kotlin.m(objF);
    }
}
