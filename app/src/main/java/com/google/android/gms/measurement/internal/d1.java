package com.google.android.gms.measurement.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d1 extends BroadcastReceiver {
    public final l4 a;
    public boolean b;
    public boolean c;

    public d1(l4 l4Var) {
        com.google.android.gms.common.internal.x.g(l4Var);
        this.a = l4Var;
    }

    public final void a() {
        l4 l4Var = this.a;
        l4Var.m0();
        l4Var.e().v();
        l4Var.e().v();
        if (this.b) {
            l4Var.b().K.a("Unregistering connectivity change receiver");
            this.b = false;
            this.c = false;
            try {
                l4Var.I.e.unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                l4Var.b().C.b(e, "Failed to unregister the network broadcast receiver");
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        l4 l4Var = this.a;
        l4Var.m0();
        String action = intent.getAction();
        l4Var.b().K.b(action, "NetworkBroadcastReceiver received action");
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            l4Var.b().F.b(action, "NetworkBroadcastReceiver received unknown action");
            return;
        }
        b1 b1Var = l4Var.y;
        l4.U(b1Var);
        boolean z = b1Var.z();
        if (this.c != z) {
            this.c = z;
            l4Var.e().E(new androidx.appcompat.widget.z0(this, z));
        }
    }
}
