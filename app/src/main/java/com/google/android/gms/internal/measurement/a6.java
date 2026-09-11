package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a6 extends com.google.android.gms.internal.base.a implements b6 {
    public a6(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver", 2);
    }

    @Override // com.google.android.gms.internal.measurement.b6
    public final void w(Bundle bundle) {
        Parcel parcelH = h();
        o5.b(parcelH, bundle);
        G(parcelH, 1);
    }
}
