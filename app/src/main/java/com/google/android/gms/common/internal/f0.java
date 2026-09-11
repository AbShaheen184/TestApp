package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f0 extends com.google.android.gms.common.internal.safeparcel.a {
    public static final Parcelable.Creator<f0> CREATOR = new android.support.v4.media.a(20);
    public f A;
    public Bundle e;
    public com.google.android.gms.common.d[] y;
    public int z;

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iH = androidx.room.r.H(parcel, 20293);
        androidx.room.r.x(parcel, 1, this.e);
        androidx.room.r.E(parcel, 2, this.y, i);
        int i2 = this.z;
        androidx.room.r.G(parcel, 3, 4);
        parcel.writeInt(i2);
        androidx.room.r.C(parcel, 4, this.A, i);
        androidx.room.r.I(parcel, iH);
    }
}
