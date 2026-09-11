package com.google.android.gms.measurement.internal;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.os.PersistableBundle;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class z2 extends j0 {
    public JobScheduler z;

    public final int A() {
        s1 s1Var = (s1) this.e;
        w();
        v();
        if (this.z == null) {
            return 7;
        }
        Boolean boolI = s1Var.A.I("google_analytics_sgtm_upload_enabled");
        if (!(boolI == null ? false : boolI.booleanValue())) {
            return 8;
        }
        if (s1Var.r().G < 119000) {
            return 6;
        }
        if (r4.Q(s1Var.e)) {
            return !s1Var.p().C() ? 5 : 2;
        }
        return 3;
    }

    @Override // com.google.android.gms.measurement.internal.j0
    public final boolean y() {
        return true;
    }

    public final void z(long j) {
        s1 s1Var = (s1) this.e;
        w();
        v();
        JobScheduler jobScheduler = this.z;
        if (jobScheduler != null && jobScheduler.getPendingJob("measurement-client".concat(String.valueOf(s1Var.e.getPackageName())).hashCode()) != null) {
            x0 x0Var = s1Var.C;
            s1.m(x0Var);
            x0Var.K.a("[sgtm] There's an existing pending job, skip this schedule.");
            return;
        }
        int iA = A();
        if (iA != 2) {
            x0 x0Var2 = s1Var.C;
            s1.m(x0Var2);
            x0Var2.K.b(com.google.android.datatransport.runtime.backends.c.v(iA), "[sgtm] Not eligible for Scion upload");
            return;
        }
        x0 x0Var3 = s1Var.C;
        s1.m(x0Var3);
        x0Var3.K.b(Long.valueOf(j), "[sgtm] Scheduling Scion upload, millis");
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.SCION_UPLOAD");
        JobInfo jobInfoBuild = new JobInfo.Builder("measurement-client".concat(String.valueOf(s1Var.e.getPackageName())).hashCode(), new ComponentName(s1Var.e, "com.google.android.gms.measurement.AppMeasurementJobService")).setRequiredNetworkType(1).setMinimumLatency(j).setOverrideDeadline(j + j).setExtras(persistableBundle).build();
        JobScheduler jobScheduler2 = this.z;
        com.google.android.gms.common.internal.x.g(jobScheduler2);
        int iSchedule = jobScheduler2.schedule(jobInfoBuild);
        x0 x0Var4 = s1Var.C;
        s1.m(x0Var4);
        x0Var4.K.b(iSchedule == 1 ? "SUCCESS" : "FAILURE", "[sgtm] Scion upload job scheduled with result");
    }
}
