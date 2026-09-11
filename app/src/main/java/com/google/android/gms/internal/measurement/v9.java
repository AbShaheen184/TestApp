package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class v9 extends com.google.android.gms.common.internal.safeparcel.a {
    public static final Parcelable.Creator<v9> CREATOR = new k6(8);
    public final List e;

    public v9(ArrayList arrayList) {
        this.e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof v9) {
            return this.e.equals(((v9) obj).e);
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FlagOverrides(");
        boolean z = true;
        for (u9 u9Var : this.e) {
            if (!z) {
                sb.append(", ");
            }
            u9Var.d(sb);
            z = false;
        }
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iH = androidx.room.r.H(parcel, 20293);
        androidx.room.r.F(parcel, 2, this.e);
        androidx.room.r.I(parcel, iH);
    }
}
