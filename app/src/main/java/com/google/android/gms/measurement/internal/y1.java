package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.b6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class y1 implements Runnable {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ int e = 2;
    public final /* synthetic */ String y;
    public final /* synthetic */ t4 z;

    public /* synthetic */ y1(z1 z1Var, t4 t4Var, Bundle bundle, m0 m0Var, String str) {
        this.A = z1Var;
        this.z = t4Var;
        this.B = bundle;
        this.C = m0Var;
        this.y = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference;
        r4 r4Var;
        switch (this.e) {
            case 0:
                z1 z1Var = (z1) this.A;
                t4 t4Var = this.z;
                Bundle bundle = (Bundle) this.B;
                m0 m0Var = (m0) this.C;
                String str = this.y;
                l4 l4Var = z1Var.d;
                l4Var.W();
                try {
                    m0Var.A(l4Var.e0(bundle, t4Var));
                    return;
                } catch (RemoteException e) {
                    l4Var.b().C.c(str, e, "Failed to return trigger URIs for app");
                    return;
                }
            case 1:
                AtomicReference atomicReference2 = (AtomicReference) this.A;
                synchronized (atomicReference2) {
                    try {
                        try {
                            o3 o3Var = (o3) this.C;
                            k0 k0Var = o3Var.A;
                            if (k0Var == null) {
                                x0 x0Var = ((s1) o3Var.e).C;
                                s1.m(x0Var);
                                x0Var.C.d("(legacy) Failed to get conditional properties; not connected to service", null, this.y, (String) this.B);
                                atomicReference2.set(Collections.EMPTY_LIST);
                                atomicReference2.notify();
                                return;
                            }
                            if (TextUtils.isEmpty(null)) {
                                atomicReference2.set(k0Var.E(this.y, (String) this.B, this.z));
                            } else {
                                atomicReference2.set(k0Var.m(null, this.y, (String) this.B));
                            }
                            o3Var.I();
                            atomicReference = (AtomicReference) this.A;
                            atomicReference.notify();
                            return;
                        } catch (Throwable th) {
                            ((AtomicReference) this.A).notify();
                            throw th;
                        }
                    } catch (RemoteException e2) {
                        x0 x0Var2 = ((s1) ((o3) this.C).e).C;
                        s1.m(x0Var2);
                        x0Var2.C.d("(legacy) Failed to get conditional properties; remote exception", null, this.y, e2);
                        ((AtomicReference) this.A).set(Collections.EMPTY_LIST);
                        atomicReference = (AtomicReference) this.A;
                    }
                }
                break;
            default:
                b6 b6Var = (b6) this.B;
                String str2 = (String) this.A;
                String str3 = this.y;
                o3 o3Var2 = (o3) this.C;
                ArrayList arrayList = new ArrayList();
                try {
                    try {
                        k0 k0Var2 = o3Var2.A;
                        if (k0Var2 == null) {
                            s1 s1Var = (s1) o3Var2.e;
                            x0 x0Var3 = s1Var.C;
                            s1.m(x0Var3);
                            x0Var3.C.c(str3, str2, "Failed to get conditional properties; not connected to service");
                            r4Var = s1Var.F;
                        } else {
                            arrayList = r4.q0(k0Var2.E(str3, str2, this.z));
                            o3Var2.I();
                            r4Var = ((s1) o3Var2.e).F;
                        }
                    } catch (RemoteException e3) {
                        x0 x0Var4 = ((s1) o3Var2.e).C;
                        s1.m(x0Var4);
                        x0Var4.C.d("Failed to get conditional properties; remote exception", str3, str2, e3);
                    }
                    s1.k(r4Var);
                    r4Var.p0(b6Var, arrayList);
                    return;
                } catch (Throwable th2) {
                    r4 r4Var2 = ((s1) o3Var2.e).F;
                    s1.k(r4Var2);
                    r4Var2.p0(b6Var, arrayList);
                    throw th2;
                }
        }
    }

    public y1(o3 o3Var, String str, String str2, t4 t4Var, b6 b6Var) {
        this.y = str;
        this.A = str2;
        this.z = t4Var;
        this.B = b6Var;
        this.C = o3Var;
    }

    public y1(o3 o3Var, AtomicReference atomicReference, String str, String str2, t4 t4Var) {
        this.A = atomicReference;
        this.y = str;
        this.B = str2;
        this.z = t4Var;
        this.C = o3Var;
    }
}
