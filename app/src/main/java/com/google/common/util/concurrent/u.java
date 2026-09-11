package com.google.common.util.concurrent;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class u extends h0 implements Runnable {
    public static final /* synthetic */ int H = 0;
    public ListenableFuture F;
    public Object G;

    public u(ListenableFuture listenableFuture, Object obj) {
        listenableFuture.getClass();
        this.F = listenableFuture;
        obj.getClass();
        this.G = obj;
    }

    @Override // com.google.common.util.concurrent.r
    public final void c() {
        ListenableFuture listenableFuture = this.F;
        if ((listenableFuture != null) & (this.e instanceof d)) {
            listenableFuture.cancel(p());
        }
        this.F = null;
        this.G = null;
    }

    @Override // com.google.common.util.concurrent.r
    public final String j() {
        String str;
        ListenableFuture listenableFuture = this.F;
        Object obj = this.G;
        String strJ = super.j();
        if (listenableFuture != null) {
            str = "inputFuture=[" + listenableFuture + "], ";
        } else {
            str = "";
        }
        if (obj == null) {
            if (strJ != null) {
                return str.concat(strJ);
            }
            return null;
        }
        return str + "function=[" + obj + "]";
    }

    public abstract Object q(Object obj, Object obj2);

    public abstract void r(Object obj);

    @Override // java.lang.Runnable
    public final void run() {
        ListenableFuture listenableFuture = this.F;
        Object obj = this.G;
        if (((this.e instanceof d) | (listenableFuture == null)) || (obj == null)) {
            return;
        }
        this.F = null;
        if (listenableFuture.isCancelled()) {
            n(listenableFuture);
            return;
        }
        try {
            try {
                Object objQ = q(obj, n0.b(listenableFuture));
                this.G = null;
                r(objQ);
            } catch (Throwable th) {
                try {
                    if (th instanceof InterruptedException) {
                        Thread.currentThread().interrupt();
                    }
                    m(th);
                } finally {
                    this.G = null;
                }
            }
        } catch (Error e) {
            m(e);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e2) {
            m(e2.getCause());
        } catch (Exception e3) {
            m(e3);
        }
    }
}
