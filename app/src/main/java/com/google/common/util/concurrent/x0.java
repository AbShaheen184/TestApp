package com.google.common.util.concurrent;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class x0 implements Executor {
    public static final t0 C = new t0(x0.class);
    public final Executor e;
    public final ArrayDeque y = new ArrayDeque();
    public int z = 1;
    public long A = 0;
    public final com.google.android.material.behavior.d B = new com.google.android.material.behavior.d(this, 1);

    public x0(Executor executor) {
        executor.getClass();
        this.e = executor;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        runnable.getClass();
        synchronized (this.y) {
            int i = this.z;
            if (i != 4 && i != 3) {
                long j = this.A;
                com.google.android.datatransport.runtime.o oVar = new com.google.android.datatransport.runtime.o(2, runnable);
                this.y.add(oVar);
                this.z = 2;
                try {
                    this.e.execute(this.B);
                    if (this.z != 2) {
                        return;
                    }
                    synchronized (this.y) {
                        try {
                            if (this.A == j && this.z == 2) {
                                this.z = 3;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return;
                } catch (Throwable th2) {
                    synchronized (this.y) {
                        try {
                            int i2 = this.z;
                            boolean z = true;
                            if ((i2 != 1 && i2 != 2) || !this.y.removeLastOccurrence(oVar)) {
                                z = false;
                            }
                            if (!(th2 instanceof RejectedExecutionException) || z) {
                                throw th2;
                            }
                            return;
                        } catch (Throwable th3) {
                            throw th3;
                        }
                    }
                }
            }
            this.y.add(runnable);
        }
    }

    public final String toString() {
        return "SequentialExecutor@" + System.identityHashCode(this) + "{" + this.e + "}";
    }
}
