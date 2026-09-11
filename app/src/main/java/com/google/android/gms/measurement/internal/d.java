package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends com.google.android.gms.common.internal.safeparcel.a {
    public static final Parcelable.Creator<d> CREATOR = new android.support.v4.media.a(26);
    public final long e;
    public final int y;
    public final long z;

    public d(long j, long j2, int i) {
        this.e = j;
        this.y = i;
        this.z = j2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iH = androidx.room.r.H(parcel, 20293);
        androidx.room.r.G(parcel, 1, 8);
        parcel.writeLong(this.e);
        androidx.room.r.G(parcel, 2, 4);
        parcel.writeInt(this.y);
        androidx.room.r.G(parcel, 3, 8);
        parcel.writeLong(this.z);
        androidx.room.r.I(parcel, iH);
    }
}
