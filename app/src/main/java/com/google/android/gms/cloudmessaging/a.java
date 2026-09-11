package com.google.android.gms.cloudmessaging;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.room.r;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends com.google.android.gms.common.internal.safeparcel.a {
    public static final Parcelable.Creator<a> CREATOR = new c(0);
    public final Intent e;

    public a(Intent intent) {
        this.e = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iH = r.H(parcel, 20293);
        r.C(parcel, 1, this.e, i);
        r.I(parcel, iH);
    }
}
