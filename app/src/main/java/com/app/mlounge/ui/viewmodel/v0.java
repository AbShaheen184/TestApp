package com.app.mlounge.ui.viewmodel;

import com.app.mlounge.data.remote.model.MusicSearchResponse;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class v0 extends kotlin.coroutines.jvm.internal.c {
    public /* synthetic */ Object A;
    public final /* synthetic */ y0 B;
    public int C;
    public String e;
    public MusicSearchResponse y;
    public MusicSearchResponse z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(y0 y0Var, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.B = y0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.A = obj;
        this.C |= Integer.MIN_VALUE;
        return this.B.l(null, this);
    }
}
