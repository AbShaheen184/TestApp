package com.google.common.util.concurrent;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h implements Runnable {
    public final r e;
    public final ListenableFuture y;

    public h(r rVar, ListenableFuture listenableFuture) {
        this.e = rVar;
        this.y = listenableFuture;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.e.e != this) {
            return;
        }
        if (r.C.d(this.e, this, r.h(this.y))) {
            r.e(this.e, false);
        }
    }
}
