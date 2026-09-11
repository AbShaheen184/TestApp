package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import androidx.appcompat.widget.c2;
import androidx.media3.ui.c0;
import com.appsalt.internal.j0;
import com.google.android.datatransport.runtime.r;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class JobInfoSchedulerService extends JobService {
    public static final /* synthetic */ int e = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        r.b(getApplicationContext());
        c2 c2VarA = com.google.android.datatransport.runtime.i.a();
        c2VarA.Y(string);
        c2VarA.A = com.google.android.datatransport.runtime.util.a.b(i);
        if (string2 != null) {
            c2VarA.z = Base64.decode(string2, 0);
        }
        j0 j0Var = r.a().d;
        ((Executor) j0Var.e).execute(new e(j0Var, c2VarA.q(), i2, new c0(2, this, jobParameters)));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
