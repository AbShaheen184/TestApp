package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.o5;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class i0 extends com.google.android.gms.internal.base.a implements k0 {
    public i0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService", 2);
    }

    @Override // com.google.android.gms.measurement.internal.k0
    public final List B(String str, String str2, boolean z, t4 t4Var) {
        Parcel parcelH = h();
        parcelH.writeString(str);
        parcelH.writeString(str2);
        ClassLoader classLoader = o5.a;
        parcelH.writeInt(z ? 1 : 0);
        o5.b(parcelH, t4Var);
        Parcel parcelG = g(parcelH, 14);
        ArrayList arrayListCreateTypedArrayList = parcelG.createTypedArrayList(o4.CREATOR);
        parcelG.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.k0
    public final void C(u uVar, t4 t4Var) {
        Parcel parcelH = h();
        o5.b(parcelH, uVar);
        o5.b(parcelH, t4Var);
        G(parcelH, 1);
    }

    @Override // com.google.android.gms.measurement.internal.k0
    public final String D(t4 t4Var) {
        Parcel parcelH = h();
        o5.b(parcelH, t4Var);
        Parcel parcelG = g(parcelH, 11);
        String string = parcelG.readString();
        parcelG.recycle();
        return string;
    }

    @Override // com.google.android.gms.measurement.internal.k0
    public final List E(String str, String str2, t4 t4Var) {
        Parcel parcelH = h();
        parcelH.writeString(str);
        parcelH.writeString(str2);
        o5.b(parcelH, t4Var);
        Parcel parcelG = g(parcelH, 16);
        ArrayList arrayListCreateTypedArrayList = parcelG.createTypedArrayList(e.CREATOR);
        parcelG.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.k0
    public final void F(t4 t4Var) {
        Parcel parcelH = h();
        o5.b(parcelH, t4Var);
        G(parcelH, 20);
    }

    @Override // com.google.android.gms.measurement.internal.k0
    public final void a(t4 t4Var, e4 e4Var, o0 o0Var) {
        Parcel parcelH = h();
        o5.b(parcelH, t4Var);
        o5.b(parcelH, e4Var);
        o5.c(parcelH, o0Var);
        G(parcelH, 29);
    }

    @Override // com.google.android.gms.measurement.internal.k0
    public final List e(String str, String str2, String str3, boolean z) {
        Parcel parcelH = h();
        parcelH.writeString(null);
        parcelH.writeString(str2);
        parcelH.writeString(str3);
        ClassLoader classLoader = o5.a;
        parcelH.writeInt(z ? 1 : 0);
        Parcel parcelG = g(parcelH, 15);
        ArrayList arrayListCreateTypedArrayList = parcelG.createTypedArrayList(o4.CREATOR);
        parcelG.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.k0
    public final void i(e eVar, t4 t4Var) {
        Parcel parcelH = h();
        o5.b(parcelH, eVar);
        o5.b(parcelH, t4Var);
        G(parcelH, 12);
    }

    @Override // com.google.android.gms.measurement.internal.k0
    public final void k(long j, String str, String str2, String str3) {
        Parcel parcelH = h();
        parcelH.writeLong(j);
        parcelH.writeString(str);
        parcelH.writeString(str2);
        parcelH.writeString(str3);
        G(parcelH, 10);
    }

    @Override // com.google.android.gms.measurement.internal.k0
    public final void l(t4 t4Var) {
        Parcel parcelH = h();
        o5.b(parcelH, t4Var);
        G(parcelH, 18);
    }

    @Override // com.google.android.gms.measurement.internal.k0
    public final List m(String str, String str2, String str3) {
        Parcel parcelH = h();
        parcelH.writeString(null);
        parcelH.writeString(str2);
        parcelH.writeString(str3);
        Parcel parcelG = g(parcelH, 17);
        ArrayList arrayListCreateTypedArrayList = parcelG.createTypedArrayList(e.CREATOR);
        parcelG.recycle();
        return arrayListCreateTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.k0
    public final byte[] n(u uVar, String str) {
        Parcel parcelH = h();
        o5.b(parcelH, uVar);
        parcelH.writeString(str);
        Parcel parcelG = g(parcelH, 9);
        byte[] bArrCreateByteArray = parcelG.createByteArray();
        parcelG.recycle();
        return bArrCreateByteArray;
    }

    @Override // com.google.android.gms.measurement.internal.k0
    public final void o(t4 t4Var) {
        Parcel parcelH = h();
        o5.b(parcelH, t4Var);
        G(parcelH, 25);
    }

    @Override // com.google.android.gms.measurement.internal.k0
    public final void p(t4 t4Var, Bundle bundle, m0 m0Var) {
        Parcel parcelH = h();
        o5.b(parcelH, t4Var);
        o5.b(parcelH, bundle);
        o5.c(parcelH, m0Var);
        G(parcelH, 31);
    }

    @Override // com.google.android.gms.measurement.internal.k0
    public final void q(t4 t4Var) {
        Parcel parcelH = h();
        o5.b(parcelH, t4Var);
        G(parcelH, 6);
    }

    @Override // com.google.android.gms.measurement.internal.k0
    public final void r(t4 t4Var) {
        Parcel parcelH = h();
        o5.b(parcelH, t4Var);
        G(parcelH, 26);
    }

    @Override // com.google.android.gms.measurement.internal.k0
    public final void s(t4 t4Var, d dVar) {
        Parcel parcelH = h();
        o5.b(parcelH, t4Var);
        o5.b(parcelH, dVar);
        G(parcelH, 30);
    }

    @Override // com.google.android.gms.measurement.internal.k0
    public final void t(o4 o4Var, t4 t4Var) {
        Parcel parcelH = h();
        o5.b(parcelH, o4Var);
        o5.b(parcelH, t4Var);
        G(parcelH, 2);
    }

    @Override // com.google.android.gms.measurement.internal.k0
    public final i u(t4 t4Var) {
        Parcel parcelH = h();
        o5.b(parcelH, t4Var);
        Parcel parcelG = g(parcelH, 21);
        i iVar = (i) o5.a(parcelG, i.CREATOR);
        parcelG.recycle();
        return iVar;
    }

    @Override // com.google.android.gms.measurement.internal.k0
    public final void v(Bundle bundle, t4 t4Var) {
        Parcel parcelH = h();
        o5.b(parcelH, bundle);
        o5.b(parcelH, t4Var);
        G(parcelH, 19);
    }

    @Override // com.google.android.gms.measurement.internal.k0
    public final void x(t4 t4Var) {
        Parcel parcelH = h();
        o5.b(parcelH, t4Var);
        G(parcelH, 4);
    }

    @Override // com.google.android.gms.measurement.internal.k0
    public final void z(t4 t4Var) {
        Parcel parcelH = h();
        o5.b(parcelH, t4Var);
        G(parcelH, 27);
    }
}
