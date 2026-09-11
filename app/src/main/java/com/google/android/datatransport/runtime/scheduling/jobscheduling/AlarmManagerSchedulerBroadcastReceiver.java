package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import androidx.appcompat.widget.c2;
import com.appsalt.internal.j0;
import com.google.android.datatransport.runtime.r;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
    public static final /* synthetic */ int a = 0;

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String queryParameter = intent.getData().getQueryParameter("backendName");
        String queryParameter2 = intent.getData().getQueryParameter("extras");
        int iIntValue = Integer.valueOf(intent.getData().getQueryParameter("priority")).intValue();
        int i = intent.getExtras().getInt("attemptNumber");
        r.b(context);
        c2 c2VarA = com.google.android.datatransport.runtime.i.a();
        c2VarA.Y(queryParameter);
        c2VarA.A = com.google.android.datatransport.runtime.util.a.b(iIntValue);
        if (queryParameter2 != null) {
            c2VarA.z = Base64.decode(queryParameter2, 0);
        }
        j0 j0Var = r.a().d;
        ((Executor) j0Var.e).execute(new e(j0Var, c2VarA.q(), i, new androidx.compose.ui.platform.j(2)));
    }
}
