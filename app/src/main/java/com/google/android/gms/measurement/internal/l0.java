package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class l0 extends com.google.android.gms.internal.base.a implements m0 {
    @Override // com.google.android.gms.measurement.internal.m0
    public final void A(List list) {
        Parcel parcelH = h();
        parcelH.writeTypedList(list);
        H(parcelH);
    }
}
