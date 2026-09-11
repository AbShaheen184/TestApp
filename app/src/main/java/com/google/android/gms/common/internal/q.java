package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class q extends com.google.android.gms.common.internal.safeparcel.a {
    public static final Parcelable.Creator<q> CREATOR = new android.support.v4.media.a(17);
    public final GoogleSignInAccount A;
    public final int e;
    public final Account y;
    public final int z;

    public q(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.e = i;
        this.y = account;
        this.z = i2;
        this.A = googleSignInAccount;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iH = androidx.room.r.H(parcel, 20293);
        androidx.room.r.G(parcel, 1, 4);
        parcel.writeInt(this.e);
        androidx.room.r.C(parcel, 2, this.y, i);
        androidx.room.r.G(parcel, 3, 4);
        parcel.writeInt(this.z);
        androidx.room.r.C(parcel, 4, this.A, i);
        androidx.room.r.I(parcel, iH);
    }
}
