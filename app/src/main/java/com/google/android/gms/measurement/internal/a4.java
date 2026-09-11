package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a4 extends com.google.android.gms.common.internal.safeparcel.a {
    public static final Parcelable.Creator<a4> CREATOR = new v(1);
    public final String e;
    public final long y;
    public final int z;

    public a4(int i, long j, String str) {
        this.e = str;
        this.y = j;
        this.z = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iH = androidx.room.r.H(parcel, 20293);
        androidx.room.r.D(parcel, 1, this.e);
        androidx.room.r.G(parcel, 2, 8);
        parcel.writeLong(this.y);
        androidx.room.r.G(parcel, 3, 4);
        parcel.writeInt(this.z);
        androidx.room.r.I(parcel, iH);
    }
}
