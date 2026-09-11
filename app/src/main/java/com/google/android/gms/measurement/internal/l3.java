package com.google.android.gms.measurement.internal;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class l3 implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ k0 y;
    public final /* synthetic */ n3 z;

    public /* synthetic */ l3(n3 n3Var, k0 k0Var, int i) {
        this.e = i;
        this.y = k0Var;
        this.z = n3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                n3 n3Var = this.z;
                synchronized (n3Var) {
                    try {
                        n3Var.e = false;
                        o3 o3Var = n3Var.z;
                        if (!o3Var.M()) {
                            x0 x0Var = ((s1) o3Var.e).C;
                            s1.m(x0Var);
                            x0Var.K.a("Connected to service");
                            k0 k0Var = this.y;
                            o3Var.v();
                            o3Var.A = k0Var;
                            o3Var.I();
                            o3Var.K();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
            default:
                n3 n3Var2 = this.z;
                synchronized (n3Var2) {
                    try {
                        n3Var2.e = false;
                        o3 o3Var2 = n3Var2.z;
                        if (!o3Var2.M()) {
                            x0 x0Var2 = ((s1) o3Var2.e).C;
                            s1.m(x0Var2);
                            x0Var2.J.a("Connected to remote service");
                            k0 k0Var2 = this.y;
                            o3Var2.v();
                            o3Var2.A = k0Var2;
                            o3Var2.I();
                            o3Var2.K();
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                    break;
                }
                o3 o3Var3 = this.z.z;
                ScheduledExecutorService scheduledExecutorService = o3Var3.D;
                if (scheduledExecutorService != null) {
                    scheduledExecutorService.shutdownNow();
                    o3Var3.D = null;
                    return;
                }
                return;
        }
    }
}
