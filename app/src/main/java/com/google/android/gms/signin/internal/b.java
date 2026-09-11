package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.room.r;
import com.google.android.gms.measurement.internal.v;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b extends com.google.android.gms.common.internal.safeparcel.a {
    public static final Parcelable.Creator<b> CREATOR = new v(7);
    public final int e;
    public final int y;
    public final Intent z;

    public b(int i, int i2, Intent intent) {
        this.e = i;
        this.y = i2;
        this.z = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iH = r.H(parcel, 20293);
        r.G(parcel, 1, 4);
        parcel.writeInt(this.e);
        r.G(parcel, 2, 4);
        parcel.writeInt(this.y);
        r.C(parcel, 3, this.z, i);
        r.I(parcel, iH);
    }
}
