package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class r9 extends com.google.android.gms.common.internal.safeparcel.a {
    public static final Parcelable.Creator<r9> CREATOR = new k6(4);
    public final byte[] e;

    public r9(byte[] bArr) {
        this.e = bArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iH = androidx.room.r.H(parcel, 20293);
        androidx.room.r.y(parcel, 2, this.e);
        androidx.room.r.I(parcel, iH);
    }
}
