package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f4 extends com.google.android.gms.common.internal.safeparcel.a {
    public static final Parcelable.Creator<f4> CREATOR = new v(4);
    public final List e;

    public f4(ArrayList arrayList) {
        this.e = arrayList;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iH = androidx.room.r.H(parcel, 20293);
        androidx.room.r.F(parcel, 1, this.e);
        androidx.room.r.I(parcel, iH);
    }
}
