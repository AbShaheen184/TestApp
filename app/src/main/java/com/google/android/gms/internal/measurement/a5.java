package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public class a5 implements d5, z4 {
    public final HashMap e = new HashMap();

    @Override // com.google.android.gms.internal.measurement.d5
    public final Iterator b() {
        return new u4(this.e.keySet().iterator());
    }

    @Override // com.google.android.gms.internal.measurement.d5
    public final Boolean c() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.d5
    public final String d() {
        return "[object Object]";
    }

    @Override // com.google.android.gms.internal.measurement.z4
    public final d5 e(String str) {
        HashMap map = this.e;
        return map.containsKey(str) ? (d5) map.get(str) : d5.m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a5) {
            return this.e.equals(((a5) obj).e);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.z4
    public final void f(String str, d5 d5Var) {
        HashMap map = this.e;
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
        return this.e.hashCode();
    }

    @Override // com.google.android.gms.internal.measurement.z4
    public final boolean i(String str) {
        return this.e.containsKey(str);
    }

    @Override // com.google.android.gms.internal.measurement.d5
    public d5 j(String str, b7 b7Var, ArrayList arrayList) {
        return "toString".equals(str) ? new g5(toString()) : z4.k(this, new g5(str), b7Var, arrayList);
    }

    @Override // com.google.android.gms.internal.measurement.d5
    public final d5 l() {
        a5 a5Var = new a5();
        for (Map.Entry entry : this.e.entrySet()) {
            boolean z = entry.getValue() instanceof z4;
            HashMap map = a5Var.e;
            if (z) {
                map.put((String) entry.getKey(), (d5) entry.getValue());
            } else {
                map.put((String) entry.getKey(), ((d5) entry.getValue()).l());
            }
        }
        return a5Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{");
        HashMap map = this.e;
        if (!map.isEmpty()) {
            for (String str : map.keySet()) {
                sb.append(String.format("%s: %s,", str, map.get(str)));
            }
            sb.deleteCharAt(sb.lastIndexOf(","));
        }
        sb.append("}");
        return sb.toString();
    }
}
