package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e extends com.google.android.gms.common.internal.safeparcel.a {
    public static final Parcelable.Creator<e> CREATOR = new android.support.v4.media.a(27);
    public long A;
    public boolean B;
    public String C;
    public final u D;
    public long E;
    public u F;
    public final long G;
    public final u H;
    public String e;
    public String y;
    public o4 z;

    public e(e eVar) {
        com.google.android.gms.common.internal.x.g(eVar);
        this.e = eVar.e;
        this.y = eVar.y;
        this.z = eVar.z;
        this.A = eVar.A;
        this.B = eVar.B;
        this.C = eVar.C;
        this.D = eVar.D;
        this.E = eVar.E;
        this.F = eVar.F;
        this.G = eVar.G;
        this.H = eVar.H;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int iH = androidx.room.r.H(parcel, 20293);
        androidx.room.r.D(parcel, 2, this.e);
        androidx.room.r.D(parcel, 3, this.y);
        androidx.room.r.C(parcel, 4, this.z, i);
        long j = this.A;
        androidx.room.r.G(parcel, 5, 8);
        parcel.writeLong(j);
        boolean z = this.B;
        androidx.room.r.G(parcel, 6, 4);
        parcel.writeInt(z ? 1 : 0);
        androidx.room.r.D(parcel, 7, this.C);
        androidx.room.r.C(parcel, 8, this.D, i);
        long j2 = this.E;
        androidx.room.r.G(parcel, 9, 8);
        parcel.writeLong(j2);
        androidx.room.r.C(parcel, 10, this.F, i);
        androidx.room.r.G(parcel, 11, 8);
        parcel.writeLong(this.G);
        androidx.room.r.C(parcel, 12, this.H, i);
        androidx.room.r.I(parcel, iH);
    }

    public e(String str, String str2, o4 o4Var, long j, boolean z, String str3, u uVar, long j2, u uVar2, long j3, u uVar3) {
        this.e = str;
        this.y = str2;
        this.z = o4Var;
        this.A = j;
        this.B = z;
        this.C = str3;
        this.D = uVar;
        this.E = j2;
        this.F = uVar2;
        this.G = j3;
        this.H = uVar3;
    }
}
