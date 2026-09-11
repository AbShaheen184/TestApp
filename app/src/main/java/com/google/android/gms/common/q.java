package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.datastore.preferences.protobuf.h1;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends com.google.android.gms.common.internal.safeparcel.a {
    public static final Parcelable.Creator<q> CREATOR = new android.support.v4.media.a(25);
    public final int A;
    public final long B;
    public final boolean e;
    public final String y;
    public final int z;

    public q(boolean z, String str, int i, int i2, long j) {
        this.e = z;
        this.y = str;
        this.z = h1.C(i) - 1;
        this.A = coil3.network.g.E(i2) - 1;
        this.B = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iH = androidx.room.r.H(parcel, 20293);
        androidx.room.r.G(parcel, 1, 4);
        parcel.writeInt(this.e ? 1 : 0);
        androidx.room.r.D(parcel, 2, this.y);
        androidx.room.r.G(parcel, 3, 4);
        parcel.writeInt(this.z);
        androidx.room.r.G(parcel, 4, 4);
        parcel.writeInt(this.A);
        androidx.room.r.G(parcel, 5, 8);
        parcel.writeLong(this.B);
        androidx.room.r.I(parcel, iH);
    }
}
