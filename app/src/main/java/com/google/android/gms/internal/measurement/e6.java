package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e6 extends com.google.android.gms.internal.base.a implements f6 {
    public e6(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy", 2);
    }

    @Override // com.google.android.gms.internal.measurement.f6
    public final int b() {
        Parcel parcelG = g(h(), 2);
        int i = parcelG.readInt();
        parcelG.recycle();
        return i;
    }

    @Override // com.google.android.gms.internal.measurement.f6
    public final void f(String str, String str2, Bundle bundle, long j) {
        Parcel parcelH = h();
        parcelH.writeString(str);
        parcelH.writeString(str2);
        o5.b(parcelH, bundle);
        parcelH.writeLong(j);
        G(parcelH, 1);
    }
}
