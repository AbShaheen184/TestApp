package com.google.common.util.concurrent;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class m0 extends k implements Runnable {
    public ListenableFuture E;

    @Override // com.google.common.util.concurrent.r
    public final void c() {
        this.E = null;
    }

    @Override // com.google.common.util.concurrent.r
    public final String j() {
        ListenableFuture listenableFuture = this.E;
        if (listenableFuture == null) {
            return null;
        }
        return "delegate=[" + listenableFuture + "]";
    }

    @Override // java.lang.Runnable
    public final void run() {
        ListenableFuture listenableFuture = this.E;
        if (listenableFuture != null) {
            n(listenableFuture);
        }
    }
}
