package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c4 implements d5, z4 {
    public final String e;
    public final HashMap y = new HashMap();

    public c4(String str) {
        this.e = str;
    }

    public abstract d5 a(b7 b7Var, List list);

    @Override // com.google.android.gms.internal.measurement.d5
    public final Iterator b() {
        return new u4(this.y.keySet().iterator());
    }

    @Override // com.google.android.gms.internal.measurement.d5
    public final Boolean c() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.d5
    public final String d() {
        return this.e;
    }

    @Override // com.google.android.gms.internal.measurement.z4
    public final d5 e(String str) {
        HashMap map = this.y;
        return map.containsKey(str) ? (d5) map.get(str) : d5.m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c4)) {
            return false;
        }
        c4 c4Var = (c4) obj;
        String str = this.e;
        if (str != null) {
            return str.equals(c4Var.e);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.z4
    public final void f(String str, d5 d5Var) {
        HashMap map = this.y;
        if (d5Var == null) {
            map.remove(str);
        } else {
            map.put(str, d5Var);
        }
    }

    @Override // com.google.android.gms.internal.measurement.d5
    public final Double h() {
        return Double.valueOf(Double.NaN);
    }

    public final int hashCode() {
        String str = this.e;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.z4
    public final boolean i(String str) {
        return this.y.containsKey(str);
    }

    @Override // com.google.android.gms.internal.measurement.d5
    public final d5 j(String str, b7 b7Var, ArrayList arrayList) {
        return "toString".equals(str) ? new g5(this.e) : z4.k(this, new g5(str), b7Var, arrayList);
    }

    @Override // com.google.android.gms.internal.measurement.d5
    public d5 l() {
        return this;
    }
}
