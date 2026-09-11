package com.app.mlounge.ui.viewmodel;

/* JADX INFO: loaded from: classes.dex */
public final class n extends kotlin.coroutines.jvm.internal.c {
    public /* synthetic */ Object e;
    public int y;
    public final /* synthetic */ androidx.compose.foundation.interaction.f z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(androidx.compose.foundation.interaction.f fVar, kotlin.coroutines.d dVar) {
        super(dVar);
        this.z = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.y |= Integer.MIN_VALUE;
        return this.z.emit(null, this);
    }
}
