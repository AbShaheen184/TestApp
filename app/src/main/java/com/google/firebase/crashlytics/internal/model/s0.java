package com.google.firebase.crashlytics.internal.model;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class s0 extends w1 {
    public final long a;
    public final long b;
    public final String c;
    public final String d;

    public s0(long j, long j2, String str, String str2) {
        this.a = j;
        this.b = j2;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof w1) {
            s0 s0Var = (s0) ((w1) obj);
            if (this.a == s0Var.a && this.b == s0Var.b && this.c.equals(s0Var.c)) {
                String str = s0Var.d;
                String str2 = this.d;
                if (str2 != null ? str2.equals(str) : str == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        long j = this.a;
        long j2 = this.b;
        int iHashCode = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.c.hashCode()) * 1000003;
        String str = this.d;
        return iHashCode ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BinaryImage{baseAddress=");
        sb.append(this.a);
        sb.append(", size=");
        sb.append(this.b);
        sb.append(", name=");
        sb.append(this.c);
        sb.append(", uuid=");
        return androidx.privacysandbox.ads.adservices.java.internal.a.u(sb, this.d, "}");
    }
}
