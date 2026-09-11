package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e4 extends com.google.android.gms.common.internal.safeparcel.a {
    public static final Parcelable.Creator<e4> CREATOR = new v(3);
    public final List e;

    public e4(ArrayList arrayList) {
        this.e = arrayList;
    }

    public static e4 d(b3... b3VarArr) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(b3VarArr[0].e));
        return new e4(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iH = androidx.room.r.H(parcel, 20293);
        List list = this.e;
        if (list != null) {
            int iH2 = androidx.room.r.H(parcel, 1);
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                parcel.writeInt(((Integer) list.get(i2)).intValue());
            }
            androidx.room.r.I(parcel, iH2);
        }
        androidx.room.r.I(parcel, iH);
    }
}
