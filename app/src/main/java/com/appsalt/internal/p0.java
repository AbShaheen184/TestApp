package com.appsalt.internal;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class p0 {
    public final Boolean a;
    public final Integer b;
    public final Boolean c;
    public final Boolean d;
    public final Boolean e;
    public final int f;
    public final Integer g;

    public p0(Boolean bool, Integer num, Boolean bool2, Boolean bool3, Boolean bool4, int i, Integer num2) {
        this.a = bool;
        this.b = num;
        this.c = bool2;
        this.d = bool3;
        this.e = bool4;
        this.f = i;
        this.g = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return kotlin.jvm.internal.l.a(this.a, p0Var.a) && kotlin.jvm.internal.l.a(this.b, p0Var.b) && kotlin.jvm.internal.l.a(this.c, p0Var.c) && kotlin.jvm.internal.l.a(this.d, p0Var.d) && kotlin.jvm.internal.l.a(this.e, p0Var.e) && this.f == p0Var.f && kotlin.jvm.internal.l.a(this.g, p0Var.g);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool2 = this.c;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.d;
        int iHashCode4 = (iHashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.e;
        int iE = (androidx.constraintlayout.core.g.e(this.f) + ((iHashCode4 + (bool4 == null ? 0 : bool4.hashCode())) * 31)) * 31;
        Integer num2 = this.g;
        return iE + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("DynamicSpecs(isIdle=");
        sb.append(this.a);
        sb.append(", batteryLevel=");
        sb.append(this.b);
        sb.append(", isMetered=");
        sb.append(this.c);
        sb.append(", isCharging=");
        sb.append(this.d);
        sb.append(", isRoaming=");
        sb.append(this.e);
        sb.append(", networkType=");
        int i = this.f;
        if (i == 1) {
            str = "MOBILE";
        } else if (i == 2) {
            str = "WIFI";
        } else if (i != 3) {
            str = i != 4 ? "null" : "UNKNOWN";
        } else {
            str = "ETHERNET";
        }
        sb.append(str);
        sb.append(", signalStrength=");
        sb.append(this.g);
        sb.append(')');
        return sb.toString();
    }
}
