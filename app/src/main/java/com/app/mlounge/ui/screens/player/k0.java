package com.app.mlounge.ui.screens.player;

/* JADX INFO: compiled from: r8-map-id-b723831e8a75f5c253aef5210d8563f5ef31d2a2db903326935496738229b331 */
/* JADX INFO: loaded from: classes.dex */
public final class k0 {
    public final String a;
    public final String b;
    public final long c;
    public final boolean d;

    public k0(String str, String str2, long j, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k0)) {
            return false;
        }
        k0 k0Var = (k0) obj;
        return kotlin.jvm.internal.l.a(this.a, k0Var.a) && kotlin.jvm.internal.l.a(this.b, k0Var.b) && this.c == k0Var.c && this.d == k0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + androidx.privacysandbox.ads.adservices.java.internal.a.c(androidx.privacysandbox.ads.adservices.java.internal.a.e(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbO = androidx.compose.runtime.external.kotlinx.collections.immutable.internal.c.o("ResolvedStreamInfo(url=", this.a, ", contentType=", this.b, ", contentLength=");
        sbO.append(this.c);
        sbO.append(", acceptRanges=");
        sbO.append(this.d);
        sbO.append(")");
        return sbO.toString();
    }
}
