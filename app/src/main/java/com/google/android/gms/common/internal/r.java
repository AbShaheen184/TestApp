package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends com.google.android.gms.common.internal.safeparcel.a {
    public static final Parcelable.Creator<r> CREATOR = new android.support.v4.media.a(18);
    public final boolean A;
    public final boolean B;
    public final int e;
    public final IBinder y;
    public final com.google.android.gms.common.b z;

    public r(int i, IBinder iBinder, com.google.android.gms.common.b bVar, boolean z, boolean z2) {
        this.e = i;
        this.y = iBinder;
        this.z = bVar;
        this.A = z;
        this.B = z2;
    }

    public final boolean equals(Object obj) {
        Object j0Var;
        if (obj == null) {
            return false;
        }
        if (this != obj) {
            if (!(obj instanceof r)) {
                return false;
            }
            r rVar = (r) obj;
            if (!this.z.equals(rVar.z)) {
                return false;
            }
            Object j0Var2 = null;
            IBinder iBinder = this.y;
            if (iBinder == null) {
                j0Var = null;
            } else {
                int i = a.e;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                j0Var = iInterfaceQueryLocalInterface instanceof i ? (i) iInterfaceQueryLocalInterface : new j0(iBinder, "com.google.android.gms.common.internal.IAccountAccessor", 1);
            }
            IBinder iBinder2 = rVar.y;
            if (iBinder2 != null) {
                int i2 = a.e;
                IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                j0Var2 = iInterfaceQueryLocalInterface2 instanceof i ? (i) iInterfaceQueryLocalInterface2 : new j0(iBinder2, "com.google.android.gms.common.internal.IAccountAccessor", 1);
            }
            if (!x.j(j0Var, j0Var2)) {
                return false;
            }
        }
        return true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iH = androidx.room.r.H(parcel, 20293);
        androidx.room.r.G(parcel, 1, 4);
        parcel.writeInt(this.e);
        androidx.room.r.A(parcel, 2, this.y);
        androidx.room.r.C(parcel, 3, this.z, i);
        androidx.room.r.G(parcel, 4, 4);
        parcel.writeInt(this.A ? 1 : 0);
        androidx.room.r.G(parcel, 5, 4);
        parcel.writeInt(this.B ? 1 : 0);
        androidx.room.r.I(parcel, iH);
    }
}
