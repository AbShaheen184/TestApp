package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class e5 implements d5 {
    public final String e;
    public final ArrayList y;

    public e5(String str, ArrayList arrayList) {
        this.e = str;
        ArrayList arrayList2 = new ArrayList();
        this.y = arrayList2;
        arrayList2.addAll(arrayList);
    }

    @Override // com.google.android.gms.internal.measurement.d5
    public final Iterator b() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.d5
    public final Boolean c() {
        throw new IllegalStateException("Statement cannot be cast as Boolean");
    }

    @Override // com.google.android.gms.internal.measurement.d5
    public final String d() {
        throw new IllegalStateException("Statement cannot be cast as String");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e5)) {
            return false;
        }
        e5 e5Var = (e5) obj;
        String str = e5Var.e;
        String str2 = this.e;
        if (str2 == null ? str == null : str2.equals(str)) {
            return this.y.equals(e5Var.y);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.d5
    public final Double h() {
        throw new IllegalStateException("Statement cannot be cast as Double");
    }

    public final int hashCode() {
        String str = this.e;
        return this.y.hashCode() + ((str != null ? str.hashCode() : 0) * 31);
    }

    @Override // com.google.android.gms.internal.measurement.d5
    public final d5 j(String str, b7 b7Var, ArrayList arrayList) {
        throw new IllegalStateException("Statement is not an evaluated entity");
    }

    @Override // com.google.android.gms.internal.measurement.d5
    public final d5 l() {
        return this;
    }
}
