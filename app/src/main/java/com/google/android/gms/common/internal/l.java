package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class l extends com.google.android.gms.common.internal.safeparcel.a {
    public static final Parcelable.Creator<l> CREATOR = new android.support.v4.media.a(19);
    public final int A;
    public final int B;
    public final int e;
    public final boolean y;
    public final boolean z;

    public l(int i, boolean z, boolean z2, int i2, int i3) {
        this.e = i;
        this.y = z;
        this.z = z2;
        this.A = i2;
        this.B = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iH = androidx.room.r.H(parcel, 20293);
        androidx.room.r.G(parcel, 1, 4);
        parcel.writeInt(this.e);
        androidx.room.r.G(parcel, 2, 4);
        parcel.writeInt(this.y ? 1 : 0);
        androidx.room.r.G(parcel, 3, 4);
        parcel.writeInt(this.z ? 1 : 0);
        androidx.room.r.G(parcel, 4, 4);
        parcel.writeInt(this.A);
        androidx.room.r.G(parcel, 5, 4);
        parcel.writeInt(this.B);
        androidx.room.r.I(parcel, iH);
    }
}
