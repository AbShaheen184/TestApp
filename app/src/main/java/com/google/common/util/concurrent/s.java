package com.google.common.util.concurrent;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class s extends u {
    @Override // com.google.common.util.concurrent.u
    public final Object q(Object obj, Object obj2) {
        z zVar = (z) obj;
        ListenableFuture listenableFutureApply = zVar.apply(obj2);
        com.google.android.material.motion.a.l(listenableFutureApply, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zVar);
        return listenableFutureApply;
    }

    @Override // com.google.common.util.concurrent.u
    public final void r(Object obj) {
        n((ListenableFuture) obj);
    }
}
