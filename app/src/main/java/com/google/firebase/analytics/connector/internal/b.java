package com.google.firebase.analytics.connector.internal;

import android.os.Bundle;
import com.google.android.gms.measurement.internal.g2;
import com.google.android.gms.measurement.internal.h2;
import com.google.common.collect.k0;
import com.google.common.util.concurrent.g0;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class b implements h2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ b(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.google.android.gms.measurement.internal.h2
    public final void a(String str, String str2, Bundle bundle, long j) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                g0 g0Var = (g0) obj;
                if (((HashSet) g0Var.y).contains(str2)) {
                    Bundle bundle2 = new Bundle();
                    k0 k0Var = a.a;
                    String strG = g2.g(str2, g2.f, g2.a);
                    if (strG != null) {
                        str2 = strG;
                    }
                    bundle2.putString("events", str2);
                    ((g0) g0Var.z).w(2, bundle2);
                    break;
                }
                break;
            default:
                if (str != null && !a.a.contains(str2)) {
                    Bundle bundle3 = new Bundle();
                    bundle3.putString("name", str2);
                    bundle3.putLong("timestampInMillis", j);
                    bundle3.putBundle("params", bundle);
                    ((g0) ((com.google.android.material.internal.b) obj).e).w(3, bundle3);
                    break;
                }
                break;
        }
    }
}
