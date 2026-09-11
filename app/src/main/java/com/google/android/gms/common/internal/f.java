package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends com.google.android.gms.common.internal.safeparcel.a {
    public static final Parcelable.Creator<f> CREATOR = new android.support.v4.media.a(21);
    public final int[] A;
    public final int B;
    public final int[] C;
    public final l e;
    public final boolean y;
    public final boolean z;

    public f(l lVar, boolean z, boolean z2, int[] iArr, int i, int[] iArr2) {
        this.e = lVar;
        this.y = z;
        this.z = z2;
        this.A = iArr;
        this.B = i;
        this.C = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iH = androidx.room.r.H(parcel, 20293);
        androidx.room.r.C(parcel, 1, this.e, i);
        androidx.room.r.G(parcel, 2, 4);
        parcel.writeInt(this.y ? 1 : 0);
        androidx.room.r.G(parcel, 3, 4);
        parcel.writeInt(this.z ? 1 : 0);
        androidx.room.r.B(parcel, 4, this.A);
        androidx.room.r.G(parcel, 5, 4);
        parcel.writeInt(this.B);
        androidx.room.r.B(parcel, 6, this.C);
        androidx.room.r.I(parcel, iH);
    }
}
