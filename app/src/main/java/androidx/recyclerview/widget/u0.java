package androidx.recyclerview.widget;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class u0 implements Parcelable {
    public static final Parcelable.Creator<u0> CREATOR = new android.support.v4.media.a(9);
    public boolean A;
    public int e;
    public int y;
    public int[] z;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "FullSpanItem{mPosition=" + this.e + ", mGapDir=" + this.y + ", mHasUnwantedGapAfter=" + this.A + ", mGapPerSpan=" + Arrays.toString(this.z) + '}';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.e);
        parcel.writeInt(this.y);
        parcel.writeInt(this.A ? 1 : 0);
        int[] iArr = this.z;
        if (iArr == null || iArr.length <= 0) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(iArr.length);
            parcel.writeIntArray(this.z);
        }
    }
}
