package com.appsalt.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.display.DisplayManager;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.BatteryManager;
import android.os.Build;
import android.telephony.SignalStrength;
import android.telephony.TelephonyManager;
import android.view.Display;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class x2 implements f5 {
    public final androidx.media3.exoplayer.dash.manifest.t a;
    public final n b;
    public final DisplayManager c;
    public final BatteryManager d;
    public final ConnectivityManager e;
    public final TelephonyManager f;

    public x2(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("uid", 0);
        androidx.media3.exoplayer.dash.manifest.t tVar = new androidx.media3.exoplayer.dash.manifest.t(context);
        this.a = tVar;
        String string = sharedPreferences.getString("uid", null);
        if (string == null) {
            string = kotlin.text.r.M(UUID.randomUUID().toString(), "-", "", false);
            sharedPreferences.edit().putString("uid", string).apply();
        }
        String str = string;
        String string2 = ((SharedPreferences) tVar.y).getString("apiKey", "");
        String string3 = sharedPreferences.getString("puid", null);
        if (string3 == null) {
            string3 = kotlin.text.r.M(UUID.randomUUID().toString(), "-", "", false);
            sharedPreferences.edit().putString("puid", string3).apply();
        }
        String string4 = context.getApplicationInfo().loadLabel(context.getPackageManager()).toString();
        String packageName = context.getApplicationContext().getPackageName();
        String str2 = Build.VERSION.RELEASE;
        this.b = new n(str, string2, string3, string4, packageName);
        this.c = (DisplayManager) context.getSystemService("display");
        this.d = (BatteryManager) context.getSystemService("batterymanager");
        this.e = (ConnectivityManager) context.getSystemService("connectivity");
        this.f = (TelephonyManager) context.getSystemService("phone");
    }

    /* JADX WARN: Code duplicated, block: B:41:0x0082 A[PHI: r1
  0x0082: PHI (r1v8 int) = (r1v0 int), (r1v6 int) binds: [B:40:0x0080, B:43:0x0089] A[DONT_GENERATE, DONT_INLINE]] */
    public final p0 a() {
        Boolean boolValueOf;
        SignalStrength signalStrength;
        Network activeNetwork;
        Display[] displays;
        boolean z;
        int i = 2;
        Integer numValueOf = null;
        DisplayManager displayManager = this.c;
        if (displayManager == null || (displays = displayManager.getDisplays()) == null) {
            boolValueOf = null;
        } else {
            int length = displays.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    z = false;
                    break;
                }
                if (displays[i2].getState() == 2) {
                    z = true;
                    break;
                }
                i2++;
            }
            boolValueOf = Boolean.valueOf(z);
        }
        Boolean boolValueOf2 = boolValueOf != null ? Boolean.valueOf(!boolValueOf.booleanValue()) : null;
        int i3 = 4;
        BatteryManager batteryManager = this.d;
        Integer numValueOf2 = batteryManager != null ? Integer.valueOf(batteryManager.getIntProperty(4)) : null;
        ConnectivityManager connectivityManager = this.e;
        Boolean boolValueOf3 = connectivityManager != null ? Boolean.valueOf(connectivityManager.isActiveNetworkMetered()) : null;
        Boolean boolValueOf4 = batteryManager != null ? Boolean.valueOf(batteryManager.isCharging()) : null;
        TelephonyManager telephonyManager = this.f;
        Boolean boolValueOf5 = telephonyManager != null ? Boolean.valueOf(telephonyManager.isNetworkRoaming()) : null;
        NetworkCapabilities networkCapabilities = (connectivityManager == null || (activeNetwork = connectivityManager.getActiveNetwork()) == null) ? null : connectivityManager.getNetworkCapabilities(activeNetwork);
        if (networkCapabilities != null) {
            if (networkCapabilities.hasTransport(1)) {
                i3 = i;
            } else {
                i = 3;
                if (networkCapabilities.hasTransport(3)) {
                    i3 = i;
                } else if (networkCapabilities.hasTransport(0)) {
                    i3 = 1;
                }
            }
        }
        if (Build.VERSION.SDK_INT < 28) {
            numValueOf = 0;
        } else if (telephonyManager != null && (signalStrength = telephonyManager.getSignalStrength()) != null) {
            numValueOf = Integer.valueOf(signalStrength.getLevel());
        }
        return new p0(boolValueOf2, numValueOf2, boolValueOf3, boolValueOf4, boolValueOf5, i3, numValueOf);
    }
}
