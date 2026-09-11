package com.google.android.gms.common.internal;

import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends com.google.android.gms.internal.base.a implements w {
    public final boolean I() {
        Parcel parcelD = d(h(), 7);
        int i = com.google.android.gms.internal.common.g.a;
        boolean z = parcelD.readInt() != 0;
        parcelD.recycle();
        return z;
    }
}
