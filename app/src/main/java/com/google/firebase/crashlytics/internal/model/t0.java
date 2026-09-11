package com.google.firebase.crashlytics.internal.model;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 extends x1 {
    public final String a;
    public final String b;
    public final List c;
    public final x1 d;
    public final int e;

    public t0(String str, String str2, List list, x1 x1Var, int i) {
        this.a = str;
        this.b = str2;
        this.c = list;
        this.d = x1Var;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof x1) {
            t0 t0Var = (t0) ((x1) obj);
            if (this.a.equals(t0Var.a)) {
                String str = t0Var.b;
                String str2 = this.b;
                if (str2 != null ? str2.equals(str) : str == null) {
                    if (this.c.equals(t0Var.c)) {
                        x1 x1Var = t0Var.d;
                        x1 x1Var2 = this.d;
                        if (x1Var2 != null ? x1Var2.equals(x1Var) : x1Var == null) {
                            if (this.e == t0Var.e) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        String str = this.b;
        int iHashCode2 = (((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003;
        x1 x1Var = this.d;
        return ((iHashCode2 ^ (x1Var != null ? x1Var.hashCode() : 0)) * 1000003) ^ this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Exception{type=");
        sb.append(this.a);
        sb.append(", reason=");
        sb.append(this.b);
        sb.append(", frames=");
        sb.append(this.c);
        sb.append(", causedBy=");
        sb.append(this.d);
        sb.append(", overflowCount=");
        return androidx.privacysandbox.ads.adservices.java.internal.a.m(this.e, "}", sb);
    }
}
