package com.google.android.material.textfield;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class y extends androidx.customview.view.b {
    public static final Parcelable.Creator<y> CREATOR = new androidx.compose.runtime.snapshots.p(9);
    public boolean A;
    public CharSequence z;

    public y(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.z = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.A = parcel.readInt() == 1;
    }

    public final String toString() {
        return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.z) + "}";
    }

    @Override // androidx.customview.view.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        TextUtils.writeToParcel(this.z, parcel, i);
        parcel.writeInt(this.A ? 1 : 0);
    }
}
