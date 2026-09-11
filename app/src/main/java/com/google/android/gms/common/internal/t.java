package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class t implements IInterface {
    public final IBinder d;

    public t(IBinder iBinder) {
        this.d = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.d;
    }

    public final void d(b0 b0Var, g gVar) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            parcelObtain.writeStrongBinder(b0Var);
            parcelObtain.writeInt(1);
            android.support.v4.media.a.a(gVar, parcelObtain, 0);
            this.d.transact(46, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
