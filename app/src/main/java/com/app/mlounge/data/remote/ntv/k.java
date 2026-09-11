package com.app.mlounge.data.remote.ntv;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends kotlin.coroutines.jvm.internal.c {
    public int A;
    public Context e;
    public /* synthetic */ Object y;
    public final /* synthetic */ l z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(l lVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.z = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.y = obj;
        this.A |= Integer.MIN_VALUE;
        return this.z.c(null, null, null, null, null, null, this);
    }
}
