package com.google.firebase.crashlytics.internal.common;

import android.os.Looper;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class w {
    public static final ExecutorService a;

    static {
        androidx.arch.core.executor.c cVar = new androidx.arch.core.executor.c(new AtomicLong(1L));
        ThreadPoolExecutor.DiscardPolicy discardPolicy = new ThreadPoolExecutor.DiscardPolicy();
        ExecutorService executorServiceUnconfigurableExecutorService = Executors.unconfigurableExecutorService(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), cVar, discardPolicy));
        Runtime.getRuntime().addShutdownHook(new Thread(new t(executorServiceUnconfigurableExecutorService, 1), "Crashlytics Shutdown Hook for awaitEvenIfOnMainThread task continuation executor"));
        a = executorServiceUnconfigurableExecutorService;
    }

    public static void a(com.google.android.gms.tasks.q qVar) throws InterruptedException, TimeoutException {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        qVar.j(a, new com.google.android.datatransport.runtime.scheduling.jobscheduling.l(countDownLatch, 5));
        Looper mainLooper = Looper.getMainLooper();
        Looper looperMyLooper = Looper.myLooper();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        if (mainLooper == looperMyLooper) {
            countDownLatch.await(3000L, timeUnit);
        } else {
            countDownLatch.await(4000L, timeUnit);
        }
        if (qVar.h()) {
            qVar.f();
        } else {
            if (qVar.d) {
                throw new CancellationException("Task is already canceled");
            }
            if (!qVar.g()) {
                throw new TimeoutException();
            }
            throw new IllegalStateException(qVar.e());
        }
    }
}
