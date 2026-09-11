package com.google.firebase.analytics.connector;

import android.os.Bundle;
import com.google.android.gms.common.internal.x;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.c0;
import com.google.common.collect.a1;
import com.google.common.util.concurrent.g0;
import java.util.concurrent.ConcurrentHashMap;
import retrofit2.g;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements a {
    public static volatile b c;
    public final AppMeasurementSdk a;
    public final ConcurrentHashMap b;

    public b(AppMeasurementSdk appMeasurementSdk) {
        x.g(appMeasurementSdk);
        this.a = appMeasurementSdk;
        this.b = new ConcurrentHashMap();
    }

    public final void a(String str, String str2, Bundle bundle) {
        if (com.google.firebase.analytics.connector.internal.a.c.contains(str) || com.google.firebase.analytics.connector.internal.a.b.contains(str2)) {
            return;
        }
        a1 a1Var = com.google.firebase.analytics.connector.internal.a.d;
        int i = a1Var.A;
        int i2 = 0;
        int i3 = 0;
        while (i3 < i) {
            boolean zContainsKey = bundle.containsKey((String) a1Var.get(i3));
            i3++;
            if (zContainsKey) {
                return;
            }
        }
        if ("_cmp".equals(str2)) {
            if (com.google.firebase.analytics.connector.internal.a.c.contains(str)) {
                return;
            }
            a1 a1Var2 = com.google.firebase.analytics.connector.internal.a.d;
            int i4 = a1Var2.A;
            while (i2 < i4) {
                boolean zContainsKey2 = bundle.containsKey((String) a1Var2.get(i2));
                i2++;
                if (zContainsKey2) {
                    return;
                }
            }
            int iHashCode = str.hashCode();
            if (iHashCode != 101200) {
                if (iHashCode != 101230) {
                    if (iHashCode != 3142703 || !str.equals("fiam")) {
                        return;
                    } else {
                        bundle.putString("_cis", "fiam_integration");
                    }
                } else if (!str.equals("fdl")) {
                    return;
                } else {
                    bundle.putString("_cis", "fdl_integration");
                }
            } else if (!str.equals("fcm")) {
                return;
            } else {
                bundle.putString("_cis", "fcm_integration");
            }
        }
        if ("clx".equals(str) && "_ae".equals(str2)) {
            bundle.putLong("_r", 1L);
        }
        this.a.logEvent(str, str2, bundle);
    }

    public final c0 b(String str, g0 g0Var) {
        g bVar;
        if (!com.google.firebase.analytics.connector.internal.a.c.contains(str)) {
            boolean zIsEmpty = str.isEmpty();
            ConcurrentHashMap concurrentHashMap = this.b;
            if (zIsEmpty || !concurrentHashMap.containsKey(str) || concurrentHashMap.get(str) == null) {
                boolean zEquals = "fiam".equals(str);
                AppMeasurementSdk appMeasurementSdk = this.a;
                if (zEquals) {
                    bVar = new g0(appMeasurementSdk, g0Var);
                } else {
                    bVar = "clx".equals(str) ? new com.google.android.material.internal.b(appMeasurementSdk, g0Var) : null;
                }
                if (bVar != null) {
                    concurrentHashMap.put(str, bVar);
                    return new c0(8);
                }
            }
        }
        return null;
    }
}
