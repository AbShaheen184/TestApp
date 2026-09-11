package com.google.firebase.crashlytics.internal.concurrency;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.l;
import com.google.android.gms.tasks.q;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements Executor {
    public final ExecutorService e;
    public final Object y = new Object();
    public q z = kotlin.math.a.t(null);

    public b(ExecutorService executorService) {
        this.e = executorService;
    }

    public final q a(Runnable runnable) {
        q qVarD;
        synchronized (this.y) {
            qVarD = this.z.d(this.e, new l(runnable, 7));
            this.z = qVarD;
        }
        return qVarD;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.e.execute(runnable);
    }
}
