package com.google.android.gms.internal.measurement;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class u9 extends com.google.android.gms.common.internal.safeparcel.a {
    public static final Parcelable.Creator<u9> CREATOR = new k6(7);
    public final boolean A;
    public final String e;
    public final String y;
    public final t9 z;

    public u9(String str, String str2, t9 t9Var, boolean z) {
        this.e = str;
        this.y = str2;
        this.z = t9Var;
        this.A = z;
    }

    public final void d(StringBuilder sb) {
        sb.append("FlagOverride(");
        sb.append(this.e);
        sb.append(", ");
        sb.append(this.y);
        sb.append(", ");
        this.z.d(sb);
        sb.append(", ");
        sb.append(this.A);
        sb.append(")");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u9)) {
            return false;
        }
        u9 u9Var = (u9) obj;
        return wf.c(this.e, u9Var.e) && wf.c(this.y, u9Var.y) && wf.c(this.z, u9Var.z) && this.A == u9Var.A;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        d(sb);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iH = androidx.room.r.H(parcel, 20293);
        androidx.room.r.D(parcel, 2, this.e);
        androidx.room.r.D(parcel, 3, this.y);
        androidx.room.r.C(parcel, 4, this.z, i);
        androidx.room.r.G(parcel, 5, 4);
        parcel.writeInt(this.A ? 1 : 0);
        androidx.room.r.I(parcel, iH);
    }
}
