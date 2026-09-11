package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class j6 extends com.google.android.gms.common.internal.safeparcel.a {
    public static final Parcelable.Creator<j6> CREATOR = new k6(0);
    public final Bundle A;
    public final String B;
    public final long e;
    public final long y;
    public final boolean z;

    public j6(long j, long j2, boolean z, Bundle bundle, String str) {
        this.e = j;
        this.y = j2;
        this.z = z;
        this.A = bundle;
        this.B = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iH = androidx.room.r.H(parcel, 20293);
        androidx.room.r.G(parcel, 1, 8);
        parcel.writeLong(this.e);
        androidx.room.r.G(parcel, 2, 8);
        parcel.writeLong(this.y);
        androidx.room.r.G(parcel, 3, 4);
        parcel.writeInt(this.z ? 1 : 0);
        androidx.room.r.x(parcel, 7, this.A);
        androidx.room.r.D(parcel, 8, this.B);
        androidx.room.r.I(parcel, iH);
    }
}
