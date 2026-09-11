package com.google.android.datatransport.runtime.backends;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class a {
    public final int a;
    public final long b;

    public a(int i, long j) {
        if (i == 0) {
            com.google.gson.b.h("Null status");
            throw null;
        }
        this.a = i;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return androidx.constraintlayout.core.g.b(this.a, aVar.a) && this.b == aVar.b;
    }

    public final int hashCode() {
        int iE = (androidx.constraintlayout.core.g.e(this.a) ^ 1000003) * 1000003;
        long j = this.b;
        return iE ^ ((int) ((j >>> 32) ^ j));
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("BackendResponse{status=");
        int i = this.a;
        if (i == 1) {
            str = "OK";
        } else if (i == 2) {
            str = "TRANSIENT_ERROR";
        } else if (i != 3) {
            str = i != 4 ? "null" : "INVALID_PAYLOAD";
        } else {
            str = "FATAL_ERROR";
        }
        sb.append(str);
        sb.append(", nextRequestWaitMillis=");
        return androidx.privacysandbox.ads.adservices.java.internal.a.n(this.b, "}", sb);
    }
}
