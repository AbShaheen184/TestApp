package com.app.mlounge.data.repository;

import com.app.mlounge.data.local.prefs.v1;

/* JADX INFO: loaded from: classes.dex */
public final class n0 extends kotlin.coroutines.jvm.internal.c {
    public /* synthetic */ Object e;
    public int y;
    public final /* synthetic */ v1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(v1 v1Var, kotlin.coroutines.d dVar) {
        super(dVar);
        this.z = v1Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.y |= Integer.MIN_VALUE;
        return this.z.emit(null, this);
    }
}
