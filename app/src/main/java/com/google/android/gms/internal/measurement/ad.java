package com.google.android.gms.internal.measurement;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.PowerManager;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class ad implements Runnable {
    public final Object A;
    public final /* synthetic */ int e = 0;
    public final long y;
    public final Object z;

    public ad(FirebaseMessaging firebaseMessaging, long j) {
        new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new com.google.android.gms.common.util.concurrent.a("firebase-iid-executor", 0));
        this.A = firebaseMessaging;
        this.y = j;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) firebaseMessaging.b.getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.z = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
    }

    public boolean a() {
        ConnectivityManager connectivityManager = (ConnectivityManager) ((FirebaseMessaging) this.A).b.getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public boolean b() throws IOException {
        try {
            if (((FirebaseMessaging) this.A).a() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            }
            if (!Log.isLoggable("FirebaseMessaging", 3)) {
                return true;
            }
            Log.d("FirebaseMessaging", "Token successfully retrieved");
            return true;
        } catch (IOException e) {
            String message = e.getMessage();
            if (!"SERVICE_NOT_AVAILABLE".equals(message) && !"INTERNAL_SERVER_ERROR".equals(message) && !"InternalServerError".equals(message)) {
                if (e.getMessage() != null) {
                    throw e;
                }
                Log.w("FirebaseMessaging", "Token retrieval failed without exception message. Will retry token retrieval");
                return false;
            }
            Log.w("FirebaseMessaging", "Token retrieval failed: " + e.getMessage() + ". Will retry token retrieval");
            return false;
        } catch (SecurityException unused) {
            Log.w("FirebaseMessaging", "Token retrieval failed with SecurityException. Will retry token retrieval");
            return false;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                ((vc) this.z).run();
                long j = this.y;
                TimeUnit timeUnit = TimeUnit.MINUTES;
                com.google.common.util.concurrent.w0 w0Var = (com.google.common.util.concurrent.w0) this.A;
                w0Var.getClass();
                com.google.common.util.concurrent.a1 a1Var = new com.google.common.util.concurrent.a1(Executors.callable(this, null));
                com.google.common.util.concurrent.u0 u0Var = new com.google.common.util.concurrent.u0(a1Var, w0Var.y.schedule(a1Var, j, timeUnit));
                u0Var.a(new vc(u0Var, 1), com.google.common.util.concurrent.d0.e);
                return;
            case 1:
                com.google.android.gms.measurement.internal.f3 f3Var = (com.google.android.gms.measurement.internal.f3) this.A;
                f3Var.E((com.google.android.gms.measurement.internal.c3) this.z, false, this.y);
                f3Var.B = null;
                com.google.android.gms.measurement.internal.o3 o3VarP = ((com.google.android.gms.measurement.internal.s1) f3Var.e).p();
                o3VarP.v();
                o3VarP.w();
                o3VarP.J(new com.google.common.util.concurrent.l0(o3VarP, (com.google.android.gms.measurement.internal.c3) null));
                return;
            default:
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) this.z;
                com.google.firebase.messaging.o oVarW = com.google.firebase.messaging.o.w();
                FirebaseMessaging firebaseMessaging = (FirebaseMessaging) this.A;
                if (oVarW.B(firebaseMessaging.b)) {
                    wakeLock.acquire();
                }
                try {
                    try {
                        synchronized (firebaseMessaging) {
                            firebaseMessaging.i = true;
                        }
                        if (!firebaseMessaging.h.e()) {
                            synchronized (firebaseMessaging) {
                                firebaseMessaging.i = false;
                            }
                            if (!com.google.firebase.messaging.o.w().B(firebaseMessaging.b)) {
                                return;
                            }
                        } else if (!com.google.firebase.messaging.o.w().A(firebaseMessaging.b) || a()) {
                            if (b()) {
                                synchronized (firebaseMessaging) {
                                    firebaseMessaging.i = false;
                                }
                            } else {
                                firebaseMessaging.g(this.y);
                            }
                            if (!com.google.firebase.messaging.o.w().B(firebaseMessaging.b)) {
                                return;
                            }
                        } else {
                            com.google.android.gms.common.api.internal.o oVar = new com.google.android.gms.common.api.internal.o();
                            oVar.c = this;
                            oVar.a();
                            if (!com.google.firebase.messaging.o.w().B(firebaseMessaging.b)) {
                                return;
                            }
                        }
                    } catch (IOException e) {
                        Log.e("FirebaseMessaging", "Topic sync or token retrieval failed on hard failure exceptions: " + e.getMessage() + ". Won't retry the operation.");
                        synchronized (firebaseMessaging) {
                            firebaseMessaging.i = false;
                            if (!com.google.firebase.messaging.o.w().B(firebaseMessaging.b)) {
                                return;
                            }
                        }
                    }
                    wakeLock.release();
                    return;
                } catch (Throwable th) {
                    if (com.google.firebase.messaging.o.w().B(firebaseMessaging.b)) {
                        wakeLock.release();
                    }
                    throw th;
                }
        }
    }

    public ad(com.google.android.gms.measurement.internal.f3 f3Var, com.google.android.gms.measurement.internal.c3 c3Var, long j) {
        this.z = c3Var;
        this.y = j;
        Objects.requireNonNull(f3Var);
        this.A = f3Var;
    }

    public ad(bd bdVar, vc vcVar, com.google.common.util.concurrent.w0 w0Var, long j) {
        this.z = vcVar;
        this.A = w0Var;
        this.y = j;
    }
}
