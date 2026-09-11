package androidx.media3.common;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class r0 implements Comparable, Parcelable {
    public static final Parcelable.Creator<r0> CREATOR = new k(2);
    public final int e;
    public final int y;
    public final int z;

    static {
        androidx.media3.common.util.j0.K(0);
        androidx.media3.common.util.j0.K(1);
        androidx.media3.common.util.j0.K(2);
    }

    public r0(Parcel parcel) {
        this.e = parcel.readInt();
        this.y = parcel.readInt();
        this.z = parcel.readInt();
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        r0 r0Var = (r0) obj;
        int i = this.e - r0Var.e;
        if (i != 0) {
            return i;
        }
        int i2 = this.y - r0Var.y;
        return i2 == 0 ? this.z - r0Var.z : i2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r0.class == obj.getClass()) {
            r0 r0Var = (r0) obj;
            if (this.e == r0Var.e && this.y == r0Var.y && this.z == r0Var.z) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((this.e * 31) + this.y) * 31) + this.z;
    }

    public final String toString() {
        return this.e + "." + this.y + "." + this.z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.e);
        parcel.writeInt(this.y);
        parcel.writeInt(this.z);
    }

    public r0() {
        this.e = -1;
        this.y = -1;
        this.z = -1;
    }
}
