package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class j3 implements Runnable {
    public final /* synthetic */ int e;
    public final /* synthetic */ t4 y;
    public final /* synthetic */ o3 z;

    public j3(o3 o3Var, t4 t4Var) {
        this.e = 4;
        this.y = t4Var;
        Objects.requireNonNull(o3Var);
        this.z = o3Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        switch (this.e) {
            case 0:
                o3 o3Var = this.z;
                k0 k0Var = o3Var.A;
                s1 s1Var = (s1) o3Var.e;
                if (k0Var != null) {
                    try {
                        k0Var.l(this.y);
                    } catch (RemoteException e) {
                        x0 x0Var = s1Var.C;
                        s1.m(x0Var);
                        x0Var.C.b(e, "Failed to reset data on the service: remote exception");
                    }
                    o3Var.I();
                } else {
                    x0 x0Var2 = s1Var.C;
                    s1.m(x0Var2);
                    x0Var2.C.a("Failed to reset data on the service: not connected to service");
                }
                break;
            case 1:
                o3 o3Var2 = this.z;
                k0 k0Var2 = o3Var2.A;
                s1 s1Var2 = (s1) o3Var2.e;
                if (k0Var2 == null) {
                    x0 x0Var3 = s1Var2.C;
                    s1.m(x0Var3);
                    x0Var3.C.a("Discarding data. Failed to send app launch");
                } else {
                    try {
                        t4 t4Var = this.y;
                        g gVar = s1Var2.A;
                        g0 g0Var = h0.W0;
                        if (gVar.G(null, g0Var)) {
                            o3Var2.N(k0Var2, null, t4Var);
                        }
                        k0Var2.x(t4Var);
                        s1Var2.o().A();
                        s1Var2.A.G(null, g0Var);
                        o3Var2.N(k0Var2, null, t4Var);
                        o3Var2.I();
                    } catch (RemoteException e2) {
                        x0 x0Var4 = s1Var2.C;
                        s1.m(x0Var4);
                        x0Var4.C.b(e2, "Failed to send app launch to the service");
                        return;
                    }
                }
                break;
            case 2:
                o3 o3Var3 = this.z;
                k0 k0Var3 = o3Var3.A;
                s1 s1Var3 = (s1) o3Var3.e;
                if (k0Var3 == null) {
                    x0 x0Var5 = s1Var3.C;
                    s1.m(x0Var5);
                    x0Var5.F.a("Failed to send app backgrounded");
                } else {
                    try {
                        k0Var3.z(this.y);
                        o3Var3.I();
                    } catch (RemoteException e3) {
                        x0 x0Var6 = s1Var3.C;
                        s1.m(x0Var6);
                        x0Var6.C.b(e3, "Failed to send app backgrounded to the service");
                        return;
                    }
                }
                break;
            case 3:
                o3 o3Var4 = this.z;
                k0 k0Var4 = o3Var4.A;
                s1 s1Var4 = (s1) o3Var4.e;
                if (k0Var4 == null) {
                    x0 x0Var7 = s1Var4.C;
                    s1.m(x0Var7);
                    x0Var7.C.a("Failed to send measurementEnabled to service");
                } else {
                    try {
                        k0Var4.q(this.y);
                        o3Var4.I();
                    } catch (RemoteException e4) {
                        x0 x0Var8 = s1Var4.C;
                        s1.m(x0Var8);
                        x0Var8.C.b(e4, "Failed to send measurementEnabled to the service");
                        return;
                    }
                }
                break;
            default:
                o3 o3Var5 = this.z;
                k0 k0Var5 = o3Var5.A;
                s1 s1Var5 = (s1) o3Var5.e;
                if (k0Var5 == null) {
                    x0 x0Var9 = s1Var5.C;
                    s1.m(x0Var9);
                    x0Var9.C.a("Failed to send consent settings to service");
                } else {
                    try {
                        k0Var5.F(this.y);
                        o3Var5.I();
                    } catch (RemoteException e5) {
                        x0 x0Var10 = s1Var5.C;
                        s1.m(x0Var10);
                        x0Var10.C.b(e5, "Failed to send consent settings to the service");
                    }
                }
                break;
        }
    }

    public /* synthetic */ j3(o3 o3Var, t4 t4Var, int i) {
        this.e = i;
        this.y = t4Var;
        this.z = o3Var;
    }
}
