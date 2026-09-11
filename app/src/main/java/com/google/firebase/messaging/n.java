package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends com.google.android.gms.common.internal.safeparcel.a {
    public static final Parcelable.Creator<n> CREATOR = new com.google.android.gms.measurement.internal.v(10);
    public final Bundle e;
    public androidx.collection.f y;
    public g z;

    public n(Bundle bundle) {
        this.e = bundle;
    }

    public final Map d() {
        if (this.y == null) {
            androidx.collection.f fVar = new androidx.collection.f(0);
            Bundle bundle = this.e;
            for (String str : bundle.keySet()) {
                Object obj = bundle.get(str);
                if (obj instanceof String) {
                    String str2 = (String) obj;
                    if (!str.startsWith("google.") && !str.startsWith("gcm.") && !str.equals("from") && !str.equals("message_type") && !str.equals("collapse_key")) {
                        fVar.put(str, str2);
                    }
                }
            }
            this.y = fVar;
        }
        return this.y;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iH = androidx.room.r.H(parcel, 20293);
        androidx.room.r.x(parcel, 2, this.e);
        androidx.room.r.I(parcel, iH);
    }
}
