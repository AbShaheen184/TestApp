package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class ed {
    public final boolean a;
    public final List b;
    public final t0 c;
    public final String d;
    public final String e;
    public final List f;
    public final List g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final nb k;

    public ed(boolean z, com.google.common.collect.h0 h0Var, t0 t0Var, String str, String str2, com.google.common.collect.h0 h0Var2, com.google.common.collect.h0 h0Var3, boolean z2, boolean z3, boolean z4, nb nbVar) {
        h0Var.getClass();
        t0Var.getClass();
        str.getClass();
        str2.getClass();
        h0Var2.getClass();
        h0Var3.getClass();
        nbVar.getClass();
        this.a = z;
        this.b = h0Var;
        this.c = t0Var;
        this.d = str;
        this.e = str2;
        this.f = h0Var2;
        this.g = h0Var3;
        this.h = z2;
        this.i = z3;
        this.j = z4;
        this.k = nbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ed)) {
            return false;
        }
        ed edVar = (ed) obj;
        return this.a == edVar.a && kotlin.jvm.internal.l.a(this.b, edVar.b) && kotlin.jvm.internal.l.a(this.c, edVar.c) && kotlin.jvm.internal.l.a(this.d, edVar.d) && kotlin.jvm.internal.l.a(this.e, edVar.e) && kotlin.jvm.internal.l.a(this.f, edVar.f) && kotlin.jvm.internal.l.a(this.g, edVar.g) && this.h == edVar.h && this.i == edVar.i && this.j == edVar.j && kotlin.jvm.internal.l.a(this.k, edVar.k);
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.a), this.b, this.c, this.d, this.e, this.f, this.g, Boolean.valueOf(this.h), Boolean.valueOf(this.i), Boolean.valueOf(this.j));
    }

    public final String toString() {
        boolean z = this.a;
        int length = String.valueOf(z).length();
        List list = this.b;
        int length2 = String.valueOf(list).length();
        t0 t0Var = this.c;
        int length3 = String.valueOf(t0Var).length();
        String str = this.d;
        int length4 = String.valueOf(str).length();
        String str2 = this.e;
        int length5 = String.valueOf(str2).length();
        List list2 = this.f;
        int length6 = String.valueOf(list2).length();
        List list3 = this.g;
        int length7 = String.valueOf(list3).length();
        boolean z2 = this.h;
        int length8 = String.valueOf(z2).length();
        boolean z3 = this.i;
        int length9 = String.valueOf(z3).length();
        boolean z4 = this.j;
        int length10 = String.valueOf(z4).length();
        nb nbVar = this.k;
        StringBuilder sb = new StringBuilder(length + 59 + length2 + 9 + length3 + 10 + length4 + 17 + length5 + 30 + length6 + 30 + length7 + 24 + length8 + 26 + length9 + 20 + length10 + 14 + String.valueOf(nbVar).length() + 1);
        sb.append("SharedStorageInfo(shouldUseSharedStorage=");
        sb.append(z);
        sb.append(", enabledBackings=");
        sb.append(list);
        sb.append(", secret=");
        sb.append(t0Var);
        sb.append(", dirPath=");
        sb.append(str);
        sb.append(", gmsCoreDirPath=");
        sb.append(str2);
        sb.append(", includeStaticConfigPackages=");
        sb.append(list2);
        sb.append(", excludeStaticConfigPackages=");
        sb.append(list3);
        sb.append(", hasStorageInfoFromGms=");
        sb.append(z2);
        sb.append(", allowEmptySnapshotToken=");
        sb.append(z3);
        sb.append(", enableCommitV2Api=");
        sb.append(z4);
        sb.append(", clientFlags=");
        sb.append(nbVar);
        sb.append(")");
        return sb.toString();
    }
}
