package androidx.coordinatorlayout.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.compose.runtime.snapshots.p;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class f extends androidx.customview.view.b {
    public static final Parcelable.Creator<f> CREATOR = new p(2);
    public SparseArray z;

    public f(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int i = parcel.readInt();
        int[] iArr = new int[i];
        parcel.readIntArray(iArr);
        Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
        this.z = new SparseArray(i);
        for (int i2 = 0; i2 < i; i2++) {
            this.z.append(iArr[i2], parcelableArray[i2]);
        }
    }

    @Override // androidx.customview.view.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        SparseArray sparseArray = this.z;
        int size = sparseArray != null ? sparseArray.size() : 0;
        parcel.writeInt(size);
        int[] iArr = new int[size];
        Parcelable[] parcelableArr = new Parcelable[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = this.z.keyAt(i2);
            parcelableArr[i2] = (Parcelable) this.z.valueAt(i2);
        }
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i);
    }
}
