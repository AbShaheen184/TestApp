package com.google.firebase.crashlytics.internal.concurrency;

import android.util.Log;
import androidx.compose.foundation.r0;
import java.util.concurrent.ExecutorService;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d {
    public static final c d = new c();
    public final b a;
    public final b b;
    public final b c;

    public d(ExecutorService executorService, ExecutorService executorService2) {
        executorService.getClass();
        executorService2.getClass();
        this.a = new b(executorService);
        this.b = new b(executorService);
        kotlin.math.a.t(null);
        this.c = new b(executorService2);
    }

    public static final void a() {
        if (((Boolean) new r0(0, d, c.class, "isBackgroundThread", "isBackgroundThread()Z", 0, 12).invoke()).booleanValue()) {
            return;
        }
        String str = "Must be called on a background thread, was called on " + Thread.currentThread().getName() + '.';
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
    }

    public static final void b() {
        if (((Boolean) new r0(0, d, c.class, "isBlockingThread", "isBlockingThread()Z", 0, 13).invoke()).booleanValue()) {
            return;
        }
        String str = "Must be called on a blocking thread, was called on " + Thread.currentThread().getName() + '.';
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", str, null);
        }
    }
}
