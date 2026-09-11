package com.google.common.util.concurrent;

import java.util.concurrent.ExecutionException;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c extends h0 implements Runnable {
    public static final /* synthetic */ int I = 0;
    public ListenableFuture F;
    public Class G;
    public Object H;

    public c(ListenableFuture listenableFuture, Class cls, Object obj) {
        this.F = listenableFuture;
        this.G = cls;
        this.H = obj;
    }

    @Override // com.google.common.util.concurrent.r
    public final void c() {
        ListenableFuture listenableFuture = this.F;
        if ((listenableFuture != null) & (this.e instanceof d)) {
            listenableFuture.cancel(p());
        }
        this.F = null;
        this.G = null;
        this.H = null;
    }

    @Override // com.google.common.util.concurrent.r
    public final String j() {
        String str;
        ListenableFuture listenableFuture = this.F;
        Class cls = this.G;
        Object obj = this.H;
        String strJ = super.j();
        if (listenableFuture != null) {
            str = "inputFuture=[" + listenableFuture + "], ";
        } else {
            str = "";
        }
        if (cls == null || obj == null) {
            if (strJ != null) {
                return str.concat(strJ);
            }
            return null;
        }
        return str + "exceptionType=[" + cls + "], fallback=[" + obj + "]";
    }

    public abstract Object q(Object obj, Throwable th);

    public abstract void r(Object obj);

    @Override // java.lang.Runnable
    public final void run() {
        Object objB;
        ListenableFuture listenableFuture = this.F;
        Class cls = this.G;
        Object obj = this.H;
        if (((obj == null) || ((listenableFuture == null) | (cls == null))) || (this.e instanceof d)) {
            return;
        }
        this.F = null;
        try {
            th = listenableFuture instanceof r ? ((r) listenableFuture).o() : null;
            objB = th == null ? n0.b(listenableFuture) : null;
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause == null) {
                cause = new NullPointerException("Future type " + listenableFuture.getClass() + " threw " + e.getClass() + " without a cause");
            }
            th = cause;
        } catch (Throwable th) {
            th = th;
        }
        if (th == null) {
            l(objB);
            return;
        }
        if (!cls.isInstance(th)) {
            n(listenableFuture);
            return;
        }
        try {
            Object objQ = q(obj, th);
            this.G = null;
            this.H = null;
            r(objQ);
        } catch (Throwable th2) {
            try {
                if (th2 instanceof InterruptedException) {
                    Thread.currentThread().interrupt();
                }
                m(th2);
            } finally {
                this.G = null;
                this.H = null;
            }
        }
    }
}
