package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class q {
    public final String a;
    public final String b;
    public final String c;
    public final long d;
    public final long e;
    public final long f;
    public final t g;

    public q(s1 s1Var, String str, String str2, String str3, long j, long j2, long j3, Bundle bundle) {
        t tVar;
        com.google.android.gms.common.internal.x.d(str2);
        com.google.android.gms.common.internal.x.d(str3);
        this.a = str2;
        this.b = str3;
        this.c = true == TextUtils.isEmpty(str) ? null : str;
        this.d = j;
        this.e = j2;
        this.f = j3;
        if (j3 != 0 && j3 > j) {
            x0 x0Var = s1Var.C;
            s1.m(x0Var);
            x0Var.F.b(x0.D(str2), "Event created with reverse previous/current timestamps. appId");
        }
        if (bundle == null || bundle.isEmpty()) {
            tVar = new t(new Bundle());
        } else {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    x0 x0Var2 = s1Var.C;
                    s1.m(x0Var2);
                    x0Var2.C.a("Param name can't be null");
                    it.remove();
                } else {
                    r4 r4Var = s1Var.F;
                    s1.k(r4Var);
                    Object objE = r4Var.E(bundle2.get(next), next);
                    if (objE == null) {
                        x0 x0Var3 = s1Var.C;
                        s1.m(x0Var3);
                        x0Var3.F.b(s1Var.G.b(next), "Param value can't be null");
                        it.remove();
                    } else {
                        r4 r4Var2 = s1Var.F;
                        s1.k(r4Var2);
                        r4Var2.M(bundle2, next, objE);
                    }
                }
            }
            tVar = new t(bundle2);
        }
        this.g = tVar;
    }

    public final q a(s1 s1Var, long j) {
        return new q(s1Var, this.c, this.a, this.b, this.d, this.e, j, this.g);
    }

    public final String toString() {
        String string = this.g.toString();
        String str = this.a;
        int length = String.valueOf(str).length();
        String str2 = this.b;
        StringBuilder sb = new StringBuilder(length + 22 + String.valueOf(str2).length() + 10 + string.length() + 1);
        androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.y(sb, "Event{appId='", str, "', name='", str2);
        return androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.k(sb, "', params=", string, "}");
    }

    public q(s1 s1Var, String str, String str2, String str3, long j, long j2, long j3, t tVar) {
        com.google.android.gms.common.internal.x.d(str2);
        com.google.android.gms.common.internal.x.d(str3);
        com.google.android.gms.common.internal.x.g(tVar);
        this.a = str2;
        this.b = str3;
        this.c = true == TextUtils.isEmpty(str) ? null : str;
        this.d = j;
        this.e = j2;
        this.f = j3;
        if (j3 != 0 && j3 > j) {
            x0 x0Var = s1Var.C;
            s1.m(x0Var);
            x0Var.F.c(x0.D(str2), x0.D(str3), "Event created with reverse previous/current timestamps. appId, name");
        }
        this.g = tVar;
    }
}
