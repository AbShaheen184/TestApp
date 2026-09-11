package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.x;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class d extends com.google.android.gms.common.internal.safeparcel.a {
    public static final Parcelable.Creator<d> CREATOR = new android.support.v4.media.a(24);
    public final boolean A;
    public final String e;
    public final int y;
    public final long z;

    public d(String str, int i, long j, boolean z) {
        this.e = str;
        this.y = i;
        this.z = j;
        this.A = z;
    }

    public final long d() {
        long j = this.z;
        return j == -1 ? this.y : j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (x.j(this.e, dVar.e) && d() == dVar.d() && this.A == dVar.A) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.e, Long.valueOf(d()), Boolean.valueOf(this.A)});
    }

    public final String toString() {
        coil3.memory.c cVar = new coil3.memory.c(this);
        cVar.f(this.e, "name");
        cVar.f(Long.valueOf(d()), "version");
        cVar.f(Boolean.valueOf(this.A), "is_fully_rolled_out");
        return cVar.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iH = androidx.room.r.H(parcel, 20293);
        androidx.room.r.D(parcel, 1, this.e);
        androidx.room.r.G(parcel, 2, 4);
        parcel.writeInt(this.y);
        long jD = d();
        androidx.room.r.G(parcel, 3, 8);
        parcel.writeLong(jD);
        androidx.room.r.G(parcel, 4, 4);
        parcel.writeInt(this.A ? 1 : 0);
        androidx.room.r.I(parcel, iH);
    }
}
