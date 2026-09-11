package com.appsalt.internal;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 extends s1 {
    public final String a;
    public final byte[] b;

    public t0(String str, byte[] bArr) {
        super(str);
        this.a = str;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (t0.class.equals(obj != null ? obj.getClass() : null)) {
            return Arrays.equals(this.b, ((t0) obj).b);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Chunk(proxyId: ");
        sb.append(this.a);
        sb.append(", data=");
        return androidx.privacysandbox.ads.adservices.java.internal.a.m(this.b.length, " B)", sb);
    }
}
