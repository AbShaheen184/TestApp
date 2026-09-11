package com.google.android.gms.measurement.internal;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.measurement.u5;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b4 extends g4 {
    public final AlarmManager A;
    public v3 B;
    public Integer C;

    public b4(l4 l4Var) {
        super(l4Var);
        this.A = (AlarmManager) ((s1) this.e).e.getSystemService("alarm");
    }

    public final void A() {
        w();
        s1 s1Var = (s1) this.e;
        x0 x0Var = s1Var.C;
        s1.m(x0Var);
        x0Var.K.a("Unscheduling upload");
        AlarmManager alarmManager = this.A;
        if (alarmManager != null) {
            Context context = s1Var.e;
            alarmManager.cancel(PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), u5.a));
        }
        z().c();
        B();
    }

    public final void B() {
        JobScheduler jobScheduler = (JobScheduler) ((s1) this.e).e.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(C());
        }
    }

    public final int C() {
        if (this.C == null) {
            this.C = Integer.valueOf("measurement".concat(String.valueOf(((s1) this.e).e.getPackageName())).hashCode());
        }
        return this.C.intValue();
    }

    @Override // com.google.android.gms.measurement.internal.g4
    public final void y() {
        AlarmManager alarmManager = this.A;
        if (alarmManager != null) {
            Context context = ((s1) this.e).e;
            alarmManager.cancel(PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), u5.a));
        }
        B();
    }

    public final n z() {
        if (this.B == null) {
            this.B = new v3(this, this.y.I, 1);
        }
        return this.B;
    }
}
