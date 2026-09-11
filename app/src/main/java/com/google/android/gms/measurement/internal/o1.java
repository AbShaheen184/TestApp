package com.google.android.gms.measurement.internal;

import android.os.Process;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class o1 extends Thread {
    public final /* synthetic */ p1 A;
    public final Object e;
    public final BlockingQueue y;
    public boolean z = false;

    public o1(p1 p1Var, String str, BlockingQueue blockingQueue) {
        this.A = p1Var;
        com.google.android.gms.common.internal.x.g(blockingQueue);
        this.e = new Object();
        this.y = blockingQueue;
        setName(str);
    }

    public final void a() {
        p1 p1Var = this.A;
        synchronized (p1Var.F) {
            try {
                if (!this.z) {
                    p1Var.G.release();
                    p1Var.F.notifyAll();
                    if (this == p1Var.z) {
                        p1Var.z = null;
                    } else if (this == p1Var.A) {
                        p1Var.A = null;
                    } else {
                        x0 x0Var = ((s1) p1Var.e).C;
                        s1.m(x0Var);
                        x0Var.C.a("Current scheduler thread is neither worker nor network");
                    }
                    this.z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        boolean z = false;
        while (!z) {
            try {
                this.A.G.acquire();
                z = true;
            } catch (InterruptedException e) {
                x0 x0Var = ((s1) this.A.e).C;
                s1.m(x0Var);
                x0Var.F.b(e, String.valueOf(getName()).concat(" was interrupted"));
            }
        }
        try {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            while (true) {
                BlockingQueue blockingQueue = this.y;
                n1 n1Var = (n1) blockingQueue.poll();
                if (n1Var != null) {
                    Process.setThreadPriority(true != n1Var.y ? 10 : threadPriority);
                    n1Var.run();
                } else {
                    Object obj = this.e;
                    synchronized (obj) {
                        if (blockingQueue.peek() == null) {
                            this.A.getClass();
                            try {
                                obj.wait(30000L);
                            } catch (InterruptedException e2) {
                                x0 x0Var2 = ((s1) this.A.e).C;
                                s1.m(x0Var2);
                                x0Var2.F.b(e2, String.valueOf(getName()).concat(" was interrupted"));
                            }
                        }
                    }
                    synchronized (this.A.F) {
                        if (this.y.peek() == null) {
                            a();
                            a();
                            return;
                        }
                    }
                }
            }
        } catch (Throwable th) {
            a();
            throw th;
        }
    }
}
