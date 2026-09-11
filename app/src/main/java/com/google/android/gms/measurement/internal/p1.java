package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class p1 extends a2 {
    public static final AtomicLong H = new AtomicLong(Long.MIN_VALUE);
    public o1 A;
    public final PriorityBlockingQueue B;
    public final LinkedBlockingQueue C;
    public final m1 D;
    public final m1 E;
    public final Object F;
    public final Semaphore G;
    public o1 z;

    public p1(s1 s1Var) {
        super(s1Var);
        this.F = new Object();
        this.G = new Semaphore(2);
        this.B = new PriorityBlockingQueue();
        this.C = new LinkedBlockingQueue();
        this.D = new m1(this, "Thread death: Uncaught exception on worker thread");
        this.E = new m1(this, "Thread death: Uncaught exception on network thread");
    }

    public final void A() {
        if (Thread.currentThread() != this.z) {
            return;
        }
        net.luminis.tls.engine.impl.c.r("Call not expected from worker thread");
    }

    public final boolean B() {
        return Thread.currentThread() == this.z;
    }

    public final n1 C(Callable callable) {
        x();
        n1 n1Var = new n1(this, callable, false);
        if (Thread.currentThread() != this.z) {
            I(n1Var);
            return n1Var;
        }
        if (!this.B.isEmpty()) {
            x0 x0Var = ((s1) this.e).C;
            s1.m(x0Var);
            x0Var.F.a("Callable skipped the worker queue.");
        }
        n1Var.run();
        return n1Var;
    }

    public final n1 D(Callable callable) {
        x();
        n1 n1Var = new n1(this, callable, true);
        if (Thread.currentThread() == this.z) {
            n1Var.run();
            return n1Var;
        }
        I(n1Var);
        return n1Var;
    }

    public final void E(Runnable runnable) {
        x();
        com.google.android.gms.common.internal.x.g(runnable);
        I(new n1(this, runnable, false, "Task exception on worker thread"));
    }

    public final Object F(AtomicReference atomicReference, long j, String str, Runnable runnable) {
        synchronized (atomicReference) {
            p1 p1Var = ((s1) this.e).D;
            s1.m(p1Var);
            p1Var.E(runnable);
            try {
                atomicReference.wait(j);
            } catch (InterruptedException unused) {
                x0 x0Var = ((s1) this.e).C;
                s1.m(x0Var);
                v0 v0Var = x0Var.F;
                StringBuilder sb = new StringBuilder(str.length() + 24);
                sb.append("Interrupted waiting for ");
                sb.append(str);
                v0Var.a(sb.toString());
                return null;
            }
        }
        Object obj = atomicReference.get();
        if (obj == null) {
            x0 x0Var2 = ((s1) this.e).C;
            s1.m(x0Var2);
            x0Var2.F.a("Timed out waiting for ".concat(str));
        }
        return obj;
    }

    public final void G(Runnable runnable) {
        x();
        I(new n1(this, runnable, true, "Task exception on worker thread"));
    }

    public final void H(Runnable runnable) {
        x();
        n1 n1Var = new n1(this, runnable, false, "Task exception on network thread");
        synchronized (this.F) {
            try {
                LinkedBlockingQueue linkedBlockingQueue = this.C;
                linkedBlockingQueue.add(n1Var);
                o1 o1Var = this.A;
                if (o1Var == null) {
                    o1 o1Var2 = new o1(this, "Measurement Network", linkedBlockingQueue);
                    this.A = o1Var2;
                    o1Var2.setUncaughtExceptionHandler(this.E);
                    this.A.start();
                } else {
                    Object obj = o1Var.e;
                    synchronized (obj) {
                        obj.notifyAll();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void I(n1 n1Var) {
        synchronized (this.F) {
            try {
                PriorityBlockingQueue priorityBlockingQueue = this.B;
                priorityBlockingQueue.add(n1Var);
                o1 o1Var = this.z;
                if (o1Var == null) {
                    o1 o1Var2 = new o1(this, "Measurement Worker", priorityBlockingQueue);
                    this.z = o1Var2;
                    o1Var2.setUncaughtExceptionHandler(this.D);
                    this.z.start();
                } else {
                    Object obj = o1Var.e;
                    synchronized (obj) {
                        obj.notifyAll();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.compose.animation.core.j2
    public final void v() {
        if (Thread.currentThread() == this.z) {
            return;
        }
        net.luminis.tls.engine.impl.c.r("Call expected from worker thread");
    }

    @Override // com.google.android.gms.measurement.internal.a2
    public final boolean w() {
        return false;
    }

    public final void z() {
        if (Thread.currentThread() == this.A) {
            return;
        }
        net.luminis.tls.engine.impl.c.r("Call expected from network thread");
    }
}
