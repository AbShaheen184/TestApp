package com.google.common.util.concurrent;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends c {
    @Override // com.google.common.util.concurrent.c
    public final Object q(Object obj, Throwable th) {
        z zVar = (z) obj;
        ListenableFuture listenableFutureApply = zVar.apply(th);
        com.google.android.material.motion.a.l(listenableFutureApply, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zVar);
        return listenableFutureApply;
    }

    @Override // com.google.common.util.concurrent.c
    public final void r(Object obj) {
        n((ListenableFuture) obj);
    }
}
