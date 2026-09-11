package com.app.mlounge.ui.screens.player;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 extends kotlin.coroutines.jvm.internal.c {
    public File A;
    public long B;
    public /* synthetic */ Object C;
    public final /* synthetic */ z0 D;
    public int E;
    public b1 e;
    public androidx.media3.common.util.b y;
    public String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(z0 z0Var, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.D = z0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.C = obj;
        this.E |= Integer.MIN_VALUE;
        return z0.e(this.D, null, null, 0L, this);
    }
}
