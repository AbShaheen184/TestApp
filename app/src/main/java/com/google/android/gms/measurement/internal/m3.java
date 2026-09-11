package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class m3 implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ o3 y;

    public /* synthetic */ m3(o3 o3Var, int i) {
        this.e = i;
        this.y = o3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                this.y.B();
                break;
            case 1:
                o3 o3Var = this.y;
                s1 s1Var = (s1) o3Var.e;
                k0 k0Var = o3Var.A;
                if (k0Var == null) {
                    x0 x0Var = s1Var.C;
                    s1.m(x0Var);
                    x0Var.C.a("Failed to send Dma consent settings to service");
                } else {
                    try {
                        k0Var.r(o3Var.L(false));
                        o3Var.I();
                    } catch (RemoteException e) {
                        x0 x0Var2 = s1Var.C;
                        s1.m(x0Var2);
                        x0Var2.C.b(e, "Failed to send Dma consent settings to the service");
                        return;
                    }
                }
                break;
            default:
                o3 o3Var2 = this.y;
                s1 s1Var2 = (s1) o3Var2.e;
                k0 k0Var2 = o3Var2.A;
                if (k0Var2 == null) {
                    x0 x0Var3 = s1Var2.C;
                    s1.m(x0Var3);
                    x0Var3.C.a("Failed to send storage consent settings to service");
                } else {
                    try {
                        k0Var2.o(o3Var2.L(false));
                        o3Var2.I();
                    } catch (RemoteException e2) {
                        x0 x0Var4 = s1Var2.C;
                        s1.m(x0Var4);
                        x0Var4.C.b(e2, "Failed to send storage consent settings to the service");
                    }
                }
                break;
        }
    }
}
