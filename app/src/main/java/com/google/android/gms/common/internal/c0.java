package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c0 implements ServiceConnection {
    public final int e;
    public final /* synthetic */ e y;

    public c0(e eVar, int i) {
        this.y = eVar;
        this.e = i;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        int i;
        int i2;
        e eVar = this.y;
        if (iBinder == null) {
            synchronized (eVar.D) {
                i = eVar.K;
            }
            if (i == 3) {
                eVar.R = true;
                i2 = 5;
            } else {
                i2 = 4;
            }
            a0 a0Var = eVar.C;
            a0Var.sendMessage(a0Var.obtainMessage(i2, eVar.T.get(), 16));
            return;
        }
        synchronized (eVar.E) {
            try {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                eVar.F = (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof t)) ? new t(iBinder) : (t) iInterfaceQueryLocalInterface;
            } catch (Throwable th) {
                throw th;
            }
        }
        e eVar2 = this.y;
        int i3 = this.e;
        eVar2.getClass();
        e0 e0Var = new e0(eVar2, 0, null);
        a0 a0Var2 = eVar2.C;
        a0Var2.sendMessage(a0Var2.obtainMessage(7, i3, -1, e0Var));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        e eVar = this.y;
        synchronized (eVar.E) {
            eVar.F = null;
        }
        e eVar2 = this.y;
        int i = this.e;
        a0 a0Var = eVar2.C;
        a0Var.sendMessage(a0Var.obtainMessage(6, i, 1));
    }
}
