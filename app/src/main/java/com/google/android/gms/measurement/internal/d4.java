package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d4 extends com.google.android.gms.common.internal.safeparcel.a {
    public static final Parcelable.Creator<d4> CREATOR = new v(2);
    public final Bundle A;
    public final int B;
    public final long C;
    public String D;
    public final long e;
    public byte[] y;
    public final String z;

    public d4(long j, byte[] bArr, String str, Bundle bundle, int i, long j2, String str2) {
        this.e = j;
        this.y = bArr;
        this.z = str;
        this.A = bundle;
        this.B = i;
        this.C = j2;
        this.D = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iH = androidx.room.r.H(parcel, 20293);
        androidx.room.r.G(parcel, 1, 8);
        parcel.writeLong(this.e);
        androidx.room.r.y(parcel, 2, this.y);
        androidx.room.r.D(parcel, 3, this.z);
        androidx.room.r.x(parcel, 4, this.A);
        androidx.room.r.G(parcel, 5, 4);
        parcel.writeInt(this.B);
        androidx.room.r.G(parcel, 6, 8);
        parcel.writeLong(this.C);
        androidx.room.r.D(parcel, 7, this.D);
        androidx.room.r.I(parcel, iH);
    }
}
