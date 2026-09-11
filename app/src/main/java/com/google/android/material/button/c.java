package com.google.android.material.button;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.snapshots.p;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class c extends androidx.customview.view.b {
    public static final Parcelable.Creator<c> CREATOR = new p(6);
    public boolean z;

    public c(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            c.class.getClassLoader();
        }
        this.z = parcel.readInt() == 1;
    }

    @Override // androidx.customview.view.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.z ? 1 : 0);
    }
}
