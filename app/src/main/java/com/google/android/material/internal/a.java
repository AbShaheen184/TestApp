package com.google.android.material.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.snapshots.p;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a extends androidx.customview.view.b {
    public static final Parcelable.Creator<a> CREATOR = new p(7);
    public boolean z;

    public a(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.z = parcel.readInt() == 1;
    }

    @Override // androidx.customview.view.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.z ? 1 : 0);
    }
}
