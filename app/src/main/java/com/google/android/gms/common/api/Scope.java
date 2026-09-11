package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.room.r;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.x;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class Scope extends com.google.android.gms.common.internal.safeparcel.a implements ReflectedParcelable {
    public static final Parcelable.Creator<Scope> CREATOR = new android.support.v4.media.a(13);
    public final int e;
    public final String y;

    public Scope(int i, String str) {
        x.e(str, "scopeUri must not be null or empty");
        this.e = i;
        this.y = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.y.equals(((Scope) obj).y);
    }

    public final int hashCode() {
        return this.y.hashCode();
    }

    public final String toString() {
        return this.y;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iH = r.H(parcel, 20293);
        r.G(parcel, 1, 4);
        parcel.writeInt(this.e);
        r.D(parcel, 2, this.y);
        r.I(parcel, iH);
    }
}
