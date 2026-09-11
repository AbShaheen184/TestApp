package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class r2 implements d5 {
    public final d5 e;
    public final String y;

    public r2(String str) {
        this.e = d5.m;
        this.y = str;
    }

    @Override // com.google.android.gms.internal.measurement.d5
    public final Iterator b() {
        return null;
    }

    @Override // com.google.android.gms.internal.measurement.d5
    public final Boolean c() {
        throw new IllegalStateException("Control is not a boolean");
    }

    @Override // com.google.android.gms.internal.measurement.d5
    public final String d() {
        throw new IllegalStateException("Control is not a String");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof r2)) {
            return false;
        }
        r2 r2Var = (r2) obj;
        return this.y.equals(r2Var.y) && this.e.equals(r2Var.e);
    }

    @Override // com.google.android.gms.internal.measurement.d5
    public final Double h() {
        throw new IllegalStateException("Control is not a double");
    }

    public final int hashCode() {
        return this.e.hashCode() + (this.y.hashCode() * 31);
    }

    @Override // com.google.android.gms.internal.measurement.d5
    public final d5 j(String str, b7 b7Var, ArrayList arrayList) {
        throw new IllegalStateException("Control does not have functions");
    }

    @Override // com.google.android.gms.internal.measurement.d5
    public final d5 l() {
        return new r2(this.y, this.e.l());
    }

    public r2(String str, d5 d5Var) {
        this.e = d5Var;
        this.y = str;
    }
}
