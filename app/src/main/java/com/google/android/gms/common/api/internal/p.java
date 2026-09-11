package com.google.android.gms.common.api.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p {
    public final int a;

    public p(int i) {
        this.a = i;
    }

    public static Status g(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage(), null, null);
    }

    public abstract boolean a(k kVar);

    public abstract com.google.android.gms.common.d[] b(k kVar);

    public abstract void c(Status status);

    public abstract void d(Exception exc);

    public abstract void e(k kVar);

    public abstract void f(coil3.memory.c cVar, boolean z);
}
