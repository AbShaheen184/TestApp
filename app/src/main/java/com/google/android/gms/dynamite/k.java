package com.google.android.gms.dynamite;

import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k extends com.google.android.gms.internal.base.a {
    public final com.google.android.gms.dynamic.a I(com.google.android.gms.dynamic.b bVar, String str, int i, com.google.android.gms.dynamic.b bVar2) {
        Parcel parcelH = h();
        com.google.android.gms.internal.common.g.b(parcelH, bVar);
        parcelH.writeString(str);
        parcelH.writeInt(i);
        com.google.android.gms.internal.common.g.b(parcelH, bVar2);
        Parcel parcelD = d(parcelH, 2);
        com.google.android.gms.dynamic.a aVarH = com.google.android.gms.dynamic.b.H(parcelD.readStrongBinder());
        parcelD.recycle();
        return aVarH;
    }

    public final com.google.android.gms.dynamic.a J(com.google.android.gms.dynamic.b bVar, String str, int i, com.google.android.gms.dynamic.b bVar2) {
        Parcel parcelH = h();
        com.google.android.gms.internal.common.g.b(parcelH, bVar);
        parcelH.writeString(str);
        parcelH.writeInt(i);
        com.google.android.gms.internal.common.g.b(parcelH, bVar2);
        Parcel parcelD = d(parcelH, 3);
        com.google.android.gms.dynamic.a aVarH = com.google.android.gms.dynamic.b.H(parcelD.readStrongBinder());
        parcelD.recycle();
        return aVarH;
    }
}
