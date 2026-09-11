package com.google.common.util.concurrent;

import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 extends com.google.common.collect.q implements ScheduledFuture, ListenableFuture, Future {
    public final r y;
    public final ScheduledFuture z;

    public u0(r rVar, ScheduledFuture scheduledFuture) {
        this.y = rVar;
        this.z = scheduledFuture;
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void a(Runnable runnable, Executor executor) {
        this.y.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean zX = x(z);
        if (zX) {
            this.z.cancel(z);
        }
        return zX;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.z.compareTo(delayed);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.y.get();
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.z.getDelay(timeUnit);
    }

    @Override // com.google.common.collect.q
    public final Object h() {
        return this.y;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.y.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.y.isDone();
    }

    public final boolean x(boolean z) {
        return this.y.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.y.get(j, timeUnit);
    }
}
