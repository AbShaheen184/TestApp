package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.measurement.internal.v;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends com.google.android.gms.common.internal.safeparcel.a {
    public static final Parcelable.Creator<e> CREATOR = new v(9);
    public final int e;
    public final com.google.android.gms.common.b y;
    public final r z;

    public e(int i, com.google.android.gms.common.b bVar, r rVar) {
        this.e = i;
        this.y = bVar;
        this.z = rVar;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iH = androidx.room.r.H(parcel, 20293);
        androidx.room.r.G(parcel, 1, 4);
        parcel.writeInt(this.e);
        androidx.room.r.C(parcel, 2, this.y, i);
        androidx.room.r.C(parcel, 3, this.z, i);
        androidx.room.r.I(parcel, iH);
    }
}
