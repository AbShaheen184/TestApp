package com.google.android.gms.cloudmessaging;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c implements Parcelable.Creator {
    public final /* synthetic */ int a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                int iM = android.support.v4.media.session.b.M(parcel);
                Intent intent = null;
                while (parcel.dataPosition() < iM) {
                    int i = parcel.readInt();
                    if (((char) i) != 1) {
                        android.support.v4.media.session.b.J(parcel, i);
                    } else {
                        intent = (Intent) android.support.v4.media.session.b.o(parcel, i, Intent.CREATOR);
                    }
                }
                android.support.v4.media.session.b.t(parcel, iM);
                return new a(intent);
            default:
                return new g(parcel.readStrongBinder());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new a[i];
            default:
                return new g[i];
        }
    }
}
