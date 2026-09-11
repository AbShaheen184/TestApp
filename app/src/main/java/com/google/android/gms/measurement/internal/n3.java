package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class n3 implements ServiceConnection, com.google.android.gms.common.internal.b, com.google.android.gms.common.internal.c {
    public volatile boolean e;
    public volatile t0 y;
    public final /* synthetic */ o3 z;

    public n3(o3 o3Var) {
        this.z = o3Var;
    }

    @Override // com.google.android.gms.common.internal.c
    public final void d(com.google.android.gms.common.b bVar) {
        o3 o3Var = this.z;
        p1 p1Var = ((s1) o3Var.e).D;
        s1.m(p1Var);
        p1Var.A();
        x0 x0Var = ((s1) o3Var.e).C;
        if (x0Var == null || !x0Var.y) {
            x0Var = null;
        }
        if (x0Var != null) {
            x0Var.K.b(bVar, "Service connection failed");
        }
        synchronized (this) {
            this.e = false;
            this.y = null;
        }
        p1 p1Var2 = ((s1) this.z.e).D;
        s1.m(p1Var2);
        p1Var2.E(new com.google.common.util.concurrent.l0(20, this, bVar, false));
    }

    @Override // com.google.android.gms.common.internal.b
    public final void g(int i) {
        s1 s1Var = (s1) this.z.e;
        p1 p1Var = s1Var.D;
        s1.m(p1Var);
        p1Var.A();
        x0 x0Var = s1Var.C;
        s1.m(x0Var);
        x0Var.J.a("Service connection suspended");
        p1 p1Var2 = s1Var.D;
        s1.m(p1Var2);
        p1Var2.E(new androidx.appcompat.widget.z0(this, 19));
    }

    @Override // com.google.android.gms.common.internal.b
    public final void h() {
        p1 p1Var = ((s1) this.z.e).D;
        s1.m(p1Var);
        p1Var.A();
        synchronized (this) {
            try {
                com.google.android.gms.common.internal.x.g(this.y);
                k0 k0Var = (k0) this.y.t();
                p1 p1Var2 = ((s1) this.z.e).D;
                s1.m(p1Var2);
                p1Var2.E(new l3(this, k0Var, 1));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.y = null;
                this.e = false;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        p1 p1Var = ((s1) this.z.e).D;
        s1.m(p1Var);
        p1Var.A();
        synchronized (this) {
            if (iBinder == null) {
                this.e = false;
                x0 x0Var = ((s1) this.z.e).C;
                s1.m(x0Var);
                x0Var.C.a("Service connected with null binder");
                return;
            }
            k0 i0Var = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    i0Var = iInterfaceQueryLocalInterface instanceof k0 ? (k0) iInterfaceQueryLocalInterface : new i0(iBinder);
                    x0 x0Var2 = ((s1) this.z.e).C;
                    s1.m(x0Var2);
                    x0Var2.K.a("Bound to IMeasurementService interface");
                } else {
                    x0 x0Var3 = ((s1) this.z.e).C;
                    s1.m(x0Var3);
                    x0Var3.C.b(interfaceDescriptor, "Got binder with a wrong descriptor");
                }
            } catch (RemoteException unused) {
                x0 x0Var4 = ((s1) this.z.e).C;
                s1.m(x0Var4);
                x0Var4.C.a("Service connect failed to get IMeasurementService");
            }
            if (i0Var == null) {
                this.e = false;
                try {
                    com.google.android.gms.common.stats.a aVarB = com.google.android.gms.common.stats.a.b();
                    o3 o3Var = this.z;
                    aVarB.c(((s1) o3Var.e).e, o3Var.z);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                p1 p1Var2 = ((s1) this.z.e).D;
                s1.m(p1Var2);
                p1Var2.E(new l3(this, i0Var, 0));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        s1 s1Var = (s1) this.z.e;
        p1 p1Var = s1Var.D;
        s1.m(p1Var);
        p1Var.A();
        x0 x0Var = s1Var.C;
        s1.m(x0Var);
        x0Var.J.a("Service disconnected");
        p1 p1Var2 = s1Var.D;
        s1.m(p1Var2);
        p1Var2.E(new com.google.common.util.concurrent.l0(19, this, componentName, false));
    }
}
