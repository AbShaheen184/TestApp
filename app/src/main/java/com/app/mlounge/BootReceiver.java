package com.app.mlounge;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class BootReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        Log.d("BootReceiver", "Received boot broadcast: " + intent.getAction());
        if (kotlin.jvm.internal.l.a(intent.getAction(), "android.intent.action.BOOT_COMPLETED") || kotlin.jvm.internal.l.a(intent.getAction(), "android.intent.action.QUICKBOOT_POWERON")) {
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            com.app.mlounge.util.c.e((Application) applicationContext);
        }
    }
}
