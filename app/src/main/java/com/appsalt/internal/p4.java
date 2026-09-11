package com.appsalt.internal;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class p4 implements c2 {
    public final String a;
    public final byte[] b;
    public final int c;
    public final int d;
    public final int e;

    public p4(String str, byte[] bArr, int i, int i2, int i3) {
        this.a = str;
        this.b = bArr;
        this.c = i;
        this.d = i2;
        this.e = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p4)) {
            return false;
        }
        p4 p4Var = (p4) obj;
        return this.a.equals(p4Var.a) && kotlin.jvm.internal.l.a(this.b, p4Var.b) && this.c == p4Var.c && this.d == p4Var.d && this.e == p4Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + androidx.privacysandbox.ads.adservices.java.internal.a.b(this.d, (androidx.constraintlayout.core.g.e(this.c) + ((Arrays.hashCode(this.b) + (this.a.hashCode() * 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Connected(id=");
        sb.append(this.a);
        sb.append(", ip=");
        sb.append(Arrays.toString(this.b));
        sb.append(", dnsResolveType=");
        sb.append(coil3.compose.internal.f.k(this.c));
        sb.append(", lookupTime=");
        sb.append(this.d);
        sb.append(", connectTime=");
        return androidx.privacysandbox.ads.adservices.java.internal.a.s(sb, this.e, ')');
    }
}
