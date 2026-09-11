package com.google.android.gms.internal.measurement;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a7 {
    public static volatile a7 h;
    public final ExecutorService a;
    public final AppMeasurementSdk b;
    public final ArrayList c;
    public int d;
    public boolean e;
    public volatile z5 f;
    public volatile long g;

    public a7(Context context, Bundle bundle) {
        v6 v6Var = new v6(this);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), v6Var);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        this.a = Executors.unconfigurableExecutorService(threadPoolExecutor);
        this.b = new AppMeasurementSdk(this);
        this.c = new ArrayList();
        int i = 0;
        try {
            if (com.google.android.gms.measurement.internal.g2.b(context, com.google.android.gms.measurement.internal.g2.a(context)) != null) {
                try {
                    Class.forName("com.google.firebase.analytics.FirebaseAnalytics", false, a7.class.getClassLoader());
                } catch (ClassNotFoundException unused) {
                    this.e = true;
                    Log.w("FA", "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Add Google Analytics for Firebase to resume data collection.");
                    return;
                }
            }
        } catch (IllegalStateException unused2) {
        }
        a(new p6(this, context, bundle, i));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w("FA", "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new z6(this));
        }
    }

    public static a7 c(Context context, Bundle bundle) {
        com.google.android.gms.common.internal.x.g(context);
        if (h == null) {
            synchronized (a7.class) {
                try {
                    if (h == null) {
                        h = new a7(context, bundle == null ? new Bundle() : new Bundle(bundle));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return h;
    }

    public final void a(w6 w6Var) {
        this.a.execute(w6Var);
    }

    public final void b(Exception exc, boolean z, boolean z2) {
        this.e |= z;
        if (z) {
            Log.w("FA", "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z2) {
            a(new m6(this, exc));
        }
        Log.w("FA", "Error with data collection. Data lost.", exc);
    }

    public final long d() {
        w5 w5Var = new w5();
        a(new s6(this, w5Var, 2));
        Long l = (Long) w5.h(w5Var.g(500L), Long.class);
        if (l != null) {
            return l.longValue();
        }
        long jNextLong = new Random(System.nanoTime() ^ System.currentTimeMillis()).nextLong();
        int i = this.d + 1;
        this.d = i;
        return jNextLong + ((long) i);
    }
}
