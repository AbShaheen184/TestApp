package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IInterface;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public interface z5 extends IInterface {
    void beginAdUnitExposure(String str, long j);

    void clearConditionalUserProperty(String str, String str2, Bundle bundle);

    void clearMeasurementEnabled(long j);

    void endAdUnitExposure(String str, long j);

    void generateEventId(b6 b6Var);

    void getAppInstanceId(b6 b6Var);

    void getCachedAppInstanceId(b6 b6Var);

    void getConditionalUserProperties(String str, String str2, b6 b6Var);

    void getCurrentScreenClass(b6 b6Var);

    void getCurrentScreenName(b6 b6Var);

    void getGmpAppId(b6 b6Var);

    void getMaxUserProperties(String str, b6 b6Var);

    void getSessionId(b6 b6Var);

    void getTestFlag(b6 b6Var, int i);

    void getUserProperties(String str, String str2, boolean z, b6 b6Var);

    void initForTests(Map map);

    void initialize(com.google.android.gms.dynamic.a aVar, j6 j6Var, long j);

    void initializeWithElapsedTime(com.google.android.gms.dynamic.a aVar, j6 j6Var, long j, long j2);

    void isDataCollectionEnabled(b6 b6Var);

    void logEvent(String str, String str2, Bundle bundle, boolean z, boolean z2, long j);

    void logEventAndBundle(String str, String str2, Bundle bundle, b6 b6Var, long j);

    void logEventWithElapsedTime(String str, String str2, Bundle bundle, boolean z, boolean z2, long j, long j2);

    void logHealthData(int i, String str, com.google.android.gms.dynamic.a aVar, com.google.android.gms.dynamic.a aVar2, com.google.android.gms.dynamic.a aVar3);

    void onActivityCreated(com.google.android.gms.dynamic.a aVar, Bundle bundle, long j);

    void onActivityCreatedByScionActivityInfo(l6 l6Var, Bundle bundle, long j);

    void onActivityDestroyed(com.google.android.gms.dynamic.a aVar, long j);

    void onActivityDestroyedByScionActivityInfo(l6 l6Var, long j);

    void onActivityPaused(com.google.android.gms.dynamic.a aVar, long j);

    void onActivityPausedByScionActivityInfo(l6 l6Var, long j);

    void onActivityResumed(com.google.android.gms.dynamic.a aVar, long j);

    void onActivityResumedByScionActivityInfo(l6 l6Var, long j);

    void onActivitySaveInstanceState(com.google.android.gms.dynamic.a aVar, b6 b6Var, long j);

    void onActivitySaveInstanceStateByScionActivityInfo(l6 l6Var, b6 b6Var, long j);

    void onActivityStarted(com.google.android.gms.dynamic.a aVar, long j);

    void onActivityStartedByScionActivityInfo(l6 l6Var, long j);

    void onActivityStopped(com.google.android.gms.dynamic.a aVar, long j);

    void onActivityStoppedByScionActivityInfo(l6 l6Var, long j);

    void performAction(Bundle bundle, b6 b6Var, long j);

    void registerOnMeasurementEventListener(f6 f6Var);

    void resetAnalyticsData(long j);

    void resetAnalyticsDataWithElapsedTime(long j, long j2);

    void retrieveAndUploadBatches(d6 d6Var);

    void setConditionalUserProperty(Bundle bundle, long j);

    void setConsent(Bundle bundle, long j);

    void setConsentThirdParty(Bundle bundle, long j);

    void setCurrentScreen(com.google.android.gms.dynamic.a aVar, String str, String str2, long j);

    void setCurrentScreenByScionActivityInfo(l6 l6Var, String str, String str2, long j);

    void setDataCollectionEnabled(boolean z);

    void setDefaultEventParameters(Bundle bundle);

    void setEventInterceptor(f6 f6Var);

    void setInstanceIdProvider(i6 i6Var);

    void setMeasurementEnabled(boolean z, long j);

    void setMinimumSessionDuration(long j);

    void setSessionTimeoutDuration(long j);

    void setSgtmDebugInfo(Intent intent);

    void setUserId(String str, long j);

    void setUserProperty(String str, String str2, com.google.android.gms.dynamic.a aVar, boolean z, long j);

    void unregisterOnMeasurementEventListener(f6 f6Var);
}
