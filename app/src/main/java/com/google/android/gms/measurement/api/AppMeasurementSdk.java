package com.google.android.gms.measurement.api;

import android.content.Context;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.Keep;
import com.google.android.gms.internal.measurement.a7;
import com.google.android.gms.internal.measurement.m6;
import com.google.android.gms.internal.measurement.n6;
import com.google.android.gms.internal.measurement.q6;
import com.google.android.gms.internal.measurement.s6;
import com.google.android.gms.internal.measurement.w5;
import com.google.android.gms.internal.measurement.x6;
import com.google.firebase.analytics.connector.internal.b;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class AppMeasurementSdk {
    public final a7 a;

    public AppMeasurementSdk(a7 a7Var) {
        this.a = a7Var;
    }

    @Keep
    public static AppMeasurementSdk getInstance(Context context) {
        return a7.c(context, null).b;
    }

    public final void a(b bVar) {
        a7 a7Var = this.a;
        ArrayList arrayList = a7Var.c;
        synchronized (arrayList) {
            for (int i = 0; i < arrayList.size(); i++) {
                try {
                    if (bVar.equals(((Pair) arrayList.get(i)).first)) {
                        Log.w("FA", "OnEventListener already registered.");
                        return;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            x6 x6Var = new x6(bVar);
            arrayList.add(new Pair(bVar, x6Var));
            if (a7Var.f != null) {
                try {
                    a7Var.f.registerOnMeasurementEventListener(x6Var);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                    Log.w("FA", "Failed to register event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            a7Var.a(new m6(a7Var, x6Var, 4));
        }
    }

    @Keep
    public void beginAdUnitExposure(String str) {
        a7 a7Var = this.a;
        a7Var.a(new q6(a7Var, str, 0));
    }

    @Keep
    public void endAdUnitExposure(String str) {
        a7 a7Var = this.a;
        a7Var.a(new q6(a7Var, str, 1));
    }

    @Keep
    public long generateEventId() {
        return this.a.d();
    }

    @Keep
    public String getAppInstanceId() {
        w5 w5Var = new w5();
        a7 a7Var = this.a;
        a7Var.a(new s6(a7Var, w5Var, 1));
        return (String) w5.h(w5Var.g(50L), String.class);
    }

    @Keep
    public String getGmpAppId() {
        w5 w5Var = new w5();
        a7 a7Var = this.a;
        a7Var.a(new s6(a7Var, w5Var, 0));
        return (String) w5.h(w5Var.g(500L), String.class);
    }

    @Keep
    public void logEvent(String str, String str2, Bundle bundle) {
        a7 a7Var = this.a;
        a7Var.a(new n6(a7Var, str, str2, bundle, 1));
    }
}
