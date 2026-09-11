package com.google.android.gms.internal.measurement;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.util.Log;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class cd extends BroadcastReceiver {
    public static volatile s5 a;

    public static void a(Context context, s5 s5Var) {
        if (a == null) {
            synchronized (cd.class) {
                try {
                    if (a == null) {
                        if (!Objects.equals(context.getPackageName(), "com.google.android.gms")) {
                            if (Build.VERSION.SDK_INT >= 33) {
                                context.registerReceiver(new cd(), new IntentFilter("com.google.android.gms.phenotype.UPDATE"), 2);
                            } else {
                                context.registerReceiver(new cd(), new IntentFilter("com.google.android.gms.phenotype.UPDATE"));
                            }
                        }
                        a = s5Var;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String stringExtra = intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME");
        if (stringExtra == null) {
            return;
        }
        if (stringExtra.contains("../") || stringExtra.contains("/..")) {
            StringBuilder sb = new StringBuilder(stringExtra.length() + 68);
            sb.append("Got an invalid config package for P/H that includes '..': ");
            sb.append(stringExtra);
            sb.append(". Exiting.");
            Log.w("PhUpdateBroadcastRecv", sb.toString());
            return;
        }
        s5 s5Var = a;
        if (s5Var == null) {
            Log.w("PhUpdateBroadcastRecv", "No callback registered for P/H UPDATE broadcast. Exiting.");
            return;
        }
        ic icVar = (ic) ((ConcurrentHashMap) ((s5) s5Var.y).y).get(stringExtra);
        if (icVar != null) {
            icVar.a.b();
        }
    }
}
