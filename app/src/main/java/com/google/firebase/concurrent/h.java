package com.google.firebase.concurrent;

import com.google.android.material.shape.c0;
import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h extends androidx.concurrent.futures.h implements ScheduledFuture {
    public final ScheduledFuture E;

    public h(g gVar) {
        this.E = gVar.a(new c0(this));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.E.compareTo(delayed);
    }

    @Override // androidx.concurrent.futures.h
    public final void e() {
        ScheduledFuture scheduledFuture = this.E;
        Object obj = this.e;
        scheduledFuture.cancel((obj instanceof androidx.concurrent.futures.a) && ((androidx.concurrent.futures.a) obj).a);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.E.getDelay(timeUnit);
    }
}
