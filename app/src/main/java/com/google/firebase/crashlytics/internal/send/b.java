package com.google.firebase.crashlytics.internal.send;

import android.os.SystemClock;
import android.util.Log;
import androidx.compose.runtime.internal.c;
import androidx.media3.exoplayer.trackselection.e;
import com.google.android.datatransport.d;
import com.google.android.gms.tasks.j;
import com.google.common.util.concurrent.g0;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b {
    public final double a;
    public final double b;
    public final long c;
    public final long d;
    public final int e;
    public final ArrayBlockingQueue f;
    public final ThreadPoolExecutor g;
    public final c h;
    public final g0 i;
    public int j;
    public long k;

    public b(c cVar, com.google.firebase.crashlytics.internal.settings.a aVar, g0 g0Var) {
        double d = aVar.d;
        double d2 = aVar.e;
        long j = ((long) aVar.f) * 1000;
        this.a = d;
        this.b = d2;
        this.c = j;
        this.h = cVar;
        this.i = g0Var;
        this.d = SystemClock.elapsedRealtime();
        int i = (int) d;
        this.e = i;
        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue(i);
        this.f = arrayBlockingQueue;
        this.g = new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, arrayBlockingQueue);
        this.j = 0;
        this.k = 0L;
    }

    public final int a() {
        if (this.k == 0) {
            this.k = System.currentTimeMillis();
        }
        int iCurrentTimeMillis = (int) ((System.currentTimeMillis() - this.k) / this.c);
        int size = this.f.size();
        int i = this.j;
        int iMin = size == this.e ? Math.min(100, i + iCurrentTimeMillis) : Math.max(0, i - iCurrentTimeMillis);
        if (this.j != iMin) {
            this.j = iMin;
            this.k = System.currentTimeMillis();
        }
        return iMin;
    }

    public final void b(com.google.firebase.crashlytics.internal.common.b bVar, j jVar) {
        String str = "Sending report through Google DataTransport: " + bVar.b;
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
        this.h.E(new com.google.android.datatransport.a(bVar.a, d.z, null), new e(this, jVar, SystemClock.elapsedRealtime() - this.d < 2000, bVar));
    }
}
