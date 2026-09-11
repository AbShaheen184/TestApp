package com.google.android.datatransport.runtime;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k {
    public final com.google.android.datatransport.c a;
    public final byte[] b;

    public k(com.google.android.datatransport.c cVar, byte[] bArr) {
        if (cVar == null) {
            com.google.gson.b.h("encoding is null");
            throw null;
        }
        if (bArr == null) {
            com.google.gson.b.h("bytes is null");
            throw null;
        }
        this.a = cVar;
        this.b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (this.a.equals(kVar.a)) {
            return Arrays.equals(this.b, kVar.b);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.b);
    }

    public final String toString() {
        return "EncodedPayload{encoding=" + this.a + ", bytes=[...]}";
    }
}
