package com.google.android.gms.common.api.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.util.Log;
import com.google.android.gms.internal.measurement.ad;
import com.google.firebase.messaging.FirebaseMessaging;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class o extends BroadcastReceiver {
    public final /* synthetic */ int a = 1;
    public Context b;
    public Object c;

    public o(coil3.memory.c cVar) {
        this.c = cVar;
    }

    public void a() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        IntentFilter intentFilter = new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE");
        ad adVar = (ad) this.c;
        if (adVar != null) {
            Context context = ((FirebaseMessaging) adVar.A).b;
            this.b = context;
            context.registerReceiver(this, intentFilter);
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        switch (this.a) {
            case 0:
                Uri data = intent.getData();
                if ("com.google.android.gms".equals(data != null ? data.getSchemeSpecificPart() : null)) {
                    Object obj = ((coil3.memory.c) this.c).z;
                    throw null;
                }
                return;
            default:
                ad adVar = (ad) this.c;
                if (adVar != null && adVar.a()) {
                    if (Log.isLoggable("FirebaseMessaging", 3)) {
                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    ad adVar2 = (ad) this.c;
                    ((FirebaseMessaging) adVar2.A).getClass();
                    FirebaseMessaging.b(0L, adVar2);
                    Context context2 = this.b;
                    if (context2 != null) {
                        context2.unregisterReceiver(this);
                    }
                    this.c = null;
                    return;
                }
                return;
        }
    }

    public /* synthetic */ o() {
    }
}
