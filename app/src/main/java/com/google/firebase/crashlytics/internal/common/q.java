package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.util.Log;
import com.appsalt.internal.j0;
import com.google.common.util.concurrent.g0;
import java.io.File;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class q {
    public final Context a;
    public final com.google.android.gms.common.api.internal.m b;
    public final g0 c;
    public final long d;
    public g0 e;
    public g0 f;
    public m g;
    public final v h;
    public final com.google.firebase.crashlytics.internal.persistence.c i;
    public final com.google.firebase.crashlytics.a j;
    public final com.google.firebase.crashlytics.a k;
    public final j l;
    public final com.google.firebase.crashlytics.internal.a m;
    public final com.google.android.material.internal.b n;
    public final com.google.firebase.crashlytics.internal.concurrency.d o;

    public q(com.google.firebase.g gVar, v vVar, com.google.firebase.crashlytics.internal.a aVar, com.google.android.gms.common.api.internal.m mVar, com.google.firebase.crashlytics.a aVar2, com.google.firebase.crashlytics.a aVar3, com.google.firebase.crashlytics.internal.persistence.c cVar, j jVar, com.google.android.material.internal.b bVar, com.google.firebase.crashlytics.internal.concurrency.d dVar) {
        this.b = mVar;
        gVar.a();
        this.a = gVar.a;
        this.h = vVar;
        this.m = aVar;
        this.j = aVar2;
        this.k = aVar3;
        this.i = cVar;
        this.l = jVar;
        this.n = bVar;
        this.o = dVar;
        this.d = System.currentTimeMillis();
        this.c = new g0(6);
    }

    public final void a(j0 j0Var) {
        com.google.firebase.crashlytics.internal.concurrency.d.a();
        com.google.firebase.crashlytics.internal.concurrency.d.a();
        this.e.o();
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Initialization marker file was created.", null);
        }
        try {
            try {
                this.j.b(new p(this));
                this.g.g();
                if (!j0Var.b().b.a) {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Collection of crash reports disabled in Crashlytics settings.", null);
                    }
                    throw new RuntimeException("Collection of crash reports disabled in Crashlytics settings.");
                }
                if (!this.g.d(j0Var)) {
                    Log.w("FirebaseCrashlytics", "Previous sessions could not be finalized.", null);
                }
                this.g.h(((com.google.android.gms.tasks.j) ((AtomicReference) j0Var.i).get()).a);
                c();
            } catch (Exception e) {
                Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during asynchronous initialization.", e);
                c();
            }
        } catch (Throwable th) {
            c();
            throw th;
        }
    }

    public final void b(j0 j0Var) {
        Future<?> futureSubmit = this.o.a.e.submit(new n(this, j0Var, 1));
        if (Log.isLoggable("FirebaseCrashlytics", 3)) {
            Log.d("FirebaseCrashlytics", "Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.", null);
        }
        try {
            futureSubmit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            Log.e("FirebaseCrashlytics", "Crashlytics was interrupted during initialization.", e);
            Thread.currentThread().interrupt();
        } catch (ExecutionException e2) {
            Log.e("FirebaseCrashlytics", "Crashlytics encountered a problem during initialization.", e2);
        } catch (TimeoutException e3) {
            Log.e("FirebaseCrashlytics", "Crashlytics timed out during initialization.", e3);
        }
    }

    public final void c() {
        com.google.firebase.crashlytics.internal.concurrency.d.a();
        try {
            g0 g0Var = this.e;
            com.google.firebase.crashlytics.internal.persistence.c cVar = (com.google.firebase.crashlytics.internal.persistence.c) g0Var.z;
            String str = (String) g0Var.y;
            cVar.getClass();
            if (new File((File) cVar.c, str).delete()) {
                return;
            }
            Log.w("FirebaseCrashlytics", "Initialization marker file was not properly removed.", null);
        } catch (Exception e) {
            Log.e("FirebaseCrashlytics", "Problem encountered deleting Crashlytics initialization marker.", e);
        }
    }
}
