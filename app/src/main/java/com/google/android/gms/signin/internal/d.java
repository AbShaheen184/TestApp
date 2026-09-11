package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.room.r;
import com.google.android.gms.measurement.internal.v;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends com.google.android.gms.common.internal.safeparcel.a {
    public static final Parcelable.Creator<d> CREATOR = new v(8);
    public final List e;
    public final String y;

    public d(String str, ArrayList arrayList) {
        this.e = arrayList;
        this.y = str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iH = r.H(parcel, 20293);
        List<String> list = this.e;
        if (list != null) {
            int iH2 = r.H(parcel, 1);
            parcel.writeStringList(list);
            r.I(parcel, iH2);
        }
        r.D(parcel, 2, this.y);
        r.I(parcel, iH);
    }
}
