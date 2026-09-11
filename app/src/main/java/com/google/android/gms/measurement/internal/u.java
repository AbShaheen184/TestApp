package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends com.google.android.gms.common.internal.safeparcel.a {
    public static final Parcelable.Creator<u> CREATOR = new v(0);
    public final long A;
    public final long B;
    public final String e;
    public final t y;
    public final String z;

    public u(u uVar, long j, long j2) {
        com.google.android.gms.common.internal.x.g(uVar);
        this.e = uVar.e;
        this.y = uVar.y;
        this.z = uVar.z;
        this.A = j;
        this.B = j2;
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.y);
        String str = this.z;
        int length = String.valueOf(str).length();
        String str2 = this.e;
        StringBuilder sb = new StringBuilder(length + 13 + String.valueOf(str2).length() + 8 + strValueOf.length());
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.y(sb, "origin=", str, ",name=", str2);
        return androidx.privacysandbox.ads.adservices.java.internal.a.u(sb, ",params=", strValueOf);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        v.a(this, parcel, i);
    }

    public u(String str, t tVar, String str2, long j, long j2) {
        this.e = str;
        this.y = tVar;
        this.z = str2;
        this.A = j;
        this.B = j2;
    }
}
