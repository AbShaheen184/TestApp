package com.appsalt.internal;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class z3 implements c2 {
    public final String a;
    public final byte[] b;

    public z3(String str, byte[] bArr) {
        this.a = str;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z3)) {
            return false;
        }
        z3 z3Var = (z3) obj;
        return this.a.equals(z3Var.a) && kotlin.jvm.internal.l.a(this.b, z3Var.b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Chunk(id=");
        sb.append(this.a);
        sb.append(", payload=");
        return androidx.privacysandbox.ads.adservices.java.internal.a.m(this.b.length, " B)", sb);
    }
}
