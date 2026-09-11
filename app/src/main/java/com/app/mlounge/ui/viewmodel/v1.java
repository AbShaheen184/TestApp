package com.app.mlounge.ui.viewmodel;

/* JADX INFO: loaded from: classes.dex */
public final class v1 extends kotlin.coroutines.jvm.internal.c {
    public /* synthetic */ Object e;
    public int y;
    public final /* synthetic */ com.app.mlounge.data.local.prefs.v1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(com.app.mlounge.data.local.prefs.v1 v1Var, kotlin.coroutines.d dVar) {
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
