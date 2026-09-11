package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b0 extends com.google.android.gms.internal.base.b {
    public e e;
    public final int f;

    public b0(e eVar, int i) {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
        this.e = eVar;
        this.f = i;
    }

    @Override // com.google.android.gms.internal.base.b
    public final boolean G(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            int i2 = parcel.readInt();
            IBinder strongBinder = parcel.readStrongBinder();
            Bundle bundle = (Bundle) com.google.android.gms.internal.common.g.a(parcel, Bundle.CREATOR);
            com.google.android.gms.internal.common.g.c(parcel);
            x.h(this.e, "onPostInitComplete can be called only once per call to getRemoteService");
            e eVar = this.e;
            int i3 = this.f;
            eVar.getClass();
            d0 d0Var = new d0(eVar, i2, strongBinder, bundle);
            a0 a0Var = eVar.C;
            a0Var.sendMessage(a0Var.obtainMessage(1, i3, -1, d0Var));
            this.e = null;
        } else if (i == 2) {
            parcel.readInt();
            com.google.android.gms.internal.common.g.c(parcel);
            Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
        } else {
            if (i != 3) {
                return false;
            }
            int i4 = parcel.readInt();
            IBinder strongBinder2 = parcel.readStrongBinder();
            f0 f0Var = (f0) com.google.android.gms.internal.common.g.a(parcel, f0.CREATOR);
            com.google.android.gms.internal.common.g.c(parcel);
            e eVar2 = this.e;
            x.h(eVar2, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
            x.g(f0Var);
            eVar2.S = f0Var;
            Bundle bundle2 = f0Var.e;
            x.h(this.e, "onPostInitComplete can be called only once per call to getRemoteService");
            e eVar3 = this.e;
            int i5 = this.f;
            eVar3.getClass();
            d0 d0Var2 = new d0(eVar3, i4, strongBinder2, bundle2);
            a0 a0Var2 = eVar3.C;
            a0Var2.sendMessage(a0Var2.obtainMessage(1, i5, -1, d0Var2));
            this.e = null;
        }
        parcel2.writeNoException();
        return true;
    }
}
