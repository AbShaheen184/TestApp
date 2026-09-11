package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.util.Log;
import androidx.core.provider.m;
import androidx.media3.exoplayer.dash.manifest.t;
import com.google.android.gms.common.internal.x;
import com.google.android.gms.internal.measurement.a7;
import com.google.android.gms.internal.measurement.m6;
import com.google.android.gms.measurement.internal.l4;
import com.google.android.gms.measurement.internal.r3;
import com.google.android.gms.measurement.internal.x0;
import com.google.android.material.shape.g;
import com.google.common.util.concurrent.l0;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
@TargetApi(24)
public final class AppMeasurementJobService extends JobService implements r3 {
    public t e;

    @Override // com.google.android.gms.measurement.internal.r3
    public final boolean a(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.measurement.internal.r3
    public final void c(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    public final t d() {
        if (this.e == null) {
            this.e = new t(this, 25);
        }
        return this.e;
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

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        t tVarD = d();
        Service service = (Service) tVarD.y;
        String string = jobParameters.getExtras().getString("action");
        Log.v("FA", "onStartJob received action: ".concat(String.valueOf(string)));
        if (Objects.equals(string, "com.google.android.gms.measurement.UPLOAD")) {
            x.g(string);
            l4 l4VarC = l4.C(service);
            x0 x0VarB = l4VarC.b();
            g gVar = l4VarC.I.z;
            x0VarB.K.b(string, "Local AppMeasurementJobService called. action");
            l4VarC.e().E(new l0(tVarD, l4VarC, new m(13, tVarD, x0VarB, jobParameters)));
        }
        if (!Objects.equals(string, "com.google.android.gms.measurement.SCION_UPLOAD")) {
            return true;
        }
        x.g(string);
        a7 a7VarC = a7.c(service, null);
        l0 l0Var = new l0(22, tVarD, jobParameters);
        a7VarC.getClass();
        a7VarC.a(new m6(a7VarC, l0Var, 2));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
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

    @Override // com.google.android.gms.measurement.internal.r3
    public final void b(Intent intent) {
    }
}
