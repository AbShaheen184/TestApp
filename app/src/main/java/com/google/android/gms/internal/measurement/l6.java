package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class l6 extends com.google.android.gms.common.internal.safeparcel.a {
    public static final Parcelable.Creator<l6> CREATOR = new k6(1);
    public final int e;
    public final String y;
    public final Intent z;

    public l6(int i, String str, Intent intent) {
        this.e = i;
        this.y = str;
        this.z = intent;
    }

    public static l6 d(Activity activity) {
        return new l6(activity.hashCode(), activity.getClass().getCanonicalName(), activity.getIntent());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l6)) {
            return false;
        }
        l6 l6Var = (l6) obj;
        return this.e == l6Var.e && Objects.equals(this.y, l6Var.y) && Objects.equals(this.z, l6Var.z);
    }

    public final int hashCode() {
        return this.e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iH = androidx.room.r.H(parcel, 20293);
        androidx.room.r.G(parcel, 1, 4);
        parcel.writeInt(this.e);
        androidx.room.r.D(parcel, 2, this.y);
        androidx.room.r.C(parcel, 3, this.z, i);
        androidx.room.r.I(parcel, iH);
    }
}
