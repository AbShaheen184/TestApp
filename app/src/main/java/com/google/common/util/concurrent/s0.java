package com.google.common.util.concurrent;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class s0 extends AtomicReference implements Runnable {
    public static final androidx.emoji2.text.n e;
    public static final androidx.emoji2.text.n y;

    static {
        int i = 1;
        e = new androidx.emoji2.text.n(i);
        y = new androidx.emoji2.text.n(i);
    }

    public abstract void a(Throwable th);

    public abstract void b(Object obj);

    public final void c() {
        androidx.emoji2.text.n nVar = y;
        androidx.emoji2.text.n nVar2 = e;
        Runnable runnable = (Runnable) get();
        if (runnable instanceof Thread) {
            r0 r0Var = new r0(this);
            r0.a(r0Var, Thread.currentThread());
            if (compareAndSet(runnable, r0Var)) {
                try {
                    ((Thread) runnable).interrupt();
                } finally {
                    if (((Runnable) getAndSet(nVar2)) == nVar) {
                        LockSupport.unpark((Thread) runnable);
                    }
                }
            }
        }
    }

    public abstract boolean d();

    public abstract Object e();

    public abstract String f();

    public final void g(Thread thread) {
        Runnable runnable = (Runnable) get();
        r0 r0Var = null;
        boolean z = false;
        int i = 0;
        while (true) {
            boolean z2 = runnable instanceof r0;
            androidx.emoji2.text.n nVar = y;
            if (!z2 && runnable != nVar) {
                break;
            }
            if (z2) {
                r0Var = (r0) runnable;
            }
            i++;
            if (i <= 1000) {
                Thread.yield();
            } else if (runnable == nVar || compareAndSet(runnable, nVar)) {
                z = Thread.interrupted() || z;
                LockSupport.park(r0Var);
            }
            runnable = (Runnable) get();
        }
        if (z) {
            thread.interrupt();
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Thread threadCurrentThread = Thread.currentThread();
        Object objE = null;
        if (compareAndSet(null, threadCurrentThread)) {
            boolean zD = d();
            androidx.emoji2.text.n nVar = e;
            if (!zD) {
                try {
                    objE = e();
                } catch (Throwable th) {
                    try {
                        if (th instanceof InterruptedException) {
                            Thread.currentThread().interrupt();
                        }
                        if (!compareAndSet(threadCurrentThread, nVar)) {
                            g(threadCurrentThread);
                        }
                        if (zD) {
                            return;
                        }
                        a(th);
                        return;
                    } catch (Throwable th2) {
                        if (!compareAndSet(threadCurrentThread, nVar)) {
                            g(threadCurrentThread);
                        }
                        if (!zD) {
                            b(null);
                        }
                        throw th2;
                    }
                }
            }
            if (!compareAndSet(threadCurrentThread, nVar)) {
                g(threadCurrentThread);
            }
            if (zD) {
                return;
            }
            b(objE);
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = (Runnable) get();
        if (runnable == e) {
            str = "running=[DONE]";
        } else if (runnable instanceof r0) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = "running=[RUNNING ON " + ((Thread) runnable).getName() + "]";
        } else {
            str = "running=[NOT STARTED YET]";
        }
        StringBuilder sbD = androidx.constraintlayout.core.g.d(str, ", ");
        sbD.append(f());
        return sbD.toString();
    }
}
