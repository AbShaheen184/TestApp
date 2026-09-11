package com.app.mlounge.data.download;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends kotlin.coroutines.jvm.internal.c {
    public int A;
    public String e;
    public /* synthetic */ Object y;
    public final /* synthetic */ h z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(h hVar, kotlin.coroutines.jvm.internal.c cVar) {
        super(cVar);
        this.z = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.y = obj;
        this.A |= Integer.MIN_VALUE;
        return h.a(this.z, null, this);
    }
}
