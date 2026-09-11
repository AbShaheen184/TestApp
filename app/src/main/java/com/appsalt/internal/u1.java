package com.appsalt.internal;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class u1 implements c2 {
    public final String a;
    public final byte b;
    public final byte c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final Boolean g;
    public final boolean h;

    public u1(String str, byte b, byte b2, boolean z, boolean z2, int i, Boolean bool, boolean z3) {
        this.a = str;
        this.b = b;
        this.c = b2;
        this.d = z;
        this.e = z2;
        this.f = i;
        this.g = bool;
        this.h = z3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u1)) {
            return false;
        }
        u1 u1Var = (u1) obj;
        return this.a.equals(u1Var.a) && this.b == u1Var.b && this.c == u1Var.c && this.d == u1Var.d && this.e == u1Var.e && this.f == u1Var.f && kotlin.jvm.internal.l.a(this.g, u1Var.g) && this.h == u1Var.h;
    }

    public final int hashCode() {
        int iB = androidx.privacysandbox.ads.adservices.java.internal.a.b(this.f, androidx.privacysandbox.ads.adservices.java.internal.a.f(androidx.privacysandbox.ads.adservices.java.internal.a.f((Byte.hashCode(this.c) + ((Byte.hashCode((byte) 0) + ((Byte.hashCode(this.b) + ((Byte.hashCode((byte) 0) + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31, 31, this.d), 31, this.e), 31);
        Boolean bool = this.g;
        return Boolean.hashCode(this.h) + ((iB + (bool != null ? bool.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Pong(id=" + this.a + ", os=0, networkType=" + ((int) this.b) + ", telephonyNetworkType=0, signalStrength=" + ((int) this.c) + ", isPluggedIn=" + this.d + ", isRoaming=" + this.e + ", batteryLevel=" + this.f + ", isIdle=" + this.g + ", isMetered=" + this.h + ')';
    }
}
