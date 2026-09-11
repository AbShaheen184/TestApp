package com.google.android.gms.internal.measurement;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import java.util.HashMap;
import org.mozilla.javascript.Token;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class y5 extends n5 implements z5 {
    public static z5 asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService");
        return iInterfaceQueryLocalInterface instanceof z5 ? (z5) iInterfaceQueryLocalInterface : new x5(iBinder, "com.google.android.gms.measurement.api.internal.IAppMeasurementDynamiteService", 2);
    }

    @Override // com.google.android.gms.internal.measurement.n5
    public final boolean d(int i, Parcel parcel, Parcel parcel2) {
        boolean z = false;
        b6 a6Var = null;
        d6 c6Var = null;
        b6 a6Var2 = null;
        b6 a6Var3 = null;
        b6 a6Var4 = null;
        b6 a6Var5 = null;
        f6 e6Var = null;
        f6 e6Var2 = null;
        f6 e6Var3 = null;
        b6 a6Var6 = null;
        b6 a6Var7 = null;
        b6 a6Var8 = null;
        b6 a6Var9 = null;
        b6 a6Var10 = null;
        b6 a6Var11 = null;
        i6 g6Var = null;
        b6 a6Var12 = null;
        b6 a6Var13 = null;
        b6 a6Var14 = null;
        b6 a6Var15 = null;
        b6 a6Var16 = null;
        switch (i) {
            case 1:
                com.google.android.gms.dynamic.a aVarH = com.google.android.gms.dynamic.b.H(parcel.readStrongBinder());
                j6 j6Var = (j6) o5.a(parcel, j6.CREATOR);
                long j = parcel.readLong();
                o5.d(parcel);
                initialize(aVarH, j6Var, j);
                break;
            case 2:
                String string = parcel.readString();
                String string2 = parcel.readString();
                Bundle bundle = (Bundle) o5.a(parcel, Bundle.CREATOR);
                boolean z2 = parcel.readInt() != 0;
                boolean z3 = parcel.readInt() != 0;
                long j2 = parcel.readLong();
                o5.d(parcel);
                logEvent(string, string2, bundle, z2, z3, j2);
                break;
            case 3:
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                Bundle bundle2 = (Bundle) o5.a(parcel, Bundle.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    a6Var = iInterfaceQueryLocalInterface instanceof b6 ? (b6) iInterfaceQueryLocalInterface : new a6(strongBinder);
                }
                b6 b6Var = a6Var;
                long j3 = parcel.readLong();
                o5.d(parcel);
                logEventAndBundle(string3, string4, bundle2, b6Var, j3);
                break;
            case 4:
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                com.google.android.gms.dynamic.a aVarH2 = com.google.android.gms.dynamic.b.H(parcel.readStrongBinder());
                ClassLoader classLoader = o5.a;
                boolean z4 = parcel.readInt() != 0;
                long j4 = parcel.readLong();
                o5.d(parcel);
                setUserProperty(string5, string6, aVarH2, z4, j4);
                break;
            case 5:
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                ClassLoader classLoader2 = o5.a;
                boolean z5 = parcel.readInt() != 0;
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    a6Var16 = iInterfaceQueryLocalInterface2 instanceof b6 ? (b6) iInterfaceQueryLocalInterface2 : new a6(strongBinder2);
                }
                o5.d(parcel);
                getUserProperties(string7, string8, z5, a6Var16);
                break;
            case 6:
                String string9 = parcel.readString();
                IBinder strongBinder3 = parcel.readStrongBinder();
                if (strongBinder3 != null) {
                    IInterface iInterfaceQueryLocalInterface3 = strongBinder3.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    a6Var15 = iInterfaceQueryLocalInterface3 instanceof b6 ? (b6) iInterfaceQueryLocalInterface3 : new a6(strongBinder3);
                }
                o5.d(parcel);
                getMaxUserProperties(string9, a6Var15);
                break;
            case 7:
                String string10 = parcel.readString();
                long j5 = parcel.readLong();
                o5.d(parcel);
                setUserId(string10, j5);
                break;
            case 8:
                Bundle bundle3 = (Bundle) o5.a(parcel, Bundle.CREATOR);
                long j6 = parcel.readLong();
                o5.d(parcel);
                setConditionalUserProperty(bundle3, j6);
                break;
            case 9:
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                Bundle bundle4 = (Bundle) o5.a(parcel, Bundle.CREATOR);
                o5.d(parcel);
                clearConditionalUserProperty(string11, string12, bundle4);
                break;
            case 10:
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                IBinder strongBinder4 = parcel.readStrongBinder();
                if (strongBinder4 != null) {
                    IInterface iInterfaceQueryLocalInterface4 = strongBinder4.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    a6Var14 = iInterfaceQueryLocalInterface4 instanceof b6 ? (b6) iInterfaceQueryLocalInterface4 : new a6(strongBinder4);
                }
                o5.d(parcel);
                getConditionalUserProperties(string13, string14, a6Var14);
                break;
            case 11:
                ClassLoader classLoader3 = o5.a;
                boolean z6 = parcel.readInt() != 0;
                long j7 = parcel.readLong();
                o5.d(parcel);
                setMeasurementEnabled(z6, j7);
                break;
            case 12:
                long j8 = parcel.readLong();
                o5.d(parcel);
                resetAnalyticsData(j8);
                break;
            case 13:
                long j9 = parcel.readLong();
                o5.d(parcel);
                setMinimumSessionDuration(j9);
                break;
            case 14:
                long j10 = parcel.readLong();
                o5.d(parcel);
                setSessionTimeoutDuration(j10);
                break;
            case 15:
                com.google.android.gms.dynamic.a aVarH3 = com.google.android.gms.dynamic.b.H(parcel.readStrongBinder());
                String string15 = parcel.readString();
                String string16 = parcel.readString();
                long j11 = parcel.readLong();
                o5.d(parcel);
                setCurrentScreen(aVarH3, string15, string16, j11);
                break;
            case 16:
                IBinder strongBinder5 = parcel.readStrongBinder();
                if (strongBinder5 != null) {
                    IInterface iInterfaceQueryLocalInterface5 = strongBinder5.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    a6Var13 = iInterfaceQueryLocalInterface5 instanceof b6 ? (b6) iInterfaceQueryLocalInterface5 : new a6(strongBinder5);
                }
                o5.d(parcel);
                getCurrentScreenName(a6Var13);
                break;
            case 17:
                IBinder strongBinder6 = parcel.readStrongBinder();
                if (strongBinder6 != null) {
                    IInterface iInterfaceQueryLocalInterface6 = strongBinder6.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    a6Var12 = iInterfaceQueryLocalInterface6 instanceof b6 ? (b6) iInterfaceQueryLocalInterface6 : new a6(strongBinder6);
                }
                o5.d(parcel);
                getCurrentScreenClass(a6Var12);
                break;
            case 18:
                IBinder strongBinder7 = parcel.readStrongBinder();
                if (strongBinder7 != null) {
                    IInterface iInterfaceQueryLocalInterface7 = strongBinder7.queryLocalInterface("com.google.android.gms.measurement.api.internal.IStringProvider");
                    g6Var = iInterfaceQueryLocalInterface7 instanceof i6 ? (i6) iInterfaceQueryLocalInterface7 : new g6(strongBinder7, "com.google.android.gms.measurement.api.internal.IStringProvider", 2);
                }
                o5.d(parcel);
                setInstanceIdProvider(g6Var);
                break;
            case 19:
                IBinder strongBinder8 = parcel.readStrongBinder();
                if (strongBinder8 != null) {
                    IInterface iInterfaceQueryLocalInterface8 = strongBinder8.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    a6Var11 = iInterfaceQueryLocalInterface8 instanceof b6 ? (b6) iInterfaceQueryLocalInterface8 : new a6(strongBinder8);
                }
                o5.d(parcel);
                getCachedAppInstanceId(a6Var11);
                break;
            case 20:
                IBinder strongBinder9 = parcel.readStrongBinder();
                if (strongBinder9 != null) {
                    IInterface iInterfaceQueryLocalInterface9 = strongBinder9.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    a6Var10 = iInterfaceQueryLocalInterface9 instanceof b6 ? (b6) iInterfaceQueryLocalInterface9 : new a6(strongBinder9);
                }
                o5.d(parcel);
                getAppInstanceId(a6Var10);
                break;
            case 21:
                IBinder strongBinder10 = parcel.readStrongBinder();
                if (strongBinder10 != null) {
                    IInterface iInterfaceQueryLocalInterface10 = strongBinder10.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    a6Var9 = iInterfaceQueryLocalInterface10 instanceof b6 ? (b6) iInterfaceQueryLocalInterface10 : new a6(strongBinder10);
                }
                o5.d(parcel);
                getGmpAppId(a6Var9);
                break;
            case 22:
                IBinder strongBinder11 = parcel.readStrongBinder();
                if (strongBinder11 != null) {
                    IInterface iInterfaceQueryLocalInterface11 = strongBinder11.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    a6Var8 = iInterfaceQueryLocalInterface11 instanceof b6 ? (b6) iInterfaceQueryLocalInterface11 : new a6(strongBinder11);
                }
                o5.d(parcel);
                generateEventId(a6Var8);
                break;
            case 23:
                String string17 = parcel.readString();
                long j12 = parcel.readLong();
                o5.d(parcel);
                beginAdUnitExposure(string17, j12);
                break;
            case 24:
                String string18 = parcel.readString();
                long j13 = parcel.readLong();
                o5.d(parcel);
                endAdUnitExposure(string18, j13);
                break;
            case 25:
                com.google.android.gms.dynamic.a aVarH4 = com.google.android.gms.dynamic.b.H(parcel.readStrongBinder());
                long j14 = parcel.readLong();
                o5.d(parcel);
                onActivityStarted(aVarH4, j14);
                break;
            case 26:
                com.google.android.gms.dynamic.a aVarH5 = com.google.android.gms.dynamic.b.H(parcel.readStrongBinder());
                long j15 = parcel.readLong();
                o5.d(parcel);
                onActivityStopped(aVarH5, j15);
                break;
            case 27:
                com.google.android.gms.dynamic.a aVarH6 = com.google.android.gms.dynamic.b.H(parcel.readStrongBinder());
                Bundle bundle5 = (Bundle) o5.a(parcel, Bundle.CREATOR);
                long j16 = parcel.readLong();
                o5.d(parcel);
                onActivityCreated(aVarH6, bundle5, j16);
                break;
            case 28:
                com.google.android.gms.dynamic.a aVarH7 = com.google.android.gms.dynamic.b.H(parcel.readStrongBinder());
                long j17 = parcel.readLong();
                o5.d(parcel);
                onActivityDestroyed(aVarH7, j17);
                break;
            case 29:
                com.google.android.gms.dynamic.a aVarH8 = com.google.android.gms.dynamic.b.H(parcel.readStrongBinder());
                long j18 = parcel.readLong();
                o5.d(parcel);
                onActivityPaused(aVarH8, j18);
                break;
            case 30:
                com.google.android.gms.dynamic.a aVarH9 = com.google.android.gms.dynamic.b.H(parcel.readStrongBinder());
                long j19 = parcel.readLong();
                o5.d(parcel);
                onActivityResumed(aVarH9, j19);
                break;
            case 31:
                com.google.android.gms.dynamic.a aVarH10 = com.google.android.gms.dynamic.b.H(parcel.readStrongBinder());
                IBinder strongBinder12 = parcel.readStrongBinder();
                if (strongBinder12 != null) {
                    IInterface iInterfaceQueryLocalInterface12 = strongBinder12.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    a6Var7 = iInterfaceQueryLocalInterface12 instanceof b6 ? (b6) iInterfaceQueryLocalInterface12 : new a6(strongBinder12);
                }
                long j20 = parcel.readLong();
                o5.d(parcel);
                onActivitySaveInstanceState(aVarH10, a6Var7, j20);
                break;
            case 32:
                Bundle bundle6 = (Bundle) o5.a(parcel, Bundle.CREATOR);
                IBinder strongBinder13 = parcel.readStrongBinder();
                if (strongBinder13 != null) {
                    IInterface iInterfaceQueryLocalInterface13 = strongBinder13.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    a6Var6 = iInterfaceQueryLocalInterface13 instanceof b6 ? (b6) iInterfaceQueryLocalInterface13 : new a6(strongBinder13);
                }
                long j21 = parcel.readLong();
                o5.d(parcel);
                performAction(bundle6, a6Var6, j21);
                break;
            case Token.GETPROP /* 33 */:
                int i2 = parcel.readInt();
                String string19 = parcel.readString();
                com.google.android.gms.dynamic.a aVarH11 = com.google.android.gms.dynamic.b.H(parcel.readStrongBinder());
                com.google.android.gms.dynamic.a aVarH12 = com.google.android.gms.dynamic.b.H(parcel.readStrongBinder());
                com.google.android.gms.dynamic.a aVarH13 = com.google.android.gms.dynamic.b.H(parcel.readStrongBinder());
                o5.d(parcel);
                logHealthData(i2, string19, aVarH11, aVarH12, aVarH13);
                break;
            case Token.GETPROPNOWARN /* 34 */:
                IBinder strongBinder14 = parcel.readStrongBinder();
                if (strongBinder14 != null) {
                    IInterface iInterfaceQueryLocalInterface14 = strongBinder14.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    e6Var3 = iInterfaceQueryLocalInterface14 instanceof f6 ? (f6) iInterfaceQueryLocalInterface14 : new e6(strongBinder14);
                }
                o5.d(parcel);
                setEventInterceptor(e6Var3);
                break;
            case 35:
                IBinder strongBinder15 = parcel.readStrongBinder();
                if (strongBinder15 != null) {
                    IInterface iInterfaceQueryLocalInterface15 = strongBinder15.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    e6Var2 = iInterfaceQueryLocalInterface15 instanceof f6 ? (f6) iInterfaceQueryLocalInterface15 : new e6(strongBinder15);
                }
                o5.d(parcel);
                registerOnMeasurementEventListener(e6Var2);
                break;
            case Token.GETPROPNOWARN_SUPER /* 36 */:
                IBinder strongBinder16 = parcel.readStrongBinder();
                if (strongBinder16 != null) {
                    IInterface iInterfaceQueryLocalInterface16 = strongBinder16.queryLocalInterface("com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
                    e6Var = iInterfaceQueryLocalInterface16 instanceof f6 ? (f6) iInterfaceQueryLocalInterface16 : new e6(strongBinder16);
                }
                o5.d(parcel);
                unregisterOnMeasurementEventListener(e6Var);
                break;
            case Token.SETPROP /* 37 */:
                HashMap hashMap = parcel.readHashMap(o5.a);
                o5.d(parcel);
                initForTests(hashMap);
                break;
            case Token.SETPROP_SUPER /* 38 */:
                IBinder strongBinder17 = parcel.readStrongBinder();
                if (strongBinder17 != null) {
                    IInterface iInterfaceQueryLocalInterface17 = strongBinder17.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    a6Var5 = iInterfaceQueryLocalInterface17 instanceof b6 ? (b6) iInterfaceQueryLocalInterface17 : new a6(strongBinder17);
                }
                int i3 = parcel.readInt();
                o5.d(parcel);
                getTestFlag(a6Var5, i3);
                break;
            case Token.GETELEM /* 39 */:
                ClassLoader classLoader4 = o5.a;
                boolean z7 = parcel.readInt() != 0;
                o5.d(parcel);
                setDataCollectionEnabled(z7);
                break;
            case Token.GETELEM_SUPER /* 40 */:
                IBinder strongBinder18 = parcel.readStrongBinder();
                if (strongBinder18 != null) {
                    IInterface iInterfaceQueryLocalInterface18 = strongBinder18.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    a6Var4 = iInterfaceQueryLocalInterface18 instanceof b6 ? (b6) iInterfaceQueryLocalInterface18 : new a6(strongBinder18);
                }
                o5.d(parcel);
                isDataCollectionEnabled(a6Var4);
                break;
            case Token.SETELEM /* 41 */:
            case Token.NULL /* 47 */:
            case Token.FALSE /* 49 */:
            default:
                return false;
            case Token.SETELEM_SUPER /* 42 */:
                Bundle bundle7 = (Bundle) o5.a(parcel, Bundle.CREATOR);
                o5.d(parcel);
                setDefaultEventParameters(bundle7);
                break;
            case Token.CALL /* 43 */:
                long j22 = parcel.readLong();
                o5.d(parcel);
                clearMeasurementEnabled(j22);
                break;
            case Token.NAME /* 44 */:
                Bundle bundle8 = (Bundle) o5.a(parcel, Bundle.CREATOR);
                long j23 = parcel.readLong();
                o5.d(parcel);
                setConsent(bundle8, j23);
                break;
            case Token.NUMBER /* 45 */:
                Bundle bundle9 = (Bundle) o5.a(parcel, Bundle.CREATOR);
                long j24 = parcel.readLong();
                o5.d(parcel);
                setConsentThirdParty(bundle9, j24);
                break;
            case Token.STRING /* 46 */:
                IBinder strongBinder19 = parcel.readStrongBinder();
                if (strongBinder19 != null) {
                    IInterface iInterfaceQueryLocalInterface19 = strongBinder19.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    a6Var3 = iInterfaceQueryLocalInterface19 instanceof b6 ? (b6) iInterfaceQueryLocalInterface19 : new a6(strongBinder19);
                }
                o5.d(parcel);
                getSessionId(a6Var3);
                break;
            case Token.THIS /* 48 */:
                Intent intent = (Intent) o5.a(parcel, Intent.CREATOR);
                o5.d(parcel);
                setSgtmDebugInfo(intent);
                break;
            case Token.TRUE /* 50 */:
                l6 l6Var = (l6) o5.a(parcel, l6.CREATOR);
                String string20 = parcel.readString();
                String string21 = parcel.readString();
                long j25 = parcel.readLong();
                o5.d(parcel);
                setCurrentScreenByScionActivityInfo(l6Var, string20, string21, j25);
                break;
            case Token.SHEQ /* 51 */:
                l6 l6Var2 = (l6) o5.a(parcel, l6.CREATOR);
                long j26 = parcel.readLong();
                o5.d(parcel);
                onActivityStartedByScionActivityInfo(l6Var2, j26);
                break;
            case Token.SHNE /* 52 */:
                l6 l6Var3 = (l6) o5.a(parcel, l6.CREATOR);
                long j27 = parcel.readLong();
                o5.d(parcel);
                onActivityStoppedByScionActivityInfo(l6Var3, j27);
                break;
            case Token.REGEXP /* 53 */:
                l6 l6Var4 = (l6) o5.a(parcel, l6.CREATOR);
                Bundle bundle10 = (Bundle) o5.a(parcel, Bundle.CREATOR);
                long j28 = parcel.readLong();
                o5.d(parcel);
                onActivityCreatedByScionActivityInfo(l6Var4, bundle10, j28);
                break;
            case Token.BINDNAME /* 54 */:
                l6 l6Var5 = (l6) o5.a(parcel, l6.CREATOR);
                long j29 = parcel.readLong();
                o5.d(parcel);
                onActivityDestroyedByScionActivityInfo(l6Var5, j29);
                break;
            case Token.THROW /* 55 */:
                l6 l6Var6 = (l6) o5.a(parcel, l6.CREATOR);
                long j30 = parcel.readLong();
                o5.d(parcel);
                onActivityPausedByScionActivityInfo(l6Var6, j30);
                break;
            case Token.RETHROW /* 56 */:
                l6 l6Var7 = (l6) o5.a(parcel, l6.CREATOR);
                long j31 = parcel.readLong();
                o5.d(parcel);
                onActivityResumedByScionActivityInfo(l6Var7, j31);
                break;
            case Token.IN /* 57 */:
                l6 l6Var8 = (l6) o5.a(parcel, l6.CREATOR);
                IBinder strongBinder20 = parcel.readStrongBinder();
                if (strongBinder20 != null) {
                    IInterface iInterfaceQueryLocalInterface20 = strongBinder20.queryLocalInterface("com.google.android.gms.measurement.api.internal.IBundleReceiver");
                    a6Var2 = iInterfaceQueryLocalInterface20 instanceof b6 ? (b6) iInterfaceQueryLocalInterface20 : new a6(strongBinder20);
                }
                long j32 = parcel.readLong();
                o5.d(parcel);
                onActivitySaveInstanceStateByScionActivityInfo(l6Var8, a6Var2, j32);
                break;
            case Token.INSTANCEOF /* 58 */:
                IBinder strongBinder21 = parcel.readStrongBinder();
                if (strongBinder21 != null) {
                    IInterface iInterfaceQueryLocalInterface21 = strongBinder21.queryLocalInterface("com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback");
                    c6Var = iInterfaceQueryLocalInterface21 instanceof d6 ? (d6) iInterfaceQueryLocalInterface21 : new c6(strongBinder21, "com.google.android.gms.measurement.api.internal.IDynamiteUploadBatchesCallback", 2);
                }
                o5.d(parcel);
                retrieveAndUploadBatches(c6Var);
                break;
            case Token.LOCAL_LOAD /* 59 */:
                String string22 = parcel.readString();
                String string23 = parcel.readString();
                Bundle bundle11 = (Bundle) o5.a(parcel, Bundle.CREATOR);
                if (parcel.readInt() != 0) {
                    z = true;
                }
                boolean z8 = parcel.readInt() != 0;
                long j33 = parcel.readLong();
                long j34 = parcel.readLong();
                o5.d(parcel);
                logEventWithElapsedTime(string22, string23, bundle11, z, z8, j33, j34);
                break;
            case 60:
                com.google.android.gms.dynamic.a aVarH14 = com.google.android.gms.dynamic.b.H(parcel.readStrongBinder());
                j6 j6Var2 = (j6) o5.a(parcel, j6.CREATOR);
                long j35 = parcel.readLong();
                long j36 = parcel.readLong();
                o5.d(parcel);
                initializeWithElapsedTime(aVarH14, j6Var2, j35, j36);
                break;
            case 61:
                long j37 = parcel.readLong();
                long j38 = parcel.readLong();
                o5.d(parcel);
                resetAnalyticsDataWithElapsedTime(j37, j38);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
