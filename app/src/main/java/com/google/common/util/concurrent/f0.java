package com.google.common.util.concurrent;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends AtomicReference implements Executor, Runnable {
    public static final /* synthetic */ int B = 0;
    public Thread A;
    public g0 e;
    public Executor y;
    public Runnable z;

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (get() == e0.y) {
            this.y = null;
            this.e = null;
            return;
        }
        this.A = Thread.currentThread();
        try {
            g0 g0Var = this.e;
            Objects.requireNonNull(g0Var);
            com.google.android.datatransport.runtime.scheduling.jobscheduling.c cVar = (com.google.android.datatransport.runtime.scheduling.jobscheduling.c) g0Var.z;
            if (((Thread) cVar.y) == this.A) {
                this.e = null;
                com.google.android.material.motion.a.q(((Runnable) cVar.z) == null);
                cVar.z = runnable;
                Executor executor = this.y;
                Objects.requireNonNull(executor);
                cVar.A = executor;
                this.y = null;
            } else {
                Executor executor2 = this.y;
                Objects.requireNonNull(executor2);
                this.y = null;
                this.z = runnable;
                executor2.execute(this);
            }
        } finally {
            this.A = null;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        Executor executor;
        Thread threadCurrentThread = Thread.currentThread();
        if (threadCurrentThread != this.A) {
            Runnable runnable = this.z;
            Objects.requireNonNull(runnable);
            this.z = null;
            runnable.run();
            return;
        }
        com.google.android.datatransport.runtime.scheduling.jobscheduling.c cVar = new com.google.android.datatransport.runtime.scheduling.jobscheduling.c(14, false);
        cVar.y = threadCurrentThread;
        g0 g0Var = this.e;
        Objects.requireNonNull(g0Var);
        g0Var.z = cVar;
        this.e = null;
        try {
            Runnable runnable2 = this.z;
            Objects.requireNonNull(runnable2);
            this.z = null;
            runnable2.run();
            while (true) {
                Runnable runnable3 = (Runnable) cVar.z;
                if (runnable3 == null || (executor = (Executor) cVar.A) == null) {
                    break;
                }
                cVar.z = null;
                cVar.A = null;
                executor.execute(runnable3);
            }
            cVar.y = null;
        } catch (Throwable th) {
            cVar.y = null;
            throw th;
        }
    }
}
