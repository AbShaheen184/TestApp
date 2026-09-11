package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class j extends com.google.android.gms.common.internal.safeparcel.a {
    public static final Parcelable.Creator<j> CREATOR = new android.support.v4.media.a(16);
    public final long A;
    public final long B;
    public final String C;
    public final String D;
    public final int E;
    public final int F;
    public final int e;
    public final int y;
    public final int z;

    public j(int i, int i2, int i3, long j, long j2, String str, String str2, int i4, int i5) {
        this.e = i;
        this.y = i2;
        this.z = i3;
        this.A = j;
        this.B = j2;
        this.C = str;
        this.D = str2;
        this.E = i4;
        this.F = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iH = androidx.room.r.H(parcel, 20293);
        androidx.room.r.G(parcel, 1, 4);
        parcel.writeInt(this.e);
        androidx.room.r.G(parcel, 2, 4);
        parcel.writeInt(this.y);
        androidx.room.r.G(parcel, 3, 4);
        parcel.writeInt(this.z);
        androidx.room.r.G(parcel, 4, 8);
        parcel.writeLong(this.A);
        androidx.room.r.G(parcel, 5, 8);
        parcel.writeLong(this.B);
        androidx.room.r.D(parcel, 6, this.C);
        androidx.room.r.D(parcel, 7, this.D);
        androidx.room.r.G(parcel, 8, 4);
        parcel.writeInt(this.E);
        androidx.room.r.G(parcel, 9, 4);
        parcel.writeInt(this.F);
        androidx.room.r.I(parcel, iH);
    }
}
