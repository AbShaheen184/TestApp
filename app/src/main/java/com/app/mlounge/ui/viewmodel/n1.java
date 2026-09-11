package com.app.mlounge.ui.viewmodel;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class n1 extends kotlin.coroutines.jvm.internal.c {
    public int A;
    public com.app.mlounge.data.repository.b0 e;
    public /* synthetic */ Object y;
    public final /* synthetic */ androidx.compose.animation.a0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n1(androidx.compose.animation.a0 a0Var, kotlin.coroutines.d dVar) {
        super(dVar);
        this.z = a0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.y = obj;
        this.A |= Integer.MIN_VALUE;
        return this.z.a(null, this);
    }
}
