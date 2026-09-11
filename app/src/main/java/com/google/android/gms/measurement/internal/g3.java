package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.measurement.b6;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class g3 implements Runnable {
    public final /* synthetic */ t4 A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ o3 C;
    public final /* synthetic */ Object D;
    public final /* synthetic */ int e = 0;
    public final /* synthetic */ String y;
    public final /* synthetic */ String z;

    public g3(o3 o3Var, String str, String str2, t4 t4Var, boolean z, b6 b6Var) {
        this.y = str;
        this.z = str2;
        this.A = t4Var;
        this.B = z;
        this.D = b6Var;
        this.C = o3Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        r4 r4Var;
        AtomicReference atomicReference;
        switch (this.e) {
            case 0:
                String str = this.z;
                String str2 = this.y;
                b6 b6Var = (b6) this.D;
                o3 o3Var = this.C;
                Bundle bundle = new Bundle();
                try {
                    try {
                        k0 k0Var = o3Var.A;
                        s1 s1Var = (s1) o3Var.e;
                        if (k0Var == null) {
                            x0 x0Var = s1Var.C;
                            s1.m(x0Var);
                            x0Var.C.c(str2, str, "Failed to get user properties; not connected to service");
                            r4Var = s1Var.F;
                            s1.k(r4Var);
                            r4Var.o0(b6Var, bundle);
                            return;
                        }
                        List<o4> listB = k0Var.B(str2, str, this.B, this.A);
                        Bundle bundle2 = new Bundle();
                        if (listB != null) {
                            for (o4 o4Var : listB) {
                                String str3 = o4Var.B;
                                String str4 = o4Var.y;
                                if (str3 != null) {
                                    bundle2.putString(str4, str3);
                                } else {
                                    Long l = o4Var.A;
                                    if (l != null) {
                                        bundle2.putLong(str4, l.longValue());
                                    } else {
                                        Double d = o4Var.D;
                                        if (d != null) {
                                            bundle2.putDouble(str4, d.doubleValue());
                                        }
                                    }
                                }
                            }
                        }
                        try {
                            o3Var.I();
                            r4 r4Var2 = s1Var.F;
                            s1.k(r4Var2);
                            r4Var2.o0(b6Var, bundle2);
                            return;
                        } catch (RemoteException e) {
                            e = e;
                            bundle = bundle2;
                            x0 x0Var2 = ((s1) o3Var.e).C;
                            s1.m(x0Var2);
                            x0Var2.C.c(str2, e, "Failed to get user properties; remote exception");
                            r4Var = ((s1) o3Var.e).F;
                            s1.k(r4Var);
                            r4Var.o0(b6Var, bundle);
                            return;
                        } catch (Throwable th) {
                            th = th;
                            bundle = bundle2;
                            r4 r4Var3 = ((s1) o3Var.e).F;
                            s1.k(r4Var3);
                            r4Var3.o0(b6Var, bundle);
                            throw th;
                        }
                    } catch (RemoteException e2) {
                        e = e2;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
                break;
            default:
                AtomicReference atomicReference2 = (AtomicReference) this.D;
                synchronized (atomicReference2) {
                    try {
                        try {
                            o3 o3Var2 = this.C;
                            k0 k0Var2 = o3Var2.A;
                            if (k0Var2 == null) {
                                x0 x0Var3 = ((s1) o3Var2.e).C;
                                s1.m(x0Var3);
                                x0Var3.C.d("(legacy) Failed to get user properties; not connected to service", null, this.y, this.z);
                                atomicReference2.set(Collections.EMPTY_LIST);
                                atomicReference2.notify();
                                return;
                            }
                            if (TextUtils.isEmpty(null)) {
                                atomicReference2.set(k0Var2.B(this.y, this.z, this.B, this.A));
                            } else {
                                atomicReference2.set(k0Var2.e(null, this.y, this.z, this.B));
                            }
                            o3Var2.I();
                            atomicReference = (AtomicReference) this.D;
                            atomicReference.notify();
                            return;
                        } catch (RemoteException e3) {
                            x0 x0Var4 = ((s1) this.C.e).C;
                            s1.m(x0Var4);
                            x0Var4.C.d("(legacy) Failed to get user properties; remote exception", null, this.y, e3);
                            ((AtomicReference) this.D).set(Collections.EMPTY_LIST);
                            atomicReference = (AtomicReference) this.D;
                        }
                    } catch (Throwable th3) {
                        ((AtomicReference) this.D).notify();
                        throw th3;
                    }
                }
                break;
        }
    }

    public g3(o3 o3Var, AtomicReference atomicReference, String str, String str2, t4 t4Var, boolean z) {
        this.D = atomicReference;
        this.y = str;
        this.z = str2;
        this.A = t4Var;
        this.B = z;
        this.C = o3Var;
    }
}
