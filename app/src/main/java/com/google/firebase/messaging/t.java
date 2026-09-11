package com.google.firebase.messaging;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.util.Log;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class t extends BroadcastReceiver {
    public u a;
    public final /* synthetic */ u b;

    public t(u uVar, u uVar2) {
        this.b = uVar;
        this.a = uVar2;
    }

    public final void a() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        this.b.e.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    @Override // android.content.BroadcastReceiver
    public final synchronized void onReceive(Context context, Intent intent) {
        try {
            u uVar = this.a;
            if (uVar == null) {
                return;
            }
            if (uVar.d()) {
                if (Log.isLoggable("FirebaseMessaging", 3)) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                u uVar2 = this.a;
                uVar2.A.f.schedule(uVar2, 0L, TimeUnit.SECONDS);
                context.unregisterReceiver(this);
                this.a = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
