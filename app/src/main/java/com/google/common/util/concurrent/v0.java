package com.google.common.util.concurrent;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class v0 extends k implements Runnable {
    public final Runnable E;

    public v0(Runnable runnable) {
        runnable.getClass();
        this.E = runnable;
    }

    @Override // com.google.common.util.concurrent.r
    public final String j() {
        return "task=[" + this.E + "]";
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.E.run();
        } catch (Throwable th) {
            m(th);
            throw th;
        }
    }
}
