package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 implements ServiceConnection {
    public IBinder A;
    public final g0 B;
    public ComponentName C;
    public final /* synthetic */ i0 D;
    public final HashMap e = new HashMap();
    public int y = 2;
    public boolean z;

    public h0(i0 i0Var, g0 g0Var) {
        this.D = i0Var;
        this.B = g0Var;
    }

    public final com.google.android.gms.common.b a(String str, Executor executor) throws Throwable {
        try {
            Intent intentA = z.a(this.D.b, this.B);
            this.y = 3;
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            if (Build.VERSION.SDK_INT >= 31) {
                StrictMode.setVmPolicy(com.google.android.gms.common.util.f.a(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
            }
            try {
                i0 i0Var = this.D;
                com.google.android.gms.common.stats.a aVar = i0Var.d;
                Context context = i0Var.b;
                g0 g0Var = this.B;
                try {
                    boolean zD = aVar.d(context, str, intentA, this, 4225, executor);
                    this.z = zD;
                    if (zD) {
                        i0Var.c.sendMessageDelayed(i0Var.c.obtainMessage(1, g0Var), i0Var.f);
                        com.google.android.gms.common.b bVar = com.google.android.gms.common.b.C;
                        StrictMode.setVmPolicy(vmPolicy);
                        return bVar;
                    }
                    this.y = 2;
                    try {
                        i0Var.d.c(i0Var.b, this);
                    } catch (IllegalArgumentException unused) {
                    }
                    com.google.android.gms.common.b bVar2 = new com.google.android.gms.common.b(16, null, null);
                    StrictMode.setVmPolicy(vmPolicy);
                    return bVar2;
                } catch (Throwable th) {
                    th = th;
                    Throwable th2 = th;
                    StrictMode.setVmPolicy(vmPolicy);
                    throw th2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (y e) {
            return e.e;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        i0 i0Var = this.D;
        synchronized (i0Var.a) {
            try {
                i0Var.c.removeMessages(1, this.B);
                this.A = iBinder;
                this.C = componentName;
                Iterator it = this.e.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.y = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        i0 i0Var = this.D;
        synchronized (i0Var.a) {
            try {
                i0Var.c.removeMessages(1, this.B);
                this.A = null;
                this.C = componentName;
                Iterator it = this.e.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.y = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
