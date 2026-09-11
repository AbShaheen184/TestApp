package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class x5 extends com.google.android.gms.internal.base.a implements z5 {
    @Override // com.google.android.gms.internal.measurement.z5
    public final void beginAdUnitExposure(String str, long j) {
        Parcel parcelH = h();
        parcelH.writeString(str);
        parcelH.writeLong(j);
        G(parcelH, 23);
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel parcelH = h();
        parcelH.writeString(str);
        parcelH.writeString(str2);
        o5.b(parcelH, bundle);
        G(parcelH, 9);
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public final void endAdUnitExposure(String str, long j) {
        Parcel parcelH = h();
        parcelH.writeString(str);
        parcelH.writeLong(j);
        G(parcelH, 24);
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public final void generateEventId(b6 b6Var) {
        Parcel parcelH = h();
        o5.c(parcelH, b6Var);
        G(parcelH, 22);
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public final void getCachedAppInstanceId(b6 b6Var) {
        Parcel parcelH = h();
        o5.c(parcelH, b6Var);
        G(parcelH, 19);
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public final void getConditionalUserProperties(String str, String str2, b6 b6Var) {
        Parcel parcelH = h();
        parcelH.writeString(str);
        parcelH.writeString(str2);
        o5.c(parcelH, b6Var);
        G(parcelH, 10);
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public final void getCurrentScreenClass(b6 b6Var) {
        Parcel parcelH = h();
        o5.c(parcelH, b6Var);
        G(parcelH, 17);
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public final void getCurrentScreenName(b6 b6Var) {
        Parcel parcelH = h();
        o5.c(parcelH, b6Var);
        G(parcelH, 16);
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public final void getGmpAppId(b6 b6Var) {
        Parcel parcelH = h();
        o5.c(parcelH, b6Var);
        G(parcelH, 21);
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public final void getMaxUserProperties(String str, b6 b6Var) {
        Parcel parcelH = h();
        parcelH.writeString(str);
        o5.c(parcelH, b6Var);
        G(parcelH, 6);
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public final void getUserProperties(String str, String str2, boolean z, b6 b6Var) {
        Parcel parcelH = h();
        parcelH.writeString(str);
        parcelH.writeString(str2);
        ClassLoader classLoader = o5.a;
        parcelH.writeInt(z ? 1 : 0);
        o5.c(parcelH, b6Var);
        G(parcelH, 5);
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public final void initialize(com.google.android.gms.dynamic.a aVar, j6 j6Var, long j) {
        Parcel parcelH = h();
        o5.c(parcelH, aVar);
        o5.b(parcelH, j6Var);
        parcelH.writeLong(j);
        G(parcelH, 1);
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public final void initializeWithElapsedTime(com.google.android.gms.dynamic.a aVar, j6 j6Var, long j, long j2) {
        Parcel parcelH = h();
        o5.c(parcelH, aVar);
        o5.b(parcelH, j6Var);
        parcelH.writeLong(j);
        parcelH.writeLong(j2);
        G(parcelH, 60);
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public final void logEventWithElapsedTime(String str, String str2, Bundle bundle, boolean z, boolean z2, long j, long j2) {
        Parcel parcelH = h();
        parcelH.writeString(str);
        parcelH.writeString(str2);
        o5.b(parcelH, bundle);
        parcelH.writeInt(1);
        parcelH.writeInt(1);
        parcelH.writeLong(j);
        parcelH.writeLong(j2);
        G(parcelH, 59);
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public final void logHealthData(int i, String str, com.google.android.gms.dynamic.a aVar, com.google.android.gms.dynamic.a aVar2, com.google.android.gms.dynamic.a aVar3) {
        Parcel parcelH = h();
        parcelH.writeInt(5);
        parcelH.writeString("Error with data collection. Data lost.");
        o5.c(parcelH, aVar);
        o5.c(parcelH, aVar2);
        o5.c(parcelH, aVar3);
        G(parcelH, 33);
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public final void onActivityCreatedByScionActivityInfo(l6 l6Var, Bundle bundle, long j) {
        Parcel parcelH = h();
        o5.b(parcelH, l6Var);
        o5.b(parcelH, bundle);
        parcelH.writeLong(j);
        G(parcelH, 53);
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public final void onActivityDestroyedByScionActivityInfo(l6 l6Var, long j) {
        Parcel parcelH = h();
        o5.b(parcelH, l6Var);
        parcelH.writeLong(j);
        G(parcelH, 54);
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public final void onActivityPausedByScionActivityInfo(l6 l6Var, long j) {
        Parcel parcelH = h();
        o5.b(parcelH, l6Var);
        parcelH.writeLong(j);
        G(parcelH, 55);
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public final void onActivityResumedByScionActivityInfo(l6 l6Var, long j) {
        Parcel parcelH = h();
        o5.b(parcelH, l6Var);
        parcelH.writeLong(j);
        G(parcelH, 56);
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public final void onActivitySaveInstanceStateByScionActivityInfo(l6 l6Var, b6 b6Var, long j) {
        Parcel parcelH = h();
        o5.b(parcelH, l6Var);
        o5.c(parcelH, b6Var);
        parcelH.writeLong(j);
        G(parcelH, 57);
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public final void onActivityStartedByScionActivityInfo(l6 l6Var, long j) {
        Parcel parcelH = h();
        o5.b(parcelH, l6Var);
        parcelH.writeLong(j);
        G(parcelH, 51);
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public final void onActivityStoppedByScionActivityInfo(l6 l6Var, long j) {
        Parcel parcelH = h();
        o5.b(parcelH, l6Var);
        parcelH.writeLong(j);
        G(parcelH, 52);
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public final void registerOnMeasurementEventListener(f6 f6Var) {
        Parcel parcelH = h();
        o5.c(parcelH, f6Var);
        G(parcelH, 35);
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public final void retrieveAndUploadBatches(d6 d6Var) {
        Parcel parcelH = h();
        o5.c(parcelH, d6Var);
        G(parcelH, 58);
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public final void setConditionalUserProperty(Bundle bundle, long j) {
        Parcel parcelH = h();
        o5.b(parcelH, bundle);
        parcelH.writeLong(j);
        G(parcelH, 8);
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public final void setCurrentScreenByScionActivityInfo(l6 l6Var, String str, String str2, long j) {
        Parcel parcelH = h();
        o5.b(parcelH, l6Var);
        parcelH.writeString(str);
        parcelH.writeString(str2);
        parcelH.writeLong(j);
        G(parcelH, 50);
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public final void setDataCollectionEnabled(boolean z) {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.z5
    public final void setUserProperty(String str, String str2, com.google.android.gms.dynamic.a aVar, boolean z, long j) {
        Parcel parcelH = h();
        parcelH.writeString("fcm");
        parcelH.writeString("_ln");
        o5.c(parcelH, aVar);
        parcelH.writeInt(1);
        parcelH.writeLong(j);
        G(parcelH, 4);
    }
}
