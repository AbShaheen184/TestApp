package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import android.os.PowerManager;
import android.util.Log;
import android.util.SparseArray;
import androidx.media3.exoplayer.dash.manifest.t;
import com.google.android.gms.measurement.internal.l4;
import com.google.android.gms.measurement.internal.r3;
import com.google.android.gms.measurement.internal.s1;
import com.google.android.gms.measurement.internal.x0;
import com.google.android.gms.measurement.internal.z1;
import com.google.common.util.concurrent.l0;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class AppMeasurementService extends Service implements r3 {
    public t e;

    @Override // com.google.android.gms.measurement.internal.r3
    public final boolean a(int i) {
        return stopSelfResult(i);
    }

    @Override // com.google.android.gms.measurement.internal.r3
    public final void b(Intent intent) {
        SparseArray sparseArray = androidx.legacy.content.a.a;
        int intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra == 0) {
            return;
        }
        SparseArray sparseArray2 = androidx.legacy.content.a.a;
        synchronized (sparseArray2) {
            try {
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) sparseArray2.get(intExtra);
                if (wakeLock != null) {
                    wakeLock.release();
                    sparseArray2.remove(intExtra);
                } else {
                    Log.w("WakefulBroadcastReceiv.", "No active wake lock id #" + intExtra);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.r3
    public final void c(JobParameters jobParameters) {
        throw new UnsupportedOperationException();
    }

    public final t d() {
        if (this.e == null) {
            this.e = new t(this, 25);
        }
        return this.e;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        t tVarD = d();
        tVarD.getClass();
        if (intent == null) {
            Log.e("FA", "onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new z1(l4.C((Service) tVarD.y));
        }
        Log.w("FA", "onBind received unknown action: ".concat(String.valueOf(action)));
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        Log.v("FA", ((Service) d().y).getClass().getSimpleName().concat(" is starting up."));
    }

    @Override // android.app.Service
    public final void onDestroy() {
        Log.v("FA", ((Service) d().y).getClass().getSimpleName().concat(" is shutting down."));
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        d();
        if (intent == null) {
            Log.e("FA", "onRebind called with null intent");
        } else {
            Log.v("FA", "onRebind called. action: ".concat(String.valueOf(intent.getAction())));
        }
    }

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i, final int i2) {
        final t tVarD = d();
        if (intent == null) {
            tVarD.getClass();
            Log.w("FA", "AppMeasurementService started with null intent");
            return 2;
        }
        Service service = (Service) tVarD.y;
        final x0 x0Var = s1.s(service, null, null, null).C;
        s1.m(x0Var);
        String action = intent.getAction();
        x0Var.K.c(Integer.valueOf(i2), action, "Local AppMeasurementService called. startId, action");
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            return 2;
        }
        Runnable runnable = new Runnable() { // from class: com.google.android.gms.measurement.internal.s3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                Service service2 = (Service) tVarD.y;
                r3 r3Var = (r3) service2;
                int i3 = i2;
                if (r3Var.a(i3)) {
                    x0Var.K.b(Integer.valueOf(i3), "Local AppMeasurementService processed last upload request. StartId");
                    x0 x0Var2 = s1.s(service2, null, null, null).C;
                    s1.m(x0Var2);
                    x0Var2.K.a("Completed wakeful intent.");
                    r3Var.b(intent);
                }
            }
        };
        l4 l4VarC = l4.C(service);
        l4VarC.e().E(new l0(tVarD, l4VarC, runnable));
        return 2;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        d();
        if (intent == null) {
            Log.e("FA", "onUnbind called with null intent");
            return true;
        }
        Log.v("FA", "onUnbind called for intent. action: ".concat(String.valueOf(intent.getAction())));
        return true;
    }
}
