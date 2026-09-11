package com.google.firebase.analytics;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.a7;
import com.google.android.gms.internal.measurement.m6;
import com.google.android.gms.internal.measurement.n6;
import com.google.android.gms.internal.measurement.o6;
import com.google.android.gms.internal.measurement.p6;
import com.google.android.gms.internal.measurement.q6;
import com.google.android.gms.internal.measurement.s6;
import com.google.android.gms.internal.measurement.t6;
import com.google.android.gms.internal.measurement.w5;
import com.google.android.gms.measurement.internal.w2;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements w2 {
    public final /* synthetic */ a7 a;

    public a(a7 a7Var) {
        this.a = a7Var;
    }

    @Override // com.google.android.gms.measurement.internal.w2
    public final String c() {
        w5 w5Var = new w5();
        a7 a7Var = this.a;
        a7Var.a(new s6(a7Var, w5Var, 3, false));
        return (String) w5.h(w5Var.g(500L), String.class);
    }

    @Override // com.google.android.gms.measurement.internal.w2
    public final void e(String str, String str2, Bundle bundle) {
        a7 a7Var = this.a;
        a7Var.a(new n6(a7Var, str, str2, bundle, 1));
    }

    @Override // com.google.android.gms.measurement.internal.w2
    public final String f() {
        w5 w5Var = new w5();
        a7 a7Var = this.a;
        a7Var.a(new s6(a7Var, w5Var, 4, false));
        return (String) w5.h(w5Var.g(500L), String.class);
    }

    @Override // com.google.android.gms.measurement.internal.w2
    public final void g(Bundle bundle) {
        a7 a7Var = this.a;
        a7Var.a(new m6(a7Var, bundle, 1));
    }

    @Override // com.google.android.gms.measurement.internal.w2
    public final long h() {
        return this.a.d();
    }

    @Override // com.google.android.gms.measurement.internal.w2
    public final void i(String str) {
        a7 a7Var = this.a;
        a7Var.a(new q6(a7Var, str, 1));
    }

    @Override // com.google.android.gms.measurement.internal.w2
    public final void j(String str) {
        a7 a7Var = this.a;
        a7Var.a(new q6(a7Var, str, 0));
    }

    @Override // com.google.android.gms.measurement.internal.w2
    public final void k(String str, String str2, Bundle bundle) {
        a7 a7Var = this.a;
        a7Var.a(new n6(a7Var, str, str2, bundle, 0));
    }

    @Override // com.google.android.gms.measurement.internal.w2
    public final List l(String str, String str2) {
        w5 w5Var = new w5();
        a7 a7Var = this.a;
        a7Var.a(new o6(a7Var, str, str2, w5Var));
        List list = (List) w5.h(w5Var.g(5000L), List.class);
        return list == null ? Collections.EMPTY_LIST : list;
    }

    @Override // com.google.android.gms.measurement.internal.w2
    public final int m(String str) {
        w5 w5Var = new w5();
        a7 a7Var = this.a;
        a7Var.a(new p6(a7Var, str, w5Var, 1));
        Integer num = (Integer) w5.h(w5Var.g(10000L), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    @Override // com.google.android.gms.measurement.internal.w2
    public final String n() {
        w5 w5Var = new w5();
        a7 a7Var = this.a;
        a7Var.a(new s6(a7Var, w5Var, 1));
        return (String) w5.h(w5Var.g(50L), String.class);
    }

    @Override // com.google.android.gms.measurement.internal.w2
    public final String o() {
        w5 w5Var = new w5();
        a7 a7Var = this.a;
        a7Var.a(new s6(a7Var, w5Var, 0));
        return (String) w5.h(w5Var.g(500L), String.class);
    }

    @Override // com.google.android.gms.measurement.internal.w2
    public final Map p(String str, String str2, boolean z) {
        w5 w5Var = new w5();
        a7 a7Var = this.a;
        a7Var.a(new t6(a7Var, str, str2, z, w5Var));
        Bundle bundleG = w5Var.g(5000L);
        if (bundleG == null || bundleG.size() == 0) {
            return Collections.EMPTY_MAP;
        }
        HashMap map = new HashMap(bundleG.size());
        for (String str3 : bundleG.keySet()) {
            Object obj = bundleG.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                map.put(str3, obj);
            }
        }
        return map;
    }
}
